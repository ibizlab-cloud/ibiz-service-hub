package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSSysPanelButtonImpl.*;



public class PSSysPanelButtonTranspiler extends net.ibizsys.model.util.transpiler.control.panel.PSSysPanelItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSSysPanelButtonImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSSysPanelButtonImpl realPSModelObject = (net.ibizsys.model.control.panel.PSSysPanelButtonImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "btnactiontype", realPSModelObject.getActionType(), realPSModelObject, "getActionType");
		this.setDomainValue(iPSModelTranspileContext, domain, "borderstyle", realPSModelObject.getBorderStyle(), realPSModelObject, "getBorderStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "rawcssstyle", realPSModelObject.getButtonCssStyle(), realPSModelObject, "getButtonCssStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailstyle", realPSModelObject.getButtonStyle(), realPSModelObject, "getButtonStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldname", realPSModelObject.getCaptionItemName(), realPSModelObject, "getCaptionItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconalign", realPSModelObject.getIconAlign(), realPSModelObject, "getIconAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuiactionid", realPSModelObject.getPSUIAction(), realPSModelObject, "getPSUIAction");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONTYPE, domain, "btnactiontype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBORDERSTYLE, domain, "borderstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONCSSSTYLE, domain, "rawcssstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONSTYLE, domain, "detailstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTIONITEMNAME, domain, "fieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONALIGN, domain, "iconalign", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTION, domain, "psdeuiactionid", net.ibizsys.model.view.IPSUIAction.class, true);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}