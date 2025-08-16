package net.ibizsys.central.cloud.core.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import net.ibizsys.runtime.util.IEntity;

/**
 * 配置数据对象
 * @author lionlau
 *
 */
public interface IConfigEntity extends IEntity {

	/**
	 * 取指定属性对象值
	 * 
	 * @param strName
	 * @param def
	 * @return
	 * @throws Exception
	 */
	Object get(String strName, Object def);
	
	
	/**
	 * 获取属性Timestamp值
	 * @param strName
	 * @param def
	 * @return
	 */
	java.sql.Timestamp getTimestamp(String strName, java.sql.Timestamp def);
	
	
	
	/**
	 * 获取指定属性大数值
	 * 
	 *@param strName
	 * @param fDefault
	 * @return
	 * @throws Exception
	 */
	BigDecimal getBigDecimal(String strName, BigDecimal fDefault);
	
	
	
	/**
	 * 获取指定属性大整数
	 * 
	 * @param strName
	 * @param nDefault
	 * @return
	 * @throws Exception
	 */
	BigInteger getBigInteger(String strName,BigInteger nDefault);
	
	
	
	/**
	 * 获取指定属性Boolean值
	 * 
	 * @param strName
	 * @param def
	 * @return
	 * @throws Exception
	 */
	Boolean getBoolean(String strName, Boolean def);
	
	
	
	/**
	 * 取指定属性Double值
	 * 
	 * @param strName
	 * @param def
	 * @return
	 * @throws Exception
	 */
	Double getDouble(String strName, Double def);
	
	
	
	/**
	 * 取指定属性Float值
	 * 
	 * @param strName
	 * @param def
	 * @return
	 * @throws Exception
	 */
	Float getFloat(String strName, Float def);
	
	/**
	 * 取指定属性整形值
	 * 
	 * @param strName
	 * @param def
	 * @return
	 * @throws Exception
	 */
	Integer getInteger(String strName, Integer def);
	
	
	/**
	 * 取指定属性Long值
	 * 
	 * @param strName
	 * @param def
	 * @return
	 * @throws Exception
	 */
	Long getLong(String strName, Long def);
	
	
	/**
	 * 转换对象值到字符串值
	 * 
	 * @param strName
	 * @param def
	 * @return
	 * @throws Exception
	 */
	String getString(String strName, String strDefault);
	
}
