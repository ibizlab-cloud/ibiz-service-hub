package net.ibizsys.central.cloud.core.ai;

import java.util.Map;

import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 系统AI工厂运行时上下文对象
 * @author lionlau
 *
 */
public interface ISysAIFactoryRuntimeContext extends IModelRuntimeContext, IAIFactoryRuntimeBaseContext {

	/**
	 * 获取AI工厂运行时对象
	 * @return
	 */
	default ISysAIFactoryRuntime getAIFactoryRuntime() {
		return getModelRuntime();
	}
	
	
	
	@Override
	ISysAIFactoryRuntime getModelRuntime();
	
	
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
	 * 获取聊天历史消息数量
	 * @return
	 */
	int getHistoryCount();
	
	
	/**
	 * 获取默认AI平台类型
	 * @return
	 */
	String getAIPlatformType();
	
}
