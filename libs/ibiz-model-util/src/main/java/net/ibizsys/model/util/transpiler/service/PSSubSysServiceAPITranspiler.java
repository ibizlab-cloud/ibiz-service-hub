package net.ibizsys.model.util.transpiler.service;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.service.PSSubSysServiceAPIImpl.*;



public class PSSubSysServiceAPITranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.service.PSSubSysServiceAPIImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.service.PSSubSysServiceAPIImpl realPSModelObject = (net.ibizsys.model.service.PSSubSysServiceAPIImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "codenamemode", realPSModelObject.getAPICodeNameMode(), realPSModelObject, "getAPICodeNameMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "apisource", realPSModelObject.getAPISource(), realPSModelObject, "getAPISource");
		this.setDomainValue(iPSModelTranspileContext, domain, "apitag", realPSModelObject.getAPITag(), realPSModelObject, "getAPITag");
		this.setDomainValue(iPSModelTranspileContext, domain, "apitag2", realPSModelObject.getAPITag2(), realPSModelObject, "getAPITag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "apitype", realPSModelObject.getAPIType(), realPSModelObject, "getAPIType");
		this.setDomainValue(iPSModelTranspileContext, domain, "authaccesstokenuri", realPSModelObject.getAuthAccessTokenUrl(), realPSModelObject, "getAuthAccessTokenUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientid", realPSModelObject.getAuthClientId(), realPSModelObject, "getAuthClientId");
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientsecret", realPSModelObject.getAuthClientSecret(), realPSModelObject, "getAuthClientSecret");
		this.setDomainValue(iPSModelTranspileContext, domain, "authmode", realPSModelObject.getAuthMode(), realPSModelObject, "getAuthMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam", realPSModelObject.getAuthParam(), realPSModelObject, "getAuthParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam2", realPSModelObject.getAuthParam2(), realPSModelObject, "getAuthParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam3", realPSModelObject.getAuthParam3(), realPSModelObject, "getAuthParam3");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam4", realPSModelObject.getAuthParam4(), realPSModelObject, "getAuthParam4");
		this.setDomainValue(iPSModelTranspileContext, domain, "authcode", realPSModelObject.getAuthScriptCode(), realPSModelObject, "getAuthScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "authtimeout", realPSModelObject.getAuthTimeout(), realPSModelObject, "getAuthTimeout");
		this.setDomainValue(iPSModelTranspileContext, domain, "headerparams", realPSModelObject.getHeaderParams(), realPSModelObject, "getHeaderParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "methodcode", realPSModelObject.getMethodScriptCode(), realPSModelObject, "getMethodScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysresourceid", realPSModelObject.getPSSysResource(), realPSModelObject, "getPSSysResource");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicecodename", realPSModelObject.getServiceCodeName(), realPSModelObject, "getServiceCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam", realPSModelObject.getServiceParam(), realPSModelObject, "getServiceParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam2", realPSModelObject.getServiceParam2(), realPSModelObject, "getServiceParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam3", realPSModelObject.getServiceParam3(), realPSModelObject, "getServiceParam3");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam4", realPSModelObject.getServiceParam4(), realPSModelObject, "getServiceParam4");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicepath", realPSModelObject.getServicePath(), realPSModelObject, "getServicePath");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicetype", realPSModelObject.getServiceType(), realPSModelObject, "getServiceType");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicedtoflag", realPSModelObject.isEnableServiceAPIDTO(), realPSModelObject, "isEnableServiceAPIDTO");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPICODENAMEMODE, domain, "codenamemode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPISOURCE, domain, "apisource", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPITAG, domain, "apitag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPITAG2, domain, "apitag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPITYPE, domain, "apitype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHACCESSTOKENURL, domain, "authaccesstokenuri", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHCLIENTID, domain, "authclientid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHCLIENTSECRET, domain, "authclientsecret", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHMODE, domain, "authmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM, domain, "authparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM2, domain, "authparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM3, domain, "authparam3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM4, domain, "authparam4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHSCRIPTCODE, domain, "authcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHTIMEOUT, domain, "authtimeout", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEADERPARAMS, domain, "headerparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODSCRIPTCODE, domain, "methodcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSRESOURCE, domain, "pssysresourceid", net.ibizsys.model.res.IPSSysResource.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICECODENAME, domain, "servicecodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM, domain, "serviceparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM2, domain, "serviceparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM3, domain, "serviceparam3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM4, domain, "serviceparam4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPATH, domain, "servicepath", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICETYPE, domain, "servicetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLESERVICEAPIDTO, domain, "servicedtoflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}