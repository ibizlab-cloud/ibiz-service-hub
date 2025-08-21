package net.ibizsys.central.plugin.extension.sysutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PullCommand;
import org.eclipse.jgit.api.errors.CheckoutConflictException;
import org.eclipse.jgit.api.errors.WrongRepositoryStateException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2DataSource;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystemDataSource;
import net.ibizsys.central.cloud.core.util.domain.V2ServiceHub;
import net.ibizsys.central.cloud.core.util.domain.V2ServiceHubDeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2System;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionBICube;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionField;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionForm;
import net.ibizsys.central.cloud.core.util.domain.V2SystemMerge;
import net.ibizsys.central.cloud.core.util.domain.V2SystemSource;
import net.ibizsys.central.cloud.core.util.domain.V2SystemType;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersion;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersionSource;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersionState;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersionType;
import net.ibizsys.central.plugin.extension.psmodel.merger.ExtensionPSModelMergeContext;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.sysutil.ISysUniStateListener;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelEnums.DeploySysType;
import net.ibizsys.model.PSModelEnums.DevSysType;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.PSSystemImpl;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.model.system.PSSysRefImpl;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.model.util.merger.PSModelListMergerBase;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.ZipUtils;
import net.ibizsys.runtime.util.domain.Log;

public abstract class HubSysExtensionUtilRuntimeBase extends SysExtensionUtilRuntimeBase implements IHubSysExtensionUtilRuntime, ISysCloudExtensionUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(HubSysExtensionUtilRuntimeBase.class);
	
	public static final String EXTENSION_CACHE_PATTERN = "ibiz-cloud-extension-*";
	
	private Map<String, String> extensionCacheStateMap = new ConcurrentHashMap<String, String>();
	
	private ICloudExtensionClient iCloudExtensionClient = null;
	
	private ISysUniStateListener iSysUniStateListener = new ISysUniStateListener() {

		@Override
		public void change(String strPath, String data, String oldData, String strPattern) {
			try {
				log.debug(String.format(String.format("统一状态[%1$s]变更触发", strPath)));
				onExtensionCacheStateChange(strPath, data, oldData, strPattern);
			}
			catch (Throwable ex) {
				log.error(String.format("统一状态[%1$s]变更处理发生异常，%2$s", strPath, ex.getMessage()), ex);
			}
		}
	};
	
	@Override
	protected boolean isHubMode() {
		return true;
	}
	
	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
		
		if(isEnableExtensionCacheStateListener()) {
			this.getSysCacheUtilRuntime(false).registerListener(EXTENSION_CACHE_PATTERN, true, iSysUniStateListener);
		}
	}
	
	
	@Override
	protected void onUninstall() throws Throwable {
		
		if(isEnableExtensionCacheStateListener()) {
			this.getSysCacheUtilRuntime(false).unregisterListener(EXTENSION_CACHE_PATTERN, true, iSysUniStateListener);
		}
		
		super.onUninstall();
	}
	
	protected boolean isEnableExtensionCacheStateListener() {
		return true;
	}
	
	protected void onExtensionCacheStateChange(String strPath, String data, String oldData, String strPattern) throws Throwable{
		
		log.debug(String.format("扩展缓存状态[%1$s]变更", strPath));
		
		if(StringUtils.hasLength(data)) {
			extensionCacheStateMap.put(strPath, data);
		}
		else {
			extensionCacheStateMap.put(strPath, "");
		}
	}
	
	protected String getExtensionCacheState(String strPath) {
		String strData = this.extensionCacheStateMap.get(strPath);
		if(strData == null) {
			strData = this.getSysCacheUtilRuntime(false).get(strPath);
			if(strData == null) {
				strData = "";
			}
			extensionCacheStateMap.put(strPath, strData);
		}
		return strData;
	}
	
	@Override
	protected ISysCloudExtensionUtilRuntime getSysCloudExtensionUtilRuntime() {
		return this;
	}
	
	@Override
	public ICloudExtensionClient getCloudExtensionClient() {
		if (this.iCloudExtensionClient == null) {
			this.iCloudExtensionClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_EXTENSION, ICloudExtensionClient.class, true);
		}
		return this.iCloudExtensionClient;
	}

	@Override
	public Object invokeWebHook(ISystemRuntime iSystemRuntime, String strKey, Object param) {
		return this.executeAction("调用WebHook", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onInvokeWebHook(iSystemRuntime, strKey, param);
			}
		}, null);
	}

	@Override
	public Object invokeDynaModelAPI(ISystemRuntime iSystemRuntime, String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param) {
		return this.invokeDynaModelAPI(iSystemRuntime, strPModel, strPKey, strModel, strMethod, strKey, param, false);
	}
	
	@Override
	public Object invokeDynaModelAPI(ISystemRuntime iSystemRuntime, String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param, boolean bIgnoreCheckDataAccessAction) {
		return this.executeAction("调用动态模型API", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onInvokeDynaModelAPI(iSystemRuntime, strPModel, strPKey, strModel, strMethod, strKey, param, bIgnoreCheckDataAccessAction);
			}
		}, null);
	}
	
	
	@Override
	public Object executeDynaModelAction(ISystemRuntime iSystemRuntime, IAction action, Object[] args) {
		Assert.notNull(action, "未传入系统运行时");
		Assert.notNull(action, "未传入执行行为");
		return this.executeAction("执行动态模型行为", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteDynaModelAction(iSystemRuntime, action, args);
			}
		}, args);
	}

	@Override
	public File getAppDataEntityJsonSchema(ISystemRuntime iSystemRuntime, String strAppTag, String strAppDataEntityTag, Object param, boolean bTryMode) {
		return this.executeAction("获取应用实体JsonSchema", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAppDataEntityJsonSchema(iSystemRuntime, strAppTag, strAppDataEntityTag, param, bTryMode);
			}
		}, null, File.class);
	}

	@Override
	public File getHubSubAppDataEntityJsonSchema(ISystemRuntime iSystemRuntime, String strAppTag, String strSubAppTag, String strAppDataEntityTag, Object param, boolean bTryMode) {
		return this.executeAction("获取Hub子应用实体JsonSchema", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetHubSubAppDataEntityJsonSchema(iSystemRuntime, strAppTag, strSubAppTag, strAppDataEntityTag, param, bTryMode);
			}
		}, null, File.class);
	}

	@Override
	public File getHubAppDynaModelFile(ISystemRuntime iSystemRuntime, String strAppTag, Object param, boolean bTryMode) {
		return this.executeAction("获取总线应用模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetHubAppDynaModelFile(iSystemRuntime, strAppTag, param, bTryMode);
			}
		}, null, File.class);
	}

	@Override
	public File getAppDynaModelFile(ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, Object param, boolean bTryMode) {
		return this.executeAction("获取应用模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAppDynaModelFile(iSystemRuntime, strAppTag, strModelUri, param, bTryMode);
			}
		}, null, File.class);
	}

	@Override
	public File getHubSubAppDynaModelFile(ISystemRuntime iSystemRuntime, String strAppTag, String strSubAppTag, String strModelUri, Object param, boolean bTryMode) {
		return this.executeAction("获取Hub子应用模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetHubSubAppDynaModelFile(iSystemRuntime, strAppTag, strSubAppTag, strModelUri, param, bTryMode);
			}
		}, null, File.class);
	}
	
	@Override
	public File getAppSimpleModelFile(ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, Object param, boolean bTryMode) {
		return this.executeAction("获取应用简单模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAppSimpleModelFile(iSystemRuntime, strAppTag, strModelUri, param, bTryMode);
			}
		}, null, File.class);
	}

	

	@Override
	public void reloadExtension(ISystemRuntime iSystemRuntime, String strExtensionId) {
		try {
			this.executeAction("重新加载扩展配置", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					onReloadExtension(iSystemRuntime, strExtensionId);
					return null;
				}
			}, null);
			this.logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]加载扩展配置成功", ServiceHub.getInstance().getId(), iSystemRuntime.getServiceId()), iSystemRuntime);
		}
		catch (Throwable ex) {
			this.logEvent(LogLevels.ERROR, String.format("服务系统[%2$s@%1$s]加载扩展配置发生异常，%3$s", ServiceHub.getInstance().getId(), iSystemRuntime.getServiceId(), ex.getMessage()), iSystemRuntime);
			throw ex;
		}
	}
	
	@Override
	public void reloadSystemMergences(ISystemRuntime iSystemRuntime, String strSystemId) {
		try {
			this.executeAction("重新加载系统合并配置", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					onReloadSystemMergences(iSystemRuntime, strSystemId);
					return null;
				}
			}, null);
			this.logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]加载系统合并配置成功", ServiceHub.getInstance().getId(), iSystemRuntime.getServiceId()), iSystemRuntime);
		}
		catch (Throwable ex) {
			this.logEvent(LogLevels.ERROR, String.format("服务系统[%2$s@%1$s]加载系统合并配置发生异常，%3$s", ServiceHub.getInstance().getId(), iSystemRuntime.getServiceId(), ex.getMessage()), iSystemRuntime);
			throw ex;
		}
	}
	

	@Override
	public CodeList getCodeList(ISystemRuntime iSystemRuntime, String strCodeListTag, int nMaxSize, Object param, boolean bTryMode) {
		return this.executeAction("获取代码表配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetCodeList(iSystemRuntime, strCodeListTag, nMaxSize, param, bTryMode);
			}
		}, null, CodeList.class);
	}
	
//	@Override
//	public String getBICubeCacheData(ISystemRuntime iSystemRuntime, String strBICubeTag) {
//		return this.executeAction("获取智能立方体扩展缓存数据", new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				return onGetBICubeCacheData(iSystemRuntime, strBICubeTag);
//			}
//		}, null, String.class);
//	}
//	
//	@Override
//	public String getFieldCacheData(ISystemRuntime iSystemRuntime, String strDataEntityTag) {
//		return this.executeAction("获取实体属性扩展缓存数据", new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				return onGetFieldCacheData(iSystemRuntime, strDataEntityTag);
//			}
//		}, null, String.class);
//	}
//	
//	@Override
//	public String getFormCacheData(ISystemRuntime iSystemRuntime, String strDataEntityTag) {
//		return this.executeAction("获取实体表单扩展缓存数据", new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				return onGetFormCacheData(iSystemRuntime, strDataEntityTag);
//			}
//		}, null, String.class);
//	}
	
	
	
	@Override
	public String getSystemExtensionBICubeCacheData(String strExtensionId, String strBICubeTag) {
		return this.getExtensionCacheState(String.format("ibiz-cloud-extension-bicube-%1$s--%2$s", strExtensionId, strBICubeTag));
	}

	@Override
	public String getSystemExtensionFieldCacheData(String strExtensionId, String strDataEntityTag) {
		return this.getExtensionCacheState(String.format("ibiz-cloud-extension-field-%1$s--%2$s", strExtensionId, strDataEntityTag));
	}

	@Override
	public String getSystemExtensionFormCacheData(String strExtensionId, String strDataEntityTag) {
		return this.getExtensionCacheState(String.format("ibiz-cloud-extension-form-%1$s--%2$s", strExtensionId, strDataEntityTag));
	}

	@Override
	public List<V2SystemExtensionBICube> getSystemExtensionBICubes(String strExtensionId) {
		return getSystemExtensionBICubes(strExtensionId, null);
	}
	
	@Override
	public List<V2SystemExtensionBICube> getSystemExtensionBICubes(String strExtensionId, String strBICubeTag) {
		return (List<V2SystemExtensionBICube>) this.executeAction("获取系统智能报表立方体扩展数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetSystemExtensionBICubes(strExtensionId, strBICubeTag);
			}
		}, null);
	}
	
	protected List<V2SystemExtensionBICube> onGetSystemExtensionBICubes(String strExtensionId, String strBICubeTag) throws Throwable {
		List<V2SystemExtensionBICube> list = new ArrayList<V2SystemExtensionBICube>();
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		
		if(StringUtils.hasLength(strBICubeTag)) {
			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_BI_CUBE_TAG, strBICubeTag);
		}
	
		searchContextDTO.nn(V2SystemExtensionBICube.FIELD_RUNTIME_MODEL);
		searchContextDTO.setPageSort("ORDER_VALUE,ASC;ITEM_TAG,ASC");
				
		int nStartPage = SearchContextDTO.STARTPAGE;
		int nPageSize = 1000;
		while(true) {
			searchContextDTO.setPageable(nStartPage, nPageSize, 0);
			Page<V2SystemExtensionBICube> page = this.getCloudExtensionClient().fetchSystemExtensionBICubes(strExtensionId, searchContextDTO);
			if(page != null && !ObjectUtils.isEmpty(page.getContent()) ) {
				nPageSize = page.getPageable().getPageSize();
				list.addAll(page.getContent());
				nStartPage ++;
				if(nStartPage >= page.getTotalPages()) {
					break;
				} 
			}
			else {
				break;
			}
		}
		return list;
	}
	
	
	@Override
	public List<V2SystemExtensionField> getSystemExtensionFields(String strExtensionId, String strDataEntityTag) {
		return (List<V2SystemExtensionField>) this.executeAction("获取实体属性扩展数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetSystemExtensionFields(strExtensionId, strDataEntityTag);
			}
		}, null);
	}
	
	protected List<V2SystemExtensionField> onGetSystemExtensionFields(String strExtensionId, String strDataEntityTag) throws Throwable {
		List<V2SystemExtensionField> list = new ArrayList<V2SystemExtensionField>();
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		
		searchContextDTO.eq(V2SystemExtensionField.FIELD_DATA_ENTITY_TAG, strDataEntityTag);
		searchContextDTO.nn(V2SystemExtensionField.FIELD_RUNTIME_MODEL);
		searchContextDTO.setPageSort("ORDER_VALUE,ASC;FIELD_TAG,ASC");
		
				
		int nStartPage = SearchContextDTO.STARTPAGE;
		int nPageSize = 1000;
		while(true) {
			searchContextDTO.setPageable(nStartPage, nPageSize, 0);
			Page<V2SystemExtensionField> page = this.getCloudExtensionClient().fetchSystemExtensionFields(strExtensionId, searchContextDTO);
			if(page != null && !ObjectUtils.isEmpty(page.getContent()) ) {
				nPageSize = page.getPageable().getPageSize();
				list.addAll(page.getContent());
				nStartPage ++;
				if(nStartPage >= page.getTotalPages()) {
					break;
				} 
			}
			else {
				break;
			}
		}
		return list;
	}
	
	@Override
	public List<V2SystemExtensionForm> getSystemExtensionForms(String strExtensionId, String strDataEntityTag) {
		return (List<V2SystemExtensionForm>) this.executeAction("获取实体表单扩展数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetSystemExtensionForms(strExtensionId, strDataEntityTag);
			}
		}, null);
	}
	
	protected List<V2SystemExtensionForm> onGetSystemExtensionForms(String strExtensionId, String strDataEntityTag) throws Throwable {
		List<V2SystemExtensionForm> list = new ArrayList<V2SystemExtensionForm>();
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		
		searchContextDTO.eq(V2SystemExtensionForm.FIELD_DATA_ENTITY_TAG, strDataEntityTag);
		searchContextDTO.nn(V2SystemExtensionForm.FIELD_RUNTIME_MODEL);
		searchContextDTO.setPageSort("ORDER_VALUE,ASC;FORM_TAG,ASC");
				
		int nStartPage = SearchContextDTO.STARTPAGE;
		int nPageSize = 1000;
		while(true) {
			searchContextDTO.setPageable(nStartPage, nPageSize, 0);
			Page<V2SystemExtensionForm> page = this.getCloudExtensionClient().fetchSystemExtensionForms(strExtensionId, searchContextDTO);
			if(page != null && !ObjectUtils.isEmpty(page.getContent()) ) {
				nPageSize = page.getPageable().getPageSize();
				list.addAll(page.getContent());
				nStartPage ++;
				if(nStartPage >= page.getTotalPages()) {
					break;
				} 
			}
			else {
				break;
			}
		}
		return list;
	}

	@Override
	public boolean publishDataSource(String id) {
		return this.executeAction("发布Cloud数据源配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onPublishDataSource(id);
			}
		}, null, Boolean.class);
	}

	protected boolean onPublishDataSource(String id) throws Throwable {
		// 获取指定数据源
		V2DataSource v2DataSource = this.getCloudExtensionClient().getDataSource(id);
		if (!DataTypeUtils.getBooleanValue(v2DataSource.getValidFlag(), true)) {
			throw new Exception(String.format("数据源[%1$s]未启用", v2DataSource.getName()));
		}
		return this.doPublishDataSource(v2DataSource);
	}

	protected boolean doPublishDataSource(V2DataSource v2DataSource) throws Throwable {
		// if(!StringUtils.hasLength(v2DataSource.getName())) {
		// throw new Exception(String.format("数据源[%1$s]未指定名称",
		// v2DataSource.getId()));
		// }
		String strConfigId = String.format("%1$s-%2$s", CLOUD_CONFIG_DBINST, v2DataSource.getId());

		Map<String, Object> map = new LinkedHashMap<String, Object>();
		if (StringUtils.hasLength(v2DataSource.getConfig())) {
			ConfigEntity configEntity = new ConfigEntity(v2DataSource.getConfig(), true);
			Map any = configEntity.any();
			if (any != null) {
				map.putAll(any);
			}
		}

		map.put(CLOUD_CONFIG_DBINST_DBTYPE, v2DataSource.getType());
		String strUsername = v2DataSource.getUsername();
		if (StringUtils.hasLength(strUsername)) {
			map.put(CLOUD_CONFIG_DBINST_USERNAME, strUsername);
		}
		String strPassword = v2DataSource.getPassword();
		if (StringUtils.hasLength(strPassword)) {
			map.put(CLOUD_CONFIG_DBINST_PASSWORD, strPassword);
		}
		String strUrl = v2DataSource.getUrl();
		if (StringUtils.hasLength(strUrl)) {
			map.put(CLOUD_CONFIG_DBINST_URL, strUrl);
		}

		ServiceHub.getInstance().publishConfig(strConfigId, map);
		return true;
	}

	@Override
	public void publishAllDataSources() {
		this.executeAction("发布Cloud全部数据源配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onPublishAllDataSources();
				return null;
			}
		}, null);
	}

	protected void onPublishAllDataSources() throws Throwable {
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all();
		searchContextDTO.eq(V2DataSource.FIELD_VALID_FLAG, 1);

		Page<V2DataSource> page = this.getCloudExtensionClient().fetchDataSources(searchContextDTO);
		if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
			for (V2DataSource v2DataSource : page.getContent()) {
				if (!DataTypeUtils.getBooleanValue(v2DataSource.getValidFlag(), true)) {
					continue;
				}

				this.doPublishDataSource(v2DataSource);
			}
		}
	}
	
	@Override
	public boolean publishServiceHub(String id) {
		return this.publishServiceHub(id, false);
	}

	@Override
	public boolean publishServiceHub(String id, boolean publishVer) {
		
		return this.executeAction("发布Cloud服务总线配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onPublishServiceHub(id, publishVer);
		}}, null, Boolean.class);
	}

	protected boolean onPublishServiceHub(String id, boolean publishVer) throws Throwable {
		// 获取指定服务总线
		V2ServiceHub v2ServiceHub = this.getCloudExtensionClient().getServiceHub(id);
		// if(!DataTypeUtils.getBooleanValue(v2ServiceHub.getValidFlag(), true))
		// {
		// throw new Exception(String.format("数据源[%1$s]未启用",
		// v2ServiceHub.getName()));
		// }
		if(this.doPublishServiceHub(v2ServiceHub)) {
			return this.doPublishServiceHubVer(v2ServiceHub);
		}
		return false;
	}

	protected boolean doPublishServiceHub(V2ServiceHub v2ServiceHub) throws Throwable {
		// 先发布
		if (!ObjectUtils.isEmpty(v2ServiceHub.getDeploySystems())) {

			for (V2ServiceHubDeploySystem serviceHubDeploySystem : v2ServiceHub.getDeploySystems()) {
				String strDeploySystemConfigId = String.format("%1$s-%2$s", CLOUD_CONFIG_DEPLOYSYSTEM, serviceHubDeploySystem.getDeploySystemId());
				// 获取配置
				String strConfig = ServiceHub.getInstance().getConfig(strDeploySystemConfigId);
				Map<String, Object> map = new LinkedHashMap<String, Object>();
				boolean bPublishConfig = true;
				if (StringUtils.hasLength(strConfig)) {
					ConfigEntity configEntity = new ConfigEntity(strConfig, true);
					Map any = configEntity.any();
					if(!ObjectUtils.isEmpty(any)) {
						map.putAll(any);
					}
					
					if(!map.containsKey(CLOUD_CONFIG_DEPLOYSYSTEM_EXTENSION)) {
						map.put(CLOUD_CONFIG_DEPLOYSYSTEM_EXTENSION, true);
					}
					else{
						bPublishConfig = false;
					}
				}
				else {
					map.put(CLOUD_CONFIG_DEPLOYSYSTEM_EXTENSION, true);
					map.put(CLOUD_CONFIG_DEPLOYSYSTEM_MODELPATH, CLOUD_CONFIG_DEPLOYSYSTEM_MODELPATH_REMOTE);
					map.put(CLOUD_CONFIG_DEPLOYSYSTEM_UPDATEDBSCHEMA, true);
				}

				if(bPublishConfig) {
					ServiceHub.getInstance().publishConfig(strDeploySystemConfigId, map);
					
					this.logEvent(LogLevels.INFO, String.format("服务系统[%1$s]更新配置成功", serviceHubDeploySystem.getDeploySystemId()), serviceHubDeploySystem);
				}
			}
		}

		String strServiceHubX = ServiceHub.getInstance().getConfig(CLOUD_CONFIGID_SERVICEHUB_X);
		if (StringUtils.hasLength(strServiceHubX)) {

			String strConfigId = String.format("%1$s-%2$s", CLOUD_CONFIG_SERVICEHUB, v2ServiceHub.getId());
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			ConfigEntity configEntity = new ConfigEntity(strServiceHubX, true);
			if (configEntity.any() != null) {
				map.putAll(configEntity.any());
			}

			List deploySystemList = null;
			Object deploysystems = map.get("deploysystems");
			if (!(deploysystems instanceof List)) {
				deploySystemList = new ArrayList<Object>();
				map.put("deploysystems", deploySystemList);
			} else {
				deploySystemList = (List) deploysystems;
			}

			Map dataSourceMap = null;
			Object datasources = map.get("datasources");
			if (!(datasources instanceof Map)) {
				dataSourceMap = new LinkedHashMap<String, Object>();
				map.put("datasources", dataSourceMap);
			} else {
				dataSourceMap = (Map) datasources;
			}

			if (!ObjectUtils.isEmpty(v2ServiceHub.getDeploySystems())) {
				for (V2ServiceHubDeploySystem serviceHubDeploySystem : v2ServiceHub.getDeploySystems()) {

					String strDeploySystemTag = serviceHubDeploySystem.getDeploySystemId();
					// Set<String> apis = entry2.getValue();
					// if (!ObjectUtils.isEmpty(apis)) {
					// for (String strAPIName : apis) {
					// if (strDeploySystemTag.indexOf(":") == -1) {
					// strDeploySystemTag += ":";
					// } else {
					// strDeploySystemTag += ",";
					// }
					// strDeploySystemTag += strAPIName;
					// }
					// }
					deploySystemList.add(strDeploySystemTag);

					// 判断是否有默认数据源
					// String strServiceHubDeploySystemTag =
					// String.format("%1$s|%2$s", strServiceHubId,
					// entry2.getKey());
					// String strPSDevCenterDBInstName =
					// deploySystemDBInstTagMap.get(strServiceHubDeploySystemTag);
					// if(StringUtils.hasLength(strPSDevCenterDBInstName)) {
					// dataSourceMap.put(String.format("%1$s__default",
					// entry2.getKey()), strPSDevCenterDBInstName);
					// }
				}
			}

			ServiceHub.getInstance().publishConfig(strConfigId, map);
			
			this.logEvent(LogLevels.INFO, String.format("服务总线[%1$s]更新配置成功", v2ServiceHub.getId()));
			
			return true;
		}
		else {
			log.error(String.format("Cloud未提供[x-servicehub]配置"));
			this.logEvent(LogLevels.ERROR, String.format("Cloud未提供[x-servicehub]配置"));
		}
		
		return false;
	}

	@Override
	public boolean publishServiceHubVer(String id) {
		return this.executeAction("发布Cloud服务总线配置版本", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onPublishServiceHubVer(id);
			}
		}, null, Boolean.class);
	}

	protected boolean onPublishServiceHubVer(String id) throws Throwable {
		V2ServiceHub v2ServiceHub = this.getCloudExtensionClient().getServiceHub(id);
		return this.doPublishServiceHubVer(v2ServiceHub);
	}

	protected boolean doPublishServiceHubVer(V2ServiceHub v2ServiceHub) throws Throwable {
		String strConfigId = String.format("%1$s-%2$s-ver", CLOUD_CONFIG_SERVICEHUB, v2ServiceHub.getId());
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("publishdate", DateUtils.getCurTimeString2());
		ServiceHub.getInstance().publishConfig(strConfigId, map);
		
		this.logEvent(LogLevels.INFO, String.format("服务总线[%1$s]更新配置版本成功", v2ServiceHub.getId()));
		
		return true;
	}

	@Override
	public boolean publishDeploySystemVer(String id) {
		return this.executeAction("发布Cloud服务系统配置版本", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onPublishDeploySystemVer(id);
			}
		}, null, Boolean.class);
	}

	protected boolean onPublishDeploySystemVer(String id) throws Throwable {
		V2DeploySystem v2DeploySystem = this.getCloudExtensionClient().getDeploySystem(id);
		return this.doPublishDeploySystemVer(v2DeploySystem);
	}

	protected boolean doPublishDeploySystemVer(V2DeploySystem v2DeploySystem) throws Throwable {
		String strConfigId = String.format("%1$s-%2$s-ver", CLOUD_CONFIG_DEPLOYSYSTEM, v2DeploySystem.getId());
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("publishdate", DateUtils.getCurTimeString2());
		if(StringUtils.hasLength(v2DeploySystem.getOssFile())) {
			map.put("modelossid", v2DeploySystem.getOssFile());
		}
		if(StringUtils.hasLength(v2DeploySystem.getOssFileDigest())) {
			map.put("modeldigest", v2DeploySystem.getOssFileDigest());
		}
		
		ServiceHub.getInstance().publishConfig(strConfigId, map);
		
		this.logEvent(LogLevels.INFO, String.format("服务系统[%1$s]更新配置版本成功", v2DeploySystem.getId()),  v2DeploySystem);
		
		return true;
	}

	@Override
	public boolean publishDeploySystem(String id) {
		return this.publishDeploySystem(id, false);
	}
	
	@Override
	public boolean publishDeploySystem(String id, boolean publishVer) {
		return this.executeAction("发布Cloud服务系统配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onPublishDeploySystem(id, publishVer);
			}
		}, null, Boolean.class);
	}

	protected boolean onPublishDeploySystem(String id, boolean publishVer) throws Throwable {
		V2DeploySystem v2DeploySystem = this.getCloudExtensionClient().getDeploySystem(id);
		this.doPublishDeploySystem(v2DeploySystem, false);
		if(publishVer) {
			return this.doPublishDeploySystemVer(v2DeploySystem);
		}
		return true;
	}
	
	protected boolean doPublishDeploySystem(V2DeploySystem v2DeploySystem, boolean bReplace) throws Throwable {
		
		String strDeploySystemConfigId = String.format("%1$s-%2$s", CLOUD_CONFIG_DEPLOYSYSTEM, v2DeploySystem.getId());
		// 获取配置
		String strConfig = ServiceHub.getInstance().getConfig(strDeploySystemConfigId);
		
		// 获取配置
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		boolean bPublishConfig = true;
		if (!bReplace && StringUtils.hasLength(strConfig)) {
			ConfigEntity configEntity = new ConfigEntity(strConfig, true);
			Map any = configEntity.any();
			if(!ObjectUtils.isEmpty(any)) {
				map.putAll(any);
			}
			
			if(!map.containsKey(CLOUD_CONFIG_DEPLOYSYSTEM_EXTENSION)) {
				map.put(CLOUD_CONFIG_DEPLOYSYSTEM_EXTENSION, true);
				map.put(CLOUD_CONFIG_DEPLOYSYSTEM_UPDATEDBSCHEMA, true);
			}
			else{
				bPublishConfig = false;
			}
		}
		else {
			map.put(CLOUD_CONFIG_DEPLOYSYSTEM_EXTENSION, true);
			map.put(CLOUD_CONFIG_DEPLOYSYSTEM_MODELPATH, CLOUD_CONFIG_DEPLOYSYSTEM_MODELPATH_REMOTE);
			map.put(CLOUD_CONFIG_DEPLOYSYSTEM_UPDATEDBSCHEMA, true);
		}

		if(bPublishConfig) {
			ServiceHub.getInstance().publishConfig(strDeploySystemConfigId, map);
			
			this.logEvent(LogLevels.INFO, String.format("服务系统[%1$s]更新配置成功", v2DeploySystem.getId()), v2DeploySystem);
			return true;
		}
		
//		if (bReplace || !StringUtils.hasLength(strConfig)) {
//			Map<String, Object> map = new LinkedHashMap<String, Object>();
//			map.put(CLOUD_CONFIG_DEPLOYSYSTEM_MODELPATH, CLOUD_CONFIG_DEPLOYSYSTEM_MODELPATH_REMOTE);
//			map.put(CLOUD_CONFIG_DEPLOYSYSTEM_UPDATEDBSCHEMA, true);
//			map.put(CLOUD_CONFIG_DEPLOYSYSTEM_EXTENSION, true);
//			ServiceHub.getInstance().publishConfig(strDeploySystemConfigId, map);
//			return true;
//		}
		return false;		
	}
	
	
	protected void doPublishSystemSource(V2DeploySystem v2DeploySystem, V2SystemVersion v2SystemVersion) throws Throwable {
		String strConfigId = String.format("%1$s-%2$s", CLOUD_CONFIG_SYSTEMSOURCE, v2DeploySystem.getId());
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("modelossid", v2SystemVersion.getOssFile());
		map.put("modeldigest", v2SystemVersion.getDigest());
		ServiceHub.getInstance().publishConfig(strConfigId, map);
		
		//通知回调
		ISysCloudClientUtilRuntime iSysCloudClientRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		iSysCloudClientRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS).get(String.format("/devcallback/%1$s/PUBCODE/token?THREADMODE=FALSE", v2DeploySystem.getId()));
		
		this.logEvent(LogLevels.INFO, String.format("服务系统[%1$s]更新Cloud源成功", v2DeploySystem.getId()), v2DeploySystem);
	}

	@Override
	public void publishAllServiceHubs() {
		

	}

	@Override
	public boolean publishDefaultAppGateway() {
		return false;
	}


	@Override
	public boolean publishSystemMergencesVer(String id) {
		return this.executeAction("发布系统合并版本", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onPublishSystemMergencesVerVer(id);
			}
		}, null, Boolean.class);
	}

	protected boolean onPublishSystemMergencesVerVer(String id) throws Throwable {
		V2System v2System = this.getCloudExtensionClient().getSystem(id);
		return this.doPublishSystemMergencesVer(v2System);
	}

	protected boolean doPublishSystemMergencesVer(V2System v2System) throws Throwable {
		String strConfigId = String.format("%1$s-%2$s-ver", CLOUD_CONFIG_SYSTEMMERGENCES, v2System.getId());
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("publishdate", DateUtils.getCurTimeString2());
		
		ServiceHub.getInstance().publishConfig(strConfigId, map);
		
		this.logEvent(LogLevels.INFO, String.format("系统[%1$s]更新合并配置版本成功", v2System.getId()),  v2System);
		
		return true;
	}
	
	@Override
	public V2SystemVersion createSystemVersion(String systemId, String versionName, boolean build) {
		return this.executeAction("建立系统版本", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateSystemVersion(systemId, versionName, build);
			}
		}, null, V2SystemVersion.class);
	}

	protected V2SystemVersion onCreateSystemVersion(String systemId, String versionName, boolean build) throws Throwable {
		// 获取系统信息
		V2System v2System = this.getCloudExtensionClient().getSystem(systemId);

		// 建立合并版本
		V2SystemVersion v2SystemVersion = this.doCreateSystemVersion(v2System, versionName);
		if (build) {
			try {
				v2SystemVersion = this.doBuildSystemVersion(v2System, v2SystemVersion);
				this.logEvent(LogLevels.INFO, String.format("系统版本[%2$s@%1$s]构建成功", systemId, v2SystemVersion.getName()), v2System);
			}
			catch (Throwable ex) {
				this.logEvent(LogLevels.ERROR, String.format("系统版本[%2$s@%1$s]构建发生异常，%3$s", systemId, v2SystemVersion.getName(), ex.getMessage()), v2System);
				throw ex;
			}
			
//			if (publishSource) {
//				this.doPublishSystemSource(v2System, v2SystemVersion);
//			}
			//return v2SystemVersion;
		}
		
		
		
		return v2SystemVersion;
	}

//	@Override
//	public void publishSystemSource(String systemId, String versionId) {
//		this.executeAction("发布Cloud部署系统源", new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				onPublishSystemSource(systemId, versionId);
//				return null;
//			}
//		}, null);
//	}
//
//	protected void onPublishSystemSource(String systemId, String versionId) throws Throwable {
//		// 获取系统信息
//		V2System v2System = this.getCloudExtensionClient().getSystem(systemId);
//		// 获取系统信息
//		V2SystemVersion v2SystemVersion = this.getCloudExtensionClient().getSystemVersion(systemId, versionId);
//
//		this.doPublishSystemSource(v2System, v2SystemVersion);
//		
//		
//		
//	}

	@Override
	public V2SystemVersion buildSystemVersion(String systemId, String versionId) {
		return this.executeAction("构建系统版本", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onBuildSystemVersion(systemId, versionId);
			}
		}, null, V2SystemVersion.class);
	}

	protected V2SystemVersion onBuildSystemVersion(String systemId, String versionId) throws Throwable {
		// 获取系统信息
		V2System v2System = this.getCloudExtensionClient().getSystem(systemId);
		// 获取系统信息
		V2SystemVersion v2SystemVersion = this.getCloudExtensionClient().getSystemVersion(systemId, versionId);

		return this.doBuildSystemVersion(v2System, v2SystemVersion);
	}

	protected V2SystemVersion doBuildSystemVersion(V2System v2System, V2SystemVersion v2SystemVersion) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		
		
		ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysFileUtilRuntime(false);

		File majorFile = null;
		V2SystemSource majorV2SystemSource = null;
		if (StringUtils.hasLength(v2SystemVersion.getSystemSourceId())) {
			majorV2SystemSource = this.getCloudExtensionClient().getSystemSource(v2System.getId(), v2SystemVersion.getSystemSourceId());
			majorFile = this.doGetSystemSource(v2System, v2System, majorV2SystemSource);
			if (majorFile == null) {
				throw new Exception(String.format("系统[%1$s]未提供源", v2System.getName()));
			}
		}

		Map<V2SystemSource, File> v2SystemFileMap = new LinkedHashMap<V2SystemSource, File>();
		List<V2SystemVersionSource> list = v2SystemVersion.getSources();
		if (!ObjectUtils.isEmpty(list)) {
			for (V2SystemVersionSource v2SystemVersionSource : list) {
				V2SystemSource v2SystemSource = this.getCloudExtensionClient().getSystemSource(v2SystemVersionSource.getMergeSystemId(), v2SystemVersionSource.getSystemSourceId());
				V2System mergeV2system = this.getCloudExtensionClient().getSystem(v2SystemVersionSource.getMergeSystemId());
				
				File file = this.doGetSystemSource(v2System, mergeV2system, v2SystemSource);
				if (file != null) {
					v2SystemFileMap.put(v2SystemSource, file);
				} else {
					log.warn(String.format("系统[%1$s]未提供源", mergeV2system.getName()));
				}
			}
		}

		majorFile = doMergeSystem(v2System, majorV2SystemSource, majorFile, v2SystemFileMap);

		if(actionSession!=null) {
			actionSession.updateActionStep(String.format("正在上传系统版本[%2$s@%1$s]", v2System.getName(), v2SystemVersion.getName()));
		}
		
		// 建立模型压缩文件
		File zipTempFile = File.createTempFile("model_" + v2System.getId(), ".zip");
		ZipUtils.zip(majorFile, zipTempFile);
		String strFileHashCode = "";
		try (FileInputStream fis = new FileInputStream(zipTempFile)) {
			strFileHashCode = DigestUtils.md5DigestAsHex(fis);
		}

		String strMD5Code = v2SystemVersion.getDigest();
		String strOSSFileId = v2SystemVersion.getOssFile();
		int nVersion = DataTypeUtils.getIntegerValue(v2SystemVersion.getVersion(), 1);
		if (!StringUtils.hasLength(strMD5Code) || !StringUtils.hasLength(strOSSFileId) || !strMD5Code.equals(strFileHashCode)) {
			// 上传更新
			String strOSSCat = ISysExtensionUtilRuntime.OSSCAT_DYNAMODEL;
			net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.createOSSFile(zipTempFile, strOSSCat);
			V2SystemVersion v2SystemVersion2 = new V2SystemVersion();
			v2SystemVersion2.setOssFile(ossFile.getOSSId());
			v2SystemVersion2.setDigest(strFileHashCode);
			v2SystemVersion2.setVersion(nVersion + 1);
			v2SystemVersion2.setState(V2SystemVersionState.BUILDED.value);

			// 提取模型信息
			PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
			psModelServiceImpl.setPSModelFolderPath(majorFile.getCanonicalPath());

			List<IPSApplication> psApplicationList = psModelServiceImpl.getPSSystem().getAllPSApps();
			if (!ObjectUtils.isEmpty(psApplicationList)) {
				ArrayNode arrayNode = JsonUtils.createArrayNode();
				for (IPSApplication iPSApplication : psApplicationList) {
					ObjectNode node = arrayNode.addObject();
					node.put("id", iPSApplication.getCodeName());
					node.put("name", iPSApplication.getName());
					node.put("mode", iPSApplication.getAppMode());
					node.put("mobile", iPSApplication.isMobileApp());
				}
				v2SystemVersion2.setAppModel(arrayNode.toPrettyString());
			} else {
				v2SystemVersion2.setAppModel(null);
			}

			List<IPSSysServiceAPI> psSysServiceAPIList = psModelServiceImpl.getPSSystem().getAllPSSysServiceAPIs();
			if (!ObjectUtils.isEmpty(psSysServiceAPIList)) {
				ArrayNode arrayNode = JsonUtils.createArrayNode();
				for (IPSSysServiceAPI iPSSysServiceAPI : psSysServiceAPIList) {
					ObjectNode node = arrayNode.addObject();
					node.put("id", iPSSysServiceAPI.getCodeName());
					node.put("name", iPSSysServiceAPI.getName());
					node.put("mode", iPSSysServiceAPI.getAPIMode());
					node.put("level", iPSSysServiceAPI.getAPILevel());
					node.put("type", iPSSysServiceAPI.getAPIType());
				}
				v2SystemVersion2.setApiModel(arrayNode.toPrettyString());
			} else {
				v2SystemVersion2.setApiModel(null);
			}

			v2SystemVersion2 = this.getCloudExtensionClient().updateSystemVersion(v2SystemVersion.getSystemId(), v2SystemVersion.getId(), v2SystemVersion2);

			strMD5Code = v2SystemVersion2.getDigest();
			strOSSFileId = v2SystemVersion2.getOssFile();
			nVersion = v2SystemVersion2.getVersion();
			return v2SystemVersion2;
		}

		throw new Exception(String.format("构建数据无效"));
	}

	protected File doMergeSystem(V2System v2System, V2SystemSource v2SystemSource, File majorFile, Map<V2SystemSource, File> v2SystemFileMap) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		
		ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysFileUtilRuntime(false);
		File tempFile = File.createTempFile("model.", "");
		String strPSModelFolderPath = majorFile.getCanonicalPath();

		List<ObjectNode> objectNodeList = new ArrayList<ObjectNode>();

		for (java.util.Map.Entry<V2SystemSource, File> entry : v2SystemFileMap.entrySet()) {
			// 进行合并
			// 建立模型压缩文件
			if(actionSession!=null) {
				actionSession.updateActionStep(String.format("正在合入系统[%2$s@%1$s]", entry.getKey().getSystemName(), entry.getKey().getName()));
			}
			
			File zipTempFile = File.createTempFile("model_" + entry.getKey().getId(), ".zip");
			ZipUtils.zip(entry.getValue(), zipTempFile);
			String strFileHashCode = "";
			try (FileInputStream fis = new FileInputStream(zipTempFile)) {
				strFileHashCode = DigestUtils.md5DigestAsHex(fis);
			}

			String strMD5Code = entry.getKey().getDigest();
			String strOSSFileId = entry.getKey().getOssFile();
			int nVersion = DataTypeUtils.getIntegerValue(entry.getKey().getVersion(), 1);
			if (!StringUtils.hasLength(strMD5Code) || !StringUtils.hasLength(strOSSFileId) || !strMD5Code.equals(strFileHashCode)) {
				// 上传更新
				String strOSSCat = ISysExtensionUtilRuntime.OSSCAT_DYNAMODEL;
				net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.createOSSFile(zipTempFile, strOSSCat);
				V2SystemSource v2SystemSource2 = new V2SystemSource();
				v2SystemSource2.setOssFile(ossFile.getOSSId());
				v2SystemSource2.setDigest(strFileHashCode);
				v2SystemSource2.setVersion(nVersion + 1);
				v2SystemSource2 = this.getCloudExtensionClient().updateSystemSource(entry.getKey().getSystemId(), entry.getKey().getId(), v2SystemSource2);

				strMD5Code = v2SystemSource2.getDigest();
				strOSSFileId = v2SystemSource2.getOssFile();
				nVersion = v2SystemSource2.getVersion();
			}

			// 建立临时目录
			File folder = new File(tempFile.getCanonicalPath() + "." + entry.getKey().getId());
			folder.mkdirs();

			PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
			psModelServiceImpl.setPSModelFolderPath(entry.getValue().getCanonicalPath(), false);
			IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();

			String strSysType = iPSSystem.getSysType();
			if (!StringUtils.hasLength(strSysType)) {
				strSysType = DevSysType.DEVSYS.value;
			}

			// 仅合并类型DEVSYS
			if (DevSysType.DEVSYS.value.equals(strSysType)) {
				ExtensionPSModelMergeContext psModelMergeContext = new ExtensionPSModelMergeContext();
				psModelMergeContext.setPSModelFolderPath(strPSModelFolderPath);
				psModelMergeContext.setMergePSModelFolderPath(entry.getValue().getCanonicalPath());
				psModelMergeContext.setDstPSModelFolderPath(folder.getCanonicalPath());

				PSModelMergeUtils.merge(psModelMergeContext);
				strPSModelFolderPath = folder.getCanonicalPath();
			}

			// 写入子系统信息
			ObjectNode objectNode = JsonUtils.createObjectNode();
			objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTYPE, String.format("EXTENSION_%1$s", strSysType));
			objectNode.put(PSSysRefImpl.ATTR_GETNAME, iPSSystem.getLogicName());
			objectNode.put(PSSysRefImpl.ATTR_GETID, entry.getKey().getId());
			objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTAG, entry.getKey().getSystemId());
			objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM, strOSSFileId);
			objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM2, strMD5Code);

			objectNodeList.add(objectNode);

		}

		// 根据系统类型，附加子系统引用
		if (!ObjectUtils.isEmpty(objectNodeList)) {
			File modelFile = new File(strPSModelFolderPath + File.separator + "PSSYSTEM.json");
			ObjectNode objectNode = (ObjectNode) PSModelListMergerBase.MAPPER.readTree(modelFile);
			JsonNode jsonNode = objectNode.get(PSSystemImpl.ATTR_GETALLPSSYSREFS);
			ArrayNode arrayNode = null;
			if (jsonNode != null) {
				arrayNode = (ArrayNode) jsonNode;
			} else {
				arrayNode = objectNode.putArray(PSSystemImpl.ATTR_GETALLPSSYSREFS);
			}
			for (ObjectNode node : objectNodeList) {
				arrayNode.add(node);
			}

			try (FileOutputStream os = new FileOutputStream(modelFile)) {
				PSModelListMergerBase.MAPPER.writerWithDefaultPrettyPrinter().writeValue(os, objectNode);
			}
		}

		if (!majorFile.getCanonicalPath().equals(strPSModelFolderPath)) {
			// 拷贝应用
			FileUtils.copyDirectory(new File(majorFile.getCanonicalPath() + File.separator + "PSSYSAPPS"), new File(strPSModelFolderPath + File.separator + "PSSYSAPPS"));
			PSModelMergeUtils.verify(strPSModelFolderPath);
		}
		return new File(strPSModelFolderPath);
	}

	protected File doGetSystemSource(V2System v2System, V2System mergeV2System, V2SystemSource mergeV2SystemSource) throws Exception {

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		
		String strSystemPath = v2System.getName();
		String strMergeSystemPath = mergeV2System.getName();
		if (StringUtils.hasLength(v2System.getHttpUrlToRepo())) {
			String[] items = v2System.getHttpUrlToRepo().split("[/]");
			strSystemPath = items[items.length - 1].replace(".git", "");
		}

		if (StringUtils.hasLength(mergeV2System.getHttpUrlToRepo())) {
			String[] items = mergeV2System.getHttpUrlToRepo().split("[/]");
			strMergeSystemPath = items[items.length - 1].replace(".git", "");
		}

		String strFilePath = String.format("%1$s%2$s%3$s%2$s%4$s_%7$s%2$s%5$s_%8$s%2$s%6$s", ServiceHub.getInstance().getServiceHubSetting().getSystemModelFolder(), File.separator, "systemsources", strSystemPath, strMergeSystemPath, mergeV2SystemSource.getName(), v2System.getId(), mergeV2System.getId());

		File file = new File(strFilePath);

		String strPath = file.getCanonicalPath();
		String strGitPath = mergeV2System.getHttpUrlToRepo();
		String strBranch = mergeV2SystemSource.getName();
		if (!StringUtils.hasLength(strBranch)) {
			strBranch = "master";
		}
		String strGitUserName = null;
		String strGitPassword = null;
		
		if(actionSession!=null) {
			actionSession.updateActionStep(String.format("正在下载系统源[%2$s@%1$s]", mergeV2System.getName(), strBranch));
		}

		if (file.exists()) {
			try (FileRepository fr = new FileRepository(new File(String.format("%1$s%2$s.git", strPath, File.separator))); Git git = new Git(fr)) {
				PullCommand pullCommand = git.pull().setRemoteBranchName(strBranch);
				if (StringUtils.hasLength(strGitUserName)) {
					if (StringUtils.hasLength(strGitPassword)) {
						pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
					} else {
						pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
					}
				}
				pullCommand.call();
			}

		} else {
			file.mkdirs();
			CloneCommand cloneCommand = Git.cloneRepository().setURI(strGitPath).setDirectory(file).setBranch(strBranch);
			if (StringUtils.hasLength(strGitUserName)) {
				if (StringUtils.hasLength(strGitPassword)) {
					cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
				} else {
					cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
				}
			}
			cloneCommand.call();
		}

		File modelFile = new File(String.format("%1$s%2$sibizmodel.yaml", strPath, File.separator));
		if (modelFile.exists()) {
			// 从配置文件中提取目录
			try {
				Yaml yaml = new Yaml();
				Map config = yaml.loadAs(new FileInputStream(modelFile), Map.class);
				if (config != null) {
					String strModelFolder = (String) config.get("modelfolder");
					if (StringUtils.hasLength(strModelFolder)) {
						return new File(strPath + File.separator + strModelFolder);
					}
				}
			} catch (Throwable ex) {
				log.error(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
				throw new Exception(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		return null;
	}

	@Override
	public V2DeploySystem applySystemVersion(String deploySystemId, String versionId, boolean publishVer) {
		return this.executeAction("服务系统应用版本", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onApplySystemVersion(deploySystemId, versionId, publishVer);
			}
		}, null, V2DeploySystem.class);
	}

	protected V2DeploySystem onApplySystemVersion(String deploySystemId, String versionId, boolean publishVer) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		// 获取部署系统
		V2DeploySystem v2DeploySystem = this.getCloudExtensionClient().getDeploySystem(deploySystemId);
		V2SystemVersion v2SystemVersion = null;
		if(StringUtils.hasLength(versionId) && !versionId.equals(v2DeploySystem.getSystemVersionId())) {
			
			// 建立获取版本
			v2SystemVersion = this.getCloudExtensionClient().getSystemVersion(v2DeploySystem.getSystemId(), versionId);
			if(!StringUtils.hasLength(v2SystemVersion.getOssFile())) {
				throw new Exception(String.format("系统版本[%1$s]未指定OSS文件", v2SystemVersion.getName()));
			}
			
			if(actionSession != null) {
				actionSession.updateActionStep(String.format("正在下载系统版本[%2$s@%1$s]", v2SystemVersion.getSystemName(), v2SystemVersion.getName()));
			}
			
			ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysFileUtilRuntime(false);
			String strOSSCat = OSSCAT_DYNAMODEL;
			net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.getOSSFile(v2SystemVersion.getOssFile(), strOSSCat, true);
			if (ossFile == null) {
				ossFile = this.getSysFileUtilRuntime().getOSSFile(v2SystemVersion.getOssFile(), null, true);
				if (ossFile == null) {
					throw new Exception(String.format("系统版本[%1$s]指定模型文件[%2$s]不存在", v2SystemVersion.getName(), v2SystemVersion.getOssFile()));
				}
			}

			File dynaModelFolder = null;
//			String strFolder = KeyValueUtils.genUniqueId(strSystemId, strOSSFileId).toLowerCase();
//			if (StringUtils.hasLength(this.getDynaModelPath())) {
//				dynaModelFolder = new File(this.getDynaModelPath() + File.separator + strFolder.substring(0, 2) + File.separator + strFolder);
//			} else 
			{
				Path pathTempDirectory = Files.createTempDirectory("model");
				dynaModelFolder = pathTempDirectory.toFile();
			}

			// 解压缩
			// 判断文件是否存在
			File systemModelFile = new File(dynaModelFolder.getAbsolutePath() + File.separator + "PSSYSTEM.json");
			if (!systemModelFile.exists()) {
				ZipUtils.unzip(new File(ossFile.getLocalPath()), dynaModelFolder);
			}
			
			PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
			psModelServiceImpl.setPSModelFolderPath(dynaModelFolder.getAbsolutePath());
			
			
			
			Map<String, V2DeploySystemDataSource> v2DeploySystemDataSourceMap = new LinkedHashMap<String, V2DeploySystemDataSource>();
			List<V2DeploySystemDataSource> list = v2DeploySystem.getDataSources();
			if(!ObjectUtils.isEmpty(list)) {
				for(V2DeploySystemDataSource item : list) {
					v2DeploySystemDataSourceMap.put(item.getName(), item);
				}
			}
			
			if(actionSession != null) {
				actionSession.updateActionStep(String.format("正在更新服务系统[%1$s]信息", v2DeploySystem.getId()));
			}
			
			//展开数据
			V2DeploySystem v2DeploySystem2 = new V2DeploySystem();
			v2DeploySystem2.setId(v2DeploySystem.getId());
			v2DeploySystem2.setSystemVersionId(versionId);
			
			java.util.List<IPSSysDBScheme> psSysDBSchemeList = psModelServiceImpl.getPSSystem().getAllPSSysDBSchemes();
			if(!ObjectUtils.isEmpty(psSysDBSchemeList)) {
				if(list == null) {
					list = new ArrayList<V2DeploySystemDataSource>();
				}
				for(IPSSysDBScheme iPSSysDBScheme : psSysDBSchemeList) {
					String strTag = String.format("db.%1$s", PSModelUtils.calcUniqueTag(iPSSysDBScheme.getPSSysModelGroup(), iPSSysDBScheme.getDSLink()));
					if(v2DeploySystemDataSourceMap.containsKey(strTag)) {
						continue;
					}
					
					V2DeploySystemDataSource item = new V2DeploySystemDataSource();
					item.setName(strTag);
					list.add(item);
				}
				v2DeploySystem2.setDataSources(list);
			}	
			
			v2DeploySystem = this.getCloudExtensionClient().updateDeploySystem(v2DeploySystem2.getId(), v2DeploySystem2);
			
		}
		if(v2SystemVersion != null) {
			this.doPublishSystemSource(v2DeploySystem, v2SystemVersion);
		}
		if(publishVer && v2SystemVersion!=null) {
			this.doPublishDeploySystemVer(v2DeploySystem);
		}
		this.logEvent(LogLevels.INFO, String.format("服务系统[%1$s]应用版本[%2$s]成功", v2DeploySystem.getId(), v2SystemVersion.getName()), v2DeploySystem);
		return v2DeploySystem;
	}

	protected V2SystemVersion doCreateSystemVersion(V2System v2System, String versionName) throws Throwable {
		Map<String, V2SystemMerge> v2SystemMergeMap = new LinkedHashMap<String, V2SystemMerge>();
		if (true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.eq(V2SystemMerge.FIELD_VALID_FLAG, 1);
			searchContextDTO.sort(V2SystemMerge.FIELD_ORDER_VALUE);
			searchContextDTO.all();
			Page<V2SystemMerge> v2SystemMergePage = this.getCloudExtensionClient().fetchSystemMerges(v2System.getId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(v2SystemMergePage) && !ObjectUtils.isEmpty(v2SystemMergePage.getContent())) {
				for (V2SystemMerge v2SystemMerge : v2SystemMergePage.getContent()) {
					v2SystemMergeMap.put(v2SystemMerge.getMergeSystemId(), v2SystemMerge);
				}
			}
		}

		List<V2SystemVersionSource> sourceList = new ArrayList<V2SystemVersionSource>();
		for (V2SystemMerge v2SystemMerge : v2SystemMergeMap.values()) {

			String strSystemSourceId = v2SystemMerge.getMergeSystemSourceId();
			if (!StringUtils.hasLength(strSystemSourceId)) {

				SearchContextDTO searchContextDTO = new SearchContextDTO();
				searchContextDTO.eq(V2SystemVersion.FIELD_TYPE, V2SystemType.CORE.value);
				searchContextDTO.all();

				V2System mergeV2System = this.getCloudExtensionClient().getSystem(v2SystemMerge.getMergeSystemId());

				List<V2SystemVersion> v2SystemVersionList = doGetSystemVersionList(mergeV2System, true);
				if (!ObjectUtils.isEmpty(v2SystemVersionList)) {
					for (V2SystemVersion v2SystemVersion : v2SystemVersionList) {
						if (DataTypeUtils.getBooleanValue(v2SystemVersion.getDefaultFlag(), false)) {
							if (!ObjectUtils.isEmpty(v2SystemVersion.getSources())) {
								strSystemSourceId = v2SystemVersion.getSources().get(0).getSystemSourceId();
								break;
							}
						}
					}
					if (!StringUtils.hasLength(strSystemSourceId)) {
						for (V2SystemVersion v2SystemVersion : v2SystemVersionList) {
							strSystemSourceId = v2SystemVersion.getSystemSourceId();
							break;
						}
					}
				}
			}

			if (!StringUtils.hasLength(strSystemSourceId)) {
				throw new Exception(String.format("未获取功能系统[%1$s]源系统", v2SystemMerge.getId()));
			}

			V2SystemVersionSource v2SystemVersionSource = new V2SystemVersionSource();
			v2SystemVersionSource.setSystemSourceId(strSystemSourceId);
			sourceList.add(v2SystemVersionSource);
		}

		V2SystemVersion v2SystemVersion = null;
		if (true) {
			// SearchContextDTO searchContextDTO = new SearchContextDTO();
			// searchContextDTO.all();
			// searchContextDTO.eq(V2SystemVersion.FIELD_TYPE, "CORE");

			List<V2SystemVersion> v2SystemVersionList = doGetSystemVersionList(v2System, true);

			// Page<V2SystemVersion> v2SystemVersionPage =
			// this.getCloudExtensionClient().fetchSystemVersions(v2System.getId(),
			// searchContextDTO);
			if (!ObjectUtils.isEmpty(v2SystemVersionList)) {
				String strDefaultBranch = v2System.getDefaultBranch();
				if (!StringUtils.hasLength(strDefaultBranch)) {
					strDefaultBranch = "master";
				}
				for (V2SystemVersion version : v2SystemVersionList) {
					if (V2SystemVersionType.CORE.value.equals(version.getType())) {
						if (strDefaultBranch.equalsIgnoreCase(version.getName())) {
							v2SystemVersion = version;
							break;
						}
					}
				}
				if (v2SystemVersion == null) {
					for (V2SystemVersion version : v2SystemVersionList) {
						if (V2SystemVersionType.CORE.value.equals(version.getType())) {
							v2SystemVersion = version;
							break;
						}
					}
				}
			}
		}

		if (v2SystemVersion == null) {
			throw new Exception(String.format("无法获取指定系统[%1$s]默认版本", v2System.getName()));
		}

		V2SystemVersion mergeV2SystemVersion = new V2SystemVersion();
		mergeV2SystemVersion.setType(V2SystemVersionType.MERGE.value);
		mergeV2SystemVersion.setSystemSourceId(v2SystemVersion.getSystemSourceId());
		if (StringUtils.hasLength(versionName)) {
			mergeV2SystemVersion.setName(String.format("%2$s_%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", new java.util.Date(), versionName));
		} else {
			mergeV2SystemVersion.setName(String.format("%2$s_%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", new java.util.Date(), v2SystemVersion.getName()));
		}

		mergeV2SystemVersion.setSources(sourceList);
		mergeV2SystemVersion = this.getCloudExtensionClient().createSystemVersion(v2System.getId(), mergeV2SystemVersion);

		return mergeV2SystemVersion;
	}

	protected List<V2SystemVersion> doGetSystemVersionList(V2System v2System, boolean bRebuild) throws Throwable {

		List<V2SystemVersion> v2SystemVersionList = new ArrayList<V2SystemVersion>();

		Map<String, V2SystemVersion> v2SystemVersionMap = new HashMap<String, V2SystemVersion>();
		if (true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			// searchContextDTO.eq(V2SystemVersion.FIELD_TYPE, "CORE");
			Page<V2SystemVersion> v2SystemVersionPage = this.getCloudExtensionClient().fetchSystemVersions(v2System.getId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(v2SystemVersionPage) && !ObjectUtils.isEmpty(v2SystemVersionPage.getContent())) {
				v2SystemVersionList.addAll(v2SystemVersionPage.getContent());
				for (V2SystemVersion v2SystemVersion : v2SystemVersionPage.getContent()) {
					if (V2SystemVersionType.CORE.value.equals(v2SystemVersion.getType())) {
						v2SystemVersionMap.put(v2SystemVersion.getName().toLowerCase(), v2SystemVersion);
					}
				}
			}
		}

		Map<String, V2SystemSource> v2SystemSourceMap = new HashMap<String, V2SystemSource>();
		if (bRebuild) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			Page<V2SystemSource> v2SystemSourcePage = this.getCloudExtensionClient().fetchSystemSources(v2System.getId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(v2SystemSourcePage) && !ObjectUtils.isEmpty(v2SystemSourcePage.getContent())) {
				for (V2SystemSource v2SystemSource : v2SystemSourcePage.getContent()) {
					v2SystemSourceMap.put(v2SystemSource.getName().toLowerCase(), v2SystemSource);
				}
			}

			Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
			Map<String, Object> uriParams = new LinkedHashMap<String, Object>();

			String strPath = "";
			strPath = "/projects/{projectid}/repository/branches";
			uriParams.put("projectid", v2System.getProductId());

			String strUrl = String.format("%1$s%2$s", this.getProductMarketServiceUrl(), strPath);

			IWebClientRep<String> rep;
			try {
				rep = this.getSystemRuntime().getDefaultWebClient().get(strUrl, uriParams, null, queryParams, String.class, null);
			} catch (Throwable ex) {
				throw new Exception(String.format("请求市场发生异常，%1$s", ex.getMessage()), ex);
			}

			int nTotal = DataTypeUtils.getIntegerValue(rep.getHeader("X-Total"), 0);
			List list = WebClientBase.MAPPER.readValue(rep.getBody(), List.class);

			for (Object objItem : list) {
				if (!(objItem instanceof Map)) {
					continue;
				}

				Map item = (Map) objItem;
				String strName = DataTypeUtils.getStringValue(item.get("name"), null);
				if (!StringUtils.hasLength(strName)) {
					continue;
				}

				V2SystemSource v2SystemSource = v2SystemSourceMap.get(strName.toLowerCase());
				if (v2SystemSource == null) {
					v2SystemSource = new V2SystemSource();
					v2SystemSource.setName(strName.toLowerCase());
					v2SystemSource = this.getCloudExtensionClient().createSystemSource(v2System.getId(), v2SystemSource);
					v2SystemSourceMap.put(strName.toLowerCase(), v2SystemSource);
				}

			}

			// 构建版本
			for (V2SystemSource v2SystemSource : v2SystemSourceMap.values()) {

				V2SystemVersion v2SystemVersion = v2SystemVersionMap.get(v2SystemSource.getName());
				if (v2SystemVersion == null) {
					v2SystemVersion = new V2SystemVersion();
					v2SystemVersion.setType(V2SystemVersionType.CORE.value);
					v2SystemVersion.setName(v2SystemSource.getName());
					v2SystemVersion.setSystemSourceId(v2SystemSource.getId());
					v2SystemVersion = this.getCloudExtensionClient().createSystemVersion(v2System.getId(), v2SystemVersion);
					v2SystemVersionMap.put(v2SystemSource.getName(), v2SystemVersion);

					v2SystemVersionList.add(v2SystemVersion);
				}
			}
		}
		return v2SystemVersionList;
	}
	
	@Override
	public File mergeDeploySystems(File majorModelFile, List<DeploySystem> deploySystems, boolean bVerifyModel) {
		
		Assert.notEmpty(deploySystems, "传入合并系统模型目录无效");
		
		return this.executeAction("合并传入系统模型", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onMergeDeploySystems(majorModelFile, deploySystems, bVerifyModel);
			}
		}, null, File.class);
	}
	
	
	protected File onMergeDeploySystems(File majorModelFile, List<DeploySystem> deploySystems, boolean bVerifyModel) throws Throwable {

		File tempFile = File.createTempFile("model.", "");
		String strPSModelFolderPath = majorModelFile.getCanonicalPath();
		
		List<ObjectNode> objectNodeList = new ArrayList<ObjectNode>();
		
		for(DeploySystem deploySystem : deploySystems) {
			
			PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
			psModelServiceImpl.setPSModelFolderPath(deploySystem.getModelPath(), false);
			IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();
			
			File folder = new File(tempFile.getCanonicalPath() + "." + deploySystem.getDeploySystemId());
			folder.mkdirs();
			
			String strSysType = iPSSystem.getSysType();
			if(!StringUtils.hasLength(strSysType)) {
				strSysType = DevSysType.DEVSYS.value;
			}
			
			String strDeploySysType = iPSSystem.getDeploySysType();
			
			//仅合并类型DEVSYS
			if(DevSysType.DEVSYS.value.equals(strSysType)) {
				
				if(DeploySysType.MS_EMBEDED.value.equals(strDeploySysType)) {
					ExtensionPSModelMergeContext psModelMergeContext = new ExtensionPSModelMergeContext();
					psModelMergeContext.setPSModelFolderPath(strPSModelFolderPath);
					psModelMergeContext.setMergePSModelFolderPath(deploySystem.getModelPath());
					psModelMergeContext.setDstPSModelFolderPath(folder.getCanonicalPath());
					try {
						PSModelMergeUtils.merge(psModelMergeContext);
					}
					catch (Throwable ex) {
						throw new Exception(String.format("合入系统模型[%1$s]发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
					}
					
					strPSModelFolderPath = folder.getCanonicalPath();
				}
			}
			
			
			//写入子系统信息
			ObjectNode objectNode = JsonUtils.createObjectNode();
			objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTYPE, String.format("EXTENSION_%1$s", strSysType));
			objectNode.put(PSSysRefImpl.ATTR_GETNAME, iPSSystem.getLogicName());
			objectNode.put(PSSysRefImpl.ATTR_GETID, deploySystem.getDeploySystemId());
			objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTAG, deploySystem.getDeploySystemId());
			objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM, deploySystem.getModelPath());
//			objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM2, strMD5Code);
			
			objectNodeList.add(objectNode);
			
		}
	
		//根据系统类型，附加子系统引用
		if(!ObjectUtils.isEmpty(objectNodeList)) {
			File modelFile = new File(strPSModelFolderPath + File.separator + "PSSYSTEM.json");
			ObjectNode objectNode = (ObjectNode) PSModelListMergerBase.MAPPER.readTree(modelFile);
			JsonNode jsonNode = objectNode.get(PSSystemImpl.ATTR_GETALLPSSYSREFS);
			ArrayNode arrayNode = null;
			if(jsonNode != null) {
				arrayNode = (ArrayNode)jsonNode;
			}
			else {
				arrayNode = objectNode.putArray(PSSystemImpl.ATTR_GETALLPSSYSREFS);
			}
			for(ObjectNode node : objectNodeList) {
				arrayNode.add(node);
			}
			
			try (FileOutputStream os = new FileOutputStream(modelFile)) {
				PSModelListMergerBase.MAPPER.writerWithDefaultPrettyPrinter().writeValue(os, objectNode);
				os.flush();
			}
		}	
		
		if(!majorModelFile.getCanonicalPath().equals(strPSModelFolderPath)) {
			//拷贝应用
			FileUtils.copyDirectory(new File(majorModelFile.getCanonicalPath()+File.separator+"PSSYSAPPS"), new File(strPSModelFolderPath+File.separator+"PSSYSAPPS"));
			if(bVerifyModel) {
				try {
					PSModelMergeUtils.verify(strPSModelFolderPath);
				}
				catch (Throwable ex) {
					throw new Exception(String.format("检查模型发生异常，%1$s", ex.getMessage()), ex);
				}
			}			
		}
		return new File(strPSModelFolderPath);
	}
	
	
	@Override
	public File mergeV2DeploySystem(File majorModelFile, V2DeploySystem v2DeploySystem, boolean bVerifyModel) {
		Assert.notNull(v2DeploySystem, "传入V2部署系统模型无效");
		
		return this.executeAction("合并传入系统模型", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onMergeV2DeploySystem(majorModelFile, v2DeploySystem, bVerifyModel);
			}
		}, null, File.class);
	}
	
	
	protected File onMergeV2DeploySystem(File majorModelFile, V2DeploySystem v2DeploySystem, boolean bVerifyModel) throws Throwable {
		List<V2SystemMerge> v2SystemMergeList = this.getV2SystemMerges(v2DeploySystem.getSystemId());
		if(!ObjectUtils.isEmpty(v2SystemMergeList)) {
			
			File tempFile = File.createTempFile("model.", "");
			String strPSModelFolderPath = majorModelFile.getCanonicalPath();
			
			ISysCloudExtensionUtilRuntime iSysCloudExtensionUtilRuntime = this.getSysCloudExtensionUtilRuntime();
			
			List<ObjectNode> objectNodeList = new ArrayList<ObjectNode>();
			
			for(V2SystemMerge v2SystemMerge : v2SystemMergeList) {
				String strMergeSystemType = v2SystemMerge.getMergeSystemType();
				if(!StringUtils.hasLength(strMergeSystemType)) {
					log.warn(String.format("合并系统[%1$s]未指定系统类型，忽略安装系统合并", v2SystemMerge.getMergeSystemName()));
					continue;
				}
				
				V2SystemType v2SystemType = V2SystemType.valueOf(strMergeSystemType);
				if(v2SystemType != V2SystemType.MERGENCE) {
					continue;
				}
				
				File modelFolder = null;
				int nTryCount = 2;
				for(int i = 0;i<nTryCount;i++) {
					try {
						modelFolder = iSysCloudExtensionUtilRuntime.getSystemModelFolder(v2SystemMerge.getMergeSystemId(), v2SystemMerge.getMergeSystemSourceId());
						break;
					}
					catch (Throwable ex) {
						if(i + 1 == nTryCount) {
							throw ex;
						}
						log.error(String.format("安装插件系统[%1$s][%2$s]发生异常，%3$s。再次尝试", v2SystemMerge.getMergeSystemName(), v2DeploySystem.getId(), ex.getMessage()));
					}
				}
				
				File folder = new File(tempFile.getCanonicalPath() + "." + v2SystemMerge.getMergeSystemId());
				folder.mkdirs();
				
				ExtensionPSModelMergeContext psModelMergeContext = new ExtensionPSModelMergeContext();
				psModelMergeContext.setPSModelFolderPath(strPSModelFolderPath);
				psModelMergeContext.setMergePSModelFolderPath(modelFolder.getCanonicalPath());
				psModelMergeContext.setDstPSModelFolderPath(folder.getCanonicalPath());
				try {
					PSModelMergeUtils.merge(psModelMergeContext);
				}
				catch (Throwable ex) {
					throw new Exception(String.format("合入系统模型[%1$s]发生异常，%2$s", v2DeploySystem.getId(), ex.getMessage()), ex);
				}
				
				strPSModelFolderPath = folder.getCanonicalPath();
				
				String strSystemTag2 = v2SystemMerge.getMergeSystemTag();
				if(!StringUtils.hasLength(strSystemTag2)) {
					strSystemTag2 = "ms"+ KeyValueUtils.genUniqueId(v2SystemMerge.getMergeSystemId());
				}
				
				//写入子系统信息
				ObjectNode objectNode = JsonUtils.createObjectNode();
				objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTYPE, String.format("MERGENCE_%1$s", DevSysType.DEVSYS.value));
				objectNode.put(PSSysRefImpl.ATTR_GETNAME, v2SystemMerge.getMergeSystemName());
				objectNode.put(PSSysRefImpl.ATTR_GETID, strSystemTag2);
				//objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTAG, deploySystem.getDeploySystemId());
				objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM, modelFolder.getCanonicalPath());

				
				objectNodeList.add(objectNode);
			}
			
			if(!ObjectUtils.isEmpty(objectNodeList)) {
				File modelFile = new File(strPSModelFolderPath + File.separator + "PSSYSTEM.json");
				ObjectNode objectNode = (ObjectNode) PSModelListMergerBase.MAPPER.readTree(modelFile);
				JsonNode jsonNode = objectNode.get(PSSystemImpl.ATTR_GETALLPSSYSREFS);
				ArrayNode arrayNode = null;
				if(jsonNode != null) {
					arrayNode = (ArrayNode)jsonNode;
				}
				else {
					arrayNode = objectNode.putArray(PSSystemImpl.ATTR_GETALLPSSYSREFS);
				}
				for(ObjectNode node : objectNodeList) {
					arrayNode.add(node);
				}
				
				try (FileOutputStream os = new FileOutputStream(modelFile)) {
					PSModelListMergerBase.MAPPER.writerWithDefaultPrettyPrinter().writeValue(os, objectNode);
					os.flush();
				}
			}	
			
			if(!majorModelFile.getCanonicalPath().equals(strPSModelFolderPath)) {
				//拷贝应用
				FileUtils.copyDirectory(new File(majorModelFile.getCanonicalPath()+File.separator+"PSSYSAPPS"), new File(strPSModelFolderPath+File.separator+"PSSYSAPPS"));
				if(bVerifyModel) {
					try {
						PSModelMergeUtils.verify(strPSModelFolderPath);
					}
					catch (Throwable ex) {
						throw new Exception(String.format("检查模型发生异常，%1$s", ex.getMessage()), ex);
					}
				}		
				return new File(strPSModelFolderPath);
			}
		}
		
		return majorModelFile;
	}
	
	@Override
	public File getSystemModelFolder(String systemId, String systemSourceId) {
		Assert.hasLength(systemId, "传入系统标识无效");
		
		String strLockTag = String.format("%1$s_%2$s_%3$s", this, systemId, systemSourceId).intern();
		
		return this.executeAction("获取系统合并本地模型文件夹", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				synchronized (strLockTag) {
					return onGetSystemModelFolder(systemId, systemSourceId);
				}
			}
		}, null, File.class);
	}
	
	
	protected File onGetSystemModelFolder(String systemId, String systemSourceId) throws Throwable {
		V2SystemSource v2SystemSource = null;
		if(StringUtils.hasLength(systemSourceId)) {
			v2SystemSource = this.getCloudExtensionClient().getSystemSource(systemId, systemSourceId);
			if(StringUtils.hasLength(v2SystemSource.getOssFile())) {
				
				String strFilePath = String.format("%1$s%2$s%3$s%2$s%4$s%2$s%5$s", ServiceHub.getInstance().getServiceHubSetting().getSystemModelFolder(), File.separator, "systemsources2", systemId, v2SystemSource.getOssFile());
				File dynaModelFolder = new File(strFilePath);
				File systemModelFile = new File(dynaModelFolder.getAbsolutePath() + File.separator + "PSSYSTEM.json");
				if (!systemModelFile.exists()) {
					ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysFileUtilRuntime(false);
					String strOSSCat = OSSCAT_DYNAMODEL;
					net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.getOSSFile(v2SystemSource.getOssFile(), strOSSCat, true);
					if (ossFile == null) {
						throw new Exception(String.format("系统源[%1$s]指定模型文件[%2$s]不存在", v2SystemSource.getName(), v2SystemSource.getOssFile()));
					}
					
					dynaModelFolder.mkdirs();
					ZipUtils.unzip(new File(ossFile.getLocalPath()), dynaModelFolder);
				}
				return dynaModelFolder;
			}
		}
		
		V2System v2System = this.getCloudExtensionClient().getSystem(systemId);
		String strBranch = v2SystemSource!=null? v2SystemSource.getName():v2System.getDefaultBranch();
		if (!StringUtils.hasLength(strBranch)) {
			strBranch = "master";
		}
		
		
		boolean bGitMode = true;
		String strHttpUrlToRepo = v2System.getHttpUrlToRepo();
		String strSubFolder = null;
		String strSystemPath = v2System.getName();
		if (StringUtils.hasLength(strHttpUrlToRepo)) {
			String[] parts = strHttpUrlToRepo.split("[#]");
			if(parts.length == 2) {
				strHttpUrlToRepo = parts[0];
				strSubFolder = parts[1];
				bGitMode = false;
				String[] items = strHttpUrlToRepo.split("[/]");
				String strLastItem = items[items.length - 1];
				int nPos = strLastItem.lastIndexOf(".zip");
				if(nPos != -1 && (nPos == strLastItem.length() - 4)) {
					strSystemPath = strLastItem.substring(0, nPos);
				}
			}
			else {
				String[] items = strHttpUrlToRepo.split("[/]");
				String strLastItem = items[items.length - 1];
				int nPos = strLastItem.lastIndexOf(".git");
				if(nPos != -1 && (nPos == strLastItem.length() - 4)) {
					strSystemPath = strLastItem.substring(0, nPos);
				}
				else {
					bGitMode = false;
					nPos = strLastItem.lastIndexOf(".zip");
					if(nPos != -1 && (nPos == strLastItem.length() - 4)) {
						strSystemPath = strLastItem.substring(0, nPos);
					}
				}
			}
		}
		
		String strFilePath = String.format("%1$s%2$s%3$s%2$s%4$s%2$s%5$s%2$s%6$s", ServiceHub.getInstance().getServiceHubSetting().getSystemModelFolder(), File.separator, "systemsources3", systemId, strSystemPath, strBranch);
		File file = new File(strFilePath);
		String strPath = file.getCanonicalPath();
		if(bGitMode) {
			String strGitPath = v2System.getHttpUrlToRepo();
			log.debug(String.format("插件系统[%1$s]使用Git路径：%2$s", systemId, strGitPath));
			
			String strGitUserName = null;
			String strGitPassword = null;
		
			try {
				if (file.exists()) {
					try (FileRepository fr = new FileRepository(new File(String.format("%1$s%2$s.git", strPath, File.separator))); Git git = new Git(fr)) {
						PullCommand pullCommand = git.pull().setRemoteBranchName(strBranch);
						if (StringUtils.hasLength(strGitUserName)) {
							if (StringUtils.hasLength(strGitPassword)) {
								pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
							} else {
								pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
							}
						}
						pullCommand.call();
					}

				} else {
					file.mkdirs();
					CloneCommand cloneCommand = Git.cloneRepository().setURI(strGitPath).setDirectory(file).setBranch(strBranch);
					if (StringUtils.hasLength(strGitUserName)) {
						if (StringUtils.hasLength(strGitPassword)) {
							cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
						} else {
							cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
						}
					}
					cloneCommand.call();
				}
			}
			catch (Throwable ex) {
				if (ex instanceof WrongRepositoryStateException || ex instanceof CheckoutConflictException) {
					log.error(String.format("Git仓库状态异常，%1$s。执行清除目录操作[%2$s]", ex.getMessage(), file.getCanonicalPath()));
					FileUtils.deleteDirectory(file);
				}
				throw new Exception(String.format("签出Git项目发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		else {
			log.debug(String.format("插件系统[%1$s]使用Zip路径：%2$s", systemId, strHttpUrlToRepo));
			
			if (!file.exists()) {
				//目前仅支持ZIP模式
				File tempFile = File.createTempFile("resource", ".zip");
				try {
					this.getSystemRuntime().getDefaultWebClient().download(strHttpUrlToRepo, tempFile);
				}
				catch (Throwable ex) {
					throw new Exception(String.format("下载文件发生异常，%1$s", ex.getMessage()), ex);
				}
				
				ZipUtils.unzip(tempFile, file);
			}
			
			
			if(StringUtils.hasLength(strSubFolder)) {
				file = new File(file.getAbsolutePath() + File.separator + strSubFolder);
				 strPath = file.getCanonicalPath();
			}
		}		

		File modelFile = new File(String.format("%1$s%2$sibizmodel.yaml", strPath, File.separator));
		if (modelFile.exists()) {
			// 从配置文件中提取目录
			try {
				Yaml yaml = new Yaml();
				Map config = yaml.loadAs(new FileInputStream(modelFile), Map.class);
				if (config != null) {
					String strModelFolder = (String) config.get("modelfolder");
					if (StringUtils.hasLength(strModelFolder)) {
						return new File(strPath + File.separator + strModelFolder);
					}
				}
			} catch (Throwable ex) {
				log.error(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
				throw new Exception(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
		File systemModelFile = new File(strPath + File.separator + "PSSYSTEM.json");
		if(systemModelFile.exists()) {
			return file;
		}
		
		throw new Exception(String.format("系统模型文件不存在"));
	}
	
	
	@Override
	protected void logEvent(int nLogLevel, String strCat, String strInfo, Object objData) {
		if(objData instanceof V2System) {
			V2System v2System = (V2System)objData;
			Log log = new Log();
			log.setSystemId(v2System.getId());
			log.set("dcsystemid", v2System.getId());
			objData = log;
		}
		else
			if(objData instanceof V2DeploySystem) {
				V2DeploySystem v2DeploySystem = (V2DeploySystem)objData;
				Log log = new Log();
				log.setSystemId(v2DeploySystem.getId());
				log.set("dcsystemid", v2DeploySystem.getId());
				objData = log;
			}
			else
				if(objData instanceof V2ServiceHubDeploySystem) {
					V2ServiceHubDeploySystem v2ServiceHubDeploySystem = (V2ServiceHubDeploySystem)objData;
					Log log = new Log();
					log.setSystemId(v2ServiceHubDeploySystem.getDeploySystemId());
					log.set("dcsystemid", v2ServiceHubDeploySystem.getDeploySystemId());
					objData = log;
				}
		super.logEvent(nLogLevel, strCat, strInfo, objData);
	}
}
