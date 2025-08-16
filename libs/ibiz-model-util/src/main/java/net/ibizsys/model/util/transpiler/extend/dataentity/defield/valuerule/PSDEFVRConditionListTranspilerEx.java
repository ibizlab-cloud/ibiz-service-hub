package net.ibizsys.model.util.transpiler.extend.dataentity.defield.valuerule;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEFVRCond;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEFVRConditionListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.defield.valuerule.PSDEFVRConditionListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			PSDEFVRCond psDEFVRCond = (PSDEFVRCond)domain;
			IPSDEFVRCondition iPSDEFVRCond = (IPSDEFVRCondition)iPSModelObject;
			
			if(iPSDEFVRCond instanceof IPSDEFVRGroupCondition) {
				
				IPSDEFVRGroupCondition iPSDEFVRGroupCondition = (IPSDEFVRGroupCondition)iPSDEFVRCond;
				if(iPSDEFVRGroupCondition.getPSDEFVRConditions()!=null) {
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFVRCondition.class, false).decompile(iPSModelTranspileContext, iPSDEFVRGroupCondition.getPSDEFVRConditions(), psDEFVRCond.getPSDEFVRCondsIf(), bFullMode);
					int nOrder = 100;
					for(PSDEFVRCond child : psDEFVRCond.getPSDEFVRCondsIf()) {
						child.setPPSDEFVRCondId(child.getId());
						child.setPPSDEFVRCondName(child.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
			}
		}
	}
	
	
}