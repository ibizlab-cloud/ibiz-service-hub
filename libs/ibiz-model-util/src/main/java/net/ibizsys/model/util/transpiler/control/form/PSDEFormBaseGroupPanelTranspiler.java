package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormBaseGroupPanelImpl.*;



public class PSDEFormBaseGroupPanelTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormDetailTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormBaseGroupPanelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormBaseGroupPanelImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormBaseGroupPanelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "valueitemname", realPSModelObject.getCaptionItemName(), realPSModelObject, "getCaptionItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "rawcontent", realPSModelObject.getSubCaption(), realPSModelObject, "getSubCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableanchor", realPSModelObject.isEnableAnchor(), realPSModelObject, "isEnableAnchor");
		this.setDomainValue(iPSModelTranspileContext, domain, "allowempty", realPSModelObject.isHideEmptyItems(), realPSModelObject, "isHideEmptyItems");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecond", realPSModelObject.isInfoGroupMode(), realPSModelObject, "isInfoGroupMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTIONITEMNAME, domain, "valueitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBCAPTION, domain, "rawcontent", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEANCHOR, domain, "enableanchor", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISHIDEEMPTYITEMS, domain, "allowempty", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINFOGROUPMODE, domain, "enablecond", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}