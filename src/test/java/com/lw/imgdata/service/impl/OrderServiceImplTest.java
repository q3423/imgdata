package com.lw.imgdata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.lw.imgdata.mapper.ImageInfoMapper;
import com.lw.imgdata.mapper.ImageMessageMapper;
import com.lw.imgdata.mapper.OrderMapper;
import com.lw.imgdata.pojo.*;
import com.lw.imgdata.pojo.json.FormMessage;
import com.lw.imgdata.pojo.json.JsonObj;
import com.lw.imgdata.pojo.json.Submit;
import com.lw.imgdata.pojo.json.TacheHistory;
import com.lw.imgdata.service.OrderService;
import com.lw.imgdata.service.SchemeItemsService;
import com.lw.imgdata.util.Constants;
import com.lw.imgdata.util.FileUtil;
import com.lw.imgdata.util.ReadJsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional(transactionManager = "transactionManager")
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@Rollback(value = false)
public class OrderServiceImplTest {
	@Autowired
	OrderMapper orderMapper;
	@Autowired
	ImageMessageMapper imageMessageMapper;
	@Autowired
	ImageInfoMapper imageInfoMapper;
	@Autowired
	OrderService orderService;
	
	@Autowired
	SchemeItemsService schemeItemsService;

	@Test
	public void findSchemesMsg() {
		try {
			List<SchemeItemsOrderMessage> list = schemeItemsService.findSchemeItemMsg(126);
			for (SchemeItemsOrderMessage schemeItemsOrderVO : list) {
				System.out.println(schemeItemsOrderVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	public void testSelectById() {
		try {

			Order ov = orderMapper.selectById(25);
			System.out.println(ov);
			ImageMessage imageMessage = ReadJsonUtil.getImgData(ov);
			imageMessageMapper.insert(imageMessage);
			System.out.println(imageMessageMapper);
			List<ImageInfo> list = imageMessage.getImgList();
			System.out.println(list);
			for (ImageInfo imageInfo : list) {
				imageInfo.setImageMessageId(imageMessage.getImageMessageId());
			}
			imageInfoMapper.saveAll(list);
			System.out.println(imageMessage);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	@Test
//	public void readImg() {
//		ImageInfo im = ReadPicUtil.readPic("d:\\pic/test2.jpg");
//		System.out.println(im);
//	}
	//@Test
	public void findList(){
		/*try {
			PageInfo<Order> pageInfo = orderService.selectList("256237",null,null);
			System.out.println(pageInfo.getLastPage());
			List<Order> list = orderMapper.selectList("256237");
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			String schemeCode = "254629";
			List<Order> list = orderMapper.selectList(schemeCode);

			if(list != null){
				//创建一个大文件夹
				String filePathName = Constants.FILE_PATH+new Date().getTime();
				FileUtil.mkDir(filePathName);
				//解析json
				for (Order order: list) {

					if(order.getJsonData() != null && order.getJsonData().trim().length() > 0){
						//创建工单号文件夹
						String orderPath = filePathName+"//"+order.getId();
						FileUtil.mkDir(orderPath);
						JsonObj jo =  JSONObject.parseObject(order.getJsonData(), JsonObj.class);
						ImageMessage im = new ImageMessage();
						List<TacheHistory> historyList = jo.getTacheHistory();
						for (TacheHistory tacheHistory : historyList) {
							List<Submit> submitList = tacheHistory.getSubmitList();
							for (Submit sb : submitList) {
								List<FormMessage> businessList = sb.getFormBusiness();
								for (FormMessage formMessage : businessList) {
									if ("图片上传".equals(formMessage.getMaterial().getName())) {
										//创建一个图片类型文件夹
										String imgPath = orderPath + "//"+formMessage.getName();
										FileUtil.mkDir(imgPath);
										if (formMessage.getValue() != null) {

											List<String> listImg = (List<String>) formMessage.getValue();
											for (String string : listImg) {
												if (string != null && string.trim().length() > 0) {
													//将对于的图片复制到文件夹中
													FileUtil.copyFile(Constants.FILE_PATH+string,imgPath+"//"+string);
													/*ImageInfo img = new ImageInfo();
													img.setImageUrl(string);
													img.setSubmitUser(sb.getBusiness().getName());
													img.setSubmitUserId(sb.getBusiness().getId());
													imgList.add(img);*/
												}

											}
										}

									}
								}
							}
						}
					}

				}
				//压缩文件
				FileUtil.zipMultiFile(filePathName,Constants.ZIP_PATH+schemeCode+".zip",true);
				//删除文件夹
				FileUtil.deleteEveryThing(filePathName);
			}
		}catch (Exception e){
			e.printStackTrace();
		}

	}


}
