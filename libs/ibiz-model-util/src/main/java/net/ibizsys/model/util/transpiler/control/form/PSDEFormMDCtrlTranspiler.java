package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormMDCtrlImpl.*;



public class PSDEFormMDCtrlTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormBaseGroupPanelTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormMDCtrlImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormMDCtrlImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormMDCtrlImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "updatedvt", realPSModelObject.getActionGroupExtractMode(), realPSModelObject, "getActionGroupExtractMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "buildinaction", realPSModelObject.getBuildInActions(), realPSModelObject, "getBuildInActions");
		this.setDomainValue(iPSModelTranspileContext, domain, "mdctrltype", realPSModelObject.getContentType(), realPSModelObject, "getContentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldname", realPSModelObject.getFieldName(), realPSModelObject, "getFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSAppDEField(), realPSModelObject, "getPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefiupdateid", realPSModelObject.getPSDEFormItemUpdate(), realPSModelObject, "getPSDEFormItemUpdate");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuagroupid", realPSModelObject.getPSUIActionGroup(), realPSModelObject, "getPSUIActionGroup");
		this.setDomainListValue(iPSModelTranspileContext, domain, "resetitemname", realPSModelObject.getResetItemNames(), realPSModelObject, "getResetItemNames", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "titlebarclosemode", realPSModelObject.getTitleBarCloseMode(), realPSModelObject, "getTitleBarCloseMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONGROUPEXTRACTMODE, domain, "updatedvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUILDINACTIONS, domain, "buildinaction", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTTYPE, domain, "mdctrltype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDNAME, domain, "fieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEFIELD, domain, "psdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFORMITEMUPDATE, domain, "psdefiupdateid", net.ibizsys.model.control.form.IPSDEFormItemUpdate.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTIONGROUP, domain, "psdeuagroupid", net.ibizsys.model.view.IPSUIActionGroup.class, true);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETRESETITEMNAMES, domain, "resetitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEBARCLOSEMODE, domain, "titlebarclosemode", int.class, new String[]{"0"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}