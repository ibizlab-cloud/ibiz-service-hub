package net.ibizsys.model.util.transpiler.control.toolbar;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEContextMenuItemListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDETBItem createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDETBItem();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "DEUIACTION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.toolbar.PSDETBUIActionItemImpl.class, false);
			case "ITEMS":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.toolbar.PSDETBGroupItemImpl.class, false);
			case "RAWITEM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.toolbar.PSDETBRawItemImpl.class, false);
			case "SEPERATOR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.toolbar.PSDETBSeperatorItemImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.toolbar.IPSDEContextMenuItem iPSDEContextMenuItem = (net.ibizsys.model.control.toolbar.IPSDEContextMenuItem)iPSModelObject;
		Object type = iPSDEContextMenuItem.getItemType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("itemtype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}