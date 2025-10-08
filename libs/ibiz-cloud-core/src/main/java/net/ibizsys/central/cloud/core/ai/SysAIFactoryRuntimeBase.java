package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.util.ChatResourceUtils;
import net.ibizsys.central.cloud.core.util.IChatResourceUtils;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.res.ISysFileResourceRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.res.ISysSCMResourceRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.AIChatAgentType;
import net.ibizsys.model.PSModelEnums.AIPipelineAgentType;
import net.ibizsys.model.PSModelEnums.AIWorkerAgentType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.model.ai.IPSSysAIPipelineAgent;
import net.ibizsys.model.ai.IPSSysAIWorkerAgent;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SysAIFactoryRuntimeBase extends SystemModelRuntimeBase implements ISysAIFactoryRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIFactoryRuntimeBase.class);
	
	/**
	 * 模板上下文参数：上下文对象
	 */
	public final static String TEMPLATE_PARAM_CTX = "ctx";
	
	/**
	 * 模板上下文参数：实体运行时对象
	 */
	public final static String TEMPLATE_PARAM_DE = "de";
	
	/**
	 * 模板上下文参数：系统运行时对象
	 */
	public final static String TEMPLATE_PARAM_SYS = "sys";
	
	/**
	 * 模板上下文参数：当前工厂对象
	 */
	public final static String TEMPLATE_PARAM_FACTORY = "factory";
	

	private IPSSysAIFactory iPSSysAIFactory = null;

	private String strServiceUrl = null;

	private String strAIFactoryType = null;

	private String strClientId = null;

	private String strClientSecret = null;

	private String strAuthMode = null;

	private String strAuthParam = null;

	private String strAuthParam2 = null;

	private String strServiceParam = null;

	private String strServiceParam2 = null;

	private Map<String, ISysAIChatAgentRuntime> sysAIChatAgentRuntimeMap = new ConcurrentHashMap<String, ISysAIChatAgentRuntime>();
	
	private Map<String, ISysAIWorkerAgentRuntime> sysAIWorkerAgentRuntimeMap = new ConcurrentHashMap<String, ISysAIWorkerAgentRuntime>();
	
	private Map<String, ISysAIPipelineAgentRuntime> sysAIPipelineAgentRuntimeMap = new ConcurrentHashMap<String, ISysAIPipelineAgentRuntime>();
	
	private Map<String, ISysAIChatResource> sysAIChatResourceMap = new ConcurrentHashMap<String, ISysAIChatResource>();
	
	private IChatResourceUtils iChatResourceUtils = null; 
	
	private AIFactoryRTScriptBase aiFactoryRTScriptBase = null;

	private ISysFileResourceRuntime configSysFileResourceRuntime = null;
	private boolean bConfigFromResource = false;

	// private ThreadLocal<String> configPathThreadLocal = new
	// ThreadLocal<String>();
	private String strDefautConfigPath = null;

	private boolean bInstalled = false;

	private int nHistoryCount = -1;
	
	private String strAIPlatformType = null;
	
	private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

	private ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext = new ISysAIFactoryRuntimeContext() {

		@Override
		public ISysAIFactoryRuntime getModelRuntime() {
			return getSelf();
		}

		@Override
		public String getConfigContent(Object data, String strConfigId, boolean bTryMode) throws Throwable {
			return getSelf().getConfigContent(data, strConfigId, bTryMode);
		}

		@Override
		public String getParam(String strKey, String strDefault) {
			return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, strDefault);
		}

		@Override
		public int getParam(String strKey, int nDefault) {
			return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, nDefault);
		}

		@Override
		public long getParam(String strKey, long nDefault) {
			return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, nDefault);
		}

		@Override
		public double getParam(String strKey, double fDefault) {
			return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, fDefault);
		}

		@Override
		public boolean getParam(String strKey, boolean bDefault) {
			return getSystemRuntimeSetting().getParam(getConfigFolder() + strKey, bDefault);
		}

		@Override
		public Map<String, Object> getParams(String strPKey, Map<String, Object> params) {
			return getSystemRuntimeSetting().getParams(getConfigFolder() + strPKey, params);
		}

		@Override
		public int getHistoryCount() {
			return SysAIFactoryRuntimeBase.this.getHistoryCount();
		}

		@Override
		public String getAIPlatformType() {
			return SysAIFactoryRuntimeBase.this.getAIPlatformType();
		}

	};
	

	/**
	 * 获取AI工厂的配置目录
	 * 
	 * @param iPSSysAIFactory
	 * @return
	 */
	public static String getConfigFolder(IPSSysAIFactory iPSSysAIFactory) {
		return ISystemRuntimeSetting.CONFIGFOLDER_SYSAIFACTORY + "." + PSModelUtils.calcUniqueTag(iPSSysAIFactory.getPSSystemModule(), iPSSysAIFactory.getCodeName());
	}
	

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysAIFactory iPSSysAIFactory) throws Exception {
		Assert.notNull(iSystemRuntimeContext, "传入系统运行时上下文对象无效");
		Assert.notNull(iPSSysAIFactory, "传入AI工厂模型对象无效");
		this.setSystemRuntimeBase(iSystemRuntimeContext.getSystemRuntime());
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysAIFactory = iPSSysAIFactory;

		this.setConfigFolder(getConfigFolder(iPSSysAIFactory));

		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {

		this.iChatResourceUtils = new ChatResourceUtils(this.getSystemRuntimeContext()) {
			public String getResource(String type, String subType, Object key, Map<String, Object> params, boolean testPriv) throws Exception {
				String content = getChatResource(type, subType, key, params, testPriv);
				if(StringUtils.hasLength(content)) {
					return content;
				}
				return super.getResource(type, subType, key, params, testPriv);
			}
			
			@Override
			protected String getTemplateContent(String resourcePath, String defaultValue) throws Exception {
				String content = getChatResourceTemplateContent(resourcePath);
				if(StringUtils.hasLength(content)) {
					return content;
				}				
				return super.getTemplateContent(resourcePath, defaultValue);
			}
		} ;
		
		this.setAIPlatformType(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".aiplatformtype", this.getAIPlatformType()));
		
		this.setHistoryCount(JsonUtils.getField(this.getPSSysAIFactory().getAIFactoryParams(), "historycount", this.getHistoryCount()));
		this.setHistoryCount(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".historycount", this.getHistoryCount()));
		
		this.setServiceUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceurl", this.getPSSysAIFactory().getServicePath()));

		this.setAuthMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authmode", this.getPSSysAIFactory().getAuthMode()));
		this.setClientId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientid", this.getPSSysAIFactory().getAuthClientId()));
		this.setClientSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientsecret", this.getPSSysAIFactory().getAuthClientSecret()));

		this.setAuthParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam", this.getPSSysAIFactory().getAuthParam()));
		this.setAuthParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam2", this.getPSSysAIFactory().getAuthParam2()));

		this.setServiceParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam", this.getPSSysAIFactory().getServiceParam()));
		this.setServiceParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam2", this.getPSSysAIFactory().getServiceParam2()));
		
		
		

		this.deMethodPluginRuntimeRepo.init(this.getSystemRuntime(), true);
		super.onInit();
	}

	protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
		return this.deMethodPluginRuntimeRepo;
	}

	protected void prepareConfig() throws Exception {

		if (this.getPSSysAIFactory().getPSSysResource() == null) {
			log.warn(String.format("AI工厂组件[%1$s]未指定配置资源", this.getName()));
			return;
		}
		ISysResourceRuntime iSysResourceRuntime = this.getSystemRuntime().getSysResourceRuntime(this.getPSSysAIFactory().getPSSysResource());
		if (iSysResourceRuntime instanceof ISysFileResourceRuntime) {
			this.setConfigFromResource(false);
			this.setConfigSysFileResourceRuntime((ISysFileResourceRuntime) iSysResourceRuntime);
		}
	}

	protected ISysAIFactoryRuntimeContext getSysAIFactoryRuntimeContext() {
		return this.iSysAIFactoryRuntimeContext;
	}

	private SysAIFactoryRuntimeBase getSelf() {
		return this;
	}

	protected ISysAIChatAgentRuntime createSysAIChatAgentRuntime(IPSSysAIChatAgent iPSSysAIChatAgent) {
		if (iPSSysAIChatAgent.getPSSysSFPlugin() != null) {
			return this.getSystemRuntime().getRuntimeObject(iPSSysAIChatAgent.getPSSysSFPlugin(), ISysAIChatAgentRuntime.class, true);
		}
		return createDefaultSysAIChatAgentRuntime(iPSSysAIChatAgent);
	}

	protected ISysAIChatAgentRuntime createDefaultSysAIChatAgentRuntime(IPSSysAIChatAgent iPSSysAIChatAgent) {

		AIChatAgentType aiChatAgentType = AIChatAgentType.from(iPSSysAIChatAgent.getAgentType());

		switch (aiChatAgentType) {
		case DEFAULT:
			return new DefaultSysAIChatAgentRuntime();
		case DE:
			return new DESysAIChatAgentRuntime();
		default:
			return new DefaultSysAIChatAgentRuntime();
		}
	}

	protected ISysAIWorkerAgentRuntime createSysAIWorkerAgentRuntime(IPSSysAIWorkerAgent iPSSysAIWorkerAgent) {
		if (iPSSysAIWorkerAgent.getPSSysSFPlugin() != null) {
			return this.getSystemRuntime().getRuntimeObject(iPSSysAIWorkerAgent.getPSSysSFPlugin(), ISysAIWorkerAgentRuntime.class, true);
		}
		return createDefaultSysAIWorkerAgentRuntime(iPSSysAIWorkerAgent);
	}

	protected ISysAIWorkerAgentRuntime createDefaultSysAIWorkerAgentRuntime(IPSSysAIWorkerAgent iPSSysAIWorkerAgent) {

		AIWorkerAgentType aiWorkerAgentType = AIWorkerAgentType.from(iPSSysAIWorkerAgent.getAgentType());

		switch (aiWorkerAgentType) {
		case DEFAULT:
			return new DefaultSysAIWorkerAgentRuntime();
		default:
			return new DefaultSysAIWorkerAgentRuntime();
		}
	}
	
	protected ISysAIPipelineAgentRuntime createSysAIPipelineAgentRuntime(IPSSysAIPipelineAgent iPSSysAIPipelineAgent) {
		if (iPSSysAIPipelineAgent.getPSSysSFPlugin() != null) {
			return this.getSystemRuntime().getRuntimeObject(iPSSysAIPipelineAgent.getPSSysSFPlugin(), ISysAIPipelineAgentRuntime.class, true);
		}
		return createDefaultSysAIPipelineAgentRuntime(iPSSysAIPipelineAgent);
	}

	protected ISysAIPipelineAgentRuntime createDefaultSysAIPipelineAgentRuntime(IPSSysAIPipelineAgent iPSSysAIPipelineAgent) {

		AIPipelineAgentType aiPipelineAgentType = AIPipelineAgentType.from(iPSSysAIPipelineAgent.getAgentType());

		switch (aiPipelineAgentType) {
		case DEFAULT:
			return new DefaultSysAIPipelineAgentRuntime();
		default:
			return new DefaultSysAIPipelineAgentRuntime();
		}
	}
	
	protected ISysAIChatResource createSysAIChatResource(String resourceType) {
		return new DefaultSysAIChatResource();
	}
	
	
	@Override
	public IPSSysAIFactory getPSSysAIFactory() {
		return this.iPSSysAIFactory;
	}

	@Override
	public String getAIFactoryType() {
		return this.strAIFactoryType;
	}

	@Override
	public void setAIFactoryType(String strAIFactoryType) {
		this.strAIFactoryType = strAIFactoryType;
	}

	public String getAIPlatformType() {
		return this.strAIPlatformType;
	}
	
	protected void setAIPlatformType(String strAIPlatformType) {
		this.strAIPlatformType = strAIPlatformType;
	}
	
	public int getHistoryCount() {
		return this.nHistoryCount;
	}
	
	protected void setHistoryCount(int nHistoryCount) {
		this.nHistoryCount = nHistoryCount;
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
	public IPSModelObject getPSModelObject() {
		return this.getPSSysAIFactory();
	}
	
	@Override
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime)super.getSystemRuntime();
	}

	@Override
	public ISysFileResourceRuntime getConfigSysFileResourceRuntime(boolean bTryMode) {
		if (this.configSysFileResourceRuntime != null || bTryMode) {
			return this.configSysFileResourceRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("未指定工厂配置系统文件资源运行时对象"));
	}

	protected void setConfigSysFileResourceRuntime(ISysFileResourceRuntime templSysFileResourceRuntime) {
		this.configSysFileResourceRuntime = templSysFileResourceRuntime;
	}

	public boolean isConfigFromResource() {
		return this.bConfigFromResource;
	}

	protected void setConfigFromResource(boolean bConfigFromResource) {
		this.bConfigFromResource = bConfigFromResource;
	}

	protected String getConfigContent(Object data, String strConfigId, boolean bTryMode) throws Exception {
		String strConfigPath = null;
		ISysFileResourceRuntime configSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(true);
		if (configSysFileResourceRuntime != null) {
			if (configSysFileResourceRuntime instanceof ISysSCMResourceRuntime) {
				((ISysSCMResourceRuntime) configSysFileResourceRuntime).checkoutIf(data);
			}
			strConfigPath = configSysFileResourceRuntime.getFile(data).getCanonicalPath();
		} else {
			strConfigPath = this.getDefautConfigPath();
		}

		return this.getConfigContentReal(strConfigPath, strConfigId, bTryMode);
	}

	protected String getConfigContentReal(String strConfigPath, String strConfigId, boolean bTryMode) throws Exception {

		if (this.isConfigFromResource()) {
			String strFullModelPath = strConfigPath + "/" + strConfigId.replace("\\", "/");
			InputStream is = this.getClass().getResourceAsStream(strFullModelPath);
			if (is != null) {
				return IOUtils.toString(is, "UTF-8");
			}

			if (bTryMode) {
				return null;
			}

			throw new Exception(String.format("指定配置[%1$s]不存在", strFullModelPath));

		} else {
			String strFullModelPath = strConfigPath + File.separator + strConfigId;
			File file = new File(strFullModelPath);
			if (file.exists()) {
				return FileUtils.readFileToString(file, "UTF-8");
			}

			if (bTryMode) {
				return null;
			}

			throw new Exception(String.format("指定配置[%1$s]不存在", strFullModelPath));
		}
	}

	// protected String getConfigPath() {
	// return this.configPathThreadLocal.get();
	// }
	//
	// protected void setConfigPath(String strConfigPath) {
	// this.configPathThreadLocal.set(strConfigPath);
	// }

	public String getDefautConfigPath() {
		return strDefautConfigPath;
	}

	protected void setDefautConfigPath(String strDefautConfigPath) {
		this.strDefautConfigPath = strDefautConfigPath;
	}

	@Override
	public synchronized void install() throws Exception {
		if (!this.bInstalled) {
			this.onInstall();

			this.bInstalled = true;
		}
	}

	protected void onInstall() throws Exception {

		prepareConfig();

		java.util.List<IPSSysAIChatAgent> psSysAIChatAgentList = this.getPSSysAIFactory().getAllPSSysAIChatAgents();
		if (!ObjectUtils.isEmpty(psSysAIChatAgentList)) {
			for (IPSSysAIChatAgent iPSSysAIChatAgent : psSysAIChatAgentList) {

				if (!StringUtils.hasLength(iPSSysAIChatAgent.getCodeName())) {
					log.warn(String.format("初始化AI交谈代理[%1$s]未指定代码标识，忽略加载", iPSSysAIChatAgent.getName()));
					continue;
				}

				ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.createSysAIChatAgentRuntime(iPSSysAIChatAgent);
				try {
					iSysAIChatAgentRuntime.init(this.getSysAIFactoryRuntimeContext(), iPSSysAIChatAgent);
					sysAIChatAgentRuntimeMap.put(iPSSysAIChatAgent.getCodeName().toUpperCase(), iSysAIChatAgentRuntime);
				} catch (Exception ex) {
					throw new Exception(String.format("初始化AI交谈代理[%1$s]运行时发生异常，%2$s", iPSSysAIChatAgent.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		java.util.List<IPSSysAIWorkerAgent> psSysAIWorkerAgentList = this.getPSSysAIFactory().getAllPSSysAIWorkerAgents();
		if (!ObjectUtils.isEmpty(psSysAIWorkerAgentList)) {
			for (IPSSysAIWorkerAgent iPSSysAIWorkerAgent : psSysAIWorkerAgentList) {

				if (!StringUtils.hasLength(iPSSysAIWorkerAgent.getCodeName())) {
					log.warn(String.format("初始化AI工作者代理[%1$s]未指定代码标识，忽略加载", iPSSysAIWorkerAgent.getName()));
					continue;
				}

				ISysAIWorkerAgentRuntime iSysAIWorkerAgentRuntime = this.createSysAIWorkerAgentRuntime(iPSSysAIWorkerAgent);
				try {
					iSysAIWorkerAgentRuntime.init(this.getSysAIFactoryRuntimeContext(), iPSSysAIWorkerAgent);
					sysAIWorkerAgentRuntimeMap.put(iPSSysAIWorkerAgent.getCodeName().toUpperCase(), iSysAIWorkerAgentRuntime);
				} catch (Exception ex) {
					throw new Exception(String.format("初始化AI工作者代理[%1$s]运行时发生异常，%2$s", iPSSysAIWorkerAgent.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		java.util.List<IPSSysAIPipelineAgent> psSysAIPipelineAgentList = this.getPSSysAIFactory().getAllPSSysAIPipelineAgents();
		if (!ObjectUtils.isEmpty(psSysAIPipelineAgentList)) {
			for (IPSSysAIPipelineAgent iPSSysAIPipelineAgent : psSysAIPipelineAgentList) {

				if (!StringUtils.hasLength(iPSSysAIPipelineAgent.getCodeName())) {
					log.warn(String.format("初始化AI生产线代理[%1$s]未指定代码标识，忽略加载", iPSSysAIPipelineAgent.getName()));
					continue;
				}

				ISysAIPipelineAgentRuntime iSysAIPipelineAgentRuntime = this.createSysAIPipelineAgentRuntime(iPSSysAIPipelineAgent);
				try {
					iSysAIPipelineAgentRuntime.init(this.getSysAIFactoryRuntimeContext(), iPSSysAIPipelineAgent);
					sysAIPipelineAgentRuntimeMap.put(iPSSysAIPipelineAgent.getCodeName().toUpperCase(), iSysAIPipelineAgentRuntime);
				} catch (Exception ex) {
					throw new Exception(String.format("初始化AI生产线代理[%1$s]运行时发生异常，%2$s", iPSSysAIPipelineAgent.getName(), ex.getMessage()), ex);
				}
			}
		}

		this.onRegisterDEMethodPluginRuntimes();

		listenReloadSignal();
	}

	protected void onRegisterDEMethodPluginRuntimes() throws Exception {

		//循环工作者代理，如指定实体及标记，则尝试接管行为
		java.util.List<IPSSysAIWorkerAgent> psSysAIWorkerAgents = this.getPSSysAIFactory().getAllPSSysAIWorkerAgents();
		if(!ObjectUtils.isEmpty(psSysAIWorkerAgents)) {
			for(IPSSysAIWorkerAgent iPSSysAIWorkerAgent : psSysAIWorkerAgents) {
				if(iPSSysAIWorkerAgent.getPSDataEntity() == null) {
					continue;
				}
				
				if(ObjectUtils.isEmpty(iPSSysAIWorkerAgent.getAgentTag2())) {
					continue;
				}
				
				String[] actions = iPSSysAIWorkerAgent.getAgentTag2().split("[;]");
				for(String strAction : actions) {
					this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(iPSSysAIWorkerAgent.getPSDataEntity().getName(), strAction, new IDEActionPluginRuntime() {
						@Override
						public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
							return doAIWorkerAgentExecute(iPSSysAIWorkerAgent, iDataEntityRuntimeContext, iPSDEAction, args, actionData);
						}
					});
				}
			}
		}
		
		//循环生产线代理，如指定实体及标记，则尝试接管行为
		java.util.List<IPSSysAIPipelineAgent> psSysAIPipelineAgents = this.getPSSysAIFactory().getAllPSSysAIPipelineAgents();
		if(!ObjectUtils.isEmpty(psSysAIPipelineAgents)) {
			for(IPSSysAIPipelineAgent iPSSysAIPipelineAgent : psSysAIPipelineAgents) {
				if(iPSSysAIPipelineAgent.getPSDataEntity() == null) {
					continue;
				}
				
				if(ObjectUtils.isEmpty(iPSSysAIPipelineAgent.getAgentTag2())) {
					continue;
				}
				
				String[] actions = iPSSysAIPipelineAgent.getAgentTag2().split("[;]");
				for(String strAction : actions) {
					this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(iPSSysAIPipelineAgent.getPSDataEntity().getName(), strAction, new IDEActionPluginRuntime() {
						@Override
						public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
							return doAIPipelineAgentExecute(iPSSysAIPipelineAgent, iDataEntityRuntimeContext, iPSDEAction, args, actionData);
						}
					});
				}
			}
		}
	}
	
	
	protected Object doAIWorkerAgentExecute(IPSSysAIWorkerAgent iPSSysAIWorkerAgent, IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		//获取指定数据
		if(args == null || args.length == 0) {
			throw new Exception("传入参数无效");
		}
		
		Object key = null;
		if(args[0] instanceof IEntityDTO) {
			key = iDataEntityRuntimeContext.getDataEntityRuntime().getKeyFieldValue((IEntityDTO)args[0]);
		}
		else {
			key = DataTypeUtils.asSimple(args[0]);
		}
		
		if(ObjectUtils.isEmpty(key)) {
			throw new Exception("传入参数未携带键值");
		}
		
		//获取工作者代理对象
		ISysAIWorkerAgentRuntime iSysAIWorkerAgentRuntime = this.getSysAIWorkerAgentRuntime(iPSSysAIWorkerAgent);
		//获取数据
		IEntityDTO data = (IEntityDTO)iDataEntityRuntimeContext.getDataEntityRuntime().get(key);
		return iSysAIWorkerAgentRuntime.executeAction(iPSDEAction.getName(), new Object[] { data });
	}
	
	
	protected Object doAIPipelineAgentExecute(IPSSysAIPipelineAgent iPSSysAIPipelineAgent, IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		//获取指定数据
		if(args == null || args.length == 0) {
			throw new Exception("传入参数无效");
		}
		
		Object key = null;
		if(args[0] instanceof IEntityDTO) {
			key = iDataEntityRuntimeContext.getDataEntityRuntime().getKeyFieldValue((IEntityDTO)args[0]);
		}
		else {
			key = DataTypeUtils.asSimple(args[0]);
		}
		
		if(ObjectUtils.isEmpty(key)) {
			throw new Exception("传入参数未携带键值");
		}
		
		//获取生产线代理对象
		ISysAIPipelineAgentRuntime iSysAIPipelineAgentRuntime = this.getSysAIPipelineAgentRuntime(iPSSysAIPipelineAgent);
		//获取数据
		IEntityDTO data = (IEntityDTO)iDataEntityRuntimeContext.getDataEntityRuntime().get(key);
		return iSysAIPipelineAgentRuntime.executeAction(iPSDEAction.getName(), new Object[] { data });
	}
	

	
	protected void listenReloadSignal() throws Exception {
		if (!(this.getSystemRuntime() instanceof IServiceSystemRuntime)) {
			return;
		}

		String strReloadSignalId = String.format("%1$s%2$s-%3$s", NacosServiceHubSettingBase.DATAID_RELOADSIGNAL_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-")).toLowerCase();
		log.debug(String.format("AI工厂[%1$s]监控重载配置[%2$s]", this.getName(), strReloadSignalId));
		((IServiceSystemRuntime) this.getSystemRuntime()).getConfigListenerRepo().addConfigListener(strReloadSignalId, new IConfigListener() {
			@Override
			public void receiveConfigInfo(String configInfo) {
				log.debug(String.format("%1$s接收到重载信号", getConfigFolder()));
				reload();
			}
		});
	}

	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}

	@Override
	public void uninstall() {
		try {
			onUninstall();
		} catch (Throwable ex) {
			log.error(String.format("卸载AI工厂[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载AI工厂[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}

	protected void onUninstall() throws Throwable {
		this.getDEMethodPluginRuntimeRepo().shutdown();
	}

	@Override
	public ISysAIChatAgentRuntime getAIChatAgentRuntime(String strAIChatAgentTag, boolean bTryMode) {
		Assert.hasLength(strAIChatAgentTag, "未传入AI交谈代理标记");

		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.sysAIChatAgentRuntimeMap.get(strAIChatAgentTag.toUpperCase());
		if (iSysAIChatAgentRuntime != null || bTryMode) {
			return iSysAIChatAgentRuntime;
		}
		throw new SysAIFactoryRuntimeException(this, String.format("无法获取指定AI交谈代理[%1$s]运行时对象", strAIChatAgentTag));
	}

	@Override
	public ISysAIChatAgentRuntime getSysAIChatAgentRuntime(IPSSysAIChatAgent iPSSysAIChatAgent) {
		Assert.notNull(iPSSysAIChatAgent, "未传入AI交谈代理对象");

		return this.getAIChatAgentRuntime(iPSSysAIChatAgent.getCodeName(), false);
	}
	
	@Override
	public ISysAIWorkerAgentRuntime getAIWorkerAgentRuntime(String strAIWorkerAgentTag, boolean bTryMode) {
		Assert.hasLength(strAIWorkerAgentTag, "未传入AI工作者代理标记");

		ISysAIWorkerAgentRuntime iSysAIWorkerAgentRuntime = this.sysAIWorkerAgentRuntimeMap.get(strAIWorkerAgentTag.toUpperCase());
		if (iSysAIWorkerAgentRuntime != null || bTryMode) {
			return iSysAIWorkerAgentRuntime;
		}
		throw new SysAIFactoryRuntimeException(this, String.format("无法获取指定AI工作者代理[%1$s]运行时对象", strAIWorkerAgentTag));
	}
	
	protected ISysAIChatResource getAIChatResource(String resourceType) throws Exception {
		Assert.hasLength(resourceType, "未传入AI资源类型");
		ISysAIChatResource iSysAIChatResource = this.sysAIChatResourceMap.get(resourceType.toUpperCase());
		if(iSysAIChatResource == null) {
			iSysAIChatResource = this.createSysAIChatResource(resourceType);
			iSysAIChatResource.init(this.getSysAIFactoryRuntimeContext(), resourceType);
			this.sysAIChatResourceMap.put(resourceType.toUpperCase(), iSysAIChatResource);
		}
		return iSysAIChatResource;
	}

	@Override
	public ISysAIWorkerAgentRuntime getSysAIWorkerAgentRuntime(IPSSysAIWorkerAgent iPSSysAIWorkerAgent) {
		Assert.notNull(iPSSysAIWorkerAgent, "未传入AI工作者代理对象");

		return this.getAIWorkerAgentRuntime(iPSSysAIWorkerAgent.getCodeName(), false);
	}

	@Override
	public ISysAIPipelineAgentRuntime getAIPipelineAgentRuntime(String strAIPipelineAgentTag, boolean bTryMode) {
		Assert.hasLength(strAIPipelineAgentTag, "未传入AI生产线代理标记");

		ISysAIPipelineAgentRuntime iSysAIPipelineAgentRuntime = this.sysAIPipelineAgentRuntimeMap.get(strAIPipelineAgentTag.toUpperCase());
		if (iSysAIPipelineAgentRuntime != null || bTryMode) {
			return iSysAIPipelineAgentRuntime;
		}
		throw new SysAIFactoryRuntimeException(this, String.format("无法获取指定AI生产线代理[%1$s]运行时对象", strAIPipelineAgentTag));
	}

	@Override
	public ISysAIPipelineAgentRuntime getSysAIPipelineAgentRuntime(IPSSysAIPipelineAgent iPSSysAIPipelineAgent) {
		Assert.notNull(iPSSysAIPipelineAgent, "未传入AI生产线代理对象");

		return this.getAIPipelineAgentRuntime(iPSSysAIPipelineAgent.getCodeName(), false);
	}
	
	
	
	@Override
	public List<ISysAIChatAgentRuntime> getSysAIChatAgentRuntimes() {
		List<IPSSysAIChatAgent> psSysAIChatAgentList = this.getPSSysAIFactory().getAllPSSysAIChatAgents();
		if(ObjectUtils.isEmpty(psSysAIChatAgentList)) {
			return Collections.emptyList();
		}
		List<ISysAIChatAgentRuntime> list = new ArrayList<ISysAIChatAgentRuntime>();
		for(IPSSysAIChatAgent iPSSysAIChatAgent : psSysAIChatAgentList) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(iPSSysAIChatAgent);
			list.add(iSysAIChatAgentRuntime);
		}
		return Collections.unmodifiableList(list);
	}


	@Override
	public List<ISysAIWorkerAgentRuntime> getSysAIWorkerAgentRuntimes() {
		List<IPSSysAIWorkerAgent> psSysAIWorkerAgentList = this.getPSSysAIFactory().getAllPSSysAIWorkerAgents();
		if(ObjectUtils.isEmpty(psSysAIWorkerAgentList)) {
			return Collections.emptyList();
		}
		List<ISysAIWorkerAgentRuntime> list = new ArrayList<ISysAIWorkerAgentRuntime>();
		for(IPSSysAIWorkerAgent iPSSysAIWorkerAgent : psSysAIWorkerAgentList) {
			ISysAIWorkerAgentRuntime iSysAIWorkerAgentRuntime = this.getSysAIWorkerAgentRuntime(iPSSysAIWorkerAgent);
			list.add(iSysAIWorkerAgentRuntime);
		}
		return Collections.unmodifiableList(list);
	}


	@Override
	public List<ISysAIPipelineAgentRuntime> getSysAIPipelineAgentRuntimes() {
		List<IPSSysAIPipelineAgent> psSysAIPipelineAgentList = this.getPSSysAIFactory().getAllPSSysAIPipelineAgents();
		if(ObjectUtils.isEmpty(psSysAIPipelineAgentList)) {
			return Collections.emptyList();
		}
		List<ISysAIPipelineAgentRuntime> list = new ArrayList<ISysAIPipelineAgentRuntime>();
		for(IPSSysAIPipelineAgent iPSSysAIPipelineAgent : psSysAIPipelineAgentList) {
			ISysAIPipelineAgentRuntime iSysAIPipelineAgentRuntime = this.getSysAIPipelineAgentRuntime(iPSSysAIPipelineAgent);
			list.add(iSysAIPipelineAgentRuntime);
		}
		return Collections.unmodifiableList(list);
	}


	@Override
	public IChatResourceUtils getChatResourceUtils() {
		return this.iChatResourceUtils;
	}
	
	protected String getChatResource(String type, String subType, Object key, Map<String, Object> params, boolean testPriv) throws Exception {
		final ISysAIChatResource iSysAIChatResource = this.getAIChatResource(type);
		return iSysAIChatResource.getContent(subType, key, params, testPriv);
	}
	
	protected String getChatResourceTemplateContent(String resourcePath) throws Exception {
		resourcePath = resourcePath.replace("/chatresources/", "/resources/chat/");
		String content = getConfigContent(null, resourcePath, true);
		if(StringUtils.hasLength(content)) {
			return content;
		}
		return null;
	}
	
	protected AIFactoryRTScriptBase createAIFactoryRTScript(String strObjectName, String strScriptCode) throws Exception{
		return this.createAIFactoryRTScript(strObjectName, strScriptCode, null);
	}
	
	protected AIFactoryRTScriptBase createAIFactoryRTScript(String strObjectName, String strScriptCode, Class<? extends AIFactoryRTScriptBase> baseCls) throws Exception{
		Object obj = null;
		if(StringUtils.hasLength(strObjectName)) {
			try {
				Class cls = Class.forName(strObjectName);
				obj = cls.newInstance();
			}
			catch (Exception ex) {
			}
		}
		if(obj == null) {
			if(!StringUtils.hasLength(strScriptCode)) {
				throw new Exception(String.format("建立AI工厂脚本对象发生异常，%1$s", "未传入脚本代码"));
			}
			CompilerConfiguration compilerConfiguration = new CompilerConfiguration();
			if(baseCls == null) {
				compilerConfiguration.setScriptBaseClass(getScriptBaseClass().getName());
			}
			else {
				compilerConfiguration.setScriptBaseClass(baseCls.getName());
			}
			
			try(GroovyClassLoader classLoader = new GroovyClassLoader(this.getSystemRuntime().getGroovyClassLoader())) {
				GroovyShell groovyShell = new GroovyShell(classLoader, compilerConfiguration);
				obj = groovyShell.parse(strScriptCode);
			}
			catch (Exception ex) {
				throw new Exception(String.format("建立AI工厂脚本对象发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
		if(!(obj instanceof AIFactoryRTScriptBase)) {
			throw new Exception(String.format("建立AI工厂脚本对象[%1$s]类型不正确", obj));
		}
		
		try {
			AIFactoryRTScriptBase aiFactoryScriptBase = (AIFactoryRTScriptBase)obj;
			Map<String, Object> params = new HashMap<String, Object>();
			params.put(TEMPLATE_PARAM_CTX, this.getSysAIFactoryRuntimeContext());
			params.put(TEMPLATE_PARAM_SYS, this.getSystemRuntime());
			params.put(TEMPLATE_PARAM_FACTORY, this);
			
			this.onFillScriptBinding(params);
			
			aiFactoryScriptBase.setBinding(new Binding(params));
			aiFactoryScriptBase.setOwner(this);
			aiFactoryScriptBase.run();
			return aiFactoryScriptBase;
		}
		catch (Exception ex) {
			throw new Exception(String.format("AI工厂脚本对象运行发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onFillScriptBinding(Map<String, Object> params) {
		
	}
	
	protected Class<?> getScriptBaseClass() {
		return AIFactoryRTScriptBase.class;
	}
	
	
	protected AIFactoryRTScriptBase getAIFactoryRTScript(boolean bTryMode) throws Exception{
		if(this.aiFactoryRTScriptBase == null) {
			String strTemplateContent = this.getConfigContent(null, getModelRTScriptConfigId(), bTryMode);
			if(!StringUtils.hasLength(strTemplateContent)) {
				return null;
			}
			this.aiFactoryRTScriptBase = this.createAIFactoryRTScript(null, strTemplateContent);
		}
		return this.aiFactoryRTScriptBase;
	}
	
	protected String getModelRTScriptConfigId() throws Exception {
		return String.format("%1$s.groovy", this.getPSSysAIFactory().getCodeName()).toLowerCase();
	}

	@Override
	public void reload() {
		try {
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onReload() throws Throwable {
		// 重新加载资源
		if (this.getConfigSysFileResourceRuntime(true) != null) {
			this.getConfigSysFileResourceRuntime(false).reload();
		}
		
		this.aiFactoryRTScriptBase = null;

		for (ISysAIChatResource iSysAIChatResource : sysAIChatResourceMap.values()) {
			iSysAIChatResource.reload();
		}
		
		// 循环重新加载AI代理
		for (ISysAIChatAgentRuntime iSysAIChatAgentRuntime : sysAIChatAgentRuntimeMap.values()) {
			iSysAIChatAgentRuntime.reload();
		}
		
		for (ISysAIWorkerAgentRuntime iSysAIWorkerAgentRuntime : sysAIWorkerAgentRuntimeMap.values()) {
			iSysAIWorkerAgentRuntime.reload();
		}
		
		for (ISysAIPipelineAgentRuntime iSysAIPipelineAgentRuntime : sysAIPipelineAgentRuntimeMap.values()) {
			iSysAIPipelineAgentRuntime.reload();
		}
		
		
	}

	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}

	protected void onShutdown() throws Exception {

	}

	protected String getLogCat() {
		return LogCats.AIFACTORY;
	}

}
