package com.medplus.employee.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsing {
	public static Date convertStringToUtilDate(String date) {
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		Date dt = null;
		
		try {
			dt=sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dt;
		
	}
	public static java.sql.Date utilDateToSQLDateConversion(Date date) {
		java.sql.Date dt = new java.sql.Date(date.getTime());
		return dt;
	}

}
