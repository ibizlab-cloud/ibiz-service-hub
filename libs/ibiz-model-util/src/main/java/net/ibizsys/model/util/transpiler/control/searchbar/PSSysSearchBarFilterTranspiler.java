package net.ibizsys.model.util.transpiler.control.searchbar;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.searchbar.PSSysSearchBarFilterImpl.*;



public class PSSysSearchBarFilterTranspiler extends net.ibizsys.model.util.transpiler.control.searchbar.PSSysSearchBarItemTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.searchbar.PSSysSearchBarFilterImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.searchbar.PSSysSearchBarFilterImpl realPSModelObject = (net.ibizsys.model.control.searchbar.PSSysSearchBarFilterImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "labelrawcssstyle", realPSModelObject.getLabelCssStyle(), realPSModelObject, "getLabelCssStyle");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLABELCSSSTYLE, domain, "labelrawcssstyle", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}