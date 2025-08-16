package net.ibizsys.model.util.transpiler.control.toolbar;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.toolbar.PSDEToolbarItemImpl.*;



public class PSDEToolbarItemTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.toolbar.PSDEToolbarItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.toolbar.PSDEToolbarItemImpl realPSModelObject = (net.ibizsys.model.control.toolbar.PSDEToolbarItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "counterid", realPSModelObject.getCounterId(), realPSModelObject, "getCounterId");
		this.setDomainValue(iPSModelTranspileContext, domain, "countermode", realPSModelObject.getCounterMode(), realPSModelObject, "getCounterMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "rawcssstyle", realPSModelObject.getCssStyle(), realPSModelObject, "getCssStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "data", realPSModelObject.getData(), realPSModelObject, "getData");
		this.setDomainValue(iPSModelTranspileContext, domain, "dynaclass", realPSModelObject.getDynaClass(), realPSModelObject, "getDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "height", realPSModelObject.getHeight(), realPSModelObject, "getHeight", new String[]{"0.0"});
		this.setDomainValue(iPSModelTranspileContext, domain, "tbitemtype", realPSModelObject.getItemType(), realPSModelObject, "getItemType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "tooltipinfo", realPSModelObject.getTooltip(), realPSModelObject, "getTooltip");
		this.setDomainValue(iPSModelTranspileContext, domain, "tippslanresid", realPSModelObject.getTooltipPSLanguageRes(), realPSModelObject, "getTooltipPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "usertag", realPSModelObject.getUserTag(), realPSModelObject, "getUserTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "usertag2", realPSModelObject.getUserTag2(), realPSModelObject, "getUserTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth", new String[]{"0.0"});
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERID, domain, "counterid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERMODE, domain, "countermode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCSSSTYLE, domain, "rawcssstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATA, domain, "data", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNACLASS, domain, "dynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHT, domain, "height", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTYPE, domain, "tbitemtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIP, domain, "tooltipinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIPPSLANGUAGERES, domain, "tippslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERTAG, domain, "usertag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERTAG2, domain, "usertag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWCAPTION, domain, "showmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWICON, domain, "showmode", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}