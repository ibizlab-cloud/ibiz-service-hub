package net.ibizsys.model.util.transpiler.dataentity.defield.valuerule;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.valuerule.PSDEFValueRuleImpl.*;



public class PSDEFValueRuleTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.valuerule.PSDEFValueRuleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.valuerule.PSDEFValueRuleImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.valuerule.PSDEFValueRuleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "ruleinfo", realPSModelObject.getRuleInfo(), realPSModelObject, "getRuleInfo");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruletag", realPSModelObject.getRuleTag(), realPSModelObject, "getRuleTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruletag2", realPSModelObject.getRuleTag2(), realPSModelObject, "getRuleTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "checkdefault", realPSModelObject.isCheckDefault(), realPSModelObject, "isCheckDefault");
		this.setDomainValue(iPSModelTranspileContext, domain, "custommode", realPSModelObject.isCustomCode(), realPSModelObject, "isCustomCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultmode", realPSModelObject.isDefaultMode(), realPSModelObject, "isDefaultMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruleholder", realPSModelObject.isEnableBackend(), realPSModelObject, "isEnableBackend");
		this.setDomainValue(iPSModelTranspileContext, domain, "ruleholder", realPSModelObject.isEnableFront(), realPSModelObject, "isEnableFront");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULEINFO, domain, "ruleinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULETAG, domain, "ruletag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRULETAG2, domain, "ruletag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCHECKDEFAULT, domain, "checkdefault", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCUSTOMCODE, domain, "custommode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODE, domain, "defaultmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEBACKEND, domain, "ruleholder", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEFRONT, domain, "ruleholder", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}