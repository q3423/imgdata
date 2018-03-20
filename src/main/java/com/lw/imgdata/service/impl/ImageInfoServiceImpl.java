package com.lw.imgdata.service.impl;

import com.lw.imgdata.core.BaseServiceImpl;
import com.lw.imgdata.mapper.ImageInfoMapper;
import com.lw.imgdata.pojo.ImageInfo;
import com.lw.imgdata.service.ImageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImageInfoServiceImpl extends BaseServiceImpl<ImageInfo> implements ImageInfoService {
	@Autowired
	public void setMapper(ImageInfoMapper mapper){
		this.mapper = mapper;
	}

}
