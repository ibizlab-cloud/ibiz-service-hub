package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppViewImpl.*;



public class PSAppViewTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "accusermode", realPSModelObject.getAccUserMode(), realPSModelObject, "getAccUserMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuniresid", realPSModelObject.getAccessKey(), realPSModelObject, "getAccessKey");
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "psappviewname", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psapplocaldeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "psappmoduleid", realPSModelObject.getPSAppModule(), realPSModelObject, "getPSAppModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "psviewmsggroupid", realPSModelObject.getPSAppViewMsgGroup(), realPSModelObject, "getPSAppViewMsgGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "subcappslanresid", realPSModelObject.getSubCapPSLanguageRes(), realPSModelObject, "getSubCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "subcaption", realPSModelObject.getSubCaption(), realPSModelObject, "getSubCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "title", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "psappviewtype", realPSModelObject.getViewType(), realPSModelObject, "getViewType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACCUSERMODE, domain, "accusermode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACCESSKEY, domain, "pssysuniresid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "psappviewname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psapplocaldeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPMODULE, domain, "psappmoduleid", net.ibizsys.model.app.IPSAppModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPVIEWMSGGROUP, domain, "psviewmsggroupid", net.ibizsys.model.app.view.IPSAppViewMsgGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBCAPPSLANGUAGERES, domain, "subcappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBCAPTION, domain, "subcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "title", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWTYPE, domain, "psappviewtype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}