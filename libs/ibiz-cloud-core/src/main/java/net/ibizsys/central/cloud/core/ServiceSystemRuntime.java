package net.ibizsys.central.cloud.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.ba.SysBDSchemeRuntime;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.ai.SysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.ba.CloudOSSBDSchemeRuntime;
import net.ibizsys.central.cloud.core.bi.SysBISchemeRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudPortalClient;
import net.ibizsys.central.cloud.core.database.SysDBSchemeRuntime;
import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEService;
import net.ibizsys.central.cloud.core.eai.SysAIAgentRuntime;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSetting;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.cloud.core.sysutil.IHubSysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUtilContainerOnly;
import net.ibizsys.central.cloud.core.util.ChatResourceUtils;
import net.ibizsys.central.cloud.core.util.ConfigListenerRepo;
import net.ibizsys.central.cloud.core.util.CredentialRepo;
import net.ibizsys.central.cloud.core.util.IChatResourceUtils;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.IConfigListenerRepo;
import net.ibizsys.central.cloud.core.util.ICredentialRepo;
import net.ibizsys.central.cloud.core.util.IRTCodeUtils;
import net.ibizsys.central.cloud.core.util.RTCodeUtils;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.PortalMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalMessageSubType;
import net.ibizsys.central.cloud.core.util.domain.PortalMessageType;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2SystemMerge;
import net.ibizsys.central.cloud.core.util.groovy.ISystemRTGroovyContext;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.system.ISysRefRuntime;
import net.ibizsys.central.system.ISystemModuleUtilRuntime;
import net.ibizsys.central.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.model.res.IPSSysContentCat;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.system.IPSSysRef;
import net.ibizsys.runtime.ISystemEventListener;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.ModelRTScriptBase;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.ModelRuntimeUtils;

public class ServiceSystemRuntime extends ServiceSystemRuntimeBase implements IServiceSystemRuntime {

	private static final Log log = LogFactory.getLog(ServiceSystemRuntime.class);
	
	private static final Object EMPTY = new Object();
	
	private Map<Class<?>, Object> sysUtilRuntimeCacheMap = new HashMap<>();
	
	private boolean bEnableServiceHubAPI = true;
	
	private String strDataFlowSystemId = null;
	
	private String strMainSystemId = null;
	
	private IServiceSystemRuntime mainSystemRuntime = null;
	
	private Collection<IExtensionSysRefRuntime> extensionSysRefRuntimeList = null;
	
	private Collection<IExtensionSysRefRuntime> allExtensionSysRefRuntimeList = null;
	
	private Map<String, IExtensionSysRefRuntime> extensionSysRefRuntimeMap = new LinkedHashMap<String, IExtensionSysRefRuntime>();
	
	//private boolean bEnableExtension = false;
	
	private IRTCodeUtils iRTCodeUtils = null;
	
	private IChatResourceUtils iChatResourceUtils = null;
	
	private V2DeploySystem v2DeploySystem = null;
	
	private V2SystemMerge v2SystemMerge = null;
	
	private String strSystemExtensionConfigId = null;
	
	private String strExtensionSessionId = null;
	
	private String strSystemMergencesConfigId = null;
	
	private String strSystemMergeSessionId = null;
	
	private Map<String, String> mergeSystemConfigMap = new LinkedHashMap<String, String>();
	
	private Map<String, IConfigListener> mergeSystemConfigListenerMap = new ConcurrentHashMap<String, IConfigListener>();
	
	private boolean bUpdateDBSchema = false;
	
	private String strOSSFolder = null;
	
	private Map<String, IPSSysContent> extensionPSSysContentMap = new HashMap<String, IPSSysContent>();
	
	private boolean bHasExtensionPSSysContent = false;
	
	private Map<String, ISysAIFactoryRuntime> sysAIFactoryRuntimeMap = null;
	
	private ConfigListenerRepo configListenerRepo = new ConfigListenerRepo();
	
	private CredentialRepo credentialRepo = new CredentialRepo();
	
	private Map<Class<? extends IProxyDEService>, IProxyDEService> proxyDEServiceMap = new ConcurrentHashMap<Class<? extends IProxyDEService>, IProxyDEService>();
	
	private IConfigListener systemExtensionConfigListener = new IConfigListener() {

		@Override
		public void receiveConfigInfo(String configInfo) {
			try {
				reloadSystemExtension(configInfo);
			} catch (Exception ex) {
				log.error(ex);
			}
		}
	};
	
	private IConfigListener systemMergencesConfigListener = new IConfigListener() {

		@Override
		public void receiveConfigInfo(String configInfo) {
			try {
				reloadSystemMergences(configInfo);
			} catch (Exception ex) {
				log.error(ex);
			}
		}
	};
	
	
	@Override
	public boolean isEnableRTCodeMode() {
		return ServiceHub.getInstance().isEnableRTCodeMode();
	}
	
	@Override
	public boolean isEnableProdMode() {
		return ServiceHub.getInstance().isEnableProdMode();
	}
	
	@Override
	protected void prepareSysSFPluginRuntimes() throws Exception {
		if(this.getRTCodeUtils(true) == null) {
			this.prepareRTCodeUtils();
			this.getRTCodeUtils(false);
		}
		
		super.prepareSysSFPluginRuntimes();
		
		if(isEnableRTCodeMode()) {
			//判断是否预载运行时对象
//			File groovySourceFolder = new File( String.format("%1$s%2$sgroovy", this.getPSSystemService().getPSModelFolderPath(), File.separator));
//			if(groovySourceFolder.exists()) {
//				java.util.List<IPSSysSFPlugin> psSysSFPluginList = RTCodeUtils.buildPSSysSFPlugins(this.getPSSystemService(), groovySourceFolder);
//				if(!ObjectUtils.isEmpty(psSysSFPluginList)) {
//
//					Map<IPSSysSFPlugin, Throwable> taskRetMap = new LinkedHashMap<IPSSysSFPlugin, Throwable>();
//					List<CompletableFuture<?>> taskList = new ArrayList<CompletableFuture<?>>();
//					for (IPSSysSFPlugin iPSSysSFPlugin : psSysSFPluginList) {
//						CompletableFuture<Void> task = CompletableFuture.runAsync(new Runnable() {
//							@Override
//							public void run() {
//								try {
//									registerPSSysSFPlugin(iPSSysSFPlugin);
//								} catch (Throwable ex) {
//									log.error(String.format("注册后台插件[%1$s]发生异常，%2$s", iPSSysSFPlugin.getName(), ex.getMessage()), ex);
//									taskRetMap.put(iPSSysSFPlugin, ex);
//								}
//							}
//						});
//						taskList.add(task);
//					}
//
//					try {
//						CompletableFuture.allOf(taskList.toArray(new CompletableFuture<?>[taskList.size()])).get();
//					} catch (Exception ex) {
//						throw new Exception(String.format("准备后台插件发生异常，%1$s", ex.getMessage()), ex);
//					}
//					
//					if(taskRetMap.size()>0) {
//						for(java.util.Map.Entry<IPSSysSFPlugin, Throwable> entry : taskRetMap.entrySet()) {
//							throw new Exception(String.format("注册后台插件[%1$s]发生异常，%2$s", entry.getKey().getName(), entry.getValue().getMessage()), entry.getValue());
//						}
//					}
//				}
//			}
			
		}
	}
	
	
	@Override
	protected IDataEntityRuntime createDataEntityRuntime(IPSDataEntity iPSDataEntity) {
		if(isEnableRTCodeMode() ) {
			String strRTObjectName = null;
			try {
				strRTObjectName = this.getRTCodeUtils(false).getRTObjectName(iPSDataEntity);
			}
			catch (Exception ex) {
				throw new SystemRuntimeException(this, String.format("计算实体[%1$s]运行时对象名称发生异常，%2$s", iPSDataEntity.getName(), ex.getMessage()), ex);
			}
			if(StringUtils.hasLength(strRTObjectName)) {
				RuntimeObjectFactory.getInstance().registerObjectIf(IDataEntityRuntime.class, strRTObjectName, strRTObjectName);
				IDataEntityRuntime iDataEntityRuntime = RuntimeObjectFactory.getInstance().getObject(IDataEntityRuntime.class, strRTObjectName);
				if(iDataEntityRuntime!=null) {
					log.info(String.format("实体[%1$s]使用运行时对象[%2$s]",iPSDataEntity.getName(), iDataEntityRuntime.getClass().getName()));
					this.autowareObject(iDataEntityRuntime);
					return iDataEntityRuntime;
				}
			}
		}
		return super.createDataEntityRuntime(iPSDataEntity);
	}
	
	
	
	@Override
	protected void onInit() throws Exception {
		
		this.bUpdateDBSchema = this.getSystemRuntimeSetting().getParam(PARAM_UPDATEDBSCHEMA, this.bUpdateDBSchema);
		this.strOSSFolder = this.getSystemRuntimeSetting().getParam(PARAM_OSSFOLDER, this.strOSSFolder);
		
		Object value = this.getSystemRuntimeSetting().getParam(PARAM_V2DEPLOYSYSTEM);
		if(value instanceof V2DeploySystem) {
			this.v2DeploySystem = (V2DeploySystem)value;
		}
		
		value = this.getSystemRuntimeSetting().getParam(PARAM_V2SYSTEMMERGE);
		if(value instanceof V2SystemMerge) {
			this.v2SystemMerge = (V2SystemMerge)value;
		}
		
		//获取主系统标识
		this.strMainSystemId = this.getSystemRuntimeSetting().getParam(PARAM_MAINSYSTEMID, null);
		if(StringUtils.hasLength(this.strMainSystemId)) {
			Object objMainSystemRuntime = this.getSystemRuntimeSetting().getParam(PARAM_MAINSYSTEMRUNTIME);
			if(objMainSystemRuntime instanceof IServiceSystemRuntime) {
				this.mainSystemRuntime = (IServiceSystemRuntime)objMainSystemRuntime;
			}
		}
		
		if(!StringUtils.hasLength(this.strMainSystemId)) {
			Object mergeSystems = this.getSystemRuntimeSetting().getParam(IServiceSystemRuntime.PARAM_MERGESYSTEMS);
			if(mergeSystems instanceof List) {
				List<String> mergeSystemList = (List)mergeSystems;
				if(!ObjectUtils.isEmpty(mergeSystemList)) {
					for(String strMergeSystemId : mergeSystemList) {
						this.mergeSystemConfigMap.put(strMergeSystemId, "");
					}
				}
			}
		}
		
		java.util.List<IPSSysContentCat> psSysContentCats = this.getPSSystem().getAllPSSysContentCats();
		if (!ObjectUtils.isEmpty(psSysContentCats)) {
			for (IPSSysContentCat iPSSysContentCat : psSysContentCats) {
				if (!EXTENSION_PSSYSCONTENTCAT.equalsIgnoreCase(iPSSysContentCat.getCodeName())) {
					continue;
				}

				List<IPSSysContent> psSysContentList = iPSSysContentCat.getPSSysContents();
				if (!ObjectUtils.isEmpty(psSysContentList)) {
					for (IPSSysContent iPSSysContent : psSysContentList) {
						String strPath = iPSSysContent.getContentPath();
						if (!StringUtils.hasLength(strPath)) {
							strPath = iPSSysContent.getName();
						}
						if (this.extensionPSSysContentMap.containsKey(strPath)) {
							log.warn(String.format("忽略注册扩展内容[%1$s][%2$s]，键名已存在", strPath, iPSSysContent.getId()));
							continue;
						}
						this.extensionPSSysContentMap.put(strPath, iPSSysContent);
					}
				}
			}
			this.bHasExtensionPSSysContent = !ObjectUtils.isEmpty(this.extensionPSSysContentMap);
		}
		
		this.configListenerRepo.init(this, false);//shutdown时手动关闭
		this.credentialRepo.init(this, this.configListenerRepo);
		
		super.onInit();
		
		this.prepareChatResourceUtils();
		
		// 注册AI工厂
		java.util.List<IPSSysAIFactory> psSysAIFactories = this.getPSSystem().getAllPSSysAIFactories();
		if (psSysAIFactories != null) {
			for (IPSSysAIFactory iPSSysAIFactory : psSysAIFactories) {
				ISysAIFactoryRuntime iSysAIFactoryRuntime = this.registerPSSysAIFactory(iPSSysAIFactory);
			}
		}
		
		//从启用接口配置读取是否忽略默认服务总线接口
		String strEnableAPIs = this.getSystemRuntimeSetting().getEnableAPIs();
		if(StringUtils.hasLength(strEnableAPIs)) {
			Map<String, String> enableAPIMap = new HashMap<String, String>();
			String[] apis = strEnableAPIs.toLowerCase().split("[;]");
			for(String api : apis) {
				enableAPIMap.put(api, "");
			}
			if(enableAPIMap.containsKey(PARAM_ENABLEAPIS_NOSERVICEHUB)) {
				this.setEnableServiceHubAPI(false);
			}
		}
		
		this.strDataFlowSystemId = this.getSystemRuntimeSetting().getParam(PARAM_DATAFLOWSYSTEMID, this.getServiceId());
	
	//	this.bEnableExtension = this.getSystemRuntimeSetting().getParam(PARAM_EXTENSION, false);
	}
	
	@Override
	protected void onStart() throws Exception {
		
		//启动系统，含功能模块
		super.onStart();
		
		// 启动AI工厂
		java.util.List<IPSSysAIFactory> psSysAIFactories = this.getPSSystem().getAllPSSysAIFactories();
		if (psSysAIFactories != null) {
			for (IPSSysAIFactory iPSSysAIFactory : psSysAIFactories) {
				ISysAIFactoryRuntime iSysAIFactoryRuntime = this.getSysAIFactoryRuntime(iPSSysAIFactory.getId(), false);
				try {
					iSysAIFactoryRuntime.install();
				} catch (Throwable ex) {
					throw new Exception(String.format("安装系统AI工厂[%1$s]发生异常，%2$s", iSysAIFactoryRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		//优先加载子系统
		this.reloadSystemMergences(true, null);
		//获取配置
		this.reloadSystemExtension(true, null);
		
		//监控合并版本变化
		this.hookMergeSystemVerChanged();
	}
	
	protected synchronized void hookMergeSystemVerChanged() throws Exception {
		Collection<String> mergeSystemIds = this.getMergeSystemIds();
		if(ObjectUtils.isEmpty(mergeSystemIds)) {
			return;
		}
		
		for(String strMergeSystemId : mergeSystemIds) {
			String[] items = strMergeSystemId.split("[|]");
			//监控部署系统
			String strConfigId = String.format("%1$s%2$s-ver", NacosServiceHubSettingBase.DATAID_DEPLOYSYSTEM_PREFIX, items[0]);
			String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
			if(strConfig == null) {
				strConfig = "";
			}
			this.mergeSystemConfigMap.put(strMergeSystemId, strConfig);
			
			IConfigListener iConfigListener = new IConfigListener() {

				@Override
				public Executor getExecutor() {
					return null;
				}

				@Override
				public void receiveConfigInfo(String configInfo) {
					
					String strConfig = mergeSystemConfigMap.get(strMergeSystemId);
					if(configInfo == null) {
						configInfo = "";
					}
					if(configInfo.equals(strConfig)) {
						log.debug(String.format("合并系统[%1$s]接收到版本变化，但配置内容一致，忽略", items[0]));
						return;
					}
					mergeSystemConfigMap.put(strMergeSystemId, configInfo);
					log.debug(String.format("合并系统[%1$s]版本发生变化", items[0]));
					try {
						reloadSystemMergences(null);
					}
					catch (Exception ex) {
						log.error(ex);
					}
				}
			};
			ServiceHub.getInstance().addConfigListener(strConfigId, iConfigListener);
			this.mergeSystemConfigListenerMap.put(strConfigId, iConfigListener);
		}
		
	}
	
	protected synchronized void unhookMergeSystemVerChanged() throws Exception {
		if(ObjectUtils.isEmpty(this.mergeSystemConfigListenerMap)) {
			return;
		}
		
		for(java.util.Map.Entry<String, IConfigListener> entry : this.mergeSystemConfigListenerMap.entrySet()) {
			ServiceHub.getInstance().removeConfigListener(entry.getKey(), entry.getValue());
		}
		this.mergeSystemConfigListenerMap.clear();
	}
	
	@Override
	protected IDataEntityRuntime createDefaultDataEntityRuntime() {
		return new DataEntityRuntime();
	}
	
	@Override
	public <T> T getSysUtilRuntime(Class<T> cls, boolean bTryMode) {
		return this.getSysUtilRuntime(cls, bTryMode, false);
	}
	
	@Override
	public <T> T getSysUtilRuntime(Class<T> cls, boolean bTryMode, boolean bSystemOnly) {
		T t = (T)this.sysUtilRuntimeCacheMap.get(cls);
		if(t != null) {
			if(t != EMPTY) {
				return t;
			}
			else {
				if(bTryMode) {
					return null;
				}
				//必须模式，需要重新获取
			}
		}
		t = this.onGetSysUtilRuntime(cls, bTryMode, bSystemOnly);
		if(t != null) {
			this.sysUtilRuntimeCacheMap.put(cls, t);
		}
		else {
			this.sysUtilRuntimeCacheMap.put(cls, EMPTY);
		}
		
		return t;
	}
	
	protected <T> T onGetSysUtilRuntime(Class<T> cls, boolean bTryMode, boolean bSystemOnly) {
		if(bSystemOnly) {
			return super.getSysUtilRuntime(cls, bTryMode);
		}
		else {
			T t = super.getSysUtilRuntime(cls, true);
			if(t != null) {
				return t;
			}
			
			return ServiceHub.getInstance().getSysUtilRuntime(null, cls, bTryMode);
		}
	}


	
	@Override
	public AppData invokeGetAppData(String strSystemTag, String strOrgId, IAuthenticationUser iAuthenticationUser, Object objTag) throws Throwable {
		return this.onInvokeGetAppData(strSystemTag, strOrgId, objTag);
	}
	
	
	protected AppData onInvokeGetAppData(String strSystemTag, String strOrgId, Object objTag) {
		return getSystemAccessManager().getAppData(strSystemTag, strOrgId);
	}
	
	@Override
	public AppData invokeGetAppData(String strDCSystemTag, IAuthenticationUser iAuthenticationUser, Object objTag) throws Throwable {
		return this.onInvokeGetAppData(strDCSystemTag, objTag);
	}
	
	
	protected AppData onInvokeGetAppData(String strDCSystemTag, Object objTag) {
		return getSystemAccessManager().getAppData(strDCSystemTag);
	}
	
	
	@Override
	public net.ibizsys.central.cloud.core.security.ISystemAccessManager getSystemAccessManager() {
		return (net.ibizsys.central.cloud.core.security.ISystemAccessManager)super.getSystemAccessManager();
	}

	@Override
	public boolean isEnableServiceHubAPI() {
		return this.bEnableServiceHubAPI;
	}
	
	protected void setEnableServiceHubAPI(boolean bEnableServiceHubAPI) {
		this.bEnableServiceHubAPI = bEnableServiceHubAPI;
	}
	
	
	@Override
	protected ISysFileUtilRuntime registerDefaultSysFileUtilRuntime() throws Exception {
		return (ISysOSSUtilRuntime)this.getSysUtilRuntime(ISysOSSUtilRuntime.class, false);
		//return super.registerDefaultSysFileUtilRuntime();
	}
	
	
	@Override
	public void shutdown() {
		try {
			this.fireSystemEvent(SYSTEMEVENT_SHUTDOWN, null);
			onBeforeShutdown();
			onShutdown();
		}
		catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("关闭系统发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onBeforeShutdown() throws Exception{
		
		try {
			this.configListenerRepo.shutdown();
		}
		catch (Throwable ex) {
			log.error(String.format("关闭配置侦听器仓库发生异常，%1$s", ex.getMessage()), ex);
		}
		
		try {
			this.unhookMergeSystemVerChanged();
		}
		catch (Throwable ex) {
			log.error(String.format("移除合并系统版本监控发生异常，%1$s", ex.getMessage()), ex);
		}
		
		try {
			String strSystemExtensionConfigId = this.strSystemExtensionConfigId;
			this.strSystemExtensionConfigId = null;
			this.strExtensionSessionId = null;
			if(StringUtils.hasLength(strSystemExtensionConfigId)) {
				ServiceHub.getInstance().removeConfigListener(strSystemExtensionConfigId, systemExtensionConfigListener);
			}
		}
		catch (Throwable ex) {
			log.error(String.format("移除系统扩展配置监控发生异常，%1$s", ex.getMessage()), ex);
		}
		
		try {
			String strSystemMergencesConfigId = this.strSystemMergencesConfigId;
			this.strSystemMergencesConfigId = null;
			this.strSystemMergeSessionId = null;
			if(StringUtils.hasLength(strSystemMergencesConfigId)) {
				ServiceHub.getInstance().removeConfigListener(strSystemMergencesConfigId, systemMergencesConfigListener);
			}
		}
		catch (Throwable ex) {
			log.error(String.format("移除系统合并配置监控发生异常，%1$s", ex.getMessage()), ex);
		}
		
		if(this.getV2DeploySystem() != null) {
			if(StringUtils.hasLength(this.getV2DeploySystem().getSystemExtensionId())) {
				try {
					ISysExtensionUtilRuntime iSysExtensionUtilRuntime = this.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
					if(iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
						((IHubSysExtensionUtilRuntime)iSysExtensionUtilRuntime).reloadExtension(this, null);
					}
					else {
						iSysExtensionUtilRuntime.reloadExtension(null);
					}
				}
				catch (Throwable ex) {
					log.error(String.format("重置系统扩展发生异常，%1$s", ex.getMessage()), ex);
				}
			}
			
			if(!StringUtils.hasLength(this.getV2DeploySystem().getSystemVersionId())) {
				try {
					ISysExtensionUtilRuntime iSysExtensionUtilRuntime = this.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
					if(iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
						((IHubSysExtensionUtilRuntime)iSysExtensionUtilRuntime).reloadSystemMergences(this, null);
					}
					else {
						iSysExtensionUtilRuntime.reloadSystemMergences(null);
					}
				}
				catch (Throwable ex) {
					log.error(String.format("重置系统合并发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
	}
	
	@Override
	protected void onShutdown() throws Exception{
		
		// 卸载AI工厂
		java.util.List<IPSSysAIFactory> psSysAIFactories = this.getPSSystem().getAllPSSysAIFactories();
		if (psSysAIFactories != null) {
			for (IPSSysAIFactory iPSSysAIFactory : psSysAIFactories) {
				ISysAIFactoryRuntime iSysAIFactoryRuntime = this.getSysAIFactoryRuntime(iPSSysAIFactory.getId(), false);
				try {
					iSysAIFactoryRuntime.uninstall();
				} catch (Throwable ex) {
					throw new Exception(String.format("卸载系统AI工厂[%1$s]发生异常，%2$s", iSysAIFactoryRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysAIFactoryRuntimeMap);
		if(!ObjectUtils.isEmpty(this.proxyDEServiceMap)) {
			this.proxyDEServiceMap.clear();
		}
		
		if(!ObjectUtils.isEmpty(this.sysUtilRuntimeCacheMap)) {
			this.sysUtilRuntimeCacheMap.clear();
		}
		
		super.onShutdown();
	}
	
	@Override
	protected void prepareDefaultSysBDSchemeRuntime() throws Exception {
		super.prepareDefaultSysBDSchemeRuntime();
		if(this.getDefaultSysBDSchemeRuntime()!=null) {
			return;
		}
		
		IPSSysBDScheme iPSSysBDScheme = SysBDSchemeRuntime.getDefaultPSSysBDScheme(this.getSystemRuntimeContext());
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getRuntimeObject(ISysBDSchemeRuntime.class, CloudOSSBDSchemeRuntime.BDTYPE_CLOUDOSS);
		if (iSysBDSchemeRuntime == null) {
			return;
		}

		try {
			iSysBDSchemeRuntime.init(this.getSystemRuntimeContext(), iPSSysBDScheme);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化大数据体系[%1$s]运行时对象发生异常，%2$s", iPSSysBDScheme.getName(), ex.getMessage()), ex);
		}

		this.setDefaultSysBDSchemeRuntime(iSysBDSchemeRuntime);
	}
	
	@Override
	public ISysDataSyncAgentRuntime createSysDataSyncAgentRuntime(IPSSysDataSyncAgent iPSSysDataSyncAgent) {
		if(iPSSysDataSyncAgent.getPSSysSFPlugin() == null) {
			if("CloudAIAgent".equalsIgnoreCase(iPSSysDataSyncAgent.getCodeName()) && "USER".equalsIgnoreCase(iPSSysDataSyncAgent.getAgentType())) {
				return new SysAIAgentRuntime();
			}
		}
		
		return super.createSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
	}

	@Override
	public <T> T createModelRTScript(Object owner, String strScriptCode, Class<? extends ModelRTScriptBase> cls) {
		// TODO Auto-generated method stub
		return super.createModelRTScript(owner, strScriptCode, cls);
	}
	
	@Override
	public String getMainSystemId() {
		return this.strMainSystemId;
	}
	
	@Override
	public IServiceSystemRuntime getMainSystemRuntime(boolean bTryMode) {
		if(StringUtils.hasLength(getMainSystemId())) {
			if(this.mainSystemRuntime != null) {
				return this.mainSystemRuntime;
			}
			this.mainSystemRuntime = (IServiceSystemRuntime)ServiceHub.getInstance().getLoadedSystemRuntime(getMainSystemId(), true);
			if(this.mainSystemRuntime == null) {
				throw new SystemRuntimeException(this, String.format("主系统标识[%1$s]无效", getMainSystemId()));
			}
			return this.mainSystemRuntime;
		}
		if(!bTryMode) {
			throw new SystemRuntimeException(this, String.format("未指定主系统标识"));
		}
		return null;
	}
	
	@Override
	public String getDataFlowSystemId() {
		return this.strDataFlowSystemId;
	}
	
	@Override
	public V2DeploySystem getV2DeploySystem() {
		return this.v2DeploySystem;
	}
	
	@Override
	public V2SystemMerge getV2SystemMerge() {
		return this.v2SystemMerge;
	}
	
	@Override
	public String getV2SystemId() {
		if(this.getV2DeploySystem() != null) {
			if(!StringUtils.hasLength(this.getV2DeploySystem().getSystemVersionId())) {
				return this.getV2DeploySystem().getSystemId();
			}
		}
		return null;
	}
	
	@Override
	public boolean isEnableExtension() {
		//return this.getV2DeploySystem() != null && StringUtils.hasLength(this.getV2DeploySystem().getOssFile());
		return this.getV2DeploySystem() != null;
	}
	
	@Override
	public String getExtensionId() {
		return this.getV2DeploySystem() != null ? this.getV2DeploySystem().getSystemExtensionId() : null;
	}
	
	@Override
	public String getExtensionSessionId() {
		return this.strExtensionSessionId;
	}
	
//	@Override
//	public boolean isEnableExtension() {
//		return this.bEnableExtension;
//	}

	@Override
	public IRTCodeUtils getRTCodeUtils() {
		try {
			return this.getRTCodeUtils(false);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, ex.getMessage(), ex);
		}
	}
	
	protected IRTCodeUtils getRTCodeUtils(boolean bTryMode) throws Exception {
		if(this.iRTCodeUtils != null || bTryMode) {
			return this.iRTCodeUtils;
		}
		throw new Exception("RT代码辅助功能对象无效");
	}
	
	protected void setRTCodeUtils(IRTCodeUtils iRTCodeUtils) {
		this.iRTCodeUtils = iRTCodeUtils;
	}
	
	protected void prepareRTCodeUtils() throws Exception {
		this.setRTCodeUtils(new RTCodeUtils(this.getSystemRuntimeContext()));
	}
	
	@Override
	public IChatResourceUtils getChatResourceUtils() {
		try {
			return this.getChatResourceUtils(false);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, ex.getMessage(), ex);
		}
	}
	
	protected IChatResourceUtils getChatResourceUtils(boolean bTryMode) throws Exception {
		if(this.iChatResourceUtils != null || bTryMode) {
			return this.iChatResourceUtils;
		}
		throw new Exception("AI聊天资源辅助功能对象无效");
	}
	
	protected void setChatResourceUtils(IChatResourceUtils iChatResourceUtils) {
		this.iChatResourceUtils = iChatResourceUtils;
	}
	
	protected void prepareChatResourceUtils() throws Exception {
		this.setChatResourceUtils(new ChatResourceUtils(this.getSystemRuntimeContext()));
	}
	
	
	protected synchronized void reloadSystemExtension(String configInfo) throws Exception {
		this.reloadSystemExtension(false, configInfo);
	}
	
	protected synchronized void reloadSystemExtension(boolean bFirst, String configInfo) throws Exception {
		if(this.getV2DeploySystem() == null) {
			return;
		}
		
		try {
			String strSystemExtensionConfigId = this.strSystemExtensionConfigId;
			this.strSystemExtensionConfigId = null;
			this.strExtensionSessionId = null;
			if(StringUtils.hasLength(strSystemExtensionConfigId)) {
				ServiceHub.getInstance().removeConfigListener(strSystemExtensionConfigId, systemExtensionConfigListener);
			}
		}
		catch (Throwable ex) {
			log.error(String.format("移除系统扩展配置监控发生异常，%1$s", ex.getMessage()), ex);
		}
		
		
		String strSystemExtensionId = this.getV2DeploySystem().getSystemExtensionId();
		if(StringUtils.hasLength(strSystemExtensionId)) {
			String strSystemExtensionConfigId = String.format("%1$s%2$s", NacosServiceHubSetting.DATAID_SYSTEMEXTENSION_PREFIX, strSystemExtensionId);
			if(!StringUtils.hasLength(configInfo)) {
				configInfo = ServiceHub.getInstance().getConfig(strSystemExtensionConfigId);
			}
			
			ServiceHub.getInstance().addConfigListener(strSystemExtensionConfigId, systemExtensionConfigListener);
			this.strSystemExtensionConfigId = strSystemExtensionConfigId;
			this.strExtensionSessionId = KeyValueUtils.genUniqueId(this.getDeploySystemId(), strSystemExtensionId, configInfo);
		}
		
		ISysExtensionUtilRuntime iSysExtensionUtilRuntime = this.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
		
		if(iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
			((IHubSysExtensionUtilRuntime)iSysExtensionUtilRuntime).reloadExtension(this, this.getV2DeploySystem().getSystemExtensionId());
		}
		else {
			iSysExtensionUtilRuntime.reloadExtension(this.getV2DeploySystem().getSystemExtensionId());
		}
	}
	
	protected synchronized void reloadSystemMergences(String configInfo) throws Exception {
		this.reloadSystemMergences(false, configInfo);
	}
	
	protected synchronized void reloadSystemMergences(boolean bFirst, String configInfo) throws Exception {
		
		String strSystemId = null;
		
		if(this.getV2DeploySystem() != null) {
			if(!StringUtils.hasLength(this.getV2DeploySystem().getSystemVersionId())) {
				strSystemId = this.getV2DeploySystem().getSystemId();
			}
		}
		
		try {
			String strSystemMergencesConfigId = this.strSystemMergencesConfigId;
			this.strSystemMergencesConfigId = null;
			this.strSystemMergeSessionId = null;
			if(StringUtils.hasLength(strSystemMergencesConfigId)) {
				ServiceHub.getInstance().removeConfigListener(strSystemMergencesConfigId, systemMergencesConfigListener);
			}
		}
		catch (Throwable ex) {
			log.error(String.format("移除系统合并配置版本监控发生异常，%1$s", ex.getMessage()), ex);
		}
		
		if(StringUtils.hasLength(strSystemId)) {
			String strSystemMergencesConfigId = String.format("%1$s%2$s-ver", NacosServiceHubSetting.DATAID_SYSTEMMERGENCES_PREFIX, strSystemId);
			if(!StringUtils.hasLength(configInfo)) {
				configInfo = ServiceHub.getInstance().getConfig(strSystemMergencesConfigId);
			}
			
			ServiceHub.getInstance().addConfigListener(strSystemMergencesConfigId, systemMergencesConfigListener);
			this.strSystemMergencesConfigId = strSystemMergencesConfigId;
		}
		
		if(StringUtils.hasLength(strSystemId) || !ObjectUtils.isEmpty(this.getMergeSystemIds())) {
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = this.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
			if(iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				((IHubSysExtensionUtilRuntime)iSysExtensionUtilRuntime).reloadSystemMergences(this, strSystemId);
			}
			else {
				iSysExtensionUtilRuntime.reloadSystemMergences(strSystemId);
			}
			
			if(StringUtils.hasLength(strSystemId)) {
				this.strSystemMergeSessionId = KeyValueUtils.genUniqueId(this.getDeploySystemId(), strSystemId, configInfo);
			}
			
			if(!bFirst) {
				PortalMessage portalMessage = new PortalMessage();
				portalMessage.setType(PortalMessageType.COMMAND.getValue());
				portalMessage.setSubType(PortalMessageSubType.COMMAND_ADDINCHANGED.getValue());
				getCloudPortalClient().notifyEmployees(ICloudPortalClient.NOTIFYEMPLOYEESMODE_SYSTEM, this.getDeploySystemId(), portalMessage);
			}
		}
	}
	
	@Override
	public Collection<IExtensionSysRefRuntime> getExtensionSysRefRuntimes(boolean bIncludeOrigin) {
		Collection<IExtensionSysRefRuntime> ret = bIncludeOrigin?this.allExtensionSysRefRuntimeList:this.extensionSysRefRuntimeList;
		if(ret == null) {
			List<IExtensionSysRefRuntime> list = new ArrayList<IExtensionSysRefRuntime>();
			if(bIncludeOrigin) {
				List<IPSSysRef> psSysRefList = this.getPSSystem().getAllPSSysRefs();
				if (!ObjectUtils.isEmpty(psSysRefList)) {
					for (IPSSysRef iPSSysRef : psSysRefList) {
						ISysRefRuntime iSysRefRuntime = this.getSysRefRuntime(iPSSysRef);
						if (!(iSysRefRuntime instanceof IExtensionSysRefRuntime)) {
							continue;
						}
						list.add((IExtensionSysRefRuntime)iSysRefRuntime);
					}
				}
			}
			synchronized (this.extensionSysRefRuntimeMap) {
				list.addAll(extensionSysRefRuntimeMap.values());
				ret = Collections.unmodifiableCollection(list);
				if(bIncludeOrigin) {
					this.allExtensionSysRefRuntimeList = ret;
				}
				else {
					this.extensionSysRefRuntimeList = ret;
				}
			}
		}
		
		return ret;
	}

	@Override
	public IExtensionSysRefRuntime registerExtensionSysRefRuntime(IPSSysRef iPSSysRef) {
		Assert.notNull(iPSSysRef, "传入系统引用模型对象无效");
		
		synchronized (this.extensionSysRefRuntimeMap) {
			
			if(this.extensionSysRefRuntimeMap.containsKey(iPSSysRef.getId())) {
				throw new SystemRuntimeException(this, String.format("注册扩展系统引用[%1$s]运行时对象发生异常，重复的引用标识[%2$s]", iPSSysRef.getName(), iPSSysRef.getId()));
			}
			
			try {
				ISysRefRuntime iSysRefRuntime = this.createSysRefRuntime(iPSSysRef);
				if(!(iSysRefRuntime instanceof IExtensionSysRefRuntime)) {
					throw new SystemRuntimeException(this, String.format("注册扩展系统引用[%1$s]运行时对象发生异常，类型不正确[%2$s]", iPSSysRef.getName(), iSysRefRuntime.getClass()));
				}
				iSysRefRuntime.init(this.getSystemRuntimeContext(), iPSSysRef);
				IExtensionSysRefRuntime iExtensionSysRefRuntime = (IExtensionSysRefRuntime)iSysRefRuntime;
				iExtensionSysRefRuntime.install();
				this.extensionSysRefRuntimeMap.put(iPSSysRef.getId(), iExtensionSysRefRuntime);
				
				this.allExtensionSysRefRuntimeList= null;
				this.extensionSysRefRuntimeList = null;
				
				return iExtensionSysRefRuntime;
			} catch (Exception ex) {
				throw new SystemRuntimeException(this, String.format("注册扩展系统引用[%1$s]运行时对象发生异常，%2$s", iPSSysRef.getName(), ex.getMessage()), ex);
			}
		}
	}

	@Override
	public void unregisterExtensionSysRefRuntime(IPSSysRef iPSSysRef) {
		Assert.notNull(iPSSysRef, "传入系统引用模型对象无效");
		
		synchronized (this.extensionSysRefRuntimeMap) {
			
			IExtensionSysRefRuntime iExtensionSysRefRuntime = this.extensionSysRefRuntimeMap.remove(iPSSysRef.getId());
			if(iExtensionSysRefRuntime == null) {
				return;
			}
			
			this.allExtensionSysRefRuntimeList= null;
			this.extensionSysRefRuntimeList = null;
			
			try {
				iExtensionSysRefRuntime.uninstall();
			} catch (Exception ex) {
				log.error(String.format("卸载扩展系统引用[%1$s]运行时对象发生异常，%2$s", iExtensionSysRefRuntime.getName(), ex.getMessage()), ex);
			}
		}
	}
	
	@Override
	public IExtensionSysRefRuntime getExtensionSysRefRuntime(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag, "传入扩展系统引用模型标记无效");
		IExtensionSysRefRuntime iExtensionSysRefRuntime = null;
		synchronized (this.extensionSysRefRuntimeMap) {
			iExtensionSysRefRuntime = this.extensionSysRefRuntimeMap.get(strTag);
		}
		if(iExtensionSysRefRuntime != null || bTryMode) {
			return iExtensionSysRefRuntime;
		}
		throw new SystemRuntimeException(this, String.format("扩展系统引用[%1$s]运行时对象不存在", strTag));
	}
	
	@Override
	public void unregisterExtensionSysRefRuntimes() {
		synchronized (this.extensionSysRefRuntimeMap) {
			for(IExtensionSysRefRuntime iExtensionSysRefRuntime : this.extensionSysRefRuntimeMap.values()) {
				try {
					iExtensionSysRefRuntime.uninstall();
				} catch (Exception ex) {
					log.error(String.format("卸载扩展系统引用[%1$s]运行时对象发生异常，%2$s", iExtensionSysRefRuntime.getName(), ex.getMessage()), ex);
				}
			}
			this.extensionSysRefRuntimeMap.clear();			
			this.allExtensionSysRefRuntimeList= null;
			this.extensionSysRefRuntimeList = null;
		}
	}
	
	@Override
	public String getSystemMergeSessionId() {
		if(!ObjectUtils.isEmpty(this.mergeSystemConfigMap)) {
			String strTempId = this.strSystemMergeSessionId;
			for(String value : this.mergeSystemConfigMap.values()) {
				strTempId = KeyValueUtils.genUniqueId(strTempId, value);
			}
			return strTempId;
		}
		
		return this.strSystemMergeSessionId;
	}
	
	@Override
	public Collection<String> getMergeSystemIds() {
		if(!ObjectUtils.isEmpty(this.mergeSystemConfigMap)) {
			return this.mergeSystemConfigMap.keySet();
		}
		return null;
	}
	
	@Override
	protected ISysBISchemeRuntime createDefaultSysBISchemeRuntime() {
		return new SysBISchemeRuntime();
	}
	
	@Override
	public ISystemRTGroovyContext getSystemRTGroovyContext() {
		return (ISystemRTGroovyContext)super.getSystemRTGroovyContext();
	}
	
	@Override
	public IServiceSystemRuntime createAddinSystemRuntime(DeploySystem deploySystem) {
		IServiceSystemRuntime iServiceSystemRuntime = this.getRuntimeObject(GLOBALPLUGIN_ADDINSYSTEMRUNTIME, IServiceSystemRuntime.class, true, true);
		if (iServiceSystemRuntime != null) {
			return iServiceSystemRuntime;
		}
		return null;
	}
	
	@Override
	public boolean isUpdateDBSchema() {
		return this.bUpdateDBSchema;
	}
	
	@Override
	public String getOSSFolder() {
		if(StringUtils.hasLength(this.strOSSFolder)) {
			return this.strOSSFolder;
		}
		
		if(this.getMainSystemRuntime(true)!=null) {
			return this.getMainSystemRuntime(true).getOSSFolder();
		}
		return null;
	}
	
	@Override
	protected ISysDBSchemeRuntime createDefaultSysDBSchemeRuntime() {
		return new SysDBSchemeRuntime();
	}
	
	@Override
	public IPSSysContent getExtensionPSSysContent(String strPath, boolean bTryMode) {
		Assert.hasLength(strPath, "未传入资源路径标识");
		IPSSysContent iPSSysContent = this.extensionPSSysContentMap.get(strPath);
		if (iPSSysContent != null) {
			return iPSSysContent;
		}
		if (bTryMode) {
			return null;
		}
		throw new SystemRuntimeException(this, String.format("无法获取指定资源路径[%1$s]对应的系统扩展模型对象", strPath));
	}
	
	@Override
	public boolean hasExtensionPSSysContent() {
		return this.bHasExtensionPSSysContent;
	}
	
	@Override
	public ISysAIFactoryRuntime getSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory) {
		Assert.notNull(iPSSysAIFactory, "传入系统AI工厂模型对象无效");
		return getSysAIFactoryRuntime(iPSSysAIFactory.getId(), false);
	}

	@Override
	public ISysAIFactoryRuntime getSysAIFactoryRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入AI工厂标记无效");
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		if (this.sysAIFactoryRuntimeMap != null) {
			iSysAIFactoryRuntime = this.sysAIFactoryRuntimeMap.get(strTag);
			if (iSysAIFactoryRuntime == null) {
				iSysAIFactoryRuntime = this.sysAIFactoryRuntimeMap.get(strTag.toLowerCase());
			}
		}
		if (iSysAIFactoryRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定AI工厂[%1$s]运行时对象", strTag));
		}
		return iSysAIFactoryRuntime;
	}

	protected ISysAIFactoryRuntime registerPSSysAIFactory(IPSSysAIFactory iPSSysAIFactory) {

		if (this.sysAIFactoryRuntimeMap != null) {
			ISysAIFactoryRuntime iSysAIFactoryRuntime = this.sysAIFactoryRuntimeMap.get(iPSSysAIFactory.getId());
			if (iSysAIFactoryRuntime != null) {
				return iSysAIFactoryRuntime;
			}
		}

		ISysAIFactoryRuntime iSysAIFactoryRuntime = this.createSysAIFactoryRuntime(iPSSysAIFactory);
		if (iSysAIFactoryRuntime == null) {
			return null;
		}
		try {
			iSysAIFactoryRuntime.init(this.getSystemRuntimeContext(), iPSSysAIFactory);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化AI工厂[%1$s]运行时对象发生异常，%2$s", iPSSysAIFactory.getName(), ex.getMessage()), ex);
		}
		if (this.sysAIFactoryRuntimeMap == null) {
			this.sysAIFactoryRuntimeMap = new HashMap<>();
		}
		this.sysAIFactoryRuntimeMap.put(iPSSysAIFactory.getId(), iSysAIFactoryRuntime);
		if (StringUtils.hasLength(iPSSysAIFactory.getCodeName())) {
			this.sysAIFactoryRuntimeMap.put(iPSSysAIFactory.getCodeName().toLowerCase(), iSysAIFactoryRuntime);
			if (iPSSysAIFactory.getPSSystemModule() != null) {
				this.sysAIFactoryRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysAIFactory.getPSSystemModule(), iPSSysAIFactory.getCodeName()), iSysAIFactoryRuntime);
			}
		}
		return iSysAIFactoryRuntime;
	}

	@Override
	public ISysAIFactoryRuntime createSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory) {
		Assert.notNull(iPSSysAIFactory, "传入系统AI工厂模型对象无效");
		ISysAIFactoryRuntime iSysAIFactoryRuntime = this.getRuntimeObject(iPSSysAIFactory.getPSSysSFPlugin(), ISysAIFactoryRuntime.class, true);
		if (iSysAIFactoryRuntime != null) {
			return iSysAIFactoryRuntime;
		}
		
		if(iPSSysAIFactory.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysAIFactory.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime instanceof net.ibizsys.central.cloud.core.system.ISystemModuleUtilRuntime) {
				iSysAIFactoryRuntime = ((net.ibizsys.central.cloud.core.system.ISystemModuleUtilRuntime)iSystemModuleUtilRuntime).createSysAIFactoryRuntime(iPSSysAIFactory);
				if (iSysAIFactoryRuntime != null) {
					return iSysAIFactoryRuntime;
				}
			}
		}

		return this.onCreateSysAIFactoryRuntime(iPSSysAIFactory);

	}
	
	protected ISysAIFactoryRuntime onCreateSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory) {
		// 判断AI工厂类型
		String strConfigFolder = SysAIFactoryRuntime.getConfigFolder(iPSSysAIFactory);
		String strAFType = this.getSystemRuntimeSetting().getParam(strConfigFolder + ".aftype", iPSSysAIFactory.getAIFactoryType());

		ISysAIFactoryRuntime iSysAIFactoryRuntime = this.getRuntimeObject(ISysAIFactoryRuntime.class, strAFType);
		if (iSysAIFactoryRuntime != null) {
			return iSysAIFactoryRuntime;
		}

		return createDefaultSysAIFactoryRuntime(iPSSysAIFactory);
	}

	protected ISysAIFactoryRuntime createDefaultSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory) {
		return this.createDefaultSysAIFactoryRuntime();
	}

	protected ISysAIFactoryRuntime createDefaultSysAIFactoryRuntime() {
		return new SysAIFactoryRuntime();
	}
	
	
	
	@Override
	public IConfigListenerRepo getConfigListenerRepo() {
		return this.configListenerRepo;
	}
	
	@Override
	public ICredentialRepo getCredentialRepo() {
		return this.credentialRepo;
	}
	
	@Override
	protected void onFireSystemEvent(String event, Object[] params) {
		if(event.indexOf(SYSTEMEVENT_CLOUD_PREFIX) == 0) {
			Map<String, Object> configEntityEx = null;
			if(params!=null && params.length>0) {
				if(!ObjectUtils.isEmpty(params[0])) {
					configEntityEx = JsonUtils.asMap(params[0]);
				}
			}
			
			if(configEntityEx == null) {
				configEntityEx = new LinkedHashMap<String, Object>();
			}
			
			configEntityEx.put("event_time", DateUtils.getCurTimeString2());
			configEntityEx.put("event_host", ServiceHub.getInstance().getId());
			
			//判断是否发布配置，不发布则走回默认处理，匹配本地调试业务异常
			if(ServiceHub.getInstance().getServiceHubSetting().isPublishConfig()) {
				String strCloudEventId = String.format("%1$s%2$s-%3$s", CLOUDCONFIGID_SYSTEMEVENT_PREFIX, this.getDeploySystemId(), event.substring(SYSTEMEVENT_CLOUD_PREFIX.length())).toLowerCase();
				ServiceHub.getInstance().publishConfig(strCloudEventId, configEntityEx);
			}
			else {
				doFireSystemEvent(event, new Object[] {JsonUtils.asEntity(configEntityEx)});
			}
			return;
		}
		super.onFireSystemEvent(event, params);
	}
	
	@Override
	protected void onRegisterSystemEventListener(ISystemEventListener listener, String[] events) {
		if(events != null && events.length != 0) {
			for(String strEvent : events) {
				if(!StringUtils.hasLength(strEvent)) {
					continue;
				}
				
				if(strEvent.indexOf(SYSTEMEVENT_CLOUD_PREFIX) != 0) {
					continue;
				}
				
				String strEvent2 = strEvent;
				String strCloudEventId = String.format("%1$s%2$s-%3$s", CLOUDCONFIGID_SYSTEMEVENT_PREFIX, this.getDeploySystemId(), strEvent.substring(SYSTEMEVENT_CLOUD_PREFIX.length())).toLowerCase();
				this.getConfigListenerRepo().addConfigListener(strCloudEventId, new IConfigListener() {
					
					@Override
					public void receiveConfigInfo(String configInfo) {
						Map<String, Object> config = null;
						if(StringUtils.hasLength(configInfo)) {
							if(configInfo.indexOf("{") == 0) {
								config = JsonUtils.MAPPER.convertValue(configInfo, Map.class);
							}
							else {
								Yaml yaml = new Yaml();
								config = yaml.loadAs(configInfo, Map.class);
							}
						}
						
						doFireSystemEvent(strEvent2, new Object[] { new Entity(config)});
					}
					
					@Override
					public Object getOwner() {
						return listener;
					}
					
				});
			}
		}
		super.onRegisterSystemEventListener(listener, events);
	}
	
	@Override
	protected void onUnregisterSystemEventListener(ISystemEventListener listener) {
		this.getConfigListenerRepo().removeConfigListenersByOwner(listener);
		super.onUnregisterSystemEventListener(listener);
	}
	

	@Override
	public <T> T getProxyDEService(Class<? extends IProxyDEService> cls) {
		Assert.notNull(cls, "传入代理实体服务对象接口类型无效");
		IProxyDEService iProxyDEService = this.proxyDEServiceMap.get(cls);
		if(iProxyDEService == null) {
			Qualifier qualifier = cls.getAnnotation(Qualifier.class);
			if(qualifier == null) {
				throw new SystemRuntimeException(this, String.format("代理实体服务对象[%1$s]未携带标记", cls));
			}
			Object value = this.getSystemRTGroovyContext().getModelRuntime(cls, qualifier.value());
			if(value instanceof IProxyDEService) {
				iProxyDEService = (IProxyDEService)value;
				this.proxyDEServiceMap.put(cls, iProxyDEService);
			}
			else {
				throw new SystemRuntimeException(this, String.format("代理实体服务对象[%1$s]值[%2$s]无效", cls, value));
			}
		}
		return (T)iProxyDEService;
	}
}
