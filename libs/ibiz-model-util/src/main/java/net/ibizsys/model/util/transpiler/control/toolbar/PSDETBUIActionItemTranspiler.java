package net.ibizsys.model.util.transpiler.control.toolbar;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.toolbar.PSDETBUIActionItemImpl.*;



public class PSDETBUIActionItemTranspiler extends net.ibizsys.model.util.transpiler.control.toolbar.PSDEToolbarItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.toolbar.PSDETBUIActionItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.toolbar.PSDETBUIActionItemImpl realPSModelObject = (net.ibizsys.model.control.toolbar.PSDETBUIActionItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "actionlevel", realPSModelObject.getActionLevel(), realPSModelObject, "getActionLevel");
		this.setDomainValue(iPSModelTranspileContext, domain, "borderstyle", realPSModelObject.getBorderStyle(), realPSModelObject, "getBorderStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "itemstyle", realPSModelObject.getButtonStyle(), realPSModelObject, "getButtonStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupextractmode", realPSModelObject.getGroupExtractMode(), realPSModelObject, "getGroupExtractMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "noprivdm", realPSModelObject.getNoPrivDisplayMode(), realPSModelObject, "getNoPrivDisplayMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuiactionid", realPSModelObject.getPSUIAction(), realPSModelObject, "getPSUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "tooltipinfo", realPSModelObject.getTooltip(), realPSModelObject, "getTooltip");
		this.setDomainValue(iPSModelTranspileContext, domain, "tippslanresid", realPSModelObject.getTooltipPSLanguageRes(), realPSModelObject, "getTooltipPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "hiddenitem", realPSModelObject.isHiddenItem(), realPSModelObject, "isHiddenItem");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONLEVEL, domain, "actionlevel", int.class, new String[]{"100"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBORDERSTYLE, domain, "borderstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONSTYLE, domain, "itemstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPEXTRACTMODE, domain, "groupextractmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNOPRIVDISPLAYMODE, domain, "noprivdm", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTION, domain, "psdeuiactionid", net.ibizsys.model.view.IPSUIAction.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIP, domain, "tooltipinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIPPSLANGUAGERES, domain, "tippslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISHIDDENITEM, domain, "hiddenitem", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}