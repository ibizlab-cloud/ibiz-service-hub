package net.ibizsys.central.cloud.core.service;

/**
 * 系统服务接口运行时持有者
 * @author lionlau
 *
 */
public class SysServiceAPIRuntimeHolder {

	private static ThreadLocal<net.ibizsys.central.service.ISysServiceAPIRuntime> sysServiceAPIRuntimeThreadLocal = new ThreadLocal<net.ibizsys.central.service.ISysServiceAPIRuntime>();
	
	public static net.ibizsys.central.service.ISysServiceAPIRuntime getCurrent() {
		return sysServiceAPIRuntimeThreadLocal.get();
	}
	
	public static net.ibizsys.central.service.ISysServiceAPIRuntime getCurrentMust() throws Exception{
		net.ibizsys.central.service.ISysServiceAPIRuntime iSysServiceAPIRuntime = sysServiceAPIRuntimeThreadLocal.get();
		if(iSysServiceAPIRuntime == null) {
			throw new Exception("当前行为会话无效");
		}
		return iSysServiceAPIRuntime;
	}
	
	public static void setCurrent(net.ibizsys.central.service.ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		sysServiceAPIRuntimeThreadLocal.set(iSysServiceAPIRuntime);
	}
}
