package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormButtonImpl.*;



public class PSDEFormButtonTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormDetailTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormButtonImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormButtonImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormButtonImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "btnactiontype", realPSModelObject.getActionType(), realPSModelObject, "getActionType");
		this.setDomainValue(iPSModelTranspileContext, domain, "borderstyle", realPSModelObject.getBorderStyle(), realPSModelObject, "getBorderStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailstyle", realPSModelObject.getButtonStyle(), realPSModelObject, "getButtonStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueitemname", realPSModelObject.getCaptionItemName(), realPSModelObject, "getCaptionItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconalign", realPSModelObject.getIconAlign(), realPSModelObject, "getIconAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefiupdateid", realPSModelObject.getPSDEFormItemUpdate(), realPSModelObject, "getPSDEFormItemUpdate");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuiactionid", realPSModelObject.getPSUIAction(), realPSModelObject, "getPSUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "pickuppsdeviewid", realPSModelObject.getParamPickupPSAppView(), realPSModelObject, "getParamPickupPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "editorparams", realPSModelObject.getParamViewParamJO(), realPSModelObject, "getParamViewParamJO");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONTYPE, domain, "btnactiontype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBORDERSTYLE, domain, "borderstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONSTYLE, domain, "detailstyle", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTIONITEMNAME, domain, "valueitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONALIGN, domain, "iconalign", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFORMITEMUPDATE, domain, "psdefiupdateid", net.ibizsys.model.control.form.IPSDEFormItemUpdate.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTION, domain, "psdeuiactionid", net.ibizsys.model.view.IPSUIAction.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMPICKUPPSAPPVIEW, domain, "pickuppsdeviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMVIEWPARAMJO, domain, "editorparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}