package net.ibizsys.central.dataentity.logic;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.logic.IPSDEBindParamLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体绑定逻辑参数节点运行时对象
 * @author lionlau
 *
 */
public class DELogicBindParamNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEBindParamLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEBindParamLogic iPSDEBindParamLogic = (IPSDEBindParamLogic)iPSDELogicNode;
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEBindParamLogic.getSrcPSDELogicParamMust().getCodeName(), false);
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEBindParamLogic.getDstPSDELogicParamMust().getCodeName(), false);
		String strSrcFieldName = iPSDEBindParamLogic.getSrcFieldName();
		Object objValue = null;
		if(StringUtils.hasLength(strSrcFieldName)){
			objValue = srcDELogicParamRuntime.get(iDELogicSession, strSrcFieldName);
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
		
		dstDELogicParamRuntime.bind(iDELogicSession, objValue);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("绑定参数[%1$s] <== %2$s", dstDELogicParamRuntime.getCodeName(), objValue));
		}
		iDELogicSession.setLastReturn(null);
	}
	
}
