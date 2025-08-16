package net.ibizsys.model.util.transpiler.dataentity.service;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.service.PSDEServiceAPIRSImpl.*;



public class PSDEServiceAPIRSTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.service.PSDEServiceAPIRSImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.service.PSDEServiceAPIRSImpl realPSModelObject = (net.ibizsys.model.dataentity.service.PSDEServiceAPIRSImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "ppsdeserviceapiid", realPSModelObject.getMajorPSDEServiceAPI(), realPSModelObject, "getMajorPSDEServiceAPI");
		this.setDomainValue(iPSModelTranspileContext, domain, "cpsdeserviceapiid", realPSModelObject.getMinorPSDEServiceAPI(), realPSModelObject, "getMinorPSDEServiceAPI");
		this.setDomainValue(iPSModelTranspileContext, domain, "psderid", realPSModelObject.getPSDER(), realPSModelObject, "getPSDER");
		this.setDomainValue(iPSModelTranspileContext, domain, "childfilter", realPSModelObject.getParentFilter(), realPSModelObject, "getParentFilter");
		this.setDomainValue(iPSModelTranspileContext, domain, "typefilter", realPSModelObject.getParentTypeFilter(), realPSModelObject, "getParentTypeFilter");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPSDESERVICEAPI, domain, "ppsdeserviceapiid", net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORPSDESERVICEAPI, domain, "cpsdeserviceapiid", net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDER, domain, "psderid", net.ibizsys.model.dataentity.der.IPSDERBase.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARENTFILTER, domain, "childfilter", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARENTTYPEFILTER, domain, "typefilter", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}