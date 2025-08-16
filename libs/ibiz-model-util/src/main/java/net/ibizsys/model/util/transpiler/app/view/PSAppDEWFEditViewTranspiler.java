package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDEWFEditViewImpl.*;



public class PSAppDEWFEditViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppDEEditViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDEWFEditViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDEWFEditViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppDEWFEditViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "wfviewparam3", realPSModelObject.getWFStepValue(), realPSModelObject, "getWFStepValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfviewparam", realPSModelObject.isWFIAMode(), realPSModelObject, "isWFIAMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFSTEPVALUE, domain, "wfviewparam3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISWFIAMODE, domain, "wfviewparam", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}