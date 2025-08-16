package net.ibizsys.central.sysutil;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 系统配置功能运行时对象
 * @author lionlau
 *
 */
public interface ISysConfUtilRuntime extends ISysUtilRuntime {

	/**
	 * 获取指定属性值
	 * @param strCat 分类
	 * @param strName
	 * @return
	 */
	String get(String strCat, String strName);
	
	
	/**
	 * 判断指定属性是否存在
	 * @param strCat 分类
	 * @param strName
	 * @return
	 */
	boolean contains(String strCat, String strName);
	
	/**
	 * 设置指定属性值
	 * @param strCat 分类
	 * @param strName
	 * @param strValue
	 */
	void set(String strCat, String strName, String strValue);
	
	
	/**
	 * 设置指定属性对象值
	 * @param strCat 分类
	 * @param strName
	 * @param objValue
	 */
	void set(String strCat, String strName, Object objValue);
	
	
	
	/**
	 * 移除属性值
	 * @param strCat 分类
	 * @param strName
	 */
	void reset(String strCat, String strName);
	
	
//	/**
//	 * 重置指定名称的缓存
//	 * @param strCat 分类
//	 */
//	void resetAll(String strCat);
	
	
	/**
	 * 获取指定缓存，按类型返回
	 * @param strCat 分类
	 * @param strName
	 * @param cls
	 * @return
	 */
	<T> T get(String strCat, String strName, Class<T> cls);
	
	
	/**
	 * 获取指定缓存，按类型返回
	 * @param strCat 分类
	 * @param strName
	 * @param type
	 * @return
	 */
	<T> T get(String strCat, String strName, TypeReference<T> type);
	
}
