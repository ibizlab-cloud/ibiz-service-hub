package net.ibizsys.model.util.transpiler.extend.dataentity.ds;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.ds.IPSDEDQJoin;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEDQJoin;
import net.ibizsys.psmodel.core.domain.PSDEDataQuery;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDataQueryListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.ds.PSDEDataQueryListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			PSDEDataQuery psDEDataQuery = (PSDEDataQuery)domain;
			IPSDEDataQuery iPSDEDataQuery = (IPSDEDataQuery)iPSModelObject;
			
			if(iPSDEDataQuery.getPSDEDQMain()!=null) {
				PSDEDQJoin psDEDQJoin = new PSDEDQJoin();
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDQJoin.class, false).decompile(iPSModelTranspileContext, iPSDEDataQuery.getPSDEDQMain(), psDEDQJoin, bFullMode);
				psDEDQJoin.setMainFlag(1);
				psDEDQJoin.setOrderValue(100);
				psDEDQJoin.setPSDEDQId(psDEDataQuery.getId());
				psDEDQJoin.setPSDEDQName(psDEDataQuery.getName());
				
				psDEDataQuery.getPSDEDQJoinsIf().add(psDEDQJoin);
			}
		}
	}
	
}