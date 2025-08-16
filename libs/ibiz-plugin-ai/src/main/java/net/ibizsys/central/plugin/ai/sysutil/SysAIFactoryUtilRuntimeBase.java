package net.ibizsys.central.plugin.ai.sysutil;

import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.plugin.ai.addin.ISysAIFactoryUtilRTAddin;
import net.ibizsys.central.plugin.ai.agent.DefaultAIChatProvider;
import net.ibizsys.central.plugin.ai.agent.EntityAIChatProvider;
import net.ibizsys.central.plugin.ai.agent.IAIChatAgent;
import net.ibizsys.central.plugin.ai.agent.IAIChatProvider;
import net.ibizsys.central.plugin.ai.agent.IAIPipelineAgent;
import net.ibizsys.central.plugin.ai.agent.IAIPipelineProvider;
import net.ibizsys.central.plugin.ai.agent.IAIWorkerAgent;
import net.ibizsys.central.plugin.ai.agent.IAIWorkerProvider;
import net.ibizsys.central.plugin.ai.agent.PSAppDEACModeAIChatProvider;
import net.ibizsys.central.res.ISysFileResourceRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.res.ISysSCMResourceRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.DEMethodDTOType;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDEACMode;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAction;


/**
 * 系统AI工厂功能组件运行时基类
 * @author lionlau
 *
 */
public abstract class SysAIFactoryUtilRuntimeBase extends SysUtilRuntimeBase implements ISysAIFactoryUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysAIFactoryUtilRuntimeBase.class);
	
	/**
	 *  AI 交谈代理代理：默认
	 */
	public final static String AICHATAGENTMODE_DEFAULT = "DEFAULT";
	
	
	/**
	 *  AI 交谈代理代理：APPDEACMODE
	 */
	public final static String AICHATAGENTMODE_PSAPPDEACMODE = "PSAPPDEACMODE";
	
	/**
	 *  AI 交谈代理代理：ENTITY
	 */
	public final static String AICHATAGENTMODE_ENTITY = "ENTITY";
	
	
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysAIFactoryUtilRTAddin.class, "*:" + ADDIN_AICHAT_PREFIX + AICHATAGENTMODE_DEFAULT, DefaultAIChatProvider.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysAIFactoryUtilRTAddin.class, "*:" + ADDIN_AICHAT_PREFIX + AICHATAGENTMODE_PSAPPDEACMODE, PSAppDEACModeAIChatProvider.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysAIFactoryUtilRTAddin.class, "*:" + ADDIN_AICHAT_PREFIX + AICHATAGENTMODE_ENTITY, EntityAIChatProvider.class);
	}
	
	
	@Override
	protected ISysAIFactoryUtilRuntimeContext createModelRuntimeContext() {
		return new SysAIFactoryUtilRuntimeContextBase<ISysAIFactoryUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {
			@Override
			public String getConfigContent(Object data, String strConfigId, boolean bTryMode) throws Throwable {
				return getSelf().getConfigContent(data, strConfigId, bTryMode);
			}
		};
	}
	
	
	private Map<String, IAIPipelineProvider> aiPipelineProviderMap = null;
	private Map<String, IAIWorkerProvider> aiWorkerProviderMap = null;
	private Map<String, IAIChatProvider> aiChatProviderMap = null;
	
//	private Map<String, IAIPipelineAgent> aiPipelineAgentMap = new HashMap<String, IAIPipelineAgent>();
	private Map<String, IAIWorkerAgent> aiWorkerAgentMap = new ConcurrentHashMap<String, IAIWorkerAgent>();
	private Map<String, IAIChatAgent> aiChatAgentMap = new ConcurrentHashMap<String, IAIChatAgent>();
	
	private ISysFileResourceRuntime configSysFileResourceRuntime = null;
	private boolean bConfigFromResource = false;
	
	//private ThreadLocal<String> configPathThreadLocal = new ThreadLocal<String>();
	private String strDefautConfigPath = null;
	
	@Override
	protected void onInstall() throws Exception {
		
		//this.prepareAddinRepo(this.getModelRuntimeContext(), ISysAIFactoryUtilRTAddin.class, null);
		super.onInstall();
	
		this.aiPipelineProviderMap = this.getAddins(IAIPipelineProvider.class, ADDIN_AIPIPELINE_PREFIX);
		this.aiWorkerProviderMap = this.getAddins(IAIWorkerProvider.class, ADDIN_AIWORKER_PREFIX);
		this.aiChatProviderMap = this.getAddins(IAIChatProvider.class, ADDIN_AICHAT_PREFIX);
	}
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();
		
		prepareConfig();
	}

	protected void prepareConfig() throws Exception {

		if(this.getPSSysUtil().getPSSysResource()== null) {
			log.warn(String.format("AI工厂组件[%1$s]未指定配置资源", this.getName()));
			return;
		}
		ISysResourceRuntime iSysResourceRuntime = this.getSystemRuntime().getSysResourceRuntime(this.getPSSysUtil().getPSSysResource());
		if(iSysResourceRuntime instanceof ISysFileResourceRuntime) {
			this.setConfigFromResource(false);
			this.setConfigSysFileResourceRuntime((ISysFileResourceRuntime)iSysResourceRuntime);
		}
	}
	
	
	private SysAIFactoryUtilRuntimeBase getSelf() {
		return this;
	}
	
	@Override
	protected ISysAIFactoryUtilRuntimeContext getModelRuntimeContext() {
		return (ISysAIFactoryUtilRuntimeContext)super.getModelRuntimeContext();
	}
	

	@Override
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(getModelRuntimeContext(), ISysAIFactoryUtilRTAddin.class, String.format("%1$s:",this.getFullUniqueTag()));
	}
	
	@Override
	public IAIPipelineAgent getAIPipelineAgent(Object aiPipelineAgentData) {
		return (IAIPipelineAgent)executeAction("获取AI流水线代理", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				
				Object realRealAIPipelineAgentData = getRealAIPipelineAgentData(aiPipelineAgentData);
				
				String strAIPipelineAgentTag = getAIPipelineAgentTag(realRealAIPipelineAgentData);
				
				ActionSession actionSession = ActionSessionManager.getCurrentSession();
				String strCacheTag = String.format("CACHE_%1$s_%2$s", IAIPipelineAgent.class.getName(), strAIPipelineAgentTag);
				if (actionSession != null) {
					Object item = actionSession.getActionParam(strCacheTag);
					if (item != null) {
						return (IAIPipelineAgent) item;
					}
				}
				
				IAIPipelineAgent iAIPipelineAgent = onGetAIPipelineAgent(realRealAIPipelineAgentData);
				if (actionSession != null) {
					actionSession.setActionParam(strCacheTag, iAIPipelineAgent);
				}
				
				return iAIPipelineAgent;
				
			}
		}, null);
	}
	
	protected Object getRealAIPipelineAgentData(Object aiPipelineAgentData) throws Throwable {
		return aiPipelineAgentData;
	}
	
	protected IAIPipelineAgent onGetAIPipelineAgent(Object aiPipelineAgentData) throws Throwable {
		
		String strAIPipelineAgentMode = this.getAIPipelineAgentMode(aiPipelineAgentData);
		
		IAIPipelineProvider iAIPipelineProvider = this.aiPipelineProviderMap.get(strAIPipelineAgentMode);
		if(iAIPipelineProvider == null) {
			//iAIPipelineProvider = this.aiPipelineProviderMap.get(WORKER_DEFAULT);
			if(iAIPipelineProvider == null) {
				throw new Exception(String.format("AI流水线[%1$s]提供方无效", strAIPipelineAgentMode));
			}
		}
		
		IAIPipelineAgent iAIPipelineAgent = iAIPipelineProvider.createAIPipelineAgent(aiPipelineAgentData);
		iAIPipelineAgent.init(this.getModelRuntimeContext(), aiPipelineAgentData, strAIPipelineAgentMode);
		return iAIPipelineAgent;
	}
	
	protected String getAIPipelineAgentTag(Object aiPipelineAgentData) throws Throwable {
		throw new Exception(String.format("无法从数据[%1$s]计算AI流水线代理标记", aiPipelineAgentData));
	}
	
	protected String getAIPipelineAgentMode(Object aiPipelineAgentData) throws Throwable {
		throw new Exception(String.format("无法从数据[%1$s]计算AI流水线代理模式", aiPipelineAgentData));
	}
	
	
	protected Object getRealAIWorkerAgentData(Object aiWorkerAgentData) throws Throwable {
		return aiWorkerAgentData;
	}

	@Override
	public IAIWorkerAgent getAIWorkerAgent(Object aiWorkerAgentData) {
		return (IAIWorkerAgent)executeAction("获取AI工作者代理", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				
				Object realRealAIWorkerAgentData = getRealAIWorkerAgentData(aiWorkerAgentData);
				
				String strAIWorkerAgentTag = getAIWorkerAgentTag(realRealAIWorkerAgentData);
				
				Object item = aiWorkerAgentMap.get(strAIWorkerAgentTag);
				if (item != null) {
					return (IAIWorkerAgent) item;
				}
				
				IAIWorkerAgent iAIWorkerAgent = onGetAIWorkerAgent(realRealAIWorkerAgentData);
				aiWorkerAgentMap.put(strAIWorkerAgentTag, iAIWorkerAgent);
				
				return iAIWorkerAgent;
				
			}
		}, null);
	}
	
	protected IAIWorkerAgent onGetAIWorkerAgent(Object aiWorkerAgentData) throws Throwable {
		
		String strAIWorkerAgentMode = this.getAIWorkerAgentMode(aiWorkerAgentData);
		
		IAIWorkerProvider iAIWorkerProvider = this.aiWorkerProviderMap.get(strAIWorkerAgentMode);
		if(iAIWorkerProvider == null) {
			//iAIWorkerProvider = this.aiWorkerProviderMap.get(WORKER_DEFAULT);
			if(iAIWorkerProvider == null) {
				throw new Exception(String.format("AI工作者[%1$s]提供方无效", strAIWorkerAgentMode));
			}
		}
		
		IAIWorkerAgent iAIWorkerAgent = iAIWorkerProvider.createAIWorkerAgent(aiWorkerAgentData);
		iAIWorkerAgent.init(this.getModelRuntimeContext(), aiWorkerAgentData, strAIWorkerAgentMode);
		return iAIWorkerAgent;
	}
	
	protected String getAIWorkerAgentMode(Object aiWorkerAgentData) throws Throwable {
		throw new Exception(String.format("无法从数据[%1$s]计算AI工作者代理模式", aiWorkerAgentData));
	}
	

	@Override
	public boolean resetAIWorkerAgent(Object aiWorkerAgentData) {
		return (boolean)executeAction("重置AI工作者代理", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				
				String strAIWorkerAgentTag = getAIWorkerAgentTag(aiWorkerAgentData);
				
				Object item = aiWorkerAgentMap.remove(strAIWorkerAgentTag);
				
				return item!=null;
				
			}
		}, null);
	}

	@Override
	public void resetAIWorkerAgents() {
		this.aiWorkerAgentMap.clear();
	}
	
	protected String getAIWorkerAgentTag(Object aiWorkerAgentData) throws Throwable {
		throw new Exception(String.format("无法从数据[%1$s]计算AI工作者代理标记", aiWorkerAgentData));
	}
	
	
	protected Object getRealAIChatAgentData(Object aiChatAgentData) throws Throwable {
		if(aiChatAgentData instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO)aiChatAgentData;
			if(iEntityDTO.getDEMethodDTORuntime()!=null) {
				return iEntityDTO.getDEMethodDTORuntime();
			}
		}
		return aiChatAgentData;
	}
	
	
	@Override
	public IAIChatAgent getAIChatAgent(Object aiChatAgentData) {
		return (IAIChatAgent)executeAction("获取AI交谈代理", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				
				Object realAIChatAgentData = getRealAIChatAgentData(aiChatAgentData);
				
				String strAIChatAgentTag = getAIChatAgentTag(realAIChatAgentData);
				
				Object item = aiChatAgentMap.get(strAIChatAgentTag);
				if (item != null) {
					return (IAIChatAgent) item;
				}
				
				IAIChatAgent iAIChatAgent = onGetAIChatAgent(realAIChatAgentData);
				aiChatAgentMap.put(strAIChatAgentTag, iAIChatAgent);
				
				return iAIChatAgent;
				
			}
		}, null);
	}

	
	
	protected IAIChatAgent onGetAIChatAgent(Object aiChatAgentData) throws Throwable {
		
		String strAIChatAgentMode = this.getAIChatAgentMode(aiChatAgentData);
		
		IAIChatProvider iAIChatProvider = this.aiChatProviderMap.get(strAIChatAgentMode);
		if(iAIChatProvider == null) {
			//iAIChatProvider = this.aiChatProviderMap.get(WORKER_DEFAULT);
			if(iAIChatProvider == null) {
				throw new Exception(String.format("AI交谈[%1$s]提供方无效", strAIChatAgentMode));
			}
		}
		
		IAIChatAgent iAIChatAgent = iAIChatProvider.createAIChatAgent(aiChatAgentData);
		iAIChatAgent.init(this.getModelRuntimeContext(), aiChatAgentData, strAIChatAgentMode);
		return iAIChatAgent;
	}
	
	@Override
	public boolean resetAIChatAgent(Object aiChatAgentData) {
		
		return (boolean)executeAction("重置AI交谈代理", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				
				String strAIChatAgentTag = getAIChatAgentTag(aiChatAgentData);
				
				Object item = aiChatAgentMap.remove(strAIChatAgentTag);
				
				return item!=null;
				
			}
		}, null);
	}
	
	@Override
	public void resetAIChatAgents() {
		this.aiChatAgentMap.clear();
	}
	
	protected String getAIChatAgentMode(Object aiChatAgentData) throws Throwable {
		if(aiChatAgentData instanceof IPSAppDEACMode) {
			return AICHATAGENTMODE_PSAPPDEACMODE;
		}
		
		if(aiChatAgentData instanceof IDEMethodDTORuntime) {
			IDEMethodDTORuntime iDEMethodDTORuntime = (IDEMethodDTORuntime)aiChatAgentData;
			if(DEMethodDTOType.DEFAULT.value.equals(iDEMethodDTORuntime.getPSDEMethodDTO().getType())) {
				return AICHATAGENTMODE_ENTITY;
			}
		}
		
		if(aiChatAgentData instanceof String) {
			return AICHATAGENTMODE_DEFAULT;
		}
		
		throw new Exception(String.format("无法从数据[%1$s]计算AI交谈代理模式", aiChatAgentData));
	}
	
	
	protected String getAIChatAgentTag(Object aiChatAgentData) throws Throwable {
		if(aiChatAgentData instanceof IPSAppDEACMode) {
			
			IPSAppDEACMode iPSAppDEACMode = (IPSAppDEACMode)aiChatAgentData;
			IPSAppDataEntity iPSAppDataEntity = iPSAppDEACMode.getParentPSModelObject(IPSAppDataEntity.class);
			IPSApplication iPSApplication = iPSAppDataEntity.getParentPSModelObject(IPSApplication.class);
				
			return String.format("%1$s|%2$s|%3$s|%4$s", AICHATAGENTMODE_PSAPPDEACMODE, iPSApplication.getCodeName(), iPSAppDataEntity.getCodeName(), iPSAppDEACMode.getCodeName());
		}
		
		if(aiChatAgentData instanceof IDEMethodDTORuntime) {
			IDEMethodDTORuntime iDEMethodDTORuntime = (IDEMethodDTORuntime)aiChatAgentData;
			if(DEMethodDTOType.DEFAULT.value.equals(iDEMethodDTORuntime.getPSDEMethodDTO().getType())) {
				return String.format("%1$s|%2$s", AICHATAGENTMODE_ENTITY, iDEMethodDTORuntime.getDataEntityRuntime().getFullUniqueTag());
			}
		}

		if(aiChatAgentData instanceof String) {
			return String.format("%1$s|%2$s", AICHATAGENTMODE_DEFAULT, aiChatAgentData);
		}
		
		
		throw new Exception(String.format("无法从数据[%1$s]计算AI交谈代理标记", aiChatAgentData));
	}



	
	@Override
	public ISysFileResourceRuntime getConfigSysFileResourceRuntime(boolean bTryMode) {
		if(this.configSysFileResourceRuntime != null || bTryMode) {
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
	
	protected String getConfigContent(Object data, String strConfigId, boolean bTryMode) throws Throwable {
		String strConfigPath = null;
		ISysFileResourceRuntime configSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(true);
		if(configSysFileResourceRuntime!=null) {
			if(configSysFileResourceRuntime instanceof ISysSCMResourceRuntime) {
				((ISysSCMResourceRuntime)configSysFileResourceRuntime).checkoutIf(data);
			}
			strConfigPath = configSysFileResourceRuntime.getFile(data).getCanonicalPath();
		}
		else {
			strConfigPath = this.getDefautConfigPath();
		}
		
		return this.getConfigContentReal(strConfigPath, strConfigId, bTryMode);
	}
	
	
	
	protected String getConfigContentReal(String strConfigPath,  String strConfigId, boolean bTryMode) throws Throwable {
		
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
	
//	protected String getConfigPath() {
//		return this.configPathThreadLocal.get();
//	}
//
//	protected void setConfigPath(String strConfigPath) {
//		this.configPathThreadLocal.set(strConfigPath);
//	}


	public String getDefautConfigPath() {
		return strDefautConfigPath;
	}

	protected void setDefautConfigPath(String strDefautConfigPath) {
		this.strDefautConfigPath = strDefautConfigPath;
	}
	
	
	@Override
	public void resetAll() {
		executeAction("重置AI工厂", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onResetAll();				
				return null;
			}
		}, null);
	}
	
	protected void onResetAll() throws Throwable{
		this.aiWorkerAgentMap.clear();
		this.aiChatAgentMap.clear();
		ISysFileResourceRuntime configSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(true);
		if(configSysFileResourceRuntime!=null) {
			if(configSysFileResourceRuntime instanceof ISysSCMResourceRuntime) {
				((ISysSCMResourceRuntime)configSysFileResourceRuntime).resetAllCheckoutLog();
			}
		}
	}
}
