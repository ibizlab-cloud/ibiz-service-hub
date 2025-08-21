/*
 * Copyright 2024-2024 the original author or authors.
 */

package net.ibizsys.central.plugin.ai.mcp.spec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.ibizsys.central.plugin.ai.mcp.util.Assert;

/**
 * Based on the <a href="http://www.jsonrpc.org/specification">JSON-RPC 2.0
 * specification</a> and the <a href=
 * "https://github.com/modelcontextprotocol/specification/blob/main/schema/2024-11-05/schema.ts">Model
 * Context Protocol Schema</a>.
 *
 * @author Christian Tzolov
 * @author Luca Chang
 * @author Surbhi Bansal
 * @author Anurag Pant
 */
public final class McpSchema {

	private static final Logger logger = LoggerFactory.getLogger(McpSchema.class);

	private McpSchema() {
	}

	@Deprecated
	public static final String LATEST_PROTOCOL_VERSION = ProtocolVersions.MCP_2025_03_26;

	public static final String JSONRPC_VERSION = "2.0";

	public static final String FIRST_PAGE = null;

	// ---------------------------
	// Method Names
	// ---------------------------

	// Lifecycle Methods
	public static final String METHOD_INITIALIZE = "initialize";

	public static final String METHOD_NOTIFICATION_INITIALIZED = "notifications/initialized";

	public static final String METHOD_PING = "ping";

	public static final String METHOD_NOTIFICATION_PROGRESS = "notifications/progress";

	// Tool Methods
	public static final String METHOD_TOOLS_LIST = "tools/list";

	public static final String METHOD_TOOLS_CALL = "tools/call";

	public static final String METHOD_NOTIFICATION_TOOLS_LIST_CHANGED = "notifications/tools/list_changed";

	// Resources Methods
	public static final String METHOD_RESOURCES_LIST = "resources/list";

	public static final String METHOD_RESOURCES_READ = "resources/read";

	public static final String METHOD_NOTIFICATION_RESOURCES_LIST_CHANGED = "notifications/resources/list_changed";

	public static final String METHOD_NOTIFICATION_RESOURCES_UPDATED = "notifications/resources/updated";

	public static final String METHOD_RESOURCES_TEMPLATES_LIST = "resources/templates/list";

	public static final String METHOD_RESOURCES_SUBSCRIBE = "resources/subscribe";

	public static final String METHOD_RESOURCES_UNSUBSCRIBE = "resources/unsubscribe";

	// Prompt Methods
	public static final String METHOD_PROMPT_LIST = "prompts/list";

	public static final String METHOD_PROMPT_GET = "prompts/get";

	public static final String METHOD_NOTIFICATION_PROMPTS_LIST_CHANGED = "notifications/prompts/list_changed";

	public static final String METHOD_COMPLETION_COMPLETE = "completion/complete";

	// Logging Methods
	public static final String METHOD_LOGGING_SET_LEVEL = "logging/setLevel";

	public static final String METHOD_NOTIFICATION_MESSAGE = "notifications/message";

	// Roots Methods
	public static final String METHOD_ROOTS_LIST = "roots/list";

	public static final String METHOD_NOTIFICATION_ROOTS_LIST_CHANGED = "notifications/roots/list_changed";

	// Sampling Methods
	public static final String METHOD_SAMPLING_CREATE_MESSAGE = "sampling/createMessage";

	// Elicitation Methods
	public static final String METHOD_ELICITATION_CREATE = "elicitation/create";

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	// ---------------------------
	// JSON-RPC Error Codes
	// ---------------------------
	/**
	 * Standard error codes used in MCP JSON-RPC responses.
	 */
	public static final class ErrorCodes {

		/**
		 * Invalid JSON was received by the server.
		 */
		public static final int PARSE_ERROR = -32700;

		/**
		 * The JSON sent is not a valid Request object.
		 */
		public static final int INVALID_REQUEST = -32600;

		/**
		 * The method does not exist / is not available.
		 */
		public static final int METHOD_NOT_FOUND = -32601;

		/**
		 * Invalid method parameter(s).
		 */
		public static final int INVALID_PARAMS = -32602;

		/**
		 * Internal JSON-RPC error.
		 */
		public static final int INTERNAL_ERROR = -32603;

	}

	//public sealed interface Request
	//		permits InitializeRequest, CallToolRequest, CreateMessageRequest, ElicitRequest, CompleteRequest,
	//		GetPromptRequest, ReadResourceRequest, SubscribeRequest, UnsubscribeRequest, PaginatedRequest {
	public interface Request{
		Map<String, Object> meta();

		default String progressToken() {
			if (meta() != null && meta().containsKey("progressToken")) {
				return meta().get("progressToken").toString();
			}
			return null;
		}

	}

//	public sealed interface Result permits InitializeResult, ListResourcesResult, ListResourceTemplatesResult,
//			ReadResourceResult, ListPromptsResult, GetPromptResult, ListToolsResult, CallToolResult,
//			CreateMessageResult, ElicitResult, CompleteResult, ListRootsResult {
	public interface Result{

		Map<String, Object> meta();

	}

//	public sealed interface Notification
//			permits ProgressNotification, LoggingMessageNotification, ResourcesUpdatedNotification {
	public interface Notification{
		Map<String, Object> meta();

	}

	private static final TypeReference<HashMap<String, Object>> MAP_TYPE_REF = new TypeReference<HashMap<String, Object>>() {
	};

	/**
	 * Deserializes a JSON string into a JSONRPCMessage object.
	 * @param objectMapper The ObjectMapper instance to use for deserialization
	 * @param jsonText The JSON string to deserialize
	 * @return A JSONRPCMessage instance using either the {@link JSONRPCRequest},
	 * {@link JSONRPCNotification}, or {@link JSONRPCResponse} classes.
	 * @throws IOException If there's an error during deserialization
	 * @throws IllegalArgumentException If the JSON structure doesn't match any known
	 * message type
	 */
	public static JSONRPCMessage deserializeJsonRpcMessage(ObjectMapper objectMapper, String jsonText)
			throws IOException {

		logger.debug("Received JSON message: {}", jsonText);

		Map map = objectMapper.readValue(jsonText, MAP_TYPE_REF);

		// Determine message type based on specific JSON structure
		if (map.containsKey("method") && map.containsKey("id")) {
			return objectMapper.convertValue(map, JSONRPCRequest.class);
		}
		else if (map.containsKey("method") && !map.containsKey("id")) {
			return objectMapper.convertValue(map, JSONRPCNotification.class);
		}
		else if (map.containsKey("result") || map.containsKey("error")) {
			return objectMapper.convertValue(map, JSONRPCResponse.class);
		}

		throw new IllegalArgumentException("Cannot deserialize JSONRPCMessage: " + jsonText);
	}

	// ---------------------------
	// JSON-RPC Message Types
	// ---------------------------
	//public sealed interface JSONRPCMessage permits JSONRPCRequest, JSONRPCNotification, JSONRPCResponse {
	public interface JSONRPCMessage {

		String jsonrpc();

	}

	/**
	 * A request that expects a response.
	 *
	 * @param jsonrpc The JSON-RPC version (must be "2.0")
	 * @param method The name of the method to be invoked
	 * @param id A unique identifier for the request
	 * @param params Parameters for the method call
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	// @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
//	public record JSONRPCRequest( // @formatter:off
//		@JsonProperty("jsonrpc") String jsonrpc,
//		@JsonProperty("method") String method,
//		@JsonProperty("id") Object id,
//		@JsonProperty("params") Object params) implements JSONRPCMessage { // @formatter:on
//
//		/**
//		 * Constructor that validates MCP-specific ID requirements. Unlike base JSON-RPC,
//		 * MCP requires that: (1) Requests MUST include a string or integer ID; (2) The ID
//		 * MUST NOT be null
//		 */
//		public JSONRPCRequest {
//			Assert.notNull(id, "MCP requests MUST include an ID - null IDs are not allowed");
//			Assert.isTrue(id instanceof String || id instanceof Integer || id instanceof Long,
//					"MCP requests MUST have an ID that is either a string or integer");
//		}
//	}
	
	public final static class JSONRPCRequest implements JSONRPCMessage {
	    private final String jsonrpc;
	    private final String method;
	    private final Object id;
	    private final Object params;

	    @JsonProperty("jsonrpc")
	    public String jsonrpc() { 
	        return jsonrpc; 
	    }

	    @JsonProperty("method")
	    public String method() { 
	        return method; 
	    }

	    @JsonProperty("id")
	    public Object id() { 
	        return id; 
	    }

	    @JsonProperty("params")
	    public Object params() { 
	        return params; 
	    }

	    public JSONRPCRequest(
	        @JsonProperty("jsonrpc") String jsonrpc,
	        @JsonProperty("method") String method,
	        @JsonProperty("id") Object id,
	        @JsonProperty("params") Object params
	    ) {
	        // 参数校验逻辑（原紧凑构造函数逻辑）
	        Assert.notNull(id, "MCP requests MUST include an ID - null IDs are not allowed");
	        Assert.isTrue(
	            id instanceof String || id instanceof Integer || id instanceof Long,
	            "MCP requests MUST have an ID that is either a string or integer"
	        );
	        
	        this.jsonrpc = jsonrpc;
	        this.method = method;
	        this.id = id;
	        this.params = params;
	    }

	    // 手动实现 equals(), hashCode(), toString()
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        JSONRPCRequest that = (JSONRPCRequest) o;
	        return Objects.equals(jsonrpc, that.jsonrpc) &&
	               Objects.equals(method, that.method) &&
	               Objects.equals(id, that.id) &&
	               Objects.equals(params, that.params);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(jsonrpc, method, id, params);
	    }

	    @Override
	    public String toString() {
	        return "JSONRPCRequest{" +
	               "jsonrpc='" + jsonrpc + '\'' +
	               ", method='" + method + '\'' +
	               ", id=" + id +
	               ", params=" + params +
	               '}';
	    }
	}

	/**
	 * A notification which does not expect a response.
	 *
	 * @param jsonrpc The JSON-RPC version (must be "2.0")
	 * @param method The name of the method being notified
	 * @param params Parameters for the notification
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	// TODO: batching support
	// @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
//	public record JSONRPCNotification( // @formatter:off
//		@JsonProperty("jsonrpc") String jsonrpc,
//		@JsonProperty("method") String method,
//		@JsonProperty("params") Object params) implements JSONRPCMessage { // @formatter:on
//	}
	public final static class JSONRPCNotification implements JSONRPCMessage {
	    private final String jsonrpc;
	    private final String method;
	    private final Object params;

	    public JSONRPCNotification(
	        @JsonProperty("jsonrpc") String jsonrpc,
	        @JsonProperty("method") String method,
	        @JsonProperty("params") Object params
	    ) {
	        this.jsonrpc = jsonrpc;
	        this.method = method;
	        this.params = params;
	    }

	    @JsonProperty("jsonrpc")
	    public String jsonrpc() { 
	        return jsonrpc; 
	    }

	    @JsonProperty("method")
	    public String method() { 
	        return method; 
	    }

	    @JsonProperty("params")
	    public Object params() { 
	        return params; 
	    }

	    // 手动实现 equals 和 hashCode
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        JSONRPCNotification that = (JSONRPCNotification) o;
	        return Objects.equals(jsonrpc, that.jsonrpc) &&
	               Objects.equals(method, that.method) &&
	               Objects.equals(params, that.params);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(jsonrpc, method, params);
	    }

	    @Override
	    public String toString() {
	        return "JSONRPCNotification{" +
	               "jsonrpc='" + jsonrpc + '\'' +
	               ", method='" + method + '\'' +
	               ", params=" + params +
	               '}';
	    }
	}

	/**
	 * A successful (non-error) response to a request.
	 *
	 * @param jsonrpc The JSON-RPC version (must be "2.0")
	 * @param id The request identifier that this response corresponds to
	 * @param result The result of the successful request
	 * @param error Error information if the request failed
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	// TODO: batching support
	// @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
//	public record JSONRPCResponse( // @formatter:off
//		@JsonProperty("jsonrpc") String jsonrpc,
//		@JsonProperty("id") Object id,
//		@JsonProperty("result") Object result,
//		@JsonProperty("error") JSONRPCError error) implements JSONRPCMessage { // @formatter:on
//
//		/**
//		 * A response to a request that indicates an error occurred.
//		 *
//		 * @param code The error type that occurred
//		 * @param message A short description of the error. The message SHOULD be limited
//		 * to a concise single sentence
//		 * @param data Additional information about the error. The value of this member is
//		 * defined by the sender (e.g. detailed error information, nested errors etc.)
//		 */
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		@JsonIgnoreProperties(ignoreUnknown = true)
//		public record JSONRPCError( // @formatter:off
//			@JsonProperty("code") int code,
//			@JsonProperty("message") String message,
//			@JsonProperty("data") Object data) { // @formatter:on
//		}
//	}
	/**
	 * JSON-RPC 2.0 响应对象（JDK 8 兼容实现）
	 */
	public final static class JSONRPCResponse implements JSONRPCMessage {
	    private final String jsonrpc;
	    private final Object id;
	    private final Object result;
	    private final JSONRPCError error;

	    public JSONRPCResponse(
	        @JsonProperty("jsonrpc") String jsonrpc,
	        @JsonProperty("id") Object id,
	        @JsonProperty("result") Object result,
	        @JsonProperty("error") JSONRPCError error
	    ) {
	        this.jsonrpc = jsonrpc;
	        this.id = id;
	        this.result = result;
	        this.error = error;
	    }

	    @JsonProperty("jsonrpc")
	    public String jsonrpc() {
	        return jsonrpc;
	    }

	    @JsonProperty("id")
	    public Object id() {
	        return id;
	    }

	    @JsonProperty("result")
	    public Object result() {
	        return result;
	    }

	    @JsonProperty("error")
	    public JSONRPCError error() {
	        return error;
	    }

	    // 手动实现 record 的自动生成方法
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        JSONRPCResponse that = (JSONRPCResponse) o;
	        return Objects.equals(jsonrpc, that.jsonrpc) &&
	               Objects.equals(id, that.id) &&
	               Objects.equals(result, that.result) &&
	               Objects.equals(error, that.error);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(jsonrpc, id, result, error);
	    }

	    @Override
	    public String toString() {
	        return "JSONRPCResponse{" +
	               "jsonrpc='" + jsonrpc + '\'' +
	               ", id=" + id +
	               ", result=" + result +
	               ", error=" + error +
	               '}';
	    }

	    /**
	     * JSON-RPC 错误对象（JDK 8 兼容实现）
	     */
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    @JsonIgnoreProperties(ignoreUnknown = true)
	    public final static class JSONRPCError {
	        private final int code;
	        private final String message;
	        private final Object data;

	        public JSONRPCError(
	            @JsonProperty("code") int code,
	            @JsonProperty("message") String message,
	            @JsonProperty("data") Object data
	        ) {
	            this.code = code;
	            this.message = message;
	            this.data = data;
	        }

	        @JsonProperty("code")
	        public int code() {
	            return code;
	        }

	        @JsonProperty("message")
	        public String message() {
	            return message;
	        }

	        @JsonProperty("data")
	        public Object data() {
	            return data;
	        }

	        // 手动实现 record 的自动生成方法
	        @Override
	        public boolean equals(Object o) {
	            if (this == o) return true;
	            if (o == null || getClass() != o.getClass()) return false;
	            JSONRPCError that = (JSONRPCError) o;
	            return code == that.code &&
	                   Objects.equals(message, that.message) &&
	                   Objects.equals(data, that.data);
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash(code, message, data);
	        }

	        @Override
	        public String toString() {
	            return "JSONRPCError{" +
	                   "code=" + code +
	                   ", message='" + message + '\'' +
	                   ", data=" + data +
	                   '}';
	        }
	    }
	}

	// ---------------------------
	// Initialization
	// ---------------------------
	/**
	 * This request is sent from the client to the server when it first connects, asking
	 * it to begin initialization.
	 *
	 * @param protocolVersion The latest version of the Model Context Protocol that the
	 * client supports. The client MAY decide to support older versions as well
	 * @param capabilities The capabilities that the client supports
	 * @param clientInfo Information about the client implementation
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record InitializeRequest( // @formatter:off
//		@JsonProperty("protocolVersion") String protocolVersion,
//		@JsonProperty("capabilities") ClientCapabilities capabilities,
//		@JsonProperty("clientInfo") Implementation clientInfo,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Request { // @formatter:on
//
//		public InitializeRequest(String protocolVersion, ClientCapabilities capabilities, Implementation clientInfo) {
//			this(protocolVersion, capabilities, clientInfo, null);
//		}
//	}
	public final static class InitializeRequest implements Request {
	    private final String protocolVersion;
	    private final ClientCapabilities capabilities;
	    private final Implementation clientInfo;
	    private final Map<String, Object> meta;

	    // 全参数构造函数
	    public InitializeRequest(
	        @JsonProperty("protocolVersion") String protocolVersion,
	        @JsonProperty("capabilities") ClientCapabilities capabilities,
	        @JsonProperty("clientInfo") Implementation clientInfo,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.protocolVersion = protocolVersion;
	        this.capabilities = capabilities;
	        this.clientInfo = clientInfo;
	        this.meta = meta;
	    }

	    // 三参数构造函数（设置 meta 为 null）
	    public InitializeRequest(
	        String protocolVersion,
	        ClientCapabilities capabilities,
	        Implementation clientInfo
	    ) {
	        this(protocolVersion, capabilities, clientInfo, null);
	    }

	    // 访问方法
	    @JsonProperty("protocolVersion")
	    public String protocolVersion() {
	        return protocolVersion;
	    }

	    @JsonProperty("capabilities")
	    public ClientCapabilities capabilities() {
	        return capabilities;
	    }

	    @JsonProperty("clientInfo")
	    public Implementation clientInfo() {
	        return clientInfo;
	    }

	    @Override
	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // 手动实现 record 的自动生成方法
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        InitializeRequest that = (InitializeRequest) o;
	        return Objects.equals(protocolVersion, that.protocolVersion) &&
	               Objects.equals(capabilities, that.capabilities) &&
	               Objects.equals(clientInfo, that.clientInfo) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(protocolVersion, capabilities, clientInfo, meta);
	    }

	    @Override
	    public String toString() {
	        return "InitializeRequest{" +
	               "protocolVersion='" + protocolVersion + '\'' +
	               ", capabilities=" + capabilities +
	               ", clientInfo=" + clientInfo +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * After receiving an initialize request from the client, the server sends this
	 * response.
	 *
	 * @param protocolVersion The version of the Model Context Protocol that the server
	 * wants to use. This may not match the version that the client requested. If the
	 * client cannot support this version, it MUST disconnect
	 * @param capabilities The capabilities that the server supports
	 * @param serverInfo Information about the server implementation
	 * @param instructions Instructions describing how to use the server and its features.
	 * This can be used by clients to improve the LLM's understanding of available tools,
	 * resources, etc. It can be thought of like a "hint" to the model. For example, this
	 * information MAY be added to the system prompt
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record InitializeResult( // @formatter:off
//		@JsonProperty("protocolVersion") String protocolVersion,
//		@JsonProperty("capabilities") ServerCapabilities capabilities,
//		@JsonProperty("serverInfo") Implementation serverInfo,
//		@JsonProperty("instructions") String instructions,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result { // @formatter:on
//
//		public InitializeResult(String protocolVersion, ServerCapabilities capabilities, Implementation serverInfo,
//				String instructions) {
//			this(protocolVersion, capabilities, serverInfo, instructions, null);
//		}
//	}

	public final static class InitializeResult implements Result {
	    private final String protocolVersion;
	    private final ServerCapabilities capabilities;
	    private final Implementation serverInfo;
	    private final String instructions;
	    private final Map<String, Object> meta;

	    // 全参数构造函数（用于反序列化和完整初始化）
	    public InitializeResult(
	        @JsonProperty("protocolVersion") String protocolVersion,
	        @JsonProperty("capabilities") ServerCapabilities capabilities,
	        @JsonProperty("serverInfo") Implementation serverInfo,
	        @JsonProperty("instructions") String instructions,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.protocolVersion = protocolVersion;
	        this.capabilities = capabilities;
	        this.serverInfo = serverInfo;
	        this.instructions = instructions;
	        this.meta = meta;
	    }

	    // 四参数构造函数（设置 meta 为 null）
	    public InitializeResult(
	        String protocolVersion,
	        ServerCapabilities capabilities,
	        Implementation serverInfo,
	        String instructions
	    ) {
	        this(protocolVersion, capabilities, serverInfo, instructions, null);
	    }

	    // 访问方法（保持 record 的语义）
	    @JsonProperty("protocolVersion")
	    public String protocolVersion() {
	        return protocolVersion;
	    }

	    @JsonProperty("capabilities")
	    public ServerCapabilities capabilities() {
	        return capabilities;
	    }

	    @JsonProperty("serverInfo")
	    public Implementation serverInfo() {
	        return serverInfo;
	    }

	    @JsonProperty("instructions")
	    public String instructions() {
	        return instructions;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // 手动实现 equals 和 hashCode
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        InitializeResult that = (InitializeResult) o;
	        return Objects.equals(protocolVersion, that.protocolVersion) &&
	               Objects.equals(capabilities, that.capabilities) &&
	               Objects.equals(serverInfo, that.serverInfo) &&
	               Objects.equals(instructions, that.instructions) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(protocolVersion, capabilities, serverInfo, instructions, meta);
	    }

	    @Override
	    public String toString() {
	        return "InitializeResult{" +
	               "protocolVersion='" + protocolVersion + '\'' +
	               ", capabilities=" + capabilities +
	               ", serverInfo=" + serverInfo +
	               ", instructions='" + instructions + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * Capabilities a client may support. Known capabilities are defined here, in this
	 * schema, but this is not a closed set: any client can define its own, additional
	 * capabilities.
	 *
	 * @param experimental Experimental, non-standard capabilities that the client
	 * supports
	 * @param roots Present if the client supports listing roots
	 * @param sampling Present if the client supports sampling from an LLM
	 * @param elicitation Present if the client supports elicitation from the server
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ClientCapabilities( // @formatter:off
//		@JsonProperty("experimental") Map<String, Object> experimental,
//		@JsonProperty("roots") RootCapabilities roots,
//		@JsonProperty("sampling") Sampling sampling,
//		@JsonProperty("elicitation") Elicitation elicitation) { // @formatter:on
//
//		/**
//		 * Present if the client supports listing roots.
//		 *
//		 * @param listChanged Whether the client supports notifications for changes to the
//		 * roots list
//		 */
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		@JsonIgnoreProperties(ignoreUnknown = true)
//		public record RootCapabilities(@JsonProperty("listChanged") Boolean listChanged) {
//		}
//
//		/**
//		 * Provides a standardized way for servers to request LLM sampling ("completions"
//		 * or "generations") from language models via clients. This flow allows clients to
//		 * maintain control over model access, selection, and permissions while enabling
//		 * servers to leverage AI capabilities—with no server API keys necessary. Servers
//		 * can request text or image-based interactions and optionally include context
//		 * from MCP servers in their prompts.
//		 */
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		public record Sampling() {
//		}
//
//		/**
//		 * Provides a standardized way for servers to request additional information from
//		 * users through the client during interactions. This flow allows clients to
//		 * maintain control over user interactions and data sharing while enabling servers
//		 * to gather necessary information dynamically. Servers can request structured
//		 * data from users with optional JSON schemas to validate responses.
//		 */
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		public record Elicitation() {
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private Map<String, Object> experimental;
//
//			private RootCapabilities roots;
//
//			private Sampling sampling;
//
//			private Elicitation elicitation;
//
//			public Builder experimental(Map<String, Object> experimental) {
//				this.experimental = experimental;
//				return this;
//			}
//
//			public Builder roots(Boolean listChanged) {
//				this.roots = new RootCapabilities(listChanged);
//				return this;
//			}
//
//			public Builder sampling() {
//				this.sampling = new Sampling();
//				return this;
//			}
//
//			public Builder elicitation() {
//				this.elicitation = new Elicitation();
//				return this;
//			}
//
//			public ClientCapabilities build() {
//				return new ClientCapabilities(experimental, roots, sampling, elicitation);
//			}
//
//		}
//	}
	public final static class ClientCapabilities {
	    private final Map<String, Object> experimental;
	    private final RootCapabilities roots;
	    private final Sampling sampling;
	    private final Elicitation elicitation;

	    public ClientCapabilities(
	        @JsonProperty("experimental") Map<String, Object> experimental,
	        @JsonProperty("roots") RootCapabilities roots,
	        @JsonProperty("sampling") Sampling sampling,
	        @JsonProperty("elicitation") Elicitation elicitation
	    ) {
	        this.experimental = experimental;
	        this.roots = roots;
	        this.sampling = sampling;
	        this.elicitation = elicitation;
	    }

	    // 访问方法（保持 record 的语义）
	    @JsonProperty("experimental")
	    public Map<String, Object> experimental() {
	        return experimental;
	    }

	    @JsonProperty("roots")
	    public RootCapabilities roots() {
	        return roots;
	    }

	    @JsonProperty("sampling")
	    public Sampling sampling() {
	        return sampling;
	    }

	    @JsonProperty("elicitation")
	    public Elicitation elicitation() {
	        return elicitation;
	    }

	    // 手动实现 equals 和 hashCode
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ClientCapabilities that = (ClientCapabilities) o;
	        return Objects.equals(experimental, that.experimental) &&
	               Objects.equals(roots, that.roots) &&
	               Objects.equals(sampling, that.sampling) &&
	               Objects.equals(elicitation, that.elicitation);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(experimental, roots, sampling, elicitation);
	    }

	    @Override
	    public String toString() {
	        return "ClientCapabilities{" +
	               "experimental=" + experimental +
	               ", roots=" + roots +
	               ", sampling=" + sampling +
	               ", elicitation=" + elicitation +
	               '}';
	    }

	    // ---------- 嵌套类定义 ----------
	    /**
	     * Present if the client supports listing roots.
	     * @param listChanged Whether the client supports notifications for changes to the roots list
	     */
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    @JsonIgnoreProperties(ignoreUnknown = true)
	    public final static class RootCapabilities {
	        private final Boolean listChanged;

	        public RootCapabilities(@JsonProperty("listChanged") Boolean listChanged) {
	            this.listChanged = listChanged;
	        }

	        @JsonProperty("listChanged")
	        public Boolean listChanged() {
	            return listChanged;
	        }

	        @Override
	        public boolean equals(Object o) {
	            if (this == o) return true;
	            if (o == null || getClass() != o.getClass()) return false;
	            RootCapabilities that = (RootCapabilities) o;
	            return Objects.equals(listChanged, that.listChanged);
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash(listChanged);
	        }

	        @Override
	        public String toString() {
	            return "RootCapabilities{" + "listChanged=" + listChanged + '}';
	        }
	    }

	    /**
	     * 提供标准化方式让服务端通过客户端请求 LLM 采样（无需服务端 API 密钥）
	     */
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public final static class Sampling {
	        // 空类：仅作为标记接口
	        @Override
	        public boolean equals(Object o) {
	            return this == o || o != null && getClass() == o.getClass();
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash();
	        }

	        @Override
	        public String toString() {
	            return "Sampling{}";
	        }
	    }

	    /**
	     * 提供标准化方式让服务端在交互中通过客户端向用户请求额外信息
	     */
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public final static class Elicitation {
	        // 空类：仅作为标记接口
	        @Override
	        public boolean equals(Object o) {
	            return this == o || o != null && getClass() == o.getClass();
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash();
	        }

	        @Override
	        public String toString() {
	            return "Elicitation{}";
	        }
	    }

	    // ---------- 建造者模式（兼容 JDK 8） ----------
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private Map<String, Object> experimental;
	        private RootCapabilities roots;
	        private Sampling sampling;
	        private Elicitation elicitation;

	        public Builder experimental(Map<String, Object> experimental) {
	            this.experimental = experimental;
	            return this;
	        }

	        public Builder roots(Boolean listChanged) {
	            this.roots = new RootCapabilities(listChanged);
	            return this;
	        }

	        public Builder sampling() {
	            this.sampling = new Sampling();
	            return this;
	        }

	        public Builder elicitation() {
	            this.elicitation = new Elicitation();
	            return this;
	        }

	        public ClientCapabilities build() {
	            return new ClientCapabilities(experimental, roots, sampling, elicitation);
	        }
	    }
	}

	/**
	 * Capabilities that a server may support. Known capabilities are defined here, in
	 * this schema, but this is not a closed set: any server can define its own,
	 * additional capabilities.
	 *
	 * @param completions Present if the server supports argument autocompletion
	 * suggestions
	 * @param experimental Experimental, non-standard capabilities that the server
	 * supports
	 * @param logging Present if the server supports sending log messages to the client
	 * @param prompts Present if the server offers any prompt templates
	 * @param resources Present if the server offers any resources to read
	 * @param tools Present if the server offers any tools to call
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ServerCapabilities( // @formatter:off
//		@JsonProperty("completions") CompletionCapabilities completions,
//		@JsonProperty("experimental") Map<String, Object> experimental,
//		@JsonProperty("logging") LoggingCapabilities logging,
//		@JsonProperty("prompts") PromptCapabilities prompts,
//		@JsonProperty("resources") ResourceCapabilities resources,
//		@JsonProperty("tools") ToolCapabilities tools) { // @formatter:on
//
//		/**
//		 * Present if the server supports argument autocompletion suggestions.
//		 */
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		public record CompletionCapabilities() {
//		}
//
//		/**
//		 * Present if the server supports sending log messages to the client.
//		 */
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		public record LoggingCapabilities() {
//		}
//
//		/**
//		 * Present if the server offers any prompt templates.
//		 *
//		 * @param listChanged Whether this server supports notifications for changes to
//		 * the prompt list
//		 */
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		public record PromptCapabilities(@JsonProperty("listChanged") Boolean listChanged) {
//		}
//
//		/**
//		 * Present if the server offers any resources to read.
//		 *
//		 * @param subscribe Whether this server supports subscribing to resource updates
//		 * @param listChanged Whether this server supports notifications for changes to
//		 * the resource list
//		 */
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		public record ResourceCapabilities(@JsonProperty("subscribe") Boolean subscribe,
//				@JsonProperty("listChanged") Boolean listChanged) {
//		}
//
//		/**
//		 * Present if the server offers any tools to call.
//		 *
//		 * @param listChanged Whether this server supports notifications for changes to
//		 * the tool list
//		 */
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		public record ToolCapabilities(@JsonProperty("listChanged") Boolean listChanged) {
//		}
//
//		/**
//		 * Create a mutated copy of this object with the specified changes.
//		 * @return A new Builder instance with the same values as this object.
//		 */
//		public Builder mutate() {
//			var builder = new Builder();
//			builder.completions = this.completions;
//			builder.experimental = this.experimental;
//			builder.logging = this.logging;
//			builder.prompts = this.prompts;
//			builder.resources = this.resources;
//			builder.tools = this.tools;
//			return builder;
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private CompletionCapabilities completions;
//
//			private Map<String, Object> experimental;
//
//			private LoggingCapabilities logging;
//
//			private PromptCapabilities prompts;
//
//			private ResourceCapabilities resources;
//
//			private ToolCapabilities tools;
//
//			public Builder completions() {
//				this.completions = new CompletionCapabilities();
//				return this;
//			}
//
//			public Builder experimental(Map<String, Object> experimental) {
//				this.experimental = experimental;
//				return this;
//			}
//
//			public Builder logging() {
//				this.logging = new LoggingCapabilities();
//				return this;
//			}
//
//			public Builder prompts(Boolean listChanged) {
//				this.prompts = new PromptCapabilities(listChanged);
//				return this;
//			}
//
//			public Builder resources(Boolean subscribe, Boolean listChanged) {
//				this.resources = new ResourceCapabilities(subscribe, listChanged);
//				return this;
//			}
//
//			public Builder tools(Boolean listChanged) {
//				this.tools = new ToolCapabilities(listChanged);
//				return this;
//			}
//
//			public ServerCapabilities build() {
//				return new ServerCapabilities(completions, experimental, logging, prompts, resources, tools);
//			}
//
//		}
//	}
	
	public final static class ServerCapabilities {
	    private final CompletionCapabilities completions;
	    private final Map<String, Object> experimental;
	    private final LoggingCapabilities logging;
	    private final PromptCapabilities prompts;
	    private final ResourceCapabilities resources;
	    private final ToolCapabilities tools;

	    public ServerCapabilities(
	        @JsonProperty("completions") CompletionCapabilities completions,
	        @JsonProperty("experimental") Map<String, Object> experimental,
	        @JsonProperty("logging") LoggingCapabilities logging,
	        @JsonProperty("prompts") PromptCapabilities prompts,
	        @JsonProperty("resources") ResourceCapabilities resources,
	        @JsonProperty("tools") ToolCapabilities tools
	    ) {
	        this.completions = completions;
	        this.experimental = experimental;
	        this.logging = logging;
	        this.prompts = prompts;
	        this.resources = resources;
	        this.tools = tools;
	    }

	    // 访问方法（保持 record 语义）
	    @JsonProperty("completions")
	    public CompletionCapabilities completions() {
	        return completions;
	    }

	    @JsonProperty("experimental")
	    public Map<String, Object> experimental() {
	        return experimental;
	    }

	    @JsonProperty("logging")
	    public LoggingCapabilities logging() {
	        return logging;
	    }

	    @JsonProperty("prompts")
	    public PromptCapabilities prompts() {
	        return prompts;
	    }

	    @JsonProperty("resources")
	    public ResourceCapabilities resources() {
	        return resources;
	    }

	    @JsonProperty("tools")
	    public ToolCapabilities tools() {
	        return tools;
	    }

	    // 手动实现对象方法
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ServerCapabilities that = (ServerCapabilities) o;
	        return Objects.equals(completions, that.completions) &&
	               Objects.equals(experimental, that.experimental) &&
	               Objects.equals(logging, that.logging) &&
	               Objects.equals(prompts, that.prompts) &&
	               Objects.equals(resources, that.resources) &&
	               Objects.equals(tools, that.tools);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(completions, experimental, logging, prompts, resources, tools);
	    }

	    @Override
	    public String toString() {
	        return "ServerCapabilities{" +
	               "completions=" + completions +
	               ", experimental=" + experimental +
	               ", logging=" + logging +
	               ", prompts=" + prompts +
	               ", resources=" + resources +
	               ", tools=" + tools +
	               '}';
	    }

	    // ---------- 嵌套类定义 ----------
	    /**
	     * 服务器支持自动补全建议时存在
	     */
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public final static class CompletionCapabilities {
	        // 空类：仅作为标记接口
	        @Override
	        public boolean equals(Object o) {
	            return this == o || o != null && getClass() == o.getClass();
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash();
	        }

	        @Override
	        public String toString() {
	            return "CompletionCapabilities{}";
	        }
	    }

	    /**
	     * 服务器支持向客户端发送日志消息时存在
	     */
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public final static class LoggingCapabilities {
	        // 空类：仅作为标记接口
	        @Override
	        public boolean equals(Object o) {
	            return this == o || o != null && getClass() == o.getClass();
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash();
	        }

	        @Override
	        public String toString() {
	            return "LoggingCapabilities{}";
	        }
	    }

	    /**
	     * 服务器提供提示模板时存在
	     * @param listChanged 是否支持提示列表变更通知
	     */
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public final static class PromptCapabilities {
	        private final Boolean listChanged;

	        public PromptCapabilities(@JsonProperty("listChanged") Boolean listChanged) {
	            this.listChanged = listChanged;
	        }

	        @JsonProperty("listChanged")
	        public Boolean listChanged() {
	            return listChanged;
	        }

	        @Override
	        public boolean equals(Object o) {
	            if (this == o) return true;
	            if (o == null || getClass() != o.getClass()) return false;
	            PromptCapabilities that = (PromptCapabilities) o;
	            return Objects.equals(listChanged, that.listChanged);
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash(listChanged);
	        }

	        @Override
	        public String toString() {
	            return "PromptCapabilities{" + "listChanged=" + listChanged + '}';
	        }
	    }

	    /**
	     * 服务器提供可读资源时存在
	     * @param subscribe 是否支持订阅资源更新
	     * @param listChanged 是否支持资源列表变更通知
	     */
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public final static class ResourceCapabilities {
	        private final Boolean subscribe;
	        private final Boolean listChanged;

	        public ResourceCapabilities(
	            @JsonProperty("subscribe") Boolean subscribe,
	            @JsonProperty("listChanged") Boolean listChanged
	        ) {
	            this.subscribe = subscribe;
	            this.listChanged = listChanged;
	        }

	        @JsonProperty("subscribe")
	        public Boolean subscribe() {
	            return subscribe;
	        }

	        @JsonProperty("listChanged")
	        public Boolean listChanged() {
	            return listChanged;
	        }

	        @Override
	        public boolean equals(Object o) {
	            if (this == o) return true;
	            if (o == null || getClass() != o.getClass()) return false;
	            ResourceCapabilities that = (ResourceCapabilities) o;
	            return Objects.equals(subscribe, that.subscribe) &&
	                   Objects.equals(listChanged, that.listChanged);
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash(subscribe, listChanged);
	        }

	        @Override
	        public String toString() {
	            return "ResourceCapabilities{" +
	                   "subscribe=" + subscribe +
	                   ", listChanged=" + listChanged +
	                   '}';
	        }
	    }

	    /**
	     * 服务器提供可调用工具时存在
	     * @param listChanged 是否支持工具列表变更通知
	     */
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public final static class ToolCapabilities {
	        private final Boolean listChanged;

	        public ToolCapabilities(@JsonProperty("listChanged") Boolean listChanged) {
	            this.listChanged = listChanged;
	        }

	        @JsonProperty("listChanged")
	        public Boolean listChanged() {
	            return listChanged;
	        }

	        @Override
	        public boolean equals(Object o) {
	            if (this == o) return true;
	            if (o == null || getClass() != o.getClass()) return false;
	            ToolCapabilities that = (ToolCapabilities) o;
	            return Objects.equals(listChanged, that.listChanged);
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash(listChanged);
	        }

	        @Override
	        public String toString() {
	            return "ToolCapabilities{" + "listChanged=" + listChanged + '}';
	        }
	    }

	    // ---------- 建造者模式（兼容原 mutate 方法） ----------
	    public Builder mutate() {
	        return new Builder()
	            .completions(this.completions)
	            .experimental(this.experimental)
	            .logging(this.logging)
	            .prompts(this.prompts)
	            .resources(this.resources)
	            .tools(this.tools);
	    }

	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private CompletionCapabilities completions;
	        private Map<String, Object> experimental;
	        private LoggingCapabilities logging;
	        private PromptCapabilities prompts;
	        private ResourceCapabilities resources;
	        private ToolCapabilities tools;

	        public Builder completions(CompletionCapabilities completions) {
	            this.completions = completions;
	            return this;
	        }

	        public Builder completions() {
	            this.completions = new CompletionCapabilities();
	            return this;
	        }

	        public Builder experimental(Map<String, Object> experimental) {
	            this.experimental = experimental;
	            return this;
	        }

	        public Builder logging(LoggingCapabilities logging) {
	            this.logging = logging;
	            return this;
	        }

	        public Builder logging() {
	            this.logging = new LoggingCapabilities();
	            return this;
	        }

	        public Builder prompts(PromptCapabilities prompts) {
	            this.prompts = prompts;
	            return this;
	        }

	        public Builder prompts(Boolean listChanged) {
	            this.prompts = new PromptCapabilities(listChanged);
	            return this;
	        }

	        public Builder resources(ResourceCapabilities resources) {
	            this.resources = resources;
	            return this;
	        }

	        public Builder resources(Boolean subscribe, Boolean listChanged) {
	            this.resources = new ResourceCapabilities(subscribe, listChanged);
	            return this;
	        }

	        public Builder tools(ToolCapabilities tools) {
	            this.tools = tools;
	            return this;
	        }

	        public Builder tools(Boolean listChanged) {
	            this.tools = new ToolCapabilities(listChanged);
	            return this;
	        }

	        public ServerCapabilities build() {
	            return new ServerCapabilities(
	                completions, experimental, logging, prompts, resources, tools
	            );
	        }
	    }
	}

	/**
	 * Describes the name and version of an MCP implementation, with an optional title for
	 * UI representation.
	 *
	 * @param name Intended for programmatic or logical use, but used as a display name in
	 * past specs or fallback (if title isn't present).
	 * @param title Intended for UI and end-user contexts
	 * @param version The version of the implementation.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record Implementation( // @formatter:off
//		@JsonProperty("name") String name,
//		@JsonProperty("title") String title,
//		@JsonProperty("version") String version) implements BaseMetadata { // @formatter:on			
//
//		public Implementation(String name, String version) {
//			this(name, null, version);
//		}
//	}
//	
	public static final class Implementation implements BaseMetadata {
	    private final String name;
	    private final String title;
	    private final String version;

	    // 全参数构造函数（支持 JSON 反序列化）
	    public Implementation(
	        @JsonProperty("name") String name,
	        @JsonProperty("title") String title,
	        @JsonProperty("version") String version
	    ) {
	        this.name = name;
	        this.title = title;
	        this.version = version;
	    }

	    // 便捷构造函数（设置 title=null）
	    public Implementation(String name, String version) {
	        this(name, null, version);
	    }

	    // 访问方法（保持 record 语义）
	    @JsonProperty("name")
	    @Override
	    public String name() {
	        return name;
	    }

	    @JsonProperty("title")
	    @Override
	    public String title() {
	        return title;
	    }

	    @JsonProperty("version")
	    //@Override
	    public String version() {
	        return version;
	    }

	    // 手动实现对象方法
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Implementation that = (Implementation) o;
	        return Objects.equals(name, that.name) &&
	               Objects.equals(title, that.title) &&
	               Objects.equals(version, that.version);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, title, version);
	    }

	    @Override
	    public String toString() {
	        return "Implementation{" +
	               "name='" + name + '\'' +
	               ", title='" + title + '\'' +
	               ", version='" + version + '\'' +
	               '}';
	    }
	}

	// Existing Enums and Base Types (from previous implementation)
	public static enum Role {

	// @formatter:off
		@JsonProperty("user") USER,
		@JsonProperty("assistant") ASSISTANT
	} // @formatter:on

	// ---------------------------
	// Resource Interfaces
	// ---------------------------
	/**
	 * Base for objects that include optional annotations for the client. The client can
	 * use annotations to inform how objects are used or displayed
	 */
	public interface Annotated {

		Annotations annotations();

	}

	/**
	 * Optional annotations for the client. The client can use annotations to inform how
	 * objects are used or displayed.
	 *
	 * @param audience Describes who the intended customer of this object or data is. It
	 * can include multiple entries to indicate content useful for multiple audiences
	 * (e.g., `["user", "assistant"]`).
	 * @param priority Describes how important this data is for operating the server. A
	 * value of 1 means "most important," and indicates that the data is effectively
	 * required, while 0 means "least important," and indicates that the data is entirely
	 * optional. It is a number between 0 and 1.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record Annotations( // @formatter:off
//		@JsonProperty("audience") List<Role> audience,
//		@JsonProperty("priority") Double priority) { // @formatter:on
//	}
	
	public final static class Annotations {
	    private final List<Role> audience;
	    private final Double priority;

	    public Annotations(
	        @JsonProperty("audience") List<Role> audience,
	        @JsonProperty("priority") Double priority
	    ) {
	        this.audience = audience;
	        this.priority = priority;
	    }

	    // 访问方法（保持 record 语义）
	    @JsonProperty("audience")
	    public List<Role> audience() {
	        return audience;
	    }

	    @JsonProperty("priority")
	    public Double priority() {
	        return priority;
	    }

	    // 手动实现对象方法
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Annotations that = (Annotations) o;
	        return Objects.equals(audience, that.audience) &&
	               Objects.equals(priority, that.priority);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(audience, priority);
	    }

	    @Override
	    public String toString() {
	        return "Annotations{" +
	               "audience=" + audience +
	               ", priority=" + priority +
	               '}';
	    }
	}

	/**
	 * A common interface for resource content, which includes metadata about the resource
	 * such as its URI, name, description, MIME type, size, and annotations. This
	 * interface is implemented by both {@link Resource} and {@link ResourceLink} to
	 * provide a consistent way to access resource metadata.
	 */
	public interface ResourceContent extends BaseMetadata {

		String uri();

		String description();

		String mimeType();

		Long size();

		Annotations annotations();

	}

	/**
	 * Base interface for metadata with name (identifier) and title (display name)
	 * properties.
	 */
	public interface BaseMetadata {

		/**
		 * Intended for programmatic or logical use, but used as a display name in past
		 * specs or fallback (if title isn't present).
		 */
		String name();

		/**
		 * Intended for UI and end-user contexts — optimized to be human-readable and
		 * easily understood, even by those unfamiliar with domain-specific terminology.
		 *
		 * If not provided, the name should be used for display.
		 */
		String title();

	}

	/**
	 * A known resource that the server is capable of reading.
	 *
	 * @param uri the URI of the resource.
	 * @param name A human-readable name for this resource. This can be used by clients to
	 * populate UI elements.
	 * @param title An optional title for this resource.
	 * @param description A description of what this resource represents. This can be used
	 * by clients to improve the LLM's understanding of available resources. It can be
	 * thought of like a "hint" to the model.
	 * @param mimeType The MIME type of this resource, if known.
	 * @param size The size of the raw resource content, in bytes (i.e., before base64
	 * encoding or any tokenization), if known. This can be used by Hosts to display file
	 * sizes and estimate context window usage.
	 * @param annotations Optional annotations for the client. The client can use
	 * annotations to inform how objects are used or displayed.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record Resource( // @formatter:off
//		@JsonProperty("uri") String uri,
//		@JsonProperty("name") String name,
//		@JsonProperty("title") String title,
//		@JsonProperty("description") String description,
//		@JsonProperty("mimeType") String mimeType,
//		@JsonProperty("size") Long size,
//		@JsonProperty("annotations") Annotations annotations,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Annotated, ResourceContent { // @formatter:on
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link Resource#builder()} instead.
//		 */
//		@Deprecated
//		public Resource(String uri, String name, String title, String description, String mimeType, Long size,
//				Annotations annotations) {
//			this(uri, name, title, description, mimeType, size, annotations, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link Resource#builder()} instead.
//		 */
//		@Deprecated
//		public Resource(String uri, String name, String description, String mimeType, Long size,
//				Annotations annotations) {
//			this(uri, name, null, description, mimeType, size, annotations, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link Resource#builder()} instead.
//		 */
//		@Deprecated
//		public Resource(String uri, String name, String description, String mimeType, Annotations annotations) {
//			this(uri, name, null, description, mimeType, null, annotations, null);
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private String uri;
//
//			private String name;
//
//			private String title;
//
//			private String description;
//
//			private String mimeType;
//
//			private Long size;
//
//			private Annotations annotations;
//
//			private Map<String, Object> meta;
//
//			public Builder uri(String uri) {
//				this.uri = uri;
//				return this;
//			}
//
//			public Builder name(String name) {
//				this.name = name;
//				return this;
//			}
//
//			public Builder title(String title) {
//				this.title = title;
//				return this;
//			}
//
//			public Builder description(String description) {
//				this.description = description;
//				return this;
//			}
//
//			public Builder mimeType(String mimeType) {
//				this.mimeType = mimeType;
//				return this;
//			}
//
//			public Builder size(Long size) {
//				this.size = size;
//				return this;
//			}
//
//			public Builder annotations(Annotations annotations) {
//				this.annotations = annotations;
//				return this;
//			}
//
//			public Builder meta(Map<String, Object> meta) {
//				this.meta = meta;
//				return this;
//			}
//
//			public Resource build() {
//				Assert.hasText(uri, "uri must not be empty");
//				Assert.hasText(name, "name must not be empty");
//
//				return new Resource(uri, name, title, description, mimeType, size, annotations, meta);
//			}
//
//		}
//	}
	public final static class Resource implements Annotated, ResourceContent {
	    private final String uri;
	    private final String name;
	    private final String title;
	    private final String description;
	    private final String mimeType;
	    private final Long size;
	    private final Annotations annotations;
	    private final Map<String, Object> meta;

	    // 全参数构造函数（支持 JSON 反序列化）
	    public Resource(
	        @JsonProperty("uri") String uri,
	        @JsonProperty("name") String name,
	        @JsonProperty("title") String title,
	        @JsonProperty("description") String description,
	        @JsonProperty("mimeType") String mimeType,
	        @JsonProperty("size") Long size,
	        @JsonProperty("annotations") Annotations annotations,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.uri = uri;
	        this.name = name;
	        this.title = title;
	        this.description = description;
	        this.mimeType = mimeType;
	        this.size = size;
	        this.annotations = annotations;
	        this.meta = meta;
	    }

	    // ---------- 过时的构造函数（标记为 @Deprecated） ----------
	    @Deprecated
	    public Resource(
	        String uri, String name, String title, String description, 
	        String mimeType, Long size, Annotations annotations
	    ) {
	        this(uri, name, title, description, mimeType, size, annotations, null);
	    }

	    @Deprecated
	    public Resource(
	        String uri, String name, String description, 
	        String mimeType, Long size, Annotations annotations
	    ) {
	        this(uri, name, null, description, mimeType, size, annotations, null);
	    }

	    @Deprecated
	    public Resource(
	        String uri, String name, String description, 
	        String mimeType, Annotations annotations
	    ) {
	        this(uri, name, null, description, mimeType, null, annotations, null);
	    }

	    // ---------- 字段访问方法（保持 record 语义） ----------
	    @JsonProperty("uri")
	    public String uri() {
	        return uri;
	    }

	    @JsonProperty("name")
	    public String name() {
	        return name;
	    }

	    @JsonProperty("title")
	    public String title() {
	        return title;
	    }

	    @JsonProperty("description")
	    public String description() {
	        return description;
	    }

	    @JsonProperty("mimeType")
	    public String mimeType() {
	        return mimeType;
	    }

	    @JsonProperty("size")
	    public Long size() {
	        return size;
	    }

	    @JsonProperty("annotations")
	    public Annotations annotations() {
	        return annotations;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // ---------- 对象方法重写 ----------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Resource resource = (Resource) o;
	        return Objects.equals(uri, resource.uri) &&
	               Objects.equals(name, resource.name) &&
	               Objects.equals(title, resource.title) &&
	               Objects.equals(description, resource.description) &&
	               Objects.equals(mimeType, resource.mimeType) &&
	               Objects.equals(size, resource.size) &&
	               Objects.equals(annotations, resource.annotations) &&
	               Objects.equals(meta, resource.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(uri, name, title, description, mimeType, size, annotations, meta);
	    }

	    @Override
	    public String toString() {
	        return "Resource{" +
	               "uri='" + uri + '\'' +
	               ", name='" + name + '\'' +
	               ", title='" + title + '\'' +
	               ", description='" + description + '\'' +
	               ", mimeType='" + mimeType + '\'' +
	               ", size=" + size +
	               ", annotations=" + annotations +
	               ", meta=" + meta +
	               '}';
	    }

	    // ---------- 建造者模式（完全复用） ----------
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private String uri;
	        private String name;
	        private String title;
	        private String description;
	        private String mimeType;
	        private Long size;
	        private Annotations annotations;
	        private Map<String, Object> meta;

	        public Builder uri(String uri) {
	            this.uri = uri;
	            return this;
	        }

	        public Builder name(String name) {
	            this.name = name;
	            return this;
	        }

	        public Builder title(String title) {
	            this.title = title;
	            return this;
	        }

	        public Builder description(String description) {
	            this.description = description;
	            return this;
	        }

	        public Builder mimeType(String mimeType) {
	            this.mimeType = mimeType;
	            return this;
	        }

	        public Builder size(Long size) {
	            this.size = size;
	            return this;
	        }

	        public Builder annotations(Annotations annotations) {
	            this.annotations = annotations;
	            return this;
	        }

	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public Resource build() {
	            // 保留原校验逻辑（需自行实现 Assert 类）
	            if (uri == null || uri.trim().isEmpty()) 
	                throw new IllegalArgumentException("uri must not be empty");
	            if (name == null || name.trim().isEmpty()) 
	                throw new IllegalArgumentException("name must not be empty");
	            
	            return new Resource(uri, name, title, description, mimeType, size, annotations, meta);
	        }
	    }
	}

	/**
	 * Resource templates allow servers to expose parameterized resources using URI
	 *
	 * @param uriTemplate A URI template that can be used to generate URIs for this
	 * resource.
	 * @param name A human-readable name for this resource. This can be used by clients to
	 * populate UI elements.
	 * @param title An optional title for this resource.
	 * @param description A description of what this resource represents. This can be used
	 * by clients to improve the LLM's understanding of available resources. It can be
	 * thought of like a "hint" to the model.
	 * @param mimeType The MIME type of this resource, if known.
	 * @param annotations Optional annotations for the client. The client can use
	 * annotations to inform how objects are used or displayed.
	 * @see <a href="https://datatracker.ietf.org/doc/html/rfc6570">RFC 6570</a>
	 * @param meta See specification for notes on _meta usage
	 *
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ResourceTemplate( // @formatter:off
//		@JsonProperty("uriTemplate") String uriTemplate,
//		@JsonProperty("name") String name,
//		@JsonProperty("title") String title,
//		@JsonProperty("description") String description,
//		@JsonProperty("mimeType") String mimeType,
//		@JsonProperty("annotations") Annotations annotations,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Annotated, BaseMetadata { // @formatter:on
//
//		public ResourceTemplate(String uriTemplate, String name, String title, String description, String mimeType,
//				Annotations annotations) {
//			this(uriTemplate, name, title, description, mimeType, annotations, null);
//		}
//
//		public ResourceTemplate(String uriTemplate, String name, String description, String mimeType,
//				Annotations annotations) {
//			this(uriTemplate, name, null, description, mimeType, annotations);
//		}
//	}
//	import com.fasterxml.jackson.annotation.JsonProperty;
//	import java.util.Map;
//	import java.util.Objects;

	public final static class ResourceTemplate implements Annotated, BaseMetadata {
	    private final String uriTemplate;
	    private final String name;
	    private final String title;
	    private final String description;
	    private final String mimeType;
	    private final Annotations annotations;
	    private final Map<String, Object> meta;

	    // 全参数构造函数（支持 JSON 反序列化）
	    public ResourceTemplate(
	        @JsonProperty("uriTemplate") String uriTemplate,
	        @JsonProperty("name") String name,
	        @JsonProperty("title") String title,
	        @JsonProperty("description") String description,
	        @JsonProperty("mimeType") String mimeType,
	        @JsonProperty("annotations") Annotations annotations,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.uriTemplate = uriTemplate;
	        this.name = name;
	        this.title = title;
	        this.description = description;
	        this.mimeType = mimeType;
	        this.annotations = annotations;
	        this.meta = meta;
	    }

	    // 六参数便捷构造器（meta=null）
	    public ResourceTemplate(
	        String uriTemplate, String name, String title, 
	        String description, String mimeType, Annotations annotations
	    ) {
	        this(uriTemplate, name, title, description, mimeType, annotations, null);
	    }

	    // 五参数便捷构造器（title=null, meta=null）
	    public ResourceTemplate(
	        String uriTemplate, String name, 
	        String description, String mimeType, Annotations annotations
	    ) {
	        this(uriTemplate, name, null, description, mimeType, annotations, null);
	    }

	    // ---------- 字段访问方法（保持 record 语义） ----------
	    @JsonProperty("uriTemplate")
	    public String uriTemplate() {
	        return uriTemplate;
	    }

	    @JsonProperty("name")
	    public String name() {
	        return name;
	    }

	    @JsonProperty("title")
	    public String title() {
	        return title;
	    }

	    @JsonProperty("description")
	    public String description() {
	        return description;
	    }

	    @JsonProperty("mimeType")
	    public String mimeType() {
	        return mimeType;
	    }

	    @JsonProperty("annotations")
	    public Annotations annotations() {
	        return annotations;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // ---------- 对象方法重写 ----------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ResourceTemplate that = (ResourceTemplate) o;
	        return Objects.equals(uriTemplate, that.uriTemplate) &&
	               Objects.equals(name, that.name) &&
	               Objects.equals(title, that.title) &&
	               Objects.equals(description, that.description) &&
	               Objects.equals(mimeType, that.mimeType) &&
	               Objects.equals(annotations, that.annotations) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(uriTemplate, name, title, description, mimeType, annotations, meta);
	    }

	    @Override
	    public String toString() {
	        return "ResourceTemplate{" +
	               "uriTemplate='" + uriTemplate + '\'' +
	               ", name='" + name + '\'' +
	               ", title='" + title + '\'' +
	               ", description='" + description + '\'' +
	               ", mimeType='" + mimeType + '\'' +
	               ", annotations=" + annotations +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The server's response to a resources/list request from the client.
	 *
	 * @param resources A list of resources that the server provides
	 * @param nextCursor An opaque token representing the pagination position after the
	 * last returned result. If present, there may be more results available
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ListResourcesResult( // @formatter:off
//		@JsonProperty("resources") List<Resource> resources,
//		@JsonProperty("nextCursor") String nextCursor,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result { // @formatter:on
//
//		public ListResourcesResult(List<Resource> resources, String nextCursor) {
//			this(resources, nextCursor, null);
//		}
//	}
	public final static class ListResourcesResult implements Result {
	    private final List<Resource> resources;
	    private final String nextCursor;
	    private final Map<String, Object> meta;

	    // 全参数构造函数（支持 JSON 反序列化）
	    public ListResourcesResult(
	        @JsonProperty("resources") List<Resource> resources,
	        @JsonProperty("nextCursor") String nextCursor,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.resources = resources;
	        this.nextCursor = nextCursor;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ListResourcesResult(List<Resource> resources, String nextCursor) {
	        this(resources, nextCursor, null);
	    }

	    // ---------- 字段访问方法（保持 record 语义） ----------
	    @JsonProperty("resources")
	    public List<Resource> resources() {
	        return resources;
	    }

	    @JsonProperty("nextCursor")
	    public String nextCursor() {
	        return nextCursor;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // ---------- 对象方法重写 ----------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ListResourcesResult that = (ListResourcesResult) o;
	        return Objects.equals(resources, that.resources) &&
	               Objects.equals(nextCursor, that.nextCursor) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(resources, nextCursor, meta);
	    }

	    @Override
	    public String toString() {
	        return "ListResourcesResult{" +
	               "resources=" + resources +
	               ", nextCursor='" + nextCursor + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The server's response to a resources/templates/list request from the client.
	 *
	 * @param resourceTemplates A list of resource templates that the server provides
	 * @param nextCursor An opaque token representing the pagination position after the
	 * last returned result. If present, there may be more results available
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ListResourceTemplatesResult( // @formatter:off
//		@JsonProperty("resourceTemplates") List<ResourceTemplate> resourceTemplates,
//		@JsonProperty("nextCursor") String nextCursor,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result { // @formatter:on
//
//		public ListResourceTemplatesResult(List<ResourceTemplate> resourceTemplates, String nextCursor) {
//			this(resourceTemplates, nextCursor, null);
//		}
//	}
	public final static class ListResourceTemplatesResult implements Result {
	    private final List<ResourceTemplate> resourceTemplates;
	    private final String nextCursor;
	    private final Map<String, Object> meta;

	    // 全参数构造函数（支持 JSON 反序列化）
	    public ListResourceTemplatesResult(
	        @JsonProperty("resourceTemplates") List<ResourceTemplate> resourceTemplates,
	        @JsonProperty("nextCursor") String nextCursor,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.resourceTemplates = resourceTemplates;
	        this.nextCursor = nextCursor;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ListResourceTemplatesResult(
	        List<ResourceTemplate> resourceTemplates, 
	        String nextCursor
	    ) {
	        this(resourceTemplates, nextCursor, null);
	    }

	    // ---------- 字段访问方法（保持 record 语义） ----------
	    @JsonProperty("resourceTemplates")
	    public List<ResourceTemplate> resourceTemplates() {
	        return resourceTemplates;
	    }

	    @JsonProperty("nextCursor")
	    public String nextCursor() {
	        return nextCursor;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // ---------- 对象方法重写 ----------
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ListResourceTemplatesResult that = (ListResourceTemplatesResult) o;
	        return Objects.equals(resourceTemplates, that.resourceTemplates) &&
	               Objects.equals(nextCursor, that.nextCursor) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(resourceTemplates, nextCursor, meta);
	    }

	    @Override
	    public String toString() {
	        return "ListResourceTemplatesResult{" +
	               "resourceTemplates=" + resourceTemplates +
	               ", nextCursor='" + nextCursor + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * Sent from the client to the server, to read a specific resource URI.
	 *
	 * @param uri The URI of the resource to read. The URI can use any protocol; it is up
	 * to the server how to interpret it
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ReadResourceRequest( // @formatter:off
//		@JsonProperty("uri") String uri,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Request { // @formatter:on
//
//		public ReadResourceRequest(String uri) {
//			this(uri, null);
//		}
//	}
	public final static class ReadResourceRequest implements Request {
	    private final String uri;
	    private final Map<String, Object> meta;

	    // 全参构造函数（支持 JSON 反序列化）
	    public ReadResourceRequest(
	        @JsonProperty("uri") String uri,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.uri = uri;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ReadResourceRequest(String uri) {
	        this(uri, null);
	    }

	    // 字段访问方法（保持 record 语义）
	    @JsonProperty("uri")
	    public String uri() {
	        return uri;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ReadResourceRequest that = (ReadResourceRequest) o;
	        return Objects.equals(uri, that.uri) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(uri, meta);
	    }

	    @Override
	    public String toString() {
	        return "ReadResourceRequest{" +
	               "uri='" + uri + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The server's response to a resources/read request from the client.
	 *
	 * @param contents The contents of the resource
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ReadResourceResult( // @formatter:off
//		@JsonProperty("contents") List<ResourceContents> contents,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result { // @formatter:on
//
//		public ReadResourceResult(List<ResourceContents> contents) {
//			this(contents, null);
//		}
//	}
	public final static class ReadResourceResult implements Result {
	    private final List<ResourceContents> contents;
	    private final Map<String, Object> meta;

	    // 全参构造函数
	    public ReadResourceResult(
	        @JsonProperty("contents") List<ResourceContents> contents,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.contents = contents;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ReadResourceResult(List<ResourceContents> contents) {
	        this(contents, null);
	    }

	    // 字段访问方法
	    @JsonProperty("contents")
	    public List<ResourceContents> contents() {
	        return contents;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ReadResourceResult that = (ReadResourceResult) o;
	        return Objects.equals(contents, that.contents) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(contents, meta);
	    }

	    @Override
	    public String toString() {
	        return "ReadResourceResult{" +
	               "contents=" + contents +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * Sent from the client to request resources/updated notifications from the server
	 * whenever a particular resource changes.
	 *
	 * @param uri the URI of the resource to subscribe to. The URI can use any protocol;
	 * it is up to the server how to interpret it.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record SubscribeRequest( // @formatter:off
//		@JsonProperty("uri") String uri,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Request { // @formatter:on
//
//		public SubscribeRequest(String uri) {
//			this(uri, null);
//		}
//	}
	public final static class SubscribeRequest implements Request {
	    private final String uri;
	    private final Map<String, Object> meta;

	    // 全参数构造函数（支持 JSON 反序列化）
	    public SubscribeRequest(
	        @JsonProperty("uri") String uri,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.uri = uri;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public SubscribeRequest(String uri) {
	        this(uri, null);
	    }

	    // 字段访问方法（保持 record 语义）
	    @JsonProperty("uri")
	    public String uri() {
	        return uri;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        SubscribeRequest that = (SubscribeRequest) o;
	        return Objects.equals(uri, that.uri) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(uri, meta);
	    }

	    @Override
	    public String toString() {
	        return "SubscribeRequest{" +
	               "uri='" + uri + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * Sent from the client to request cancellation of resources/updated notifications
	 * from the server. This should follow a previous resources/subscribe request.
	 *
	 * @param uri The URI of the resource to unsubscribe from
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record UnsubscribeRequest( // @formatter:off
//		@JsonProperty("uri") String uri,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Request { // @formatter:on
//
//		public UnsubscribeRequest(String uri) {
//			this(uri, null);
//		}
//	}
	public final static class UnsubscribeRequest implements Request {
	    private final String uri;
	    private final Map<String, Object> meta;

	    // 全参数构造函数
	    public UnsubscribeRequest(
	        @JsonProperty("uri") String uri,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.uri = uri;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public UnsubscribeRequest(String uri) {
	        this(uri, null);
	    }

	    // 字段访问方法
	    @JsonProperty("uri")
	    public String uri() {
	        return uri;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        UnsubscribeRequest that = (UnsubscribeRequest) o;
	        return Objects.equals(uri, that.uri) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(uri, meta);
	    }

	    @Override
	    public String toString() {
	        return "UnsubscribeRequest{" +
	               "uri='" + uri + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The contents of a specific resource or sub-resource.
	 */
//	@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, include = As.PROPERTY)
//	@JsonSubTypes({ @JsonSubTypes.Type(value = TextResourceContents.class, name = "text"),
//			@JsonSubTypes.Type(value = BlobResourceContents.class, name = "blob") })
//	public sealed interface ResourceContents permits TextResourceContents, BlobResourceContents {
//
//		/**
//		 * The URI of this resource.
//		 * @return the URI of this resource.
//		 */
//		String uri();
//
//		/**
//		 * The MIME type of this resource.
//		 * @return the MIME type of this resource.
//		 */
//		String mimeType();
//
//		/**
//		 * @see <a href=
//		 * "https://modelcontextprotocol.io/specification/2025-06-18/basic/index#meta">Specification</a>
//		 * for notes on _meta usage
//		 * @return additional metadata related to this resource.
//		 */
//		Map<String, Object> meta();
//
//	}

	@JsonTypeInfo(
	    use = JsonTypeInfo.Id.NAME, 
	    include = JsonTypeInfo.As.PROPERTY, 
	    property = "type"  // 显式指定类型字段名
	)
	@JsonSubTypes({
	    @JsonSubTypes.Type(value = TextResourceContents.class, name = "text"),
	    @JsonSubTypes.Type(value = BlobResourceContents.class, name = "blob")
	})
	
	public abstract static class ResourceContents {  // 改为抽象类
	    public abstract String uri();
	    public abstract String mimeType();
	    public abstract Map<String, Object> meta();
	
	    // 禁止外部继承（模拟 sealed 限制）
	    private ResourceContents() {}  // 私有构造器限制继承
	
	    // 静态工厂方法（可选）
	    public static ResourceContents createText(String uri, String mimeType, Map<String, Object> meta) {
	        return new TextResourceContents(uri, mimeType, null, meta);
	    }
	    
	    public static ResourceContents createBlob(String uri, String mimeType, Map<String, Object> meta) {
	        return new BlobResourceContents(uri, mimeType, null, meta);
	    }
	
	   
	}

	
	/**
	 * Text contents of a resource.
	 *
	 * @param uri the URI of this resource.
	 * @param mimeType the MIME type of this resource.
	 * @param text the text of the resource. This must only be set if the resource can
	 * actually be represented as text (not binary data).
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record TextResourceContents( // @formatter:off
//		@JsonProperty("uri") String uri,
//		@JsonProperty("mimeType") String mimeType,
//		@JsonProperty("text") String text,
//		@JsonProperty("_meta") Map<String, Object> meta) implements ResourceContents { // @formatter:on
//
//		public TextResourceContents(String uri, String mimeType, String text) {
//			this(uri, mimeType, text, null);
//		}
//	}
	public final static class TextResourceContents extends ResourceContents {
	    private final String uri;
	    private final String mimeType;
	    private final String text;
	    private final Map<String, Object> meta;

	    // 全参数构造函数（支持 JSON 反序列化）
	    public TextResourceContents(
	        @JsonProperty("uri") String uri,
	        @JsonProperty("mimeType") String mimeType,
	        @JsonProperty("text") String text,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.uri = uri;
	        this.mimeType = mimeType;
	        this.text = text;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public TextResourceContents(String uri, String mimeType, String text) {
	        this(uri, mimeType, text, null);
	    }

	    // 字段访问方法（保持 record 语义）
	    @Override @JsonProperty("uri")
	    public String uri() { return uri; }

	    @Override @JsonProperty("mimeType")
	    public String mimeType() { return mimeType; }

	    @JsonProperty("text")
	    public String text() { return text; }

	    @Override @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        TextResourceContents that = (TextResourceContents) o;
	        return Objects.equals(uri, that.uri) &&
	               Objects.equals(mimeType, that.mimeType) &&
	               Objects.equals(text, that.text) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(uri, mimeType, text, meta);
	    }

	    @Override
	    public String toString() {
	        return "TextResourceContents{" +
	               "uri='" + uri + '\'' +
	               ", mimeType='" + mimeType + '\'' +
	               ", text='" + text + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * Binary contents of a resource.
	 *
	 * @param uri the URI of this resource.
	 * @param mimeType the MIME type of this resource.
	 * @param blob a base64-encoded string representing the binary data of the resource.
	 * This must only be set if the resource can actually be represented as binary data
	 * (not text).
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record BlobResourceContents( // @formatter:off
//		@JsonProperty("uri") String uri,
//		@JsonProperty("mimeType") String mimeType,
//		@JsonProperty("blob") String blob,
//		@JsonProperty("_meta") Map<String, Object> meta) implements ResourceContents { // @formatter:on
//
//		public BlobResourceContents(String uri, String mimeType, String blob) {
//			this(uri, mimeType, blob, null);
//		}
//	}
	public final static class BlobResourceContents extends ResourceContents {
	    private final String uri;
	    private final String mimeType;
	    private final String blob;
	    private final Map<String, Object> meta;

	    // 全参数构造函数
	    public BlobResourceContents(
	        @JsonProperty("uri") String uri,
	        @JsonProperty("mimeType") String mimeType,
	        @JsonProperty("blob") String blob,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.uri = uri;
	        this.mimeType = mimeType;
	        this.blob = blob;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public BlobResourceContents(String uri, String mimeType, String blob) {
	        this(uri, mimeType, blob, null);
	    }

	    // 字段访问方法
	    @Override @JsonProperty("uri")
	    public String uri() { return uri; }

	    @Override @JsonProperty("mimeType")
	    public String mimeType() { return mimeType; }

	    @JsonProperty("blob")
	    public String blob() { return blob; }

	    @Override @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        BlobResourceContents that = (BlobResourceContents) o;
	        return Objects.equals(uri, that.uri) &&
	               Objects.equals(mimeType, that.mimeType) &&
	               Objects.equals(blob, that.blob) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(uri, mimeType, blob, meta);
	    }

	    @Override
	    public String toString() {
	        return "BlobResourceContents{" +
	               "uri='" + uri + '\'' +
	               ", mimeType='" + mimeType + '\'' +
	               ", blob='" + blob + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	// ---------------------------
	// Prompt Interfaces
	// ---------------------------
	/**
	 * A prompt or prompt template that the server offers.
	 *
	 * @param name The name of the prompt or prompt template.
	 * @param title An optional title for the prompt.
	 * @param description An optional description of what this prompt provides.
	 * @param arguments A list of arguments to use for templating the prompt.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record Prompt( // @formatter:off
//		@JsonProperty("name") String name,
//		@JsonProperty("title") String title,
//		@JsonProperty("description") String description,
//		@JsonProperty("arguments") List<PromptArgument> arguments,
//		@JsonProperty("_meta") Map<String, Object> meta) implements BaseMetadata { // @formatter:on
//
//		public Prompt(String name, String description, List<PromptArgument> arguments) {
//			this(name, null, description, arguments != null ? arguments : new ArrayList<>());
//		}
//
//		public Prompt(String name, String title, String description, List<PromptArgument> arguments) {
//			this(name, title, description, arguments != null ? arguments : new ArrayList<>(), null);
//		}
//	}
	public final static class Prompt implements BaseMetadata{
	    private final String name;
	    private final String title;
	    private final String description;
	    private final List<PromptArgument> arguments;
	    private final Map<String, Object> meta;

	    // 全参数构造函数（支持 JSON 反序列化）
	    public Prompt(
	        @JsonProperty("name") String name,
	        @JsonProperty("title") String title,
	        @JsonProperty("description") String description,
	        @JsonProperty("arguments") List<PromptArgument> arguments,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.name = name;
	        this.title = title;
	        this.description = description;
	        this.arguments = arguments != null ? arguments : new ArrayList<>();
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null, title=null）
	    public Prompt(String name, String description, List<PromptArgument> arguments) {
	        this(name, null, description, arguments, null);
	    }

	    // 便捷构造器（meta=null）
	    public Prompt(String name, String title, String description, List<PromptArgument> arguments) {
	        this(name, title, description, arguments, null);
	    }

	    // 字段访问方法
	    @Override
	    @JsonProperty("name")
	    public String name() { return name; }

	    @JsonProperty("title")
	    public String title() { return title; }

	    //@Override 
	    @JsonProperty("description")
	    public String description() { return description; }

	    @JsonProperty("arguments")
	    public List<PromptArgument> arguments() { return arguments; }

	    //@Override 
	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Prompt prompt = (Prompt) o;
	        return Objects.equals(name, prompt.name) &&
	               Objects.equals(title, prompt.title) &&
	               Objects.equals(description, prompt.description) &&
	               Objects.equals(arguments, prompt.arguments) &&
	               Objects.equals(meta, prompt.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, title, description, arguments, meta);
	    }

	    @Override
	    public String toString() {
	        return "Prompt{" +
	               "name='" + name + '\'' +
	               ", title='" + title + '\'' +
	               ", description='" + description + '\'' +
	               ", arguments=" + arguments +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * Describes an argument that a prompt can accept.
	 *
	 * @param name The name of the argument.
	 * @param title An optional title for the argument, which can be used in UI
	 * @param description A human-readable description of the argument.
	 * @param required Whether this argument must be provided.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record PromptArgument( // @formatter:off
//		@JsonProperty("name") String name,
//		@JsonProperty("title") String title,
//		@JsonProperty("description") String description,
//		@JsonProperty("required") Boolean required) implements BaseMetadata { // @formatter:on
//
//		public PromptArgument(String name, String description, Boolean required) {
//			this(name, null, description, required);
//		}
//	}
	public final static class PromptArgument implements BaseMetadata {
	    private final String name;
	    private final String title;
	    private final String description;
	    private final Boolean required;

	    // 全参数构造函数
	    public PromptArgument(
	        @JsonProperty("name") String name,
	        @JsonProperty("title") String title,
	        @JsonProperty("description") String description,
	        @JsonProperty("required") Boolean required
	    ) {
	        this.name = name;
	        this.title = title;
	        this.description = description;
	        this.required = required;
	    }

	    // 便捷构造器（title=null）
	    public PromptArgument(String name, String description, Boolean required) {
	        this(name, null, description, required);
	    }

	    // 字段访问方法
	    @Override @JsonProperty("name")
	    public String name() { return name; }

	    @JsonProperty("title")
	    public String title() { return title; }

	    //@Override
	    @JsonProperty("description")
	    public String description() { return description; }

	    @JsonProperty("required")
	    public Boolean required() { return required; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        PromptArgument that = (PromptArgument) o;
	        return Objects.equals(name, that.name) &&
	               Objects.equals(title, that.title) &&
	               Objects.equals(description, that.description) &&
	               Objects.equals(required, that.required);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, title, description, required);
	    }

	    @Override
	    public String toString() {
	        return "PromptArgument{" +
	               "name='" + name + '\'' +
	               ", title='" + title + '\'' +
	               ", description='" + description + '\'' +
	               ", required=" + required +
	               '}';
	    }
	}

	/**
	 * Describes a message returned as part of a prompt.
	 *
	 * This is similar to `SamplingMessage`, but also supports the embedding of resources
	 * from the MCP server.
	 *
	 * @param role The sender or recipient of messages and data in a conversation.
	 * @param content The content of the message of type {@link Content}.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record PromptMessage( // @formatter:off
//		@JsonProperty("role") Role role,
//		@JsonProperty("content") Content content) { // @formatter:on
//	}
	public final static class PromptMessage {
	    private final Role role;
	    private final Content content;

	    // 全参数构造函数
	    public PromptMessage(
	        @JsonProperty("role") Role role,
	        @JsonProperty("content") Content content
	    ) {
	        this.role = role;
	        this.content = content;
	    }

	    // 字段访问方法
	    @JsonProperty("role")
	    public Role role() { return role; }

	    @JsonProperty("content")
	    public Content content() { return content; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        PromptMessage that = (PromptMessage) o;
	        return Objects.equals(role, that.role) &&
	               Objects.equals(content, that.content);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(role, content);
	    }

	    @Override
	    public String toString() {
	        return "PromptMessage{" +
	               "role=" + role +
	               ", content=" + content +
	               '}';
	    }
	}

	/**
	 * The server's response to a prompts/list request from the client.
	 *
	 * @param prompts A list of prompts that the server provides.
	 * @param nextCursor An optional cursor for pagination. If present, indicates there
	 * are more prompts available.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ListPromptsResult( // @formatter:off
//		@JsonProperty("prompts") List<Prompt> prompts,
//		@JsonProperty("nextCursor") String nextCursor,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result  { // @formatter:on
//
//		public ListPromptsResult(List<Prompt> prompts, String nextCursor) {
//			this(prompts, nextCursor, null);
//		}
//	}
	public final static class ListPromptsResult implements Result {
	    private final List<Prompt> prompts;
	    private final String nextCursor;
	    private final Map<String, Object> meta;

	    // 全参数构造函数
	    public ListPromptsResult(
	        @JsonProperty("prompts") List<Prompt> prompts,
	        @JsonProperty("nextCursor") String nextCursor,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.prompts = prompts;
	        this.nextCursor = nextCursor;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ListPromptsResult(List<Prompt> prompts, String nextCursor) {
	        this(prompts, nextCursor, null);
	    }

	    // 字段访问方法
	    @JsonProperty("prompts")
	    public List<Prompt> prompts() { return prompts; }

	    @JsonProperty("nextCursor")
	    public String nextCursor() { return nextCursor; }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ListPromptsResult that = (ListPromptsResult) o;
	        return Objects.equals(prompts, that.prompts) &&
	               Objects.equals(nextCursor, that.nextCursor) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(prompts, nextCursor, meta);
	    }

	    @Override
	    public String toString() {
	        return "ListPromptsResult{" +
	               "prompts=" + prompts +
	               ", nextCursor='" + nextCursor + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * Used by the client to get a prompt provided by the server.
	 *
	 * @param name The name of the prompt or prompt template.
	 * @param arguments Arguments to use for templating the prompt.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record GetPromptRequest( // @formatter:off
//		@JsonProperty("name") String name,
//		@JsonProperty("arguments") Map<String, Object> arguments,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Request { // @formatter:on
//
//		public GetPromptRequest(String name, Map<String, Object> arguments) {
//			this(name, arguments, null);
//		}
//	}
	public final static class GetPromptRequest implements Request {
	    private final String name;
	    private final Map<String, Object> arguments;
	    private final Map<String, Object> meta;

	    // 全参构造函数
	    public GetPromptRequest(
	        @JsonProperty("name") String name,
	        @JsonProperty("arguments") Map<String, Object> arguments,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.name = name;
	        this.arguments = arguments;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public GetPromptRequest(String name, Map<String, Object> arguments) {
	        this(name, arguments, null);
	    }

	    // 字段访问方法
	    @JsonProperty("name")
	    public String name() {
	        return name;
	    }

	    @JsonProperty("arguments")
	    public Map<String, Object> arguments() {
	        return arguments;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        GetPromptRequest that = (GetPromptRequest) o;
	        return Objects.equals(name, that.name) &&
	               Objects.equals(arguments, that.arguments) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, arguments, meta);
	    }

	    @Override
	    public String toString() {
	        return "GetPromptRequest{" +
	               "name='" + name + '\'' +
	               ", arguments=" + arguments +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The server's response to a prompts/get request from the client.
	 *
	 * @param description An optional description for the prompt.
	 * @param messages A list of messages to display as part of the prompt.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record GetPromptResult( // @formatter:off
//		@JsonProperty("description") String description,
//		@JsonProperty("messages") List<PromptMessage> messages,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result { // @formatter:on
//
//		public GetPromptResult(String description, List<PromptMessage> messages) {
//			this(description, messages, null);
//		}
//	}
	public final static class GetPromptResult implements Result {
	    private final String description;
	    private final List<PromptMessage> messages;
	    private final Map<String, Object> meta;

	    // 全参构造函数
	    public GetPromptResult(
	        @JsonProperty("description") String description,
	        @JsonProperty("messages") List<PromptMessage> messages,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.description = description;
	        this.messages = messages;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public GetPromptResult(String description, List<PromptMessage> messages) {
	        this(description, messages, null);
	    }

	    // 字段访问方法
	    @JsonProperty("description")
	    public String description() {
	        return description;
	    }

	    @JsonProperty("messages")
	    public List<PromptMessage> messages() {
	        return messages;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        GetPromptResult that = (GetPromptResult) o;
	        return Objects.equals(description, that.description) &&
	               Objects.equals(messages, that.messages) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(description, messages, meta);
	    }

	    @Override
	    public String toString() {
	        return "GetPromptResult{" +
	               "description='" + description + '\'' +
	               ", messages=" + messages +
	               ", meta=" + meta +
	               '}';
	    }
	}

	// ---------------------------
	// Tool Interfaces
	// ---------------------------
	/**
	 * The server's response to a tools/list request from the client.
	 *
	 * @param tools A list of tools that the server provides.
	 * @param nextCursor An optional cursor for pagination. If present, indicates there
	 * are more tools available.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ListToolsResult( // @formatter:off
//		@JsonProperty("tools") List<Tool> tools,
//		@JsonProperty("nextCursor") String nextCursor,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result { // @formatter:on
//
//		public ListToolsResult(List<Tool> tools, String nextCursor) {
//			this(tools, nextCursor, null);
//		}
//	}
	public final static class ListToolsResult implements Result {
	    private final List<Tool> tools;
	    private final String nextCursor;
	    private final Map<String, Object> meta;

	    // 全参构造函数
	    public ListToolsResult(
	        @JsonProperty("tools") List<Tool> tools,
	        @JsonProperty("nextCursor") String nextCursor,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.tools = tools;
	        this.nextCursor = nextCursor;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ListToolsResult(List<Tool> tools, String nextCursor) {
	        this(tools, nextCursor, null);
	    }

	    // 字段访问方法
	    @JsonProperty("tools")
	    public List<Tool> tools() {
	        return tools;
	    }

	    @JsonProperty("nextCursor")
	    public String nextCursor() {
	        return nextCursor;
	    }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() {
	        return meta;
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ListToolsResult that = (ListToolsResult) o;
	        return Objects.equals(tools, that.tools) &&
	               Objects.equals(nextCursor, that.nextCursor) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(tools, nextCursor, meta);
	    }

	    @Override
	    public String toString() {
	        return "ListToolsResult{" +
	               "tools=" + tools +
	               ", nextCursor='" + nextCursor + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * A JSON Schema object that describes the expected structure of arguments or output.
	 *
	 * @param type The type of the schema (e.g., "object")
	 * @param properties The properties of the schema object
	 * @param required List of required property names
	 * @param additionalProperties Whether additional properties are allowed
	 * @param defs Schema definitions using the newer $defs keyword
	 * @param definitions Schema definitions using the legacy definitions keyword
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record JsonSchema( // @formatter:off
//		@JsonProperty("type") String type,
//		@JsonProperty("properties") Map<String, Object> properties,
//		@JsonProperty("required") List<String> required,
//		@JsonProperty("additionalProperties") Boolean additionalProperties,
//		@JsonProperty("$defs") Map<String, Object> defs,
//		@JsonProperty("definitions") Map<String, Object> definitions) { // @formatter:on
//	}
	public final static class JsonSchema {
	    private final String type;
	    private final Map<String, Object> properties;
	    private final List<String> required;
	    private final Boolean additionalProperties;
	    private final Map<String, Object> defs;
	    private final Map<String, Object> definitions;

	    // 全参构造函数
	    public JsonSchema(
	        @JsonProperty("type") String type,
	        @JsonProperty("properties") Map<String, Object> properties,
	        @JsonProperty("required") List<String> required,
	        @JsonProperty("additionalProperties") Boolean additionalProperties,
	        @JsonProperty("$defs") Map<String, Object> defs,
	        @JsonProperty("definitions") Map<String, Object> definitions
	    ) {
	        this.type = type;
	        this.properties = properties;
	        this.required = required;
	        this.additionalProperties = additionalProperties;
	        this.defs = defs;
	        this.definitions = definitions;
	    }

	    // 字段访问方法
	    @JsonProperty("type")
	    public String type() {
	        return type;
	    }

	    @JsonProperty("properties")
	    public Map<String, Object> properties() {
	        return properties;
	    }

	    @JsonProperty("required")
	    public List<String> required() {
	        return required;
	    }

	    @JsonProperty("additionalProperties")
	    public Boolean additionalProperties() {
	        return additionalProperties;
	    }

	    @JsonProperty("$defs")
	    public Map<String, Object> defs() {
	        return defs;
	    }

	    @JsonProperty("definitions")
	    public Map<String, Object> definitions() {
	        return definitions;
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        JsonSchema that = (JsonSchema) o;
	        return Objects.equals(type, that.type) &&
	               Objects.equals(properties, that.properties) &&
	               Objects.equals(required, that.required) &&
	               Objects.equals(additionalProperties, that.additionalProperties) &&
	               Objects.equals(defs, that.defs) &&
	               Objects.equals(definitions, that.definitions);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(type, properties, required, additionalProperties, defs, definitions);
	    }

	    @Override
	    public String toString() {
	        return "JsonSchema{" +
	               "type='" + type + '\'' +
	               ", properties=" + properties +
	               ", required=" + required +
	               ", additionalProperties=" + additionalProperties +
	               ", defs=" + defs +
	               ", definitions=" + definitions +
	               '}';
	    }
	}

	/**
	 * Additional properties describing a Tool to clients.
	 *
	 * NOTE: all properties in ToolAnnotations are **hints**. They are not guaranteed to
	 * provide a faithful description of tool behavior (including descriptive properties
	 * like `title`).
	 *
	 * Clients should never make tool use decisions based on ToolAnnotations received from
	 * untrusted servers.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ToolAnnotations( // @formatter:off
//		@JsonProperty("title")  String title,
//		@JsonProperty("readOnlyHint")   Boolean readOnlyHint,
//		@JsonProperty("destructiveHint") Boolean destructiveHint,
//		@JsonProperty("idempotentHint") Boolean idempotentHint,
//		@JsonProperty("openWorldHint") Boolean openWorldHint,
//		@JsonProperty("returnDirect") Boolean returnDirect) { // @formatter:on
//	}
	public final static class ToolAnnotations {
	    private final String title;
	    private final Boolean readOnlyHint;
	    private final Boolean destructiveHint;
	    private final Boolean idempotentHint;
	    private final Boolean openWorldHint;
	    private final Boolean returnDirect;

	    // 全参数构造函数
	    public ToolAnnotations(
	        @JsonProperty("title") String title,
	        @JsonProperty("readOnlyHint") Boolean readOnlyHint,
	        @JsonProperty("destructiveHint") Boolean destructiveHint,
	        @JsonProperty("idempotentHint") Boolean idempotentHint,
	        @JsonProperty("openWorldHint") Boolean openWorldHint,
	        @JsonProperty("returnDirect") Boolean returnDirect
	    ) {
	        this.title = title;
	        this.readOnlyHint = readOnlyHint;
	        this.destructiveHint = destructiveHint;
	        this.idempotentHint = idempotentHint;
	        this.openWorldHint = openWorldHint;
	        this.returnDirect = returnDirect;
	    }

	    // 字段访问方法
	    @JsonProperty("title")
	    public String title() { return title; }

	    @JsonProperty("readOnlyHint")
	    public Boolean readOnlyHint() { return readOnlyHint; }

	    @JsonProperty("destructiveHint")
	    public Boolean destructiveHint() { return destructiveHint; }

	    @JsonProperty("idempotentHint")
	    public Boolean idempotentHint() { return idempotentHint; }

	    @JsonProperty("openWorldHint")
	    public Boolean openWorldHint() { return openWorldHint; }

	    @JsonProperty("returnDirect")
	    public Boolean returnDirect() { return returnDirect; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ToolAnnotations that = (ToolAnnotations) o;
	        return Objects.equals(title, that.title) &&
	               Objects.equals(readOnlyHint, that.readOnlyHint) &&
	               Objects.equals(destructiveHint, that.destructiveHint) &&
	               Objects.equals(idempotentHint, that.idempotentHint) &&
	               Objects.equals(openWorldHint, that.openWorldHint) &&
	               Objects.equals(returnDirect, that.returnDirect);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(title, readOnlyHint, destructiveHint, 
	                            idempotentHint, openWorldHint, returnDirect);
	    }

	    @Override
	    public String toString() {
	        return "ToolAnnotations{" +
	               "title='" + title + '\'' +
	               ", readOnlyHint=" + readOnlyHint +
	               ", destructiveHint=" + destructiveHint +
	               ", idempotentHint=" + idempotentHint +
	               ", openWorldHint=" + openWorldHint +
	               ", returnDirect=" + returnDirect +
	               '}';
	    }
	}

	/**
	 * Represents a tool that the server provides. Tools enable servers to expose
	 * executable functionality to the system. Through these tools, you can interact with
	 * external systems, perform computations, and take actions in the real world.
	 *
	 * @param name A unique identifier for the tool. This name is used when calling the
	 * tool.
	 * @param title A human-readable title for the tool.
	 * @param description A human-readable description of what the tool does. This can be
	 * used by clients to improve the LLM's understanding of available tools.
	 * @param inputSchema A JSON Schema object that describes the expected structure of
	 * the arguments when calling this tool. This allows clients to validate tool
	 * @param outputSchema An optional JSON Schema object defining the structure of the
	 * tool's output returned in the structuredContent field of a CallToolResult.
	 * @param annotations Optional additional tool information.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record Tool( // @formatter:off
//		@JsonProperty("name") String name,
//		@JsonProperty("title") String title,
//		@JsonProperty("description") String description,
//		@JsonProperty("inputSchema") JsonSchema inputSchema,
//		@JsonProperty("outputSchema") Map<String, Object> outputSchema,
//		@JsonProperty("annotations") ToolAnnotations annotations,
//		@JsonProperty("_meta") Map<String, Object> meta) { // @formatter:on
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link Tool#builder()} instead.
//		 */
//		@Deprecated
//		public Tool(String name, String description, JsonSchema inputSchema, ToolAnnotations annotations) {
//			this(name, null, description, inputSchema, null, annotations, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link Tool#builder()} instead.
//		 */
//		@Deprecated
//		public Tool(String name, String description, String inputSchema) {
//			this(name, null, description, parseSchema(inputSchema), null, null, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link Tool#builder()} instead.
//		 */
//		@Deprecated
//		public Tool(String name, String description, String schema, ToolAnnotations annotations) {
//			this(name, null, description, parseSchema(schema), null, annotations, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link Tool#builder()} instead.
//		 */
//		@Deprecated
//		public Tool(String name, String description, String inputSchema, String outputSchema,
//				ToolAnnotations annotations) {
//			this(name, null, description, parseSchema(inputSchema), schemaToMap(outputSchema), annotations, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link Tool#builder()} instead.
//		 */
//		@Deprecated
//		public Tool(String name, String title, String description, String inputSchema, String outputSchema,
//				ToolAnnotations annotations) {
//			this(name, title, description, parseSchema(inputSchema), schemaToMap(outputSchema), annotations, null);
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private String name;
//
//			private String title;
//
//			private String description;
//
//			private JsonSchema inputSchema;
//
//			private Map<String, Object> outputSchema;
//
//			private ToolAnnotations annotations;
//
//			private Map<String, Object> meta;
//
//			public Builder name(String name) {
//				this.name = name;
//				return this;
//			}
//
//			public Builder title(String title) {
//				this.title = title;
//				return this;
//			}
//
//			public Builder description(String description) {
//				this.description = description;
//				return this;
//			}
//
//			public Builder inputSchema(JsonSchema inputSchema) {
//				this.inputSchema = inputSchema;
//				return this;
//			}
//
//			public Builder inputSchema(String inputSchema) {
//				this.inputSchema = parseSchema(inputSchema);
//				return this;
//			}
//
//			public Builder outputSchema(Map<String, Object> outputSchema) {
//				this.outputSchema = outputSchema;
//				return this;
//			}
//
//			public Builder outputSchema(String outputSchema) {
//				this.outputSchema = schemaToMap(outputSchema);
//				return this;
//			}
//
//			public Builder annotations(ToolAnnotations annotations) {
//				this.annotations = annotations;
//				return this;
//			}
//
//			public Builder meta(Map<String, Object> meta) {
//				this.meta = meta;
//				return this;
//			}
//
//			public Tool build() {
//				Assert.hasText(name, "name must not be empty");
//				return new Tool(name, title, description, inputSchema, outputSchema, annotations, meta);
//			}
//
//		}
//	}
	public final static class Tool {
	    private final String name;
	    private final String title;
	    private final String description;
	    private final JsonSchema inputSchema;
	    private final Map<String, Object> outputSchema;
	    private final ToolAnnotations annotations;
	    private final Map<String, Object> meta;

	    // 全参数主构造方法
	    public Tool(
	        @JsonProperty("name") String name,
	        @JsonProperty("title") String title,
	        @JsonProperty("description") String description,
	        @JsonProperty("inputSchema") JsonSchema inputSchema,
	        @JsonProperty("outputSchema") Map<String, Object> outputSchema,
	        @JsonProperty("annotations") ToolAnnotations annotations,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.name = name;
	        this.title = title;
	        this.description = description;
	        this.inputSchema = inputSchema;
	        this.outputSchema = outputSchema;
	        this.annotations = annotations;
	        this.meta = meta;
	    }

	    // 过时的兼容构造方法（标记为@Deprecated）
	    @Deprecated
	    public Tool(String name, String description, JsonSchema inputSchema, ToolAnnotations annotations) {
	        this(name, null, description, inputSchema, null, annotations, null);
	    }

	    @Deprecated
	    public Tool(String name, String description, String inputSchema) {
	        this(name, null, description, parseSchema(inputSchema), null, null, null);
	    }

	    @Deprecated
	    public Tool(String name, String description, String schema, ToolAnnotations annotations) {
	        this(name, null, description, parseSchema(schema), null, annotations, null);
	    }

	    @Deprecated
	    public Tool(String name, String description, String inputSchema, String outputSchema,
	                ToolAnnotations annotations) {
	        this(name, null, description, parseSchema(inputSchema), 
	             schemaToMap(outputSchema), annotations, null);
	    }

	    @Deprecated
	    public Tool(String name, String title, String description, String inputSchema, 
	                String outputSchema, ToolAnnotations annotations) {
	        this(name, title, description, parseSchema(inputSchema), 
	             schemaToMap(outputSchema), annotations, null);
	    }

	    // 字段访问方法
	    @JsonProperty("name")
	    public String name() { return name; }

	    @JsonProperty("title")
	    public String title() { return title; }

	    @JsonProperty("description")
	    public String description() { return description; }

	    @JsonProperty("inputSchema")
	    public JsonSchema inputSchema() { return inputSchema; }

	    @JsonProperty("outputSchema")
	    public Map<String, Object> outputSchema() { return outputSchema; }

	    @JsonProperty("annotations")
	    public ToolAnnotations annotations() { return annotations; }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 建造者模式实现
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private String name;
	        private String title;
	        private String description;
	        private JsonSchema inputSchema;
	        private Map<String, Object> outputSchema;
	        private ToolAnnotations annotations;
	        private Map<String, Object> meta;

	        public Builder name(String name) {
	            this.name = name;
	            return this;
	        }

	        public Builder title(String title) {
	            this.title = title;
	            return this;
	        }

	        public Builder description(String description) {
	            this.description = description;
	            return this;
	        }

	        public Builder inputSchema(JsonSchema inputSchema) {
	            this.inputSchema = inputSchema;
	            return this;
	        }

	        public Builder inputSchema(String inputSchema) {
	            this.inputSchema = parseSchema(inputSchema);
	            return this;
	        }

	        public Builder outputSchema(Map<String, Object> outputSchema) {
	            this.outputSchema = outputSchema;
	            return this;
	        }

	        public Builder outputSchema(String outputSchema) {
	            this.outputSchema = schemaToMap(outputSchema);
	            return this;
	        }

	        public Builder annotations(ToolAnnotations annotations) {
	            this.annotations = annotations;
	            return this;
	        }

	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public Tool build() {
	            Objects.requireNonNull(name, "name must not be empty");
	            return new Tool(name, title, description, inputSchema, 
	                            outputSchema, annotations, meta);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Tool tool = (Tool) o;
	        return Objects.equals(name, tool.name) &&
	               Objects.equals(title, tool.title) &&
	               Objects.equals(description, tool.description) &&
	               Objects.equals(inputSchema, tool.inputSchema) &&
	               Objects.equals(outputSchema, tool.outputSchema) &&
	               Objects.equals(annotations, tool.annotations) &&
	               Objects.equals(meta, tool.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, title, description, inputSchema, 
	                            outputSchema, annotations, meta);
	    }

	    @Override
	    public String toString() {
	        return "Tool{" +
	               "name='" + name + '\'' +
	               ", title='" + title + '\'' +
	               ", description='" + description + '\'' +
	               ", inputSchema=" + inputSchema +
	               ", outputSchema=" + outputSchema +
	               ", annotations=" + annotations +
	               ", meta=" + meta +
	               '}';
	    }

	    private static Map<String, Object> schemaToMap(String schema) {
			try {
				return OBJECT_MAPPER.readValue(schema, MAP_TYPE_REF);
			}
			catch (IOException e) {
				throw new IllegalArgumentException("Invalid schema: " + schema, e);
			}
		}

		private static JsonSchema parseSchema(String schema) {
			try {
				return OBJECT_MAPPER.readValue(schema, JsonSchema.class);
			}
			catch (IOException e) {
				throw new IllegalArgumentException("Invalid schema: " + schema, e);
			}
		}
	}

	

	/**
	 * Used by the client to call a tool provided by the server.
	 *
	 * @param name The name of the tool to call. This must match a tool name from
	 * tools/list.
	 * @param arguments Arguments to pass to the tool. These must conform to the tool's
	 * input schema.
	 * @param meta Optional metadata about the request. This can include additional
	 * information like `progressToken`
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record CallToolRequest( // @formatter:off
//		@JsonProperty("name") String name,
//		@JsonProperty("arguments") Map<String, Object> arguments,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Request { // @formatter:on
//
//		public CallToolRequest(String name, String jsonArguments) {
//			this(name, parseJsonArguments(jsonArguments), null);
//		}
//
//		public CallToolRequest(String name, Map<String, Object> arguments) {
//			this(name, arguments, null);
//		}
//
//		private static Map<String, Object> parseJsonArguments(String jsonArguments) {
//			try {
//				return OBJECT_MAPPER.readValue(jsonArguments, MAP_TYPE_REF);
//			}
//			catch (IOException e) {
//				throw new IllegalArgumentException("Invalid arguments: " + jsonArguments, e);
//			}
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private String name;
//
//			private Map<String, Object> arguments;
//
//			private Map<String, Object> meta;
//
//			public Builder name(String name) {
//				this.name = name;
//				return this;
//			}
//
//			public Builder arguments(Map<String, Object> arguments) {
//				this.arguments = arguments;
//				return this;
//			}
//
//			public Builder arguments(String jsonArguments) {
//				this.arguments = parseJsonArguments(jsonArguments);
//				return this;
//			}
//
//			public Builder meta(Map<String, Object> meta) {
//				this.meta = meta;
//				return this;
//			}
//
//			public Builder progressToken(String progressToken) {
//				if (this.meta == null) {
//					this.meta = new HashMap<>();
//				}
//				this.meta.put("progressToken", progressToken);
//				return this;
//			}
//
//			public CallToolRequest build() {
//				Assert.hasText(name, "name must not be empty");
//				return new CallToolRequest(name, arguments, meta);
//			}
//
//		}
//	}
	public final static class CallToolRequest implements Request {
	    private final String name;
	    private final Map<String, Object> arguments;
	    private final Map<String, Object> meta;
	    
	    // Jackson 解析依赖（需确保类路径中存在）
	    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	    private static final TypeReference<Map<String, Object>> MAP_TYPE_REF = 
	        new TypeReference<Map<String, Object>>() {};

	    // 全参构造器（支持 JSON 反序列化）
	    public CallToolRequest(
	        @JsonProperty("name") String name,
	        @JsonProperty("arguments") Map<String, Object> arguments,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.name = name;
	        this.arguments = arguments;
	        this.meta = meta;
	    }

	    // 便捷构造器（JSON 参数 + meta=null）
	    public CallToolRequest(String name, String jsonArguments) {
	        this(name, parseJsonArguments(jsonArguments), null);
	    }

	    // 便捷构造器（arguments + meta=null）
	    public CallToolRequest(String name, Map<String, Object> arguments) {
	        this(name, arguments, null);
	    }

	    // JSON 参数解析方法
	    private static Map<String, Object> parseJsonArguments(String jsonArguments) {
	        try {
	            return OBJECT_MAPPER.readValue(jsonArguments, MAP_TYPE_REF);
	        } catch (IOException e) {
	            throw new IllegalArgumentException("Invalid arguments: " + jsonArguments, e);
	        }
	    }

	    // 字段访问方法（保持 record 语义）
	    @JsonProperty("name")
	    public String name() { return name; }

	    @JsonProperty("arguments")
	    public Map<String, Object> arguments() { return arguments; }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 建造者模式
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private String name;
	        private Map<String, Object> arguments;
	        private Map<String, Object> meta;

	        public Builder name(String name) {
	            this.name = name;
	            return this;
	        }

	        public Builder arguments(Map<String, Object> arguments) {
	            this.arguments = arguments;
	            return this;
	        }

	        public Builder arguments(String jsonArguments) {
	            this.arguments = parseJsonArguments(jsonArguments);
	            return this;
	        }

	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public Builder progressToken(String progressToken) {
	            if (this.meta == null) {
	                this.meta = new HashMap<>();
	            }
	            this.meta.put("progressToken", progressToken);
	            return this;
	        }

	        public CallToolRequest build() {
	            if (name == null || name.trim().isEmpty()) {
	                throw new IllegalArgumentException("name must not be empty");
	            }
	            return new CallToolRequest(name, arguments, meta);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        CallToolRequest that = (CallToolRequest) o;
	        return Objects.equals(name, that.name) &&
	               Objects.equals(arguments, that.arguments) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, arguments, meta);
	    }

	    @Override
	    public String toString() {
	        return "CallToolRequest{" +
	               "name='" + name + '\'' +
	               ", arguments=" + arguments +
	               ", meta=" + meta +
	               '}';
	    }
	}


	/**
	 * The server's response to a tools/call request from the client.
	 *
	 * @param content A list of content items representing the tool's output. Each item
	 * can be text, an image, or an embedded resource.
	 * @param isError If true, indicates that the tool execution failed and the content
	 * contains error information. If false or absent, indicates successful execution.
	 * @param structuredContent An optional JSON object that represents the structured
	 * result of the tool call.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record CallToolResult( // @formatter:off
//		@JsonProperty("content") List<Content> content,
//		@JsonProperty("isError") Boolean isError,
//		@JsonProperty("structuredContent") Map<String, Object> structuredContent,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result { // @formatter:on
//
//		// backwards compatibility constructor
//		public CallToolResult(List<Content> content, Boolean isError) {
//			this(content, isError, null, null);
//		}
//
//		// backwards compatibility constructor
//		public CallToolResult(List<Content> content, Boolean isError, Map<String, Object> structuredContent) {
//			this(content, isError, structuredContent, null);
//		}
//
//		/**
//		 * Creates a new instance of {@link CallToolResult} with a string containing the
//		 * tool result.
//		 * @param content The content of the tool result. This will be mapped to a
//		 * one-sized list with a {@link TextContent} element.
//		 * @param isError If true, indicates that the tool execution failed and the
//		 * content contains error information. If false or absent, indicates successful
//		 * execution.
//		 */
//		public CallToolResult(String content, Boolean isError) {
//			this(List.of(new TextContent(content)), isError, null);
//		}
//
//		/**
//		 * Creates a builder for {@link CallToolResult}.
//		 * @return a new builder instance
//		 */
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		/**
//		 * Builder for {@link CallToolResult}.
//		 */
//		public static class Builder {
//
//			private List<Content> content = new ArrayList<>();
//
//			private Boolean isError = false;
//
//			private Map<String, Object> structuredContent;
//
//			private Map<String, Object> meta;
//
//			/**
//			 * Sets the content list for the tool result.
//			 * @param content the content list
//			 * @return this builder
//			 */
//			public Builder content(List<Content> content) {
//				Assert.notNull(content, "content must not be null");
//				this.content = content;
//				return this;
//			}
//
//			public Builder structuredContent(Map<String, Object> structuredContent) {
//				Assert.notNull(structuredContent, "structuredContent must not be null");
//				this.structuredContent = structuredContent;
//				return this;
//			}
//
//			public Builder structuredContent(String structuredContent) {
//				Assert.hasText(structuredContent, "structuredContent must not be empty");
//				try {
//					this.structuredContent = OBJECT_MAPPER.readValue(structuredContent, MAP_TYPE_REF);
//				}
//				catch (IOException e) {
//					throw new IllegalArgumentException("Invalid structured content: " + structuredContent, e);
//				}
//				return this;
//			}
//
//			/**
//			 * Sets the text content for the tool result.
//			 * @param textContent the text content
//			 * @return this builder
//			 */
//			public Builder textContent(List<String> textContent) {
//				Assert.notNull(textContent, "textContent must not be null");
//				textContent.stream().map(TextContent::new).forEach(this.content::add);
//				return this;
//			}
//
//			/**
//			 * Adds a content item to the tool result.
//			 * @param contentItem the content item to add
//			 * @return this builder
//			 */
//			public Builder addContent(Content contentItem) {
//				Assert.notNull(contentItem, "contentItem must not be null");
//				if (this.content == null) {
//					this.content = new ArrayList<>();
//				}
//				this.content.add(contentItem);
//				return this;
//			}
//
//			/**
//			 * Adds a text content item to the tool result.
//			 * @param text the text content
//			 * @return this builder
//			 */
//			public Builder addTextContent(String text) {
//				Assert.notNull(text, "text must not be null");
//				return addContent(new TextContent(text));
//			}
//
//			/**
//			 * Sets whether the tool execution resulted in an error.
//			 * @param isError true if the tool execution failed, false otherwise
//			 * @return this builder
//			 */
//			public Builder isError(Boolean isError) {
//				Assert.notNull(isError, "isError must not be null");
//				this.isError = isError;
//				return this;
//			}
//
//			/**
//			 * Sets the metadata for the tool result.
//			 * @param meta metadata
//			 * @return this builder
//			 */
//			public Builder meta(Map<String, Object> meta) {
//				this.meta = meta;
//				return this;
//			}
//
//			/**
//			 * Builds a new {@link CallToolResult} instance.
//			 * @return a new CallToolResult instance
//			 */
//			public CallToolResult build() {
//				return new CallToolResult(content, isError, structuredContent, meta);
//			}
//
//		}
//
//	}
	public final static class CallToolResult implements Result {
	    private final List<Content> content;
	    private final Boolean isError;
	    private final Map<String, Object> structuredContent;
	    private final Map<String, Object> meta;
	    
	    // Jackson 解析依赖
	    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	    private static final TypeReference<Map<String, Object>> MAP_TYPE_REF = 
	        new TypeReference<Map<String, Object>>() {};

	    // 全参构造器
	    public CallToolResult(
	        @JsonProperty("content") List<Content> content,
	        @JsonProperty("isError") Boolean isError,
	        @JsonProperty("structuredContent") Map<String, Object> structuredContent,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.content = content;
	        this.isError = isError;
	        this.structuredContent = structuredContent;
	        this.meta = meta;
	    }

	    // 向后兼容构造器（meta=null, structuredContent=null）
	    public CallToolResult(List<Content> content, Boolean isError) {
	        this(content, isError, null, null);
	    }

	    // 向后兼容构造器（meta=null）
	    public CallToolResult(List<Content> content, Boolean isError, Map<String, Object> structuredContent) {
	        this(content, isError, structuredContent, null);
	    }

	    // 文本内容构造器（自动包装为 TextContent）
	    public CallToolResult(String content, Boolean isError) {
	        this(Collections.singletonList(new TextContent(content)), isError, null);
	    }

	    // 字段访问方法
	    @JsonProperty("content")
	    public List<Content> content() { return content; }

	    @JsonProperty("isError")
	    public Boolean isError() { return isError; }

	    @JsonProperty("structuredContent")
	    public Map<String, Object> structuredContent() { return structuredContent; }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 建造者模式
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private List<Content> content = new ArrayList<>();
	        private Boolean isError = false;
	        private Map<String, Object> structuredContent;
	        private Map<String, Object> meta;

	        public Builder content(List<Content> content) {
	            if (content == null) throw new IllegalArgumentException("content must not be null");
	            this.content = content;
	            return this;
	        }

	        public Builder structuredContent(Map<String, Object> structuredContent) {
	            if (structuredContent == null) throw new IllegalArgumentException("structuredContent must not be null");
	            this.structuredContent = structuredContent;
	            return this;
	        }

	        public Builder structuredContent(String structuredContent) {
	            if (structuredContent == null || structuredContent.trim().isEmpty()) {
	                throw new IllegalArgumentException("structuredContent must not be empty");
	            }
	            try {
	                this.structuredContent = OBJECT_MAPPER.readValue(structuredContent, MAP_TYPE_REF);
	            } catch (IOException e) {
	                throw new IllegalArgumentException("Invalid structured content: " + structuredContent, e);
	            }
	            return this;
	        }

	        public Builder textContent(List<String> textContent) {
	            if (textContent == null) throw new IllegalArgumentException("textContent must not be null");
	            for (String text : textContent) {
	                this.content.add(new TextContent(text));
	            }
	            return this;
	        }

	        public Builder addContent(Content contentItem) {
	            if (contentItem == null) throw new IllegalArgumentException("contentItem must not be null");
	            if (this.content == null) this.content = new ArrayList<>();
	            this.content.add(contentItem);
	            return this;
	        }

	        public Builder addTextContent(String text) {
	            if (text == null) throw new IllegalArgumentException("text must not be null");
	            return addContent(new TextContent(text));
	        }

	        public Builder isError(Boolean isError) {
	            if (isError == null) throw new IllegalArgumentException("isError must not be null");
	            this.isError = isError;
	            return this;
	        }

	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public CallToolResult build() {
	            return new CallToolResult(content, isError, structuredContent, meta);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        CallToolResult that = (CallToolResult) o;
	        return Objects.equals(content, that.content) &&
	               Objects.equals(isError, that.isError) &&
	               Objects.equals(structuredContent, that.structuredContent) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(content, isError, structuredContent, meta);
	    }

	    @Override
	    public String toString() {
	        return "CallToolResult{" +
	               "content=" + content +
	               ", isError=" + isError +
	               ", structuredContent=" + structuredContent +
	               ", meta=" + meta +
	               '}';
	    }
	}

	// ---------------------------
	// Sampling Interfaces
	// ---------------------------
	/**
	 * The server's preferences for model selection, requested of the client during
	 * sampling.
	 *
	 * @param hints Optional hints to use for model selection. If multiple hints are
	 * specified, the client MUST evaluate them in order (such that the first match is
	 * taken). The client SHOULD prioritize these hints over the numeric priorities, but
	 * MAY still use the priorities to select from ambiguous matches
	 * @param costPriority How much to prioritize cost when selecting a model. A value of
	 * 0 means cost is not important, while a value of 1 means cost is the most important
	 * factor
	 * @param speedPriority How much to prioritize sampling speed (latency) when selecting
	 * a model. A value of 0 means speed is not important, while a value of 1 means speed
	 * is the most important factor
	 * @param intelligencePriority How much to prioritize intelligence and capabilities
	 * when selecting a model. A value of 0 means intelligence is not important, while a
	 * value of 1 means intelligence is the most important factor
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public final static class ModelPreferences {
	    private final List<ModelHint> hints;
	    private final Double costPriority;
	    private final Double speedPriority;
	    private final Double intelligencePriority;

	    public ModelPreferences(
	        @JsonProperty("hints") List<ModelHint> hints,
	        @JsonProperty("costPriority") Double costPriority,
	        @JsonProperty("speedPriority") Double speedPriority,
	        @JsonProperty("intelligencePriority") Double intelligencePriority
	    ) {
	        this.hints = hints;
	        this.costPriority = costPriority;
	        this.speedPriority = speedPriority;
	        this.intelligencePriority = intelligencePriority;
	    }

	    // 字段访问方法
	    @JsonProperty("hints")
	    public List<ModelHint> hints() { return hints; }

	    @JsonProperty("costPriority")
	    public Double costPriority() { return costPriority; }

	    @JsonProperty("speedPriority")
	    public Double speedPriority() { return speedPriority; }

	    @JsonProperty("intelligencePriority")
	    public Double intelligencePriority() { return intelligencePriority; }

	    // 建造者模式
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private List<ModelHint> hints;
	        private Double costPriority;
	        private Double speedPriority;
	        private Double intelligencePriority;

	        public Builder hints(List<ModelHint> hints) {
	            this.hints = hints;
	            return this;
	        }

	        public Builder addHint(String name) {
	            if (this.hints == null) this.hints = new ArrayList<>();
	            this.hints.add(ModelHint.of(name));
	            return this;
	        }

	        public Builder costPriority(Double costPriority) {
	            this.costPriority = costPriority;
	            return this;
	        }

	        public Builder speedPriority(Double speedPriority) {
	            this.speedPriority = speedPriority;
	            return this;
	        }

	        public Builder intelligencePriority(Double intelligencePriority) {
	            this.intelligencePriority = intelligencePriority;
	            return this;
	        }

	        public ModelPreferences build() {
	            return new ModelPreferences(hints, costPriority, speedPriority, intelligencePriority);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ModelPreferences that = (ModelPreferences) o;
	        return Objects.equals(hints, that.hints) &&
	               Objects.equals(costPriority, that.costPriority) &&
	               Objects.equals(speedPriority, that.speedPriority) &&
	               Objects.equals(intelligencePriority, that.intelligencePriority);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(hints, costPriority, speedPriority, intelligencePriority);
	    }

	    @Override
	    public String toString() {
	        return "ModelPreferences{" +
	               "hints=" + hints +
	               ", costPriority=" + costPriority +
	               ", speedPriority=" + speedPriority +
	               ", intelligencePriority=" + intelligencePriority +
	               '}';
	    }
	}

	/**
	 * Hints to use for model selection.
	 *
	 * @param name A hint for a model name. The client SHOULD treat this as a substring of
	 * a model name; for example: `claude-3-5-sonnet` should match
	 * `claude-3-5-sonnet-20241022`, `sonnet` should match `claude-3-5-sonnet-20241022`,
	 * `claude-3-sonnet-20240229`, etc., `claude` should match any Claude model. The
	 * client MAY also map the string to a different provider's model name or a different
	 * model family, as long as it fills a similar niche
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ModelHint(@JsonProperty("name") String name) {
//		public static ModelHint of(String name) {
//			return new ModelHint(name);
//		}
//	}
	public final static class ModelHint {
	    private final String name;

	    public ModelHint(@JsonProperty("name") String name) {
	        this.name = name;
	    }

	    // 静态工厂方法
	    public static ModelHint of(String name) {
	        return new ModelHint(name);
	    }

	    // 字段访问方法
	    @JsonProperty("name")
	    public String name() { return name; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ModelHint modelHint = (ModelHint) o;
	        return Objects.equals(name, modelHint.name);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name);
	    }

	    @Override
	    public String toString() {
	        return "ModelHint{name='" + name + "'}";
	    }
	}

	/**
	 * Describes a message issued to or received from an LLM API.
	 *
	 * @param role The sender or recipient of messages and data in a conversation
	 * @param content The content of the message
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record SamplingMessage( // @formatter:off
//		@JsonProperty("role") Role role,
//		@JsonProperty("content") Content content) { // @formatter:on
//	}
	public final static class SamplingMessage {
	    private final Role role;
	    private final Content content;

	    public SamplingMessage(
	        @JsonProperty("role") Role role,
	        @JsonProperty("content") Content content
	    ) {
	        this.role = role;
	        this.content = content;
	    }

	    // 字段访问方法
	    @JsonProperty("role")
	    public Role role() { return role; }

	    @JsonProperty("content")
	    public Content content() { return content; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        SamplingMessage that = (SamplingMessage) o;
	        return Objects.equals(role, that.role) &&
	               Objects.equals(content, that.content);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(role, content);
	    }

	    @Override
	    public String toString() {
	        return "SamplingMessage{" +
	               "role=" + role +
	               ", content=" + content +
	               '}';
	    }
	}

	/**
	 * A request from the server to sample an LLM via the client. The client has full
	 * discretion over which model to select. The client should also inform the user
	 * before beginning sampling, to allow them to inspect the request (human in the loop)
	 * and decide whether to approve it.
	 *
	 * @param messages The conversation messages to send to the LLM
	 * @param modelPreferences The server's preferences for which model to select. The
	 * client MAY ignore these preferences
	 * @param systemPrompt An optional system prompt the server wants to use for sampling.
	 * The client MAY modify or omit this prompt
	 * @param includeContext A request to include context from one or more MCP servers
	 * (including the caller), to be attached to the prompt. The client MAY ignore this
	 * request
	 * @param temperature Optional temperature parameter for sampling
	 * @param maxTokens The maximum number of tokens to sample, as requested by the
	 * server. The client MAY choose to sample fewer tokens than requested
	 * @param stopSequences Optional stop sequences for sampling
	 * @param metadata Optional metadata to pass through to the LLM provider. The format
	 * of this metadata is provider-specific
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record CreateMessageRequest( // @formatter:off
//		@JsonProperty("messages") List<SamplingMessage> messages,
//		@JsonProperty("modelPreferences") ModelPreferences modelPreferences,
//		@JsonProperty("systemPrompt") String systemPrompt,
//		@JsonProperty("includeContext") ContextInclusionStrategy includeContext,
//		@JsonProperty("temperature") Double temperature,
//		@JsonProperty("maxTokens") int maxTokens,
//		@JsonProperty("stopSequences") List<String> stopSequences,
//		@JsonProperty("metadata") Map<String, Object> metadata,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Request { // @formatter:on
//
//		// backwards compatibility constructor
//		public CreateMessageRequest(List<SamplingMessage> messages, ModelPreferences modelPreferences,
//				String systemPrompt, ContextInclusionStrategy includeContext, Double temperature, int maxTokens,
//				List<String> stopSequences, Map<String, Object> metadata) {
//			this(messages, modelPreferences, systemPrompt, includeContext, temperature, maxTokens, stopSequences,
//					metadata, null);
//		}
//
//		public enum ContextInclusionStrategy {
//
//		// @formatter:off
//			@JsonProperty("none") NONE,
//			@JsonProperty("thisServer") THIS_SERVER,
//			@JsonProperty("allServers")ALL_SERVERS
//		} // @formatter:on
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private List<SamplingMessage> messages;
//
//			private ModelPreferences modelPreferences;
//
//			private String systemPrompt;
//
//			private ContextInclusionStrategy includeContext;
//
//			private Double temperature;
//
//			private int maxTokens;
//
//			private List<String> stopSequences;
//
//			private Map<String, Object> metadata;
//
//			private Map<String, Object> meta;
//
//			public Builder messages(List<SamplingMessage> messages) {
//				this.messages = messages;
//				return this;
//			}
//
//			public Builder modelPreferences(ModelPreferences modelPreferences) {
//				this.modelPreferences = modelPreferences;
//				return this;
//			}
//
//			public Builder systemPrompt(String systemPrompt) {
//				this.systemPrompt = systemPrompt;
//				return this;
//			}
//
//			public Builder includeContext(ContextInclusionStrategy includeContext) {
//				this.includeContext = includeContext;
//				return this;
//			}
//
//			public Builder temperature(Double temperature) {
//				this.temperature = temperature;
//				return this;
//			}
//
//			public Builder maxTokens(int maxTokens) {
//				this.maxTokens = maxTokens;
//				return this;
//			}
//
//			public Builder stopSequences(List<String> stopSequences) {
//				this.stopSequences = stopSequences;
//				return this;
//			}
//
//			public Builder metadata(Map<String, Object> metadata) {
//				this.metadata = metadata;
//				return this;
//			}
//
//			public Builder meta(Map<String, Object> meta) {
//				this.meta = meta;
//				return this;
//			}
//
//			public Builder progressToken(String progressToken) {
//				if (this.meta == null) {
//					this.meta = new HashMap<>();
//				}
//				this.meta.put("progressToken", progressToken);
//				return this;
//			}
//
//			public CreateMessageRequest build() {
//				return new CreateMessageRequest(messages, modelPreferences, systemPrompt, includeContext, temperature,
//						maxTokens, stopSequences, metadata, meta);
//			}
//
//		}
//	}
	public final static class CreateMessageRequest implements Request {
	    private final List<SamplingMessage> messages;
	    private final ModelPreferences modelPreferences;
	    private final String systemPrompt;
	    private final ContextInclusionStrategy includeContext;
	    private final Double temperature;
	    private final int maxTokens;
	    private final List<String> stopSequences;
	    private final Map<String, Object> metadata;
	    private final Map<String, Object> meta;

	    // 全参构造器
	    public CreateMessageRequest(
	        @JsonProperty("messages") List<SamplingMessage> messages,
	        @JsonProperty("modelPreferences") ModelPreferences modelPreferences,
	        @JsonProperty("systemPrompt") String systemPrompt,
	        @JsonProperty("includeContext") ContextInclusionStrategy includeContext,
	        @JsonProperty("temperature") Double temperature,
	        @JsonProperty("maxTokens") int maxTokens,
	        @JsonProperty("stopSequences") List<String> stopSequences,
	        @JsonProperty("metadata") Map<String, Object> metadata,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.messages = messages;
	        this.modelPreferences = modelPreferences;
	        this.systemPrompt = systemPrompt;
	        this.includeContext = includeContext;
	        this.temperature = temperature;
	        this.maxTokens = maxTokens;
	        this.stopSequences = stopSequences;
	        this.metadata = metadata;
	        this.meta = meta;
	    }

	    // 向后兼容构造器
	    public CreateMessageRequest(
	        List<SamplingMessage> messages,
	        ModelPreferences modelPreferences,
	        String systemPrompt,
	        ContextInclusionStrategy includeContext,
	        Double temperature,
	        int maxTokens,
	        List<String> stopSequences,
	        Map<String, Object> metadata
	    ) {
	        this(messages, modelPreferences, systemPrompt, includeContext, 
	             temperature, maxTokens, stopSequences, metadata, null);
	    }

	    // 字段访问方法
	    @JsonProperty("messages")
	    public List<SamplingMessage> messages() { return messages; }

	    @JsonProperty("modelPreferences")
	    public ModelPreferences modelPreferences() { return modelPreferences; }

	    @JsonProperty("systemPrompt")
	    public String systemPrompt() { return systemPrompt; }

	    @JsonProperty("includeContext")
	    public ContextInclusionStrategy includeContext() { return includeContext; }

	    @JsonProperty("temperature")
	    public Double temperature() { return temperature; }

	    @JsonProperty("maxTokens")
	    public int maxTokens() { return maxTokens; }

	    @JsonProperty("stopSequences")
	    public List<String> stopSequences() { return stopSequences; }

	    @JsonProperty("metadata")
	    public Map<String, Object> metadata() { return metadata; }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 枚举定义
	    public enum ContextInclusionStrategy {
	        @JsonProperty("none") NONE,
	        @JsonProperty("thisServer") THIS_SERVER,
	        @JsonProperty("allServers") ALL_SERVERS
	    }

	    // 建造者模式
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private List<SamplingMessage> messages;
	        private ModelPreferences modelPreferences;
	        private String systemPrompt;
	        private ContextInclusionStrategy includeContext;
	        private Double temperature;
	        private int maxTokens;
	        private List<String> stopSequences;
	        private Map<String, Object> metadata;
	        private Map<String, Object> meta;

	        public Builder messages(List<SamplingMessage> messages) {
	            this.messages = messages;
	            return this;
	        }

	        public Builder modelPreferences(ModelPreferences modelPreferences) {
	            this.modelPreferences = modelPreferences;
	            return this;
	        }

	        public Builder systemPrompt(String systemPrompt) {
	            this.systemPrompt = systemPrompt;
	            return this;
	        }

	        public Builder includeContext(ContextInclusionStrategy includeContext) {
	            this.includeContext = includeContext;
	            return this;
	        }

	        public Builder temperature(Double temperature) {
	            this.temperature = temperature;
	            return this;
	        }

	        public Builder maxTokens(int maxTokens) {
	            this.maxTokens = maxTokens;
	            return this;
	        }

	        public Builder stopSequences(List<String> stopSequences) {
	            this.stopSequences = stopSequences;
	            return this;
	        }

	        public Builder metadata(Map<String, Object> metadata) {
	            this.metadata = metadata;
	            return this;
	        }

	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public Builder progressToken(String progressToken) {
	            if (this.meta == null) this.meta = new HashMap<>();
	            this.meta.put("progressToken", progressToken);
	            return this;
	        }

	        public CreateMessageRequest build() {
	            return new CreateMessageRequest(
	                messages, modelPreferences, systemPrompt, includeContext,
	                temperature, maxTokens, stopSequences, metadata, meta
	            );
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        CreateMessageRequest that = (CreateMessageRequest) o;
	        return maxTokens == that.maxTokens &&
	               Objects.equals(messages, that.messages) &&
	               Objects.equals(modelPreferences, that.modelPreferences) &&
	               Objects.equals(systemPrompt, that.systemPrompt) &&
	               includeContext == that.includeContext &&
	               Objects.equals(temperature, that.temperature) &&
	               Objects.equals(stopSequences, that.stopSequences) &&
	               Objects.equals(metadata, that.metadata) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(
	            messages, modelPreferences, systemPrompt, includeContext,
	            temperature, maxTokens, stopSequences, metadata, meta
	        );
	    }

	    @Override
	    public String toString() {
	        return "CreateMessageRequest{" +
	               "messages=" + messages +
	               ", modelPreferences=" + modelPreferences +
	               ", systemPrompt='" + systemPrompt + '\'' +
	               ", includeContext=" + includeContext +
	               ", temperature=" + temperature +
	               ", maxTokens=" + maxTokens +
	               ", stopSequences=" + stopSequences +
	               ", metadata=" + metadata +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The client's response to a sampling/create_message request from the server. The
	 * client should inform the user before returning the sampled message, to allow them
	 * to inspect the response (human in the loop) and decide whether to allow the server
	 * to see it.
	 *
	 * @param role The role of the message sender (typically assistant)
	 * @param content The content of the sampled message
	 * @param model The name of the model that generated the message
	 * @param stopReason The reason why sampling stopped, if known
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public final static class CreateMessageResult implements Result {
	    private final Role role;
	    private final Content content;
	    private final String model;
	    private final StopReason stopReason;
	    private final Map<String, Object> meta;

	    // 全参构造器
	    public CreateMessageResult(
	        @JsonProperty("role") Role role,
	        @JsonProperty("content") Content content,
	        @JsonProperty("model") String model,
	        @JsonProperty("stopReason") StopReason stopReason,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.role = role;
	        this.content = content;
	        this.model = model;
	        this.stopReason = stopReason;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public CreateMessageResult(Role role, Content content, String model, StopReason stopReason) {
	        this(role, content, model, stopReason, null);
	    }

	    // 字段访问方法
	    @JsonProperty("role")
	    public Role role() { return role; }

	    @JsonProperty("content")
	    public Content content() { return content; }

	    @JsonProperty("model")
	    public String model() { return model; }

	    @JsonProperty("stopReason")
	    public StopReason stopReason() { return stopReason; }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 枚举定义（保留JsonCreator反序列化逻辑）
	    public static enum StopReason {
	        @JsonProperty("endTurn") END_TURN("endTurn"),
	        @JsonProperty("stopSequence") STOP_SEQUENCE("stopSequence"),
	        @JsonProperty("maxTokens") MAX_TOKENS("maxTokens"),
	        @JsonProperty("unknown") UNKNOWN("unknown");

	        private final String value;

	        StopReason(String value) {
	            this.value = value;
	        }

	        @JsonCreator
	        private static StopReason of(String value) {
	            for (StopReason reason : values()) {
	                if (reason.value.equals(value)) {
	                    return reason;
	                }
	            }
	            return UNKNOWN;
	        }
	    }

	    // 建造者模式
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private Role role = Role.ASSISTANT;
	        private Content content;
	        private String model;
	        private StopReason stopReason = StopReason.END_TURN;
	        private Map<String, Object> meta;

	        public Builder role(Role role) {
	            this.role = role;
	            return this;
	        }

	        public Builder content(Content content) {
	            this.content = content;
	            return this;
	        }

	        public Builder model(String model) {
	            this.model = model;
	            return this;
	        }

	        public Builder stopReason(StopReason stopReason) {
	            this.stopReason = stopReason;
	            return this;
	        }

	        public Builder message(String message) {
	            this.content = new TextContent(message);
	            return this;
	        }

	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public CreateMessageResult build() {
	            return new CreateMessageResult(role, content, model, stopReason, meta);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        CreateMessageResult that = (CreateMessageResult) o;
	        return Objects.equals(role, that.role) &&
	               Objects.equals(content, that.content) &&
	               Objects.equals(model, that.model) &&
	               stopReason == that.stopReason &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(role, content, model, stopReason, meta);
	    }

	    @Override
	    public String toString() {
	        return "CreateMessageResult{" +
	               "role=" + role +
	               ", content=" + content +
	               ", model='" + model + '\'' +
	               ", stopReason=" + stopReason +
	               ", meta=" + meta +
	               '}';
	    }
	}

	// Elicitation
	/**
	 * A request from the server to elicit additional information from the user via the
	 * client.
	 *
	 * @param message The message to present to the user
	 * @param requestedSchema A restricted subset of JSON Schema. Only top-level
	 * properties are allowed, without nesting
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public final static class ElicitRequest implements Request {
	    private final String message;
	    private final Map<String, Object> requestedSchema;
	    private final Map<String, Object> meta;

	    // 全参构造器
	    public ElicitRequest(
	        @JsonProperty("message") String message,
	        @JsonProperty("requestedSchema") Map<String, Object> requestedSchema,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.message = message;
	        this.requestedSchema = requestedSchema;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ElicitRequest(String message, Map<String, Object> requestedSchema) {
	        this(message, requestedSchema, null);
	    }

	    // 字段访问方法
	    @JsonProperty("message")
	    public String message() { return message; }

	    @JsonProperty("requestedSchema")
	    public Map<String, Object> requestedSchema() { return requestedSchema; }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 建造者模式（支持progressToken扩展）
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private String message;
	        private Map<String, Object> requestedSchema;
	        private Map<String, Object> meta;

	        public Builder message(String message) {
	            this.message = message;
	            return this;
	        }

	        public Builder requestedSchema(Map<String, Object> requestedSchema) {
	            this.requestedSchema = requestedSchema;
	            return this;
	        }

	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public Builder progressToken(String progressToken) {
	            if (this.meta == null) {
	                this.meta = new HashMap<>();
	            }
	            this.meta.put("progressToken", progressToken);
	            return this;
	        }

	        public ElicitRequest build() {
	            return new ElicitRequest(message, requestedSchema, meta);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ElicitRequest that = (ElicitRequest) o;
	        return Objects.equals(message, that.message) &&
	               Objects.equals(requestedSchema, that.requestedSchema) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(message, requestedSchema, meta);
	    }

	    @Override
	    public String toString() {
	        return "ElicitRequest{" +
	               "message='" + message + '\'' +
	               ", requestedSchema=" + requestedSchema +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The client's response to an elicitation request.
	 *
	 * @param action The user action in response to the elicitation. "accept": User
	 * submitted the form/confirmed the action, "decline": User explicitly declined the
	 * action, "cancel": User dismissed without making an explicit choice
	 * @param content The submitted form data, only present when action is "accept".
	 * Contains values matching the requested schema
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ElicitResult( // @formatter:off
//		@JsonProperty("action") Action action,
//		@JsonProperty("content") Map<String, Object> content,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result { // @formatter:on
//
//		public enum Action {
//
//		// @formatter:off
//			@JsonProperty("accept") ACCEPT,
//			@JsonProperty("decline") DECLINE,
//			@JsonProperty("cancel") CANCEL
//		} // @formatter:on
//
//		// backwards compatibility constructor
//		public ElicitResult(Action action, Map<String, Object> content) {
//			this(action, content, null);
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private Action action;
//
//			private Map<String, Object> content;
//
//			private Map<String, Object> meta;
//
//			public Builder message(Action action) {
//				this.action = action;
//				return this;
//			}
//
//			public Builder content(Map<String, Object> content) {
//				this.content = content;
//				return this;
//			}
//
//			public Builder meta(Map<String, Object> meta) {
//				this.meta = meta;
//				return this;
//			}
//
//			public ElicitResult build() {
//				return new ElicitResult(action, content, meta);
//			}
//
//		}
//	}
	public final static class ElicitResult implements Result {
	    private final Action action;
	    private final Map<String, Object> content;
	    private final Map<String, Object> meta;

	    // 全参构造器
	    public ElicitResult(
	        @JsonProperty("action") Action action,
	        @JsonProperty("content") Map<String, Object> content,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.action = action;
	        this.content = content;
	        this.meta = meta;
	    }

	    // 向后兼容构造器（meta=null）
	    public ElicitResult(Action action, Map<String, Object> content) {
	        this(action, content, null);
	    }

	    // 枚举定义
	    public enum Action {
	        @JsonProperty("accept") ACCEPT,
	        @JsonProperty("decline") DECLINE,
	        @JsonProperty("cancel") CANCEL
	    }

	    // 字段访问方法
	    @JsonProperty("action")
	    public Action action() { return action; }

	    @JsonProperty("content")
	    public Map<String, Object> content() { return content; }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 建造者模式
	    public static Builder builder() {
	        return new Builder();
	    }

	    public final static class Builder {
	        private Action action;
	        private Map<String, Object> content;
	        private Map<String, Object> meta;

	        public Builder action(Action action) {
	            this.action = action;
	            return this;
	        }

	        public Builder content(Map<String, Object> content) {
	            this.content = content;
	            return this;
	        }

	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public ElicitResult build() {
	            return new ElicitResult(action, content, meta);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ElicitResult that = (ElicitResult) o;
	        return action == that.action &&
	               Objects.equals(content, that.content) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(action, content, meta);
	    }

	    @Override
	    public String toString() {
	        return "ElicitResult{" +
	               "action=" + action +
	               ", content=" + content +
	               ", meta=" + meta +
	               '}';
	    }
	}

	// ---------------------------
	// Pagination Interfaces
	// ---------------------------
	/**
	 * A request that supports pagination using cursors.
	 *
	 * @param cursor An opaque token representing the current pagination position. If
	 * provided, the server should return results starting after this cursor
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record PaginatedRequest( // @formatter:off
//		@JsonProperty("cursor") String cursor,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Request { // @formatter:on
//
//		public PaginatedRequest(String cursor) {
//			this(cursor, null);
//		}
//
//		/**
//		 * Creates a new paginated request with an empty cursor.
//		 */
//		public PaginatedRequest() {
//			this(null);
//		}
//	}
	public final static class PaginatedRequest implements Request {
	    private final String cursor;
	    private final Map<String, Object> meta;

	    // 全参构造器
	    public PaginatedRequest(
	        @JsonProperty("cursor") String cursor,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.cursor = cursor;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public PaginatedRequest(String cursor) {
	        this(cursor, null);
	    }

	    // 空游标构造器
	    public PaginatedRequest() {
	        this(null);
	    }

	    // 字段访问方法
	    @JsonProperty("cursor")
	    public String cursor() { return cursor; }

	    @JsonProperty("_meta")
	    public Map<String, Object> meta() { return meta; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        PaginatedRequest that = (PaginatedRequest) o;
	        return Objects.equals(cursor, that.cursor) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(cursor, meta);
	    }

	    @Override
	    public String toString() {
	        return "PaginatedRequest{" +
	               "cursor='" + cursor + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * An opaque token representing the pagination position after the last returned
	 * result. If present, there may be more results available.
	 *
	 * @param nextCursor An opaque token representing the pagination position after the
	 * last returned result. If present, there may be more results available
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record PaginatedResult(@JsonProperty("nextCursor") String nextCursor) {
//	}
	public final static class PaginatedResult {
	    private final String nextCursor;

	    public PaginatedResult(@JsonProperty("nextCursor") String nextCursor) {
	        this.nextCursor = nextCursor;
	    }

	    @JsonProperty("nextCursor")
	    public String nextCursor() {
	        return nextCursor;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        PaginatedResult that = (PaginatedResult) o;
	        return Objects.equals(nextCursor, that.nextCursor);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(nextCursor);
	    }

	    @Override
	    public String toString() {
	        return "PaginatedResult{" +
	               "nextCursor='" + nextCursor + '\'' +
	               '}';
	    }
	}

	// ---------------------------
	// Progress and Logging
	// ---------------------------
	/**
	 * The Model Context Protocol (MCP) supports optional progress tracking for
	 * long-running operations through notification messages. Either side can send
	 * progress notifications to provide updates about operation status.
	 *
	 * @param progressToken A unique token to identify the progress notification. MUST be
	 * unique across all active requests.
	 * @param progress A value indicating the current progress.
	 * @param total An optional total amount of work to be done, if known.
	 * @param message An optional message providing additional context about the progress.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ProgressNotification( // @formatter:off
//		@JsonProperty("progressToken") String progressToken,
//		@JsonProperty("progress") Double progress,
//		@JsonProperty("total") Double total,
//		@JsonProperty("message") String message,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Notification { // @formatter:on
//
//		public ProgressNotification(String progressToken, double progress, Double total, String message) {
//			this(progressToken, progress, total, message, null);
//		}
//	}
	public final static class ProgressNotification implements Notification {
	    private final String progressToken;
	    private final Double progress;
	    private final Double total;
	    private final String message;
	    private final Map<String, Object> meta;

	    public ProgressNotification(
	        @JsonProperty("progressToken") String progressToken,
	        @JsonProperty("progress") Double progress,
	        @JsonProperty("total") Double total,
	        @JsonProperty("message") String message,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.progressToken = progressToken;
	        this.progress = progress;
	        this.total = total;
	        this.message = message;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ProgressNotification(String progressToken, double progress, Double total, String message) {
	        this(progressToken, progress, total, message, null);
	    }

	    // 字段访问方法
	    @JsonProperty("progressToken") public String progressToken() { return progressToken; }
	    @JsonProperty("progress") public Double progress() { return progress; }
	    @JsonProperty("total") public Double total() { return total; }
	    @JsonProperty("message") public String message() { return message; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ProgressNotification that = (ProgressNotification) o;
	        return Objects.equals(progressToken, that.progressToken) &&
	               Objects.equals(progress, that.progress) &&
	               Objects.equals(total, that.total) &&
	               Objects.equals(message, that.message) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(progressToken, progress, total, message, meta);
	    }

	    @Override
	    public String toString() {
	        return "ProgressNotification{" +
	               "progressToken='" + progressToken + '\'' +
	               ", progress=" + progress +
	               ", total=" + total +
	               ", message='" + message + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The Model Context Protocol (MCP) provides a standardized way for servers to send
	 * resources update message to clients.
	 *
	 * @param uri The updated resource uri.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ResourcesUpdatedNotification(// @formatter:off
//		@JsonProperty("uri") String uri,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Notification { // @formatter:on
//
//		public ResourcesUpdatedNotification(String uri) {
//			this(uri, null);
//		}
//	}
	public final static class ResourcesUpdatedNotification implements Notification {
	    private final String uri;
	    private final Map<String, Object> meta;

	    public ResourcesUpdatedNotification(
	        @JsonProperty("uri") String uri,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.uri = uri;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ResourcesUpdatedNotification(String uri) {
	        this(uri, null);
	    }

	    // 字段访问方法
	    @JsonProperty("uri") public String uri() { return uri; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ResourcesUpdatedNotification that = (ResourcesUpdatedNotification) o;
	        return Objects.equals(uri, that.uri) && Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(uri, meta);
	    }

	    @Override
	    public String toString() {
	        return "ResourcesUpdatedNotification{" +
	               "uri='" + uri + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The Model Context Protocol (MCP) provides a standardized way for servers to send
	 * structured log messages to clients. Clients can control logging verbosity by
	 * setting minimum log levels, with servers sending notifications containing severity
	 * levels, optional logger names, and arbitrary JSON-serializable data.
	 *
	 * @param level The severity levels. The minimum log level is set by the client.
	 * @param logger The logger that generated the message.
	 * @param data JSON-serializable logging data.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record LoggingMessageNotification( // @formatter:off
//		@JsonProperty("level") LoggingLevel level,
//		@JsonProperty("logger") String logger,
//		@JsonProperty("data") String data,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Notification { // @formatter:on
//
//		// backwards compatibility constructor
//		public LoggingMessageNotification(LoggingLevel level, String logger, String data) {
//			this(level, logger, data, null);
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private LoggingLevel level = LoggingLevel.INFO;
//
//			private String logger = "server";
//
//			private String data;
//
//			private Map<String, Object> meta;
//
//			public Builder level(LoggingLevel level) {
//				this.level = level;
//				return this;
//			}
//
//			public Builder logger(String logger) {
//				this.logger = logger;
//				return this;
//			}
//
//			public Builder data(String data) {
//				this.data = data;
//				return this;
//			}
//
//			public Builder meta(Map<String, Object> meta) {
//				this.meta = meta;
//				return this;
//			}
//
//			public LoggingMessageNotification build() {
//				return new LoggingMessageNotification(level, logger, data, meta);
//			}
//
//		}
//	}
	public final static class LoggingMessageNotification implements Notification {
	    private final LoggingLevel level;
	    private final String logger;
	    private final String data;
	    private final Map<String, Object> meta;

	    // 全参构造器
	    public LoggingMessageNotification(
	        @JsonProperty("level") LoggingLevel level,
	        @JsonProperty("logger") String logger,
	        @JsonProperty("data") String data,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.level = level;
	        this.logger = logger;
	        this.data = data;
	        this.meta = meta;
	    }

	    // 向后兼容构造器（meta=null）
	    public LoggingMessageNotification(LoggingLevel level, String logger, String data) {
	        this(level, logger, data, null);
	    }

	    // 字段访问方法
	    @JsonProperty("level") public LoggingLevel level() { return level; }
	    @JsonProperty("logger") public String logger() { return logger; }
	    @JsonProperty("data") public String data() { return data; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // 建造者模式
	    public static Builder builder() {
	        return new Builder();
	    }

	    public static class Builder {
	        private LoggingLevel level = LoggingLevel.INFO;
	        private String logger = "server";
	        private String data;
	        private Map<String, Object> meta;

	        public Builder level(LoggingLevel level) {
	            this.level = level;
	            return this;
	        }

	        public Builder logger(String logger) {
	            this.logger = logger;
	            return this;
	        }

	        public Builder data(String data) {
	            this.data = data;
	            return this;
	        }

	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public LoggingMessageNotification build() {
	            return new LoggingMessageNotification(level, logger, data, meta);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        LoggingMessageNotification that = (LoggingMessageNotification) o;
	        return level == that.level &&
	               Objects.equals(logger, that.logger) &&
	               Objects.equals(data, that.data) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(level, logger, data, meta);
	    }

	    @Override
	    public String toString() {
	        return "LoggingMessageNotification{" +
	               "level=" + level +
	               ", logger='" + logger + '\'' +
	               ", data='" + data + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	public static enum LoggingLevel {

	// @formatter:off
		@JsonProperty("debug") DEBUG(0),
		@JsonProperty("info") INFO(1),
		@JsonProperty("notice") NOTICE(2),
		@JsonProperty("warning") WARNING(3),
		@JsonProperty("error") ERROR(4),
		@JsonProperty("critical") CRITICAL(5),
		@JsonProperty("alert") ALERT(6),
		@JsonProperty("emergency") EMERGENCY(7);
		// @formatter:on

		private final int level;

		LoggingLevel(int level) {
			this.level = level;
		}

		public int level() {
			return level;
		}

	}

	/**
	 * A request from the client to the server, to enable or adjust logging.
	 *
	 * @param level The level of logging that the client wants to receive from the server.
	 * The server should send all logs at this level and higher (i.e., more severe) to the
	 * client as notifications/message
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record SetLevelRequest(@JsonProperty("level") LoggingLevel level) {
//	}
	public final static class SetLevelRequest {
	    private final LoggingLevel level;

	    public SetLevelRequest(@JsonProperty("level") LoggingLevel level) {
	        this.level = level;
	    }

	    @JsonProperty("level")
	    public LoggingLevel level() {
	        return level;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        SetLevelRequest that = (SetLevelRequest) o;
	        return Objects.equals(level, that.level);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(level);
	    }

	    @Override
	    public String toString() {
	        return "SetLevelRequest{level=" + level + '}';
	    }
	}

	// ---------------------------
	// Autocomplete
	// ---------------------------
//	public sealed interface CompleteReference permits PromptReference, ResourceReference {
//
//		String type();
//
//		String identifier();
//
//	}
	
	public interface CompleteReference {

		String type();

		String identifier();

	}
	

	/**
	 * Identifies a prompt for completion requests.
	 *
	 * @param type The reference type identifier (typically "ref/prompt")
	 * @param name The name of the prompt
	 * @param title An optional title for the prompt
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record PromptReference( // @formatter:off
//		@JsonProperty("type") String type,
//		@JsonProperty("name") String name,
//		@JsonProperty("title") String title ) implements McpSchema.CompleteReference, BaseMetadata { // @formatter:on
//
//		public PromptReference(String type, String name) {
//			this(type, name, null);
//		}
//
//		public PromptReference(String name) {
//			this("ref/prompt", name, null);
//		}
//
//		@Override
//		public String identifier() {
//			return name();
//		}
//	}
	public final static class PromptReference implements CompleteReference, BaseMetadata {
	    private final String type;
	    private final String name;
	    private final String title;

	    // 全参构造器
	    public PromptReference(
	        @JsonProperty("type") String type,
	        @JsonProperty("name") String name,
	        @JsonProperty("title") String title
	    ) {
	        this.type = type;
	        this.name = name;
	        this.title = title;
	    }

	    // 便捷构造器（title=null）
	    public PromptReference(String type, String name) {
	        this(type, name, null);
	    }

	    // 便捷构造器（type="ref/prompt", title=null）
	    public PromptReference(String name) {
	        this("ref/prompt", name, null);
	    }

	    // 字段访问方法
	    @JsonProperty("type") @Override public String type() { return type; }
	    @JsonProperty("name") public String name() { return name; }
	    @JsonProperty("title") public String title() { return title; }

	    // 实现接口方法
	    @Override public String identifier() { return name; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        PromptReference that = (PromptReference) o;
	        return Objects.equals(type, that.type) &&
	               Objects.equals(name, that.name) &&
	               Objects.equals(title, that.title);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(type, name, title);
	    }

	    @Override
	    public String toString() {
	        return "PromptReference{" +
	               "type='" + type + '\'' +
	               ", name='" + name + '\'' +
	               ", title='" + title + '\'' +
	               '}';
	    }
	}

	/**
	 * A reference to a resource or resource template definition for completion requests.
	 *
	 * @param type The reference type identifier (typically "ref/resource")
	 * @param uri The URI or URI template of the resource
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ResourceReference( // @formatter:off
//		@JsonProperty("type") String type,
//		@JsonProperty("uri") String uri) implements McpSchema.CompleteReference { // @formatter:on
//
//		public ResourceReference(String uri) {
//			this("ref/resource", uri);
//		}
//
//		@Override
//		public String identifier() {
//			return uri();
//		}
//	}
	public final static class ResourceReference implements CompleteReference {
	    private final String type;
	    private final String uri;

	    // 全参构造器
	    public ResourceReference(
	        @JsonProperty("type") String type,
	        @JsonProperty("uri") String uri
	    ) {
	        this.type = type;
	        this.uri = uri;
	    }

	    // 便捷构造器（type="ref/resource"）
	    public ResourceReference(String uri) {
	        this("ref/resource", uri);
	    }

	    // 字段访问方法
	    @JsonProperty("type") @Override public String type() { return type; }
	    @JsonProperty("uri") public String uri() { return uri; }

	    // 实现接口方法
	    @Override public String identifier() { return uri; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ResourceReference that = (ResourceReference) o;
	        return Objects.equals(type, that.type) && Objects.equals(uri, that.uri);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(type, uri);
	    }

	    @Override
	    public String toString() {
	        return "ResourceReference{" +
	               "type='" + type + '\'' +
	               ", uri='" + uri + '\'' +
	               '}';
	    }
	}
	/**
	 * A request from the client to the server, to ask for completion options.
	 *
	 * @param ref A reference to a prompt or resource template definition
	 * @param argument The argument's information for completion requests
	 * @param meta See specification for notes on _meta usage
	 * @param context Additional, optional context for completions
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record CompleteRequest( // @formatter:off
//		@JsonProperty("ref") McpSchema.CompleteReference ref,
//		@JsonProperty("argument") CompleteArgument argument,
//		@JsonProperty("_meta") Map<String, Object> meta,
//		@JsonProperty("context") CompleteContext context) implements Request { // @formatter:on
//
//		public CompleteRequest(McpSchema.CompleteReference ref, CompleteArgument argument, Map<String, Object> meta) {
//			this(ref, argument, meta, null);
//		}
//
//		public CompleteRequest(McpSchema.CompleteReference ref, CompleteArgument argument, CompleteContext context) {
//			this(ref, argument, null, context);
//		}
//
//		public CompleteRequest(McpSchema.CompleteReference ref, CompleteArgument argument) {
//			this(ref, argument, null, null);
//		}
//
//		/**
//		 * The argument's information for completion requests.
//		 *
//		 * @param name The name of the argument
//		 * @param value The value of the argument to use for completion matching
//		 */
//		public record CompleteArgument(@JsonProperty("name") String name, @JsonProperty("value") String value) {
//		}
//
//		/**
//		 * Additional, optional context for completions.
//		 *
//		 * @param arguments Previously-resolved variables in a URI template or prompt
//		 */
//		public record CompleteContext(@JsonProperty("arguments") Map<String, String> arguments) {
//		}
//	}
	public final static class CompleteRequest implements Request {
	    private final McpSchema.CompleteReference ref;
	    private final CompleteArgument argument;
	    private final Map<String, Object> meta;
	    private final CompleteContext context;

	    // 全参构造器（支持 JSON 序列化）
	    public CompleteRequest(
	        @JsonProperty("ref") McpSchema.CompleteReference ref,
	        @JsonProperty("argument") CompleteArgument argument,
	        @JsonProperty("_meta") Map<String, Object> meta,
	        @JsonProperty("context") CompleteContext context
	    ) {
	        this.ref = ref;
	        this.argument = argument;
	        this.meta = meta;
	        this.context = context;
	    }

	    // 便捷构造器（context=null）
	    public CompleteRequest(McpSchema.CompleteReference ref, CompleteArgument argument, Map<String, Object> meta) {
	        this(ref, argument, meta, null);
	    }

	    // 便捷构造器（meta=null）
	    public CompleteRequest(McpSchema.CompleteReference ref, CompleteArgument argument, CompleteContext context) {
	        this(ref, argument, null, context);
	    }

	    // 便捷构造器（meta=null, context=null）
	    public CompleteRequest(McpSchema.CompleteReference ref, CompleteArgument argument) {
	        this(ref, argument, null, null);
	    }

	    // 字段访问方法
	    @JsonProperty("ref") public McpSchema.CompleteReference ref() { return ref; }
	    @JsonProperty("argument") public CompleteArgument argument() { return argument; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }
	    @JsonProperty("context") public CompleteContext context() { return context; }

	    // 嵌套类：CompleteArgument
	    public static final class CompleteArgument {
	        private final String name;
	        private final String value;

	        public CompleteArgument(
	            @JsonProperty("name") String name,
	            @JsonProperty("value") String value
	        ) {
	            this.name = name;
	            this.value = value;
	        }

	        @JsonProperty("name") public String name() { return name; }
	        @JsonProperty("value") public String value() { return value; }

	        @Override
	        public boolean equals(Object o) {
	            if (this == o) return true;
	            if (o == null || getClass() != o.getClass()) return false;
	            CompleteArgument that = (CompleteArgument) o;
	            return Objects.equals(name, that.name) && Objects.equals(value, that.value);
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash(name, value);
	        }
	    }

	    // 嵌套类：CompleteContext
	    public static final class CompleteContext {
	        private final Map<String, String> arguments;

	        public CompleteContext(
	            @JsonProperty("arguments") Map<String, String> arguments
	        ) {
	            this.arguments = arguments != null ? 
	                Collections.unmodifiableMap(new HashMap<>(arguments)) : null;
	        }

	        @JsonProperty("arguments") public Map<String, String> arguments() { return arguments; }

	        @Override
	        public boolean equals(Object o) {
	            if (this == o) return true;
	            if (o == null || getClass() != o.getClass()) return false;
	            CompleteContext that = (CompleteContext) o;
	            return Objects.equals(arguments, that.arguments);
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash(arguments);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        CompleteRequest that = (CompleteRequest) o;
	        return Objects.equals(ref, that.ref) &&
	               Objects.equals(argument, that.argument) &&
	               Objects.equals(meta, that.meta) &&
	               Objects.equals(context, that.context);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(ref, argument, meta, context);
	    }

	    @Override
	    public String toString() {
	        return "CompleteRequest{" +
	               "ref=" + ref +
	               ", argument=" + argument +
	               ", meta=" + meta +
	               ", context=" + context +
	               '}';
	    }
	}

	/**
	 * The server's response to a completion/complete request.
	 *
	 * @param completion The completion information containing values and metadata
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record CompleteResult(@JsonProperty("completion") CompleteCompletion completion,
//			@JsonProperty("_meta") Map<String, Object> meta) implements Result {
//
//		// backwards compatibility constructor
//		public CompleteResult(CompleteCompletion completion) {
//			this(completion, null);
//		}
//
//		/**
//		 * The server's response to a completion/complete request
//		 *
//		 * @param values An array of completion values. Must not exceed 100 items
//		 * @param total The total number of completion options available. This can exceed
//		 * the number of values actually sent in the response
//		 * @param hasMore Indicates whether there are additional completion options beyond
//		 * those provided in the current response, even if the exact total is unknown
//		 */
//		public record CompleteCompletion( // @formatter:off
//				@JsonProperty("values") List<String> values,
//				@JsonProperty("total") Integer total,
//				@JsonProperty("hasMore") Boolean hasMore) { // @formatter:on
//		}
//	}
	public final static class CompleteResult implements Result {
	    private final CompleteCompletion completion;
	    private final Map<String, Object> meta;

	    // 全参构造器
	    public CompleteResult(
	        @JsonProperty("completion") CompleteCompletion completion,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.completion = completion;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public CompleteResult(CompleteCompletion completion) {
	        this(completion, null);
	    }

	    // 字段访问方法
	    @JsonProperty("completion") public CompleteCompletion completion() { return completion; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // 嵌套类：CompleteCompletion
	    public static final class CompleteCompletion {
	        private final List<String> values;
	        private final Integer total;
	        private final Boolean hasMore;

	        public CompleteCompletion(
	            @JsonProperty("values") List<String> values,
	            @JsonProperty("total") Integer total,
	            @JsonProperty("hasMore") Boolean hasMore
	        ) {
	            this.values = values != null ? 
	                Collections.unmodifiableList(new ArrayList<>(values)) : null;
	            this.total = total;
	            this.hasMore = hasMore;
	        }

	        @JsonProperty("values") public List<String> values() { return values; }
	        @JsonProperty("total") public Integer total() { return total; }
	        @JsonProperty("hasMore") public Boolean hasMore() { return hasMore; }

	        @Override
	        public boolean equals(Object o) {
	            if (this == o) return true;
	            if (o == null || getClass() != o.getClass()) return false;
	            CompleteCompletion that = (CompleteCompletion) o;
	            return Objects.equals(values, that.values) &&
	                   Objects.equals(total, that.total) &&
	                   Objects.equals(hasMore, that.hasMore);
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash(values, total, hasMore);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        CompleteResult that = (CompleteResult) o;
	        return Objects.equals(completion, that.completion) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(completion, meta);
	    }

	    @Override
	    public String toString() {
	        return "CompleteResult{" +
	               "completion=" + completion +
	               ", meta=" + meta +
	               '}';
	    }
	}

	// ---------------------------
	// Content Types
	// ---------------------------
	@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
	@JsonSubTypes({ @JsonSubTypes.Type(value = TextContent.class, name = "text"),
			@JsonSubTypes.Type(value = ImageContent.class, name = "image"),
			@JsonSubTypes.Type(value = AudioContent.class, name = "audio"),
			@JsonSubTypes.Type(value = EmbeddedResource.class, name = "resource"),
			@JsonSubTypes.Type(value = ResourceLink.class, name = "resource_link") })
	//public sealed interface Content permits TextContent, ImageContent, AudioContent, EmbeddedResource, ResourceLink {
	public interface Content {
		Map<String, Object> meta();

		default String type() {
			if (this instanceof TextContent) {
				return "text";
			}
			else if (this instanceof ImageContent) {
				return "image";
			}
			else if (this instanceof AudioContent) {
				return "audio";
			}
			else if (this instanceof EmbeddedResource) {
				return "resource";
			}
			else if (this instanceof ResourceLink) {
				return "resource_link";
			}
			throw new IllegalArgumentException("Unknown content type: " + this);
		}

	}

	/**
	 * Text provided to or from an LLM.
	 *
	 * @param annotations Optional annotations for the client
	 * @param text The text content of the message
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record TextContent( // @formatter:off
//		@JsonProperty("annotations") Annotations annotations,
//		@JsonProperty("text") String text,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Annotated, Content { // @formatter:on
//
//		public TextContent(Annotations annotations, String text) {
//			this(annotations, text, null);
//		}
//
//		public TextContent(String content) {
//			this(null, content, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link TextContent#TextContent(Annotations, String)} instead.
//		 */
//		@Deprecated
//		public TextContent(List<Role> audience, Double priority, String content) {
//			this(audience != null || priority != null ? new Annotations(audience, priority) : null, content, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link TextContent#annotations()} instead.
//		 */
//		@Deprecated
//		public List<Role> audience() {
//			return annotations == null ? null : annotations.audience();
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link TextContent#annotations()} instead.
//		 */
//		@Deprecated
//		public Double priority() {
//			return annotations == null ? null : annotations.priority();
//		}
//	}
	public final static class TextContent implements Annotated, Content {
	    private final Annotations annotations;
	    private final String text;
	    private final Map<String, Object> meta;

	    // 主构造器（全参）
	    public TextContent(
	        @JsonProperty("annotations") Annotations annotations,
	        @JsonProperty("text") String text,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.annotations = annotations;
	        this.text = text;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public TextContent(Annotations annotations, String text) {
	        this(annotations, text, null);
	    }

	    // 便捷构造器（纯文本内容）
	    public TextContent(String content) {
	        this(null, content, null);
	    }

	    // ⚠️ 废弃构造器（向后兼容）
	    @Deprecated
	    public TextContent(List<Role> audience, Double priority, String content) {
	        this(
	            (audience != null || priority != null) ? new Annotations(audience, priority) : null,
	            content,
	            null
	        );
	    }

	    // 字段访问方法
	    @JsonProperty("annotations") public Annotations annotations() { return annotations; }
	    @JsonProperty("text") public String text() { return text; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // ⚠️ 废弃方法（向后兼容）
	    @Deprecated
	    public List<Role> audience() {
	        return annotations == null ? null : annotations.audience();
	    }

	    @Deprecated
	    public Double priority() {
	        return annotations == null ? null : annotations.priority();
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        TextContent that = (TextContent) o;
	        return Objects.equals(annotations, that.annotations) &&
	               Objects.equals(text, that.text) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(annotations, text, meta);
	    }

	    @Override
	    public String toString() {
	        return "TextContent{" +
	               "annotations=" + annotations +
	               ", text='" + text + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * An image provided to or from an LLM.
	 *
	 * @param annotations Optional annotations for the client
	 * @param data The base64-encoded image data
	 * @param mimeType The MIME type of the image. Different providers may support
	 * different image types
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ImageContent( // @formatter:off
//		@JsonProperty("annotations") Annotations annotations,
//		@JsonProperty("data") String data,
//		@JsonProperty("mimeType") String mimeType,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Annotated, Content { // @formatter:on
//
//		public ImageContent(Annotations annotations, String data, String mimeType) {
//			this(annotations, data, mimeType, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link ImageContent#ImageContent(Annotations, String, String)} instead.
//		 */
//		@Deprecated
//		public ImageContent(List<Role> audience, Double priority, String data, String mimeType) {
//			this(audience != null || priority != null ? new Annotations(audience, priority) : null, data, mimeType,
//					null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link ImageContent#annotations()} instead.
//		 */
//		@Deprecated
//		public List<Role> audience() {
//			return annotations == null ? null : annotations.audience();
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link ImageContent#annotations()} instead.
//		 */
//		@Deprecated
//		public Double priority() {
//			return annotations == null ? null : annotations.priority();
//		}
//	}
	public final static class ImageContent implements Annotated, Content {
	    private final Annotations annotations;
	    private final String data;
	    private final String mimeType;
	    private final Map<String, Object> meta;

	    // 主构造器（全参）
	    public ImageContent(
	        @JsonProperty("annotations") Annotations annotations,
	        @JsonProperty("data") String data,
	        @JsonProperty("mimeType") String mimeType,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.annotations = annotations;
	        this.data = data;
	        this.mimeType = mimeType;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public ImageContent(Annotations annotations, String data, String mimeType) {
	        this(annotations, data, mimeType, null);
	    }

	    // ⚠️ 废弃构造器（向后兼容）
	    @Deprecated
	    public ImageContent(List<Role> audience, Double priority, String data, String mimeType) {
	        this(
	            (audience != null || priority != null) ? new Annotations(audience, priority) : null,
	            data, mimeType, null
	        );
	    }

	    // 字段访问方法
	    @JsonProperty("annotations") public Annotations annotations() { return annotations; }
	    @JsonProperty("data") public String data() { return data; }
	    @JsonProperty("mimeType") public String mimeType() { return mimeType; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // ⚠️ 废弃方法（向后兼容）
	    @Deprecated
	    public List<Role> audience() {
	        return annotations == null ? null : annotations.audience();
	    }

	    @Deprecated
	    public Double priority() {
	        return annotations == null ? null : annotations.priority();
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ImageContent that = (ImageContent) o;
	        return Objects.equals(annotations, that.annotations) &&
	               Objects.equals(data, that.data) &&
	               Objects.equals(mimeType, that.mimeType) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(annotations, data, mimeType, meta);
	    }

	    @Override
	    public String toString() {
	        return "ImageContent{" +
	               "annotations=" + annotations +
	               ", data='" + (data != null ? data.substring(0, Math.min(10, data.length())) + "..." : null) + '\'' +
	               ", mimeType='" + mimeType + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * Audio provided to or from an LLM.
	 *
	 * @param annotations Optional annotations for the client
	 * @param data The base64-encoded audio data
	 * @param mimeType The MIME type of the audio. Different providers may support
	 * different audio types
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record AudioContent( // @formatter:off
//		@JsonProperty("annotations") Annotations annotations,
//		@JsonProperty("data") String data,
//		@JsonProperty("mimeType") String mimeType,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Annotated, Content { // @formatter:on
//
//		// backwards compatibility constructor
//		public AudioContent(Annotations annotations, String data, String mimeType) {
//			this(annotations, data, mimeType, null);
//		}
//	}
	public final static class AudioContent implements Annotated, Content {
	    private final Annotations annotations;
	    private final String data;
	    private final String mimeType;
	    private final Map<String, Object> meta;
	
	    // 主构造器（全参）
	    public AudioContent(
	        @JsonProperty("annotations") Annotations annotations,
	        @JsonProperty("data") String data,
	        @JsonProperty("mimeType") String mimeType,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.annotations = annotations;
	        this.data = data;
	        this.mimeType = mimeType;
	        this.meta = meta;
	    }
	
	    // 便捷构造器（meta=null）
	    public AudioContent(Annotations annotations, String data, String mimeType) {
	        this(annotations, data, mimeType, null);
	    }
	
	    // 字段访问方法
	    @JsonProperty("annotations") public Annotations annotations() { return annotations; }
	    @JsonProperty("data") public String data() { return data; }
	    @JsonProperty("mimeType") public String mimeType() { return mimeType; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }
	
	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        AudioContent that = (AudioContent) o;
	        return Objects.equals(annotations, that.annotations) &&
	               Objects.equals(data, that.data) &&
	               Objects.equals(mimeType, that.mimeType) &&
	               Objects.equals(meta, that.meta);
	    }
	
	    @Override
	    public int hashCode() {
	        return Objects.hash(annotations, data, mimeType, meta);
	    }
	
	    @Override
	    public String toString() {
	        return "AudioContent{" +
	               "annotations=" + annotations +
	               ", data='" + (data != null ? data.substring(0, Math.min(10, data.length())) + "..." : null) + '\'' +
	               ", mimeType='" + mimeType + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The contents of a resource, embedded into a prompt or tool call result.
	 *
	 * It is up to the client how best to render embedded resources for the benefit of the
	 * LLM and/or the user.
	 *
	 * @param annotations Optional annotations for the client
	 * @param resource The resource contents that are embedded
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record EmbeddedResource( // @formatter:off
//		@JsonProperty("annotations") Annotations annotations,
//		@JsonProperty("resource") ResourceContents resource,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Annotated, Content { // @formatter:on
//
//		// backwards compatibility constructor
//		public EmbeddedResource(Annotations annotations, ResourceContents resource) {
//			this(annotations, resource, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link EmbeddedResource#EmbeddedResource(Annotations, ResourceContents)}
//		 * instead.
//		 */
//		@Deprecated
//		public EmbeddedResource(List<Role> audience, Double priority, ResourceContents resource) {
//			this(audience != null || priority != null ? new Annotations(audience, priority) : null, resource, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link EmbeddedResource#annotations()} instead.
//		 */
//		@Deprecated
//		public List<Role> audience() {
//			return annotations == null ? null : annotations.audience();
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link EmbeddedResource#annotations()} instead.
//		 */
//		@Deprecated
//		public Double priority() {
//			return annotations == null ? null : annotations.priority();
//		}
//	}
	public final static class EmbeddedResource implements Annotated, Content {
	    private final Annotations annotations;
	    private final ResourceContents resource;
	    private final Map<String, Object> meta;

	    // 主构造器（全参）
	    public EmbeddedResource(
	        @JsonProperty("annotations") Annotations annotations,
	        @JsonProperty("resource") ResourceContents resource,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.annotations = annotations;
	        this.resource = resource;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public EmbeddedResource(Annotations annotations, ResourceContents resource) {
	        this(annotations, resource, null);
	    }

	    // ⚠️ 废弃构造器（向后兼容）
	    @Deprecated
	    public EmbeddedResource(List<Role> audience, Double priority, ResourceContents resource) {
	        this(
	            (audience != null || priority != null) ? new Annotations(audience, priority) : null,
	            resource, null
	        );
	    }

	    // 字段访问方法
	    @JsonProperty("annotations") public Annotations annotations() { return annotations; }
	    @JsonProperty("resource") public ResourceContents resource() { return resource; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // ⚠️ 废弃方法（向后兼容）
	    @Deprecated
	    public List<Role> audience() {
	        return annotations == null ? null : annotations.audience();
	    }

	    @Deprecated
	    public Double priority() {
	        return annotations == null ? null : annotations.priority();
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        EmbeddedResource that = (EmbeddedResource) o;
	        return Objects.equals(annotations, that.annotations) &&
	               Objects.equals(resource, that.resource) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(annotations, resource, meta);
	    }

	    @Override
	    public String toString() {
	        return "EmbeddedResource{" +
	               "annotations=" + annotations +
	               ", resource=" + resource +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * A known resource that the server is capable of reading.
	 *
	 * @param uri the URI of the resource.
	 * @param name A human-readable name for this resource. This can be used by clients to
	 * populate UI elements.
	 * @param title A human-readable title for this resource.
	 * @param description A description of what this resource represents. This can be used
	 * by clients to improve the LLM's understanding of available resources. It can be
	 * thought of like a "hint" to the model.
	 * @param mimeType The MIME type of this resource, if known.
	 * @param size The size of the raw resource content, in bytes (i.e., before base64
	 * encoding or any tokenization), if known. This can be used by Hosts to display file
	 * sizes and estimate context window usage.
	 * @param annotations Optional annotations for the client. The client can use
	 * annotations to inform how objects are used or displayed.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ResourceLink( // @formatter:off
//		@JsonProperty("name") String name,
//		@JsonProperty("title") String title,
//		@JsonProperty("uri") String uri,
//		@JsonProperty("description") String description,
//		@JsonProperty("mimeType") String mimeType,
//		@JsonProperty("size") Long size,
//		@JsonProperty("annotations") Annotations annotations,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Annotated, Content, ResourceContent { // @formatter:on
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link ResourceLink#ResourceLink(String, String, String, String, String, Long, Annotations)}
//		 * instead.
//		 */
//		@Deprecated
//		public ResourceLink(String name, String title, String uri, String description, String mimeType, Long size,
//				Annotations annotations) {
//			this(name, title, uri, description, mimeType, size, annotations, null);
//		}
//
//		/**
//		 * @deprecated Only exists for backwards-compatibility purposes. Use
//		 * {@link ResourceLink#ResourceLink(String, String, String, String, String, Long, Annotations)}
//		 * instead.
//		 */
//		@Deprecated
//		public ResourceLink(String name, String uri, String description, String mimeType, Long size,
//				Annotations annotations) {
//			this(name, null, uri, description, mimeType, size, annotations);
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private String name;
//
//			private String title;
//
//			private String uri;
//
//			private String description;
//
//			private String mimeType;
//
//			private Annotations annotations;
//
//			private Long size;
//
//			private Map<String, Object> meta;
//
//			public Builder name(String name) {
//				this.name = name;
//				return this;
//			}
//
//			public Builder title(String title) {
//				this.title = title;
//				return this;
//			}
//
//			public Builder uri(String uri) {
//				this.uri = uri;
//				return this;
//			}
//
//			public Builder description(String description) {
//				this.description = description;
//				return this;
//			}
//
//			public Builder mimeType(String mimeType) {
//				this.mimeType = mimeType;
//				return this;
//			}
//
//			public Builder annotations(Annotations annotations) {
//				this.annotations = annotations;
//				return this;
//			}
//
//			public Builder size(Long size) {
//				this.size = size;
//				return this;
//			}
//
//			public Builder meta(Map<String, Object> meta) {
//				this.meta = meta;
//				return this;
//			}
//
//			public ResourceLink build() {
//				Assert.hasText(uri, "uri must not be empty");
//				Assert.hasText(name, "name must not be empty");
//
//				return new ResourceLink(name, title, uri, description, mimeType, size, annotations, meta);
//			}
//
//		}
//	}
	public final static class ResourceLink implements Annotated, Content, ResourceContent {
	    private final String name;
	    private final String title;
	    private final String uri;
	    private final String description;
	    private final String mimeType;
	    private final Long size;
	    private final Annotations annotations;
	    private final Map<String, Object> meta;

	    // 全参构造器（支持 JSON 序列化）
	    public ResourceLink(
	        @JsonProperty("name") String name,
	        @JsonProperty("title") String title,
	        @JsonProperty("uri") String uri,
	        @JsonProperty("description") String description,
	        @JsonProperty("mimeType") String mimeType,
	        @JsonProperty("size") Long size,
	        @JsonProperty("annotations") Annotations annotations,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.name = name;
	        this.title = title;
	        this.uri = uri;
	        this.description = description;
	        this.mimeType = mimeType;
	        this.size = size;
	        this.annotations = annotations;
	        this.meta = meta;
	    }

	    // ⚠️ 废弃构造器 1（向后兼容）
	    @Deprecated
	    public ResourceLink(String name, String title, String uri, String description, String mimeType, Long size, Annotations annotations) {
	        this(name, title, uri, description, mimeType, size, annotations, null);
	    }

	    // ⚠️ 废弃构造器 2（向后兼容）
	    @Deprecated
	    public ResourceLink(String name, String uri, String description, String mimeType, Long size, Annotations annotations) {
	        this(name, null, uri, description, mimeType, size, annotations, null);
	    }

	    // 字段访问方法
	    @JsonProperty("name") public String name() { return name; }
	    @JsonProperty("title") public String title() { return title; }
	    @JsonProperty("uri") public String uri() { return uri; }
	    @JsonProperty("description") public String description() { return description; }
	    @JsonProperty("mimeType") public String mimeType() { return mimeType; }
	    @JsonProperty("size") public Long size() { return size; }
	    @JsonProperty("annotations") public Annotations annotations() { return annotations; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // 建造者模式
	    public static Builder builder() {
	        return new Builder();
	    }

	    public static class Builder {
	        private String name;
	        private String title;
	        private String uri;
	        private String description;
	        private String mimeType;
	        private Long size;
	        private Annotations annotations;
	        private Map<String, Object> meta;

	        public Builder name(String name) {
	            this.name = name;
	            return this;
	        }
	        public Builder title(String title) {
	            this.title = title;
	            return this;
	        }
	        public Builder uri(String uri) {
	            this.uri = uri;
	            return this;
	        }
	        public Builder description(String description) {
	            this.description = description;
	            return this;
	        }
	        public Builder mimeType(String mimeType) {
	            this.mimeType = mimeType;
	            return this;
	        }
	        public Builder size(Long size) {
	            this.size = size;
	            return this;
	        }
	        public Builder annotations(Annotations annotations) {
	            this.annotations = annotations;
	            return this;
	        }
	        public Builder meta(Map<String, Object> meta) {
	            this.meta = meta;
	            return this;
	        }

	        public ResourceLink build() {
	            Assert.hasText(uri, "uri must not be empty");
	            Assert.hasText(name, "name must not be empty");
	            return new ResourceLink(name, title, uri, description, mimeType, size, annotations, meta);
	        }
	    }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ResourceLink that = (ResourceLink) o;
	        return Objects.equals(name, that.name) &&
	               Objects.equals(title, that.title) &&
	               Objects.equals(uri, that.uri) &&
	               Objects.equals(description, that.description) &&
	               Objects.equals(mimeType, that.mimeType) &&
	               Objects.equals(size, that.size) &&
	               Objects.equals(annotations, that.annotations) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, title, uri, description, mimeType, size, annotations, meta);
	    }

	    @Override
	    public String toString() {
	        return "ResourceLink{" +
	               "name='" + name + '\'' +
	               ", title='" + title + '\'' +
	               ", uri='" + uri + '\'' +
	               ", description='" + description + '\'' +
	               ", mimeType='" + mimeType + '\'' +
	               ", size=" + size +
	               ", annotations=" + annotations +
	               ", meta=" + meta +
	               '}';
	    }
	}

	// ---------------------------
	// Roots
	// ---------------------------
	/**
	 * Represents a root directory or file that the server can operate on.
	 *
	 * @param uri The URI identifying the root. This *must* start with file:// for now.
	 * This restriction may be relaxed in future versions of the protocol to allow other
	 * URI schemes.
	 * @param name An optional name for the root. This can be used to provide a
	 * human-readable identifier for the root, which may be useful for display purposes or
	 * for referencing the root in other parts of the application.
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record Root( // @formatter:off
//		@JsonProperty("uri") String uri,
//		@JsonProperty("name") String name,
//		@JsonProperty("_meta") Map<String, Object> meta) { // @formatter:on
//
//		public Root(String uri, String name) {
//			this(uri, name, null);
//		}
//	}
	public final static class Root {
	    private final String uri;
	    private final String name;
	    private final Map<String, Object> meta;

	    // 全参构造器
	    public Root(
	        @JsonProperty("uri") String uri,
	        @JsonProperty("name") String name,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.uri = uri;
	        this.name = name;
	        this.meta = meta;
	    }

	    // 便捷构造器（meta=null）
	    public Root(String uri, String name) {
	        this(uri, name, null);
	    }

	    // 字段访问方法
	    @JsonProperty("uri") public String uri() { return uri; }
	    @JsonProperty("name") public String name() { return name; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Root root = (Root) o;
	        return Objects.equals(uri, root.uri) && 
	               Objects.equals(name, root.name) && 
	               Objects.equals(meta, root.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(uri, name, meta);
	    }

	    @Override
	    public String toString() {
	        return "Root{" +
	               "uri='" + uri + '\'' +
	               ", name='" + name + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

	/**
	 * The client's response to a roots/list request from the server. This result contains
	 * an array of Root objects, each representing a root directory or file that the
	 * server can operate on.
	 *
	 * @param roots An array of Root objects, each representing a root directory or file
	 * that the server can operate on.
	 * @param nextCursor An optional cursor for pagination. If present, indicates there
	 * are more roots available. The client can use this cursor to request the next page
	 * of results by sending a roots/list request with the cursor parameter set to this
	 * @param meta See specification for notes on _meta usage
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	public record ListRootsResult( // @formatter:off
//		@JsonProperty("roots") List<Root> roots,
//		@JsonProperty("nextCursor") String nextCursor,
//		@JsonProperty("_meta") Map<String, Object> meta) implements Result { // @formatter:on
//
//		public ListRootsResult(List<Root> roots) {
//			this(roots, null);
//		}
//
//		public ListRootsResult(List<Root> roots, String nextCursor) {
//			this(roots, nextCursor, null);
//		}
//	}
	public final static class ListRootsResult implements Result {
	    private final List<Root> roots;
	    private final String nextCursor;
	    private final Map<String, Object> meta;

	    // 全参构造器
	    public ListRootsResult(
	        @JsonProperty("roots") List<Root> roots,
	        @JsonProperty("nextCursor") String nextCursor,
	        @JsonProperty("_meta") Map<String, Object> meta
	    ) {
	        this.roots = roots != null ? 
	            Collections.unmodifiableList(new ArrayList<>(roots)) : null;
	        this.nextCursor = nextCursor;
	        this.meta = meta;
	    }

	    // 便捷构造器 1（nextCursor=null, meta=null）
	    public ListRootsResult(List<Root> roots) {
	        this(roots, null, null);
	    }

	    // 便捷构造器 2（meta=null）
	    public ListRootsResult(List<Root> roots, String nextCursor) {
	        this(roots, nextCursor, null);
	    }

	    // 字段访问方法
	    @JsonProperty("roots") public List<Root> roots() { return roots; }
	    @JsonProperty("nextCursor") public String nextCursor() { return nextCursor; }
	    @JsonProperty("_meta") public Map<String, Object> meta() { return meta; }

	    // 对象方法重写
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        ListRootsResult that = (ListRootsResult) o;
	        return Objects.equals(roots, that.roots) &&
	               Objects.equals(nextCursor, that.nextCursor) &&
	               Objects.equals(meta, that.meta);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(roots, nextCursor, meta);
	    }

	    @Override
	    public String toString() {
	        return "ListRootsResult{" +
	               "roots=" + roots +
	               ", nextCursor='" + nextCursor + '\'' +
	               ", meta=" + meta +
	               '}';
	    }
	}

}
