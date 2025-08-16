package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDEViewImpl.*;



public class PSAppDEViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDEViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDEViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppDEViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "accusermode", realPSModelObject.getAccUserMode(), realPSModelObject, "getAccUserMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "height", realPSModelObject.getHeight(), realPSModelObject, "getHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "openmode", realPSModelObject.getOpenMode(), realPSModelObject, "getOpenMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewbaseid", realPSModelObject.getPSDEViewId(), realPSModelObject, "getPSDEViewId");
		this.setDomainValue(iPSModelTranspileContext, domain, "subcappslanresid", realPSModelObject.getSubCapPSLanguageRes(), realPSModelObject, "getSubCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "subcaption", realPSModelObject.getSubCaption(), realPSModelObject, "getSubCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "tempmode", realPSModelObject.getTempMode(), realPSModelObject, "getTempMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "title", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "titlepslanresid", realPSModelObject.getTitlePSLanguageRes(), realPSModelObject, "getTitlePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "showcaptionbar", realPSModelObject.isShowCaptionBar(), realPSModelObject, "isShowCaptionBar");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACCUSERMODE, domain, "accusermode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHT, domain, "height", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOPENMODE, domain, "openmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEVIEWID, domain, "psdeviewbaseid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBCAPPSLANGUAGERES, domain, "subcappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBCAPTION, domain, "subcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEMPMODE, domain, "tempmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "title", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEPSLANGUAGERES, domain, "titlepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWCAPTIONBAR, domain, "showcaptionbar", boolean.class, new String[]{"true"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}