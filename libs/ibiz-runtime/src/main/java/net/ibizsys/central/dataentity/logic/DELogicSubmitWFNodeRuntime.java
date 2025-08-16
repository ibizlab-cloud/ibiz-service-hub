package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESubmitWFLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体提交工作流操作行为节点运行时对象
 * @author lionlau
 *
 */
public class DELogicSubmitWFNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESubmitWFLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESubmitWFLogic iPSDESubmitWFLogic = (IPSDESubmitWFLogic)iPSDELogicNode;
		
		Object dstParam = iDELogicSession.getParamObject(iPSDESubmitWFLogic.getDstPSDELogicParamMust().getCodeName());
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDESubmitWFLogic.getDstPSDataEntityMust().getId(), false);
		
		Object objRet = dstDataEntityRuntime.wfSubmit(dstParam, iPSDESubmitWFLogic.getPSDEWF(), iPSDESubmitWFLogic.getWFAction(), null);
		iDELogicSession.setLastReturn(objRet);
		if(iPSDESubmitWFLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESubmitWFLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("绑定返回值[%1$s] <== %2$s", retDELogicParamRuntime.getCodeName(), objRet));
			}
		}
	}
	
}
