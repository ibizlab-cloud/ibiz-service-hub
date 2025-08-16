package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSSysTranslatorImpl.*;



public class PSSysTranslatorTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSSysTranslatorImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSSysTranslatorImpl realPSModelObject = (net.ibizsys.model.res.PSSysTranslatorImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "keypsdefid", realPSModelObject.getKeyPSDEField(), realPSModelObject, "getKeyPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSCodeList(), realPSModelObject, "getPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "translatorparams", realPSModelObject.getTranslatorParams(), realPSModelObject, "getTranslatorParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "translatortag", realPSModelObject.getTranslatorTag(), realPSModelObject, "getTranslatorTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "translatortag2", realPSModelObject.getTranslatorTag2(), realPSModelObject, "getTranslatorTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "translatortype", realPSModelObject.getTranslatorType(), realPSModelObject, "getTranslatorType");
		this.setDomainValue(iPSModelTranspileContext, domain, "user2psdefid", realPSModelObject.getUser2PSDEField(), realPSModelObject, "getUser2PSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "userpsdefid", realPSModelObject.getUserPSDEField(), realPSModelObject, "getUserPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "valuepsdefid", realPSModelObject.getValuePSDEField(), realPSModelObject, "getValuePSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETKEYPSDEFIELD, domain, "keypsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSCODELIST, domain, "pscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRANSLATORPARAMS, domain, "translatorparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRANSLATORTAG, domain, "translatortag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRANSLATORTAG2, domain, "translatortag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRANSLATORTYPE, domain, "translatortype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSER2PSDEFIELD, domain, "user2psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERPSDEFIELD, domain, "userpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEPSDEFIELD, domain, "valuepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}