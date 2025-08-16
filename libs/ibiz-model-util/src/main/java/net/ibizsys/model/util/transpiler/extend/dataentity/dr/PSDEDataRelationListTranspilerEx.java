package net.ibizsys.model.util.transpiler.extend.dataentity.dr;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.dr.IPSDEDRDetail;
import net.ibizsys.model.dataentity.dr.IPSDEDataRelation;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEDRDetail;
import net.ibizsys.psmodel.core.domain.PSDEDataRelation;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDataRelationListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.dr.PSDEDataRelationListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		if(bFullMode) {
			IPSDEDataRelation iPSDEDataRelation = (IPSDEDataRelation)iPSModelObject;
			PSDEDataRelation psDEDataRelation = (PSDEDataRelation)domain;
			
			if(iPSDEDataRelation.getPSDEDRDetails()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDRDetail.class, false).decompile(iPSModelTranspileContext, iPSDEDataRelation.getPSDEDRDetails(), psDEDataRelation.getPSDEDRDetailsIf(), bFullMode);
				//int nOrder = 100;
				for(PSDEDRDetail child : psDEDataRelation.getPSDEDRDetailsIf()) {
					child.setPSDEDRId(psDEDataRelation.getId());
					child.setPSDEDRName(psDEDataRelation.getName());
					//child.setOrderValue(nOrder);
					//nOrder += 100;
				}
			}
		}
	}
}