package net.ibizsys.model.util.transpiler.extend.dataentity.ds;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetParam;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEDSDQ;
import net.ibizsys.psmodel.core.domain.PSDEDSGrpParam;
import net.ibizsys.psmodel.core.domain.PSDEDSParam;
import net.ibizsys.psmodel.core.domain.PSDEDataSet;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDataSetListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.ds.PSDEDataSetListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSDEDataSet iPSDEDataSet = (IPSDEDataSet)iPSModelObject;
			PSDEDataSet psDEDataSet = (PSDEDataSet)domain;
			if(iPSDEDataSet.getPSDEDataQueries()!=null) {
				for(IPSDEDataQuery iPSDEDataQuery : iPSDEDataSet.getPSDEDataQueries()) {
					PSDEDSDQ psDEDSDQ = new PSDEDSDQ();
					psDEDSDQ.setPSDEDQId(iPSModelTranspileContext.getPSModelUniqueTag(iPSDEDataQuery));
					psDEDSDQ.setPSDEDQName(iPSDEDataQuery.getName());
					psDEDSDQ.setPSDEDSDQId(psDEDSDQ.getPSDEDQId());
					psDEDSDQ.setPSDEDSDQName(psDEDSDQ.getPSDEDQName());
					psDEDataSet.getPSDEDSDQsIf().add(psDEDSDQ);
				}
				int nOrder = 100;
				for(PSDEDSDQ child : psDEDataSet.getPSDEDSDQsIf()) {
					child.setPSDEDataSetId(psDEDataSet.getId());
					child.setPSDEDataSetName(psDEDataSet.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
			if(iPSDEDataSet.getPSDEDataSetParams()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDataSetParam.class, false).decompile(iPSModelTranspileContext, iPSDEDataSet.getPSDEDataSetParams(), psDEDataSet.getPSDEDSParamsIf(), bFullMode);
				int nOrder = 100;
				for(PSDEDSParam child : psDEDataSet.getPSDEDSParamsIf()) {
					child.setPSDEDSId(psDEDataSet.getId());
					child.setPSDEDSName(psDEDataSet.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
			if(iPSDEDataSet.getPSDEDataSetGroupParams()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDataSetGroupParam.class, false).decompile(iPSModelTranspileContext, iPSDEDataSet.getPSDEDataSetGroupParams(), psDEDataSet.getPSDEDSGrpParamsIf(), bFullMode);
//				int nOrder = 100;
				for(PSDEDSGrpParam child : psDEDataSet.getPSDEDSGrpParamsIf()) {
					child.setPSDEDSId(psDEDataSet.getId());
					child.setPSDEDSName(psDEDataSet.getName());
//					child.setOrderValue(nOrder);
//					nOrder += 100;
				}
			}
		}
	}
	
}

