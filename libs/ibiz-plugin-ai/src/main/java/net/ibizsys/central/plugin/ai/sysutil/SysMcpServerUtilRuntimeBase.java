package net.ibizsys.central.plugin.ai.sysutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.plugin.ai.addin.IMcpServerToolProvider;
import net.ibizsys.central.plugin.ai.addin.IMcpServerTransportAgent;
import net.ibizsys.central.plugin.ai.addin.IMcpServerTransportProvider;
import net.ibizsys.central.plugin.ai.mcp.server.McpAsyncServer;
import net.ibizsys.central.plugin.ai.mcp.server.McpServer;
import net.ibizsys.central.plugin.ai.mcp.server.McpServerFeatures;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.ServerCapabilities;
import net.ibizsys.central.plugin.ai.sysutil.addin.DefaultMcpServerToolProvider;
import net.ibizsys.central.plugin.ai.sysutil.addin.HttpSseMcpServerTransportProvider;
import net.ibizsys.central.plugin.ai.sysutil.addin.ISysMcpServerUtilRTAddin;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.IAction;


/**
 * 系统Mcp服务器功能组件运行时基类
 * @author lionlau
 *
 */
public abstract class SysMcpServerUtilRuntimeBase extends SysUtilRuntimeBase implements ISysMcpServerUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysMcpServerUtilRuntimeBase.class);
	//private static final Logger logger = LoggerFactory.getLogger(SysMcpServerUtilRuntimeBase.class);
	
	
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysMcpServerUtilRTAddin.class, "*:" + ADDIN_TRANSPORT_PREFIX + TRANSPORT_HTTP_SSE, HttpSseMcpServerTransportProvider.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysMcpServerUtilRTAddin.class, "*:" + ADDIN_TOOL_PREFIX + TOOL_DEFAULT, DefaultMcpServerToolProvider.class);
	}
	
	
	@Override
	protected ISysMcpServerUtilRuntimeContext createModelRuntimeContext() {
		return new SysMcpServerUtilRuntimeContextBase<ISysMcpServerUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {

			@Override
			public String getBaseUrl() {
				return getSelf().getBaseUrl();
			}
			
		};
	}
	
	
	private Map<String, IMcpServerTransportProvider> mcpServerTransportProviderMap = null;
	
	private Map<String, IMcpServerTransportAgent> mcpServerTransportAgentMap = new ConcurrentHashMap<String, IMcpServerTransportAgent>();
	private Map<String, Object> mcpServerMap = new ConcurrentHashMap<String, Object>();
	
	private Map<String, IMcpServerToolProvider> mcpServerToolProviderMap = null;
	
	private Map<String, List<IMcpServerToolProvider>> mcpServerToolProviderMap2 = new HashMap<String, List<IMcpServerToolProvider>>();
	
	//private final McpSchema.ServerCapabilities serverCapabilities;
	
	private String strBaseUrl = null;
	
	private List<McpServerFeatures.AsyncToolSpecification> asyncToolSpecificationList = null;

	
	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		
		this.strBaseUrl = this.getSystemRuntimeSetting().getParam(this.getConfigFolder()+".baseurl", this.getBaseUrl());
		if(!StringUtils.hasLength(this.getBaseUrl()) ) {
			this.strBaseUrl = String.format("http://%1$s:%2$s/%3$s/mcp", ServiceHub.getInstance().getIPAddress(), ServiceHub.getInstance().getPort(), this.getSystemRuntime().getServiceId());
		}
		super.onPrepareDefaultSetting();
	}
	
	protected String getBaseUrl() {
		return this.strBaseUrl;
	}
	
	
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();
		
		prepareConfig();
	}
	
	@Override
	protected void onInstall() throws Exception {
		
		super.onInstall();
	
		this.mcpServerTransportProviderMap = this.getAddins(IMcpServerTransportProvider.class, ADDIN_TRANSPORT_PREFIX);
		this.mcpServerToolProviderMap = this.getAddins(IMcpServerToolProvider.class, ADDIN_TOOL_PREFIX);
	}
	
	@Override
	protected void onUninstall() throws Throwable {
		
		if(!ObjectUtils.isEmpty(this.mcpServerToolProviderMap)) {
			this.mcpServerToolProviderMap.clear();
		}
		
		if(!ObjectUtils.isEmpty(this.mcpServerToolProviderMap2)) {
			this.mcpServerToolProviderMap2.clear();
		}
		
		this.resetTransportAgents();
		
		super.onUninstall();
	}

	protected void prepareConfig() throws Exception {

//		if(this.getPSSysUtil().getPSSysResource()== null) {
//			log.warn(String.format("AI工厂组件[%1$s]未指定配置资源", this.getName()));
//			return;
//		}
//		ISysResourceRuntime iSysResourceRuntime = this.getSystemRuntime().getSysResourceRuntime(this.getPSSysUtil().getPSSysResource());
//		if(iSysResourceRuntime instanceof ISysFileResourceRuntime) {
//			this.setConfigFromResource(false);
//			this.setConfigSysFileResourceRuntime((ISysFileResourceRuntime)iSysResourceRuntime);
//		}
	}
	
	
	private SysMcpServerUtilRuntimeBase getSelf() {
		return this;
	}
	
	@Override
	protected ISysMcpServerUtilRuntimeContext getModelRuntimeContext() {
		return (ISysMcpServerUtilRuntimeContext)super.getModelRuntimeContext();
	}
	

	@Override
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(getModelRuntimeContext(), ISysMcpServerUtilRTAddin.class, String.format("%1$s:",this.getFullUniqueTag()));
	}
	
	
	@Override
	public IMcpServerTransportAgent getTransportAgent(String strType, boolean bTryMode) {
		Assert.hasLength(strType, "传入传输类型无效");
		String strType2 = strType.toUpperCase();
		return (IMcpServerTransportAgent)executeAction("获取传输代理", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				
				Object item = mcpServerTransportAgentMap.get(strType2);
				if (item != null) {
					return (IMcpServerTransportAgent) item;
				}
				
				IMcpServerTransportAgent iTransportAgent = onGetTransportAgent(strType2, bTryMode);
				if(iTransportAgent != null)  {
					mcpServerTransportAgentMap.put(strType2, iTransportAgent);
				}
				return iTransportAgent;
				
			}
		}, null);
	}

	
	
	protected IMcpServerTransportAgent onGetTransportAgent(String strType, boolean bTryMode) throws Throwable {
		
		IMcpServerTransportProvider iMcpServerTransportProvider = this.mcpServerTransportProviderMap.get(strType);
		if(iMcpServerTransportProvider == null) {
			if(bTryMode) {
				return null;
			}
			throw new Exception(String.format("传输代理[%1$s]提供方无效", strType));
		}
		
		IMcpServerTransportAgent iTransportAgent = iMcpServerTransportProvider.createMcpServerTransportAgent(strType);
		iTransportAgent.init(this.getModelRuntimeContext(), strType);
		iTransportAgent.start();
		this.prepareTransportAgent(iTransportAgent);
		return iTransportAgent;
	}
	
	protected void prepareTransportAgent(IMcpServerTransportAgent iTransportAgent) throws Throwable {
		
//		Map<String, McpRequestHandler<?>> requestHandlers = prepareRequestHandlers();
//		Map<String, McpNotificationHandler> notificationHandlers = prepareNotificationHandlers(features);
//		
//		iTransportAgent.setSessionFactory(transport -> new McpServerSession(UUID.randomUUID().toString(),
//				requestTimeout, transport, this::asyncInitializeRequestHandler, requestHandlers, notificationHandlers));
		McpAsyncServer asyncServer = McpServer.async(iTransportAgent)
			    .serverInfo("my-server", "1.0.0")
			    .capabilities(ServerCapabilities.builder()
			        .resources(false, true)     // Enable resource support
			        .tools(true)                // Enable tool support
			        .prompts(true)              // Enable prompt support
			        .logging()                  // Enable logging support
			        .completions()              // Enable completions support
			        .build())
			    .build();
		
		this.mcpServerMap.put(iTransportAgent.getType(), asyncServer);
		
//		String aa = "\"properties\": {\r\n" + 
//				"          \"location\": {\r\n" + 
//				"            \"type\": \"string\",\r\n" + 
//				"            \"description\": \"The location to get the temperature for, in the format \\\"City, State, Country\\\".\"\r\n" + 
//				"          },\r\n" + 
//				"          \"unit\": {\r\n" + 
//				"            \"type\": \"string\",\r\n" + 
//				"            \"enum\": [\r\n" + 
//				"              \"celsius\",\r\n" + 
//				"              \"fahrenheit\"\r\n" + 
//				"            ],\r\n" + 
//				"            \"description\": \"The unit to return the temperature in. Defaults to \\\"celsius\\\".\"\r\n" + 
//				"          }\r\n" + 
//				"        }\r\n";
//		// 保持原有 JSON Schema 定义不变
//		String schema = "{\n" +
//	               "  \"type\": \"object\",\n" +
//	               "  \"id\": \"tool_get_current_temperature\",\n" +
//	               aa +
//	               "}";
//
//		// 使用 JDK8 的 CompletableFuture 实现异步工具
//		
//
//		// 3. 构建AsyncToolSpecification（按三参数构造函数规范）
//		McpServerFeatures.AsyncToolSpecification asyncToolSpecification = new McpServerFeatures.AsyncToolSpecification(
//		    new Tool("get_current_temperature", "Get current temperature at a location.", schema),  // 工具定义
//		    
//		    // 核心异步实现（call参数）
//		    (exchange, arguments) -> {
//		    	String location = arguments.get("location").toString();
//	            String unit = arguments.get("unit").toString();
//	            Object result = "零下20摄氏度";
//		    	return Mono.just(new CallToolResult(Arrays.asList(new TextContent(result.toString())), false));
//
//		    }
//		);
		List<McpServerFeatures.AsyncToolSpecification> list = this.getAsyncToolSpecifications();
		if(!ObjectUtils.isEmpty(list)) {
			for(McpServerFeatures.AsyncToolSpecification asyncToolSpecification : list) {
				asyncServer.addTool(asyncToolSpecification).subscribe();
			}
		}
	}
	
	protected List<McpServerFeatures.AsyncToolSpecification> getAsyncToolSpecifications() {
		if(this.asyncToolSpecificationList == null ) {
			Map<String, IMcpServerToolProvider> map = new LinkedHashMap<String, IMcpServerToolProvider>();
			for(String key : this.mcpServerToolProviderMap2.keySet()) {
				List<IMcpServerToolProvider> list = this.mcpServerToolProviderMap2.get(key);
				if(ObjectUtils.isEmpty(list)) {
					continue;
				}
				map.put(key, list.get(0));
			}
			
			for(String key : this.mcpServerToolProviderMap.keySet()) {
				if(map.containsKey(key)) {
					continue;
				}
				map.put(key, this.mcpServerToolProviderMap.get(key));
			}
			
			List<McpServerFeatures.AsyncToolSpecification> allList = new ArrayList<McpServerFeatures.AsyncToolSpecification>();
			for(IMcpServerToolProvider iMcpServerToolProvider : map.values()) {
				List<McpServerFeatures.AsyncToolSpecification> list = iMcpServerToolProvider.getAsyncToolSpecifications();
				if(ObjectUtils.isEmpty(list)) {
					continue;
				}
				allList.addAll(list);
			}
			if(this.asyncToolSpecificationList == null) {
				this.asyncToolSpecificationList = allList;
			}
		}
		return this.asyncToolSpecificationList;
	}
	
	protected void resetAsyncToolSpecifications() {
		this.asyncToolSpecificationList = null;
	}
	
	protected void destoryTransportAgent(IMcpServerTransportAgent iTransportAgent) throws Throwable {
		Object server = this.mcpServerMap.get(iTransportAgent.getType());
		if(server instanceof McpAsyncServer) {
			((McpAsyncServer)server).close();
			return;
		}
	}
	
	@Override
	public boolean resetTransportAgent(String strType) {
		Assert.hasLength(strType, "传入传输类型无效");
		String strType2 = strType.toUpperCase();
		return (boolean)executeAction("重置传输代理", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				Object item = mcpServerTransportAgentMap.remove(strType2);
				if(item instanceof IMcpServerTransportAgent) {
					try {
						destoryTransportAgent((IMcpServerTransportAgent)item);
					}
					catch (Throwable ex) {
						log.error(ex);
					}
					try {
						((IMcpServerTransportAgent)item).stop();
					}
					catch (Throwable ex) {
						log.error(ex);
					}
					
				}
				return item!=null;
			}
		}, null);
	}
	
	@Override
	public void resetTransportAgents() {
		Collection<IMcpServerTransportAgent> agents = Collections.unmodifiableCollection(this.mcpServerTransportAgentMap.values());
		this.mcpServerTransportAgentMap.clear();
		if(!ObjectUtils.isEmpty(agents)) {
			for(IMcpServerTransportAgent iMcpServerTransportAgent : agents) {
				try {
					destoryTransportAgent(iMcpServerTransportAgent);
				}
				catch (Throwable ex) {
					log.error(ex);
				}
				try {
					iMcpServerTransportAgent.stop();
				}
				catch (Throwable ex) {
					log.error(ex);
				}
			}
		}
	}
	
	
	@Override
	public boolean containsMcpServerToolProvider(String strToolProviderName) {
		Assert.hasLength(strToolProviderName, "未传入工具提供器名称");
		strToolProviderName = strToolProviderName.toUpperCase();
		List<IMcpServerToolProvider> list = this.mcpServerToolProviderMap2.get(strToolProviderName);
		if(!ObjectUtils.isEmpty(list)) {
			return true;
		}
		
		IMcpServerToolProvider iMcpServerTool = this.mcpServerToolProviderMap.get(strToolProviderName);
		if(iMcpServerTool != null) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public void registerMcpServerToolProvider(String strToolProviderName, IMcpServerToolProvider iMcpServerTool) {
		Assert.hasLength(strToolProviderName, "未传入工具提供器名称");
		Assert.notNull(iMcpServerTool, "未传入工具提供器对象");
		strToolProviderName = strToolProviderName.toUpperCase();
		synchronized (this.mcpServerToolProviderMap2) {
			List<IMcpServerToolProvider> last = this.mcpServerToolProviderMap2.get(strToolProviderName);
			List<IMcpServerToolProvider> list = new ArrayList<IMcpServerToolProvider>();
			if(last != null) {
				list.addAll(last);
			}
			if(!list.contains(iMcpServerTool)) {
				list.add(iMcpServerTool);
				Collections.sort(list, new Comparator<IMcpServerToolProvider>() {
					@Override
					public int compare(IMcpServerToolProvider o1, IMcpServerToolProvider o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
				});
			}
			this.mcpServerToolProviderMap2.put(strToolProviderName, list);
			resetAsyncToolSpecifications();
		}
	}

	@Override
	public boolean unregisterMcpServerToolProvider(String strToolProviderName, IMcpServerToolProvider iMcpServerTool) {
		Assert.hasLength(strToolProviderName, "未传入工具提供器名称");
		Assert.notNull(iMcpServerTool, "未传入工具提供器对象");
		strToolProviderName = strToolProviderName.toUpperCase();
		synchronized (this.mcpServerToolProviderMap2) {
			List<IMcpServerToolProvider> last = this.mcpServerToolProviderMap2.get(strToolProviderName);
			List<IMcpServerToolProvider> list = new ArrayList<IMcpServerToolProvider>();
			if(last != null) {
				list.addAll(last);
			}
			if(list.contains(iMcpServerTool)) {
				list.remove(iMcpServerTool);
				this.mcpServerToolProviderMap2.put(strToolProviderName, list);
				resetAsyncToolSpecifications();
				return true;
			}
			return false;			
		}
	}
}
