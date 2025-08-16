package net.ibizsys.model.util.transpiler.ai;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.ai.PSSysAIWorkerAgentImpl.*;



public class PSSysAIWorkerAgentTranspiler extends net.ibizsys.model.util.transpiler.ai.PSSysAIFactoryObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.ai.PSSysAIWorkerAgentImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.ai.PSSysAIWorkerAgentImpl realPSModelObject = (net.ibizsys.model.ai.PSSysAIWorkerAgentImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aiworkeragentparams", realPSModelObject.getAgentParams(), realPSModelObject, "getAgentParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "aiworkeragenttag", realPSModelObject.getAgentTag(), realPSModelObject, "getAgentTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "aiworkeragenttag2", realPSModelObject.getAgentTag2(), realPSModelObject, "getAgentTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "aiworkeragenttype", realPSModelObject.getAgentType(), realPSModelObject, "getAgentType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTPARAMS, domain, "aiworkeragentparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTTAG, domain, "aiworkeragenttag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTTAG2, domain, "aiworkeragenttag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTTYPE, domain, "aiworkeragenttype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}