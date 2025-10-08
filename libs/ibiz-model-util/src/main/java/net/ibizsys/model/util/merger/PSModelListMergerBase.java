package net.ibizsys.model.util.merger;

import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSObjectImplBase;

public abstract class PSModelListMergerBase implements IPSModelListMerger{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelListMergerBase.class);
	
	public static ObjectMapper MAPPER = new ObjectMapper();
	
	public final static ObjectNode EMPTYNODE = new ObjectMapper().createObjectNode();
	
	@Override
	public void mergeSingle(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode, String strFieldName) throws Exception {
		
		if(!iPSModelMergeContext.logMerge(objectNode, strFieldName)) {
			return ;
		}
		
		if(isEnableMergeSingle(iPSModelMergeContext)) {
			JsonNode mergeJsonNode = mergeObjectNode.get(strFieldName);
			ObjectNode mergeNode = null;
			if(mergeJsonNode instanceof ObjectNode) {
				mergeNode = (ObjectNode)mergeJsonNode;
			}		
			
			JsonNode jsonNode = objectNode.get(strFieldName);
			ObjectNode node = null;
			if(jsonNode instanceof ObjectNode) {
				node = (ObjectNode)jsonNode;
			}
			else {
				if(mergeNode == null) {
					return;
				}
				//node = objectNode.putObject(strFieldName);
				node = objectNode.set(strFieldName, mergeNode);
				mergeNode = null;
			}
			
			ObjectNode realObjectNode = this.getRealObjectNode(iPSModelMergeContext, node);
			
			if(realObjectNode != null ) {
				ObjectNode realMergeObjectNode = null;
				if(mergeNode != null) {
					realMergeObjectNode = null;this.getRealMergeObjectNode(iPSModelMergeContext, mergeNode);
				}
				if(realMergeObjectNode == null) {
					realMergeObjectNode = EMPTYNODE;
				}
				this.mergeRealItem(iPSModelMergeContext, realObjectNode, realMergeObjectNode, true);
			}
			
		}
		
	}
		
	@Override
	public void merge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode, String strFieldName) throws Exception {
		
		if(!iPSModelMergeContext.logMerge(objectNode, strFieldName)) {
			return ;
		}
		
		if(isEnableMergeChild(iPSModelMergeContext)) {
			JsonNode mergeJsonNode = mergeObjectNode.get(strFieldName);
			ArrayNode mergeArrayNode = null;
			if(mergeJsonNode instanceof ArrayNode) {
				mergeArrayNode = (ArrayNode)mergeJsonNode;
			}
			else {
				mergeArrayNode = MAPPER.createArrayNode();
			}		
			
			JsonNode jsonNode = objectNode.get(strFieldName);
			ArrayNode arrayNode = null;
			if(jsonNode instanceof ArrayNode) {
				arrayNode = (ArrayNode)jsonNode;
			}
			else {
				if(mergeArrayNode.size() == 0) {
					return;
				}
				arrayNode = objectNode.putArray(strFieldName);
			}
			
			this.onMerge(iPSModelMergeContext, arrayNode, mergeArrayNode, objectNode, mergeObjectNode, strFieldName);
		}
		else {
			JsonNode jsonNode = objectNode.get(strFieldName);
			ArrayNode arrayNode = null;
			if(jsonNode instanceof ArrayNode) {
				arrayNode = (ArrayNode)jsonNode;
			}
			if(arrayNode == null || arrayNode.size() == 0) {
				return ;
			}
			
			for(int i = 0;i<arrayNode.size();i++) {
				ObjectNode node = (ObjectNode)arrayNode.get(i);
				ObjectNode realObjectNode = this.getRealObjectNode(iPSModelMergeContext, node);
				if(realObjectNode != null) {
					this.mergeRealItem(iPSModelMergeContext, realObjectNode, EMPTYNODE, true);
				}
			}
		}
	}
	
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ArrayNode arrayNode, ArrayNode mergeArrayNode, ObjectNode objectNode, ObjectNode mergeObjectNode, String strFieldName) throws Exception {
		
		String strTag = this.getTag(iPSModelMergeContext, objectNode);
		
		if(this.isAppendChildOnly(iPSModelMergeContext)) {
			for(int i = 0;i<mergeArrayNode.size();i++) {
				ObjectNode mergeNode = (ObjectNode)mergeArrayNode.get(i);
				arrayNode.add(mergeNode);
				
				log.debug(String.format("[%1$s]模型[%2$s][%3$s]附加[%4$s]", this.getClass().getSimpleName(), strTag, strFieldName, mergeNode.toString()));
			}
			
			for(int i = 0;i<arrayNode.size();i++) {
				ObjectNode node = (ObjectNode)arrayNode.get(i);
				ObjectNode realObjectNode = this.getRealObjectNode(iPSModelMergeContext, node);
				if(realObjectNode != null) {
					this.mergeRealItem(iPSModelMergeContext, realObjectNode, EMPTYNODE, true);
				}
			}
		}
		else {
			java.util.Map<String, ObjectNode> map = new LinkedHashMap<String, ObjectNode>();
			for(int i = 0;i<arrayNode.size();i++) {
				ObjectNode node = (ObjectNode)arrayNode.get(i);
				String strId = this.getTag(iPSModelMergeContext, node).toUpperCase();
				if(map.containsKey(strId)) {
					throw new Exception(String.format("对象[%1$s]出现重复标记", node.toPrettyString()));
				}
				map.put(strId, node);
			}
			
			for(int i = 0;i<mergeArrayNode.size();i++) {
				ObjectNode mergeNode = (ObjectNode)mergeArrayNode.get(i);
				String strId2 = this.getTag(iPSModelMergeContext, mergeNode);
				String strId = strId2.toUpperCase();
				ObjectNode node = map.remove(strId);
				if(node != null) {
					//判断是否有路径
					ObjectNode realObjectNode = this.getRealObjectNode(iPSModelMergeContext, node);
					ObjectNode realMergeObjectNode = this.getRealMergeObjectNode(iPSModelMergeContext, mergeNode);
					if(realObjectNode != null && realMergeObjectNode!= null ) {
						this.mergeRealItem(iPSModelMergeContext, realObjectNode, realMergeObjectNode, true);
					}
					else if(realObjectNode == null && realMergeObjectNode == null){
						this.mergeRealItem(iPSModelMergeContext, node, mergeNode, false);
					}
					else
					{
						throw new Exception(String.format("对象模式不一致[%1$s][%1$s]", node.toPrettyString(), mergeNode.toPrettyString()));
					}
				}
				else {
					ObjectNode realMergeObjectNode = this.getRealMergeObjectNode(iPSModelMergeContext, mergeNode);
					if(realMergeObjectNode != null) {
						this.mergeRealItem(iPSModelMergeContext, realMergeObjectNode, EMPTYNODE, true);
					}
					//合入到数组中
					arrayNode.add(mergeNode);
					
					log.debug(String.format("[%1$s]模型[%2$s][%3$s]附加[%4$s]", this.getClass().getSimpleName(), strTag, strFieldName, strId2));
				}
			}
			
			for(java.util.Map.Entry<String, ObjectNode> entry : map.entrySet()) {
				ObjectNode node = entry.getValue();
				
				ObjectNode realObjectNode = this.getRealObjectNode(iPSModelMergeContext, node);
				if(realObjectNode != null) {
					this.mergeRealItem(iPSModelMergeContext, realObjectNode, EMPTYNODE, true);
				}
			}
		}
		
	}
	
	protected void mergeRealItem(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode, boolean bRefData) throws Exception {
		
		if(bRefData) {
			String strModelPath = PSObjectImplBase.getString(objectNode, "dynaModelFilePath", null);
			if(!StringUtils.hasLength(strModelPath)) {
				strModelPath = PSObjectImplBase.getString(objectNode, "id", null);
				if(StringUtils.hasLength(strModelPath)) {
					if(strModelPath.indexOf(".json")==-1) {
						strModelPath = null;
					}
				}
			}
			File modelFile = null;
			if(StringUtils.hasLength(strModelPath)) {
				modelFile = new File(iPSModelMergeContext.getDstPSModelFolderPath() + File.separator + strModelPath);
//				if(modelFile.exists()) {
//					return;
//				}
			}
			
			IPSModelMerger iPSModelMerger = this.getPSModelMerger(iPSModelMergeContext, objectNode);
//			IPSModelMerger mergePSModelMerger = this.getPSModelMerger(mergeObjectNode);
//			if(iPSModelMerger != mergePSModelMerger){
//				throw new Exception(String.format("模型对象[%1$s]合并器不一致",objectNode.toPrettyString()));
//			}
			
			iPSModelMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode);
			if(modelFile != null && !modelFile.exists()) {
				modelFile.getParentFile().mkdirs();
				try(FileOutputStream os = new FileOutputStream(modelFile)) {
					MAPPER.writerWithDefaultPrettyPrinter().writeValue(os, objectNode);
					os.flush();
				}
			}
		}
		else {
			if(PSObjectImplBase.getBoolean(objectNode, "modelref", false)) {
				return;
			}
			
			IPSModelMerger iPSModelMerger = this.getPSModelMerger(iPSModelMergeContext, objectNode);
//			IPSModelMerger mergePSModelMerger = this.getPSModelMerger(mergeObjectNode);
//			if(iPSModelMerger != mergePSModelMerger){
//				throw new Exception(String.format("模型对象[%1$s]合并器不一致",objectNode.toPrettyString()));
//			}
			
			iPSModelMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode);
		}
		
	}
	
	protected String getTag(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		
		if (PSObjectImplBase.getBoolean(objectNode, "modelref", false)) {
			String strTag = PSObjectImplBase.getString(objectNode, "path", null);
			if (!StringUtils.hasLength(strTag)) {
				strTag = PSObjectImplBase.getString(objectNode, "id", null);
				if (!StringUtils.hasLength(strTag)) {
					log.error(String.format("无法计算模型[%1$s]标识", objectNode.toPrettyString()));
					throw new Exception(String.format("无法计算模型[%1$s]标识", objectNode.toPrettyString()));
				}
			}
			return strTag;
		} else {
			String strTagField = getTagField(iPSModelMergeContext);
			if(StringUtils.hasLength(strTagField)) {
				String[] fields = strTagField.split("[;]");
				if(fields.length == 1) {
					String strTag = PSObjectImplBase.getString(objectNode, strTagField, null);
					if (StringUtils.hasLength(strTag)) {
						return strTag;
					}
				}
				else {
					StringBuilder sb = new StringBuilder();
					for(int i=0;i<fields.length;i++) {
						sb.append(String.format("-%1$s", PSObjectImplBase.getString(objectNode, fields[i], null)));
					}
					return sb.toString();
				}
			}
			
			String strTag = PSObjectImplBase.getString(objectNode, "id", null);
			if (StringUtils.hasLength(strTag)) {
				return strTag;
			}
			strTag = PSObjectImplBase.getString(objectNode, "dynaModelFilePath", null);
			if (StringUtils.hasLength(strTag)) {
				return strTag;
			}
			strTag = PSObjectImplBase.getString(objectNode, "codeName", null);
			if (StringUtils.hasLength(strTag)) {
				return strTag;
			}
			strTag = PSObjectImplBase.getString(objectNode, "name", null);
			if (StringUtils.hasLength(strTag)) {
				return strTag;
			}
			log.error(String.format("无法计算模型[%1$s]标识", objectNode.toPrettyString()));
			throw new Exception(String.format("无法计算模型[%1$s]标识", objectNode.toPrettyString()));
		}
	}
	
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return null;
	}
	
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		return false;
	}
	
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		return true;
	}
	
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		return false;
	}
	
	
	protected ObjectNode getRealObjectNode(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception{
		if (PSObjectImplBase.getBoolean(objectNode, "modelref", false)) {
			String strPath = PSObjectImplBase.getString(objectNode, "path", null);
			if(StringUtils.hasLength(strPath)) {
				String strFullModelPath = iPSModelMergeContext.getPSModelFolderPath() + File.separator + strPath;
				File modelFile = new File(strFullModelPath);
				if(modelFile.exists()) {
					return (ObjectNode) MAPPER.readTree(new File(strFullModelPath));
				}
				
				strFullModelPath = iPSModelMergeContext.getMergePSModelFolderPath() + File.separator + strPath;
				modelFile = new File(strFullModelPath);
				if(modelFile.exists()) {
					return (ObjectNode) MAPPER.readTree(new File(strFullModelPath));
				}
			}
			return null;
		}
		
		
		return objectNode;
	}
	
	protected ObjectNode getRealMergeObjectNode(IPSModelMergeContext iPSModelMergeContext, ObjectNode mergeObjectNode) throws Exception{
		if (PSObjectImplBase.getBoolean(mergeObjectNode, "modelref", false)) {
			String strPath = PSObjectImplBase.getString(mergeObjectNode, "path", null);
			if(StringUtils.hasLength(strPath)) {
				String strFullModelPath = iPSModelMergeContext.getMergePSModelFolderPath() + File.separator + strPath;
				return (ObjectNode) MAPPER.readTree(new File(strFullModelPath));
			}
			return null;
		}	
		return mergeObjectNode;
	}
	
	protected abstract IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception;
	
	
//	public Class<?> getPSModelType() {
//		return null;
//	}
}
