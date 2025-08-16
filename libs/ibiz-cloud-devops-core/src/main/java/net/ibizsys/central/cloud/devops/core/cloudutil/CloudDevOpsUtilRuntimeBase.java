package net.ibizsys.central.cloud.devops.core.cloudutil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.domain.AppHub;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.DeployApp;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;
import net.ibizsys.central.cloud.core.util.domain.ServiceInstance;
import net.ibizsys.central.cloud.core.util.domain.System;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.devops.core.addin.ICloudDevOpsUtilRTAddin;
import net.ibizsys.central.cloud.devops.core.addin.IDevOpsCodeGenTool;
import net.ibizsys.central.cloud.devops.core.addin.IDevOpsDBTool;
import net.ibizsys.central.cloud.devops.core.addin.IDevOpsDynaModelAPI;
import net.ibizsys.central.cloud.devops.core.addin.IDevOpsPSModelTool;
import net.ibizsys.central.cloud.devops.core.addin.IDevOpsTestTool;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.util.CacheableActionBuilder;
import net.ibizsys.centralstudio.util.PSModelServiceSession;
import net.ibizsys.model.app.PSApplicationImpl;
import net.ibizsys.model.app.PSSubAppRefImpl;
import net.ibizsys.model.app.appmenu.PSAppMenuModelImpl;
import net.ibizsys.model.app.view.PSAppViewImpl;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class CloudDevOpsUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudDevOpsUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudDevOpsUtilRuntimeBase.class);
	
	
	
	/**
     * 云平台发布配置，数据库实例
     */
	public final static String CLOUDPLATFORM_CONFIG_DBINST = "dbinst";
	
    /**
     * 云平台发布配置，Cloud组件
     */
    public final static String CLOUDPLATFORM_CONFIG_CLOUDUTIL = "cloudutil";
    
    /**
     * 云平台发布配置，Cloud配置
     */
    public final static String CLOUDPLATFORM_CONFIG_CLOUDCONF = "cloudconf";
    
    
    /**
     * 云平台发布配置，Cloud节点
     */
    public final static String CLOUDPLATFORM_CONFIG_CLOUDNODE = "cloudnode";
    
    
    /**
     * 云平台服务总线节点模板
     */
    public final static String CONFIGID_SERVICEHUB_X = "x-servicehub";
    
    
    
    /**
     * 子应用菜单标记
     */
    public final static String SUBAPPMENUTAG = "HUBSUBAPP";
    
    
    private static Map<String, String> cloudPlatformConfigMap = new HashMap<String, String>();
    
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudDevOpsUtilRTAddin.class, "TESTTOOL:DEFAULT", "net.ibizsys.central.cloud.devops.metersphere.addin.MeterSphereDevOpsTestTool");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudDevOpsUtilRTAddin.class, "PSMODELTOOL:ODOO", "cn.ibizlab.central.cloud.devops.odoo.addin.OdooDevOpsPSModelTool");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudDevOpsUtilRTAddin.class, "DBTOOL:LIQUIBASE", "net.ibizsys.central.cloud.devops.liquibase.addin.LiquibaseDevOpsDBTool");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudDevOpsUtilRTAddin.class, "CODEGENTOOL:DEFAULT", "net.ibizsys.central.cloud.devops.codegen.addin.DefaultDevOpsCodeGenTool");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudDevOpsUtilRTAddin.class, "DYNAMODELAPI:DEFAULT", "net.ibizsys.central.cloud.devops.dynamodelapi.addin.DefaultDevOpsDynaModelAPI");
		
		cloudPlatformConfigMap.put(CLOUDPLATFORM_CONFIG_DBINST, CLOUDPLATFORM_CONFIG_DBINST);
		cloudPlatformConfigMap.put(CLOUDPLATFORM_CONFIG_CLOUDUTIL, "cloud");
		cloudPlatformConfigMap.put(CLOUDPLATFORM_CONFIG_CLOUDCONF, CLOUDPLATFORM_CONFIG_CLOUDCONF);
	}

	
	
    
	
	/**
	 * 是否处于开发
	 */
	private boolean bDevMode = false;
	
	/**
	 * 开发中心标识
	 */
	private String strDevCenterId = null;
	

	private String strModelPath = null;
	
	private String strAppGatewayId = null;
	
	private String strDynaModelPath = null;
	
	private String strPSModelAPIUrl = null;
	
	private String strPSModelAPITokenUrl = null;
	
	private String strPSModelAPIUserName = null;
	
	private String strPSModelAPIPassword = null;
	
	private String strCallbackToken = null;
	
	private Map<String, AppHub> appHubMap = new ConcurrentHashMap<String, AppHub>();
	//private Map <String, String> cloudAppConfigMap = new ConcurrentHashMap<String, String>();
	
	
	
	@Override
	protected ICloudUtilRuntimeContext createModelRuntimeContext() {
		return new CloudDevOpsUtilRuntimeContextBase<ICloudDevOpsUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()){
			@Override
			public IWebClientRep<String> invokeDCSystemDevOpsAction(String strDCSystemId, String strMethod, Object params, String strKey) {
				return getSelf().invokeDCSystemDevOpsAction(strDCSystemId, strMethod, params, strKey);
			}
			
			@Override
			public PSModelServiceSession openPSModelServiceSession() {
				return getSelf().openPSModelServiceSession();
			}
		};
	}
	
	@Override
	protected ICloudDevOpsUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudDevOpsUtilRuntimeContext)super.getModelRuntimeContext();
	}
	
	
	private CloudDevOpsUtilRuntimeBase getSelf() {
		return this;
	}
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}
	
	@Override
	protected void onInstall() throws Exception {
		
		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudDevOpsUtilRTAddin.class, null);
		
		super.onInstall();
	}
	
	@Override
	protected boolean isEnableReloadSetting() {
		return true;
	}
	
	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {
		
		super.onReloadSetting(bFirst);
		
		Object objDevMode = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".devmode", null);
		String strDevCenterId = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".devcenter", null);
		String strAppGatewayId = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".appgateway", null);
		String strCallbackToken = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".callbacktoken", null);
		
		
		if(!ObjectUtils.isEmpty(objDevMode)) {
			this.setDevMode(objDevMode.toString().equalsIgnoreCase("true"));
		}
		else {
			this.setDevMode(false);
		}
		
		if(this.isDevMode()) {
			this.setDevCenterId(strDevCenterId);
			this.setAppGatewayId(strAppGatewayId);
			this.setCallbackToken(strCallbackToken);
		}
		
		String strModelPath = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".modelpath", null);
		this.setModelPath(strModelPath);
		
		String strDynaModelPath = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dynamodelpath", null);
		this.setDynaModelPath(strDynaModelPath);
		
		//平台模型服务接口相关
		String strPSModelAPIUrl = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".psmodelapiurl", null);
		this.setPSModelAPIUrl(strPSModelAPIUrl);
		
		String strPSModelAPITokenUrl = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".psmodelapitokenurl", null);
		this.setPSModelAPITokenUrl(strPSModelAPITokenUrl);
		
		String strPSModelAPIUserName = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".psmodelapiusername", null);
		this.setPSModelAPIUserName(strPSModelAPIUserName);
		
		String strPSModelAPIPassword = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".psmodelapipassword", null);
		this.setPSModelAPIPassword(strPSModelAPIPassword);
		
		
	}
	
	
	protected boolean isDevMode() {
		return bDevMode;
	}

	protected void setDevMode(boolean bDevMode) {
		this.bDevMode = bDevMode;
	}

	protected String getDevCenterId() {
		return strDevCenterId;
	}

	protected void setDevCenterId(String strDevCenterId) {
		this.strDevCenterId = strDevCenterId;
	}
	

	protected String getModelPath() {
		return strModelPath;
	}


	protected void setModelPath(String strModelPath) {
		this.strModelPath = strModelPath;
	}
	
	protected String getDynaModelPath() {
		return strDynaModelPath;
	}


	protected void setDynaModelPath(String strDynaModelPath) {
		this.strDynaModelPath = strDynaModelPath;
	}
	
	
	public String getAppGatewayId() {
		return strAppGatewayId;
	}

	protected void setAppGatewayId(String strAppGatewayId) {
		this.strAppGatewayId = strAppGatewayId;
	}
	
	
	@Override
	public boolean isEnableDevCallback() {
		return this.isDevMode();
	}


	@Override
	public String getCallbackToken() {
		return this.strCallbackToken;
	}
	
	protected void setCallbackToken(String strCallbackToken) {
		this.strCallbackToken = strCallbackToken;
	}

	protected String getPSModelAPIUrl() {
		return strPSModelAPIUrl;
	}

	protected void setPSModelAPIUrl(String strPSModelAPIUrl) {
		this.strPSModelAPIUrl = strPSModelAPIUrl;
	}

	protected String getPSModelAPIUserName() {
		return strPSModelAPIUserName;
	}

	protected void setPSModelAPIUserName(String strPSModelAPIUserName) {
		this.strPSModelAPIUserName = strPSModelAPIUserName;
	}

	protected String getPSModelAPIPassword() {
		return strPSModelAPIPassword;
	}

	protected void setPSModelAPIPassword(String strPSModelAPIPassword) {
		this.strPSModelAPIPassword = strPSModelAPIPassword;
	}
	
	

	protected String getPSModelAPITokenUrl() {
		return strPSModelAPITokenUrl;
	}

	protected void setPSModelAPITokenUrl(String strPSModelAPITokenUrl) {
		this.strPSModelAPITokenUrl = strPSModelAPITokenUrl;
	}

	@Override
	public Object executeDevSystemAction(String strSystemId, String strAction, Map<String, Object> params) {
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		try {
			Employee dcEmployee = new Employee();
			dcEmployee.setUserId("SYSTEM");
			dcEmployee.setUserName("内置用户");
			dcEmployee.setPersonName("内置用户");
			EmployeeContext employeeContext = new EmployeeContext(dcEmployee, null, null);
			UserContext.setCurrent(employeeContext);

			this.getSystemRuntime().logEvent(LogLevels.INFO, LogCats.DEPLOY_DEVCALLBACK, String.format("开发系统[%1$s]回调[%2$s]", strSystemId, strAction), null);
			
			return this.executeAction("执行开发系统操作", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return onExecuteDevSystemAction(strSystemId, strAction, params);
				}
			}, null, Object.class);
		}
		
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
		
	}

	protected Object onExecuteDevSystemAction(String strSystemId, String strAction, Map<String, Object> params) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public Object executeCloudPlatformAction(String strAction, Map<String, Object> params) {
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		try {
			Employee dcEmployee = new Employee();
			dcEmployee.setUserId("SYSTEM");
			dcEmployee.setUserName("内置用户");
			dcEmployee.setPersonName("内置用户");
			EmployeeContext employeeContext = new EmployeeContext(dcEmployee, null, null);
			UserContext.setCurrent(employeeContext);

			this.getSystemRuntime().logEvent(LogLevels.INFO, LogCats.DEPLOY_DEVCALLBACK, String.format("云平台操作[%1$s]", strAction), null);
			
			return this.executeAction("执行云平台操作", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return onExecuteCloudPlatformAction(strAction, params);
				}
			}, null, Object.class);
		}
		
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
		
	}

	protected Object onExecuteCloudPlatformAction(String strAction, Map<String, Object> params) throws Throwable{
		if(CLOUDPLATFORMACTION_PUBCONFIG.equalsIgnoreCase(strAction)) {
			return this.onExecuteCloudPlatformPubConfig(params);
		}
		throw new Exception(String.format("无法识别的云平台操作[%1$s]", strAction));
	}
	
	protected Object onExecuteCloudPlatformPubConfig(Map<String, Object> params)throws Throwable{
		
		Map<String, Object> confItemMap = new HashMap<String, Object>();
		Map<String, Object> nodeMap = null;
		for(java.util.Map.Entry<String, Object> entry : params.entrySet()) {
			Map<String, Object> valueMap = null;
			if(entry.getValue() instanceof Map) {
				valueMap = (Map<String, Object>)entry.getValue();
			}
			if(valueMap == null) {
				continue;
			}
			
			if(CLOUDPLATFORM_CONFIG_CLOUDNODE.equals(entry.getKey())) {
				nodeMap = valueMap;
				continue;
			}
			
			//转化实际键值
			String strKey = cloudPlatformConfigMap.get(entry.getKey());
			if(!StringUtils.hasLength(strKey)) {
				log.warn(String.format("无法识别的Cloud平台配置节点[%1$s]", entry.getKey()));
				continue;
			}
			
			boolean bAppendPKey = !(CLOUDPLATFORM_CONFIG_CLOUDCONF.equalsIgnoreCase(strKey));
			
			for(java.util.Map.Entry<String, Object> entry2 : valueMap.entrySet()) {
				
				if(entry2.getValue() == null) {
					continue;
				}
				
				String strConfigItem =  bAppendPKey? String.format("%1$s-%2$s", strKey, entry2.getKey()):entry2.getKey();
				if(!bAppendPKey) {
					//自定义配置
					confItemMap.put(strConfigItem, entry2.getValue());
				}
				else {
					if(confItemMap.containsKey(strConfigItem)) {
						log.warn(String.format("配置项[%1$s]已定义，忽略发布", strConfigItem));
						continue;
					}
				}
				
				if(entry2.getValue() instanceof Map) {
					ServiceHub.getInstance().publishConfig(strConfigItem, (Map)entry2.getValue());
					continue;
				}
				
				if(entry2.getValue() instanceof String) {
					ServiceHub.getInstance().publishConfig(strConfigItem, (String)entry2.getValue());
					continue;
				}
				
				ServiceHub.getInstance().publishConfig(strConfigItem, entry2.getValue().toString());
			}
		}
		
		Map<String,String> deploySystemIdMap = new HashMap<String, String>();
		
		if(!ObjectUtils.isEmpty(nodeMap)) {
			//读出模板配置
			String strConfig = ServiceHub.getInstance().getConfig(CONFIGID_SERVICEHUB_X);
			if(!StringUtils.hasLength(strConfig)) {
				throw new Exception(String.format("Cloud未定义服务总线（ServiceHub）配置"));
			}
			
			ConfigEntity configEntity = new ConfigEntity(strConfig);
			
			
			for(java.util.Map.Entry<String, Object> entry : nodeMap.entrySet()) {
				if(!(entry.getValue() instanceof List)) {
					continue;
				}
				
				List list = (List)entry.getValue();
				if(ObjectUtils.isEmpty(list)) {
					continue;
				}
				
				Map<String, String> deploySystemMap = new LinkedHashMap<String, String>();
				for(Object item : list) {
					if(!(item instanceof Map)) {
						continue;
					}
					
					Map map = (Map)item;
					Object systemid = map.get("systemid");
					Object apiname = map.get("apiname");
					
					if(ObjectUtils.isEmpty(systemid) || ObjectUtils.isEmpty(apiname)) {
						continue;
					}
					
					deploySystemIdMap.put((String)systemid, "");
					
					String strLastAPINames = deploySystemMap.get(systemid);
					if(StringUtils.hasLength(strLastAPINames)) {
						if(!"*".equals(strLastAPINames)) {
							if(!"*".equals(apiname)) {
								strLastAPINames += ";";
								strLastAPINames += apiname.toString();
							}
							else {
								strLastAPINames = "*";
							}
						}
					}else {
						strLastAPINames = apiname.toString();
					}
					deploySystemMap.put((String)systemid, strLastAPINames);
				}
				
				if(ObjectUtils.isEmpty(deploySystemMap)) {
					continue;
				}
				
				Map<String, Object> map = new HashMap<String, Object>();
				if(configEntity.any()!=null) {
					map.putAll(configEntity.any());
				}
				
				List deploySystemList = null;
				Object deploysystems = map.get("deploysystems");
				if(!(deploysystems instanceof List)) {
					deploySystemList = new ArrayList<Object>();
					map.put("deploysystems", deploySystemList);
				}
				else {
					deploySystemList = (List)deploysystems;
				}
				
				for(java.util.Map.Entry<String, String> entry2 : deploySystemMap.entrySet()) {
					if("*".equalsIgnoreCase(entry2.getValue())) {
						deploySystemList.add(entry2.getKey());
					}
					else {
						deploySystemList.add(String.format("%1$s:%2$s", entry2.getKey(), entry2.getValue()));
					}
				}
				
				//发布配置
				String strConfigItem = String.format("servicehub-%1$s", entry.getKey());
				if(confItemMap.containsKey(strConfigItem)) {
					log.warn(String.format("配置项[%1$s]已定义，忽略发布", strConfigItem));
					continue;
				}
				
				ServiceHub.getInstance().publishConfig(strConfigItem, map);
			}
		}
		
		
		
		return null;
	}
	
	
	@Override
	public void publishSystem(String strSystemId, Map<String, Object> params) {
		try {
			this.executeAction("发布系统", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					onPublishSystem(strSystemId, params);
					return null;
				}
			});
			this.getSystemRuntime().logEvent(LogLevels.INFO, LogCats.DEPLOY_PUBLISHSYSTEM, String.format("发布系统[%1$s]成功", strSystemId), null);
		}
		catch (RuntimeException ex) {
			this.getSystemRuntime().logEvent(LogLevels.ERROR, LogCats.DEPLOY_PUBLISHSYSTEM, String.format("发布系统[%1$s]发生异常，%2$s", strSystemId, ex.getMessage()), ex);
			throw ex;
		}
		
	}
	
	protected void onPublishSystem(String strSystemId, Map<String, Object> params) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public String getSystemModelDigest(String strSystemId) {
		return this.executeAction("获取系统模型摘要信息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetSystemModelDigest(strSystemId);
			}
		}, null, String.class);
	}
	
	protected String onGetSystemModelDigest(String strSystemId) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getSystem(strSystemId).getMD5Check();
	}
	
	
	@Override
	public System getSystem(String strSystemId) {
		return this.executeAction("获取系统信息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetSystem(strSystemId);
			}
		}, null, System.class);
	}
	
	protected System onGetSystem(String strSystemId) throws Throwable{
		System retSystem = new System();
		System system =  this.getCloudSaaSUtilRuntime().getSystem(strSystemId);
		this.fillSystem(system, retSystem);
		return retSystem;
	}
	
	protected void fillSystem(System srcSystem, System dstSystem) {
		dstSystem.setSystemId(srcSystem.getSystemId());
		dstSystem.setSystemName(srcSystem.getSystemName());
	}
	
	@Override
	public Collection<System> getAllSystems() {
		return this.executeAction("获取系统集合", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAllSystems();
			}
		}, null, SystemListType);
	}
	
	protected Collection<System> onGetAllSystems() throws Throwable{
		List<System> systemList = new ArrayList<System>();
		Collection<System> srcSystemList = this.getCloudSaaSUtilRuntime().getAllSystems();
		if(!ObjectUtils.isEmpty(srcSystemList)) {
			for(System system : srcSystemList) {
				if(!StringUtils.hasLength(system.getSystemId())) {
					continue;
				}
				if(system.getSystemId().length() > ICloudSaaSUtilRuntime.MAXSERVICEIDLENGTH) {
					continue;
				}
				System retSystem = new System();
				this.fillSystem(system, retSystem);
				systemList.add(retSystem);
			}
		}
		return systemList;
	}
	
	@Override
	public Object executeSystemAction(String strSystemId, String strMethod, Object params, String strKey) {
		Object objRet = null;
		try {
			objRet = this.executeAction("执行系统作业", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return onExecuteSystemAction(strSystemId, strMethod, params, strKey, false);
				}
			}, null, Object.class);
			this.getSystemRuntime().logEvent(LogLevels.INFO, LogCats.DEPLOY_EXECUTESYSTEMACTION, String.format("执行系统[%1$s]作业[%2$s]成功", strSystemId, strMethod), null);
		}
		catch (RuntimeException ex) {
			this.getSystemRuntime().logEvent(LogLevels.ERROR, LogCats.DEPLOY_EXECUTESYSTEMACTION, String.format("执行系统[%1$s]作业[%2$s]发生异常，%3$s", strSystemId, strMethod, ex.getMessage()), ex);
			throw ex;
		}
		return objRet;
	}
	
	@Override
	public Object executeDebugSystemAction(String strSystemId, String strMethod, Object params, String strKey) {
		Object objRet = null;
		try {
			objRet = this.executeAction("执行调试系统作业", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return onExecuteSystemAction(strSystemId, strMethod, params, strKey, true);
				}
			}, null, Object.class);
			this.getSystemRuntime().logEvent(LogLevels.INFO, LogCats.DEPLOY_EXECUTEDEBUGSYSTEMACTION, String.format("执行调试系统[%1$s]作业[%2$s]成功", strSystemId, strMethod), null);
		}
		catch (RuntimeException ex) {
			this.getSystemRuntime().logEvent(LogLevels.ERROR, LogCats.DEPLOY_EXECUTEDEBUGSYSTEMACTION, String.format("执行调试系统[%1$s]作业[%2$s]发生异常，%3$s", strSystemId, strMethod, ex.getMessage()), ex);
			throw ex;
		}
		return objRet;
	}
	
	protected Object onExecuteSystemAction(String strSystemId, String strMethod, Object params, String strKey, boolean bDebugMode) throws Throwable{
		
		strSystemId = strSystemId.toLowerCase();
		
		if(SYSTEMACTION_LISTSERVICEINSTANCES.equalsIgnoreCase(strMethod)) {
			return this.onListSystemServiceInstances(strSystemId, bDebugMode);
		}
		
		if(SYSTEMACTION_GENERATECODESNIPPET.equalsIgnoreCase(strMethod)) {
			return this.onGenerateCodeSnippet(strSystemId, (Map)params);
		}
		
		return this.invokeSystemDevOpsAction(strSystemId, strMethod, params, strKey, bDebugMode).getBody();
	}
	
	protected List<ServiceInstance> onListSystemServiceInstances(String strSystemId, boolean bDebugMode)throws Throwable {
		String strServiceId = String.format("servicehub-%1$s", strSystemId);
		if(bDebugMode) {
			strServiceId += "-debug";
		}
		List<ServiceInstance> list = ServiceHub.getInstance().getNamingServiceInstances(strServiceId);
		if(list == null) {
			list = new ArrayList<ServiceInstance>();
		}
		return list;
	}
	
	protected Object onGenerateCodeSnippet(String strSystemId, Map<String, Object> params)throws Throwable {
		throw new Exception("没有实现");
	}
	
	protected IWebClientRep<String> invokeSystemDevOpsAction(String strSystemId, String strMethod, Object params, String strKey, boolean bDebugMode) throws Throwable{
		
		String strUrl = null;
		if(!bDebugMode) {
			if(StringUtils.hasLength(strKey)) {
				strUrl = String.format("lb://servicehub-%1$s/%2$s/devops/%3$s/%4$s", strSystemId, strSystemId, strMethod, strKey);
			}
			else {
				strUrl = String.format("lb://servicehub-%1$s/%2$s/devops/%3$s", strSystemId, strSystemId, strMethod);
			}
			
			try {
				return this.getSysCloudClientUtilRuntime().getServiceClient(strUrl).post(strUrl, null, null, null, params, null, String.class, null);
			}
			catch(Throwable ex) {
				log.error(String.format("%1$s执行系统DevOps操作发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
				throw dealException(String.format("执行系统DevOps操作发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		else {
			if(StringUtils.hasLength(strKey)) {
				strUrl = String.format("lb://servicehub-%1$s-debug/%2$s/devops/%3$s/%4$s", strSystemId, strSystemId, strMethod, strKey);
			}
			else {
				strUrl = String.format("lb://servicehub-%1$s-debug/%2$s/devops/%3$s", strSystemId, strSystemId, strMethod);
			}
			
			try {
				return this.getSysCloudClientUtilRuntime().getServiceClient(strUrl).post(strUrl, null, null, null, params, null, String.class, null);
			}
			catch(Throwable ex) {
				log.error(String.format("%1$s执行调试系统DevOps操作发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
				throw dealException(String.format("执行调试系统DevOps操作发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
	}
	
	
	@Override
	public void publishDCSystem(String strDCSystemId, Map<String, Object> params) {
		try {
			this.executeAction("发布机构系统", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					onPublishDCSystem(strDCSystemId, params);
					return null;
				}
			});
			this.getSystemRuntime().logEvent(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDCSYSTEM, String.format("发布机构系统[%1$s]成功", strDCSystemId), null);
		}
		catch (RuntimeException ex) {
			this.getSystemRuntime().logEvent(LogLevels.ERROR, LogCats.DEPLOY_PUBLISHDCSYSTEM, String.format("发布机构系统[%1$s]发生异常，%2$s", strDCSystemId, ex.getMessage()), ex);
			throw ex;
		}
		
	}
	
	protected void onPublishDCSystem(String strDCSystemId, Map<String, Object> params) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public Object executeDCSystemAction(String strDCSystemId, String strMethod, Object params, String strKey) {
		Object objRet = null;
		try {
			objRet = this.executeAction("执行机构系统作业", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return onExecuteDCSystemAction(strDCSystemId, strMethod, params, strKey);
				}
			}, null, Object.class);
			this.getSystemRuntime().logEvent(LogLevels.INFO, LogCats.DEPLOY_EXECUTEDCSYSTEMACTION, String.format("执行机构系统[%1$s]作业[%2$s]成功", strDCSystemId, strMethod), null);
		}
		catch (RuntimeException ex) {
			this.getSystemRuntime().logEvent(LogLevels.ERROR, LogCats.DEPLOY_EXECUTEDCSYSTEMACTION, String.format("执行机构系统[%1$s]作业[%2$s]发生异常，%3$s", strDCSystemId, strMethod, ex.getMessage()), ex);
			throw ex;
		}
		return objRet;
	
	}
	
	protected Object onExecuteDCSystemAction(String strDCSystemId, String strMethod, Object params, String strKey) throws Throwable{
		
		if(DCSYSTEMACTION_INITTESTPROJECTS.equalsIgnoreCase(strMethod)) {
			return this.onInitTestProjects(strDCSystemId, (Map)params);
		}
		
		
		if(DCSYSTEMACTION_RUNTESTPROJECT.equalsIgnoreCase(strMethod)) {
			return this.onRunTestProject(strDCSystemId, (Map)params);
		}
		
		if(DCSYSTEMACTION_SYNCPSMODELS.equalsIgnoreCase(strMethod)) {
			return this.onSyncPSModels(strDCSystemId, (Map)params);
		}
		
		
//		String strServiceId = this.getCloudSaaSUtilRuntime().getServiceId(strDCSystemId);
//		
//		String strUrl =  String.format("lb://servicehub-%1$s/%2$s/devops/%3$s/%4$s", strServiceId, strServiceId, strMethod, StringUtils.hasLength(strKey)?strKey:"");
//		return this.getSysCloudClientUtilRuntime().getServiceClient(strUrl).post(strUrl, null, null, null, params, null, String.class, null);
		
		throw new Exception(String.format("无法识别的机构系统DevOps操作[%1$s]", strMethod));
	}
	
	
	
	

	

	protected IWebClientRep<String> invokeDCSystemDevOpsAction(String strDCSystemId, String strMethod, Object params, String strKey) {
		
		String strServiceId = this.getCloudSaaSUtilRuntime().getServiceId(strDCSystemId);
		
		String strUrl = null;
		if(StringUtils.hasLength(strKey)) {
			strUrl = String.format("lb://servicehub-%1$s/%2$s/devops/%3$s/%4$s", strServiceId, strServiceId, strMethod, strKey);
		}
		else {
			strUrl = String.format("lb://servicehub-%1$s/%2$s/devops/%3$s", strServiceId, strServiceId, strMethod);
		}
		
		try {
			return this.getSysCloudClientUtilRuntime().getServiceClient(strUrl).post(strUrl, null, null, null, params, null, String.class, null);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s执行机构系统DevOps操作发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("执行机构系统DevOps操作发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
	protected Object onInitTestProjects(String strDCSystemId, Map<String, Object> params) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	protected Object onRunTestProject(String strDCSystemId, Map<String, Object> params) throws Throwable{
		throw new Exception("没有实现");
	}
	
	protected Object onSyncPSModels(String strDCSystemId, Map<String, Object> params) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public void publishDynaModel(String strDynaModelId, Map<String, Object> params) {
		try {
			this.executeAction("发布动态模型", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					onPublishDynaModel(strDynaModelId, params);
					return null;
				}
			});
			this.getSystemRuntime().logEvent(LogLevels.INFO, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("发布动态模型[%1$s]成功", strDynaModelId), null);
		}
		catch (RuntimeException ex) {
			this.getSystemRuntime().logEvent(LogLevels.ERROR, LogCats.DEPLOY_PUBLISHDYNAMODEL, String.format("发布动态模型[%1$s]发生异常，%2$s", strDynaModelId, ex.getMessage()), ex);
			throw ex;
		}
		
	}
	
	protected void onPublishDynaModel(String strDynaModelId, Map<String, Object> params) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public String getMetaDynaModelPath(String strSystemId, String strOrgId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定系统动态模型路径", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), MetaDynaModel.class.getSimpleName()))
						.tags("path", strSystemId, strOrgId, ServiceHub.getInstance().getIPAddress())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetMetaDynaModelPath(strSystemId, strOrgId);
								//return "E:\\Workspace\\idea\\LS\\ls-core\\src\\main\\resources\\model\\com\\sa\\szpg";
							}
						}).build().get(String.class);
			}
		}, null, String.class);
	}
	
	protected String onGetMetaDynaModelPath(String strSystemId, String strOrgId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public String getMetaDynaModelPath(String strDCSystemId) {
		return this.executeAction("获取指定系统动态模型路径", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetMetaDynaModelPath(strDCSystemId);
			}
		}, null, String.class);
	}
	
	protected String onGetMetaDynaModelPath(String strDCSystemId) throws Throwable{
		
		if (!StringUtils.hasLength(strDCSystemId)) {
			throw new Exception("未指定机构系统");
		}

		DCSystem dcSystem = this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);

		//模仿机构身份
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		try {
			Employee employee = new Employee();
			employee.setUserId("SYSTEM");
			employee.setUserName("内置用户");
			employee.setPersonName("内置用户");
			employee.setSrfdcid(dcSystem.getSrfdcid());

			EmployeeContext employeeContext = new EmployeeContext(employee, null, null);
			UserContext.setCurrent(employeeContext);
			
			return getMetaDynaModelPath(dcSystem.getSystemId(), dcSystem.getOrgId());
			
		} catch (Throwable ex) {
			throw ex;
		} finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	
	@Override
	public MetaDynaModel getMetaDynaModel(String strSystemId, String strOrgId) {
		return this.executeAction("获取系统动态模型", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetMetaDynaModel(strSystemId, strOrgId);
			}
		}, null, MetaDynaModel.class);
	}
	
	protected MetaDynaModel onGetMetaDynaModel(String strSystemId, String strOrgId)throws Throwable{
		return this.getCloudSaaSUtilRuntime().getMetaDynaModel(strSystemId, strOrgId);
	}
	
	@Override
	public DCSystem getDCSystem(String strDCSystemId) {
		return this.executeAction("获取机构系统", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetDCSystem(strDCSystemId);
			}
		}, null, DCSystem.class);
	}
	
	protected DCSystem onGetDCSystem(String strDCSystemId)throws Throwable{
		return this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);
	}
	

	protected Collection<WFGroup> getAllWFGroups(){
		return this.getCloudSaaSUtilRuntime().getAllWFGroups();
	}
	
	@Override
	public File getHubAppDynaModelFile(String strSystemId, String strOrgId, String strAppId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return (File)this.executeAction("获取指定总线应用动态模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetHubAppDynaModelFile(strSystemId, strOrgId, strAppId);
			}
		}, null);
	}
	
	protected File onGetHubAppDynaModelFile(String strSystemId, String strOrgId, String strAppId)throws Throwable{
		
		String strMetaDynaModelPath = this.getMetaDynaModelPath(strSystemId, strOrgId);
		String strAppModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.json", strMetaDynaModelPath, File.separator, strAppId);
		File file = new File(strAppModelPath);
		if(!file.exists()) {
			throw new Exception(String.format("部署应用[%1$s:%2$s]模型文件不存在", strSystemId, strAppId));
		}
		
		String strHubAppModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.hub.json", strMetaDynaModelPath, File.separator, strAppId);
		File hubAppModelFile = new File(strHubAppModelPath);
		
		AppHub appHub = this.getCloudSaaSUtilRuntime().getAppHub(strSystemId, strAppId);
		AppHub lastAppHub = this.appHubMap.get(appHub.getAppHubId());
		if(lastAppHub == appHub) {
			//判断文件是否存在
			if(hubAppModelFile.exists()) {
				return hubAppModelFile;
			}
		}
		
		ObjectNode appNode = (ObjectNode)JsonUtils.getMapper().readTree(file);
		ArrayNode subAppRefsNode = appNode.putArray(PSApplicationImpl.ATTR_GETALLPSSUBAPPREFS);
		
		List<DeployApp> deployAppList = appHub.getDeployApps();
		
		if(!ObjectUtils.isEmpty(deployAppList)) {
			
			Map<ObjectNode, ObjectNode> subAppRefNodeMap = new LinkedHashMap<ObjectNode, ObjectNode>();
			Map<String, ObjectNode> appViewRefNodeMap = new HashMap<String, ObjectNode>();
			
			for(DeployApp deployApp : deployAppList) {
				String strSubAppDynaModelPath = this.getMetaDynaModelPath(deployApp.getDeploySystemId(), strOrgId);
				String strSubAppModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.json", strSubAppDynaModelPath, File.separator, deployApp.getAppId());
				file = new File(strSubAppModelPath);
				if(!file.exists()) {
					throw new Exception(String.format("部署应用[%1$s:%2$s]模型文件不存在", deployApp.getDeploySystemId(), deployApp.getAppId()));
				}
				
				ObjectNode subAppRefNode = subAppRefsNode.addObject();
				subAppRefNode.put(PSSubAppRefImpl.ATTR_GETID, deployApp.getDeployAppId());
				if(StringUtils.hasLength(deployApp.getServiceId())) {
					if(!deployApp.getServiceId().equals(deployApp.getDeployAppId())) {
						subAppRefNode.put(PSSubAppRefImpl.ATTR_GETSERVICEID, deployApp.getServiceId());
					}
				}
				
				String strHubSubAppModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.hubsubapp.json", strSubAppDynaModelPath, File.separator, deployApp.getAppId());
				File file2 = new File(strHubSubAppModelPath);
				if(file2.exists()) {
					ObjectNode subAppNode = (ObjectNode)JsonUtils.getMapper().readTree(file2);
					if(subAppNode.has(PSSubAppRefImpl.ATTR_GETALLPSAPPDEUIACTIONGROUPS)) {
						JsonNode jsonNode = subAppNode.get(PSSubAppRefImpl.ATTR_GETALLPSAPPDEUIACTIONGROUPS);
						subAppRefNode.put(PSSubAppRefImpl.ATTR_GETALLPSAPPDEUIACTIONGROUPS, jsonNode);
					}
					
					if(subAppNode.has(PSSubAppRefImpl.ATTR_GETALLPSDEDRCONTROLS)) {
						JsonNode jsonNode = subAppNode.get(PSSubAppRefImpl.ATTR_GETALLPSDEDRCONTROLS);
						subAppRefNode.put(PSSubAppRefImpl.ATTR_GETALLPSDEDRCONTROLS, jsonNode);
					}
				}
				
				//写入应用模型所在系统模型标记
				MetaDynaModel metaDynaModel = this.getCloudSaaSUtilRuntime().getMetaDynaModel(deployApp.getDeploySystemId(), strOrgId);
				if (StringUtils.hasLength(metaDynaModel.getModelFile())) {
					String strModelStamp = KeyValueUtils.genUniqueId(metaDynaModel.getModelFile());
					subAppRefNode.put("dynamodeltag", strModelStamp);
					subAppRefNode.put(PSSubAppRefImpl.ATTR_GETMODELSTAMP, strModelStamp);
				}
				
				String strSubAppMenuTag = deployApp.getSubAppMenuTag();
				if(!StringUtils.hasLength(strSubAppMenuTag)) {
					strSubAppMenuTag = SUBAPPMENUTAG;
				}
				
				ObjectNode subAppNode = (ObjectNode)JsonUtils.getMapper().readTree(file);
				
				//获取子菜单
				if(subAppNode.has(PSApplicationImpl.ATTR_GETALLPSAPPMENUMODELS)) {
					ArrayNode arrayNode = (ArrayNode)subAppNode.get(PSApplicationImpl.ATTR_GETALLPSAPPMENUMODELS);
					for(int i =0;i<arrayNode.size();i++) {
						
						ObjectNode appMenuRefNode = (ObjectNode)arrayNode.get(i);
						JsonNode nameNode = appMenuRefNode.get(PSAppMenuModelImpl.ATTR_GETNAME);
						if(nameNode == null) {
							continue;
						}
						
						String strName = nameNode.asText();
						if(strSubAppMenuTag.equalsIgnoreCase(strName)) {

							//获取节点
							String strSubAppMenuModelPath = String.format("%1$s%2$s%3$s", strSubAppDynaModelPath, File.separator, appMenuRefNode.get("path").asText());
							file = new File(strSubAppMenuModelPath);
							if(!file.exists()) {
								throw new Exception(String.format("部署应用[%1$s:%2$s]菜单[%3$s]模型文件不存在", deployApp.getDeploySystemId(), deployApp.getAppId(), strName));
							}
							
							ObjectNode subAppMenuNode = (ObjectNode)JsonUtils.getMapper().readTree(file);
							subAppRefNode.put(PSSubAppRefImpl.ATTR_GETPSAPPMENUMODEL, subAppMenuNode);
							
							break;
						}
					}
				}
				
				if(subAppNode.has(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS)) {
					ArrayNode arrayNode = (ArrayNode)subAppNode.get(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS);
					for(int i =0;i<arrayNode.size();i++) {
						
						ObjectNode appViewRef = (ObjectNode)arrayNode.get(i);
						
						JsonNode typeNode = appViewRef.get(PSAppViewImpl.ATTR_GETVIEWTYPE);
						if(typeNode == null) {
							continue;
						}
						
						if("DESUBAPPREFVIEW".equals(typeNode.asText())) {
							continue;
						}
						
						JsonNode pathNode = appViewRef.get("path");
						if(pathNode == null) {
							continue;
						}

						String strPath = pathNode.asText();
						String[] items = strPath.split("[/]");
						if(items.length != 4) {
							continue;
						}
						strPath = String.format("%1$s/%2$s", items[2], items[3]);
						
						int nPriority = -1;
						if(appViewRef.has(PSAppViewImpl.ATTR_GETPRIORITY)) {
							nPriority = appViewRef.get(PSAppViewImpl.ATTR_GETPRIORITY).asInt();
						}
						
						ObjectNode lastViewRef = appViewRefNodeMap.get(strPath);
						if(lastViewRef != null) {
							int nLastPriority = -1;
							if(lastViewRef.has(PSAppViewImpl.ATTR_GETPRIORITY)) {
								nLastPriority = lastViewRef.get(PSAppViewImpl.ATTR_GETPRIORITY).asInt();
							}
							if(nPriority >=10 && (nLastPriority == -1 || nPriority< nLastPriority)){
								appViewRefNodeMap.put(strPath, appViewRef);
							}
						}
						else {
							appViewRefNodeMap.put(strPath, appViewRef);
						}
					}
				}
				
				subAppRefNodeMap.put(subAppRefNode, subAppNode);
			}
			
			//构建应用视图清单
			for(java.util.Map.Entry<ObjectNode, ObjectNode> entry : subAppRefNodeMap.entrySet()) {
				
				if(entry.getValue().has(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS)) {
					
					ArrayNode subAppViewRefsNode = entry.getKey().putArray(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS);
					
					
					ArrayNode arrayNode = (ArrayNode)entry.getValue().get(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS);
					for(int i =0;i<arrayNode.size();i++) {
						
						ObjectNode appViewRef = (ObjectNode)arrayNode.get(i);
						
						JsonNode typeNode = appViewRef.get(PSAppViewImpl.ATTR_GETVIEWTYPE);
						if(typeNode == null) {
							continue;
						}
						
						if("DESUBAPPREFVIEW".equals(typeNode.asText())) {
							continue;
						}
						
						JsonNode pathNode = appViewRef.get("path");
						if(pathNode == null) {
							continue;
						}
						
						String strPath = pathNode.asText();
						String[] items = strPath.split("[/]");
						if(items.length != 4) {
							continue;
						}
						strPath = String.format("%1$s/%2$s", items[2], items[3]);
						
						if(appViewRefNodeMap.get(strPath) != appViewRef) {
							continue;
						}
						
						subAppViewRefsNode.add(appViewRef);
					}
				}
			}
			
		}
		
		//重新写文件
		JsonUtils.getMapper().writeValue(hubAppModelFile, appNode);
		//放入映射中
		this.appHubMap.put(appHub.getAppHubId(), appHub);
		
		return hubAppModelFile;
	}
	
	@Override
	public String getHubSubAppDynaModelPath(String strSystemId, String strOrgId, String strAppId, String strSubAppId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return (String)this.executeAction("获取指定子应用动态模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetHubSubAppDynaModelPath(strSystemId, strOrgId, strAppId, strSubAppId);
			}
		}, null);
	}
	
	
	protected String onGetHubSubAppDynaModelPath(String strSystemId, String strOrgId, String strAppId, String strSubAppId) throws Throwable{
		
		AppHub appHub = this.getCloudSaaSUtilRuntime().getAppHub(strSystemId, strAppId);
		List<DeployApp> deployApps = appHub.getDeployApps();
		if(!ObjectUtils.isEmpty(deployApps)) {
			for(DeployApp deployApp : deployApps) {
				if(deployApp.getDeployAppId().equalsIgnoreCase(strSubAppId)) {
					return this.getMetaDynaModelPath(deployApp.getDeploySystemId(), strOrgId) + "/PSSYSAPPS/" + deployApp.getAppId();
				}
			}
		}
		
		throw new Exception(String.format("指定子应用[%1$s]不存在", strSubAppId));
	}

	@Override
	public Object invokeDynaModelAPI(String strSystemId, String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param) {
		return this.executeAction("调用动态模型接口", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onInvokeDynaModelAPI(strSystemId, strPModel, strPKey, strModel, strMethod, strKey, param);
			}
		}, null, Object.class);
	}
	
	
	protected Object onInvokeDynaModelAPI(String strSystemId, String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param) throws Throwable{
		throw new Exception("没有实现");
	}
	
	

	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}
	
	
	protected IDevOpsTestTool getDefaultTestTool() {
		return this.getDefaultTestTool(false);
	}
	
	protected IDevOpsTestTool getDefaultTestTool(boolean bTryMode) {
		
		IDevOpsTestTool iDevOpsTestTool = this.getAddinRepo().getAddin(IDevOpsTestTool.class, "TESTTOOL:DEFAULT", true);
		if(iDevOpsTestTool != null || bTryMode) {
			return iDevOpsTestTool;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未定义默认测试工具"));
	}
	
	
	protected IDevOpsTestTool getTestTool(String strMode, boolean bTryMode) {
		
		IDevOpsTestTool iDevOpsTestTool = this.getAddinRepo().getAddin(IDevOpsTestTool.class, String.format("TESTTOOL:%1$s", strMode).toUpperCase(), true);
		if(iDevOpsTestTool != null || bTryMode) {
			return iDevOpsTestTool;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未定义测试工具[%1$s]", strMode));
	}
	
	protected IDevOpsPSModelTool getPSModelTool(String strMode, boolean bTryMode) {
		IDevOpsPSModelTool iDevOpsPSModelTool = this.getAddinRepo().getAddin(IDevOpsPSModelTool.class, String.format("PSMODELTOOL:%1$s", strMode).toUpperCase(), true);
		if(iDevOpsPSModelTool != null || bTryMode) {
			return iDevOpsPSModelTool;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未定义平台模型工具[%1$s]", strMode));
	}
	
	protected IDevOpsDBTool getDBTool(String strMode, boolean bTryMode) {
			
		IDevOpsDBTool iDevOpsDBTool = this.getAddinRepo().getAddin(IDevOpsDBTool.class, String.format("DBTOOL:%1$s", strMode).toUpperCase(), true);
		if(iDevOpsDBTool != null || bTryMode) {
			return iDevOpsDBTool;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未定义数据库工具[%1$s]", strMode));
	}

	protected IDevOpsCodeGenTool getDefaultCodeGenTool() {
		return this.getDefaultCodeGenTool(false);
	}
	
	protected IDevOpsCodeGenTool getDefaultCodeGenTool(boolean bTryMode) {
		
		IDevOpsCodeGenTool iDevOpsCodeGenTool = this.getAddinRepo().getAddin(IDevOpsCodeGenTool.class, "CODEGENTOOL:DEFAULT", true);
		if(iDevOpsCodeGenTool != null || bTryMode) {
			return iDevOpsCodeGenTool;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未定义默认代码生产工具"));
	}
	
	protected IDevOpsDynaModelAPI getDefaultDynaModelAPI() {
		return this.getDefaultDynaModelAPI(false);
	}
	
	protected IDevOpsDynaModelAPI getDefaultDynaModelAPI(boolean bTryMode) {
		
		IDevOpsDynaModelAPI iDevOpsDynaModelAPI = this.getAddinRepo().getAddin(IDevOpsDynaModelAPI.class, "DYNAMODELAPI:DEFAULT", true);
		if(iDevOpsDynaModelAPI != null || bTryMode) {
			return iDevOpsDynaModelAPI;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未定义默认动态模型接口"));
	}
	
	
	
	protected PSModelServiceSession openPSModelServiceSession(){
		
		try {
			PSModelServiceSession psModelServiceSession = PSModelServiceSession.open();
			psModelServiceSession.setServiceUrl(this.getPSModelAPIUrl());
			psModelServiceSession.setAccessTokenUrl(this.getPSModelAPITokenUrl());
			psModelServiceSession.setUserName(this.getPSModelAPIUserName());
			psModelServiceSession.setPassword(this.getPSModelAPIPassword());
			return psModelServiceSession;
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s开启平台模型服务会话发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("开启平台模型服务会话发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_DEVOPS;
	}
	
	
	@Override
	protected String getGlobalConfigId() {
		return CLOUDDEVOPSUTIL_CONFIGFOLDER;
	}
	
	@Override
	public String getLogicName() {
		return String.format("Cloud体系DevOps功能组件[%1$s]", this.getName());
	}
}
