package net.ibizsys.model.util.transpiler.system;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.system.PSSysRefImpl.*;



public class PSSysRefTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.system.PSSysRefImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.system.PSSysRefImpl realPSModelObject = (net.ibizsys.model.system.PSSysRefImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "refparam", realPSModelObject.getRefParam(), realPSModelObject, "getRefParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "refparam2", realPSModelObject.getRefParam2(), realPSModelObject, "getRefParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "syscodename", realPSModelObject.getSysCodeName(), realPSModelObject, "getSysCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "sysname", realPSModelObject.getSysName(), realPSModelObject, "getSysName");
		this.setDomainValue(iPSModelTranspileContext, domain, "syspkgname", realPSModelObject.getSysPkgName(), realPSModelObject, "getSysPkgName");
		this.setDomainValue(iPSModelTranspileContext, domain, "realsysid", realPSModelObject.getSysRefTag(), realPSModelObject, "getSysRefTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "sysreftype", realPSModelObject.getSysRefType(), realPSModelObject, "getSysRefType");
		this.setDomainValue(iPSModelTranspileContext, domain, "srvcodename", realPSModelObject.getSysSrvCodeName(), realPSModelObject, "getSysSrvCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "sysvcname", realPSModelObject.getSysVCName(), realPSModelObject, "getSysVCName");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPARAM, domain, "refparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPARAM2, domain, "refparam2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYSCODENAME, domain, "syscodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYSNAME, domain, "sysname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYSPKGNAME, domain, "syspkgname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYSREFTAG, domain, "realsysid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYSREFTYPE, domain, "sysreftype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYSSRVCODENAME, domain, "srvcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYSVCNAME, domain, "sysvcname", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}