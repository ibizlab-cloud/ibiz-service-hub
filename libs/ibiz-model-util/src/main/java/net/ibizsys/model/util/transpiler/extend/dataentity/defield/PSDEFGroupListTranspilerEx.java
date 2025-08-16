package net.ibizsys.model.util.transpiler.extend.dataentity.defield;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.model.dataentity.defield.IPSDEFGroupDetail;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEFGroup;
import net.ibizsys.psmodel.core.domain.PSDEFGroupDetail;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEFGroupListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFGroupListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			PSDEFGroup psDEFGroup = (PSDEFGroup)domain;
			IPSDEFGroup iPSDEFGroup = (IPSDEFGroup)iPSModelObject;
			
			if(iPSDEFGroup.getPSDEFGroupDetails()!=null) {
				
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFGroupDetail.class, false).decompile(iPSModelTranspileContext, iPSDEFGroup.getPSDEFGroupDetails(), psDEFGroup.getPSDEFGroupDetailsIf(), bFullMode);
				int nOrder = 100;
				for(PSDEFGroupDetail child : psDEFGroup.getPSDEFGroupDetailsIf()) {
					child.setPSDEFGroupId(child.getId());
					child.setPSDEFGroupName(child.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
		
	}
}