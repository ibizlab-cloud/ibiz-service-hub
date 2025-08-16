package net.ibizsys.model.util.transpiler.app.theme;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.theme.PSAppUIThemeImpl.*;



public class PSAppUIThemeTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.theme.PSAppUIThemeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.theme.PSAppUIThemeImpl realPSModelObject = (net.ibizsys.model.app.theme.PSAppUIThemeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cssstyle", realPSModelObject.getCssStyle(), realPSModelObject, "getCssStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "themedesc", realPSModelObject.getThemeDesc(), realPSModelObject, "getThemeDesc");
		this.setDomainValue(iPSModelTranspileContext, domain, "themeparams", realPSModelObject.getThemeParams(), realPSModelObject, "getThemeParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "themetag", realPSModelObject.getThemeTag(), realPSModelObject, "getThemeTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "themeurl", realPSModelObject.getThemeUrl(), realPSModelObject, "getThemeUrl");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCSSSTYLE, domain, "cssstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTHEMEDESC, domain, "themedesc", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTHEMEPARAMS, domain, "themeparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTHEMETAG, domain, "themetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTHEMEURL, domain, "themeurl", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}