package com.lw.imgdata.service;

import com.lw.imgdata.pojo.SchemeItemsOrderMessage;

import java.util.List;

public interface SchemeItemsService {
	/**
	 * 
	 * @Title findSchemeItemMsg 
	 * @Description 查询方案及工单具体信息
	 * @author LiMan
	 * @return
	 * @throws Exception 
	 * @throws
	 */
	List<SchemeItemsOrderMessage> findSchemeItemMsg(Integer orderId)throws Exception;
}
