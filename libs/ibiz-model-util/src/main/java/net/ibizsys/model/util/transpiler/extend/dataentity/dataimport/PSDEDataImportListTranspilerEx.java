package net.ibizsys.model.util.transpiler.extend.dataentity.dataimport;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEDataImp;
import net.ibizsys.psmodel.core.domain.PSDEDataImpItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDataImportListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.dataimport.PSDEDataImportListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		if(bFullMode) {
			IPSDEDataImport iPSDEDataImport = (IPSDEDataImport)iPSModelObject;
			PSDEDataImp psDEDataImport = (PSDEDataImp)domain;
			
			if(iPSDEDataImport.getPSDEDataImportItems()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDataImportItem.class, false).decompile(iPSModelTranspileContext, iPSDEDataImport.getPSDEDataImportItems(), psDEDataImport.getPSDEDataImpItemsIf(), bFullMode);
				int nOrder = 100;
				for(PSDEDataImpItem child : psDEDataImport.getPSDEDataImpItemsIf()) {
					child.setPSDEDataImpId(psDEDataImport.getId());
					child.setPSDEDataImpName(psDEDataImport.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
	
	
}