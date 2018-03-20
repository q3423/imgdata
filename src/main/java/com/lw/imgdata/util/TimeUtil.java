package com.lw.imgdata.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeUtil {
	public static Long format(String time,String format) {
		SimpleDateFormat sf = new SimpleDateFormat(format,Locale.CHINA);
		Date date;
		try {
			date = sf.parse(time);
			return date.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		TimeUtil.format("2018:01:08 09:55:12","yyyy:MM:dd HH:mm:ss");
		String str = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy")
        .format(new Date())
        .replaceAll("([0-9]{2} [^ ]+)$", ":$1");
		System.out.println(str);
		System.out.println(TimeUtil.format("星期二 一月 23 11:38:21 +0800 2018","EEE MMM dd HH:mm:ss Z yyyy"));
		
	}

}
