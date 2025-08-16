package net.ibizsys.model.util.transpiler.security;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.security.PSSysUserDRImpl.*;



public class PSSysUserDRTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.security.PSSysUserDRImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.security.PSSysUserDRImpl realPSModelObject = (net.ibizsys.model.security.PSSysUserDRImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "userdrtag", realPSModelObject.getCustomMode(), realPSModelObject, "getCustomMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMMODE, domain, "userdrtag", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}