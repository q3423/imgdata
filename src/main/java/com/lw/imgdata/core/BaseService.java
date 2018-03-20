package com.lw.imgdata.core;

import java.util.List;



/**
 * 
 * @ClassName:  BaseService   
 * @Description:基础服务接口  
 * @author: liman
 * @date:   2017年11月24日 下午12:31:54   
 * @param <T>
 */
public interface BaseService<T> {
	

	ServerResponse selectByPrimaryKey(Long id);

	/**
	 * 字段未进行过非空验证的新增
	 * @param t
	 * @return
	 */
	ServerResponse insert(T t);

	/**
	 * 字段进行过非空验证的新增
	 * @param t
	 * @return
	 */
	ServerResponse insertSelective(T t);
	/**
	 * 字段进行过非空验证的更新
	 * @param t
	 * @return
	 */
	ServerResponse updateByPrimaryKeySelective(T t);
	/**
	 * 字段未进行过非空验证的更新
	 * @param t
	 * @return
	 */
	ServerResponse updateByPrimaryKey(T t);

	ServerResponse deleteByPrimaryKey(Long id);

	ServerResponse deleteByIds(List<Integer> ids);

	ServerResponse saveAll(List<T> update, List<T> insert);

	ServerResponse updateAll(List<T> ts);
	
	


}
