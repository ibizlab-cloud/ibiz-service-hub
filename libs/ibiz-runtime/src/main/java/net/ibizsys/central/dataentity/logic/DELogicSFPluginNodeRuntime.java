package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESFPluginLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体逻辑调用系统预置逻辑节点运行时对象
 * @author lionlau
 *
 */
public class DELogicSFPluginNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESFPluginLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESFPluginLogic iPSDESFPluginLogic = (IPSDESFPluginLogic)iPSDELogicNode;
		
		IDELogicNodeRuntime iDELogicNodeRuntime = iDELogicRuntimeContext.getSystemRuntime().getRuntimeObject(iPSDESFPluginLogic.getPSSysSFPluginMust(), IDELogicNodeRuntime.class, false);
		iDELogicNodeRuntime.execute(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNode);
		
	}
	
}
