package net.ibizsys.central.plugin.solr.ba;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ba.SysBDSchemeRuntime;
import net.ibizsys.central.ba.SysBDSchemeRuntimeException;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.plugin.solr.util.SolrClientFactory;
import net.ibizsys.central.plugin.solr.util.SolrClientPool;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.EntityUtils;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.KeyValueUtils;

public class SolrBDSchemeRuntime extends SysBDSchemeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SolrBDSchemeRuntime.class);

	public final static String BDTYPE_SOLR = "SOLR";

	public final static String UNIQUEKEY = "id";

	private SolrClientPool solrClientPool = null;

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		if (getSolrClientPool(true) == null) {
			prepareSolrClientPool();
		}
	}

	public SolrClientPool getSolrClientPool() {
		return this.getSolrClientPool(false);
	}
	
	public SolrClientPool getSolrClientPool(boolean bTryMode) {
		if(this.solrClientPool != null || bTryMode) {
			return this.solrClientPool;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("Solr连接池对象无效"));
	}

	/**
	 * 设置客户端连接池
	 * 
	 * @param solrClientPool
	 */
	protected void setSolrClientPool(SolrClientPool solrClientPool) {
		this.solrClientPool = solrClientPool;
	}

	protected void prepareSolrClientPool() throws Exception {
		if (!StringUtils.hasLength(this.getServiceUrl())) {
			throw new Exception("未定义服务地址");
		}

		Map<String, Object> clientParams = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".clientparam", null);
		Map<String, Object> clientPoolParams = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".clientpool", null);

		GenericObjectPoolConfig<HttpSolrClient> solrClientPoolConfig = new GenericObjectPoolConfig<HttpSolrClient>();
		if (clientPoolParams != null) {
			EntityUtils.copyTo(clientPoolParams, solrClientPoolConfig);
		}

		SolrClientPool solrClientPool = new SolrClientPool(new SolrClientFactory(this.getSysBDSchemeRuntimeContext(), clientParams), new GenericObjectPoolConfig<HttpSolrClient>());
		this.setSolrClientPool(solrClientPool);
	}
	
	protected void closeSolrClientPool() throws Exception {
		SolrClientPool esClientPool = this.getSolrClientPool(true);
		if(esClientPool != null) {
			esClientPool.close();
			this.setSolrClientPool(null);
		}
		
	}

	@Override
	protected Object onInsert(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {

		strTableName = strTableName.toLowerCase();

		String strId = null;
		Object objId = arg.get(UNIQUEKEY);
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

		HttpSolrClient httpSolrClient = null;
		try {
			httpSolrClient = this.getSolrClientPool().borrowObject();

			SolrDocument doc = httpSolrClient.getById(strTableName, strId);
			if (doc != null) {
				throw new Exception("数据标识已存在");
			}

			SolrInputDocument document = new SolrInputDocument();
			if (arg != null) {
				addDocumentFields(document, arg);
			}

			if (extParamMap != null) {
				addDocumentFields(document, extParamMap);
			}

			document.setField(UNIQUEKEY, getFieldValue(strId));
			httpSolrClient.add(strTableName, document);
			httpSolrClient.commit(strTableName);

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("建立数据发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpSolrClient != null) {
				this.getSolrClientPool().returnObject(httpSolrClient);
			}
		}

		return objId;
	}

	protected void addDocumentFields(SolrInputDocument document, Map<String, Object> map) throws Throwable {
		for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
			if (Entity.KEY.equals(entry.getKey())) {
				continue;
			}
			document.setField(entry.getKey(), getFieldValue(entry.getValue()));
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
		}

		return objValue;
	}

	@Override
	protected Object onUpdate(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
	
		if(!bAppendMode) {
			throw new Exception("不支持非附加模式");
		}
		strTableName = strTableName.toLowerCase();
		
		String strId = null;
		Object objId = arg.get(UNIQUEKEY);
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

		HttpSolrClient httpSolrClient = null;
		try {
			httpSolrClient = this.getSolrClientPool().borrowObject();
			
			SolrDocument doc = httpSolrClient.getById(strTableName, strId);
			if(doc == null) {
				throw new Exception("数据不存在");
			}
			Map<String, Object> last = new HashMap<String, Object>();
			doc.toMap(last);
			
			SolrInputDocument document = new SolrInputDocument();
			
			addDocumentFields(document, last);
			
			
			
			if (arg != null) {
				addDocumentFields(document, arg);
			}

			if (extParamMap != null) {
				addDocumentFields(document, extParamMap);
			}
			document.setField(UNIQUEKEY, getFieldValue(strId));
			

			httpSolrClient.add(strTableName, document);
			httpSolrClient.commit(strTableName);

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("更新数据发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpSolrClient != null) {
				this.getSolrClientPool().returnObject(httpSolrClient);
			}
		}

		return 1;

	}

	@Override
	protected Object onDelete(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		
		strTableName = strTableName.toLowerCase();
		
		String strId = null;
		Object objId = arg.get(UNIQUEKEY);
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
		
		HttpSolrClient httpSolrClient = null;
		try {
			httpSolrClient = this.getSolrClientPool().borrowObject();
			httpSolrClient.deleteById(strTableName, strId);
			httpSolrClient.commit(strTableName);

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("删除数据发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpSolrClient != null) {
				this.getSolrClientPool().returnObject(httpSolrClient);
			}
		}

		return 1;
	}

	@Override
	protected List onQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {

		String strTableName = iDataEntityRuntime.getTableName();
		if (ObjectUtils.isEmpty(strTableName)) {
			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
		}

		strTableName = strTableName.toLowerCase();

		SolrQuery solrQuery = new SolrQuery();

		solrQuery.setQuery("*:*");

		List<String> filterQueryList = new ArrayList<String>();

		// 构建查询条件
		if (iSearchContext != null) {
			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
			if (searchConds != null) {
				for (ISearchCond item : searchConds) {
					String strExpression = this.getExpression(item, iSearchContext, iDataEntityRuntime);
					if (!StringUtils.hasLength(strExpression)) {
						continue;
					}

					if (item instanceof ISearchGroupCond) {
						ISearchGroupCond iSearchGroupCond = (ISearchGroupCond) item;
						if (ISearchGroupCond.CAT_QUERY.equals(iSearchGroupCond.getCat())) {
							// 快速查询，放入query
							solrQuery.setQuery(strExpression);
							continue;
						}
					}
					filterQueryList.add(strExpression);
				}
			}
		}

		if (iDataEntityRuntime.isEnableLogicValid()) {
			String strExpression = this.getExpression(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
			if (StringUtils.hasLength(strExpression)) {
				filterQueryList.add(strExpression);
			}
		}

		// 附加数据查询条件
		if (iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition() != null) {
			String strExpression = this.getExpression(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext == null ? null : iSearchContext.any(), iDataEntityRuntime);
			if (StringUtils.hasLength(strExpression)) {
				filterQueryList.add(strExpression);
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
			solrQuery.setFilterQueries(filterQueryList.toArray(new String[filterQueryList.size()]));
		}

		// 设置查询属性
		solrQuery.setFields(fieldList.toArray(new String[fieldList.size()]));

		HttpSolrClient httpSolrClient = null;
		try {
			httpSolrClient = this.getSolrClientPool().borrowObject();
			QueryResponse resp = httpSolrClient.query(strTableName, solrQuery);

			SolrDocumentList results = resp.getResults();
			if (results.getNumFound() > 0) {
				List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
				for (SolrDocument doc : results) {
					Map<String, Object> map = new HashMap<String, Object>();
					doc.toMap(map);
					list.add(map);
				}
				return list;
			}

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("查询数据发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpSolrClient != null) {
				this.getSolrClientPool().returnObject(httpSolrClient);
			}
		}

		return null;
	}

	@Override
	protected Page onFetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {

		String strTableName = iDataEntityRuntime.getTableName();
		if (ObjectUtils.isEmpty(strTableName)) {
			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
		}

		SolrQuery solrQuery = new SolrQuery();
		solrQuery.setQuery("*:*");

		List<String> filterQueryList = new ArrayList<String>();

		int nSkip = 0;
		int nLimit = ISearchContext.DEFAULTPAGESIZE;
		// 构建查询条件

		if (iSearchContext != null) {
			// 处理排序
			if (iSearchContext.getPageSort() != null && iSearchContext.getPageSort().isSorted()) {
				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
				while (orders.hasNext()) {
					Sort.Order order = orders.next();
					solrQuery.setSort(order.getProperty(), order.isAscending() ? ORDER.asc : ORDER.desc);
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
					String strExpression = this.getExpression(item, iSearchContext, iDataEntityRuntime);
					if (!StringUtils.hasLength(strExpression)) {
						continue;
					}

					if (item instanceof ISearchGroupCond) {
						ISearchGroupCond iSearchGroupCond = (ISearchGroupCond) item;
						if (ISearchGroupCond.CAT_QUERY.equals(iSearchGroupCond.getCat())) {
							// 快速查询，放入query
							solrQuery.setQuery(strExpression);
							continue;
						}
					}

					filterQueryList.add(strExpression);
				}
			}
		}

		if (iDataEntityRuntime.isEnableLogicValid()) {
			String strExpression = this.getExpression(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
			if (StringUtils.hasLength(strExpression)) {
				filterQueryList.add(strExpression);
			}
		}

		java.util.List<IPSDEField> selectedPSDEFieldList = null;
		// 附加数据集条件 （OR）
		List<IPSDEDataQuery> psDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
		if (!ObjectUtils.isEmpty(psDEDataQueryList)) {

			java.util.List<String> orlist = new java.util.ArrayList<String>();
			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
				if (selectedPSDEFieldList == null) {
					selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
				}

				if (iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition() != null) {
					String strExpression = this.getExpression(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext == null ? null : iSearchContext.any(), iDataEntityRuntime);
					if (StringUtils.hasLength(strExpression)) {
						orlist.add(strExpression);
					}
				}
			}

			if (!ObjectUtils.isEmpty(orlist)) {
				filterQueryList.add(this.getGroupExpression(Conditions.OR, orlist));
			}
		}

		if (filterQueryList.size() > 0) {
			solrQuery.setFilterQueries(filterQueryList.toArray(new String[filterQueryList.size()]));
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
		solrQuery.setFields(fieldList.toArray(new String[fieldList.size()]));

		// 设置分页信息
		solrQuery.setStart(nSkip);
		solrQuery.setRows(nLimit);

		HttpSolrClient httpSolrClient = null;
		try {
			httpSolrClient = this.getSolrClientPool().borrowObject();
			QueryResponse resp = httpSolrClient.query(strTableName.toLowerCase(), solrQuery);

			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

			SolrDocumentList results = resp.getResults();
			if (results.getNumFound() > 0) {
				for (SolrDocument doc : results) {
					Map<String, Object> map = new HashMap<String, Object>();
					doc.toMap(map);
					list.add(map);
				}
			}

			long nTotal = (list == null) ? 0 : list.size();
			if (iSearchContext.isCount()) {
				if (nTotal >= nLimit) {
					nTotal = nSkip + nLimit * 2;
				} else {
					nTotal += nSkip;
				}
			} else {
				nTotal += nSkip;
			}

			return new PageImpl(list, (iSearchContext != null) ? iSearchContext.getPageable() : Pageable.unpaged(), nTotal);

		} catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("查询结果集发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			if (httpSolrClient != null) {
				this.getSolrClientPool().returnObject(httpSolrClient);
			}
		}
	}

	protected String getExpression(IPSDEDQCondition iPSDEDQCondition, Map<String, Object> params, IDataEntityRuntime iDataEntityRuntime) throws Throwable {

		if (iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
			List<String> expressionList = new ArrayList<String>();
			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition) iPSDEDQCondition;
			List<IPSDEDQCondition> psDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
			if (psDEDQConditions != null) {
				for (IPSDEDQCondition item : psDEDQConditions) {
					String strExpression = this.getExpression(item, params, iDataEntityRuntime);
					if (StringUtils.hasLength(strExpression)) {
						expressionList.add(strExpression);
					}
				}
			}

			if (expressionList.size() > 0) {
				String strGroupExpression = this.getGroupExpression(iPSDEDQGroupCondition.getCondOp(), expressionList);
				if (!StringUtils.hasLength(strGroupExpression)) {
					return null;
				}

				if (iPSDEDQGroupCondition.isNotMode()) {
					return String.format("NOT%1$s", strGroupExpression);
				} else {
					return strGroupExpression;
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
				return getExpression(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
			} else {
				Object objValue = iPSDEDQFieldCondition.getCondValue();
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(iPSDEDQFieldCondition.getFieldName(), true);
				if (iPSDEField != null) {
					objValue = iDataEntityRuntime.convertValue(iPSDEField.getStdDataType(), (String) objValue);
				}
				return getExpression(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
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
			// return getExpression(iSearchFieldCond.getFieldName(),
			// iSearchFieldCond.getCondOp(), objValue);
		}

		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iPSDEDQCondition.getCondType()));

	}

	protected String getExpression(ISearchCond iSearchCond, ISearchContext iSearchContext, IDataEntityRuntime iDataEntityRuntime) throws Throwable {

		if (iSearchCond instanceof ISearchGroupCond) {
			List<String> expressionList = new ArrayList<String>();
			ISearchGroupCond iSearchGroupCond = (ISearchGroupCond) iSearchCond;
			List<ISearchCond> searchConds = iSearchGroupCond.getSearchConds();
			if (searchConds != null) {
				for (ISearchCond item : searchConds) {
					String strExpression = this.getExpression(item, iSearchContext, iDataEntityRuntime);
					if (StringUtils.hasLength(strExpression)) {
						expressionList.add(strExpression);
					}
				}
			}

			if (expressionList.size() > 0) {
				String strGroupExpression = this.getGroupExpression(iSearchGroupCond.getCondOp(), expressionList);
				if (!StringUtils.hasLength(strGroupExpression)) {
					return null;
				}

				if (iSearchGroupCond.isNotMode()) {
					return String.format("NOT%1$s", strGroupExpression);
				} else {
					return strGroupExpression;
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

			return getExpression(iSearchFieldCond.getFieldName(), iSearchFieldCond.getCondOp(), objValue, iDataEntityRuntime);
		}

		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iSearchCond.getCondType()));
	}

	protected String getExpression(String strFieldName, String strCondition, Object objValue, IDataEntityRuntime iDataEntityRuntime) throws Throwable {

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
			// return com.mongodb.client.model.Filters.eq(strFieldName,
			// objValue);
			if (ObjectUtils.isEmpty(objValue)) {
				return String.format("%1$s:\"\"", strFieldName);
			} else {
				return String.format("%1$s:\"%2$s\"", strFieldName, getCondValue(objValue.toString()));
			}
		}

		// if (Conditions.GT.equals(strCondition)) {
		// return com.mongodb.client.model.Filters.gt(strFieldName, objValue);
		// }
		//
		// if (Conditions.GTANDEQ.equals(strCondition)) {
		// return com.mongodb.client.model.Filters.gte(strFieldName, objValue);
		// }
		//
		// if (Conditions.LT.equals(strCondition)) {
		// return com.mongodb.client.model.Filters.lt(strFieldName, objValue);
		// }
		//
		// if (Conditions.LTANDEQ.equals(strCondition)) {
		// return com.mongodb.client.model.Filters.lte(strFieldName, objValue);
		// }
		//
		// if (Conditions.NOTEQ.equals(strCondition)) {
		// return com.mongodb.client.model.Filters.ne(strFieldName, objValue);
		// }
		//
		// if (Conditions.ISNULL.equals(strCondition)) {
		// return com.mongodb.client.model.Filters.eq(strFieldName, null);
		// }
		//
		// if (Conditions.ISNOTNULL.equals(strCondition)) {
		// return com.mongodb.client.model.Filters.ne(strFieldName, null);
		// }

		if (Conditions.LIKE.equals(strCondition)) {
			if (ObjectUtils.isEmpty(objValue)) {
				return String.format("%1$s:\"\"", strFieldName);
			} else {
				return String.format("%1$s:\"%2$s\"", strFieldName, getCondValue(objValue.toString()));
			}
		}

		if (Conditions.LEFTLIKE.equals(strCondition)) {
			if (ObjectUtils.isEmpty(objValue)) {
				return String.format("%1$s:\"\"", strFieldName);
			} else {
				return String.format("%1$s:\"%2$s\"", strFieldName, getCondValue(objValue.toString()));
			}
		}

		if (Conditions.RIGHTLIKE.equals(strCondition)) {
			if (ObjectUtils.isEmpty(objValue)) {
				return String.format("%1$s:\"\"", strFieldName);
			} else {
				return String.format("%1$s:\"%2$s\"", strFieldName, getCondValue(objValue.toString()));
			}
		}

		throw new Exception(String.format("未支持的条件操作[%1$s]", strCondition));
	}

	protected String getGroupExpression(String strCondition, List<String> expressionList) throws Throwable {
		StringBuilder sb = new StringBuilder();
		boolean bFirst = true;
		for (String strExpression : expressionList) {
			if (!StringUtils.hasLength(strExpression)) {
				continue;
			}

			if (bFirst) {
				bFirst = false;
			} else {
				sb.append(String.format(" %1$s ", strCondition.toUpperCase()));
			}
			sb.append(strExpression);
		}

		if (bFirst) {
			return null;
		}

		return String.format("(%1$s)", sb.toString());
	}

	protected String getAutoId() {
		return String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS%2$s", new Date(), KeyValueUtils.genUniqueId());
	}

	protected String getCondValue(String strValue) {
		// + - && || ! ( ) { } [ ] ^ " ~ * ? : "
		return strValue.replace("+", "\\+").replace("-", "\\-").replace("&&", "\\&&").replace("||", "\\||").replace("!", "\\!").replace("(", "\\(").replace(")", "\\)").replace("{", "\\{").replace("}", "\\}").replace("[", "\\[").replace("]", "\\]").replace("^", "\\^").replace("\"", "\\\"").replace("~", "\\~").replace("*", "\\*").replace("?", "\\?").replace(":", "\\:").replace("\\", "\\\\");
	}

	protected void onShutdown() throws Exception{
		try {
			this.closeSolrClientPool();
		}
		catch (Exception ex) {
			log.error(String.format("关闭连接池对象发生异常，%1$s", ex.getMessage()), ex);
		}
		super.onShutdown();
	}
}
