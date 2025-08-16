package net.ibizsys.model.util.transpiler.app.dataentity;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.dataentity.PSAppDataEntityImpl.*;



public class PSAppDataEntityTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.dataentity.PSAppDataEntityImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.dataentity.PSAppDataEntityImpl realPSModelObject = (net.ibizsys.model.app.dataentity.PSAppDataEntityImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "accctrlarch", realPSModelObject.getDataAccCtrlArch(), realPSModelObject, "getDataAccCtrlArch");
		this.setDomainValue(iPSModelTranspileContext, domain, "dataaccmode", realPSModelObject.getDataAccCtrlMode(), realPSModelObject, "getDataAccCtrlMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeserviceapiid", realPSModelObject.getPSDEServiceAPI(), realPSModelObject, "getPSDEServiceAPI");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablestorage", realPSModelObject.getStorageMode(), realPSModelObject, "getStorageMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.isDefaultMode(), realPSModelObject, "isDefaultMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorflag", realPSModelObject.isMajor(), realPSModelObject, "isMajor");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAACCCTRLARCH, domain, "accctrlarch", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAACCCTRLMODE, domain, "dataaccmode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDESERVICEAPI, domain, "psdeserviceapiid", net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTORAGEMODE, domain, "enablestorage", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODE, domain, "defaultflag", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMAJOR, domain, "majorflag", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}