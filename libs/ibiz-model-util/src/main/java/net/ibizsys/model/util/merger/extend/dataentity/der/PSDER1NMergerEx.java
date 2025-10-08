package net.ibizsys.model.util.merger.extend.dataentity.der;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.dataentity.der.PSDER1NImpl;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelListMergerBase;
import net.ibizsys.model.util.merger.dataentity.der.PSDER1NMerger;

public class PSDER1NMergerEx extends PSDER1NMerger {

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {
		
		//需要合并外键值文本属性，后续可能指定
		if(mergeObjectNode != PSModelListMergerBase.EMPTYNODE) {
			if(!objectNode.has(PSDER1NImpl.ATTR_GETPSPICKUPTEXTDEFIELD) && mergeObjectNode.has(PSDER1NImpl.ATTR_GETPSPICKUPTEXTDEFIELD)) {
				objectNode.set(PSDER1NImpl.ATTR_GETPSPICKUPTEXTDEFIELD, mergeObjectNode.get(PSDER1NImpl.ATTR_GETPSPICKUPTEXTDEFIELD).deepCopy());
			}
		}
		
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}
