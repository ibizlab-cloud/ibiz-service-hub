package net.ibizsys.model.util.transpiler.control.searchbar;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.searchbar.PSSysSearchBarGroupImpl.*;



public class PSSysSearchBarGroupTranspiler extends net.ibizsys.model.util.transpiler.control.searchbar.PSSysSearchBarItemTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.searchbar.PSSysSearchBarGroupImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.searchbar.PSSysSearchBarGroupImpl realPSModelObject = (net.ibizsys.model.control.searchbar.PSSysSearchBarGroupImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "tooltipinfo", realPSModelObject.getTooltip(), realPSModelObject, "getTooltip");
		this.setDomainValue(iPSModelTranspileContext, domain, "tippslanresid", realPSModelObject.getTooltipPSLanguageRes(), realPSModelObject, "getTooltipPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "addseparator", realPSModelObject.isAddSeparator(), realPSModelObject, "isAddSeparator");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.isDefaultGroup(), realPSModelObject, "isDefaultGroup");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIP, domain, "tooltipinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLTIPPSLANGUAGERES, domain, "tippslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", double.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISADDSEPARATOR, domain, "addseparator", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTGROUP, domain, "defaultflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}