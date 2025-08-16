package net.ibizsys.model.util.transpiler.extend.app.appmenu;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.appmenu.IPSAppMenuModel;
import net.ibizsys.model.control.menu.IPSAppMenuItem;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSAppMenu;
import net.ibizsys.psmodel.core.domain.PSAppMenuItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppMenuModelListTranspilerEx extends net.ibizsys.model.util.transpiler.app.appmenu.PSAppMenuModelListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSAppMenuModel iPSAppMenuModel = (IPSAppMenuModel)iPSModelObject;
			PSAppMenu psAppMenu = (PSAppMenu)domain;
			
			if(iPSAppMenuModel.getPSAppMenuItems()!=null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSAppMenuItem.class, false).decompile(iPSModelTranspileContext, iPSAppMenuModel.getPSAppMenuItems(), psAppMenu.getPSAppMenuItemsIf(), bFullMode);
				for(PSAppMenuItem child : psAppMenu.getPSAppMenuItemsIf()) {
					child.setPSAppMenuId(psAppMenu.getId());
					child.setPSAppMenuName(psAppMenu.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
}