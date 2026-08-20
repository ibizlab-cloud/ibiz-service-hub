package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDEBeginTransLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体调用事务开始节点运行时对象
 * @author lionlau
 *
 */
public class DELogicBeginTransNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEBeginTransLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		IPSDEBeginTransLogic iPSDEBeginTransLogic = (IPSDEBeginTransLogic)iPSDELogicNode;
		iDELogicSession.beginTrans(iPSDEBeginTransLogic.getTransactionMode());
		iDELogicSession.setLastReturn(null);
	}
	
}
