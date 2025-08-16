package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.ISystemRuntime;

/**
 * 服务总线系统功能运行时对象接口（支持多系统使用）
 * @author lionlau
 *
 */
public interface IHubSysUtilRuntime extends net.ibizsys.central.sysutil.ISysUtilRuntime{

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
