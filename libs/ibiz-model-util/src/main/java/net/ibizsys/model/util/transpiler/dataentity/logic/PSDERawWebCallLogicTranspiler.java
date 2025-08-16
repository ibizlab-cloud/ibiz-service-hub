package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDERawWebCallLogicImpl.*;



public class PSDERawWebCallLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDERawWebCallLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDERawWebCallLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDERawWebCallLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param2", realPSModelObject.getBodyContentType(), realPSModelObject, "getBodyContentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssubsysserviceapiid", realPSModelObject.getPSSubSysServiceAPI(), realPSModelObject, "getPSSubSysServiceAPI");
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getRequestMethod(), realPSModelObject, "getRequestMethod");
		this.setDomainValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getRequestPath(), realPSModelObject, "getRequestPath");
		this.setDomainValue(iPSModelTranspileContext, domain, "retpsdlparamid", realPSModelObject.getRetPSDELogicParam(), realPSModelObject, "getRetPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "param7", realPSModelObject.isReturnRepEntity(), realPSModelObject, "isReturnRepEntity");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBODYCONTENTTYPE, domain, "param2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSUBSYSSERVICEAPI, domain, "pssubsysserviceapiid", net.ibizsys.model.service.IPSSubSysServiceAPI.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREQUESTMETHOD, domain, "param1", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREQUESTPATH, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETPSDELOGICPARAM, domain, "retpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISRETURNREPENTITY, domain, "param7", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}