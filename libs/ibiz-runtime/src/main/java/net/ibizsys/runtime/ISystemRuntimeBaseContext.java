package net.ibizsys.runtime;

import net.ibizsys.model.IPSSystemService;

/**
 * 系统运行时上下文接口
 * @author lionlau
 *
 */
public interface ISystemRuntimeBaseContext {

	/**
	 * 获取系统运行时对象
	 * @return
	 */
	ISystemRuntimeBase getSystemRuntime();
	
	
	/**
	 * 获取系统模型服务对象
	 * @return
	 */
	IPSSystemService getPSSystemService();
	
	
	
	
}
