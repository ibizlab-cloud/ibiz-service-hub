package net.ibizsys.model.util.transpiler.dataentity.wizard;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.wizard.PSDEWizardStepImpl.*;



public class PSDEWizardStepTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.wizard.PSDEWizardStepImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.wizard.PSDEWizardStepImpl realPSModelObject = (net.ibizsys.model.dataentity.wizard.PSDEWizardStepImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "steptag", realPSModelObject.getStepTag(), realPSModelObject, "getStepTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "subtitle", realPSModelObject.getSubTitle(), realPSModelObject, "getSubTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "subtitlepslanresid", realPSModelObject.getSubTitlePSLanguageRes(), realPSModelObject, "getSubTitlePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdewizardstepname", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "lnpslanresid", realPSModelObject.getTitlePSLanguageRes(), realPSModelObject, "getTitlePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getTitlePSSysCss(), realPSModelObject, "getTitlePSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablelink", realPSModelObject.isEnableLink(), realPSModelObject, "isEnableLink");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTEPTAG, domain, "steptag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBTITLE, domain, "subtitle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBTITLEPSLANGUAGERES, domain, "subtitlepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "psdewizardstepname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEPSLANGUAGERES, domain, "lnpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLELINK, domain, "enablelink", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}