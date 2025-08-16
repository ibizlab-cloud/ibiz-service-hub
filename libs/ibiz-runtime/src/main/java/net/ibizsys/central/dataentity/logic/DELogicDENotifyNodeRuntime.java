package net.ibizsys.central.dataentity.logic;

import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.model.dataentity.logic.IPSDEDENotifyLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体调用实体通知节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDENotifyNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDENotifyLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDENotifyLogic iPSDEDENotifyLogic = (IPSDEDENotifyLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDENotifyLogic.getDstPSDELogicParamMust().getCodeName(), false).getParamObject(iDELogicSession);
		if(!(objParam instanceof IEntityBase)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]传入参数[%2$s]类型不正确，必须为数据对象", iPSDELogicNode.getName(), iPSDEDENotifyLogic.getDstPSDELogicParamMust().getCodeName()));
		}
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("通知参数[%1$s] ==> %2$s", iPSDEDENotifyLogic.getDstPSDELogicParamMust().getCodeName(), objParam));
		}
		
		IPSDENotify dstPSDENotify = iPSDEDENotifyLogic.getDstPSDENotifyMust();
		
		IDataEntityRuntimeBase dstDataEntityRuntimeBase = null;
		if(iDELogicRuntimeContext.getDynaInstRuntime()!=null) {
			dstDataEntityRuntimeBase = iDELogicRuntimeContext.getDynaInstRuntime().getDynaInstDataEntityRuntime(iPSDEDENotifyLogic.getDstPSDataEntity().getId());
		}
		if(dstDataEntityRuntimeBase == null) {
			dstDataEntityRuntimeBase = iDELogicRuntimeContext.getSystemRuntime().getDataEntityRuntime(iPSDEDENotifyLogic.getDstPSDataEntity().getId(), false);
		}
		
		IDENotifyRuntime dstDENotifyRuntime = dstDataEntityRuntimeBase.getDENotifyRuntime(dstPSDENotify);
		if(dstDENotifyRuntime instanceof net.ibizsys.central.dataentity.notify.IDENotifyRuntime) {
			Map<String, Object> notifyParams = new LinkedHashMap<String, Object>();
			if(iPSDEDENotifyLogic.getDstPSDELogicParamMust().isDefault()) {
				notifyParams.put(ISysMsgTemplRuntime.TEMPLPARAM_LAST, ((IDataEntityRuntime)dstDataEntityRuntimeBase).getLastEntity());
			}
			((net.ibizsys.central.dataentity.notify.IDENotifyRuntime)dstDENotifyRuntime).send((IEntity)objParam, notifyParams);
		}
		else {
			dstDENotifyRuntime.send((IEntityBase)objParam);
		}
		
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("调用通知[%1$s]", dstPSDENotify.getName()));
		}
		
		iDELogicSession.setLastReturn(null);
		
	}
	
}
