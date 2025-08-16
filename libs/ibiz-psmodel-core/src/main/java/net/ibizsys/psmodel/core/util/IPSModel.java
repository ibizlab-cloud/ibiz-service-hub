package net.ibizsys.psmodel.core.util;

import java.util.Map;



public interface IPSModel {

	/**
	 * Boolean 值，True
	 */
	public final static int BOOLEAN_TRUE = 1;

	/**
	 * Boolean 值，False
	 */
	public final static int BOOLEAN_FALSE = 0;

	
	
	/**
	 * 获取指定属性值
	 * @param strName
	 * @return
	 */
	Object get(String strName);
	
	
	/**
	 * 判断是否包含指定属性
	 * @param strName
	 * @return
	 */
	boolean contains(String strName);
	
	/**
	 * 设置指定属性值
	 * @param strName
	 * @param objValue
	 */
	void set(String strName,Object objValue);
	
	
	
	/**
	 * 移除属性值
	 * @param strName
	 */
	void reset(String strName);
	
	
	/**
	 * 重置数据对象
	 * @param baseAttrOnly 仅基础属性
	 */
	void resetAll(boolean baseAttrOnly);
	
	/**
	 * 拷贝到目标数据对象
	 * @param iPSModel
	 */
	void copyTo(IPSModel iPSModel);
	
	
	/**
	 * 拷贝到目标数据对象（目标属性不存在）
	 * @param iPSModel
	 */
	void copyToIf(IPSModel iPSModel);
	
	/**
	 * 直接获取原始数据Map对象
	 * @return
	 */
	Map<String, Object> any();
	
	
	
	/**
	 * 填充数据对象
	 * @param map
	 */
	void putAll(Map<String, Object> map);
	
	/**
	 * 获取标识
	 * @return
	 */
	String getId();
	
	
	
	/**
	 * 设置标识
	 * @param id
	 */
	void setId(String id);
	
	
	/**
	 * 获取名称
	 * @return
	 */
	String getName();
	
	
	
	/**
	 * 设置名称
	 * @param name
	 */
	void setName(String name);
	
}
