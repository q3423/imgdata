package com.lw.imgdata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lw.imgdata.mapper.OrderMapper;
import com.lw.imgdata.pojo.ImageMessage;
import com.lw.imgdata.pojo.Order;
import com.lw.imgdata.pojo.json.FormMessage;
import com.lw.imgdata.pojo.json.JsonObj;
import com.lw.imgdata.pojo.json.Submit;
import com.lw.imgdata.pojo.json.TacheHistory;
import com.lw.imgdata.service.OrderService;
import com.lw.imgdata.util.Constants;
import com.lw.imgdata.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	

	public Order selectById(Integer id) throws Exception {
		return orderMapper.selectById(id);
	}


	public PageInfo<Order> selectList(String schemeCode, Integer pageNum, Integer pageSize) throws Exception {
		if(pageNum != null && pageSize != null) {
			PageHelper.startPage(pageNum, pageSize);
		}
		List<Order> list = null;
		list = orderMapper.selectList(schemeCode);
		PageInfo<Order> pageInfo = new PageInfo<Order>(list);
		return pageInfo;
	}

	public String createZipFile(String schemeCode) throws Exception {
		//String schemeCode = "254629";
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
			String zipPath = Constants.ZIP_PATH+schemeCode+".zip";
			//压缩文件
			FileUtil.zipMultiFile(filePathName, zipPath,true);
			//删除文件夹
			FileUtil.deleteEveryThing(filePathName);
			return zipPath;
		}
		return null;
	}


}
