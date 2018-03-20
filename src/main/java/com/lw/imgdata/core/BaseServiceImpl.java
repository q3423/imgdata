package com.lw.imgdata.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * 
 * @ClassName: BaseServiceImpl
 * @Description:ServiceImpl基础类
 * @author: liman
 * @date: 2017年11月14日 上午10:27:53
 * @param <T>
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	protected BaseMapper<T> mapper;

	public void setMapper(BaseMapper<T> baseDao) {
		this.mapper = baseDao;
	};

	
	public ServerResponse selectByPrimaryKey(Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pojo", mapper.selectByPrimaryKey(id));
		return ServerResponse.createBySuccess(map);
	}

	@Transactional
	public ServerResponse insert(T t) {
		int num = mapper.insert(t);
		if (num > 0) {
			return ServerResponse.createBySuccess();
		} else {
			return ServerResponse.createByError();
		}

	}

	@Transactional
	public ServerResponse insertSelective(T t) {
		int num = mapper.insertSelective(t);
		if (num > 0) {
			return ServerResponse.createBySuccess();
		} else {
			return ServerResponse.createByError();
		}
	}

	@Transactional
	public ServerResponse updateByPrimaryKeySelective(T t) {
		int num = mapper.updateByPrimaryKeySelective(t);
		if (num > 0) {
			return ServerResponse.createBySuccess();
		} else {
			return ServerResponse.createByError();
		}
	}

	@Transactional
	public ServerResponse updateByPrimaryKey(T t) {
		int num = mapper.updateByPrimaryKey(t);
		if (num > 0) {
			return ServerResponse.createBySuccess();
		} else {
			return ServerResponse.createByError();
		}
	}

	@Transactional
	public ServerResponse deleteByPrimaryKey(Long id) {
		int num = mapper.deleteByPrimaryKey(id);
		if (num > 0) {
			return ServerResponse.createBySuccess();
		} else {
			return ServerResponse.createByErrorMessage("没有找到要删除的数据");
		}
	}

	public ServerResponse deleteByIds(List<Integer> ids) {
		int num = mapper.deleteByIds(ids);
		if (num > 0) {
			return ServerResponse.createBySuccess();
		} else {
			return ServerResponse.createByErrorMessage("没有找到要删除的数据");
		}
	}

	@Transactional
	public ServerResponse saveAll(List<T> ts, List<T> insert) {
		if (ts != null && ts.size() > 0) {
			mapper.updateAll(ts);
		}
		if (insert != null && insert.size() > 0) {
			mapper.saveAll(ts);
		}
		return ServerResponse.createBySuccess();
	}

	@Transactional
	public ServerResponse updateAll(List<T> ts) {
		mapper.updateAll(ts);
		return ServerResponse.createBySuccess();
	}
	
	/*
	 * public void validateAttachment(ListType listType, Long listId) {
	 * AttachmentService
	 * attachmentService=(AttachmentService)AppContent.getBean(
	 * "attachmentService"); if( attachmentService.hasAttachment(listType,
	 * listId)){ throw new DoException(listType.name()+"必须上传附件!"); } }
	 */

}
