package net.ibizsys.central.search;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DBObjNameCaseMode;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.model.search.IPSSysSearchScheme;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SysSearchSchemeRuntimeBase extends SystemModelRuntimeBase implements ISysSearchSchemeRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysSearchSchemeRuntimeBase.class);
	
	private IPSSysSearchScheme iPSSysSearchScheme = null;
	
	private String strServiceUrl = null;
	
	private String strSearchEngineType = null;
		
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
	
	private ISysBDSchemeRuntime iSysBDSchemeRuntime = null;
	
	private Map<String, ISysSearchDocRuntime> sysSearchDocRuntimeMap = new HashMap<String, ISysSearchDocRuntime>();
	
	private boolean bInstalled = false;
	
	private boolean bUpdateSchema = true;
	
	private IPSSysBDScheme iPSSysBDScheme = null;
	
	
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
	
	
	private ISysSearchSchemeRuntimeContext iSysSearchSchemeRuntimeContext = new ISysSearchSchemeRuntimeContext() {

		@Override
		public ISysSearchSchemeRuntime getSysSearchSchemeRuntime() {
			return getSelf();
		}
	};
	
	
	/**
	 * 获取检索体系的配置目录
	 * @param iPSSysSearchScheme
	 * @return
	 */
	public static String getConfigFolder(IPSSysSearchScheme iPSSysSearchScheme) {
		if(iPSSysSearchScheme.getPSSysModelGroup()!= null) {
			return ISystemRuntimeSetting.CONFIGFOLDER_SYSSEARCHSCHEME + "." + PSModelUtils.calcUniqueTag(iPSSysSearchScheme.getPSSysModelGroup(), iPSSysSearchScheme.getCodeName());
		}
		else {
			return ISystemRuntimeSetting.CONFIGFOLDER_SYSSEARCHSCHEME + "." + PSModelUtils.calcUniqueTag(iPSSysSearchScheme.getPSSystemModule(), iPSSysSearchScheme.getCodeName());
		}
	}
	
	
	
	
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysSearchScheme iPSSysSearchScheme) throws Exception {
		Assert.notNull(iSystemRuntimeContext, "传入系统运行时上下文对象无效");
		Assert.notNull(iPSSysSearchScheme, "传入检索体系模型对象无效");
		this.setSystemRuntimeBase(iSystemRuntimeContext.getSystemRuntime());
		this.iPSSysSearchScheme = iPSSysSearchScheme;
		
		this.setConfigFolder(getConfigFolder(iPSSysSearchScheme));
		
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
	
		if(StringUtils.hasLength(this.getPSSysSearchScheme().getCodeName())) {
			this.setDBName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbname", this.getPSSysSearchScheme().getCodeName().toLowerCase()));
		}
		else {
			this.setDBName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbname", null));
		}
		
		this.setServiceUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceurl", this.getPSSysSearchScheme().getServicePath()));
		
		this.setAuthMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authmode", this.getPSSysSearchScheme().getAuthMode()));
		this.setClientId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientid", this.getPSSysSearchScheme().getAuthClientId()));
		this.setClientSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientsecret", this.getPSSysSearchScheme().getAuthClientSecret()));
		
		this.setAuthParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam", this.getPSSysSearchScheme().getAuthParam()));
		this.setAuthParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam2", this.getPSSysSearchScheme().getAuthParam2()));
		
		this.setServiceParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam", this.getPSSysSearchScheme().getServiceParam()));
		this.setServiceParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam2", this.getPSSysSearchScheme().getServiceParam2()));
		
		this.setDBObjNameCase(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbobjnamecase", this.getPSSysSearchScheme().getDBObjNameCase()));
		this.setUpdateSchema(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".updateschema", this.isUpdateSchema()));
		
		java.util.List<IPSSysSearchDoc> psSysSearchDocList = this.getPSSysSearchScheme().getAllPSSysSearchDocs();
		if (!ObjectUtils.isEmpty(psSysSearchDocList)) {
			for (IPSSysSearchDoc iPSSysSearchDoc : psSysSearchDocList) {
				ISysSearchDocRuntime iSysSearchDocRuntime = this.createSysSearchDocRuntime(iPSSysSearchDoc);
				try {
					iSysSearchDocRuntime.init(this.getSysSearchSchemeRuntimeContext(), iPSSysSearchDoc);
					sysSearchDocRuntimeMap.put(iPSSysSearchDoc.getName().toUpperCase(), iSysSearchDocRuntime);
				}
				catch (Exception ex) {
					throw new Exception(String.format("初始化检索文档[%1$s]运行时发生异常，%2$s", iPSSysSearchDoc.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		super.onInit();
		
		//枚举全部大数据库，获取对于的大数据体系
		if(this.getPSSysBDScheme(true) == null) {
			this.preparePSSysBDScheme();
			if(this.getPSSysBDScheme(true) == null) {
				log.warn(String.format("检索体系[%1$s]未绑定默认大数据体系", this.getName()));
			}
			else {
				log.debug(String.format("检索体系[%1$s]绑定大数据体系[%2$s]", this.getName(), this.getPSSysBDScheme(true).getName()));
			}
		}
	}
	
	

	protected ISysSearchSchemeRuntimeContext getSysSearchSchemeRuntimeContext() {
		return this.iSysSearchSchemeRuntimeContext;
	}
	
	private SysSearchSchemeRuntimeBase getSelf() {
		return this;
	}
	
	protected ISysSearchDocRuntime createSysSearchDocRuntime(IPSSysSearchDoc iPSSysSearchDoc) {
		return new SysSearchDocRuntime();
	}
	
	
	@Override
	public IPSSysSearchScheme getPSSysSearchScheme() {
		return this.iPSSysSearchScheme;
	}
	
	@Override
	public ISysBDSchemeRuntime getSysBDSchemeRuntime() {
		return this.getSysBDSchemeRuntime(false);
	}
	
	protected void preparePSSysBDScheme() throws Exception {
		String strTag = null;
		if(this.getPSSysSearchScheme().getPSSysModelGroup()!= null) {
			strTag = PSModelUtils.calcUniqueTag(this.getPSSysSearchScheme().getPSSysModelGroup(), this.getPSSysSearchScheme().getCodeName());
		}
		else {
			strTag = PSModelUtils.calcUniqueTag(this.getPSSysSearchScheme().getPSSystemModule(), this.getPSSysSearchScheme().getCodeName());
		}
		
		java.util.List<IPSSysBDScheme> psSysBDSchemeList = this.getSystemRuntime().getPSSystem().getAllPSSysBDSchemes();
		if(!ObjectUtils.isEmpty(psSysBDSchemeList)) {
			for(IPSSysBDScheme item : psSysBDSchemeList) {
				if(this.getPSSysSearchScheme().getPSSysModelGroup()!= null) {
					if(item.getPSSysModelGroup() == null) {
						continue;
					}
					String strTag2 = PSModelUtils.calcUniqueTag(item.getPSSysModelGroup(), item.getCodeName());
					if(strTag.equals(strTag2)) {
						setPSSysBDScheme(item);
						break;
					}
				}
				else {
					String strTag2 = PSModelUtils.calcUniqueTag(item.getPSSystemModule(), item.getCodeName());
					if(strTag.equals(strTag2)) {
						setPSSysBDScheme(item);
						break;
					}
				}
			}
		}
	}
	
	protected void setPSSysBDScheme(IPSSysBDScheme iPSSysBDScheme) {
		this.iPSSysBDScheme = iPSSysBDScheme;
	}
	
	protected IPSSysBDScheme getPSSysBDScheme(boolean bTryMode) throws Exception {
		if(this.iPSSysBDScheme != null || bTryMode) {
			return this.iPSSysBDScheme;
		}
		throw new Exception("大数据体系模型对象无效");
	}
	
	public ISysBDSchemeRuntime getSysBDSchemeRuntime(boolean bTryMode) {
	
		try {
			if(this.getPSSysBDScheme(true) != null && this.iSysBDSchemeRuntime == null) {
				this.iSysBDSchemeRuntime = this.getSystemRuntime().getSysBDSchemeRuntime(this.getPSSysBDScheme(true));
			}
		}
		catch (Throwable ex) {
			SysSearchSchemeRuntimeException.rethrow(this, ex);
			throw new SysSearchSchemeRuntimeException(this, String.format("获取大数据体系运行时体系发生异常，%1$s", ex.getMessage()), ex);
		}

		if(this.iSysBDSchemeRuntime != null || bTryMode) {
			return this.iSysBDSchemeRuntime;
		}
		throw new SysSearchSchemeRuntimeException(this, String.format("未定义检索体系相关的大数据体系"));
	}
	
	protected void setSysBDSchemeRuntime(ISysBDSchemeRuntime iSysBDSchemeRuntime) {
		this.iSysBDSchemeRuntime = iSysBDSchemeRuntime;
	}
	
	@Override
	public String getId() {
		return getPSSysSearchScheme().getId();
	}

	@Override
	public String getName() {
		return getPSSysSearchScheme().getName();
	}

	@Override
	public String getSearchEngineType() {
		return this.strSearchEngineType;
	}
	
	public void setSearchEngineType(String strSearchEngineType) {
		this.strSearchEngineType = strSearchEngineType;
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
	
	@Override
	public DBObjNameCaseMode getDBObjNameCaseMode() {
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
		return this.getPSSysSearchScheme();
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
		
		if(this.isUpdateSchema()) {
			java.util.List<IPSSysSearchDoc> psSysSearchDocList = this.getPSSysSearchScheme().getAllPSSysSearchDocs();
			if (!ObjectUtils.isEmpty(psSysSearchDocList)) {
				for (IPSSysSearchDoc iPSSysSearchDoc : psSysSearchDocList) {
					try {
						updateSchema(iPSSysSearchDoc);
					}
					catch (Exception ex) {
						throw new Exception(String.format("更新检索文档[%1$s]结构发生异常，%2$s", iPSSysSearchDoc.getName(), ex.getMessage()), ex);
					}
				}
			}
		}
	}
	
	protected void updateSchema(IPSSysSearchDoc iPSSysSearchDoc) throws Exception{
		this.onUpdateSchema(iPSSysSearchDoc);
	}
	
	protected void onUpdateSchema(IPSSysSearchDoc iPSSysSearchDoc) throws Exception{
		
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
			log.error(String.format("卸载检索体系[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载检索体系[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}
	
	protected void onUninstall() throws Throwable{
		
	}
	
	@Override
	public ISysSearchDocRuntime getSysSearchDocRuntime(String strDocName, boolean bTryMode) {
		Assert.hasLength(strDocName, "未传入检索文档名称");
		
		ISysSearchDocRuntime iSysSearchDocRuntime = this.sysSearchDocRuntimeMap.get(strDocName.toUpperCase());
		if (iSysSearchDocRuntime != null || bTryMode) {
			return iSysSearchDocRuntime;
		}
		throw new SysSearchSchemeRuntimeException(this, String.format("无法获取指定检索文档[%1$s]运行时对象", strDocName));
	}
	
	@Override
	public ISysSearchDocRuntime getSysSearchDocRuntime(IPSSysSearchDoc iPSSysSearchDoc) {
		Assert.notNull(iPSSysSearchDoc, "未传入检索文档对象");
		
		return this.getSysSearchDocRuntime(iPSSysSearchDoc.getName(), false);
	}
	
	@Override
	public Object insert(String strDocName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		Assert.hasLength(strDocName, "未传入数据表标识");
		Assert.notNull(args, "未传入插入数据");
		try {
			return this.onInsert(strDocName, args, extParamMap);
		}
		catch(Throwable ex) {
			SysSearchSchemeRuntimeException.rethrow(this, ex);
			throw new SysSearchSchemeRuntimeException(this, String.format("批新建数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onInsert(String strDocName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(true);
		if(iSysBDSchemeRuntime!=null) {
			return iSysBDSchemeRuntime.insert(strDocName, args, extParamMap);
		}
		throw new SysSearchSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public Object update(String strDocName, List<Map<String, Object>> args, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		Assert.hasLength(strDocName, "未传入数据表标识");
		Assert.notNull(args, "未传入更新数据");
		try {
			return this.onUpdate(strDocName, args, extParamMap, bAppendMode);
		}
		catch(Throwable ex) {
			SysSearchSchemeRuntimeException.rethrow(this, ex);
			throw new SysSearchSchemeRuntimeException(this, String.format("批更新数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onUpdate(String strDocName, List<Map<String, Object>> args, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(true);
		if(iSysBDSchemeRuntime!=null) {
			return iSysBDSchemeRuntime.update(strDocName, args, extParamMap, bAppendMode);
		}
		throw new SysSearchSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public Object delete(String strDocName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		Assert.hasLength(strDocName, "未传入数据表标识");
		Assert.notNull(args, "未传入删除数据");
		try {
			return this.onDelete(strDocName, args, extParamMap);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw ex;
			}
			throw new SysSearchSchemeRuntimeException(this, String.format("批删除数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onDelete(String strDocName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(true);
		if(iSysBDSchemeRuntime!=null) {
			return iSysBDSchemeRuntime.delete(strDocName, args, extParamMap);
		}
		throw new SysSearchSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object insert(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		Assert.hasLength(strDocName, "未传入数据表标识");
		Assert.notNull(arg, "未传入插入数据");
		try {
			return this.onInsert(strDocName, arg, extParamMap);
		}
		catch(Throwable ex) {
			SysSearchSchemeRuntimeException.rethrow(this, ex);
			throw new SysSearchSchemeRuntimeException(this, String.format("新建数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onInsert(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(true);
		if(iSysBDSchemeRuntime!=null) {
			return iSysBDSchemeRuntime.insert(strDocName, arg, extParamMap);
		}
		throw new SysSearchSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object update(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		Assert.hasLength(strDocName, "未传入数据表标识");
		Assert.notNull(arg, "未传入更新数据");
		try {
			return this.onUpdate(strDocName, arg, extParamMap, bAppendMode);
		}
		catch(Throwable ex) {
			SysSearchSchemeRuntimeException.rethrow(this, ex);
			throw new SysSearchSchemeRuntimeException(this, String.format("更新数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onUpdate(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(true);
		if(iSysBDSchemeRuntime!=null) {
			return iSysBDSchemeRuntime.update(strDocName, arg, extParamMap, bAppendMode);
		}
		throw new SysSearchSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public Object delete(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		Assert.hasLength(strDocName, "未传入数据表标识");
		Assert.notNull(arg, "未传入删除数据");
		try {
			return this.onDelete(strDocName, arg, extParamMap);
		}
		catch(Throwable ex) {
			SysSearchSchemeRuntimeException.rethrow(this, ex);
			throw new SysSearchSchemeRuntimeException(this, String.format("删除数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onDelete(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(true);
		if(iSysBDSchemeRuntime!=null) {
			return iSysBDSchemeRuntime.delete(strDocName, arg, extParamMap);
		}
		throw new SysSearchSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Page fetch(String strDocName, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		try {
			return this.onFetch(strDocName, iSearchContext, outputFields, extParamMap);
		}
		catch(Throwable ex) {
			SystemRuntimeException.rethrow(this, ex);
			throw new SysSearchSchemeRuntimeException(this, String.format("获取数据集[%1$s]发生异常，%2$s", strDocName, ex.getMessage()), ex);
		}
	}
	
	protected Page onFetch(String strDocName, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(true);
		if(iSysBDSchemeRuntime!=null) {
			return iSysBDSchemeRuntime.fetch(strDocName, iSearchContext, outputFields, extParamMap);
		}
		throw new SysSearchSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	

	protected String getLogCat() {
		return LogCats.SEARCHSCHEME;
	}
	
	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}
	
	protected void onShutdown() throws Exception{
		
	}
	
	
}
