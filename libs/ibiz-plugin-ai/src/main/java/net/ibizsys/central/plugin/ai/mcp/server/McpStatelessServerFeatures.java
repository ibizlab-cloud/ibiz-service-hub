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
import java.util.function.BiFunction;

import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.CallToolRequest;
import net.ibizsys.central.plugin.ai.mcp.util.Utils;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * MCP stateless server features specification that a particular server can choose to
 * support.
 *
 * @author Dariusz Jędrzejczyk
 * @author Christian Tzolov
 */
public class McpStatelessServerFeatures {

//	/**
//	 * Asynchronous server features specification.
//	 *
//	 * @param serverInfo The server implementation details
//	 * @param serverCapabilities The server capabilities
//	 * @param tools The list of tool specifications
//	 * @param resources The map of resource specifications
//	 * @param resourceTemplates The list of resource templates
//	 * @param prompts The map of prompt specifications
//	 * @param instructions The server instructions text
//	 */
//	record Async(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
//			List<McpStatelessServerFeatures.AsyncToolSpecification> tools,
//			Map<String, AsyncResourceSpecification> resources, List<McpSchema.ResourceTemplate> resourceTemplates,
//			Map<String, McpStatelessServerFeatures.AsyncPromptSpecification> prompts,
//			Map<McpSchema.CompleteReference, McpStatelessServerFeatures.AsyncCompletionSpecification> completions,
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
//		 * @param instructions The server instructions text
//		 */
//		Async(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
//				List<McpStatelessServerFeatures.AsyncToolSpecification> tools,
//				Map<String, AsyncResourceSpecification> resources, List<McpSchema.ResourceTemplate> resourceTemplates,
//				Map<String, McpStatelessServerFeatures.AsyncPromptSpecification> prompts,
//				Map<McpSchema.CompleteReference, McpStatelessServerFeatures.AsyncCompletionSpecification> completions,
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
//			List<McpStatelessServerFeatures.AsyncToolSpecification> tools = new ArrayList<>();
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
//			Map<McpSchema.CompleteReference, McpStatelessServerFeatures.AsyncCompletionSpecification> completions = new HashMap<>();
//			syncSpec.completions().forEach((key, completion) -> {
//				completions.put(key, AsyncCompletionSpecification.fromSync(completion, immediateExecution));
//			});
//
//			return new Async(syncSpec.serverInfo(), syncSpec.serverCapabilities(), tools, resources,
//					syncSpec.resourceTemplates(), prompts, completions, syncSpec.instructions());
//		}
//	}
	public final static class Async {
	    // ---------- 不可变字段声明 ----------
	    private final McpSchema.Implementation serverInfo;
	    private final McpSchema.ServerCapabilities serverCapabilities;
	    private final List<McpStatelessServerFeatures.AsyncToolSpecification> tools;
	    private final Map<String, AsyncResourceSpecification> resources;
	    private final List<McpSchema.ResourceTemplate> resourceTemplates;
	    private final Map<String, McpStatelessServerFeatures.AsyncPromptSpecification> prompts;
	    private final Map<McpSchema.CompleteReference, McpStatelessServerFeatures.AsyncCompletionSpecification> completions;
	    private final String instructions;

	    // ---------- 构造器（参数校验与默认值逻辑） ----------
	    public Async(
	        McpSchema.Implementation serverInfo,
	        McpSchema.ServerCapabilities serverCapabilities,
	        List<McpStatelessServerFeatures.AsyncToolSpecification> tools,
	        Map<String, AsyncResourceSpecification> resources,
	        List<McpSchema.ResourceTemplate> resourceTemplates,
	        Map<String, McpStatelessServerFeatures.AsyncPromptSpecification> prompts,
	        Map<McpSchema.CompleteReference, McpStatelessServerFeatures.AsyncCompletionSpecification> completions,
	        String instructions
	    ) {
	        // 空值校验（JDK 8 兼容）
	        if (serverInfo == null) {
	            throw new IllegalArgumentException("Server info must not be null");
	        }
	        this.serverInfo = serverInfo;

	        // 默认能力配置（替换 Java 9+ 的 List.of/Map.of）
	        this.serverCapabilities = (serverCapabilities != null) ? serverCapabilities :
	            new McpSchema.ServerCapabilities(
	                null,
	                null,
	                new McpSchema.ServerCapabilities.LoggingCapabilities(),
	                (!Utils.isEmpty(prompts)) ? new McpSchema.ServerCapabilities.PromptCapabilities(false) : null,
	                (!Utils.isEmpty(resources)) ? new McpSchema.ServerCapabilities.ResourceCapabilities(false, false) : null,
	                (!Utils.isEmpty(tools)) ? new McpSchema.ServerCapabilities.ToolCapabilities(false) : null
	            );

	        // 空集合防御（使用 Collections.emptyList 替代 List.of）
	        this.tools = (tools != null) ? tools : Collections.emptyList();
	        this.resources = (resources != null) ? resources : Collections.emptyMap();
	        this.resourceTemplates = (resourceTemplates != null) ? resourceTemplates : Collections.emptyList();
	        this.prompts = (prompts != null) ? prompts : Collections.emptyMap();
	        this.completions = (completions != null) ? completions : Collections.emptyMap();
	        this.instructions = instructions;
	    }

	    // ---------- 字段访问方法（遵循 Record 命名风格） ----------
	    public McpSchema.Implementation serverInfo() {
	        return serverInfo;
	    }

	    public McpSchema.ServerCapabilities serverCapabilities() {
	        return serverCapabilities;
	    }

	    public List<McpStatelessServerFeatures.AsyncToolSpecification> tools() {
	        return tools;
	    }

	    public Map<String, AsyncResourceSpecification> resources() {
	        return resources;
	    }

	    public List<McpSchema.ResourceTemplate> resourceTemplates() {
	        return resourceTemplates;
	    }

	    public Map<String, McpStatelessServerFeatures.AsyncPromptSpecification> prompts() {
	        return prompts;
	    }

	    public Map<McpSchema.CompleteReference, McpStatelessServerFeatures.AsyncCompletionSpecification> completions() {
	        return completions;
	    }

	    public String instructions() {
	        return instructions;
	    }

	    // ---------- 关键方法：同步转异步（JDK 8 流式改写） ----------
	    public static Async fromSync(Sync syncSpec, boolean immediateExecution) {
	        // 工具转换（显式类型替代 var）
	        List<McpStatelessServerFeatures.AsyncToolSpecification> tools = new ArrayList<>();
	        for (McpStatelessServerFeatures.SyncToolSpecification tool : syncSpec.tools()) {
	            tools.add(AsyncToolSpecification.fromSync(tool, immediateExecution));
	        }

	        // 资源转换（匿名内部类替代 Lambda）
	        Map<String, AsyncResourceSpecification> resources = new HashMap<>();
	        for (Map.Entry<String, SyncResourceSpecification> entry : syncSpec.resources().entrySet()) {
	            resources.put(entry.getKey(), AsyncResourceSpecification.fromSync(entry.getValue(), immediateExecution));
	        }

	        // 提示转换
	        Map<String, AsyncPromptSpecification> prompts = new HashMap<>();
	        for (Map.Entry<String, SyncPromptSpecification> entry : syncSpec.prompts().entrySet()) {
	            prompts.put(entry.getKey(), AsyncPromptSpecification.fromSync(entry.getValue(), immediateExecution));
	        }

	        // 补全转换
	        Map<McpSchema.CompleteReference, AsyncCompletionSpecification> completions = new HashMap<>();
	        for (Map.Entry<McpSchema.CompleteReference, SyncCompletionSpecification> entry : syncSpec.completions().entrySet()) {
	            completions.put(entry.getKey(), AsyncCompletionSpecification.fromSync(entry.getValue(), immediateExecution));
	        }

	        return new Async(
	            syncSpec.serverInfo(),
	            syncSpec.serverCapabilities(),
	            tools,
	            resources,
	            syncSpec.resourceTemplates(),
	            prompts,
	            completions,
	            syncSpec.instructions()
	        );
	    }

	    // ---------- 不可变性保障（重写 equals/hashCode/toString） ----------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Async that = (Async) o;
	        return Objects.equals(serverInfo, that.serverInfo) &&
	               Objects.equals(serverCapabilities, that.serverCapabilities) &&
	               Objects.equals(tools, that.tools) &&
	               Objects.equals(resources, that.resources) &&
	               Objects.equals(resourceTemplates, that.resourceTemplates) &&
	               Objects.equals(prompts, that.prompts) &&
	               Objects.equals(completions, that.completions) &&
	               Objects.equals(instructions, that.instructions);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(
	            serverInfo, serverCapabilities, tools, resources,
	            resourceTemplates, prompts, completions, instructions
	        );
	    }

	    @Override
	    public String toString() {
	        return "Async[" +
	               "serverInfo=" + serverInfo +
	               ", serverCapabilities=" + serverCapabilities +
	               ", tools=" + tools +
	               ", resources=" + resources +
	               ", resourceTemplates=" + resourceTemplates +
	               ", prompts=" + prompts +
	               ", completions=" + completions +
	               ", instructions='" + instructions + '\'' +
	               ']';
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
	 * @param instructions The server instructions text
	 */
//	record Sync(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
//			List<McpStatelessServerFeatures.SyncToolSpecification> tools,
//			Map<String, McpStatelessServerFeatures.SyncResourceSpecification> resources,
//			List<McpSchema.ResourceTemplate> resourceTemplates,
//			Map<String, McpStatelessServerFeatures.SyncPromptSpecification> prompts,
//			Map<McpSchema.CompleteReference, McpStatelessServerFeatures.SyncCompletionSpecification> completions,
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
//		 * @param instructions The server instructions text
//		 */
//		Sync(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
//				List<McpStatelessServerFeatures.SyncToolSpecification> tools,
//				Map<String, McpStatelessServerFeatures.SyncResourceSpecification> resources,
//				List<McpSchema.ResourceTemplate> resourceTemplates,
//				Map<String, McpStatelessServerFeatures.SyncPromptSpecification> prompts,
//				Map<McpSchema.CompleteReference, McpStatelessServerFeatures.SyncCompletionSpecification> completions,
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
//			this.instructions = instructions;
//		}
//
//	}
	public final static class Sync {
	    // ---------- 不可变字段声明 ----------
	    private final McpSchema.Implementation serverInfo;
	    private final McpSchema.ServerCapabilities serverCapabilities;
	    private final List<McpStatelessServerFeatures.SyncToolSpecification> tools;
	    private final Map<String, McpStatelessServerFeatures.SyncResourceSpecification> resources;
	    private final List<McpSchema.ResourceTemplate> resourceTemplates;
	    private final Map<String, McpStatelessServerFeatures.SyncPromptSpecification> prompts;
	    private final Map<McpSchema.CompleteReference, McpStatelessServerFeatures.SyncCompletionSpecification> completions;
	    private final String instructions;

	    // ---------- 构造器（参数校验与默认值逻辑） ----------
	    public Sync(
	        McpSchema.Implementation serverInfo,
	        McpSchema.ServerCapabilities serverCapabilities,
	        List<McpStatelessServerFeatures.SyncToolSpecification> tools,
	        Map<String, McpStatelessServerFeatures.SyncResourceSpecification> resources,
	        List<McpSchema.ResourceTemplate> resourceTemplates,
	        Map<String, McpStatelessServerFeatures.SyncPromptSpecification> prompts,
	        Map<McpSchema.CompleteReference, McpStatelessServerFeatures.SyncCompletionSpecification> completions,
	        String instructions
	    ) {
	        // 1. 非空校验（JDK 8 兼容）
	        if (serverInfo == null) {
	            throw new IllegalArgumentException("Server info must not be null");
	        }
	        this.serverInfo = serverInfo;

	        // 2. 默认能力配置（替代 record 的默认值逻辑）
	        this.serverCapabilities = (serverCapabilities != null) ? serverCapabilities :
	            new McpSchema.ServerCapabilities(
	                null, // completions
	                null, // experimental
	                new McpSchema.ServerCapabilities.LoggingCapabilities(), // 默认启用日志
	                (prompts != null && !prompts.isEmpty()) 
	                    ? new McpSchema.ServerCapabilities.PromptCapabilities(false) : null,
	                (resources != null && !resources.isEmpty()) 
	                    ? new McpSchema.ServerCapabilities.ResourceCapabilities(false, false) : null,
	                (tools != null && !tools.isEmpty()) 
	                    ? new McpSchema.ServerCapabilities.ToolCapabilities(false) : null
	            );

	        // 3. 空集合防御（使用 JDK 8 兼容的空集合）
	        this.tools = (tools != null) ? tools : new ArrayList<>();
	        this.resources = (resources != null) ? resources : new HashMap<>();
	        this.resourceTemplates = (resourceTemplates != null) ? resourceTemplates : new ArrayList<>();
	        this.prompts = (prompts != null) ? prompts : new HashMap<>();
	        this.completions = (completions != null) ? completions : new HashMap<>();
	        this.instructions = instructions;
	    }

	    // ---------- 字段访问方法（模拟 record 的组件访问器） ----------
	    public McpSchema.Implementation serverInfo() {
	        return serverInfo;
	    }

	    public McpSchema.ServerCapabilities serverCapabilities() {
	        return serverCapabilities;
	    }

	    public List<McpStatelessServerFeatures.SyncToolSpecification> tools() {
	        return tools;
	    }

	    public Map<String, McpStatelessServerFeatures.SyncResourceSpecification> resources() {
	        return resources;
	    }

	    public List<McpSchema.ResourceTemplate> resourceTemplates() {
	        return resourceTemplates;
	    }

	    public Map<String, McpStatelessServerFeatures.SyncPromptSpecification> prompts() {
	        return prompts;
	    }

	    public Map<McpSchema.CompleteReference, McpStatelessServerFeatures.SyncCompletionSpecification> completions() {
	        return completions;
	    }

	    public String instructions() {
	        return instructions;
	    }

	    // ---------- 不可变性保障（手动实现 equals/hashCode/toString） ----------
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
	               Objects.equals(instructions, sync.instructions);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(
	            serverInfo, serverCapabilities, tools, resources,
	            resourceTemplates, prompts, completions, instructions
	        );
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
	 * @param callHandler The function that implements the tool's logic, receiving a
	 * {@link CallToolRequest} and returning the result.
	 */
//	public record AsyncToolSpecification(McpSchema.Tool tool,
//			BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler) {
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
//			BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler = (ctx,
//					req) -> {
//				var toolResult = Mono.fromCallable(() -> syncToolSpec.callHandler().apply(ctx, req));
//				return immediate ? toolResult : toolResult.subscribeOn(Schedulers.boundedElastic());
//			};
//
//			return new AsyncToolSpecification(syncToolSpec.tool(), callHandler);
//		}
//
//		/**
//		 * Builder for creating AsyncToolSpecification instances.
//		 */
//		public static class Builder {
//
//			private McpSchema.Tool tool;
//
//			private BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler;
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
//					BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler) {
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
//				return new AsyncToolSpecification(tool, callHandler);
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
	    // ---------- 不可变字段 ----------
	    private final McpSchema.Tool tool;
	    private final BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler;

	    // ---------- 构造器 ----------
	    public AsyncToolSpecification(
	        McpSchema.Tool tool,
	        BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler
	    ) {
	        this.tool = Objects.requireNonNull(tool, "Tool must not be null");
	        this.callHandler = Objects.requireNonNull(callHandler, "Call handler must not be null");
	    }

	    // ---------- 字段访问方法（模拟 Record 风格） ----------
	    public McpSchema.Tool tool() {
	        return tool;
	    }

	    public BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler() {
	        return callHandler;
	    }

	    // ---------- 核心方法：同步转异步 ----------
	    public static AsyncToolSpecification fromSync(SyncToolSpecification syncToolSpec) {
	        return fromSync(syncToolSpec, false);
	    }

	    public static AsyncToolSpecification fromSync(SyncToolSpecification syncToolSpec, boolean immediate) {
	        // 防御性校验（替代原 FIXME 逻辑）
	        if (syncToolSpec == null) {
	            throw new IllegalArgumentException("SyncToolSpecification cannot be null");
	        }

	        // 构建异步处理器（显式类型替代 var）
	        BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> asyncHandler = 
	            (ctx, req) -> {
	                // 包装同步调用
	                Mono<McpSchema.CallToolResult> toolResult = Mono.fromCallable(() -> 
	                    syncToolSpec.callHandler().apply(ctx, req)
	                );
	                // 调度策略选择
	                return immediate ? toolResult : toolResult.subscribeOn(Schedulers.boundedElastic());
	            };

	        return new AsyncToolSpecification(syncToolSpec.tool(), asyncHandler);
	    }

	    // ---------- 建造者模式（不变） ----------
	    public static class Builder {
	        private McpSchema.Tool tool;
	        private BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler;

	        public Builder tool(McpSchema.Tool tool) {
	            this.tool = tool;
	            return this;
	        }

	        public Builder callHandler(
	            BiFunction<McpTransportContext, CallToolRequest, Mono<McpSchema.CallToolResult>> callHandler
	        ) {
	            this.callHandler = callHandler;
	            return this;
	        }

	        public AsyncToolSpecification build() {
	            // 空校验（JDK 8 兼容）
	            if (tool == null) {
	                throw new IllegalStateException("Tool must not be null");
	            }
	            if (callHandler == null) {
	                throw new IllegalStateException("Call handler function must not be null");
	            }
	            return new AsyncToolSpecification(tool, callHandler);
	        }
	    }

	    public static Builder builder() {
	        return new Builder();
	    }

	    // ---------- 值语义支持（手动实现 Record 特性） ----------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        AsyncToolSpecification that = (AsyncToolSpecification) o;
	        return Objects.equals(tool, that.tool) &&
	               Objects.equals(callHandler, that.callHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(tool, callHandler);
	    }

	    @Override
	    public String toString() {
	        return "AsyncToolSpecification[" +
	               "tool=" + tool +
	               ", callHandler=" + callHandler +
	               ']';
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
	 * @param resource The resource definition including name, description, and MIME type
	 * @param readHandler The function that handles resource read requests. The function's
	 * argument is a {@link McpSchema.ReadResourceRequest}.
	 */
//	public record AsyncResourceSpecification(McpSchema.Resource resource,
//			BiFunction<McpTransportContext, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler) {
//
//		static AsyncResourceSpecification fromSync(SyncResourceSpecification resource, boolean immediateExecution) {
//			// FIXME: This is temporary, proper validation should be implemented
//			if (resource == null) {
//				return null;
//			}
//			return new AsyncResourceSpecification(resource.resource(), (ctx, req) -> {
//				var resourceResult = Mono.fromCallable(() -> resource.readHandler().apply(ctx, req));
//				return immediateExecution ? resourceResult : resourceResult.subscribeOn(Schedulers.boundedElastic());
//			});
//		}
//	}
	public final static class AsyncResourceSpecification {
	    // ---------- 不可变字段 ----------
	    private final McpSchema.Resource resource;
	    private final BiFunction<McpTransportContext, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler;

	    // ---------- 构造器 ----------
	    public AsyncResourceSpecification(
	        McpSchema.Resource resource,
	        BiFunction<McpTransportContext, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler
	    ) {
	        this.resource = resource;
	        this.readHandler = readHandler;
	    }

	    // ---------- 字段访问方法（模拟 Record 风格） ----------
	    public McpSchema.Resource resource() {
	        return resource;
	    }

	    public BiFunction<McpTransportContext, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler() {
	        return readHandler;
	    }

	    // ---------- 核心方法：同步转异步 ----------
	    public static AsyncResourceSpecification fromSync(SyncResourceSpecification resource, boolean immediateExecution) {
	        // 防御性校验（替代原 FIXME 逻辑）
	        if (resource == null) {
	            throw new IllegalArgumentException("SyncResourceSpecification cannot be null");
	        }

	        // 构建异步处理器（显式类型替代 var）
	        BiFunction<McpTransportContext, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> asyncHandler = 
	            (ctx, req) -> {
	                // 包装同步调用
	                Mono<McpSchema.ReadResourceResult> resourceResult = Mono.fromCallable(() -> 
	                    resource.readHandler().apply(ctx, req)
	                );
	                // 调度策略选择
	                return immediateExecution ? resourceResult : resourceResult.subscribeOn(Schedulers.boundedElastic());
	            };

	        return new AsyncResourceSpecification(resource.resource(), asyncHandler);
	    }

	    // ---------- 值语义支持（手动实现 Record 特性） ----------
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
	        return "AsyncResourceSpecification[" +
	               "resource=" + resource +
	               ", readHandler=" + readHandler +
	               ']';
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
	 * @param prompt The prompt definition including name and description
	 * @param promptHandler The function that processes prompt requests and returns
	 * formatted templates. The function's argument is a
	 * {@link McpSchema.GetPromptRequest}.
	 */
//	public record AsyncPromptSpecification(McpSchema.Prompt prompt,
//			BiFunction<McpTransportContext, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler) {
//
//		static AsyncPromptSpecification fromSync(SyncPromptSpecification prompt, boolean immediateExecution) {
//			// FIXME: This is temporary, proper validation should be implemented
//			if (prompt == null) {
//				return null;
//			}
//			return new AsyncPromptSpecification(prompt.prompt(), (ctx, req) -> {
//				var promptResult = Mono.fromCallable(() -> prompt.promptHandler().apply(ctx, req));
//				return immediateExecution ? promptResult : promptResult.subscribeOn(Schedulers.boundedElastic());
//			});
//		}
//	}
	public final static class AsyncPromptSpecification {
	    // ---------- 不可变字段 ----------
	    private final McpSchema.Prompt prompt;
	    private final BiFunction<McpTransportContext, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler;

	    // ---------- 构造器（增强防御性校验） ----------
	    public AsyncPromptSpecification(
	        McpSchema.Prompt prompt,
	        BiFunction<McpTransportContext, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler
	    ) {
	        this.prompt = Objects.requireNonNull(prompt, "Prompt must not be null");
	        this.promptHandler = Objects.requireNonNull(promptHandler, "Prompt handler must not be null");
	    }

	    // ---------- 字段访问方法（模拟 Record 风格） ----------
	    public McpSchema.Prompt prompt() {
	        return prompt;
	    }

	    public BiFunction<McpTransportContext, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler() {
	        return promptHandler;
	    }

	    // ---------- 核心方法：同步转异步（修复空指针风险） ----------
	    public static AsyncPromptSpecification fromSync(SyncPromptSpecification promptSpec, boolean immediateExecution) {
	        // 防御性校验（替代原 FIXME 逻辑）
	        if (promptSpec == null) {
	            throw new IllegalArgumentException("SyncPromptSpecification cannot be null");
	        }

	        // 构建异步处理器（显式类型替代 var）
	        BiFunction<McpTransportContext, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> asyncHandler = 
	            (ctx, req) -> {
	                // 包装同步调用
	                Mono<McpSchema.GetPromptResult> result = Mono.fromCallable(() -> 
	                    promptSpec.promptHandler().apply(ctx, req)
	                );
	                // 调度策略选择
	                return immediateExecution ? result : result.subscribeOn(Schedulers.boundedElastic());
	            };

	        return new AsyncPromptSpecification(promptSpec.prompt(), asyncHandler);
	    }

	    // ---------- 值语义支持（手动实现 Record 特性） ----------
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
	        return "AsyncPromptSpecification[" +
	               "prompt=" + prompt +
	               ", promptHandler=" + promptHandler +
	               ']';
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
	 * requests and returns results. The function's argument is a
	 * {@link McpSchema.CompleteRequest}.
	 */
//	public record AsyncCompletionSpecification(McpSchema.CompleteReference referenceKey,
//			BiFunction<McpTransportContext, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler) {
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
//			return new AsyncCompletionSpecification(completion.referenceKey(), (ctx, req) -> {
//				var completionResult = Mono.fromCallable(() -> completion.completionHandler().apply(ctx, req));
//				return immediateExecution ? completionResult
//						: completionResult.subscribeOn(Schedulers.boundedElastic());
//			});
//		}
//	}
	public final static class AsyncCompletionSpecification {
	    // ---------- 不可变字段 ----------
	    private final McpSchema.CompleteReference referenceKey;
	    private final BiFunction<McpTransportContext, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler;

	    // ---------- 构造器（增强防御性校验） ----------
	    public AsyncCompletionSpecification(
	        McpSchema.CompleteReference referenceKey,
	        BiFunction<McpTransportContext, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler
	    ) {
	        this.referenceKey = Objects.requireNonNull(referenceKey, "Reference key must not be null");
	        this.completionHandler = Objects.requireNonNull(completionHandler, "Completion handler must not be null");
	    }

	    // ---------- 字段访问方法（模拟 Record 风格） ----------
	    public McpSchema.CompleteReference referenceKey() {
	        return referenceKey;
	    }

	    public BiFunction<McpTransportContext, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> completionHandler() {
	        return completionHandler;
	    }

	    // ---------- 核心方法：同步转异步 ----------
	    public static AsyncCompletionSpecification fromSync(
	        SyncCompletionSpecification completion, 
	        boolean immediateExecution
	    ) {
	        // 防御性校验（防止空指针风险）
	        if (completion == null) {
	            throw new IllegalArgumentException("SyncCompletionSpecification cannot be null");
	        }

	        // 构建异步处理器（显式类型替代 var）
	        BiFunction<McpTransportContext, McpSchema.CompleteRequest, Mono<McpSchema.CompleteResult>> asyncHandler = 
	            (ctx, req) -> {
	                // 包装同步调用
	                Mono<McpSchema.CompleteResult> result = Mono.fromCallable(() -> 
	                    completion.completionHandler().apply(ctx, req)
	                );
	                // 调度策略选择
	                return immediateExecution ? result : result.subscribeOn(Schedulers.boundedElastic());
	            };

	        return new AsyncCompletionSpecification(completion.referenceKey(), asyncHandler);
	    }

	    // ---------- 值语义支持（手动实现 Record 特性） ----------
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
	        return "AsyncCompletionSpecification[" +
	               "referenceKey=" + referenceKey +
	               ", completionHandler=" + completionHandler +
	               ']';
	    }
	}

	/**
	 * Specification of a tool with its synchronous handler function. Tools are the
	 * primary way for MCP servers to expose functionality to AI models.
	 *
	 * @param tool The tool definition including name, description, and parameter schema
	 * @param callHandler The function that implements the tool's logic, receiving a
	 * {@link CallToolRequest} and returning results.
	 */
//	public record SyncToolSpecification(McpSchema.Tool tool,
//			BiFunction<McpTransportContext, CallToolRequest, McpSchema.CallToolResult> callHandler) {
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		/**
//		 * Builder for creating SyncToolSpecification instances.
//		 */
//		public static class Builder {
//
//			private McpSchema.Tool tool;
//
//			private BiFunction<McpTransportContext, CallToolRequest, McpSchema.CallToolResult> callHandler;
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
//					BiFunction<McpTransportContext, CallToolRequest, McpSchema.CallToolResult> callHandler) {
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
//				return new SyncToolSpecification(tool, callHandler);
//			}
//
//		}
//	}
	public final static class SyncToolSpecification {
	    // ---------- 不可变字段 ----------
	    private final McpSchema.Tool tool;
	    private final BiFunction<McpTransportContext, CallToolRequest, McpSchema.CallToolResult> callHandler;

	    // ---------- 构造器（增强防御性校验） ----------
	    public SyncToolSpecification(
	        McpSchema.Tool tool,
	        BiFunction<McpTransportContext, CallToolRequest, McpSchema.CallToolResult> callHandler
	    ) {
	        this.tool = Objects.requireNonNull(tool, "Tool must not be null");
	        this.callHandler = Objects.requireNonNull(callHandler, "Call handler must not be null");
	    }

	    // ---------- 字段访问方法（模拟 Record 风格） ----------
	    public McpSchema.Tool tool() {
	        return tool;
	    }

	    public BiFunction<McpTransportContext, CallToolRequest, McpSchema.CallToolResult> callHandler() {
	        return callHandler;
	    }

	    // ---------- 值语义支持（手动实现 Record 特性） ----------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        SyncToolSpecification that = (SyncToolSpecification) o;
	        return Objects.equals(tool, that.tool) &&
	               Objects.equals(callHandler, that.callHandler);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(tool, callHandler);
	    }

	    @Override
	    public String toString() {
	        return "SyncToolSpecification[" +
	               "tool=" + tool +
	               ", callHandler=" + callHandler +
	               ']';
	    }

	    // ---------- 建造者模式（保持不变） ----------
	    public final static class Builder {
	        private McpSchema.Tool tool;
	        private BiFunction<McpTransportContext, CallToolRequest, McpSchema.CallToolResult> callHandler;

	        public Builder tool(McpSchema.Tool tool) {
	            this.tool = tool;
	            return this;
	        }

	        public Builder callHandler(
	            BiFunction<McpTransportContext, CallToolRequest, McpSchema.CallToolResult> callHandler
	        ) {
	            this.callHandler = callHandler;
	            return this;
	        }

	        public SyncToolSpecification build() {
	            // 手动实现空校验（替代原 Assert.notNull）
	            if (tool == null) {
	                throw new IllegalStateException("Tool must not be null");
	            }
	            if (callHandler == null) {
	                throw new IllegalStateException("CallTool function must not be null");
	            }
	            return new SyncToolSpecification(tool, callHandler);
	        }
	    }

	    public static Builder builder() {
	        return new Builder();
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
	 * @param resource The resource definition including name, description, and MIME type
	 * @param readHandler The function that handles resource read requests. The function's
	 * argument is a {@link McpSchema.ReadResourceRequest}.
	 */
//	public record SyncResourceSpecification(McpSchema.Resource resource,
//			BiFunction<McpTransportContext, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler) {
//	}
	public final static class SyncResourceSpecification {
	    private final McpSchema.Resource resource;
	    private final BiFunction<McpTransportContext, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler;

	    // 构造器（含防御性校验）
	    public SyncResourceSpecification(
	        McpSchema.Resource resource,
	        BiFunction<McpTransportContext, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler
	    ) {
	        this.resource = Objects.requireNonNull(resource, "Resource must not be null");
	        this.readHandler = Objects.requireNonNull(readHandler, "Read handler must not be null");
	    }

	    // 字段访问方法（模拟 Record 风格）
	    public McpSchema.Resource resource() {
	        return resource;
	    }

	    public BiFunction<McpTransportContext, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler() {
	        return readHandler;
	    }

	    // 值语义支持
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
	        return "SyncResourceSpecification[" +
	               "resource=" + resource +
	               ", readHandler=" + readHandler +
	               ']';
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
	 * @param prompt The prompt definition including name and description
	 * @param promptHandler The function that processes prompt requests and returns
	 * formatted templates. The function's argument is a
	 * {@link McpSchema.GetPromptRequest}.
	 */
//	public record SyncPromptSpecification(McpSchema.Prompt prompt,
//			BiFunction<McpTransportContext, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler) {
//	}
	public final static class SyncPromptSpecification {
	    private final McpSchema.Prompt prompt;
	    private final BiFunction<McpTransportContext, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler;

	    // 构造器（含防御性校验）
	    public SyncPromptSpecification(
	        McpSchema.Prompt prompt,
	        BiFunction<McpTransportContext, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler
	    ) {
	        this.prompt = Objects.requireNonNull(prompt, "Prompt must not be null");
	        this.promptHandler = Objects.requireNonNull(promptHandler, "Prompt handler must not be null");
	    }

	    // 字段访问方法
	    public McpSchema.Prompt prompt() {
	        return prompt;
	    }

	    public BiFunction<McpTransportContext, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler() {
	        return promptHandler;
	    }

	    // 值语义支持
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
	        return "SyncPromptSpecification[" +
	               "prompt=" + prompt +
	               ", promptHandler=" + promptHandler +
	               ']';
	    }
	}

	/**
	 * Specification of a completion handler function with synchronous execution support.
	 *
	 * @param referenceKey The unique key representing the completion reference.
	 * @param completionHandler The synchronous function that processes completion
	 * requests and returns results. The argument is a {@link McpSchema.CompleteRequest}.
	 */
//	public record SyncCompletionSpecification(McpSchema.CompleteReference referenceKey,
//			BiFunction<McpTransportContext, McpSchema.CompleteRequest, McpSchema.CompleteResult> completionHandler) {
//	}
	public final static class SyncCompletionSpecification {
	    private final McpSchema.CompleteReference referenceKey;
	    private final BiFunction<McpTransportContext, McpSchema.CompleteRequest, McpSchema.CompleteResult> completionHandler;

	    // 构造器（含防御性校验）
	    public SyncCompletionSpecification(
	        McpSchema.CompleteReference referenceKey,
	        BiFunction<McpTransportContext, McpSchema.CompleteRequest, McpSchema.CompleteResult> completionHandler
	    ) {
	        this.referenceKey = Objects.requireNonNull(referenceKey, "Reference key must not be null");
	        this.completionHandler = Objects.requireNonNull(completionHandler, "Completion handler must not be null");
	    }

	    // 字段访问方法
	    public McpSchema.CompleteReference referenceKey() {
	        return referenceKey;
	    }

	    public BiFunction<McpTransportContext, McpSchema.CompleteRequest, McpSchema.CompleteResult> completionHandler() {
	        return completionHandler;
	    }

	    // 值语义支持
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
	        return "SyncCompletionSpecification[" +
	               "referenceKey=" + referenceKey +
	               ", completionHandler=" + completionHandler +
	               ']';
	    }
	}

}
