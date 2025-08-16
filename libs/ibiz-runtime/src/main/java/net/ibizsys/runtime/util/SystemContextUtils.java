package net.ibizsys.runtime.util;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统上下文组件
 * @author lionlau
 *
 */
public class SystemContextUtils {

	/**
	 * 当前时间
	 */
	public final static String DATETIME = "DATETIME";
	
	/**
	 * 当前时间
	 */
	public final static String NOW = "NOW";
	
	/**
	 * 当前时间
	 */
	public final static String DAY = "DAY";
	
	/**
	 * 当前月
	 */
	public final static String MONTH = "MONTH";
	
	/**
	 * 当前年
	 */
	public final static String YEAR = "YEAR";
	
	/**
	 *上一天
	 */
	public final static String LASTDAY = "LASTDAY";
	
	/**
	 * 上一月
	 */
	public final static String LASTMONTH = "LASTMONTH";
	
	/**
	 * 上一年
	 */
	public final static String LASTYEAR = "LASTYEAR";
	
	/**
	 *下一天
	 */
	public final static String NEXTDAY = "NEXTDAY";
	
	/**
	 * 下一月
	 */
	public final static String NEXTMONTH = "NEXTMONTH";
	
	/**
	 * 下一年
	 */
	public final static String NEXTYEAR = "NEXTYEAR";
	
	
	
	private static SystemContextUtils instance = null;
	
	public static SystemContextUtils getInstance() {
		if(SystemContextUtils.instance == null) {
			SystemContextUtils.instance = new SystemContextUtils();
		}
		return SystemContextUtils.instance;
	}
	
	public static void setInstance(SystemContextUtils instance) {
		SystemContextUtils.instance = instance;
	}
	
	public java.sql.Timestamp getDateTime(){
		return new Timestamp(System.currentTimeMillis());
	}
	
	public java.sql.Timestamp getCurrentDayTime(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	public java.sql.Timestamp getCurrentMonthTime(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	public java.sql.Timestamp getCurrentYearTime(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	
	public java.sql.Timestamp getLastDayTime(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	public java.sql.Timestamp getLastMonthTime(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.MONTH, -1);
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	public java.sql.Timestamp getLastYearTime(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.YEAR, -1);
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	public java.sql.Timestamp getNextDayTime(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	public java.sql.Timestamp getNextMonthTime(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.MONTH, 1);
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	public java.sql.Timestamp getNextYearTime(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.YEAR, 1);
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	
	public Map<String, Object> getParams(Map<String, Object> map){
		if(map == null) {
			map = new HashMap<String, Object>();
		}
		
		map.put(DATETIME, this.getDateTime());
		map.put(NOW, map.get(DATETIME));
		map.put(DAY, this.getCurrentDayTime());
		map.put(MONTH, this.getCurrentMonthTime());
		map.put(YEAR, this.getCurrentYearTime());
		map.put(LASTDAY, this.getLastDayTime());
		map.put(LASTMONTH, this.getLastMonthTime());
		map.put(LASTYEAR, this.getLastYearTime());
		map.put(NEXTDAY, this.getNextDayTime());
		map.put(NEXTMONTH, this.getNextMonthTime());
		map.put(NEXTYEAR, this.getNextYearTime());
		
		return map;
	}

}
