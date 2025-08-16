package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.datasync.IPSDEDataSync;
import net.ibizsys.model.dataentity.logic.IPSDEDEDataSyncLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncOutRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体调用实体数据同步节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDEDataSyncNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDEDataSyncLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDEDataSyncLogic iPSDEDEDataSyncLogic = (IPSDEDEDataSyncLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEDataSyncLogic.getDstPSDELogicParamMust().getCodeName(), false).getParamObject(iDELogicSession);
		if(!(objParam instanceof IEntityBase)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]传入参数[%2$s]类型不正确，必须为数据对象", iPSDELogicNode.getName(), iPSDEDEDataSyncLogic.getDstPSDELogicParamMust().getCodeName()));
		}
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("同步参数[%1$s] ==> %2$s", iPSDEDEDataSyncLogic.getDstPSDELogicParamMust().getCodeName(), objParam));
		}
		
		IPSDEDataSync dstPSDEDataSync = iPSDEDEDataSyncLogic.getDstPSDEDataSyncMust();
		
		IDataEntityRuntimeBase dstDataEntityRuntimeBase = null;
		if(iDELogicRuntimeContext.getDynaInstRuntime()!=null) {
			dstDataEntityRuntimeBase = iDELogicRuntimeContext.getDynaInstRuntime().getDynaInstDataEntityRuntime(iPSDEDEDataSyncLogic.getDstPSDataEntity().getId());
		}
		if(dstDataEntityRuntimeBase == null) {
			dstDataEntityRuntimeBase = iDELogicRuntimeContext.getSystemRuntime().getDataEntityRuntime(iPSDEDEDataSyncLogic.getDstPSDataEntity().getId(), false);
		}
		
		IDEDataSyncOutRuntime dstDEDataSyncOutRuntime = dstDataEntityRuntimeBase.getDEDataSyncOutRuntime(dstPSDEDataSync);
		//dstDEDataSyncOutRuntime.send(dstPSDEDataSync.getEventType(), objParam, null);
		dstDEDataSyncOutRuntime.sendDirect(dstPSDEDataSync.getEventType(), objParam);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("数据同步[%1$s]", dstPSDEDataSync.getName()));
		}
		iDELogicSession.setLastReturn(null);
		
	}
	
}
