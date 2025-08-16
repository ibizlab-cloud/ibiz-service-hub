package net.ibizsys.model.util.transpiler.control.drctrl;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.drctrl.PSDEDRCtrlImpl.*;



public class PSDEDRCtrlTranspiler extends net.ibizsys.model.util.transpiler.control.PSAjaxControlContainerTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.drctrl.PSDEDRCtrlImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.drctrl.PSDEDRCtrlImpl realPSModelObject = (net.ibizsys.model.control.drctrl.PSDEDRCtrlImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "drtag", realPSModelObject.getDataRelationTag(), realPSModelObject, "getDataRelationTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "formcappslanresid", realPSModelObject.getEditItemCapPSLanguageRes(), realPSModelObject, "getEditItemCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "formcaption", realPSModelObject.getEditItemCaption(), realPSModelObject, "getEditItemCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "formpssysimageid", realPSModelObject.getEditItemPSSysImage(), realPSModelObject, "getEditItemPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "formpsdeviewbaseid", realPSModelObject.getFormPSAppView(), realPSModelObject, "getFormPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "hideedititem", realPSModelObject.isHideEditItem(), realPSModelObject, "isHideEditItem");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATARELATIONTAG, domain, "drtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITITEMCAPPSLANGUAGERES, domain, "formcappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITITEMCAPTION, domain, "formcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITITEMPSSYSIMAGE, domain, "formpssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMPSAPPVIEW, domain, "formpsdeviewbaseid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISHIDEEDITITEM, domain, "hideedititem", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}