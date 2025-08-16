package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.logic.IPSDEDEDataQueryLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体调用实体查询节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDEDataQueryNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDEDataQueryLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDEDataQueryLogic iPSDEDEDataQueryLogic = (IPSDEDEDataQueryLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEDataQueryLogic.getDstPSDELogicParamMust().getCodeName(), false).getParamObject(iDELogicSession);
		if(!(objParam instanceof ISearchContextDTO)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]传入参数[%2$s]类型不正确，必须为过滤器对象", iPSDELogicNode.getName(), iPSDEDEDataQueryLogic.getDstPSDELogicParamMust().getCodeName()));
		}
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("过滤参数[%1$s] ==> %2$s", iPSDEDEDataQueryLogic.getDstPSDELogicParamMust().getCodeName(), objParam));
		}
		
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDEDEDataQueryLogic.getDstPSDataEntityMust().getId(), false);
		
		IPSDEDataQuery dstPSDEDataQuery = iPSDEDEDataQueryLogic.getDstPSDEDataQuery();
		if(dstPSDEDataQuery == null) {
			dstPSDEDataQuery = dstDataEntityRuntime.getDefaultPSDEDataQuery();
		}
		
		if(dstPSDEDataQuery == null) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]未指定数据查询对象", iPSDELogicNode.getName()));
		}
		
		
		Object objRet = dstDataEntityRuntime.selectDataQuery(dstPSDEDataQuery, (ISearchContextDTO)objParam);
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("调用查询[%1$s] ==> %2$s", dstPSDEDataQuery.getName(), objRet));
		}
		iDELogicSession.setLastReturn(objRet);
		
		if(iPSDEDEDataQueryLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEDataQueryLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("绑定返回值[%1$s] <== %2$s", retDELogicParamRuntime.getCodeName(), objRet));
			}
		}
		
	}
	
}
