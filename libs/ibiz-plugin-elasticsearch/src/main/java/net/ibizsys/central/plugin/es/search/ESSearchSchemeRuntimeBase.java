package net.ibizsys.central.plugin.es.search;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetMappingsRequest;
import org.elasticsearch.client.indices.GetMappingsResponse;
import org.elasticsearch.client.indices.PutMappingRequest;
import org.elasticsearch.cluster.metadata.MappingMetadata;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.plugin.es.util.ESClientFactory;
import net.ibizsys.central.plugin.es.util.ESClientPool;
import net.ibizsys.central.search.ISysSearchDocRuntime;
import net.ibizsys.central.search.SysSearchSchemeRuntimeBase;
import net.ibizsys.central.search.SysSearchSchemeRuntimeException;
import net.ibizsys.model.PSModelEnums.SearchFieldDataType;
import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.model.search.IPSSysSearchField;
import net.ibizsys.runtime.util.EntityUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class ESSearchSchemeRuntimeBase extends SysSearchSchemeRuntimeBase implements IESSearchSchemeRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ESSearchSchemeRuntimeBase.class);

	private ESClientPool esClientPool = null;
	
	private boolean bEnableDocIndexName = false;
	
	private String strIndexName = null;

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
		if(this.esClientPool != null || bTryMode) {
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

		GenericObjectPoolConfig<RestHighLevelClient> esClientPoolConfig = new GenericObjectPoolConfig<RestHighLevelClient>();
		if (clientPoolParams != null) {
			EntityUtils.copyTo(clientPoolParams, esClientPoolConfig);
		}

		ESClientPool esClientPool = new ESClientPool(new ESClientFactory(this, clientParams), new GenericObjectPoolConfig<RestHighLevelClient>());
		this.setESClientPool(esClientPool);
	}
	
	protected void closeESClientPool() throws Exception {
		ESClientPool esClientPool = this.getESClientPool(true);
		if(esClientPool != null) {
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
		if(isEnableDocIndexName()) {
			if(StringUtils.hasLength(strTableName)) {
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
		RestHighLevelClient httpESClient = null;
		try {
			httpESClient = this.getESClientPool().borrowObject();
			
			String strRealIndexName = getIndexName(this.getRealDBObjName(iPSSysSearchDoc.getName()));
			
			boolean bCreateMode = true;
			
			Map<String, IPSSysSearchField> psSysSearchFieldMap = new LinkedHashMap<String, IPSSysSearchField>();
			java.util.List<IPSSysSearchField> psSysSearchFieldList = iPSSysSearchDoc.getAllPSSysSearchFields();
			if(!ObjectUtils.isEmpty(psSysSearchFieldList)) {
				for(IPSSysSearchField iPSSysSearchField : psSysSearchFieldList) {
					String strName = this.getRealDBObjName(iPSSysSearchField.getName());
					psSysSearchFieldMap.put(strName, iPSSysSearchField);
				}
			}
			
			GetIndexRequest getIndexRequest = new GetIndexRequest(strRealIndexName);
			if (httpESClient.indices().exists(getIndexRequest, RequestOptions.DEFAULT)) {
				
				GetMappingsRequest getMappingsRequest = new GetMappingsRequest();
				getMappingsRequest.indices(strRealIndexName);
				GetMappingsResponse getMappingsResponse = httpESClient.indices().getMapping(getMappingsRequest, RequestOptions.DEFAULT);
				
				//分析结构
				Map<String, MappingMetadata> mappings = getMappingsResponse.mappings();
		        MappingMetadata mappingMetadata = mappings.get(strRealIndexName);
		        if(mappingMetadata != null) {
		        	Map<String, Object> sourceAsMap = mappingMetadata.sourceAsMap();
		        	if(sourceAsMap.containsKey("properties")) {
		        		Map<String, Object> propertiesMap = (Map<String, Object>)sourceAsMap.get("properties");
		        		if(psSysSearchFieldMap.size() == propertiesMap.size()) {
			        		for(java.util.Map.Entry<String, IPSSysSearchField> entry : psSysSearchFieldMap.entrySet()) {
				        		if(!propertiesMap.containsKey(entry.getKey())) {
				        			bCreateMode = false;
				        			break;
				        		}
				        	}
			        		
			        		if(bCreateMode) {
			        			//没有变化
			        			return;
			        		}
			        	}
		        	}
		        	
		        }
		         
		        bCreateMode = false;
			}

			
			// 定义新的索引映射（mapping）
            XContentBuilder mappingBuilder = XContentFactory.jsonBuilder();
            mappingBuilder.startObject();
            mappingBuilder.startObject("properties");
            for(java.util.Map.Entry<String, IPSSysSearchField> entry : psSysSearchFieldMap.entrySet()) {
            	IPSSysSearchField iPSSysSearchField = entry.getValue();
            	String strType = entry.getValue().getFieldType();
            	if(!StringUtils.hasLength(strType)) {
            		strType = SearchFieldDataType.TEXT.value;
            	}
            	 mappingBuilder.startObject(entry.getKey());
                 mappingBuilder.field("type", strType.toLowerCase());
//                 if(StringUtils.hasLength(iPSSysSearchField.getLogicName())) {
//                	 mappingBuilder.field("description", iPSSysSearchField.getLogicName());
//                 }
                 
                 if(iPSSysSearchField.getFieldParams()!=null) {
                	 Map<String, Object> params = JsonUtils.asMap(iPSSysSearchField.getFieldParams());
                	 Object typeObj = params.get("type");
                	 if(typeObj instanceof Map) {
                		 Map<String, Object> typeParams = (Map)typeObj;
                    	 for(java.util.Map.Entry<String, Object> entry2: typeParams.entrySet()) {
                    		 mappingBuilder.field(entry2.getKey(), entry2.getValue());
                    	 }
                	 }
                	
                 }
                 mappingBuilder.endObject();
            }
            mappingBuilder.endObject();
            mappingBuilder.endObject();
            
			if(bCreateMode) {
				CreateIndexRequest createIndexRequest = new CreateIndexRequest(strRealIndexName);
				CreateIndexResponse createIndexResponse = httpESClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
				
				if (!createIndexResponse.isAcknowledged()) {
					throw new Exception(String.format("建立索引返回结果[%1$s]不正确", createIndexResponse.isAcknowledged()));
				}
				
			}
			
			PutMappingRequest putMappingRequest = new PutMappingRequest(strRealIndexName);
			putMappingRequest.source(mappingBuilder);
			AcknowledgedResponse putMappingResponse = httpESClient.indices().putMapping(putMappingRequest, RequestOptions.DEFAULT);
			if (!putMappingResponse.isAcknowledged()) {
				throw new Exception(String.format("更新索引结构返回结果[%1$s]不正确", putMappingResponse.isAcknowledged()));
			}

		} catch (Exception ex) {
			throw new Exception(String.format("同步索引结构发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpESClient != null) {
				this.getESClientPool().returnObject(httpESClient);
			}
		}
	}
		
	
	protected void onShutdown() throws Exception{
		try {
			this.closeESClientPool();
		}
		catch (Exception ex) {
			log.error(String.format("关闭连接池对象发生异常，%1$s", ex.getMessage()), ex);
		}
		super.onShutdown();
	}
}
