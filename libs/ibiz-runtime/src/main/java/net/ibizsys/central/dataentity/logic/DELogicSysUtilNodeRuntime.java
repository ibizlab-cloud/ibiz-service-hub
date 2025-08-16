package net.ibizsys.central.dataentity.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.model.dataentity.logic.IPSDESysUtilLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体逻辑调用系统预置功能组件运行时对象
 * @author lionlau
 *
 */
public class DELogicSysUtilNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESysUtilLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESysUtilLogic iPSDESysLogicLogic = (IPSDESysUtilLogic)iPSDELogicNode;
		ISysUtilRuntime iSysUtilRuntime = iDELogicRuntimeContext.getSystemRuntime().getSysUtilRuntime(iPSDESysLogicLogic.getPSSysUtilMust());
		
		String strUtilAction = iPSDESysLogicLogic.getUtilAction();
		if(StringUtils.hasLength(strUtilAction) && strUtilAction.indexOf("/") == 0) {
			//准备调用参数
			Map<String, Object> urlParamMap = null;
			List<IPSDELogicNodeParam> psDELogicNodeParamList = iPSDESysLogicLogic.getPSDELogicNodeParams();
			if(psDELogicNodeParamList != null) {
				urlParamMap = new HashMap<>();
				for(IPSDELogicNodeParam iPSDELogicNodeParam : psDELogicNodeParamList) {
					if(DELogicNodeParamTypes.WEBURIPARAM.equals(iPSDELogicNodeParam.getParamAction())) {
						urlParamMap.put(iPSDELogicNodeParam.getDstFieldName(), this.calcDELogicNodeParamValue(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam));
						continue;
					}
				}
			}
		}
		
		Object objParam = null;
		Object objRet = null;
		if(iPSDESysLogicLogic.getDstPSDELogicParam() != null) {
			objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysLogicLogic.getDstPSDELogicParamMust().getCodeName(), false).getReal(iDELogicSession);
			objRet = iSysUtilRuntime.executeAction(strUtilAction, new Object[] {objParam});
		}
		else {
			objRet = iSysUtilRuntime.executeAction(strUtilAction, null);
		}
		
		iDELogicSession.setLastReturn(objRet);
		if(iPSDESysLogicLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysLogicLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}
	
}
