package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEUILogicParamListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDELogicParam createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDELogicParam();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUILogicParamImpl.class, false);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		return getPSModelTranspiler(iPSModelTranspileContext, (Object)null);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		return getPSModelTranspiler(iPSModelTranspileContext, (Object)null);
	}
}