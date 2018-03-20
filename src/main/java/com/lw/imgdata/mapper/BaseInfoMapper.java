package com.lw.imgdata.mapper;

import com.lw.imgdata.pojo.BaseInfo;

import java.util.List;

/**
 * 基础信息查询接口
 */
public interface BaseInfoMapper {
	BaseInfo selectById(Integer id);

    List<BaseInfo> findByIds(String ids);
}