package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSSysUtilImpl.*;



public class PSSysUtilTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSSysUtilImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSSysUtilImpl realPSModelObject = (net.ibizsys.model.res.PSSysUtilImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "authaccesstokenuri", realPSModelObject.getAuthAccessTokenUrl(), realPSModelObject, "getAuthAccessTokenUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientid", realPSModelObject.getAuthClientId(), realPSModelObject, "getAuthClientId");
		this.setDomainValue(iPSModelTranspileContext, domain, "authclientsecret", realPSModelObject.getAuthClientSecret(), realPSModelObject, "getAuthClientSecret");
		this.setDomainValue(iPSModelTranspileContext, domain, "authmode", realPSModelObject.getAuthMode(), realPSModelObject, "getAuthMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam", realPSModelObject.getAuthParam(), realPSModelObject, "getAuthParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "authparam2", realPSModelObject.getAuthParam2(), realPSModelObject, "getAuthParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "inpssysdatasyncagentid", realPSModelObject.getInPSSysDataSyncAgent(), realPSModelObject, "getInPSSysDataSyncAgent");
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervalue", realPSModelObject.getOrderValue(), realPSModelObject, "getOrderValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "outpssysdatasyncagentid", realPSModelObject.getOutPSSysDataSyncAgent(), realPSModelObject, "getOutPSSysDataSyncAgent");
		this.setDomainValue(iPSModelTranspileContext, domain, "outpssysresourceid", realPSModelObject.getOutPSSysResource(), realPSModelObject, "getOutPSSysResource");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssubsysserviceapiid", realPSModelObject.getPSSubSysServiceAPI(), realPSModelObject, "getPSSubSysServiceAPI");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdegroupid", realPSModelObject.getPSSysDEGroup(), realPSModelObject, "getPSSysDEGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmodelgroupid", realPSModelObject.getPSSysModelGroup(), realPSModelObject, "getPSSysModelGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysresourceid", realPSModelObject.getPSSysResource(), realPSModelObject, "getPSSysResource");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilobj", realPSModelObject.getRTObjectName(), realPSModelObject, "getRTObjectName");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam", realPSModelObject.getServiceParam(), realPSModelObject, "getServiceParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam2", realPSModelObject.getServiceParam2(), realPSModelObject, "getServiceParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicepath", realPSModelObject.getServicePath(), realPSModelObject, "getServicePath");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsdeid", realPSModelObject.getUtilPSDE(), realPSModelObject, "getUtilPSDE");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde10id", realPSModelObject.getUtilPSDE10(), realPSModelObject, "getUtilPSDE10");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde11id", realPSModelObject.getUtilPSDE11(), realPSModelObject, "getUtilPSDE11");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde12id", realPSModelObject.getUtilPSDE12(), realPSModelObject, "getUtilPSDE12");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde13id", realPSModelObject.getUtilPSDE13(), realPSModelObject, "getUtilPSDE13");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde14id", realPSModelObject.getUtilPSDE14(), realPSModelObject, "getUtilPSDE14");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde15id", realPSModelObject.getUtilPSDE15(), realPSModelObject, "getUtilPSDE15");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde16id", realPSModelObject.getUtilPSDE16(), realPSModelObject, "getUtilPSDE16");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde17id", realPSModelObject.getUtilPSDE17(), realPSModelObject, "getUtilPSDE17");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde18id", realPSModelObject.getUtilPSDE18(), realPSModelObject, "getUtilPSDE18");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde19id", realPSModelObject.getUtilPSDE19(), realPSModelObject, "getUtilPSDE19");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde2id", realPSModelObject.getUtilPSDE2(), realPSModelObject, "getUtilPSDE2");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde20id", realPSModelObject.getUtilPSDE20(), realPSModelObject, "getUtilPSDE20");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde3id", realPSModelObject.getUtilPSDE3(), realPSModelObject, "getUtilPSDE3");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde4id", realPSModelObject.getUtilPSDE4(), realPSModelObject, "getUtilPSDE4");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde5id", realPSModelObject.getUtilPSDE5(), realPSModelObject, "getUtilPSDE5");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde6id", realPSModelObject.getUtilPSDE6(), realPSModelObject, "getUtilPSDE6");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde7id", realPSModelObject.getUtilPSDE7(), realPSModelObject, "getUtilPSDE7");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde8id", realPSModelObject.getUtilPSDE8(), realPSModelObject, "getUtilPSDE8");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsde9id", realPSModelObject.getUtilPSDE9(), realPSModelObject, "getUtilPSDE9");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilparams", realPSModelObject.getUtilParams(), realPSModelObject, "getUtilParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "utiltag", realPSModelObject.getUtilTag(), realPSModelObject, "getUtilTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "utiltag2", realPSModelObject.getUtilTag2(), realPSModelObject, "getUtilTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "utiltype", realPSModelObject.getUtilType(), realPSModelObject, "getUtilType");
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
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPSSYSDATASYNCAGENT, domain, "inpssysdatasyncagentid", net.ibizsys.model.res.IPSSysDataSyncAgent.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORDERVALUE, domain, "ordervalue", int.class, new String[]{"99999"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPSSYSDATASYNCAGENT, domain, "outpssysdatasyncagentid", net.ibizsys.model.res.IPSSysDataSyncAgent.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPSSYSRESOURCE, domain, "outpssysresourceid", net.ibizsys.model.res.IPSSysResource.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSUBSYSSERVICEAPI, domain, "pssubsysserviceapiid", net.ibizsys.model.service.IPSSubSysServiceAPI.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSDEGROUP, domain, "psdegroupid", net.ibizsys.model.dataentity.IPSSysDEGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMODELGROUP, domain, "pssysmodelgroupid", net.ibizsys.model.system.IPSSysModelGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSRESOURCE, domain, "pssysresourceid", net.ibizsys.model.res.IPSSysResource.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRTOBJECTNAME, domain, "utilobj", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM, domain, "serviceparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM2, domain, "serviceparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPATH, domain, "servicepath", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE, domain, "utilpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE10, domain, "utilpsde10id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE11, domain, "utilpsde11id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE12, domain, "utilpsde12id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE13, domain, "utilpsde13id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE14, domain, "utilpsde14id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE15, domain, "utilpsde15id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE16, domain, "utilpsde16id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE17, domain, "utilpsde17id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE18, domain, "utilpsde18id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE19, domain, "utilpsde19id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE2, domain, "utilpsde2id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE20, domain, "utilpsde20id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE3, domain, "utilpsde3id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE4, domain, "utilpsde4id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE5, domain, "utilpsde5id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE6, domain, "utilpsde6id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE7, domain, "utilpsde7id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE8, domain, "utilpsde8id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPSDE9, domain, "utilpsde9id", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPARAMS, domain, "utilparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILTAG, domain, "utiltag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILTAG2, domain, "utiltag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILTYPE, domain, "utiltype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}