package net.ibizsys.central.dataentity.logic;

import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDEThrowExceptionLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体逻辑抛出异常节点运行时
 * @author lionlau
 *
 */
public class DELogicThrowExceptionNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEThrowExceptionLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEThrowExceptionLogic iPSDEThrowExceptionLogic = (IPSDEThrowExceptionLogic)iPSDELogicNode;
		String strInfo = iPSDEThrowExceptionLogic.getErrorInfo();
		if(iPSDEThrowExceptionLogic.getExceptionParam() != null) {
			Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEThrowExceptionLogic.getExceptionParam().getCodeName(), false).getReal(iDELogicSession);
			Map map = null;
			if(objParam instanceof IEntity) {
				map = ((IEntity)objParam).any();
			}
			else
				if(objParam instanceof Map) {
					map = (Map)objParam;
				}
				
			if(map != null) {
				StrSubstitutor sub = new StrSubstitutor(map);
				sub.setVariablePrefix("{");
				sub.setVariableSuffix("}");
				strInfo = sub.replace(strInfo);
			}
		}
		
		
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), strInfo, iPSDEThrowExceptionLogic.getErrorCode());
	}
	
}