package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFLinkRoleImpl.*;



public class PSWFLinkRoleTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFLinkRoleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFLinkRoleImpl realPSModelObject = (net.ibizsys.model.wf.PSWFLinkRoleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgtemplid", realPSModelObject.getPSSysMsgTempl(), realPSModelObject, "getPSSysMsgTempl");
		this.setDomainValue(iPSModelTranspileContext, domain, "pswfprocroleid", realPSModelObject.getPSWFProcessRole(), realPSModelObject, "getPSWFProcessRole");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMSGTEMPL, domain, "pssysmsgtemplid", net.ibizsys.model.msg.IPSSysMsgTempl.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSWFPROCESSROLE, domain, "pswfprocroleid", net.ibizsys.model.wf.IPSWFProcessRole.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}