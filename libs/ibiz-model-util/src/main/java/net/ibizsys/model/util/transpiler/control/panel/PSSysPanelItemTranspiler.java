package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSSysPanelItemImpl.*;



public class PSSysPanelItemTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSSysPanelItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSSysPanelItemImpl realPSModelObject = (net.ibizsys.model.control.panel.PSSysPanelItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "rawcssstyle", realPSModelObject.getCssStyle(), realPSModelObject, "getCssStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "dynaclass", realPSModelObject.getDynaClass(), realPSModelObject, "getDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "height", realPSModelObject.getHeight(), realPSModelObject, "getHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailstyle", realPSModelObject.getItemStyle(), realPSModelObject, "getItemStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "itemtype", realPSModelObject.getItemType(), realPSModelObject, "getItemType");
		this.setDomainValue(iPSModelTranspileContext, domain, "labelrawcssstyle", realPSModelObject.getLabelCssStyle(), realPSModelObject, "getLabelCssStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "labeldynaclass", realPSModelObject.getLabelDynaClass(), realPSModelObject, "getLabelDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "labelpssyscssid", realPSModelObject.getLabelPSSysCss(), realPSModelObject, "getLabelPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "showcaption", realPSModelObject.isShowCaption(), realPSModelObject, "isShowCaption");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCSSSTYLE, domain, "rawcssstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNACLASS, domain, "dynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHT, domain, "height", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMSTYLE, domain, "detailstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTYPE, domain, "itemtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELCSSSTYLE, domain, "labelrawcssstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELDYNACLASS, domain, "labeldynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELPSSYSCSS, domain, "labelpssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWCAPTION, domain, "showcaption", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}