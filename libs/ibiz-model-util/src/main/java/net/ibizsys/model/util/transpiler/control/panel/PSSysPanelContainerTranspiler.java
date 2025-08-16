package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSSysPanelContainerImpl.*;



public class PSSysPanelContainerTranspiler extends net.ibizsys.model.util.transpiler.control.panel.PSSysPanelContainerTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSSysPanelContainerImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSSysPanelContainerImpl realPSModelObject = (net.ibizsys.model.control.panel.PSSysPanelContainerImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "itemparam4", realPSModelObject.getActionGroupExtractMode(), realPSModelObject, "getActionGroupExtractMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldname", realPSModelObject.getCaptionItemName(), realPSModelObject, "getCaptionItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuagroupid", realPSModelObject.getPSUIActionGroup(), realPSModelObject, "getPSUIActionGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "titlebarclosemode", realPSModelObject.getTitleBarCloseMode(), realPSModelObject, "getTitleBarCloseMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONGROUPEXTRACTMODE, domain, "itemparam4", java.lang.String.class, new String[]{"ITEM"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTIONITEMNAME, domain, "fieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTIONGROUP, domain, "psdeuagroupid", net.ibizsys.model.view.IPSUIActionGroup.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEBARCLOSEMODE, domain, "titlebarclosemode", int.class, new String[]{"0"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}