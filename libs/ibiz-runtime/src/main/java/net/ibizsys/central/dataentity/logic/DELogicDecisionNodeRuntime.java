package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDEDecisionLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体角色节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDecisionNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDecisionLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
//		IPSDEDecisionLogic iPSDEDecisionLogic = (IPSDEDecisionLogic)iPSDELogicNode;
//		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDecisionLogic.getDstPSDELogicParamMust().getCodeName(), false);
//		String strDstFieldName = iPSDEDecisionLogic.getDstFieldName();
//		
//		Object objValue = null;
//		if(ObjectUtils.isEmpty(strDstFieldName)) {
//			objValue = dstDELogicParamRuntime.getReal(iDELogicSession);
//		}
//		else{
//			objValue = dstDELogicParamRuntime.get(iDELogicSession, strDstFieldName.toLowerCase());
//		}
		
//		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
//			iDELogicSession.debugInfo(String.format("决策参数[%1$s] <== %2$s", dstDELogicParamRuntime.getCodeName(), strDstFieldName));
//		}
		
		iDELogicSession.setLastReturn(null);
	}
	
}
