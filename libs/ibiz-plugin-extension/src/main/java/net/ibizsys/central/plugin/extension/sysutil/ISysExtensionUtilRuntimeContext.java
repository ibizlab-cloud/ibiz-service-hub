package net.ibizsys.central.plugin.extension.sysutil;

import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

public interface ISysExtensionUtilRuntimeContext extends ISysUtilRuntimeContext {

	/**
	 * 获取系统扩展功能组件运行时对象
	 * @return
	 */
	default ISysExtensionUtilRuntime getSysExtensionUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ISysExtensionUtilRuntime getModelRuntime();
	
	
	/**
	 * 执行定时任务
	 * @param v2SystemExtensionLogic
	 * @param objData
	 */
	void executeExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData);
}
