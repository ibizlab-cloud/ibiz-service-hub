package net.ibizsys.model.util.transpiler.extend.dataentity.ds;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEDQCond;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDQConditionListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.ds.PSDEDQConditionListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			
			IPSDEDQCondition iPSDEDQCondition = (IPSDEDQCondition)iPSModelObject;
			PSDEDQCond psDEDQCond = (PSDEDQCond)domain;
			
			if(iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
				IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition)iPSDEDQCondition;
				
				if(iPSDEDQGroupCondition.getPSDEDQConditions()!=null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDQCondition.class, false).decompile(iPSModelTranspileContext, iPSDEDQGroupCondition.getPSDEDQConditions(), psDEDQCond.getPSDEDQCondsIf(), bFullMode);
					for(PSDEDQCond child : psDEDQCond.getPSDEDQCondsIf()) {
						child.setPPSDEDQCondId(psDEDQCond.getId());
						child.setPPSDEDQCondName(psDEDQCond.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
			}
		}
	}
}