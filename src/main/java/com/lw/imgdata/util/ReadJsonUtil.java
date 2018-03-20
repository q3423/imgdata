package com.lw.imgdata.util;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.lw.imgdata.pojo.ImageInfo;
import com.lw.imgdata.pojo.ImageMessage;
import com.lw.imgdata.pojo.Order;
import com.lw.imgdata.pojo.json.CostType;
import com.lw.imgdata.pojo.json.FormMessage;
import com.lw.imgdata.pojo.json.JsonObj;
import com.lw.imgdata.pojo.json.Submit;
import com.lw.imgdata.pojo.json.TacheHistory;

public class ReadJsonUtil {
	public static ImageMessage getImgData(Order ov) {
		//ov.getJsonData().toJavaObject(JsonObj.class);
		JsonObj jo =  JSONObject.parseObject(ov.getJsonData(), JsonObj.class);
		ImageMessage im = new ImageMessage();
		List<TacheHistory> historyList = jo.getTacheHistory();
		CostType ct = jo.getCostType();
		im.setExpenseType(ct.getName());
		im.setCompanyId(ov.getCompanyId());
		im.setCompanyName(ov.getCompany());
		im.setBeneficiary(ov.getBenefitObj());
		im.setRegion(ov.getRegion());
		im.setExpenseType(ov.getSchemeCostType());
		im.setExpenseManagementType(ov.getBenefitObj());
		im.setStartTime(ov.getStartTime());
		im.setEndTime(ov.getEndTime());
		im.setSchemeCode(ov.getSchemeCode());
		List<ImageInfo> imgList = new ArrayList<ImageInfo>();
		for (TacheHistory tacheHistory : historyList) {
			List<Submit> submitList = tacheHistory.getSubmitList();
			for (Submit sb : submitList) {
				List<FormMessage> businessList = sb.getFormBusiness();
				for (FormMessage formMessage : businessList) {
					if ("图片上传".equals(formMessage.getMaterial().getName())) {
						if(formMessage.getValue() != null) {
							List<String> list = (List<String>) formMessage.getValue();
							for (String string : list) {
								if(string != null && string.trim().length() > 0) {
									ImageInfo img = new ImageInfo();
									img.setImageUrl(string);
									img.setSubmitUser(sb.getBusiness().getName());
									img.setSubmitUserId(sb.getBusiness().getId());
									imgList.add(img);
								}
								
							}
						}
						
					}
				}
			}
			im.setImgList(imgList);
		}
		return im;
	}
}
