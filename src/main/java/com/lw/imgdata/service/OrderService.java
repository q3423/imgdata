package com.lw.imgdata.service;
import com.github.pagehelper.PageInfo;
import com.lw.imgdata.pojo.Order;


public interface OrderService {
	
	/**id查询工作单详情*/
	Order selectById(Integer id)throws Exception;

	PageInfo<Order> selectList(String schemeCode, Integer pageNum, Integer pageSize)throws Exception;
	/**
	 *
	 * @Title: createZipFile
	 * @Description:查询同一个方案号下的图片信息并打包
	 * @author LiMan
	 * @date 2018/2/6 15:10
	 * @param schemeCode:方案号
	 * @return java.io.File
	 */
	String createZipFile(String schemeCode) throws Exception;
}
