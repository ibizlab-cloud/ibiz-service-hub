package net.ibizsys.model.util.transpiler.dataentity;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.PSDataEntityImpl.*;



public class PSDataEntityTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.PSDataEntityImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.PSDataEntityImpl realPSModelObject = (net.ibizsys.model.dataentity.PSDataEntityImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "auditmode", realPSModelObject.getAuditMode(), realPSModelObject, "getAuditMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "biztag", realPSModelObject.getBizTag(), realPSModelObject, "getBizTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "detag", realPSModelObject.getDETag(), realPSModelObject, "getDETag");
		this.setDomainValue(iPSModelTranspileContext, domain, "detag2", realPSModelObject.getDETag2(), realPSModelObject, "getDETag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "detype", realPSModelObject.getDEType(), realPSModelObject, "getDEType");
		this.setDomainValue(iPSModelTranspileContext, domain, "dslink", realPSModelObject.getDSLink(), realPSModelObject, "getDSLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "accctrlarch", realPSModelObject.getDataAccCtrlArch(), realPSModelObject, "getDataAccCtrlArch");
		this.setDomainValue(iPSModelTranspileContext, domain, "dataaccmode", realPSModelObject.getDataAccCtrlMode(), realPSModelObject, "getDataAccCtrlMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "datachglogmode", realPSModelObject.getDataChangeLogMode(), realPSModelObject, "getDataChangeLogMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "dataimpexpflag", realPSModelObject.getDataImpExpMode(), realPSModelObject, "getDataImpExpMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enabledynasys", realPSModelObject.getDynaSysMode(), realPSModelObject, "getDynaSysMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "indexdetype", realPSModelObject.getIndexDEType(), realPSModelObject, "getIndexDEType");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicinvalidvalue", realPSModelObject.getInvalidLogicValue(), realPSModelObject, "getInvalidLogicValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssubsysserviceapiid", realPSModelObject.getPSSubSysServiceAPI(), realPSModelObject, "getPSSubSysServiceAPI");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssubsyssadeid", realPSModelObject.getPSSubSysServiceAPIDE(), realPSModelObject, "getPSSubSysServiceAPIDE");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "saasmode", realPSModelObject.getSaaSMode(), realPSModelObject, "getSaaSMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceapiflag", realPSModelObject.getServiceAPIMode(), realPSModelObject, "getServiceAPIMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicecodename", realPSModelObject.getServiceCodeName(), realPSModelObject, "getServiceCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "storagemode", realPSModelObject.getStorageMode(), realPSModelObject, "getStorageMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "tablename", realPSModelObject.getTableName(), realPSModelObject, "getTableName");
		this.setDomainValue(iPSModelTranspileContext, domain, "enatempdata", realPSModelObject.getTempDataHolder(), realPSModelObject, "getTempDataHolder");
		this.setDomainValue(iPSModelTranspileContext, domain, "keyrule", realPSModelObject.getUnionKeyMode(), realPSModelObject, "getUnionKeyMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "vkeyseparator", realPSModelObject.getUnionKeyParam(), realPSModelObject, "getUnionKeyParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicvalidvalue", realPSModelObject.getValidLogicValue(), realPSModelObject, "getValidLogicValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewname", realPSModelObject.getViewName(), realPSModelObject, "getViewName");
		this.setDomainValue(iPSModelTranspileContext, domain, "virtualflag", realPSModelObject.getVirtualMode(), realPSModelObject, "getVirtualMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enatempdata", realPSModelObject.isEnableTempData(), realPSModelObject, "isEnableTempData");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicvalid", realPSModelObject.isLogicValid(), realPSModelObject, "isLogicValid");
		this.setDomainValue(iPSModelTranspileContext, domain, "virtualflag", realPSModelObject.isVirtual(), realPSModelObject, "isVirtual");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUDITMODE, domain, "auditmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBIZTAG, domain, "biztag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAG, domain, "detag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAG2, domain, "detag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETYPE, domain, "detype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSLINK, domain, "dslink", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAACCCTRLARCH, domain, "accctrlarch", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAACCCTRLMODE, domain, "dataaccmode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATACHANGELOGMODE, domain, "datachglogmode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAIMPEXPMODE, domain, "dataimpexpflag", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNASYSMODE, domain, "enabledynasys", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINDEXDETYPE, domain, "indexdetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINVALIDLOGICVALUE, domain, "logicinvalidvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSUBSYSSERVICEAPI, domain, "pssubsysserviceapiid", net.ibizsys.model.service.IPSSubSysServiceAPI.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSUBSYSSERVICEAPIDE, domain, "pssubsyssadeid", net.ibizsys.model.service.IPSSubSysServiceAPIDE.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSAASMODE, domain, "saasmode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEAPIMODE, domain, "serviceapiflag", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICECODENAME, domain, "servicecodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTORAGEMODE, domain, "storagemode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTABLENAME, domain, "tablename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEMPDATAHOLDER, domain, "enatempdata", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNIONKEYMODE, domain, "keyrule", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNIONKEYPARAM, domain, "vkeyseparator", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALIDLOGICVALUE, domain, "logicvalidvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWNAME, domain, "viewname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIRTUALMODE, domain, "virtualflag", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLETEMPDATA, domain, "enatempdata", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISLOGICVALID, domain, "logicvalid", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISVIRTUAL, domain, "virtualflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}