package com.lw.imgdata.mapper;
import com.lw.imgdata.pojo.Order;

import java.util.List;


public interface OrderMapper {
	/**条件查询*/
	List<Order> selectList(String schemeCode)throws Exception;

	/**id查询*/
	Order selectById(Integer id)throws Exception;
}
