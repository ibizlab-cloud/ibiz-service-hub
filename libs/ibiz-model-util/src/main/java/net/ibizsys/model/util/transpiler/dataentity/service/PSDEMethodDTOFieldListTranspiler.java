package net.ibizsys.model.util.transpiler.dataentity.service;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEMethodDTOFieldListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "DEACTIONPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDEActionInputDTOFieldImpl.class, false);
			case "DEFSEARCHMODE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.ds.PSDEFilterDTOFieldImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.service.PSDEMethodDTOFieldImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.service.IPSDEMethodDTOField iPSDEMethodDTOField = (net.ibizsys.model.dataentity.service.IPSDEMethodDTOField)iPSModelObject;
		Object type = iPSDEMethodDTOField.getSourceType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("sourcetype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}