package com.hy.sty.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * SpringMVC转换器 Converter<S, T> S：source源数据类型，T：target目标数据类型
 * 
 * @author Administrator
 * 
 */
public class StringToDateConvert implements Converter<String, Date> {

	@Override
	public Date convert(String arg0) {
		// 日期格式化
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			// 将字符串转化成日期类型
			date = format.parse(arg0);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

}
