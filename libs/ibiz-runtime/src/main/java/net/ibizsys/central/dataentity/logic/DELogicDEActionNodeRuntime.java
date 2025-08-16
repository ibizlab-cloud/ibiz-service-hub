package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.logic.IPSDEDEActionLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体调用实体行为节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDEActionNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDEActionLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDEActionLogic iPSDEDEActionLogic = (IPSDEDEActionLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEActionLogic.getDstPSDELogicParamMust().getCodeName(), false).getReal(iDELogicSession);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("行为参数[%1$s] ==> %2$s", iPSDEDEActionLogic.getDstPSDELogicParamMust().getCodeName(), objParam));
		}
		
		//IEntity dstEntity = iDELogicSession.getParam(iPSDEDEActionLogic.getDstPSDELogicParamMust().getCodeName());
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDEDEActionLogic.getDstPSDataEntityMust().getId(), false);
		IPSDEAction dstPSDEAction = iPSDEDEActionLogic.getDstPSDEActionMust();
		
		Object objRet = dstDataEntityRuntime.executeAction(dstPSDEAction.getName(), dstPSDEAction, new Object[] {objParam});
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("调用行为[%1$s] ==> %2$s", dstPSDEAction.getName(), objRet));
		}
		
		if(dstPSDEAction.getPSDEActionInputMust().isOutput()) {
			objRet = objParam;
		}
		
		iDELogicSession.setLastReturn(objRet);
		if(iPSDEDEActionLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEActionLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("绑定返回值[%1$s] <== %2$s", retDELogicParamRuntime.getCodeName(), objRet));
			}
		}
	}
	
}
