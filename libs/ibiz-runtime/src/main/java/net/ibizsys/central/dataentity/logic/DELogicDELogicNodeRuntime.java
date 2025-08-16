package net.ibizsys.central.dataentity.logic;

import java.util.List;

import net.ibizsys.model.dataentity.logic.IPSDEDELogicLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;

/**
 * 实体调用实体处理逻辑节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDELogicNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDELogicLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDELogicLogic iPSDEDELogicLogic = (IPSDEDELogicLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDELogicLogic.getDstPSDELogicParamMust().getCodeName(), false).getParamObject(iDELogicSession);
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("逻辑参数[%1$s] ==> %2$s", iPSDEDELogicLogic.getDstPSDELogicParamMust().getCodeName(), objParam));
		}
		IPSDELogic dstPSDELogic = iPSDEDELogicLogic.getDstPSDELogicMust();
		
		IDataEntityRuntimeBase dstDataEntityRuntimeBase = null;
		if(iDELogicRuntimeContext.getDynaInstRuntime()!=null) {
			dstDataEntityRuntimeBase = iDELogicRuntimeContext.getDynaInstRuntime().getDynaInstDataEntityRuntime(iPSDEDELogicLogic.getDstPSDataEntity().getId());
		}
		if(dstDataEntityRuntimeBase == null) {
			dstDataEntityRuntimeBase = iDELogicRuntimeContext.getSystemRuntime().getDataEntityRuntime(iPSDEDELogicLogic.getDstPSDataEntity().getId(), false);
		}
		
		IDELogicRuntime dstDELogicRuntime = dstDataEntityRuntimeBase.getDELogicRuntime(dstPSDELogic);
		
		
		List list = DELogicParamRuntime.asList(objParam);
		if(list != null) {
			Object objRet = null;
			for(Object item : list) {
				objRet =dstDELogicRuntime.execute(new Object[] {item});
				
				if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
					iDELogicSession.debugInfo(String.format("调用逻辑[%1$s][%2$s] ==> %3$s", dstPSDELogic.getName(), item, objRet));
				}
				
				if(DELogicReturnTypes.BREAK_VALUE == objRet) {
					break;
				}
			}
			
			iDELogicSession.setLastReturn(objRet);
		}
		else {
			Object objRet = dstDELogicRuntime.execute(new Object[] {objParam});
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("调用逻辑[%1$s] ==> %2$s", dstPSDELogic.getName(), objRet));
			}
			
			iDELogicSession.setLastReturn(objRet);
		}
	}
	
}
