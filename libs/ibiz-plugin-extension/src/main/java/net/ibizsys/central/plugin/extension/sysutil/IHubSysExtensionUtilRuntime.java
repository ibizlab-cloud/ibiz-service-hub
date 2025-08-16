package net.ibizsys.central.plugin.extension.sysutil;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.runtime.util.IAction;

/**
 * 总线系统扩展功能运行时对象接口
 * @author lionlau
 *
 */
public interface IHubSysExtensionUtilRuntime extends net.ibizsys.central.cloud.core.sysutil.IHubSysExtensionUtilRuntime {

	/**
	 * 执行动态模型行为
	 * @param iSystemRuntime 系统运行时
	 * @param action
	 * @param args
	 * @return
	 */
	Object executeDynaModelAction(ISystemRuntime iSystemRuntime, IAction action, Object[] args); 
	
	
	
	/**
	 * 调用动态模型接口
	 * @param iSystemRuntime
	 * @param strPModel
	 * @param strPKey
	 * @param strModel
	 * @param strMethod
	 * @param strKey
	 * @param param
	 * @param bIgnoreCheckDataAccessAction 忽略检查数据访问行为
	 * @return
	 */
	Object invokeDynaModelAPI(ISystemRuntime iSystemRuntime, String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param, boolean bIgnoreCheckDataAccessAction);
	
}
