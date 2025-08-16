package net.ibizsys.model.util.transpiler.extend.control.menu;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.menu.IPSAppMenuItem;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSAppMenuItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppMenuItemListTranspilerEx extends net.ibizsys.model.util.transpiler.control.menu.PSAppMenuItemListTranspiler {

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);

		if (bFullMode) {
			IPSAppMenuItem iPSAppMenuItem = (IPSAppMenuItem) iPSModelObject;
			PSAppMenuItem psAppMenuItem = (PSAppMenuItem) domain;

			if (iPSAppMenuItem.getPSAppMenuItems() != null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSAppMenuItem.class, false).decompile(iPSModelTranspileContext, iPSAppMenuItem.getPSAppMenuItems(), psAppMenuItem.getPSAppMenuItemsIf(), bFullMode);
				for (PSAppMenuItem child : psAppMenuItem.getPSAppMenuItemsIf()) {
					child.setPPSAppMenuItemId(psAppMenuItem.getId());
					child.setPPSAppMenuItemName(psAppMenuItem.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
}