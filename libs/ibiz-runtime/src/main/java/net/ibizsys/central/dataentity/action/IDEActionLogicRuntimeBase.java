package net.ibizsys.central.dataentity.action;

import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.dataentity.action.IPSDEAction;

/**
 * 实体行为逻辑附加运行时逻辑基础对象
 * @author lionlau
 *
 */
public interface IDEActionLogicRuntimeBase {

	/**
	 * 执行实体行为逻辑附加插件
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEAction
	 * @param args
	 * @param ret
	 * @return
	 * @throws Throwable
	 */
	Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object ret) throws Throwable ;
	
	
	
	/**
	 * 获取附加模式
	 * @return
	 */
	java.lang.String getAttachMode();
}
