package net.ibizsys.model.util.transpiler.control.menu;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppMenuItemListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSAppMenuItem createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSAppMenuItem();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "APPMENUREF":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.menu.PSAppMenuAMRefImpl.class, false);
			case "MENUITEM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.menu.PSAppMenuItemImpl.class, false);
			case "RAWITEM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.menu.PSAppMenuRawItemImpl.class, false);
			case "SEPERATOR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.menu.PSAppMenuSeperatorImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.menu.PSAppMenuItemImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.menu.IPSAppMenuItem iPSAppMenuItem = (net.ibizsys.model.control.menu.IPSAppMenuItem)iPSModelObject;
		Object type = iPSAppMenuItem.getItemType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("itemtype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}