package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFCallActivityProcessImplBase.*;



public abstract class PSWFCallActivityProcessTranspilerBase extends net.ibizsys.model.util.transpiler.wf.PSWFProcessTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFCallActivityProcessImplBase)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFCallActivityProcessImplBase realPSModelObject = (net.ibizsys.model.wf.PSWFCallActivityProcessImplBase)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "multiinstmode", realPSModelObject.getMultiInstMode(), realPSModelObject, "getMultiInstMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "embedpswfid", realPSModelObject.getTargetPSWF(), realPSModelObject, "getTargetPSWF");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMULTIINSTMODE, domain, "multiinstmode", java.lang.String.class, new String[]{"NONE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTARGETPSWF, domain, "embedpswfid", net.ibizsys.model.wf.IPSWorkflow.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}