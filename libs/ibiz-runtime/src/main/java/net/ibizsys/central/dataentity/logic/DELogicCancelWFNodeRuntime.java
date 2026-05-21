package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDECancelWFLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体取消工作流行为节点运行时对象
 * @author lionlau
 *
 */
public class DELogicCancelWFNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDECancelWFLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDECancelWFLogic iPSDECancelWFLogic = (IPSDECancelWFLogic)iPSDELogicNode;
		
		IEntity dstEntity = iDELogicSession.getParam(iPSDECancelWFLogic.getDstPSDELogicParamMust().getCodeName());
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDECancelWFLogic.getDstPSDataEntityMust().getId(), false);
		
		dstDataEntityRuntime.wfCancel(dstEntity, iPSDECancelWFLogic.getPSDEWF());
		
		
	}
	
}
