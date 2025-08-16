package net.ibizsys.central.bi.util;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * BI搜索时间周期接口
 * @author lionlau
 *
 */
@JsonDeserialize(as = BISearchPeriod.class)
public interface IBISearchPeriod {

	public final static String UNIT_DAY = "DAY";
	
	public final static String UNIT_WEEK = "WEEK";
	
	public final static String UNIT_MONTH = "MONTH";
	
	public final static String UNIT_QUARTER = "QUARTER";
	
	public final static String UNIT_YEAR = "YEAR";
	

	/**
	 * 静态范围：需指定开始及结束时间（以秒为单位）
	 */
	public final static String TYPE_STATIC = "STATIC";
	
	
	/**
	 * 当前时间的对应时间周期
	 */
	public final static String TYPE_CURRENT = "CURRENT";
	
	
	/**
	 * 当前时间的具体业务前缀
	 */
	public final static String PREFIX_CURRENT = "CURRENT_";
	
	
	
	/**
	 * 动态范围：相对与当前时间的前后偏移
	 */
	public final static String TYPE_DYNAMIC = "DYNAMIC";

	
	
	
	
	
	/**
	 * 获取时间属性
	 * @return
	 */
	String getField();
	
	/**
	 * 获取时间单位
	 * @return
	 */
	String getUnit();
	
	
	/**
	 * 获取周期类型
	 * @return
	 */
	String getType();
	
	
	/**
	 * 获取起始时间
	 * @return
	 */
	long getStart();
	
	
	/**
	 * 获取结束时间
	 * @return
	 */
	long getEnd();
	
	
	
	/**
	 * 获取环比次数，默认为1
	 * @return
	 */
	int getPoP();
	
	
	/**
	 * 获取同比次数，默认为0
	 * @return
	 */
	int getYoY();
}
