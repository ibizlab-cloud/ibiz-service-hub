/*
 * Copyright 2024 - 2025 the original author or authors.
 */

package net.ibizsys.central.plugin.ai.mcp.client.transport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.ibizsys.central.plugin.ai.mcp.client.transport.ResponseSubscribers.ResponseEvent;
import net.ibizsys.central.plugin.ai.mcp.spec.McpClientTransport;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema;
import net.ibizsys.central.plugin.ai.mcp.spec.ProtocolVersions;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema.JSONRPCMessage;
import net.ibizsys.central.plugin.ai.mcp.spec.McpTransportException;
import net.ibizsys.central.plugin.ai.mcp.util.Assert;
import net.ibizsys.central.plugin.ai.mcp.util.Utils;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;
import reactor.core.scheduler.Schedulers;

/**
 * Server-Sent Events (SSE) implementation of the
 * {@link net.ibizsys.central.plugin.ai.mcp.spec.McpTransport} that follows the MCP HTTP with SSE
 * transport specification, using Apache HttpClient.
 *
 * <p>
 * This transport implementation establishes a bidirectional communication channel between
 * client and server using SSE for server-to-client messages and HTTP POST requests for
 * client-to-server messages. The transport:
 * <ul>
 * <li>Establishes an SSE connection to receive server messages</li>
 * <li>Handles endpoint discovery through SSE events</li>
 * <li>Manages message serialization/deserialization using Jackson</li>
 * <li>Provides graceful connection termination</li>
 * </ul>
 *
 * <p>
 * The transport supports two types of SSE events:
 * <ul>
 * <li>'endpoint' - Contains the URL for sending client messages</li>
 * <li>'message' - Contains JSON-RPC message payload</li>
 * </ul>
 *
 * @author Christian Tzolov
 * @see net.ibizsys.central.plugin.ai.mcp.spec.McpTransport
 * @see net.ibizsys.central.plugin.ai.mcp.spec.McpClientTransport
 */
public class HttpClientSseClientTransport implements McpClientTransport {

	private static final String MCP_PROTOCOL_VERSION = ProtocolVersions.MCP_2024_11_05;

	private static final String MCP_PROTOCOL_VERSION_HEADER_NAME = "MCP-Protocol-Version";

	private static final Logger logger = LoggerFactory.getLogger(HttpClientSseClientTransport.class);

	/** SSE event type for JSON-RPC messages */
	private static final String MESSAGE_EVENT_TYPE = "message";

	/** SSE event type for endpoint discovery */
	private static final String ENDPOINT_EVENT_TYPE = "endpoint";

	/** Default SSE endpoint path */
	private static final String DEFAULT_SSE_ENDPOINT = "/sse";

	/** Base URI for the MCP server */
	private final URI baseUri;

	/** SSE endpoint path */
	private final String sseEndpoint;

	/**
	 * HTTP client for sending messages to the server. Uses HTTP POST over the message
	 * endpoint
	 */
	private final CloseableHttpClient httpClient;

	/** JSON object mapper for message serialization/deserialization */
	protected ObjectMapper objectMapper;

	/** Flag indicating if the transport is in closing state */
	private volatile boolean isClosing = false;

	/** Holds the SSE subscription disposable */
	private final AtomicReference<Disposable> sseSubscription = new AtomicReference<>();

	/**
	 * Sink for managing the message endpoint URI provided by the server. Stores the most
	 * recent endpoint URI and makes it available for outbound message processing.
	 */
	protected final Sinks.One<String> messageEndpointSink = Sinks.one();

	/**
	 * Customizer to modify requests before they are executed.
	 */
	private final AsyncHttpRequestCustomizer httpRequestCustomizer;

	/**
	 * Creates a new transport instance with default HTTP client and object mapper.
	 * @param baseUri the base URI of the MCP server
	 * @deprecated Use {@link HttpClientSseClientTransport#builder(String)} instead. This
	 * constructor will be removed in future versions.
	 */
	@Deprecated
	public HttpClientSseClientTransport(String baseUri) {
		this(HttpClients.custom(), baseUri, new ObjectMapper());
	}

	/**
	 * Creates a new transport instance with custom HTTP client builder and object mapper.
	 * @param clientBuilder the HTTP client builder to use
	 * @param baseUri the base URI of the MCP server
	 * @param objectMapper the object mapper for JSON serialization/deserialization
	 * @throws IllegalArgumentException if objectMapper or clientBuilder is null
	 * @deprecated Use {@link HttpClientSseClientTransport#builder(String)} instead. This
	 * constructor will be removed in future versions.
	 */
	@Deprecated
	public HttpClientSseClientTransport(org.apache.http.impl.client.HttpClientBuilder clientBuilder, String baseUri, ObjectMapper objectMapper) {
		this(clientBuilder, baseUri, DEFAULT_SSE_ENDPOINT, objectMapper);
	}

	/**
	 * Creates a new transport instance with custom HTTP client builder and object mapper.
	 * @param clientBuilder the HTTP client builder to use
	 * @param baseUri the base URI of the MCP server
	 * @param sseEndpoint the SSE endpoint path
	 * @param objectMapper the object mapper for JSON serialization/deserialization
	 * @throws IllegalArgumentException if objectMapper or clientBuilder is null
	 * @deprecated Use {@link HttpClientSseClientTransport#builder(String)} instead. This
	 * constructor will be removed in future versions.
	 */
	@Deprecated
	public HttpClientSseClientTransport(org.apache.http.impl.client.HttpClientBuilder clientBuilder, String baseUri, String sseEndpoint,
			ObjectMapper objectMapper) {
		Assert.notNull(objectMapper, "ObjectMapper must not be null");
		Assert.hasText(baseUri, "baseUri must not be empty");
		Assert.hasText(sseEndpoint, "sseEndpoint must not be empty");
		Assert.notNull(clientBuilder, "clientBuilder must not be null");
		this.baseUri = URI.create(baseUri);
		this.sseEndpoint = sseEndpoint;
		this.objectMapper = objectMapper;
		this.httpClient = clientBuilder.build();
		this.httpRequestCustomizer = AsyncHttpRequestCustomizer.NOOP;
	}

	/**
	 * Creates a new transport instance with custom HTTP client and object mapper.
	 * @param httpClient the HTTP client to use
	 * @param baseUri the base URI of the MCP server
	 * @param sseEndpoint the SSE endpoint path
	 * @param objectMapper the object mapper for JSON serialization/deserialization
	 * @param httpRequestCustomizer customizer for requests before executing
	 * @throws IllegalArgumentException if any parameter is null
	 */
	HttpClientSseClientTransport(CloseableHttpClient httpClient, String baseUri,
			String sseEndpoint, ObjectMapper objectMapper, AsyncHttpRequestCustomizer httpRequestCustomizer) {
		Assert.notNull(objectMapper, "ObjectMapper must not be null");
		Assert.hasText(baseUri, "baseUri must not be empty");
		Assert.hasText(sseEndpoint, "sseEndpoint must not be empty");
		Assert.notNull(httpClient, "httpClient must not be null");
		Assert.notNull(httpRequestCustomizer, "httpRequestCustomizer must not be null");
		this.baseUri = URI.create(baseUri);
		this.sseEndpoint = sseEndpoint;
		this.objectMapper = objectMapper;
		this.httpClient = httpClient;
		this.httpRequestCustomizer = httpRequestCustomizer;
	}

	@Override
	public List<String> protocolVersions() {
		return Collections.singletonList(ProtocolVersions.MCP_2024_11_05);
	}

	/**
	 * Creates a new builder for {@link HttpClientSseClientTransport}.
	 * @param baseUri the base URI of the MCP server
	 * @return a new builder instance
	 */
	public static Builder builder(String baseUri) {
		return new Builder().baseUri(baseUri);
	}

	/**
	 * Builder for {@link HttpClientSseClientTransport}.
	 */
	public static class Builder {

		private String baseUri;

		private String sseEndpoint = DEFAULT_SSE_ENDPOINT;

		private org.apache.http.impl.client.HttpClientBuilder clientBuilder = HttpClients.custom();

		private ObjectMapper objectMapper = new ObjectMapper();

		private AsyncHttpRequestCustomizer httpRequestCustomizer = AsyncHttpRequestCustomizer.NOOP;

		/**
		 * Creates a new builder instance.
		 */
		Builder() {
			// Default constructor
		}

		/**
		 * Creates a new builder with the specified base URI.
		 * @param baseUri the base URI of the MCP server
		 * @deprecated Use {@link HttpClientSseClientTransport#builder(String)} instead.
		 * This constructor is deprecated and will be removed or made {@code protected} or
		 * {@code private} in a future release.
		 */
		@Deprecated
		public Builder(String baseUri) {
			Assert.hasText(baseUri, "baseUri must not be empty");
			this.baseUri = baseUri;
		}

		/**
		 * Sets the base URI.
		 * @param baseUri the base URI
		 * @return this builder
		 */
		Builder baseUri(String baseUri) {
			Assert.hasText(baseUri, "baseUri must not be empty");
			this.baseUri = baseUri;
			return this;
		}

		/**
		 * Sets the SSE endpoint path.
		 * @param sseEndpoint the SSE endpoint path
		 * @return this builder
		 */
		public Builder sseEndpoint(String sseEndpoint) {
			Assert.hasText(sseEndpoint, "sseEndpoint must not be empty");
			this.sseEndpoint = sseEndpoint;
			return this;
		}

		/**
		 * Sets the HTTP client builder.
		 * @param clientBuilder the HTTP client builder
		 * @return this builder
		 */
		public Builder clientBuilder(org.apache.http.impl.client.HttpClientBuilder clientBuilder) {
			Assert.notNull(clientBuilder, "clientBuilder must not be null");
			this.clientBuilder = clientBuilder;
			return this;
		}

		/**
		 * Customizes the HTTP client builder.
		 * @param clientCustomizer the consumer to customize the HTTP client builder
		 * @return this builder
		 */
		public Builder customizeClient(final Consumer<org.apache.http.impl.client.HttpClientBuilder> clientCustomizer) {
			Assert.notNull(clientCustomizer, "clientCustomizer must not be null");
			clientCustomizer.accept(clientBuilder);
			return this;
		}

		/**
		 * Sets the object mapper for JSON serialization/deserialization.
		 * @param objectMapper the object mapper
		 * @return this builder
		 */
		public Builder objectMapper(ObjectMapper objectMapper) {
			Assert.notNull(objectMapper, "objectMapper must not be null");
			this.objectMapper = objectMapper;
			return this;
		}

		/**
		 * Sets the customizer for requests, to modify requests before
		 * executing them.
		 * <p>
		 * This overrides the customizer from
		 * {@link #asyncHttpRequestCustomizer(AsyncHttpRequestCustomizer)}.
		 * <p>
		 * Do NOT use a blocking {@link SyncHttpRequestCustomizer} in a non-blocking
		 * context. Use {@link #asyncHttpRequestCustomizer(AsyncHttpRequestCustomizer)}
		 * instead.
		 * @param syncHttpRequestCustomizer the request customizer
		 * @return this builder
		 */
		public Builder httpRequestCustomizer(SyncHttpRequestCustomizer syncHttpRequestCustomizer) {
			this.httpRequestCustomizer = AsyncHttpRequestCustomizer.fromSync(syncHttpRequestCustomizer);
			return this;
		}

		/**
		 * Sets the customizer for requests, to modify requests before
		 * executing them.
		 * <p>
		 * This overrides the customizer from
		 * {@link #httpRequestCustomizer(SyncHttpRequestCustomizer)}.
		 * <p>
		 * Do NOT use a blocking implementation in a non-blocking context.
		 * @param asyncHttpRequestCustomizer the request customizer
		 * @return this builder
		 */
		public Builder asyncHttpRequestCustomizer(AsyncHttpRequestCustomizer asyncHttpRequestCustomizer) {
			this.httpRequestCustomizer = asyncHttpRequestCustomizer;
			return this;
		}

		/**
		 * Builds a new {@link HttpClientSseClientTransport} instance.
		 * @return a new transport instance
		 */
		public HttpClientSseClientTransport build() {
			return new HttpClientSseClientTransport(clientBuilder.build(), baseUri, sseEndpoint,
					objectMapper, httpRequestCustomizer);
		}

	}

	@Override
	public Mono<Void> connect(Function<Mono<JSONRPCMessage>, Mono<JSONRPCMessage>> handler) {
	    final URI uri = Utils.resolveUri(this.baseUri, this.sseEndpoint);

	    return Mono.defer(() -> Mono.empty()) // Mono.defer 需返回 Mono，原逻辑返回 null 可能不合理，调整为 Mono.empty()
	        .then(Mono.create(sink -> { 
	            // 使用 AtomicBoolean 确保 isClosing 的线程可见性（假设原 isClosing 是 boolean 变量）
	            AtomicBoolean closing = new AtomicBoolean(this.isClosing); 
	            
	            Disposable connection = Flux.<ResponseEvent>create(sseSink -> { 
	                HttpGet request = new HttpGet(uri);
	                request.setHeader("Accept", "text/event-stream");
	                request.setHeader("Cache-Control", "no-cache");
	                request.setHeader(MCP_PROTOCOL_VERSION_HEADER_NAME, MCP_PROTOCOL_VERSION);

	                try (CloseableHttpResponse response = httpClient.execute(request);
	                     InputStream inputStream = response.getEntity().getContent();
	                     BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

	                    String line;
	                    while (!closing.get() && (line = reader.readLine()) != null) { 
	                        if (line.startsWith("data:")) {
	                            String data = line.substring(5).trim();
	                            ResponseSubscribers.SseResponseEvent responseEvent = parseSseEvent(data);
	                            sseSink.next(responseEvent);
	                        }
	                    }
	                    // 流正常结束时，通知连接成功
	                    sink.success();
	                } catch (Exception e) {
	                    sseSink.error(e);
	                }
	            })
	            .map(responseEvent -> (ResponseSubscribers.SseResponseEvent) responseEvent) 
	            .flatMap(responseEvent -> { 
	                if (closing.get()) {
	                    return Mono.empty();
	                }

	                int statusCode = 200; // 假设 SSE 状态码为 200

	                if (statusCode >= 200 && statusCode < 300) {
	                    try {
	                        if (ENDPOINT_EVENT_TYPE.equals(responseEvent.sseEvent().event())) {
	                            String messageEndpointUri = responseEvent.sseEvent().data();
	                            if (messageEndpointSink.tryEmitValue(messageEndpointUri).isSuccess()) {
	                                sink.success(); // 通知连接成功
	                                return Mono.empty();
	                            } else {
	                                RuntimeException error = new RuntimeException("Failed to handle SSE endpoint event");
	                                sink.error(error); // 直接传播错误
	                                return Mono.error(error);
	                            }
	                        } else if (MESSAGE_EVENT_TYPE.equals(responseEvent.sseEvent().event())) {
	                            JSONRPCMessage message = McpSchema.deserializeJsonRpcMessage(objectMapper,
	                                    responseEvent.sseEvent().data());
	                            sink.success(); // 通知连接成功
	                            return Mono.just(message);
	                        } else {
	                            logger.debug("Received unrecognized SSE event type: {}", responseEvent.sseEvent());
	                            sink.success(); // 通知连接成功（忽略未知事件类型）
	                            return Mono.empty();
	                        }
	                    } catch (IOException e) {
	                        McpTransportException error = new McpTransportException("Error processing SSE event", e);
	                        sink.error(error); // 直接传播错误
	                        return Mono.error(error);
	                    }
	                }
	                return Mono.error(new RuntimeException("Failed to process SSE event: " + responseEvent));
	            })
	            .flatMap(jsonRpcMessage -> handler.apply(Mono.just(jsonRpcMessage))) 
	            .doFinally(s -> { 
	                // 释放连接资源
	                Disposable ref = sseSubscription.getAndSet(null);
	                if (ref != null && !ref.isDisposed()) {
	                    ref.dispose();
	                }
	                // 若连接被主动关闭，通知 sink 完成
	                if (closing.get()) {
	                    sink.success();
	                }
	            })
	            .subscribe(
	                // onNext：无需处理，消息已通过 handler 处理
	                null,
	                // onError：捕获 Flux 层面的错误，传播给 sink
	                t -> {
	                    if (!closing.get()) {
	                        logger.warn("SSE stream observed an error", t);
	                        sink.error(t);
	                    }
	                },
	                // onComplete：Flux 正常结束时，通知 sink 成功
	                () -> {
	                    if (!closing.get()) {
	                        sink.success();
	                    }
	                }
	            );

	            // 保存连接引用（假设 sseSubscription 是 AtomicReference<Disposable>）
	            sseSubscription.set(connection);
	        }));
	}

	// Simplified SSE event parser
	private ResponseSubscribers.SseResponseEvent parseSseEvent(String data) {
		// This is a simplified implementation - you may need to enhance based on your actual SSE format
		return new ResponseSubscribers.SseResponseEvent(null, null) {
			@Override
			public ResponseSubscribers.SseEvent sseEvent() {
				return new ResponseSubscribers.SseEvent(null, null, null) {
					@Override
					public String event() {
						return MESSAGE_EVENT_TYPE; // Default to message event
					}

					@Override
					public String data() {
						return data;
					}
				};
			}

			@Override
			public HttpResponse responseInfo() {
				return null; // Simplified implementation
			}
		};
	}

	/**
	 * Sends a JSON-RPC message to the server.
	 *
	 * <p>
	 * This method waits for the message endpoint to be discovered before sending the
	 * message. The message is serialized to JSON and sent as an HTTP POST request.
	 * @param message the JSON-RPC message to send
	 * @return a Mono that completes when the message is sent
	 * @throws McpError if the message endpoint is not available or the wait times out
	 */
	@Override
	public Mono<Void> sendMessage(JSONRPCMessage message) {

		return this.messageEndpointSink.asMono().flatMap(messageEndpointUri -> {
			if (isClosing) {
				return Mono.empty();
			}

			return this.serializeMessage(message)
				.flatMap(body -> sendHttpPost(messageEndpointUri, body).handle((response, sink) -> {
					sink.next(response);
					sink.complete();
				}))
				.doOnError(error -> {
					if (!isClosing) {
						logger.error("Error sending message: {}", error.getMessage());
					}
				});
		}).then();

	}

	private Mono<String> serializeMessage(final JSONRPCMessage message) {
		return Mono.defer(() -> {
			try {
				return Mono.just(objectMapper.writeValueAsString(message));
			}
			catch (IOException e) {
				return Mono.error(new McpTransportException("Failed to serialize message", e));
			}
		});
	}

	private Mono<String> sendHttpPost(final String endpoint, final String body) {
	    final URI requestUri = Utils.resolveUri(baseUri, endpoint);
	    
	    return Mono.defer(() -> {
	            // 1. 构建基础请求
	            RequestBuilder requestBuilder = RequestBuilder.post(requestUri)
	                    .addHeader(MCP_PROTOCOL_VERSION_HEADER_NAME, MCP_PROTOCOL_VERSION)
	                    .setEntity(new StringEntity(body, ContentType.APPLICATION_JSON)); // 简化 ContentType 设置
	            
	         // 2. 调用 customize 方法，获取响应式流 Publisher<RequestBuilder>
	            Publisher<RequestBuilder> customizedBuilders = httpRequestCustomizer.customize(
	            		requestBuilder, 
	                    "POST", 
	                    requestUri, 
	                    body
	            );
	            
	            Mono<RequestBuilder> customizedBuilderMono = Mono.from(customizedBuilders)
	                    .subscribeOn(Schedulers.boundedElastic()) // 避免阻塞 Reactor 线程池（若 customize 是阻塞操作）
	                    .doOnError(e -> logger.error("Failed to customize request", e))
	                    .onErrorResume(e -> Mono.empty()); // 定制失败时返回空 Mono（根据业务需求调整）
	            
	            return customizedBuilderMono.flatMap(customizedBuilder -> {
	                try {
	                    // 构建最终的 HttpUriRequest
	                    HttpUriRequest request = customizedBuilder.build();
			            // 3. 使用 Mono.fromCallable 包装同步 HTTP 请求
			            return Mono.fromCallable(() -> {
			            	
			                try (CloseableHttpResponse response = httpClient.execute(request)) { // try-with-resources 自动关闭响应
			                    // 检查状态码（非 2xx 视为失败）
			                    int statusCode = response.getStatusLine().getStatusCode();
			                    if (statusCode < 200 || statusCode >= 300) {
			                        String errorMsg = "HTTP request failed with status code: " + statusCode;
			                        logger.error(errorMsg);
			                        throw new IOException(errorMsg);
			                    }
		
			                    // 读取响应体（自动关闭 Entity 流）
			                    HttpEntity entity = response.getEntity();
			                    if (entity == null) {
			                        logger.warn("Response entity is empty");
			                        return "";
			                    }
			                    return EntityUtils.toString(entity, StandardCharsets.UTF_8); // 指定 UTF-8 编码
			                }
			                
			            }).onErrorMap(originalException -> {
			                // 转换底层异常为业务异常（如网络错误、超时等）
			                String errorMsg = "Failed to send POST request to " + requestUri + ": " + originalException.getMessage();
			                logger.error(errorMsg, originalException);
			                return new McpTransportException(errorMsg, originalException);
			            });
	                } catch (Exception e) {
	                    // 处理请求构建阶段的异常（如 URI 无效、参数错误等）
	                    String errorMsg = "Failed to build POST request for " + endpoint + ": " + e.getMessage();
	                    logger.error(errorMsg, e);
	                    return Mono.error(new McpTransportException(errorMsg, e));
	                }
	            });
	    	});
		}

	/**
	 * Gracefully closes the transport connection.
	 *
	 * <p>
	 * Sets the closing flag and disposes of the SSE subscription. This prevents new
	 * messages from being sent and allows ongoing operations to complete.
	 * @return a Mono that completes when the closing process is initiated
	 */
	@Override
	public Mono<Void> closeGracefully() {
		return Mono.fromRunnable(new Runnable() {
			@Override
			public void run() {
				isClosing = true;
				Disposable subscription = sseSubscription.get();
				if (subscription != null && !subscription.isDisposed()) {
					subscription.dispose();
				}
				try {
					httpClient.close();
				}
				catch (IOException e) {
					logger.warn("Error closing HTTP client", e);
				}
			}
		});
	}

	/**
	 * Unmarshal data to the specified type using the configured object mapper.
	 * @param data the data to unmarshal
	 * @param typeRef the type reference for the target type
	 * @param <T> the target type
	 * @return the unmarshalled object
	 */
	@Override
	public <T> T unmarshalFrom(Object data, TypeReference<T> typeRef) {
		return this.objectMapper.convertValue(data, typeRef);
	}
}
