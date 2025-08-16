package net.ibizsys.central.plugin.extension.sysutil;

import net.ibizsys.runtime.util.IAction;

public interface ISysExtensionUtilRuntime extends net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime {

	
	/**
	 * 执行动态模型行为
	 * @param action
	 * @param args
	 * @return
	 */
	Object executeDynaModelAction(IAction action, Object[] args); 
	

	/**
	 * 调用动态模型接口
	 * @param strPModel
	 * @param strPKey
	 * @param strModel
	 * @param strMethod
	 * @param strKey
	 * @param param
	 * @param bIgnoreCheckDataAccessAction 忽略检查数据访问行为
	 * @return
	 */
	Object invokeDynaModelAPI(String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param, boolean bIgnoreCheckDataAccessAction);
}
