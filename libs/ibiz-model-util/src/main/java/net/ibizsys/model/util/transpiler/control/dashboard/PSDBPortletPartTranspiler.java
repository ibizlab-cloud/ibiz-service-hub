package net.ibizsys.model.util.transpiler.control.dashboard;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.dashboard.PSDBPortletPartImpl.*;



public class PSDBPortletPartTranspiler extends net.ibizsys.model.util.transpiler.control.PSAjaxControlContainerTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.dashboard.PSDBPortletPartImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.dashboard.PSDBPortletPartImpl realPSModelObject = (net.ibizsys.model.control.dashboard.PSDBPortletPartImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "height", realPSModelObject.getHeight(), realPSModelObject, "getHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "title", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		this.setDomainValue(iPSModelTranspileContext, domain, "titlebarclosemode", realPSModelObject.getTitleBarCloseMode(), realPSModelObject, "getTitleBarCloseMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "titlepslanresid", realPSModelObject.getTitlePSLanguageRes(), realPSModelObject, "getTitlePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "showtitlebar", realPSModelObject.isShowTitleBar(), realPSModelObject, "isShowTitleBar");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHEIGHT, domain, "height", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "title", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEBARCLOSEMODE, domain, "titlebarclosemode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLEPSLANGUAGERES, domain, "titlepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWTITLEBAR, domain, "showtitlebar", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}