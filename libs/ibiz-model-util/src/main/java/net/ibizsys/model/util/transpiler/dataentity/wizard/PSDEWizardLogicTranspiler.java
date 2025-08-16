package net.ibizsys.model.util.transpiler.dataentity.wizard;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.wizard.PSDEWizardLogicImpl.*;



public class PSDEWizardLogicTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.wizard.PSDEWizardLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.wizard.PSDEWizardLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.wizard.PSDEWizardLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "attrname", realPSModelObject.getAttrName(), realPSModelObject, "getAttrName");
		this.setDomainValue(iPSModelTranspileContext, domain, "eventarg", realPSModelObject.getEventArg(), realPSModelObject, "getEventArg");
		this.setDomainValue(iPSModelTranspileContext, domain, "eventarg2", realPSModelObject.getEventArg2(), realPSModelObject, "getEventArg2");
		this.setDomainValue(iPSModelTranspileContext, domain, "eventnames", realPSModelObject.getEventNames(), realPSModelObject, "getEventNames");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicparam", realPSModelObject.getLogicTag(), realPSModelObject, "getLogicTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicparam2", realPSModelObject.getLogicTag2(), realPSModelObject, "getLogicTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstlogictype", realPSModelObject.getLogicType(), realPSModelObject, "getLogicType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicid", realPSModelObject.getPSAppDEUILogic(), realPSModelObject, "getPSAppDEUILogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysviewlogicid", realPSModelObject.getPSAppUILogic(), realPSModelObject, "getPSAppUILogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdewizardformid", realPSModelObject.getPSDEWizardFormId(), realPSModelObject, "getPSDEWizardFormId");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdewizardformname", realPSModelObject.getPSDEWizardFormName(), realPSModelObject, "getPSDEWizardFormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "formtag", realPSModelObject.getPSDEWizardFormTag(), realPSModelObject, "getPSDEWizardFormTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdewizardstepid", realPSModelObject.getPSDEWizardStepId(), realPSModelObject, "getPSDEWizardStepId");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdewizardstepname", realPSModelObject.getPSDEWizardStepName(), realPSModelObject, "getPSDEWizardStepName");
		this.setDomainValue(iPSModelTranspileContext, domain, "steptag", realPSModelObject.getPSDEWizardStepTag(), realPSModelObject, "getPSDEWizardStepTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "triggertype", realPSModelObject.getTriggerType(), realPSModelObject, "getTriggerType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETATTRNAME, domain, "attrname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTARG, domain, "eventarg", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTARG2, domain, "eventarg2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTNAMES, domain, "eventnames", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG, domain, "logicparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG2, domain, "logicparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTYPE, domain, "dstlogictype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEUILOGIC, domain, "psdelogicid", net.ibizsys.model.app.dataentity.IPSAppDEUILogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPUILOGIC, domain, "pssysviewlogicid", net.ibizsys.model.app.logic.IPSAppUILogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWIZARDFORMID, domain, "psdewizardformid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWIZARDFORMNAME, domain, "psdewizardformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWIZARDFORMTAG, domain, "formtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWIZARDSTEPID, domain, "psdewizardstepid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWIZARDSTEPNAME, domain, "psdewizardstepname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWIZARDSTEPTAG, domain, "steptag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRIGGERTYPE, domain, "triggertype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}