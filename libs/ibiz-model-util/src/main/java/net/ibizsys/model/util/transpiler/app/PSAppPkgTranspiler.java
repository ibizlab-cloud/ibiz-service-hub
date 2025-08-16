package net.ibizsys.model.util.transpiler.app;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.PSAppPkgImpl.*;



public class PSAppPkgTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.PSAppPkgImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.PSAppPkgImpl realPSModelObject = (net.ibizsys.model.app.PSAppPkgImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pkgparam", realPSModelObject.getVerParam(), realPSModelObject, "getVerParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkgparam2", realPSModelObject.getVerParam2(), realPSModelObject, "getVerParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkgparam3", realPSModelObject.getVerParam3(), realPSModelObject, "getVerParam3");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkgparam4", realPSModelObject.getVerParam4(), realPSModelObject, "getVerParam4");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVERPARAM, domain, "pkgparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVERPARAM2, domain, "pkgparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVERPARAM3, domain, "pkgparam3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVERPARAM4, domain, "pkgparam4", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}