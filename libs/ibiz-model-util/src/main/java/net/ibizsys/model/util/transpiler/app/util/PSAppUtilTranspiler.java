package net.ibizsys.model.util.transpiler.app.util;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.util.PSAppUtilImpl.*;



public class PSAppUtilTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.util.PSAppUtilImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.util.PSAppUtilImpl realPSModelObject = (net.ibizsys.model.app.util.PSAppUtilImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "utilparams", realPSModelObject.getUtilParams(), realPSModelObject, "getUtilParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "utiltag", realPSModelObject.getUtilTag(), realPSModelObject, "getUtilTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "utiltype", realPSModelObject.getUtilType(), realPSModelObject, "getUtilType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPARAMS, domain, "utilparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILTAG, domain, "utiltag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILTYPE, domain, "utiltype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}