package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.GraphEntityField;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.GraphRelationField;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IChunkProxyDERuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IGraphEntityProxyDERuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IGraphRelationProxyDERuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IKnowledgeBaseProxyDERuntime;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.central.plugin.ai.util.domain.Triplet;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.ISearchGroupCond;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.util.JsonUtils;

public class PostgreSQLGraphRAGChunkRetriever extends GraphRAGChunkRetrieverBase{
	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PostgreSQLGraphRAGChunkRetriever.class);

	@Override
	protected List<Chunk> onRetrieve(List<Object> kbIds, Triplet triplet, IChunkSearchContext iChunkSearchContext, ParserConfig config) throws Throwable {
		final IKnowledgeBaseProxyDERuntime knowledgeBaseProxyDERuntime = this.getContext().getKnowledgeBaseProxyDERuntime(false);
		final IGraphEntityProxyDERuntime graphEntityProxyDERuntime = this.getContext().getGraphEntityProxyDERuntime(false);
		final IGraphRelationProxyDERuntime  graphRelationProxyDERuntime = this.getContext().getGraphRelationProxyDERuntime(false);
		final IChunkProxyDERuntime chunkProxyDERuntime = this.getContext().getChunkProxyDERuntime(false);
		List<Chunk> chunkList = new ArrayList<Chunk>();
		double[] queryVector = this.getEmbedding(config.getEmbeddingAgent(), iChunkSearchContext.getQuery());
		for(Object kbId : kbIds) {
			Map<Object, IEntityDTO> subjectEntityMap = new HashMap<>();
			Map<Object, IEntityDTO> objectEntityMap = new HashMap<>();

			//判断是否有Subject
			if(triplet.getSubject() != null && StringUtils.hasLength(triplet.getSubject().getName()) && StringUtils.hasLength(triplet.getSubject().getType())) {
				ISearchContextDTO graphEntitySearchContext = graphEntityProxyDERuntime.getReal().createSearchContext().all().count(false);
				boolean bGraphEntitySelect = false;

				graphEntitySearchContext.eq(graphEntityProxyDERuntime.getPSDEField(GraphEntityField.KNOWLEDGE_BASE_ID).getLowerCaseName(), kbId);
				ISearchGroupCond orSearchGroupCond = graphEntitySearchContext.or();

				ISearchGroupCond andSearchGroupCond = orSearchGroupCond.and();
				if(StringUtils.hasLength(triplet.getSubject().getName())) {
					andSearchGroupCond.eq(graphEntityProxyDERuntime.getNamePSDEField().getLowerCaseName(), triplet.getSubject().getName());
					bGraphEntitySelect = true;
				}
				if(StringUtils.hasLength(triplet.getSubject().getType())) {
					andSearchGroupCond.eq(graphEntityProxyDERuntime.getPSDEField(GraphEntityField.TYPE).getLowerCaseName(), triplet.getSubject().getType());
					bGraphEntitySelect = true;
				}

				IPSDEField normalizedNamePSDEField = graphEntityProxyDERuntime.getPSDEField(GraphEntityField.NORMALIZED_NAME);
				if(normalizedNamePSDEField != null) {
					ISearchGroupCond andSearchGroupCond2 = orSearchGroupCond.and();
					if(StringUtils.hasLength(triplet.getSubject().getName())) {
						andSearchGroupCond2.eq(normalizedNamePSDEField.getLowerCaseName(), triplet.getSubject().getName());
						bGraphEntitySelect = true;
					}
					if(StringUtils.hasLength(triplet.getSubject().getType())) {
						andSearchGroupCond2.eq(graphEntityProxyDERuntime.getPSDEField(GraphEntityField.TYPE).getLowerCaseName(), triplet.getSubject().getType());
						bGraphEntitySelect = true;
					}
				}

				if(bGraphEntitySelect) {
					List<IEntityDTO> graphEntityList = graphEntityProxyDERuntime.getReal().select(graphEntitySearchContext);
					if(!ObjectUtils.isEmpty(graphEntityList)) {
						for(IEntityDTO iEntityDTO : graphEntityList) {
							subjectEntityMap.put(graphEntityProxyDERuntime.getReal().getKeyFieldValue(iEntityDTO), iEntityDTO);
						}
					}
				}
			}

			//判断是否有Object
			if(triplet.getObject() != null && StringUtils.hasLength(triplet.getObject().getName()) && StringUtils.hasLength(triplet.getObject().getType())) {
				ISearchContextDTO graphEntitySearchContext = graphEntityProxyDERuntime.getReal().createSearchContext().all().count(false);
				boolean bGraphEntitySelect = false;

				graphEntitySearchContext.eq(graphEntityProxyDERuntime.getPSDEField(GraphEntityField.KNOWLEDGE_BASE_ID).getLowerCaseName(), kbId);
				ISearchGroupCond orSearchGroupCond = graphEntitySearchContext.or();

				ISearchGroupCond andSearchGroupCond = orSearchGroupCond.and();
				if(StringUtils.hasLength(triplet.getObject().getName())) {
					andSearchGroupCond.eq(graphEntityProxyDERuntime.getNamePSDEField().getLowerCaseName(), triplet.getObject().getName());
					bGraphEntitySelect = true;
				}
				if(StringUtils.hasLength(triplet.getObject().getType())) {
					andSearchGroupCond.eq(graphEntityProxyDERuntime.getPSDEField(GraphEntityField.TYPE).getLowerCaseName(), triplet.getObject().getType());
					bGraphEntitySelect = true;
				}

				IPSDEField normalizedNamePSDEField = graphEntityProxyDERuntime.getPSDEField(GraphEntityField.NORMALIZED_NAME);
				if(normalizedNamePSDEField != null) {
					ISearchGroupCond andSearchGroupCond2 = orSearchGroupCond.and();
					if(StringUtils.hasLength(triplet.getObject().getName())) {
						andSearchGroupCond2.eq(normalizedNamePSDEField.getLowerCaseName(), triplet.getObject().getName());
						bGraphEntitySelect = true;
					}
					if(StringUtils.hasLength(triplet.getObject().getType())) {
						andSearchGroupCond2.eq(graphEntityProxyDERuntime.getPSDEField(GraphEntityField.TYPE).getLowerCaseName(), triplet.getObject().getType());
						bGraphEntitySelect = true;
					}
				}

				if(bGraphEntitySelect) {
					List<IEntityDTO> graphEntityList = graphEntityProxyDERuntime.getReal().select(graphEntitySearchContext);
					if(!ObjectUtils.isEmpty(graphEntityList)) {
						for(IEntityDTO iEntityDTO : graphEntityList) {
							objectEntityMap.put(graphEntityProxyDERuntime.getReal().getKeyFieldValue(iEntityDTO), iEntityDTO);
						}
					}
				}
			}



//			Map<String, Chunk> chunkMap = new HashMap<String, Chunk>();
//			IPSDEField activePSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.ACTIVE, true);
//			IPSDEField pidPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.PID, true);
//			IPSDEField sequencePSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.SEQUENCE, true);
//			//IPSDEField documentNamePSDEField = documentProxyDERuntime.getNamePSDEField(true);
//			IPSDEField typePSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.TYPE, true);
//
//			//没有目标对象
//			if(!ObjectUtils.isEmpty(subjectEntityMap) && ObjectUtils.isEmpty(objectEntityMap)) {
//				List<Object> paramList = new ArrayList<Object>();
//				paramList.add(kbId);
//
//				//去连接换算向量
//				String strEntityId = "";
//				for(Object key : subjectEntityMap.keySet()) {
//					if(StringUtils.hasLength(strEntityId)) {
//						strEntityId += ",";
//					}
//					strEntityId += "?";
//					paramList.add(key);
//				}
//
//				String strSubject2anySQL = getSubject2anySQL();
//				Map<String, String> templParams = new HashMap<String, String>();
//				templParams.put("description_vector", JsonUtils.toString(queryVector));
//				templParams.put("entity_id", strEntityId);
//
//				strSubject2anySQL = this.getTemplateContent(strSubject2anySQL, templParams);
//
//				List<Object> ret = chunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSelectSQL(strSubject2anySQL, paramList);
//				if (!ObjectUtils.isEmpty(ret)) {
//					for (Object item : ret) {
//						Map map = (Map) item;
//
//						String strChunkId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getIdPSDEField().getName()));
//						//double score = DataTypeUtils.asDouble(map.get("SIMILARITY"), 0.0);
//						Chunk last = chunkMap.get(strChunkId);
//						//if (last != null && last.getSimilarity() > score) {
//						if (last != null) {
//							continue;
//						}
//
//						String docId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()));
//						String docName = DataTypeUtils.asString(map.get(ChunkField.DOCUMENT_NAME.name()));
//						String strText = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()));
//
//						last = new Chunk();
//						last.setId(strChunkId);
//						last.setDocId(docId);
//						last.setDocName(docName);
//						last.setContent(strText);
//						//last.setSimilarity(score);
//						if (sequencePSDEField != null) {
//							last.set(ChunkField.SEQUENCE.name(), map.get(sequencePSDEField.getName()));
//						}
//
//						if (typePSDEField != null) {
//							last.set(ChunkField.TYPE.name(), chunkProxyDERuntime.getFieldEnumValue(ChunkField.TYPE, map.get(typePSDEField.getName()), true));
//						}
//
//						if (pidPSDEField != null) {
//							last.setPid(DataTypeUtils.asString(map.get(pidPSDEField.getName())));
//						}
//						chunkMap.put(strChunkId, last);
//					}
//				}
//				chunkList.addAll(chunkMap.values());
//				continue;
//			}

			//双向
			if(!ObjectUtils.isEmpty(subjectEntityMap) && !ObjectUtils.isEmpty(objectEntityMap)) {
				List<Object> paramList = new ArrayList<Object>();
				paramList.add(kbId);

				//去连接换算向量
				String strEntityId = "";
				for(Object key : subjectEntityMap.keySet()) {
					if(StringUtils.hasLength(strEntityId)) {
						strEntityId += ",";
					}
					strEntityId += "?";
					paramList.add(key);
				}

				String strObjectId = "";
				for(Object key : objectEntityMap.keySet()) {
					if(StringUtils.hasLength(strObjectId)) {
						strObjectId += ",";
					}
					strObjectId += "?";
					paramList.add(key);
				}
				
				
				paramList.add(kbId);


				String strSubject2objectSQL = getSubject2objectSQL();
				Map<String, String> templParams = new HashMap<String, String>();
				templParams.put("description_vector", JsonUtils.toString(queryVector));
				templParams.put("entity_id", strEntityId);
				templParams.put("object_id", strObjectId);

				strSubject2objectSQL = this.getTemplateContent(strSubject2objectSQL, templParams);

				List<Object> ret = graphRelationProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSelectSQL(strSubject2objectSQL, paramList);
				if (!ObjectUtils.isEmpty(ret)) {
					List<IEntityDTO> allRelationList = new ArrayList<IEntityDTO>();
					for (Object item : ret) {
						Map map = (Map) item;
						IEntityDTO relation = graphRelationProxyDERuntime.getReal().createEntity(map, false);
						allRelationList.add(relation);
					}
					
					int nNodeIndex = 1;
					Map<Object, String> entityMap = new LinkedHashMap<Object, String>();
					Map<Object, IEntityDTO> relationMap = new LinkedHashMap<Object, IEntityDTO>();
					
					log.debug(String.format("subjectEntityMap ==> %1$s", subjectEntityMap.keySet()));
					log.debug(String.format("objectEntityMap ==> %1$s", objectEntityMap.keySet()));
					
					//做出连线
					for(Object subjectId : subjectEntityMap.keySet()) {
						for(Object objectId : objectEntityMap.keySet()) {
						
							List<String> path = this.findShortestPath(subjectId, objectId, allRelationList);
							
							//List<IEntityDTO> relations = new ArrayList<IEntityDTO>();
							for(int i =0;i<path.size() - 1;i++) {
								String strSourceId2 = path.get(i);
								String strTargetId2 = path.get(i+1);
								
								for(IEntityDTO relationEntityDTO : allRelationList) {
									
									//Object relationId = graphRelationProxyDERuntime.getReal().getKeyFieldValue(relationEntityDTO);
									String strSourceId = (String)graphRelationProxyDERuntime.getFieldValue(relationEntityDTO, GraphRelationField.SOURCE_ID);
									String strTargetId = (String)graphRelationProxyDERuntime.getFieldValue(relationEntityDTO, GraphRelationField.TARGET_ID);
								
									if((strSourceId2.equals(strSourceId) && strTargetId2.equals(strTargetId))
											|| (strSourceId2.equals(strTargetId) && strTargetId2.equals(strSourceId))) {
										entityMap.put(strSourceId, null);
										entityMap.put(strTargetId, null);
										relationMap.put(graphRelationProxyDERuntime.getReal().getKeyFieldValue(relationEntityDTO), relationEntityDTO);
										break;
									}
								}
							}
							
						}
					}
					
					for(Object nodeId : entityMap.keySet()) {
						String value = entityMap.get(nodeId);
						if(!StringUtils.hasLength(value)) {
							entityMap.put(nodeId, String.format("node%1$s", nNodeIndex));
							nNodeIndex ++;
						}
					}
					
					ObjectNode graphNode = JsonUtils.createObjectNode();
					ArrayNode entitiesNode = graphNode.putArray("nodes");
				
					for(Object nodeId : entityMap.keySet()) {
						IEntityDTO nodeEntityDTO = subjectEntityMap.get(nodeId);
						if(nodeEntityDTO == null) {
							nodeEntityDTO = objectEntityMap.get(nodeId);
							if(nodeEntityDTO == null) {
								nodeEntityDTO = graphEntityProxyDERuntime.getReal().getSessionEntityIf(nodeId);
							}
						}
						
						ObjectNode nodeNode = entitiesNode.addObject();
						nodeNode.put("id", entityMap.get(String.valueOf(nodeId)));
						nodeNode.put("name", graphEntityProxyDERuntime.getReal().getMajorTextIf(nodeEntityDTO));
						String strNormalizedName = (String)graphEntityProxyDERuntime.getFieldValue(nodeEntityDTO, GraphEntityField.NORMALIZED_NAME, null);
						if(StringUtils.hasLength(strNormalizedName)) {
							nodeNode.put("normalized_name", strNormalizedName);
						}
						nodeNode.put("type", (String)graphEntityProxyDERuntime.getFieldValue(nodeEntityDTO, GraphEntityField.TYPE));
						String strContext = (String)graphEntityProxyDERuntime.getFieldValue(nodeEntityDTO, GraphEntityField.CONTEXT, null);
						if(StringUtils.hasLength(strContext)) {
							nodeNode.put("context", strContext);
						}
 						nodeNode.put("description", (String)graphEntityProxyDERuntime.getFieldValue(nodeEntityDTO, GraphEntityField.DESCRIPTION));
					}
					
					
					//输出连接
					ArrayNode edgesNode = graphNode.putArray("edges");
					for(IEntityDTO relationEntityDTO : relationMap.values()) {
						ObjectNode edgeNode = edgesNode.addObject();
						//edgeNode.put("id", String.valueOf(graphRelationProxyDERuntime.getReal().getKeyFieldValue(relationEntityDTO)));
						edgeNode.put("description", (String)graphRelationProxyDERuntime.getFieldValue(relationEntityDTO, GraphRelationField.DESCRIPTION));
						
						Object strSourceId = graphRelationProxyDERuntime.getFieldValue(relationEntityDTO, GraphRelationField.SOURCE_ID);
						Object strTargetId = graphRelationProxyDERuntime.getFieldValue(relationEntityDTO, GraphRelationField.TARGET_ID);
						
						edgeNode.put("source_id", entityMap.get(String.valueOf(strSourceId)));
						edgeNode.put("target_id", entityMap.get(String.valueOf(strTargetId)));
					}
					
					StringBuilder sb = new StringBuilder();
					IEntityDTO knowledgeBaseEntityDTO = this.getContext().getKnowledgeBaseEntityDTO(kbId, false);
					sb.append(String.format("```json\r\n%1$s\r\n```",  graphNode.toPrettyString()));
					
					Chunk chunk = new Chunk();
					chunk.setId(StringUtils.collectionToDelimitedString(entityMap.keySet(), ",") + "|" + StringUtils.collectionToDelimitedString(relationMap.keySet(), ","));
					chunk.setType(ChunkType.GRAPH.getValue());
					chunk.setContent(sb.toString());
					chunk.setKBId(String.valueOf(knowledgeBaseProxyDERuntime.getReal().getKeyFieldValue(knowledgeBaseEntityDTO)));
					chunk.setKBName(String.valueOf(knowledgeBaseProxyDERuntime.getReal().getMajorTextIf(knowledgeBaseEntityDTO)));
					chunkList.add(chunk);
				}
			}
		}

		return chunkList;
	}
//	
//	protected List<List<IEntityDTO>> getRelationsList(Object subjectId, Object objectId, List<IEntityDTO> allRelationList, Set<Object> ignoreIdSet) throws Throwable {
//		
//		if(subjectId.equals(objectId)) {
//			throw new Exception("源点及目标点不能一致");
//		}
//		
//		log.debug(String.format("Subject[%1$s] ObjectId[%2$s]", subjectId, objectId));
//		
//		final IGraphRelationProxyDERuntime  graphRelationProxyDERuntime = this.getContext().getGraphRelationProxyDERuntime(false);
//		//循环全部连接，找出subjectId的所有连接
//		List<List<IEntityDTO>> relationsList = new ArrayList<List<IEntityDTO>>(); 
//		for(IEntityDTO relationEntityDTO : allRelationList) {
//			
//			//Object relationId = graphRelationProxyDERuntime.getReal().getKeyFieldValue(relationEntityDTO);
//			String strSourceId = (String)graphRelationProxyDERuntime.getFieldValue(relationEntityDTO, GraphRelationField.SOURCE_ID);
//			String strTargetId = (String)graphRelationProxyDERuntime.getFieldValue(relationEntityDTO, GraphRelationField.TARGET_ID);
//			
//			if(ignoreIdSet.contains(strSourceId)) {
//				continue;
//			}
//			
//			if(ignoreIdSet.contains(strTargetId)) {
//				continue;
//			}
//			
//			if(subjectId.equals(strSourceId)) {
//				//源点OK，判断终点
//				if(objectId.equals(strTargetId)) {
//					//目标点ok
//					log.debug(String.format("连接命中"));
//					List<IEntityDTO> list = new ArrayList<IEntityDTO>();
//					list.add(relationEntityDTO);
//					relationsList.add(list);
//					break;
//				}
//				else {
//					Set<Object> ignoreIdSet2 = new HashSet<Object>(ignoreIdSet);
//					ignoreIdSet2.add(strSourceId);
//					
//					//终点不一致，递归
//					List<List<IEntityDTO>> relationsList2 = getRelationsList(strTargetId, objectId, allRelationList, ignoreIdSet2);
//					if(!ObjectUtils.isEmpty(relationsList2)) {
//						//存在连接
//						for(List<IEntityDTO> list2 : relationsList2) {
//							List<IEntityDTO> list = new ArrayList<IEntityDTO>();
//							list.add(relationEntityDTO);
//							list.addAll(list2);
//							relationsList.add(list);
//						}
//					}
//				}
//				
//			}
//			else
//				if(subjectId.equals(strTargetId)) {
//					//源点OK，判断终点
//					if(objectId.equals(strSourceId)) {
//						//目标点ok
//						log.debug(String.format("连接命中"));
//						List<IEntityDTO> list = new ArrayList<IEntityDTO>();
//						list.add(relationEntityDTO);
//						relationsList.add(list);
//						break;
//					}
//					else {
//						Set<Object> ignoreIdSet2 = new HashSet<Object>(ignoreIdSet);
//						ignoreIdSet2.add(strTargetId);
//						
//						//终点不一致，递归
//						List<List<IEntityDTO>> relationsList2 = getRelationsList(strSourceId, objectId, allRelationList, ignoreIdSet2);
//						if(!ObjectUtils.isEmpty(relationsList2)) {
//							//存在连接
//							for(List<IEntityDTO> list2 : relationsList2) {
//								List<IEntityDTO> list = new ArrayList<IEntityDTO>();
//								list.add(relationEntityDTO);
//								list.addAll(list2);
//								relationsList.add(list);
//							}
//						}
//					}
//				}
//		}
//		
//		return relationsList;
//	}

	protected String getSubject2anySQL() {
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(PostgreSQLGraphRAGChunkRetriever.class, "Subject2any.sql", false);
	}

	protected String getSubject2objectSQL() {
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(PostgreSQLGraphRAGChunkRetriever.class, "Subject2object.sql", false);
	}

	protected String getObject2subjectSQL() {
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(PostgreSQLGraphRAGChunkRetriever.class, "Object2subject.sql", false);
	}
}
