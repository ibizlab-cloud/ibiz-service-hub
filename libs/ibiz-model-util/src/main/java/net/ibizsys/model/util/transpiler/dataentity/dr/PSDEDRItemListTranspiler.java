package net.ibizsys.model.util.transpiler.dataentity.dr;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDRItemListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDEDRItem createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDEDRItem();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "CUSTOM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dr.PSDEDRCustomItemImpl.class, false);
			case "DER11":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dr.PSDEDRDER11ItemImpl.class, false);
			case "DER1N":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dr.PSDEDRDER1NItemImpl.class, false);
			case "SYSDER11":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dr.PSDEDRSysDER11ItemImpl.class, false);
			case "SYSDER1N":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dr.PSDEDRSysDER1NItemImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.dr.IPSDEDRItem iPSDEDRItem = (net.ibizsys.model.dataentity.dr.IPSDEDRItem)iPSModelObject;
		Object type = iPSDEDRItem.getItemType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("itemtype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}