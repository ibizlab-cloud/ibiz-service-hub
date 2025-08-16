package net.ibizsys.model.util.transpiler.extend.dataentity.ac;

import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.ac.IPSDEACMode;
import net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEACMode;
import net.ibizsys.psmodel.core.domain.PSDEACModeItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEACModeListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.ac.PSDEACModeListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSDEACMode iPSDEACMode = (IPSDEACMode)iPSModelObject;
			PSDEACMode psDEACMode = (PSDEACMode)domain;
			
			if(!ObjectUtils.isEmpty(iPSDEACMode.getPSDEACModeDataItems())) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEACModeDataItem.class, false).decompile(iPSModelTranspileContext, iPSDEACMode.getPSDEACModeDataItems(), psDEACMode.getPSDEACModeItemsIf(), bFullMode);
				int nOrder = 100;
				for(PSDEACModeItem child : psDEACMode.getPSDEACModeItemsIf()) {
					child.setPSDEACModeId(psDEACMode.getId());
					child.setPSDEACModeName(psDEACMode.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
	
}