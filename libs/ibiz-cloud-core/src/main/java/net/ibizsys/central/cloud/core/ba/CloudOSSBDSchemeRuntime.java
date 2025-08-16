package net.ibizsys.central.cloud.core.ba;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ba.SysBDSchemeRuntime;
import net.ibizsys.central.ba.SysBDSchemeRuntimeException;
import net.ibizsys.central.cloud.core.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.SearchFieldCond;
import net.ibizsys.runtime.util.SearchGroupCond;

/**
 * Cloud对象存储服务数据库运行时对象
 * @author lionlau
 *
 */
public class CloudOSSBDSchemeRuntime extends SysBDSchemeRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(CloudOSSBDSchemeRuntime.class);
	
	public final static String BDTYPE_CLOUDOSS = "CLOUDOSS";
	
	
	private ISysOSSUtilRuntime iSysOSSUtilRuntime = null;
	
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		if(getSysOSSUtilRuntime(true) == null) {
			prepareSysOSSUtilRuntime();
		}
	}
	
	public ISysOSSUtilRuntime getSysOSSUtilRuntime() {
		return this.getSysOSSUtilRuntime(false);
	}
	
	public ISysOSSUtilRuntime getSysOSSUtilRuntime(boolean bTryMode) {
		if(this.iSysOSSUtilRuntime != null || bTryMode) {
			return this.iSysOSSUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("Mongo系统OSS功能对象对象无效"));
	}
	
	/**
	 * 设置系统OSS功能对象对象
	 * @param iSysOSSUtilRuntime
	 */
	protected void setSysOSSUtilRuntime(ISysOSSUtilRuntime iSysOSSUtilRuntime) {
		this.iSysOSSUtilRuntime = iSysOSSUtilRuntime;
	}
	
	protected void prepareSysOSSUtilRuntime() throws Exception{
		
		ISysOSSUtilRuntime iSysOSSUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysOSSUtilRuntime.class, false);
		this.setSysOSSUtilRuntime(iSysOSSUtilRuntime);
	}
	
	protected void closeSysOSSUtilRuntime() throws Exception{
//		SysOSSUtilRuntime iSysOSSUtilRuntime = this.getSysOSSUtilRuntime(true);
//		if(iSysOSSUtilRuntime != null) {
//			iSysOSSUtilRuntime.close();
//			this.setSysOSSUtilRuntime(null);
//		}
	}
	
	
	
	public String getDBName() {
		return this.getSystemRuntime().getServiceId();
	}
	
	
	@Override
	protected Object onInsert(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		String strId = null;
		Object objId = arg.get(ISysOSSUtilRuntime.OBJECT_UNIQUEKEY);
		if(objId instanceof String) {
			strId = (String)objId;
		}
		if(!StringUtils.hasLength(strId)) {
			objId = arg.get(Entity.KEY);
			if(objId instanceof String) {
				strId = (String)objId;
			}
		}
		if(!StringUtils.hasLength(strId)) {
			strId = getAutoId();
		}
		
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.putAll(arg);
		if(extParamMap != null) {
			data.putAll(extParamMap);
		}

		
		data.put(ISysOSSUtilRuntime.OBJECT_UNIQUEKEY, strId);
		
		String _id2 = null;
		try {
			_id2 = this.getSysOSSUtilRuntime().createObject(this.getDBName(), strTableName, data);
		}
		catch (Throwable ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("建立数据发生异常，%1$s", ex.getMessage()), ex);
		}
		
		if (!strId.equals(_id2)) {
			throw new SysBDSchemeRuntimeException(this, "建立数据失败");
		}
		
		return _id2;
	}
	
	
	@Override
	protected Object onUpdate(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		String strId = null;
		Object objId = arg.get(ISysOSSUtilRuntime.OBJECT_UNIQUEKEY);
		if(objId instanceof String) {
			strId = (String)objId;
		}
		if(!StringUtils.hasLength(strId)) {
			objId = arg.get(Entity.KEY);
			if(objId instanceof String) {
				strId = (String)objId;
			}
		}
		
		if(!StringUtils.hasLength(strId)) {
			throw new SysBDSchemeRuntimeException(this, "更新数据未指定键值");
		}

		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.putAll(arg);
		if(extParamMap!=null) {
			data.putAll(extParamMap);
		}
		
		data.put(ISysOSSUtilRuntime.OBJECT_UNIQUEKEY, strId);
		
		try {
			if(this.getSysOSSUtilRuntime().updateObject(this.getDBName(), strTableName, data, bAppendMode)!=1) {
				throw new SysBDSchemeRuntimeException(this, "数据不存在");
			}
			return 1;
		}
		catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("更新数据发生异常，%1$s", ex.getMessage()), ex);
		}
		
	}
	
	@Override
	protected Object onDelete(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		String strId = null;
		Object objId = arg.get(ISysOSSUtilRuntime.OBJECT_UNIQUEKEY);
		if(objId instanceof String) {
			strId = (String)objId;
		}
		if(!StringUtils.hasLength(strId)) {
			objId = arg.get(Entity.KEY);
			if(objId instanceof String) {
				strId = (String)objId;
			}
		}
		
		if(!StringUtils.hasLength(strId)) {
			throw new SysBDSchemeRuntimeException(this, "删除数据未指定键值");
		}
		
		
		try {
			if(this.getSysOSSUtilRuntime().deleteObject(this.getDBName(), strTableName, strId)!=1) {
				throw new SysBDSchemeRuntimeException(this, "数据不存在");
			}
			return 1;
		}
		catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("删除数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
//	@Override
//	protected List onQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
//		
//		String strTableName = iDataEntityRuntime.getTableName();
//		if(ObjectUtils.isEmpty(strTableName)) {
//			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
//		}
//
//		Document sortInfo = null;
//		int nSkip = 0;
//		int nLimit = Integer.MAX_VALUE;
//		
//		//构建查询条件
//		java.util.List<org.bson.conversions.Bson> andlist = new java.util.ArrayList<org.bson.conversions.Bson>();
//		if(iSearchContext != null) {
//			
//			//处理排序
//			if(iSearchContext.getPageSort()!=null && iSearchContext.getPageSort().isSorted()) {
//				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
//				while (orders.hasNext()) {
//					Sort.Order order = orders.next();
//					sortInfo = new Document(order.getProperty(),order.isAscending()?1:-1);
//					break;
//				}
//			}
//			
//			if(iSearchContext.getPageable() != null && iSearchContext.getPageable().isPaged()) {
//				nLimit = iSearchContext.getPageable().getPageSize();
//				nSkip = (iSearchContext.getPageable().getPageNumber() - ISearchContext.STARTPAGE) * nLimit;
//			}
//			
//			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
//			if(searchConds != null) {
//				for (ISearchCond item : searchConds) {
//					org.bson.conversions.Bson bson = this.getBson(item, iSearchContext, iDataEntityRuntime);
//					if (bson != null) {
//						andlist.add(bson);
//					}
//				}
//			}
//		}
//		if(iDataEntityRuntime.isEnableLogicValid()) {
//			org.bson.conversions.Bson bson = this.getBson(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
//			if (bson != null) {
//				andlist.add(bson);
//			}
//		}
//		
//		//附加数据查询条件
//		if(iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition()!=null) {
//			org.bson.conversions.Bson bson = this.getBson(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext==null?null:iSearchContext.any(), iDataEntityRuntime);
//			if (bson != null) {
//				andlist.add(bson);
//			}
//		}
//		
//		if(sortInfo == null) {
//			sortInfo = new Document(UNIQUEKEY, -1);
//		}
//		
//		java.util.List<IPSDEField> selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
//		List<String> fieldList = new ArrayList<String>();
//		fieldList.add(UNIQUEKEY);
//		if(selectedPSDEFieldList != null) {
//			selectedPSDEFieldList.forEach(t -> {
//				fieldList.add(t.getLowerCaseName());
//			});
//		}
//		
//		MongoDatabase db = this.getMongoDatabase();
//		MongoCollection<Document> collection = db.getCollection(strTableName.toLowerCase());
//		
//		
//	
//		FindIterable<Document> documents = null;
//		try {
//			if (andlist.size() > 0) {
//				documents = collection.find(com.mongodb.client.model.Filters.and(andlist)).projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
//			} else {
//				documents = collection.find().projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
//			}
//		}
//		catch (Throwable ex) {
//			throw new SysBDSchemeRuntimeException(this, String.format("查询数据发生异常，%1$s", ex.getMessage()), ex);
//		}
//
//		if (documents != null) {
//			java.util.Iterator<Document> it = documents.iterator();
//			if (it != null) {
//				List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
//				while (it.hasNext()) {
//					Document doc = it.next();
//					Map<String, Object> map = new HashMap<String, Object>();
//					map.putAll(doc);
//					list.add(map);
//				}
//				return list;
//			}
//		}
//		return null;
//	}
//	
//	
//	@Override
//	protected Page onQuery2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
//		
//		String strTableName = iDataEntityRuntime.getTableName();
//		if(ObjectUtils.isEmpty(strTableName)) {
//			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
//		}
//
//		Document sortInfo = null;
//		int nSkip = 0;
//		int nLimit = Integer.MAX_VALUE;
//		
//		//构建查询条件
//		java.util.List<org.bson.conversions.Bson> andlist = new java.util.ArrayList<org.bson.conversions.Bson>();
//		if(iSearchContext != null) {
//			
//			//处理排序
//			if(iSearchContext.getPageSort()!=null && iSearchContext.getPageSort().isSorted()) {
//				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
//				while (orders.hasNext()) {
//					Sort.Order order = orders.next();
//					sortInfo = new Document(order.getProperty(),order.isAscending()?1:-1);
//					break;
//				}
//			}
//			
//			if(iSearchContext.getPageable() != null && iSearchContext.getPageable().isPaged()) {
//				nLimit = iSearchContext.getPageable().getPageSize();
//				nSkip = (iSearchContext.getPageable().getPageNumber() - ISearchContext.STARTPAGE) * nLimit;
//			}
//			
//			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
//			if(searchConds != null) {
//				for (ISearchCond item : searchConds) {
//					org.bson.conversions.Bson bson = this.getBson(item, iSearchContext, iDataEntityRuntime);
//					if (bson != null) {
//						andlist.add(bson);
//					}
//				}
//			}
//		}
//		if(iDataEntityRuntime.isEnableLogicValid()) {
//			org.bson.conversions.Bson bson = this.getBson(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
//			if (bson != null) {
//				andlist.add(bson);
//			}
//		}
//		
//		//附加数据查询条件
//		if(iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition()!=null) {
//			org.bson.conversions.Bson bson = this.getBson(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext==null?null:iSearchContext.any(), iDataEntityRuntime);
//			if (bson != null) {
//				andlist.add(bson);
//			}
//		}
//		
//		if(sortInfo == null) {
//			sortInfo = new Document(UNIQUEKEY, -1);
//		}
//		
//		java.util.List<IPSDEField> selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
//		List<String> fieldList = new ArrayList<String>();
//		fieldList.add(UNIQUEKEY);
//		if(selectedPSDEFieldList != null) {
//			selectedPSDEFieldList.forEach(t -> {
//				fieldList.add(t.getLowerCaseName());
//			});
//		}
//		
//		MongoDatabase db = this.getMongoDatabase();
//		MongoCollection<Document> collection = db.getCollection(strTableName.toLowerCase());
//		
//		
//	
//		FindIterable<Document> documents = null;
//		try {
//			if (andlist.size() > 0) {
//				documents = collection.find(com.mongodb.client.model.Filters.and(andlist)).projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
//			} else {
//				documents = collection.find().projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
//			}
//			
//		}
//		catch (Throwable ex) {
//			throw new SysBDSchemeRuntimeException(this, String.format("查询数据发生异常，%1$s", ex.getMessage()), ex);
//		}
//
//		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
//		if (documents != null) {
//			java.util.Iterator<Document> it = documents.iterator();
//			if (it != null) {
//				while (it.hasNext()) {
//					Document doc = it.next();
//					Map<String, Object> map = new HashMap<String, Object>();
//					map.putAll(doc);
//					list.add(map);
//				}
//			}
//		}
//		
//		long nTotal = ((list == null)?0:list.size());
//		if(iSearchContext.isCount()) {
//			if(nTotal >= nLimit) {
//				if (andlist.size() > 0) {
//					nTotal = collection.countDocuments(com.mongodb.client.model.Filters.and(andlist));
//				} else {
//					nTotal = collection.countDocuments();
//				}
//			}
//			else {
//				nTotal += nSkip;
//			}
//		}
//		else {
//			nTotal += nSkip;
//		}
//
//		return new PageImpl(list, (iSearchContext!=null)?iSearchContext.getPageable():Pageable.unpaged(), nTotal);
//		
//	}
	
	
	@Override
	protected Page onFetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		
		String strTableName = iDataEntityRuntime.getTableName();
		if(ObjectUtils.isEmpty(strTableName)) {
			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
		}

		if(iDataEntityRuntime.isEnableLogicValid()) {
			SearchFieldCond searchFieldCond = new SearchFieldCond();
			searchFieldCond.setParamMode(false);
			searchFieldCond.setFieldName(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName());
			searchFieldCond.setCondOp(Conditions.EQ);
			searchFieldCond.setValue(iDataEntityRuntime.getValidLogicValue());
			iSearchContext.getSearchCondsIf().add(searchFieldCond);
		}
		
		java.util.List<IPSDEField> selectedPSDEFieldList = null;
		//附加数据集条件 （OR）
		List<IPSDEDataQuery> psDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
		if(!ObjectUtils.isEmpty(psDEDataQueryList)) {
			
			java.util.List<ISearchCond> orlist = new java.util.ArrayList<ISearchCond>();
			for(IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
				if(selectedPSDEFieldList == null) {
					selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
				}
				
				if(iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition()!=null) {
					ISearchCond iSearchCond = this.getSearchCond(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext==null?null:iSearchContext.any(), iDataEntityRuntime);
					if (iSearchCond != null) {
						orlist.add(iSearchCond);
					}
				}
			}
			
			if(!ObjectUtils.isEmpty(orlist)) {
				SearchGroupCond searchGroupCond = new SearchGroupCond();
				searchGroupCond.setCondOp(Conditions.AND);
				searchGroupCond.getSearchCondsIf().addAll(orlist);
			}
		}
		
		if(selectedPSDEFieldList == null) {
			selectedPSDEFieldList = iDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
		}
		
		List<String> fieldList = new ArrayList<String>();
		fieldList.add(ISysOSSUtilRuntime.OBJECT_UNIQUEKEY);
		if(selectedPSDEFieldList != null) {
			selectedPSDEFieldList.forEach(t -> {
				fieldList.add(t.getLowerCaseName());
			});
		}
		
		iSearchContext.set("fields", fieldList);
		
		try {
			return this.getSysOSSUtilRuntime().fetchObjects(this.getDBName(), strTableName, iSearchContext);
		}
		catch (Throwable ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("获取结果集发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	@Override
	protected List onQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		String strTableName = iDataEntityRuntime.getTableName();
		if(ObjectUtils.isEmpty(strTableName)) {
			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
		}

		if(iDataEntityRuntime.isEnableLogicValid()) {
			SearchFieldCond searchFieldCond = new SearchFieldCond();
			searchFieldCond.setParamMode(false);
			searchFieldCond.setFieldName(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName());
			searchFieldCond.setCondOp(Conditions.EQ);
			searchFieldCond.setValue(iDataEntityRuntime.getValidLogicValue());
			iSearchContext.getSearchCondsIf().add(searchFieldCond);
		}
		
		java.util.List<IPSDEField> selectedPSDEFieldList = null;
		
		if(selectedPSDEFieldList == null) {
			selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
		}
		
		if(iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition()!=null) {
			ISearchCond iSearchCond = this.getSearchCond(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext==null?null:iSearchContext.any(), iDataEntityRuntime);
			if (iSearchCond != null) {
				iSearchContext.getSearchCondsIf().add(iSearchCond);
			}
		}
		
		if(selectedPSDEFieldList == null) {
			selectedPSDEFieldList = iDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
		}
		
		List<String> fieldList = new ArrayList<String>();
		fieldList.add(ISysOSSUtilRuntime.OBJECT_UNIQUEKEY);
		if(selectedPSDEFieldList != null) {
			selectedPSDEFieldList.forEach(t -> {
				fieldList.add(t.getLowerCaseName());
			});
		}
		
		iSearchContext.set("fields", fieldList);
		
		try {
			Page page = this.getSysOSSUtilRuntime().fetchObjects(this.getDBName(), strTableName, iSearchContext);
			return page.getContent();
		}
		catch (Throwable ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("获取数据查询发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
//	@Override
//	protected Page onFetch(String strTableName, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
//		
//		Document sortInfo = null;
//		int nSkip = 0;
//		int nLimit = ISearchContext.DEFAULTPAGESIZE;
//		//构建查询条件
//		java.util.List<org.bson.conversions.Bson> andlist = new java.util.ArrayList<org.bson.conversions.Bson>();
//		if(iSearchContext != null) {
//			//处理排序
//			if(iSearchContext.getPageSort()!=null && iSearchContext.getPageSort().isSorted()) {
//				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
//				while (orders.hasNext()) {
//					Sort.Order order = orders.next();
//					sortInfo = new Document(order.getProperty(),order.isAscending()?1:-1);
//					break;
//				}
//			}
//			
//			if(iSearchContext.getPageable() != null && iSearchContext.getPageable().isPaged()) {
//				nLimit = iSearchContext.getPageable().getPageSize();
//				nSkip = (iSearchContext.getPageable().getPageNumber() - ISearchContext.STARTPAGE) * nLimit;
//			}
//			
//
//			//处理条件
//			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
//			if(searchConds != null) {
//				for (ISearchCond item : searchConds) {
//					org.bson.conversions.Bson bson = this.getBson(item, iSearchContext);
//					if (bson != null) {
//						andlist.add(bson);
//					}
//				}
//			}
//		}
//		
//		
//		java.util.List<IPSDEField> selectedPSDEFieldList = null;
//		
//		
//		if(sortInfo == null) {
//			sortInfo = new Document(UNIQUEKEY, -1);
//		}
//		
//		
//		List<String> fieldList = new ArrayList<String>();
//		fieldList.add(UNIQUEKEY);
////		if(selectedPSDEFieldList != null) {
////			selectedPSDEFieldList.forEach(t -> {
////				fieldList.add(t.getLowerCaseName());
////			});
////		}
//		
//		
//		MongoDatabase db = this.getMongoDatabase();
//		MongoCollection<Document> collection = db.getCollection(strTableName.toLowerCase());
//		
//	
//		FindIterable<Document> documents = null;
//		try {
//			if (andlist.size() > 0) {
//				documents = collection.find(com.mongodb.client.model.Filters.and(andlist)).skip(nSkip).sort(sortInfo).limit(nLimit);
//			} else {
//				documents = collection.find().skip(nSkip).sort(sortInfo).limit(nLimit);
//			}
//		}
//		catch (Throwable ex) {
//			throw new SysBDSchemeRuntimeException(this, String.format("获取数据发生异常，%1$s", ex.getMessage()), ex);
//		}
//		
//		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
//		if (documents != null) {
//			java.util.Iterator<Document> it = documents.iterator();
//			if (it != null) {
//				
//				while (it.hasNext()) {
//					Document doc = it.next();
//					Map<String, Object> map = new HashMap<String, Object>();
//					map.putAll(doc);
//					list.add(map);
//				}
//			}
//		}
//		
//		long nTotal = ((list == null)?0:list.size());
//		if(iSearchContext.isCount()) {
//			if(nTotal >= nLimit) {
//				if (andlist.size() > 0) {
//					nTotal = collection.countDocuments(com.mongodb.client.model.Filters.and(andlist));
//				} else {
//					nTotal = collection.countDocuments();
//				}
//			}
//			else {
//				nTotal += nSkip;
//			}
//		}
//		else {
//			nTotal += nSkip;
//		}
//
//		return new PageImpl(list, (iSearchContext!=null)?iSearchContext.getPageable():Pageable.unpaged(), nTotal);
//	}
	
	
	
	protected ISearchCond getSearchCond(IPSDEDQCondition iPSDEDQCondition, Map<String, Object> params, IDataEntityRuntime iDataEntityRuntime) throws Throwable{
		
		if (iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
			List<ISearchCond> list = new ArrayList<ISearchCond>();
			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition) iPSDEDQCondition;
			List<IPSDEDQCondition> psDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
			if(psDEDQConditions != null) {
				for (IPSDEDQCondition item : psDEDQConditions) {
					ISearchCond iSearchCond = this.getSearchCond(item, params, iDataEntityRuntime);
					if (iSearchCond != null) {
						list.add(iSearchCond);
					}
				}
			}
			
			if (list.size() > 0) {
				SearchGroupCond searchGroupCond = new SearchGroupCond();
				if (iPSDEDQGroupCondition.isNotMode()) {
					searchGroupCond.setNotMode(true);
				}
				searchGroupCond.setCondOp(iPSDEDQGroupCondition.getCondOp());
				searchGroupCond.getSearchCondsIf().addAll(list);
			} else {
				return null;
			}
		}

		if (iPSDEDQCondition instanceof IPSDEDQFieldCondition) {
			IPSDEDQFieldCondition iPSDEDQFieldCondition = (IPSDEDQFieldCondition) iPSDEDQCondition;
			String strVarType = iPSDEDQFieldCondition.getPSVARTypeId();
			if(StringUtils.hasLength(strVarType)) {
				Object objValue = null;
				if(StringUtils.hasLength(iPSDEDQFieldCondition.getCondValue())) {
					objValue = params==null?null:params.get(iPSDEDQFieldCondition.getCondValue().toLowerCase());
				}
				return getSearchCond(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
			}
			else {
				Object objValue = iPSDEDQFieldCondition.getCondValue();
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(iPSDEDQFieldCondition.getFieldName(), true);
				if(iPSDEField != null) {
					objValue = iDataEntityRuntime.convertValue(iPSDEField.getStdDataType(), (String)objValue);
				}
				return getSearchCond(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
			}
		}

		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iPSDEDQCondition.getCondType()));
		
	}
	
	
	

	protected ISearchCond getSearchCond(String strFieldName, String strCondition, Object objValue, IDataEntityRuntime iDataEntityRuntime) throws Throwable {

		if (StringUtils.hasLength(strFieldName)) {
			strFieldName = strFieldName.toLowerCase();
			if(iDataEntityRuntime != null) {
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strFieldName, true);
				if(iPSDEField != null) {
					//转化主键属性至MongoDB默认主键
					if(iPSDEField.isKeyDEField()) {
						strFieldName = ISysOSSUtilRuntime.OBJECT_UNIQUEKEY;
					}
				}
			}
		}
		else {
			throw new Exception("未指定属性标识");
		}

		SearchFieldCond searchFieldCond = new SearchFieldCond();
		searchFieldCond.setFieldName(strFieldName);
		searchFieldCond.setParamMode(false);
		searchFieldCond.setCondOp(strCondition);
		searchFieldCond.setValue(objValue);
		
		return searchFieldCond;
	}
	
	
	protected String getAutoId() {
		return String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS%2$s", new Date(), KeyValueUtils.genUniqueId());
	}
	
	protected void onShutdown() throws Exception{
		try {
			this.closeSysOSSUtilRuntime();
		}
		catch (Exception ex) {
			log.error(String.format("关闭系统OSS功能对象对象发生异常，%1$s", ex.getMessage()), ex);
		}
		super.onShutdown();
	}
}
