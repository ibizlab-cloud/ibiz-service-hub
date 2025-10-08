/*
 * Copyright 2024-2024 the original author or authors.
 */

package io.modelcontextprotocol.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import io.modelcontextprotocol.spec.McpSchema;
import io.modelcontextprotocol.util.Assert;
import io.modelcontextprotocol.util.Utils;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * MCP server features specification that a particular server can choose to support.
 *
 * @author Dariusz Jędrzejczyk
 */
public class McpServerFeatures {

	/**
	 * Asynchronous server features specification.
	 */
	//@Data
	public static class Async {
		McpSchema.Implementation serverInfo;
		McpSchema.ServerCapabilities serverCapabilities;
		List<McpServerFeatures.AsyncToolSpecification> tools;
		Map<String, AsyncResourceSpecification> resources;
		List<McpSchema.ResourceTemplate> resourceTemplates;
		Map<String, McpServerFeatures.AsyncPromptSpecification> prompts;
		List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootsChangeConsumers;

		/**
		 * Create an instance and validate the arguments.
		 * @param serverInfo The server implementation details
		 * @param serverCapabilities The server capabilities
		 * @param tools The list of tool specifications
		 * @param resources The map of resource specifications
		 * @param resourceTemplates The list of resource templates
		 * @param prompts The map of prompt specifications
		 * @param rootsChangeConsumers The list of consumers that will be notified when
		 * the roots list changes
		 */
		Async(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
				List<McpServerFeatures.AsyncToolSpecification> tools, Map<String, AsyncResourceSpecification> resources,
				List<McpSchema.ResourceTemplate> resourceTemplates,
				Map<String, McpServerFeatures.AsyncPromptSpecification> prompts,
				List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootsChangeConsumers) {

			Assert.notNull(serverInfo, "Server info must not be null");

			this.serverInfo = serverInfo;
			this.serverCapabilities = (serverCapabilities != null) ? serverCapabilities
					: new McpSchema.ServerCapabilities(null, // experimental
							new McpSchema.ServerCapabilities.LoggingCapabilities(), // Enable
																					// logging
																					// by
																					// default
							!Utils.isEmpty(prompts) ? new McpSchema.ServerCapabilities.PromptCapabilities(false) : null,
							!Utils.isEmpty(resources)
									? new McpSchema.ServerCapabilities.ResourceCapabilities(false, false) : null,
							!Utils.isEmpty(tools) ? new McpSchema.ServerCapabilities.ToolCapabilities(false) : null);

			this.tools = (tools != null) ? tools : Collections.emptyList();
			this.resources = (resources != null) ? resources : Collections.emptyMap();
			this.resourceTemplates = (resourceTemplates != null) ? resourceTemplates : Collections.emptyList();
			this.prompts = (prompts != null) ? prompts : Collections.emptyMap();
			this.rootsChangeConsumers = (rootsChangeConsumers != null) ? rootsChangeConsumers : Collections.emptyList();
		}
		
		// Getter/Setter方法
	    public McpSchema.Implementation getServerInfo() { return serverInfo; }
	    public void setServerInfo(McpSchema.Implementation serverInfo) { this.serverInfo = serverInfo; }
	    
	    public McpSchema.ServerCapabilities getServerCapabilities() { return serverCapabilities; }
	    public void setServerCapabilities(McpSchema.ServerCapabilities serverCapabilities) { this.serverCapabilities = serverCapabilities; }
	    
	    public List<McpServerFeatures.AsyncToolSpecification> getTools() { return tools; }
	    public void setTools(List<McpServerFeatures.AsyncToolSpecification> tools) { this.tools = tools; }
	    
	    public Map<String, AsyncResourceSpecification> getResources() { return resources; }
	    public void setResources(Map<String, AsyncResourceSpecification> resources) { this.resources = resources; }
	    
	    public List<McpSchema.ResourceTemplate> getResourceTemplates() { return resourceTemplates; }
	    public void setResourceTemplates(List<McpSchema.ResourceTemplate> resourceTemplates) { this.resourceTemplates = resourceTemplates; }
	    
	    public Map<String, McpServerFeatures.AsyncPromptSpecification> getPrompts() { return prompts; }
	    public void setPrompts(Map<String, McpServerFeatures.AsyncPromptSpecification> prompts) { this.prompts = prompts; }
	    
	    public List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> getRootsChangeConsumers() { return rootsChangeConsumers; }
	    public void setRootsChangeConsumers(List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootsChangeConsumers) { this.rootsChangeConsumers = rootsChangeConsumers; }


		/**
		 * Convert a synchronous specification into an asynchronous one and provide
		 * blocking code offloading to prevent accidental blocking of the non-blocking
		 * transport.
		 * @param syncSpec a potentially blocking, synchronous specification.
		 * @return a specification which is protected from blocking calls specified by the
		 * user.
		 */
		static Async fromSync(Sync syncSpec) {
			List<McpServerFeatures.AsyncToolSpecification> tools = new ArrayList<>();
			for (McpServerFeatures.SyncToolSpecification tool : syncSpec.getTools()) {
				tools.add(AsyncToolSpecification.fromSync(tool));
			}

			Map<String, AsyncResourceSpecification> resources = new HashMap<>();
			syncSpec.getResources().forEach((key, resource) -> {
				resources.put(key, AsyncResourceSpecification.fromSync(resource));
			});

			Map<String, AsyncPromptSpecification> prompts = new HashMap<>();
			syncSpec.getPrompts().forEach((key, prompt) -> {
				prompts.put(key, AsyncPromptSpecification.fromSync(prompt));
			});

			List<BiFunction<McpAsyncServerExchange, List<McpSchema.Root>, Mono<Void>>> rootChangeConsumers = new ArrayList<>();

			for (BiConsumer<McpSyncServerExchange, List<McpSchema.Root>> rootChangeConsumer : syncSpec.getRootsChangeConsumers()) {
				rootChangeConsumers.add((exchange, list) -> Mono
					.<Void>fromRunnable(() -> rootChangeConsumer.accept(new McpSyncServerExchange(exchange), list))
					.subscribeOn(Schedulers.boundedElastic()));
			}

			return new Async(syncSpec.getServerInfo(), syncSpec.getServerCapabilities(), tools, resources,
					syncSpec.getResourceTemplates(), prompts, rootChangeConsumers);
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
	 */
	//@Data
	public static class Sync {
		McpSchema.Implementation serverInfo;
		McpSchema.ServerCapabilities serverCapabilities;
		List<McpServerFeatures.SyncToolSpecification> tools;
		Map<String, McpServerFeatures.SyncResourceSpecification> resources;
		List<McpSchema.ResourceTemplate> resourceTemplates;
		Map<String, McpServerFeatures.SyncPromptSpecification> prompts;
		List<BiConsumer<McpSyncServerExchange, List<McpSchema.Root>>> rootsChangeConsumers;

		/**
		 * Create an instance and validate the arguments.
		 * @param serverInfo The server implementation details
		 * @param serverCapabilities The server capabilities
		 * @param tools The list of tool specifications
		 * @param resources The map of resource specifications
		 * @param resourceTemplates The list of resource templates
		 * @param prompts The map of prompt specifications
		 * @param rootsChangeConsumers The list of consumers that will be notified when
		 * the roots list changes
		 */
		Sync(McpSchema.Implementation serverInfo, McpSchema.ServerCapabilities serverCapabilities,
				List<McpServerFeatures.SyncToolSpecification> tools,
				Map<String, McpServerFeatures.SyncResourceSpecification> resources,
				List<McpSchema.ResourceTemplate> resourceTemplates,
				Map<String, McpServerFeatures.SyncPromptSpecification> prompts,
				List<BiConsumer<McpSyncServerExchange, List<McpSchema.Root>>> rootsChangeConsumers) {

			Assert.notNull(serverInfo, "Server info must not be null");

			this.serverInfo = serverInfo;
			this.serverCapabilities = (serverCapabilities != null) ? serverCapabilities
					: new McpSchema.ServerCapabilities(null, // experimental
							new McpSchema.ServerCapabilities.LoggingCapabilities(), // Enable
																					// logging
																					// by
																					// default
							!Utils.isEmpty(prompts) ? new McpSchema.ServerCapabilities.PromptCapabilities(false) : null,
							!Utils.isEmpty(resources)
									? new McpSchema.ServerCapabilities.ResourceCapabilities(false, false) : null,
							!Utils.isEmpty(tools) ? new McpSchema.ServerCapabilities.ToolCapabilities(false) : null);

			this.tools = (tools != null) ? tools : new ArrayList<>();
			this.resources = (resources != null) ? resources : new HashMap<>();
			this.resourceTemplates = (resourceTemplates != null) ? resourceTemplates : new ArrayList<>();
			this.prompts = (prompts != null) ? prompts : new HashMap<>();
			this.rootsChangeConsumers = (rootsChangeConsumers != null) ? rootsChangeConsumers : new ArrayList<>();
		}

		// ServerInfo
	    public McpSchema.Implementation getServerInfo() {
	        return serverInfo;
	    }

	    public void setServerInfo(McpSchema.Implementation serverInfo) {
	        this.serverInfo = serverInfo;
	    }

	    // ServerCapabilities
	    public McpSchema.ServerCapabilities getServerCapabilities() {
	        return serverCapabilities;
	    }

	    public void setServerCapabilities(McpSchema.ServerCapabilities serverCapabilities) {
	        this.serverCapabilities = serverCapabilities;
	    }

	    // Tools
	    public List<McpServerFeatures.SyncToolSpecification> getTools() {
	        return Collections.unmodifiableList(tools);
	    }

	    public void setTools(List<McpServerFeatures.SyncToolSpecification> tools) {
	        this.tools = tools != null ? new ArrayList<>(tools) : new ArrayList<>();
	    }

	    // Resources
	    public Map<String, McpServerFeatures.SyncResourceSpecification> getResources() {
	        return Collections.unmodifiableMap(resources);
	    }

	    public void setResources(Map<String, McpServerFeatures.SyncResourceSpecification> resources) {
	        this.resources = resources != null ? new HashMap<>(resources) : new HashMap<>();
	    }

	    // ResourceTemplates
	    public List<McpSchema.ResourceTemplate> getResourceTemplates() {
	        return Collections.unmodifiableList(resourceTemplates);
	    }

	    public void setResourceTemplates(List<McpSchema.ResourceTemplate> resourceTemplates) {
	        this.resourceTemplates = resourceTemplates != null ? new ArrayList<>(resourceTemplates) : new ArrayList<>();
	    }

	    // Prompts
	    public Map<String, McpServerFeatures.SyncPromptSpecification> getPrompts() {
	        return Collections.unmodifiableMap(prompts);
	    }

	    public void setPrompts(Map<String, McpServerFeatures.SyncPromptSpecification> prompts) {
	        this.prompts = prompts != null ? new HashMap<>(prompts) : new HashMap<>();
	    }

	    // RootsChangeConsumers
	    public List<BiConsumer<McpSyncServerExchange, List<McpSchema.Root>>> getRootsChangeConsumers() {
	        return Collections.unmodifiableList(rootsChangeConsumers);
	    }

	    public void setRootsChangeConsumers(List<BiConsumer<McpSyncServerExchange, List<McpSchema.Root>>> rootsChangeConsumers) {
	        this.rootsChangeConsumers = rootsChangeConsumers != null ? new ArrayList<>(rootsChangeConsumers) : new ArrayList<>();
	    }
	}

	/**
	 * Specification of a tool with its asynchronous handler function. Tools are the
	 * primary way for MCP servers to expose functionality to AI models. Each tool
	 * represents a specific capability, such as:
	 * <ul>
	 * <li>Performing calculations
	 * <li>Accessing external APIs
	 * <li>Querying databases
	 * <li>Manipulating files
	 * <li>Executing system commands
	 * </ul>
	 *
	 * <p>
	 * Example tool specification: <pre>{@code
	 * new McpServerFeatures.AsyncToolSpecification(
	 *     new Tool(
	 *         "calculator",
	 *         "Performs mathematical calculations",
	 *         new JsonSchemaObject()
	 *             .required("expression")
	 *             .property("expression", JsonSchemaType.STRING)
	 *     ),
	 *     (exchange, args) -> {
	 *         String expr = (String) args.get("expression");
	 *         return Mono.fromSupplier(() -> evaluate(expr))
	 *             .map(result -> new CallToolResult("Result: " + result));
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param tool The tool definition including name, description, and parameter schema
	 * @param call The function that implements the tool's logic, receiving arguments and
	 * returning results. The function's first argument is an
	 * {@link McpAsyncServerExchange} upon which the server can interact with the
	 * connected client. The second arguments is a map of tool arguments.
	 */
//	@Data
//	@NoArgsConstructor
//	@AllArgsConstructor
//	public static class AsyncToolSpecification {
//		McpSchema.Tool tool;
//		BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call;
//
//		public static AsyncToolSpecification fromSync(SyncToolSpecification tool) {
//			// FIXME: This is temporary, proper validation should be implemented
//			if (tool == null) {
//				return null;
//			}
//			return new AsyncToolSpecification(tool.getTool(),
//					(exchange, map) -> Mono
//						.fromCallable(() -> tool.getCall().apply(new McpSyncServerExchange(exchange), map))
//						.subscribeOn(Schedulers.boundedElastic()));
//		}
//	}
	public static class AsyncToolSpecification {
	   private McpSchema.Tool tool;
	    
	    private BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call;

	    // 手动添加无参构造函数
	    public AsyncToolSpecification() {}

	    // 手动添加全参构造函数
	    public AsyncToolSpecification(McpSchema.Tool tool, 
	                                  BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call) {
	        this.tool = tool;
	        this.call = call;
	    }

	    // Getter/Setter方法
	    public McpSchema.Tool getTool() { 
	        return tool; 
	    }
	    
	    public void setTool(McpSchema.Tool tool) { 
	        this.tool = tool; 
	    }
	    
	    public BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> getCall() { 
	        return call; 
	    }
	    
	    public void setCall(BiFunction<McpAsyncServerExchange, Map<String, Object>, Mono<McpSchema.CallToolResult>> call) { 
	        this.call = call; 
	    }

		public static AsyncToolSpecification fromSync(SyncToolSpecification tool) {
		// FIXME: This is temporary, proper validation should be implemented
		if (tool == null) {
			return null;
		}
		return new AsyncToolSpecification(tool.getTool(),
				(exchange, map) -> Mono
					.fromCallable(() -> tool.getCall().apply(new McpSyncServerExchange(exchange), map))
					.subscribeOn(Schedulers.boundedElastic()));
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
	 * Example resource specification: <pre>{@code
	 * new McpServerFeatures.AsyncResourceSpecification(
	 *     new Resource("docs", "Documentation files", "text/markdown"),
	 *     (exchange, request) ->
	 *         Mono.fromSupplier(() -> readFile(request.getPath()))
	 *             .map(ReadResourceResult::new)
	 * )
	 * }</pre>
	 *
	 * @param resource The resource definition including name, description, and MIME type
	 * @param readHandler The function that handles resource read requests. The function's
	 * first argument is an {@link McpAsyncServerExchange} upon which the server can
	 * interact with the connected client. The second arguments is a
	 * {@link io.modelcontextprotocol.spec.McpSchema.ReadResourceRequest}.
	 */
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class AsyncResourceSpecification {
		McpSchema.Resource resource;
		BiFunction<McpAsyncServerExchange, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler;

		 // 手动添加无参构造函数
	    public AsyncResourceSpecification() {}

	    // 手动添加全参构造函数
	    public AsyncResourceSpecification(McpSchema.Resource resource,
	                                     BiFunction<McpAsyncServerExchange, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler) {
	        this.resource = resource;
	        this.readHandler = readHandler;
	    }

	    // Getter/Setter方法
	    public McpSchema.Resource getResource() { 
	        return resource; 
	    }
	    
	    public void setResource(McpSchema.Resource resource) { 
	        this.resource = resource; 
	    }
	    
	    public BiFunction<McpAsyncServerExchange, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> getReadHandler() { 
	        return readHandler; 
	    }
	    
	    public void setReadHandler(BiFunction<McpAsyncServerExchange, McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler) { 
	        this.readHandler = readHandler; 
	    }
	    
		static AsyncResourceSpecification fromSync(SyncResourceSpecification resource) {
			// FIXME: This is temporary, proper validation should be implemented
			if (resource == null) {
				return null;
			}
			return new AsyncResourceSpecification(resource.getResource(),
					(exchange, req) -> Mono
						.fromCallable(() -> resource.getReadHandler().apply(new McpSyncServerExchange(exchange), req))
						.subscribeOn(Schedulers.boundedElastic()));
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
	 * Example prompt specification: <pre>{@code
	 * new McpServerFeatures.AsyncPromptSpecification(
	 *     new Prompt("analyze", "Code analysis template"),
	 *     (exchange, request) -> {
	 *         String code = request.getArguments().get("code");
	 *         return Mono.just(new GetPromptResult(
	 *             "Analyze this code:\n\n" + code + "\n\nProvide feedback on:"
	 *         ));
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param prompt The prompt definition including name and description
	 * @param promptHandler The function that processes prompt requests and returns
	 * formatted templates. The function's first argument is an
	 * {@link McpAsyncServerExchange} upon which the server can interact with the
	 * connected client. The second arguments is a
	 * {@link io.modelcontextprotocol.spec.McpSchema.GetPromptRequest}.
	 */
	public static class AsyncPromptSpecification {
		McpSchema.Prompt prompt;
		BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler;

		// 手动添加无参构造函数
	    public AsyncPromptSpecification() {}

	    // 手动添加全参构造函数
	    public AsyncPromptSpecification(McpSchema.Prompt prompt,
	                                     BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler) {
	        this.prompt = prompt;
	        this.promptHandler = promptHandler;
	    }

	    // Getter方法
	    public McpSchema.Prompt getPrompt() { 
	        return prompt; 
	    }
	    
	    // Setter方法（带空值检查）
	    public void setPrompt(McpSchema.Prompt prompt) { 
	        this.prompt = prompt; 
	    }
	    
	    // Getter方法
	    public BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> getPromptHandler() { 
	        return promptHandler; 
	    }
	    
	    // Setter方法（带线程安全处理）
	    public synchronized void setPromptHandler(BiFunction<McpAsyncServerExchange, McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler) {
	        this.promptHandler = promptHandler;
	    }
	    
		static AsyncPromptSpecification fromSync(SyncPromptSpecification prompt) {
			// FIXME: This is temporary, proper validation should be implemented
			if (prompt == null) {
				return null;
			}
			return new AsyncPromptSpecification(prompt.getPrompt(),
					(exchange, req) -> Mono
						.fromCallable(() -> prompt.getPromptHandler().apply(new McpSyncServerExchange(exchange), req))
						.subscribeOn(Schedulers.boundedElastic()));
		}
	}

	/**
	 * Specification of a tool with its synchronous handler function. Tools are the
	 * primary way for MCP servers to expose functionality to AI models. Each tool
	 * represents a specific capability, such as:
	 * <ul>
	 * <li>Performing calculations
	 * <li>Accessing external APIs
	 * <li>Querying databases
	 * <li>Manipulating files
	 * <li>Executing system commands
	 * </ul>
	 *
	 * <p>
	 * Example tool specification: <pre>{@code
	 * new McpServerFeatures.SyncToolSpecification(
	 *     new Tool(
	 *         "calculator",
	 *         "Performs mathematical calculations",
	 *         new JsonSchemaObject()
	 *             .required("expression")
	 *             .property("expression", JsonSchemaType.STRING)
	 *     ),
	 *     (exchange, args) -> {
	 *         String expr = (String) args.get("expression");
	 *         return new CallToolResult("Result: " + evaluate(expr));
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param tool The tool definition including name, description, and parameter schema
	 * @param call The function that implements the tool's logic, receiving arguments and
	 * returning results. The function's first argument is an
	 * {@link McpSyncServerExchange} upon which the server can interact with the connected
	 * client. The second arguments is a map of arguments passed to the tool.
	 */
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class SyncToolSpecification {
		McpSchema.Tool tool;
		BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> call;
		
		// 手动添加无参构造函数
	    public SyncToolSpecification() {}

	    // 手动添加全参构造函数
	    public SyncToolSpecification(McpSchema.Tool tool,
	                                 BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> call) {
	        this.tool = Objects.requireNonNull(tool, "Tool cannot be null");
	        this.call = Objects.requireNonNull(call, "Call handler cannot be null");
	    }

	    // Getter/Setter方法
	    public McpSchema.Tool getTool() { 
	        return tool; 
	    }
	    
	    public void setTool(McpSchema.Tool tool) { 
	        this.tool = Objects.requireNonNull(tool, "Tool cannot be null"); 
	    }
	    
	    public BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> getCall() { 
	        return call; 
	    }
	    
	    public void setCall(BiFunction<McpSyncServerExchange, Map<String, Object>, McpSchema.CallToolResult> call) { 
	        this.call = call; 
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
	 * Example resource specification: <pre>{@code
	 * new McpServerFeatures.SyncResourceSpecification(
	 *     new Resource("docs", "Documentation files", "text/markdown"),
	 *     (exchange, request) -> {
	 *         String content = readFile(request.getPath());
	 *         return new ReadResourceResult(content);
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param resource The resource definition including name, description, and MIME type
	 * @param readHandler The function that handles resource read requests. The function's
	 * first argument is an {@link McpSyncServerExchange} upon which the server can
	 * interact with the connected client. The second arguments is a
	 * {@link io.modelcontextprotocol.spec.McpSchema.ReadResourceRequest}.
	 */
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class SyncResourceSpecification {
		McpSchema.Resource resource;
		BiFunction<McpSyncServerExchange, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler;
		
		
		// 手动添加无参构造函数
	    public SyncResourceSpecification() {}

	    // 手动添加全参构造函数
	    public SyncResourceSpecification(McpSchema.Resource resource,
	                                     BiFunction<McpSyncServerExchange, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler) {
	        this.resource = Objects.requireNonNull(resource, "Resource cannot be null");
	        this.readHandler = Objects.requireNonNull(readHandler, "Read handler cannot be null");
	    }

	    // Getter/Setter方法
	    public McpSchema.Resource getResource() { 
	        return resource; 
	    }
	    
	    public void setResource(McpSchema.Resource resource) { 
	        this.resource = Objects.requireNonNull(resource, "Resource cannot be null"); 
	    }
	    
	    public BiFunction<McpSyncServerExchange, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> getReadHandler() { 
	        return readHandler; 
	    }
	    
	    public void setReadHandler(BiFunction<McpSyncServerExchange, McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler) { 
	        this.readHandler = readHandler; 
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
	 * Example prompt specification: <pre>{@code
	 * new McpServerFeatures.SyncPromptSpecification(
	 *     new Prompt("analyze", "Code analysis template"),
	 *     (exchange, request) -> {
	 *         String code = request.getArguments().get("code");
	 *         return new GetPromptResult(
	 *             "Analyze this code:\n\n" + code + "\n\nProvide feedback on:"
	 *         );
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param prompt The prompt definition including name and description
	 * @param promptHandler The function that processes prompt requests and returns
	 * formatted templates. The function's first argument is an
	 * {@link McpSyncServerExchange} upon which the server can interact with the connected
	 * client. The second arguments is a
	 * {@link io.modelcontextprotocol.spec.McpSchema.GetPromptRequest}.
	 */
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class SyncPromptSpecification {
		McpSchema.Prompt prompt;
		BiFunction<McpSyncServerExchange, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler;
		
		  // 手动添加无参构造函数
	    public SyncPromptSpecification() {}

	    // 手动添加全参构造函数
	    public SyncPromptSpecification(McpSchema.Prompt prompt,
	                                   BiFunction<McpSyncServerExchange, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler) {
	        this.prompt = Objects.requireNonNull(prompt, "Prompt cannot be null");
	        this.promptHandler = Objects.requireNonNull(promptHandler, "Prompt handler cannot be null");
	    }

	    // Getter/Setter方法
	    public McpSchema.Prompt getPrompt() { 
	        return prompt; 
	    }
	    
	    public void setPrompt(McpSchema.Prompt prompt) { 
	        this.prompt = Objects.requireNonNull(prompt, "Prompt cannot be null"); 
	    }
	    
	    public BiFunction<McpSyncServerExchange, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> getPromptHandler() { 
	        return promptHandler; 
	    }
	    
	    public void setPromptHandler(BiFunction<McpSyncServerExchange, McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler) { 
	        this.promptHandler = promptHandler; 
	    }
	}

	// ---------------------------------------
	// Deprecated registrations
	// ---------------------------------------

	/**
	 * Registration of a tool with its asynchronous handler function. Tools are the
	 * primary way for MCP servers to expose functionality to AI models. Each tool
	 * represents a specific capability, such as:
	 * <ul>
	 * <li>Performing calculations
	 * <li>Accessing external APIs
	 * <li>Querying databases
	 * <li>Manipulating files
	 * <li>Executing system commands
	 * </ul>
	 *
	 * <p>
	 * Example tool registration: <pre>{@code
	 * new McpServerFeatures.AsyncToolRegistration(
	 *     new Tool(
	 *         "calculator",
	 *         "Performs mathematical calculations",
	 *         new JsonSchemaObject()
	 *             .required("expression")
	 *             .property("expression", JsonSchemaType.STRING)
	 *     ),
	 *     args -> {
	 *         String expr = (String) args.get("expression");
	 *         return Mono.just(new CallToolResult("Result: " + evaluate(expr)));
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param tool The tool definition including name, description, and parameter schema
	 * @param call The function that implements the tool's logic, receiving arguments and
	 * returning results
	 * @deprecated This class is deprecated and will be removed in 0.9.0. Use
	 * {@link AsyncToolSpecification}.
	 */
	@Deprecated
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class AsyncToolRegistration {
		McpSchema.Tool tool;
		Function<Map<String, Object>, Mono<McpSchema.CallToolResult>> call;
		
		// 手动添加无参构造函数
	    public AsyncToolRegistration() {}

	    // 手动添加全参构造函数（带参数校验）
	    public AsyncToolRegistration(McpSchema.Tool tool,
	                                 Function<Map<String, Object>, Mono<McpSchema.CallToolResult>> call) {
	        this.tool = Objects.requireNonNull(tool, "Tool cannot be null");
	        this.call = Objects.requireNonNull(call, "Call handler cannot be null");
	    }

	    // Getter方法（带JSON属性映射）
	    public McpSchema.Tool getTool() { 
	        return tool; 
	    }
	    
	    // Setter方法（防御性编程）
	    public void setTool(McpSchema.Tool tool) {
	        this.tool = Objects.requireNonNull(tool, "Tool cannot be null");
	    }
	    
	    // Getter方法（保持函数式接口类型）
	    public Function<Map<String, Object>, Mono<McpSchema.CallToolResult>> getCall() { 
	        return call; 
	    }

		static AsyncToolRegistration fromSync(SyncToolRegistration tool) {
			// FIXME: This is temporary, proper validation should be implemented
			if (tool == null) {
				return null;
			}
			return new AsyncToolRegistration(tool.getTool(),
					map -> Mono.fromCallable(() -> tool.getCall().apply(map)).subscribeOn(Schedulers.boundedElastic()));
		}

		public AsyncToolSpecification toSpecification() {
			return new AsyncToolSpecification(tool, (exchange, map) -> call.apply(map));
		}
	}

	/**
	 * Registration of a resource with its asynchronous handler function. Resources
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
	 * Example resource registration: <pre>{@code
	 * new McpServerFeatures.AsyncResourceRegistration(
	 *     new Resource("docs", "Documentation files", "text/markdown"),
	 *     request -> {
	 *         String content = readFile(request.getPath());
	 *         return Mono.just(new ReadResourceResult(content));
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param resource The resource definition including name, description, and MIME type
	 * @param readHandler The function that handles resource read requests
	 * @deprecated This class is deprecated and will be removed in 0.9.0. Use
	 * {@link AsyncResourceSpecification}.
	 */
	@Deprecated
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class AsyncResourceRegistration {
		McpSchema.Resource resource;
		Function<McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler;

		// 手动添加无参构造函数
	    public AsyncResourceRegistration() {}

	    // 手动添加全参构造函数（带参数校验）
	    public AsyncResourceRegistration(McpSchema.Resource resource,
	                                     Function<McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler) {
	        this.resource = Objects.requireNonNull(resource, "Resource cannot be null");
	        this.readHandler = Objects.requireNonNull(readHandler, "Read handler cannot be null");
	    }

	    // Getter/Setter方法（防御性编程）
	    public McpSchema.Resource getResource() { 
	        return resource; 
	    }
	    
	    public void setResource(McpSchema.Resource resource) {
	        this.resource = Objects.requireNonNull(resource, "Resource cannot be null");
	    }
	    
	    public Function<McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> getReadHandler() { 
	        return readHandler; 
	    }
	    
	    public void setReadHandler(Function<McpSchema.ReadResourceRequest, Mono<McpSchema.ReadResourceResult>> readHandler) {
	        this.readHandler = readHandler ;
	    }
	    
		static AsyncResourceRegistration fromSync(SyncResourceRegistration resource) {
			// FIXME: This is temporary, proper validation should be implemented
			if (resource == null) {
				return null;
			}
			return new AsyncResourceRegistration(resource.getResource(),
					req -> Mono.fromCallable(() -> resource.getReadHandler().apply(req))
						.subscribeOn(Schedulers.boundedElastic()));
		}

		public AsyncResourceSpecification toSpecification() {
			return new AsyncResourceSpecification(resource, (exchange, request) -> readHandler.apply(request));
		}
	}

	/**
	 * Registration of a prompt template with its asynchronous handler function. Prompts
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
	 * Example prompt registration: <pre>{@code
	 * new McpServerFeatures.AsyncPromptRegistration(
	 *     new Prompt("analyze", "Code analysis template"),
	 *     request -> {
	 *         String code = request.getArguments().get("code");
	 *         return Mono.just(new GetPromptResult(
	 *             "Analyze this code:\n\n" + code + "\n\nProvide feedback on:"
	 *         ));
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param prompt The prompt definition including name and description
	 * @param promptHandler The function that processes prompt requests and returns
	 * formatted templates
	 * @deprecated This class is deprecated and will be removed in 0.9.0. Use
	 * {@link AsyncPromptSpecification}.
	 */
	@Deprecated
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class AsyncPromptRegistration {
		McpSchema.Prompt prompt;
		Function<McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler;
		
		
		 // 手动添加无参构造函数
	    public AsyncPromptRegistration() {}

	    // 手动添加全参构造函数（带参数校验）
	    public AsyncPromptRegistration(McpSchema.Prompt prompt,
	                                   Function<McpSchema.GetPromptRequest, Mono<McpSchema.GetPromptResult>> promptHandler) {
	        this.prompt = Objects.requireNonNull(prompt, "Prompt cannot be null");
	        this.promptHandler = Objects.requireNonNull(promptHandler, "Prompt handler cannot be null");
	    }

	    // Getter/Setter方法（线程安全处理）
	    public McpSchema.Prompt getPrompt() { 
	        return prompt; 
	    }
	    
	    public void setPrompt(McpSchema.Prompt prompt) {
	        this.prompt =prompt;
	    }

		static AsyncPromptRegistration fromSync(SyncPromptRegistration prompt) {
			// FIXME: This is temporary, proper validation should be implemented
			if (prompt == null) {
				return null;
			}
			return new AsyncPromptRegistration(prompt.getPrompt(),
					req -> Mono.fromCallable(() -> prompt.getPromptHandler().apply(req))
						.subscribeOn(Schedulers.boundedElastic()));
		}

		public AsyncPromptSpecification toSpecification() {
			return new AsyncPromptSpecification(prompt, (exchange, request) -> promptHandler.apply(request));
		}
	}

	/**
	 * Registration of a tool with its synchronous handler function. Tools are the primary
	 * way for MCP servers to expose functionality to AI models. Each tool represents a
	 * specific capability, such as:
	 * <ul>
	 * <li>Performing calculations
	 * <li>Accessing external APIs
	 * <li>Querying databases
	 * <li>Manipulating files
	 * <li>Executing system commands
	 * </ul>
	 *
	 * <p>
	 * Example tool registration: <pre>{@code
	 * new McpServerFeatures.SyncToolRegistration(
	 *     new Tool(
	 *         "calculator",
	 *         "Performs mathematical calculations",
	 *         new JsonSchemaObject()
	 *             .required("expression")
	 *             .property("expression", JsonSchemaType.STRING)
	 *     ),
	 *     args -> {
	 *         String expr = (String) args.get("expression");
	 *         return new CallToolResult("Result: " + evaluate(expr));
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param tool The tool definition including name, description, and parameter schema
	 * @param call The function that implements the tool's logic, receiving arguments and
	 * returning results
	 * @deprecated This class is deprecated and will be removed in 0.9.0. Use
	 * {@link SyncToolSpecification}.
	 */
	@Deprecated
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class SyncToolRegistration {
		McpSchema.Tool tool;
		Function<Map<String, Object>, McpSchema.CallToolResult> call;
		
		 // 手动添加无参构造函数
	    public SyncToolRegistration() {}

	    // 手动添加全参构造函数（带参数校验）
	    public SyncToolRegistration(McpSchema.Tool tool,
	                                 Function<Map<String, Object>, McpSchema.CallToolResult> call) {
	        this.tool = Objects.requireNonNull(tool, "Tool cannot be null");
	        this.call = Objects.requireNonNull(call, "Call handler cannot be null");
	    }

	    // Getter/Setter方法（防御性编程）
	    public McpSchema.Tool getTool() { 
	        return tool; 
	    }
	    
	    public void setTool(McpSchema.Tool tool) {
	        this.tool = Objects.requireNonNull(tool, "Tool cannot be null");
	    }
	    
	    public Function<Map<String, Object>, McpSchema.CallToolResult> getCall() { 
	        return call; 
	    }
	    
	    public void setCall(Function<Map<String, Object>, McpSchema.CallToolResult> call) {
	        this.call = call;
	    }

		public SyncToolSpecification toSpecification() {
			return new SyncToolSpecification(tool, (exchange, map) -> call.apply(map));
		}
	}

	/**
	 * Registration of a resource with its synchronous handler function. Resources provide
	 * context to AI models by exposing data such as:
	 * <ul>
	 * <li>File contents
	 * <li>Database records
	 * <li>API responses
	 * <li>System information
	 * <li>Application state
	 * </ul>
	 *
	 * <p>
	 * Example resource registration: <pre>{@code
	 * new McpServerFeatures.SyncResourceRegistration(
	 *     new Resource("docs", "Documentation files", "text/markdown"),
	 *     request -> {
	 *         String content = readFile(request.getPath());
	 *         return new ReadResourceResult(content);
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param resource The resource definition including name, description, and MIME type
	 * @param readHandler The function that handles resource read requests
	 * @deprecated This class is deprecated and will be removed in 0.9.0. Use
	 * {@link SyncResourceSpecification}.
	 */
	@Deprecated
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class SyncResourceRegistration {
		McpSchema.Resource resource;
		Function<McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler;

		 // 手动添加无参构造函数
	    public SyncResourceRegistration() {}

	    // 手动添加全参构造函数（带参数校验）
	    public SyncResourceRegistration(McpSchema.Resource resource,
	                                     Function<McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler) {
	        this.resource = Objects.requireNonNull(resource, "Resource cannot be null");
	        this.readHandler = Objects.requireNonNull(readHandler, "Read handler cannot be null");
	    }

	    // Getter/Setter方法（线程安全处理）
	    public McpSchema.Resource getResource() { 
	        return resource; 
	    }
	    
	    public void setResource(McpSchema.Resource resource) {
	        this.resource = Objects.requireNonNull(resource, "Resource cannot be null");
	    }
	    
	    public Function<McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> getReadHandler() { 
	        return readHandler; 
	    }
	    
	    public void setReadHandler(Function<McpSchema.ReadResourceRequest, McpSchema.ReadResourceResult> readHandler) {
	        this.readHandler = readHandler;
	    }
	    
		public SyncResourceSpecification toSpecification() {
			return new SyncResourceSpecification(resource, (exchange, request) -> readHandler.apply(request));
		}
	}

	/**
	 * Registration of a prompt template with its synchronous handler function. Prompts
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
	 * Example prompt registration: <pre>{@code
	 * new McpServerFeatures.SyncPromptRegistration(
	 *     new Prompt("analyze", "Code analysis template"),
	 *     request -> {
	 *         String code = request.getArguments().get("code");
	 *         return new GetPromptResult(
	 *             "Analyze this code:\n\n" + code + "\n\nProvide feedback on:"
	 *         );
	 *     }
	 * )
	 * }</pre>
	 *
	 * @param prompt The prompt definition including name and description
	 * @param promptHandler The function that processes prompt requests and returns
	 * formatted templates
	 * @deprecated This class is deprecated and will be removed in 0.9.0. Use
	 * {@link SyncPromptSpecification}.
	 */
	@Deprecated
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
	public static class SyncPromptRegistration {
		McpSchema.Prompt prompt;
		Function<McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler;

		// 手动添加无参构造函数
	    public SyncPromptRegistration() {}

	    // 手动添加全参构造函数（带参数校验）
	    public SyncPromptRegistration(McpSchema.Prompt prompt,
	                                 Function<McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler) {
	        this.prompt = Objects.requireNonNull(prompt, "Prompt cannot be null");
	        this.promptHandler = Objects.requireNonNull(promptHandler, "Prompt handler cannot be null");
	    }

	    // Getter方法（保持JSON序列化控制）
	    public McpSchema.Prompt getPrompt() { 
	        return prompt; 
	    }
	    
	    // Setter方法（防御性编程）
	    public void setPrompt(McpSchema.Prompt prompt) {
	        this.prompt = Objects.requireNonNull(prompt, "Prompt cannot be null");
	    }
	    
	    // Getter方法（函数式接口类型）
	    public Function<McpSchema.GetPromptRequest, McpSchema.GetPromptResult> getPromptHandler() { 
	        return promptHandler; 
	    }
	    
	    // Setter方法（线程安全处理）
	    public void setPromptHandler(Function<McpSchema.GetPromptRequest, McpSchema.GetPromptResult> promptHandler) {
	        this.promptHandler = promptHandler;
	    }
	    
		public SyncPromptSpecification toSpecification() {
			return new SyncPromptSpecification(prompt, (exchange, request) -> promptHandler.apply(request));
		}
	}

}
