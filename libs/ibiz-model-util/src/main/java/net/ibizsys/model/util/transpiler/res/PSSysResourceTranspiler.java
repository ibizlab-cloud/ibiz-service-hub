package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSSysResourceImpl.*;



public class PSSysResourceTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSSysResourceImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSSysResourceImpl realPSModelObject = (net.ibizsys.model.res.PSSysResourceImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "authaccesstokenuri", realPSModelObject.getAuthAccessTokenUrl(), realPSModelObject, "getAuthAccessTokenUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientid", realPSModelObject.getAuthClientId(), realPSModelObject, "getAuthClientId");
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientsecret", realPSModelObject.getAuthClientSecret(), realPSModelObject, "getAuthClientSecret");
		this.setDomainValue(iPSModelTranspileContext, domain, "authmode", realPSModelObject.getAuthMode(), realPSModelObject, "getAuthMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam", realPSModelObject.getAuthParam(), realPSModelObject, "getAuthParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam2", realPSModelObject.getAuthParam2(), realPSModelObject, "getAuthParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "content", realPSModelObject.getContent(), realPSModelObject, "getContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "contentpsdefid", realPSModelObject.getContentPSDEField(), realPSModelObject, "getContentPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "namepsdefid", realPSModelObject.getNamePSDEField(), realPSModelObject, "getNamePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscontentcatid", realPSModelObject.getPSSysContentCat(), realPSModelObject, "getPSSysContentCat");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "pathpsdefid", realPSModelObject.getPathPSDEField(), realPSModelObject, "getPathPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "restag", realPSModelObject.getResTag(), realPSModelObject, "getResTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "resourceparams", realPSModelObject.getResourceParams(), realPSModelObject, "getResourceParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "resourcetype", realPSModelObject.getResourceType(), realPSModelObject, "getResourceType");
		this.setDomainValue(iPSModelTranspileContext, domain, "resourceuri", realPSModelObject.getResourceUri(), realPSModelObject, "getResourceUri");
		this.setDomainValue(iPSModelTranspileContext, domain, "tagpsdefid", realPSModelObject.getTagPSDEField(), realPSModelObject, "getTagPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "user2psdefid", realPSModelObject.getUser2PSDEField(), realPSModelObject, "getUser2PSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "userpsdefid", realPSModelObject.getUserPSDEField(), realPSModelObject, "getUserPSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHACCESSTOKENURL, domain, "authaccesstokenuri", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHCLIENTID, domain, "authclientid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHCLIENTSECRET, domain, "authclientsecret", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHMODE, domain, "authmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM, domain, "authparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTHPARAM2, domain, "authparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENT, domain, "content", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTPSDEFIELD, domain, "contentpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAMEPSDEFIELD, domain, "namepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCONTENTCAT, domain, "pssyscontentcatid", net.ibizsys.model.res.IPSSysContentCat.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPATHPSDEFIELD, domain, "pathpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRESTAG, domain, "restag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRESOURCEPARAMS, domain, "resourceparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRESOURCETYPE, domain, "resourcetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRESOURCEURI, domain, "resourceuri", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTAGPSDEFIELD, domain, "tagpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSER2PSDEFIELD, domain, "user2psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERPSDEFIELD, domain, "userpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}