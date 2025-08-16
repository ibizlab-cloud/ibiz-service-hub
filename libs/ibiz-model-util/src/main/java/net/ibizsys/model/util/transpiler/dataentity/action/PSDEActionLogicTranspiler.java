package net.ibizsys.model.util.transpiler.dataentity.action;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.action.PSDEActionLogicImpl.*;



public class PSDEActionLogicTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.action.PSDEActionLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.action.PSDEActionLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.action.PSDEActionLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "internallogic", realPSModelObject.getActionLogicType(), realPSModelObject, "getActionLogicType");
		this.setDomainValue(iPSModelTranspileContext, domain, "attachmode", realPSModelObject.getAttachMode(), realPSModelObject, "getAttachMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "datasyncevent", realPSModelObject.getDataSyncEvent(), realPSModelObject, "getDataSyncEvent");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeid", realPSModelObject.getDstPSDE(), realPSModelObject, "getDstPSDE");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeactionid", realPSModelObject.getDstPSDEAction(), realPSModelObject, "getDstPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdedatasetid", realPSModelObject.getDstPSDEDataSet(), realPSModelObject, "getDstPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdelogicid", realPSModelObject.getDstPSDELogic(), realPSModelObject, "getDstPSDELogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "errorcode", realPSModelObject.getErrorCode(), realPSModelObject, "getErrorCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "errormsg", realPSModelObject.getErrorInfo(), realPSModelObject, "getErrorInfo");
		this.setDomainValue(iPSModelTranspileContext, domain, "errorpslanresid", realPSModelObject.getErrorInfoPSLanguageRes(), realPSModelObject, "getErrorInfoPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "exceptionobj", realPSModelObject.getExceptionObj(), realPSModelObject, "getExceptionObj");
		this.setDomainValue(iPSModelTranspileContext, domain, "propertymap", realPSModelObject.getLogicParams(), realPSModelObject, "getLogicParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorpsderid", realPSModelObject.getMajorPSDER(), realPSModelObject, "getMajorPSDER");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasyncid", realPSModelObject.getPSDEDataSync(), realPSModelObject, "getPSDEDataSync");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefvalueruleid", realPSModelObject.getPSDEFValueRule(), realPSModelObject, "getPSDEFValueRule");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSDEField(), realPSModelObject, "getPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicid", realPSModelObject.getPSDELogic(), realPSModelObject, "getPSDELogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdemainstateid", realPSModelObject.getPSDEMainState(), realPSModelObject, "getPSDEMainState");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdenotifyid", realPSModelObject.getPSDENotify(), realPSModelObject, "getPSDENotify");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysdelogicnodeid", realPSModelObject.getPSSysLogic(), realPSModelObject, "getPSSysLogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssequenceid", realPSModelObject.getPSSysSequence(), realPSModelObject, "getPSSysSequence");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystranslatorid", realPSModelObject.getPSSysTranslator(), realPSModelObject, "getPSSysTranslator");
		this.setDomainValue(iPSModelTranspileContext, domain, "preparelast", realPSModelObject.getPrepareLastMode(), realPSModelObject, "getPrepareLastMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "cloneparamflag", realPSModelObject.isCloneParam(), realPSModelObject, "isCloneParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicholder", realPSModelObject.isEnableBackend(), realPSModelObject, "isEnableBackend");
		this.setDomainValue(iPSModelTranspileContext, domain, "ignoreexception", realPSModelObject.isIgnoreException(), realPSModelObject, "isIgnoreException");
		this.setDomainValue(iPSModelTranspileContext, domain, "validflag", realPSModelObject.isValid(), realPSModelObject, "isValid");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONLOGICTYPE, domain, "internallogic", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETATTACHMODE, domain, "attachmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASYNCEVENT, domain, "datasyncevent", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDE, domain, "dstpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEACTION, domain, "dstpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATASET, domain, "dstpsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGIC, domain, "dstpsdelogicid", net.ibizsys.model.dataentity.logic.IPSDELogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETERRORCODE, domain, "errorcode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETERRORINFO, domain, "errormsg", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETERRORINFOPSLANGUAGERES, domain, "errorpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXCEPTIONOBJ, domain, "exceptionobj", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICPARAMS, domain, "propertymap", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPSDER, domain, "majorpsderid", net.ibizsys.model.dataentity.der.IPSDERBase.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASYNC, domain, "psdedatasyncid", net.ibizsys.model.dataentity.datasync.IPSDEDataSync.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFVALUERULE, domain, "psdefvalueruleid", net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFIELD, domain, "psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDELOGIC, domain, "psdelogicid", net.ibizsys.model.dataentity.logic.IPSDELogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEMAINSTATE, domain, "psdemainstateid", net.ibizsys.model.dataentity.mainstate.IPSDEMainState.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDENOTIFY, domain, "psdenotifyid", net.ibizsys.model.dataentity.notify.IPSDENotify.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSLOGIC, domain, "pssysdelogicnodeid", net.ibizsys.model.res.IPSSysLogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSEQUENCE, domain, "pssyssequenceid", net.ibizsys.model.res.IPSSysSequence.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTRANSLATOR, domain, "pssystranslatorid", net.ibizsys.model.res.IPSSysTranslator.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREPARELASTMODE, domain, "preparelast", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCLONEPARAM, domain, "cloneparamflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEBACKEND, domain, "logicholder", boolean.class, new String[]{"true"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISIGNOREEXCEPTION, domain, "ignoreexception", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISVALID, domain, "validflag", boolean.class, new String[]{"true"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}