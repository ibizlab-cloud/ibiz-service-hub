package net.ibizsys.central.cloud.ai.core.cloudutil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import net.ibizsys.central.cloud.ai.core.addin.IAIAccessAgent;
import net.ibizsys.central.cloud.ai.core.addin.IAIPlatform;
import net.ibizsys.central.cloud.ai.core.addin.ICloudAIUtilRTAddin;
import net.ibizsys.central.cloud.ai.core.addin.IMcpServerAgent;
import net.ibizsys.central.cloud.ai.core.addin.IMcpServerProvider;
import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.AIAccess;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.McpServer;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class CloudAIUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudAIUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudAIUtilRuntimeBase.class);

	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAIUtilRTAddin.class, "AIPLATFORM:OPENAI", "net.ibizsys.central.cloud.ai.core.addin.OpenAIPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAIUtilRTAddin.class, "AIPLATFORM:GPT3", "net.ibizsys.central.cloud.ai.openai.gpt3.addin.GPT3AIPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAIUtilRTAddin.class, "AIPLATFORM:SIMPLE", "net.ibizsys.central.cloud.ai.core.addin.SimpleAIPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAIUtilRTAddin.class, "AIPLATFORM:LANGCHAIN_CHATCHAT", "net.ibizsys.central.cloud.ai.langchain.chatchat.addin.ChatchatAIPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAIUtilRTAddin.class, "AIPLATFORM:BAICHUAN", "net.ibizsys.central.cloud.ai.baichuanai.addin.BaichuanAIPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAIUtilRTAddin.class, "AIPLATFORM:OLLAMA", "net.ibizsys.central.cloud.ai.ollama.addin.OllamaPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAIUtilRTAddin.class, "AIPLATFORM:QWEN", "net.ibizsys.central.cloud.ai.core.addin.QwenPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAIUtilRTAddin.class, "AIPLATFORM:RAGFLOW", "net.ibizsys.central.cloud.ai.core.addin.RAGFlowPlatform");
		
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAIUtilRTAddin.class, "MCPSERVER:DEFAULT", "net.ibizsys.central.cloud.ai.core.addin.DefaultMcpServerProvider");
	}

	private Map<String, IAIAccessAgent> aiAccessAgentMap = new HashMap<String, IAIAccessAgent>();
	private Map<String, IAIPlatform> aiPlatformMap = null;
	private Map<String, IConfigListener> aiAccessConfigListenerMap = new HashMap<String, IConfigListener>();
	
	private Map<String, IMcpServerAgent> mcpServerAgentMap = new HashMap<String, IMcpServerAgent>();
	private Map<String, IMcpServerProvider> mcpServerProviderMap = null;
	private Map<String, IConfigListener> mcpServerConfigListenerMap = new HashMap<String, IConfigListener>();
	
	
	
	private String strCloudAIUtilRuntimeUniqueTag = null;

	private String strDefaultAgent = AIPLATFORM_GPT3;
	private String strSimpleAgent = AIPLATFORM_SIMPLE;
	// public final static String DEFAULTAITYPE= "GPT3";

	

	@Override
	protected String getGlobalConfigId() {
		return CLOUDAIUTIL_CONFIGFOLDER;
	}

	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_AI;
	}
	
	@Override
	protected boolean isEnableReloadSetting() {
		return true;
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}

	@Override
	protected void onInstall() throws Exception {

		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudAIUtilRTAddin.class, null);
		super.onInstall();

		this.strCloudAIUtilRuntimeUniqueTag = KeyValueUtils.genUniqueId(ICloudAIUtilRuntime.class.getCanonicalName(), ICloudUtilRuntime.CLOUDSERVICE_AI);
		this.aiPlatformMap = this.getAddins(IAIPlatform.class, ADDIN_AIPLATFORM_PREFIX);
		this.mcpServerProviderMap = this.getAddins(IMcpServerProvider.class, ADDIN_MCPSERVER_PREFIX);
	}

	@Override
	protected ICloudAIUtilRuntimeContext createModelRuntimeContext() {
		return new CloudAIUtilRuntimeContextBase<ICloudAIUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}
	
	private CloudAIUtilRuntimeBase getSelf() {
		return this;
	}
	
	@Override
	protected ICloudAIUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudAIUtilRuntimeContext)super.getModelRuntimeContext();
	}
	

	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {

		super.onReloadSetting(bFirst);
		
		if(!bFirst) {
			if(true) {
				List<IAIAccessAgent> list = new ArrayList<IAIAccessAgent>();
				synchronized (this.aiAccessAgentMap) {
					list.addAll(this.aiAccessAgentMap.values());
					this.aiAccessAgentMap.clear();
				}
				
				if(!ObjectUtils.isEmpty(list)) {
					for(IAIAccessAgent iAIAccessAgent : list) {
						try {
							iAIAccessAgent.stop();
						}
						catch (Exception ex) {
							log.error(String.format("停止AI应用代理[%1$s]发生异常，%2$s", iAIAccessAgent.getName(), ex.getMessage()), ex);
						}
					}
				}
			}
			
			if(true) {
				List<IMcpServerAgent> list = new ArrayList<IMcpServerAgent>();
				synchronized (this.mcpServerAgentMap) {
					list.addAll(this.mcpServerAgentMap.values());
					this.mcpServerAgentMap.clear();
				}
				
				if(!ObjectUtils.isEmpty(list)) {
					for(IMcpServerAgent iMcpServerAgent : list) {
						try {
							iMcpServerAgent.stop();
						}
						catch (Exception ex) {
							log.error(String.format("停止McpServer代理[%1$s]发生异常，%2$s", iMcpServerAgent.getName(), ex.getMessage()), ex);
						}
					}
				}
			}
		}

		String strDefaultAgent = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".defaultagent", AIPLATFORM_GPT3);
		if (StringUtils.hasLength(strDefaultAgent)) {
			this.setDefaultAgent(strDefaultAgent);
		}

		String strSimpleAgent = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".simpleagent", AIPLATFORM_SIMPLE);
		if (StringUtils.hasLength(strSimpleAgent)) {
			this.setSimpleAgent(strSimpleAgent);
		}

	}

	@Override
	public ChatCompletionResult chatCompletion(String type, ChatCompletionRequest chatCompletionRequest) {
		return (ChatCompletionResult) this.executeAction("交谈补全操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				chatCompletionRequest.setStreaming(0);
				return onChatCompletion(type, chatCompletionRequest);
			}
		}, null);
	}

	protected ChatCompletionResult onChatCompletion(String type, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		IAIAccessAgent iAIAccessAgent = this.getAIAccessAgent(type);
		return iAIAccessAgent.chatCompletion(chatCompletionRequest);
	}

	@Override
	public PortalAsyncAction asyncChatCompletion(String type, ChatCompletionRequest chatCompletionRequest) {
		return (PortalAsyncAction) this.executeAction("异步交谈补全操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				chatCompletionRequest.setStreaming(1);
				return onAsyncChatCompletion(type, chatCompletionRequest);
			}
		}, null);
	}

	protected PortalAsyncAction onAsyncChatCompletion(String type, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		
		Map<String, Object> actionTagMap = new HashMap<String, Object>();
		actionTagMap.put(PortalAsyncAction.FIELD_ACTIONTYPE, "ASYNCCHATCOMPLETION");

		
		return (PortalAsyncAction) this.getSystemRuntime().asyncExecute(new INamedAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onChatCompletion(type, chatCompletionRequest);
			}

			@Override
			public String getName() {
				return "异步交谈补全操作";
			}
		}, null, actionTagMap);
	}
	
	@Override
	public SseEmitter sseChatCompletion(String type, ChatCompletionRequest chatCompletionRequest) {
		return (SseEmitter) this.executeAction("异步交谈补全操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				chatCompletionRequest.setStreaming(1);
				return onSseChatCompletion(type, chatCompletionRequest);
			}
		}, null);
	}

	protected SseEmitter onSseChatCompletion(String type, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		
		Map<String, Object> actionTagMap = new HashMap<String, Object>();
		actionTagMap.put(PortalAsyncAction.FIELD_ACTIONTYPE, "SSECHATCOMPLETION");
		actionTagMap.put(PortalAsyncAction.FIELD_FULLTOPICTAG, "");
		
		return (SseEmitter) this.getSystemRuntime().sseExecute(new INamedAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onChatCompletion(type, chatCompletionRequest);
			}

			@Override
			public String getName() {
				return "异步交谈补全操作";
			}
		}, null, actionTagMap, 0l);
	}
	

	@Override
	public CompletionResult completion(String type, CompletionRequest completionRequest) {
		return (CompletionResult) this.executeAction("补全操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				completionRequest.setStreaming(0);
				return onCompletion(type, completionRequest);
			}
		}, null);
	}

	protected CompletionResult onCompletion(String type, CompletionRequest CompletionRequest) throws Throwable {
		IAIAccessAgent iAIAccessAgent = this.getAIAccessAgent(type);
		return iAIAccessAgent.completion(CompletionRequest);
	}

	@Override
	public PortalAsyncAction asyncCompletion(String type, CompletionRequest completionRequest) {
		return (PortalAsyncAction) this.executeAction("异步补全操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				completionRequest.setStreaming(1);
				return onAsyncCompletion(type, completionRequest);
			}
		}, null);
	}

	protected PortalAsyncAction onAsyncCompletion(String type, CompletionRequest CompletionRequest) throws Throwable {
		return (PortalAsyncAction) this.getSystemRuntime().asyncExecute(new INamedAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCompletion(type, CompletionRequest);
			}

			@Override
			public String getName() {
				return "异步补全操作";
			}
		}, null, null);
	}
	
	@Override
	public SseEmitter sseCompletion(String type, CompletionRequest completionRequest) {
		return (SseEmitter) this.executeAction("异步补全操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				completionRequest.setStreaming(1);
				return onSseCompletion(type, completionRequest);
			}
		}, null);
	}

	protected SseEmitter onSseCompletion(String type, CompletionRequest CompletionRequest) throws Throwable {
		return (SseEmitter) this.getSystemRuntime().sseExecute(new INamedAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCompletion(type, CompletionRequest);
			}

			@Override
			public String getName() {
				return "异步补全操作";
			}
		}, null, null, 0l);
	}
	
	
	@Override
	public EmbeddingResult embedding(String type, EmbeddingRequest embeddingRequest) {
		return (EmbeddingResult) this.executeAction("Embedding操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onEmbedding(type, embeddingRequest);
			}
		}, null);
	}

	protected EmbeddingResult onEmbedding(String type, EmbeddingRequest embeddingRequest) throws Throwable {
		IAIAccessAgent iAIAccessAgent = this.getAIAccessAgent(type);
		return iAIAccessAgent.embedding(embeddingRequest);
	}
	

	protected IAIAccessAgent getAIAccessAgent(String strAIAccessId) throws Throwable {

		if (AIPLATFORM_DEFAULT.equalsIgnoreCase(strAIAccessId)) {
			strAIAccessId = this.getDefaultAgent();
		} else if (AIPLATFORM_SIMPLE.equalsIgnoreCase(strAIAccessId)) {
			strAIAccessId = this.getSimpleAgent();
		} else {
			strAIAccessId = strAIAccessId.toUpperCase();
		}

		IAIAccessAgent iAIAccessAgent = this.aiAccessAgentMap.get(strAIAccessId);
		if (iAIAccessAgent != null) {
			return iAIAccessAgent;
		}

		AIAccess aiAccess = getAIAccess(strAIAccessId);
		IAIPlatform iAIPlatform = getAIPlatform(aiAccess.getAIType().toUpperCase());
		return this.onGetAIAccessAgent(iAIPlatform, aiAccess);
	}

	protected synchronized IAIAccessAgent onGetAIAccessAgent(IAIPlatform iAIPlatform, AIAccess aiAccess) throws Throwable {

		synchronized (this.aiAccessAgentMap) {
			IAIAccessAgent iAIAccessAgent = this.aiAccessAgentMap.get(aiAccess.getId());
			if (iAIAccessAgent != null) {
				return iAIAccessAgent;
			}

			iAIAccessAgent = iAIPlatform.createAIAccessAgent(aiAccess);
			iAIAccessAgent.init(this.getModelRuntimeContext(), aiAccess);
			iAIAccessAgent.start();
			this.aiAccessAgentMap.put(aiAccess.getId(), iAIAccessAgent);
			return iAIAccessAgent;
		}
		
	}
	
	protected void resetAIAccessAgent(String strAIAccessId) {
		IAIAccessAgent iAIAccessAgent = null;
		synchronized (this.aiAccessAgentMap) {
			iAIAccessAgent = this.aiAccessAgentMap.remove(strAIAccessId);
		}
		if(iAIAccessAgent!=null) {
			try {
				iAIAccessAgent.stop();
			}
			catch (Exception ex) {
				log.error(String.format("停止AI应用代理[%1$s]发生异常，%2$s", iAIAccessAgent.getName(), ex.getMessage()), ex);
			}
		}
	}

	protected IAIPlatform getAIPlatform(String strAIPlatformType) throws Throwable {

		IAIPlatform iAIPlatform = this.aiPlatformMap.get(strAIPlatformType);
		if (iAIPlatform != null) {
			return iAIPlatform;
		}

		throw new Exception(String.format("无法获取指定AI平台对象[%1$s]", strAIPlatformType));
	}

	public AIAccess getAIAccess(String strAIAccessId) {
		AIAccess aiAccess = new AIAccess();

		Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".agent." + strAIAccessId.toLowerCase(), null);
		if (ObjectUtils.isEmpty(params)) {
			// 尝试从Cloud获取
			String strConfigId = String.format("%1$s-agent-%2$s", getCloudConfigId(), strAIAccessId.toLowerCase());
			String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
			if (StringUtils.hasLength(strConfig)) {
				ConfigEntity configEntity = new ConfigEntity(strConfig);
				params = configEntity.any();
			}
			else {
				//没有配置，尝试获取默认代理的配置
				String strConfigId2 = String.format("%1$s-agent-%2$s", getCloudConfigId(), this.getDefaultAgent().toLowerCase());
				String strConfig2 = ServiceHub.getInstance().getConfig(strConfigId2);
				if (StringUtils.hasLength(strConfig2)) {
					ConfigEntity configEntity = new ConfigEntity(strConfig2);
					params = configEntity.any();
				}
			}
			
			
			synchronized (this.aiAccessConfigListenerMap) {
				if(!this.aiAccessConfigListenerMap.containsKey(strConfigId)) {
					IConfigListener iConfigListener = new IConfigListener() {
						@Override
						public void receiveConfigInfo(String configInfo) {
							resetAIAccessAgent(strAIAccessId);
						}
						
						@Override
						public Executor getExecutor() {
							return null;
						}
					};
					ServiceHub.getInstance().addConfigListener(strConfigId, iConfigListener);
					this.aiAccessConfigListenerMap.put(strConfigId, iConfigListener);
				}
			}
		}

		if (!ObjectUtils.isEmpty(params)) {
			aiAccess.putAll(params);
		}

		aiAccess.setId(strAIAccessId);
		if(!StringUtils.hasLength(aiAccess.getAIType())) {
			aiAccess.setAIType(strAIAccessId);
		}

		return aiAccess;
	}

	protected String getDefaultAgent() {
		return strDefaultAgent;
	}

	protected void setDefaultAgent(String strDefaultAgent) {
		this.strDefaultAgent = strDefaultAgent;
	}

	protected String getSimpleAgent() {
		return strSimpleAgent;
	}

	protected void setSimpleAgent(String strSimpleAgent) {
		this.strSimpleAgent = strSimpleAgent;
	}
	
	
	protected IMcpServerAgent getMcpServerAgent(String strMcpServerId) throws Throwable {

		strMcpServerId = strMcpServerId.toUpperCase();

		IMcpServerAgent iMcpServerAgent = this.mcpServerAgentMap.get(strMcpServerId);
		if (iMcpServerAgent != null) {
			return iMcpServerAgent;
		}

		McpServer mcpServer = getMcpServer(strMcpServerId);
		IMcpServerProvider iMcpServerProvider = getMcpServerProvider(mcpServer.getType().toUpperCase());
		return this.onGetMcpServerAgent(iMcpServerProvider, mcpServer);
	}

	protected synchronized IMcpServerAgent onGetMcpServerAgent(IMcpServerProvider iMcpServerProvider, McpServer mcpServer) throws Throwable {

		synchronized (this.mcpServerAgentMap) {
			IMcpServerAgent iMcpServerAgent = this.mcpServerAgentMap.get(mcpServer.getId());
			if (iMcpServerAgent != null) {
				return iMcpServerAgent;
			}

			iMcpServerAgent = iMcpServerProvider.createMcpServerAgent(mcpServer);
			iMcpServerAgent.init(this.getModelRuntimeContext(), mcpServer);
			iMcpServerAgent.start();
			this.mcpServerAgentMap.put(mcpServer.getId(), iMcpServerAgent);
			return iMcpServerAgent;
		}
		
	}
	
	protected void resetMcpServerAgent(String strMcpServerId) {
		IMcpServerAgent iMcpServerAgent = null;
		synchronized (this.mcpServerAgentMap) {
			iMcpServerAgent = this.mcpServerAgentMap.remove(strMcpServerId);
		}
		if(iMcpServerAgent!=null) {
			try {
				iMcpServerAgent.stop();
			}
			catch (Exception ex) {
				log.error(String.format("停止McpServer代理[%1$s]发生异常，%2$s", iMcpServerAgent.getName(), ex.getMessage()), ex);
			}
		}
	}

	protected IMcpServerProvider getMcpServerProvider(String strMcpServerProviderType) throws Throwable {

		IMcpServerProvider iMcpServerProvider = this.mcpServerProviderMap.get(strMcpServerProviderType);
		if (iMcpServerProvider != null) {
			return iMcpServerProvider;
		}

		throw new Exception(String.format("无法获取指定McpServer提供器对象[%1$s]", strMcpServerProviderType));
	}

	public McpServer getMcpServer(String strMcpServerId) {
		McpServer mcpServer = new McpServer();

		Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".mcpserver." + strMcpServerId.toLowerCase(), null);
		if (ObjectUtils.isEmpty(params)) {
			// 尝试从Cloud获取
			String strConfigId = String.format("%1$s-mcpserver-%2$s", getCloudConfigId(), strMcpServerId.toLowerCase());
			String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
			if (StringUtils.hasLength(strConfig)) {
				ConfigEntity configEntity = new ConfigEntity(strConfig);
				params = configEntity.any();
			}
			
			synchronized (this.mcpServerConfigListenerMap) {
				if(!this.mcpServerConfigListenerMap.containsKey(strConfigId)) {
					IConfigListener iConfigListener = new IConfigListener() {
						@Override
						public void receiveConfigInfo(String configInfo) {
							resetMcpServerAgent(strMcpServerId);
						}
						
						@Override
						public Executor getExecutor() {
							return null;
						}
					};
					ServiceHub.getInstance().addConfigListener(strConfigId, iConfigListener);
					this.mcpServerConfigListenerMap.put(strConfigId, iConfigListener);
				}
			}
		}

		if (!ObjectUtils.isEmpty(params)) {
			mcpServer.putAll(params);
		}

		mcpServer.setId(strMcpServerId);
		if(!StringUtils.hasLength(mcpServer.getType())) {
			mcpServer.setType(MCPSERVER_DEFAULT);
		}

		return mcpServer;
	}
	

	protected String getCloudAIUtilRuntimeUniqueTag() {
		return this.strCloudAIUtilRuntimeUniqueTag;
	}

}
