package net.ibizsys.central.testing;

import java.io.File;
import java.util.Map;

import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 系统测试项目运行时上下文对象
 * @author lionlau
 *
 */
public interface ISysTestPrjRuntimeContext extends IModelRuntimeContext{

		
	@Override
	ISysTestPrjRuntime getModelRuntime();
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	String getParam(String strKey, String strDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	int getParam(String strKey, int nDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	long getParam(String strKey, long nDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param fDefault
	 * @return
	 */
	double getParam(String strKey, double fDefault);
	
	
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param bDefault
	 * @return
	 */
	boolean getParam(String strKey, boolean bDefault);
	
	
	
	
	
	/**
	 * 获取指定父键的参数集合
	 * @param strPKey
	 * @param params
	 * @return
	 */
	Map<String, Object> getParams(String strPKey, Map<String, Object> params);
	
	
	
	
	
	/**
	 * 获取工作空间
	 * @return
	 */
	File getWorkspace();


}
