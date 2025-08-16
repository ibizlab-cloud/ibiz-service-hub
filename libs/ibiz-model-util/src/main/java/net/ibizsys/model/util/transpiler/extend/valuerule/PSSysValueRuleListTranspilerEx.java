package net.ibizsys.model.util.transpiler.extend.valuerule;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.valuerule.PSSysValueRuleImpl;

public class PSSysValueRuleListTranspilerEx extends net.ibizsys.model.util.transpiler.valuerule.PSSysValueRuleListTranspiler{
	
	/**
	 * 获取应用值规则模型节点
	 * @param iPSModelTranspileContext
	 * @param strPSSysValueRuleId
	 * @return
	 * @throws Exception
	 */
	public static ObjectNode getPSAppValueRuleModel(IPSModelTranspileContext iPSModelTranspileContext, String strPSSysValueRuleId) throws Exception {
		//循环系统
		String strUniqueTag = strPSSysValueRuleId.replace(".","__");
		if(!ObjectUtils.isEmpty(iPSModelTranspileContext.getPSSystem().getAllPSSysValueRules())) {
			for(IPSSysValueRule iPSSysValueRule : iPSModelTranspileContext.getPSSystem().getAllPSSysValueRules()) {
				if(strUniqueTag.equalsIgnoreCase(iPSSysValueRule.getUniqueTag())) {
					ObjectNode objectNode = iPSSysValueRule.getObjectNode().deepCopy();
					objectNode.remove(PSSysValueRuleImpl.ATTR_GETPSSYSTEMMODULE);
					objectNode.remove(PSSysValueRuleImpl.ATTR_ISENABLEBACKEND);
					objectNode.remove(PSSysValueRuleImpl.ATTR_GETCODENAME);
					//调整代码标识
					objectNode.put(PSSysValueRuleImpl.ATTR_GETCODENAME, iPSSysValueRule.getUniqueTag());
					return objectNode;
				}
			}
		}
		throw new Exception(String.format("无法获取指定应用值规则[%1$s]", strPSSysValueRuleId));
	}
	
	@Override
	protected void onGetModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception {
		if(childMode) {
			
			IPSSysValueRule iPSSysValueRule = getPSModelObject(iPSModelTranspileContext, IPSSysValueRule.class ,iPSModelTranspileContext.getPSSystem().getAllPSSysValueRules() ,fullId, false);
			ObjectNode objectNode2 = iPSSysValueRule.getObjectNode().deepCopy();
			objectNode.setAll(objectNode2);
			
			return;
		}
		super.onGetModelRef(iPSModelTranspileContext, fullId, childMode, objectNode);
	}
}