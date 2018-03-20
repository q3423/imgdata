package com.lw.imgdata.core;

public enum ResponseCode {
	SUCCESS(0,"SUCCESS"),//成功
    ERROR(1,"ERROR"),//错误
    NEED_LOGIN(2,"NEED_LOGIN"),//需要登录
    NO_PERMISSION(3,"ILLEGAL_ARGUMENT"),//没有权限
    ILLEGAL_ARGUMENT(4,"ILLEGAL_ARGUMENT");//参数错误

    private final int code;
    private final String desc;


    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

	

}
