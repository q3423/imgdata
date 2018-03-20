package com.lw.imgdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lw.imgdata.core.BaseServiceImpl;
import com.lw.imgdata.mapper.ImageMessageMapper;
import com.lw.imgdata.pojo.ImageMessage;
import com.lw.imgdata.service.ImageMessageService;

@Service
public class ImageMessageServiceImpl extends BaseServiceImpl<ImageMessage> implements ImageMessageService {
	@Autowired
	public void setMapper(ImageMessageMapper mapper){
		this.mapper = mapper;
	}

}
