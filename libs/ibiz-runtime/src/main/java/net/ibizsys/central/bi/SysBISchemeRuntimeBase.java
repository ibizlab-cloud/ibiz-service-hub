package net.ibizsys.central.bi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DBObjNameCaseMode;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.bi.IPSSysBICube;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SysBISchemeRuntimeBase extends SystemModelRuntimeBase implements ISysBISchemeRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysBISchemeRuntimeBase.class);
	
	private IPSSysBIScheme iPSSysBIScheme = null;
	
	private String strServiceUrl = null;
	
	private String strBIEngineType = null;
		
	private Object objDataSourceTag = null;
	
	private Map<String, Object> properties = null;
	
	private String strClientId = null;

	private String strClientSecret = null;

	private String strAuthMode = null;
	
	private String strAuthParam = null;
	
	private String strAuthParam2 = null;
	
	private String strServiceParam = null;
	
	private String strServiceParam2 = null;
	
//	private String strDBName = null;
//	
//	private static ThreadLocal<String> dbNameThreadLocal = new ThreadLocal<String>();
	
	private String strDBObjNameCase = DBObjNameCaseMode.LCASE.value;
	
	private DBObjNameCaseMode dbObjNameCaseMode = DBObjNameCaseMode.LCASE;
	
	//private ISysBDSchemeRuntime iSysBDSchemeRuntime = null;
	
	private Map<String, ISysBICubeRuntime> sysBICubeRuntimeMap = new HashMap<String, ISysBICubeRuntime>();
	
	private boolean bInstalled = false;
	
	private boolean bUpdateSchema = true;
	
	//private IPSSysBDScheme iPSSysBDScheme = null;
	
	
//	/**
//	 * 设置当前数据库名称
//	 * @param strDBName
//	 */
//	public static void setCurrentDBName(String strDBName) {
//		dbNameThreadLocal.set(strDBName);
//	}
//	
//	
//	/**
//	 * 设置当前数据库名称
//	 * @return
//	 */
//	public static String getCurrentDBName() {
//		return dbNameThreadLocal.get();
//	}
	
	
	private ISysBISchemeRuntimeContext iSysBISchemeRuntimeContext = new ISysBISchemeRuntimeContext() {

		@Override
		public ISysBISchemeRuntime getModelRuntime() {
			return getSelf();
		}
		
	};
	
	
	/**
	 * 获取智能报表体系的配置目录
	 * @param iPSSysBIScheme
	 * @return
	 */
	public static String getConfigFolder(IPSSysBIScheme iPSSysBIScheme) {
		if(iPSSysBIScheme.getPSSysModelGroup()!= null) {
			return ISystemRuntimeSetting.CONFIGFOLDER_SYSBISCHEME + "." + PSModelUtils.calcUniqueTag(iPSSysBIScheme.getPSSysModelGroup(), iPSSysBIScheme.getCodeName());
		}
		else {
			return ISystemRuntimeSetting.CONFIGFOLDER_SYSBISCHEME + "." + PSModelUtils.calcUniqueTag(iPSSysBIScheme.getPSSystemModule(), iPSSysBIScheme.getCodeName());
		}
	}
	
	
	
	
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysBIScheme iPSSysBIScheme) throws Exception {
		Assert.notNull(iSystemRuntimeContext, "传入系统运行时上下文对象无效");
		Assert.notNull(iPSSysBIScheme, "传入智能报表体系模型对象无效");
		this.setSystemRuntimeBase(iSystemRuntimeContext.getSystemRuntime());
		this.iPSSysBIScheme = iPSSysBIScheme;
		
		this.setConfigFolder(getConfigFolder(iPSSysBIScheme));
		
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
	
//		if(StringUtils.hasLength(this.getPSSysBIScheme().getCodeName())) {
//			this.setDBName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbname", this.getPSSysBIScheme().getCodeName().toLowerCase()));
//		}
//		else {
//			this.setDBName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbname", null));
//		}
		
		this.setServiceUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceurl", this.getPSSysBIScheme().getServicePath()));
		
		this.setAuthMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authmode", this.getPSSysBIScheme().getAuthMode()));
		this.setClientId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientid", this.getPSSysBIScheme().getAuthClientId()));
		this.setClientSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientsecret", this.getPSSysBIScheme().getAuthClientSecret()));
		
		this.setAuthParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam", this.getPSSysBIScheme().getAuthParam()));
		this.setAuthParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam2", this.getPSSysBIScheme().getAuthParam2()));
		
		this.setServiceParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam", this.getPSSysBIScheme().getServiceParam()));
		this.setServiceParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam2", this.getPSSysBIScheme().getServiceParam2()));
		
		this.setDBObjNameCase(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbobjnamecase", this.getPSSysBIScheme().getDBObjNameCase()));
		this.setUpdateSchema(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".updateschema", this.isUpdateSchema()));
		
		
		
		super.onInit();
	}
	
	

	protected ISysBISchemeRuntimeContext getSysBISchemeRuntimeContext() {
		return this.iSysBISchemeRuntimeContext;
	}
	
	private SysBISchemeRuntimeBase getSelf() {
		return this;
	}
	
	protected ISysBICubeRuntime createSysBICubeRuntime(IPSSysBICube iPSSysBICube) {
		return new SysBICubeRuntime();
	}
	
	
	@Override
	public IPSSysBIScheme getPSSysBIScheme() {
		return this.iPSSysBIScheme;
	}

	@Override
	public String getBIEngineType() {
		return this.strBIEngineType;
	}
	
	public void setBIEngineType(String strBIEngineType) {
		this.strBIEngineType = strBIEngineType;
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
	
	
//	/**
//	 * 获取当前数据库名称
//	 * @return
//	 */
//	public String getDBName() {
//		String strCurrentDBName = getCurrentDBName();
//		if(StringUtils.hasLength(strCurrentDBName)) {
//			return strCurrentDBName;
//		}
//		return this.strDBName;
//	}
//	
//	protected void setDBName(String strDBName) {
//		this.strDBName = strDBName;
//	}
//	
//	/**
//	 * 获取实际存储的Map数据对象
//	 * @param map
//	 * @return
//	 */
//	protected Map<String, Object> getRealMap(Map<String, Object> map){
//		if(ObjectUtils.isEmpty(map)) {
//			return map;
//		}
//		
//		Map<String, Object> real = new LinkedHashMap<String, Object>();
//		for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
//			if(Entity.KEY.equals(entry.getKey())) {
//				real.put(entry.getKey(), entry.getValue());
//			}
//			else {
//				real.put(getRealDBObjName(entry.getKey()), entry.getValue());
//			}
//		}
//		
//		return real;
//	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysBIScheme();
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
		
		java.util.List<IPSSysBICube> psSysBICubeList = this.getPSSysBIScheme().getAllPSSysBICubes();
		if (!ObjectUtils.isEmpty(psSysBICubeList)) {
			for (IPSSysBICube iPSSysBICube : psSysBICubeList) {
				ISysBICubeRuntime iSysBICubeRuntime = this.createSysBICubeRuntime(iPSSysBICube);
				try {
					iSysBICubeRuntime.init(this.getSysBISchemeRuntimeContext(), iPSSysBICube);
					sysBICubeRuntimeMap.put(iPSSysBICube.getCodeName().toUpperCase(), iSysBICubeRuntime);
				}
				catch (Exception ex) {
					throw new Exception(String.format("初始化智能报表立方体[%1$s]运行时发生异常，%2$s", iPSSysBICube.getName(), ex.getMessage()), ex);
				}
			}
			
			if(this.isUpdateSchema()) {
				for (IPSSysBICube iPSSysBICube : psSysBICubeList) {
					try {
						updateSchema(iPSSysBICube);
					}
					catch (Exception ex) {
						throw new Exception(String.format("更新智能报表立方体[%1$s]结构发生异常，%2$s", iPSSysBICube.getName(), ex.getMessage()), ex);
					}
				}
			}
		}
		
		
	}
	
	protected void updateSchema(IPSSysBICube iPSSysBICube) throws Exception{
		this.onUpdateSchema(iPSSysBICube);
	}
	
	protected void onUpdateSchema(IPSSysBICube iPSSysBICube) throws Exception{
		
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
			log.error(String.format("卸载智能报表体系[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载智能报表体系[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}
	
	protected void onUninstall() throws Throwable{
		
	}
	
	@Override
	public ISysBICubeRuntime getSysBICubeRuntime(String strBICubeTag, boolean bTryMode) {
		Assert.hasLength(strBICubeTag, "未传入智能报表立方体标记");
		
		ISysBICubeRuntime iSysBICubeRuntime = this.sysBICubeRuntimeMap.get(strBICubeTag.toUpperCase());
		if (iSysBICubeRuntime != null || bTryMode) {
			return iSysBICubeRuntime;
		}
		throw new SysBISchemeRuntimeException(this, String.format("无法获取指定智能报表立方体[%1$s]运行时对象", strBICubeTag));
	}
	
	@Override
	public ISysBICubeRuntime getSysBICubeRuntime(IPSSysBICube iPSSysBICube) {
		Assert.notNull(iPSSysBICube, "未传入智能报表立方体对象");
		
		return this.getSysBICubeRuntime(iPSSysBICube.getName(), false);
	}
	
	
	

	protected String getLogCat() {
		return LogCats.BISCHEME;
	}
	
	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}
	
	protected void onShutdown() throws Exception{
		
	}
	
	
}
