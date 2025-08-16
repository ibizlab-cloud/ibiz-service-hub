package net.ibizsys.central.plugin.mongodb.ba;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.codecs.BigDecimalCodec;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import net.ibizsys.central.ba.SysBDSchemeRuntime;
import net.ibizsys.central.ba.SysBDSchemeRuntimeException;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.plugin.mongodb.util.codecs.BigIntegerCodec;
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
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * MongoDB数据库运行时对象
 * @author lionlau
 *
 */
public class MongoDBSchemeRuntime extends SysBDSchemeRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MongoDBSchemeRuntime.class);
	
	public final static String BDTYPE_MONGODB = "MONGODB";
	
	public final static String UNIQUEKEY = "_id";
	
	private MongoClient mongoClient = null;
	
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();
		
		if(getMongoClient(true) == null) {
			prepareMongoClient();
		}
	}
	
	public MongoClient getMongoClient() {
		return this.getMongoClient(false);
	}
	
	public MongoClient getMongoClient(boolean bTryMode) {
		if(this.mongoClient != null || bTryMode) {
			return this.mongoClient;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("Mongo客户端对象无效"));
	}
	
	/**
	 * 设置客户端对象
	 * @param mongoClient
	 */
	protected void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}
	
	protected void prepareMongoClient() throws Exception{
		if(!StringUtils.hasLength(this.getServiceUrl())) {
			throw new Exception("未定义数据库地址");
		}
		
		CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
			       CodecRegistries.fromCodecs(new BigDecimalCodec(), new BigIntegerCodec()), 
			       MongoClientSettings.getDefaultCodecRegistry());
		
		MongoClient mongoClient = MongoClients.create(
				MongoClientSettings.builder().codecRegistry(codecRegistry).applyConnectionString(new ConnectionString(this.getServiceUrl())).build());
	
		
		
		this.setMongoClient(mongoClient);
	}
	
	protected void closeMongoClient() throws Exception{
		MongoClient mongoClient = this.getMongoClient(true);
		if(mongoClient != null) {
			mongoClient.close();
			this.setMongoClient(null);
		}
	}
	
	
	public MongoDatabase getMongoDatabase() {
		return getMongoClient().getDatabase(getDBName());
	}

	
	@Override
	protected Object onInsert(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		String strId = null;
		Object objId = arg.get(UNIQUEKEY);
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
		
		MongoDatabase db = this.getMongoDatabase();
		MongoCollection<Document> collection = db.getCollection(this.getRealDBObjName(strTableName));
		Document document = collection.find(com.mongodb.client.model.Filters.eq(UNIQUEKEY, strId)).first();
		if (document != null) {
			throw new SysBDSchemeRuntimeException(this, "", Errors.DUPLICATEKEY);
		}

		// 构建DTO
		document = new Document();
		for(java.util.Map.Entry<String, Object> entry : arg.entrySet()) {
			document.put(getRealDBObjName(entry.getKey()), entry.getValue());
		}
		if(extParamMap!=null) {
			for(java.util.Map.Entry<String, Object> entry : extParamMap.entrySet()) {
				document.put(getRealDBObjName(entry.getKey()), entry.getValue());
			}
		}
		document.remove(getRealDBObjName(UNIQUEKEY));
		document.put(UNIQUEKEY, strId);
		
		String _id2 = null;
		try {
			_id2 = collection.insertOne(document).getInsertedId().asString().getValue();
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
		Object objId = arg.get(UNIQUEKEY);
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
		

		MongoDatabase db = this.getMongoDatabase();
		MongoCollection<Document> collection = db.getCollection(this.getRealDBObjName(strTableName));
		

		Document document = new Document();
		for(java.util.Map.Entry<String, Object> entry : arg.entrySet()) {
			document.put(getRealDBObjName(entry.getKey()), entry.getValue());
		}
		if(extParamMap!=null) {
			for(java.util.Map.Entry<String, Object> entry : extParamMap.entrySet()) {
				document.put(getRealDBObjName(entry.getKey()), entry.getValue());
			}
		}
		document.remove(getRealDBObjName(UNIQUEKEY));
		document.put(UNIQUEKEY, strId);
		
		try {
			if(!bAppendMode) {
				//先执行移除操作
				collection.findOneAndDelete(com.mongodb.client.model.Filters.eq(UNIQUEKEY, strId));
				String _id2 = collection.insertOne(document).getInsertedId().asString().getValue();
				if (!strId.equals(_id2)) {
					throw new Exception("数据不一致");
				}
			}
			else {
				UpdateResult updateResult = collection.updateOne(Filters.eq(UNIQUEKEY, strId), new Document("$set", document));
				if (updateResult.getMatchedCount() == 0 && updateResult.getModifiedCount() == 0) {
					throw new SysBDSchemeRuntimeException(this, "数据不存在");
				}
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
		Object objId = arg.get(UNIQUEKEY);
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
		

		MongoDatabase db = this.getMongoDatabase();
		MongoCollection<Document> collection = db.getCollection(this.getRealDBObjName(strTableName));
		
		try {
			DeleteResult deleteResult = collection.deleteOne(com.mongodb.client.model.Filters.eq(UNIQUEKEY, strId));
			if (deleteResult.getDeletedCount() == 0) {
				throw new Exception("数据不存在");
			}
		}
		catch (Exception ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("删除数据发生异常，%1$s", ex.getMessage()), ex);
		}
		
		return 1;
	}
	
	
	@Override
	protected List onQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		
		String strTableName = iDataEntityRuntime.getTableName();
		if(ObjectUtils.isEmpty(strTableName)) {
			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
		}

		Document sortInfo = null;
		int nSkip = 0;
		int nLimit = Integer.MAX_VALUE;
		
		//构建查询条件
		java.util.List<org.bson.conversions.Bson> andlist = new java.util.ArrayList<org.bson.conversions.Bson>();
		if(iSearchContext != null) {
			
			//处理排序
			if(iSearchContext.getPageSort()!=null && iSearchContext.getPageSort().isSorted()) {
				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
				while (orders.hasNext()) {
					Sort.Order order = orders.next();
					sortInfo = new Document(getRealDBObjName(order.getProperty()),order.isAscending()?1:-1);
					break;
				}
			}
			
			if(iSearchContext.getPageable() != null && iSearchContext.getPageable().isPaged()) {
				nLimit = iSearchContext.getPageable().getPageSize();
				nSkip = (iSearchContext.getPageable().getPageNumber() - ISearchContext.STARTPAGE) * nLimit;
			}
			
			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
			if(searchConds != null) {
				for (ISearchCond item : searchConds) {
					org.bson.conversions.Bson bson = this.getBson(item, iSearchContext, iDataEntityRuntime);
					if (bson != null) {
						andlist.add(bson);
					}
				}
			}
		}
		if(iDataEntityRuntime.isEnableLogicValid()) {
			org.bson.conversions.Bson bson = this.getBson(this.getRealDBObjName(iDataEntityRuntime.getLogicValidPSDEField().getName()), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
			if (bson != null) {
				andlist.add(bson);
			}
		}
		
		//附加数据查询条件
		if(iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition()!=null) {
			org.bson.conversions.Bson bson = this.getBson(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext==null?null:iSearchContext.any(), iDataEntityRuntime);
			if (bson != null) {
				andlist.add(bson);
			}
		}
		
		if(sortInfo == null) {
			sortInfo = new Document(UNIQUEKEY, -1);
		}
		
		java.util.List<IPSDEField> selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
		List<String> fieldList = new ArrayList<String>();
		fieldList.add(UNIQUEKEY);
		if(selectedPSDEFieldList != null) {
			selectedPSDEFieldList.forEach(t -> {
				fieldList.add(getRealDBObjName(t.getName()));
			});
		}
		
		MongoDatabase db = this.getMongoDatabase();
		MongoCollection<Document> collection = db.getCollection(this.getRealDBObjName(strTableName));
		
		
	
		FindIterable<Document> documents = null;
		try {
			if (andlist.size() > 0) {
				documents = collection.find(com.mongodb.client.model.Filters.and(andlist)).projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
			} else {
				documents = collection.find().projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
			}
		}
		catch (Throwable ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("查询数据发生异常，%1$s", ex.getMessage()), ex);
		}

		if (documents != null) {
			java.util.Iterator<Document> it = documents.iterator();
			if (it != null) {
				List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
				while (it.hasNext()) {
					Document doc = it.next();
					Map<String, Object> map = new HashMap<String, Object>();
					map.putAll(doc);
					list.add(map);
				}
				return list;
			}
		}
		return null;
	}
	
	
	@Override
	protected Page onQuery2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		
		String strTableName = iDataEntityRuntime.getTableName();
		if(ObjectUtils.isEmpty(strTableName)) {
			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
		}

		Document sortInfo = null;
		int nSkip = 0;
		int nLimit = Integer.MAX_VALUE;
		
		//构建查询条件
		java.util.List<org.bson.conversions.Bson> andlist = new java.util.ArrayList<org.bson.conversions.Bson>();
		if(iSearchContext != null) {
			
			//处理排序
			if(iSearchContext.getPageSort()!=null && iSearchContext.getPageSort().isSorted()) {
				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
				while (orders.hasNext()) {
					Sort.Order order = orders.next();
					sortInfo = new Document(getRealDBObjName(order.getProperty()),order.isAscending()?1:-1);
					break;
				}
			}
			
			if(iSearchContext.getPageable() != null && iSearchContext.getPageable().isPaged()) {
				nLimit = iSearchContext.getPageable().getPageSize();
				nSkip = (iSearchContext.getPageable().getPageNumber() - ISearchContext.STARTPAGE) * nLimit;
			}
			
			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
			if(searchConds != null) {
				for (ISearchCond item : searchConds) {
					org.bson.conversions.Bson bson = this.getBson(item, iSearchContext, iDataEntityRuntime);
					if (bson != null) {
						andlist.add(bson);
					}
				}
			}
		}
		if(iDataEntityRuntime.isEnableLogicValid()) {
			org.bson.conversions.Bson bson = this.getBson(getRealDBObjName(iDataEntityRuntime.getLogicValidPSDEField().getName()), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
			if (bson != null) {
				andlist.add(bson);
			}
		}
		
		//附加数据查询条件
		if(iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition()!=null) {
			org.bson.conversions.Bson bson = this.getBson(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext==null?null:iSearchContext.any(), iDataEntityRuntime);
			if (bson != null) {
				andlist.add(bson);
			}
		}
		
		if(sortInfo == null) {
			sortInfo = new Document(UNIQUEKEY, -1);
		}
		
		java.util.List<IPSDEField> selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
		List<String> fieldList = new ArrayList<String>();
		fieldList.add(UNIQUEKEY);
		if(selectedPSDEFieldList != null) {
			selectedPSDEFieldList.forEach(t -> {
				fieldList.add(getRealDBObjName(t.getName()));
			});
		}
		
		MongoDatabase db = this.getMongoDatabase();
		MongoCollection<Document> collection = db.getCollection(this.getRealDBObjName(strTableName));
		
		
	
		FindIterable<Document> documents = null;
		try {
			if (andlist.size() > 0) {
				documents = collection.find(com.mongodb.client.model.Filters.and(andlist)).projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
			} else {
				documents = collection.find().projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
			}
			
		}
		catch (Throwable ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("查询数据发生异常，%1$s", ex.getMessage()), ex);
		}

		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		if (documents != null) {
			java.util.Iterator<Document> it = documents.iterator();
			if (it != null) {
				while (it.hasNext()) {
					Document doc = it.next();
					Map<String, Object> map = new HashMap<String, Object>();
					map.putAll(doc);
					list.add(map);
				}
			}
		}
		
		long nTotal = ((list == null)?0:list.size());
		if(iSearchContext.isCount()) {
			if(nTotal >= nLimit) {
				if (andlist.size() > 0) {
					nTotal = collection.countDocuments(com.mongodb.client.model.Filters.and(andlist));
				} else {
					nTotal = collection.countDocuments();
				}
			}
			else {
				nTotal += nSkip;
			}
		}
		else {
			nTotal += nSkip;
		}

		return new PageImpl(list, (iSearchContext!=null && iSearchContext.getPageable()!=null)?iSearchContext.getPageable():Pageable.unpaged(), nTotal);
		
	}
	
	
	@Override
	protected Page onFetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		
		String strTableName = iDataEntityRuntime.getTableName();
		if(ObjectUtils.isEmpty(strTableName)) {
			throw new Exception(String.format("实体[%1$s]未指定数据表标识", iDataEntityRuntime.getName()));
		}

		Document sortInfo = null;
		int nSkip = 0;
		int nLimit = ISearchContext.DEFAULTPAGESIZE;
		//构建查询条件
		java.util.List<org.bson.conversions.Bson> andlist = new java.util.ArrayList<org.bson.conversions.Bson>();
		if(iSearchContext != null) {
			//处理排序
			if(iSearchContext.getPageSort()!=null && iSearchContext.getPageSort().isSorted()) {
				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
				while (orders.hasNext()) {
					Sort.Order order = orders.next();
					sortInfo = new Document(getRealDBObjName(order.getProperty()),order.isAscending()?1:-1);
					break;
				}
			}
			
			if(iSearchContext.getPageable() != null && iSearchContext.getPageable().isPaged()) {
				nLimit = iSearchContext.getPageable().getPageSize();
				nSkip = (iSearchContext.getPageable().getPageNumber() - ISearchContext.STARTPAGE) * nLimit;
			}
			

			//处理条件
			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
			if(searchConds != null) {
				for (ISearchCond item : searchConds) {
					org.bson.conversions.Bson bson = this.getBson(item, iSearchContext, iDataEntityRuntime);
					if (bson != null) {
						andlist.add(bson);
					}
				}
			}
		}
		
		
		
		if(iDataEntityRuntime.isEnableLogicValid()) {
			org.bson.conversions.Bson bson = this.getBson(getRealDBObjName(iDataEntityRuntime.getLogicValidPSDEField().getName()), Conditions.EQ, iDataEntityRuntime.getValidLogicValue(), iDataEntityRuntime);
			if (bson != null) {
				andlist.add(bson);
			}
		}
		
		java.util.List<IPSDEField> selectedPSDEFieldList = null;
		//附加数据集条件 （OR）
		List<IPSDEDataQuery> psDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
		if(!ObjectUtils.isEmpty(psDEDataQueryList)) {
			
			java.util.List<org.bson.conversions.Bson> orlist = new java.util.ArrayList<org.bson.conversions.Bson>();
			for(IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
				if(selectedPSDEFieldList == null) {
					selectedPSDEFieldList = iDataEntityRuntime.getPSDEFields(iPSDEDataQuery);
				}
				
				if(iPSDEDataQuery.getPSDEDQMain() != null && iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition()!=null) {
					org.bson.conversions.Bson bson = this.getBson(iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition(), iSearchContext==null?null:iSearchContext.any(), iDataEntityRuntime);
					if (bson != null) {
						orlist.add(bson);
					}
				}
			}
			
			if(!ObjectUtils.isEmpty(orlist)) {
				andlist.add(com.mongodb.client.model.Filters.or(orlist));
			}
		}
		
		if(sortInfo == null) {
			sortInfo = new Document(UNIQUEKEY, -1);
		}
		
		if(selectedPSDEFieldList == null) {
			selectedPSDEFieldList = iDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
		}
		
		List<String> fieldList = new ArrayList<String>();
		fieldList.add(UNIQUEKEY);
		if(selectedPSDEFieldList != null) {
			selectedPSDEFieldList.forEach(t -> {
				fieldList.add(getRealDBObjName(t.getName()));
			});
		}
		
		
		MongoDatabase db = this.getMongoDatabase();
		MongoCollection<Document> collection = db.getCollection(this.getRealDBObjName(strTableName));
		
	
		FindIterable<Document> documents = null;
		try {
			if (andlist.size() > 0) {
				documents = collection.find(com.mongodb.client.model.Filters.and(andlist)).projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
			} else {
				documents = collection.find().projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
			}
		}
		catch (Throwable ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("获取结果集发生异常，%1$s", ex.getMessage()), ex);
		}
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		if (documents != null) {
			java.util.Iterator<Document> it = documents.iterator();
			if (it != null) {
				
				while (it.hasNext()) {
					Document doc = it.next();
					Map<String, Object> map = new HashMap<String, Object>();
					map.putAll(doc);
					list.add(map);
				}
			}
		}
		
		long nTotal = ((list == null)?0:list.size());
		if(iSearchContext.isCount()) {
			if(nTotal >= nLimit) {
				if (andlist.size() > 0) {
					nTotal = collection.countDocuments(com.mongodb.client.model.Filters.and(andlist));
				} else {
					nTotal = collection.countDocuments();
				}
			}
			else {
				nTotal += nSkip;
			}
		}
		else {
			nTotal += nSkip;
		}

		return new PageImpl(list, (iSearchContext!=null&& iSearchContext.getPageable()!=null)?iSearchContext.getPageable():Pageable.unpaged(), nTotal);
	}
	
	@Override
	protected Page onFetch(String strTableName, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		
		Document sortInfo = null;
		int nSkip = 0;
		int nLimit = ISearchContext.DEFAULTPAGESIZE;
		//构建查询条件
		java.util.List<org.bson.conversions.Bson> andlist = new java.util.ArrayList<org.bson.conversions.Bson>();
		if(iSearchContext != null) {
			//处理排序
			if(iSearchContext.getPageSort()!=null && iSearchContext.getPageSort().isSorted()) {
				java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
				while (orders.hasNext()) {
					Sort.Order order = orders.next();
					sortInfo = new Document(getRealDBObjName(order.getProperty()),order.isAscending()?1:-1);
					break;
				}
			}
			
			if(iSearchContext.getPageable() != null && iSearchContext.getPageable().isPaged()) {
				nLimit = iSearchContext.getPageable().getPageSize();
				nSkip = (iSearchContext.getPageable().getPageNumber() - ISearchContext.STARTPAGE) * nLimit;
			}
			

			//处理条件
			List<ISearchCond> searchConds = iSearchContext.getSearchConds();
			if(searchConds != null) {
				for (ISearchCond item : searchConds) {
					org.bson.conversions.Bson bson = this.getBson(item, iSearchContext);
					if (bson != null) {
						andlist.add(bson);
					}
				}
			}
		}
			
		if(sortInfo == null) {
			sortInfo = new Document(UNIQUEKEY, -1);
		}
		
		List<String> fieldList = new ArrayList<String>();
		if(!ObjectUtils.isEmpty(outputFields)) {
			fieldList.add(UNIQUEKEY);
			for(String strField : outputFields) {
				fieldList.add(strField);
			}
		}
		
		
		MongoDatabase db = this.getMongoDatabase();
		MongoCollection<Document> collection = db.getCollection(this.getRealDBObjName(strTableName));
		
	
		FindIterable<Document> documents = null;
		try {
			if(!ObjectUtils.isEmpty(fieldList)) {
				if (andlist.size() > 0) {
					documents = collection.find(com.mongodb.client.model.Filters.and(andlist)).projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
				} else {
					documents = collection.find().projection(Projections.include(fieldList)).skip(nSkip).sort(sortInfo).limit(nLimit);
				}
			}
			else {
				if (andlist.size() > 0) {
					documents = collection.find(com.mongodb.client.model.Filters.and(andlist)).skip(nSkip).sort(sortInfo).limit(nLimit);
				} else {
					documents = collection.find().skip(nSkip).sort(sortInfo).limit(nLimit);
				}
			}
			
		}
		catch (Throwable ex) {
			throw new SysBDSchemeRuntimeException(this, String.format("获取数据发生异常，%1$s", ex.getMessage()), ex);
		}
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		if (documents != null) {
			java.util.Iterator<Document> it = documents.iterator();
			if (it != null) {
				
				while (it.hasNext()) {
					Document doc = it.next();
					Map<String, Object> map = new HashMap<String, Object>();
					map.putAll(doc);
					list.add(map);
				}
			}
		}
		
		long nTotal = ((list == null)?0:list.size());
		if(iSearchContext.isCount()) {
			if(nTotal >= nLimit) {
				if (andlist.size() > 0) {
					nTotal = collection.countDocuments(com.mongodb.client.model.Filters.and(andlist));
				} else {
					nTotal = collection.countDocuments();
				}
			}
			else {
				nTotal += nSkip;
			}
		}
		else {
			nTotal += nSkip;
		}

		return new PageImpl(list, (iSearchContext!=null&& iSearchContext.getPageable()!=null)?iSearchContext.getPageable():Pageable.unpaged(), nTotal);
	}
	
	
	
	protected org.bson.conversions.Bson getBson(IPSDEDQCondition iPSDEDQCondition, Map<String, Object> params, IDataEntityRuntime iDataEntityRuntime) throws Throwable{
		
		if (iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
			List<org.bson.conversions.Bson> bsonList = new ArrayList<org.bson.conversions.Bson>();
			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition) iPSDEDQCondition;
			List<IPSDEDQCondition> psDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
			if(psDEDQConditions != null) {
				for (IPSDEDQCondition item : psDEDQConditions) {
					org.bson.conversions.Bson bson = this.getBson(item, params, iDataEntityRuntime);
					if (bson != null) {
						bsonList.add(bson);
					}
				}
			}
			
			if (bsonList.size() > 0) {
				if (iPSDEDQGroupCondition.isNotMode()) {
					if (Conditions.AND.equals(iPSDEDQGroupCondition.getCondOp())) {
						return com.mongodb.client.model.Filters.not(com.mongodb.client.model.Filters.and(bsonList));
					} else {
						return com.mongodb.client.model.Filters.not(com.mongodb.client.model.Filters.or(bsonList));
					}
				} else {
					if (Conditions.AND.equals(iPSDEDQGroupCondition.getCondOp())) {
						return com.mongodb.client.model.Filters.and(bsonList);
					} else {
						return com.mongodb.client.model.Filters.or(bsonList);
					}
				}
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
				return getBson(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
			}
			else {
				Object objValue = iPSDEDQFieldCondition.getCondValue();
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(iPSDEDQFieldCondition.getFieldName(), true);
				if(iPSDEField != null) {
					objValue = iDataEntityRuntime.convertValue(iPSDEField.getStdDataType(), (String)objValue);
				}
				return getBson(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue, iDataEntityRuntime);
			}
//			if(CondType.)
//			Object objValue = iPSDEDQFieldCondition.getPSVARTypeId()();getValue();
//			if(objValue == null) {
//				return null;
//			}
//			if(iSearchFieldCond.isParamMode()) {
//				objValue = iSearchContext.get(objValue.toString());
//			}
//			
//
//			return getBson(iSearchFieldCond.getFieldName(), iSearchFieldCond.getCondOp(), objValue);
		}

		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iPSDEDQCondition.getCondType()));
		
		
	}
	
	
	protected org.bson.conversions.Bson getBson(ISearchCond iSearchCond, ISearchContext iSearchContext) throws Throwable{
		return this.getBson(iSearchCond, iSearchContext, null);
	}
	 
	protected org.bson.conversions.Bson getBson(ISearchCond iSearchCond, ISearchContext iSearchContext, IDataEntityRuntime iDataEntityRuntime) throws Throwable{

		if (iSearchCond instanceof ISearchGroupCond) {
			List<org.bson.conversions.Bson> bsonList = new ArrayList<org.bson.conversions.Bson>();
			ISearchGroupCond iSearchGroupCond = (ISearchGroupCond) iSearchCond;
			List<ISearchCond> searchConds = iSearchGroupCond.getSearchConds();
			if(searchConds != null) {
				for (ISearchCond item : searchConds) {
					org.bson.conversions.Bson bson = this.getBson(item, iSearchContext, iDataEntityRuntime);
					if (bson != null) {
						bsonList.add(bson);
					}
				}
			}
			
			if (bsonList.size() > 0) {
				if (iSearchGroupCond.isNotMode()) {
					if (Conditions.AND.equals(iSearchGroupCond.getCondOp())) {
						return com.mongodb.client.model.Filters.not(com.mongodb.client.model.Filters.and(bsonList));
					} else {
						return com.mongodb.client.model.Filters.not(com.mongodb.client.model.Filters.or(bsonList));
					}
				} else {
					if (Conditions.AND.equals(iSearchGroupCond.getCondOp())) {
						return com.mongodb.client.model.Filters.and(bsonList);
					} else {
						return com.mongodb.client.model.Filters.or(bsonList);
					}
				}
			} else {
				return null;
			}
		}

		if (iSearchCond instanceof ISearchFieldCond) {
			ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
			Object objValue = iSearchFieldCond.getValue();
			if(objValue == null) {
				return null;
			}
			if(iSearchFieldCond.isParamMode()) {
				objValue = iSearchContext.get(objValue.toString());
			}
			

			return getBson(iSearchFieldCond.getFieldName(), iSearchFieldCond.getCondOp(), objValue, iDataEntityRuntime);
		}

		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iSearchCond.getCondType()));
	}

	protected org.bson.conversions.Bson getBson(String strFieldName, String strCondition, Object objValue, IDataEntityRuntime iDataEntityRuntime) throws Throwable {

		if (StringUtils.hasLength(strFieldName)) {
			strFieldName = this.getRealDBObjName(strFieldName);
			if(iDataEntityRuntime != null) {
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strFieldName, true);
				if(iPSDEField != null) {
					//转化主键属性至MongoDB默认主键
					if(iPSDEField.isKeyDEField()) {
						strFieldName = UNIQUEKEY;
					}
				}
			}
		}
		else {
			throw new Exception("未指定属性标识");
		}

		if (Conditions.EQ.equals(strCondition) || Conditions.ABSEQ.equals(strCondition)) {
			return com.mongodb.client.model.Filters.eq(strFieldName, objValue);
		}

		if (Conditions.GT.equals(strCondition)) {
			return com.mongodb.client.model.Filters.gt(strFieldName, objValue);
		}

		if (Conditions.GTANDEQ.equals(strCondition)) {
			return com.mongodb.client.model.Filters.gte(strFieldName, objValue);
		}

		if (Conditions.LT.equals(strCondition)) {
			return com.mongodb.client.model.Filters.lt(strFieldName, objValue);
		}

		if (Conditions.LTANDEQ.equals(strCondition)) {
			return com.mongodb.client.model.Filters.lte(strFieldName, objValue);
		}

		if (Conditions.NOTEQ.equals(strCondition)) {
			return com.mongodb.client.model.Filters.ne(strFieldName, objValue);
		}

		if (Conditions.ISNULL.equals(strCondition)) {
			return com.mongodb.client.model.Filters.eq(strFieldName, null);
		}

		if (Conditions.ISNOTNULL.equals(strCondition)) {
			return com.mongodb.client.model.Filters.ne(strFieldName, null);
		}

		if (Conditions.LIKE.equals(strCondition)) {
			if (objValue != null && objValue instanceof String) {
				return com.mongodb.client.model.Filters.regex(strFieldName, (String) objValue, "i");
			} else {
				if (objValue != null) {
					return com.mongodb.client.model.Filters.regex(strFieldName, objValue.toString(), "i");
				}
			}
			return null;
		}

		if (Conditions.LEFTLIKE.equals(strCondition)) {
			if (objValue != null && objValue instanceof String) {
				return com.mongodb.client.model.Filters.regex(strFieldName, "^" + (String) objValue, "i");
			} else {
				if (objValue != null) {
					return com.mongodb.client.model.Filters.regex(strFieldName, "^" + objValue.toString(), "i");
				}
			}
			return null;
		}

		if (Conditions.RIGHTLIKE.equals(strCondition)) {
			if (objValue != null && objValue instanceof String) {
				return com.mongodb.client.model.Filters.regex(strFieldName, (String) objValue + "^", "i");
			} else {
				if (objValue != null) {
					return com.mongodb.client.model.Filters.regex(strFieldName, objValue.toString() + "^", "i");
				}
			}
			return null;
		}

		throw new Exception(String.format("未支持的条件操作[%1$s]", strCondition));
	}
	
	
	protected String getAutoId() {
		return String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS%2$s", new Date(), KeyValueUtils.genUniqueId());
	}
	
	protected void onShutdown() throws Exception{
		try {
			this.closeMongoClient();
		}
		catch (Exception ex) {
			log.error(String.format("关闭客户端对象发生异常，%1$s", ex.getMessage()), ex);
		}
		super.onShutdown();
	}
}
