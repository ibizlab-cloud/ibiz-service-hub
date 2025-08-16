package net.ibizsys.model.util.transpiler.app.valuerule;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.valuerule.PSAppValueRuleImpl.*;



public class PSAppValueRuleTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.valuerule.PSAppValueRuleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.valuerule.PSAppValueRuleImpl realPSModelObject = (net.ibizsys.model.app.valuerule.PSAppValueRuleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "regexpcode", realPSModelObject.getRegExCode(), realPSModelObject, "getRegExCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "regexpcode2", realPSModelObject.getRegExCode2(), realPSModelObject, "getRegExCode2");
		this.setDomainValue(iPSModelTranspileContext, domain, "regexpcode3", realPSModelObject.getRegExCode3(), realPSModelObject, "getRegExCode3");
		this.setDomainValue(iPSModelTranspileContext, domain, "regexpcode4", realPSModelObject.getRegExCode4(), realPSModelObject, "getRegExCode4");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruleinfo", realPSModelObject.getRuleInfo(), realPSModelObject, "getRuleInfo");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruletag", realPSModelObject.getRuleTag(), realPSModelObject, "getRuleTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruletag2", realPSModelObject.getRuleTag2(), realPSModelObject, "getRuleTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruletype", realPSModelObject.getRuleType(), realPSModelObject, "getRuleType");
		this.setDomainValue(iPSModelTranspileContext, domain, "script", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREGEXCODE, domain, "regexpcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREGEXCODE2, domain, "regexpcode2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREGEXCODE3, domain, "regexpcode3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREGEXCODE4, domain, "regexpcode4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULEINFO, domain, "ruleinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULETAG, domain, "ruletag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULETAG2, domain, "ruletag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULETYPE, domain, "ruletype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "script", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}