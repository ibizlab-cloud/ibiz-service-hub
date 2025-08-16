package net.ibizsys.central.dataentity.logic;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.logic.IPSDEAppendParamLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体附加列表逻辑参数节点运行时对象
 * @author lionlau
 *
 */
public class DELogicAppendParamNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEAppendParamLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEAppendParamLogic iPSDEAppendParamLogic = (IPSDEAppendParamLogic)iPSDELogicNode;
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEAppendParamLogic.getDstPSDELogicParamMust().getCodeName(), false);
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEAppendParamLogic.getSrcPSDELogicParamMust().getCodeName(), false);
		String strSrcFieldName = iPSDEAppendParamLogic.getSrcFieldName();
		
		Object objValue = null;
		if(StringUtils.hasLength(strSrcFieldName)){
			objValue =  srcDELogicParamRuntime.get(iDELogicSession, strSrcFieldName);
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("源参数[%1$s]属性[%2$s] ==> %3$s", srcDELogicParamRuntime.getCodeName(), strSrcFieldName, objValue));
			}
		}
		else {
			objValue = srcDELogicParamRuntime.getParamObject(iDELogicSession);
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("源参数[%1$s] ==> %2$s", srcDELogicParamRuntime.getCodeName(), objValue));
			}
		}
		
		dstDELogicParamRuntime.append(iDELogicSession, iPSDEAppendParamLogic.getDstIndex(), objValue, iPSDEAppendParamLogic.getSrcIndex(), iPSDEAppendParamLogic.getSrcSize());
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			if(iPSDEAppendParamLogic.getSrcIndex() >= 0 ) {
				iDELogicSession.debugInfo(String.format("附加数组参数[%1$s][%2$s] <== %3$s{%4$s, %5$s}", dstDELogicParamRuntime.getCodeName(), iPSDEAppendParamLogic.getDstIndex(), objValue, iPSDEAppendParamLogic.getSrcIndex(), iPSDEAppendParamLogic.getSrcSize()));
			}
			else {
				iDELogicSession.debugInfo(String.format("附加数组参数[%1$s][%2$s] <== %3$s", dstDELogicParamRuntime.getCodeName(), iPSDEAppendParamLogic.getDstIndex(), objValue));
			}
		}
		
		iDELogicSession.setLastReturn(null);
	}
	
}
