package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond;
import net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELLCond;
import net.ibizsys.psmodel.core.domain.PSDELogicLink;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP;
import net.ibizsys.psmodel.core.util.PSModelEnums.LogicLinkCondType;

public class PSDEMSLogicLinkListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEMSLogicLinkListTranspiler{
	
	/**
	 * 常规连接
	 */
	public final static int LINKMODE_COMMON = 0;
	
	
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		IPSDEMSLogicLink iPSDEMSLogicLink = (IPSDEMSLogicLink)iPSModelObject;
		PSDELogicLink psDELogicLink = (PSDELogicLink)domain;
		psDELogicLink.setDefaultLink(LINKMODE_COMMON);
					
		
		if(bFullMode) {
			if(iPSDEMSLogicLink.getPSDEMSLogicLinkGroupCond()!=null && iPSDEMSLogicLink.getPSDEMSLogicLinkGroupCond().getPSDEMSLogicLinkConds()!=null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEMSLogicLinkCond.class, false).decompile(iPSModelTranspileContext, iPSDEMSLogicLink.getPSDEMSLogicLinkGroupCond().getPSDEMSLogicLinkConds(), psDELogicLink.getPSDELLCondsIf(), bFullMode);
				for(PSDELLCond child : psDELogicLink.getPSDELLCondsIf()) {
					child.setPSDELogicLinkId(psDELogicLink.getId());
					child.setPSDELogicLinkName(psDELogicLink.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDELogicLink psDELogicLink = (PSDELogicLink)domain;
		
		if(!ObjectUtils.isEmpty(psDELogicLink.getPSDELLConds())) {
			
			PSDELLCond groupPSDELLCond = new PSDELLCond();
			groupPSDELLCond.logictype(LogicLinkCondType.GROUP);
			groupPSDELLCond.groupop(GroupCondOP.AND);
			groupPSDELLCond.getPSDELLCondsIf().addAll(psDELogicLink.getPSDELLConds());
			
			ObjectNode groupCondNode = objectNode.putObject(PSDEMSLogicLinkImpl.ATTR_GETPSDEMSLOGICLINKGROUPCOND);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDEMSLogicLinkCond.class, false).compile(iPSModelTranspileContext, groupPSDELLCond, groupCondNode);
		}
	}
	
}