package net.ibizsys.model.util.transpiler.dataentity.dr;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dr.PSDEDataRelationImpl.*;



public class PSDEDataRelationTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dr.PSDEDataRelationImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dr.PSDEDataRelationImpl realPSModelObject = (net.ibizsys.model.dataentity.dr.PSDEDataRelationImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "formcappslanresid", realPSModelObject.getFormCapPSLanguageRes(), realPSModelObject, "getFormCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "formcaption", realPSModelObject.getFormCaption(), realPSModelObject, "getFormCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "formpssysimageid", realPSModelObject.getFormPSSysImage(), realPSModelObject, "getFormPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscounterid", realPSModelObject.getPSSysCounter(), realPSModelObject, "getPSSysCounter");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecustomized", realPSModelObject.isEnableCustomized(), realPSModelObject, "isEnableCustomized");
		this.setDomainValue(iPSModelTranspileContext, domain, "hideedititem", realPSModelObject.isHideEditItem(), realPSModelObject, "isHideEditItem");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMCAPPSLANGUAGERES, domain, "formcappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMCAPTION, domain, "formcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMPSSYSIMAGE, domain, "formpssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCOUNTER, domain, "pssyscounterid", net.ibizsys.model.control.counter.IPSSysCounter.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECUSTOMIZED, domain, "enablecustomized", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISHIDEEDITITEM, domain, "hideedititem", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}