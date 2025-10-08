package net.ibizsys.central.cloud.ai.core.addin;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.commons.logging.LogFactory;
import org.apache.hc.client5.http.impl.async.HttpAsyncClientBuilder;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.message.BasicHeader;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.modelcontextprotocol.client.McpAsyncClient;
import io.modelcontextprotocol.client.McpClient;
import io.modelcontextprotocol.spec.McpClientTransport;
import io.modelcontextprotocol.spec.McpSchema.CallToolResult;
import io.modelcontextprotocol.spec.McpSchema.ClientCapabilities;
import io.modelcontextprotocol.spec.McpSchema.ListToolsResult;
import io.modelcontextprotocol.spec.McpSchema.TextContent;
import io.modelcontextprotocol.spec.McpSchema.Tool;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatFunction;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.plugin.ai.addin.IHttpMcpServerTransportAgent;
import net.ibizsys.central.plugin.ai.mcp.client.transport.HttpClientSseClientTransport;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.CallToolRequest;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import reactor.core.publisher.Mono;

public abstract class DefaultMcpServerAgentBase extends McpServerAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DefaultMcpServerAgentBase.class);
	private McpClientTransport mcpClientTransport = null;
	private McpAsyncClient mcpAsyncClient = null;
	private List<ChatTool> chatToolList = Collections.emptyList();

	@Override
	protected void onInit() throws Exception {
		super.onInit();

	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.MCPSERVER_DEFAULT;
	}

	protected Duration getRequestTimeout() {
		return Duration.ofSeconds(30);
	}

	protected Duration getInitializationTimeout() {
		return Duration.ofSeconds(20);
	}
	
	protected synchronized McpClientTransport createMcpTransport() {
		if (this.mcpClientTransport == null) {
			URI baseUri = URI.create(this.getAgentData().getServiceUrl());
			URI parentUri2 = baseUri.resolve(".").normalize();
			HttpAsyncClientBuilder clientBuilder = HttpAsyncClientBuilder.create();
			Map<String, Object> headers = this.getAgentData().getHeaders();
			List<Header> headerList = new ArrayList<Header>();
			if(!ObjectUtils.isEmpty(headers)) {
				for(java.util.Map.Entry<String, Object> entry : headers.entrySet()) {
					headerList.add(new BasicHeader(entry.getKey(), entry.getValue(), true));
				}
			}
			
			if(StringUtils.hasLength(this.getAgentData().getAccessToken())) {
				headerList.add(new BasicHeader("Authorization", String.format("Bearer %1$s", this.getAgentData().getAccessToken(), true)));
			}
			clientBuilder.setDefaultHeaders(headerList);
			
			this.mcpClientTransport = new HttpClientSseClientTransport(clientBuilder, parentUri2.toString(), new ObjectMapper());
		}
		return this.mcpClientTransport;
	}

	protected McpAsyncClient client(McpClientTransport transport) {
		return client(transport, Function.identity());
	}

	protected synchronized McpAsyncClient client(McpClientTransport transport, Function<McpClient.AsyncSpec, McpClient.AsyncSpec> customizer) {
		if (this.mcpAsyncClient == null) {
			AtomicReference<McpAsyncClient> client = new AtomicReference<>();

			McpClient.AsyncSpec builder = McpClient.async(transport).requestTimeout(getRequestTimeout()).initializationTimeout(getInitializationTimeout()).capabilities(ClientCapabilities.builder().roots(true).build());
			builder = customizer.apply(builder);
			client.set(builder.build());

			this.mcpAsyncClient = client.get();
		}
		return this.mcpAsyncClient;
	}

	protected void withClient(McpClientTransport transport, Consumer<McpAsyncClient> c) {
		withClient(transport, Function.identity(), c);
	}

	protected void withClient(McpClientTransport transport, Function<McpClient.AsyncSpec, McpClient.AsyncSpec> customizer, Consumer<McpAsyncClient> c) {
		try {
			McpAsyncClient client = client(transport, customizer);
			c.accept(client);
		} catch (Throwable ex) {
			log.error("请求服务器发生异常", ex);
			this.resetClient();
		}
//		finally {
//			this.resetClient();
//		}
	}

	@Override
	protected void onStart() throws Exception {
		super.onStart();
	}

	@Override
	public void start() throws Exception {
		super.start();
		runRefreshTimer(false, true);
	}

	@Override
	protected void onStop() throws Exception {
		resetClient();
		super.onStop();
	}

	protected synchronized void resetClient() {
		try {
			if (this.mcpClientTransport != null) {
				this.mcpClientTransport.close();
				this.mcpClientTransport = null;
			}

		} catch (Exception ex) {
			log.error("关闭传输对象发生异常", ex);
		}

		try {
			if (this.mcpAsyncClient != null) {
				this.mcpAsyncClient.close();
				this.mcpAsyncClient = null;
			}
		} catch (Exception ex) {
			log.error("关闭客户端对象发生异常", ex);
		}

	}

	protected void runRefreshTimer() {
		runRefreshTimer(false);
	}
	
	protected void runRefreshTimer(boolean bTimerOnly) {
		runRefreshTimer(bTimerOnly, false);
	}

	protected void runRefreshTimer(boolean bTimerOnly, boolean bBlock) {
		if (!this.isStarted()) {
			return;
		}

		if (!bTimerOnly) {
			try {
				onRefreshTimer(bBlock);
			} catch (Throwable ex) {
				log.error(String.format("McpServer代理[%1$s]刷新定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				getSystemRuntime().log(LogLevels.ERROR, LogCats.AI_MCPSERVER, String.format("McpServer代理[%1$s]刷新定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}

		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runRefreshTimer();
			}
		}, System.currentTimeMillis() + 60000, "RefreshTimer_McpServer_" + this.getMcpServerId());
	}

	protected void onRefreshTimer(boolean bBlock) {
		listTools(bBlock);
	}

	protected void listTools(boolean bBlock) {
		withClient(createMcpTransport(), mcpAsyncClient -> {
			if(bBlock) {
				ListToolsResult listToolsResult  = Mono.defer(() -> {
					if(mcpAsyncClient.isInitialized()) {
						return mcpAsyncClient.listTools(null).doOnSubscribe(sub -> log.info("开始获取工具列表")).doOnError(ex -> {
							log.error("获取工具列表失败", ex);
							//resetClient();
							Mono.just(null);
						});
					}
					else {
						return mcpAsyncClient.initialize().then(mcpAsyncClient.listTools(null)).doOnSubscribe(sub -> log.info("开始获取工具列表")).doOnError(ex -> {
							log.error("获取工具列表失败", ex);
							//resetClient();
							Mono.just(null);
						});
					}
				}).block(getRequestTimeout());
				if(listToolsResult != null) {
					DefaultMcpServerAgentBase.this.chatToolList = Collections.unmodifiableList(buildChatToolList(listToolsResult.getTools()));
				}
			}
			else {
				if(mcpAsyncClient.isInitialized()) {
					mcpAsyncClient.listTools(null).doOnSubscribe(sub -> log.info("开始获取工具列表")).doOnError(ex -> {
						log.error("获取工具列表失败", ex);
						resetClient();
					}).subscribe(result -> {
						DefaultMcpServerAgentBase.this.chatToolList = buildChatToolList(result.getTools());
					});
				}
				else {
					mcpAsyncClient.initialize().then(mcpAsyncClient.listTools(null)).doOnSubscribe(sub -> log.info("开始获取工具列表")).doOnError(ex -> {
						log.error("获取工具列表失败", ex);
						resetClient();
					}).subscribe(result -> {
						DefaultMcpServerAgentBase.this.chatToolList = Collections.unmodifiableList(buildChatToolList(result.getTools()));
					});
				}
			}
			
		});
	}

	protected void onToolsChanged(List<Tool> tools) {
		log.info(String.format("McpServer代理[%1$s]onToolsChanged", this.getAgentData().getId()));
	}

	@Override
	protected List<ChatTool> onGetTools() {
		return this.chatToolList;
	}

	protected List<ChatTool> buildChatToolList(List<Tool> list) {
		if (ObjectUtils.isEmpty(list)) {
			return Collections.emptyList();
		}

		List<ChatTool> chatToolList = new ArrayList<ChatTool>();
		for(Tool tool : list) {
			ChatTool chatTool = new ChatTool();
			chatTool.setType("function");
			ChatFunction chatFunction = new ChatFunction();
			chatFunction.setName(tool.getName());
			chatFunction.setDescription(tool.getDescription());
			chatFunction.setParameters(JsonUtils.toObjectNode(tool.getInputSchema()));
			chatTool.setFunction(chatFunction);
			chatToolList.add(chatTool);
		}
		
		return chatToolList;
	}
	
	@Override
	protected String onCallTool(String strToolName, Object arg, String strAppContextData) throws Throwable {
		AtomicReference<String> ret = new AtomicReference<String>();
		withClient(createMcpTransport(), mcpAsyncClient -> {
			Map map = ObjectUtils.isEmpty(arg)? Collections.emptyMap():JsonUtils.asMap(arg);
			Map<String, Object> headers = getAdditionalHeaders();
			if(StringUtils.hasLength(strAppContextData)) {
				headers.put(IHttpMcpServerTransportAgent.HEADER_APPCONTEXT, strAppContextData);
			}
			CallToolRequest callToolRequest = new CallToolRequest(strToolName, map, headers);
			CallToolResult callToolResult  = Mono.defer(() -> {
				if(mcpAsyncClient.isInitialized()) {
					return mcpAsyncClient.callTool(callToolRequest).doOnSubscribe(sub -> log.info("开始调用工具")).onErrorResume(ex -> {
						log.error("调用工具失败", ex);
						return Mono.just(new CallToolResult(ex.getMessage(), true));
					});
				}
				else {
					return mcpAsyncClient.initialize().then(
							mcpAsyncClient.callTool(callToolRequest).doOnSubscribe(sub -> log.info("开始调用工具")).onErrorResume(ex -> {
								log.error("调用工具失败", ex);
								return Mono.just(new CallToolResult(ex.getMessage(), true));
							}
					));
				}
			}).block(this.getRequestTimeout());
			
			if(callToolResult == null) {
				this.resetClient();
				throw new RuntimeException("调用工具发生异常");
			}

			if(!DataTypeUtils.asBoolean(callToolResult.getIsError(), false)) {
				String strResult = null;
				if(!ObjectUtils.isEmpty(callToolResult.getContent())) {
					if(callToolResult.getContent().get(0) instanceof TextContent) {
						strResult = ((TextContent)callToolResult.getContent().get(0)).getText();
					}
					else {
						strResult = callToolResult.getContent().get(0).toString();
					}
				}
				ret.set(strResult);
			}
			else {
				if(ObjectUtils.isEmpty(callToolResult.getContent())) {
					throw new RuntimeException(String.format("调用工具发生错误"));
				}
				String strResult = null;
				if(callToolResult.getContent().get(0) instanceof TextContent) {
					strResult = ((TextContent)callToolResult.getContent().get(0)).getText();
				}
				else {
					strResult = callToolResult.getContent().get(0).toString();
				}
				throw new RuntimeException(String.format("调用工具发生错误，%1$s", strResult));
			}
		});
		return ret.get();
	}
}
