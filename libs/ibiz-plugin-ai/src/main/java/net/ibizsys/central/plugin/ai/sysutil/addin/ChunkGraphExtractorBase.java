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
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.RecursiveCharacterTextSplitter;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.plugin.ai.addin.IChunkGraphExtractor;
import net.ibizsys.central.plugin.ai.util.domain.Graph;
import net.ibizsys.central.plugin.ai.util.domain.GraphEdge;
import net.ibizsys.central.plugin.ai.util.domain.GraphNode;
import net.ibizsys.central.plugin.ai.util.domain.GraphRAGConfig;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.INamedAction;

/**
 * 片段图展开器对象基类
 * 
 * @author lionlau
 *
 */
public abstract class ChunkGraphExtractorBase extends SysKnowledgeBaseUtilRTAddinBase implements IChunkGraphExtractor {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ChunkGraphExtractorBase.class);

	public final static String GRAPH_FIELD_SEP = "<SEP>";
	public final static List<String> DEFAULT_ENTITY_TYPES = Arrays.asList("organization", "person", "geo", "event", "category");

	protected double[] getEmbedding(String strEmbeddingAgent, String strContent) throws Throwable {
		return this.getContext().getEmbedding(strEmbeddingAgent, strContent);
	}

	@Override
	public Graph<List<Chunk>> generate(Object documentId, List<Chunk> chunkList, GraphRAGConfig graphRAGConfig) throws Throwable {
		if (ObjectUtils.isEmpty(graphRAGConfig.getEntityTypes())) {
			graphRAGConfig.setEntityTypes(DEFAULT_ENTITY_TYPES);
		}
		
		//仅需要原始数据
		List<Chunk> chunkList2 = new ArrayList<Chunk>();
		for(Chunk chunk : chunkList) {
			if(StringUtils.hasLength(chunk.getType()) && ChunkType.CLUSTER.getValue().equalsIgnoreCase(chunk.getType())) {
				continue;
			}
			chunkList2.add(chunk);
		}
		
		return this.onGenerate(documentId, chunkList2, graphRAGConfig);
	}

	protected Graph<List<Chunk>> onGenerate(Object documentId, List<Chunk> chunkList, GraphRAGConfig graphRAGConfig) throws Throwable {

		List<Object[]> out_results = this.generateContent(documentId, chunkList, graphRAGConfig);

		Map<String, List<Map<String, Object>>> maybeNodes = new HashMap<>();
		Map<String, List<Map<String, Object>>> maybeEdges = new HashMap<>();

		for (Object[] items : out_results) {
			if (items.length <= 1) {
				continue;
			}

			Map<String, List<Map<String, Object>>> mNodes = (Map<String, List<Map<String, Object>>>) items[0];
			Map<String, List<Map<String, Object>>> mEdges = (Map<String, List<Map<String, Object>>>) items[1];
			// int tokenCount = result.getTokenCount();

			// 合并节点
			for (Map.Entry<String, List<Map<String, Object>>> entry : mNodes.entrySet()) {
				maybeNodes.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).addAll(entry.getValue());
			}

			// 合并边
			for (Map.Entry<String, List<Map<String, Object>>> entry : mEdges.entrySet()) {
				maybeEdges.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).addAll(entry.getValue());
			}

			// sumTokenCount += tokenCount;
		}

		List<Map<String, Object>> allEntitiesData = new ArrayList<>();
		this.mergeNodes(maybeNodes, allEntitiesData, graphRAGConfig);

		// actionList.clear();
		// for (java.util.Map.Entry<String, List<Map<String, Object>>> entry :
		// maybeNodes.entrySet()) {
		// actionList.add(new INamedAction() {
		//
		// @Override
		// public Object execute(Object[] args) throws Throwable {
		// mergeNodes(entry.getKey(), entry.getValue(), allEntitiesData,
		// graphRAGConfig);
		// return null;
		// }
		//
		// @Override
		// public String getName() {
		// return entry.getKey();
		// }
		// });
		// }
		//
		// ret = this.getContext().threadRunAllOf(actionList, false, null);

		List<Map<String, Object>> allEdgesData = new ArrayList<>();
		// actionList.clear();
		// for (java.util.Map.Entry<String, List<Map<String, Object>>> entry :
		// maybeEdges.entrySet()) {
		// actionList.add(new INamedAction() {
		//
		// @Override
		// public Object execute(Object[] args) throws Throwable {
		// String[] ids = entry.getKey().split("[|]");
		// mergeEdges(ids[0], ids[1], entry.getValue(), allEdgesData,
		// graphRAGConfig);
		// return null;
		// }
		//
		// @Override
		// public String getName() {
		// return entry.getKey();
		// }
		// });
		// }
		//
		// ret = this.getContext().threadRunAllOf(actionList, false, null);
		this.mergeEdges(maybeEdges, allEdgesData, graphRAGConfig);

		Graph<List<Chunk>> graph = this.doGenerate(chunkList, allEntitiesData, allEdgesData, graphRAGConfig);

		if(DataTypeUtils.asBoolean(graphRAGConfig.getResolution(), false)) {
			graph = this.handleGraphResolution(graph, graphRAGConfig);
		}
		
		
		return graph;
	}
	
	protected Graph<List<Chunk>> handleGraphResolution(Graph<List<Chunk>> graph, GraphRAGConfig graphRAGConfig) throws Throwable {
		return graph;
	}

	protected Graph<List<Chunk>> doGenerate(List<Chunk> chunkList, List<Map<String, Object>> allEntitiesData, List<Map<String, Object>> allEdgesData, GraphRAGConfig graphRAGConfig) throws Throwable {
		try {
			Map<String, Chunk> chunkMap = chunkList.stream().collect(Collectors.toMap(Chunk::getId, chunk -> chunk));
			// 构造图
			Graph<List<Chunk>> graph = new Graph<List<Chunk>>();
			// for ent in ents:
			// if task_id and has_canceled(task_id):
			// callback(msg=f"Task {task_id} cancelled during entity processing
			// for doc {doc_id}.")
			// raise TaskCanceledException(f"Task {task_id} was cancelled")
			//
			// assert "description" in ent, f"entity {ent} does not have
			// description"
			// ent["source_id"] = [doc_id]
			// subgraph.add_node(ent["entity_name"], **ent)
			//
			for (Map<String, Object> entity : allEntitiesData) {
				String strEntityName = (String) entity.getOrDefault("entity_name", null);
				String strDescription = (String) entity.getOrDefault("description", null);
				if (ObjectUtils.isEmpty(strDescription)) {
					throw new Exception(String.format("节点[%1$s]未提供描述", strEntityName));
				}

				List<String> sourceIds = (List<String>) entity.getOrDefault("source_id", null);
				if (ObjectUtils.isEmpty(sourceIds)) {
					throw new Exception(String.format("节点[%1$s]未提供源标识", strEntityName));
				}

				GraphNode<List<Chunk>> graphNode = graph.getNode(strEntityName);
				if (graphNode == null) {
					graphNode = graph.addNode(strEntityName, new ArrayList<Chunk>());
					graphNode.putAttributes(entity);
				}

				for (String strChunkId : sourceIds) {
					Chunk chunk = chunkMap.get(strChunkId);
					if (chunk == null) {
						continue;
					}

					if (!graphNode.getData().contains(chunk)) {
						graphNode.getData().add(chunk);
					}
				}
			}

			// ignored_rels = 0
			// for rel in rels:
			// if task_id and has_canceled(task_id):
			// callback(msg=f"Task {task_id} cancelled during relationship
			// processing for doc {doc_id}.")
			// raise TaskCanceledException(f"Task {task_id} was cancelled")
			//
			// assert "description" in rel, f"relation {rel} does not have
			// description"
			// if not subgraph.has_node(rel["src_id"]) or not
			// subgraph.has_node(rel["tgt_id"]):
			// ignored_rels += 1
			// continue
			// rel["source_id"] = [doc_id]
			// subgraph.add_edge(
			// rel["src_id"],
			// rel["tgt_id"],
			// **rel,
			// )

			int nIgnoredRefs = 0;

			for (Map<String, Object> edge : allEdgesData) {
				String strSrcId = (String) edge.getOrDefault("src_id", null);
				String strTgtId = (String) edge.getOrDefault("tgt_id", null);
				String strDescription = (String) edge.getOrDefault("description", null);
				if (ObjectUtils.isEmpty(strDescription)) {
					throw new Exception(String.format("连接[%1$s -> %2$s]未提供描述", strSrcId, strTgtId));
				}

				List<String> sourceIds = (List<String>) edge.getOrDefault("source_id", null);
				if (ObjectUtils.isEmpty(sourceIds)) {
					throw new Exception(String.format("连接[%1$s -> %2$s]未提供源标识", strSrcId, strTgtId));
				}

				GraphNode<List<Chunk>> srcGraphNode = graph.getNode(strSrcId);
				GraphNode<List<Chunk>> dstGraphNode = graph.getNode(strTgtId);
				if (srcGraphNode == null) {
					log.warn(String.format("源节点[%1$s]不存在", strSrcId));
					nIgnoredRefs++;
					continue;
				}

				if (dstGraphNode == null) {
					log.warn(String.format("目标节点[%1$s]不存在", strTgtId));
					nIgnoredRefs++;
					continue;
				}

				GraphEdge<List<Chunk>> graphEdge = graph.addEdge(strSrcId, strTgtId, new ArrayList<Chunk>(), edge);
				for (String strChunkId : sourceIds) {
					Chunk chunk = chunkMap.get(strChunkId);
					if (chunk == null) {
						continue;
					}

					if (!graphEdge.getData().contains(chunk)) {
						graphEdge.getData().add(chunk);
					}
				}

				// GraphEd<List<Chunk>> graphNode =
				// graph.getGraphEdges()(strEntityName);
				// if(graphNode == null) {
				// graphNode = graph.addNode(strEntityName, new
				// ArrayList<Chunk>());
				// graphNode.getAttributes().putAll(entity);
				// }
				//
				// for(String strChunkId : sourceIds) {
				// Chunk chunk = chunkMap.get(strChunkId);
				// if(chunk == null) {
				// continue;
				// }
				//
				// if(!graphNode.getData().contains(chunk)) {
				// graphNode.getData().add(chunk);
				// }
				// }
			}

			return graph;
		} catch (Throwable ex) {
			throw ex;
		}
	}
	
	

	protected List<Object[]> generateContent(Object documentId, List<Chunk> chunkList, GraphRAGConfig graphRAGConfig) throws Throwable {
		AtomicInteger finished = new AtomicInteger(0);
		int nTotal = chunkList.size();
		List<IAction> actionList = new ArrayList<IAction>();
		for (int i = 0; i < chunkList.size(); i++) {
			final int nIndex = i;
			Chunk chunk = chunkList.get(i);
			actionList.add(new INamedAction() {

				@Override
				public Object execute(Object[] args) throws Throwable {
					if(getContext().shouldCancelDocumentJobs(documentId)) {
						throw new Exception("文档作业已被取消");
					}
					Object ret = doProcessContent(chunk, nIndex, chunkList.size(), graphRAGConfig);
					int nCurCount = finished.addAndGet(1);
					getContext().updateDocumentProgress(documentId, String.format("知识图谱展开[%1$s/%2$s]", nCurCount, nTotal));
					return ret;
				}

				@Override
				public String getName() {
					return String.valueOf(nIndex);
				}
			});
		}

		Map<String, Object> ret = this.getContext().threadRunAllOf(actionList, false, null);
		List<Object[]> out_results = new ArrayList<Object[]>();
		for (java.util.Map.Entry<String, Object> entry : ret.entrySet()) {
			if (entry.getValue() instanceof List) {
				out_results.addAll((List) entry.getValue());
			}
		}
		return out_results;
	}

	// async def _handle_entity_relation_summary(self, entity_or_relation_name:
	// str, description: str, task_id="") -> str:
	// if task_id and has_canceled(task_id):
	// raise TaskCanceledException(f"Task {task_id} was cancelled during summary
	// handling")
	//
	// summary_max_tokens = 512
	// use_description = truncate(description, summary_max_tokens)
	// description_list = use_description.split(GRAPH_FIELD_SEP)
	// if len(description_list) <= 12:
	// return use_description
	// prompt_template = SUMMARIZE_DESCRIPTIONS_PROMPT
	// context_base = dict(
	// entity_name=entity_or_relation_name,
	// description_list=description_list,
	// language=self._language,
	// )
	// use_prompt = prompt_template.format(**context_base)
	// logging.info(f"Trigger summary: {entity_or_relation_name}")
	//
	// if task_id and has_canceled(task_id):
	// raise TaskCanceledException(f"Task {task_id} was cancelled during summary
	// handling")
	//
	// async with chat_limiter:
	// summary = await asyncio.to_thread(self._chat, "", [{"role": "user",
	// "content": use_prompt}], {}, task_id)
	// return summary

	protected void mergeNodes(Map<String, List<Map<String, Object>>> maybeNodes, List<Map<String, Object>> allEntitiesData, GraphRAGConfig graphRAGConfig) throws Throwable {
		List<IAction> actionList = new ArrayList<IAction>();
		for (java.util.Map.Entry<String, List<Map<String, Object>>> entry : maybeNodes.entrySet()) {
			actionList.add(new INamedAction() {

				@Override
				public Object execute(Object[] args) throws Throwable {
					doMergeNodes(entry.getKey(), entry.getValue(), allEntitiesData, graphRAGConfig);
					return null;
				}

				@Override
				public String getName() {
					return entry.getKey();
				}
			});
		}

		this.getContext().threadRunAllOf(actionList, false, null);
	}

	protected void mergeEdges(Map<String, List<Map<String, Object>>> maybeEdges, List<Map<String, Object>> allEdgesData, GraphRAGConfig graphRAGConfig) throws Throwable {
		List<IAction> actionList = new ArrayList<IAction>();
		for (java.util.Map.Entry<String, List<Map<String, Object>>> entry : maybeEdges.entrySet()) {
			actionList.add(new INamedAction() {

				@Override
				public Object execute(Object[] args) throws Throwable {
					String[] ids = entry.getKey().split("[|]");
					doMergeEdges(ids[0], ids[1], entry.getValue(), allEdgesData, graphRAGConfig);
					return null;
				}

				@Override
				public String getName() {
					return entry.getKey();
				}
			});
		}

		this.getContext().threadRunAllOf(actionList, false, null);
	}

	protected String handleEntityOrRelationSummary(String entityOrRelationName, String description, GraphRAGConfig graphRAGConfig) throws Throwable {
		int nSummaryMaxTokens = 512;
		RecursiveCharacterTextSplitter recursiveCharacterTextSplitter = new RecursiveCharacterTextSplitter(null, nSummaryMaxTokens, 0);
		String strUseDescription = recursiveCharacterTextSplitter.splitText(description).get(0);
		String[] descriptions = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(strUseDescription, GRAPH_FIELD_SEP);
		if (descriptions.length <= 12) {
			return strUseDescription;
		}

		String strPromptTemplate = getSummarizeDescriptionsPrompt();
		Map<String, String> variables = new LinkedHashMap<String, String>();
		variables.put("entity_name", entityOrRelationName);
		variables.put("description_list", StringUtils.arrayToDelimitedString(descriptions, ","));
		variables.put("language", graphRAGConfig.getLanguage());
		String strPrompt = getTemplateContent(strPromptTemplate, variables);

		return chatCompletion(graphRAGConfig.getChatAgent(), ChatMessagesBuilder.create().user(strPrompt).build());
	}

	// async def _merge_nodes(self, entity_name: str, entities: list[dict],
	// all_relationships_data, task_id=""):
	// if task_id and has_canceled(task_id):
	// raise TaskCanceledException(f"Task {task_id} was cancelled during merge
	// nodes")
	//
	// if not entities:
	// return
	// entity_type = sorted(
	// Counter([dp["entity_type"] for dp in entities]).items(),
	// key=lambda x: x[1],
	// reverse=True,
	// )[0][0]
	// description = GRAPH_FIELD_SEP.join(sorted(set([dp["description"] for dp
	// in entities])))
	// already_source_ids = flat_uniq_list(entities, "source_id")
	// description = await self._handle_entity_relation_summary(entity_name,
	// description, task_id=task_id)
	// node_data = dict(
	// entity_type=entity_type,
	// description=description,
	// source_id=already_source_ids,
	// )
	// node_data["entity_name"] = entity_name
	// all_relationships_data.append(node_data)

	protected void doMergeNodes(String entityName, List<Map<String, Object>> entities, List<Map<String, Object>> allEntitiesData, GraphRAGConfig graphRAGConfig) throws Throwable {
		if (ObjectUtils.isEmpty(entities)) {
			return;
		}
		try {
			String strEntityType = findMostFrequentEntityType(entities);
			Set<String> set = new HashSet<String>();
			for (Map<String, Object> entity : entities) {
				String strDescription = (String) entity.getOrDefault("description", null);
				if (ObjectUtils.isEmpty(strDescription)) {
					continue;
				}
				set.add(strDescription);
			}

			List<String> list = new ArrayList<String>(set);
			Collections.sort(list, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			});

			String strDescription = StringUtils.collectionToDelimitedString(list, GRAPH_FIELD_SEP);
			List<Object> alreadySourceIds = flatUniqList(entities, "source_id");
			strDescription = this.handleEntityOrRelationSummary(entityName, strDescription, graphRAGConfig);

			Map<String, Object> nodeData = new LinkedHashMap<String, Object>();
			nodeData.put("entity_type", strEntityType);
			nodeData.put("description", strDescription);
			nodeData.put("source_id", alreadySourceIds);
			nodeData.put("entity_name", entityName);
			allEntitiesData.add(nodeData);
		} catch (Throwable ex) {
			throw ex;
		}

	}

	// async def _merge_edges(self, src_id: str, tgt_id: str, edges_data:
	// list[dict], all_relationships_data=None, task_id=""):
	// if not edges_data:
	// return
	// weight = sum([edge["weight"] for edge in edges_data])
	// description = GRAPH_FIELD_SEP.join(sorted(set([edge["description"] for
	// edge in edges_data])))
	// description = await self._handle_entity_relation_summary(f"{src_id} ->
	// {tgt_id}", description, task_id=task_id)
	// keywords = flat_uniq_list(edges_data, "keywords")
	// source_id = flat_uniq_list(edges_data, "source_id")
	// edge_data = dict(src_id=src_id, tgt_id=tgt_id, description=description,
	// keywords=keywords, weight=weight, source_id=source_id)
	// all_relationships_data.append(edge_data)

	protected void doMergeEdges(String srcId, String tgtId, List<Map<String, Object>> edges, List<Map<String, Object>> allRelationshipsData, GraphRAGConfig graphRAGConfig) throws Throwable {
		if (ObjectUtils.isEmpty(edges)) {
			return;
		}

		try {

			float fWeight = 0;
			for (Map<String, Object> edge : edges) {
				fWeight += DataTypeUtils.asFloat(edge.get("weight"), 1.0f);
			}

			Set<String> set = new HashSet<String>();
			for (Map<String, Object> edge : edges) {
				String strDescription = (String) edge.getOrDefault("description", null);
				if (ObjectUtils.isEmpty(strDescription)) {
					continue;
				}
				set.add(strDescription);
			}

			List<String> list = new ArrayList<String>(set);
			Collections.sort(list, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			});

			String strDescription = StringUtils.collectionToDelimitedString(list, GRAPH_FIELD_SEP);

			strDescription = this.handleEntityOrRelationSummary(String.format("%1$s -> %2$s", srcId, tgtId), strDescription, graphRAGConfig);

			List<Object> keywords = flatUniqList(edges, "keywords");
			List<Object> sourceIds = flatUniqList(edges, "source_id");

			Map<String, Object> edgeData = new LinkedHashMap<String, Object>();

			// dge_data = dict(=src_id, tgt_id=tgt_id, description=description,
			// keywords=keywords, weight=weight, source_id=source_id)

			edgeData.put("src_id", srcId);
			edgeData.put("tgt_id", tgtId);
			edgeData.put("description", strDescription);
			edgeData.put("keywords", keywords);
			edgeData.put("weight", fWeight);
			edgeData.put("source_id", sourceIds);
			edgeData.put("edges", edges);
			
			allRelationshipsData.add(edgeData);
		} catch (Throwable ex) {
			throw ex;
		}
	}

	protected abstract List<Object[]> doProcessContent(Chunk chunk, int chunkSeq, int totalChunk, GraphRAGConfig graphRAGConfig) throws Throwable;

	/**
	 * 替代方案：使用传统循环方式
	 */
	public static String findMostFrequentEntityType(List<Map<String, Object>> entities) {
		if (entities == null || entities.isEmpty()) {
			throw new IllegalArgumentException("实体列表不能为空");
		}

		// 使用HashMap统计频率
		Map<String, Long> frequencyMap = new HashMap<>();
		for (Map<String, Object> entity : entities) {
			String entityType = (String) entity.getOrDefault("entity_type", "unknown");

			frequencyMap.put(entityType, frequencyMap.getOrDefault(entityType, 0L) + 1);
		}

		// 手动查找最大值（避免完整排序的性能开销）
		return frequencyMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("unknown");
	}

	protected String getTemplateContent(String strTemplate, Map<String, String> variables) {
		if (!ObjectUtils.isEmpty(variables)) {
			for (java.util.Map.Entry<String, String> entry : variables.entrySet()) {
				String strContent = ObjectUtils.isEmpty(entry.getValue())?"":entry.getValue();
				strTemplate = strTemplate.replace(String.format("{%1$s}", entry.getKey()), strContent);
			}
		}
		return strTemplate;
	}

	protected String chatCompletion(String strChatAgent, List<ChatMessage> messages) throws Throwable {
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		chatCompletionRequest.setMessages(messages);
		return this.getContext().chatCompletion(strChatAgent, chatCompletionRequest).getChoices().get(0).getContent();
	}

	/**
	 * 构建正确的正则表达式模式
	 */
	private static String buildRegexPattern(List<String> markers) {
		return markers.stream().map(marker -> {
			if (marker == null || marker.isEmpty()) {
				return "";
			}
			// 对每个标记进行正确的正则转义 - JDK 8 标准方式
			return Pattern.quote(marker);
		}).filter(marker -> !marker.isEmpty()).collect(Collectors.joining("|"));
	}

	/**
	 * 使用多个标记分割字符串
	 */
	public static List<String> splitStringByMultiMarkers(String content, List<String> markers) {
		// 处理空标记列表
		if (markers == null || markers.isEmpty()) {
			return java.util.Arrays.asList(content != null ? content.trim() : "");
		}

		// 处理空内容
		if (content == null || content.trim().isEmpty()) {
			return new java.util.ArrayList<>();
		}

		// 构建正确的正则表达式
		String regexPattern = buildRegexPattern(markers);

		// 使用正则表达式分割
		String[] parts = content.split(regexPattern);

		// 使用Stream API处理结果（JDK 8方式）
		return java.util.Arrays.stream(parts).map(String::trim).filter(part -> !part.isEmpty()).collect(Collectors.toList());
	}

	protected Map<String, Object> handleSingleEntityExtraction(List<String> recordAttributes, String chunkKey) throws Throwable {
		if (recordAttributes.size() < 4 || !("\"entity\"".equals(recordAttributes.get(0)))) {
			return null;
		}

		String strEntityName = (String) cleanStr(recordAttributes.get(1).toUpperCase());
		if (ObjectUtils.isEmpty(strEntityName)) {
			return null;
		}

		String strEntityType = (String) cleanStr(recordAttributes.get(2).toUpperCase());
		String strEntityDescription = (String) cleanStr(recordAttributes.get(3).toUpperCase());
		String strEntitySourceId = chunkKey;

		Map<String, Object> ret = new LinkedHashMap<String, Object>();
		ret.put("entity_name", strEntityName);
		ret.put("entity_type", strEntityType);
		ret.put("description", strEntityDescription);
		ret.put("source_id", strEntitySourceId);
		return ret;
	}

	protected Map<String, Object> handleSingleRelationshipExtraction(List<String> recordAttributes, String chunkKey) throws Throwable {
		if (recordAttributes.size() < 5 || !"\"relationship\"".equals(recordAttributes.get(0))) {
			return null;
		}

		String strSource = (String) cleanStr(recordAttributes.get(1).toUpperCase());
		String strTarget = (String) cleanStr(recordAttributes.get(2).toUpperCase());
		String strEdgeDescription = (String) cleanStr(recordAttributes.get(3));
		String strEdgeKeywords = (String) cleanStr(recordAttributes.get(4));

		float fWeight = 1;
		try {
			fWeight = DataTypeUtils.asFloat(cleanStr(recordAttributes.get(recordAttributes.size() - 1).replace("\"", "")), 1.0f);
		} catch (Throwable ex) {
			fWeight = 1;
		}

		List<String> pair = Arrays.asList(strSource, strTarget);
		Collections.sort(pair, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		});

		Map<String, Object> metadata = new LinkedHashMap<String, Object>();
		metadata.put("created_at", System.currentTimeMillis());

		Map<String, Object> ret = new LinkedHashMap<String, Object>();
		ret.put("src_id", pair.get(0));
		ret.put("tgt_id", pair.get(1));
		ret.put("weight", fWeight);
		ret.put("description", strEdgeDescription);
		ret.put("keywords", strEdgeKeywords);
		ret.put("source_id", chunkKey);
		ret.put("metadata", metadata);

		return ret;
	}

	/**
	 * 实体和关系提取方法 
	 */
	protected Object[] getEntitiesAndRelations(String chunkKey, List<String> records, String tupleDelimiter, List<String> entTypes) throws Throwable {
		// 模拟实体和关系提取逻辑
		Map<String, List> nodes = new LinkedHashMap<>();
		Map<String, List> edges = new LinkedHashMap<>();

		// ent_types = [t.lower() for t in self._entity_types]
		// List<String> entTypes = graphRAGConfig.getEntityTypes();

		for (String record : records) {
			// 根据tupleDelimiter进一步分割每条记录
			List<String> recordAttributes = splitStringByMultiMarkers(record, Arrays.asList(tupleDelimiter));
			Map<String, Object> entities = handleSingleEntityExtraction(recordAttributes, chunkKey);
			if (entities != null && entTypes.contains(DataTypeUtils.asString(entities.get("entity_type"), "unknown").toLowerCase())) {
				List last = nodes.get(entities.get("entity_name"));
				if (last == null) {
					last = new ArrayList();
					nodes.put((String) entities.get("entity_name"), last);
				}
				last.add(entities);
				continue;
			}
			Map<String, Object> relations = handleSingleRelationshipExtraction(recordAttributes, chunkKey);
			if (relations != null) {
				// String strEdgeId =
				// KeyValueUtils.genUniqueId(relations.get("src_id"),
				// relations.get("tgt_id"));
				String strEdgeId = String.format("%1$s|%2$s", relations.get("src_id"), relations.get("tgt_id"));
				List last = edges.get(strEdgeId);
				if (last == null) {
					last = new ArrayList();
					edges.put(strEdgeId, last);
				}
				last.add(relations);
				continue;
			}
		}

		return new Object[] { nodes, edges };
	}

	/**
	 * 清理输入字符串 - 移除HTML转义字符、控制字符和其他不需要的字符 对应Python的clean_str函数
	 */
	public static Object cleanStr(Object input) {
		// 如果输入不是字符串，直接返回（对应Python的if not isinstance(input, str)）
		if (!(input instanceof String)) {
			return input;
		}

		String str = (String) input;

		// 1. 去除字符串两端空白字符（对应Python的input.strip()）
		String trimmed = str.trim();

		// 2. HTML转义字符解码（对应Python的html.unescape()）
		String unescaped = unescapeHtml(trimmed);

		// 3. 移除控制字符和不需要的字符（对应Python的re.sub()）
		String cleaned = removeControlCharacters(unescaped);

		return cleaned;
	}

	/**
	 * HTML转义字符解码 - 对应Python的html.unescape() 使用简单的替换方法处理常见HTML实体
	 */
	private static String unescapeHtml(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		// 替换常见的HTML实体
		return input.replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">").replace("&quot;", "\"").replace("&#39;", "'").replace("&nbsp;", " ");
	}

	/**
	 * 移除控制字符 - 对应Python的re.sub(r"[\"\x00-\x1f\x7f-\x9f]", "", result)
	 */
	private static String removeControlCharacters(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		// 使用正则表达式移除控制字符和双引号
		// 对应Python模式：[\"\x00-\x1f\x7f-\x9f]
		Pattern controlCharPattern = Pattern.compile("[\"\\x00-\\x1f\\x7f-\\x9f]");
		return controlCharPattern.matcher(input).replaceAll("");
	}

	/**
	 * 扁平化并去重列表 - Java 8版本 对应Python的flat_uniq_list函数
	 * 
	 * @param arr
	 *            包含字典的列表，每个字典有指定的键
	 * @param key
	 *            要提取的键名
	 * @return 去重后的值列表
	 */
	public static List<Object> flatUniqList(List<Map<String, Object>> arr, String key) {
		// 使用Set自动去重，对应Python的set(res)
		Set<Object> resultSet = new HashSet<>();

		for (Map<String, Object> map : arr) {
			Object value = map.get(key);

			if (value instanceof List) {
				// 如果值是列表，展开所有元素 - 对应Python的extend
				for (Object item : (List<?>) value) {
					resultSet.add(item);
				}
			} else {
				// 单个值直接添加 - 对应Python的append
				resultSet.add(value);
			}
		}

		// 转换为List返回，对应Python的list(set(res))
		return new ArrayList<>(resultSet);
	}

	protected String getSummarizeDescriptionsPrompt() {
		//return "You are a helpful assistant responsible for generating a comprehensive summary of the data provided below.\r\n" + "Given one or two entities, and a list of descriptions, all related to the same entity or group of entities.\r\n" + "Please concatenate all of these into a single, comprehensive description. Make sure to include information collected from all the descriptions.\r\n" + "If the provided descriptions are contradictory, please resolve the contradictions and provide a single, coherent summary.\r\n" + "Make sure it is written in third person, and include the entity names so we the have full context.\r\n" + "Use {language} as output language.\r\n" + "\r\n" + "#######\r\n" + "-Data-\r\n" + "Entities: {entity_name}\r\n" + "Description List: {description_list}\r\n" + "#######\r\n";
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(ChunkGraphExtractorBase.class, "SummarizeDescriptionsPrompt.md", false);
	}
}
