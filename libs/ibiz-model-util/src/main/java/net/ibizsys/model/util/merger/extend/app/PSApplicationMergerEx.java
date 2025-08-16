package net.ibizsys.model.util.merger.extend.app;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.app.PSApplicationImpl;
import net.ibizsys.model.control.menu.PSAppMenuImpl;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelListMergerBase;
import net.ibizsys.model.util.merger.app.PSApplicationMerger;

public class PSApplicationMergerEx extends PSApplicationMerger {

	public final static String CONTEXTPARAM_PSAPPDEUIACTIONGROUPS = "PSAPPDEUIACTIONGROUPS";
	public final static String CONTEXTPARAM_PSAPPMENUS = "PSAPPMENUS";
	
	@Override
	public void merge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		iPSModelMergeContext.setParam(CONTEXTPARAM_PSAPPDEUIACTIONGROUPS, null);
		iPSModelMergeContext.setParam(CONTEXTPARAM_PSAPPMENUS, null);
		
		if(mergeObjectNode != PSModelListMergerBase.EMPTYNODE ) {
			String strAppCodeName = objectNode.get(PSApplicationImpl.ATTR_GETCODENAME).asText();
			if(true) {
				// 合入子应用模型
				String strModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.hubsubapp.json", iPSModelMergeContext.getMergePSModelFolderPath(), File.separator, strAppCodeName);
				File hubsubappFile = new File(strModelPath);
				if (hubsubappFile.exists()) {
					ObjectNode hubsubappNode = (ObjectNode) PSModelListMergerBase.MAPPER.readTree(hubsubappFile);
					JsonNode allPSAppDEUIActionGroupsNode = hubsubappNode.get("getAllPSAppDEUIActionGroups");
					Map<String, ObjectNode> psAppDEUIActionGroupMap = new HashMap<>();
					if (allPSAppDEUIActionGroupsNode instanceof ArrayNode) {
						ArrayNode arrayNode = (ArrayNode) allPSAppDEUIActionGroupsNode;
						for (int i = 0; i < arrayNode.size(); i++) {
							ObjectNode psAppDEUIActionGroupNode = (ObjectNode) arrayNode.get(i);
							JsonNode uniqueTagNode = psAppDEUIActionGroupNode.get("uniqueTag");
							if (uniqueTagNode == null || !StringUtils.hasLength(uniqueTagNode.asText())) {
								continue;
							}
							String strUniqueId = uniqueTagNode.asText();
							// 查找对于的模型组
							psAppDEUIActionGroupMap.put(strUniqueId, psAppDEUIActionGroupNode);
						}
						if(psAppDEUIActionGroupMap.size()>0) {
							iPSModelMergeContext.setParam(CONTEXTPARAM_PSAPPDEUIACTIONGROUPS, psAppDEUIActionGroupMap);
						}
					}
				}
			}
			
			if(true) {
				String strModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.json", iPSModelMergeContext.getMergePSModelFolderPath(), File.separator, strAppCodeName);
				File appFile = new File(strModelPath);
				if (appFile.exists()) {
					ObjectNode appNode = (ObjectNode) PSModelListMergerBase.MAPPER.readTree(appFile);
					JsonNode allPSAppMenuModelsNode = appNode.get(PSApplicationImpl.ATTR_GETALLPSAPPMENUMODELS);
					Map<String, ObjectNode> psAppMenuModelMap = new HashMap<>();
					if (allPSAppMenuModelsNode instanceof ArrayNode) {
						ArrayNode arrayNode = (ArrayNode) allPSAppMenuModelsNode;
						for (int i = 0; i < arrayNode.size(); i++) {
							ObjectNode psAppMenuModelNode = (ObjectNode) arrayNode.get(i);
							JsonNode pathNode = psAppMenuModelNode.get("path");
							if (pathNode == null || !StringUtils.hasLength(pathNode.asText())) {
								continue;
							}
							String strPath = pathNode.asText();
							strPath = String.format("%1$s%2$s%3$s", iPSModelMergeContext.getMergePSModelFolderPath(), File.separator, strPath); 
							File appMenuFile = new File(strPath);
							if(appMenuFile.exists()) {
								ObjectNode appMenuNode = (ObjectNode) PSModelListMergerBase.MAPPER.readTree(appMenuFile);
								JsonNode codeNameNode = appMenuNode.get(PSAppMenuImpl.ATTR_GETCODENAME);
								if (codeNameNode == null || !StringUtils.hasLength(codeNameNode.asText())) {
									continue;
								}
								// 查找对于的模型组
								psAppMenuModelMap.put(codeNameNode.asText().toUpperCase(), appMenuNode);
							}
							
						}
						if(psAppMenuModelMap.size()>0) {
							iPSModelMergeContext.setParam(CONTEXTPARAM_PSAPPMENUS, psAppMenuModelMap);
						}
					}
				}
			}
			
			
		}
		

		super.merge(iPSModelMergeContext, objectNode, mergeObjectNode);
		
		if(mergeObjectNode != PSModelListMergerBase.EMPTYNODE ) {
			//清空缓存
			if(objectNode.has("cache")) {
				objectNode.remove("cache");
			}
			
		}
	}

}
