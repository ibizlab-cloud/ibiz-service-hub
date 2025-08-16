package net.ibizsys.model.util.transpiler.msg;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.msg.PSSysMsgQueueImpl.*;



public class PSSysMsgQueueTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.msg.PSSysMsgQueueImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.msg.PSSysMsgQueueImpl realPSModelObject = (net.ibizsys.model.msg.PSSysMsgQueueImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "contentpsdefid", realPSModelObject.getContentPSDEField(), realPSModelObject, "getContentPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "ddcontentpsdefid", realPSModelObject.getDDContentPSDEField(), realPSModelObject, "getDDContentPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "filepsdefid", realPSModelObject.getFilePSDEField(), realPSModelObject, "getFilePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "imcontentpsdefid", realPSModelObject.getIMContentPSDEField(), realPSModelObject, "getIMContentPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobtaskurlpsdefid", realPSModelObject.getMobTaskUrlPSDEField(), realPSModelObject, "getMobTaskUrlPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgqueueparams", realPSModelObject.getMsgQueueParams(), realPSModelObject, "getMsgQueueParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgqueuetag", realPSModelObject.getMsgQueueTag(), realPSModelObject, "getMsgQueueTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgqueuetag2", realPSModelObject.getMsgQueueTag2(), realPSModelObject, "getMsgQueueTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgqueuetype", realPSModelObject.getMsgQueueType(), realPSModelObject, "getMsgQueueType");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtypepsdefid", realPSModelObject.getMsgTypePSDEField(), realPSModelObject, "getMsgTypePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysutildeid", realPSModelObject.getPSSysUtil(), realPSModelObject, "getPSSysUtil");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "smscontentpsdefid", realPSModelObject.getSMSContentPSDEField(), realPSModelObject, "getSMSContentPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "sendtimepsdefid", realPSModelObject.getSendTimePSDEField(), realPSModelObject, "getSendTimePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "statepsdefid", realPSModelObject.getStatePSDEField(), realPSModelObject, "getStatePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "tag2psdefid", realPSModelObject.getTag2PSDEField(), realPSModelObject, "getTag2PSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "tagpsdefid", realPSModelObject.getTagPSDEField(), realPSModelObject, "getTagPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "targetpsdefid", realPSModelObject.getTargetPSDEField(), realPSModelObject, "getTargetPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "targettypepsdefid", realPSModelObject.getTargetTypePSDEField(), realPSModelObject, "getTargetTypePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "taskurlpsdefid", realPSModelObject.getTaskUrlPSDEField(), realPSModelObject, "getTaskUrlPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "titlepsdefid", realPSModelObject.getTitlePSDEField(), realPSModelObject, "getTitlePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "wxcontentpsdefid", realPSModelObject.getWXContentPSDEField(), realPSModelObject, "getWXContentPSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTPSDEFIELD, domain, "contentpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDDCONTENTPSDEFIELD, domain, "ddcontentpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFILEPSDEFIELD, domain, "filepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMCONTENTPSDEFIELD, domain, "imcontentpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBTASKURLPSDEFIELD, domain, "mobtaskurlpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGQUEUEPARAMS, domain, "msgqueueparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGQUEUETAG, domain, "msgqueuetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGQUEUETAG2, domain, "msgqueuetag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGQUEUETYPE, domain, "msgqueuetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTYPEPSDEFIELD, domain, "msgtypepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUTIL, domain, "pssysutildeid", net.ibizsys.model.res.IPSSysUtil.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSMSCONTENTPSDEFIELD, domain, "smscontentpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSENDTIMEPSDEFIELD, domain, "sendtimepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTATEPSDEFIELD, domain, "statepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTAG2PSDEFIELD, domain, "tag2psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTAGPSDEFIELD, domain, "tagpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTARGETPSDEFIELD, domain, "targetpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTARGETTYPEPSDEFIELD, domain, "targettypepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTASKURLPSDEFIELD, domain, "taskurlpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEPSDEFIELD, domain, "titlepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWXCONTENTPSDEFIELD, domain, "wxcontentpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}