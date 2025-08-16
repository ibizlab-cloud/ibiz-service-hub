package net.ibizsys.model.util.transpiler.extend.control.dashboard;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.dashboard.IPSDBPortletPart;
import net.ibizsys.model.control.dashboard.IPSSysDashboard;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.control.dashboard.PSSysDashboardTranspiler;
import net.ibizsys.psmodel.core.domain.PSSysDBPart;
import net.ibizsys.psmodel.core.domain.PSSysDashboard;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSSysDashboardTranspilerEx extends PSSysDashboardTranspiler {
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSSysDashboard iPSSysDashboard = (IPSSysDashboard)iPSModelObject;
			PSSysDashboard psSysDashboard = (PSSysDashboard)domain;
			
			if(iPSSysDashboard.getPSControls()!=null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDBPortletPart.class, false).decompile(iPSModelTranspileContext, iPSSysDashboard.getPSControls(), psSysDashboard.getPSSysDBPartsIf(), bFullMode);
				for(PSSysDBPart child : psSysDashboard.getPSSysDBPartsIf()) {
					child.setPSSysDashboardId(iPSSysDashboard.getId());
					child.setPSSysDashboardName(iPSSysDashboard.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}

}
