package net.ibizsys.central;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.domain.File;

/**
 * 默认系统网关接口实现
 * 
 * @author lionlau
 *
 */
public class SystemGateway implements ISystemGateway {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemGateway.class);
	
	private static ISystemGateway instance = null;
	
	public static ISystemGateway getInstance() {
		return getInstance(false);
	}
	
	public static ISystemGateway getInstance(boolean bTryMode) {
		if(SystemGateway.instance != null || bTryMode) {
			return SystemGateway.instance;
		}
		throw new RuntimeException("系统网关实例不存在");
	}
	
	protected static void setInstance(ISystemGateway instance) {
		SystemGateway.instance = instance;
	}

	private java.util.Map<String, ISystemRuntime> systemRuntimeMap = new ConcurrentHashMap<String, ISystemRuntime>();
	private java.util.Map<Class<?>, Boolean> multiInstanceModeMap = new HashMap<Class<?>, Boolean>(); 
	private java.util.Map<String, DataSource> dataSourceMap = new HashMap<String, DataSource>();

	private ISystemGatewayContext iSystemGatewayContext = new ISystemGatewayContext() {

		@Override
		public boolean isMultiSystemMode() {
			return getSelf().isMultiSystemMode();
		}
		
		
		@Override
		public IDEService getDEService(String strSystemId, String strDataEntityId) {
			return getSelf().getDEService(strSystemId, strDataEntityId);
		}
		
		@Override
		public net.ibizsys.central.dataentity.IDataEntityRuntime getDataEntityRuntime(String strSystemId, String strDataEntityId) {
			return getSelf().getDataEntityRuntime(strSystemId, strDataEntityId);
		}


		@Override
		public boolean isEnableAppGateway() {
			return getSelf().isEnableAppGateway();
		}


		@Override
		public String getReportFolder() {
			return getSelf().getReportFolder();
		}

		@Override
		public String getFontFolder() {
			return getSelf().getFontFolder();
		}
		

		@Override
		public String getTempFolder() {
			return getSelf().getTempFolder();
		}


		@Override
		public String getFileFolder() {
			return getSelf().getFileFolder();
		}


		@Override
		public boolean isMultiInstanceMode(Class<?> runtimeClass) {
			return getSelf().isMultiInstanceMode(runtimeClass);
		}


		@Override
		public IDEService getDEService(Class<?> runtimeCls, String strDataEntityId, boolean bTryMode) {
			return getSelf().getDEService(runtimeCls, strDataEntityId, bTryMode);
		}


		@Override
		public DataSource getDataSource(String strDSTag, boolean bTryMode) {
			return getSelf().getDataSource(strDSTag, bTryMode);
		}


		@Override
		public DataSource getDefaultDataSource() {
			return getSelf().getDefaultDataSource();
		}
		
		
		
		
	};

	private java.util.Map<String, String> systemModelFolderPath = new ConcurrentHashMap<String, String>();
	
	private java.util.Map<String, IDEService> systemDEServiceMap = new ConcurrentHashMap<String, IDEService>();
	
	/**
	 * 操作参数
	 */
	private Map<String, Object> systemGatewayParamMap = new HashMap<String, Object>();

	private boolean bMultiSystemMode = true;
	
	private boolean bEnableAppGateway = false;
	
	private String strTempFolder = null;
	
	private String strFileFolder = null;
	
	private String strReportFolder = null;

	private String strFontFolder = null;
	
	private DataSource defaultDataSource = null;
	
	private SystemGateway getSelf() {
		return this;
	}
	
	@Override
	public DataSource getDataSource(String strDSTag, boolean bTryMode) {
		DataSource dataSource = null;
		if(StringUtils.hasLength(strDSTag)) {
			dataSource = this.dataSourceMap.get(strDSTag);
		}
		else {
			dataSource = this.getDefaultDataSource();
		}
		if(dataSource != null || bTryMode) {
			return dataSource;
		}
		
		throw new SystemGatewayException(this, String.format("无法获取指定数据源[%1$s]", strDSTag));
	}

	protected void setDataSource(String strDSTag, DataSource dataSource) {
		this.dataSourceMap.put(strDSTag, dataSource);
	}


	@Override
	public DataSource getDefaultDataSource() {
		return this.defaultDataSource;
	}

	protected void setDefaultDataSource(DataSource defaultDataSource) {
		this.defaultDataSource = defaultDataSource;
	}
	
	@Override
	public boolean fillDataSourceInfo(ISysDBSchemeRuntime iSysDBSchemeRuntime) {
		return false;
	}



	@Override
	public Object invokeDEMethod(String strSystemId, String strDataEntityName, String strMethodName, Object objArg, IUserContext iUserContext, Object objTag) throws Throwable {

		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeDEMethod(strDataEntityName, strMethodName, objArg, iUserContext, objTag);

	}

	@Override
	public Object invokeAPIMethod(String strSystemId, String strAPICodeName, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		return invokeAPIMethod(strSystemId, strAPICodeName, null, null, strDataEntityName, strMethodName, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAPIMethod(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIMethod(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strMethodName, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAPIImportData(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIImportData(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, iUserContext, objTag);
	}
	
	@Override
	public Object invokeAPIImportData2(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIImportData2(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, iUserContext, objTag);
	}
	
	
	@Override
	public Object invokeAPIGetImportTemplate(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIGetImportTemplate(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strExportTag, iUserContext, objTag);
	}

	@Override
	public Object invokeAPIExportData(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIExportData(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strExportTag, objBody, iUserContext, objTag);
	}
	
	@Override
	public Object invokeAPIExportData(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIExportData(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strExportTag, strMethodName, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAPIPrintData(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIPrintData(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strPrintTag, strPrintType, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAPIWFStart(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIWFStart(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, iUserContext, objTag);
	}
	
	@Override
	public Object invokeAPIWFCancel(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIWFCancel(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, iUserContext, objTag);
	}

	

	@Override
	public Object invokeBackendTask(String strSystemId, String strTaskType, String strTaskTag, String strDynaInstId, String strParam, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeBackendTask(strTaskType, strTaskTag, strDynaInstId, strParam, iUserContext, objTag);
	}

	protected ISystemGatewayContext getSystemGatewayContext() {
		return iSystemGatewayContext;
	}

	/**
	 * 获取系统运行时对象
	 * 
	 * @param strDeploySystemId
	 * @return
	 * @throws Exception
	 */
	public ISystemRuntime getSystemRuntime(String strDeploySystemId)  {

		ISystemRuntime iSystemRuntime = systemRuntimeMap.get(strDeploySystemId);
		if (iSystemRuntime != null) {
			return iSystemRuntime;
		}

		try {
			// 获取顶级系统模型对象
			IPSSystemService iPSSystemService = getPSSystemService(strDeploySystemId);
			iSystemRuntime = this.createSystemRuntime(iPSSystemService, strDeploySystemId);
			iSystemRuntime.init(getSystemGatewayContext(), iPSSystemService, strDeploySystemId, null);
			systemRuntimeMap.put(strDeploySystemId, iSystemRuntime);
			return iSystemRuntime;
		}
		catch(Exception ex) {
			throw new SystemGatewayException(this, String.format("无法获取指定系统运行时对象[%1$s]，%2$s", strDeploySystemId, ex.getMessage()), ex);
		}
	}
	
	public ISystemRuntime getLoadedSystemRuntime(String strDeploySystemId, boolean bTryMode) {
		ISystemRuntime iSystemRuntime = systemRuntimeMap.get(strDeploySystemId);
		if (iSystemRuntime != null || bTryMode) {
			return iSystemRuntime;
		}
		
		throw new SystemGatewayException(this, String.format("无法获取指定系统运行时对象[%1$s]", strDeploySystemId));
	}

	/**
	 * 获取系统模型服务对象
	 * 
	 * @param strDeploySystemId
	 * @return
	 * @throws Exception
	 */
	protected IPSSystemService getPSSystemService(String strDeploySystemId) throws Exception {

		String strModelFolderPath = this.getSystemModelFolderPath(strDeploySystemId);
		if (!StringUtils.hasLength(strModelFolderPath)) {
			throw new Exception(String.format("无法获取指定部署系统[%1$s]模型路径", strDeploySystemId));
		}
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(strModelFolderPath);

		return psModelServiceImpl;
	}

	/**
	 * 建立系统运行时对象
	 * 
	 * @param iPSSystemService
	 * @return
	 * @throws Exception
	 */
	protected ISystemRuntime createSystemRuntime(IPSSystemService iPSSystemService) throws Exception {
		return new SystemRuntime();
	}
	
	/**
	 * 建立系统运行时对象
	 * 
	 * @param iPSSystemService
	 * @return
	 * @throws Exception
	 */
	protected ISystemRuntime createSystemRuntime(IPSSystemService iPSSystemService, String strDeploySystemId) throws Exception {
		return this.createSystemRuntime(iPSSystemService);
	}
	
	
	

	public void registerSystemModelFolderPath(String strDeploySystemId, String strFolderPath) {
		Assert.hasLength(strDeploySystemId, "必须指定部署系统标识");
		Assert.hasLength(strFolderPath, "必须指定部署系统模型路径");
		this.systemModelFolderPath.put(strDeploySystemId, strFolderPath);
	}

	protected String getSystemModelFolderPath(String strDeploySystemId) {
		return this.systemModelFolderPath.get(strDeploySystemId);
	}

	/**
	 * 注册系统运行时
	 * 
	 * @param strDeploySystemId
	 * @param iSystemRuntime
	 * @throws Exception
	 */
	public void registerSystemRuntime(String strDeploySystemId, ISystemRuntime iSystemRuntime) throws Exception {
		Assert.hasLength(strDeploySystemId, "必须指定部署系统标识");
		Assert.notNull(iSystemRuntime, "必须指定系统运行时对象");
		systemRuntimeMap.put(strDeploySystemId, iSystemRuntime);
	}

	/**
	 * 注销系统运行时
	 * 
	 * @param strDeploySystemId
	 * @throws Exception
	 */
	public void unregisterSystemRuntime(String strDeploySystemId) throws Exception {
		Assert.hasLength(strDeploySystemId, "必须指定部署系统标识");
		systemRuntimeMap.remove(strDeploySystemId);
	}

	@Override
	public boolean isMultiSystemMode() {
		return this.bMultiSystemMode;
	}
	
	
	/**
	 * 设置网关是否处于多系统模式
	 * @param bMultiSystemMode
	 */
	protected void setMultiSystemMode(boolean bMultiSystemMode) {
		this.bMultiSystemMode = bMultiSystemMode;
	}
	
	
	@Override
	public boolean isEnableAppGateway() {
		return this.bEnableAppGateway;
	}
	
	protected void setEnableAppGateway(boolean bEnableAppGateway) {
		this.bEnableAppGateway = bEnableAppGateway;
	}

	@Override
	public void registerDEService(String strSystemId, String strDataEntityId, IDEService iDEService) {
		if(this.isMultiSystemMode()) {
			//多系统运行模式忽略外部注册实体服务对象
			return;
		}
		String strDEServiceTag = String.format("%1$s|%2$s", strSystemId, strDataEntityId);
		this.systemDEServiceMap.put(strDEServiceTag, iDEService);
	}

	@Override
	public IDEService getDEService(String strSystemId, String strDataEntityId) {
//		if(this.isMultiSystemMode()) {
//			ISystemRuntime iSystemRuntime = null;
//			try {
//				iSystemRuntime = this.getSystemRuntime(strSystemId);
//			} catch (Exception e) {
//				throw new SystemGatewayException(this, String.format("无法获取指定系统运行时对象[%1$s]", strSystemId));
//			}
//			return iSystemRuntime.getDEService(strDataEntityId);
//		}
//		else{
//			String strDEServiceTag = String.format("%1$s|%2$s", strSystemId, strDataEntityId);
//			IDEService iDEService =	this.systemDEServiceMap.get(strDEServiceTag);
//			if(iDEService == null) {
//				throw new SystemGatewayException(this, String.format("无法获取指定系统实体服务对象[%1$s][%2$s]", strSystemId, strDataEntityId));
//			}
//			return iDEService;
//		}
		return this.getDEService(strSystemId, strDataEntityId, false);
	}
	
	@Override
	public IDEService getDEService(String strSystemId, String strDataEntityId, boolean bTryMode) {
		if(this.isMultiSystemMode()) {
			ISystemRuntime iSystemRuntime = null;
			try {
				iSystemRuntime = this.getSystemRuntime(strSystemId);
			} catch (Throwable e) {
				throw new SystemGatewayException(this, String.format("无法获取指定系统运行时对象[%1$s]", strSystemId));
			}
			try {
				return iSystemRuntime.getDEService(strDataEntityId);
			}
			catch (Throwable e) {
				if(bTryMode) {
					return null;
				}
				throw e;
			}
		}
		else{
			String strDEServiceTag = String.format("%1$s|%2$s", strSystemId, strDataEntityId);
			IDEService iDEService =	this.systemDEServiceMap.get(strDEServiceTag);
			if(iDEService == null) {
				if(bTryMode) {
					return null;
				}
				throw new SystemGatewayException(this, String.format("无法获取指定系统实体服务对象[%1$s][%2$s]", strSystemId, strDataEntityId));
			}
			return iDEService;
		}
	}

	
	@Override
	public void registerDEService(Class<?> runtimeCls, String strDataEntityId, IDEService iDEService) {
		if(this.isMultiInstanceMode(runtimeCls)) {
			//多系统运行模式忽略外部注册实体服务对象
			return;
		}
		String strDEServiceTag = String.format("%1$s|%2$s", runtimeCls.getName(), strDataEntityId);
		this.systemDEServiceMap.put(strDEServiceTag, iDEService);
	}
	
	@Override
	public IDEService getDEService(Class<?> runtimeCls, String strDataEntityId, boolean bTryMode) {
		if(this.isMultiInstanceMode(runtimeCls)) {
			ISystemRuntime iSystemRuntime = null;
			try {
				iSystemRuntime = (ISystemRuntime)this.getSystemRuntime(runtimeCls, false);
			} catch (Throwable e) {
				throw new SystemGatewayException(this, String.format("无法获取指定系统运行时对象[%1$s]", runtimeCls.getName()));
			}
			try {
				return iSystemRuntime.getDEService(strDataEntityId);
			}
			catch (Throwable e) {
				if(bTryMode) {
					return null;
				}
				throw e;
			}
		}
		else{
			String strDEServiceTag = String.format("%1$s|%2$s", runtimeCls.getName(), strDataEntityId);
			IDEService iDEService =	this.systemDEServiceMap.get(strDEServiceTag);
			if(iDEService == null) {
				if(bTryMode) {
					return null;
				}
				throw new SystemGatewayException(this, String.format("无法获取指定系统实体服务对象[%1$s][%2$s]", runtimeCls.getName(), strDataEntityId));
			}
			return iDEService;
		}
	}
	
	

	@Override
	public IDataEntityRuntime getDataEntityRuntime(String strSystemId, String strDataEntityId) {
		ISystemRuntime iSystemRuntime = null;
		try {
			iSystemRuntime = this.getSystemRuntime(strSystemId);
		} catch (Exception e) {
			throw new SystemGatewayException(this, String.format("无法获取指定系统运行时对象[%1$s]", strSystemId));
		}
		return iSystemRuntime.getDataEntityRuntime(strDataEntityId);
	}

	
	@Override
	public <T> T getSystemRuntime(Class<T> cls, boolean bTryMode) {
		
		for(ISystemRuntime iSystemRuntime : systemRuntimeMap.values()) {
			if(cls.isAssignableFrom(iSystemRuntime.getClass())) {
				return (T)iSystemRuntime;
			}
		}
		
		if(bTryMode) {
			return null;
		}
		throw new SystemGatewayException(this, String.format("无法获取指定系统运行时对象[%1$s]", cls.getCanonicalName()));
	}
	
	
	@Override
	public <T> T getSysUtilRuntime(Class<?> systemCls, Class<T> cls, boolean bTryMode) {
		//获取指定系统
		if(systemCls != null) {
			ISystemRuntime iSystemRuntime = (ISystemRuntime)this.getSystemRuntime(systemCls, true);
			if(iSystemRuntime != null) {
				return iSystemRuntime.getSysUtilRuntime(cls, bTryMode);
			}
		}
		
		//循环系统
		for(ISystemRuntime iSystemRuntime : this.getSystemRuntimes()) {
			T t = iSystemRuntime.getSysUtilRuntime(cls, true);
			if(t != null) {
				return t;
			}
		}
		
		if(bTryMode)
			return null;
		throw new SystemGatewayException(this, String.format("无法获取指定系统功能组件运行时对象[%1$s]", cls.getCanonicalName()));
	}
	
	/**
	 * 设置系统网关参数
	 * 
	 * @param strName
	 * @param objValue
	 */
	public void setGatewayParam(String strName, Object objValue) {
		systemGatewayParamMap.put(strName, objValue);
	}

	/**
	 * 移除系统网关参数
	 * 
	 * @param strName
	 * @return
	 */
	public Object removeGatewayParam(String strName) {
		return systemGatewayParamMap.remove(strName);
	}
	
	
	
	/**
	 * 判断是否存在指定系统网关参数
	 * @param strName
	 * @return
	 */
	public boolean containsGatewayParam(String strName){
		return systemGatewayParamMap.containsKey(strName);
	}

	/**
	 * 获取系统网关参数
	 * 
	 * @param strName
	 * @return
	 */
	public Object getGatewayParam(String strName) {
		return systemGatewayParamMap.get(strName);
	}
	
	
	/**
	 * 重置系统网关参数
	 * 
	 * @return
	 */
	public void resetGatewayParams() {
		systemGatewayParamMap.clear();
	}


	@Override
	public Collection<ISystemRuntime> getSystemRuntimes() {
		return this.systemRuntimeMap.values();
	}
	
	
	
	
	@Override
	public Object invokeAppMethod(String strSystemId, String strAppCodeName, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		return invokeAppMethod(strSystemId, strAppCodeName, null, null, strDataEntityName, strMethodName, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAppMethod(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAppMethod(strAppCodeName, strParentDEName, strParentKey, strDataEntityName, strMethodName, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAppImportData(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAppImportData(strAppCodeName, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, iUserContext, objTag);
	}

	@Override
	public Object invokeAppExportData(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAppExportData(strAppCodeName, strParentDEName, strParentKey, strDataEntityName, strExportTag, objBody, iUserContext, objTag);
	}
	
	@Override
	public Object invokeAppExportData(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAppExportData(strAppCodeName, strParentDEName, strParentKey, strDataEntityName, strExportTag, strMethodName, objBody, strKey, iUserContext, objTag);
	}
	

	@Override
	public Object invokeAppPrintData(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAppPrintData(strAppCodeName, strParentDEName, strParentKey, strDataEntityName, strPrintTag, strPrintType, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAppWFStart(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAppWFStart(strAppCodeName, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAppWFCancel(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAppWFCancel(strAppCodeName, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, iUserContext, objTag);
	}
	
	
	
	
	@Override
	public Object invokeAPIUploadFile(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIUploadFile(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, iUserContext, objTag);
	}


	@Override
	public Object invokeAPIDownloadFile(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAPIDownloadFile(strAPICodeName, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, iUserContext, objTag);
	}


	@Override
	public Object invokeAppUploadFile(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAppUploadFile(strAppCodeName, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, iUserContext, objTag);
	}


	@Override
	public Object invokeAppDownloadFile(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strSystemId);
		return iSystemRuntime.invokeAppDownloadFile(strAppCodeName, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, iUserContext, objTag);
	}


	public String getReportFolder() {
		return this.strReportFolder;
	}
	
	public void setReportFolder(String strReportFolder) {
		this.strReportFolder = strReportFolder;
	}
	
	
	public String getFontFolder() {
		return this.strFontFolder;
	}
	
	public void setFontFolder(String strFontFolder) {
		this.strFontFolder = strFontFolder;
	}
	
	
	public String getFileFolder() {
		return this.strFileFolder;
	}
	
	public void setFileFolder(String strFileFolder) {
		this.strFileFolder = strFileFolder;
	}
	
	public String getTempFolder() {
		return this.strTempFolder;
	}
	
	public void setTempFolder(String strTempFolder) {
		this.strTempFolder = strTempFolder;
	}
	
	@Override
	public boolean isMultiInstanceMode(Class<?> runtimeClass) {
		Boolean bRet = this.getMultiInstanceMode(runtimeClass);
		if(bRet != null) {
			return bRet;
		}
		return true;
	}
	
	public void setMultiInstanceMode(Class<?> runtimeClass, Boolean bMode) {
		this.multiInstanceModeMap.put(runtimeClass, bMode);
	}
	
	public Boolean getMultiInstanceMode(Class<?> runtimeClass) {
		return this.multiInstanceModeMap.get(runtimeClass);
	}
	
	
	
}
