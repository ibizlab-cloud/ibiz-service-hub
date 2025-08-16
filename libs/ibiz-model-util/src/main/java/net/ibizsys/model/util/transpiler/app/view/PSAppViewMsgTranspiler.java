package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppViewMsgImpl.*;



public class PSAppViewMsgTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppViewMsgImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppViewMsgImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppViewMsgImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "contentpslanresid", realPSModelObject.getContentPSLanguageRes(), realPSModelObject, "getContentPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "contenttype", realPSModelObject.getContentType(), realPSModelObject, "getContentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "dynamicmode", realPSModelObject.getDynamicMode(), realPSModelObject, "getDynamicMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablemode", realPSModelObject.getEnableMode(), realPSModelObject, "getEnableMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtype", realPSModelObject.getMessageType(), realPSModelObject, "getMessageType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgtemplid", realPSModelObject.getPSAppMsgTempl(), realPSModelObject, "getPSAppMsgTempl");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgpos", realPSModelObject.getPosition(), realPSModelObject, "getPosition");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableremove", realPSModelObject.getRemoveMode(), realPSModelObject, "getRemoveMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "testpsdelogicid", realPSModelObject.getTestPSAppDELogic(), realPSModelObject, "getTestPSAppDELogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "testcustomcode", realPSModelObject.getTestScriptCode(), realPSModelObject, "getTestScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "title", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "titlepslanresid", realPSModelObject.getTitlePSLanguageRes(), realPSModelObject, "getTitlePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableremove", realPSModelObject.isEnableRemove(), realPSModelObject, "isEnableRemove");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTPSLANGUAGERES, domain, "contentpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTTYPE, domain, "contenttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNAMICMODE, domain, "dynamicmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLEMODE, domain, "enablemode", java.lang.String.class, new String[]{"ALL"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMESSAGETYPE, domain, "msgtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPMSGTEMPL, domain, "pssysmsgtemplid", net.ibizsys.model.app.msg.IPSAppMsgTempl.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPOSITION, domain, "msgpos", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEMODE, domain, "enableremove", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTPSAPPDELOGIC, domain, "testpsdelogicid", net.ibizsys.model.app.dataentity.IPSAppDELogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTSCRIPTCODE, domain, "testcustomcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "title", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEPSLANGUAGERES, domain, "titlepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEREMOVE, domain, "enableremove", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}