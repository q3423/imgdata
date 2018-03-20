package com.lw.imgdata.core;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @Description:  基础数据访问接口
 * @author 邓广	dengguang@syxxjs.com
 * @company 四川斯宇信息技术有限公司 http://www.syxxjs.com
 * @date 创建时间：2016年9月21日 下午9:46:18
 */
public interface BaseMapper<T> {

	/**
	 * 查询数据
	 * 
	 * @param queryConfig
	 *            查询配置
	 * @return
	 */
	List<T> searchData(String whereSql);

	T selectByPrimaryKey(Long id);

	/**
	 * 字段未进行过非空验证的新增
	 * @param t
	 * @return
	 */
	int insert(T t);

	/**
	 * 字段进行过非空验证的新增
	 * @param t
	 * @return
	 */
	int insertSelective(T t);
	/**
	 * 字段进行过非空验证的更新
	 * @param t
	 * @return
	 */
	int updateByPrimaryKeySelective(T t);
	/**
	 * 字段未进行过非空验证的更新
	 * @param t
	 * @return
	 */
	int updateByPrimaryKey(T t);

	int deleteByPrimaryKey(Long id);

	int deleteByIds(List<Integer> ids);

	int saveAll(List<T> ts);

	int updateAll(List<T> ts);
	/**
	 * 查询满足条件的记录数
	 * @param queryConfig
	 * @return
	 */
	Integer countByWhere(String whereSql);


}

