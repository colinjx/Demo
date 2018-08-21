package cn.jx.common.util.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatHelper {
	public DateFormatHelper() {
	}

	public final static String FORMAT_STR = "yyyy-mm-dd hh:mm:ss";

	public static String longToStr(long time){
		Date d = new Date(time);
		DateFormat df = new SimpleDateFormat(FORMAT_STR);
		return df.format(d);
	}

	public static long strToLong(String str) throws ParseException {
		DateFormat df = new SimpleDateFormat(FORMAT_STR);
		return  df.parse(str).getTime();
	}
}
