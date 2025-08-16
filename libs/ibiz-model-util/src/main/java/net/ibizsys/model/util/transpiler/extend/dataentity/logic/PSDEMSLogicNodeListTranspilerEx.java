package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode;
import net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELogicNode;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEMSLogicNodeListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEMSLogicNodeListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		PSDELogicNode psDELogicNode = (PSDELogicNode)domain;
		
		if(bFullMode) {
			IPSDEMSLogicNode iPSDEMSLogicNode = (IPSDEMSLogicNode)iPSModelObject;
			
			
			
		}
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDELogicNode psDELogicNode = (PSDELogicNode)domain;
		if(!ObjectUtils.isEmpty(psDELogicNode.getPSDELNParams())) {
			ArrayNode arrayNode = objectNode.putArray(PSDELogicNodeImpl.ATTR_GETPSDELOGICNODEPARAMS);
			//iPSModelTranspileContext.getPSModelListTranspiler(IPSDEMSLogicNodeParam.class, false).compile(iPSModelTranspileContext, psDELogicNode.getPSDELNParams(), arrayNode);
		}
	}
	
}