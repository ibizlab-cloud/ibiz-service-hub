package net.ibizsys.model.util.transpiler.extend.control.toolbar;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.toolbar.IPSDETBGroupItem;
import net.ibizsys.model.control.toolbar.IPSDEToolbarItem;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDETBItem;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.TBItemShowMode;

public class PSDEToolbarItemListTranspilerEx extends net.ibizsys.model.util.transpiler.control.toolbar.PSDEToolbarItemListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		IPSDEToolbarItem iPSDEToolbarItem = (IPSDEToolbarItem)iPSModelObject;
		PSDETBItem psDEToolbarItem = (PSDETBItem)domain;
		//设置显式模式
		if(iPSDEToolbarItem.isShowCaption()
				&& iPSDEToolbarItem.isShowIcon()) {
			psDEToolbarItem.showmode(TBItemShowMode.ICONANDSHORTWORD);
		}
		else
			if(iPSDEToolbarItem.isShowIcon()) {
				psDEToolbarItem.showmode(TBItemShowMode.SHORTWORD);
			}
			else
				psDEToolbarItem.showmode(TBItemShowMode.SHORTWORD);
		
		if(bFullMode) {
			if(iPSDEToolbarItem instanceof IPSDETBGroupItem) {
				IPSDETBGroupItem iPSDETBGroupItem = (IPSDETBGroupItem)iPSDEToolbarItem;
				if(iPSDETBGroupItem.getPSDEToolbarItems()!=null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEToolbarItem.class, false).decompile(iPSModelTranspileContext, iPSDETBGroupItem.getPSDEToolbarItems(), psDEToolbarItem.getPSDETBItemsIf(), bFullMode);
					for(PSDETBItem child : psDEToolbarItem.getPSDETBItemsIf()) {
						child.setPPSDETBItemId(iPSDEToolbarItem.getId());
						child.setPPSDETBItemName(iPSDEToolbarItem.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
			}
		}
	}
}