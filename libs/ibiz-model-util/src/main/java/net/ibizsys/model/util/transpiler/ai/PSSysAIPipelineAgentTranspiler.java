package net.ibizsys.model.util.transpiler.ai;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.ai.PSSysAIPipelineAgentImpl.*;



public class PSSysAIPipelineAgentTranspiler extends net.ibizsys.model.util.transpiler.ai.PSSysAIFactoryObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.ai.PSSysAIPipelineAgentImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.ai.PSSysAIPipelineAgentImpl realPSModelObject = (net.ibizsys.model.ai.PSSysAIPipelineAgentImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aiplatformtype", realPSModelObject.getAIPlatformType(), realPSModelObject, "getAIPlatformType");
		this.setDomainValue(iPSModelTranspileContext, domain, "agentinfo", realPSModelObject.getAgentInfo(), realPSModelObject, "getAgentInfo");
		this.setDomainValue(iPSModelTranspileContext, domain, "aipipelineagentparams", realPSModelObject.getAgentParams(), realPSModelObject, "getAgentParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "aipipelineagenttag", realPSModelObject.getAgentTag(), realPSModelObject, "getAgentTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "aipipelineagenttag2", realPSModelObject.getAgentTag2(), realPSModelObject, "getAgentTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "aipipelineagenttype", realPSModelObject.getAgentType(), realPSModelObject, "getAgentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "codename", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAIPLATFORMTYPE, domain, "aiplatformtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTINFO, domain, "agentinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTPARAMS, domain, "aipipelineagentparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTTAG, domain, "aipipelineagenttag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTTAG2, domain, "aipipelineagenttag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTTYPE, domain, "aipipelineagenttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "codename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}