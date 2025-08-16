package net.ibizsys.central.plugin.es.ba;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.elasticsearch.action.DocWriteResponse.Result;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.WriteRequest.RefreshPolicy;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.IdsQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.PrefixQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ba.SysBDSchemeRuntime;
import net.ibizsys.central.ba.SysBDSchemeRuntimeException;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.plugin.es.util.ESClientFactory;
import net.ibizsys.central.plugin.es.util.ESClientPool;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.EntityUtils;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class ESBDSchemeRuntimeBase extends SysBDSchemeRuntime implements IESBDSchemeRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ESBDSchemeRuntimeBase.class);

	public final static String UNIQUEKEY = "id";

	private ESClientPool esClientPool = null;

	private String strIndexName = null;

	private boolean bEnableDocIndexName = false;
	
	@Override
	protected void onInit() throws Exception {

		this.setEnableDocIndexName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".docindexname", this.isEnableDocIndexName()));
		
//		if (StringUtils.hasLength(this.getPSSysBDScheme().getCodeName())) {
//			this.setIndexName(this.getPSSysBDScheme().getCodeName().toLowerCase());
//		}

		super.onInit();

		this.setIndexName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".indexname", this.getRealDBObjName(this.getDBName())));

		if (getESClientPool(true) == null) {
			prepareESClientPool();
		}

		prepareIndex();
	}

	@Override
	public ESClientPool getESClientPool() {
		return getESClientPool(false);
	}
	
	public ESClientPool getESClientPool(boolean bTryMode) {
		if(this.esClientPool != null || bTryMode) {
			return this.esClientPool;
		}
		throw new SysBDSchemeRuntimeException(this, String.format("ES连接池对象无效"));
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

	protected void prepareIndex() throws Exception {
//		RestHighLevelClient httpESClient = null;
//		try {
//			httpESClient = this.getESClientPool().borrowObject();
//
//			GetIndexRequest getIndexRequest = new GetIndexRequest(this.getIndexName());
//			if (httpESClient.indices().exists(getIndexRequest, RequestOptions.DEFAULT)) {
//				return;
//			}
//
//			CreateIndexRequest createIndexRequest = new CreateIndexRequest(this.getIndexName());
//			CreateIndexResponse createIndexResponse = httpESClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
//
//			if (!createIndexResponse.isAcknowledged()) {
//				throw new Exception(String.format("返回结果[%1$s]不正确", createIndexResponse.isAcknowledged()));
//			}
//
//		} catch (Exception ex) {
//			throw new SysBDSchemeRuntimeException(this, String.format("建立索引发生异常，%1$s", ex.getMessage()), ex);
//		} finally {
//			if (httpESClient != null) {
//				this.getESClientPool().returnObject(httpESClient);
//			}
//		}
	}

	@Override
	protected Object onInsert(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {

		strTableName = this.getRealDBObjName(strTableName);
		arg = this.getRealMap(arg);
		extParamMap = this.getRealMap(extParamMap);

		String strId = null;
		Object objId = arg.get(getRealDBObjName(UNIQUEKEY));
		if (objId instanceof String) {
			strId = (String) objId;
		}
		if (!StringUtils.hasLength(strId)) {
			objId = arg.get(Entity.KEY);
			if (objId instanceof String) {
				strId = (String) objId;
			}
		}
		if (!StringUtils.hasLength(strId)) {
			strId = getAutoId();
		}

		RestHighLevelClient httpESClient = null;
		try {
			httpESClient = this.getESClientPool().borrowObject();

//			GetRequest getRequest = new GetRequest(this.getIndexName(strTableName),  strId);
//			if (httpESClient.exists(getRequest, RequestOptions.DEFAULT)) {
//				throw new Exception("数据标识已存在");
//			}

			IndexRequest request = new IndexRequest(this.getIndexName(strTableName)).id(strId);
			Map<String, Object> document = new HashMap<String, Object>();
			if (arg != null) {
				addSourceFields(document, arg);
			}

			if (extParamMap != null) {
				addSourceFields(document, extParamMap);
			}

			request.source(document);
			this.setIndexRequestRefreshPolicy(request);
			
			IndexResponse indexResponse = httpESClient.index(request, RequestOptions.DEFAULT);
			Result result = indexResponse.getResult();
			if (result != Result.CREATED
					&& result != Result.UPDATED
					&& result != Result.NOOP) {
				throw new Exception(String.format("返回结果[%1$s]不正确", result));
			}
			

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("建立数据发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpESClient != null) {
				this.getESClientPool().returnObject(httpESClient);
			}
		}

		return objId;
	}

	protected void addSourceFields(Map<String, Object> document, Map<String, Object> map) throws Throwable {
		for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
			if (Entity.KEY.equals(entry.getKey())) {
				continue;
			}
			document.put(entry.getKey(), getFieldValue(entry.getValue()));
		}
	}

	protected Object getFieldValue(Object objValue) throws Throwable {
		if (objValue != null) {
			if (objValue instanceof BigInteger) {
				return ((BigInteger) objValue).longValue();
			}
			if (objValue instanceof BigDecimal) {
				return ((BigDecimal) objValue).doubleValue();
			}
			if (objValue instanceof java.sql.Timestamp) {
				return new java.util.Date(((java.sql.Timestamp) objValue).getTime());
			}
		}

		return objValue;
	}
	
	protected void setIndexRequestRefreshPolicy(IndexRequest request) {
		request.setRefreshPolicy(RefreshPolicy.IMMEDIATE);
	}
	
	protected void setUpdateRequestRefreshPolicy(UpdateRequest request) {
		request.setRefreshPolicy(RefreshPolicy.IMMEDIATE);
	}

	protected void setDeleteRequestRefreshPolicy(DeleteRequest request) {
		request.setRefreshPolicy(RefreshPolicy.IMMEDIATE);
	}
	

	@Override
	protected Object onUpdate(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {

		if (!bAppendMode) {
			throw new Exception("不支持非附加模式");
		}
		strTableName = this.getRealDBObjName(strTableName);
		arg = this.getRealMap(arg);
		extParamMap = this.getRealMap(extParamMap);
		

		String strId = null;
		Object objId = arg.get(getRealDBObjName(UNIQUEKEY));
		if (objId instanceof String) {
			strId = (String) objId;
		}
		if (!StringUtils.hasLength(strId)) {
			objId = arg.get(Entity.KEY);
			if (objId instanceof String) {
				strId = (String) objId;
			}
		}

		if (!StringUtils.hasLength(strId)) {
			throw new SysBDSchemeRuntimeException(this, "更新数据未指定键值");
		}

		RestHighLevelClient httpESClient = null;
		try {
			httpESClient = this.getESClientPool().borrowObject();

			Map<String, Object> document = new HashMap<String, Object>();
			if (arg != null) {
				addSourceFields(document, arg);
			}

			if (extParamMap != null) {
				addSourceFields(document, extParamMap);
			}


//			GetRequest getRequest = new GetRequest(this.getIndexName(strTableName),  strId);
//			getRequest.fetchSourceContext(new FetchSourceContext(true, null, document.keySet().toArray(new String[document.size()])));
//			
//			GetResponse getResponse = httpESClient.get(getRequest, RequestOptions.DEFAULT);
//			if(!getResponse.isExists()) {
//				throw new Exception("数据不存在");
//			}
//			
//			Map<String, Object> lastMap = getResponse.getSourceAsMap();
//			if(!ObjectUtils.isEmpty(lastMap)) {
//				document.putAll(lastMap);
//			}
			

			UpdateRequest request = new UpdateRequest(this.getIndexName(strTableName), strId);
			this.setUpdateRequestRefreshPolicy(request);

			request.doc(document);
			request.upsert(document);
			
			UpdateResponse updateResponse = httpESClient.update(request, RequestOptions.DEFAULT);
			Result result = updateResponse.getResult();
			if (result != Result.UPDATED
					&& result != Result.CREATED
					&& result != Result.NOOP) {
				throw new Exception(String.format("返回结果[%1$s]不正确", result));
			}
			

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("更新数据发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpESClient != null) {
				this.getESClientPool().returnObject(httpESClient);
			}
		}

		return 1;

	}

	@Override
	protected Object onDelete(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {

		strTableName = this.getRealDBObjName(strTableName);
		arg = this.getRealMap(arg);
		extParamMap = this.getRealMap(extParamMap);
		
		String strId = null;
		Object objId = arg.get(getRealDBObjName(UNIQUEKEY));
		if (objId instanceof String) {
			strId = (String) objId;
		}
		if (!StringUtils.hasLength(strId)) {
			objId = arg.get(Entity.KEY);
			if (objId instanceof String) {
				strId = (String) objId;
			}
		}

		if (!StringUtils.hasLength(strId)) {
			throw new SysBDSchemeRuntimeException(this, "删除数据未指定键值");
		}

		RestHighLevelClient httpESClient = null;
		try {
			httpESClient = this.getESClientPool().borrowObject();
			DeleteRequest deleteRequest = new DeleteRequest(this.getIndexName(strTableName),  strId);
			this.setDeleteRequestRefreshPolicy(deleteRequest);
			DeleteResponse deleteResponse = httpESClient.delete(deleteRequest, RequestOptions.DEFAULT);

			Result result = deleteResponse.getResult();
			if (result == Result.DELETED) {
				return 1;
			}
			if (result == Result.NOT_FOUND || result == Result.NOOP) {
				return 0;
			}
			throw new Exception(String.format("返回结果[%1$s]不正确", result));

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("删除数据发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpESClient != null) {
				this.getESClientPool().returnObject(httpESClient);
			}
		}
	}

	@Override
	protected List onQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {

		String strTableName = iDataEntityRuntime.getTableName();
		if (ObjectUtils.isEmpty(strTableName)) {
			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
		}

		strTableName = this.getRealDBObjName(strTableName);

		SearchSourceBuilder builder = new SearchSourceBuilder();

		List<QueryBuilder> filterQueryList = new ArrayList<QueryBuilder>();

		// 构建查询条件
		if (iSearchContext != null) {
			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
			if (searchConds != null) {
				for (ISearchCond item : searchConds) {
					QueryBuilder queryBuilder = this.getQueryBuilder(item, iSearchContext, iDataEntityRuntime);
					if (queryBuilder == null) {
						continue;
					}
					//
					// if (item instanceof ISearchGroupCond) {
					// ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)
					// item;
					// if
					// (ISearchGroupCond.CAT_QUERY.equals(iSearchGroupCond.getCat()))
					// {
					// // 快速查询，放入query
					// solrQuery.setQuery(strExpression);
					// continue;
					// }
					// }

					filterQueryList.add(queryBuilder);
				}
			}
		}

		if (iDataEntityRuntime.isEnableLogicValid()) {
			QueryBuilder queryBuilder = this.getQueryBuilder(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
			if (queryBuilder != null) {
				filterQueryList.add(queryBuilder);
			}
		}

		// 附加数据查询条件
		if (iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition() != null) {
			QueryBuilder queryBuilder = this.getQueryBuilder(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext == null ? null : iSearchContext.any(), iDataEntityRuntime);
			if (queryBuilder != null) {
				filterQueryList.add(queryBuilder);
			}
		}

		java.util.List<IPSDEField> selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
		List<String> fieldList = new ArrayList<String>();

		if (selectedPSDEFieldList != null) {
			selectedPSDEFieldList.forEach(t -> {
				fieldList.add(t.getLowerCaseName());
			});
		}

		if (filterQueryList.size() > 0) {
			builder.query(this.getGroupQueryBuilder(Conditions.AND, filterQueryList));
		}
		

		// 设置查询属性
		if (!ObjectUtils.isEmpty(fieldList)) {
			builder.fetchSource(fieldList.toArray(new String[fieldList.size()]), null);
		}

	//	builder.storedFields(fieldList);

		RestHighLevelClient httpESClient = null;
		try {
			httpESClient = this.getESClientPool().borrowObject();

			SearchRequest searchRequest = new SearchRequest(this.getIndexName(strTableName));
//			searchRequest.types(strTableName.toLowerCase());
			searchRequest.source(builder);

			SearchResponse resp = httpESClient.search(searchRequest, RequestOptions.DEFAULT);

			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

			SearchHit[] hits = resp.getHits().getHits();
			if (hits != null && hits.length > 0) {
				for (SearchHit searchHit : hits) {
					list.add(searchHit.getSourceAsMap());
				}
			}

			return (list.size() > 0) ? list : null;

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("查询数据发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpESClient != null) {
				this.getESClientPool().returnObject(httpESClient);
			}
		}
	}

	@Override
	protected Page onFetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {

		String strTableName = iDataEntityRuntime.getTableName();
		if (ObjectUtils.isEmpty(strTableName)) {
			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
		}

		strTableName = this.getRealDBObjName(strTableName);
		
		SearchSourceBuilder builder = new SearchSourceBuilder();

		List<QueryBuilder> filterQueryList = new ArrayList<QueryBuilder>();

		int nSkip = 0;
		int nLimit = ISearchContext.DEFAULTPAGESIZE;
		// 构建查询条件

		if (iSearchContext != null) {
			// 处理排序
			if (iSearchContext.getPageSort() != null && iSearchContext.getPageSort().isSorted()) {
				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
				while (orders.hasNext()) {
					Sort.Order order = orders.next();
					builder.sort(order.getProperty(), order.isAscending() ? SortOrder.ASC : SortOrder.DESC);
					break;
				}
			}

			if (iSearchContext.getPageable() != null && iSearchContext.getPageable().isPaged()) {
				nLimit = iSearchContext.getPageable().getPageSize();
				nSkip = (iSearchContext.getPageable().getPageNumber() - ISearchContext.STARTPAGE) * nLimit;
			}

			// 处理条件
			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
			if (searchConds != null) {
				for (ISearchCond item : searchConds) {
					QueryBuilder queryBuilder = this.getQueryBuilder(item, iSearchContext, iDataEntityRuntime);
					if (queryBuilder == null) {
						continue;
					}
					//
					// if (item instanceof ISearchGroupCond) {
					// ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)
					// item;
					// if
					// (ISearchGroupCond.CAT_QUERY.equals(iSearchGroupCond.getCat()))
					// {
					// // 快速查询，放入query
					// solrQuery.setQuery(strExpression);
					// continue;
					// }
					// }

					filterQueryList.add(queryBuilder);
				}
			}
		}

		if (iDataEntityRuntime.isEnableLogicValid()) {
			QueryBuilder queryBuilder = this.getQueryBuilder(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
			if (queryBuilder != null) {
				filterQueryList.add(queryBuilder);
			}
		}

		java.util.List<IPSDEField> selectedPSDEFieldList = null;
		// 附加数据集条件 （OR）
		List<IPSDEDataQuery> psDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
		if (!ObjectUtils.isEmpty(psDEDataQueryList)) {

			java.util.List<QueryBuilder> orlist = new java.util.ArrayList<QueryBuilder>();
			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
				if (selectedPSDEFieldList == null) {
					selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
				}

				if (iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition() != null) {
					QueryBuilder queryBuilder = this.getQueryBuilder(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext == null ? null : iSearchContext.any(), iDataEntityRuntime);
					if (queryBuilder != null) {
						orlist.add(queryBuilder);
					}
				}
			}

			if (!ObjectUtils.isEmpty(orlist)) {
				filterQueryList.add(this.getGroupQueryBuilder(Conditions.OR, orlist));
			}
		}

		if (filterQueryList.size() > 0) {
			builder.query(this.getGroupQueryBuilder(Conditions.AND, filterQueryList));
		}

		if (selectedPSDEFieldList == null) {
			selectedPSDEFieldList = iDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
		}

		List<String> fieldList = new ArrayList<String>();
		if (selectedPSDEFieldList != null) {
			selectedPSDEFieldList.forEach(t -> {
				fieldList.add(t.getLowerCaseName());
			});
		}

		// 设置查询属性
		//builder.(fieldList);
//		if (!ObjectUtils.isEmpty(fieldList)) {
//			for (String strFieldName : fieldList) {
//				builder.docValueField(strFieldName);
//			}
//		}
		if (!ObjectUtils.isEmpty(fieldList)) {
			builder.fetchSource(fieldList.toArray(new String[fieldList.size()]), null);
		}

		// 设置分页信息
		builder.from(nSkip);
		builder.size(nLimit);

		RestHighLevelClient httpESClient = null;
		try {
			httpESClient = this.getESClientPool().borrowObject();

			SearchRequest searchRequest = new SearchRequest(this.getIndexName(strTableName));
//			searchRequest.types(strTableName.toLowerCase());
			searchRequest.source(builder);

			SearchResponse resp = httpESClient.search(searchRequest, RequestOptions.DEFAULT);

			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

			SearchHit[] hits = resp.getHits().getHits();
			if (hits != null && hits.length > 0) {
				for (SearchHit searchHit : hits) {
					list.add(searchHit.getSourceAsMap());
				}
			}

			long nTotal = (list == null) ? 0 : list.size();

			if (resp.getHits().getTotalHits() != null) {
				nTotal = resp.getHits().getTotalHits().value;
			} else {
				if (iSearchContext.isCount()) {
					if (nTotal >= nLimit) {
						nTotal = nSkip + nLimit * 2;
					} else {
						nTotal += nSkip;
					}
				} else {
					nTotal += nSkip;
				}
			}

			return new PageImpl(list, (iSearchContext != null) ? iSearchContext.getPageable() : Pageable.unpaged(), nTotal);

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("查询结果集发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpESClient != null) {
				this.getESClientPool().returnObject(httpESClient);
			}
		}
	}

	protected QueryBuilder getQueryBuilder(IPSDEDQCondition iPSDEDQCondition, Map<String, Object> params, IDataEntityRuntime iDataEntityRuntime) throws Throwable {

		if (iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
			List<QueryBuilder> queryBuilderList = new ArrayList<QueryBuilder>();
			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition) iPSDEDQCondition;
			List<IPSDEDQCondition> psDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
			if (psDEDQConditions != null) {
				for (IPSDEDQCondition item : psDEDQConditions) {
					QueryBuilder queryBuilder = this.getQueryBuilder(item, params, iDataEntityRuntime);
					if (queryBuilder != null) {
						queryBuilderList.add(queryBuilder);
					}
				}
			}

			if (queryBuilderList.size() > 0) {
				QueryBuilder groupQueryBuilder = this.getGroupQueryBuilder(iPSDEDQGroupCondition.getCondOp(), queryBuilderList);
				if (groupQueryBuilder == null) {
					return null;
				}

				if (iPSDEDQGroupCondition.isNotMode()) {
					return new BoolQueryBuilder().mustNot(groupQueryBuilder);
				} else {
					return groupQueryBuilder;
				}
			} else {
				return null;
			}
		}

		if (iPSDEDQCondition instanceof IPSDEDQFieldCondition) {
			IPSDEDQFieldCondition iPSDEDQFieldCondition = (IPSDEDQFieldCondition) iPSDEDQCondition;
			String strVarType = iPSDEDQFieldCondition.getPSVARTypeId();
			if (StringUtils.hasLength(strVarType)) {
				Object objValue = null;
				if (StringUtils.hasLength(iPSDEDQFieldCondition.getCondValue())) {
					objValue = params == null ? null : params.get(iPSDEDQFieldCondition.getCondValue().toLowerCase());
				}
				return getQueryBuilder(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
			} else {
				Object objValue = iPSDEDQFieldCondition.getCondValue();
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(iPSDEDQFieldCondition.getFieldName(), true);
				if (iPSDEField != null) {
					objValue = iDataEntityRuntime.convertValue(iPSDEField.getStdDataType(), (String) objValue);
				}
				return getQueryBuilder(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
			}
			// if(CondType.)
			// Object objValue =
			// iPSDEDQFieldCondition.getPSVARTypeId()();getValue();
			// if(objValue == null) {
			// return null;
			// }
			// if(iSearchFieldCond.isParamMode()) {
			// objValue = iSearchContext.get(objValue.toString());
			// }
			//
			//
			// return getQueryBuilder(iSearchFieldCond.getFieldName(),
			// iSearchFieldCond.getCondOp(), objValue);
		}

		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iPSDEDQCondition.getCondType()));

	}

	protected QueryBuilder getQueryBuilder(ISearchCond iSearchCond, ISearchContext iSearchContext, IDataEntityRuntime iDataEntityRuntime) throws Throwable {

		if (iSearchCond instanceof ISearchGroupCond) {
			List<QueryBuilder> queryBuilderList = new ArrayList<QueryBuilder>();
			ISearchGroupCond iSearchGroupCond = (ISearchGroupCond) iSearchCond;
			List<ISearchCond> searchConds = iSearchGroupCond.getSearchConds();
			if (searchConds != null) {
				for (ISearchCond item : searchConds) {
					QueryBuilder queryBuilder = this.getQueryBuilder(item, iSearchContext, iDataEntityRuntime);
					if (queryBuilder != null) {
						queryBuilderList.add(queryBuilder);
					}
				}
			}

			if (queryBuilderList.size() > 0) {
				QueryBuilder groupQueryBuilder = this.getGroupQueryBuilder(iSearchGroupCond.getCondOp(), queryBuilderList);
				if (groupQueryBuilder == null) {
					return null;
				}

				if (iSearchGroupCond.isNotMode()) {
					return new BoolQueryBuilder().mustNot(groupQueryBuilder);
				} else {
					return groupQueryBuilder;
				}
			} else {
				return null;
			}
		}

		if (iSearchCond instanceof ISearchFieldCond) {
			ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
			Object objValue = iSearchFieldCond.getValue();
			if (objValue == null) {
				return null;
			}
			if (iSearchFieldCond.isParamMode()) {
				objValue = iSearchContext.get(objValue.toString());
			}

			return getQueryBuilder(iSearchFieldCond.getFieldName(), iSearchFieldCond.getCondOp(), objValue, iDataEntityRuntime);
		}

		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iSearchCond.getCondType()));
	}

	protected QueryBuilder getQueryBuilder(String strFieldName, String strCondition, Object objValue, IDataEntityRuntime iDataEntityRuntime) throws Throwable {

		int nStdDataType = DataTypes.VARCHAR;
		if (StringUtils.hasLength(strFieldName)) {
			strFieldName = strFieldName.toLowerCase();
			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strFieldName, true);
			if (iPSDEField != null) {
				nStdDataType = iPSDEField.getStdDataType();
				if (iPSDEField.isKeyDEField()) {
					strFieldName = UNIQUEKEY;
				}
			}
		} else {
			throw new Exception("未指定属性标识");
		}

		if (Conditions.EQ.equals(strCondition) || Conditions.ABSEQ.equals(strCondition)) {
			if (UNIQUEKEY.equals(strFieldName)) {
				if (ObjectUtils.isEmpty(objValue)) {
					return new IdsQueryBuilder().addIds("");
				} else {
					return new IdsQueryBuilder().addIds(objValue.toString());
				}
			}

			if (ObjectUtils.isEmpty(objValue)) {
				return new TermQueryBuilder(strFieldName, "");
			} else {
				return new TermQueryBuilder(strFieldName, objValue);
			}
		}

		if (Conditions.IN.equals(strCondition)) {
			if (UNIQUEKEY.equals(strFieldName)) {
				if (ObjectUtils.isEmpty(objValue)) {
					return new IdsQueryBuilder().addIds("");
				} else {
					return new IdsQueryBuilder().addIds(String.valueOf(objValue).split(",|;"));
				}
			}
			if (ObjectUtils.isEmpty(objValue)) {
				return new TermQueryBuilder(strFieldName, "");
			} else {
				return new TermQueryBuilder(strFieldName, String.valueOf(objValue).split(",|;"));
			}
		}

		if (Conditions.GT.equals(strCondition)) {
			return new RangeQueryBuilder(strFieldName).gt(objValue);
		}

		if (Conditions.GTANDEQ.equals(strCondition)) {
			return new RangeQueryBuilder(strFieldName).gte(objValue);
		}

		if (Conditions.LT.equals(strCondition)) {
			return new RangeQueryBuilder(strFieldName).lt(objValue);
		}

		if (Conditions.LTANDEQ.equals(strCondition)) {
			return new RangeQueryBuilder(strFieldName).lte(objValue);
		}

		if (Conditions.NOTEQ.equals(strCondition)) {
			if (ObjectUtils.isEmpty(objValue)) {
				return new BoolQueryBuilder().mustNot(new TermQueryBuilder(strFieldName, ""));
			} else {
				return new BoolQueryBuilder().mustNot(new TermQueryBuilder(strFieldName, objValue));
			}
		}

		if (Conditions.ISNULL.equals(strCondition)) {
			return new TermQueryBuilder(strFieldName, null);
		}

		if (Conditions.ISNOTNULL.equals(strCondition)) {
			return new BoolQueryBuilder().mustNot(new TermQueryBuilder(strFieldName, null));
		}

		if (Conditions.LIKE.equals(strCondition)) {
			return new MatchQueryBuilder(strFieldName, objValue);
		}

		if (Conditions.LEFTLIKE.equals(strCondition)) {

			if (ObjectUtils.isEmpty(objValue)) {
				return new PrefixQueryBuilder(strFieldName, "");
			} else {
				return new PrefixQueryBuilder(strFieldName, objValue.toString());
			}
		}

		// if (Conditions.RIGHTLIKE.equals(strCondition)) {
		// if (ObjectUtils.isEmpty(objValue)) {
		// return String.format("%1$s:\"\"", strFieldName);
		// } else {
		// return String.format("%1$s:\"%2$s\"", strFieldName,
		// getCondValue(objValue.toString()));
		// }
		// }

		throw new Exception(String.format("未支持的条件操作[%1$s]", strCondition));
	}

	protected QueryBuilder getGroupQueryBuilder(String strCondition, List<QueryBuilder> queryBuilderList) throws Throwable {

		BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
		if (Conditions.AND.equalsIgnoreCase(strCondition)) {
			boolQueryBuilder.must().addAll(queryBuilderList);
		} else {
			boolQueryBuilder.should().addAll(queryBuilderList);
		}
		return boolQueryBuilder;
	}

	protected String getAutoId() {
		return String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS%2$s", new Date(), KeyValueUtils.genUniqueId());
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
