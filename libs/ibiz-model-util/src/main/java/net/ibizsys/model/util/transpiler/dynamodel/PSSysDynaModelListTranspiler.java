package net.ibizsys.model.util.transpiler.dynamodel;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSSysDynaModelListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "LIQUIBASECHANGELOG":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dynamodel.PSLiquibaseChangeLogModelImpl.class, false);
			case "OPENAPI3SCHEMA":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dynamodel.PSOpenAPI3SchemaModelImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dynamodel.PSSysDynaModelImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dynamodel.IPSSysDynaModel iPSSysDynaModel = (net.ibizsys.model.dynamodel.IPSSysDynaModel)iPSModelObject;
		Object type = iPSSysDynaModel.getUsage();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("usage");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}