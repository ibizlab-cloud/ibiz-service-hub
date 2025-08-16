package net.ibizsys.model.util.transpiler.valuerule;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.valuerule.PSSysValueRuleImpl.*;



public class PSSysValueRuleTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.valuerule.PSSysValueRuleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.valuerule.PSSysValueRuleImpl realPSModelObject = (net.ibizsys.model.valuerule.PSSysValueRuleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "customobj", realPSModelObject.getCustomObject(), realPSModelObject, "getCustomObject");
		this.setDomainValue(iPSModelTranspileContext, domain, "customparams", realPSModelObject.getCustomParams(), realPSModelObject, "getCustomParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "regexpcode", realPSModelObject.getRegExCode(), realPSModelObject, "getRegExCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "regexpcode2", realPSModelObject.getRegExCode2(), realPSModelObject, "getRegExCode2");
		this.setDomainValue(iPSModelTranspileContext, domain, "regexpcode3", realPSModelObject.getRegExCode3(), realPSModelObject, "getRegExCode3");
		this.setDomainValue(iPSModelTranspileContext, domain, "regexpcode4", realPSModelObject.getRegExCode4(), realPSModelObject, "getRegExCode4");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruleinfo", realPSModelObject.getRuleInfo(), realPSModelObject, "getRuleInfo");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruletag", realPSModelObject.getRuleTag(), realPSModelObject, "getRuleTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruletag2", realPSModelObject.getRuleTag2(), realPSModelObject, "getRuleTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruletype", realPSModelObject.getRuleType(), realPSModelObject, "getRuleType");
		this.setDomainValue(iPSModelTranspileContext, domain, "script", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruleholder", realPSModelObject.isEnableBackend(), realPSModelObject, "isEnableBackend");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruleholder", realPSModelObject.isEnableFront(), realPSModelObject, "isEnableFront");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMOBJECT, domain, "customobj", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMPARAMS, domain, "customparams", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREGEXCODE, domain, "regexpcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREGEXCODE2, domain, "regexpcode2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREGEXCODE3, domain, "regexpcode3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREGEXCODE4, domain, "regexpcode4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULEINFO, domain, "ruleinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULETAG, domain, "ruletag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULETAG2, domain, "ruletag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULETYPE, domain, "ruletype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "script", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEBACKEND, domain, "ruleholder", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEFRONT, domain, "ruleholder", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}