package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDFJoinCondListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "GROUP":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFJoinGroupCondImpl.class, false);
			case "SINGLE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFJoinSingleCondImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond iPSDEDFJoinCond = (net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond)iPSModelObject;
		Object type = iPSDEDFJoinCond.getCondType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("condtype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}