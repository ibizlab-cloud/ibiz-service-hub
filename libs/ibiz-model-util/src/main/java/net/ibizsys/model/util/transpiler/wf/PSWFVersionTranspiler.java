package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFVersionImpl.*;



public class PSWFVersionTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFVersionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFVersionImpl realPSModelObject = (net.ibizsys.model.wf.PSWFVersionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pswfid", realPSModelObject.getPSWorkflow(), realPSModelObject, "getPSWorkflow");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfversion", realPSModelObject.getWFVersion(), realPSModelObject, "getWFVersion");
		this.setDomainValue(iPSModelTranspileContext, domain, "validflag", realPSModelObject.isValid(), realPSModelObject, "isValid");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSWORKFLOW, domain, "pswfid", net.ibizsys.model.wf.IPSWorkflow.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFVERSION, domain, "wfversion", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISVALID, domain, "validflag", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}