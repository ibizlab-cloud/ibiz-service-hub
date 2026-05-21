package net.ibizsys.central.dataentity.logic;

import java.util.LinkedHashMap;

import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESysMsgTemplLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体逻辑调用系统消息模板运行时对象
 * @author lionlau
 *
 */
public class DELogicSysMsgTemplNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESysMsgTemplLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESysMsgTemplLogic iPSDESysLogicLogic = (IPSDESysMsgTemplLogic)iPSDELogicNode;
		ISysMsgTemplRuntime iSysMsgTemplRuntime = (ISysMsgTemplRuntime)iDELogicRuntimeContext.getSystemRuntime().getSysMsgTemplRuntime(iPSDESysLogicLogic.getPSSysMsgTemplMust());
		
		
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysLogicLogic.getDstPSDELogicParamMust().getCodeName(), false).getReal(iDELogicSession);
		if(objParam instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO)objParam;
			if(iEntityDTO.getDEMethodDTORuntime() != null) {
				iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().fillEntityCodeListTexts(iEntityDTO, "_text");
			}
			
			
		}
		Object objRet = iSysMsgTemplRuntime.getContent(objParam, new LinkedHashMap<String, Object>());
		
		iDELogicSession.setLastReturn(objRet);
		if(iPSDESysLogicLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysLogicLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}
	
}
