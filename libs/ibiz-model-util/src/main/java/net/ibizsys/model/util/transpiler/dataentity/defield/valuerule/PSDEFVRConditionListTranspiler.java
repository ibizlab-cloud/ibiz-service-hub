package net.ibizsys.model.util.transpiler.dataentity.defield.valuerule;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEFVRConditionListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDEFVRCond createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDEFVRCond();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "GROUP":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRGroupConditionImpl.class, false);
			case "QUERYCOUNT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRQueryCountConditionImpl.class, false);
			case "REGEX":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRRegExConditionImpl.class, false);
			case "SIMPLE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSimpleConditionImpl.class, false);
			case "STRINGLENGTH":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRStringLengthConditionImpl.class, false);
			case "SYSVALUERULE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSysValueRuleConditionImpl.class, false);
			case "VALUERANGE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRangeConditionImpl.class, false);
			case "VALUERANGE2":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange2ConditionImpl.class, false);
			case "VALUERANGE3":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange3ConditionImpl.class, false);
			case "VALUERECURSION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRecursionConditionImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition iPSDEFVRCondition = (net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition)iPSModelObject;
		Object type = iPSDEFVRCondition.getCondType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("condtype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}