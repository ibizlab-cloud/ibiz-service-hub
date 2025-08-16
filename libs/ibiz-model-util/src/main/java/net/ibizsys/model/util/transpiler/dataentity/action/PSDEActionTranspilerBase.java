package net.ibizsys.model.util.transpiler.dataentity.action;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.action.PSDEActionImplBase.*;



public class PSDEActionTranspilerBase extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.action.PSDEActionImplBase)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.action.PSDEActionImplBase realPSModelObject = (net.ibizsys.model.dataentity.action.PSDEActionImplBase)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "actionholder", realPSModelObject.getActionHolder(), realPSModelObject, "getActionHolder");
		this.setDomainValue(iPSModelTranspileContext, domain, "actionmode", realPSModelObject.getActionMode(), realPSModelObject, "getActionMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "actionparams", realPSModelObject.getActionParams(), realPSModelObject, "getActionParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "actiontag", realPSModelObject.getActionTag(), realPSModelObject, "getActionTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "actiontag2", realPSModelObject.getActionTag2(), realPSModelObject, "getActionTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "actiontag3", realPSModelObject.getActionTag3(), realPSModelObject, "getActionTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "actiontag4", realPSModelObject.getActionTag4(), realPSModelObject, "getActionTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "actiontype", realPSModelObject.getActionType(), realPSModelObject, "getActionType");
		this.setDomainValue(iPSModelTranspileContext, domain, "cachetimeout", realPSModelObject.getCacheTimeout(), realPSModelObject, "getCacheTimeout");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "potime", realPSModelObject.getPOTime(), realPSModelObject, "getPOTime");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssubsyssadetailid", realPSModelObject.getPSSubSysServiceAPIDEMethod(), realPSModelObject, "getPSSubSysServiceAPIDEMethod");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysunistateid", realPSModelObject.getPSSysUniState(), realPSModelObject, "getPSSysUniState");
		this.setDomainValue(iPSModelTranspileContext, domain, "paramtype", realPSModelObject.getParamMode(), realPSModelObject, "getParamMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtypeparam", realPSModelObject.getPredefinedTypeParam(), realPSModelObject, "getPredefinedTypeParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "preparelast", realPSModelObject.getPrepareLastMode(), realPSModelObject, "getPrepareLastMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "syncevent", realPSModelObject.getSyncEvent(), realPSModelObject, "getSyncEvent");
		this.setDomainValue(iPSModelTranspileContext, domain, "testactionmode", realPSModelObject.getTestActionMode(), realPSModelObject, "getTestActionMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "calltimeout", realPSModelObject.getTimeOut(), realPSModelObject, "getTimeOut");
		this.setDomainValue(iPSModelTranspileContext, domain, "tsmode", realPSModelObject.getTransactionMode(), realPSModelObject, "getTransactionMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "batchactionmode", realPSModelObject.isBatchAction(), realPSModelObject, "isBatchAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "paramtype", realPSModelObject.isCustomParam(), realPSModelObject, "isCustomParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableaudit", realPSModelObject.isEnableAudit(), realPSModelObject, "isEnableAudit");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecache", realPSModelObject.isEnableCache(), realPSModelObject, "isEnableCache");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONHOLDER, domain, "actionholder", int.class, new String[]{"3"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONMODE, domain, "actionmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONPARAMS, domain, "actionparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONTAG, domain, "actiontag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONTAG2, domain, "actiontag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONTAG3, domain, "actiontag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONTAG4, domain, "actiontag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONTYPE, domain, "actiontype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCACHETIMEOUT, domain, "cachetimeout", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPOTIME, domain, "potime", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD, domain, "pssubsyssadetailid", net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUNISTATE, domain, "pssysunistateid", net.ibizsys.model.res.IPSSysUniState.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMMODE, domain, "paramtype", int.class, new String[]{"1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPEPARAM, domain, "predefinedtypeparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREPARELASTMODE, domain, "preparelast", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYNCEVENT, domain, "syncevent", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTACTIONMODE, domain, "testactionmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMEOUT, domain, "calltimeout", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRANSACTIONMODE, domain, "tsmode", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISBATCHACTION, domain, "batchactionmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCUSTOMPARAM, domain, "paramtype", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEAUDIT, domain, "enableaudit", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECACHE, domain, "enablecache", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}