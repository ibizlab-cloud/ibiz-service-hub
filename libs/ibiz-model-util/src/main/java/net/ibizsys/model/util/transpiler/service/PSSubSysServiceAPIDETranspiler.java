package net.ibizsys.model.util.transpiler.service;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.service.PSSubSysServiceAPIDEImpl.*;



public class PSSubSysServiceAPIDETranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.service.PSSubSysServiceAPIDEImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.service.PSSubSysServiceAPIDEImpl realPSModelObject = (net.ibizsys.model.service.PSSubSysServiceAPIDEImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "majorflag", realPSModelObject.getAPIMode(), realPSModelObject, "getAPIMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "detag", realPSModelObject.getDETag(), realPSModelObject, "getDETag");
		this.setDomainValue(iPSModelTranspileContext, domain, "detag2", realPSModelObject.getDETag2(), realPSModelObject, "getDETag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "methodcode", realPSModelObject.getMethodScriptCode(), realPSModelObject, "getMethodScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam", realPSModelObject.getServiceParam(), realPSModelObject, "getServiceParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam2", realPSModelObject.getServiceParam2(), realPSModelObject, "getServiceParam2");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPIMODE, domain, "majorflag", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAG, domain, "detag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAG2, domain, "detag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODSCRIPTCODE, domain, "methodcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM, domain, "serviceparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM2, domain, "serviceparam2", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}