package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;

/**
 * 实体逻辑节点运行时对象接口
 * @author lionlau
 *
 */
public interface IDELogicNodeRuntime {

	
	/**
	 * 执行实体逻辑节点运行时
	 * @param iDELogicRuntimeContext
	 * @param iDELogicSession
	 * @param iPSDELogicNode
	 * @return
	 * @throws Throwable
	 */
	void execute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable ;
	
}
