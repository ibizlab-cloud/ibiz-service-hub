package net.ibizsys.model.util.merger.extend.dataentity.uiaction;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelListMergerBase;
import net.ibizsys.model.util.merger.dataentity.uiaction.PSDEUIActionGroupMerger;
import net.ibizsys.model.util.merger.extend.app.PSApplicationMergerEx;

public class PSDEUIActionGroupMergerEx extends PSDEUIActionGroupMerger {

	@Override
	public void merge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {
		if(mergeObjectNode == PSModelListMergerBase.EMPTYNODE) {
			JsonNode uniqueTagNode = objectNode.get(PSDEUIActionGroupImpl.ATTR_GETUNIQUETAG);
			if(uniqueTagNode != null) {
				String strUniqueTag = uniqueTagNode.asText();
				if(StringUtils.hasLength(strUniqueTag)) {
					Object param = iPSModelMergeContext.getParam(PSApplicationMergerEx.CONTEXTPARAM_PSAPPDEUIACTIONGROUPS);
					if(param instanceof Map) {
						Map map = (Map)param;
						if(map.containsKey(strUniqueTag)) {
							mergeObjectNode = (ObjectNode)map.get(strUniqueTag);
						}
					}
				}
			}
		}
		super.merge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}
