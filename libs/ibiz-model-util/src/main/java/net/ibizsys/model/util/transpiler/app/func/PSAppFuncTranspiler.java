package net.ibizsys.model.util.transpiler.app.func;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.func.PSAppFuncImpl.*;



public class PSAppFuncTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.func.PSAppFuncImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.func.PSAppFuncImpl realPSModelObject = (net.ibizsys.model.app.func.PSAppFuncImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "appfunctype", realPSModelObject.getAppFuncType(), realPSModelObject, "getAppFuncType");
		this.setDomainValue(iPSModelTranspileContext, domain, "funcsn", realPSModelObject.getFuncSN(), realPSModelObject, "getFuncSN");
		this.setDomainValue(iPSModelTranspileContext, domain, "pageurl", realPSModelObject.getHtmlPageUrl(), realPSModelObject, "getHtmlPageUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "jscode", realPSModelObject.getJSCode(), realPSModelObject, "getJSCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "namepslanresid", realPSModelObject.getNamePSLanguageRes(), realPSModelObject, "getNamePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "openmode", realPSModelObject.getOpenMode(), realPSModelObject, "getOpenMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "openviewparam", realPSModelObject.getOpenViewParam(), realPSModelObject, "getOpenViewParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeacmodeid", realPSModelObject.getPSAppDEACMode(), realPSModelObject, "getPSAppDEACMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psapplocaldeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "psappviewid", realPSModelObject.getPSAppView(), realPSModelObject, "getPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "pspdtappfuncid", realPSModelObject.getPSPDTAppFuncId(), realPSModelObject, "getPSPDTAppFuncId");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuiactionid", realPSModelObject.getPSUIAction(), realPSModelObject, "getPSUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtypeparam", realPSModelObject.getPredefinedTypeParam(), realPSModelObject, "getPredefinedTypeParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "tooltipinfo", realPSModelObject.getTooltip(), realPSModelObject, "getTooltip");
		this.setDomainValue(iPSModelTranspileContext, domain, "tippslanresid", realPSModelObject.getTooltipPSLanguageRes(), realPSModelObject, "getTooltipPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata", realPSModelObject.getUserData(), realPSModelObject, "getUserData");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata2", realPSModelObject.getUserData2(), realPSModelObject, "getUserData2");
		this.setDomainValue(iPSModelTranspileContext, domain, "systemflag", realPSModelObject.isSystemReserved(), realPSModelObject, "isSystemReserved");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPPFUNCTYPE, domain, "appfunctype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFUNCSN, domain, "funcsn", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHTMLPAGEURL, domain, "pageurl", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETJSCODE, domain, "jscode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAMEPSLANGUAGERES, domain, "namepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOPENMODE, domain, "openmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOPENVIEWPARAM, domain, "openviewparam", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEACMODE, domain, "psdeacmodeid", net.ibizsys.model.app.dataentity.IPSAppDEACMode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psapplocaldeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPVIEW, domain, "psappviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSPDTAPPFUNCID, domain, "pspdtappfuncid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTION, domain, "psdeuiactionid", net.ibizsys.model.view.IPSUIAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPEPARAM, domain, "predefinedtypeparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIP, domain, "tooltipinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIPPSLANGUAGERES, domain, "tippslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA, domain, "userdata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA2, domain, "userdata2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSYSTEMRESERVED, domain, "systemflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}