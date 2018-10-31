package jdbc;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateParsing {
		public static Date convertStringToUtilDate(String date) {
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
			Date sqldate = null;
			
			try {
			  java.util.Date dt=sdf.parse(date);
			  sqldate= new Date(dt.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return sqldate;
			
		}
		public static java.sql.Date utilDateToSQLDateConversion(Date date) {
			java.sql.Date dt = new java.sql.Date(date.getTime());
			return dt;
		}
}
