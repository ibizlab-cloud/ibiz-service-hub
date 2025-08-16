package net.ibizsys.model.util.merger.dataentity.defield.valuerule;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSDEFVRConditionListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("condType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "GROUP":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRGroupConditionImpl.class, false);
			case "QUERYCOUNT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRQueryCountConditionImpl.class, false);
			case "REGEX":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRRegExConditionImpl.class, false);
			case "SIMPLE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSimpleConditionImpl.class, false);
			case "STRINGLENGTH":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRStringLengthConditionImpl.class, false);
			case "SYSVALUERULE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSysValueRuleConditionImpl.class, false);
			case "VALUERANGE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRangeConditionImpl.class, false);
			case "VALUERANGE2":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange2ConditionImpl.class, false);
			case "VALUERANGE3":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange3ConditionImpl.class, false);
			case "VALUERECURSION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRecursionConditionImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
}