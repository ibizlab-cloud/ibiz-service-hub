package net.ibizsys.model.util.transpiler.extend.codelist;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.codelist.PSCodeListImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSCodeItem;
import net.ibizsys.psmodel.core.domain.PSCodeList;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSCodeListListTranspilerEx extends net.ibizsys.model.util.transpiler.codelist.PSCodeListListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSCodeList iPSCodeList = (IPSCodeList)iPSModelObject;
			PSCodeList psCodeList = (PSCodeList)domain;
			
			if(iPSCodeList.getPSCodeItems()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSCodeItem.class, false).decompile(iPSModelTranspileContext, iPSCodeList.getPSCodeItems(), psCodeList.getPSCodeItemsIf(), bFullMode);
				int nOrder = 100;
				for(PSCodeItem child : psCodeList.getPSCodeItemsIf()) {
					child.setPSCodeListId(psCodeList.getId());
					child.setPSCodeListName(psCodeList.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
			
		}
	}
	
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		
		PSCodeList psCodeList = (PSCodeList)domain;
		if (!ObjectUtils.isEmpty(psCodeList.getPSCodeItems())) {
			ArrayNode arrayNode = objectNode.putArray(PSCodeListImpl.ATTR_GETPSCODEITEMS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSCodeItem.class, false).compile(iPSModelTranspileContext, psCodeList.getPSCodeItems(), arrayNode);
		}
	}

	@Override
	protected String[] getModelFolders() {
		return getSystemModelFolder("PSCODELISTS");
	}
}