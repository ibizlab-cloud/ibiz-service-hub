package net.ibizsys.model.util.transpiler.extend.control.dashboard;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.dashboard.IPSDBContainerPortletPart;
import net.ibizsys.model.control.dashboard.IPSDBPortletPart;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSSysDBPart;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDBPortletPartListTranspilerEx extends net.ibizsys.model.util.transpiler.control.dashboard.PSDBPortletPartListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			PSSysDBPart psSysDBPart = (PSSysDBPart)domain;
			if(iPSModelObject instanceof IPSDBContainerPortletPart) {
				IPSDBContainerPortletPart iPSDBContainerPortletPart = (IPSDBContainerPortletPart)iPSModelObject;
				if(iPSDBContainerPortletPart.getPSControls()!=null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDBPortletPart.class, false).decompile(iPSModelTranspileContext, iPSDBContainerPortletPart.getPSControls(), psSysDBPart.getPSSysDBPartsIf(), bFullMode);
					for(PSSysDBPart child : psSysDBPart.getPSSysDBPartsIf()) {
						child.setPPSSysDBPartId(psSysDBPart.getId());
						child.setPPSSysDBPartName(psSysDBPart.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
			}
		}
	}
	
}