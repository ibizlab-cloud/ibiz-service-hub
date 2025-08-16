package net.ibizsys.central.dataentity.logic;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESortParamLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体排序列表逻辑参数节点运行时对象
 * @author lionlau
 *
 */
public class DELogicSortParamNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESortParamLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESortParamLogic iPSDESortParamLogic = (IPSDESortParamLogic)iPSDELogicNode;
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESortParamLogic.getDstPSDELogicParamMust().getCodeName(), false);
		String strDstFieldName = iPSDESortParamLogic.getDstFieldName();
		if(!StringUtils.hasLength(iPSDESortParamLogic.getDstFieldName())) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]未指定设置排序属性", iPSDESortParamLogic.getName()));
		}
		dstDELogicParamRuntime.sort(iDELogicSession, strDstFieldName, iPSDESortParamLogic.getDstSortDir());
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("排序数组参数[%1$s] <== %2$s, %3$s", dstDELogicParamRuntime.getCodeName(), strDstFieldName, iPSDESortParamLogic.getDstSortDir()));
		}
		
		iDELogicSession.setLastReturn(null);
	}
	
}
