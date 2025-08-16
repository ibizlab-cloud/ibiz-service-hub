package net.ibizsys.central.dataentity.logic;

import java.util.ArrayList;
import java.util.List;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.dataflow.IDEDataFlowRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow;
import net.ibizsys.model.dataentity.logic.IPSDEDEDataFlowLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体调用实体数据流节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDEDataFlowNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDEDataFlowLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDEDataFlowLogic iPSDEDEDataFlowLogic = (IPSDEDEDataFlowLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEDataFlowLogic.getDstPSDELogicParamMust().getCodeName(), false).getReal(iDELogicSession);
		if(!(objParam instanceof IEntityBase)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]传入参数[%2$s]类型不正确，必须为数据对象", iPSDELogicNode.getName(), iPSDEDEDataFlowLogic.getDstPSDELogicParamMust().getCodeName()));
		}
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("数据流参数[%1$s] ==> %2$s", iPSDEDEDataFlowLogic.getDstPSDELogicParamMust().getCodeName(), objParam));
		}
		
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDEDEDataFlowLogic.getDstPSDataEntityMust().getId(), false);
		IPSDEDataFlow dstPSDEDataFlow = iPSDEDEDataFlowLogic.getDstPSDEDataFlowMust();
		
		IDEDataFlowRuntime dstDEDataFlowRuntime = dstDataEntityRuntime.getDEDataFlowRuntime(dstPSDEDataFlow.getCodeName(), false);
		
		if(objParam instanceof IEntityDTO) {
			//将DTO对象调整为常规数据对象
			Entity entity = new Entity();
			((IEntityDTO)objParam).copyTo(entity);
			objParam = entity;
		}
		else
			if(objParam instanceof List) {
				List list = (List)objParam;
				List newList = new ArrayList<Object>();
				for(Object item : list) {
					if(item instanceof IEntityDTO) {
						Entity entity = new Entity();
						((IEntityDTO)item).copyTo(entity);
						item = entity;
					}
					newList.add(item);
				}
				objParam = newList;
			}
		
		Object objRet = dstDEDataFlowRuntime.execute(new Object[] {objParam});
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("调用数据流[%1$s] ==> %2$s", dstPSDEDataFlow.getName(), objRet));
		}
		iDELogicSession.setLastReturn(objRet);
		
		if(iPSDEDEDataFlowLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEDataFlowLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("绑定返回值[%1$s] <== %2$s", retDELogicParamRuntime.getCodeName(), objRet));
			}
		}
		
	}
	
}
