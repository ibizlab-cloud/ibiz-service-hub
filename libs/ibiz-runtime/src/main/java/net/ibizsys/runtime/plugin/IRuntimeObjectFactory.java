package net.ibizsys.runtime.plugin;

import java.util.Map;

public interface IRuntimeObjectFactory {

	/**
	 * 注册排序值：优先
	 */
	public final int ORDER_PRIMARY = 50;
	
	/**
	 * 注册排序值：默认
	 */
	public final int ORDER_DEFAULT = 100;
	
	
	/**
	 * 注册运行时对象（优先）
	 * @param cls
	 * @param strType
	 * @param strObject
	 */
	boolean registerObjectPrimary(Class<?> cls, String strType, Object strObject);
	
	
	/**
	 * 注册运行时对象
	 * @param cls
	 * @param strType
	 * @param strObject
	 */
	boolean registerObject(Class<?> cls, String strType, Object strObject);
	
	/**
	 * 注册运行时对象
	 * @param cls
	 * @param strType
	 * @param strObject
	 * @param nOrderValue 排序值
	 */
	boolean registerObject(Class<?> cls, String strType, Object strObject, int nOrderValue);
	
	
	
	/**
	 * 注册运行时对象（如果不存在）
	 * @param cls
	 * @param strType
	 * @param strObject
	 */
	boolean registerObjectIf(Class<?> cls, String strType, Object strObject);
	
	
	/**
	 * 是否包含指定对象
	 * @param cls
	 * @param strType
	 * @return
	 */
	boolean containsObject(Class<?> cls, String strType);
	
	/**
	 * 获取运行时插件对象
	 * @param cls
	 * @param strType
	 * @return
	 */
	<T> T getObject(Class<T> cls, String strType) ;
	
	
	
	/**
	 * 获取运行时对象
	 * @param cls
	 * @return
	 */
	<T> T getObject(Class<T> cls);
	
	
	
	/**
	 * 获取运行时插件对象类型
	 * @param cls
	 * @param strType
	 * @return
	 */
	Class<?> getObjectClass(Class<?> cls, String strType) ;
	
	
	
	/**
	 * 获取运行时对象类型
	 * @param cls
	 * @return
	 */
	Class<?> getObjectClass(Class<?> cls);
	
	
	/**
	 * 获取指定插件集合
	 * @param cls
	 * @return
	 */
	<T> Map<String, T> getObjects(Class<T> cls);
	
	
	/**
	 * 获取指定插件集合（指定类型前缀）
	 * @param cls
	 * @param strTypePrefix
	 * @return
	 */
	<T> Map<String, T> getObjects(Class<T> cls, String strTypePrefix) ;
	
	
	
	
}
