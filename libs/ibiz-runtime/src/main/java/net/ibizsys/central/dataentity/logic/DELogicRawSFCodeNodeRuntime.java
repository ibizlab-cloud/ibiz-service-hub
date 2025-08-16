package net.ibizsys.central.dataentity.logic;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDERawCodeLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体逻辑直接后台代码
 * @author lionlau
 *
 */
public class DELogicRawSFCodeNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDERawCodeLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDERawCodeLogic iPSDERawCodeLogic = (IPSDERawCodeLogic)iPSDELogicNode;
		//IDELogicScriptNodeRuntime iDELogicScriptNodeRuntime = this.getDEScriptLogicRuntime(iDELogicRuntimeContext, iPSDERawCodeLogic.getCode(), IDELogicScriptNodeRuntime.MODE_CODE, false);
		IDELogicScriptNodeRuntime iDELogicScriptNodeRuntime = iDELogicRuntimeContext.getDEScriptLogicRuntime(iPSDELogicNode, iPSDERawCodeLogic.getCode(), IDELogicScriptNodeRuntime.MODE_CODE, false);
		Object objRet = iDELogicScriptNodeRuntime.execute(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNode);
		iDELogicSession.setLastReturn(objRet);
		
		if(iPSDERawCodeLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDERawCodeLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}
	
}
