package net.ibizsys.model.util.transpiler.extend.dataentity.dataexport;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEDataExp;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDataExportListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.dataexport.PSDEDataExportListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		if(bFullMode) {
			IPSDEDataExport iPSDEDataExport = (IPSDEDataExport)iPSModelObject;
			PSDEDataExp psDEDataExport = (PSDEDataExp)domain;
			
			if(iPSDEDataExport.getPSDEDataExportItems()!=null) {
				//iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDataExportItem.class, false).decompile(iPSModelTranspileContext, iPSDEDataExport.getPSDEDataExportItems(), psDEDataExport.getPSDEDataExpItemsIf(), bFullMode);
//				int nOrder = 100;
//				for(PSDEDataExpItem child : psDEDataExport.getPSDEDataExpItemsIf()) {
//					child.setPSDEDataExpId(child.getId());
//					child.setPSDEDataExpName(child.getName());
//					child.setOrderValue(nOrder);
//					nOrder += 100;
//				}
			}
		}
	}
}