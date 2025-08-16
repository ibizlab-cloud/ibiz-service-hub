package net.ibizsys.model.util.transpiler.service;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.service.PSSysServiceAPIImpl.*;



public class PSSysServiceAPITranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.service.PSSysServiceAPIImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.service.PSSysServiceAPIImpl realPSModelObject = (net.ibizsys.model.service.PSSysServiceAPIImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "codenamemode", realPSModelObject.getAPICodeNameMode(), realPSModelObject, "getAPICodeNameMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "apilevel", realPSModelObject.getAPILevel(), realPSModelObject, "getAPILevel");
		this.setDomainValue(iPSModelTranspileContext, domain, "apimode", realPSModelObject.getAPIMode(), realPSModelObject, "getAPIMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "apitag", realPSModelObject.getAPITag(), realPSModelObject, "getAPITag");
		this.setDomainValue(iPSModelTranspileContext, domain, "apitag2", realPSModelObject.getAPITag2(), realPSModelObject, "getAPITag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "apitype", realPSModelObject.getAPIType(), realPSModelObject, "getAPIType");
		this.setDomainValue(iPSModelTranspileContext, domain, "ver", realPSModelObject.getAPIVersion(), realPSModelObject, "getAPIVersion");
		this.setDomainValue(iPSModelTranspileContext, domain, "authchecktokenuri", realPSModelObject.getAuthCheckTokenUrl(), realPSModelObject, "getAuthCheckTokenUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientid", realPSModelObject.getAuthClientId(), realPSModelObject, "getAuthClientId");
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientsecret", realPSModelObject.getAuthClientSecret(), realPSModelObject, "getAuthClientSecret");
		this.setDomainValue(iPSModelTranspileContext, domain, "authmode", realPSModelObject.getAuthMode(), realPSModelObject, "getAuthMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam", realPSModelObject.getAuthParam(), realPSModelObject, "getAuthParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam2", realPSModelObject.getAuthParam2(), realPSModelObject, "getAuthParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam3", realPSModelObject.getAuthParam3(), realPSModelObject, "getAuthParam3");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam4", realPSModelObject.getAuthParam4(), realPSModelObject, "getAuthParam4");
		this.setDomainListValue(iPSModelTranspileContext, domain, "ignoreauthpatterns", realPSModelObject.getIgnoreAuthPatterns(), realPSModelObject, "getIgnoreAuthPatterns", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "namingservice", realPSModelObject.getNamingService(), realPSModelObject, "getNamingService");
		this.setDomainValue(iPSModelTranspileContext, domain, "outpssystranslatorid", realPSModelObject.getOutPSSysTranslator(), realPSModelObject, "getOutPSSysTranslator");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysresourceid", realPSModelObject.getPSSysResource(), realPSModelObject, "getPSSysResource");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicecodename", realPSModelObject.getServiceCodeName(), realPSModelObject, "getServiceCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam", realPSModelObject.getServiceParam(), realPSModelObject, "getServiceParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam2", realPSModelObject.getServiceParam2(), realPSModelObject, "getServiceParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam3", realPSModelObject.getServiceParam3(), realPSModelObject, "getServiceParam3");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam4", realPSModelObject.getServiceParam4(), realPSModelObject, "getServiceParam4");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicetype", realPSModelObject.getServiceType(), realPSModelObject, "getServiceType");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablegateway", realPSModelObject.isEnableGateway(), realPSModelObject, "isEnableGateway");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicedtoflag", realPSModelObject.isEnableServiceAPIDTO(), realPSModelObject, "isEnableServiceAPIDTO");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPICODENAMEMODE, domain, "codenamemode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPILEVEL, domain, "apilevel", int.class, new String[]{"3"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPIMODE, domain, "apimode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPITAG, domain, "apitag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPITAG2, domain, "apitag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPITYPE, domain, "apitype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPIVERSION, domain, "ver", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHCHECKTOKENURL, domain, "authchecktokenuri", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHCLIENTID, domain, "authclientid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHCLIENTSECRET, domain, "authclientsecret", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHMODE, domain, "authmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM, domain, "authparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM2, domain, "authparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM3, domain, "authparam3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM4, domain, "authparam4", java.lang.String.class);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETIGNOREAUTHPATTERNS, domain, "ignoreauthpatterns", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAMINGSERVICE, domain, "namingservice", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPSSYSTRANSLATOR, domain, "outpssystranslatorid", net.ibizsys.model.res.IPSSysTranslator.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSRESOURCE, domain, "pssysresourceid", net.ibizsys.model.res.IPSSysResource.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICECODENAME, domain, "servicecodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM, domain, "serviceparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM2, domain, "serviceparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM3, domain, "serviceparam3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM4, domain, "serviceparam4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICETYPE, domain, "servicetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEGATEWAY, domain, "enablegateway", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLESERVICEAPIDTO, domain, "servicedtoflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}