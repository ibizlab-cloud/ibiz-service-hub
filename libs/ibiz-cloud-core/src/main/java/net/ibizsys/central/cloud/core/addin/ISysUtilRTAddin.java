package net.ibizsys.central.cloud.core.addin;


public interface ISysUtilRTAddin extends net.ibizsys.central.addin.ISysUtilRTAddin{

	/**
	 * 执行作业
	* @param strAction
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 */
	Object executeAction(String strAction, Object objBody, String strKey, Object objTag);
}
