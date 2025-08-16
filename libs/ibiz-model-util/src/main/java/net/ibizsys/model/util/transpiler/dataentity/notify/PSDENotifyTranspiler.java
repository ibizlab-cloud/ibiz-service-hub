package net.ibizsys.model.util.transpiler.dataentity.notify;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.notify.PSDENotifyImpl.*;



public class PSDENotifyTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.notify.PSDENotifyImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.notify.PSDENotifyImpl realPSModelObject = (net.ibizsys.model.dataentity.notify.PSDENotifyImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "beginpsdefid", realPSModelObject.getBeginTimePSDEField(), realPSModelObject, "getBeginTimePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "checktimer", realPSModelObject.getCheckTimer(), realPSModelObject, "getCheckTimer");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcond", realPSModelObject.getCustomCond(), realPSModelObject, "getCustomCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "endpsdefid", realPSModelObject.getEndTimePSDEField(), realPSModelObject, "getEndTimePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "eventmodel", realPSModelObject.getEventModel(), realPSModelObject, "getEventModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "events", realPSModelObject.getEvents(), realPSModelObject, "getEvents");
		this.setDomainValue(iPSModelTranspileContext, domain, "fields", realPSModelObject.getFields(), realPSModelObject, "getFields");
		this.setDomainValue(iPSModelTranspileContext, domain, "filtermodel", realPSModelObject.getFilterModel(), realPSModelObject, "getFilterModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtype", realPSModelObject.getMsgType(), realPSModelObject, "getMsgType");
		this.setDomainValue(iPSModelTranspileContext, domain, "notifyend", realPSModelObject.getNotifyEnd(), realPSModelObject, "getNotifyEnd");
		this.setDomainValue(iPSModelTranspileContext, domain, "notifystart", realPSModelObject.getNotifyStart(), realPSModelObject, "getNotifyStart");
		this.setDomainValue(iPSModelTranspileContext, domain, "notifysubtype", realPSModelObject.getNotifySubType(), realPSModelObject, "getNotifySubType");
		this.setDomainValue(iPSModelTranspileContext, domain, "notifytag", realPSModelObject.getNotifyTag(), realPSModelObject, "getNotifyTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "notifytag2", realPSModelObject.getNotifyTag2(), realPSModelObject, "getNotifyTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgqueueid", realPSModelObject.getPSSysMsgQueue(), realPSModelObject, "getPSSysMsgQueue");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgtemplid", realPSModelObject.getPSSysMsgTempl(), realPSModelObject, "getPSSysMsgTempl");
		this.setDomainValue(iPSModelTranspileContext, domain, "taskmode", realPSModelObject.getTaskMode(), realPSModelObject, "getTaskMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "threadrunmode", realPSModelObject.getThreadMode(), realPSModelObject, "getThreadMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "ignoreexception", realPSModelObject.isIgnoreException(), realPSModelObject, "isIgnoreException");
		this.setDomainValue(iPSModelTranspileContext, domain, "templflag", realPSModelObject.isTemplate(), realPSModelObject, "isTemplate");
		this.setDomainValue(iPSModelTranspileContext, domain, "timermode", realPSModelObject.isTimerMode(), realPSModelObject, "isTimerMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "validflag", realPSModelObject.isValid(), realPSModelObject, "isValid");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBEGINTIMEPSDEFIELD, domain, "beginpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCHECKTIMER, domain, "checktimer", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMCOND, domain, "customcond", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENDTIMEPSDEFIELD, domain, "endpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTMODEL, domain, "eventmodel", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTS, domain, "events", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDS, domain, "fields", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFILTERMODEL, domain, "filtermodel", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTYPE, domain, "msgtype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNOTIFYEND, domain, "notifyend", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNOTIFYSTART, domain, "notifystart", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNOTIFYSUBTYPE, domain, "notifysubtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNOTIFYTAG, domain, "notifytag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNOTIFYTAG2, domain, "notifytag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMSGQUEUE, domain, "pssysmsgqueueid", net.ibizsys.model.msg.IPSSysMsgQueue.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMSGTEMPL, domain, "pssysmsgtemplid", net.ibizsys.model.msg.IPSSysMsgTempl.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTASKMODE, domain, "taskmode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTHREADMODE, domain, "threadrunmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISIGNOREEXCEPTION, domain, "ignoreexception", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISTEMPLATE, domain, "templflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISTIMERMODE, domain, "timermode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISVALID, domain, "validflag", boolean.class, new String[]{"true"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}