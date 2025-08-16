package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.res.ISysLogicRuntime;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESysLogicLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体逻辑调用系统预置逻辑节点运行时对象
 * @author lionlau
 *
 */
public class DELogicSysLogicNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESysLogicLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESysLogicLogic iPSDESysLogicLogic = (IPSDESysLogicLogic)iPSDELogicNode;
		
		net.ibizsys.runtime.res.ISysLogicRuntime iSysLogicRuntime = null;
		if(iDELogicRuntimeContext.getDynaInstRuntime()!=null) {
			iSysLogicRuntime = iDELogicRuntimeContext.getDynaInstRuntime().getSysLogicRuntime(iPSDESysLogicLogic.getPSSysLogicMust());
		}
		else {
			iSysLogicRuntime = iDELogicRuntimeContext.getSystemRuntime().getSysLogicRuntime(iPSDESysLogicLogic.getPSSysLogicMust());
		}
		
		ISysLogicRuntime iSysLogicRuntime2 = null;
		if(iSysLogicRuntime instanceof ISysLogicRuntime ) {
			iSysLogicRuntime2 = (ISysLogicRuntime)iSysLogicRuntime;
		}
		if(iSysLogicRuntime2 == null) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime() ,iDELogicRuntimeContext.getDELogicRuntime(), String.format("逻辑节点[%1$s]引用的系统预置逻辑处理[%2$s]类型不正确", iPSDELogicNode.getName(), iSysLogicRuntime.getName()));
		}
		
		IEntity dstEntity = null;
		if(iPSDESysLogicLogic.getDstPSDELogicParam() != null) {
			dstEntity = iDELogicSession.getParam(iPSDESysLogicLogic.getDstPSDELogicParamMust().getCodeName());
		}
		Object objRet = null;
		if(dstEntity == null) {
			objRet = iSysLogicRuntime2.execute(null, iPSDESysLogicLogic.getLogicParam(), iPSDESysLogicLogic.getLogicParam2());
		}
		else {
			objRet = iSysLogicRuntime2.execute(new Object[] {dstEntity}, iPSDESysLogicLogic.getLogicParam(), iPSDESysLogicLogic.getLogicParam2());
		}
		iDELogicSession.setLastReturn(objRet);
		
		if(iPSDESysLogicLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysLogicLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}
	
}
