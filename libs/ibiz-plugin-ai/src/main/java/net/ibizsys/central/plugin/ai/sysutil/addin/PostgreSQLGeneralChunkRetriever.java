package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.RecursiveCharacterTextSplitter;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.ChunkField;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.ChunkType;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.DocumentField;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IChunkProxyDERuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IDocumentProxyDERuntime;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;

public class PostgreSQLGeneralChunkRetriever extends GeneralChunkRetrieverBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PostgreSQLGeneralChunkRetriever.class);

	@Override
	protected List<Chunk> onRetrieve(List<Object> kbIds, IChunkSearchContext iChunkSearchContext, ParserConfig config) throws Throwable {

		final IChunkProxyDERuntime chunkProxyDERuntime = this.getContext().getChunkProxyDERuntime(false);
		final IDocumentProxyDERuntime documentProxyDERuntime = this.getContext().getDocumentProxyDERuntime(false);

		IDBDialect iDBDialect = chunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().getDBDialect();
		String paramList = "";
		for (int i = 0; i < kbIds.size(); i++) {
			if (i != 0) {
				paramList += ",";
			}
			paramList += "?";
		}
		
		String docIdParamList = "";
		List<Object> docIds = new ArrayList<Object>();
		if(!ObjectUtils.isEmpty(iChunkSearchContext.getDocIds())) {
			for (int i = 0; i < iChunkSearchContext.getDocIds().size(); i++) {
				if (i != 0) {
					docIdParamList += ",";
				}
				docIdParamList += "?";
				docIds.add(DataTypeUtils.convert(documentProxyDERuntime.getIdPSDEField().getStdDataType(), iChunkSearchContext.getDocIds().get(i)));
			}
		}
		

		Map<String, Chunk> chunkMap = new LinkedHashMap<String, Chunk>();
		IPSDEField activePSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.ACTIVE, true);
		IPSDEField pidPSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.PID, true);
		IPSDEField sequencePSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.SEQUENCE, true);
		IPSDEField documentNamePSDEField = documentProxyDERuntime.getNamePSDEField(true);
		IPSDEField typePSDEField = chunkProxyDERuntime.getPSDEField(ChunkField.TYPE, true);
		IPSDEField documentCategoriesPSDEField = documentProxyDERuntime.getPSDEField(DocumentField.CATEGORIES, true);
		IPSDEField namePSDEField = chunkProxyDERuntime.getNamePSDEField(true);

		Object indexTypeValue = null;
		Object pageTypeValue = null;
		
		if (typePSDEField != null) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(ChunkField.TYPE.name(), ChunkType.INDEX);
			IEntityDTO simple = chunkProxyDERuntime.getEntityDTO(map);
			indexTypeValue = simple.get(typePSDEField.getLowerCaseName());
			map.put(ChunkField.TYPE.name(), ChunkType.PAGE);
			simple = chunkProxyDERuntime.getEntityDTO(map);
			pageTypeValue = simple.get(typePSDEField.getLowerCaseName());
		}
		
		int nPageIndexMode = DataTypeUtils.asInteger(iChunkSearchContext.getPageIndex(), IChunkSearchContext.PAGEINDEX_DISABLED);
		if(nPageIndexMode > IChunkSearchContext.PAGEINDEX_DISABLED && iChunkSearchContext.getPageable().getPageNumber() == 0) {
			if (sequencePSDEField != null && !ObjectUtils.isEmpty(indexTypeValue) && !ObjectUtils.isEmpty(pageTypeValue)) {
				// 尝试获取资料库的页面索引片段
				String strSQL = String.format("select t.%2$s,t.%3$s, t.%4$s FROM %1$s t INNER JOIN %6$s t2 on t.%3$s = t2.%7$s where t.%4$s IS NOT NULL AND t.%5$s = ? AND t2.%8$s IN (%10$s) ORDER BY t.%3$s, t.%9$s ", iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.TYPE).getName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getPSDEField(DocumentField.KNOWLEDGE_BASE_ID).getName()), iDBDialect.getDBObjStandardName(sequencePSDEField.getName()), paramList);

				if (documentNamePSDEField != null) {
					strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_NAME,t", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName())));
				}
				
				if (documentCategoriesPSDEField != null) {
					strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_CATEGORIES,t", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName())));
				}
				
				if (activePSDEField != null) {
					strSQL = strSQL.replace("where t", String.format("where t.%1$s = 1 AND t", iDBDialect.getDBObjStandardName(activePSDEField.getName())));
				}
				
				List<Object> sqlParamList = new ArrayList<Object>();
				sqlParamList.add(indexTypeValue);
				sqlParamList.addAll(kbIds);
				
				if(!ObjectUtils.isEmpty(docIdParamList)) {
					strSQL = strSQL.replace("where t", String.format("where t.%1$s in (%2$s) AND t", iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), docIdParamList));
					sqlParamList.addAll(0, docIds);
				}
				
				if(documentCategoriesPSDEField != null && !ObjectUtils.isEmpty(iChunkSearchContext.getDocCategories())) {
					String strReplaceContent = "";
					for(String strDocCategories : iChunkSearchContext.getDocCategories()) {
						if(!ObjectUtils.isEmpty(strReplaceContent)) {
							strReplaceContent += " OR ";
						}
						if(strDocCategories.indexOf("%") == -1) {
							strReplaceContent += String.format("t2.%1$s = ?", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName()));
						}
						else {
							strReplaceContent += String.format("t2.%1$s like ?", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName()));
						}
					}
					strSQL = strSQL.replace("where t", String.format("where (%1$s) AND t", strReplaceContent));
					sqlParamList.addAll(0, iChunkSearchContext.getDocCategories());
				}

				if(documentNamePSDEField != null && !ObjectUtils.isEmpty(iChunkSearchContext.getDocNames())) {
					String strReplaceContent = "";
					for(String strDocName : iChunkSearchContext.getDocNames()) {
						if(!ObjectUtils.isEmpty(strReplaceContent)) {
							strReplaceContent += " OR ";
						}
						if(strDocName.indexOf("%") == -1) {
							strReplaceContent += String.format("t2.%1$s = ?", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName()));
						}
						else {
							strReplaceContent += String.format("t2.%1$s like ?", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName()));
						}
					}
					strSQL = strSQL.replace("where t", String.format("where (%1$s) AND t", strReplaceContent));
					sqlParamList.addAll(0, iChunkSearchContext.getDocNames());
				}
				
				// 查出索引
				List<Object> ret2 = chunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSelectSQL(strSQL, sqlParamList);
				if (!ObjectUtils.isEmpty(ret2)) {
					List<List<Object>> partitions = new ArrayList<>();
					for (int i = 0; i < ret2.size(); i += 12) {
						int end = Math.min(i + 12, ret2.size());
						partitions.add(new ArrayList<>(ret2.subList(i, end)));
					}
					
					String strPageRetrieverPrompt = this.getPageRetrieverPrompt(config);

					List<IAction> actionList = new ArrayList<IAction>();
					
					for (List<Object> ret3 : partitions) {
						Object finalPageTypeValue = pageTypeValue;
						actionList.add(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								List<Object> ret = ret3;
								Map<String, String> chunkDocumentIdMap = new LinkedHashMap<String, String>();
								
								ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
								ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create().system(strPageRetrieverPrompt);

								StringBuilder sb = new StringBuilder();
								int nIndex = 1;
								for (Object item : ret) {
									Map map = (Map) item;
									IEntityDTO indexChunkEntityDTO = chunkProxyDERuntime.getEntityDTO(map);
									String strContent = indexChunkEntityDTO.getString(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getLowerCaseName(), null);
									String strDocumentId = indexChunkEntityDTO.getString(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getLowerCaseName(), null);
									String strChunkId = indexChunkEntityDTO.getString(chunkProxyDERuntime.getIdPSDEField().getLowerCaseName(), null);
									String docName = DataTypeUtils.asString(map.get(ChunkField.DOCUMENT_NAME.name()));
									if(StringUtils.hasLength(docName)) {
										String docCategories = DataTypeUtils.asString(map.get("DOCUMENT_CATEGORIES"));
										if(StringUtils.hasLength(docCategories)) {
											docName = docCategories + "/" + docName;
										}
									}
									
									
									ObjectNode node = JsonUtils.toObjectNode(strContent);
									node.put("document_id", strChunkId);
									chunkDocumentIdMap.put(strChunkId, strDocumentId);
									if(StringUtils.hasLength(docName)) {
										sb.append(String.format("## 目录`%1$s`，来自文档`%3$s`\n```json\n%2$s\n```\n", nIndex, node.toPrettyString(), docName));
									}
									else {
										sb.append(String.format("## 文档目录`%1$s`\n```json\n%2$s\n```\n", nIndex, node.toPrettyString()));
									}
									nIndex++;
								}
								
								ArrayNode queriesNode = JsonUtils.createArrayNode();
								for(String strQuery : iChunkSearchContext.getQueries()) {
									queriesNode.add(strQuery);
								}


								chatMessagesBuilder.assistant(sb.toString());

								//sb.append(String.format("## 查询内容\判断上面的json内容与下面的查询词关系\n```json\n%1$s\n```\n", queriesNode.toPrettyString()));

								chatMessagesBuilder.user(String.format("# 查找如下内容相关的目录\n```json\n%1$s\n```\n", queriesNode.toPrettyString()));

								chatCompletionRequest.setMessages(chatMessagesBuilder.build());

								Map<String, List<Integer>> selectedPageMap = new LinkedHashMap<String, List<Integer>>();
								
								Map<String, Double> confidenceMap = new LinkedHashMap<String, Double>();
								Map<String, String> reasonMap = new LinkedHashMap<String, String>();
								

								AtomicInteger error = new AtomicInteger(0);
								ArrayNode arrayNode = null;
								while(true) {
									try {
										ChatCompletionResult result = getContext().chatCompletion(getContext().getQueryChatAgent(), chatCompletionRequest);
										String strJsonContent = AIChatUtils.getJsonContent(result);
										JsonNode jsonNode = JsonUtils.toJsonNode(strJsonContent);
										if(jsonNode != null) {
											if(jsonNode instanceof ArrayNode) {
												arrayNode = (ArrayNode)jsonNode;
											}
											else
												if(jsonNode instanceof ObjectNode) {
													arrayNode = JsonUtils.createArrayNode();
													arrayNode.add(jsonNode);
												}
										}
										
										if(arrayNode == null) {
											log.error(String.format("无法从返回内容提取JSON内容\r\n%1$s", result.getChoices().get(0).getContent()));
											throw new Exception("返回内容格式不正确");
										}
										break;
									}
									catch (Throwable ex) {
										if(error.incrementAndGet()>=3) {
											throw ex;
										}
										log.error(ex);
									}
								}
								if(arrayNode != null) {
									for (int i = 0; i < arrayNode.size(); i++) {
										ObjectNode documentNode = (ObjectNode) arrayNode.get(i);
										String strChunkId = documentNode.get("document_id").asText();
										String strDocumentId = chunkDocumentIdMap.get(strChunkId);
										if (ObjectUtils.isEmpty(strDocumentId)) {
											log.warn(String.format("无法获取片段[%1$s]对应的文档标识", strChunkId));
											continue;
										}
										
										JsonNode pageRangeJsonNode = documentNode.path("page_range");
										List<ObjectNode> pageRangeNodeList = new ArrayList<ObjectNode>();
										if(!pageRangeJsonNode.isMissingNode()) {
											if(pageRangeJsonNode.isObject()) {
												pageRangeNodeList.add((ObjectNode)pageRangeJsonNode);
											}
											else
												if(pageRangeJsonNode.isArray()) {
													ArrayNode pageRangeArrayNode = (ArrayNode)pageRangeJsonNode;
													for(int j = 0;j<pageRangeArrayNode.size();j++) {
														JsonNode jsonNode = pageRangeArrayNode.get(j);
														if(jsonNode.isObject()) {
															pageRangeNodeList.add((ObjectNode)jsonNode);
														}
													}
												}
										}
										for(ObjectNode pageRangeNode : pageRangeNodeList) {
											String strStart = null;
											String strEnd = null;
											if(pageRangeNode != null) {
												if(pageRangeNode.has("start")) {
													strStart = pageRangeNode.get("start").asText();
												}
												if(pageRangeNode.has("end")) {
													strEnd = pageRangeNode.get("end").asText();
												}
												else 
													strEnd = strStart;
											}

											if (ObjectUtils.isEmpty(strStart) || ObjectUtils.isEmpty(strEnd)) {
												log.warn(String.format("返回选择页面结构未包含开始或结束页面\r\n%1$s", documentNode.toPrettyString()));
												continue;
											}

											int nStart = Integer.parseInt(strStart.replace("P", ""));
											int nEnd = Integer.parseInt(strEnd.replace("P", ""));
											
											double fConfidence = 0.85;
											if(documentNode.get("relevance") != null) {
												fConfidence = documentNode.get("relevance").asDouble(fConfidence);
												if(fConfidence <= 0 ) {
													fConfidence = 0.85;
												}
											}
											
											String strReason = (String)documentNode.get("reason").asText(null);
//											String strSummary = (String)documentNode.get("rerank_reason").asText(null);

											List<Integer> list = selectedPageMap.get(strDocumentId);
											if (list == null) {
												list = new ArrayList<Integer>();
												selectedPageMap.put(strDocumentId, list);
											}

											for (int j = nStart; j <= nEnd; j++) {
												if (!list.contains(j)) {
													list.add(j);
													String strConfidenceId = String.format("%1$s|%2$s", strDocumentId, j);
													confidenceMap.put(strConfidenceId, fConfidence);
													reasonMap.put(strConfidenceId, strReason);
												}
											}
										}
									}
								}
		
								

								// 查询实际列表
								log.debug(String.format("返回文档及页面\r\n%1$s", selectedPageMap));

								for (String strDocumentId : selectedPageMap.keySet()) {

									List<Integer> list = selectedPageMap.get(strDocumentId);

									List<Object> sqlParamList2 = new ArrayList<Object>();
									sqlParamList2.add(strDocumentId);
									sqlParamList2.add(finalPageTypeValue);
									sqlParamList2.addAll(list);

									String paramList2 = "";
									for (int i = 0; i < list.size(); i++) {
										if (i != 0) {
											paramList2 += ",";
										}
										paramList2 += "?";
									}

									String strSQL = String.format("select t.%3$s,t.%4$s, t.%5$s FROM %2$s t INNER JOIN %7$s t2 on t.%4$s = t2.%8$s where t.%4$s =? AND t.%1$s =? AND t.%9$s IN (%10$s) ORDER BY t.%9$s ", iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.TYPE).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.QUESTIONS_VECTOR).getName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(sequencePSDEField.getName()), paramList2);

									if (activePSDEField != null) {
										strSQL = strSQL.replace("where t", String.format("where t.%1$s = 1 AND t", iDBDialect.getDBObjStandardName(activePSDEField.getName())));
									}

									if (sequencePSDEField != null) {
										strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(sequencePSDEField.getName())));
									}

									if (pidPSDEField != null) {
										strSQL = strSQL.replace("select t", String.format("select t.%1$s,t", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
									}

									if (typePSDEField != null) {
										strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(typePSDEField.getName())));
									}

									if (namePSDEField != null) {
										strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(namePSDEField.getName())));
									}
									
									if (documentNamePSDEField != null) {
										strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_NAME,t", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName())));
									}
									
									if (documentCategoriesPSDEField != null) {
										strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_CATEGORIES,t", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName())));
									}

									ret = chunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSelectSQL(strSQL, sqlParamList2);
									if (!ObjectUtils.isEmpty(ret)) {
										for (Object item : ret) {
											Map map = (Map) item;

											String strChunkId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getIdPSDEField().getName()));
											String docId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()));
											String docName = DataTypeUtils.asString(map.get(ChunkField.DOCUMENT_NAME.name()));
											String strText = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()));
											String docCategories = DataTypeUtils.asString(map.get("DOCUMENT_CATEGORIES"));
											if(StringUtils.hasLength(docCategories)) {
												docName = docCategories + "/" + docName;
											}

											Chunk chunk = new Chunk();
											chunk.setId(strChunkId);
											chunk.setDocId(docId);
											chunk.setDocName(docName);
											chunk.setContent(strText);
											chunk.setSimilarity(0.7);
											if (sequencePSDEField != null) {
												chunk.set(ChunkField.SEQUENCE.name(), map.get(sequencePSDEField.getName()));
												String strConfidenceId = String.format("%1$s|%2$s", strDocumentId, chunk.get(ChunkField.SEQUENCE.name()));
												if(confidenceMap.containsKey(strConfidenceId)) {
													double fSimilarity = ((double)confidenceMap.get(strConfidenceId));
													chunk.setSimilarity(fSimilarity);
												}
												
												if(reasonMap.containsKey(strConfidenceId)) {
													String strReason = reasonMap.get(strConfidenceId);
													chunk.set("reason", strReason);
												}

											}
											
											if (typePSDEField != null) {
												chunk.set(ChunkField.TYPE.name(), chunkProxyDERuntime.getFieldEnumValue(ChunkField.TYPE, map.get(typePSDEField.getName()), true));
											}

											if (pidPSDEField != null) {
												chunk.setPid(DataTypeUtils.asString(map.get(pidPSDEField.getName())));
											}
											
											if (namePSDEField != null) {
												chunk.setName(DataTypeUtils.asString(map.get(namePSDEField.getName())));
											}
											
											synchronized(chunkMap) {
												Chunk last = chunkMap.get(strChunkId);
												if(last == null || last.getSimilarity() < chunk.getSimilarity()) {
													chunkMap.put(strChunkId, chunk);
												}
											}
											
										}
									}
								}
								return null;
							}
						});
					}
					this.getContext().threadRunAllOf(actionList, false, null);
				}
				
				List<Chunk> chunkList = new ArrayList<Chunk>();
				if (!ObjectUtils.isEmpty(chunkMap)) {
					chunkList.addAll(chunkMap.values());
					if(sequencePSDEField != null) {
						Collections.sort(chunkList, new Comparator<Chunk>() {
							@Override
							public int compare(Chunk o1, Chunk o2) {
								return Integer.compare((int)o1.get(ChunkField.SEQUENCE.name()), (int)o2.get(ChunkField.SEQUENCE.name()));
							}
						});
					}
					
					
					//按照置信度进行排序
					Collections.sort(chunkList, new Comparator<Chunk>() {
						@Override
						public int compare(Chunk o1, Chunk o2) {
							return Double.compare(o2.getSimilarity(), o1.getSimilarity());
						}
					});
				}
				int nSize = Math.min(iChunkSearchContext.getPageable().getPageSize(), chunkList.size());
				if(nSize != 0 || nPageIndexMode != IChunkSearchContext.PAGEINDEX_AUTO) {
					return chunkList.subList(0, nSize);
				}
			}
			else {
				log.error(String.format("页面索引缺乏相关属性定义，忽略"));
			}
		}
		
		
		
		String typeParamList = "";
		List<Object> types = new ArrayList<Object>();
		if(typePSDEField != null && !ObjectUtils.isEmpty(iChunkSearchContext.getTypes())) {
			for (int i = 0; i < iChunkSearchContext.getTypes().size(); i++) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put(ChunkField.TYPE.name(), iChunkSearchContext.getTypes().get(i));
				IEntityDTO simple = chunkProxyDERuntime.getEntityDTO(map);
				Object typeValue = simple.get(typePSDEField.getLowerCaseName());
				if(ObjectUtils.isEmpty(typeValue)) {
					continue;
				}
				
				if(StringUtils.hasLength(typeParamList)) {
					typeParamList += ",";
				}
				typeParamList += "?";
				
				types.add(typeValue);
			}
		}
		

		
		boolean strSQLLike= false;
		if(ObjectUtils.isEmpty(iChunkSearchContext.getQueries())) {
			strSQLLike = true;
		}
		
		if(!strSQLLike) {
			
			//判断是否需要进行语言翻译
			Set<String> queryList = new HashSet<String>();
			queryList.addAll(iChunkSearchContext.getQueries());
			
			if(!ObjectUtils.isEmpty(queryList) && !ObjectUtils.isEmpty(iChunkSearchContext.getLanguages())) {
				
				String strTranslationPrompt = this.getTranslationPrompt(config);
				ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
				ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create().system(strTranslationPrompt);
				
				ObjectNode objectNode = JsonUtils.createObjectNode();
				ArrayNode source_texts = objectNode.putArray("source_texts");
				for(String strQuery : iChunkSearchContext.getQueries()) {
					source_texts.add(strQuery);
				}
				ArrayNode target_languages = objectNode.putArray("target_languages");
				for(String strLanguage : iChunkSearchContext.getLanguages()) {
					target_languages.add(strLanguage);
				}

				StringBuilder sb = new StringBuilder();
				sb.append(String.format("## 翻译内容\n```json\n%1$s\n```\n", objectNode.toPrettyString()));

				chatMessagesBuilder.user(sb.toString());

				chatCompletionRequest.setMessages(chatMessagesBuilder.build());
				AtomicInteger error = new AtomicInteger(0);
				ArrayNode arrayNode = null;
				while(true) {
					try {
						ChatCompletionResult result = getContext().chatCompletion(getContext().getQueryChatAgent(), chatCompletionRequest);
						String strJsonContent = AIChatUtils.getJsonContent(result);
						arrayNode = JsonUtils.toArrayNode(strJsonContent);
						if(arrayNode == null) {
							log.error(String.format("无法从返回内容提取JSON内容\r\n%1$s", result.getChoices().get(0).getContent()));
							throw new Exception("返回内容格式不正确");
						}
						break;
					}
					catch (Throwable ex) {
						if(error.incrementAndGet()>=3) {
							throw ex;
						}
						log.error(ex);
					}
				}
				
				if(arrayNode != null && arrayNode.size() > 0) {
					for(int i = 0;i<arrayNode.size();i++) {
						String strQuery = arrayNode.get(i).asText(null);
						if(!StringUtils.hasLength(strQuery)) {
							continue;
						}
						queryList.add(strQuery);
					}
				}
			}
			
			RecursiveCharacterTextSplitter recursiveCharacterTextSplitter = new RecursiveCharacterTextSplitter(Arrays.asList("\n", " ", ",", ".", "，", "。"), config.getChunkTokenNum(), 0);
			for(String strQuery : queryList) {
				List<String> parts = recursiveCharacterTextSplitter.splitText(strQuery);
				if(ObjectUtils.isEmpty(parts)) {
					continue;
				}
				
				for (String strPart : parts) {
					// 计算向量值
					double[] queryVector = this.getEmbedding(config.getEmbeddingAgent(), strPart);
					
					String strSQL = String.format("select t.%3$s,t.%4$s, t.%5$s, (1.0 - (t.%6$s <=> '%1$s')/2) as SIMILARITY FROM %2$s t INNER JOIN %7$s t2 on t.%4$s = t2.%8$s where t.%6$s IS NOT NULL AND t2.%9$s IN (%10$s) order by SIMILARITY desc limit 200", JsonUtils.toString(queryVector), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT_VECTOR).getName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getPSDEField(DocumentField.KNOWLEDGE_BASE_ID).getName()), paramList);
					if (activePSDEField != null) {
						strSQL = strSQL.replace("where t", String.format("where t.%1$s = 1 AND t", iDBDialect.getDBObjStandardName(activePSDEField.getName())));
					}
					List<Object> sqlParamList = new ArrayList<Object>();
					sqlParamList.addAll(kbIds);
					
					if(!ObjectUtils.isEmpty(docIdParamList)) {
						strSQL = strSQL.replace("where t", String.format("where t.%1$s in (%2$s) AND t", iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), docIdParamList));
						sqlParamList.addAll(0, docIds);
					}
					
					if(!ObjectUtils.isEmpty(typeParamList)) {
						strSQL = strSQL.replace("where t", String.format("where t.%1$s in (%2$s) AND t", iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.TYPE).getName()), typeParamList));
						sqlParamList.addAll(0, types);
					}
					
					if(pidPSDEField != null && iChunkSearchContext.getRoot() != null) {
						if(DataTypeUtils.getBooleanValue(iChunkSearchContext.getRoot(), false)) {
							strSQL = strSQL.replace("where t", String.format("where t.%1$s IS NULL AND t", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
						}
						else {
							strSQL = strSQL.replace("where t", String.format("where t.%1$s IS NOT NULL AND t", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
						}
					}
					
					if(documentCategoriesPSDEField != null && !ObjectUtils.isEmpty(iChunkSearchContext.getDocCategories())) {
						String strReplaceContent = "";
						for(String strDocCategories : iChunkSearchContext.getDocCategories()) {
							if(!ObjectUtils.isEmpty(strReplaceContent)) {
								strReplaceContent += " OR ";
							}
							if(strDocCategories.indexOf("%") == -1) {
								strReplaceContent += String.format("t2.%1$s = ?", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName()));
							}
							else {
								strReplaceContent += String.format("t2.%1$s like ?", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName()));
							}
						}
						strSQL = strSQL.replace("where t", String.format("where (%1$s) AND t", strReplaceContent));
						sqlParamList.addAll(0, iChunkSearchContext.getDocCategories());
					}
					
					if(documentNamePSDEField != null && !ObjectUtils.isEmpty(iChunkSearchContext.getDocNames())) {
						String strReplaceContent = "";
						for(String strDocName : iChunkSearchContext.getDocNames()) {
							if(!ObjectUtils.isEmpty(strReplaceContent)) {
								strReplaceContent += " OR ";
							}
							if(strDocName.indexOf("%") == -1) {
								strReplaceContent += String.format("t2.%1$s = ?", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName()));
							}
							else {
								strReplaceContent += String.format("t2.%1$s like ?", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName()));
							}
						}
						strSQL = strSQL.replace("where t", String.format("where (%1$s) AND t", strReplaceContent));
						sqlParamList.addAll(0, iChunkSearchContext.getDocNames());
					}
					
					if (sequencePSDEField != null) {
						strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(sequencePSDEField.getName())));
					}

					if (pidPSDEField != null) {
						strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
					}

					if (typePSDEField != null) {
						strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(typePSDEField.getName())));
					}
					
					if (namePSDEField != null) {
						strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(namePSDEField.getName())));
					}

					if (documentNamePSDEField != null) {
						strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_NAME,t", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName())));
					}
					
					if (documentCategoriesPSDEField != null) {
						strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_CATEGORIES,t", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName())));
					}

					List<Object> ret = chunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSelectSQL(strSQL, sqlParamList);
					if (!ObjectUtils.isEmpty(ret)) {
						for (Object item : ret) {
							Map map = (Map) item;

							String strChunkId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getIdPSDEField().getName()));
							double score = DataTypeUtils.asDouble(map.get("SIMILARITY"), 0.0);
							Chunk last = chunkMap.get(strChunkId);
							if (last != null && last.getSimilarity() > score) {
								continue;
							}

							String docId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()));
							String docName = DataTypeUtils.asString(map.get(ChunkField.DOCUMENT_NAME.name()));
							String strText = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()));
							String docCategories = DataTypeUtils.asString(map.get("DOCUMENT_CATEGORIES"));
							if(StringUtils.hasLength(docCategories)) {
								docName = docCategories + "/" + docName;
							}
							
							last = new Chunk();
							last.setId(strChunkId);
							last.setDocId(docId);
							last.setDocName(docName);
							last.setContent(strText);
							last.setSimilarity(score);
							if (sequencePSDEField != null) {
								last.set(ChunkField.SEQUENCE.name(), map.get(sequencePSDEField.getName()));
							}

							if (typePSDEField != null) {
								last.set(ChunkField.TYPE.name(), chunkProxyDERuntime.getFieldEnumValue(ChunkField.TYPE, map.get(typePSDEField.getName()), true));
							}
							
							if (namePSDEField != null) {
								last.setName(DataTypeUtils.asString(map.get(namePSDEField.getName())));
							}

							if (pidPSDEField != null) {
								last.setPid(DataTypeUtils.asString(map.get(pidPSDEField.getName())));
							}
							chunkMap.put(strChunkId, last);
						}
					}

					strSQL = String.format("select t.%3$s,t.%4$s, t.%5$s, (1.0 - (t.%6$s <=> '%1$s')/2) as SIMILARITY FROM %2$s t INNER JOIN %7$s t2 on t.%4$s = t2.%8$s where t.%6$s IS NOT NULL AND t2.%9$s IN (%10$s) order by SIMILARITY desc limit 100", JsonUtils.toString(queryVector), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.QUESTIONS_VECTOR).getName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getPSDEField(DocumentField.KNOWLEDGE_BASE_ID).getName()), paramList);

					if (activePSDEField != null) {
						strSQL = strSQL.replace("where t", String.format("where t.%1$s = 1 AND t", iDBDialect.getDBObjStandardName(activePSDEField.getName())));
					}
					
					if(!ObjectUtils.isEmpty(docIdParamList)) {
						strSQL = strSQL.replace("where t", String.format("where t.%1$s in (%2$s) AND t", iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), docIdParamList));
					}
					
					if(!ObjectUtils.isEmpty(typeParamList)) {
						strSQL = strSQL.replace("where t", String.format("where t.%1$s in (%2$s) AND t", iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.TYPE).getName()), typeParamList));
					}
					
					if(pidPSDEField != null && iChunkSearchContext.getRoot() != null) {
						if(DataTypeUtils.getBooleanValue(iChunkSearchContext.getRoot(), false)) {
							strSQL = strSQL.replace("where t", String.format("where t.%1$s IS NULL AND t", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
						}
						else {
							strSQL = strSQL.replace("where t", String.format("where t.%1$s IS NOT NULL AND t", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
						}
					}
					
					if(documentCategoriesPSDEField != null && !ObjectUtils.isEmpty(iChunkSearchContext.getDocCategories())) {
						String strReplaceContent = "";
						for(String strDocCategories : iChunkSearchContext.getDocCategories()) {
							if(!ObjectUtils.isEmpty(strReplaceContent)) {
								strReplaceContent += " OR ";
							}
							if(strDocCategories.indexOf("%") == -1) {
								strReplaceContent += String.format("t2.%1$s = ?", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName()));
							}
							else {
								strReplaceContent += String.format("t2.%1$s like ?", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName()));
							}
						}
						strSQL = strSQL.replace("where t", String.format("where (%1$s) AND t", strReplaceContent));
					}
					
					if(documentNamePSDEField != null && !ObjectUtils.isEmpty(iChunkSearchContext.getDocNames())) {
						String strReplaceContent = "";
						for(String strDocName : iChunkSearchContext.getDocNames()) {
							if(!ObjectUtils.isEmpty(strReplaceContent)) {
								strReplaceContent += " OR ";
							}
							if(strDocName.indexOf("%") == -1) {
								strReplaceContent += String.format("t2.%1$s = ?", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName()));
							}
							else {
								strReplaceContent += String.format("t2.%1$s like ?", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName()));
							}
						}
						strSQL = strSQL.replace("where t", String.format("where (%1$s) AND t", strReplaceContent));
					}

					if (sequencePSDEField != null) {
						strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(sequencePSDEField.getName())));
					}

					if (pidPSDEField != null) {
						strSQL = strSQL.replace("select t", String.format("select t.%1$s,t", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
					}

					if (typePSDEField != null) {
						strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(typePSDEField.getName())));
					}
					
					if (namePSDEField != null) {
						strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(namePSDEField.getName())));
					}

					if (documentNamePSDEField != null) {
						strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_NAME,t", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName())));
					}
					
					if (documentCategoriesPSDEField != null) {
						strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_CATEGORIES,t", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName())));
					}

					ret = chunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSelectSQL(strSQL, sqlParamList);
					if (!ObjectUtils.isEmpty(ret)) {
						for (Object item : ret) {
							Map map = (Map) item;

							String strChunkId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getIdPSDEField().getName()));
							double score = DataTypeUtils.asDouble(map.get("SIMILARITY"), 0.0);
							Chunk last = chunkMap.get(strChunkId);
							if (last != null && last.getSimilarity() > score) {
								continue;
							}

							String docId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()));
							String docName = DataTypeUtils.asString(map.get(ChunkField.DOCUMENT_NAME.name()));
							String strText = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()));
							String docCategories = DataTypeUtils.asString(map.get("DOCUMENT_CATEGORIES"));
							if(StringUtils.hasLength(docCategories)) {
								docName = docCategories + "/" + docName;
							}

							last = new Chunk();
							last.setId(strChunkId);
							last.setDocId(docId);
							last.setDocName(docName);
							last.setContent(strText);
							last.setSimilarity(score);
							if (sequencePSDEField != null) {
								last.set(ChunkField.SEQUENCE.name(), map.get(sequencePSDEField.getName()));
							}

							if (typePSDEField != null) {
								last.set(ChunkField.TYPE.name(), chunkProxyDERuntime.getFieldEnumValue(ChunkField.TYPE, map.get(typePSDEField.getName()), true));
							}
							
							if (namePSDEField != null) {
								last.setName(DataTypeUtils.asString(map.get(namePSDEField.getName())));
							}

							if (pidPSDEField != null) {
								last.setPid(DataTypeUtils.asString(map.get(pidPSDEField.getName())));
							}

							chunkMap.put(strChunkId, last);
						}
					}
				}
			}
		}
		else {
			String strSQL = String.format("select t.%3$s,t.%4$s, t.%5$s FROM %2$s t INNER JOIN %7$s t2 on t.%4$s = t2.%8$s where t2.%9$s IN (%10$s) order by %1$s asc limit 200", iDBDialect.getDBObjStandardName(sequencePSDEField!=null?sequencePSDEField.getName():chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()), iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT_VECTOR).getName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getReal().getTableName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getIdPSDEField().getName()), iDBDialect.getDBObjStandardName(documentProxyDERuntime.getPSDEField(DocumentField.KNOWLEDGE_BASE_ID).getName()), paramList);
			if (activePSDEField != null) {
				strSQL = strSQL.replace("where t", String.format("where t.%1$s = 1 AND t", iDBDialect.getDBObjStandardName(activePSDEField.getName())));
			}
			List<Object> sqlParamList = new ArrayList<Object>();
			sqlParamList.addAll(kbIds);
			
			if(!ObjectUtils.isEmpty(docIdParamList)) {
				strSQL = strSQL.replace("where t", String.format("where t.%1$s in (%2$s) AND t", iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()), docIdParamList));
				sqlParamList.addAll(0, docIds);
			}
			
			if(!ObjectUtils.isEmpty(typeParamList)) {
				strSQL = strSQL.replace("where t", String.format("where t.%1$s in (%2$s) AND t", iDBDialect.getDBObjStandardName(chunkProxyDERuntime.getPSDEField(ChunkField.TYPE).getName()), typeParamList));
				sqlParamList.addAll(0, types);
			}
			
			if(pidPSDEField != null && iChunkSearchContext.getRoot() != null) {
				if(DataTypeUtils.getBooleanValue(iChunkSearchContext.getRoot(), false)) {
					strSQL = strSQL.replace("where t", String.format("where t.%1$s IS NULL AND t", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
				}
				else {
					strSQL = strSQL.replace("where t", String.format("where t.%1$s IS NOT NULL AND t", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
				}
			}
			
			
			if(documentCategoriesPSDEField != null && !ObjectUtils.isEmpty(iChunkSearchContext.getDocCategories())) {
				String strReplaceContent = "";
				for(String strDocCategories : iChunkSearchContext.getDocCategories()) {
					if(!ObjectUtils.isEmpty(strReplaceContent)) {
						strReplaceContent += " OR ";
					}
					if(strDocCategories.indexOf("%") == -1) {
						strReplaceContent += String.format("t2.%1$s = ?", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName()));
					}
					else {
						strReplaceContent += String.format("t2.%1$s like ?", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName()));
					}
				}
				strSQL = strSQL.replace("where t", String.format("where (%1$s) AND t", strReplaceContent));
				sqlParamList.addAll(0, iChunkSearchContext.getDocCategories());
			}
			
			if(documentNamePSDEField != null && !ObjectUtils.isEmpty(iChunkSearchContext.getDocNames())) {
				String strReplaceContent = "";
				for(String strDocName : iChunkSearchContext.getDocNames()) {
					if(!ObjectUtils.isEmpty(strReplaceContent)) {
						strReplaceContent += " OR ";
					}
					if(strDocName.indexOf("%") == -1) {
						strReplaceContent += String.format("t2.%1$s = ?", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName()));
					}
					else {
						strReplaceContent += String.format("t2.%1$s like ?", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName()));
					}
				}
				strSQL = strSQL.replace("where t", String.format("where (%1$s) AND t", strReplaceContent));
				sqlParamList.addAll(0, iChunkSearchContext.getDocNames());
			}
			
			if (sequencePSDEField != null) {
				strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(sequencePSDEField.getName())));
			}

			if (pidPSDEField != null) {
				strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(pidPSDEField.getName())));
			}

			if (typePSDEField != null) {
				strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(typePSDEField.getName())));
			}
			
			if (namePSDEField != null) {
				strSQL = strSQL.replace("select t.", String.format("select t.%1$s,t.", iDBDialect.getDBObjStandardName(namePSDEField.getName())));
			}

			if (documentNamePSDEField != null) {
				strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_NAME,t", iDBDialect.getDBObjStandardName(documentNamePSDEField.getName())));
			}
			
			if (documentCategoriesPSDEField != null) {
				strSQL = strSQL.replace("select t", String.format("select t2.%1$s as DOCUMENT_CATEGORIES,t", iDBDialect.getDBObjStandardName(documentCategoriesPSDEField.getName())));
			}

			List<Object> ret = chunkProxyDERuntime.getReal().getSysDBSchemeRuntimeMust().executeSelectSQL(strSQL, sqlParamList);
			if (!ObjectUtils.isEmpty(ret)) {
				for (Object item : ret) {
					Map map = (Map) item;

					String strChunkId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getIdPSDEField().getName()));
					Chunk last = chunkMap.get(strChunkId);
					if (last != null) {
						continue;
					}

					String docId = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.DOCUMENT_ID).getName()));
					String docName = DataTypeUtils.asString(map.get(ChunkField.DOCUMENT_NAME.name()));
					String strText = DataTypeUtils.asString(map.get(chunkProxyDERuntime.getPSDEField(ChunkField.CONTENT).getName()));
					String docCategories = DataTypeUtils.asString(map.get("DOCUMENT_CATEGORIES"));
					if(StringUtils.hasLength(docCategories)) {
						docName = docCategories + "/" + docName;
					}
					
					last = new Chunk();
					last.setId(strChunkId);
					last.setDocId(docId);
					last.setDocName(docName);
					last.setContent(strText);
					last.setSimilarity(1.0);
					if (sequencePSDEField != null) {
						last.set(ChunkField.SEQUENCE.name(), map.get(sequencePSDEField.getName()));
					}

					if (typePSDEField != null) {
						last.set(ChunkField.TYPE.name(), chunkProxyDERuntime.getFieldEnumValue(ChunkField.TYPE, map.get(typePSDEField.getName()), true));
					}
					
					if (namePSDEField != null) {
						last.setName(DataTypeUtils.asString(map.get(namePSDEField.getName())));
					}

					if (pidPSDEField != null) {
						last.setPid(DataTypeUtils.asString(map.get(pidPSDEField.getName())));
					}
					chunkMap.put(strChunkId, last);
				}
			}
		}
		
		
		

		List<Chunk> chunkList = new ArrayList<Chunk>();
		chunkList.addAll(chunkMap.values());
		Collections.sort(chunkList, new Comparator<Chunk>() {
			@Override
			public int compare(Chunk o1, Chunk o2) {
				return o2.getSimilarity().compareTo(o1.getSimilarity());
			}
		});
		return chunkList;
	}

}
