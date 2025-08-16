package net.ibizsys.central.cloud.core.addin;

import net.ibizsys.central.ISystemRuntime;

public interface IHubSysUtilRTAddin extends ISysUtilRTAddin {

	/**
	 * 执行作业
	 * @param iSystemRuntime 
	 * @param strAction
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 */
	Object executeAction(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag);
	
}
