/*
 * Copyright 2024-2025 the original author or authors.
 */

package net.ibizsys.central.plugin.ai.mcp.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.CallToolRequest;
import net.ibizsys.central.plugin.ai.mcp.util.Assert;
import net.ibizsys.central.plugin.ai.mcp.util.Utils;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * MCP server features specification that a particular server can choose to support.
 *
 * @author Dariusz Jędrzejczyk
 * @author Jihoon Kim
 */
public class McpServerFeatures {

//	/**
//	 * Asynchronous server features specification.
//	 *
//	 * @param serverInfo The server implementation details
//	 * @param serverCapabilities The server capabilities
//	 * @param tools The list of tool specifications
//	 * @param resources The map of resource specifications
//	 * @param resourceTemplates The list of resource templates
//	 * @param prompts The map of prompt specifications
//	 * @param rootsChangeConsumers The list of consumers that will be notified when the
//	 * roots list changes
//	 * @param instructions The server instructions text
//	 */
//	record Async(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
//			List<McpServerFeatures.AsyncToolSpecification> tools, Map<String, AsyncResourceSpecification> resources,
//			List<McpSchema.ResourceTemplate> resourceTemplates,
//			Map<String, McpServerFeatures.AsyncPromptSpecification> prompts,
//			Map<McpSchema.CompleteReference, McpServerFeatures.AsyncCompletionSpecification> completions,
//			List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootsChangeConsumers,
//			String instructions) {
//
//		/**
//		 * Create an instance and validate the arguments.
//		 * @param serverInfo The server implementation details
//		 * @param serverCapabilities The server capabilities
//		 * @param tools The list of tool specifications
//		 * @param resources The map of resource specifications
//		 * @param resourceTemplates The list of resource templates
//		 * @param prompts The map of prompt specifications
//		 * @param rootsChangeConsumers The list of consumers that will be notified when
//		 * the roots list changes
//		 * @param instructions The server instructions text
//		 */
//		Async(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
//				List<McpServerFeatures.AsyncToolSpecification> tools, Map<String, AsyncResourceSpecification> resources,
//				List<McpSchema.ResourceTemplate> resourceTemplates,
//				Map<String, McpServerFeatures.AsyncPromptSpecification> prompts,
//				Map<McpSchema.CompleteReference, McpServerFeatures.AsyncCompletionSpecification> completions,
//				List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootsChangeConsumers,
//				String instructions) {
//
//			Assert.notNull(serverInfo, "Server info must not be null");
//
//			this.serverInfo = serverInfo;
//			this.serverCapabilities = (serverCapabilities != null) ? serverCapabilities
//					: new McpSchema.ServerCapabilities(null, // completions
//							null, // experimental
//							new McpSchema.ServerCapabilities.LoggingCapabilities(), // Enable
//																					// logging
//																					// by
//																					// default
//							!Utils.isEmpty(prompts) ? new McpSchema.ServerCapabilities.PromptCapabilities(false) : null,
//							!Utils.isEmpty(resources)
//									? new McpSchema.ServerCapabilities.ResourceCapabilities(false, false) : null,
//							!Utils.isEmpty(tools) ? new McpSchema.ServerCapabilities.ToolCapabilities(false) : null);
//
//			this.tools = (tools != null) ? tools : List.of();
//			this.resources = (resources != null) ? resources : Map.of();
//			this.resourceTemplates = (resourceTemplates != null) ? resourceTemplates : List.of();
//			this.prompts = (prompts != null) ? prompts : Map.of();
//			this.completions = (completions != null) ? completions : Map.of();
//			this.rootsChangeConsumers = (rootsChangeConsumers != null) ? rootsChangeConsumers : List.of();
//			this.instructions = instructions;
//		}
//
//		/**
//		 * Convert a synchronous specification into an asynchronous one and provide
//		 * blocking code offloading to prevent accidental blocking of the non-blocking
//		 * transport.
//		 * @param syncSpec a potentially blocking, synchronous specification.
//		 * @param immediateExecution when true, do not offload. Do NOT set to true when
//		 * using a non-blocking transport.
//		 * @return a specification which is protected from blocking calls specified by the
//		 * user.
//		 */
//		static Async fromSync(Sync syncSpec, boolean immediateExecution) {
//			List<McpServerFeatures.AsyncToolSpecification> tools = new ArrayList<>();
//			for (var tool : syncSpec.tools()) {
//				tools.add(AsyncToolSpecification.fromSync(tool, immediateExecution));
//			}
//
//			Map<String, AsyncResourceSpecification> resources = new HashMap<>();
//			syncSpec.resources().forEach((key, resource) -> {
//				resources.put(key, AsyncResourceSpecification.fromSync(resource, immediateExecution));
//			});
//
//			Map<String, AsyncPromptSpecification> prompts = new HashMap<>();
//			syncSpec.prompts().forEach((key, prompt) -> {
//				prompts.put(key, AsyncPromptSpecification.fromSync(prompt, immediateExecution));
//			});
//
//			Map<McpSchema.CompleteReference, McpServerFeatures.AsyncCompletionSpecification> completions = new HashMap<>();
//			syncSpec.completions().forEach((key, completion) -> {
//				completions.put(key, AsyncCompletionSpecification.fromSync(completion, immediateExecution));
//			});
//
//			List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootChangeConsumers = new ArrayList<>();
//
//			for (var rootChangeConsumer : syncSpec.rootsChangeConsumers()) {
//				rootChangeConsumers.add((exchange, list) -> Mono
//					.<Void>fromRunnable(() -> rootChangeConsumer.accept(new McpSyncServerExchange(exchange), list))
//					.subscribeOn(Schedulers.boundedElastic()));
//			}
//
//			return new Async(syncSpec.serverInfo(), syncSpec.serverCapabilities(), tools, resources,
//					syncSpec.resourceTemplates(), prompts, completions, rootChangeConsumers, syncSpec.instructions());
//		}
//	}
	/**
	 * Asynchronous server features specification.
	 */
	public final static class Async {

	    private final McpSchema.Implementation serverInfo;
	    private final McpSchema.ServerCapabilities serverCapabilities;
	    private final List<McpServerFeatures.AsyncToolSpecification> tools;
	    private final Map<String, AsyncResourceSpecification> resources;
	    private final List<McpSchema.ResourceTemplate> resourceTemplates;
	    private final Map<String, McpServerFeatures.AsyncPromptSpecification> prompts;
	    private final Map<McpSchema.CompleteReference, McpServerFeatures.AsyncCompletionSpecification> completions;
	    private final List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootsChangeConsumers;
	    private final String instructions;

	    /**
	     * Create an instance and validate the arguments.
	     * @param serverInfo The server implementation details
	     * @param serverCapabilities The server capabilities
	     * @param tools The list of tool specifications
	     * @param resources The map of resource specifications
	     * @param resourceTemplates The list of resource templates
	     * @param prompts The map of prompt specifications
	     * @param completions The completion specifications
	     * @param rootsChangeConsumers The list of consumers that will be notified when the roots list changes
	     * @param instructions The server instructions text
	     */
	    public Async(McpSchema.Implementation serverInfo, 
	                McpSchema.ServerCapabilities serverCapabilities,
	                List<McpServerFeatures.AsyncToolSpecification> tools, 
	                Map<String, AsyncResourceSpecification> resources,
	                List<McpSchema.ResourceTemplate> resourceTemplates,
	                Map<String, McpServerFeatures.AsyncPromptSpecification> prompts,
	                Map<McpSchema.CompleteReference, McpServerFeatures.AsyncCompletionSpecification> completions,
	                List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootsChangeConsumers,
	                String instructions) {

	        Assert.notNull(serverInfo, "Server info must not be null");

	        this.serverInfo = serverInfo;
	        this.serverCapabilities = (serverCapabilities != null) ? serverCapabilities
	                : new McpSchema.ServerCapabilities(
	                    null, // completions
	                    null, // experimental
	                    new McpSchema.ServerCapabilities.LoggingCapabilities(), // Enable logging by default
	                    (!Utils.isEmpty(prompts)) ? new McpSchema.ServerCapabilities.PromptCapabilities(false) : null,
	                    (!Utils.isEmpty(resources)) ? new McpSchema.ServerCapabilities.ResourceCapabilities(false, false) : null,
	                    (!Utils.isEmpty(tools)) ? new McpSchema.ServerCapabilities.ToolCapabilities(false) : null
	                );

	        // 使用 JDK 8 兼容的不可变集合初始化
	        this.tools = (tools != null) ? Collections.unmodifiableList(new ArrayList<>(tools)) 
	                : Collections.emptyList();
	        this.resources = (resources != null) ? Collections.unmodifiableMap(new HashMap<>(resources)) 
	                : Collections.emptyMap();
	        this.resourceTemplates = (resourceTemplates != null) ? Collections.unmodifiableList(new ArrayList<>(resourceTemplates)) 
	                : Collections.emptyList();
	        this.prompts = (prompts != null) ? Collections.unmodifiableMap(new HashMap<>(prompts)) 
	                : Collections.emptyMap();
	        this.completions = (completions != null) ? Collections.unmodifiableMap(new HashMap<>(completions)) 
	                : Collections.emptyMap();
	        this.rootsChangeConsumers = (rootsChangeConsumers != null) ? Collections.unmodifiableList(new ArrayList<>(rootsChangeConsumers)) 
	                : Collections.emptyList();
	        this.instructions = instructions;
	    }

	    // Getter 方法
	    public McpSchema.Implementation serverInfo() { return serverInfo; }
	    public McpSchema.ServerCapabilities serverCapabilities() { return serverCapabilities; }
	    public List<McpServerFeatures.AsyncToolSpecification> tools() { return tools; }
	    public Map<String, AsyncResourceSpecification> resources() { return resources; }
	    public List<McpSchema.ResourceTemplate> resourceTemplates() { return resourceTemplates; }
	    public Map<String, McpServerFeatures.AsyncPromptSpecification> prompts() { return prompts; }
	    public Map<McpSchema.CompleteReference, McpServerFeatures.AsyncCompletionSpecification> completions() { 
	        return completions; 
	    }
	    public List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootsChangeConsumers() { 
	        return rootsChangeConsumers; 
	    }
	    public String instructions() { return instructions; }

	    /**
	     * Convert a synchronous specification into an asynchronous one and provide
	     * blocking code offloading to prevent accidental blocking of the non-blocking
	     * transport.
	     * @param syncSpec a potentially blocking, synchronous specification.
	     * @param immediateExecution when true, do not offload. Do NOT set to true when
	     * using a non-blocking transport.
	     * @return a specification which is protected from blocking calls specified by the
	     * user.
	     */
	    public static Async fromSync(Sync syncSpec, boolean immediateExecution) {
	        // 显式声明类型代替 var
	        List<McpServerFeatures.AsyncToolSpecification> tools = new ArrayList<>();
	        for (McpServerFeatures.SyncToolSpecification tool : syncSpec.tools()) {
	            tools.add(AsyncToolSpecification.fromSync(tool, immediateExecution));
	        }

	        Map<String, AsyncResourceSpecification> resources = new HashMap<>();
	        for (Map.Entry<String, SyncResourceSpecification> entry : syncSpec.resources().entrySet()) {
	            resources.put(entry.getKey(), 
	                AsyncResourceSpecification.fromSync(entry.getValue(), immediateExecution));
	        }

	        Map<String, AsyncPromptSpecification> prompts = new HashMap<>();
	        for (Map.Entry<String, SyncPromptSpecification> entry : syncSpec.prompts().entrySet()) {
	            prompts.put(entry.getKey(), 
	                AsyncPromptSpecification.fromSync(entry.getValue(), immediateExecution));
	        }

	        Map<McpSchema.CompleteReference, McpServerFeatures.AsyncCompletionSpecification> completions = new HashMap<>();
	        for (Map.Entry<McpSchema.CompleteReference, SyncCompletionSpecification> entry : syncSpec.completions().entrySet()) {
	            completions.put(entry.getKey(), 
	                AsyncCompletionSpecification.fromSync(entry.getValue(), immediateExecution));
	        }

	        List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootChangeConsumers = new ArrayList<>();
	        for (BiConsumer<McpSyncServerExchange, List<McpSchema.Root>> rootChangeConsumer : syncSpec.rootsChangeConsumers()) {
	            rootChangeConsumers.add((exchange, list) -> 
	                Mono.<Void>fromRunnable(() -> 
	                    rootChangeConsumer.accept(new McpSyncServerExchange(exchange), list)
	                ).subscribeOn(Schedulers.boundedElastic())
	            );
	        }

	        return new Async(
	            syncSpec.serverInfo(), 
	            syncSpec.serverCapabilities(), 
	            tools, 
	            resources,
	            syncSpec.resourceTemplates(), 
	            prompts, 
	            completions, 
	            rootChangeConsumers, 
	            syncSpec.instructions()
	        );
	    }
	}
	
	

	/**
	 * Synchronous server features specification.
	 *
	 * @param serverInfo The server implementation details
	 * @param serverCapabilities The server capabilities
	 * @param tools The list of tool specifications
	 * @param resources The map of resource specifications
	 * @param resourceTemplates The list of resource templates
	 * @param prompts The map of prompt specifications
	 * @param rootsChangeConsumers The list of consumers that will be notified when the
	 * roots list changes
	 * @param instructions The server instructions text
	 */
//	record Sync(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
//			List<McpServerFeatures.SyncToolSpecification> tools,
//			Map<String, McpServerFeatures.SyncResourceSpecification> resources,
//			List<McpSchema.ResourceTemplate> resourceTemplates,
//			Map<String, McpServerFeatures.SyncPromptSpecification> prompts,
//			Map<McpSchema.CompleteReference, McpServerFeatures.SyncCompletionSpecification> completions,
//			List<BiConsumer<McpSyncServerExchange, List<McpSchema.Root>>> rootsChangeConsumers, String instructions) {
//
//		/**
//		 * Create an instance and validate the arguments.
//		 * @param serverInfo The server implementation details
//		 * @param serverCapabilities The server capabilities
//		 * @param tools The list of tool specifications
//		 * @param resources The map of resource specifications
//		 * @param resourceTemplates The list of resource templates
//		 * @param prompts The map of prompt specifications
//		 * @param rootsChangeConsumers The list of consumers that will be notified when
//		 * the roots list changes
//		 * @param instructions The server instructions text
//		 */
//		Sync(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
//				List<McpServerFeatures.SyncToolSpecification> tools,
//				Map<String, McpServerFeatures.SyncResourceSpecification> resources,
//				List<McpSchema.ResourceTemplate> resourceTemplates,
//				Map<String, McpServerFeatures.SyncPromptSpecification> prompts,
//				Map<McpSchema.CompleteReference, McpServerFeatures.SyncCompletionSpecification> completions,
//				List<BiConsumer<McpSyncServerExchange, List<McpSchema.Root>>> rootsChangeConsumers,
//				String instructions) {
//
//			Assert.notNull(serverInfo, "Server info must not be null");
//
//			this.serverInfo = serverInfo;
//			this.serverCapabilities = (serverCapabilities != null) ? serverCapabilities
//					: new McpSchema.ServerCapabilities(null, // completions
//							null, // experimental
//							new McpSchema.ServerCapabilities.LoggingCapabilities(), // Enable
//																					// logging
//																					// by
//																					// default
//							!Utils.isEmpty(prompts) ? new McpSchema.ServerCapabilities.PromptCapabilities(false) : null,
//							!Utils.isEmpty(resources)
//									? new McpSchema.ServerCapabilities.ResourceCapabilities(false, false) : null,
//							!Utils.isEmpty(tools) ? new McpSchema.ServerCapabilities.ToolCapabilities(false) : null);
//
//			this.tools = (tools != null) ? tools : new ArrayList<>();
//			this.resources = (resources != null) ? resources : new HashMap<>();
//			this.resourceTemplates = (resourceTemplates != null) ? resourceTemplates : new ArrayList<>();
//			this.prompts = (prompts != null) ? prompts : new HashMap<>();
//			this.completions = (completions != null) ? completions : new HashMap<>();
//			this.rootsChangeConsumers = (rootsChangeConsumers != null) ? rootsChangeConsumers : new ArrayList<>();
//			this.instructions = instructions;
//		}
//
//	}
	public final static class Sync {
	    private final McpSchema.Implementation serverInfo;
	    private final McpSchema.ServerCapabilities serverCapabilities;
	    private final List<McpServerFeatures.SyncToolSpecification> tools;
	    private final Map<String, McpServerFeatures.SyncResourceSpecification> resources;
	    private final List<McpSchema.ResourceTemplate> resourceTemplates;
	    private final Map<String, McpServerFeatures.SyncPromptSpecification> prompts;
	    private final Map<McpSchema.CompleteReference, McpServerFeatures.SyncCompletionSpecification> completions;
	    private final List<BiConsumer<McpSyncServerExchange, List<McpSchema.Root>>> rootsChangeConsumers;
	    private final String instructions;

	    /**
	     * 构造方法（保持空值处理和默认值逻辑）
	     */
	    public Sync(McpSchema.Implementation serverInfo, 
	                McpSchema.ServerCapabilities serverCapabilities,
	                List<McpServerFeatures.SyncToolSpecification> tools,
	                Map<String, McpServerFeatures.SyncResourceSpecification> resources,
	                List<McpSchema.ResourceTemplate> resourceTemplates,
	                Map<String, McpServerFeatures.SyncPromptSpecification> prompts,
	                Map<McpSchema.CompleteReference, McpServerFeatures.SyncCompletionSpecification> completions,
	                List<BiConsumer<McpSyncServerExchange, List<McpSchema.Root>>> rootsChangeConsumers,
	                String instructions) {
	        
	        Assert.notNull(serverInfo, "Server info must not be null");
	        
	        // 字段初始化（保留原有空值处理逻辑）
	        this.serverInfo = serverInfo;
	        this.serverCapabilities = (serverCapabilities != null) ? serverCapabilities 
	                : new McpSchema.ServerCapabilities(
	                    null, 
	                    null,
	                    new McpSchema.ServerCapabilities.LoggingCapabilities(),
	                    (!Utils.isEmpty(prompts)) ? new McpSchema.ServerCapabilities.PromptCapabilities(false) : null,
	                    (!Utils.isEmpty(resources)) ? new McpSchema.ServerCapabilities.ResourceCapabilities(false, false) : null,
	                    (!Utils.isEmpty(tools)) ? new McpSchema.ServerCapabilities.ToolCapabilities(false) : null
	                );
	        
	        this.tools = (tools != null) ? new ArrayList<>(tools) : new ArrayList<>();
	        this.resources = (resources != null) ? new HashMap<>(resources) : new HashMap<>();
	        this.resourceTemplates = (resourceTemplates != null) ? new ArrayList<>(resourceTemplates) : new ArrayList<>();
	        this.prompts = (prompts != null) ? new HashMap<>(prompts) : new HashMap<>();
	        this.completions = (completions != null) ? new HashMap<>(completions) : new HashMap<>();
	        this.rootsChangeConsumers = (rootsChangeConsumers != null) ? new ArrayList<>(rootsChangeConsumers) : new ArrayList<>();
	        this.instructions = instructions;
	    }

	    // --------------- 手动实现 Record 的字段访问方法 ---------------
	    public McpSchema.Implementation serverInfo() {
	        return serverInfo;
	    }

	    public McpSchema.ServerCapabilities serverCapabilities() {
	        return serverCapabilities;
	    }

	    public List<McpServerFeatures.SyncToolSpecification> tools() {
	        return Collections.unmodifiableList(tools);
	    }

	    public Map<String, McpServerFeatures.SyncResourceSpecification> resources() {
	        return Collections.unmodifiableMap(resources);
	    }

	    public List<McpSchema.ResourceTemplate> resourceTemplates() {
	        return Collections.unmodifiableList(resourceTemplates);
	    }

	    public Map<String, McpServerFeatures.SyncPromptSpecification> prompts() {
	        return Collections.unmodifiableMap(prompts);
	    }

	    public Map<McpSchema.CompleteReference, McpServerFeatures.SyncCompletionSpecification> completions() {
	        return Collections.unmodifiableMap(completions);
	    }

	    public List<BiConsumer<McpSyncServerExchange, List<McpSchema.Root>>> rootsChangeConsumers() {
	        return Collections.unmodifiableList(rootsChangeConsumers);
	    }

	    public String instructions() {
	        return instructions;
	    }

	    // --------------- 手动实现 equals/hashCode/toString ---------------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Sync sync = (Sync) o;
	        return Objects.equals(serverInfo, sync.serverInfo) &&
	               Objects.equals(serverCapabilities, sync.serverCapabilities) &&
	               Objects.equals(tools, sync.tools) &&
	               Objects.equals(resources, sync.resources) &&
	               Objects.equals(resourceTemplates, sync.resourceTemplates) &&
	               Objects.equals(prompts, sync.prompts) &&
	               Objects.equals(completions, sync.completions) &&
	               Objects.equals(rootsChangeConsumers, sync.rootsChangeConsumers) &&
	               Objects.equals(instructions, sync.instructions);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(serverInfo, serverCapabilities, tools, resources, 
	                           resourceTemplates, prompts, completions, 
	                           rootsChangeConsumers, instructions);
	    }

	    @Override
	    public String toString() {
	        return "Sync[" +
	               "serverInfo=" + serverInfo +
	               ", serverCapabilities=" + serverCapabilities +
	               ", tools=" + tools +
	               ", resources=" + resources +
	               ", resourceTemplates=" + resourceTemplates +
	               ", prompts=" + prompts +
	               ", completions=" + completions +
	               ", rootsChangeConsumers=" + rootsChangeConsumers +
	               ", instructions='" + instructions + '\'' +
	               ']';
	    }
	}

	/**
	 * Specification of a tool with its asynchronous handler function. Tools are the
	 * primary way for MCP servers to expose functionality to AI models. Each tool
	 * represents a specific capability.
	 *
	 * @param tool The tool definition including name, description, and parameter schema
	 * @param call Deprecated. Use the {@link AsyncToolSpecification#callHandler} instead.
	 * @param callHandler The function that implements the tool's logic, receiving a
	 * {@link McpAsyncServerExchange} and a
	 * {@link net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.CallToolRequest} and returning
	 * results. The function's first argument is an {@link McpAsyncServerExchange} upon
	 * which the server can interact with the connected client. The second arguments is a
	 * map of tool arguments.
	 */
//	public record AsyncToolSpecification(McpSchema.Tool tool,
//			@Deprecated BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call,
//			BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler) {
//
//		/**
//		 * @deprecated Use {@link AsyncToolSpecification(McpSchema.Tool, null,
//		 * BiFunction)} instead.
//		 **/
//		@Deprecated
//		public AsyncToolSpecification(McpSchema.Tool tool,
//				BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call) {
//			this(tool, call, (exchange, toolReq) -> call.apply(exchange, toolReq.arguments()));
//		}
//
//		static AsyncToolSpecification fromSync(SyncToolSpecification syncToolSpec) {
//			return fromSync(syncToolSpec, false);
//		}
//
//		static AsyncToolSpecification fromSync(SyncToolSpecification syncToolSpec, boolean immediate) {
//
//			// FIXME: This is temporary, proper validation should be implemented
//			if (syncToolSpec == null) {
//				return null;
//			}
//
//			BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> deprecatedCall = (syncToolSpec
//				.call() != null) ? (exchange, map) -> {
//					var toolResult = Mono
//						.fromCallable(() -> syncToolSpec.call().apply(new McpSyncServerExchange(exchange), map));
//					return immediate ? toolResult : toolResult.subscribeOn(Schedulers.boundedElastic());
//				} : null;
//
//			BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler = (
//					exchange, req) -> {
//				var toolResult = Mono
//					.fromCallable(() -> syncToolSpec.callHandler().apply(new McpSyncServerExchange(exchange), req));
//				return immediate ? toolResult : toolResult.subscribeOn(Schedulers.boundedElastic());
//			};
//
//			return new AsyncToolSpecification(syncToolSpec.tool(), deprecatedCall, callHandler);
//		}
//
//		/**
//		 * Builder for creating AsyncToolSpecification instances.
//		 */
//		public static class Builder {
//
//			private McpSchema.Tool tool;
//
//			private BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler;
//
//			/**
//			 * Sets the tool definition.
//			 * @param tool The tool definition including name, description, and parameter
//			 * schema
//			 * @return this builder instance
//			 */
//			public Builder tool(McpSchema.Tool tool) {
//				this.tool = tool;
//				return this;
//			}
//
//			/**
//			 * Sets the call tool handler function.
//			 * @param callHandler The function that implements the tool's logic
//			 * @return this builder instance
//			 */
//			public Builder callHandler(
//					BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler) {
//				this.callHandler = callHandler;
//				return this;
//			}
//
//			/**
//			 * Builds the AsyncToolSpecification instance.
//			 * @return a new AsyncToolSpecification instance
//			 * @throws IllegalArgumentException if required fields are not set
//			 */
//			public AsyncToolSpecification build() {
//				Assert.notNull(tool, "Tool must not be null");
//				Assert.notNull(callHandler, "Call handler function must not be null");
//
//				return new AsyncToolSpecification(tool, null, callHandler);
//			}
//
//		}
//
//		/**
//		 * Creates a new builder instance.
//		 * @return a new Builder instance
//		 */
//		public static Builder builder() {
//			return new Builder();
//		}
//	}
	
	public final static class AsyncToolSpecification {
	    private final McpSchema.Tool tool;
	    @Deprecated
	    private final BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call;
	    private final BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler;

	    // 主构造函数
	    public AsyncToolSpecification(McpSchema.Tool tool,
	                                  BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call,
	                                  BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler) {
	        this.tool = tool;
	        this.call = call;
	        this.callHandler = callHandler;
	    }

	    /**
	     * @deprecated 使用完整构造函数替代
	     */
	    @Deprecated
	    public AsyncToolSpecification(McpSchema.Tool tool,
	                                  BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call) {
	        this(tool, call, new BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>>() {
	            @Override
	            public Mono<McpSchema.CallToolResult> apply(McpAsyncServerExchange exchange, McpSchema.CallToolRequest toolReq) {
	                return call.apply(exchange, toolReq.arguments());
	            }
	        });
	    }

	    // --------------- 访问方法 ---------------
	    public McpSchema.Tool tool() {
	        return tool;
	    }

	    @Deprecated
	    public BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call() {
	        return call;
	    }

	    public BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler() {
	        return callHandler;
	    }

	    // --------------- 工厂方法 ---------------
	    public static AsyncToolSpecification fromSync(SyncToolSpecification syncToolSpec) {
	        return fromSync(syncToolSpec, false);
	    }

	    public static AsyncToolSpecification fromSync(SyncToolSpecification syncToolSpec, boolean immediate) {
	        if (syncToolSpec == null) {
	            return null;
	        }

	        // 显式类型声明代替 var
	        BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> deprecatedCall = null;
	        if (syncToolSpec.call() != null) {
	            deprecatedCall = new BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>>() {
	                @Override
	                public Mono<McpSchema.CallToolResult> apply(McpAsyncServerExchange exchange, Map<String, Object> map) {
	                    Mono<McpSchema.CallToolResult> toolResult = Mono.fromCallable(
	                        new Callable<McpSchema.CallToolResult>() {
	                            @Override
	                            public McpSchema.CallToolResult call() {
	                                return syncToolSpec.call().apply(new McpSyncServerExchange(exchange), map);
	                            }
	                        }
	                    );
	                    return immediate ? toolResult : toolResult.subscribeOn(Schedulers.boundedElastic());
	                }
	            };
	        }

	        BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler = 
	            new BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>>() {
	                @Override
	                public Mono<McpSchema.CallToolResult> apply(McpAsyncServerExchange exchange, McpSchema.CallToolRequest req) {
	                    Mono<McpSchema.CallToolResult> toolResult = Mono.fromCallable(
	                        new Callable<McpSchema.CallToolResult>() {
	                            @Override
	                            public McpSchema.CallToolResult call() {
	                                return syncToolSpec.callHandler().apply(new McpSyncServerExchange(exchange), req);
	                            }
	                        }
	                    );
	                    return immediate ? toolResult : toolResult.subscribeOn(Schedulers.boundedElastic());
	                }
	            };

	        return new AsyncToolSpecification(syncToolSpec.tool(), deprecatedCall, callHandler);
	    }

	    // --------------- Builder 模式 ---------------
	    public final static class Builder {
	        private McpSchema.Tool tool;
	        private BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler;

	        public Builder tool(McpSchema.Tool tool) {
	            this.tool = tool;
	            return this;
	        }

	        public Builder callHandler(
	            BiFunction<McpAsyncServerExchange, McpSchema.CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler) {
	            this.callHandler = callHandler;
	            return this;
	        }

	        public AsyncToolSpecification build() {
	            Assert.notNull(tool, "Tool must not be null");
	            Assert.notNull(callHandler, "Call handler function must not be null");
	            return new AsyncToolSpecification(tool, null, callHandler);
	        }
	    }

	    public static Builder builder() {
	        return new Builder();
	    }

	    // --------------- 相等性与哈希值 ---------------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        AsyncToolSpecification that = (AsyncToolSpecification) o;
	        return Objects.equals(tool, that.tool) &&
	               Objects.equals(call, that.call) &&
	               Objects.equals(callHandler, that.callHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(tool, call, callHandler);
	    }

	    @Override
	    public String toString() {
	        return "AsyncToolSpecification{" +
	               "tool=" + tool +
	               ", call=" + call +
	               ", callHandler=" + callHandler +
	               '}';
	    }
	}
	
	/**
	 * Specification of a resource with its asynchronous handler function. Resources
	 * provide context to AI models by exposing data such as:
	 * <ul>
	 * <li>File contents
	 * <li>Database records
	 * <li>API responses
	 * <li>System information
	 * <li>Application state
	 * </ul>
	 *
	 * <p>
	 * Example resource specification:
	 *
	 * <pre>{@code
	 * new McpServerFeatures.AsyncResourceSpecification(
	 * 		new Resource("docs", "Documentation files", "text/markdown"),
	 * 		(exchange, request) -> Mono.fromSupplier(() -> readFile(request.getPath()))
	 * 				.map(ReadResourceResult::new))
	 * }</pre>
	 *
	 * @param resource The resource definition including name, description, and MIME type
	 * @param readHandler The function that handles resource read requests. The function's
	 * first argument is an {@link McpAsyncServerExchange} upon which the server can
	 * interact with the connected client. The second arguments is a
	 * {@link net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.ReadResourceRequest}.
	 */
//	public record AsyncResourceSpecification(McpSchema.Resource resource,
//			BiFunction<McpAsyncServerExchange, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler) {
//
//		static AsyncResourceSpecification fromSync(SyncResourceSpecification resource, boolean immediateExecution) {
//			// FIXME: This is temporary, proper validation should be implemented
//			if (resource == null) {
//				return null;
//			}
//			return new AsyncResourceSpecification(resource.resource(), (exchange, req) -> {
//				var resourceResult = Mono
//					.fromCallable(() -> resource.readHandler().apply(new McpSyncServerExchange(exchange), req));
//				return immediateExecution ? resourceResult : resourceResult.subscribeOn(Schedulers.boundedElastic());
//			});
//		}
//	}
	public final static class AsyncResourceSpecification {
	    private final McpSchema.Resource resource;
	    private final BiFunction<McpAsyncServerExchange, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler;

	    public AsyncResourceSpecification(
	        McpSchema.Resource resource,
	        BiFunction<McpAsyncServerExchange, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler
	    ) {
	        this.resource = resource;
	        this.readHandler = readHandler;
	    }

	    // 访问方法（代替 record 的自动生成方法）
	    public McpSchema.Resource resource() {
	        return resource;
	    }

	    public BiFunction<McpAsyncServerExchange, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler() {
	        return readHandler;
	    }

	    // 手动实现 record 的自动生成方法
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        AsyncResourceSpecification that = (AsyncResourceSpecification) o;
	        return Objects.equals(resource, that.resource) &&
	               Objects.equals(readHandler, that.readHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(resource, readHandler);
	    }

	    @Override
	    public String toString() {
	        return "AsyncResourceSpecification{" +
	               "resource=" + resource +
	               ", readHandler=" + readHandler +
	               '}';
	    }

	    // 保留静态工厂方法（适配 lambda 表达式）
	    public static AsyncResourceSpecification fromSync(SyncResourceSpecification resource, boolean immediateExecution) {
	        if (resource == null) {
	            return null;
	        }
	        return new AsyncResourceSpecification(
	            resource.resource(),
	            new BiFunction<McpAsyncServerExchange, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>>() {
	                @Override
	                public Mono<McpSchema.ReadResourceResult> apply(
	                    McpAsyncServerExchange exchange, 
	                    McpSchema.ReadResourceRequest req
	                ) {
	                    Mono<McpSchema.ReadResourceResult> resourceResult = Mono.fromCallable(
	                        new Callable<McpSchema.ReadResourceResult>() {
	                            @Override
	                            public McpSchema.ReadResourceResult call() {
	                                return resource.readHandler().apply(new McpSyncServerExchange(exchange), req);
	                            }
	                        }
	                    );
	                    return immediateExecution ? resourceResult : resourceResult.subscribeOn(Schedulers.boundedElastic());
	                }
	            }
	        );
	    }
	}

	/**
	 * Specification of a prompt template with its asynchronous handler function. Prompts
	 * provide structured templates for AI model interactions, supporting:
	 * <ul>
	 * <li>Consistent message formatting
	 * <li>Parameter substitution
	 * <li>Context injection
	 * <li>Response formatting
	 * <li>Instruction templating
	 * </ul>
	 *
	 * <p>
	 * Example prompt specification:
	 *
	 * <pre>{@code
	 * new McpServerFeatures.AsyncPromptSpecification(
	 * 		new Prompt("analyze", "Code analysis template"),
	 * 		(exchange, request) -> {
	 * 			String code = request.getArguments().get("code");
	 * 			return Mono.just(new GetPromptResult(
	 * 					"Analyze this code:\n\n" + code + "\n\nProvide feedback on:"));
	 * 		})
	 * }</pre>
	 *
	 * @param prompt The prompt definition including name and description
	 * @param promptHandler The function that processes prompt requests and returns
	 * formatted templates. The function's first argument is an
	 * {@link McpAsyncServerExchange} upon which the server can interact with the
	 * connected client. The second arguments is a
	 * {@link net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.GetPromptRequest}.
	 */
//	public record AsyncPromptSpecification(McpSchema.Prompt prompt,
//			BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler) {
//
//		static AsyncPromptSpecification fromSync(SyncPromptSpecification prompt, boolean immediateExecution) {
//			// FIXME: This is temporary, proper validation should be implemented
//			if (prompt == null) {
//				return null;
//			}
//			return new AsyncPromptSpecification(prompt.prompt(), (exchange, req) -> {
//				var promptResult = Mono
//					.fromCallable(() -> prompt.promptHandler().apply(new McpSyncServerExchange(exchange), req));
//				return immediateExecution ? promptResult : promptResult.subscribeOn(Schedulers.boundedElastic());
//			});
//		}
//	}
	public final static class AsyncPromptSpecification {
	    private final McpSchema.Prompt prompt;
	    private final BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler;

	    public AsyncPromptSpecification(
	        McpSchema.Prompt prompt,
	        BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler
	    ) {
	        this.prompt = prompt;
	        this.promptHandler = promptHandler;
	    }

	    // --------------- 字段访问方法 ---------------
	    public McpSchema.Prompt prompt() {
	        return prompt;
	    }

	    public BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler() {
	        return promptHandler;
	    }

	    // --------------- 核心方法 ---------------
	    public static AsyncPromptSpecification fromSync(SyncPromptSpecification prompt, boolean immediateExecution) {
	        if (prompt == null) {
	            return null;
	        }
	        return new AsyncPromptSpecification(
	            prompt.prompt(),
	            new BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>>() {
	                @Override
	                public Mono<McpSchema.GetPromptResult> apply(
	                    McpAsyncServerExchange exchange, 
	                    McpSchema.GetPromptRequest req
	                ) {
	                    // 显式声明类型替代 var
	                    Mono<McpSchema.GetPromptResult> promptResult = Mono.fromCallable(
	                        new Callable<McpSchema.GetPromptResult>() {
	                            @Override
	                            public McpSchema.GetPromptResult call() {
	                                return prompt.promptHandler().apply(new McpSyncServerExchange(exchange), req);
	                            }
	                        }
	                    );
	                    return immediateExecution ? promptResult : promptResult.subscribeOn(Schedulers.boundedElastic());
	                }
	            }
	        );
	    }

	    // --------------- 相等性与哈希值 ---------------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        AsyncPromptSpecification that = (AsyncPromptSpecification) o;
	        return Objects.equals(prompt, that.prompt) &&
	               Objects.equals(promptHandler, that.promptHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(prompt, promptHandler);
	    }

	    @Override
	    public String toString() {
	        return "AsyncPromptSpecification{" +
	               "prompt=" + prompt +
	               ", promptHandler=" + promptHandler +
	               '}';
	    }

	    // --------------- Builder 模式（可选） ---------------
	    public final static class Builder {
	        private McpSchema.Prompt prompt;
	        private BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler;

	        public Builder prompt(McpSchema.Prompt prompt) {
	            this.prompt = prompt;
	            return this;
	        }

	        public Builder promptHandler(
	            BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler
	        ) {
	            this.promptHandler = promptHandler;
	            return this;
	        }

	        public AsyncPromptSpecification build() {
	            return new AsyncPromptSpecification(prompt, promptHandler);
	        }
	    }

	    public static Builder builder() {
	        return new Builder();
	    }
	}

	/**
	 * Specification of a completion handler function with asynchronous execution support.
	 * Completions generate AI model outputs based on prompt or resource references and
	 * user-provided arguments. This abstraction enables:
	 * <ul>
	 * <li>Customizable response generation logic
	 * <li>Parameter-driven template expansion
	 * <li>Dynamic interaction with connected clients
	 * </ul>
	 *
	 * @param referenceKey The unique key representing the completion reference.
	 * @param completionHandler The asynchronous function that processes completion
	 * requests and returns results. The first argument is an
	 * {@link McpAsyncServerExchange} used to interact with the client. The second
	 * argument is a {@link net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.CompleteRequest}.
	 */
//	public record AsyncCompletionSpecification(McpSchema.CompleteReference referenceKey,
//			BiFunction<McpAsyncServerExchange, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler) {
//
//		/**
//		 * Converts a synchronous {@link SyncCompletionSpecification} into an
//		 * {@link AsyncCompletionSpecification} by wrapping the handler in a bounded
//		 * elastic scheduler for safe non-blocking execution.
//		 * @param completion the synchronous completion specification
//		 * @return an asynchronous wrapper of the provided sync specification, or
//		 * {@code null} if input is null
//		 */
//		static AsyncCompletionSpecification fromSync(SyncCompletionSpecification completion,
//				boolean immediateExecution) {
//			if (completion == null) {
//				return null;
//			}
//			return new AsyncCompletionSpecification(completion.referenceKey(), (exchange, request) -> {
//				var completionResult = Mono.fromCallable(
//						() -> completion.completionHandler().apply(new McpSyncServerExchange(exchange), request));
//				return immediateExecution ? completionResult
//						: completionResult.subscribeOn(Schedulers.boundedElastic());
//			});
//		}
//	}
	public final static class AsyncCompletionSpecification {
	    private final McpSchema.CompleteReference referenceKey;
	    private final BiFunction<McpAsyncServerExchange, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler;

	    // 构造方法（保留空安全设计）
	    public AsyncCompletionSpecification(
	        McpSchema.CompleteReference referenceKey,
	        BiFunction<McpAsyncServerExchange, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler
	    ) {
	        this.referenceKey = Objects.requireNonNull(referenceKey, "Reference key must not be null");
	        this.completionHandler = Objects.requireNonNull(completionHandler, "Completion handler must not be null");
	    }

	    // --------------- 字段访问方法 ---------------
	    public McpSchema.CompleteReference referenceKey() {
	        return referenceKey;
	    }

	    public BiFunction<McpAsyncServerExchange, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler() {
	        return completionHandler;
	    }

	    // --------------- 核心工厂方法（适配阻塞操作）---------------
	    public static AsyncCompletionSpecification fromSync(
	        SyncCompletionSpecification completion,
	        boolean immediateExecution
	    ) {
	        if (completion == null) {
	            return null;
	        }
	        return new AsyncCompletionSpecification(
	            completion.referenceKey(),
	            new BiFunction<McpAsyncServerExchange, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>>() {
	                @Override
	                public Mono<McpSchema.CompleteResult> apply(
	                    McpAsyncServerExchange exchange,
	                    McpSchema.CompleteRequest request
	                ) {
	                    // 显式声明类型替代 var
	                    Mono<McpSchema.CompleteResult> completionResult = Mono.fromCallable(
	                        new Callable<McpSchema.CompleteResult>() {
	                            @Override
	                            public McpSchema.CompleteResult call() {
	                                return completion.completionHandler().apply(
	                                    new McpSyncServerExchange(exchange),
	                                    request
	                                );
	                            }
	                        }
	                    );
	                    return immediateExecution 
	                        ? completionResult 
	                        : completionResult.subscribeOn(Schedulers.boundedElastic());
	                }
	            }
	        );
	    }

	    // --------------- 相等性与哈希值 ---------------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        AsyncCompletionSpecification that = (AsyncCompletionSpecification) o;
	        return Objects.equals(referenceKey, that.referenceKey) &&
	               Objects.equals(completionHandler, that.completionHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(referenceKey, completionHandler);
	    }

	    @Override
	    public String toString() {
	        return "AsyncCompletionSpecification{" +
	               "referenceKey=" + referenceKey +
	               ", completionHandler=" + completionHandler +
	               '}';
	    }

	    // --------------- Builder 模式（可选） ---------------
	    public final static class Builder {
	        private McpSchema.CompleteReference referenceKey;
	        private BiFunction<McpAsyncServerExchange, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler;

	        public Builder referenceKey(McpSchema.CompleteReference referenceKey) {
	            this.referenceKey = referenceKey;
	            return this;
	        }

	        public Builder completionHandler(
	            BiFunction<McpAsyncServerExchange, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler
	        ) {
	            this.completionHandler = completionHandler;
	            return this;
	        }

	        public AsyncCompletionSpecification build() {
	            return new AsyncCompletionSpecification(referenceKey, completionHandler);
	        }
	    }

	    public static Builder builder() {
	        return new Builder();
	    }
	}

	/**
	 * Specification of a tool with its synchronous handler function. Tools are the
	 * primary way for MCP servers to expose functionality to AI models.
	 *
	 * <p>
	 * Example tool specification:
	 *
	 * <pre>{@code
	 * McpServerFeatures.SyncToolSpecification.builder()
	 * 		.tool(new Tool(
	 * 				"calculator",
	 * 				"Performs mathematical calculations",
	 * 				new JsonSchemaObject()
	 * 						.required("expression")
	 * 						.property("expression", JsonSchemaType.STRING)))
	 * 		.toolHandler((exchange, req) -> {
	 * 			String expr = (String) req.arguments().get("expression");
	 * 			return new CallToolResult("Result: " + evaluate(expr));
	 * 		}))
	 *      .build();
	 * }</pre>
	 *
	 * @param tool The tool definition including name, description, and parameter schema
	 * @param call (Deprected) The function that implements the tool's logic, receiving
	 * arguments and returning results. The function's first argument is an
	 * {@link McpSyncServerExchange} upon which the server can interact with the connected
	 * @param callHandler The function that implements the tool's logic, receiving a
	 * {@link McpSyncServerExchange} and a
	 * {@link net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.CallToolRequest} and returning
	 * results. The function's first argument is an {@link McpSyncServerExchange} upon
	 * which the server can interact with the client. The second arguments is a map of
	 * arguments passed to the tool.
	 */
//	public record SyncToolSpecification(McpSchema.Tool tool,
//			@Deprecated BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> call,
//			BiFunction<McpSyncServerExchange, CallToolRequest, McpSchema.CallToolResult> callHandler) {
//
//		@Deprecated
//		public SyncToolSpecification(McpSchema.Tool tool,
//				BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> call) {
//			this(tool, call, (exchange, toolReq) -> call.apply(exchange, toolReq.arguments()));
//		}
//
//		/**
//		 * Builder for creating SyncToolSpecification instances.
//		 */
//		public static class Builder {
//
//			private McpSchema.Tool tool;
//
//			private BiFunction<McpSyncServerExchange, CallToolRequest, McpSchema.CallToolResult> callHandler;
//
//			/**
//			 * Sets the tool definition.
//			 * @param tool The tool definition including name, description, and parameter
//			 * schema
//			 * @return this builder instance
//			 */
//			public Builder tool(McpSchema.Tool tool) {
//				this.tool = tool;
//				return this;
//			}
//
//			/**
//			 * Sets the call tool handler function.
//			 * @param callHandler The function that implements the tool's logic
//			 * @return this builder instance
//			 */
//			public Builder callHandler(
//					BiFunction<McpSyncServerExchange, CallToolRequest, McpSchema.CallToolResult> callHandler) {
//				this.callHandler = callHandler;
//				return this;
//			}
//
//			/**
//			 * Builds the SyncToolSpecification instance.
//			 * @return a new SyncToolSpecification instance
//			 * @throws IllegalArgumentException if required fields are not set
//			 */
//			public SyncToolSpecification build() {
//				Assert.notNull(tool, "Tool must not be null");
//				Assert.notNull(callHandler, "CallTool function must not be null");
//
//				return new SyncToolSpecification(tool, null, callHandler);
//			}
//
//		}
//
//		/**
//		 * Creates a new builder instance.
//		 * @return a new Builder instance
//		 */
//		public static Builder builder() {
//			return new Builder();
//		}
//	}
	public final static class SyncToolSpecification {
	    private final McpSchema.Tool tool;
	    @Deprecated
	    private final BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> call;
	    private final BiFunction<McpSyncServerExchange, CallToolRequest, McpSchema.CallToolResult> callHandler;

	    // --------------- 主构造器 ---------------
	    public SyncToolSpecification(
	        McpSchema.Tool tool,
	        @Deprecated BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> call,
	        BiFunction<McpSyncServerExchange, CallToolRequest, McpSchema.CallToolResult> callHandler
	    ) {
	        this.tool = tool;
	        this.call = call;
	        this.callHandler = callHandler;
	    }

	    // --------------- 过时构造器（兼容旧版）---------------
	    @Deprecated
	    public SyncToolSpecification(
	        McpSchema.Tool tool,
	        BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> call
	    ) {
	        // 委托给主构造器，转换参数类型
	        this(tool, call, (exchange, toolReq) -> call.apply(exchange, toolReq.arguments()));
	    }

	    // --------------- 字段访问方法 ---------------
	    public McpSchema.Tool tool() {
	        return tool;
	    }

	    @Deprecated
	    public BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> call() {
	        return call;
	    }

	    public BiFunction<McpSyncServerExchange, CallToolRequest, McpSchema.CallToolResult> callHandler() {
	        return callHandler;
	    }

	    // --------------- Builder 模式 ---------------
	    public final static class Builder {
	        private McpSchema.Tool tool;
	        private BiFunction<McpSyncServerExchange, CallToolRequest, McpSchema.CallToolResult> callHandler;

	        public Builder tool(McpSchema.Tool tool) {
	            this.tool = tool;
	            return this;
	        }

	        public Builder callHandler(
	            BiFunction<McpSyncServerExchange, CallToolRequest, McpSchema.CallToolResult> callHandler
	        ) {
	            this.callHandler = callHandler;
	            return this;
	        }

	        public SyncToolSpecification build() {
	            // 保留原空值检查逻辑
	            Assert.notNull(tool, "Tool must not be null");
	            Assert.notNull(callHandler, "CallTool function must not be null");
	            return new SyncToolSpecification(tool, null, callHandler);
	        }
	    }

	    public static Builder builder() {
	        return new Builder();
	    }

	    // --------------- 相等性与哈希值 ---------------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        SyncToolSpecification that = (SyncToolSpecification) o;
	        return Objects.equals(tool, that.tool) &&
	               Objects.equals(call, that.call) &&
	               Objects.equals(callHandler, that.callHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(tool, call, callHandler);
	    }

	    @Override
	    public String toString() {
	        return "SyncToolSpecification{" +
	               "tool=" + tool +
	               ", call=" + call +
	               ", callHandler=" + callHandler +
	               '}';
	    }
	}

	/**
	 * Specification of a resource with its synchronous handler function. Resources
	 * provide context to AI models by exposing data such as:
	 * <ul>
	 * <li>File contents
	 * <li>Database records
	 * <li>API responses
	 * <li>System information
	 * <li>Application state
	 * </ul>
	 *
	 * <p>
	 * Example resource specification:
	 *
	 * <pre>{@code
	 * new McpServerFeatures.SyncResourceSpecification(
	 * 		new Resource("docs", "Documentation files", "text/markdown"),
	 * 		(exchange, request) -> {
	 * 			String content = readFile(request.getPath());
	 * 			return new ReadResourceResult(content);
	 * 		})
	 * }</pre>
	 *
	 * @param resource The resource definition including name, description, and MIME type
	 * @param readHandler The function that handles resource read requests. The function's
	 * first argument is an {@link McpSyncServerExchange} upon which the server can
	 * interact with the connected client. The second arguments is a
	 * {@link net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.ReadResourceRequest}.
	 */
//	public record SyncResourceSpecification(McpSchema.Resource resource,
//			BiFunction<McpSyncServerExchange, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler) {
//	}
	public final static class SyncResourceSpecification {
	    private final McpSchema.Resource resource;
	    private final BiFunction<McpSyncServerExchange, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler;

	    // 构造器
	    public SyncResourceSpecification(
	        McpSchema.Resource resource,
	        BiFunction<McpSyncServerExchange, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler
	    ) {
	        this.resource = Objects.requireNonNull(resource, "Resource must not be null");
	        this.readHandler = Objects.requireNonNull(readHandler, "Read handler must not be null");
	    }

	    // 字段访问方法
	    public McpSchema.Resource resource() {
	        return resource;
	    }

	    public BiFunction<McpSyncServerExchange, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler() {
	        return readHandler;
	    }

	    // 相等性与哈希值
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        SyncResourceSpecification that = (SyncResourceSpecification) o;
	        return Objects.equals(resource, that.resource) &&
	               Objects.equals(readHandler, that.readHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(resource, readHandler);
	    }

	    @Override
	    public String toString() {
	        return "SyncResourceSpecification{" +
	               "resource=" + resource +
	               ", readHandler=" + readHandler +
	               '}';
	    }
	}

	/**
	 * Specification of a prompt template with its synchronous handler function. Prompts
	 * provide structured templates for AI model interactions, supporting:
	 * <ul>
	 * <li>Consistent message formatting
	 * <li>Parameter substitution
	 * <li>Context injection
	 * <li>Response formatting
	 * <li>Instruction templating
	 * </ul>
	 *
	 * <p>
	 * Example prompt specification:
	 *
	 * <pre>{@code
	 * new McpServerFeatures.SyncPromptSpecification(
	 * 		new Prompt("analyze", "Code analysis template"),
	 * 		(exchange, request) -> {
	 * 			String code = request.getArguments().get("code");
	 * 			return new GetPromptResult(
	 * 					"Analyze this code:\n\n" + code + "\n\nProvide feedback on:");
	 * 		})
	 * }</pre>
	 *
	 * @param prompt The prompt definition including name and description
	 * @param promptHandler The function that processes prompt requests and returns
	 * formatted templates. The function's first argument is an
	 * {@link McpSyncServerExchange} upon which the server can interact with the connected
	 * client. The second arguments is a
	 * {@link net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.GetPromptRequest}.
	 */
//	public record SyncPromptSpecification(McpSchema.Prompt prompt,
//			BiFunction<McpSyncServerExchange, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler) {
//	}
	public final static class SyncPromptSpecification {
	    private final McpSchema.Prompt prompt;
	    private final BiFunction<McpSyncServerExchange, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler;

	    // 构造器
	    public SyncPromptSpecification(
	        McpSchema.Prompt prompt,
	        BiFunction<McpSyncServerExchange, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler
	    ) {
	        this.prompt = Objects.requireNonNull(prompt, "Prompt must not be null");
	        this.promptHandler = Objects.requireNonNull(promptHandler, "Prompt handler must not be null");
	    }

	    // 字段访问方法
	    public McpSchema.Prompt prompt() {
	        return prompt;
	    }

	    public BiFunction<McpSyncServerExchange, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler() {
	        return promptHandler;
	    }

	    // 相等性与哈希值
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        SyncPromptSpecification that = (SyncPromptSpecification) o;
	        return Objects.equals(prompt, that.prompt) &&
	               Objects.equals(promptHandler, that.promptHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(prompt, promptHandler);
	    }

	    @Override
	    public String toString() {
	        return "SyncPromptSpecification{" +
	               "prompt=" + prompt +
	               ", promptHandler=" + promptHandler +
	               '}';
	    }
	}

	/**
	 * Specification of a completion handler function with synchronous execution support.
	 *
	 * @param referenceKey The unique key representing the completion reference.
	 * @param completionHandler The synchronous function that processes completion
	 * requests and returns results. The first argument is an
	 * {@link McpSyncServerExchange} used to interact with the client. The second argument
	 * is a {@link net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.CompleteRequest}.
	 */
//	public record SyncCompletionSpecification(McpSchema.CompleteReference referenceKey,
//			BiFunction<McpSyncServerExchange, McpSchema.CompleteRequest, McpSchema.CompleteResult> completionHandler) {
//	}
	public final static class SyncCompletionSpecification {
	    private final McpSchema.CompleteReference referenceKey;
	    private final BiFunction<McpSyncServerExchange, McpSchema.CompleteRequest, McpSchema.CompleteResult> completionHandler;

	    // 构造器
	    public SyncCompletionSpecification(
	        McpSchema.CompleteReference referenceKey,
	        BiFunction<McpSyncServerExchange, McpSchema.CompleteRequest, McpSchema.CompleteResult> completionHandler
	    ) {
	        this.referenceKey = Objects.requireNonNull(referenceKey, "Reference key must not be null");
	        this.completionHandler = Objects.requireNonNull(completionHandler, "Completion handler must not be null");
	    }

	    // 字段访问方法
	    public McpSchema.CompleteReference referenceKey() {
	        return referenceKey;
	    }

	    public BiFunction<McpSyncServerExchange, McpSchema.CompleteRequest, McpSchema.CompleteResult> completionHandler() {
	        return completionHandler;
	    }

	    // 相等性与哈希值
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        SyncCompletionSpecification that = (SyncCompletionSpecification) o;
	        return Objects.equals(referenceKey, that.referenceKey) &&
	               Objects.equals(completionHandler, that.completionHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(referenceKey, completionHandler);
	    }

	    @Override
	    public String toString() {
	        return "SyncCompletionSpecification{" +
	               "referenceKey=" + referenceKey +
	               ", completionHandler=" + completionHandler +
	               '}';
	    }
	}

}
