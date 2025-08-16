package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDEResetParamLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体重置逻辑参数节点运行时对象
 * @author lionlau
 *
 */
public class DELogicResetParamNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEResetParamLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEResetParamLogic iPSDEResetParamLogic = (IPSDEResetParamLogic)iPSDELogicNode;
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEResetParamLogic.getDstPSDELogicParamMust().getCodeName(), false);
		dstDELogicParamRuntime.resetAll(iDELogicSession);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("重置参数[%1$s]", dstDELogicParamRuntime.getCodeName()));
		}
		
		iDELogicSession.setLastReturn(null);
	}
	
}
