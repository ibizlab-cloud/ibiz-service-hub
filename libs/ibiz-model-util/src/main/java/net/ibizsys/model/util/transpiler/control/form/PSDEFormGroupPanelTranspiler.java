package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormGroupPanelImpl.*;



public class PSDEFormGroupPanelTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormBaseGroupPanelTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormGroupPanelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormGroupPanelImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormGroupPanelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "updatedvt", realPSModelObject.getActionGroupExtractMode(), realPSModelObject, "getActionGroupExtractMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "buildinaction", realPSModelObject.getBuildInActions(), realPSModelObject, "getBuildInActions");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuagroupid", realPSModelObject.getPSUIActionGroup(), realPSModelObject, "getPSUIActionGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "titlebarclosemode", realPSModelObject.getTitleBarCloseMode(), realPSModelObject, "getTitleBarCloseMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecond", realPSModelObject.isInfoGroupMode(), realPSModelObject, "isInfoGroupMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONGROUPEXTRACTMODE, domain, "updatedvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUILDINACTIONS, domain, "buildinaction", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTIONGROUP, domain, "psdeuagroupid", net.ibizsys.model.view.IPSUIActionGroup.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEBARCLOSEMODE, domain, "titlebarclosemode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINFOGROUPMODE, domain, "enablecond", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}