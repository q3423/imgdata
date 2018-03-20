package com.lw.imgdata.core;

import java.util.Map;


public class ServerResponse  {

	private int status;
	private String msg;
	private Map<String, Object> data;

	private ServerResponse(int status) {
		this.status = status;
	}

	private ServerResponse(int status, Map<String, Object> data) {
		this.status = status;
		this.data = data;
	}

	private ServerResponse(int status, String msg, Map<String, Object> data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	private ServerResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public boolean isSuccess() {
		return this.status == ResponseCode.SUCCESS.getCode();
	}

	public int getStatus() {
		return status;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public String getMsg() {
		return msg;
	}

	public static ServerResponse createBySuccess() {
		return new ServerResponse(ResponseCode.SUCCESS.getCode());
	}

	public static  ServerResponse createBySuccessMessage(String msg) {
		return new ServerResponse(ResponseCode.SUCCESS.getCode(), msg);
	}

	public static  ServerResponse createBySuccess(Map<String, Object> data) {
		return new ServerResponse(ResponseCode.SUCCESS.getCode(), data);
	}

	public static  ServerResponse createBySuccess(String msg, Map<String, Object> data) {
		return new ServerResponse(ResponseCode.SUCCESS.getCode(), msg, data);
	}

	public static  ServerResponse createByError() {
		return new ServerResponse(ResponseCode.ERROR.getCode(),
				ResponseCode.ERROR.getDesc());
	}

	public static  ServerResponse createByErrorMessage(String errorMessage) {
		return new ServerResponse(ResponseCode.ERROR.getCode(), errorMessage);
	}

	public static  ServerResponse createByErrorCodeMessage(int errorCode,
			String errorMessage) {
		return new ServerResponse(errorCode, errorMessage);
	}

	@Override
	public String toString() {
		return "ServerResponse [status=" + status + ", msg=" + msg + ", data="
				+ data + "]";
	}
	
	
}
