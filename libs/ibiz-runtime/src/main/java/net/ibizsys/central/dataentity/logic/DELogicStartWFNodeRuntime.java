package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDEStartWFLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体启动工作流行为节点运行时对象
 * @author lionlau
 *
 */
public class DELogicStartWFNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEStartWFLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEStartWFLogic iPSDEStartWFLogic = (IPSDEStartWFLogic)iPSDELogicNode;
		
		IEntity dstEntity = iDELogicSession.getParam(iPSDEStartWFLogic.getDstPSDELogicParamMust().getCodeName());
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDEStartWFLogic.getDstPSDataEntityMust().getId(), false);
		
		dstDataEntityRuntime.wfStart(dstEntity, iPSDEStartWFLogic.getPSDEWF());
		
		
	}
	
}
