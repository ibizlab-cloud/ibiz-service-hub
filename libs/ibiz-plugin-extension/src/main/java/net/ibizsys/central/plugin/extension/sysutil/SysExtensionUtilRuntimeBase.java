package net.ibizsys.central.plugin.extension.sysutil;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.data.domain.Page;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import groovy.text.Template;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSetting;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.cloud.core.sysutil.CloudSysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.SysUAAUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.cloud.core.util.domain.CodeItem;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.cloud.core.util.domain.V2SystemMerge;
import net.ibizsys.central.cloud.core.util.domain.V2SystemType;
import net.ibizsys.central.codelist.IDynamicCodeListRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.plugin.extension.dataentity.util.DEExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionPSModelRTServiceSession;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionPSModelRTStorage;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.plugin.extension.util.TaskJob;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.system.ISysRefRuntime;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.codegen.groovy.support.PSDataEntityExtension;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelEnums.AppMode;
import net.ibizsys.model.PSModelEnums.DELogicThreadRunMode;
import net.ibizsys.model.PSModelEnums.DeploySysType;
import net.ibizsys.model.PSModelEnums.DevSysType;
import net.ibizsys.model.PSModelEnums.DynaSysMode;
import net.ibizsys.model.PSModelEnums.LogicSubType;
import net.ibizsys.model.PSModelEnums.SysRefType;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.PSApplicationImpl;
import net.ibizsys.model.app.PSSubAppRefImpl;
import net.ibizsys.model.app.appmenu.PSAppMenuModelImpl;
import net.ibizsys.model.app.codelist.IPSAppCodeList;
import net.ibizsys.model.app.codelist.PSAppCodeListImpl;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.app.res.PSAppPFPluginRefImpl;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.app.view.PSAppViewImpl;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.model.system.IPSSysModelGroup;
import net.ibizsys.model.system.IPSSysRef;
import net.ibizsys.model.system.PSSysRefImpl;
import net.ibizsys.psmodel.core.util.IPSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceFactory;
import net.ibizsys.psmodel.runtime.util.PSModelRTStorage;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.Log;

/**
 * 系统Extension功能运行时对象实现基类
 *
 * @author lionlau
 *
 */
public abstract class SysExtensionUtilRuntimeBase extends CloudSysUtilRuntimeBase implements ISysExtensionUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysExtensionUtilRuntimeBase.class);
	
	private final static net.ibizsys.central.plugin.extension.psmodel.util.PSModelRTServiceFactory DefaultPSModelRTServiceFactory = new net.ibizsys.central.plugin.extension.psmodel.util.PSModelRTServiceFactory();

	public final static String EXTENSIONSYSREF_PLACEHOLDER_PREFIX = "EXTENSIONSYSREF_PLACEHOLDER__";
	
	/**
	 * 子应用菜单标记
	 */
	public final static String SUBAPPMENUTAG = "HUBSUBAPP";
	
	/**
	 * 子应用菜单标记（前缀）
	 */
	public final static String SUBAPPMENUTAG_PREFIX = "HUBSUBAPP_";
	

	public final static String EXTENSIONLOGIC_TIMERTASK = "EXTENSIONLOGIC_TIMERTASK";

	final static String APPDEVIEWTYPE_DEMOBWFDYNAACTIONVIEW = "DEMOBWFDYNAACTIONVIEW";//实体移动端工作流动态操作视图
	final static String APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW = "DEMOBWFDYNAEDITVIEW";//实体移动端工作流动态编辑视图
	final static String APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW3 = "DEMOBWFDYNAEDITVIEW3";//实体移动端工作流动态编辑视图（分页关系）
	//final static String APPDEVIEWTYPE_DEMOBWFDYNAEXPMDVIEW = "DEMOBWFDYNAEXPMDVIEW";//实体移动端工作流动态导航多数据视图
	final static String APPDEVIEWTYPE_DEMOBWFDYNASTARTVIEW = "DEMOBWFDYNASTARTVIEW";//实体移动端工作流动态启动视图

	final static String APPDEVIEWTYPE_DEWFDYNAACTIONVIEW = "DEWFDYNAACTIONVIEW";//实体工作流动态操作视图
	final static String APPDEVIEWTYPE_DEWFDYNAEDITVIEW = "DEWFDYNAEDITVIEW";//实体工作流动态编辑视图
	final static String APPDEVIEWTYPE_DEWFDYNAEDITVIEW3 = "DEWFDYNAEDITVIEW3";//实体工作流动态视图（分页关系）
	//final static String APPDEVIEWTYPE_DEWFDYNAEXPGRIDVIEW = "DEWFDYNAEXPGRIDVIEW";//实体工作流动态导航表格视图
	final static String APPDEVIEWTYPE_DEWFDYNASTARTVIEW = "DEWFDYNASTARTVIEW";//实体工作流动态启动视图

	final static String APPDEVIEWTYPE_DEEDITVIEW = "DEEDITVIEW";//实体编辑视图
	final static String APPDEVIEWTYPE_DEEDITVIEW2 = "DEEDITVIEW2";//实体编辑视图（左右关系）
	final static String APPDEVIEWTYPE_DEEDITVIEW3 = "DEEDITVIEW3";//实体编辑视图（分页关系）
	final static String APPDEVIEWTYPE_DEEDITVIEW4 = "DEEDITVIEW4";//实体编辑视图（上下关系）
	final static String APPDEVIEWTYPE_DEEDITVIEW9 = "DEEDITVIEW9";//实体编辑视图（部件视图）

	final static String APPDEVIEWTYPE_DEMOBEDITVIEW = "DEMOBEDITVIEW";//实体移动端编辑视图
	final static String APPDEVIEWTYPE_DEMOBEDITVIEW3 = "DEMOBEDITVIEW3";//实体移动端编辑视图（分页关系）
	final static String APPDEVIEWTYPE_DEMOBEDITVIEW9 = "DEMOBEDITVIEW9";//实体移动端编辑视图（部件视图）

	final static String APPDEVIEWTYPE_DEMOBOPTVIEW = "DEMOBOPTVIEW";//实体移动端选项操作视图
	final static String APPDEVIEWTYPE_DEOPTVIEW = "DEOPTVIEW";//实体选项操作视图

	private final static Map<String, Boolean> dynaViewTypeMap = new HashMap<String, Boolean>();
	static {
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEMOBWFDYNAACTIONVIEW, true);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW, true);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW3, true);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEMOBWFDYNASTARTVIEW, true);

		dynaViewTypeMap.put(APPDEVIEWTYPE_DEWFDYNAACTIONVIEW, true);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEWFDYNAEDITVIEW, true);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEWFDYNAEDITVIEW3, true);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEWFDYNASTARTVIEW, true);


		dynaViewTypeMap.put(APPDEVIEWTYPE_DEEDITVIEW, false);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEEDITVIEW2, false);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEEDITVIEW3, false);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEEDITVIEW4, false);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEEDITVIEW9, false);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEMOBEDITVIEW, false);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEMOBEDITVIEW3, false);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEMOBEDITVIEW9, false);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEMOBOPTVIEW, false);
		dynaViewTypeMap.put(APPDEVIEWTYPE_DEOPTVIEW, false);
	}


	private String strProductMarketServiceUrl = null;
	
	private String strProductMarketMode = null;

	private String strProductMarketGroupId = null;

	private String strProductMarketBaseGroupId = null;

	private String strProductMarketProjectId = null;
	
	private Map<String, V2SystemExtensionSuite> v2SystemExtensionSuiteMap = new ConcurrentHashMap<String, V2SystemExtensionSuite>();

	private Map<String, Map<String, V2SystemExtensionLogic>> v2SystemExtensionTimerTaskLogicMap = new ConcurrentHashMap<String, Map<String, V2SystemExtensionLogic>>();
	private Map<String, Map<String, V2SystemExtensionLogic>> v2SystemExtensionWebHookLogicMap = new ConcurrentHashMap<String, Map<String, V2SystemExtensionLogic>>();

	private Map<String, List<V2SystemMerge>> v2SystemMergeListMap = new ConcurrentHashMap<String, List<V2SystemMerge>>();
	
	private Map<String, Map<String, IExtensionSysRefRuntime>> extensionSysRefRuntimeMap = new ConcurrentHashMap<String, Map<String,IExtensionSysRefRuntime>>();


	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;
	private Scheduler scheduler = null;
	private ISysCloudExtensionUtilRuntime iSysCloudExtensionUtilRuntime = null;
	
	private String strWebHookAccessTokenMode = WEBHOOK_ACCESSTOKEN_AUTO;
	

	@Override
	protected ISysExtensionUtilRuntimeContext createModelRuntimeContext() {
		return new SysExtensionUtilRuntimeContextBase<ISysExtensionUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {
			@Override
			public void executeExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData) {
				try {
					getSelf().executeExtensionLogic(v2SystemExtensionLogic, objData, true);
				} catch (Throwable ex) {
					log.error(ex);
				}
			}
		};
	}

	@Override
	protected ISysExtensionUtilRuntimeContext getModelRuntimeContext() {
		return (ISysExtensionUtilRuntimeContext)super.getModelRuntimeContext();
	}


	private SysExtensionUtilRuntimeBase getSelf() {
		return this;
	}
	
	protected boolean isHubMode() {
		return false;
	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

	protected ICloudExtensionClient getCloudExtensionClient() {
		return getSysCloudExtensionUtilRuntime().getCloudExtensionClient();
	}

	protected ISysCloudExtensionUtilRuntime getSysCloudExtensionUtilRuntime() {
		if(this.iSysCloudExtensionUtilRuntime == null) {
			this.iSysCloudExtensionUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudExtensionUtilRuntime.class, false);
		}
		return this.iSysCloudExtensionUtilRuntime;
	}

	public String getProductMarketServiceUrl() {
		return strProductMarketServiceUrl;
	}

	protected void setProductMarketServiceUrl(String strProductMarketServiceUrl) {
		this.strProductMarketServiceUrl = strProductMarketServiceUrl;
	}
	
	public String getProductMarketMode() {
		return strProductMarketMode;
	}

	protected void setProductMarketMode(String strProductMarketMode) {
		this.strProductMarketMode = strProductMarketMode;
	}
	

	public String getProductMarketGroupId() {
		return strProductMarketGroupId;
	}

	protected void setProductMarketGroupId(String strProductMarketGroupId) {
		this.strProductMarketGroupId = strProductMarketGroupId;
	}

	public String getProductMarketBaseGroupId() {
		return strProductMarketBaseGroupId;
	}

	protected void setProductMarketBaseGroupId(String strProductMarketBaseGroupId) {
		this.strProductMarketBaseGroupId = strProductMarketBaseGroupId;
	}
	
	public String getProductMarketProjectId() {
		return strProductMarketProjectId;
	}

	protected void setProductMarketProjectId(String strProductMarketProjectId) {
		this.strProductMarketProjectId = strProductMarketProjectId;
	}
	
	public String getWebHookAccessTokenMode() {
		return strWebHookAccessTokenMode;
	}

	protected void setWebHookAccessTokenMode(String strWebHookAccessTokenMode) {
		this.strWebHookAccessTokenMode = strWebHookAccessTokenMode;
	}
	

	@Override
	protected void onPrepareDefaultSetting() throws Exception {

		this.setWebHookAccessTokenMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".webhook.accesstoken", getWebHookAccessTokenMode()));
		this.setProductMarketServiceUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".productmarket.serviceurl", null));
		if(!StringUtils.hasLength(this.getProductMarketServiceUrl()) && !this.isHubMode()) {
			log.warn(String.format("系统扩展功能组件未定义当前系统产品市场服务路径，使用全局配置"));
			this.setProductMarketServiceUrl(this.getSystemRuntimeSetting().getParam(this.getDefaultHubConfigFolder() + ".productmarket.serviceurl", null));
			this.setProductMarketMode(this.getSystemRuntimeSetting().getParam(this.getDefaultHubConfigFolder() + ".productmarket.mode", IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_DEFAULT));
			this.setProductMarketGroupId(this.getSystemRuntimeSetting().getParam(this.getDefaultHubConfigFolder() + ".productmarket.groupid", "product"));
			this.setProductMarketBaseGroupId(this.getSystemRuntimeSetting().getParam(this.getDefaultHubConfigFolder() + ".productmarket.basegroupid", "product/z000_base"));
			this.setProductMarketProjectId(this.getSystemRuntimeSetting().getParam(this.getDefaultHubConfigFolder() + ".productmarket.projectid", "product_catalog/public"));
		}
		else {
			this.setProductMarketMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".productmarket.mode", IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_DEFAULT));
			this.setProductMarketGroupId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".productmarket.groupid", "product"));
			this.setProductMarketBaseGroupId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".productmarket.basegroupid", "product/z000_base"));
			this.setProductMarketProjectId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".productmarket.projectid", "product_catalog/public"));
		}
		
		super.onPrepareDefaultSetting();
	}
	
	/**
	 * 获取默认Hub功能组件配置目录
	 * @return
	 */
	protected String getDefaultHubConfigFolder() {
		return "sysutil.hubextension";
	}

	@Override
	protected void onInstall() throws Exception {

		super.onInstall();

		// 获取系统的功能选举对象
		if (this.getSysUniStateUtilRuntime(true) == null) {
			this.prepareSysUniStateUtilRuntime();
			if (this.getSysUniStateUtilRuntime(true) == null) {
				this.getSystemRuntime().log(LogLevels.WARN, SysExtensionUtilRuntimeBase.class.getName(), String.format("系统未配置统一状态组件，多节点运行会出现重复调度问题"), null);
			}
		}

		if (this.getScheduler(true) == null) {
			this.prepareScheduler();
			if (this.getScheduler(true) == null) {
				throw new Exception(String.format("Quartz调度对象无效"));
			}
		}
	}

	protected Scheduler getScheduler() {
		return this.getScheduler(false);
	}

	protected Scheduler getScheduler(boolean bTryMode) {
		if (this.scheduler != null || bTryMode) {
			return this.scheduler;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, "Quartz调度对象无效");
	}

	protected void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	protected void prepareScheduler() throws Exception {
		String strThreadCount = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".quartz.threadpoolsize", "10");
		Properties properties = new Properties();
		properties.setProperty(StdSchedulerFactory.PROP_THREAD_POOL_PREFIX + ".threadCount", strThreadCount);
		SchedulerFactory schedulerFactory = new StdSchedulerFactory(properties);
		this.setScheduler(schedulerFactory.getScheduler());
		this.getScheduler().start();
	}

	@Override
	protected void onUninstall() throws Throwable {
		if(this.getScheduler(true)!=null) {
			this.getScheduler().clear();
			this.setScheduler(null);
		}
		super.onUninstall();
	}



	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime() {
		return getSysUniStateUtilRuntime(false);
	}

	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode) {
		if (this.iSysUniStateUtilRuntime != null || bTryMode) {
			return this.iSysUniStateUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统统一状态功能组件");
	}

	protected void setSysUniStateUtilRuntime(ISysUniStateUtilRuntime iSysUniStateUtilRuntime) {
		this.iSysUniStateUtilRuntime = iSysUniStateUtilRuntime;
	}

	protected void prepareSysUniStateUtilRuntime() {
		this.setSysUniStateUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, true));
	}

//	protected boolean hasDCTaskLeadership(String strDCId, String strJobId) {
//		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.getSysUniStateUtilRuntime(true);
//		if (iSysUniStateUtilRuntime != null) {
//			if (!iSysUniStateUtilRuntime.hasLeadership(KeyValueUtils.genUniqueId(getCloudTaskUtilRuntimeUniqueTag(), strDCId))) {
//				return false;
//			}
//		}
//		return true;
//	}


	@Override
	public Object invokeWebHook(String strKey, Object param) {
		return this.invokeWebhook(strKey, param);
	}
	
	@Override
	public Object invokeWebhook(String strKey, Object param) {
		return this.executeAction("调用Webhook", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onInvokeWebHook(strKey, param);
			}
		}, null);
	}

	@Deprecated
	protected Object onInvokeWebHook(String strKey, Object param) throws Throwable{
		return this.onInvokeWebHook(this.getSystemRuntime(), strKey, param);
	}
	
	@Deprecated
	protected Object onInvokeWebHook(ISystemRuntime iSystemRuntime, String strKey, Object param) throws Throwable{
		return this.onInvokeWebhook(iSystemRuntime, strKey, param);
	}

	protected Object onInvokeWebhook(ISystemRuntime iSystemRuntime, String strKey, Object param) throws Throwable{
		
		if(WEBHOOK_ACCESSTOKEN_ENABLED.equalsIgnoreCase(this.getWebHookAccessTokenMode()) || WEBHOOK_ACCESSTOKEN_AUTO.equalsIgnoreCase(this.getWebHookAccessTokenMode())) {
			boolean bTryMode = WEBHOOK_ACCESSTOKEN_AUTO.equalsIgnoreCase(this.getWebHookAccessTokenMode());
			AccessToken accessToken = this.getWebHookAccessToken(iSystemRuntime, strKey, true, bTryMode);
			if(accessToken != null) {
				//获取逻辑标记
				String strLogicId = DataTypeUtils.asString(accessToken.get("logicid"));
				if(StringUtils.hasLength(strLogicId)) {
					//判断是否存在 `.`，如果存在则视为预置实体逻辑
					if(strLogicId.indexOf(".") != -1) {
						return this.executeWebHookLogic(iSystemRuntime, strLogicId, param, accessToken);
					}
					//设定为新的逻辑标识
					strKey = strLogicId;
				}
				
				
				Map<String, V2SystemExtensionLogic> v2SystemExtensionLogicMap = this.v2SystemExtensionWebHookLogicMap.get(iSystemRuntime.getDeploySystemId());
				V2SystemExtensionLogic v2SystemExtensionLogic = (v2SystemExtensionLogicMap!=null)?v2SystemExtensionLogicMap.get(strKey):null;
				if(v2SystemExtensionLogic == null) {
					throw new Exception(String.format("无法获取指定Webhook[%1$s]", strKey));
				}
				return this.executeExtensionLogic(v2SystemExtensionLogic, param, false, accessToken);
			}
		}

		Map<String, V2SystemExtensionLogic> v2SystemExtensionLogicMap = this.v2SystemExtensionWebHookLogicMap.get(iSystemRuntime.getDeploySystemId());
		V2SystemExtensionLogic v2SystemExtensionLogic = (v2SystemExtensionLogicMap!=null)?v2SystemExtensionLogicMap.get(strKey):null;
		if(v2SystemExtensionLogic == null) {
			throw new Exception(String.format("无法获取指定Webhook[%1$s]", strKey));
		}
		return this.executeExtensionLogic(v2SystemExtensionLogic, param, false);
	}
	
	
	/**
	 *  获取访问凭证数据对象
	 * @param iSystemRuntime
	 * @param strToken
	 * @param bValid
	 * @param bTryMode
	 * @return
	 */
	protected AccessToken getWebHookAccessToken(ISystemRuntime iSystemRuntime, String strToken, boolean bValid, boolean bTryMode)  throws Exception {
		
		AccessToken accessToken = null;
		String strAccessTokenId = String.format("%1$s%2$s-%3$s--webhook--%4$s", NacosServiceHubSettingBase.DATAID_ACCESSTOKEN_PREFIX, iSystemRuntime.getDeploySystemId(), this.getConfigFolder().replace(".", "-"), strToken).toLowerCase();
		String strConfig = ServiceHub.getInstance().getConfig(strAccessTokenId);
		if(!ObjectUtils.isEmpty(strConfig)) {
			Yaml yaml = new Yaml();
			accessToken = JsonUtils.as(yaml.loadAs(strConfig, Map.class), AccessToken.class);
		}
		
		if(accessToken == null) {
			if(bTryMode) {
				return null;
			}
			throw new Exception("凭证不存在");
		}
		if(bValid) {
			//判断有效
			if(DataTypeUtils.asBoolean(accessToken.getDisabled(), false)) {
				if(bTryMode) {
					return null;
				}
				throw new Exception("凭证已禁用");
			}
			
			java.sql.Timestamp expiresTime = accessToken.getExpiresTime();
			if(expiresTime != null) {
				if(expiresTime.getTime() < System.currentTimeMillis()) {
					if(bTryMode) {
						return null;
					}
					throw new Exception("凭证已过期");
				}
			}
		}
		
		return accessToken;
		
	}
	
	
	
	@Override
	public Object invokeDynaModelAPI(String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param) {
		return this.invokeDynaModelAPI(strPModel, strPKey, strModel, strMethod, strKey, param, false);
	}
	

	@Override
	public Object invokeDynaModelAPI(String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param, boolean bIgnoreTestDataAccessAction) {
		return this.executeAction("调用动态模型API", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onInvokeDynaModelAPI(strPModel, strPKey, strModel, strMethod, strKey, param, bIgnoreTestDataAccessAction);
			}
		}, null);
	}

	protected Object onInvokeDynaModelAPI(String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param, boolean bIgnoreTestDataAccessAction) throws Throwable {
		return this.onInvokeDynaModelAPI(this.getSystemRuntime(), strPModel, strPKey, strModel, strMethod, strKey, param, bIgnoreTestDataAccessAction);
	}

	protected Object onInvokeDynaModelAPI(ISystemRuntime iSystemRuntime, String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param, boolean bIgnoreTestDataAccessAction) throws Throwable {

		IPSModelServiceSession iPSModelServiceSession = createPSModelServiceSession(iSystemRuntime);
		IPSModelServiceSession lastPSModelServiceSession = PSModelServiceSession.getCurrent(true);

		PSModelRTServiceFactory lastPSModelRTServiceFactory = PSModelRTServiceFactory.getCurrent(true);
		PSModelRTServiceFactory.setCurrent(getPSModelRTServiceFactory(iSystemRuntime));
		try {
			PSModelServiceSession.setCurrent(iPSModelServiceSession);
			IPSModelRTService iPSModelService = (IPSModelRTService) iPSModelServiceSession.getPSModelService(strModel.toUpperCase(), true);
			if(iPSModelService != null) {
				if(!bIgnoreTestDataAccessAction) {
					String strPModel2 = StringUtils.hasLength(strPModel)?Inflector.getInstance().singularize(strPModel):null;
					String strModel2 = StringUtils.hasLength(strModel)?Inflector.getInstance().singularize(strModel):null;
					
					IDataEntityRuntime parentDataEntityRuntime = StringUtils.hasLength(strPModel2)?(IDataEntityRuntime)iSystemRuntime.getDataEntityRuntime(strPModel2, true):null;
					IDataEntityRuntime dataEntityRuntime = StringUtils.hasLength(strModel2)?(IDataEntityRuntime)iSystemRuntime.getDataEntityRuntime(strModel2, true):null;
					
					if(dataEntityRuntime != null) {
						if(strMethod.toUpperCase().indexOf("FETCH") == 0) {
							//获取数据集
							String strDataAccessAction = DataAccessActions.READ;
							ISearchContextDTO iSearchContextDTO = (param instanceof Map)?dataEntityRuntime.createSearchContext((Map)param):null;
							if(!dataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(EmployeeContext.getCurrentMust(), parentDataEntityRuntime, strPKey, iSearchContextDTO, strDataAccessAction)) {
								throw new ErrorException(String.format("%1$s不具备操作能力[%2$s]", dataEntityRuntime.getLogicName(), strDataAccessAction), Errors.ACCESSDENY);
							}
						}
						else {
							//行为
							IPSDEAction iPSDEAction = dataEntityRuntime.getPSDEAction(strMethod);
							String strDataAccessAction = iPSDEAction != null ?iPSDEAction.getDataAccessAction():null;
							if(!StringUtils.hasLength(strDataAccessAction)) {
								switch(strMethod.toUpperCase()) {
								case DEActions.GET:
									strDataAccessAction = DataAccessActions.READ;
									break;
								case DEActions.REMOVE:
									strDataAccessAction = DataAccessActions.DELETE;
									break;
								default:
									strDataAccessAction = strMethod.toUpperCase();
									break;
								}
							}
							IEntityDTO iEntityDTO = (param instanceof Map)?dataEntityRuntime.createEntity((Map)param, true):null;
							if(!dataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(EmployeeContext.getCurrentMust(), parentDataEntityRuntime, strPKey, strKey, iEntityDTO, strDataAccessAction)) {
								if (StringUtils.hasLength(strKey)) {
									throw new ErrorException(String.format("%1$s[%2$s]不具备操作能力[%3$s]", dataEntityRuntime.getLogicName(), strKey, strDataAccessAction), Errors.ACCESSDENY);
								}

								throw new ErrorException(String.format("%1$s不具备操作能力[%2$s]", dataEntityRuntime.getLogicName(), strDataAccessAction), Errors.ACCESSDENY);
							}
						}
					}
					else {
						log.warn(String.format("模型[%1$s]未定义提供实体运行时，忽略数据操作能力检查", strModel2));
					}
				}
				return iPSModelService.invoke(strPModel, strPKey, strMethod, strKey, param);
			}
			//尝试获取扩展模型接口
			ISysServiceAPIRuntime iSysServiceAPIRuntime = iSystemRuntime.getSysServiceAPIRuntime(SERVICEAPI_DYNAMODELAPI, true);
			if(iSysServiceAPIRuntime != null) {
				//去除复数形式
				String strPModel2 = StringUtils.hasLength(strPModel)?Inflector.getInstance().singularize(strPModel):null;
				String strModel2 = StringUtils.hasLength(strModel)?Inflector.getInstance().singularize(strModel):null;
				return iSysServiceAPIRuntime.invokeDEMethod(null, strPModel2, strPKey, strModel2, strMethod, param, strKey, null);
			}

			throw new Exception(String.format("无法获取指定模型[%1$s]服务对象", strModel));

		} finally {
			PSModelServiceSession.setCurrent(lastPSModelServiceSession);
			PSModelRTServiceFactory.setCurrent(lastPSModelRTServiceFactory);
		}
	}

	protected IPSModelServiceSession createPSModelServiceSession(ISystemRuntime iSystemRuntime) throws Throwable {
		return this.fillExtensionPSModelRTServiceSession(null, iSystemRuntime);
	}

	protected ExtensionPSModelRTServiceSession fillExtensionPSModelRTServiceSession(ExtensionPSModelRTServiceSession psModelServiceSession, ISystemRuntime iSystemRuntime) throws Throwable {
		if(psModelServiceSession == null) {
			psModelServiceSession = new ExtensionPSModelRTServiceSession();
		}
		psModelServiceSession.setPSSystemService(iSystemRuntime.getPSSystemService());
		psModelServiceSession.setProductMarketMode(this.getProductMarketMode());
		psModelServiceSession.setProductMarketServiceUrl(this.getProductMarketServiceUrl());
		psModelServiceSession.setProductMarketGroupId(this.getProductMarketGroupId());
		psModelServiceSession.setProductMarketBaseGroupId(this.getProductMarketBaseGroupId());
		psModelServiceSession.setProductMarketProjectId(this.getProductMarketProjectId());
		psModelServiceSession.setSystemRuntime(iSystemRuntime);
		psModelServiceSession.setSysCloudExtensionUtilRuntime(this.getSysCloudExtensionUtilRuntime());
		
		String strProductMarketServiceUrl = iSystemRuntime.getSystemRuntimeSetting().getParam("param.productmarket.serviceurl", null);
		if(StringUtils.hasLength(strProductMarketServiceUrl)) {
			String strProductMarketMode = iSystemRuntime.getSystemRuntimeSetting().getParam("param.productmarket.mode", IExtensionPSModelRTServiceSession.PRODUCTMARKETMODE_DEFAULT);
			String strProductMarketGroupId = iSystemRuntime.getSystemRuntimeSetting().getParam("param.productmarket.groupid", "product");
			String strProductMarketBaseGroupId = iSystemRuntime.getSystemRuntimeSetting().getParam("param.productmarket.basegroupid", "product/z000_base");
			String strProductMarketProjectId = iSystemRuntime.getSystemRuntimeSetting().getParam("param.productmarket.projectid", "product_catalog/public");
			
			psModelServiceSession.setProductMarketMode(strProductMarketMode);
			psModelServiceSession.setProductMarketServiceUrl(strProductMarketServiceUrl);
			psModelServiceSession.setProductMarketGroupId(strProductMarketGroupId);
			psModelServiceSession.setProductMarketBaseGroupId(strProductMarketBaseGroupId);
			psModelServiceSession.setProductMarketProjectId(strProductMarketProjectId);
		}

		V2SystemExtensionSuite v2SystemExtensionSuite = getV2SystemExtensionSuite(iSystemRuntime, true);
		if (v2SystemExtensionSuite != null) {
			psModelServiceSession.setExtensionId(v2SystemExtensionSuite.getId());
		}

		PSModelRTStorage psModelRTStorage = getPSModelRTStorage(iSystemRuntime);
		psModelServiceSession.setPSModelStorage(psModelRTStorage);

		return psModelServiceSession;
	}

	protected PSModelRTServiceFactory getPSModelRTServiceFactory(ISystemRuntime iSystemRuntime) throws Throwable {
		return DefaultPSModelRTServiceFactory;
	}

	protected PSModelRTStorage getPSModelRTStorage(ISystemRuntime iSystemRuntime) throws Throwable {
		return new ExtensionPSModelRTStorage();
	}

	@Override
	public File getAppDataEntityJsonSchema(String strAppTag, String strAppDataEntityTag, Object param, boolean bTryMode) {
		return this.executeAction("获取应用实体JsonSchema", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAppDataEntityJsonSchema(strAppTag, strAppDataEntityTag, param, bTryMode);
			}
		}, null, File.class);
	}
	
	
	@Override
	public Object executeDynaModelAction(IAction action, Object[] args) {
		Assert.notNull(action, "未传入执行行为");
		return this.executeAction("执行动态模型行为", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteDynaModelAction(action, args);
			}
		}, args);
	}
	
	protected Object onExecuteDynaModelAction(IAction action, Object[] args) throws Throwable {
		return this.onExecuteDynaModelAction(this.getSystemRuntime(), action, args);
	}
	
	protected Object onExecuteDynaModelAction(ISystemRuntime iSystemRuntime, IAction action, Object[] args) throws Throwable {
		IPSModelServiceSession iPSModelServiceSession = createPSModelServiceSession(iSystemRuntime);
		IPSModelServiceSession lastPSModelServiceSession = PSModelServiceSession.getCurrent(true);


		PSModelRTServiceFactory lastPSModelRTServiceFactory = PSModelRTServiceFactory.getCurrent(true);
		PSModelRTServiceFactory.setCurrent(getPSModelRTServiceFactory(iSystemRuntime));
		try {
			PSModelServiceSession.setCurrent(iPSModelServiceSession);
			return action.execute(args);
		} finally {
			PSModelServiceSession.setCurrent(lastPSModelServiceSession);
			PSModelRTServiceFactory.setCurrent(lastPSModelRTServiceFactory);
		}
	}


	protected File onGetAppDataEntityJsonSchema(String strAppTag, String strAppDataEntityTag, Object param, boolean bTryMode) throws Throwable {
		return this.onGetAppDataEntityJsonSchema(this.getSystemRuntime(), strAppTag, strAppDataEntityTag, param, bTryMode);
	}

	protected File onGetAppDataEntityJsonSchema(ISystemRuntime iSystemRuntime, String strAppTag, String strAppDataEntityTag, Object param, boolean bTryMode) throws Throwable {
		Object srfScopeTag = "NONE";
		if(!ObjectUtils.isEmpty(param)){
			srfScopeTag = KeyValueUtils.genUniqueId(JsonUtils.toString(param));
		}

		String strPSModelFolderPath = iSystemRuntime.getPSSystemService().getPSModelFolderPath();
		String strFilePath = String.format("%1$s/PSSYSAPPS/%2$s/PSAPPDATAENTITIES/%3$s.jsonschema", strPSModelFolderPath, strAppTag, strAppDataEntityTag);
		if (iSystemRuntime instanceof IServiceSystemRuntime) {
			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iSystemRuntime;
			if (StringUtils.hasLength(iServiceSystemRuntime.getExtensionSessionId())) {
				IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) iServiceSystemRuntime.getDataEntityRuntimeByAppDataEntityTag(strAppTag, strAppDataEntityTag, true);
				if(iDataEntityRuntime!=null && StringUtils.hasLength(iDataEntityRuntime.getExtensionSessionId())) {
					strFilePath = String.format("%1$s.d/PSSYSAPPS/%2$s/PSAPPDATAENTITIES/%4$s/%5$s/%3$s.jsonschema", strPSModelFolderPath, strAppTag, strAppDataEntityTag, iDataEntityRuntime.getExtensionSessionId(),srfScopeTag);
				}
				else {
					strFilePath = String.format("%1$s.d/PSSYSAPPS/%2$s/PSAPPDATAENTITIES/%4$s/%5$s/%3$s.jsonschema", strPSModelFolderPath, strAppTag, strAppDataEntityTag, iServiceSystemRuntime.getExtensionSessionId(),srfScopeTag);
				}
			}
		}
		File file = new File(strFilePath);
		if (file.exists()) {
			return file;
		}

		ObjectNode objectNode = this.getAppDataEntityJsonSchema(iSystemRuntime, iSystemRuntime.getPSSystemService().getPSSystem(), strAppTag, strAppDataEntityTag, param, bTryMode);
		if (objectNode == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception(String.format("无法获取指定应用实体[%1$s]JsonSchema", strAppDataEntityTag));
		}
		// 重新写文件
		file.getParentFile().mkdirs();
		JsonUtils.getMapper().writeValue(file, objectNode);

		return file;
	}

	protected ObjectNode getAppDataEntityJsonSchema(ISystemRuntime iSystemRuntime, IPSSystem iPSSystem, String strAppTag, String strAppDataEntityTag, Object param, boolean bTryMode) throws Exception {
		IPSApplication iPSApplication = null;
		java.util.List<IPSApplication> psApplicationList = iPSSystem.getAllPSApps();
		if (!ObjectUtils.isEmpty(psApplicationList)) {
			for (IPSApplication item : psApplicationList) {
				if (!StringUtils.hasLength(item.getPKGCodeName())) {
					continue;
				}
				if (item.getPKGCodeName().equalsIgnoreCase(strAppTag)) {
					iPSApplication = item;
					break;
				}
			}
		}
		
		if (iPSApplication == null) {
			//获取子应用
			IServiceSystemRuntime iServiceSystemRuntime = null;
			if(iSystemRuntime instanceof IServiceSystemRuntime) {
				iServiceSystemRuntime = (IServiceSystemRuntime)iSystemRuntime;
			}
			
			if(iServiceSystemRuntime != null) {
				Collection<IExtensionSysRefRuntime> list = iServiceSystemRuntime.getExtensionSysRefRuntimes(true);
				if(!ObjectUtils.isEmpty(list)) {
					for(IExtensionSysRefRuntime iExtensionSysRefRuntime : list) {
						if (SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {
							psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
							if (ObjectUtils.isEmpty(psApplicationList)) {
								continue;
							}

							for (IPSApplication item : psApplicationList) {
								if (item.getPKGCodeName().equalsIgnoreCase(strAppTag)) {
									iPSApplication = item;
									break;
								}
							}
						}
						if (iPSApplication != null) {
							break;
						}
					}
				}
			}
		}

		if (iPSApplication == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception(String.format("无法获取指定应用[%1$s]", strAppTag));
		}

		return this.getAppDataEntityJsonSchema(iSystemRuntime, iPSSystem, iPSApplication, strAppDataEntityTag, param, bTryMode);
	}

	protected ObjectNode getAppDataEntityJsonSchema(ISystemRuntime iSystemRuntime, IPSSystem iPSSystem, IPSApplication iPSApplication, String strAppDataEntityTag, Object param, boolean bTryMode) throws Exception {

		IPSAppDataEntity iPSAppDataEntity = null;

		java.util.List<IPSAppDataEntity> psAppDataEntityList = iPSApplication.getAllPSAppDataEntities();
		if (!ObjectUtils.isEmpty(psAppDataEntityList)) {
			for (IPSAppDataEntity item : psAppDataEntityList) {
				if (!StringUtils.hasLength(item.getCodeName())) {
					continue;
				}
				if (item.getCodeName().equalsIgnoreCase(strAppDataEntityTag)) {
					iPSAppDataEntity = item;
					break;
				}
			}
		}

		if (iPSAppDataEntity == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception(String.format("无法获取指定应用实体[%1$s]", strAppDataEntityTag));
		}
		
		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) iSystemRuntime.getDataEntityRuntime(iPSAppDataEntity.getPSDataEntityMust().getId());
		if (iDataEntityRuntime.isEnableExtension() && iDataEntityRuntime.getDEExtensionUtilRuntime() != null) {
			return iDataEntityRuntime.getDEExtensionUtilRuntime().getJsonSchemaModel(iPSAppDataEntity, param);
		}
		else {
			return JsonUtils.toObjectNode(PSDataEntityExtension.getJsonSchema(iPSAppDataEntity));
		}
	}

	@Override
	public File getHubSubAppDataEntityJsonSchema(String strAppTag, String strSubAppTag, String strAppDataEntityTag, Object param, boolean bTryMode) {
		return this.executeAction("获取Hub子应用实体JsonSchema", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetHubSubAppDataEntityJsonSchema(strAppTag, strSubAppTag, strAppDataEntityTag, param, bTryMode);
			}
		}, null, File.class);
	}

	protected File onGetHubSubAppDataEntityJsonSchema(String strAppTag, String strSubAppTag, String strAppDataEntityTag, Object param, boolean bTryMode) throws Throwable {
		return this.onGetHubSubAppDataEntityJsonSchema(this.getSystemRuntime(), strAppTag, strSubAppTag, strAppDataEntityTag, param, bTryMode);
	}

	protected File onGetHubSubAppDataEntityJsonSchema(ISystemRuntime iSystemRuntime, String strAppTag, String strSubAppTag, String strAppDataEntityTag, Object param, boolean bTryMode) throws Throwable {

		String strPSModelFolderPath = iSystemRuntime.getPSSystemService().getPSModelFolderPath();
		String strFilePath = String.format("%1$s.d/PSSYSAPPS/%2$s/%3$s/PSAPPDATAENTITIES/%4$s.jsonschema", strPSModelFolderPath, strAppTag, strSubAppTag, strAppDataEntityTag);
		if (iSystemRuntime instanceof IServiceSystemRuntime) {
			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iSystemRuntime;
			if (StringUtils.hasLength(iServiceSystemRuntime.getSystemMergeSessionId())) {
				strFilePath = String.format("%1$s.d/PSSYSAPPS/%2$s/%3$s/PSAPPDATAENTITIES/%5$s/%4$s.jsonschema", strPSModelFolderPath, strAppTag, strSubAppTag, strAppDataEntityTag, iServiceSystemRuntime.getSystemMergeSessionId());
			}
		}
		File file = new File(strFilePath);
		if (file.exists()) {
			return file;
		}
		
		ObjectNode objectNode = null;
		IPSApplication iPSApplication = null;
		
		IServiceSystemRuntime iServiceSystemRuntime = null;
		if(iSystemRuntime instanceof IServiceSystemRuntime) {
			iServiceSystemRuntime = (IServiceSystemRuntime)iSystemRuntime;
		}
		
		if(iServiceSystemRuntime != null) {
			Collection<IExtensionSysRefRuntime> list = iServiceSystemRuntime.getExtensionSysRefRuntimes(true);
			if(!ObjectUtils.isEmpty(list)) {
				for(IExtensionSysRefRuntime iExtensionSysRefRuntime : list) {
					if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) ||
							SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {
						List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
						if (ObjectUtils.isEmpty(psApplicationList)) {
							continue;
						}

						for (IPSApplication item : psApplicationList) {
							String strDeployAppId = String.format("%1$s__%2$s__%3$s", iExtensionSysRefRuntime.getExtensionTag(), strAppTag, item.getCodeName()).toLowerCase();
							if (strDeployAppId.equals(strSubAppTag)) {
								iPSApplication = item;
								break;
							}
						}
					}
					if (iPSApplication != null) {
						if(iExtensionSysRefRuntime instanceof net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime) {
							objectNode = ((net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime)iExtensionSysRefRuntime).getAppDataEntityJsonSchema(iPSApplication, strAppDataEntityTag, param, bTryMode);
						}
						break;
					}
				}
			}
		}
		else {
			List<IPSSysRef> psSysRefList = iSystemRuntime.getPSSystem().getAllPSSysRefs();
			if (!ObjectUtils.isEmpty(psSysRefList)) {
				for (IPSSysRef iPSSysRef : psSysRefList) {
					ISysRefRuntime iSysRefRuntime = iSystemRuntime.getSysRefRuntime(iPSSysRef);
					if (!(iSysRefRuntime instanceof IExtensionSysRefRuntime)) {
						continue;
					}

					IExtensionSysRefRuntime iExtensionSysRefRuntime = (IExtensionSysRefRuntime) iSysRefRuntime;
					// 判断系统引用类型
					if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) 
							|| SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {

						List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
						if (ObjectUtils.isEmpty(psApplicationList)) {
							continue;
						}

						for (IPSApplication item : psApplicationList) {
							String strDeployAppId = String.format("%1$s__%2$s__%3$s", iExtensionSysRefRuntime.getExtensionTag(), strAppTag, item.getCodeName()).toLowerCase();
							if (strDeployAppId.equals(strSubAppTag)) {
								iPSApplication = item;
								break;
							}
						}
					}
					if (iPSApplication != null) {
						break;
					}
				}
			}
		}
		
		if(objectNode == null) {
			if (iPSApplication == null) {
				if (bTryMode) {
					return null;
				}
				throw new Exception(String.format("无法获取指定应用[%1$s]", strAppTag));
			}

			IPSSystem iPSSystem = iPSApplication.getParentPSModelObject(IPSSystem.class);
			objectNode = this.getAppDataEntityJsonSchema(iSystemRuntime, iPSSystem, iPSApplication, strAppDataEntityTag, param, bTryMode);
			if (objectNode == null) {
				if (bTryMode) {
					return null;
				}
				throw new Exception(String.format("无法获取指定应用实体[%1$s]JsonSchema", strAppDataEntityTag));
			}
		}

		
		// 重新写文件
		file.getParentFile().mkdirs();
		JsonUtils.getMapper().writeValue(file, objectNode);

		return file;
	}

	@Override
	public File getHubAppDynaModelFile(String strAppTag, Object param, boolean bTryMode) {
		return this.executeAction("获取总线应用模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetHubAppDynaModelFile(strAppTag, param, bTryMode);
			}
		}, null, File.class);
	}

	protected File onGetHubAppDynaModelFile(String strAppTag, Object param, boolean bTryMode) throws Throwable {
		return this.onGetHubAppDynaModelFile(this.getSystemRuntime(), strAppTag, param, bTryMode);
	}

	protected File onGetHubAppDynaModelFile(ISystemRuntime iSystemRuntime, String strAppTag, Object param, boolean bTryMode) throws Throwable {
		
		IPSApplication mainPSApplication = getPSApplication(iSystemRuntime, strAppTag, false);
		String strMetaDynaModelPath = null;
		String strTag = String.format("%1$s%2$s", EXTENSIONSYSREF_PLACEHOLDER_PREFIX, strAppTag);
		IExtensionSysRefRuntime replaceExtensionSysRefRuntime = this.getExtensionSysRefRuntime(iSystemRuntime, strTag, true);
		if(replaceExtensionSysRefRuntime != null) {
			strMetaDynaModelPath = replaceExtensionSysRefRuntime.getPSSystemService().getPSModelFolderPath();
		}
		else {
			strMetaDynaModelPath = iSystemRuntime.getPSSystemService().getPSModelFolderPath();
		}
		
		String strAppModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.json", strMetaDynaModelPath, File.separator, strAppTag);
		File file = new File(strAppModelPath);
		if (!file.exists()) {
			throw new Exception(String.format("应用[%1$s]模型文件不存在", strAppTag));
		}

		String strSystemMergeSessionId = null;
		IServiceSystemRuntime iServiceSystemRuntime = null;
		if(iSystemRuntime instanceof IServiceSystemRuntime) {
			iServiceSystemRuntime = (IServiceSystemRuntime)iSystemRuntime;
			strSystemMergeSessionId = iServiceSystemRuntime.getSystemMergeSessionId();
		}

		//放入临时动态目录
		strMetaDynaModelPath = strMetaDynaModelPath + ".d";
		
		if(StringUtils.hasLength(strSystemMergeSessionId)) {
			strMetaDynaModelPath = String.format("%1$s%2$s%3$s", strMetaDynaModelPath, File.separator, strSystemMergeSessionId);
		}
		
		String strEmbSubApp = null;
		String strDynaModelTag = null;
		if(param instanceof Map) {
			strEmbSubApp = (String)((Map)param).get("srfembsubapp");
			strDynaModelTag = (String)((Map)param).get("dynamodeltag");
		}
		
		if(StringUtils.hasLength(strEmbSubApp) || StringUtils.hasLength(strDynaModelTag)) {
			strMetaDynaModelPath = String.format("%1$s%2$s%3$s", strMetaDynaModelPath, File.separator, KeyValueUtils.genUniqueId(strEmbSubApp, strDynaModelTag));
		}
		
		String strHubAppModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.hub.json", strMetaDynaModelPath, File.separator, strAppTag);
		File hubAppModelFile = new File(strHubAppModelPath);
		if (hubAppModelFile.exists()) {
			return hubAppModelFile;
		}

		ObjectNode appNode = (ObjectNode) JsonUtils.getMapper().readTree(file);
		
		List<V2SystemMerge> lastV2SystemMergeList = this.v2SystemMergeListMap.get(iSystemRuntime.getDeploySystemId());
		if(!ObjectUtils.isEmpty(lastV2SystemMergeList)) {
			Map<String, ObjectNode> componentV2SystemMergeMap = new LinkedHashMap<String, ObjectNode>();
			for(V2SystemMerge v2SystemMerge : lastV2SystemMergeList) {
				if(!V2SystemType.COMPONENT.value.equals(v2SystemMerge.getMergeSystemType())) {
					continue;
				}
				String strSettings = v2SystemMerge.getSettings();
				if(!StringUtils.hasLength(strSettings)) {
					log.warn(String.format("系统合并组件[%1$s]未指定设置信息，忽略合并操作", v2SystemMerge.getMergeSystemName()));
					continue;
				}
				
				Map<String, Object> config = null;
				if(strSettings.indexOf("{") == 0) {
					config = JsonUtils.asMap(strSettings);
				}
				else {
					Yaml yaml = new Yaml();
					config = yaml.loadAs(strSettings, Map.class);
				}
				
				String strPluginType = DataTypeUtils.asString(config.get(PSAppPFPluginRefImpl.ATTR_GETPLUGINTYPE));
				String strPluginCode = DataTypeUtils.asString(config.get(PSAppPFPluginRefImpl.ATTR_GETPLUGINCODE));
				if(!StringUtils.hasLength(strPluginType)) {
					log.warn(String.format("系统合并组件[%1$s]未指定插件类型，忽略合并操作", v2SystemMerge.getMergeSystemName()));
					continue;
				}
				
				if(!StringUtils.hasLength(strPluginCode)) {
					log.warn(String.format("系统合并组件[%1$s]未指定插件代码，忽略合并操作", v2SystemMerge.getMergeSystemName()));
					continue;
				}
				
				String strPluginTag = String.format("%1$s:%2$s", strPluginType, strPluginCode);
				componentV2SystemMergeMap.put(strPluginTag, JsonUtils.toObjectNode(config));
			}
			
			if(!ObjectUtils.isEmpty(componentV2SystemMergeMap)) {
				ArrayNode lastAppPFPluginRefsNode = null;
				JsonNode node = appNode.get(PSApplicationImpl.ATTR_GETALLPSAPPPFPLUGINREFS);
				if(node instanceof ArrayNode) {
					lastAppPFPluginRefsNode = (ArrayNode)node;
				}
				ArrayNode appPFPluginRefsNode = appNode.putArray(PSApplicationImpl.ATTR_GETALLPSAPPPFPLUGINREFS);
				if(lastAppPFPluginRefsNode != null) {
					for(int i = 0; i<lastAppPFPluginRefsNode.size(); i++) {
						ObjectNode appPFPluginRefNode = (ObjectNode)lastAppPFPluginRefsNode.get(i);
						String strPluginType = JsonUtils.getField(appPFPluginRefNode, PSAppPFPluginRefImpl.ATTR_GETPLUGINTYPE, null);
						String strPluginCode = JsonUtils.getField(appPFPluginRefNode, PSAppPFPluginRefImpl.ATTR_GETPLUGINCODE, null);
						String strPluginTag = String.format("%1$s:%2$s", strPluginType, strPluginCode);
						ObjectNode replaceNode = componentV2SystemMergeMap.remove(strPluginTag);
						if(replaceNode == null) {
							appPFPluginRefsNode.add(appPFPluginRefNode);
						}
						else {
							appPFPluginRefsNode.add(replaceNode);
						}
					}
				}
				
				for(ObjectNode replaceNode : componentV2SystemMergeMap.values()) {
					appPFPluginRefsNode.add(replaceNode);
				}
			}					
		}
		
		ArrayNode subAppRefsNode = appNode.putArray(PSApplicationImpl.ATTR_GETALLPSSUBAPPREFS);

		List<IExtensionSysRefRuntime> extensionSysRefRuntimeList = new ArrayList<IExtensionSysRefRuntime>();
		if(iServiceSystemRuntime!=null) {
			Collection<IExtensionSysRefRuntime> list = iServiceSystemRuntime.getExtensionSysRefRuntimes(true);
			if(!ObjectUtils.isEmpty(list)) {
				for(IExtensionSysRefRuntime iExtensionSysRefRuntime : list) {
					if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) 
							|| SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {

						List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
						if (ObjectUtils.isEmpty(psApplicationList)) {
							continue;
						}
						extensionSysRefRuntimeList.add(iExtensionSysRefRuntime);
					}
				}
			}
		}
		else {
			List<IPSSysRef> psSysRefList = iSystemRuntime.getPSSystem().getAllPSSysRefs();
			if (!ObjectUtils.isEmpty(psSysRefList)) {
				for (IPSSysRef iPSSysRef : psSysRefList) {
					ISysRefRuntime iSysRefRuntime = iSystemRuntime.getSysRefRuntime(iPSSysRef);
					if (!(iSysRefRuntime instanceof IExtensionSysRefRuntime)) {
						continue;
					}

					IExtensionSysRefRuntime iExtensionSysRefRuntime = (IExtensionSysRefRuntime) iSysRefRuntime;
					// 判断系统引用类型
					if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) 
							|| SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {

						List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
						if (ObjectUtils.isEmpty(psApplicationList)) {
							continue;
						}

						extensionSysRefRuntimeList.add(iExtensionSysRefRuntime);
					}
				}
			}
		}
		
		if(replaceExtensionSysRefRuntime != null) {
			extensionSysRefRuntimeList.remove(replaceExtensionSysRefRuntime);
		}
		
		//指定扩展标记，则仅加载扩展标记
		if (!ObjectUtils.isEmpty(extensionSysRefRuntimeList)) {
			
			if(StringUtils.hasLength(strEmbSubApp)) {
				IExtensionSysRefRuntime embExtensionSysRefRuntime = null;
				for (IExtensionSysRefRuntime iExtensionSysRefRuntime : extensionSysRefRuntimeList) {
					if(strEmbSubApp.equalsIgnoreCase(iExtensionSysRefRuntime.getExtensionTag())) {
						embExtensionSysRefRuntime = iExtensionSysRefRuntime;
						break;
					}
				}
				
				extensionSysRefRuntimeList.clear();
				if(embExtensionSysRefRuntime!=null) {
					extensionSysRefRuntimeList.add(embExtensionSysRefRuntime);
				}
			}
		}


		if (!ObjectUtils.isEmpty(extensionSysRefRuntimeList)) {
				
			Map<ObjectNode, ObjectNode> subAppRefNodeMap = new LinkedHashMap<ObjectNode, ObjectNode>();
			Map<String, ObjectNode> appViewRefNodeMap = new HashMap<String, ObjectNode>();
			
			String strMainAppTag = mainPSApplication.getAppTag();

			for (IExtensionSysRefRuntime iExtensionSysRefRuntime : extensionSysRefRuntimeList) {
				// 判断系统引用类型
				if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())
						|| SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {

					List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
					if (ObjectUtils.isEmpty(psApplicationList)) {
						continue;
					}
					
					// 获取子应用
					IPSApplication subPSApplication = null;
					for (IPSApplication iPSApplication : psApplicationList) {
						//判断类型
						if(StringUtils.hasLength(mainPSApplication.getAppType())
								&& StringUtils.hasLength(iPSApplication.getAppType())) {
							if(!mainPSApplication.getAppType().equals(iPSApplication.getAppType())) {
								continue;
							}
						}
						if(StringUtils.hasLength(mainPSApplication.getPFType())
								&& StringUtils.hasLength(iPSApplication.getPFType())) {
							if(!mainPSApplication.getPFType().equals(iPSApplication.getPFType())) {
								continue;
							}
						}
						
						String strAppMode = iPSApplication.getAppMode();
						if(StringUtils.hasLength(strAppMode)) {
							if(strAppMode.indexOf(AppMode.CLOUDHUBAPP.value) == 0) {
								continue;
							}
						}
						
						if(StringUtils.hasLength(strMainAppTag)) {
							if (AppMode.CLOUDHUBSUBAPP.value.equals(strAppMode)) {
								String strSubAppTag = iPSApplication.getAppTag();
								if(!StringUtils.hasLength(strSubAppTag)) {
									strSubAppTag = iPSApplication.getCodeName();
								}
								
								//需要应用标记一致
								if(strMainAppTag.equalsIgnoreCase(strSubAppTag)) {
									subPSApplication = iPSApplication;
									break;
								}
							}
						}
						else {
							if (AppMode.CLOUDHUBSUBAPP.value.equals(strAppMode)) {
								String strSubAppTag = iPSApplication.getAppTag();
								//指定应用标记，忽略载入
								if(StringUtils.hasLength(strSubAppTag)) {
									continue;
								}
								subPSApplication = iPSApplication;
								break;
							} else if (subPSApplication == null) {
								subPSApplication = iPSApplication;
							}
						}
					}

					if (subPSApplication == null) {
						log.warn(String.format("子系统引用[%1$s]未指定合并应用[%2$s]", iExtensionSysRefRuntime.getName(), mainPSApplication.getName()));
						continue;
					}
					String strSubAppDynaModelPath = iExtensionSysRefRuntime.getPSSystemService().getPSModelFolderPath();
					String strSubAppModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.json", strSubAppDynaModelPath, File.separator, subPSApplication.getCodeName());
					file = new File(strSubAppModelPath);
					if (!file.exists()) {
						throw new Exception(String.format("子系统引用[%1$s]应用[%2$s]模型文件不存在", iExtensionSysRefRuntime.getName(), subPSApplication.getCodeName()));
					}
					
					if(iExtensionSysRefRuntime instanceof net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime) {
						((net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime)iExtensionSysRefRuntime).registerMainAppRefApp(mainPSApplication.getCodeName(), subPSApplication.getCodeName());
					}
					
					ObjectNode subAppRefNode = subAppRefsNode.addObject();
					String strDeployAppId = String.format("%1$s__%2$s__%3$s", iExtensionSysRefRuntime.getExtensionTag(), strAppTag, subPSApplication.getCodeName()).toLowerCase();
					subAppRefNode.put(PSSubAppRefImpl.ATTR_GETID, strDeployAppId);

					String strHubSubAppModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.hubsubapp.json", strSubAppDynaModelPath, File.separator, subPSApplication.getCodeName());
					File file2 = new File(strHubSubAppModelPath);
					if (file2.exists()) {
						ObjectNode subAppNode = (ObjectNode) JsonUtils.getMapper().readTree(file2);
						if (subAppNode.has(PSSubAppRefImpl.ATTR_GETALLPSAPPDEUIACTIONGROUPS)) {
							JsonNode jsonNode = subAppNode.get(PSSubAppRefImpl.ATTR_GETALLPSAPPDEUIACTIONGROUPS);
							subAppRefNode.put(PSSubAppRefImpl.ATTR_GETALLPSAPPDEUIACTIONGROUPS, jsonNode);
						}

						if (subAppNode.has(PSSubAppRefImpl.ATTR_GETALLPSDEDRCONTROLS)) {
							JsonNode jsonNode = subAppNode.get(PSSubAppRefImpl.ATTR_GETALLPSDEDRCONTROLS);
							subAppRefNode.put(PSSubAppRefImpl.ATTR_GETALLPSDEDRCONTROLS, jsonNode);
						}
						
						if (subAppNode.has(PSSubAppRefImpl.ATTR_GETALLPSCONTROLS)) {
							JsonNode jsonNode = subAppNode.get(PSSubAppRefImpl.ATTR_GETALLPSCONTROLS);
							subAppRefNode.put(PSSubAppRefImpl.ATTR_GETALLPSCONTROLS, jsonNode);
						}
						
						if (subAppNode.has(PSSubAppRefImpl.ATTR_GETALLPSAPPPFPLUGINREFS)) {
							JsonNode jsonNode = subAppNode.get(PSSubAppRefImpl.ATTR_GETALLPSAPPPFPLUGINREFS);
							subAppRefNode.put(PSSubAppRefImpl.ATTR_GETALLPSAPPPFPLUGINREFS, jsonNode);
						}
					}

					subAppRefNode.put("dynamodeltag", iExtensionSysRefRuntime.getPSSystemService().getModelDigest());
					subAppRefNode.put(PSSubAppRefImpl.ATTR_GETMODELSTAMP, iExtensionSysRefRuntime.getPSSystemService().getModelDigest());
					if(StringUtils.hasLength(iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getPSDevSlnSysId())) {
						subAppRefNode.put(PSSubAppRefImpl.ATTR_GETPSDEVSLNSYSID, iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getPSDevSlnSysId());
					}
					if(StringUtils.hasLength(subPSApplication.getAppMode())) {
						subAppRefNode.put(PSSubAppRefImpl.ATTR_GETAPPMODE, subPSApplication.getAppMode());
					}

					if(StringUtils.hasLength(subPSApplication.getCaption())) {
						subAppRefNode.put(PSSubAppRefImpl.ATTR_GETCAPTION, subPSApplication.getCaption());
					}

					if(StringUtils.hasLength(subPSApplication.getSubAppAccessKey())) {
						subAppRefNode.put(PSSubAppRefImpl.ATTR_GETACCESSKEY, subPSApplication.getSubAppAccessKey());
					}

					subAppRefNode.put(PSSubAppRefImpl.ATTR_GETSYSREFTYPE, iExtensionSysRefRuntime.getPSSysRef().getSysRefType());
					
					String strSubAppMenuTag = SUBAPPMENUTAG;
					// if(!StringUtils.hasLength(strSubAppMenuTag)) {
					// strSubAppMenuTag = SUBAPPMENUTAG;
					// }

					ObjectNode subAppNode = (ObjectNode) JsonUtils.getMapper().readTree(file);
					// 获取子菜单
					if (subAppNode.has(PSApplicationImpl.ATTR_GETALLPSAPPMENUMODELS)) {
						ArrayNode arrayNode = (ArrayNode) subAppNode.get(PSApplicationImpl.ATTR_GETALLPSAPPMENUMODELS);
						for (int i = 0; i < arrayNode.size(); i++) {

							ObjectNode appMenuRefNode = (ObjectNode) arrayNode.get(i);
							JsonNode nameNode = appMenuRefNode.get(PSAppMenuModelImpl.ATTR_GETNAME);
							if (nameNode == null) {
								continue;
							}

							String strName = nameNode.asText();
							if(!StringUtils.hasLength(strName)) {
								continue;
							}
							if (strSubAppMenuTag.equalsIgnoreCase(strName)) {

								// 获取节点
								String strSubAppMenuModelPath = String.format("%1$s%2$s%3$s", strSubAppDynaModelPath, File.separator, appMenuRefNode.get("path").asText());
								file = new File(strSubAppMenuModelPath);
								if (!file.exists()) {
									throw new Exception(String.format("子系统引用[%1$s]应用[%2$s]菜单[%3$s]模型文件不存在", iExtensionSysRefRuntime.getName(), subPSApplication.getCodeName(), strName));
								}

								ObjectNode subAppMenuNode = (ObjectNode) JsonUtils.getMapper().readTree(file);
								subAppRefNode.put(PSSubAppRefImpl.ATTR_GETPSAPPMENUMODEL, subAppMenuNode);

								break;
							}
						}
						
						ArrayNode subAppMenusNode = subAppRefNode.putArray(PSApplicationImpl.ATTR_GETALLPSAPPMENUMODELS);
						for (int i = 0; i < arrayNode.size(); i++) {

							ObjectNode appMenuRefNode = (ObjectNode) arrayNode.get(i);
							JsonNode nameNode = appMenuRefNode.get(PSAppMenuModelImpl.ATTR_GETNAME);
							if (nameNode == null) {
								continue;
							}

							String strName = nameNode.asText();
							if(!StringUtils.hasLength(strName)) {
								continue;
							}
							
							if (strName.toUpperCase().indexOf(SUBAPPMENUTAG_PREFIX) == 0) {

								// 获取节点
								String strSubAppMenuModelPath = String.format("%1$s%2$s%3$s", strSubAppDynaModelPath, File.separator, appMenuRefNode.get("path").asText());
								file = new File(strSubAppMenuModelPath);
								if (!file.exists()) {
									throw new Exception(String.format("子系统引用[%1$s]应用[%2$s]菜单[%3$s]模型文件不存在", iExtensionSysRefRuntime.getName(), subPSApplication.getCodeName(), strName));
								}

								ObjectNode subAppMenuNode = (ObjectNode) JsonUtils.getMapper().readTree(file);
								subAppMenusNode.add(subAppMenuNode);
							}
						}
					}
					
					//扩展动态代码表
					if (subAppNode.has(PSApplicationImpl.ATTR_GETALLPSAPPCODELISTS)) {
						ArrayNode arrayNode = (ArrayNode) subAppNode.get(PSApplicationImpl.ATTR_GETALLPSAPPCODELISTS);
						
						ArrayNode subAppCodeListsNode = subAppRefNode.putArray(PSApplicationImpl.ATTR_GETALLPSAPPCODELISTS);
						for (int i = 0; i < arrayNode.size(); i++) {

							ObjectNode appCodeListNode = (ObjectNode) arrayNode.get(i);
							int nDynaSysMode = 0;
							if(appCodeListNode.has(PSAppCodeListImpl.ATTR_GETDYNASYSMODE)) {
								nDynaSysMode = appCodeListNode.get(PSAppCodeListImpl.ATTR_GETDYNASYSMODE).asInt();
							}
							
							if(DynaSysMode.ENABLED.value != nDynaSysMode) {
								continue;
							}
							
							subAppCodeListsNode.add(appCodeListNode.deepCopy());
						}
					}

					if (subAppNode.has(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS)) {
						ArrayNode arrayNode = (ArrayNode) subAppNode.get(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS);
						for (int i = 0; i < arrayNode.size(); i++) {

							ObjectNode appViewRef = (ObjectNode) arrayNode.get(i);

							JsonNode typeNode = appViewRef.get(PSAppViewImpl.ATTR_GETVIEWTYPE);
							if (typeNode == null) {
								continue;
							}

							if ("DESUBAPPREFVIEW".equals(typeNode.asText())) {
								continue;
							}

							JsonNode pathNode = appViewRef.get("path");
							if (pathNode == null) {
								continue;
							}

							String strPath = pathNode.asText();
							String[] items = strPath.split("[/]");
							if (items.length != 4) {
								continue;
							}
							strPath = String.format("%1$s/%2$s", items[2], items[3]);

							int nPriority = -1;
							if (appViewRef.has(PSAppViewImpl.ATTR_GETPRIORITY)) {
								nPriority = appViewRef.get(PSAppViewImpl.ATTR_GETPRIORITY).asInt();
							}

							ObjectNode lastViewRef = appViewRefNodeMap.get(strPath);
							if (lastViewRef != null) {
								int nLastPriority = -1;
								if (lastViewRef.has(PSAppViewImpl.ATTR_GETPRIORITY)) {
									nLastPriority = lastViewRef.get(PSAppViewImpl.ATTR_GETPRIORITY).asInt();
								}
								if (nPriority >= 10 && (nLastPriority == -1 || nPriority < nLastPriority)) {
									appViewRefNodeMap.put(strPath, appViewRef);
								}
							} else {
								appViewRefNodeMap.put(strPath, appViewRef);
							}
						}
					}

					subAppRefNodeMap.put(subAppRefNode, subAppNode);
				}

				// 构建应用视图清单
				for (java.util.Map.Entry<ObjectNode, ObjectNode> entry : subAppRefNodeMap.entrySet()) {

					if (entry.getValue().has(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS)) {

						ArrayNode subAppViewRefsNode = entry.getKey().putArray(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS);

						ArrayNode arrayNode = (ArrayNode) entry.getValue().get(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS);
						for (int i = 0; i < arrayNode.size(); i++) {

							ObjectNode appViewRef = (ObjectNode) arrayNode.get(i);

							JsonNode typeNode = appViewRef.get(PSAppViewImpl.ATTR_GETVIEWTYPE);
							if (typeNode == null) {
								continue;
							}

							if ("DESUBAPPREFVIEW".equals(typeNode.asText())) {
								continue;
							}

							JsonNode pathNode = appViewRef.get("path");
							if (pathNode == null) {
								continue;
							}

							String strPath = pathNode.asText();
							String[] items = strPath.split("[/]");
							if (items.length != 4) {
								continue;
							}
							strPath = String.format("%1$s/%2$s", items[2], items[3]);

							if (appViewRefNodeMap.get(strPath) != appViewRef) {
								continue;
							}

							subAppViewRefsNode.add(appViewRef);
						}
					}
				}

			}
		}

		// 重新写文件
		if(!hubAppModelFile.getParentFile().exists()) {
			hubAppModelFile.getParentFile().mkdirs();
		}

		JsonUtils.getMapper().writeValue(hubAppModelFile, appNode);

		return hubAppModelFile;
	}

	@Override
	public File getAppDynaModelFile(String strAppTag, String strModelUri, Object param, boolean bTryMode) {
		return this.executeAction("获取应用模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAppDynaModelFile(strAppTag, strModelUri, param, bTryMode);
			}
		}, null, File.class);
	}

	protected File onGetAppDynaModelFile(String strAppTag, String strModelUri, Object param, boolean bTryMode) throws Throwable {
		return this.onGetAppDynaModelFile(this.getSystemRuntime(), strAppTag, strModelUri, param, bTryMode);
	}

	protected File onGetAppDynaModelFile(ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, Object param, boolean bTryMode) throws Throwable {
		String strTag = String.format("%1$s%2$s", EXTENSIONSYSREF_PLACEHOLDER_PREFIX, strAppTag);
		IExtensionSysRefRuntime replaceExtensionSysRefRuntime = this.getExtensionSysRefRuntime(iSystemRuntime, strTag, true);
		if(replaceExtensionSysRefRuntime != null) {
			return replaceExtensionSysRefRuntime.getAppDynaModelFile(strAppTag, strModelUri, param, bTryMode);
		}
		
		String strPSModelFolderPath = iSystemRuntime.getPSSystemService().getPSModelFolderPath();
		String strRealModelUri = String.format("PSSYSAPPS%1$s", strModelUri);
		String strFilePath = String.format("%1$s/%2$s", strPSModelFolderPath, strRealModelUri);
		File file = new File(strFilePath);
		if (file.exists()) {
			return this.getPSApplicationObjectModelFile(file, iSystemRuntime, strAppTag, strRealModelUri, param);
		}
		if (bTryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定路径[%1$s]模型文件", strModelUri));
	}

	protected File getPSApplicationObjectModelFile(File file, ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, Object param) throws Throwable {
		V2SystemExtensionSuite v2SystemExtensionSuite = this.getV2SystemExtensionSuite(iSystemRuntime, true);
		if(v2SystemExtensionSuite == null) {
			return file;
		}
		
		// 判断类型：
		String[] items = strModelUri.split("[/]");
		if (items.length >= 3) {
			switch (items[2]) {
				case "PSAPPDEVIEWS":
				case "PSAPPINDEXVIEWS":
				case "APPPORTALVIEWS":
				case "PSAPPPANELVIEWS":
				case "PSAPPUTILVIEWS":
					return this.getPSAppViewModelFile(file, iSystemRuntime, strAppTag, strModelUri, items[2], param);
				case "PSAPPCODELISTS":
					return this.getPSAppCodeListModelFile(file, iSystemRuntime, strAppTag, strModelUri, param);
			}
		}
		return file;
	}

	protected File getPSAppViewModelFile(File file, ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, String strModelType, Object param) throws Throwable {
		IPSApplication iPSApplication = getPSApplication(iSystemRuntime, strAppTag, false);
		IPSAppView iPSAppView = iPSApplication.getPSAppView(strModelUri, true);
		if(iPSAppView.getDynaSysMode() == DynaSysMode.DISABLED.value) {
			return file;
		}

		if(iPSAppView.getPSAppDataEntity()!=null
				&& iPSAppView.getPSAppDataEntity().getPSDataEntity() != null) {

			IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)iSystemRuntime.getDataEntityRuntime(iPSAppView.getPSAppDataEntity().getPSDataEntity().getId());
			if(!iDataEntityRuntime.isEnableExtension() || iDataEntityRuntime.getDEExtensionUtilRuntime() == null) {
				return file;
			}
			
			//判断标记
			String srfScopeTag = null;
			if(param != null) {
				srfScopeTag = KeyValueUtils.genUniqueId(JsonUtils.toString(param));
			}

			if(!StringUtils.hasLength(srfScopeTag)) {
				srfScopeTag = "NONE";
			}

			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iSystemRuntime;
			String strNewFilePath = String.format("%1$s.d/PSSYSAPPS/%2$s/%3$s/%4$s/%5$s/%6$s.json", iSystemRuntime.getPSSystemService().getPSModelFolderPath(), iPSApplication.getCodeName(), strModelType, iServiceSystemRuntime.getExtensionSessionId(), srfScopeTag, iPSAppView.getCodeName());
			File newFile = new File(strNewFilePath);
			if(newFile.exists()) {
				return newFile;
			}

			newFile.getParentFile().mkdirs();
			ObjectNode objectNode = iDataEntityRuntime.getDEExtensionUtilRuntime().getPSAppViewModel(iPSAppView, param);
			if(objectNode != null) {
				JsonUtils.getMapper().writeValue(newFile, objectNode);
			}
			else {
				JsonUtils.getMapper().writeValue(newFile, iPSAppView.getObjectNode());
			}

			return newFile;
		}

		return file;

	}


	protected File getPSAppCodeListModelFile(File file, ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, Object param) throws Throwable {
		IPSApplication iPSApplication = getPSApplication(iSystemRuntime, strAppTag, false);
		IPSAppCodeList iPSAppCodeList = iPSApplication.getPSAppCodeList(strModelUri, true);
		if (iPSAppCodeList != null && iPSAppCodeList.getDynaSysMode() != DynaSysMode.DISABLED.value) {
			ICodeListRuntime iCodeListRuntime = iSystemRuntime.getCodeListRuntime(iPSAppCodeList.getCodeListTag(), true);
			if (iCodeListRuntime != null && iCodeListRuntime instanceof IDynamicCodeListRuntime) {
				List<IPSCodeItem> psCodeItems = ((IDynamicCodeListRuntime) iCodeListRuntime).getPSCodeItems(param);
				// 重新生产文件
				if (!ObjectUtils.isEmpty(psCodeItems)) {
					ArrayNode arrayNode = JsonUtils.createArrayNode();
					for (IPSCodeItem iPSCodeItem : psCodeItems) {
						arrayNode.add(iPSCodeItem.getObjectNode());
					}
					
					String strUniqueId = KeyValueUtils.genUniqueId(arrayNode.toString());
					String strNewFilePath = String.format("%1$s.d/PSSYSAPPS/%2$s/%3$s/%4$s.%5$s.json", iSystemRuntime.getPSSystemService().getPSModelFolderPath(), iPSApplication.getCodeName(), "PSAPPCODELISTS", iPSAppCodeList.getCodeName(), strUniqueId);
					File newFile = new File(strNewFilePath);
					
					// 判断文件是否存在
					//File newFile = new File(file.getAbsolutePath().substring(0, file.getAbsolutePath().length() - 4) + strUniqueId + ".json");
					if (!newFile.exists()) {
						newFile.getParentFile().mkdirs();
						ObjectNode objectNode = JsonUtils.toObjectNode(file);
						objectNode.remove(PSAppCodeListImpl.ATTR_GETPSCODEITEMS);
						objectNode.set(PSAppCodeListImpl.ATTR_GETPSCODEITEMS, arrayNode);
						JsonUtils.MAPPER.writeValue(newFile, objectNode);
					}
					return newFile;
				}

			}
		}

		return file;

	}
	
	
	
	@Override
	public File getAppSimpleModelFile(String strAppTag, String strModelUri, Object param, boolean bTryMode) {
		return this.executeAction("获取应用简单模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAppSimpleModelFile(strAppTag, strModelUri, param, bTryMode);
			}
		}, null, File.class);
	}

	protected File onGetAppSimpleModelFile(String strAppTag, String strModelUri, Object param, boolean bTryMode) throws Throwable {
		return this.onGetAppSimpleModelFile(this.getSystemRuntime(), strAppTag, strModelUri, param, bTryMode);
	}

	protected File onGetAppSimpleModelFile(ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, Object param, boolean bTryMode) throws Throwable {
		String strTag = String.format("%1$s%2$s", EXTENSIONSYSREF_PLACEHOLDER_PREFIX, strAppTag);
		IExtensionSysRefRuntime replaceExtensionSysRefRuntime = this.getExtensionSysRefRuntime(iSystemRuntime, strTag, true);
		if(replaceExtensionSysRefRuntime != null) {
			return replaceExtensionSysRefRuntime.getAppDynaModelFile(strAppTag, strModelUri, param, bTryMode);
		}
		
		String strPSModelFolderPath = iSystemRuntime.getPSSystemService().getPSModelFolderPath();
		String strRealModelUri = String.format("PSSYSAPPS%1$s", strModelUri);
		String strFilePath = String.format("%1$s/%2$s", strPSModelFolderPath, strRealModelUri);
		//File configFile = new File(strConfigPath + "/PSSYSAPPS" + strUri);		
		File file = new File(strFilePath);
		if (file.exists()) {
			return file;
		}
		
		if (bTryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定路径[%1$s]模型文件", strModelUri));
	}
	
	
	protected File getAppExtensionModelFileIf(ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, Object param) throws Throwable{
		if(!(iSystemRuntime instanceof IServiceSystemRuntime)){
			return null;
		}
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iSystemRuntime;
		if(!iServiceSystemRuntime.hasExtensionPSSysContent()) {
			return null;
		}
		
		String strRealModelUri = String.format("/PSSYSAPPS%1$s", strModelUri);
		IPSSysContent iPSSysContent = iServiceSystemRuntime.getExtensionPSSysContent(strRealModelUri, true);
		if(iPSSysContent == null) {
			return null;
		}
		
		String strContent = this.getAppExtensionModelContent(iSystemRuntime, iPSSysContent, strAppTag, strModelUri, param);

		
		
		
		
		return null;
	}
	
	
	protected String getAppExtensionModelContent(ISystemRuntime iSystemRuntime, IPSSysContent iPSSysContent, String strAppTag, String strModelUri, Object param) throws Throwable{
		String strMode = iPSSysContent.getContentTag2();
		if(!StringUtils.hasLength(strMode)
				|| strMode.equalsIgnoreCase("STATIC")) {
			return iPSSysContent.getContent();
		}
		
		
		
		return null;
	}

	
	protected String getTemplateContent(ISystemRuntime iSystemRuntime, String strTemplate, Map<String, Object> params)  throws Exception {
		
		Template template = iSystemRuntime.getGroovyTemplate(strTemplate);

		StringWriter sw = new StringWriter();
		template.make(params).writeTo(sw);

		return sw.toString();
		
	}
	
//	
//	protected File getPSAppBISchemeObjectModelFile(File file, ISystemRuntime iSystemRuntime, String strAppTag, String strAppBISchemeTag, String strModelUri, String strModelType, String[] items, Object param) throws Throwable {
//		
//		if(items.length >= 6 && "PSAPPBIREPORTS_UX".equals(strModelType)){
//			//直接进行数据查询
//			SearchContextDTO searchContextDTO = new SearchContextDTO();
//			
//			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_BI_SCHEME_TAG, strAppBISchemeTag.replace("__", "."));
//			searchContextDTO.nn(V2SystemExtensionBICube.FIELD_RUNTIME_MODEL);
//			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_TYPE, V2SystemExtensionBICubeItemType.BIREPORT.value);
//			searchContextDTO.eq(V2SystemExtensionBICube.FIELD_ITEM_TAG, items[5]);
//			searchContextDTO.count(false).limit(1);
//					
//			Page<V2SystemExtensionBICube> page = this.getCloudExtensionClient().fetchSystemExtensionBICubes(((IServiceSystemRuntime)iSystemRuntime).getExtensionId(), searchContextDTO);
//			if(page != null && !ObjectUtils.isEmpty(page.getContent()) ) {
//				//写入文件
//				
//				
//			}
//		}
//		
//		return file;
//
//	}
//	

	protected IPSApplication getPSApplication(ISystemRuntime iSystemRuntime, String strAppTag, boolean bTryMode) throws Throwable {
		if (!ObjectUtils.isEmpty(iSystemRuntime.getPSSystem().getAllPSApps())) {
			for (IPSApplication iPSApplication : iSystemRuntime.getPSSystem().getAllPSApps()) {
				if (strAppTag.equalsIgnoreCase(iPSApplication.getCodeName())) {
					return iPSApplication;
				}
			}
		}
		if (bTryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定应用模型对象[%1$s]", strAppTag));
	}

	@Override
	public File getHubSubAppDynaModelFile(String strAppTag, String strSubAppTag, String strModelUri, Object param, boolean bTryMode) {
		return this.executeAction("获取Hub子应用模型文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetHubSubAppDynaModelFile(strAppTag, strSubAppTag, strModelUri, param, bTryMode);
			}
		}, null, File.class);
	}

	protected File onGetHubSubAppDynaModelFile(String strAppTag, String strSubAppTag, String strModelUri, Object param, boolean bTryMode) throws Throwable {
		return this.onGetHubSubAppDynaModelFile(this.getSystemRuntime(), strAppTag, strSubAppTag, strModelUri, param, bTryMode);
	}

	protected File onGetHubSubAppDynaModelFile(ISystemRuntime iSystemRuntime, String strAppTag, String strSubAppTag, String strModelUri, Object param, boolean bTryMode) throws Throwable {

		String strTag = String.format("__HUBSUBAPP_PATH_%1$s", strSubAppTag);
		String strPSModelFolderPath = (String) iSystemRuntime.getGlobalParam(strTag);
		if (!StringUtils.hasLength(strPSModelFolderPath)) {
			
			IServiceSystemRuntime iServiceSystemRuntime = null;
			if(iSystemRuntime instanceof IServiceSystemRuntime) {
				iServiceSystemRuntime = (IServiceSystemRuntime)iSystemRuntime;
			}
			
			if(iServiceSystemRuntime!=null) {
				Collection<IExtensionSysRefRuntime> list = iServiceSystemRuntime.getExtensionSysRefRuntimes(true);
				if(!ObjectUtils.isEmpty(list)) {
					for(IExtensionSysRefRuntime iExtensionSysRefRuntime : list) {
						if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) 
								|| SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {

							List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
							if (ObjectUtils.isEmpty(psApplicationList)) {
								continue;
							}
							for (IPSApplication iPSApplication : psApplicationList) {
								String strDeployAppId = String.format("%1$s__%2$s__%3$s", iExtensionSysRefRuntime.getExtensionTag(), strAppTag, iPSApplication.getCodeName()).toLowerCase();
								if (strDeployAppId.equals(strSubAppTag)) {
									strPSModelFolderPath = iExtensionSysRefRuntime.getPSSystemService().getPSModelFolderPath();
									strPSModelFolderPath += String.format("%2$sPSSYSAPPS%2$s%1$s", iPSApplication.getCodeName(), File.separator);
									break;
								}
							}
						}
						if (StringUtils.hasLength(strPSModelFolderPath)) {
							break;
						}
					}
				}
			}
			else {
				List<IPSSysRef> psSysRefList = iSystemRuntime.getPSSystem().getAllPSSysRefs();
				if (!ObjectUtils.isEmpty(psSysRefList)) {
					for (IPSSysRef iPSSysRef : psSysRefList) {
						ISysRefRuntime iSysRefRuntime = iSystemRuntime.getSysRefRuntime(iPSSysRef);
						if (!(iSysRefRuntime instanceof IExtensionSysRefRuntime)) {
							continue;
						}

						IExtensionSysRefRuntime iExtensionSysRefRuntime = (IExtensionSysRefRuntime) iSysRefRuntime;
						// 判断系统引用类型
						if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())
								|| SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {

							List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
							if (ObjectUtils.isEmpty(psApplicationList)) {
								continue;
							}

							for (IPSApplication iPSApplication : psApplicationList) {
								String strDeployAppId = String.format("%1$s__%2$s__%3$s", iExtensionSysRefRuntime.getExtensionTag(), strAppTag, iPSApplication.getCodeName()).toLowerCase();
								if (strDeployAppId.equals(strSubAppTag)) {
									strPSModelFolderPath = iExtensionSysRefRuntime.getPSSystemService().getPSModelFolderPath();
									strPSModelFolderPath += String.format("%2$sPSSYSAPPS%2$s%1$s", iPSApplication.getCodeName(), File.separator);
									break;
								}
							}
						}
						if (StringUtils.hasLength(strPSModelFolderPath)) {
							break;
						}
					}
				}
			}
			
			iSystemRuntime.setGlobalParam(strTag, strPSModelFolderPath);
		}

		if (StringUtils.hasLength(strPSModelFolderPath)) {
			String strFilePath = String.format("%1$s%2$s", strPSModelFolderPath, strModelUri);
			File file = new File(strFilePath);
			if (file.exists()) {
				// return this.getPSApplicationObjectModelFile(file,
				// iSystemRuntime, strAppTag, strRealModelUri, param);
				return file;
			}
		}

		if (bTryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定路径[%1$s]模型文件", strModelUri));
	}

	@Override
	public void reloadExtension(String strExtensionId) {
		try {
			this.executeAction("重新加载扩展配置", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					onReloadExtension(strExtensionId);
					return null;
				}
			}, null);
			this.logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]加载扩展配置成功", ServiceHub.getInstance().getId(), this.getSystemRuntime().getServiceId()), this.getSystemRuntime());
		}
		catch (Throwable ex) {
			this.logEvent(LogLevels.ERROR, String.format("服务系统[%2$s@%1$s]加载扩展配置发生异常，%3$s", ServiceHub.getInstance().getId(), this.getSystemRuntime().getServiceId(), ex.getMessage()), this.getSystemRuntime());
			throw ex;
		}
	}

	protected void onReloadExtension(String strExtensionId) throws Throwable {
		this.onReloadExtension(this.getSystemRuntime(), strExtensionId);
	}

	protected void onReloadExtension(ISystemRuntime iSystemRuntime, String strExtensionId) throws Throwable {
		V2SystemExtensionSuite v2SystemExtensionSuite = null;
		if (StringUtils.hasLength(strExtensionId)) {
			v2SystemExtensionSuite = this.getCloudExtensionClient().getSystemExtensionSuite(strExtensionId);
			this.v2SystemExtensionSuiteMap.put(iSystemRuntime.getDeploySystemId(), v2SystemExtensionSuite);
		} else {
			this.v2SystemExtensionSuiteMap.remove(iSystemRuntime.getDeploySystemId());
		}



		Map<String, V2SystemExtensionLogic> curTimerTaskData = new LinkedHashMap<String, V2SystemExtensionLogic>();
		Map<String, V2SystemExtensionLogic> curWebHookData = new LinkedHashMap<String, V2SystemExtensionLogic>();

		List<IPSDataEntity> psDataEntityList = iSystemRuntime.getPSSystem().getAllPSDataEntities();
		if (!ObjectUtils.isEmpty(psDataEntityList)) {
			for (IPSDataEntity iPSDataEntity : psDataEntityList) {
				net.ibizsys.central.dataentity.IDataEntityRuntime iDataEntityRuntime = iSystemRuntime.getDataEntityRuntime(iPSDataEntity.getId());
				if (iDataEntityRuntime instanceof IDataEntityRuntime) {
					((IDataEntityRuntime) iDataEntityRuntime).reloadExtension(v2SystemExtensionSuite);
					V2SystemExtensionLogic[] logics = ((IDataEntityRuntime) iDataEntityRuntime).getExtensionLogics(IDEExtensionUtilRuntime.EXTENSIONLOGIC_TIMERTASK);
					if(logics!=null) {
						for(V2SystemExtensionLogic logic : logics) {
							logic.set("_dataentityid", iPSDataEntity.getId());
							logic.set("_deploysystemid", iSystemRuntime.getDeploySystemId());
							curTimerTaskData.put(logic.getId(), logic);
						}
					}

					logics = ((IDataEntityRuntime) iDataEntityRuntime).getExtensionLogics(IDEExtensionUtilRuntime.EXTENSIONLOGIC_WEBHOOK);
					if(logics!=null) {
						for(V2SystemExtensionLogic logic : logics) {
							logic.set("_dataentityid", iPSDataEntity.getId());
							logic.set("_deploysystemid", iSystemRuntime.getDeploySystemId());
							curWebHookData.put(logic.getId(), logic);
						}
					}
				}
			}
		}
		Map<String, V2SystemExtensionLogic> lastTimerTaskData = this.v2SystemExtensionTimerTaskLogicMap.remove(iSystemRuntime.getDeploySystemId());
		//启动服务
		for(java.util.Map.Entry<String, V2SystemExtensionLogic> entry : curTimerTaskData.entrySet()) {
			V2SystemExtensionLogic last = (lastTimerTaskData == null)? null:lastTimerTaskData.remove(entry.getKey());
			if(last != null) {
//				String strLastTimerPolicy = DataTypeUtils.getStringValue(last.get("timerpolicy"), null);
//				String strCurTimerPolicy = DataTypeUtils.getStringValue(entry.getValue().get("timerpolicy"), null);
//				if(DataTypeUtils.compare(strLastTimerPolicy, strCurTimerPolicy) == 0) {
//					continue;
//				}

				//判断运行时模型
//				if(DataTypeUtils.compare(last.getRuntimeModel(), entry.getValue().getRuntimeModel()) == 0) {
//					continue;
//				}

				//关闭
				this.stopTimerTask(iSystemRuntime, last);
			}

			this.startTimerTask(iSystemRuntime, entry.getValue());
		}

		this.v2SystemExtensionTimerTaskLogicMap.put(iSystemRuntime.getDeploySystemId(), curTimerTaskData);
		this.v2SystemExtensionWebHookLogicMap.put(iSystemRuntime.getDeploySystemId(), curWebHookData);
		if(lastTimerTaskData != null) {
			for(java.util.Map.Entry<String, V2SystemExtensionLogic> entry : lastTimerTaskData.entrySet()) {
				this.stopTimerTask(iSystemRuntime, entry.getValue());
			}
		}
	}

	protected V2SystemExtensionSuite getV2SystemExtensionSuite(ISystemRuntime iSystemRuntime, boolean bTryMode) throws Exception {
		V2SystemExtensionSuite v2SystemExtensionSuite = this.v2SystemExtensionSuiteMap.get(iSystemRuntime.getDeploySystemId());
		if (v2SystemExtensionSuite != null || bTryMode) {
			return v2SystemExtensionSuite;
		}
		throw new Exception(String.format("无法获取指定系统[%1$s]扩展配置", iSystemRuntime.getDeploySystemId()));
	}

	@Override
	public void reloadSystemMergences(String strSystemId) {
		try {
			this.executeAction("重新加载系统合并集合", new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					onReloadSystemMergences(strSystemId);
					return null;
				}
			}, null);
			this.logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]加载系统合并集合成功", ServiceHub.getInstance().getId(), this.getSystemRuntime().getServiceId()), this.getSystemRuntime());
		}
		catch (Throwable ex) {
			this.logEvent(LogLevels.ERROR, String.format("服务系统[%2$s@%1$s]加载系统合并集合发生异常，%3$s", ServiceHub.getInstance().getId(), this.getSystemRuntime().getServiceId(), ex.getMessage()), this.getSystemRuntime());
			throw ex;
		}
	}

	protected void onReloadSystemMergences(String strSystemId) throws Throwable {
		this.onReloadSystemMergences(this.getSystemRuntime(), strSystemId);
	}

	protected void onReloadSystemMergences(ISystemRuntime iSystemRuntime, String strSystemId) throws Throwable {
		synchronized (this.v2SystemMergeListMap) {
			this.doReloadSystemMergences(iSystemRuntime, strSystemId);
		}
	}
	
	
	protected void doReloadSystemMergences(ISystemRuntime iSystemRuntime, String strSystemId) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime2 = null;
		if(iSystemRuntime instanceof IServiceSystemRuntime) {
			iServiceSystemRuntime2 = (IServiceSystemRuntime)iSystemRuntime;
		}

		if(iServiceSystemRuntime2 == null) {
			log.warn(String.format("系统[%1$s]运行时对象不支持系统合并", iSystemRuntime.getDeploySystemId()));
			return;
		}
		
		final IServiceSystemRuntime iServiceSystemRuntime = iServiceSystemRuntime2; 

		List<V2SystemMerge> lastV2SystemMergeList = this.v2SystemMergeListMap.get(iSystemRuntime.getDeploySystemId());
		List<V2SystemMerge> v2SystemMergeList = null;
		if (StringUtils.hasLength(strSystemId)) {
			v2SystemMergeList = getV2SystemMerges(iSystemRuntime, strSystemId);
			this.v2SystemMergeListMap.put(iSystemRuntime.getDeploySystemId(), v2SystemMergeList);
		} else {
			this.v2SystemMergeListMap.remove(iSystemRuntime.getDeploySystemId());
		}
		
		
		boolean bReloadAllSystemMergences = isReloadAllSystemMergencesAlways();
		if(!iSystemRuntime.isLoaded() || !StringUtils.hasLength(strSystemId)) {
			bReloadAllSystemMergences = true;  
		}
		
		Map<String, V2SystemMerge> loadV2SystemMergeMap = new LinkedHashMap<String, V2SystemMerge>();
		Map<String, V2SystemMerge> resetV2SystemMergeMap = new LinkedHashMap<String, V2SystemMerge>();
		if(!ObjectUtils.isEmpty(v2SystemMergeList)) {
			for(V2SystemMerge v2SystemMerge : v2SystemMergeList) {
				loadV2SystemMergeMap.put(v2SystemMerge.getId(), v2SystemMerge);
			}
		}
		
		if(!ObjectUtils.isEmpty(lastV2SystemMergeList)) {
			for(V2SystemMerge lastV2SystemMerge : lastV2SystemMergeList) {
				if(bReloadAllSystemMergences) {
					resetV2SystemMergeMap.put(lastV2SystemMerge.getId(), lastV2SystemMerge);
				}
				else {
					V2SystemMerge loadV2SystemMerge = loadV2SystemMergeMap.get(lastV2SystemMerge.getId());
					if(loadV2SystemMerge != null) {
						//进一步判断更新时间
						if(DataTypeUtils.compare(DataTypes.DATETIME, lastV2SystemMerge.getUpdateTime(), loadV2SystemMerge.getUpdateTime())!=0) {
							resetV2SystemMergeMap.put(lastV2SystemMerge.getId(), lastV2SystemMerge);
						}
					}
					else {
						resetV2SystemMergeMap.put(lastV2SystemMerge.getId(), lastV2SystemMerge);
					}
				}
			}
		}

		ISysCloudExtensionUtilRuntime iSysCloudExtensionUtilRuntime = this.getSysCloudExtensionUtilRuntime();
		
		this.resetExtensionSysRefRuntimes(iServiceSystemRuntime);
		
		final Collection<IExtensionSysRefRuntime> last = iServiceSystemRuntime.getExtensionSysRefRuntimes(false);
		if(!ObjectUtils.isEmpty(last)) {
			for(IExtensionSysRefRuntime iExtensionSysRefRuntime : last) {
				if(!bReloadAllSystemMergences) {
					String strV2SystemMergeId = iExtensionSysRefRuntime.getPSSysRef().getRefParam3();
					if(!StringUtils.hasLength(strV2SystemMergeId)) {
						continue;
					}
					if(!resetV2SystemMergeMap.containsKey(strV2SystemMergeId)) {
						continue;
					}
				}
				
				IPSSystemService iPSSystemService = iExtensionSysRefRuntime.getPSSystemService();
				
				try {
					iServiceSystemRuntime.unregisterExtensionSysRefRuntime(iExtensionSysRefRuntime.getPSSysRef());
				}
				catch (Throwable ex) {
					log.error(String.format("注销系统引用[%1$s]运行时发生异常，%2$s", iExtensionSysRefRuntime.getName(), ex.getMessage()), ex);
				}
				
				DeploySystem deploySystem = iExtensionSysRefRuntime.getDeploySystem();
				if(deploySystem == null) {
					continue;
				}
				
				try {
					ServiceHub.getInstance().unregisterSystemRuntime(deploySystem);
				}
				catch (Throwable ex) {
					log.error(String.format("注销部署系统[%1$s]运行时发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
				}
				
				if(iPSSystemService != null) {
					List<IPSSysDBScheme> psSysDBSchemes = iPSSystemService.getPSSystem().getAllPSSysDBSchemes();
					if(!ObjectUtils.isEmpty(psSysDBSchemes)) {
						for(IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
							IPSSysModelGroup iPSSysModelGroup = iPSSysDBScheme.getPSSysModelGroup();
							if(iPSSysModelGroup == null) {
								continue;
							}
							String strCloudDataSourceId = String.format("%1$s-%2$s-%3$s", deploySystem.getDeploySystemId(), iPSSysModelGroup.getCodeName(), iPSSysDBScheme.getDSLink()).toLowerCase();
							try {
								ServiceHub.getInstance().unregisterDynaDataSource(strCloudDataSourceId);
							}
							catch (Throwable ex) {
								log.error(String.format("注销动态数据源[%1$s]运行时发生异常，%2$s", strCloudDataSourceId, ex.getMessage()), ex);
							}
						}
					}
				}
			}
		}
		
		if(bReloadAllSystemMergences) {
			iServiceSystemRuntime.unregisterExtensionSysRefRuntimes();
		}
		
		Collection<String> mergeSystemIds = iServiceSystemRuntime.getMergeSystemIds();
		if(!ObjectUtils.isEmpty(mergeSystemIds)) {
			for(String strMergeSystemId : mergeSystemIds) {
				String[] items = strMergeSystemId.split("[|]");
				String strSystemTag = items.length ==2?items[1]:null;
				if(!StringUtils.hasLength(strSystemTag)) {
					strSystemTag = "ms"+ KeyValueUtils.genUniqueId(iSystemRuntime.getDeploySystemId(), items[0]);
				}

				strSystemTag = strSystemTag.toLowerCase();
				if(!bReloadAllSystemMergences) {
					if(iServiceSystemRuntime.getExtensionSysRefRuntime(strSystemTag, true) != null) {
						log.debug(String.format("系统引用[%1$s]已经存在，忽略加载系统", strSystemTag));
						continue;
					}
					
					if(ServiceHub.getInstance().getLoadedSystemRuntime(strSystemTag, true) != null) {
						log.debug(String.format("系统运行时[%1$s]已经存在，忽略加载系统", strSystemTag));
						continue;
					}
				}

				//String strOSSFile 
				File modelFolder = ServiceHub.getInstance().getDeploySystemModelFolder(items[0], false);
				PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
				psModelServiceImpl.setPSModelFolderPath(modelFolder.getCanonicalPath());

				//判断是否需要部署Hub应用
				IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();
				String strSysType = iPSSystem.getSysType();
				if(!StringUtils.hasLength(strSysType)) {
					strSysType = DevSysType.DEVSYS.value;
				}

				//写入子系统信息
				ObjectNode objectNode = JsonUtils.createObjectNode();
				objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTYPE, String.format("EXTENSION_%1$s", strSysType));
				objectNode.put(PSSysRefImpl.ATTR_GETNAME, iPSSystem.getLogicName());
				objectNode.put(PSSysRefImpl.ATTR_GETID, strSystemTag);
				objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTAG, strSystemTag);
				objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM, modelFolder.getCanonicalPath());


				IPSSysRef iPSSysRef = iSystemRuntime.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iSystemRuntime.getPSSystem(), IPSSysRef.class, objectNode);

				IExtensionSysRefRuntime iExtensionSysRefRuntime = iServiceSystemRuntime.registerExtensionSysRefRuntime(iPSSysRef);

				String strDeploySysType = iPSSystem.getDeploySysType();

				if(DeploySysType.MS_SERVICEHUB.value.equals(strDeploySysType)) {
						
					DeploySystem deploySystem = new DeploySystem();
					String deploySystemConfig = ServiceHub.getInstance().getConfig(NacosServiceHubSetting.DATAID_DEPLOYSYSTEM_PREFIX + strSystemTag);
					if (StringUtils.hasLength(deploySystemConfig)) {
						Yaml yaml = new Yaml();
						Map map2 = yaml.loadAs(deploySystemConfig, Map.class);
						deploySystem.putAll(map2);
					}
					
					deploySystem.setDeploySystemId(strSystemTag);
					deploySystem.setModelPath(modelFolder.getCanonicalPath());
					//继承主系统数据库更新模式
					if (iSystemRuntime instanceof IServiceSystemRuntime) {
						deploySystem.setUpdateDBSchema(((IServiceSystemRuntime) iSystemRuntime).isUpdateDBSchema());
					}
					Map<String, Object> settings = new HashMap<String, Object>();
					
					if(ServiceHub.getInstance().getServiceHubSetting()!=null) {
						if(!ObjectUtils.isEmpty(ServiceHub.getInstance().getServiceHubSetting().getDefaultSystemSettings())) {
							settings.putAll(ServiceHub.getInstance().getServiceHubSetting().getDefaultSystemSettings());
						}
					}
				
					if (deploySystem.getSettings() != null) {
						settings.putAll(deploySystem.getSettings());
					}
					//
					Object objDefaultDBInstTag = settings.get(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG);
					if(ObjectUtils.isEmpty(objDefaultDBInstTag)) {
						//获取当前主系统默认数据源
						objDefaultDBInstTag = iSystemRuntime.getSystemRuntimeSetting().getParam(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG);
						if(!ObjectUtils.isEmpty(objDefaultDBInstTag)) {
							//存在默认数据源
							settings.put(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG, objDefaultDBInstTag);
						}
					}
					
					//设置主系统标识
					settings.put(IServiceSystemRuntime.PARAM_MAINSYSTEMID, iSystemRuntime.getDeploySystemId());
					settings.put(IServiceSystemRuntime.PARAM_MAINSYSTEMRUNTIME, iSystemRuntime);
					
					if(iPSSystem != null) {
						List<IPSSysDBScheme> psSysDBSchemes = iPSSystem.getAllPSSysDBSchemes();
						if(!ObjectUtils.isEmpty(psSysDBSchemes)) {
							for(IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
								IPSSysModelGroup iPSSysModelGroup = iPSSysDBScheme.getPSSysModelGroup();
								if(iPSSysModelGroup == null) {
									continue;
								}
								
								Map<String, Object> map = this.getPSModelSetting(settings, ISystemRuntimeSetting.CONFIGFOLDER_SYSDBSCHEME, String.format("%1$s.%2$s", iPSSysModelGroup.getCodeName(), iPSSysDBScheme.getDSLink()).toLowerCase());
								String strDataSourceTag = DataTypeUtils.asString(map.get("datasourcetag"), null);
								if(StringUtils.hasLength(strDataSourceTag)) {
									continue;
								}
								
								String strCloudDataSourceId = String.format("%1$s-%2$s-%3$s", deploySystem.getDeploySystemId(), iPSSysModelGroup.getCodeName(), iPSSysDBScheme.getDSLink()).toLowerCase();
								try {
									ServiceHub.getInstance().registerDynaDataSource(strCloudDataSourceId, true, true);
								}
								catch (Throwable ex) {
									log.error(String.format("注册动态数据源[%1$s]运行时发生异常，%2$s", strCloudDataSourceId, ex.getMessage()), ex);
									continue;
								}
								
								map.put("datasourcetag", strCloudDataSourceId);
							}
						}
					}
					
					deploySystem.setSettings(settings);
					ServiceHub.getInstance().registerSystemRuntime(deploySystem);
					
					if(iExtensionSysRefRuntime instanceof net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime) {
						((net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime)iExtensionSysRefRuntime).setDeploySystem(deploySystem);
					}
					log.debug(String.format("系统[%1$s]插件系统[%2$s]部署标识[%3$s]", iSystemRuntime.getDeploySystemId(), iPSSystem.getName(), strSystemTag));
				}
			}
		}
		
		//根据类型进行合并
		if(!ObjectUtils.isEmpty(v2SystemMergeList)) {
			
			Map<String, Throwable> taskRetMap = new LinkedHashMap<String, Throwable>();
			List<CompletableFuture<?>> taskList = null;
			if(isConcurrentLoadSystemMergences()) {
				taskList = new ArrayList<CompletableFuture<?>>();
			}
			
			Map<String, V2SystemMerge> v2SystemMergeMap = new LinkedHashMap<String, V2SystemMerge>();
			for(V2SystemMerge v2SystemMerge : v2SystemMergeList) {
				
				String strMergeSystemType = v2SystemMerge.getMergeSystemType();
				if(!StringUtils.hasLength(strMergeSystemType)) {
					log.warn(String.format("合并系统[%1$s]未指定系统类型，忽略安装系统合并", v2SystemMerge.getMergeSystemName()));
					continue;
				}
				
				V2SystemType v2SystemType = V2SystemType.valueOf(strMergeSystemType);
				if(v2SystemType != V2SystemType.BASE
						&& v2SystemType != V2SystemType.CORE
						&& v2SystemType != V2SystemType.EXTENSION) {
					continue;
				}
				
				String strSystemTag2 = v2SystemMerge.getMergeSystemTag();
				if(!StringUtils.hasLength(strSystemTag2)) {
					strSystemTag2 = "ms"+ KeyValueUtils.genUniqueId(v2SystemMerge.getMergeSystemId());
				}

				final String strSystemTag = strSystemTag2.toLowerCase();
				if(!bReloadAllSystemMergences) {
					if(iServiceSystemRuntime.getExtensionSysRefRuntime(strSystemTag, true) != null) {
						log.debug(String.format("系统引用[%1$s]已经存在，忽略加载系统", strSystemTag));
						continue;
					}
					if(ServiceHub.getInstance().getLoadedSystemRuntime(strSystemTag, true) != null) {
						log.debug(String.format("系统运行时[%1$s]已经存在，忽略加载系统", strSystemTag));
						continue;
					}
				}
				
				if(v2SystemMergeMap.containsKey(strSystemTag)) {
					log.warn(String.format("出现重复的系统标记[%1$s]，忽略安装系统合并[%2$s]", strSystemTag, v2SystemMerge.getId()));
					continue;
				}
				v2SystemMergeMap.put(strSystemTag, v2SystemMerge);
				
				if(taskList != null) {
					CompletableFuture<Void> task = CompletableFuture.runAsync(new Runnable() {
						@Override
						public void run() {
							try {
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
										log.error(String.format("安装插件系统[%1$s][%2$s]发生异常，%3$s。再次尝试", v2SystemMerge.getMergeSystemName(), strSystemTag, ex.getMessage()));
									}
								}
								
								PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
								psModelServiceImpl.setPSModelFolderPath(modelFolder.getCanonicalPath());

								//判断是否需要部署Hub应用
								IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();
								String strSysType = iPSSystem.getSysType();
								if(!StringUtils.hasLength(strSysType)) {
									strSysType = DevSysType.DEVSYS.value;
								}
								
								if(!isLoadSystemMergence(iSystemRuntime, v2SystemMerge, psModelServiceImpl, strSystemTag)) {
									log.warn(String.format("系统[%1$s]忽略加载插件系统[%2$s]", iSystemRuntime.getDeploySystemId(), iPSSystem.getName()));
									return;
								}

								//写入子系统信息
								ObjectNode objectNode = JsonUtils.createObjectNode();
								objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTYPE, String.format("EXTENSION_%1$s", strSysType));
								objectNode.put(PSSysRefImpl.ATTR_GETNAME, iPSSystem.getLogicName());
								objectNode.put(PSSysRefImpl.ATTR_GETID, strSystemTag);
								objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTAG, strSystemTag);
								objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM, modelFolder.getCanonicalPath());
								objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM3, v2SystemMerge.getId());

								IPSSysRef iPSSysRef = iSystemRuntime.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iSystemRuntime.getPSSystem(), IPSSysRef.class, objectNode);

								IExtensionSysRefRuntime iExtensionSysRefRuntime = iServiceSystemRuntime.registerExtensionSysRefRuntime(iPSSysRef);

								String strDeploySysType = iPSSystem.getDeploySysType();

								if(DeploySysType.MS_SERVICEHUB.value.equals(strDeploySysType)) {
										
									DeploySystem deploySystem = new DeploySystem();
									String deploySystemConfig = ServiceHub.getInstance().getConfig(NacosServiceHubSetting.DATAID_DEPLOYSYSTEM_PREFIX + strSystemTag);
									if (StringUtils.hasLength(deploySystemConfig)) {
										Yaml yaml = new Yaml();
										Map map2 = yaml.loadAs(deploySystemConfig, Map.class);
										deploySystem.putAll(map2);
									}
									
									deploySystem.setDeploySystemId(strSystemTag);
									deploySystem.setModelPath(modelFolder.getCanonicalPath());
									//继承主系统数据库更新模式
									if (iSystemRuntime instanceof IServiceSystemRuntime) {
										deploySystem.setUpdateDBSchema(((IServiceSystemRuntime) iSystemRuntime).isUpdateDBSchema());
									}
									Map<String, Object> settings = new HashMap<String, Object>();
									
									if(ServiceHub.getInstance().getServiceHubSetting()!=null) {
										if(!ObjectUtils.isEmpty(ServiceHub.getInstance().getServiceHubSetting().getDefaultSystemSettings())) {
											settings.putAll(ServiceHub.getInstance().getServiceHubSetting().getDefaultSystemSettings());
										}
									}
								
									if (deploySystem.getSettings() != null) {
										settings.putAll(deploySystem.getSettings());
									}
									
									//
									Object objDefaultDBInstTag = settings.get(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG);
									if(ObjectUtils.isEmpty(objDefaultDBInstTag)) {
										//获取当前主系统默认数据源
										objDefaultDBInstTag = iSystemRuntime.getSystemRuntimeSetting().getParam(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG);
										if(!ObjectUtils.isEmpty(objDefaultDBInstTag)) {
											//存在默认数据源
											settings.put(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG, objDefaultDBInstTag);
										}
									}
									
									//设置主系统标识
									settings.put(IServiceSystemRuntime.PARAM_MAINSYSTEMID, iSystemRuntime.getDeploySystemId());
									settings.put(IServiceSystemRuntime.PARAM_MAINSYSTEMRUNTIME, iSystemRuntime);
									settings.put(IServiceSystemRuntime.PARAM_V2SYSTEMMERGE, v2SystemMerge);
									
									if(iPSSystem != null) {
										List<IPSSysDBScheme> psSysDBSchemes = iPSSystem.getAllPSSysDBSchemes();
										if(!ObjectUtils.isEmpty(psSysDBSchemes)) {
											for(IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
												IPSSysModelGroup iPSSysModelGroup = iPSSysDBScheme.getPSSysModelGroup();
												if(iPSSysModelGroup == null) {
													continue;
												}
												
												Map<String, Object> map = getPSModelSetting(settings, ISystemRuntimeSetting.CONFIGFOLDER_SYSDBSCHEME, String.format("%1$s.%2$s", iPSSysModelGroup.getCodeName(), iPSSysDBScheme.getDSLink()).toLowerCase());
												String strDataSourceTag = DataTypeUtils.asString(map.get("datasourcetag"), null);
												if(StringUtils.hasLength(strDataSourceTag)) {
													continue;
												}
												
												String strCloudDataSourceId = String.format("%1$s-%2$s-%3$s", deploySystem.getDeploySystemId(), iPSSysModelGroup.getCodeName(), iPSSysDBScheme.getDSLink()).toLowerCase();
												try {
													ServiceHub.getInstance().registerDynaDataSource(strCloudDataSourceId, true, true);
												}
												catch (Throwable ex) {
													log.error(String.format("注册动态数据源[%1$s]运行时发生异常，%2$s", strCloudDataSourceId, ex.getMessage()), ex);
													continue;
												}
												
												map.put("datasourcetag", strCloudDataSourceId);
											}
										}
									}
									
									deploySystem.setSettings(settings);
									
									onFillSystemMergenceDeploySystem(iSystemRuntime, v2SystemMerge, psModelServiceImpl, deploySystem);
									
									ISystemRuntime systemMergenceSystemRuntime = registerSystemMergenceSystemRuntime(iSystemRuntime, v2SystemMerge, psModelServiceImpl, deploySystem);
									if(systemMergenceSystemRuntime != null) {
										if(iExtensionSysRefRuntime instanceof net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime) {
											((net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime)iExtensionSysRefRuntime).setDeploySystem(deploySystem);
										}
										log.debug(String.format("系统[%1$s]插件系统[%2$s]部署标识[%3$s]", iSystemRuntime.getDeploySystemId(), iPSSystem.getName(), strSystemTag));
									}
									else {
										log.warn(String.format("系统[%1$s]注册插件系统[%2$s]部署标识[%3$s]失败", iSystemRuntime.getDeploySystemId(), iPSSystem.getName(), strSystemTag));
										iServiceSystemRuntime.unregisterExtensionSysRefRuntime(iPSSysRef);
									}
								}
							} catch (Throwable ex) {
								taskRetMap.put(strSystemTag, new Exception(String.format("安装插件系统[%1$s][%2$s]发生异常，%3$s", v2SystemMerge.getMergeSystemName(), strSystemTag, ex.getMessage()), ex));
							}
						}
					});
					
					taskList.add(task);
				}
				else {
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
							log.error(String.format("安装插件系统[%1$s][%2$s]发生异常，%3$s。再次尝试", v2SystemMerge.getMergeSystemName(), strSystemTag, ex.getMessage()));
						}
					}
					
					//File modelFolder = iSysCloudExtensionUtilRuntime.getSystemModelFolder(v2SystemMerge.getMergeSystemId(), v2SystemMerge.getMergeSystemSourceId());
					PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
					psModelServiceImpl.setPSModelFolderPath(modelFolder.getCanonicalPath());

					//判断是否需要部署Hub应用
					IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();
					String strSysType = iPSSystem.getSysType();
					if(!StringUtils.hasLength(strSysType)) {
						strSysType = DevSysType.DEVSYS.value;
					}
					
					if(!this.isLoadSystemMergence(iSystemRuntime, v2SystemMerge, psModelServiceImpl, strSystemTag)) {
						log.warn(String.format("系统[%1$s]忽略加载插件系统[%2$s]", iSystemRuntime.getDeploySystemId(), iPSSystem.getName()));
						continue;
					}

					//写入子系统信息
					ObjectNode objectNode = JsonUtils.createObjectNode();
					objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTYPE, String.format("EXTENSION_%1$s", strSysType));
					objectNode.put(PSSysRefImpl.ATTR_GETNAME, iPSSystem.getLogicName());
					objectNode.put(PSSysRefImpl.ATTR_GETID, strSystemTag);
					objectNode.put(PSSysRefImpl.ATTR_GETSYSREFTAG, strSystemTag);
					objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM, modelFolder.getCanonicalPath());
					objectNode.put(PSSysRefImpl.ATTR_GETREFPARAM3, v2SystemMerge.getId());

					IPSSysRef iPSSysRef = iSystemRuntime.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iSystemRuntime.getPSSystem(), IPSSysRef.class, objectNode);

					IExtensionSysRefRuntime iExtensionSysRefRuntime = iServiceSystemRuntime.registerExtensionSysRefRuntime(iPSSysRef);

					String strDeploySysType = iPSSystem.getDeploySysType();

					if(DeploySysType.MS_SERVICEHUB.value.equals(strDeploySysType)) {
							
						DeploySystem deploySystem = new DeploySystem();
						String deploySystemConfig = ServiceHub.getInstance().getConfig(NacosServiceHubSetting.DATAID_DEPLOYSYSTEM_PREFIX + strSystemTag);
						if (StringUtils.hasLength(deploySystemConfig)) {
							Yaml yaml = new Yaml();
							Map map2 = yaml.loadAs(deploySystemConfig, Map.class);
							deploySystem.putAll(map2);
						}
						
						deploySystem.setDeploySystemId(strSystemTag);
						deploySystem.setModelPath(modelFolder.getCanonicalPath());
						//继承主系统数据库更新模式
						if (iSystemRuntime instanceof IServiceSystemRuntime) {
							deploySystem.setUpdateDBSchema(((IServiceSystemRuntime) iSystemRuntime).isUpdateDBSchema());
						}
						Map<String, Object> settings = new HashMap<String, Object>();
						
						if(ServiceHub.getInstance().getServiceHubSetting()!=null) {
							if(!ObjectUtils.isEmpty(ServiceHub.getInstance().getServiceHubSetting().getDefaultSystemSettings())) {
								settings.putAll(ServiceHub.getInstance().getServiceHubSetting().getDefaultSystemSettings());
							}
						}
					
						if (deploySystem.getSettings() != null) {
							settings.putAll(deploySystem.getSettings());
						}
						
						//
						Object objDefaultDBInstTag = settings.get(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG);
						if(ObjectUtils.isEmpty(objDefaultDBInstTag)) {
							//获取当前主系统默认数据源
							objDefaultDBInstTag = iSystemRuntime.getSystemRuntimeSetting().getParam(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG);
							if(!ObjectUtils.isEmpty(objDefaultDBInstTag)) {
								//存在默认数据源
								settings.put(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG, objDefaultDBInstTag);
							}
						}
						
						//设置主系统标识
						settings.put(IServiceSystemRuntime.PARAM_MAINSYSTEMID, iSystemRuntime.getDeploySystemId());
						settings.put(IServiceSystemRuntime.PARAM_MAINSYSTEMRUNTIME, iSystemRuntime);
						settings.put(IServiceSystemRuntime.PARAM_V2SYSTEMMERGE, v2SystemMerge);
						
						if(iPSSystem != null) {
							List<IPSSysDBScheme> psSysDBSchemes = iPSSystem.getAllPSSysDBSchemes();
							if(!ObjectUtils.isEmpty(psSysDBSchemes)) {
								for(IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
									IPSSysModelGroup iPSSysModelGroup = iPSSysDBScheme.getPSSysModelGroup();
									if(iPSSysModelGroup == null) {
										continue;
									}
									
									Map<String, Object> map = this.getPSModelSetting(settings, ISystemRuntimeSetting.CONFIGFOLDER_SYSDBSCHEME, String.format("%1$s.%2$s", iPSSysModelGroup.getCodeName(), iPSSysDBScheme.getDSLink()).toLowerCase());
									String strDataSourceTag = DataTypeUtils.asString(map.get("datasourcetag"), null);
									if(StringUtils.hasLength(strDataSourceTag)) {
										continue;
									}
									
									String strCloudDataSourceId = String.format("%1$s-%2$s-%3$s", deploySystem.getDeploySystemId(), iPSSysModelGroup.getCodeName(), iPSSysDBScheme.getDSLink()).toLowerCase();
									try {
										ServiceHub.getInstance().registerDynaDataSource(strCloudDataSourceId, true, true);
									}
									catch (Throwable ex) {
										log.error(String.format("注册动态数据源[%1$s]运行时发生异常，%2$s", strCloudDataSourceId, ex.getMessage()), ex);
										continue;
									}
									
									map.put("datasourcetag", strCloudDataSourceId);
								}
							}
						}
						
						deploySystem.setSettings(settings);
						
						this.onFillSystemMergenceDeploySystem(iSystemRuntime, v2SystemMerge, psModelServiceImpl, deploySystem);
						
						ISystemRuntime systemMergenceSystemRuntime = this.registerSystemMergenceSystemRuntime(iSystemRuntime, v2SystemMerge, psModelServiceImpl, deploySystem);
						if(systemMergenceSystemRuntime != null) {
							if(iExtensionSysRefRuntime instanceof net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime) {
								((net.ibizsys.central.plugin.extension.system.IExtensionSysRefRuntime)iExtensionSysRefRuntime).setDeploySystem(deploySystem);
							}
							log.debug(String.format("系统[%1$s]插件系统[%2$s]部署标识[%3$s]", iSystemRuntime.getDeploySystemId(), iPSSystem.getName(), strSystemTag));
						}
						else {
							log.warn(String.format("系统[%1$s]注册插件系统[%2$s]部署标识[%3$s]失败", iSystemRuntime.getDeploySystemId(), iPSSystem.getName(), strSystemTag));
							iServiceSystemRuntime.unregisterExtensionSysRefRuntime(iPSSysRef);
						}
					}
				}
			}
			
			if(!ObjectUtils.isEmpty(taskList)) {
				try {
					CompletableFuture.allOf(taskList.toArray(new CompletableFuture<?>[taskList.size()])).get();
				} catch (Exception ex) {
					throw new Exception(String.format("安装插件系统发生异常，%1$s", ex.getMessage()), ex);
				}
				
				if(taskRetMap.size() != 0) {
					throw taskRetMap.values().iterator().next();
				}
			}
		}
		
		Collection<IExtensionSysRefRuntime> list = iServiceSystemRuntime.getExtensionSysRefRuntimes(true);
		if(!ObjectUtils.isEmpty(list)) {
			
			//注册代理应用对应的扩展系统引用运行时
			for(IPSApplication mainPSApplication : iServiceSystemRuntime.getPSSystem().getAllPSApps()) {
				
				String strAppMode = mainPSApplication.getAppMode();
				if(!AppMode.CLOUDHUBAPP_PLACEHOLDER.value.equals(strAppMode)) {
					continue;
				}
				
				String strMainCodeName = mainPSApplication.getCodeName();
				if(!StringUtils.hasLength(strMainCodeName)) {
					continue;
				}
				
				String strMainAppTag = mainPSApplication.getAppTag();
				if(!StringUtils.hasLength(strMainAppTag)) {
					continue;
				}
				
				for(IExtensionSysRefRuntime iExtensionSysRefRuntime : list) {
					if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())
							|| SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {
	
						List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
						if (ObjectUtils.isEmpty(psApplicationList)) {
							continue;
						}
						
						IPSApplication realPSApplication = null;
						for(IPSApplication iPSApplication : psApplicationList) {
							if(!AppMode.CLOUDHUBAPP.value.equals(iPSApplication.getAppMode())) {
								continue;
							}
							
							if(!strMainCodeName.equals(iPSApplication.getCodeName())) {
								continue;
							}
							
							realPSApplication = iPSApplication;
							break;
						}
						
						if(realPSApplication != null) {
							String strTag = String.format("%1$s%2$s", EXTENSIONSYSREF_PLACEHOLDER_PREFIX, strMainCodeName);
							this.setExtensionSysRefRuntime(iServiceSystemRuntime, strTag, iExtensionSysRefRuntime);
							break;
						}
						
					}
				}
			}
		}
		
		//更新应用网关
		ServiceHub.getInstance().registerAppGatewayRoutes(iSystemRuntime);
	}
	
	protected boolean isLoadSystemMergence(ISystemRuntime iSystemRuntime, V2SystemMerge v2SystemMerge, IPSSystemService iPSSystemService, String strSystemTag) throws Throwable {
		return true;
	}
	
	protected void onFillSystemMergenceDeploySystem(ISystemRuntime iSystemRuntime, V2SystemMerge v2SystemMerge, IPSSystemService iPSSystemService, DeploySystem deploySystem) throws Throwable {
		
	}
	
	protected ISystemRuntime registerSystemMergenceSystemRuntime(ISystemRuntime iSystemRuntime, V2SystemMerge v2SystemMerge, IPSSystemService iPSSystemService, DeploySystem deploySystem) throws Throwable {
		return ServiceHub.getInstance().registerSystemRuntime(deploySystem);
	}
	
	protected List<V2SystemMerge> getV2SystemMerges(String strSystemId) throws Throwable {
		return this.getV2SystemMerges(null, strSystemId);
	}
	
	protected List<V2SystemMerge> getV2SystemMerges(ISystemRuntime iSystemRuntime, String strSystemId) throws Throwable {
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.eq(V2SystemMerge.FIELD_VALID_FLAG, 1);
		searchContextDTO.all();
		Page<V2SystemMerge> page = this.getCloudExtensionClient().fetchSystemMerges(strSystemId, searchContextDTO);
		List<V2SystemMerge> v2SystemMergeList = new ArrayList<V2SystemMerge>();
		if(page != null && !ObjectUtils.isEmpty(page.getContent())) {
			v2SystemMergeList.addAll(page.getContent());
		}
		return v2SystemMergeList;
	}
	
	protected boolean isReloadAllSystemMergencesAlways() {
		return false;
	}

	@Override
	public IDEExtensionUtilRuntime createDEExtensionUtilRuntime(IDataEntityRuntime iDataEntityRuntime) {
		return this.executeAction("建立实体扩展功能运行时对象", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateDEExtensionUtilRuntime(iDataEntityRuntime);
			}
		}, null, IDEExtensionUtilRuntime.class);
	}

	protected IDEExtensionUtilRuntime onCreateDEExtensionUtilRuntime(IDataEntityRuntime iDataEntityRuntime) throws Throwable {
		return new DEExtensionUtilRuntime();
	}


	protected void startTimerTask(ISystemRuntime iSystemRuntime, V2SystemExtensionLogic v2SystemExtensionLogic) throws Throwable{

		boolean bValidFlag = DataTypeUtils.getBooleanValue(v2SystemExtensionLogic.get("validflag"), false);
		if(!bValidFlag) {
			log.warn(String.format("定时逻辑扩展[%1$s]未启用", v2SystemExtensionLogic.getName()));
			return;
		}

		String strTimerPolicy = DataTypeUtils.getStringValue(v2SystemExtensionLogic.get("timerpolicy"), null);
		if(!StringUtils.hasLength(strTimerPolicy)) {
			log.warn(String.format("定时逻辑扩展[%1$s]未提供定时策略", v2SystemExtensionLogic.getName()));
			return;
		}

		String strDCId = v2SystemExtensionLogic.getExtensionTag2();
		String strJobId = v2SystemExtensionLogic.getId();

		JobDataMap jobDataMap = new JobDataMap();
		jobDataMap.put(TaskJob.CONTEXT_JOBINFO, v2SystemExtensionLogic);
		jobDataMap.put(TaskJob.CONTEXT_RUNTIMECONTEXT, this.getModelRuntimeContext());
		jobDataMap.put(TaskJob.CONTEXT_PARAM, new HashMap<>());
//		

		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.getSysUniStateUtilRuntime(true);
		if(iSysUniStateUtilRuntime != null) {
			iSysUniStateUtilRuntime.addLeaderLatchIf(KeyValueUtils.genUniqueId(iSystemRuntime.getDeploySystemId(), EXTENSIONLOGIC_TIMERTASK, strDCId));
		}

		JobDetail jobDetail = org.quartz.JobBuilder.newJob(TaskJob.class).withIdentity(strJobId, strDCId)
				.usingJobData(jobDataMap)
				.build();


		String[] timers = strTimerPolicy.replace("\r\n", ";").replace("\r", ";").replace("\n", ";").split("[;]");
		for(String strPolicy : timers) {
			strPolicy = strPolicy.trim();
			if(!StringUtils.hasLength(strPolicy)) {
				continue;
			}

			try {
				Trigger trigger = org.quartz.TriggerBuilder.newTrigger()
						.withIdentity(KeyValueUtils.genUniqueId(strJobId, strPolicy), strDCId)
						.startNow()
						.withSchedule(CronScheduleBuilder.cronSchedule(strPolicy))
						.build();
				this.getScheduler().scheduleJob(jobDetail, trigger);
			}
			catch (Throwable ex) {
				log.error(String.format("启动定时逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
				this.logEvent(LogLevels.ERROR, String.format("启动定时逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), iSystemRuntime);
			}
		}

	}

	protected void stopTimerTask(ISystemRuntime iSystemRuntime, V2SystemExtensionLogic v2SystemExtensionLogic) throws Throwable{
		String strDCId = v2SystemExtensionLogic.getExtensionTag2();
		String strJobId = v2SystemExtensionLogic.getId();

		JobKey jobKey = JobKey.jobKey(strJobId, strDCId);

		try {
			if(this.getScheduler().checkExists(jobKey)) {
				this.getScheduler().deleteJob(jobKey);
			}
		}
		catch (Throwable ex) {
			log.error(String.format("关闭定时逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
			this.logEvent(LogLevels.ERROR, String.format("关闭定时逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), iSystemRuntime);
		}
	}
	
	protected Object executeExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData, boolean bTimer) throws Throwable{
		return this.executeExtensionLogic(v2SystemExtensionLogic, objData, bTimer, null);
	}

	protected Object executeExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData, boolean bTimer, AccessToken accessToken) throws Throwable{

		String strDeploySystemId = DataTypeUtils.getStringValue(v2SystemExtensionLogic.get("_deploysystemid"), null);
		if(bTimer) {
			ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.getSysUniStateUtilRuntime(true);
			if(iSysUniStateUtilRuntime != null) {
				String strDCId = v2SystemExtensionLogic.getExtensionTag2();
				if(!iSysUniStateUtilRuntime.hasLeadership(KeyValueUtils.genUniqueId(strDeploySystemId, EXTENSIONLOGIC_TIMERTASK, strDCId))) {
					return null;
				}
			}
		}

		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			if(accessToken != null && accessToken.getEmployee() != null) {
				Employee employee = new Employee();
				employee.putAll(accessToken.getEmployee());
				
				Collection<? extends GrantedAuthority> authorities = null;
				String strAuthorities = accessToken.getAuthorities();
				if(StringUtils.hasLength(strAuthorities)) {
					authorities = JsonUtils.as(strAuthorities, SysUAAUtilRuntimeBase.UAAGrantedAuthorityListType);
				}
				EmployeeContext employeeContext = new EmployeeContext(employee, null, strDeploySystemId, authorities);
				UserContext.setCurrent(employeeContext);
			}
			else {
				Employee employee = new Employee();
				employee.setSrfdcid(v2SystemExtensionLogic.getExtensionTag2());
				employee.setUserId("SYSTEM");
				employee.setUserName("后台作业");
				employee.setPersonName("后台作业");
				employee.setDCSystemId(v2SystemExtensionLogic.getExtensionTag());
				IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, strDeploySystemId);
				EmployeeContext.setCurrent(iEmployeeContext);
			}

			//仿真上下文
			return this.onExecuteExtensionLogic(v2SystemExtensionLogic, objData);
		}
		catch (Throwable ex) {
			log.error(String.format("执行扩展逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
			throw new Exception(String.format("执行扩展逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}

	protected Object onExecuteExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData) throws Throwable{
		String strDataEntityId = DataTypeUtils.getStringValue(v2SystemExtensionLogic.get("_dataentityid"), null);
		String strDeploySystemId = DataTypeUtils.getStringValue(v2SystemExtensionLogic.get("_deploysystemid"), null);

		ISystemRuntime iSystemRuntime = ServiceHub.getInstance().getLoadedSystemRuntime(strDeploySystemId);
		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)iSystemRuntime.getDataEntityRuntime(strDataEntityId);
		return iDataEntityRuntime.executeExtensionLogic(v2SystemExtensionLogic, objData);
	}
	
	protected Object executeWebHookLogic(ISystemRuntime iSystemRuntime, String strKey, Object param, AccessToken accessToken) throws Throwable{
		//获取逻辑对象
		//获取父标识
		String strDataEntityTag = PSModelUtils.getParentId(strKey);
		String strLogicTag = PSModelUtils.getSimpleId(strKey);
		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)iSystemRuntime.getDataEntityRuntime(strDataEntityTag, true);
		IDELogicRuntime iDELogicRuntime = null;
		if(iDataEntityRuntime != null) {
			iDELogicRuntime = iDataEntityRuntime.getDELogicRuntime(strLogicTag, true);
		}
		
		if(iDELogicRuntime == null && iSystemRuntime instanceof IServiceSystemRuntime) {
			//循环子系统扩展
			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iSystemRuntime;
			Collection<IExtensionSysRefRuntime> list = iServiceSystemRuntime.getExtensionSysRefRuntimes(false);
			if(!ObjectUtils.isEmpty(list)) {
				for(IExtensionSysRefRuntime iExtensionSysRefRuntime : list) {
					if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {
						if(iExtensionSysRefRuntime.getDeploySystem() == null) {
							continue;
						}
						
						ISystemRuntime extSystemRuntime = ServiceHub.getInstance().getLoadedSystemRuntime(iExtensionSysRefRuntime.getDeploySystem().getDeploySystemId(), false);
						iDataEntityRuntime = (IDataEntityRuntime)extSystemRuntime.getDataEntityRuntime(strDataEntityTag, true);
						if(iDataEntityRuntime != null) {
							iDELogicRuntime = iDataEntityRuntime.getDELogicRuntime(strLogicTag, true);
							if (iDELogicRuntime != null) {
								break;
							}
						}
					}
					
				}
			}
		}
		
		if(iDELogicRuntime == null || iDELogicRuntime.getPSDELogic() == null) {
			throw new Exception(String.format("无法获取指定逻辑[%1$s]", strKey));
		}
		
		if(!LogicSubType.WEBHOOK.value.equals(iDELogicRuntime.getPSDELogic().getLogicSubType())) {
			throw new Exception(String.format("逻辑[%1$s]类型不正确", strKey));
		}
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			if(accessToken != null && accessToken.getEmployee() != null) {
				Employee employee = new Employee();
				employee.putAll(accessToken.getEmployee());
				
				Collection<? extends GrantedAuthority> authorities = null;
				String strAuthorities = accessToken.getAuthorities();
				if(StringUtils.hasLength(strAuthorities)) {
					authorities = JsonUtils.as(strAuthorities, SysUAAUtilRuntimeBase.UAAGrantedAuthorityListType);
				}
				EmployeeContext employeeContext = new EmployeeContext(employee, null, iSystemRuntime.getDeploySystemId(), authorities);
				UserContext.setCurrent(employeeContext);
			}
			else {
				UserContext.setCurrent(iSystemRuntime.createDefaultUserContext());
			}
			
			if(iDELogicRuntime.getPSDELogic().getThreadMode() == DELogicThreadRunMode.THREAD.value) {
				IDataEntityRuntime iDataEntityRuntime2 = iDataEntityRuntime;
				IDELogicRuntime iDELogicRuntime2 = iDELogicRuntime;
				this.getSystemRuntime().threadRun(new Runnable() {
					
					@Override
					public void run() {
						try {
							onExecuteWebHookLogic(iDataEntityRuntime2, iDELogicRuntime2, param);
						} catch (Throwable ex) {
							log.error(ex);
						}
					}
				});
				return null;
			}
			else {
				return onExecuteWebHookLogic(iDataEntityRuntime, iDELogicRuntime, param);
			}
		}
		catch (Throwable ex) {
			log.error(String.format("执行逻辑[%1$s]发生异常，%2$s", strKey, ex.getMessage()), ex);
			throw new Exception(String.format("执行逻辑[%1$s]发生异常，%2$s", strKey, ex.getMessage()), ex);
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	protected Object onExecuteWebHookLogic(IDataEntityRuntime iDataEntityRuntime, IDELogicRuntime iDELogicRuntime, Object param) throws Throwable{
		return iDataEntityRuntime.executeLogic(iDELogicRuntime, new Object[] {param});
	}

	@Override
	public CodeList getCodeList(String strCodeListTag, int nMaxSize, Object param, boolean bTryMode) {
		return this.executeAction("获取代码表配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetCodeList(strCodeListTag, nMaxSize, param, bTryMode);
			}
		}, null, CodeList.class);
	}


	protected CodeList onGetCodeList(String strCodeListTag, int nMaxSize, Object param, boolean bTryMode) throws Throwable{
		return this.onGetCodeList(this.getSystemRuntime(), strCodeListTag, nMaxSize, param, bTryMode);
	}

	protected CodeList onGetCodeList(ISystemRuntime iSystemRuntime, String strCodeListTag, int nMaxSize, Object param, boolean bTryMode) throws Throwable{
		ICodeListRuntime iCodeListRuntime = iSystemRuntime.getCodeListRuntime(strCodeListTag, bTryMode);
		if(iCodeListRuntime == null) {
			return null;
		}
		List<IPSCodeItem> psCodeItems = null;
		if (iCodeListRuntime instanceof IDynamicCodeListRuntime) {
			psCodeItems = ((IDynamicCodeListRuntime) iCodeListRuntime).getPSCodeItems(param);
		}
		else {
			psCodeItems = iCodeListRuntime.getPSCodeItems();
		}

		//输出代码表
		CodeList codeList = new CodeList();
		codeList.setCode(strCodeListTag);
		if(!ObjectUtils.isEmpty(psCodeItems)) {
			int nIndex = 0;
			List<CodeItem> codeItems = new ArrayList<CodeItem>();
			for(IPSCodeItem iPSCodeItem : psCodeItems) {
				CodeItem codeItem = new CodeItem();

				codeItem.setValue(iPSCodeItem.getValue());
				codeItem.setText(iPSCodeItem.getText());
				codeItem.setIconClass(iPSCodeItem.getIconCls());
				codeItem.setIconUrl(iPSCodeItem.getIconPath());
				codeItem.setCls(iPSCodeItem.getTextCls());
				codeItem.setColor(iPSCodeItem.getColor());
				codeItem.setBKColor(iPSCodeItem.getBKColor());
				codeItem.setShowOrder(nIndex);
				codeItem.setDisabled(iPSCodeItem.isDisableSelect());

				codeItems.add(codeItem);

				nMaxSize --;
				if(nMaxSize == 0) {
					break;
				}

				nIndex ++;
			}
			codeList.setItems(codeItems);
		}

		return codeList;
	}
	
	protected void setExtensionSysRefRuntime(ISystemRuntime iSystemRuntime, String strTag, IExtensionSysRefRuntime iExtensionSysRefRuntime) {
		Map<String, IExtensionSysRefRuntime> map = this.extensionSysRefRuntimeMap.get(iSystemRuntime.getDeploySystemId());
		if(map == null) {
			map = new ConcurrentHashMap<String, IExtensionSysRefRuntime>();
			this.extensionSysRefRuntimeMap.put(iSystemRuntime.getDeploySystemId(), map);
		}
		map.put(strTag, iExtensionSysRefRuntime);
	}
	
	protected IExtensionSysRefRuntime getExtensionSysRefRuntime(ISystemRuntime iSystemRuntime, String strTag, boolean bTryMode) throws Exception {
		Map<String, IExtensionSysRefRuntime> map = this.extensionSysRefRuntimeMap.get(iSystemRuntime.getDeploySystemId());
		IExtensionSysRefRuntime iExtensionSysRefRuntime = (map != null)?map.get(strTag):null;
		if(iExtensionSysRefRuntime != null || bTryMode) {
			return iExtensionSysRefRuntime;
		}
		throw new Exception(String.format("无法获取指定标记[%1$s]扩展应用运行时对象", strTag));
	}
	
	protected void resetExtensionSysRefRuntimes(ISystemRuntime iSystemRuntime) {
		 this.extensionSysRefRuntimeMap.remove(iSystemRuntime.getDeploySystemId());
	}
	
	protected boolean isConcurrentLoadSystemMergences() {
		return ServiceHub.getInstance().isConcurrentLoadSystemMergences();
	}
	
	protected Map<String, Object> getPSModelSetting(Map<String, Object> settings, String strPSModelName, String strPSModelFullTag) {
		Map<String, Object> parent = (Map<String, Object>)settings.get(strPSModelName.toLowerCase());
		if(parent == null) {
			parent = new LinkedHashMap<String, Object>();
			settings.put(strPSModelName.toLowerCase(), parent);
		}
		
		String[] tags = strPSModelFullTag.toLowerCase().split("[.]");
		for(String tag : tags) {
			Map<String, Object> map = (Map<String, Object>)parent.get(tag);
			if(map == null) {
				map = new LinkedHashMap<String, Object>();
				parent.put(tag.toLowerCase(), map);
			}
			parent = map;
		}
		return parent;
	}

	protected void logEvent(int nLogLevel, String strInfo) {
		logEvent(nLogLevel, strInfo, null);
	}

	protected void logEvent(int nLogLevel, String strInfo, Object objData) {
		this.logEvent(nLogLevel, getLogCat(), strInfo, objData);
	}

	/**
	 * 日志服务总线事件信息
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param objData
	 */
	protected void logEvent(int nLogLevel, String strCat, String strInfo, Object objData) {
		boolean bDisabled = EmployeeContext.isCurrentDisabled();
		try {
			EmployeeContext.setCurrentDisabled(true);
			if(objData instanceof ISystemRuntime) {
				ISystemRuntime iSystemRuntime = (ISystemRuntime)objData;
				Log log = new Log();
				log.setSystemId(iSystemRuntime.getServiceId());
				log.set("dcsystemid", iSystemRuntime.getServiceId());
				objData = log;
			}
			this.getSystemRuntime().logEvent(nLogLevel, strCat, strInfo, objData);
		}
		catch (Throwable ex) {
			log.error(String.format("日志事件发生异常，%1$s", ex.getMessage()), ex);
		}
		finally {
			EmployeeContext.setCurrentDisabled(bDisabled);
		}
	}

	@Override
	protected String getLogCat() {
		return LogCats.EXTENSION;
	}
}
