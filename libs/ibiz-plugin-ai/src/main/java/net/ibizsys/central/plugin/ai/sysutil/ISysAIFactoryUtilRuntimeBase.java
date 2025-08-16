package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.runtime.IModelRuntime;

public interface ISysAIFactoryUtilRuntimeBase extends IModelRuntime{

	/**
	 * 获取系统运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
}
