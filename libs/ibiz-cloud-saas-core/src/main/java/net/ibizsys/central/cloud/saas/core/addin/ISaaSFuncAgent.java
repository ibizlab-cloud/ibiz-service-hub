package net.ibizsys.central.cloud.saas.core.addin;

import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.SaaSFunc;
import net.ibizsys.central.cloud.saas.core.cloudutil.ICloudSaaSUtilRuntimeContext;

/**
 * SaaS 功能代理对象接口
 * @author lionlau
 *
 */
public interface ISaaSFuncAgent extends ICloudSaaSUtilRTAddin {

	/**
	 * 初始化
	 * @param ctx
	 * @param aiAccess
	 * @throws Exception
	 */
	void init(ICloudSaaSUtilRuntimeContext ctx, SaaSFunc saaSFunc) throws Exception;
	
	
	/**
	 * 开始代理
	 */
	void start() throws Exception;
	
	/**
	 * 停止代理
	 */
	void stop() throws Exception;
	
	
	/**
	 * 获取代理数据
	 * @return
	 */
	SaaSFunc getAgentData();

	
	/**
	 * 获取功能类型
	 * @return
	 */
	String getFuncType();
	
	
	/**
	 * 获取功能级别
	 * @return
	 */
	int getFuncLevel();
	
	/**
	 * 调用功能
	 * @param method
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	Object invoke(String method, Map<String, Object> params) throws Throwable;
	
	
	
	
	
}
