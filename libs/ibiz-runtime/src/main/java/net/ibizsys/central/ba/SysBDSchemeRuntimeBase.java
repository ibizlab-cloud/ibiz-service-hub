package net.ibizsys.central.ba;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.DBObjNameCaseMode;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.model.ba.PSSysBDSchemeImpl;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SysBDSchemeRuntimeBase extends SystemModelRuntimeBase implements ISysBDSchemeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysBDSchemeRuntimeBase.class);
	
	private IPSSysBDScheme iPSSysBDScheme = null;
	
	private String strServiceUrl = null;
	
	private boolean bDefaultMode = false;
	
	private String strBDType = null;
		
	private Object objDataSourceTag = null;
	
	private Map<String, Object> properties = null;
	
	private String strClientId = null;

	private String strClientSecret = null;

	private String strAuthMode = null;
	
	private String strAuthParam = null;
	
	private String strAuthParam2 = null;
	
	private String strServiceParam = null;
	
	private String strServiceParam2 = null;
	
	private String strDBName = null;
	
	private static ThreadLocal<String> dbNameThreadLocal = new ThreadLocal<String>();
	
	private String strDBObjNameCase = DBObjNameCaseMode.LCASE.value;
	
	private DBObjNameCaseMode dbObjNameCaseMode = DBObjNameCaseMode.LCASE;
	
	private boolean bInstalled = false;
	
	private boolean bUpdateSchema = true;
	
	/**
	 * 设置当前数据库名称
	 * @param strDBName
	 */
	public static void setCurrentDBName(String strDBName) {
		dbNameThreadLocal.set(strDBName);
	}
	
	
	/**
	 * 设置当前数据库名称
	 * @return
	 */
	public static String getCurrentDBName() {
		return dbNameThreadLocal.get();
	}
	
	
	private ISysBDSchemeRuntimeContext iSysBDSchemeRuntimeContext = new ISysBDSchemeRuntimeContext() {

		@Override
		public ISysBDSchemeRuntime getSysBDSchemeRuntime() {
			return getSelf();
		}
		
	};
	
	
	/**
	 * 获取数据库体系的配置目录
	 * @param iPSSysBDScheme
	 * @return
	 */
	public static String getConfigFolder(IPSSysBDScheme iPSSysBDScheme) {
		if(iPSSysBDScheme.getPSSysModelGroup()!= null) {
			return ISystemRuntimeSetting.CONFIGFOLDER_SYSBDSCHEME + "." + PSModelUtils.calcUniqueTag(iPSSysBDScheme.getPSSysModelGroup(), iPSSysBDScheme.getCodeName());
		}
		else {
			return ISystemRuntimeSetting.CONFIGFOLDER_SYSBDSCHEME + "." + PSModelUtils.calcUniqueTag(iPSSysBDScheme.getPSSystemModule(), iPSSysBDScheme.getCodeName());
		}
	}
	
	
	/**
	 * 获取默认的大数据库体系模型
	 * @param iSystemRuntimeContext
	 * @return
	 * @throws Exception
	 */
	public static IPSSysBDScheme getDefaultPSSysBDScheme(ISystemRuntimeContext iSystemRuntimeContext) throws Exception{
		
		ObjectNode objNode = JsonUtils.createObjectNode();
		
		objNode.put(PSSysBDSchemeImpl.ATTR_GETNAME, "默认大数据体系");
		objNode.put(PSSysBDSchemeImpl.ATTR_GETCODENAME, CODENAME_SYSTEMDEFAULT);
		
		return (IPSSysBDScheme)iSystemRuntimeContext.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iSystemRuntimeContext.getPSSystemService().getPSSystem(), IPSSysBDScheme.class, objNode);
	}
	
	/**
	 * 获取大数据库体系模型
	 * @param iSystemRuntimeContext
	 * @param params 参数
	 * @return
	 * @throws Exception
	 */
	public static IPSSysBDScheme getPSSysBDScheme(ISystemRuntimeContext iSystemRuntimeContext, Map<String, Object> params) throws Exception{
		
		ObjectNode objNode = JsonUtils.createObjectNode();
		
		if(params.get("name")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETNAME, DataTypeUtils.getStringValue(params.get("name"), null));
		}
		if(params.get("codename")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETCODENAME,  DataTypeUtils.getStringValue(params.get("codename"), null));
		}
		if(params.get("serviceurl")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETSERVICEPATH,  DataTypeUtils.getStringValue(params.get("serviceurl"), null));
		}
		if(params.get("authmode")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETAUTHMODE,  DataTypeUtils.getStringValue(params.get("authmode"), null));
		}
		if(params.get("clientid")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETAUTHCLIENTID,  DataTypeUtils.getStringValue(params.get("clientid"), null));
		}
		if(params.get("clientsecret")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETAUTHCLIENTSECRET,  DataTypeUtils.getStringValue(params.get("clientsecret"), null));
		}
		if(params.get("authparam")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETAUTHPARAM,  DataTypeUtils.getStringValue(params.get("authparam"), null));
		}
		if(params.get("authparam2")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETAUTHPARAM2,  DataTypeUtils.getStringValue(params.get("authparam2"), null));
		}
		if(params.get("serviceparam")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETSERVICEPARAM,  DataTypeUtils.getStringValue(params.get("serviceparam"), null));
		}
		if(params.get("serviceparam2")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETSERVICEPARAM2,  DataTypeUtils.getStringValue(params.get("serviceparam2"), null));
		}
		if(params.get("dbobjnamecase")!=null) {
			objNode.put(PSSysBDSchemeImpl.ATTR_GETDBOBJNAMECASE,  DataTypeUtils.getStringValue(params.get("dbobjnamecase"), null));
		}
		
		
		return (IPSSysBDScheme)iSystemRuntimeContext.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iSystemRuntimeContext.getPSSystemService().getPSSystem(), IPSSysBDScheme.class, objNode);
	}
	
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysBDScheme iPSSysBDScheme) throws Exception {
		Assert.notNull(iSystemRuntimeContext, "传入系统运行时上下文对象无效");
		Assert.notNull(iPSSysBDScheme, "传入大数据体系模型对象无效");
		this.setSystemRuntimeBase(iSystemRuntimeContext.getSystemRuntime());
		this.iPSSysBDScheme = iPSSysBDScheme;
		
		this.setConfigFolder(getConfigFolder(iPSSysBDScheme));
		
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
	
		if(StringUtils.hasLength(this.getPSSysBDScheme().getCodeName())) {
			this.setDBName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbname", this.getPSSysBDScheme().getCodeName().toLowerCase()));
		}
		else {
			this.setDBName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbname", null));
		}
		
		this.setServiceUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceurl", this.getPSSysBDScheme().getServicePath()));
		this.setDefaultMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".defaultmode", this.getPSSysBDScheme().isDefaultMode()));
		
		this.setAuthMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authmode", this.getPSSysBDScheme().getAuthMode()));
		this.setClientId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientid", this.getPSSysBDScheme().getAuthClientId()));
		this.setClientSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientsecret", this.getPSSysBDScheme().getAuthClientSecret()));
		
		this.setAuthParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam", this.getPSSysBDScheme().getAuthParam()));
		this.setAuthParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam2", this.getPSSysBDScheme().getAuthParam2()));
		
		this.setServiceParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam", this.getPSSysBDScheme().getServiceParam()));
		this.setServiceParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam2", this.getPSSysBDScheme().getServiceParam2()));
		
		this.setDBObjNameCase(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbobjnamecase", this.getPSSysBDScheme().getDBObjNameCase()));
		this.setUpdateSchema(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".updateschema", this.isUpdateSchema()));
		
		super.onInit();
	}
	

	protected ISysBDSchemeRuntimeContext getSysBDSchemeRuntimeContext() {
		return this.iSysBDSchemeRuntimeContext;
	}
	
	private SysBDSchemeRuntimeBase getSelf() {
		return this;
	}
	
//	@Override
//	public ISysBDTableRuntime getSysBDTableRuntime(String strTableName, boolean bTryMode) {
//		ISysBDTableRuntime iSysBDTableRuntime = this.sysDBTableRuntimeMap.get(strTableName.toUpperCase());
//		if(iSysBDTableRuntime != null || bTryMode ) {
//			return iSysBDTableRuntime;
//		}
//		throw new SysBDSchemeRuntimeException(this, String.format("无法获取指定数据表[%1$s]运行时对象", strTableName));
//	}

	@Override
	public IPSSysBDScheme getPSSysBDScheme() {
		return this.iPSSysBDScheme;
	}
	
	
	@Override
	public String getId() {
		return getPSSysBDScheme().getId();
	}

	@Override
	public String getName() {
		return getPSSysBDScheme().getName();
	}

	@Override
	public String getBDType() {
		return this.strBDType;
	}
	
	public void setBDType(String strBDType) {
		this.strBDType = strBDType;
	}

	@Override
	public String getServiceUrl() {
		return this.strServiceUrl;
	}

	protected void setServiceUrl(String strServiceUrl) {
		this.strServiceUrl = strServiceUrl;
	}
	
	@Override
	public String getServiceParam() {
		return this.strServiceParam;
	}

	protected void setServiceParam(String strServiceParam) {
		this.strServiceParam = strServiceParam;
	}
	
	@Override
	public String getServiceParam2() {
		return this.strServiceParam2;
	}

	protected void setServiceParam2(String strServiceParam2) {
		this.strServiceParam2 = strServiceParam2;
	}
	
	
	@Override
	public boolean isDefaultMode() {
		return this.bDefaultMode;
	}
	
	protected void setDefaultMode(boolean bDefaultMode) {
		this.bDefaultMode = bDefaultMode;
	}
	
	@Override
	public String getClientId() {
		return this.strClientId;
	}

	protected void setClientId(String strClientId) {
		this.strClientId = strClientId;
	}

	@Override
	public String getClientSecret() {
		return this.strClientSecret;
	}

	protected void setClientSecret(String strClientSecret) {
		this.strClientSecret = strClientSecret;
	}

	@Override
	public String getAuthMode() {
		return this.strAuthMode;
	}

	protected void setAuthMode(String strAuthMode) {
		this.strAuthMode = strAuthMode;
	}

	@Override
	public String getAuthParam() {
		return this.strAuthParam;
	}

	protected void setAuthParam(String strAuthParam) {
		this.strAuthParam = strAuthParam;
	}
	
	@Override
	public String getAuthParam2() {
		return this.strAuthParam2;
	}

	protected void setAuthParam2(String strAuthParam2) {
		this.strAuthParam2 = strAuthParam2;
	}
	
	@Override
	public String getDBObjNameCase() {
		return this.strDBObjNameCase;
	}
	
	protected void setDBObjNameCase(String strDBObjNameCase) {
		if(!StringUtils.hasLength(strDBObjNameCase)) {
			strDBObjNameCase = DBObjNameCaseMode.LCASE.value;
		}
		
		this.strDBObjNameCase = strDBObjNameCase;
		this.dbObjNameCaseMode = DBObjNameCaseMode.from(this.strDBObjNameCase);
		
		
	}
	
	protected DBObjNameCaseMode getDBObjNameCaseMode() {
		return this.dbObjNameCaseMode;
	}
	
	protected String getRealDBObjName(String strObjName) {
		if(this.getDBObjNameCaseMode() == DBObjNameCaseMode.LCASE) {
			return strObjName.toLowerCase();
		}
		else
			if(this.getDBObjNameCaseMode() == DBObjNameCaseMode.UCASE) {
				return strObjName.toUpperCase();
			}
		return strObjName;
	}
	
	/**
	 * 获取当前数据库名称
	 * @return
	 */
	public String getDBName() {
		String strCurrentDBName = getCurrentDBName();
		if(StringUtils.hasLength(strCurrentDBName)) {
			return strCurrentDBName;
		}
		return this.strDBName;
	}
	
	protected void setDBName(String strDBName) {
		this.strDBName = strDBName;
	}
	
	
	/**
	 * 获取实际存储的Map数据对象
	 * @param map
	 * @return
	 */
	protected Map<String, Object> getRealMap(Map<String, Object> map){
		if(ObjectUtils.isEmpty(map)) {
			return map;
		}
		
		Map<String, Object> real = new LinkedHashMap<String, Object>();
		for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
			if(Entity.KEY.equals(entry.getKey())) {
				real.put(entry.getKey(), entry.getValue());
			}
			else {
				real.put(getRealDBObjName(entry.getKey()), entry.getValue());
			}
		}
		
		return real;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysBDScheme();
	}


	

	protected IBDDataService getBDDataService() {
		throw new SysBDSchemeRuntimeException(this, "没有实现获取数据服务方法", Errors.NOTIMPL);
	}

	@Override
	public Object insert(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object update(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object delete(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object insert(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		Assert.hasLength(strTableName, "未传入数据表标识");
		Assert.notNull(arg, "未传入插入数据");
		try {
			return this.onInsert(strTableName, arg, extParamMap);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw ex;
			}
			throw new SysBDSchemeRuntimeException(this, String.format("新建数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onInsert(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object update(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		Assert.hasLength(strTableName, "未传入数据表标识");
		try {
			return this.onUpdate(strTableName, arg, extParamMap, bAppendMode);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw ex;
			}
			throw new SysBDSchemeRuntimeException(this, String.format("更新数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onUpdate(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public Object delete(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		Assert.hasLength(strTableName, "未传入数据表标识");
		try {
			return this.onDelete(strTableName, arg, extParamMap);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw ex;
			}
			throw new SysBDSchemeRuntimeException(this, String.format("删除数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onDelete(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public List select(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public List query(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		try {
			return this.onQuery(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields, extParamMap);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw ex;
			}
			throw new SysBDSchemeRuntimeException(this, String.format("数据查询[%1$s]发生异常，%2$s", iPSDEDataQuery.getName(), ex.getMessage()), ex);
		}
	}
	
	protected List onQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Page query2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		try {
			return this.onQuery2(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields, extParamMap);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw ex;
			}
			throw new SysBDSchemeRuntimeException(this, String.format("数据查询[%1$s]发生异常，%2$s", iPSDEDataQuery.getName(), ex.getMessage()), ex);
		}
	}
	
	protected Page onQuery2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public Page fetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		try {
			return this.onFetchDataSet(iDataEntityRuntime, iPSDEDataSet, iSearchContext, outputFields, extParamMap);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw ex;
			}
			throw new SysBDSchemeRuntimeException(this, String.format("获取数据集[%1$s]发生异常，%2$s", iPSDEDataSet.getName(), ex.getMessage()), ex);
		}
	}
	
	protected Page onFetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public Page fetch(String strTableName, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		try {
			return this.onFetch(strTableName, iSearchContext, outputFields, extParamMap);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw ex;
			}
			throw new SysBDSchemeRuntimeException(this, String.format("获取数据集[%1$s]发生异常，%2$s", strTableName, ex.getMessage()), ex);
		}
	}
	
	protected Page onFetch(String strTableName, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public boolean isUpdateSchema() {
		return this.bUpdateSchema;
	}

	public void setUpdateSchema(boolean bUpdateSchema) {
		this.bUpdateSchema = bUpdateSchema;
	}

	@Override
	public Object getDataSourceTag() {
		return this.objDataSourceTag;
	}

	@Override
	public void setDataSourceTag(Object objDataSourceTag) {
		this.objDataSourceTag = objDataSourceTag;
	}

	@Override
	public void setDataSourceProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

	@Override
	public Object getDataSourceProperty(String strKey, Object objDefault) {
		if(properties != null && properties.containsKey(strKey)) {
			return properties.get(strKey);
		}
		return objDefault;
	}

	@Override
	public synchronized void install() throws Exception {
		if(!this.bInstalled) {
			this.onInstall();
			
			this.bInstalled = true;
		}
	}
	
	
	protected void onInstall() throws Exception {
	
	}
	
	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}
	
	@Override
	public void uninstall() {
		try {
			onUninstall();
		}
		catch(Throwable ex) {
			log.error(String.format("卸载大数据体系[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载大数据库体系[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}
	
	protected void onUninstall() throws Throwable{
		
	}

	protected String getLogCat() {
		return LogCats.BDSCHEME;
	}
	

	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}
	
	protected void onShutdown() throws Exception{
		
	}

}
