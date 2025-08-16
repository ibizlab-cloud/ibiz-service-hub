package net.ibizsys.model.util.transpiler.database;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.database.PSSysDBSchemeImpl.*;



public class PSSysDBSchemeTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.database.PSSysDBSchemeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.database.PSSysDBSchemeImpl realPSModelObject = (net.ibizsys.model.database.PSSysDBSchemeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientid", realPSModelObject.getAuthClientId(), realPSModelObject, "getAuthClientId");
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientsecret", realPSModelObject.getAuthClientSecret(), realPSModelObject, "getAuthClientSecret");
		this.setDomainValue(iPSModelTranspileContext, domain, "authmode", realPSModelObject.getAuthMode(), realPSModelObject, "getAuthMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam", realPSModelObject.getAuthParam(), realPSModelObject, "getAuthParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam2", realPSModelObject.getAuthParam2(), realPSModelObject, "getAuthParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "codename2", realPSModelObject.getCodeName2(), realPSModelObject, "getCodeName2");
		this.setDomainValue(iPSModelTranspileContext, domain, "objnamecase", realPSModelObject.getDBObjNameCase(), realPSModelObject, "getDBObjNameCase");
		this.setDomainValue(iPSModelTranspileContext, domain, "dslink", realPSModelObject.getDSLink(), realPSModelObject, "getDSLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmodelgroupid", realPSModelObject.getPSSysModelGroup(), realPSModelObject, "getPSSysModelGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "schemetag", realPSModelObject.getSchemeTag(), realPSModelObject, "getSchemeTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "schemetag2", realPSModelObject.getSchemeTag2(), realPSModelObject, "getSchemeTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam", realPSModelObject.getServiceParam(), realPSModelObject, "getServiceParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam2", realPSModelObject.getServiceParam2(), realPSModelObject, "getServiceParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicepath", realPSModelObject.getServicePath(), realPSModelObject, "getServicePath");
		this.setDomainValue(iPSModelTranspileContext, domain, "autoextendmodel", realPSModelObject.isAutoExtendModel(), realPSModelObject, "isAutoExtendModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "existingmodel", realPSModelObject.isExistingModel(), realPSModelObject, "isExistingModel");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHCLIENTID, domain, "authclientid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHCLIENTSECRET, domain, "authclientsecret", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHMODE, domain, "authmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM, domain, "authparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM2, domain, "authparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME2, domain, "codename2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDBOBJNAMECASE, domain, "objnamecase", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSLINK, domain, "dslink", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMODELGROUP, domain, "pssysmodelgroupid", net.ibizsys.model.system.IPSSysModelGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCHEMETAG, domain, "schemetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCHEMETAG2, domain, "schemetag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM, domain, "serviceparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM2, domain, "serviceparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPATH, domain, "servicepath", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISAUTOEXTENDMODEL, domain, "autoextendmodel", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISEXISTINGMODEL, domain, "existingmodel", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}