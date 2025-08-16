package net.ibizsys.model.util.transpiler.dataentity.defield.valuerule;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSysValueRuleConditionImpl.*;



public class PSDEFVRSysValueRuleConditionTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.valuerule.PSDEFVRSingleConditionTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSysValueRuleConditionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSysValueRuleConditionImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSysValueRuleConditionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysvalueruleid", realPSModelObject.getPSSysValueRule(), realPSModelObject, "getPSSysValueRule");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruleinfo", realPSModelObject.getRuleInfo(), realPSModelObject, "getRuleInfo");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSVALUERULE, domain, "pssysvalueruleid", net.ibizsys.model.valuerule.IPSSysValueRule.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULEINFO, domain, "ruleinfo", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}