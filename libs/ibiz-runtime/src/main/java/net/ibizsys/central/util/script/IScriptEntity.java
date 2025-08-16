package net.ibizsys.central.util.script;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface IScriptEntity extends net.ibizsys.runtime.util.script.IScriptEntity{

//	/**
//	 * 调用实体行为（使用传入参数）
//	 * @param strName
//	 * @param objects
//	 * @return
//	 */
//	Object call(String strName, Object ...objects);
	
	
	
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
	
	
	
	
	
	
	/**
	 * 以Json字符串输出（非DTO形式）
	 * @return
	 */
	String toJsonString();
	
	
	
	/**
	 * 以Json字符串输出
	 * @param bDTO DTO 形式
	 * @return
	 */
	String toJsonString(boolean bDTO);
	
	
	/**
	 * 输出Json字符串
	 * @param bDTO
	 * @param strSuffix 代码表文本后缀
	 * @return
	 */
	String toJsonString(boolean bDTO, String strSuffix);
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.runtime.util.script.IScriptEntity#children(java.lang.String)
	 */
	IScriptEntity[] children(String strName);
}
