package net.ibizsys.central.cloud.saas.core.addin;

import net.ibizsys.central.cloud.core.util.domain.SaaSFunc;

/**
 * SaaS 功能提供对象接口
 * @author lionlau
 *
 */
public interface ISaaSFuncProvider extends ICloudSaaSUtilRTAddin {

	/**
	 * 建立SaaS功能代理
	 * @param saaSFunc
	 * @return
	 */
	ISaaSFuncAgent createSaaSFuncAgent(SaaSFunc saaSFunc);
}
