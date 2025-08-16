package net.ibizsys.central.sysutil;

import java.util.Set;

import com.fasterxml.jackson.core.type.TypeReference;

public interface ISysUniStateUtilRuntimeBase {

	/**
	 * 判断指定路径是否存在
	 * @param strPath
	 * @return
	 */
	boolean contains(String strPath);
	
	/**
	 * 设置指定路径值
	 * @param strPath
	 * @param strValue
	 */
	void set(String strPath, String strValue);
	
	
	
	/**
	 * 设置指定路径对象值
	 * @param strPath
	 * @param objValue
	 */
	void set(String strPath, Object objValue);
	

	/**
	 * 获取指定缓存，按类型返回
	 * @param strPath
	 * @param cls
	 * @return
	 */
	<T> T get(String strPath, Class<T> cls);
	
	
	/**
	 * 获取指定缓存，按类型返回
	 * @param strPath
	 * @param type
	 * @return
	 */
	<T> T get(String strPath, TypeReference<T> type);
	
	/**
	 * 获取指定路径值
	 * @param strPath
	 * @return
	 */
	String get(String strPath);
	
	/**
	 * 移除路径缓存
	 * @param strPath
	 */
	void reset(String strPath);
	
	
	
	/**
	 * 获取状态路径格式化
	 * @param folderList
	 * @return
	 */
	String getPathFormat(Set<String> folderList);
	
	
	/**
	 * 是否支持侦听器
	 * @return
	 */
	boolean isEnableListener(boolean bPattern);
	
	
	/**
	 * 注册统一状态侦听器
	 * @param iSysUniStateListener
	 */
	void registerListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener);
	
	
	/**
	 * 注销统一状态侦听器
	 * @param iSysUniStateListener
	 */
	void unregisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener);
	
}
