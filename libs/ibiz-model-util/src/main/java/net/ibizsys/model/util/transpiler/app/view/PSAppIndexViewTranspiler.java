package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppIndexViewImpl.*;



public class PSAppIndexViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppIndexViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppIndexViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppIndexViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "appiconpath", realPSModelObject.getAppIconPath(), realPSModelObject, "getAppIconPath");
		this.setDomainValue(iPSModelTranspileContext, domain, "appiconpath2", realPSModelObject.getAppIconPath2(), realPSModelObject, "getAppIconPath2");
		this.setDomainValue(iPSModelTranspileContext, domain, "appswitchmode", realPSModelObject.getAppSwitchMode(), realPSModelObject, "getAppSwitchMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "mainmenuside", realPSModelObject.getMainMenuAlign(), realPSModelObject, "getMainMenuAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "subcaption", realPSModelObject.getSubCaption(), realPSModelObject, "getSubCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "title", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "blankmode", realPSModelObject.isBlankMode(), realPSModelObject, "isBlankMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultpage", realPSModelObject.isDefaultPage(), realPSModelObject, "isDefaultPage");
		this.setDomainValue(iPSModelTranspileContext, domain, "appswitchmode", realPSModelObject.isEnableAppSwitch(), realPSModelObject, "isEnableAppSwitch");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPPICONPATH, domain, "appiconpath", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPPICONPATH2, domain, "appiconpath2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPPSWITCHMODE, domain, "appswitchmode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAINMENUALIGN, domain, "mainmenuside", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBCAPTION, domain, "subcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "title", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISBLANKMODE, domain, "blankmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTPAGE, domain, "defaultpage", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEAPPSWITCH, domain, "appswitchmode", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}