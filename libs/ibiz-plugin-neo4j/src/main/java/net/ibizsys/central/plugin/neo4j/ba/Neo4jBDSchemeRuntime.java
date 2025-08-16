package net.ibizsys.central.plugin.neo4j.ba;

import org.neo4j.driver.AuthToken;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ba.SysBDSchemeRuntime;
import net.ibizsys.runtime.SystemRuntimeException;

public class Neo4jBDSchemeRuntime extends SysBDSchemeRuntime implements INeo4jBDSchemeRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Neo4jBDSchemeRuntime.class);

	public final static String BDTYPE_NEO4J = "NEO4J";

	//public final static String UNIQUEKEY = "id";

	private Driver driver = null;

	//private String strIndexName = null;

	@Override
	protected void onInit() throws Exception {

//		if (StringUtils.hasLength(this.getPSSysBDScheme().getCodeName())) {
//			this.setIndexName(this.getPSSysBDScheme().getCodeName().toLowerCase());
//		}

		super.onInit();

		//this.setIndexName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".indexname", this.getIndexName()));

		if (getDriver(true) == null) {
			prepareDriver();
		}

		//prepareIndex();
	}

	@Override
	public Driver getDriver(){
		return getDriver (false);
	}
	
	public Driver getDriver(boolean bTryMode){
		if(this.driver != null || bTryMode) {
			return this.driver;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("Neo4j连接池对象无效"));
	}

	/**
	 * 设置客户端连接池
	 * 
	 * @param driver
	 */
	protected void setDriver(Driver  driver){
		this.driver = driver;
	}

	protected void prepareDriver() throws Exception {
		if (!StringUtils.hasLength(this.getServiceUrl())) {
			throw new Exception("未定义服务地址");
		}
		
		AuthToken authToken = AuthTokens.basic(this.getClientId(), this.getClientSecret());
		Driver driver = GraphDatabase.driver(this.getServiceUrl(), authToken);
		this.setDriver(driver);
	}
	
	protected void closeDriver () throws Exception {
		Driver  driver = this.getDriver(true);
		if(driver != null) {
			driver.close();
			this.setDriver(null);
		}
	}

	

//	@Override
//	protected List onQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
//
//		String strTableName = iDataEntityRuntime.getTableName();
//		if (ObjectUtils.isEmpty(strTableName)) {
//			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
//		}
//
//		strTableName = strTableName.toLowerCase();
//
//		SearchSourceBuilder builder = new SearchSourceBuilder();
//
//		List<QueryBuilder> filterQueryList = new ArrayList<QueryBuilder>();
//
//		// 构建查询条件
//		if (iSearchContext != null) {
//			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
//			if (searchConds != null) {
//				for (ISearchCond item : searchConds) {
//					QueryBuilder queryBuilder = this.getQueryBuilder(item, iSearchContext, iDataEntityRuntime);
//					if (queryBuilder == null) {
//						continue;
//					}
//					//
//					// if (item instanceof ISearchGroupCond) {
//					// ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)
//					// item;
//					// if
//					// (ISearchGroupCond.CAT_QUERY.equals(iSearchGroupCond.getCat()))
//					// {
//					// // 快速查询，放入query
//					// solrQuery.setQuery(strExpression);
//					// continue;
//					// }
//					// }
//
//					filterQueryList.add(queryBuilder);
//				}
//			}
//		}
//
//		if (iDataEntityRuntime.isEnableLogicValid()) {
//			QueryBuilder queryBuilder = this.getQueryBuilder(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
//			if (queryBuilder != null) {
//				filterQueryList.add(queryBuilder);
//			}
//		}
//
//		// 附加数据查询条件
//		if (iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition() != null) {
//			QueryBuilder queryBuilder = this.getQueryBuilder(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext == null ? null : iSearchContext.any(), iDataEntityRuntime);
//			if (queryBuilder != null) {
//				filterQueryList.add(queryBuilder);
//			}
//		}
//
//		java.util.List<IPSDEField> selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
//		List<String> fieldList = new ArrayList<String>();
//
//		if (selectedPSDEFieldList != null) {
//			selectedPSDEFieldList.forEach(t -> {
//				fieldList.add(t.getLowerCaseName());
//			});
//		}
//
//		if (filterQueryList.size() > 0) {
//			builder.query(this.getGroupQueryBuilder(Conditions.AND, filterQueryList));
//		}
//		
//
//		// 设置查询属性
//		if (!ObjectUtils.isEmpty(fieldList)) {
//			builder.fetchSource(fieldList.toArray(new String[fieldList.size()]), null);
//		}
//
//	//	builder.storedFields(fieldList);
//
//		RestHighLevelClient httpESClient = null;
//		try {
//			httpESClient = this.getDriver ().borrowObject();
//
//			SearchRequest searchRequest = new SearchRequest(this.getIndexName());
//			searchRequest.types(strTableName.toLowerCase());
//			searchRequest.source(builder);
//
//			SearchResponse resp = httpESClient.search(searchRequest, RequestOptions.DEFAULT);
//
//			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//
//			SearchHit[] hits = resp.getHits().getHits();
//			if (hits != null && hits.length > 0) {
//				for (SearchHit searchHit : hits) {
//					list.add(searchHit.getSourceAsMap());
//				}
//			}
//
//			return (list.size() > 0) ? list : null;
//
//		} catch (Exception ex) {
//			throw new SysBDSchemeRuntimeException(this, String.format("查询数据发生异常，%1$s", ex.getMessage()), ex);
//		} finally {
//			if (httpESClient != null) {
//				this.getDriver ().returnObject(httpESClient);
//			}
//		}
//	}
//
//	@Override
//	protected Page onFetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
//
//		String strTableName = iDataEntityRuntime.getTableName();
//		if (ObjectUtils.isEmpty(strTableName)) {
//			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
//		}
//
//		SearchSourceBuilder builder = new SearchSourceBuilder();
//
//		List<QueryBuilder> filterQueryList = new ArrayList<QueryBuilder>();
//
//		int nSkip = 0;
//		int nLimit = ISearchContext.DEFAULTPAGESIZE;
//		// 构建查询条件
//
//		if (iSearchContext != null) {
//			// 处理排序
//			if (iSearchContext.getPageSort() != null && iSearchContext.getPageSort().isSorted()) {
//				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
//				while (orders.hasNext()) {
//					Sort.Order order = orders.next();
//					builder.sort(order.getProperty(), order.isAscending() ? SortOrder.ASC : SortOrder.DESC);
//					break;
//				}
//			}
//
//			if (iSearchContext.getPageable() != null && iSearchContext.getPageable().isPaged()) {
//				nLimit = iSearchContext.getPageable().getPageSize();
//				nSkip = (iSearchContext.getPageable().getPageNumber() - ISearchContext.STARTPAGE) * nLimit;
//			}
//
//			// 处理条件
//			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
//			if (searchConds != null) {
//				for (ISearchCond item : searchConds) {
//					QueryBuilder queryBuilder = this.getQueryBuilder(item, iSearchContext, iDataEntityRuntime);
//					if (queryBuilder == null) {
//						continue;
//					}
//					//
//					// if (item instanceof ISearchGroupCond) {
//					// ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)
//					// item;
//					// if
//					// (ISearchGroupCond.CAT_QUERY.equals(iSearchGroupCond.getCat()))
//					// {
//					// // 快速查询，放入query
//					// solrQuery.setQuery(strExpression);
//					// continue;
//					// }
//					// }
//
//					filterQueryList.add(queryBuilder);
//				}
//			}
//		}
//
//		if (iDataEntityRuntime.isEnableLogicValid()) {
//			QueryBuilder queryBuilder = this.getQueryBuilder(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
//			if (queryBuilder != null) {
//				filterQueryList.add(queryBuilder);
//			}
//		}
//
//		java.util.List<IPSDEField> selectedPSDEFieldList = null;
//		// 附加数据集条件 （OR）
//		List<IPSDEDataQuery> psDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
//		if (!ObjectUtils.isEmpty(psDEDataQueryList)) {
//
//			java.util.List<QueryBuilder> orlist = new java.util.ArrayList<QueryBuilder>();
//			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
//				if (selectedPSDEFieldList == null) {
//					selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
//				}
//
//				if (iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition() != null) {
//					QueryBuilder queryBuilder = this.getQueryBuilder(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext == null ? null : iSearchContext.any(), iDataEntityRuntime);
//					if (queryBuilder != null) {
//						orlist.add(queryBuilder);
//					}
//				}
//			}
//
//			if (!ObjectUtils.isEmpty(orlist)) {
//				filterQueryList.add(this.getGroupQueryBuilder(Conditions.OR, orlist));
//			}
//		}
//
//		if (filterQueryList.size() > 0) {
//			builder.query(this.getGroupQueryBuilder(Conditions.AND, filterQueryList));
//		}
//
//		if (selectedPSDEFieldList == null) {
//			selectedPSDEFieldList = iDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
//		}
//
//		List<String> fieldList = new ArrayList<String>();
//		if (selectedPSDEFieldList != null) {
//			selectedPSDEFieldList.forEach(t -> {
//				fieldList.add(t.getLowerCaseName());
//			});
//		}
//
//		// 设置查询属性
//		//builder.(fieldList);
////		if (!ObjectUtils.isEmpty(fieldList)) {
////			for (String strFieldName : fieldList) {
////				builder.docValueField(strFieldName);
////			}
////		}
//		if (!ObjectUtils.isEmpty(fieldList)) {
//			builder.fetchSource(fieldList.toArray(new String[fieldList.size()]), null);
//		}
//
//		// 设置分页信息
//		builder.from(nSkip);
//		builder.size(nLimit);
//
//		RestHighLevelClient httpESClient = null;
//		try {
//			httpESClient = this.getDriver ().borrowObject();
//
//			SearchRequest searchRequest = new SearchRequest(this.getIndexName());
//			searchRequest.types(strTableName.toLowerCase());
//			searchRequest.source(builder);
//
//			SearchResponse resp = httpESClient.search(searchRequest, RequestOptions.DEFAULT);
//
//			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//
//			SearchHit[] hits = resp.getHits().getHits();
//			if (hits != null && hits.length > 0) {
//				for (SearchHit searchHit : hits) {
//					list.add(searchHit.getSourceAsMap());
//				}
//			}
//
//			long nTotal = (list == null) ? 0 : list.size();
//
//			if (resp.getHits().getTotalHits() != null) {
//				nTotal = resp.getHits().getTotalHits().value;
//			} else {
//				if (iSearchContext.isCount()) {
//					if (nTotal >= nLimit) {
//						nTotal = nSkip + nLimit * 2;
//					} else {
//						nTotal += nSkip;
//					}
//				} else {
//					nTotal += nSkip;
//				}
//			}
//
//			return new PageImpl(list, (iSearchContext != null) ? iSearchContext.getPageable() : Pageable.unpaged(), nTotal);
//
//		} catch (Exception ex) {
//			throw new SysBDSchemeRuntimeException(this, String.format("查询结果集发生异常，%1$s", ex.getMessage()), ex);
//		} finally {
//			if (httpESClient != null) {
//				this.getDriver ().returnObject(httpESClient);
//			}
//		}
//	}
//
//	protected QueryBuilder getQueryBuilder(IPSDEDQCondition iPSDEDQCondition, Map<String, Object> params, IDataEntityRuntime iDataEntityRuntime) throws Throwable {
//
//		if (iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
//			List<QueryBuilder> queryBuilderList = new ArrayList<QueryBuilder>();
//			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition) iPSDEDQCondition;
//			List<IPSDEDQCondition> psDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
//			if (psDEDQConditions != null) {
//				for (IPSDEDQCondition item : psDEDQConditions) {
//					QueryBuilder queryBuilder = this.getQueryBuilder(item, params, iDataEntityRuntime);
//					if (queryBuilder != null) {
//						queryBuilderList.add(queryBuilder);
//					}
//				}
//			}
//
//			if (queryBuilderList.size() > 0) {
//				QueryBuilder groupQueryBuilder = this.getGroupQueryBuilder(iPSDEDQGroupCondition.getCondOp(), queryBuilderList);
//				if (groupQueryBuilder == null) {
//					return null;
//				}
//
//				if (iPSDEDQGroupCondition.isNotMode()) {
//					return new BoolQueryBuilder().mustNot(groupQueryBuilder);
//				} else {
//					return groupQueryBuilder;
//				}
//			} else {
//				return null;
//			}
//		}
//
//		if (iPSDEDQCondition instanceof IPSDEDQFieldCondition) {
//			IPSDEDQFieldCondition iPSDEDQFieldCondition = (IPSDEDQFieldCondition) iPSDEDQCondition;
//			String strVarType = iPSDEDQFieldCondition.getPSVARTypeId();
//			if (StringUtils.hasLength(strVarType)) {
//				Object objValue = null;
//				if (StringUtils.hasLength(iPSDEDQFieldCondition.getCondValue())) {
//					objValue = params == null ? null : params.get(iPSDEDQFieldCondition.getCondValue().toLowerCase());
//				}
//				return getQueryBuilder(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
//			} else {
//				Object objValue = iPSDEDQFieldCondition.getCondValue();
//				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(iPSDEDQFieldCondition.getFieldName(), true);
//				if (iPSDEField != null) {
//					objValue = iDataEntityRuntime.convertValue(iPSDEField.getStdDataType(), (String) objValue);
//				}
//				return getQueryBuilder(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
//			}
//			// if(CondType.)
//			// Object objValue =
//			// iPSDEDQFieldCondition.getPSVARTypeId()();getValue();
//			// if(objValue == null) {
//			// return null;
//			// }
//			// if(iSearchFieldCond.isParamMode()) {
//			// objValue = iSearchContext.get(objValue.toString());
//			// }
//			//
//			//
//			// return getQueryBuilder(iSearchFieldCond.getFieldName(),
//			// iSearchFieldCond.getCondOp(), objValue);
//		}
//
//		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iPSDEDQCondition.getCondType()));
//
//	}
//
//	protected QueryBuilder getQueryBuilder(ISearchCond iSearchCond, ISearchContext iSearchContext, IDataEntityRuntime iDataEntityRuntime) throws Throwable {
//
//		if (iSearchCond instanceof ISearchGroupCond) {
//			List<QueryBuilder> queryBuilderList = new ArrayList<QueryBuilder>();
//			ISearchGroupCond iSearchGroupCond = (ISearchGroupCond) iSearchCond;
//			List<ISearchCond> searchConds = iSearchGroupCond.getSearchConds();
//			if (searchConds != null) {
//				for (ISearchCond item : searchConds) {
//					QueryBuilder queryBuilder = this.getQueryBuilder(item, iSearchContext, iDataEntityRuntime);
//					if (queryBuilder != null) {
//						queryBuilderList.add(queryBuilder);
//					}
//				}
//			}
//
//			if (queryBuilderList.size() > 0) {
//				QueryBuilder groupQueryBuilder = this.getGroupQueryBuilder(iSearchGroupCond.getCondOp(), queryBuilderList);
//				if (groupQueryBuilder == null) {
//					return null;
//				}
//
//				if (iSearchGroupCond.isNotMode()) {
//					return new BoolQueryBuilder().mustNot(groupQueryBuilder);
//				} else {
//					return groupQueryBuilder;
//				}
//			} else {
//				return null;
//			}
//		}
//
//		if (iSearchCond instanceof ISearchFieldCond) {
//			ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
//			Object objValue = iSearchFieldCond.getValue();
//			if (objValue == null) {
//				return null;
//			}
//			if (iSearchFieldCond.isParamMode()) {
//				objValue = iSearchContext.get(objValue.toString());
//			}
//
//			return getQueryBuilder(iSearchFieldCond.getFieldName(), iSearchFieldCond.getCondOp(), objValue, iDataEntityRuntime);
//		}
//
//		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iSearchCond.getCondType()));
//	}
//
//	protected QueryBuilder getQueryBuilder(String strFieldName, String strCondition, Object objValue, IDataEntityRuntime iDataEntityRuntime) throws Throwable {
//
//		int nStdDataType = DataTypes.VARCHAR;
//		if (StringUtils.hasLength(strFieldName)) {
//			strFieldName = strFieldName.toLowerCase();
//			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strFieldName, true);
//			if (iPSDEField != null) {
//				nStdDataType = iPSDEField.getStdDataType();
//				if (iPSDEField.isKeyDEField()) {
//					strFieldName = UNIQUEKEY;
//				}
//			}
//		} else {
//			throw new Exception("未指定属性标识");
//		}
//
//		if (Conditions.EQ.equals(strCondition) || Conditions.ABSEQ.equals(strCondition)) {
//			if (UNIQUEKEY.equals(strFieldName)) {
//				if (ObjectUtils.isEmpty(objValue)) {
//					return new IdsQueryBuilder().addIds("");
//				} else {
//					return new IdsQueryBuilder().addIds(objValue.toString());
//				}
//			}
//
//			if (ObjectUtils.isEmpty(objValue)) {
//				return new TermQueryBuilder(strFieldName, "");
//			} else {
//				return new TermQueryBuilder(strFieldName, objValue);
//			}
//		}
//
//		if (Conditions.GT.equals(strCondition)) {
//			return new RangeQueryBuilder(strFieldName).gt(objValue);
//		}
//
//		if (Conditions.GTANDEQ.equals(strCondition)) {
//			return new RangeQueryBuilder(strFieldName).gte(objValue);
//		}
//
//		if (Conditions.LT.equals(strCondition)) {
//			return new RangeQueryBuilder(strFieldName).lt(objValue);
//		}
//
//		if (Conditions.LTANDEQ.equals(strCondition)) {
//			return new RangeQueryBuilder(strFieldName).lte(objValue);
//		}
//
//		if (Conditions.NOTEQ.equals(strCondition)) {
//			if (ObjectUtils.isEmpty(objValue)) {
//				return new BoolQueryBuilder().mustNot(new TermQueryBuilder(strFieldName, ""));
//			} else {
//				return new BoolQueryBuilder().mustNot(new TermQueryBuilder(strFieldName, objValue));
//			}
//		}
//
//		if (Conditions.ISNULL.equals(strCondition)) {
//			return new TermQueryBuilder(strFieldName, null);
//		}
//
//		if (Conditions.ISNOTNULL.equals(strCondition)) {
//			return new BoolQueryBuilder().mustNot(new TermQueryBuilder(strFieldName, null));
//		}
//
//		if (Conditions.LIKE.equals(strCondition)) {
//			return new MatchQueryBuilder(strFieldName, objValue);
//		}
//
//		if (Conditions.LEFTLIKE.equals(strCondition)) {
//
//			if (ObjectUtils.isEmpty(objValue)) {
//				return new PrefixQueryBuilder(strFieldName, "");
//			} else {
//				return new PrefixQueryBuilder(strFieldName, objValue.toString());
//			}
//		}
//
//		// if (Conditions.RIGHTLIKE.equals(strCondition)) {
//		// if (ObjectUtils.isEmpty(objValue)) {
//		// return String.format("%1$s:\"\"", strFieldName);
//		// } else {
//		// return String.format("%1$s:\"%2$s\"", strFieldName,
//		// getCondValue(objValue.toString()));
//		// }
//		// }
//
//		throw new Exception(String.format("未支持的条件操作[%1$s]", strCondition));
//	}
//
//	protected QueryBuilder getGroupQueryBuilder(String strCondition, List<QueryBuilder> queryBuilderList) throws Throwable {
//
//		BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
//		if (Conditions.AND.equalsIgnoreCase(strCondition)) {
//			boolQueryBuilder.must().addAll(queryBuilderList);
//		} else {
//			boolQueryBuilder.should().addAll(queryBuilderList);
//		}
//		return boolQueryBuilder;
//	}


	
	protected void onShutdown() throws Exception{
		try {
			this.closeDriver ();
		}
		catch (Exception ex) {
			log.error(String.format("关闭连接池对象发生异常，%1$s", ex.getMessage()), ex);
		}
		super.onShutdown();
	}
}
