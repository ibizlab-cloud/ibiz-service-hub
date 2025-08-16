package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSSysPortletImpl.*;



public class PSSysPortletTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSSysPortletImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSSysPortletImpl realPSModelObject = (net.ibizsys.model.res.PSSysPortletImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "groupextractmode", realPSModelObject.getActionGroupExtractMode(), realPSModelObject, "getActionGroupExtractMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytext", realPSModelObject.getEmptyText(), realPSModelObject, "getEmptyText");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytextpslanresid", realPSModelObject.getEmptyTextPSLanguageRes(), realPSModelObject, "getEmptyTextPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "height", realPSModelObject.getHeight(), realPSModelObject, "getHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuniresid", realPSModelObject.getPSSysUniRes(), realPSModelObject, "getPSSysUniRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "portletparams", realPSModelObject.getPortletParams(), realPSModelObject, "getPortletParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "portletstyle", realPSModelObject.getPortletStyle(), realPSModelObject, "getPortletStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "portlettype", realPSModelObject.getPortletType(), realPSModelObject, "getPortletType");
		this.setDomainValue(iPSModelTranspileContext, domain, "reloadtimer", realPSModelObject.getReloadTimer(), realPSModelObject, "getReloadTimer");
		this.setDomainValue(iPSModelTranspileContext, domain, "templengine", realPSModelObject.getTemplEngine(), realPSModelObject, "getTemplEngine");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "titlepslanresid", realPSModelObject.getTitlePSLanguageRes(), realPSModelObject, "getTitlePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "dashboardscope", realPSModelObject.isEnableAppDashboard(), realPSModelObject, "isEnableAppDashboard");
		this.setDomainValue(iPSModelTranspileContext, domain, "dashboardscope", realPSModelObject.isEnableDEDashboard(), realPSModelObject, "isEnableDEDashboard");
		this.setDomainValue(iPSModelTranspileContext, domain, "showtitlebar", realPSModelObject.isShowTitleBar(), realPSModelObject, "isShowTitleBar");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONGROUPEXTRACTMODE, domain, "groupextractmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXT, domain, "emptytext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXTPSLANGUAGERES, domain, "emptytextpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHT, domain, "height", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUNIRES, domain, "pssysuniresid", net.ibizsys.model.security.IPSSysUniRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPORTLETPARAMS, domain, "portletparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPORTLETSTYLE, domain, "portletstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPORTLETTYPE, domain, "portlettype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRELOADTIMER, domain, "reloadtimer", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEMPLENGINE, domain, "templengine", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEPSLANGUAGERES, domain, "titlepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEAPPDASHBOARD, domain, "dashboardscope", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEDEDASHBOARD, domain, "dashboardscope", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWTITLEBAR, domain, "showtitlebar", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}