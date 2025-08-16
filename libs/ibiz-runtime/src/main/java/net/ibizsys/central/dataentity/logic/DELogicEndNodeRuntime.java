package net.ibizsys.central.dataentity.logic;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.logic.IPSDEEndLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;

/**
 * 实体结束节点运行时对象
 * @author lionlau
 *
 */
public class DELogicEndNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEEndLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEEndLogic iPSDEEndLogic = (IPSDEEndLogic)iPSDELogicNode;
		String strReturnType = iPSDEEndLogic.getReturnType();
		if(!StringUtils.hasLength(strReturnType)
				|| DELogicReturnTypes.NONEVALUE.equals(strReturnType)
				|| DELogicReturnTypes.NULLVALUE.equals(strReturnType)) {
			iDELogicSession.setResult(null);
			return;
		}
		
		if(DELogicReturnTypes.SRCVALUE.equals(strReturnType)) {
			if(iPSDEEndLogic.getRawValueStdDataType() == DataTypes.UNKNOWN) {
				iDELogicSession.setResult(iPSDEEndLogic.getRawValue());
			}
			else {
				iDELogicSession.setResult(DataTypeUtils.parse(iPSDEEndLogic.getRawValueStdDataType(), iPSDEEndLogic.getRawValue()));
			}
			
			return;
		}
				
		if(DELogicReturnTypes.BREAK.equals(strReturnType)) {
			iDELogicSession.setResult(DELogicReturnTypes.BREAK_VALUE);
			return;
		}		
		
		if(DELogicReturnTypes.LOGICPARAM.equals(strReturnType)
				|| DELogicReturnTypes.LOGICPARAMFIELD.equals(strReturnType)) {
			IDELogicParamRuntime iDELogicParamRuntime= iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEEndLogic.getReturnParamMust().getCodeName(), false);
			if(DELogicReturnTypes.LOGICPARAM.equals(strReturnType)) {
				iDELogicSession.setResult(iDELogicParamRuntime.getParamObject(iDELogicSession));
			}
			else {
				iDELogicSession.setResult(iDELogicParamRuntime.get(iDELogicSession, iPSDEEndLogic.getDstFieldName()));
			}
			return;
		}
		
		throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]无法识别的返回值类型[%2$s]", iPSDELogicNode.getName(), strReturnType));
		
	}
	
}
