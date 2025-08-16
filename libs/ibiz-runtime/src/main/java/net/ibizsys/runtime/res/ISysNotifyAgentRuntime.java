package net.ibizsys.runtime.res;

import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;

/**
 * 系统实体通知代理运行时对象
 * 
 * @author lionlau
 *
 */
public interface ISysNotifyAgentRuntime extends ISystemModelRuntime {

	/**
	 * 初始化系统实体通知代理运行时
	 * 
	 * @param iSystemRuntimeBase
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext) throws Exception;

	/**
	 * 注册实体通知运行时
	 * 
	 * @param iDENotifyRuntime
	 */
	void registerDENotifyRuntime(IDENotifyRuntime iDENotifyRuntime);

	
	
	
	/**
	 * 执行通知发送处理
	 */
	void send();
}
