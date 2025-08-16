package net.ibizsys.runtime.dataentity.action;

import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体行为附加逻辑运行时对象
 * @author lionlau
 *
 */
public interface IDEActionLogicRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeBaseContextBase
	 * @param iPSDEActionLogic
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContextBase, IPSDEActionLogic iPSDEActionLogic) throws Exception;
	
	
	
	/**
	 * 获取实体行为附加逻辑模型对象
	 * @return
	 */
	IPSDEActionLogic getPSDEActionLogic();
	
	
	
	/**
	 * 获取附加模式
	 * @return
	 */
	java.lang.String getAttachMode();
	
	
	/**
	 * 执行
	 * @param iEntityBase
	 * @return
	 */
	Object execute(IEntityBase iEntityBase) throws Throwable;
	
	
}
