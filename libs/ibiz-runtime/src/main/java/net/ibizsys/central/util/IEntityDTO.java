package net.ibizsys.central.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import net.ibizsys.central.dataentity.service.IDEMethodDTO;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;


/**
 * DTO 数据对象
 * @author lionlau
 *
 */
public interface IEntityDTO extends IEntity,IDEMethodDTO{

	
	
	/**
	 * 初始化
	 * @param iDEMethodDTORuntime
	 * @param objData 原始数据
	 * @param bDTOData 是否为DTO数据
	 * @param bIn 是否为输入
	 * @throws Exception
	 */
	void init(IDEMethodDTORuntime iDEMethodDTORuntime, Object dtoData, boolean bDTOData, boolean bIn) throws Exception;
	
	
	/**
	 * 设置实体方法DTO运行时对象
	 * @param iDEMethodDTORuntime
	 */
	void setDEMethodDTORuntime(IDEMethodDTORuntime iDEMethodDTORuntime);
	
	/**
	 * 加载数据
	 * @param objData
	 * @param bDTOData 是否为DTO数据
	 * @param bIn 是否为输入
	 */
	void reload(Object objData, boolean bDTOData, boolean bIn) throws Exception;
	

	/**
	 * 加载数据（默认为输出模式）
	 * @param objData
	 * @param bDTOData 是否为DTO数据
	 */
	void reload(Object objData, boolean bDTOData) throws Exception;
	
	
	/**
	 * 重置只读属性
	 */
	void resetReadOnlyFields();
	
	
	
//	/**
//	 * 拷贝到目标数据对象
//	 * @param iEntity
//	 */
//	void copyTo(Object destObject);
	
	/**
	 * 拷贝到目标数据对象
	 * @param iEntity
	 * @param bDTOData 键名使用DTO属性标识
	 */
	void copyTo(net.ibizsys.runtime.util.IEntity iEntity, boolean bDTOData);
	
	
	/**
	 * 拷贝到目标Map对象，键名使用实体属性标识
	 * @param destMap
	 */
	void copyTo(Map<String, Object> destMap);
	
	
	
	/**
	 * 拷贝到目标Map对象
	 * @param destMap 
	 * @param bDTOData 键名使用DTO属性标识
	 */
	void copyTo(Map<String, Object> destMap, boolean bDTOData);
	
//	/**
//	 * 是否为行为输入的DTO
//	 * @return
//	 */
//	boolean _isActionInputDTO();
//	
//	
//	
//	/**
//	 * 是否支持任意属性
//	 * @return
//	 */
//	boolean _isEnableAny();
//	
//	
//	
//	/**
//	 * 设置是否支持任意属性
//	 * @param bEnableAny
//	 */
//	void _setEnableAny(boolean bEnableAny);
	
	
	/**
	 * 设置指定属性值
	 * @param strName
	 * @param objValue
	 */
	IEntityDTO put(String strName,Object objValue);
	
	
	/**
	 * 设置指定属性值
	 * @param strName
	 * @param objValue
	 */
	IEntityDTO put(String strName,String strValue);
	
	
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
	 * 设置Map全部值
	 * @param map
	 */
	void putAll(Map<String, Object> map);
	
	
	/**
	 * 拷贝到目标Map对象（不存在的属性），键名使用实体属性标识
	 * @param destMap
	 */
	void copyToIf(Map<String, Object> destMap);
	
	
	/**
	 * 拷贝到目标Map对象（不存在的属性）
	 * @param destMap 
	 * @param bDTOData 键名使用DTO属性标识
	 */
	void copyToIf(Map<String, Object> destMap, boolean bDTOData);
	
	/**
	 * 拷贝到目标数据对象（不存在的属性）
	 * @param iEntity
	 * @param bDTOData 键名使用DTO属性标识
	 */
	void copyToIf(net.ibizsys.runtime.util.IEntity iEntity, boolean bDTOData);
	
	/**
	 * 拷贝到目标数据对象（不存在的属性）
	 * @param iEntity
	 */
	void copyToIf(net.ibizsys.runtime.util.IEntity iEntity);
	
	
	
	/**
	 * 直接获取原始数据Map对象
	 * @param bJsonFormat 进行Json格式化处理
	 * @return
	 */
	Map<String, Object> any(boolean bJsonFormat);
}
