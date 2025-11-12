package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDELogicImpl.*;



public class PSDELogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDELogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDELogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDELogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "attachmode", realPSModelObject.getAttachMode(), realPSModelObject, "getAttachMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "attachtopsdeactionid", realPSModelObject.getAttachToPSDEAction(), realPSModelObject, "getAttachToPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "attachtopsdedatasetid", realPSModelObject.getAttachToPSDEDataSet(), realPSModelObject, "getAttachToPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "debugmode", realPSModelObject.getDebugMode(), realPSModelObject, "getDebugMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "eventmodel", realPSModelObject.getEventModel(), realPSModelObject, "getEventModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "events", realPSModelObject.getEvents(), realPSModelObject, "getEvents");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicsubtype", realPSModelObject.getLogicSubType(), realPSModelObject, "getLogicSubType");
		this.setDomainValue(iPSModelTranspileContext, domain, "logictag", realPSModelObject.getLogicTag(), realPSModelObject, "getLogicTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "logictag2", realPSModelObject.getLogicTag2(), realPSModelObject, "getLogicTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "logictag3", realPSModelObject.getLogicTag3(), realPSModelObject, "getLogicTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "logictag4", realPSModelObject.getLogicTag4(), realPSModelObject, "getLogicTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "threadrunmode", realPSModelObject.getThreadMode(), realPSModelObject, "getThreadMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "timerpolicy", realPSModelObject.getTimerPolicy(), realPSModelObject, "getTimerPolicy");
		this.setDomainValue(iPSModelTranspileContext, domain, "custommode", realPSModelObject.isCustomCode(), realPSModelObject, "isCustomCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "ignoreexception", realPSModelObject.isIgnoreException(), realPSModelObject, "isIgnoreException");
		this.setDomainValue(iPSModelTranspileContext, domain, "templflag", realPSModelObject.isTemplate(), realPSModelObject, "isTemplate");
		this.setDomainValue(iPSModelTranspileContext, domain, "validflag", realPSModelObject.isValid(), realPSModelObject, "isValid");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETATTACHMODE, domain, "attachmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETATTACHTOPSDEACTION, domain, "attachtopsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETATTACHTOPSDEDATASET, domain, "attachtopsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEBUGMODE, domain, "debugmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTMODEL, domain, "eventmodel", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTS, domain, "events", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "psdelogicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICSUBTYPE, domain, "logicsubtype", java.lang.String.class, new String[]{"NONE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG, domain, "logictag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG2, domain, "logictag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG3, domain, "logictag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG4, domain, "logictag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTHREADMODE, domain, "threadrunmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMERPOLICY, domain, "timerpolicy", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCUSTOMCODE, domain, "custommode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISIGNOREEXCEPTION, domain, "ignoreexception", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISTEMPLATE, domain, "templflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISVALID, domain, "validflag", boolean.class, new String[]{"true"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}