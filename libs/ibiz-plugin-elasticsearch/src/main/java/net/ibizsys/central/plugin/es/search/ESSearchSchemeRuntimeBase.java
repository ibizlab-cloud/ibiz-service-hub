package net.ibizsys.central.plugin.es.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.search.ISysSearchDocRuntime;
import net.ibizsys.central.cloud.core.search.SysSearchSchemeRuntimeBase;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.plugin.es.util.ESClientFactory;
import net.ibizsys.central.plugin.es.util.ESClientPool;
import net.ibizsys.central.plugin.es.util.IESAction;
import net.ibizsys.central.plugin.es.util.IESModelRuntimeContextBase;
import net.ibizsys.central.search.ISysSearchSchemeRuntimeContext;
import net.ibizsys.central.search.SysSearchSchemeRuntimeContextProxy;
import net.ibizsys.central.search.SysSearchSchemeRuntimeException;
import net.ibizsys.model.PSModelEnums.SearchFieldDataType;
import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.model.search.IPSSysSearchField;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class ESSearchSchemeRuntimeBase extends SysSearchSchemeRuntimeBase implements IESSearchSchemeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ESSearchSchemeRuntimeBase.class);

	private ESClientPool esClientPool = null;

	private boolean bEnableDocIndexName = false;

	private String strIndexName = null;

	public static abstract class ESSearchSchemeRuntimeContextBase<M extends IESSearchSchemeRuntime, C extends ISysSearchSchemeRuntimeContext> extends SysSearchSchemeRuntimeContextProxy<M, C> implements IESSearchSchemeRuntimeContext {
		public ESSearchSchemeRuntimeContextBase(C superContext) {
			super(superContext);
		}
	}

	@Override
	protected IESSearchSchemeRuntimeContext createModelRuntimeContext() {
		return new ESSearchSchemeRuntimeContextBase<IESSearchSchemeRuntime, ISysSearchSchemeRuntimeContext>(super.createModelRuntimeContext()) {
			@Override
			public IESSearchSchemeRuntime getModelRuntime() {
				return getSelf();
			}

			@Override
			public String getIndexName(String strDocName) {
				return getSelf().getIndexName(strDocName);
			}
		};
	}

	private ESSearchSchemeRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected IESSearchSchemeRuntimeContext getSysSearchSchemeRuntimeContext() {
		return (IESSearchSchemeRuntimeContext) super.getSysSearchSchemeRuntimeContext();
	}

	@Override
	protected void onInit() throws Exception {

		this.setEnableDocIndexName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".docindexname", this.isEnableDocIndexName()));

		super.onInit();

		this.setIndexName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".indexname", this.getRealDBObjName(this.getDBName())));

		if (getESClientPool(true) == null) {
			prepareESClientPool();
		}
	}

	@Override
	public ESClientPool getESClientPool() {
		return getESClientPool(false);
	}

	public ESClientPool getESClientPool(boolean bTryMode) {
		if (this.esClientPool != null || bTryMode) {
			return this.esClientPool;
		}
		throw new SysSearchSchemeRuntimeException(this, String.format("ES连接池对象无效"));
	}

	/**
	 * 设置客户端连接池
	 * 
	 * @param esClientPool
	 */
	protected void setESClientPool(ESClientPool esClientPool) {
		this.esClientPool = esClientPool;
	}

	protected void prepareESClientPool() throws Exception {
		if (!StringUtils.hasLength(this.getServiceUrl())) {
			throw new Exception("未定义服务地址");
		}

		Map<String, Object> clientParams = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".clientparam", null);
		Map<String, Object> clientPoolParams = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".clientpool", null);

		GenericObjectPoolConfig<RestClient> esClientPoolConfig = new GenericObjectPoolConfig<RestClient>();
		if (clientPoolParams != null) {
			net.ibizsys.runtime.util.EntityUtils.copyTo(clientPoolParams, esClientPoolConfig);
		}

		ESClientPool esClientPool = new ESClientPool(new ESClientFactory(this, clientParams), new GenericObjectPoolConfig<RestClient>());
		this.setESClientPool(esClientPool);
	}

	protected void closeESClientPool() throws Exception {
		ESClientPool esClientPool = this.getESClientPool(true);
		if (esClientPool != null) {
			esClientPool.close();
			this.setESClientPool(null);
		}
	}

	@Override
	public boolean isEnableDocIndexName() {
		return this.bEnableDocIndexName;
	}

	protected void setEnableDocIndexName(boolean bEnableDocIndexName) {
		this.bEnableDocIndexName = bEnableDocIndexName;
	}

	protected String getIndexName(String strTableName) {
		if (isEnableDocIndexName()) {
			if (StringUtils.hasLength(strTableName)) {
				return strTableName;
			}
		}
		return this.getIndexName();
	}

	public String getIndexName() {
		return this.strIndexName;
	}

	protected void setIndexName(String strIndexName) {
		this.strIndexName = strIndexName;
	}

	@Override
	protected ISysSearchDocRuntime createSysSearchDocRuntime(IPSSysSearchDoc iPSSysSearchDoc) {
		return new ESSearchDocRuntime();
	}

	@Override
	protected void onUpdateSchema(IPSSysSearchDoc iPSSysSearchDoc) throws Exception {
		RestClient restClient = null;
		try {
			restClient = this.getESClientPool().borrowObject();

			String strRealIndexName = getIndexName(this.getRealDBObjName(iPSSysSearchDoc.getName()));

			boolean bCreateMode = true;

			Map<String, IPSSysSearchField> psSysSearchFieldMap = new LinkedHashMap<String, IPSSysSearchField>();
			java.util.List<IPSSysSearchField> psSysSearchFieldList = iPSSysSearchDoc.getAllPSSysSearchFields();
			if (!ObjectUtils.isEmpty(psSysSearchFieldList)) {
				for (IPSSysSearchField iPSSysSearchField : psSysSearchFieldList) {
					String strName = this.getRealDBObjName(iPSSysSearchField.getName());
					psSysSearchFieldMap.put(strName, iPSSysSearchField);
				}
			}

			// 检查索引是否存在
			Request existsRequest = new Request("HEAD", "/" + strRealIndexName);
			Response existsResponse = restClient.performRequest(existsRequest);
			boolean indexExists = (existsResponse.getStatusLine().getStatusCode() == 200);

			if (indexExists) {
				// 获取现有的mapping
				Request getMappingRequest = new Request("GET", "/" + strRealIndexName + "/_mapping");
				Response mappingResponse = restClient.performRequest(getMappingRequest);

				String responseBody = EntityUtils.toString(mappingResponse.getEntity());
				JsonNode rootNode = JsonUtils.toJsonNode(responseBody);

				// 分析结构
				JsonNode propertiesNode = rootNode.path(strRealIndexName).path("mappings").path("properties");
				if (propertiesNode != null && !propertiesNode.isMissingNode()) {
					if (psSysSearchFieldMap.size() <= propertiesNode.size()) {
						Map<String, JsonNode> propertiesNodeMap = new LinkedHashMap<String, JsonNode>();
						Iterator<String> fieldNames = propertiesNode.fieldNames();
						while (fieldNames.hasNext()) {
							String fieldName = fieldNames.next();
							propertiesNodeMap.put(fieldName, propertiesNode.get(fieldName));
						}
						for(String fieldName : psSysSearchFieldMap.keySet()) {
							if (!propertiesNodeMap.containsKey(fieldName)) {
								bCreateMode = false;
								break;
							}
						}
						if (bCreateMode) {
							// 没有变化
							return;
						}
					}
				}
				bCreateMode = false;
			}

			// 构建mapping JSON
			ObjectNode mappingJson = JsonUtils.createObjectNode();
			ObjectNode propertiesNode = JsonUtils.createObjectNode();

			for (Map.Entry<String, IPSSysSearchField> entry : psSysSearchFieldMap.entrySet()) {
				IPSSysSearchField iPSSysSearchField = entry.getValue();
				String strType = entry.getValue().getFieldType();
				if (!StringUtils.hasLength(strType)) {
					strType = SearchFieldDataType.TEXT.value;
				}

				ObjectNode fieldNode = JsonUtils.createObjectNode();
				fieldNode.put("type", strType.toLowerCase());

				if (iPSSysSearchField.getFieldParams() != null) {
					if (iPSSysSearchField.getFieldParams().has("type")) {
						ObjectNode typeNode = (ObjectNode) iPSSysSearchField.getFieldParams().get("type");
						fieldNode.setAll(typeNode);
					}
				}

				propertiesNode.set(entry.getKey(), fieldNode);
			}

			mappingJson.set("properties", propertiesNode);
			String mappingJsonString = JsonUtils.toString(mappingJson);

			if (bCreateMode) {
				// 创建索引
				Request createIndexRequest = new Request("PUT", "/" + strRealIndexName);
				createIndexRequest.setJsonEntity("{\"mappings\":" + mappingJsonString + "}");
				Response createIndexResponse = restClient.performRequest(createIndexRequest);

				if (createIndexResponse.getStatusLine().getStatusCode() < 200 || createIndexResponse.getStatusLine().getStatusCode()>=300 ) {
					throw new Exception(String.format("建立索引返回状态码[%1$s]不正确", createIndexResponse.getStatusLine().getStatusCode()));
				}
			} else {
				// 更新mapping
				Request putMappingRequest = new Request("PUT", "/" + strRealIndexName + "/_mapping");
				putMappingRequest.setJsonEntity(mappingJsonString);
				Response putMappingResponse = restClient.performRequest(putMappingRequest);

				if (putMappingResponse.getStatusLine().getStatusCode() < 200 || putMappingResponse.getStatusLine().getStatusCode()>=300 ) {
					throw new Exception(String.format("更新索引结构返回状态码[%1$s]不正确", putMappingResponse.getStatusLine().getStatusCode()));
				}
			}

		} catch (Exception ex) {
			throw new Exception(String.format("同步索引结构发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (restClient != null) {
				this.getESClientPool().returnObject(restClient);
			}
		}
	}

	@Override
	public Object executeESAction(IESAction iESAction, Object[] args) throws Throwable {
		Assert.notNull(iESAction, "未传入ES行为对象");
		try {
			return this.onExecuteESAction(iESAction, args);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysSearchSchemeRuntimeException.rethrow(this, ex);
			throw new SysSearchSchemeRuntimeException(this, String.format("执行ES操作发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onExecuteESAction(IESAction iESAction, Object[] args) throws Throwable {
		RestClient restClient = null;
		try {
			restClient = this.getESClientPool().borrowObject();
			return iESAction.execute(this.getSysSearchSchemeRuntimeContext(), restClient, args);
		} finally {
			if (restClient != null) {
				this.getESClientPool().returnObject(restClient);
			}
		}
	}

	@Override
	protected List<Chunk> onSelectChunks(String docName, IChunkSearchContext iChunkSearchContext) throws Throwable {
		ISysSearchDocRuntime iSysSearchDocRuntime = this.getSysSearchDocRuntime(docName, false);
		List<IPSSysSearchField> psSysSearchFieldList = iSysSearchDocRuntime.getNestedTextVectorFields();
		if (ObjectUtils.isEmpty(psSysSearchFieldList)) {
			throw new Exception("未定义嵌套文本向量属性");
		}

		String strRealIndexName = this.getIndexName(docName);
		IPSSysSearchField iPSSysSearchField = psSysSearchFieldList.get(0);
		List<String> parts = iSysSearchDocRuntime.splitNestedText(iPSSysSearchField, iChunkSearchContext.getQuery());
		Map<String, Chunk> chunkMap = new HashMap<String, Chunk>();
		for (String strPart : parts) {
			// 计算向量值
			double[] queryVector = this.getVector(strPart);
			float[] queryVector2 = new float[queryVector.length];
			for(int i = 0;i<queryVector.length;i++) {
				queryVector2[i] = (float)queryVector[i];
			}
			String strNestedField = iPSSysSearchField.getName().toLowerCase();

			Object ret = this.executeESAction(new IESAction() {

				@Override
				public Object execute(IESModelRuntimeContextBase iESModelRuntimeContextBase, RestClient restClient, Object[] args) throws Throwable {
					
					String searchJson = String.format("{\r\n" + 
							"    \"fields\": [\r\n" + 
							"        \"id\"" +
							"    ],\r\n" + 
							"    \"_source\": false,\r\n" + 
							"    \"knn\": {\r\n" + 
							"        \"query_vector\": %2$s,\r\n" + 
							"        \"field\": \"%1$s.vector\",\r\n" + 
							"        \"k\": %3$s,\r\n" + 
							"        \"num_candidates\": %4$s,\r\n" + 
							"        \"inner_hits\": {\r\n" + 
							"            \"_source\": false,\r\n" + 
							"            \"fields\": [\r\n" + 
							"                \"%1$s.text\"\r\n" + 
							"            ],\r\n" + 
							"            \"size\": 1\r\n" + 
							"        }" +							
							"    }\r\n" + 
							"}", strNestedField, Arrays.toString(queryVector), 10, 10 * 10);
//					String searchJson = String.format(
//				            "{" +
//				            "  \"query\": {" +
//				            "    \"bool\": {" +
//				            "      \"should\": [" +
//				            "        {" +
//				            "          \"nested\": {" +
//				            "            \"path\": \"%1$s\"," +
//				            "            \"score_mode\": \"max\"," +
//				            "            \"query\": {" +
//				            "              \"knn\": {" +
//				            "                \"%1$s.vector\": {" +
//				            "                  \"vector\": %2$s," +
//				            "                  \"k\": %3$d" +
//				            "                }" +
//				            "              }" +
//				            "            }," +
//				            "            \"inner_hits\": {" +
//				            "              \"size\": 1" +
//				            "            }" +
//				            "          }" +
//				            "        }," +
//				            "        {" +
//				            "          \"match\": {" +
//				            "            \"title\": {" +
//				            "              \"query\": \"%4$s\"," +
//				            "              \"boost\": 0.5" +
//				            "            }" +
//				            "          }" +
//				            "        }" +
//				            "      ]" +
//				            "    }" +
//				            "  }" +
//				            "}", 
//				            strNestedField, Arrays.toString(queryVector), 10, strPart
//				        );
					log.debug(searchJson);
					Request request = new Request("POST", "/" + strRealIndexName + "/_search");
			        request.setJsonEntity(searchJson);
			        
			        Response response = restClient.performRequest(request);
			       
			        String responseBody = EntityUtils.toString(response.getEntity());
			        
			        JsonNode root = JsonUtils.toJsonNode(responseBody);
			        JsonNode hits = root.path("hits").path("hits");
			        
			        
			        System.out.println("找到 " + hits.size() + " 个匹配文档:");
			        
			        for (JsonNode hit : hits) {
			        	
			            String docId = hit.path("_id").asText();
			            double score = hit.path("_score").asDouble();
			            int nOffset = -1;
			            String strText = null;
			            if (hit.has("inner_hits")) {
			                JsonNode innerHits = hit.path("inner_hits").path(strNestedField).path("hits").path("hits");
			                if (innerHits.size() > 0) {
			                    JsonNode bestMatch = innerHits.get(0);
			                    nOffset = bestMatch.path("_nested").path("offset").asInt();
			                    String strField = bestMatch.path("_nested").path("field").asText();
			                    
			                    JsonNode source = bestMatch.path("fields");
			                    if(source.size() > 0) {
			                    	JsonNode block = source.get(strField).get(0);
			                    	strText = block.path("text").get(0).asText();
			                    }
			                }
			            }
			            
			            if(nOffset == -1) {
			            	continue;
			            }
			            
			            String strChunkId = String.format("%1$s__%2$s", docId, nOffset);
			            
			            Chunk last = chunkMap.get(strChunkId);
			            if(last != null && last.getSimilarity() > score) {
			            	continue;
			            }
			            
			            last = new Chunk();
			            last.setId(strChunkId);
			            last.setDocId(docId);
			            last.setContent(strText);
			            last.setSimilarity(score);
			            chunkMap.put(strChunkId, last);
			        }
//			        log.debug(responseBody);
			        

					return null;
				}
			}, null);

			
			
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

//	private void processSearchResponse(String responseBody) throws IOException {
//        JsonNode root = JsonUtils.toJsonNode(responseBody);
//        JsonNode hits = root.path("hits").path("hits");
//        
//        System.out.println("找到 " + hits.size() + " 个匹配文档:");
//        
//        for (JsonNode hit : hits) {
//            String docId = hit.path("_id").asText();
//            double score = hit.path("_score").asDouble();
//            String title = hit.path("_source").path("title").asText();
//            
//            System.out.println("\n文档 ID: " + docId);
//            System.out.println("标题: " + title);
//            System.out.println("相似度分数: " + score);
//            
//            // 处理内部命中结果（匹配的嵌套块）
//            if (hit.has("inner_hits")) {
//                JsonNode innerHits = hit.path("inner_hits").path("embedding").path("hits").path("hits");
//                if (innerHits.size() > 0) {
//                    JsonNode bestMatch = innerHits.get(0);
//                    JsonNode source = bestMatch.path("_source");
//                    System.out.println("最匹配的文本块: " + source.path("chunk_text").asText());
//                    System.out.println("块ID: " + source.path("chunk_id").asText());
//                }
//            }
//        }
//    }
	
	protected void onShutdown() throws Exception {
		try {
			this.closeESClientPool();
		} catch (Exception ex) {
			log.error(String.format("关闭连接池对象发生异常，%1$s", ex.getMessage()), ex);
		}
		super.onShutdown();
	}
}
