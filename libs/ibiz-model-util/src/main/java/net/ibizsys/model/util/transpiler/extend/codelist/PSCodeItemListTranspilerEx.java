package net.ibizsys.model.util.transpiler.extend.codelist;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.PSCodeItemImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSCodeItem;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSCodeItemListTranspilerEx extends net.ibizsys.model.util.transpiler.codelist.PSCodeItemListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSCodeItem iPSCodeItem = (IPSCodeItem)iPSModelObject;
			PSCodeItem psCodeItem = (PSCodeItem)domain;
			
			if(iPSCodeItem.getPSCodeItems()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSCodeItem.class, false).decompile(iPSModelTranspileContext, iPSCodeItem.getPSCodeItems(), psCodeItem.getPSCodeItemsIf(), bFullMode);
				int nOrder = 100;
				for(PSCodeItem child : psCodeItem.getPSCodeItemsIf()) {
					child.setPPSCodeItemId(psCodeItem.getId());
					child.setPPSCodeItemName(psCodeItem.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
			
		}
		
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		
		PSCodeItem psCodeItem = (PSCodeItem)domain;
		if (!ObjectUtils.isEmpty(psCodeItem.getPSCodeItems())) {
			ArrayNode arrayNode = objectNode.putArray(PSCodeItemImpl.ATTR_GETPSCODEITEMS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSCodeItem.class, false).compile(iPSModelTranspileContext, psCodeItem.getPSCodeItems(), arrayNode);
		}
	}
}