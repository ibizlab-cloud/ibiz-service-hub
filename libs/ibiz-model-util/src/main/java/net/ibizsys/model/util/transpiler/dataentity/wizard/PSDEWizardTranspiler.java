package net.ibizsys.model.util.transpiler.dataentity.wizard;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.wizard.PSDEWizardImpl.*;



public class PSDEWizardTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.wizard.PSDEWizardImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.wizard.PSDEWizardImpl realPSModelObject = (net.ibizsys.model.dataentity.wizard.PSDEWizardImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "finishpslanresid", realPSModelObject.getFinishCapPSLanguageRes(), realPSModelObject, "getFinishCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "finishcaption", realPSModelObject.getFinishCaption(), realPSModelObject, "getFinishCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "nextpslanresid", realPSModelObject.getNextCapPSLanguageRes(), realPSModelObject, "getNextCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "nextcaption", realPSModelObject.getNextCaption(), realPSModelObject, "getNextCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "prevpslanresid", realPSModelObject.getPrevCapPSLanguageRes(), realPSModelObject, "getPrevCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "prevcaption", realPSModelObject.getPrevCaption(), realPSModelObject, "getPrevCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "wizardstyle", realPSModelObject.getWizardStyle(), realPSModelObject, "getWizardStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "statewizardflag", realPSModelObject.isStateWizard(), realPSModelObject, "isStateWizard");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFINISHCAPPSLANGUAGERES, domain, "finishpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFINISHCAPTION, domain, "finishcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNEXTCAPPSLANGUAGERES, domain, "nextpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNEXTCAPTION, domain, "nextcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREVCAPPSLANGUAGERES, domain, "prevpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREVCAPTION, domain, "prevcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIZARDSTYLE, domain, "wizardstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSTATEWIZARD, domain, "statewizardflag", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}