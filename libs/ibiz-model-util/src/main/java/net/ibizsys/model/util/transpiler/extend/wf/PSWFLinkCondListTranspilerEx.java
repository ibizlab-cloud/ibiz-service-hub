package net.ibizsys.model.util.transpiler.extend.wf;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.wf.IPSWFLinkCond;
import net.ibizsys.model.wf.IPSWFLinkGroupCond;
import net.ibizsys.model.wf.PSWFLinkGroupCondImpl;
import net.ibizsys.psmodel.core.domain.PSWFLinkCond;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.WFLinkCondType;

public class PSWFLinkCondListTranspilerEx extends net.ibizsys.model.util.transpiler.wf.PSWFLinkCondListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	
		if(bFullMode) {
			IPSWFLinkCond iPSWFLinkCond = (IPSWFLinkCond)iPSModelObject;
			PSWFLinkCond psWFLinkCond = (PSWFLinkCond)domain;
			if(iPSWFLinkCond instanceof IPSWFLinkGroupCond) {
				IPSWFLinkGroupCond iPSWFLinkGroupCond = (IPSWFLinkGroupCond)iPSWFLinkCond;
				if(iPSWFLinkGroupCond.getPSWFLinkConds()!=null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSWFLinkCond.class, false).decompile(iPSModelTranspileContext, iPSWFLinkGroupCond.getPSWFLinkConds(), psWFLinkCond.getPSWFLinkCondsIf(), bFullMode);
					for(PSWFLinkCond child : psWFLinkCond.getPSWFLinkCondsIf()) {
						child.setPPSWFLinkCondId(psWFLinkCond.getId());
						child.setPPSWFLinkCondName(psWFLinkCond.getName());
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
		
		PSWFLinkCond psWFLinkCond = (PSWFLinkCond)domain;
		
		if(WFLinkCondType.GROUP.value.equals(psWFLinkCond.getLogicType())
				&& !ObjectUtils.isEmpty(psWFLinkCond.getPSWFLinkConds())) {
			ArrayNode arrayNode = objectNode.putArray(PSWFLinkGroupCondImpl.ATTR_GETPSWFLINKCONDS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSWFLinkCond.class, false).compile(iPSModelTranspileContext, psWFLinkCond.getPSWFLinkConds(), arrayNode);
		}
	}
}