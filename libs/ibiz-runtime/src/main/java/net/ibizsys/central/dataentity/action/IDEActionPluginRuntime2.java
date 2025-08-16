package net.ibizsys.central.dataentity.action;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;

public interface IDEActionPluginRuntime2 extends net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime{

	/**
	 * 注册排序值：优先
	 */
	public final int PRIORITY_PRIMARY = 50;
	
	/**
	 * 注册排序值：默认
	 */
	public final int PRIORITY_DEFAULT = 100;
	
	/**
	 * 获取优先级
	 * @return
	 */
	default int getPriority() {
		return PRIORITY_DEFAULT;
	}
	
	/**
	 * 是否启用
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEAction
	 * @param args
	 * @param actionData
	 * @return
	 */
	default boolean isValid(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) {
		return true;
	}
}
