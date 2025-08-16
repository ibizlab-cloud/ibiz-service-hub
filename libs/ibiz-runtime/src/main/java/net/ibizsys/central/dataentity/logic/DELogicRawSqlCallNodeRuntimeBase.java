package net.ibizsys.central.dataentity.logic;

import java.util.ArrayList;
import java.util.List;

import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;

/**
 * 直接SQL调用节点运行时基类
 * @author lionlau
 *
 */
public abstract class DELogicRawSqlCallNodeRuntimeBase extends DELogicNodeRuntimeBase{

	/**
	 * 获取Sql参数列表
	 * @param iDELogicRuntimeContext
	 * @param iDELogicSession
	 * @param iPSDELogicNode
	 * @return
	 * @throws Throwable
	 */
	protected List<Object> getSqlParamList(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
		java.util.List<IPSDELogicNodeParam> psDELogicNodeParamList = iPSDELogicNode.getPSDELogicNodeParams();
		if(psDELogicNodeParamList == null || psDELogicNodeParamList.size() == 0) {
			return null;
		}
		List<Object> list = new ArrayList<Object>();
		for(IPSDELogicNodeParam iPSDELogicNodeParam : psDELogicNodeParamList) {
			String strParamAction = iPSDELogicNodeParam.getParamAction();
			if(DELogicNodeParamTypes.SQLPARAM.equals(strParamAction)) {
				list.add(this.calcDELogicNodeParamValue(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam));
				
//				
//				if(DELogicPrepareParamValueTypes.SRCDLPARAM.equals(iPSDELogicNodeParam.getSrcValueType())) {
//					if(StringUtils.isEmpty(iPSDELogicNodeParam.getSrcFieldName())) {
//						throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]未指定源属性名称", iPSDELogicNodeParam.getName()));
//					}
//					IEntity srcEntity = iDELogicSession.getParam(iPSDELogicNodeParam.getSrcPSDELogicParamMust().getCodeName());
//					list.add(srcEntity.get(iPSDELogicNodeParam.getSrcFieldName().toLowerCase()));
//					continue;
//				}
//				
//				if(DELogicPrepareParamValueTypes.NULLVALUE.equals(iPSDELogicNodeParam.getSrcValueType())) {			
//					list.add(null);
//					continue;
//				}
//
//				if(DELogicPrepareParamValueTypes.SRCVALUE.equals(iPSDELogicNodeParam.getSrcValueType())) {			
//					list.add(iPSDELogicNodeParam.getSrcValue());
//					continue;
//				}
//				
//				
//				
//				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点参数[%1$s]源值类型[%2$s]未支持", iPSDELogicNodeParam.getName(), iPSDELogicNodeParam.getSrcValueType()));
			}
		}
		
		return list;
	}
	
}
