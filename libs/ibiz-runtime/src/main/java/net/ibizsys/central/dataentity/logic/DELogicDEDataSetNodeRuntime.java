package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.logic.IPSDEDEDataSetLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体调用实体数据集节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDEDataSetNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDEDataSetLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDEDataSetLogic iPSDEDEDataSetLogic = (IPSDEDEDataSetLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEDataSetLogic.getDstPSDELogicParamMust().getCodeName(), false).getReal(iDELogicSession);
		if(!(objParam instanceof ISearchContextDTO)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]传入参数[%2$s]类型不正确，必须为过滤器对象", iPSDELogicNode.getName(), iPSDEDEDataSetLogic.getDstPSDELogicParamMust().getCodeName()));
		}
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("过滤参数[%1$s] ==> %2$s", iPSDEDEDataSetLogic.getDstPSDELogicParamMust().getCodeName(), objParam));
		}
		
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDEDEDataSetLogic.getDstPSDataEntityMust().getId(), false);
		IPSDEDataSet dstPSDEDataSet = iPSDEDEDataSetLogic.getDstPSDEDataSetMust();
		
		Object objRet = dstDataEntityRuntime.fetchDataSet(dstPSDEDataSet.getName(), dstPSDEDataSet, new Object[] {objParam});
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("调用数据集[%1$s] ==> %2$s", dstPSDEDataSet.getName(), objRet));
		}
		iDELogicSession.setLastReturn(objRet);
		
		if(iPSDEDEDataSetLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEDataSetLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("绑定返回值[%1$s] <== %2$s", retDELogicParamRuntime.getCodeName(), objRet));
			}
		}
		
	}
	
}
