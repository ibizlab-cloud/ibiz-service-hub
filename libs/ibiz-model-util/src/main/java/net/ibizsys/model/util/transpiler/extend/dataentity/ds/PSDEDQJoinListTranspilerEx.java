package net.ibizsys.model.util.transpiler.extend.dataentity.ds;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQJoin;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEDQCond;
import net.ibizsys.psmodel.core.domain.PSDEDQJoin;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDQJoinListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.ds.PSDEDQJoinListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSDEDQJoin iPSDEDQJoin = (IPSDEDQJoin)iPSModelObject;
			PSDEDQJoin psDEDQJoin = (PSDEDQJoin)domain;
			
			if(iPSDEDQJoin.getChildPSDEDQJoins()!=null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDQJoin.class, false).decompile(iPSModelTranspileContext, iPSDEDQJoin.getChildPSDEDQJoins(), psDEDQJoin.getPSDEDQJoinsIf(), bFullMode);
				for(PSDEDQJoin child : psDEDQJoin.getPSDEDQJoinsIf()) {
					child.setPPSDEDQJoinId(psDEDQJoin.getId());
					child.setPPSDEDQJoinName(psDEDQJoin.getName());
					child.setOrderValue(nOrder);
					child.setMainFlag(0);
					nOrder += 100;
				}
			}
			
			if(iPSDEDQJoin.getPSDEDQGroupCondition()!=null && iPSDEDQJoin.getPSDEDQGroupCondition().getPSDEDQConditions()!=null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDQCondition.class, false).decompile(iPSModelTranspileContext, iPSDEDQJoin.getPSDEDQGroupCondition().getPSDEDQConditions(), psDEDQJoin.getPSDEDQCondsIf(), bFullMode);
				for(PSDEDQCond child : psDEDQJoin.getPSDEDQCondsIf()) {
					child.setPSDEDQJoinId(psDEDQJoin.getId());
					child.setPSDEDQJoinName(psDEDQJoin.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
}