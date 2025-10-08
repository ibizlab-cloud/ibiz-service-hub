package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.LogicLinkCondType;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond;
import net.ibizsys.model.dataentity.logic.PSDELogicLinkGroupCondImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELLCond;
import net.ibizsys.psmodel.core.domain.PSDELogic;
import net.ibizsys.psmodel.core.domain.PSDELogicParam;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDELogicLinkCondListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicLinkCondListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		PSDELLCond psDELogicLinkCond = (PSDELLCond)domain;
		
		if(bFullMode) {
			IPSDELogicLinkCond iPSDELogicLinkCond = (IPSDELogicLinkCond)iPSModelObject;
			
			if(iPSDELogicLinkCond instanceof IPSDELogicLinkGroupCond) {
				IPSDELogicLinkGroupCond iPSDELogicLinkGroupCond = (IPSDELogicLinkGroupCond)iPSDELogicLinkCond;
				if(iPSDELogicLinkGroupCond.getPSDELogicLinkConds()!=null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicLinkCond.class, false).decompile(iPSModelTranspileContext, iPSDELogicLinkGroupCond.getPSDELogicLinkConds(), psDELogicLinkCond.getPSDELLCondsIf(), bFullMode);
					for(PSDELLCond child : psDELogicLinkCond.getPSDELLCondsIf()) {
						child.setPPSDELLCondId(psDELogicLinkCond.getId());
						child.setPPSDELLCondName(psDELogicLinkCond.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
			}
		}
		
		if(PSDELogicListTranspilerEx.peekDecompileObject() != null) {
			PSDELogic psDELogic = (PSDELogic)PSDELogicListTranspilerEx.peekDecompileObject();
			psDELogicLinkCond.setPSDElogicId(psDELogic.getPSDELogicId());
			if(!ObjectUtils.isEmpty(psDELogic.getPSDELogicParams())) {
				for(PSDELogicParam item : psDELogic.getPSDELogicParams()) {
					
//					if(StringUtils.hasLength(psDELogicLinkCond.getSrcPSDLParamId()) && !StringUtils.hasLength(psDELogicLinkCond.getSrcParamPSDEId()) && psDELogicLinkCond.getSrcPSDLParamId().equals(item.getId())) {
//						psDELNParam.setSrcParamPSDEId(item.getParamPSDEId());
//					}
					
					if(StringUtils.hasLength(psDELogicLinkCond.getDstPSDLParamId()) && !StringUtils.hasLength(psDELogicLinkCond.getDstParamPSDEId()) && psDELogicLinkCond.getDstPSDLParamId().equals(item.getId())) {
						psDELogicLinkCond.setDstParamPSDEId(item.getParamPSDEId());
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
			ArrayNode arrayNode = objectNode.putArray(PSDELogicLinkGroupCondImpl.ATTR_GETPSDELOGICLINKCONDS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicLinkCond.class, false).compile(iPSModelTranspileContext, psDELogicLinkCond.getPSDELLConds(), arrayNode);
		}
	}
}