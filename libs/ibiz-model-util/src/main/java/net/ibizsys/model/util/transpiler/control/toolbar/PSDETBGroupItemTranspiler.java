package net.ibizsys.model.util.transpiler.control.toolbar;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.toolbar.PSDETBGroupItemImpl.*;



public class PSDETBGroupItemTranspiler extends net.ibizsys.model.util.transpiler.control.toolbar.PSDEToolbarItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.toolbar.PSDETBGroupItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.toolbar.PSDETBGroupItemImpl realPSModelObject = (net.ibizsys.model.control.toolbar.PSDETBGroupItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "actionlevel", realPSModelObject.getActionLevel(), realPSModelObject, "getActionLevel");
		this.setDomainValue(iPSModelTranspileContext, domain, "borderstyle", realPSModelObject.getBorderStyle(), realPSModelObject, "getBorderStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "itemstyle", realPSModelObject.getButtonStyle(), realPSModelObject, "getButtonStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupextractmode", realPSModelObject.getGroupExtractMode(), realPSModelObject, "getGroupExtractMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuagroupid", realPSModelObject.getPSUIActionGroup(), realPSModelObject, "getPSUIActionGroup");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONLEVEL, domain, "actionlevel", int.class, new String[]{"100"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBORDERSTYLE, domain, "borderstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONSTYLE, domain, "itemstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPEXTRACTMODE, domain, "groupextractmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTIONGROUP, domain, "psdeuagroupid", net.ibizsys.model.view.IPSUIActionGroup.class, true);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}