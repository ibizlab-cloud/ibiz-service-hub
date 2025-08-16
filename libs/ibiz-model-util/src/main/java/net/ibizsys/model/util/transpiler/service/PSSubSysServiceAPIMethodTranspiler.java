package net.ibizsys.model.util.transpiler.service;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.service.PSSubSysServiceAPIMethodImpl.*;



public class PSSubSysServiceAPIMethodTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.service.PSSubSysServiceAPIMethodImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.service.PSSubSysServiceAPIMethodImpl realPSModelObject = (net.ibizsys.model.service.PSSubSysServiceAPIMethodImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aftercode", realPSModelObject.getAfterCode(), realPSModelObject, "getAfterCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "requestcontenttype", realPSModelObject.getBodyContentType(), realPSModelObject, "getBodyContentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailparam", realPSModelObject.getMethodParam(), realPSModelObject, "getMethodParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailparam2", realPSModelObject.getMethodParam2(), realPSModelObject, "getMethodParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "methodcode", realPSModelObject.getMethodScriptCode(), realPSModelObject, "getMethodScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtag", realPSModelObject.getMethodTag(), realPSModelObject, "getMethodTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtag2", realPSModelObject.getMethodTag2(), realPSModelObject, "getMethodTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtype", realPSModelObject.getMethodType(), realPSModelObject, "getMethodType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssubsyssadeid", realPSModelObject.getPSSubSysServiceAPIDE(), realPSModelObject, "getPSSubSysServiceAPIDE");
		this.setDomainValue(iPSModelTranspileContext, domain, "requestmethod", realPSModelObject.getRequestMethod(), realPSModelObject, "getRequestMethod");
		this.setDomainValue(iPSModelTranspileContext, domain, "requestparamtype", realPSModelObject.getRequestParamType(), realPSModelObject, "getRequestParamType");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceurl", realPSModelObject.getRequestPath(), realPSModelObject, "getRequestPath");
		this.setDomainValue(iPSModelTranspileContext, domain, "retvaltype", realPSModelObject.getReturnValueType(), realPSModelObject, "getReturnValueType");
		this.setDomainValue(iPSModelTranspileContext, domain, "needresourcekey", realPSModelObject.isNeedResourceKey(), realPSModelObject, "isNeedResourceKey");
		this.setDomainValue(iPSModelTranspileContext, domain, "noservicecodename", realPSModelObject.isNoServiceCodeName(), realPSModelObject, "isNoServiceCodeName");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAFTERCODE, domain, "aftercode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBODYCONTENTTYPE, domain, "requestcontenttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODPARAM, domain, "detailparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODPARAM2, domain, "detailparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODSCRIPTCODE, domain, "methodcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODTAG, domain, "detailtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODTAG2, domain, "detailtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMETHODTYPE, domain, "detailtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSUBSYSSERVICEAPIDE, domain, "pssubsyssadeid", net.ibizsys.model.service.IPSSubSysServiceAPIDE.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREQUESTMETHOD, domain, "requestmethod", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREQUESTPARAMTYPE, domain, "requestparamtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREQUESTPATH, domain, "serviceurl", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETURNVALUETYPE, domain, "retvaltype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNEEDRESOURCEKEY, domain, "needresourcekey", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNOSERVICECODENAME, domain, "noservicecodename", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}