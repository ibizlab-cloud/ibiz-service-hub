package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.LogicLinkCondType;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond;
import net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkGroupCondImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELLCond;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEMSLogicLinkCondListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEMSLogicLinkCondListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSDEMSLogicLinkCond iPSDEMSLogicLinkCond = (IPSDEMSLogicLinkCond)iPSModelObject;
			PSDELLCond psDELogicLinkCond = (PSDELLCond)domain;
			if(iPSDEMSLogicLinkCond instanceof IPSDEMSLogicLinkGroupCond) {
				IPSDEMSLogicLinkGroupCond iPSDEMSLogicLinkGroupCond = (IPSDEMSLogicLinkGroupCond)iPSDEMSLogicLinkCond;
				if(iPSDEMSLogicLinkGroupCond.getPSDEMSLogicLinkConds()!=null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEMSLogicLinkCond.class, false).decompile(iPSModelTranspileContext, iPSDEMSLogicLinkGroupCond.getPSDEMSLogicLinkConds(), psDELogicLinkCond.getPSDELLCondsIf(), bFullMode);
					for(PSDELLCond child : psDELogicLinkCond.getPSDELLCondsIf()) {
						child.setPPSDELLCondId(psDELogicLinkCond.getId());
						child.setPPSDELLCondName(psDELogicLinkCond.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
			}
		}
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDELLCond psDELogicLinkCond = (PSDELLCond)domain;
		
		if(LogicLinkCondType.GROUP.value.equals(psDELogicLinkCond.getLogicType()) && !ObjectUtils.isEmpty(psDELogicLinkCond.getPSDELLConds())) {
			ArrayNode arrayNode = objectNode.putArray(PSDEMSLogicLinkGroupCondImpl.ATTR_GETPSDEMSLOGICLINKCONDS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDEMSLogicLinkCond.class, false).compile(iPSModelTranspileContext, psDELogicLinkCond.getPSDELLConds(), arrayNode);
		}
	}
}