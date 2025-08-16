package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDEWFActionViewImpl.*;



public class PSAppDEWFActionViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppDEEditViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDEWFActionViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDEWFActionViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppDEWFActionViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "openmode", realPSModelObject.getOpenMode(), realPSModelObject, "getOpenMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfviewparam4", realPSModelObject.getWFUtilType(), realPSModelObject, "getWFUtilType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOPENMODE, domain, "openmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFUTILTYPE, domain, "wfviewparam4", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}