package net.ibizsys.model.util.transpiler.security;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.security.PSSysUserModeImpl.*;



public class PSSysUserModeTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.security.PSSysUserModeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.security.PSSysUserModeImpl realPSModelObject = (net.ibizsys.model.security.PSSysUserModeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "usermodesn", realPSModelObject.getUserModeSN(), realPSModelObject, "getUserModeSN");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysusermodename", realPSModelObject.getUserModeTag(), realPSModelObject, "getUserModeTag");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERMODESN, domain, "usermodesn", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERMODETAG, domain, "pssysusermodename", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}