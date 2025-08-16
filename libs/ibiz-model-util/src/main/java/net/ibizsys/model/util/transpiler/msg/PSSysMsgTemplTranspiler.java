package net.ibizsys.model.util.transpiler.msg;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.msg.PSSysMsgTemplImpl.*;



public class PSSysMsgTemplTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.msg.PSSysMsgTemplImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.msg.PSSysMsgTemplImpl realPSModelObject = (net.ibizsys.model.msg.PSSysMsgTemplImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "content", realPSModelObject.getContent(), realPSModelObject, "getContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "contentpslanresid", realPSModelObject.getContentPSLanguageRes(), realPSModelObject, "getContentPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "contenttype", realPSModelObject.getContentType(), realPSModelObject, "getContentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "ddcontent", realPSModelObject.getDDContent(), realPSModelObject, "getDDContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "ddpslanresid", realPSModelObject.getDDPSLanguageRes(), realPSModelObject, "getDDPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "imcontent", realPSModelObject.getIMContent(), realPSModelObject, "getIMContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "impslanresid", realPSModelObject.getIMPSLanguageRes(), realPSModelObject, "getIMPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobtaskurl", realPSModelObject.getMobTaskUrl(), realPSModelObject, "getMobTaskUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtemplparams", realPSModelObject.getMsgTemplParams(), realPSModelObject, "getMsgTemplParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtempltag", realPSModelObject.getMsgTemplTag(), realPSModelObject, "getMsgTemplTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtempltag2", realPSModelObject.getMsgTemplTag2(), realPSModelObject, "getMsgTemplTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtempltype", realPSModelObject.getMsgTemplType(), realPSModelObject, "getMsgTemplType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "smscontent", realPSModelObject.getSMSContent(), realPSModelObject, "getSMSContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "smspslanresid", realPSModelObject.getSMSPSLanguageRes(), realPSModelObject, "getSMSPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "custommode", realPSModelObject.getScriptMode(), realPSModelObject, "getScriptMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "subpslanresid", realPSModelObject.getSubPSLanguageRes(), realPSModelObject, "getSubPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "subject", realPSModelObject.getSubject(), realPSModelObject, "getSubject");
		this.setDomainValue(iPSModelTranspileContext, domain, "taskurl", realPSModelObject.getTaskUrl(), realPSModelObject, "getTaskUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "templengine", realPSModelObject.getTemplEngine(), realPSModelObject, "getTemplEngine");
		this.setDomainValue(iPSModelTranspileContext, domain, "wccontent", realPSModelObject.getWXContent(), realPSModelObject, "getWXContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "wxpslanresid", realPSModelObject.getWXPSLanguageRes(), realPSModelObject, "getWXPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "mailgroupsend", realPSModelObject.isMailGroupSend(), realPSModelObject, "isMailGroupSend");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENT, domain, "content", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTPSLANGUAGERES, domain, "contentpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTTYPE, domain, "contenttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDDCONTENT, domain, "ddcontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDDPSLANGUAGERES, domain, "ddpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMCONTENT, domain, "imcontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMPSLANGUAGERES, domain, "impslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBTASKURL, domain, "mobtaskurl", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTEMPLPARAMS, domain, "msgtemplparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTEMPLTAG, domain, "msgtempltag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTEMPLTAG2, domain, "msgtempltag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTEMPLTYPE, domain, "msgtempltype", java.lang.String.class, new String[]{"STATIC"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSMSCONTENT, domain, "smscontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSMSPSLANGUAGERES, domain, "smspslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTMODE, domain, "custommode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBPSLANGUAGERES, domain, "subpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBJECT, domain, "subject", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTASKURL, domain, "taskurl", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEMPLENGINE, domain, "templengine", java.lang.String.class, new String[]{"FREEMARKER"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWXCONTENT, domain, "wccontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWXPSLANGUAGERES, domain, "wxpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMAILGROUPSEND, domain, "mailgroupsend", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}