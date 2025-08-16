package net.ibizsys.model.util.transpiler.extend.control.toolbar;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.toolbar.IPSDECMGroupItem;
import net.ibizsys.model.control.toolbar.IPSDEContextMenuItem;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDETBItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEContextMenuItemListTranspilerEx extends net.ibizsys.model.util.transpiler.control.toolbar.PSDEContextMenuItemListTranspiler{
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSDEContextMenuItem iPSDEContextMenuItem = (IPSDEContextMenuItem)iPSModelObject;
			PSDETBItem psDEToolbarItem = (PSDETBItem)domain;
			
			if(iPSDEContextMenuItem instanceof IPSDECMGroupItem) {
				IPSDECMGroupItem iPSDECMGroupItem = (IPSDECMGroupItem)iPSDEContextMenuItem;
				if(iPSDECMGroupItem.getPSDEContextMenuItems()!=null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEContextMenuItem.class, false).decompile(iPSModelTranspileContext, iPSDECMGroupItem.getPSDEContextMenuItems(), psDEToolbarItem.getPSDETBItemsIf(), bFullMode);
					for(PSDETBItem child : psDEToolbarItem.getPSDETBItemsIf()) {
						child.setPPSDETBItemId(iPSDEContextMenuItem.getId());
						child.setPPSDETBItemName(iPSDEContextMenuItem.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
			}
		}
	}
	
}