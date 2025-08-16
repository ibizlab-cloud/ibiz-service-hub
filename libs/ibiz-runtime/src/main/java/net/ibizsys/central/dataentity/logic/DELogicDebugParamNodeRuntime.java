package net.ibizsys.central.dataentity.logic;

import java.util.List;

import org.springframework.util.ObjectUtils;

import net.ibizsys.model.dataentity.logic.IPSDEDebugParamLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体调试输出逻辑参数节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDebugParamNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDebugParamLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDebugParamLogic iPSDEDebugParamLogic = (IPSDEDebugParamLogic)iPSDELogicNode;
		
		if(iPSDEDebugParamLogic.getDstPSDELogicParam() != null) {
			IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDebugParamLogic.getDstPSDELogicParamMust().getCodeName(), false);
			iDELogicSession.debugParam(dstDELogicParamRuntime);
		}
		else {
			//未指定时输出全部参数
			List<IPSDELogicParam> psDELogicParamList = iDELogicRuntimeContext.getDELogicRuntime().getPSDELogic().getPSDELogicParams();
			if(!ObjectUtils.isEmpty(psDELogicParamList)) {
				for(IPSDELogicParam iPSDELogicParam : psDELogicParamList) {
					IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false);
					iDELogicSession.debugParam(dstDELogicParamRuntime);
				}
			}
		}
		
		
		
	}
	
}
