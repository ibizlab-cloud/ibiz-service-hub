/*
 * Copyright 2024-2024 the original author or authors.
 */

package net.ibizsys.central.plugin.ai.mcp.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;

import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema;
import net.ibizsys.central.plugin.ai.mcp.util.Assert;
import net.ibizsys.central.plugin.ai.mcp.util.Utils;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * Representation of features and capabilities for Model Context Protocol (MCP) clients.
 * This class provides two record types for managing client features:
 * <ul>
 * <li>{@link Async} for non-blocking operations with Project Reactor's Mono responses
 * <li>{@link Sync} for blocking operations with direct responses
 * </ul>
 *
 * <p>
 * Each feature specification includes:
 * <ul>
 * <li>Client implementation information and capabilities
 * <li>Root URI mappings for resource access
 * <li>Change notification handlers for tools, resources, and prompts
 * <li>Logging message consumers
 * <li>Message sampling handlers for request processing
 * </ul>
 *
 * <p>
 * The class supports conversion between synchronous and asynchronous specifications
 * through the {@link Async#fromSync} method, which ensures proper handling of blocking
 * operations in non-blocking contexts by scheduling them on a bounded elastic scheduler.
 *
 * @author Dariusz Jędrzejczyk
 * @see McpClient
 * @see McpSchema.Implementation
 * @see McpSchema.ClientCapabilities
 */
class McpClientFeatures {

	/**
	 * Asynchronous client features specification providing the capabilities and request
	 * and notification handlers.
	 *
	 * @param clientInfo the client implementation information.
	 * @param clientCapabilities the client capabilities.
	 * @param roots the roots.
	 * @param toolsChangeConsumers the tools change consumers.
	 * @param resourcesChangeConsumers the resources change consumers.
	 * @param promptsChangeConsumers the prompts change consumers.
	 * @param loggingConsumers the logging consumers.
	 * @param progressConsumers the progress consumers.
	 * @param samplingHandler the sampling handler.
	 * @param elicitationHandler the elicitation handler.
	 */
//	record Async(McpSchema.Implementation clientInfo, McpSchema.ClientCapabilities clientCapabilities,
//			Map<String, McpSchema.Root> roots, List<Function<List<McpSchema.Tool>, Mono<Void>>> toolsChangeConsumers,
//			List<Function<List<McpSchema.Resource>, Mono<Void>>> resourcesChangeConsumers,
//			List<Function<List<McpSchema.ResourceContents>, Mono<Void>>> resourcesUpdateConsumers,
//			List<Function<List<McpSchema.Prompt>, Mono<Void>>> promptsChangeConsumers,
//			List<Function<McpSchema.LoggingMessageNotification, Mono<Void>>> loggingConsumers,
//			List<Function<McpSchema.ProgressNotification, Mono<Void>>> progressConsumers,
//			Function<McpSchema.CreateMessageRequest, Mono<McpSchema.CreateMessageResult>> samplingHandler,
//			Function<McpSchema.ElicitRequest, Mono<McpSchema.ElicitResult>> elicitationHandler) {
//
//		/**
//		 * Create an instance and validate the arguments.
//		 * @param clientCapabilities the client capabilities.
//		 * @param roots the roots.
//		 * @param toolsChangeConsumers the tools change consumers.
//		 * @param resourcesChangeConsumers the resources change consumers.
//		 * @param promptsChangeConsumers the prompts change consumers.
//		 * @param loggingConsumers the logging consumers.
//		 * @param progressConsumers the progress consumers.
//		 * @param samplingHandler the sampling handler.
//		 * @param elicitationHandler the elicitation handler.
//		 */
//		public Async(McpSchema.Implementation clientInfo, McpSchema.ClientCapabilities clientCapabilities,
//				Map<String, McpSchema.Root> roots,
//				List<Function<List<McpSchema.Tool>, Mono<Void>>> toolsChangeConsumers,
//				List<Function<List<McpSchema.Resource>, Mono<Void>>> resourcesChangeConsumers,
//				List<Function<List<McpSchema.ResourceContents>, Mono<Void>>> resourcesUpdateConsumers,
//				List<Function<List<McpSchema.Prompt>, Mono<Void>>> promptsChangeConsumers,
//				List<Function<McpSchema.LoggingMessageNotification, Mono<Void>>> loggingConsumers,
//				List<Function<McpSchema.ProgressNotification, Mono<Void>>> progressConsumers,
//				Function<McpSchema.CreateMessageRequest, Mono<McpSchema.CreateMessageResult>> samplingHandler,
//				Function<McpSchema.ElicitRequest, Mono<McpSchema.ElicitResult>> elicitationHandler) {
//
//			Assert.notNull(clientInfo, "Client info must not be null");
//			this.clientInfo = clientInfo;
//			this.clientCapabilities = (clientCapabilities != null) ? clientCapabilities
//					: new McpSchema.ClientCapabilities(null,
//							!Utils.isEmpty(roots) ? new McpSchema.ClientCapabilities.RootCapabilities(false) : null,
//							samplingHandler != null ? new McpSchema.ClientCapabilities.Sampling() : null,
//							elicitationHandler != null ? new McpSchema.ClientCapabilities.Elicitation() : null);
//			this.roots = roots != null ? new ConcurrentHashMap<>(roots) : new ConcurrentHashMap<>();
//
//			this.toolsChangeConsumers = toolsChangeConsumers != null ? toolsChangeConsumers : List.of();
//			this.resourcesChangeConsumers = resourcesChangeConsumers != null ? resourcesChangeConsumers : List.of();
//			this.resourcesUpdateConsumers = resourcesUpdateConsumers != null ? resourcesUpdateConsumers : List.of();
//			this.promptsChangeConsumers = promptsChangeConsumers != null ? promptsChangeConsumers : List.of();
//			this.loggingConsumers = loggingConsumers != null ? loggingConsumers : List.of();
//			this.progressConsumers = progressConsumers != null ? progressConsumers : List.of();
//			this.samplingHandler = samplingHandler;
//			this.elicitationHandler = elicitationHandler;
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes.
//		 */
//		public Async(McpSchema.Implementation clientInfo, McpSchema.ClientCapabilities clientCapabilities,
//				Map<String, McpSchema.Root> roots,
//				List<Function<List<McpSchema.Tool>, Mono<Void>>> toolsChangeConsumers,
//				List<Function<List<McpSchema.Resource>, Mono<Void>>> resourcesChangeConsumers,
//				List<Function<List<McpSchema.ResourceContents>, Mono<Void>>> resourcesUpdateConsumers,
//				List<Function<List<McpSchema.Prompt>, Mono<Void>>> promptsChangeConsumers,
//				List<Function<McpSchema.LoggingMessageNotification, Mono<Void>>> loggingConsumers,
//				Function<McpSchema.CreateMessageRequest, Mono<McpSchema.CreateMessageResult>> samplingHandler,
//				Function<McpSchema.ElicitRequest, Mono<McpSchema.ElicitResult>> elicitationHandler) {
//			this(clientInfo, clientCapabilities, roots, toolsChangeConsumers, resourcesChangeConsumers,
//					resourcesUpdateConsumers, promptsChangeConsumers, loggingConsumers, List.of(), samplingHandler,
//					elicitationHandler);
//		}
//
//		/**
//		 * Convert a synchronous specification into an asynchronous one and provide
//		 * blocking code offloading to prevent accidental blocking of the non-blocking
//		 * transport.
//		 * @param syncSpec a potentially blocking, synchronous specification.
//		 * @return a specification which is protected from blocking calls specified by the
//		 * user.
//		 */
//		public static Async fromSync(Sync syncSpec) {
//			List<Function<List<McpSchema.Tool>, Mono<Void>>> toolsChangeConsumers = new ArrayList<>();
//			for (Consumer<List<McpSchema.Tool>> consumer : syncSpec.toolsChangeConsumers()) {
//				toolsChangeConsumers.add(t -> Mono.<Void>fromRunnable(() -> consumer.accept(t))
//					.subscribeOn(Schedulers.boundedElastic()));
//			}
//
//			List<Function<List<McpSchema.Resource>, Mono<Void>>> resourcesChangeConsumers = new ArrayList<>();
//			for (Consumer<List<McpSchema.Resource>> consumer : syncSpec.resourcesChangeConsumers()) {
//				resourcesChangeConsumers.add(r -> Mono.<Void>fromRunnable(() -> consumer.accept(r))
//					.subscribeOn(Schedulers.boundedElastic()));
//			}
//
//			List<Function<List<McpSchema.ResourceContents>, Mono<Void>>> resourcesUpdateConsumers = new ArrayList<>();
//			for (Consumer<List<McpSchema.ResourceContents>> consumer : syncSpec.resourcesUpdateConsumers()) {
//				resourcesUpdateConsumers.add(r -> Mono.<Void>fromRunnable(() -> consumer.accept(r))
//					.subscribeOn(Schedulers.boundedElastic()));
//			}
//
//			List<Function<List<McpSchema.Prompt>, Mono<Void>>> promptsChangeConsumers = new ArrayList<>();
//			for (Consumer<List<McpSchema.Prompt>> consumer : syncSpec.promptsChangeConsumers()) {
//				promptsChangeConsumers.add(p -> Mono.<Void>fromRunnable(() -> consumer.accept(p))
//					.subscribeOn(Schedulers.boundedElastic()));
//			}
//
//			List<Function<McpSchema.LoggingMessageNotification, Mono<Void>>> loggingConsumers = new ArrayList<>();
//			for (Consumer<McpSchema.LoggingMessageNotification> consumer : syncSpec.loggingConsumers()) {
//				loggingConsumers.add(l -> Mono.<Void>fromRunnable(() -> consumer.accept(l))
//					.subscribeOn(Schedulers.boundedElastic()));
//			}
//
//			List<Function<McpSchema.ProgressNotification, Mono<Void>>> progressConsumers = new ArrayList<>();
//			for (Consumer<McpSchema.ProgressNotification> consumer : syncSpec.progressConsumers()) {
//				progressConsumers.add(l -> Mono.<Void>fromRunnable(() -> consumer.accept(l))
//					.subscribeOn(Schedulers.boundedElastic()));
//			}
//
//			Function<McpSchema.CreateMessageRequest, Mono<McpSchema.CreateMessageResult>> samplingHandler = r -> Mono
//				.fromCallable(() -> syncSpec.samplingHandler().apply(r))
//				.subscribeOn(Schedulers.boundedElastic());
//
//			Function<McpSchema.ElicitRequest, Mono<McpSchema.ElicitResult>> elicitationHandler = r -> Mono
//				.fromCallable(() -> syncSpec.elicitationHandler().apply(r))
//				.subscribeOn(Schedulers.boundedElastic());
//
//			return new Async(syncSpec.clientInfo(), syncSpec.clientCapabilities(), syncSpec.roots(),
//					toolsChangeConsumers, resourcesChangeConsumers, resourcesUpdateConsumers, promptsChangeConsumers,
//					loggingConsumers, progressConsumers, samplingHandler, elicitationHandler);
//		}
//	}
	public final static class Async {

	    private final McpSchema.Implementation clientInfo;
	    private final McpSchema.ClientCapabilities clientCapabilities;
	    private final Map<String, McpSchema.Root> roots;

	    private final List<Function<List<McpSchema.Tool>, Mono<Void>>> toolsChangeConsumers;
	    private final List<Function<List<McpSchema.Resource>, Mono<Void>>> resourcesChangeConsumers;
	    private final List<Function<List<McpSchema.ResourceContents>, Mono<Void>>> resourcesUpdateConsumers;
	    private final List<Function<List<McpSchema.Prompt>, Mono<Void>>> promptsChangeConsumers;
	    private final List<Function<McpSchema.LoggingMessageNotification, Mono<Void>>> loggingConsumers;
	    private final List<Function<McpSchema.ProgressNotification, Mono<Void>>> progressConsumers;

	    private final Function<McpSchema.CreateMessageRequest, Mono<McpSchema.CreateMessageResult>> samplingHandler;
	    private final Function<McpSchema.ElicitRequest, Mono<McpSchema.ElicitResult>> elicitationHandler;

	    /**
	     * Create an instance and validate the arguments.
	     *
	     * @param clientInfo              the client info.
	     * @param clientCapabilities      the client capabilities.
	     * @param roots                   the roots.
	     * @param toolsChangeConsumers    the tools change consumers.
	     * @param resourcesChangeConsumers the resources change consumers.
	     * @param resourcesUpdateConsumers the resources update consumers.
	     * @param promptsChangeConsumers  the prompts change consumers.
	     * @param loggingConsumers        the logging consumers.
	     * @param progressConsumers       the progress consumers.
	     * @param samplingHandler         the sampling handler.
	     * @param elicitationHandler      the elicitation handler.
	     */
	    public Async(
	            McpSchema.Implementation clientInfo,
	            McpSchema.ClientCapabilities clientCapabilities,
	            Map<String, McpSchema.Root> roots,
	            List<Function<List<McpSchema.Tool>, Mono<Void>>> toolsChangeConsumers,
	            List<Function<List<McpSchema.Resource>, Mono<Void>>> resourcesChangeConsumers,
	            List<Function<List<McpSchema.ResourceContents>, Mono<Void>>> resourcesUpdateConsumers,
	            List<Function<List<McpSchema.Prompt>, Mono<Void>>> promptsChangeConsumers,
	            List<Function<McpSchema.LoggingMessageNotification, Mono<Void>>> loggingConsumers,
	            List<Function<McpSchema.ProgressNotification, Mono<Void>>> progressConsumers,
	            Function<McpSchema.CreateMessageRequest, Mono<McpSchema.CreateMessageResult>> samplingHandler,
	            Function<McpSchema.ElicitRequest, Mono<McpSchema.ElicitResult>> elicitationHandler) {

	        Assert.notNull(clientInfo, "Client info must not be null");

	        this.clientInfo = clientInfo;
	        this.clientCapabilities = (clientCapabilities != null) ? clientCapabilities
	                : new McpSchema.ClientCapabilities(null,
	                !Utils.isEmpty(roots) ? new McpSchema.ClientCapabilities.RootCapabilities(false) : null,
	                samplingHandler != null ? new McpSchema.ClientCapabilities.Sampling() : null,
	                elicitationHandler != null ? new McpSchema.ClientCapabilities.Elicitation() : null);

	        this.roots = roots != null ? new ConcurrentHashMap<>(roots) : new ConcurrentHashMap<>();

	        this.toolsChangeConsumers = toolsChangeConsumers != null ? toolsChangeConsumers : Collections.emptyList();
	        this.resourcesChangeConsumers = resourcesChangeConsumers != null ? resourcesChangeConsumers : Collections.emptyList();
	        this.resourcesUpdateConsumers = resourcesUpdateConsumers != null ? resourcesUpdateConsumers : Collections.emptyList();
	        this.promptsChangeConsumers = promptsChangeConsumers != null ? promptsChangeConsumers : Collections.emptyList();
	        this.loggingConsumers = loggingConsumers != null ? loggingConsumers : Collections.emptyList();
	        this.progressConsumers = progressConsumers != null ? progressConsumers : Collections.emptyList();

	        this.samplingHandler = samplingHandler;
	        this.elicitationHandler = elicitationHandler;
	    }

	    /**
	     * @deprecated Only exists for backwards-compatibility purposes.
	     */
	    @Deprecated
	    public Async(
	            McpSchema.Implementation clientInfo,
	            McpSchema.ClientCapabilities clientCapabilities,
	            Map<String, McpSchema.Root> roots,
	            List<Function<List<McpSchema.Tool>, Mono<Void>>> toolsChangeConsumers,
	            List<Function<List<McpSchema.Resource>, Mono<Void>>> resourcesChangeConsumers,
	            List<Function<List<McpSchema.ResourceContents>, Mono<Void>>> resourcesUpdateConsumers,
	            List<Function<List<McpSchema.Prompt>, Mono<Void>>> promptsChangeConsumers,
	            List<Function<McpSchema.LoggingMessageNotification, Mono<Void>>> loggingConsumers,
	            Function<McpSchema.CreateMessageRequest, Mono<McpSchema.CreateMessageResult>> samplingHandler,
	            Function<McpSchema.ElicitRequest, Mono<McpSchema.ElicitResult>> elicitationHandler) {
	        this(clientInfo, clientCapabilities, roots, toolsChangeConsumers, resourcesChangeConsumers,
	                resourcesUpdateConsumers, promptsChangeConsumers, loggingConsumers, Collections.emptyList(), samplingHandler,
	                elicitationHandler);
	    }

	    /**
	     * Convert a synchronous specification into an asynchronous one and provide
	     * blocking code offloading to prevent accidental blocking of the non-blocking
	     * transport.
	     * @param syncSpec a potentially blocking, synchronous specification.
	     * @return a specification which is protected from blocking calls specified by the
	     * user.
	     */
	    public static Async fromSync(Sync syncSpec) {
	        List<Function<List<McpSchema.Tool>, Mono<Void>>> toolsChangeConsumers = new ArrayList<>();
	        if (syncSpec.getToolsChangeConsumers() != null) {
	            for (Consumer<List<McpSchema.Tool>> consumer : syncSpec.getToolsChangeConsumers()) {
	                final Consumer<List<McpSchema.Tool>> finalConsumer = consumer;
	                toolsChangeConsumers.add(t -> Mono.<Void>fromRunnable(() -> finalConsumer.accept(t))
	                    .subscribeOn(Schedulers.boundedElastic()));
	            }
	        }

	        List<Function<List<McpSchema.Resource>, Mono<Void>>> resourcesChangeConsumers = new ArrayList<>();
	        if (syncSpec.getResourcesChangeConsumers() != null) {
	            for (Consumer<List<McpSchema.Resource>> consumer : syncSpec.getResourcesChangeConsumers()) {
	                final Consumer<List<McpSchema.Resource>> finalConsumer = consumer;
	                resourcesChangeConsumers.add(r -> Mono.<Void>fromRunnable(() -> finalConsumer.accept(r))
	                    .subscribeOn(Schedulers.boundedElastic()));
	            }
	        }

	        List<Function<List<McpSchema.ResourceContents>, Mono<Void>>> resourcesUpdateConsumers = new ArrayList<>();
	        if (syncSpec.getResourcesUpdateConsumers() != null) {
	            for (Consumer<List<McpSchema.ResourceContents>> consumer : syncSpec.getResourcesUpdateConsumers()) {
	                final Consumer<List<McpSchema.ResourceContents>> finalConsumer = consumer;
	                resourcesUpdateConsumers.add(r -> Mono.<Void>fromRunnable(() -> finalConsumer.accept(r))
	                    .subscribeOn(Schedulers.boundedElastic()));
	            }
	        }

	        List<Function<List<McpSchema.Prompt>, Mono<Void>>> promptsChangeConsumers = new ArrayList<>();
	        if (syncSpec.getPromptsChangeConsumers() != null) {
	            for (Consumer<List<McpSchema.Prompt>> consumer : syncSpec.getPromptsChangeConsumers()) {
	                final Consumer<List<McpSchema.Prompt>> finalConsumer = consumer;
	                promptsChangeConsumers.add(p -> Mono.<Void>fromRunnable(() -> finalConsumer.accept(p))
	                    .subscribeOn(Schedulers.boundedElastic()));
	            }
	        }

	        List<Function<McpSchema.LoggingMessageNotification, Mono<Void>>> loggingConsumers = new ArrayList<>();
	        if (syncSpec.getLoggingConsumers() != null) {
	            for (Consumer<McpSchema.LoggingMessageNotification> consumer : syncSpec.getLoggingConsumers()) {
	                final Consumer<McpSchema.LoggingMessageNotification> finalConsumer = consumer;
	                loggingConsumers.add(l -> Mono.<Void>fromRunnable(() -> finalConsumer.accept(l))
	                    .subscribeOn(Schedulers.boundedElastic()));
	            }
	        }

	        List<Function<McpSchema.ProgressNotification, Mono<Void>>> progressConsumers = new ArrayList<>();
	        if (syncSpec.getProgressConsumers() != null) {
	            for (Consumer<McpSchema.ProgressNotification> consumer : syncSpec.getProgressConsumers()) {
	                final Consumer<McpSchema.ProgressNotification> finalConsumer = consumer;
	                progressConsumers.add(l -> Mono.<Void>fromRunnable(() -> finalConsumer.accept(l))
	                    .subscribeOn(Schedulers.boundedElastic()));
	            }
	        }

	        Function<McpSchema.CreateMessageRequest, Mono<McpSchema.CreateMessageResult>> samplingHandler = null;
	        if (syncSpec.getSamplingHandler() != null) {
	            samplingHandler = r -> Mono
	                .fromCallable(() -> syncSpec.getSamplingHandler().apply(r))
	                .subscribeOn(Schedulers.boundedElastic());
	        }

	        Function<McpSchema.ElicitRequest, Mono<McpSchema.ElicitResult>> elicitationHandler = null;
	        if (syncSpec.getElicitationHandler() != null) {
	            elicitationHandler = r -> Mono
	                .fromCallable(() -> syncSpec.getElicitationHandler().apply(r))
	                .subscribeOn(Schedulers.boundedElastic());
	        }

	        return new Async(syncSpec.getClientInfo(), syncSpec.getClientCapabilities(), syncSpec.getRoots(),
	                toolsChangeConsumers, resourcesChangeConsumers, resourcesUpdateConsumers, promptsChangeConsumers,
	                loggingConsumers, progressConsumers, samplingHandler, elicitationHandler);
	    }

	    // Getters
	    public McpSchema.Implementation getClientInfo() {
	        return clientInfo;
	    }

	    public McpSchema.ClientCapabilities getClientCapabilities() {
	        return clientCapabilities;
	    }

	    public Map<String, McpSchema.Root> getRoots() {
	        return roots;
	    }

	    public List<Function<List<McpSchema.Tool>, Mono<Void>>> getToolsChangeConsumers() {
	        return toolsChangeConsumers;
	    }

	    public List<Function<List<McpSchema.Resource>, Mono<Void>>> getResourcesChangeConsumers() {
	        return resourcesChangeConsumers;
	    }

	    public List<Function<List<McpSchema.ResourceContents>, Mono<Void>>> getResourcesUpdateConsumers() {
	        return resourcesUpdateConsumers;
	    }

	    public List<Function<List<McpSchema.Prompt>, Mono<Void>>> getPromptsChangeConsumers() {
	        return promptsChangeConsumers;
	    }

	    public List<Function<McpSchema.LoggingMessageNotification, Mono<Void>>> getLoggingConsumers() {
	        return loggingConsumers;
	    }

	    public List<Function<McpSchema.ProgressNotification, Mono<Void>>> getProgressConsumers() {
	        return progressConsumers;
	    }

	    public Function<McpSchema.CreateMessageRequest, Mono<McpSchema.CreateMessageResult>> getSamplingHandler() {
	        return samplingHandler;
	    }

	    public Function<McpSchema.ElicitRequest, Mono<McpSchema.ElicitResult>> getElicitationHandler() {
	        return elicitationHandler;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Async async = (Async) o;

	        if (!clientInfo.equals(async.clientInfo)) return false;
	        if (!clientCapabilities.equals(async.clientCapabilities)) return false;
	        if (!roots.equals(async.roots)) return false;
	        if (!toolsChangeConsumers.equals(async.toolsChangeConsumers)) return false;
	        if (!resourcesChangeConsumers.equals(async.resourcesChangeConsumers)) return false;
	        if (!resourcesUpdateConsumers.equals(async.resourcesUpdateConsumers)) return false;
	        if (!promptsChangeConsumers.equals(async.promptsChangeConsumers)) return false;
	        if (!loggingConsumers.equals(async.loggingConsumers)) return false;
	        if (!progressConsumers.equals(async.progressConsumers)) return false;
	        if (samplingHandler != null ? !samplingHandler.equals(async.samplingHandler) : async.samplingHandler != null)
	            return false;
	        return elicitationHandler != null ? elicitationHandler.equals(async.elicitationHandler) : async.elicitationHandler == null;
	    }

	    @Override
	    public int hashCode() {
	        int result = clientInfo.hashCode();
	        result = 31 * result + clientCapabilities.hashCode();
	        result = 31 * result + roots.hashCode();
	        result = 31 * result + toolsChangeConsumers.hashCode();
	        result = 31 * result + resourcesChangeConsumers.hashCode();
	        result = 31 * result + resourcesUpdateConsumers.hashCode();
	        result = 31 * result + promptsChangeConsumers.hashCode();
	        result = 31 * result + loggingConsumers.hashCode();
	        result = 31 * result + progressConsumers.hashCode();
	        result = 31 * result + (samplingHandler != null ? samplingHandler.hashCode() : 0);
	        result = 31 * result + (elicitationHandler != null ? elicitationHandler.hashCode() : 0);
	        return result;
	    }

	    @Override
	    public String toString() {
	        return "Async{" +
	                "clientInfo=" + clientInfo +
	                ", clientCapabilities=" + clientCapabilities +
	                ", roots=" + roots +
	                ", toolsChangeConsumers=" + toolsChangeConsumers +
	                ", resourcesChangeConsumers=" + resourcesChangeConsumers +
	                ", resourcesUpdateConsumers=" + resourcesUpdateConsumers +
	                ", promptsChangeConsumers=" + promptsChangeConsumers +
	                ", loggingConsumers=" + loggingConsumers +
	                ", progressConsumers=" + progressConsumers +
	                ", samplingHandler=" + samplingHandler +
	                ", elicitationHandler=" + elicitationHandler +
	                '}';
	    }
	}

	/**
	 * Synchronous client features specification providing the capabilities and request
	 * and notification handlers.
	 *
	 * @param clientInfo the client implementation information.
	 * @param clientCapabilities the client capabilities.
	 * @param roots the roots.
	 * @param toolsChangeConsumers the tools change consumers.
	 * @param resourcesChangeConsumers the resources change consumers.
	 * @param promptsChangeConsumers the prompts change consumers.
	 * @param loggingConsumers the logging consumers.
	 * @param progressConsumers the progress consumers.
	 * @param samplingHandler the sampling handler.
	 * @param elicitationHandler the elicitation handler.
	 */
//	public record Sync(McpSchema.Implementation clientInfo, McpSchema.ClientCapabilities clientCapabilities,
//			Map<String, McpSchema.Root> roots, List<Consumer<List<McpSchema.Tool>>> toolsChangeConsumers,
//			List<Consumer<List<McpSchema.Resource>>> resourcesChangeConsumers,
//			List<Consumer<List<McpSchema.ResourceContents>>> resourcesUpdateConsumers,
//			List<Consumer<List<McpSchema.Prompt>>> promptsChangeConsumers,
//			List<Consumer<McpSchema.LoggingMessageNotification>> loggingConsumers,
//			List<Consumer<McpSchema.ProgressNotification>> progressConsumers,
//			Function<McpSchema.CreateMessageRequest, McpSchema.CreateMessageResult> samplingHandler,
//			Function<McpSchema.ElicitRequest, McpSchema.ElicitResult> elicitationHandler) {
//
//		/**
//		 * Create an instance and validate the arguments.
//		 * @param clientInfo the client implementation information.
//		 * @param clientCapabilities the client capabilities.
//		 * @param roots the roots.
//		 * @param toolsChangeConsumers the tools change consumers.
//		 * @param resourcesChangeConsumers the resources change consumers.
//		 * @param resourcesUpdateConsumers the resource update consumers.
//		 * @param promptsChangeConsumers the prompts change consumers.
//		 * @param loggingConsumers the logging consumers.
//		 * @param progressConsumers the progress consumers.
//		 * @param samplingHandler the sampling handler.
//		 * @param elicitationHandler the elicitation handler.
//		 */
//		public Sync(McpSchema.Implementation clientInfo, McpSchema.ClientCapabilities clientCapabilities,
//				Map<String, McpSchema.Root> roots, List<Consumer<List<McpSchema.Tool>>> toolsChangeConsumers,
//				List<Consumer<List<McpSchema.Resource>>> resourcesChangeConsumers,
//				List<Consumer<List<McpSchema.ResourceContents>>> resourcesUpdateConsumers,
//				List<Consumer<List<McpSchema.Prompt>>> promptsChangeConsumers,
//				List<Consumer<McpSchema.LoggingMessageNotification>> loggingConsumers,
//				List<Consumer<McpSchema.ProgressNotification>> progressConsumers,
//				Function<McpSchema.CreateMessageRequest, McpSchema.CreateMessageResult> samplingHandler,
//				Function<McpSchema.ElicitRequest, McpSchema.ElicitResult> elicitationHandler) {
//
//			Assert.notNull(clientInfo, "Client info must not be null");
//			this.clientInfo = clientInfo;
//			this.clientCapabilities = (clientCapabilities != null) ? clientCapabilities
//					: new McpSchema.ClientCapabilities(null,
//							!Utils.isEmpty(roots) ? new McpSchema.ClientCapabilities.RootCapabilities(false) : null,
//							samplingHandler != null ? new McpSchema.ClientCapabilities.Sampling() : null,
//							elicitationHandler != null ? new McpSchema.ClientCapabilities.Elicitation() : null);
//			this.roots = roots != null ? new HashMap<>(roots) : new HashMap<>();
//
//			this.toolsChangeConsumers = toolsChangeConsumers != null ? toolsChangeConsumers : List.of();
//			this.resourcesChangeConsumers = resourcesChangeConsumers != null ? resourcesChangeConsumers : List.of();
//			this.resourcesUpdateConsumers = resourcesUpdateConsumers != null ? resourcesUpdateConsumers : List.of();
//			this.promptsChangeConsumers = promptsChangeConsumers != null ? promptsChangeConsumers : List.of();
//			this.loggingConsumers = loggingConsumers != null ? loggingConsumers : List.of();
//			this.progressConsumers = progressConsumers != null ? progressConsumers : List.of();
//			this.samplingHandler = samplingHandler;
//			this.elicitationHandler = elicitationHandler;
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes.
//		 */
//		public Sync(McpSchema.Implementation clientInfo, McpSchema.ClientCapabilities clientCapabilities,
//				Map<String, McpSchema.Root> roots, List<Consumer<List<McpSchema.Tool>>> toolsChangeConsumers,
//				List<Consumer<List<McpSchema.Resource>>> resourcesChangeConsumers,
//				List<Consumer<List<McpSchema.ResourceContents>>> resourcesUpdateConsumers,
//				List<Consumer<List<McpSchema.Prompt>>> promptsChangeConsumers,
//				List<Consumer<McpSchema.LoggingMessageNotification>> loggingConsumers,
//				Function<McpSchema.CreateMessageRequest, McpSchema.CreateMessageResult> samplingHandler,
//				Function<McpSchema.ElicitRequest, McpSchema.ElicitResult> elicitationHandler) {
//			this(clientInfo, clientCapabilities, roots, toolsChangeConsumers, resourcesChangeConsumers,
//					resourcesUpdateConsumers, promptsChangeConsumers, loggingConsumers, List.of(), samplingHandler,
//					elicitationHandler);
//		}
//	}
	public final static class Sync {

	    private final McpSchema.Implementation clientInfo;
	    private final McpSchema.ClientCapabilities clientCapabilities;
	    private final Map<String, McpSchema.Root> roots;

	    private final List<Consumer<List<McpSchema.Tool>>> toolsChangeConsumers;
	    private final List<Consumer<List<McpSchema.Resource>>> resourcesChangeConsumers;
	    private final List<Consumer<List<McpSchema.ResourceContents>>> resourcesUpdateConsumers;
	    private final List<Consumer<List<McpSchema.Prompt>>> promptsChangeConsumers;
	    private final List<Consumer<McpSchema.LoggingMessageNotification>> loggingConsumers;
	    private final List<Consumer<McpSchema.ProgressNotification>> progressConsumers;

	    private final Function<McpSchema.CreateMessageRequest, McpSchema.CreateMessageResult> samplingHandler;
	    private final Function<McpSchema.ElicitRequest, McpSchema.ElicitResult> elicitationHandler;

	    /**
	     * Create an instance and validate the arguments.
	     *
	     * @param clientInfo              the client implementation information.
	     * @param clientCapabilities      the client capabilities.
	     * @param roots                   the roots.
	     * @param toolsChangeConsumers    the tools change consumers.
	     * @param resourcesChangeConsumers the resources change consumers.
	     * @param resourcesUpdateConsumers the resource update consumers.
	     * @param promptsChangeConsumers  the prompts change consumers.
	     * @param loggingConsumers        the logging consumers.
	     * @param progressConsumers       the progress consumers.
	     * @param samplingHandler         the sampling handler.
	     * @param elicitationHandler      the elicitation handler.
	     */
	    public Sync(
	            McpSchema.Implementation clientInfo,
	            McpSchema.ClientCapabilities clientCapabilities,
	            Map<String, McpSchema.Root> roots,
	            List<Consumer<List<McpSchema.Tool>>> toolsChangeConsumers,
	            List<Consumer<List<McpSchema.Resource>>> resourcesChangeConsumers,
	            List<Consumer<List<McpSchema.ResourceContents>>> resourcesUpdateConsumers,
	            List<Consumer<List<McpSchema.Prompt>>> promptsChangeConsumers,
	            List<Consumer<McpSchema.LoggingMessageNotification>> loggingConsumers,
	            List<Consumer<McpSchema.ProgressNotification>> progressConsumers,
	            Function<McpSchema.CreateMessageRequest, McpSchema.CreateMessageResult> samplingHandler,
	            Function<McpSchema.ElicitRequest, McpSchema.ElicitResult> elicitationHandler) {

	        Assert.notNull(clientInfo, "Client info must not be null");

	        this.clientInfo = clientInfo;
	        this.clientCapabilities = (clientCapabilities != null) ? clientCapabilities
	                : new McpSchema.ClientCapabilities(null,
	                !Utils.isEmpty(roots) ? new McpSchema.ClientCapabilities.RootCapabilities(false) : null,
	                samplingHandler != null ? new McpSchema.ClientCapabilities.Sampling() : null,
	                elicitationHandler != null ? new McpSchema.ClientCapabilities.Elicitation() : null);

	        this.roots = roots != null ? new HashMap<>(roots) : new HashMap<>();

	        this.toolsChangeConsumers = toolsChangeConsumers != null ? toolsChangeConsumers : Collections.emptyList();
	        this.resourcesChangeConsumers = resourcesChangeConsumers != null ? resourcesChangeConsumers : Collections.emptyList();
	        this.resourcesUpdateConsumers = resourcesUpdateConsumers != null ? resourcesUpdateConsumers : Collections.emptyList();
	        this.promptsChangeConsumers = promptsChangeConsumers != null ? promptsChangeConsumers : Collections.emptyList();
	        this.loggingConsumers = loggingConsumers != null ? loggingConsumers : Collections.emptyList();
	        this.progressConsumers = progressConsumers != null ? progressConsumers : Collections.emptyList();

	        this.samplingHandler = samplingHandler;
	        this.elicitationHandler = elicitationHandler;
	    }

	    /**
	     * @deprecated Only exists for backwards-compatibility purposes.
	     */
	    @Deprecated
	    public Sync(
	            McpSchema.Implementation clientInfo,
	            McpSchema.ClientCapabilities clientCapabilities,
	            Map<String, McpSchema.Root> roots,
	            List<Consumer<List<McpSchema.Tool>>> toolsChangeConsumers,
	            List<Consumer<List<McpSchema.Resource>>> resourcesChangeConsumers,
	            List<Consumer<List<McpSchema.ResourceContents>>> resourcesUpdateConsumers,
	            List<Consumer<List<McpSchema.Prompt>>> promptsChangeConsumers,
	            List<Consumer<McpSchema.LoggingMessageNotification>> loggingConsumers,
	            Function<McpSchema.CreateMessageRequest, McpSchema.CreateMessageResult> samplingHandler,
	            Function<McpSchema.ElicitRequest, McpSchema.ElicitResult> elicitationHandler) {
	        this(clientInfo, clientCapabilities, roots, toolsChangeConsumers, resourcesChangeConsumers,
	                resourcesUpdateConsumers, promptsChangeConsumers, loggingConsumers, Collections.emptyList(), samplingHandler,
	                elicitationHandler);
	    }

	    // Getters
	    public McpSchema.Implementation getClientInfo() {
	        return clientInfo;
	    }

	    public McpSchema.ClientCapabilities getClientCapabilities() {
	        return clientCapabilities;
	    }

	    public Map<String, McpSchema.Root> getRoots() {
	        return roots;
	    }

	    public List<Consumer<List<McpSchema.Tool>>> getToolsChangeConsumers() {
	        return toolsChangeConsumers;
	    }

	    public List<Consumer<List<McpSchema.Resource>>> getResourcesChangeConsumers() {
	        return resourcesChangeConsumers;
	    }

	    public List<Consumer<List<McpSchema.ResourceContents>>> getResourcesUpdateConsumers() {
	        return resourcesUpdateConsumers;
	    }

	    public List<Consumer<List<McpSchema.Prompt>>> getPromptsChangeConsumers() {
	        return promptsChangeConsumers;
	    }

	    public List<Consumer<McpSchema.LoggingMessageNotification>> getLoggingConsumers() {
	        return loggingConsumers;
	    }

	    public List<Consumer<McpSchema.ProgressNotification>> getProgressConsumers() {
	        return progressConsumers;
	    }

	    public Function<McpSchema.CreateMessageRequest, McpSchema.CreateMessageResult> getSamplingHandler() {
	        return samplingHandler;
	    }

	    public Function<McpSchema.ElicitRequest, McpSchema.ElicitResult> getElicitationHandler() {
	        return elicitationHandler;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Sync sync = (Sync) o;

	        if (!clientInfo.equals(sync.clientInfo)) return false;
	        if (!clientCapabilities.equals(sync.clientCapabilities)) return false;
	        if (!roots.equals(sync.roots)) return false;
	        if (!toolsChangeConsumers.equals(sync.toolsChangeConsumers)) return false;
	        if (!resourcesChangeConsumers.equals(sync.resourcesChangeConsumers)) return false;
	        if (!resourcesUpdateConsumers.equals(sync.resourcesUpdateConsumers)) return false;
	        if (!promptsChangeConsumers.equals(sync.promptsChangeConsumers)) return false;
	        if (!loggingConsumers.equals(sync.loggingConsumers)) return false;
	        if (!progressConsumers.equals(sync.progressConsumers)) return false;
	        if (samplingHandler != null ? !samplingHandler.equals(sync.samplingHandler) : sync.samplingHandler != null)
	            return false;
	        return elicitationHandler != null ? elicitationHandler.equals(sync.elicitationHandler) : sync.elicitationHandler == null;
	    }

	    @Override
	    public int hashCode() {
	        int result = clientInfo.hashCode();
	        result = 31 * result + clientCapabilities.hashCode();
	        result = 31 * result + roots.hashCode();
	        result = 31 * result + toolsChangeConsumers.hashCode();
	        result = 31 * result + resourcesChangeConsumers.hashCode();
	        result = 31 * result + resourcesUpdateConsumers.hashCode();
	        result = 31 * result + promptsChangeConsumers.hashCode();
	        result = 31 * result + loggingConsumers.hashCode();
	        result = 31 * result + progressConsumers.hashCode();
	        result = 31 * result + (samplingHandler != null ? samplingHandler.hashCode() : 0);
	        result = 31 * result + (elicitationHandler != null ? elicitationHandler.hashCode() : 0);
	        return result;
	    }

	    @Override
	    public String toString() {
	        return "Sync{" +
	                "clientInfo=" + clientInfo +
	                ", clientCapabilities=" + clientCapabilities +
	                ", roots=" + roots +
	                ", toolsChangeConsumers=" + toolsChangeConsumers +
	                ", resourcesChangeConsumers=" + resourcesChangeConsumers +
	                ", resourcesUpdateConsumers=" + resourcesUpdateConsumers +
	                ", promptsChangeConsumers=" + promptsChangeConsumers +
	                ", loggingConsumers=" + loggingConsumers +
	                ", progressConsumers=" + progressConsumers +
	                ", samplingHandler=" + samplingHandler +
	                ", elicitationHandler=" + elicitationHandler +
	                '}';
	    }
	}


}
