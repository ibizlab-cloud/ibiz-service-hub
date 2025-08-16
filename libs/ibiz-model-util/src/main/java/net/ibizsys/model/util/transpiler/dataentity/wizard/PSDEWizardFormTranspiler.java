package net.ibizsys.model.util.transpiler.dataentity.wizard;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.wizard.PSDEWizardFormImpl.*;



public class PSDEWizardFormTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.wizard.PSDEWizardFormImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.wizard.PSDEWizardFormImpl realPSModelObject = (net.ibizsys.model.dataentity.wizard.PSDEWizardFormImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cmpslanresid2", realPSModelObject.getCM2PSLanguageRes(), realPSModelObject, "getCM2PSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "cmpslanresid", realPSModelObject.getCMPSLanguageRes(), realPSModelObject, "getCMPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "confirminfo", realPSModelObject.getConfirmMsg(), realPSModelObject, "getConfirmMsg");
		this.setDomainValue(iPSModelTranspileContext, domain, "confirminfo2", realPSModelObject.getConfirmMsg2(), realPSModelObject, "getConfirmMsg2");
		this.setDomainValue(iPSModelTranspileContext, domain, "formtag", realPSModelObject.getFormTag(), realPSModelObject, "getFormTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "finishenablelogic", realPSModelObject.getGoFinishEnableScriptCode(), realPSModelObject, "getGoFinishEnableScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "nextenablelogic", realPSModelObject.getGoNextEnableScriptCode(), realPSModelObject, "getGoNextEnableScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "prevenablelogic", realPSModelObject.getGoPrevEnableScriptCode(), realPSModelObject, "getGoPrevEnableScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeformname", realPSModelObject.getPSDEFormName(), realPSModelObject, "getPSDEFormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdewizardstepid", realPSModelObject.getPSDEWizardStep(), realPSModelObject, "getPSDEWizardStep");
		this.setDomainListValue(iPSModelTranspileContext, domain, "stepactions", realPSModelObject.getStepActions(), realPSModelObject, "getStepActions", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "firstform", realPSModelObject.isFirstForm(), realPSModelObject, "isFirstForm");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCM2PSLANGUAGERES, domain, "cmpslanresid2", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCMPSLANGUAGERES, domain, "cmpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONFIRMMSG, domain, "confirminfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONFIRMMSG2, domain, "confirminfo2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMTAG, domain, "formtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGOFINISHENABLESCRIPTCODE, domain, "finishenablelogic", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGONEXTENABLESCRIPTCODE, domain, "nextenablelogic", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGOPREVENABLESCRIPTCODE, domain, "prevenablelogic", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFORMNAME, domain, "psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWIZARDSTEP, domain, "psdewizardstepid", net.ibizsys.model.dataentity.wizard.IPSDEWizardStep.class, false);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETSTEPACTIONS, domain, "stepactions", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISFIRSTFORM, domain, "firstform", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}