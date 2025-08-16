package net.ibizsys.model.util.merger.extend.control.menu;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.control.menu.PSAppMenuImpl;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelListMergerBase;
import net.ibizsys.model.util.merger.control.menu.PSAppMenuMerger;
import net.ibizsys.model.util.merger.extend.app.PSApplicationMergerEx;

public class PSAppMenuMergerEx extends PSAppMenuMerger {

	@Override
	public void merge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {
		if(mergeObjectNode == PSModelListMergerBase.EMPTYNODE) {
			JsonNode codeNameNode = objectNode.get(PSAppMenuImpl.ATTR_GETCODENAME);
			if(codeNameNode != null) {
				String strCodeName = codeNameNode.asText();
				if(StringUtils.hasLength(strCodeName)) {
					strCodeName = strCodeName.toUpperCase();
					Object param = iPSModelMergeContext.getParam(PSApplicationMergerEx.CONTEXTPARAM_PSAPPMENUS);
					if(param instanceof Map) {
						Map map = (Map)param;
						if(map.containsKey(strCodeName)) {
							mergeObjectNode = (ObjectNode)map.get(strCodeName);
						}
					}
				}
			}
		}
		super.merge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}
