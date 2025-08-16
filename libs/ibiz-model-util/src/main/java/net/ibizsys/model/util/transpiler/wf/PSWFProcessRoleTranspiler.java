package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFProcessRoleImpl.*;



public class PSWFProcessRoleTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFProcessRoleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFProcessRoleImpl realPSModelObject = (net.ibizsys.model.wf.PSWFProcessRoleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgtemplid", realPSModelObject.getPSSysMsgTempl(), realPSModelObject, "getPSSysMsgTempl");
		this.setDomainValue(iPSModelTranspileContext, domain, "pswfroleid", realPSModelObject.getPSWFRole(), realPSModelObject, "getPSWFRole");
		this.setDomainValue(iPSModelTranspileContext, domain, "udfields", realPSModelObject.getUDField(), realPSModelObject, "getUDField");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata", realPSModelObject.getUserData(), realPSModelObject, "getUserData");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata2", realPSModelObject.getUserData2(), realPSModelObject, "getUserData2");
		this.setDomainValue(iPSModelTranspileContext, domain, "roletype", realPSModelObject.getWFProcessRoleType(), realPSModelObject, "getWFProcessRoleType");
		this.setDomainValue(iPSModelTranspileContext, domain, "ccmode", realPSModelObject.isCCMode(), realPSModelObject, "isCCMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMSGTEMPL, domain, "pssysmsgtemplid", net.ibizsys.model.msg.IPSSysMsgTempl.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSWFROLE, domain, "pswfroleid", net.ibizsys.model.wf.IPSWFRole.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUDFIELD, domain, "udfields", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA, domain, "userdata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA2, domain, "userdata2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFPROCESSROLETYPE, domain, "roletype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCCMODE, domain, "ccmode", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}