package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEMSLogicLinkCondListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDELLCond createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDELLCond();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "GROUP":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkGroupCondImpl.class, false);
			case "SINGLE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkSingleCondImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond iPSDEMSLogicLinkCond = (net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond)iPSModelObject;
		Object type = iPSDEMSLogicLinkCond.getLogicType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("logictype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}