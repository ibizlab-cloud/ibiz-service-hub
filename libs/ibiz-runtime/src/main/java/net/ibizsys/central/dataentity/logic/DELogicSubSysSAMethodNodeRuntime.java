package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESubSysSAMethodLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IAppContext;

/**
 * 实体调用外部服务接口节点运行时对象
 * @author lionlau
 *
 */
public class DELogicSubSysSAMethodNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESubSysSAMethodLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESubSysSAMethodLogic iPSDESubSysSAMethodLogic = (IPSDESubSysSAMethodLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESubSysSAMethodLogic.getDstPSDELogicParamMust().getCodeName(), false).getParamObject(iDELogicSession);
		ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = iDELogicRuntimeContext.getSystemRuntime().getSubSysServiceAPIRuntime(iPSDESubSysSAMethodLogic.getPSSubSysServiceAPIMust().getId(), false);
		
		
		IAppContext iAppContext = iDELogicSession.getAppContext();
		ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = iSubSysServiceAPIRuntime.getSubSysServiceAPIDERuntime(iPSDESubSysSAMethodLogic.getPSSubSysServiceAPIDEMust().getId(), false);
		
		Object objRet = iSubSysServiceAPIDERuntime.invokeMethod(iPSDESubSysSAMethodLogic.getPSSubSysServiceAPIDEMethodMust(), (iAppContext == null)?null:iAppContext.any(), new Object[] {objParam});
		
		iDELogicSession.setLastReturn(objRet);
		
		if(iPSDESubSysSAMethodLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESubSysSAMethodLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}
	
}
