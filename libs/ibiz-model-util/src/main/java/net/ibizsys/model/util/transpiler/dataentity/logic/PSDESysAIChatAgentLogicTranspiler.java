package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl.*;



public class PSDESysAIChatAgentLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysaichatagentid", realPSModelObject.getPSSysAIChatAgent(), realPSModelObject, "getPSSysAIChatAgent");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysaifactoryid", realPSModelObject.getPSSysAIFactory(), realPSModelObject, "getPSSysAIFactory");
		this.setDomainValue(iPSModelTranspileContext, domain, "retpsdlparamid", realPSModelObject.getRetPSDELogicParam(), realPSModelObject, "getRetPSDELogicParam");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSAICHATAGENT, domain, "pssysaichatagentid", net.ibizsys.model.ai.IPSSysAIChatAgent.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSAIFACTORY, domain, "pssysaifactoryid", net.ibizsys.model.ai.IPSSysAIFactory.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETPSDELOGICPARAM, domain, "retpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}