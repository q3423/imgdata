package com.lw.imgdata.mapper;

import com.lw.imgdata.pojo.SchemeItemsOrderVO;

import java.util.List;


public interface SchemeItemsMapper {
	List<SchemeItemsOrderVO> findSchemeItemsMsg(Integer orderId);
}
