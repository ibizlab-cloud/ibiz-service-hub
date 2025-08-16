package net.ibizsys.model.util.transpiler.dataentity.service;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.service.PSDEServiceAPIMethodImpl.*;



public class PSDEServiceAPIMethodTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.service.PSDEServiceAPIMethodImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.service.PSDEServiceAPIMethodImpl realPSModelObject = (net.ibizsys.model.dataentity.service.PSDEServiceAPIMethodImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "detailparam", realPSModelObject.getMethodParam(), realPSModelObject, "getMethodParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailparam2", realPSModelObject.getMethodParam2(), realPSModelObject, "getMethodParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtype", realPSModelObject.getMethodType(), realPSModelObject, "getMethodType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getPSDEAction(), realPSModelObject, "getPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "requestmethod", realPSModelObject.getRequestMethod(), realPSModelObject, "getRequestMethod");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODPARAM, domain, "detailparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODPARAM2, domain, "detailparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODTYPE, domain, "detailtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEACTION, domain, "psdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREQUESTMETHOD, domain, "requestmethod", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}