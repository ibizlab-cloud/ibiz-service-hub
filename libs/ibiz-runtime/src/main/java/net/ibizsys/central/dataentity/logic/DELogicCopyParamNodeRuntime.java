package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDECopyParamLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体拷贝逻辑参数节点运行时对象
 * @author lionlau
 *
 */
public class DELogicCopyParamNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDECopyParamLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDECopyParamLogic iPSDECopyParamLogic = (IPSDECopyParamLogic)iPSDELogicNode;
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDECopyParamLogic.getSrcPSDELogicParamMust().getCodeName(), false);
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDECopyParamLogic.getDstPSDELogicParamMust().getCodeName(), false);
		
		
		
		srcDELogicParamRuntime.copyTo(iDELogicSession, dstDELogicParamRuntime.getParamObject(iDELogicSession), iPSDECopyParamLogic.getCopyFields(), iPSDECopyParamLogic.isCopyIfNotExists());
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("拷贝参数[%1$s] ==> %2$s", srcDELogicParamRuntime.getCodeName(), dstDELogicParamRuntime.getCodeName()));
		}
		
		iDELogicSession.setLastReturn(null);
	}
	
}
