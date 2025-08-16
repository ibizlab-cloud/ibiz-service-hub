package net.ibizsys.model.util.transpiler.dataentity.service;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEMethodDTOListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "DEACTIONINPUT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDEActionInputDTOImpl.class, false);
			case "DEDATASETINPUT":
			case "DEFILTER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.ds.PSDEFilterDTOImpl.class, false);
			case "LINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.service.PSLinkDEMethodDTOImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.service.PSDEMethodDTOImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.service.IPSDEMethodDTO iPSDEMethodDTO = (net.ibizsys.model.dataentity.service.IPSDEMethodDTO)iPSModelObject;
		Object type = iPSDEMethodDTO.getType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("type");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}