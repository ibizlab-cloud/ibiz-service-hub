package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDERollbackLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体调用事务回滚节点运行时对象
 * @author lionlau
 *
 */
public class DELogicRollbackNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDERollbackLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		
		//iDELogicSession.setLastReturn(null);
		
	}
	
}
