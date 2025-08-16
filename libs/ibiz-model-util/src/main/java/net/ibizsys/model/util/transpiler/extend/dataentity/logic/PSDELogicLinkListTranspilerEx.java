package net.ibizsys.model.util.transpiler.extend.dataentity.logic;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond;
import net.ibizsys.model.dataentity.logic.PSDELogicLinkImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDELLCond;
import net.ibizsys.psmodel.core.domain.PSDELogicLink;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP;
import net.ibizsys.psmodel.core.util.PSModelEnums.LogicLinkCondType;

public class PSDELogicLinkListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicLinkListTranspiler{
	
	/**
	 * 常规连接
	 */
	public final static int LINKMODE_COMMON = 0;
	
	/**
	 * 默认连接
	 */
	public final static int LINKMODE_DEFAULT = 1;
	
	
	/**
	 * 异常连接
	 */
	public final static int LINKMODE_CATCH = 9;
	
	
	/**
	 * 子调用
	 */
	public final static int LINKMODE_SUBCALL = 10;
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		IPSDELogicLink iPSDELogicLink = (IPSDELogicLink)iPSModelObject;
		PSDELogicLink psDELogicLink = (PSDELogicLink)domain;
		if(iPSDELogicLink.isSubCallLink()) {
			psDELogicLink.setDefaultLink(LINKMODE_SUBCALL);
		}
		else
			if(iPSDELogicLink.isCatchLink()) {
				psDELogicLink.setDefaultLink(LINKMODE_CATCH);
			}
			else
				if(iPSDELogicLink.isDefaultLink()) {
					psDELogicLink.setDefaultLink(LINKMODE_DEFAULT);
				}
				else
					psDELogicLink.setDefaultLink(LINKMODE_COMMON);
		
		if(bFullMode) {
			if(iPSDELogicLink.getPSDELogicLinkGroupCond()!=null && iPSDELogicLink.getPSDELogicLinkGroupCond().getPSDELogicLinkConds()!=null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicLinkCond.class, false).decompile(iPSModelTranspileContext, iPSDELogicLink.getPSDELogicLinkGroupCond().getPSDELogicLinkConds(), psDELogicLink.getPSDELLCondsIf(), bFullMode);
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
		
		int nDefaultLink = DataTypeUtils.getIntegerValue(psDELogicLink.getDefaultLink(), LINKMODE_COMMON);
		switch(nDefaultLink) {
		case LINKMODE_DEFAULT:
			objectNode.put(PSDELogicLinkImpl.ATTR_ISDEFAULTLINK, true);
			break;
		case LINKMODE_SUBCALL:
			objectNode.put(PSDELogicLinkImpl.ATTR_ISSUBCALLLINK, true);
			break;
		case LINKMODE_CATCH:
			objectNode.put(PSDELogicLinkImpl.ATTR_ISCATCHLINK, true);
			break;
		}
		
		
		if(!ObjectUtils.isEmpty(psDELogicLink.getPSDELLConds())) {
			
			PSDELLCond groupPSDELLCond = new PSDELLCond();
			groupPSDELLCond.logictype(LogicLinkCondType.GROUP);
			groupPSDELLCond.groupop(GroupCondOP.AND);
			groupPSDELLCond.getPSDELLCondsIf().addAll(psDELogicLink.getPSDELLConds());
			
			ObjectNode groupCondNode = objectNode.putObject(PSDELogicLinkImpl.ATTR_GETPSDELOGICLINKGROUPCOND);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDELogicLinkCond.class, false).compile(iPSModelTranspileContext, groupPSDELLCond, groupCondNode);
		}
	}
}