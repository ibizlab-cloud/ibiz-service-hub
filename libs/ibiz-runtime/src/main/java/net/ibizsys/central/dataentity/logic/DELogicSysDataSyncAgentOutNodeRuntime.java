package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESysDataSyncAgentOutLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.domain.DataSyncOut;

/**
 * 实体调用系统数据同步代理输出节点运行时对象
 * @author lionlau
 *
 */
public class DELogicSysDataSyncAgentOutNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESysDataSyncAgentOutLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESysDataSyncAgentOutLogic iPSDESysDataSyncAgentOutLogic = (IPSDESysDataSyncAgentOutLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysDataSyncAgentOutLogic.getDstPSDELogicParamMust().getCodeName(), false).getParamObject(iDELogicSession);
		ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = iDELogicRuntimeContext.getSystemRuntime().getSysDataSyncAgentRuntime(iPSDESysDataSyncAgentOutLogic.getPSSysDataSyncAgentMust());
		
		if(!iSysDataSyncAgentRuntime.isRawDataMode()) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]数据同步代理[%2$s]类型不正确，仅支持直接发送", iPSDELogicNode.getName(), iPSDESysDataSyncAgentOutLogic.getPSSysDataSyncAgentMust().getName()));
		}
		
		DataSyncOut dataSyncOut = new DataSyncOut();
		dataSyncOut.setData(DataTypeUtils.getStringValue(iDELogicRuntimeContext.getSystemRuntime().serialize(objParam), null));
		dataSyncOut.setCreateDate(new java.sql.Timestamp(System.currentTimeMillis()));
		
		iSysDataSyncAgentRuntime.send(new DataSyncOut[] {dataSyncOut});
		
//		dataSyncOut.setEventType(nEvent);
//		Object objKey = null;
//		Object objSendData = null;
//		if(objData instanceof IEntityBase) {
//			objKey = this.getDataEntityRuntime().getFieldValue((IEntityBase)objData, this.getDataEntityRuntime().getKeyPSDEField());
//			//后续要判断是否需要附加租户标识（实体启用SaaS模式）
//			objSendData = this.getDataEntityRuntime().serializeEntity((IEntityBase)objData);
//		}
//		else {
//			objKey = objData;
//		}
//		dataSyncOut.setDataKey(DataTypeUtils.getStringValue(objKey, null));
//		dataSyncOut.setData(DataTypeUtils.getStringValue(objSendData, null));
//		dataSyncOut.setDEId(this.getDataEntityRuntime().getId());
//		dataSyncOut.setDEName(this.getDataEntityRuntime().getName());
//		dataSyncOut.setCreateDate(new java.sql.Timestamp(System.currentTimeMillis()));
		
//		iSysDataSyncAgentRuntime.send(dataSyncOuts);
//		
//		IAppContext iAppContext = iDELogicSession.getAppContext();
//		ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = iSubSysServiceAPIRuntime.getSubSysServiceAPIDERuntime(iPSDESubSysSAMethodLogic.getPSSubSysServiceAPIDEMust().getId(), false);
//		
//		Object objRet = iSubSysServiceAPIDERuntime.invokeMethod(iPSDESubSysSAMethodLogic.getPSSubSysServiceAPIDEMethodMust(), (iAppContext == null)?null:iAppContext.any(), new Object[] {objParam});
//		
//		iDELogicSession.setLastReturn(objRet);
//		
//		if(iPSDESubSysSAMethodLogic.getRetPSDELogicParam() != null) {
//			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESubSysSAMethodLogic.getRetPSDELogicParam().getCodeName(), false);
//			retDELogicParamRuntime.bind(iDELogicSession, objRet);
//		}
	}
	
}
