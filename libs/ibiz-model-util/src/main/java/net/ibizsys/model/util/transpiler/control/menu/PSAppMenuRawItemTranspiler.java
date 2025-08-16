package net.ibizsys.model.util.transpiler.control.menu;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.menu.PSAppMenuRawItemImpl.*;



public class PSAppMenuRawItemTranspiler extends net.ibizsys.model.util.transpiler.control.menu.PSAppMenuItemTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.menu.PSAppMenuRawItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.menu.PSAppMenuRawItemImpl realPSModelObject = (net.ibizsys.model.control.menu.PSAppMenuRawItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "contenttype", realPSModelObject.getContentType(), realPSModelObject, "getContentType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTTYPE, domain, "contenttype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}