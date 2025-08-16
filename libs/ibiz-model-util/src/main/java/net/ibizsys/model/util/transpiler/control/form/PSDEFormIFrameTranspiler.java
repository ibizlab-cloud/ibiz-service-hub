package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormIFrameImpl.*;



public class PSDEFormIFrameTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormDetailTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormIFrameImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormIFrameImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormIFrameImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "editorparams", realPSModelObject.getIFrameUrl(), realPSModelObject, "getIFrameUrl");
		this.setDomainValue(iPSModelTranspileContext, domain, "linkpsdeviewid", realPSModelObject.getLinkPSAppView(), realPSModelObject, "getLinkPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "resetitemname", realPSModelObject.getRefreshItems(), realPSModelObject, "getRefreshItems");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIFRAMEURL, domain, "editorparams", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLINKPSAPPVIEW, domain, "linkpsdeviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFRESHITEMS, domain, "resetitemname", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}