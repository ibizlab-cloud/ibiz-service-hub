package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDERenewParamLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体重建逻辑参数节点运行时对象
 * @author lionlau
 *
 */
public class DELogicRenewParamNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDERenewParamLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDERenewParamLogic iPSDERenewParamLogic = (IPSDERenewParamLogic)iPSDELogicNode;
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDERenewParamLogic.getDstPSDELogicParamMust().getCodeName(), false);
		dstDELogicParamRuntime.renew(iDELogicSession);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("重建参数[%1$s]", dstDELogicParamRuntime.getCodeName()));
		}
		
		iDELogicSession.setLastReturn(null);
	}
	
}
