package net.ibizsys.central.sysutil;

import java.util.Map;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 系统功能运行时上下文对象接口
 * @author lionlau
 *
 */
public interface ISysUtilRuntimeContext extends IModelRuntimeContext{

	
	/* (non-Javadoc)
	 * @see net.ibizsys.runtime.IModelRuntimeContext#getModelRuntime()
	 */
	ISysUtilRuntime getModelRuntime();
	
	
	/**
	 * 获取指定类型插件集合
	 * @param cls
	 * @param strTypePrefix
	 * @return
	 */
	<T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix);
	
	
	
	
	/**
	 * 获取系统运行时上下文对象
	 * @return
	 */
	ISystemRuntimeContext getSystemRuntimeContext();
	
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	String getSetting(String strKey, String strDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	int getSetting(String strKey, int nDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	long getSetting(String strKey, long nDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param fDefault
	 * @return
	 */
	double getSetting(String strKey, double fDefault);
	
	
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param bDefault
	 * @return
	 */
	boolean getSetting(String strKey, boolean bDefault);
	
	
	
	/**
	 * 获取指定父键的参数集合
	 * @param strPKey
	 * @param params
	 * @return
	 */
	Map<String, Object> getSettings(String strPKey, Map<String, Object> params);
}
