/*
 * Copyright 2024-2024 the original author or authors.
 */

package io.modelcontextprotocol.spec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Based on the <a href="http://www.jsonrpc.org/specification">JSON-RPC 2.0
 * specification</a> and the <a href=
 * "https://github.com/modelcontextprotocol/specification/blob/main/schema/schema.ts">Model
 * Context Protocol Schema</a>.
 *
 * @author Christian Tzolov
 */
public final class McpSchema {

	private static final Logger logger = LoggerFactory.getLogger(McpSchema.class);

	private McpSchema() {
	}

	public static final String LATEST_PROTOCOL_VERSION = "2024-11-05";

	public static final String JSONRPC_VERSION = "2.0";

	// ---------------------------
	// Method Names
	// ---------------------------

	// Lifecycle Methods
	public static final String METHOD_INITIALIZE = "initialize";

	public static final String METHOD_NOTIFICATION_INITIALIZED = "notifications/initialized";

	public static final String METHOD_PING = "ping";

	// Tool Methods
	public static final String METHOD_TOOLS_LIST = "tools/list";

	public static final String METHOD_TOOLS_CALL = "tools/call";

	public static final String METHOD_NOTIFICATION_TOOLS_LIST_CHANGED = "notifications/tools/list_changed";

	// Resources Methods
	public static final String METHOD_RESOURCES_LIST = "resources/list";

	public static final String METHOD_RESOURCES_READ = "resources/read";

	public static final String METHOD_NOTIFICATION_RESOURCES_LIST_CHANGED = "notifications/resources/list_changed";

	public static final String METHOD_RESOURCES_TEMPLATES_LIST = "resources/templates/list";

	public static final String METHOD_RESOURCES_SUBSCRIBE = "resources/subscribe";

	public static final String METHOD_RESOURCES_UNSUBSCRIBE = "resources/unsubscribe";

	// Prompt Methods
	public static final String METHOD_PROMPT_LIST = "prompts/list";

	public static final String METHOD_PROMPT_GET = "prompts/get";

	public static final String METHOD_NOTIFICATION_PROMPTS_LIST_CHANGED = "notifications/prompts/list_changed";

	// Logging Methods
	public static final String METHOD_LOGGING_SET_LEVEL = "logging/setLevel";

	public static final String METHOD_NOTIFICATION_MESSAGE = "notifications/message";

	// Roots Methods
	public static final String METHOD_ROOTS_LIST = "roots/list";

	public static final String METHOD_NOTIFICATION_ROOTS_LIST_CHANGED = "notifications/roots/list_changed";

	// Sampling Methods
	public static final String METHOD_SAMPLING_CREATE_MESSAGE = "sampling/createMessage";

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

	public interface Request {
	}

	private static final TypeReference<HashMap<String, Object>> MAP_TYPE_REF = new TypeReference<HashMap<String, Object>>() {
	};

	/**
	 * Deserializes a JSON string into a JSONRPCMessage object.
	 * 
	 * @param objectMapper
	 *            The ObjectMapper instance to use for deserialization
	 * @param jsonText
	 *            The JSON string to deserialize
	 * @return A JSONRPCMessage instance using either the
	 *         {@link JSONRPCRequest}, {@link JSONRPCNotification}, or
	 *         {@link JSONRPCResponse} classes.
	 * @throws IOException
	 *             If there's an error during deserialization
	 * @throws IllegalArgumentException
	 *             If the JSON structure doesn't match any known message type
	 */
	public static JSONRPCMessage deserializeJsonRpcMessage(ObjectMapper objectMapper, String jsonText) throws IOException {

		logger.debug("Received JSON message: {}", jsonText);

		Map<String, Object> map = objectMapper.readValue(jsonText, MAP_TYPE_REF);

		// Determine message type based on specific JSON structure
		if (map.containsKey("method") && map.containsKey("id")) {
			return objectMapper.convertValue(map, JSONRPCRequest.class);
		} else if (map.containsKey("method") && !map.containsKey("id")) {
			return objectMapper.convertValue(map, JSONRPCNotification.class);
		} else if (map.containsKey("result") || map.containsKey("error")) {
			return objectMapper.convertValue(map, JSONRPCResponse.class);
		}

		throw new IllegalArgumentException("Cannot deserialize JSONRPCMessage: " + jsonText);
	}

	// ---------------------------
	// JSON-RPC Message Types
	// ---------------------------
	public interface JSONRPCMessage {
		String getJsonrpc();
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class JSONRPCRequest implements JSONRPCMessage {
		@JsonProperty("jsonrpc")
		private String jsonrpc;

		@JsonProperty("method")
		private String method;

		@JsonProperty("id")
		private Object id;

		@JsonProperty("params")
		private Object params;

		// 无参构造函数
		public JSONRPCRequest() {
		}

		// 全参构造函数
		public JSONRPCRequest(String jsonrpc, String method, Object id, Object params) {
			this.jsonrpc = jsonrpc;
			this.method = method;
			this.id = id;
			this.params = params;
		}

		// Getter/Setter 方法
		@Override
		public String getJsonrpc() {
			return jsonrpc;
		}

		public void setJsonrpc(String jsonrpc) {
			this.jsonrpc = jsonrpc;
		}

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}

		public Object getId() {
			return id;
		}

		public void setId(Object id) {
			this.id = id;
		}

		public Object getParams() {
			return params;
		}

		public void setParams(Object params) {
			this.params = params;
		}

		
		// 对象比较
		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;

			JSONRPCRequest that = (JSONRPCRequest) o;
			if (method != null ? !method.equals(that.method) : that.method != null)
				return false;
			if (id != null ? !id.equals(that.id) : that.id != null)
				return false;
			return params != null ? params.equals(that.params) : that.params == null;
		}

		// 哈希计算
		@Override
		public int hashCode() {
			int result = method != null ? method.hashCode() : 0;
			result = 31 * result + (id != null ? id.hashCode() : 0);
			result = 31 * result + (params != null ? params.hashCode() : 0);
			return result;
		}

		// 字符串表示
		@Override
		public String toString() {
			return "JSONRPCRequest{" + "jsonrpc='" + jsonrpc + '\'' + ", method='" + method + '\'' + ", id=" + id + ", params=" + params + '}';
		}
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	// @Data
	// @AllArgsConstructor
	// @NoArgsConstructor
	// public static class JSONRPCNotification implements JSONRPCMessage {
	// @JsonProperty("jsonrpc") String jsonrpc;
	// @JsonProperty("method") String method;
	// @JsonProperty("params") Map<String, Object> params;
	// } // @formatter:on
	public static class JSONRPCNotification implements JSONRPCMessage {
		@JsonProperty("jsonrpc")
		private String jsonrpc;
		@JsonProperty("method")
		private String method;
		@JsonProperty("params")
		private Map<String, Object> params;

		// 无参构造函数
		public JSONRPCNotification() {
		}

		// 全参构造函数
		public JSONRPCNotification(String jsonrpc, String method, Map<String, Object> params) {
			this.jsonrpc = jsonrpc;
			this.method = method;
			this.params = params;
		}

		// JSON-RPC 协议字段的 Getter/Setter
		@Override
		public String getJsonrpc() {
			return jsonrpc;
		}

		public void setJsonrpc(String jsonrpc) {
			this.jsonrpc = jsonrpc;
		}

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}
		
		public Map<String, Object> getParams() {
			return params;
		}

		public void setParams(Map<String, Object> params) {
			this.params = params;
		}


		// 对象比较
		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;

			JSONRPCNotification that = (JSONRPCNotification) o;
			if (method != null ? !method.equals(that.method) : that.method != null)
				return false;
			return params != null ? params.equals(that.params) : that.params == null;
		}

		// 哈希计算
		@Override
		public int hashCode() {
			int result = method != null ? method.hashCode() : 0;
			result = 31 * result + (params != null ? params.hashCode() : 0);
			return result;
		}

		// 字符串表示
		@Override
		public String toString() {
			return "JSONRPCNotification{" + "jsonrpc='" + jsonrpc + '\'' + ", method='" + method + '\'' + ", params=" + params + '}';
		}
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	// @Data
	// @AllArgsConstructor
	// @NoArgsConstructor
	// public static class JSONRPCResponse implements JSONRPCMessage {
	// @JsonProperty("jsonrpc") String jsonrpc;
	// @JsonProperty("id") Object id;
	// @JsonProperty("result") Object result;
	// @JsonProperty("error") JSONRPCError error;
	//
	// @JsonInclude(JsonInclude.Include.NON_ABSENT)
	// @JsonIgnoreProperties(ignoreUnknown = true)
	// @Data
	// @AllArgsConstructor
	// @NoArgsConstructor
	// public static class JSONRPCError {
	// @JsonProperty("code") int code;
	// @JsonProperty("message") String message;
	// @JsonProperty("data") Object data;
	// }
	// }// @formatter:on
	public static class JSONRPCResponse implements JSONRPCMessage {
		@JsonProperty("jsonrpc")
		private String jsonrpc;
		@JsonProperty("id")
		private Object id;
		@JsonProperty("result")
		private Object result;
		@JsonProperty("error")
		private JSONRPCError error;

		// 无参构造函数
		public JSONRPCResponse() {
		}

		// 全参构造函数
		public JSONRPCResponse(String jsonrpc, Object id, Object result, JSONRPCError error) {
			this.jsonrpc = jsonrpc;
			this.id = id;
			this.result = result;
			this.error = error;
		}

		// JSON-RPC 协议字段的 Getter/Setter
		@Override
		public String getJsonrpc() {
			return jsonrpc;
		}

		public void setJsonrpc(String jsonrpc) {
			this.jsonrpc = jsonrpc;
		}

		public Object getId() {
			return id;
		}

		public void setId(Object id) {
			this.id = id;
		}

		public Object getResult() {
			return result;
		}

		public void setResult(Object result) {
			this.result = result;
		}

		public JSONRPCError getError() {
			return error;
		}

		public void setError(JSONRPCError error) {
			this.error = error;
		}

		// 对象比较
		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;

			JSONRPCResponse that = (JSONRPCResponse) o;
			if (id != null ? !id.equals(that.id) : that.id != null)
				return false;
			if (result != null ? !result.equals(that.result) : that.result != null)
				return false;
			return error != null ? error.equals(that.error) : that.error == null;
		}

		// 字符串表示
		@Override
		public String toString() {
			return "JSONRPCResponse{" + "jsonrpc='" + jsonrpc + '\'' + ", id=" + id + ", result=" + result + ", error=" + error + '}';
		}

		public static class JSONRPCError {
			@JsonProperty("code")
			private int code;
			@JsonProperty("message")
			private String message;
			@JsonProperty("data")
			private Object data;

			// 无参构造函数
			public JSONRPCError() {
			}

			// 全参构造函数
			public JSONRPCError(int code, String message, Object data) {
				this.code = code;
				this.message = message;
				this.data = data;
			}

			// Getter/Setter 方法
			public int getCode() {
				return code;
			}

			public void setCode(int code) {
				this.code = code;
			}

			public String getMessage() {
				return message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public Object getData() {
				return data;
			}

			public void setData(Object data) {
				this.data = data;
			}

			// 对象比较
			@Override
			public boolean equals(Object o) {
				if (this == o)
					return true;
				if (o == null || getClass() != o.getClass())
					return false;

				JSONRPCError that = (JSONRPCError) o;
				if (code != that.code)
					return false;
				if (message != null ? !message.equals(that.message) : that.message != null)
					return false;
				return data != null ? data.equals(that.data) : that.data == null;
			}

			// 哈希计算
			@Override
			public int hashCode() {
				int result = code;
				result = 31 * result + (message != null ? message.hashCode() : 0);
				result = 31 * result + (data != null ? data.hashCode() : 0);
				return result;
			}

			// 字符串表示
			@Override
			public String toString() {
				return "JSONRPCError{" + "code=" + code + ", message='" + message + '\'' + ", data=" + data + '}';
			}
		}
	}

	// ---------------------------
	// Initialization
	// ---------------------------
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	// @Data
	// @AllArgsConstructor
	// @NoArgsConstructor
	// public static class InitializeRequest implements Request {
	// @JsonProperty("protocolVersion") String protocolVersion;
	// @JsonProperty("capabilities") ClientCapabilities capabilities;
	// @JsonProperty("clientInfo") Implementation clientInfo;
	// } // @formatter:on
	public static class InitializeRequest implements Request {
		@JsonProperty("protocolVersion")
		private String protocolVersion;
		@JsonProperty("capabilities")
		private ClientCapabilities capabilities;
		@JsonProperty("clientInfo")
		private Implementation clientInfo;

		// 无参构造函数
		public InitializeRequest() {
		}

		// 全参构造函数
		public InitializeRequest(String protocolVersion, ClientCapabilities capabilities, Implementation clientInfo) {
			this.protocolVersion = protocolVersion;
			this.capabilities = capabilities;
			this.clientInfo = clientInfo;
		}

		// JSON-RPC 协议字段的 Getter/Setter
		public String getProtocolVersion() {
			return protocolVersion;
		}

		public void setProtocolVersion(String protocolVersion) {
			this.protocolVersion = protocolVersion;
		}

		public ClientCapabilities getCapabilities() {
			return capabilities;
		}

		public void setCapabilities(ClientCapabilities capabilities) {
			this.capabilities = capabilities;
		}

		public Implementation getClientInfo() {
			return clientInfo;
		}

		public void setClientInfo(Implementation clientInfo) {
			this.clientInfo = clientInfo;
		}

		// 对象比较
		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;

			InitializeRequest that = (InitializeRequest) o;
			if (protocolVersion != null ? !protocolVersion.equals(that.protocolVersion) : that.protocolVersion != null)
				return false;
			if (capabilities != null ? !capabilities.equals(that.capabilities) : that.capabilities != null)
				return false;
			return clientInfo != null ? clientInfo.equals(that.clientInfo) : that.clientInfo == null;
		}

		// 哈希计算
		@Override
		public int hashCode() {
			int result = protocolVersion != null ? protocolVersion.hashCode() : 0;
			result = 31 * result + (capabilities != null ? capabilities.hashCode() : 0);
			result = 31 * result + (clientInfo != null ? clientInfo.hashCode() : 0);
			return result;
		}

		// 字符串表示
		@Override
		public String toString() {
			return "InitializeRequest{" + "protocolVersion='" + protocolVersion + '\'' + ", capabilities=" + capabilities + ", clientInfo=" + clientInfo + '}';
		}
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	// @Data
	// @AllArgsConstructor
	// @NoArgsConstructor
	// public static class InitializeResult {
	// @JsonProperty("protocolVersion") String protocolVersion;
	// @JsonProperty("capabilities") ServerCapabilities capabilities;
	// @JsonProperty("serverInfo") Implementation serverInfo;
	// @JsonProperty("instructions") String instructions;
	// } // @formatter:on
	public static class InitializeResult{
		@JsonProperty("protocolVersion")
		private String protocolVersion;

		@JsonProperty("capabilities")
		private ServerCapabilities capabilities;

		@JsonProperty("serverInfo")
		private Implementation serverInfo;

		@JsonProperty("instructions")
		private String instructions;

		// 无参构造函数
		public InitializeResult() {
		}

		// 全参构造函数
		public InitializeResult(String protocolVersion, ServerCapabilities capabilities, Implementation serverInfo, String instructions) {
			this.protocolVersion = protocolVersion;
			this.capabilities = capabilities;
			this.serverInfo = serverInfo;
			this.instructions = instructions;
		}

		// JSON-RPC 协议字段的 Getter/Setter
		public String getProtocolVersion() {
			return protocolVersion;
		}

		public void setProtocolVersion(String protocolVersion) {
			this.protocolVersion = protocolVersion;
		}

		public ServerCapabilities getCapabilities() {
			return capabilities;
		}

		public void setCapabilities(ServerCapabilities capabilities) {
			this.capabilities = capabilities;
		}

		public Implementation getServerInfo() {
			return serverInfo;
		}

		public void setServerInfo(Implementation serverInfo) {
			this.serverInfo = serverInfo;
		}

		public String getInstructions() {
			return instructions;
		}

		public void setInstructions(String instructions) {
			this.instructions = instructions;
		}

		// JSON-RPC 消息实现
		public String getMethod() {
			return "initialize";
		}

		// 对象比较
		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;

			InitializeResult that = (InitializeResult) o;
			if (protocolVersion != null ? !protocolVersion.equals(that.protocolVersion) : that.protocolVersion != null)
				return false;
			if (capabilities != null ? !capabilities.equals(that.capabilities) : that.capabilities != null)
				return false;
			if (serverInfo != null ? !serverInfo.equals(that.serverInfo) : that.serverInfo != null)
				return false;
			return instructions != null ? instructions.equals(that.instructions) : that.instructions == null;
		}

		// 哈希计算
		@Override
		public int hashCode() {
			int result = protocolVersion != null ? protocolVersion.hashCode() : 0;
			result = 31 * result + (capabilities != null ? capabilities.hashCode() : 0);
			result = 31 * result + (serverInfo != null ? serverInfo.hashCode() : 0);
			result = 31 * result + (instructions != null ? instructions.hashCode() : 0);
			return result;
		}

		// 字符串表示
		@Override
		public String toString() {
			return "InitializeResult{" + "protocolVersion='" + protocolVersion + '\'' + ", capabilities=" + capabilities + ", serverInfo=" + serverInfo + ", instructions='" + instructions + '\'' + '}';
		}
	}

	/**
	 * Clients can implement additional features to enrich connected MCP servers
	 * with additional capabilities. These capabilities can be used to extend
	 * the functionality of the server, or to provide additional information to
	 * the server about the client's capabilities.
	 *
	 * @param experimental
	 *            WIP
	 * @param roots
	 *            define the boundaries of where servers can operate within the
	 *            filesystem, allowing them to understand which directories and
	 *            files they have access to.
	 * @param sampling
	 *            Provides a standardized way for servers to request LLM
	 *            sampling (“completions” or “generations”) from language models
	 *            via clients.
	 *
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
	// @Data
	// @AllArgsConstructor
	// @NoArgsConstructor
	// public static class ClientCapabilities {
	// @JsonProperty("experimental") Map<String, Object> experimental;
	// @JsonProperty("roots") RootCapabilities roots;
	// @JsonProperty("sampling") Sampling sampling;
	//
	// /**
	// * Roots define the boundaries of where servers can operate within the
	// filesystem,
	// * allowing them to understand which directories and files they have
	// access to.
	// * Servers can request the list of roots from supporting clients and
	// * receive notifications when that list changes.
	// *
	// * @param listChanged Whether the client would send notification about
	// roots
	// * has changed since the last time the server checked.
	// */
	// @JsonInclude(JsonInclude.Include.NON_ABSENT)
	// @JsonIgnoreProperties(ignoreUnknown = true)
	// @Data
	// @AllArgsConstructor
	// @NoArgsConstructor
	// public static class RootCapabilities {
	// @JsonProperty("listChanged") Boolean listChanged;
	// }
	//
	// /**
	// * Provides a standardized way for servers to request LLM
	// * sampling ("completions" or "generations") from language
	// * models via clients. This flow allows clients to maintain
	// * control over model access, selection, and permissions
	// * while enabling servers to leverage AI capabilities—with
	// * no server API keys necessary. Servers can request text or
	// * image-based interactions and optionally include context
	// * from MCP servers in their prompts.
	// */
	// @JsonInclude(JsonInclude.Include.NON_ABSENT)
	// @Data
	// @AllArgsConstructor
	// public static class Sampling {
	// }
	//
	// public static Builder builder() {
	// return new Builder();
	// }
	//
	// public static class Builder {
	// private Map<String, Object> experimental;
	// private RootCapabilities roots;
	// private Sampling sampling;
	//
	// public Builder experimental(Map<String, Object> experimental) {
	// this.experimental = experimental;
	// return this;
	// }
	//
	// public Builder roots(Boolean listChanged) {
	// this.roots = new RootCapabilities(listChanged);
	// return this;
	// }
	//
	// public Builder sampling() {
	// this.sampling = new Sampling();
	// return this;
	// }
	//
	// public ClientCapabilities build() {
	// return new ClientCapabilities(experimental, roots, sampling);
	// }
	// }
	// }// @formatter:on
	public static class ClientCapabilities {
		@JsonProperty("experimental")
		private Map<String, Object> experimental;

		@JsonProperty("roots")
		private RootCapabilities roots;

		@JsonProperty("sampling")
		private Sampling sampling;

		// 无参构造函数
		public ClientCapabilities() {
		}

		// 全参构造函数
		public ClientCapabilities(Map<String, Object> experimental, RootCapabilities roots, Sampling sampling) {
			this.experimental = experimental;
			this.roots = roots;
			this.sampling = sampling;
		}

		// JSON-RPC 协议字段的 Getter/Setter
		public Map<String, Object> getExperimental() {
			return experimental;
		}

		public void setExperimental(Map<String, Object> experimental) {
			this.experimental = experimental;
		}

		public RootCapabilities getRoots() {
			return roots;
		}

		public void setRoots(RootCapabilities roots) {
			this.roots = roots;
		}

		public Sampling getSampling() {
			return sampling;
		}

		public void setSampling(Sampling sampling) {
			this.sampling = sampling;
		}

		// 对象比较
		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;

			ClientCapabilities that = (ClientCapabilities) o;
			if (experimental != null ? !experimental.equals(that.experimental) : that.experimental != null)
				return false;
			if (roots != null ? !roots.equals(that.roots) : that.roots != null)
				return false;
			return sampling != null ? sampling.equals(that.sampling) : that.sampling == null;
		}

		// 哈希计算
		@Override
		public int hashCode() {
			int result = experimental != null ? experimental.hashCode() : 0;
			result = 31 * result + (roots != null ? roots.hashCode() : 0);
			result = 31 * result + (sampling != null ? sampling.hashCode() : 0);
			return result;
		}

		// 字符串表示
		@Override
		public String toString() {
			return "ClientCapabilities{" + "experimental=" + experimental + ", roots=" + roots + ", sampling=" + sampling + '}';
		}

		public static class RootCapabilities {

			@JsonProperty("listChanged")
			private Boolean listChanged;

			// 无参构造函数
			public RootCapabilities() {
			}

			// 全参构造函数
			public RootCapabilities(Boolean listChanged) {
				this.listChanged = listChanged;
			}

			// Getter/Setter 方法
			public Boolean getListChanged() {
				return listChanged;
			}

			public void setListChanged(Boolean listChanged) {
				this.listChanged = listChanged;
			}

			// 对象比较
			@Override
			public boolean equals(Object o) {
				if (this == o)
					return true;
				if (o == null || getClass() != o.getClass())
					return false;

				RootCapabilities that = (RootCapabilities) o;
				return listChanged != null ? listChanged.equals(that.listChanged) : that.listChanged == null;
			}

			// 哈希计算
			@Override
			public int hashCode() {
				return listChanged != null ? listChanged.hashCode() : 0;
			}

			// 字符串表示
			@Override
			public String toString() {
				return "RootCapabilities{" + "listChanged=" + listChanged + '}';
			}
		}

		public static class Sampling {
//			@JsonProperty("type")
//			private String type;

			// 无参构造函数
			public Sampling() {
			}

//			// 全参构造函数
//			public Sampling(String type) {
//				this.type = type;
//			}
//
//			// Getter/Setter 方法
//			public String getType() {
//				return type;
//			}
//
//			public void setType(String type) {
//				this.type = type;
//			}
//
//			// 对象比较
//			@Override
//			public boolean equals(Object o) {
//				if (this == o)
//					return true;
//				if (o == null || getClass() != o.getClass())
//					return false;
//
//				Sampling that = (Sampling) o;
//				return type != null ? type.equals(that.type) : that.type == null;
//			}
//
//			// 哈希计算
//			@Override
//			public int hashCode() {
//				return type != null ? type.hashCode() : 0;
//			}
//
//			// 字符串表示
//			@Override
//			public String toString() {
//				return "Sampling{" + "type='" + type + '\'' + '}';
//			}
		}

		public static Builder builder() {
			return new Builder();
		}

		public static class Builder {
			private Map<String, Object> experimental;
			private RootCapabilities roots;
			private Sampling sampling;

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

			public ClientCapabilities build() {
				return new ClientCapabilities(experimental, roots, sampling);
			}
		}
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ServerCapabilities {
//		@JsonProperty("experimental")
//		Map<String, Object> experimental;
//		@JsonProperty("logging")
//		LoggingCapabilities logging;
//		@JsonProperty("prompts")
//		PromptCapabilities prompts;
//		@JsonProperty("resources")
//		ResourceCapabilities resources;
//		@JsonProperty("tools")
//		ToolCapabilities tools;
//
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		public static class LoggingCapabilities {
//		}
//
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		@Data
//		@AllArgsConstructor
//		@NoArgsConstructor
//		public static class PromptCapabilities {
//			@JsonProperty("listChanged")
//			Boolean listChanged;
//		}
//
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		@Data
//		@AllArgsConstructor
//		@NoArgsConstructor
//		public static class ResourceCapabilities {
//			@JsonProperty("subscribe")
//			Boolean subscribe;
//			@JsonProperty("listChanged")
//			Boolean listChanged;
//		}
//
//		@JsonInclude(JsonInclude.Include.NON_ABSENT)
//		@Data
//		@AllArgsConstructor
//		@NoArgsConstructor
//		public static class ToolCapabilities {
//			@JsonProperty("listChanged")
//			Boolean listChanged;
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//
//			private Map<String, Object> experimental;
//			private LoggingCapabilities logging = new LoggingCapabilities();
//			private PromptCapabilities prompts;
//			private ResourceCapabilities resources;
//			private ToolCapabilities tools;
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
//				return new ServerCapabilities(experimental, logging, prompts, resources, tools);
//			}
//		}
//	} // @formatter:on
	public static class ServerCapabilities {
	    @JsonProperty("experimental")
	    private Map<String, Object> experimental;
	    
	    @JsonProperty("logging")
	    private LoggingCapabilities logging;
	    
	    @JsonProperty("prompts")
	    private PromptCapabilities prompts;
	    
	    @JsonProperty("resources")
	    private ResourceCapabilities resources;
	    
	    @JsonProperty("tools")
	    private ToolCapabilities tools;
	    
	    public ServerCapabilities() {
	    	
	    }

	    // 手动添加构造函数
	    public ServerCapabilities(Map<String, Object> experimental, LoggingCapabilities logging, 
	                             PromptCapabilities prompts, ResourceCapabilities resources, 
	                             ToolCapabilities tools) {
	        this.experimental = experimental;
	        this.logging = logging;
	        this.prompts = prompts;
	        this.resources = resources;
	        this.tools = tools;
	    }

	    // Getter/Setter方法
	    public Map<String, Object> getExperimental() { return experimental; }
	    public void setExperimental(Map<String, Object> experimental) { this.experimental = experimental; }
	    
	    public LoggingCapabilities getLogging() { return logging; }
	    public void setLogging(LoggingCapabilities logging) { this.logging = logging; }
	    
	    public PromptCapabilities getPrompts() { return prompts; }
	    public void setPrompts(PromptCapabilities prompts) { this.prompts = prompts; }
	    
	    public ResourceCapabilities getResources() { return resources; }
	    public void setResources(ResourceCapabilities resources) { this.resources = resources; }
	    
	    public ToolCapabilities getTools() { return tools; }
	    public void setTools(ToolCapabilities tools) { this.tools = tools; }

	    public static Builder builder() {
	        return new Builder();
	    }

	    public static class Builder {
	        private Map<String, Object> experimental;
	        private LoggingCapabilities logging = new LoggingCapabilities();
	        private PromptCapabilities prompts;
	        private ResourceCapabilities resources;
	        private ToolCapabilities tools;

	        public Builder experimental(Map<String, Object> experimental) {
	            this.experimental = experimental;
	            return this;
	        }

	        public Builder logging() {
	            this.logging = new LoggingCapabilities();
	            return this;
	        }

	        public Builder prompts(Boolean listChanged) {
	            this.prompts = new PromptCapabilities(listChanged);
	            return this;
	        }

	        public Builder resources(Boolean subscribe, Boolean listChanged) {
	            this.resources = new ResourceCapabilities(subscribe, listChanged);
	            return this;
	        }

	        public Builder tools(Boolean listChanged) {
	            this.tools = new ToolCapabilities(listChanged);
	            return this;
	        }

	        public ServerCapabilities build() {
	            return new ServerCapabilities(experimental, logging, prompts, resources, tools);
	        }
	    }

	    // 内部类定义
	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public static class LoggingCapabilities {
	        // 手动添加默认构造函数
	        public LoggingCapabilities() {}
	    }

	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public static class PromptCapabilities {
	        private Boolean listChanged;
	        
	        public PromptCapabilities() {
	        	
	        }

	        // 手动添加构造函数
	        public PromptCapabilities(Boolean listChanged) {
	            this.listChanged = listChanged;
	        }

	        // Getter/Setter
	        public Boolean getListChanged() { return listChanged; }
	        public void setListChanged(Boolean listChanged) { this.listChanged = listChanged; }
	    }

	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public static class ResourceCapabilities {
	        private Boolean subscribe;
	        private Boolean listChanged;
	        
	        public ResourceCapabilities() {
	        	
	        }

	        // 手动添加构造函数
	        public ResourceCapabilities(Boolean subscribe, Boolean listChanged) {
	            this.subscribe = subscribe;
	            this.listChanged = listChanged;
	        }

	        // Getter/Setter
	        public Boolean getSubscribe() { return subscribe; }
	        public void setSubscribe(Boolean subscribe) { this.subscribe = subscribe; }
	        
	        public Boolean getListChanged() { return listChanged; }
	        public void setListChanged(Boolean listChanged) { this.listChanged = listChanged; }
	    }

	    @JsonInclude(JsonInclude.Include.NON_ABSENT)
	    public static class ToolCapabilities {
	        private Boolean listChanged;

	        public ToolCapabilities() {
	        	
	        }
	        
	        // 手动添加构造函数
	        public ToolCapabilities(Boolean listChanged) {
	            this.listChanged = listChanged;
	        }

	        // Getter/Setter
	        public Boolean getListChanged() { return listChanged; }
	        public void setListChanged(Boolean listChanged) { this.listChanged = listChanged; }
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class Implementation {
//		@JsonProperty("name")
//		String name;
//		@JsonProperty("version")
//		String version;
//	} // @formatter:on
	public static class Implementation {
	    @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("version")
	    private String version;

	    // 手动添加无参构造函数
	    public Implementation() {}

	    // 手动添加全参构造函数
	    public Implementation(String name, String version) {
	        this.name = name;
	        this.version = version;
	    }

	    // Getter/Setter方法
	    public String getName() { 
	        return name; 
	    }
	    
	    public void setName(String name) { 
	        this.name = name; 
	    }
	    
	    public String getVersion() { 
	        return version; 
	    }
	    
	    public void setVersion(String version) { 
	        this.version = version; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "Implementation{" +
	                "name='" + name + '\'' +
	                ", version='" + version + '\'' +
	                '}';
	    }
	}

	// Existing Enums and Base Types (from previous implementation)
	public enum Role {// @formatter:off

		@JsonProperty("user")
		USER, @JsonProperty("assistant")
		ASSISTANT
	}// @formatter:on

	// ---------------------------
	// Resource Interfaces
	// ---------------------------
	/**
	 * Base for objects that include optional annotations for the client. The
	 * client can use annotations to inform how objects are used or displayed
	 */
	public interface Annotated {

		Annotations getAnnotations();

	}

	/**
	 * Optional annotations for the client. The client can use annotations to
	 * inform how objects are used or displayed.
	 *
	 * @param audience
	 *            Describes who the intended customer of this object or data is.
	 *            It can include multiple entries to indicate content useful for
	 *            multiple audiences (e.g., `["user", "assistant"]`).
	 * @param priority
	 *            Describes how important this data is for operating the server.
	 *            A value of 1 means "most important," and indicates that the
	 *            data is effectively required, while 0 means "least important,"
	 *            and indicates that the data is entirely optional. It is a
	 *            number between 0 and 1.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class Annotations {
//		@JsonProperty("audience")
//		List<Role> audience;
//		@JsonProperty("priority")
//		Double priority;
//	} // @formatter:on
	public static class Annotations {
	    @JsonProperty("audience")
	    private List<Role> audience;
	    
	    @JsonProperty("priority")
	    private Double priority;

	    // 手动添加无参构造函数
	    public Annotations() {}

	    // 手动添加全参构造函数
	    public Annotations(List<Role> audience, Double priority) {
	        this.audience = audience;
	        this.priority = priority;
	    }

	    // Getter/Setter方法
	    public List<Role> getAudience() { 
	        return audience; 
	    }
	    
	    public void setAudience(List<Role> audience) { 
	        this.audience = audience; 
	    }
	    
	    public Double getPriority() { 
	        return priority; 
	    }
	    
	    public void setPriority(Double priority) { 
	        this.priority = priority; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "Annotations{" +
	                "audience=" + audience +
	                ", priority=" + priority +
	                '}';
	    }
	}

	/**
	 * A known resource that the server is capable of reading.
	 *
	 * @param uri
	 *            the URI of the resource.
	 * @param name
	 *            A human-readable name for this resource. This can be used by
	 *            clients to populate UI elements.
	 * @param description
	 *            A description of what this resource represents. This can be
	 *            used by clients to improve the LLM's understanding of
	 *            available resources. It can be thought of like a "hint" to the
	 *            model.
	 * @param mimeType
	 *            The MIME type of this resource, if known.
	 * @param annotations
	 *            Optional annotations for the client. The client can use
	 *            annotations to inform how objects are used or displayed.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class Resource implements Annotated {
//		@JsonProperty("uri")
//		String uri;
//		@JsonProperty("name")
//		String name;
//		@JsonProperty("description")
//		String description;
//		@JsonProperty("mimeType")
//		String mimeType;
//		@JsonProperty("annotations")
//		Annotations annotations;
//	} // @formatter:on
	public static class Resource implements Annotated {
	    @JsonProperty("uri")
	    private String uri;
	    
	    @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("description")
	    private String description;
	    
	    @JsonProperty("mimeType")
	    private String mimeType;
	    
	    @JsonProperty("annotations")
	    private Annotations annotations;

	    // 手动添加无参构造函数
	    public Resource() {}

	    // 手动添加全参构造函数
	    public Resource(String uri, String name, String description, String mimeType, Annotations annotations) {
	        this.uri = uri;
	        this.name = name;
	        this.description = description;
	        this.mimeType = mimeType;
	        this.annotations = annotations;
	    }

	    // Getter/Setter方法
	    public String getUri() { 
	        return uri; 
	    }
	    
	    public void setUri(String uri) { 
	        this.uri = uri; 
	    }
	    
	    public String getName() { 
	        return name; 
	    }
	    
	    public void setName(String name) { 
	        this.name = name; 
	    }
	    
	    public String getDescription() { 
	        return description; 
	    }
	    
	    public void setDescription(String description) { 
	        this.description = description; 
	    }
	    
	    public String getMimeType() { 
	        return mimeType; 
	    }
	    
	    public void setMimeType(String mimeType) { 
	        this.mimeType = mimeType; 
	    }
	    
	    public Annotations getAnnotations() { 
	        return annotations; 
	    }
	    
	    public void setAnnotations(Annotations annotations) { 
	        this.annotations = annotations; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "Resource{" +
	                "uri='" + uri + '\'' +
	                ", name='" + name + '\'' +
	                ", description='" + description + '\'' +
	                ", mimeType='" + mimeType + '\'' +
	                ", annotations=" + annotations +
	                '}';
	    }
	}

	/**
	 * Resource templates allow servers to expose parameterized resources using
	 * URI templates.
	 *
	 * @param uriTemplate
	 *            A URI template that can be used to generate URIs for this
	 *            resource.
	 * @param name
	 *            A human-readable name for this resource. This can be used by
	 *            clients to populate UI elements.
	 * @param description
	 *            A description of what this resource represents. This can be
	 *            used by clients to improve the LLM's understanding of
	 *            available resources. It can be thought of like a "hint" to the
	 *            model.
	 * @param mimeType
	 *            The MIME type of this resource, if known.
	 * @param annotations
	 *            Optional annotations for the client. The client can use
	 *            annotations to inform how objects are used or displayed.
	 * @see <a href="https://datatracker.ietf.org/doc/html/rfc6570">RFC 6570</a>
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ResourceTemplate implements Annotated {
//		@JsonProperty("uriTemplate")
//		String uriTemplate;
//		@JsonProperty("name")
//		String name;
//		@JsonProperty("description")
//		String description;
//		@JsonProperty("mimeType")
//		String mimeType;
//		@JsonProperty("annotations")
//		Annotations annotations;
//	} // @formatter:on
	public static class ResourceTemplate implements Annotated {
	    @JsonProperty("uriTemplate")
	    private String uriTemplate;
	    
	    @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("description")
	    private String description;
	    
	    @JsonProperty("mimeType")
	    private String mimeType;
	    
	    @JsonProperty("annotations")
	    private Annotations annotations;

	    // 手动添加无参构造函数
	    public ResourceTemplate() {}

	    // 手动添加全参构造函数
	    public ResourceTemplate(String uriTemplate, String name, String description, 
	                           String mimeType, Annotations annotations) {
	        this.uriTemplate = uriTemplate;
	        this.name = name;
	        this.description = description;
	        this.mimeType = mimeType;
	        this.annotations = annotations;
	    }

	    // Getter/Setter方法
	    public String getUriTemplate() { 
	        return uriTemplate; 
	    }
	    
	    public void setUriTemplate(String uriTemplate) { 
	        this.uriTemplate = uriTemplate; 
	    }
	    
	    public String getName() { 
	        return name; 
	    }
	    
	    public void setName(String name) { 
	        this.name = name; 
	    }
	    
	    public String getDescription() { 
	        return description; 
	    }
	    
	    public void setDescription(String description) { 
	        this.description = description; 
	    }
	    
	    public String getMimeType() { 
	        return mimeType; 
	    }
	    
	    public void setMimeType(String mimeType) { 
	        this.mimeType = mimeType; 
	    }
	    
	    public Annotations getAnnotations() { 
	        return annotations; 
	    }
	    
	    public void setAnnotations(Annotations annotations) { 
	        this.annotations = annotations; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "ResourceTemplate{" +
	                "uriTemplate='" + uriTemplate + '\'' +
	                ", name='" + name + '\'' +
	                ", description='" + description + '\'' +
	                ", mimeType='" + mimeType + '\'' +
	                ", annotations=" + annotations +
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ListResourcesResult {
//		@JsonProperty("resources")
//		List<Resource> resources;
//		@JsonProperty("nextCursor")
//		String nextCursor;
//	} // @formatter:on
	public static class ListResourcesResult {
	    @JsonProperty("resources")
	    private List<Resource> resources;
	    
	    @JsonProperty("nextCursor")
	    private String nextCursor;

	    // 手动添加无参构造函数
	    public ListResourcesResult() {}

	    // 手动添加全参构造函数
	    public ListResourcesResult(List<Resource> resources, String nextCursor) {
	        this.resources = resources;
	        this.nextCursor = nextCursor;
	    }

	    // Getter/Setter方法
	    public List<Resource> getResources() { 
	        return resources; 
	    }
	    
	    public void setResources(List<Resource> resources) { 
	        this.resources = resources; 
	    }
	    
	    public String getNextCursor() { 
	        return nextCursor; 
	    }
	    
	    public void setNextCursor(String nextCursor) { 
	        this.nextCursor = nextCursor; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "ListResourcesResult{" +
	                "resources=" + resources +
	                ", nextCursor='" + nextCursor + '\'' +
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ListResourceTemplatesResult {
//		@JsonProperty("resourceTemplates")
//		List<ResourceTemplate> resourceTemplates;
//		@JsonProperty("nextCursor")
//		String nextCursor;
//	} // @formatter:on
	public static class ListResourceTemplatesResult {
	    @JsonProperty("resourceTemplates")
	    private List<ResourceTemplate> resourceTemplates;
	    
	    @JsonProperty("nextCursor")
	    private String nextCursor;

	    // 手动添加无参构造函数
	    public ListResourceTemplatesResult() {}

	    // 手动添加全参构造函数
	    public ListResourceTemplatesResult(List<ResourceTemplate> resourceTemplates, String nextCursor) {
	        this.resourceTemplates = resourceTemplates;
	        this.nextCursor = nextCursor;
	    }

	    // Getter/Setter方法
	    public List<ResourceTemplate> getResourceTemplates() { 
	        return resourceTemplates; 
	    }
	    
	    public void setResourceTemplates(List<ResourceTemplate> resourceTemplates) { 
	        this.resourceTemplates = resourceTemplates; 
	    }
	    
	    public String getNextCursor() { 
	        return nextCursor; 
	    }
	    
	    public void setNextCursor(String nextCursor) { 
	        this.nextCursor = nextCursor; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "ListResourceTemplatesResult{" +
	                "resourceTemplates=" + resourceTemplates +
	                ", nextCursor='" + nextCursor + '\'' +
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ReadResourceRequest {
//		@JsonProperty("uri")
//		String uri;
//	} // @formatter:on
	public static class ReadResourceRequest {
	    @JsonProperty("uri")
	    private String uri;

	    // 手动添加无参构造函数
	    public ReadResourceRequest() {}

	    // 手动添加全参构造函数
	    public ReadResourceRequest(String uri) {
	        this.uri = uri;
	    }

	    // Getter/Setter方法
	    public String getUri() { 
	        return uri; 
	    }
	    
	    public void setUri(String uri) { 
	        this.uri = uri; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "ReadResourceRequest{" +
	                "uri='" + uri + '\'' +
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ReadResourceResult {
//		@JsonProperty("contents")
//		List<ResourceContents> contents;
//	} // @formatter:on
	public static class ReadResourceResult {
	    @JsonProperty("contents")
	    private List<ResourceContents> contents;

	    // 手动添加无参构造函数
	    public ReadResourceResult() {}

	    // 手动添加全参构造函数
	    public ReadResourceResult(List<ResourceContents> contents) {
	        this.contents = contents;
	    }

	    // Getter/Setter方法
	    public List<ResourceContents> getContents() { 
	        return contents; 
	    }
	    
	    public void setContents(List<ResourceContents> contents) { 
	        this.contents = contents; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "ReadResourceResult{" +
	                "contents=" + contents +
	                '}';
	    }
	}

	/**
	 * Sent from the client to request resources/updated notifications from the
	 * server whenever a particular resource changes.
	 *
	 * @param uri
	 *            the URI of the resource to subscribe to. The URI can use any
	 *            protocol; it is up to the server how to interpret it.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class SubscribeRequest {
//		@JsonProperty("uri")
//		String uri;
//	} // @formatter:on
	public static class SubscribeRequest {
	    @JsonProperty("uri")
	    private String uri;

	    // 手动添加无参构造函数
	    public SubscribeRequest() {}

	    // 手动添加全参构造函数
	    public SubscribeRequest(String uri) {
	        this.uri = uri;
	    }

	    // Getter/Setter方法
	    public String getUri() { 
	        return uri; 
	    }
	    
	    public void setUri(String uri) { 
	        this.uri = uri; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "SubscribeRequest{" +
	                "uri='" + uri + '\'' +
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class UnsubscribeRequest {
//		@JsonProperty("uri")
//		String uri;
//	} // @formatter:on
	public static class UnsubscribeRequest {
	    @JsonProperty("uri")
	    private String uri;

	    // 手动添加无参构造函数
	    public UnsubscribeRequest() {}

	    // 手动添加全参构造函数
	    public UnsubscribeRequest(String uri) {
	        this.uri = uri;
	    }

	    // Getter方法
	    public String getUri() {
	        return uri;
	    }

	    // Setter方法
	    public void setUri(String uri) {
	        this.uri = uri;
	    }

	    @Override
	    public String toString() {
	        return "UnsubscribeRequest{" +
	                "uri='" + uri + '\'' +
	                '}';
	    }
	}

	/**
	 * The contents of a specific resource or sub-resource.
	 */
	@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, include = As.PROPERTY)
	@JsonSubTypes({ @JsonSubTypes.Type(value = TextResourceContents.class, name = "text"), @JsonSubTypes.Type(value = BlobResourceContents.class, name = "blob") })
	public interface ResourceContents {

		/**
		 * The URI of this resource.
		 * 
		 * @return the URI of this resource.
		 */
		String getUri();

		/**
		 * The MIME type of this resource.
		 * 
		 * @return the MIME type of this resource.
		 */
		String getMimeType();

	}

	/**
	 * Text contents of a resource.
	 *
	 * @param uri
	 *            the URI of this resource.
	 * @param mimeType
	 *            the MIME type of this resource.
	 * @param text
	 *            the text of the resource. This must only be set if the
	 *            resource can actually be represented as text (not binary
	 *            data).
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class TextResourceContents implements ResourceContents {
//		@JsonProperty("uri")
//		String uri;
//		@JsonProperty("mimeType")
//		String mimeType;
//		@JsonProperty("text")
//		String text;
//	} // @formatter:on
	public static class TextResourceContents implements ResourceContents {
	    @JsonProperty("uri")
	    private String uri;
	    
	    @JsonProperty("mimeType")
	    private String mimeType;
	    
	    @JsonProperty("text")
	    private String text;

	    // 手动添加无参构造函数
	    public TextResourceContents() {}

	    // 手动添加全参构造函数
	    public TextResourceContents(String uri, String mimeType, String text) {
	        this.uri = uri;
	        this.mimeType = mimeType;
	        this.text = text;
	    }

	    // Getter/Setter方法
	    public String getUri() { 
	        return uri; 
	    }
	    
	    public void setUri(String uri) { 
	        this.uri = uri; 
	    }
	    
	    public String getMimeType() { 
	        return mimeType; 
	    }
	    
	    public void setMimeType(String mimeType) { 
	        this.mimeType = mimeType; 
	    }
	    
	    public String getText() { 
	        return text; 
	    }
	    
	    public void setText(String text) { 
	        this.text = text; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "TextResourceContents{" +
	                "uri='" + uri + '\'' +
	                ", mimeType='" + mimeType + '\'' +
	                ", text='" + text + '\'' +
	                '}';
	    }
	}

	/**
	 * Binary contents of a resource.
	 *
	 * @param uri
	 *            the URI of this resource.
	 * @param mimeType
	 *            the MIME type of this resource.
	 * @param blob
	 *            a base64-encoded string representing the binary data of the
	 *            resource. This must only be set if the resource can actually
	 *            be represented as binary data (not text).
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class BlobResourceContents implements ResourceContents {
//		@JsonProperty("uri")
//		String uri;
//		@JsonProperty("mimeType")
//		String mimeType;
//		@JsonProperty("blob")
//		String blob;
//	} // @formatter:on
	public static class BlobResourceContents implements ResourceContents {
	    @JsonProperty("uri")
	    private String uri;
	    
	    @JsonProperty("mimeType")
	    private String mimeType;
	    
	    @JsonProperty("blob")
	    private String blob;

	    // 手动添加无参构造函数
	    public BlobResourceContents() {}

	    // 手动添加全参构造函数
	    public BlobResourceContents(String uri, String mimeType, String blob) {
	        this.uri = uri;
	        this.mimeType = mimeType;
	        this.blob = blob;
	    }

	    // Getter/Setter方法
	    public String getUri() { 
	        return uri; 
	    }
	    
	    public void setUri(String uri) { 
	        this.uri = uri; 
	    }
	    
	    public String getMimeType() { 
	        return mimeType; 
	    }
	    
	    public void setMimeType(String mimeType) { 
	        this.mimeType = mimeType; 
	    }
	    
	    public String getBlob() { 
	        return blob; 
	    }
	    
	    public void setBlob(String blob) { 
	        this.blob = blob; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "BlobResourceContents{" +
	                "uri='" + uri + '\'' +
	                ", mimeType='" + mimeType + '\'' +
	                ", blob='" + blob + '\'' +
	                '}';
	    }
	}

	// ---------------------------
	// Prompt Interfaces
	// ---------------------------
	/**
	 * A prompt or prompt template that the server offers.
	 *
	 * @param name
	 *            The name of the prompt or prompt template.
	 * @param description
	 *            An optional description of what this prompt provides.
	 * @param arguments
	 *            A list of arguments to use for templating the prompt.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class Prompt {
//		@JsonProperty("name")
//		String name;
//		@JsonProperty("description")
//		String description;
//		@JsonProperty("arguments")
//		List<PromptArgument> arguments;
//	} // @formatter:on
	public static class Prompt {
	    @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("description")
	    private String description;
	    
	    @JsonProperty("arguments")
	    private List<PromptArgument> arguments;

	    // 手动添加无参构造函数
	    public Prompt() {}

	    // 手动添加全参构造函数
	    public Prompt(String name, String description, List<PromptArgument> arguments) {
	        this.name = name;
	        this.description = description;
	        this.arguments = arguments;
	    }

	    // Getter/Setter方法
	    public String getName() { 
	        return name; 
	    }
	    
	    public void setName(String name) { 
	        this.name = name; 
	    }
	    
	    public String getDescription() { 
	        return description; 
	    }
	    
	    public void setDescription(String description) { 
	        this.description = description; 
	    }
	    
	    public List<PromptArgument> getArguments() { 
	        return arguments; 
	    }
	    
	    public void setArguments(List<PromptArgument> arguments) { 
	        this.arguments = arguments; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "Prompt{" +
	                "name='" + name + '\'' +
	                ", description='" + description + '\'' +
	                ", arguments=" + arguments +
	                '}';
	    }
	}

	/**
	 * Describes an argument that a prompt can accept.
	 *
	 * @param name
	 *            The name of the argument.
	 * @param description
	 *            A human-readable description of the argument.
	 * @param required
	 *            Whether this argument must be provided.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class PromptArgument {
//		@JsonProperty("name")
//		String name;
//		@JsonProperty("description")
//		String description;
//		@JsonProperty("required")
//		Boolean required;
//	}// @formatter:on
	public static class PromptArgument {
	    @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("description")
	    private String description;
	    
	    @JsonProperty("required")
	    private Boolean required;

	    // 手动添加无参构造函数
	    public PromptArgument() {}

	    // 手动添加全参构造函数
	    public PromptArgument(String name, String description, Boolean required) {
	        this.name = name;
	        this.description = description;
	        this.required = required;
	    }

	    // Getter/Setter方法
	    public String getName() { 
	        return name; 
	    }
	    
	    public void setName(String name) { 
	        this.name = name; 
	    }
	    
	    public String getDescription() { 
	        return description; 
	    }
	    
	    public void setDescription(String description) { 
	        this.description = description; 
	    }
	    
	    public Boolean getRequired() { 
	        return required; 
	    }
	    
	    public void setRequired(Boolean required) { 
	        this.required = required; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "PromptArgument{" +
	                "name='" + name + '\'' +
	                ", description='" + description + '\'' +
	                ", required=" + required +
	                '}';
	    }
	}

	/**
	 * Describes a message returned as part of a prompt.
	 *
	 * This is similar to `SamplingMessage`, but also supports the embedding of
	 * resources from the MCP server.
	 *
	 * @param role
	 *            The sender or recipient of messages and data in a
	 *            conversation.
	 * @param content
	 *            The content of the message of type {@link Content}.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class PromptMessage {
//		@JsonProperty("role")
//		Role role;
//		@JsonProperty("content")
//		Content content;
//	} // @formatter:on
	public static class PromptMessage {
	    @JsonProperty("role")
	    private Role role;
	    
	    @JsonProperty("content")
	    private Content content;

	    // 手动添加无参构造函数
	    public PromptMessage() {}

	    // 手动添加全参构造函数
	    public PromptMessage(Role role, Content content) {
	        this.role = role;
	        this.content = content;
	    }

	    // Getter/Setter方法
	    public Role getRole() { 
	        return role; 
	    }
	    
	    public void setRole(Role role) { 
	        this.role = role; 
	    }
	    
	    public Content getContent() { 
	        return content; 
	    }
	    
	    public void setContent(Content content) { 
	        this.content = content; 
	    }

	    // 可选：手动添加toString方法
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
	 * @param prompts
	 *            A list of prompts that the server provides.
	 * @param nextCursor
	 *            An optional cursor for pagination. If present, indicates there
	 *            are more prompts available.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ListPromptsResult {
//		@JsonProperty("prompts")
//		List<Prompt> prompts;
//		@JsonProperty("nextCursor")
//		String nextCursor;
//	}// @formatter:on
	public static class ListPromptsResult {
	    @JsonProperty("prompts")
	    private List<Prompt> prompts;
	    
	    @JsonProperty("nextCursor")
	    private String nextCursor;

	    // 手动添加无参构造函数
	    public ListPromptsResult() {}

	    // 手动添加全参构造函数
	    public ListPromptsResult(List<Prompt> prompts, String nextCursor) {
	        this.prompts = prompts;
	        this.nextCursor = nextCursor;
	    }

	    // Getter/Setter方法
	    public List<Prompt> getPrompts() { 
	        return prompts; 
	    }
	    
	    public void setPrompts(List<Prompt> prompts) { 
	        this.prompts = prompts; 
	    }
	    
	    public String getNextCursor() { 
	        return nextCursor; 
	    }
	    
	    public void setNextCursor(String nextCursor) { 
	        this.nextCursor = nextCursor; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "ListPromptsResult{" +
	                "prompts=" + prompts +
	                ", nextCursor='" + nextCursor + '\'' +
	                '}';
	    }
	}

	/**
	 * Used by the client to get a prompt provided by the server.
	 *
	 * @param name
	 *            The name of the prompt or prompt template.
	 * @param arguments
	 *            Arguments to use for templating the prompt.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class GetPromptRequest implements Request {
//		@JsonProperty("name")
//		String name;
//		@JsonProperty("arguments")
//		Map<String, Object> arguments;
//	}// @formatter:off
	public static class GetPromptRequest implements Request {
	    @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("arguments")
	    private Map<String, Object> arguments;

	    // 手动添加无参构造函数
	    public GetPromptRequest() {}

	    // 手动添加全参构造函数
	    public GetPromptRequest(String name, Map<String, Object> arguments) {
	        this.name = name;
	        this.arguments = arguments;
	    }

	    // Getter/Setter方法
	    public String getName() { 
	        return name; 
	    }
	    
	    public void setName(String name) { 
	        this.name = name; 
	    }
	    
	    public Map<String, Object> getArguments() { 
	        return arguments; 
	    }
	    
	    public void setArguments(Map<String, Object> arguments) { 
	        this.arguments = arguments; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "GetPromptRequest{" +
	                "name='" + name + '\'' +
	                ", arguments=" + arguments +
	                '}';
	    }
	}

	/**
	 * The server's response to a prompts/get request from the client.
	 *
	 * @param description
	 *            An optional description for the prompt.
	 * @param messages
	 *            A list of messages to display as part of the prompt.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class GetPromptResult {
//		@JsonProperty("description")
//		String description;
//		@JsonProperty("messages")
//		List<PromptMessage> messages;
//	} // @formatter:on
	public static class GetPromptResult {
	    @JsonProperty("description")
	    private String description;
	    
	    @JsonProperty("messages")
	    private List<PromptMessage> messages;

	    // 手动添加无参构造函数
	    public GetPromptResult() {}

	    // 手动添加全参构造函数
	    public GetPromptResult(String description, List<PromptMessage> messages) {
	        this.description = description;
	        this.messages = messages;
	    }

	    // Getter/Setter方法
	    public String getDescription() { 
	        return description; 
	    }
	    
	    public void setDescription(String description) { 
	        this.description = description; 
	    }
	    
	    public List<PromptMessage> getMessages() { 
	        return messages; 
	    }
	    
	    public void setMessages(List<PromptMessage> messages) { 
	        this.messages = messages; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "GetPromptResult{" +
	                "description='" + description + '\'' +
	                ", messages=" + messages +
	                '}';
	    }
	}

	// ---------------------------
	// Tool Interfaces
	// ---------------------------
	/**
	 * The server's response to a tools/list request from the client.
	 *
	 * @param tools
	 *            A list of tools that the server provides.
	 * @param nextCursor
	 *            An optional cursor for pagination. If present, indicates there
	 *            are more tools available.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ListToolsResult {
//		@JsonProperty("tools")
//		List<Tool> tools;
//		@JsonProperty("nextCursor")
//		String nextCursor;
//	}// @formatter:on
	public static class ListToolsResult {
	    @JsonProperty("tools")
	    private List<Tool> tools;
	    
	    @JsonProperty("nextCursor")
	    private String nextCursor;

	    // 手动添加无参构造函数
	    public ListToolsResult() {}

	    // 手动添加全参构造函数
	    public ListToolsResult(List<Tool> tools, String nextCursor) {
	        this.tools = tools;
	        this.nextCursor = nextCursor;
	    }

	    // Getter/Setter方法
	    public List<Tool> getTools() { 
	        return tools; 
	    }
	    
	    public void setTools(List<Tool> tools) { 
	        this.tools = tools; 
	    }
	    
	    public String getNextCursor() { 
	        return nextCursor; 
	    }
	    
	    public void setNextCursor(String nextCursor) { 
	        this.nextCursor = nextCursor; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "ListToolsResult{" +
	                "tools=" + tools +
	                ", nextCursor='" + nextCursor + '\'' +
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class JsonSchema {
//		@JsonProperty("type")
//		String type;
//		@JsonProperty("properties")
//		Map<String, Object> properties;
//		@JsonProperty("required")
//		List<String> required;
//		@JsonProperty("additionalProperties")
//		Boolean additionalProperties;
//	} // @formatter:on
	public static class JsonSchema {
	    @JsonProperty("type")
	    private String type;
	    
	    @JsonProperty("properties")
	    private Map<String, Object> properties;
	    
	    @JsonProperty("required")
	    private List<String> required;
	    
	    @JsonProperty("additionalProperties")
	    private Boolean additionalProperties;

	    // 手动添加无参构造函数
	    public JsonSchema() {}

	    // 手动添加全参构造函数
	    public JsonSchema(String type, Map<String, Object> properties, List<String> required, Boolean additionalProperties) {
	        this.type = type;
	        this.properties = properties;
	        this.required = required;
	        this.additionalProperties = additionalProperties;
	    }

	    // Getter/Setter方法
	    public String getType() { 
	        return type; 
	    }
	    
	    public void setType(String type) { 
	        this.type = type; 
	    }
	    
	    public Map<String, Object> getProperties() { 
	        return properties; 
	    }
	    
	    public void setProperties(Map<String, Object> properties) { 
	        this.properties = properties; 
	    }
	    
	    public List<String> getRequired() { 
	        return required; 
	    }
	    
	    public void setRequired(List<String> required) { 
	        this.required = required; 
	    }
	    
	    public Boolean getAdditionalProperties() { 
	        return additionalProperties; 
	    }
	    
	    public void setAdditionalProperties(Boolean additionalProperties) { 
	        this.additionalProperties = additionalProperties; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "JsonSchema{" +
	                "type='" + type + '\'' +
	                ", properties=" + properties +
	                ", required=" + required +
	                ", additionalProperties=" + additionalProperties +
	                '}';
	    }
	}

	/**
	 * Represents a tool that the server provides. Tools enable servers to
	 * expose executable functionality to the system. Through these tools, you
	 * can interact with external systems, perform computations, and take
	 * actions in the real world.
	 *
	 * @param name
	 *            A unique identifier for the tool. This name is used when
	 *            calling the tool.
	 * @param description
	 *            A human-readable description of what the tool does. This can
	 *            be used by clients to improve the LLM's understanding of
	 *            available tools.
	 * @param inputSchema
	 *            A JSON Schema object that describes the expected structure of
	 *            the arguments when calling this tool. This allows clients to
	 *            validate tool arguments before sending them to the server.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class Tool {
//		@JsonProperty("name")
//		String name;
//		@JsonProperty("description")
//		String description;
//		@JsonProperty("inputSchema")
//		JsonSchema inputSchema;
//
//		public Tool(String name, String description, String schema) {
//			this(name, description, parseSchema(schema));
//		}
//
//	} // @formatter:on
//
	private static JsonSchema parseSchema(String schema) {
		try {
			return OBJECT_MAPPER.readValue(schema, JsonSchema.class);
		} catch (IOException e) {
			throw new IllegalArgumentException("Invalid schema: " + schema, e);
		}
	}
	public static class Tool {
	    @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("description")
	    private String description;
	    
	    @JsonProperty("inputSchema")
	    private JsonSchema inputSchema;

	    // 手动添加无参构造函数
	    public Tool() {}

	    // 手动添加全参构造函数
	    public Tool(String name, String description, String schema) {
	        this.name = name;
	        this.description = description;
	        this.inputSchema = parseSchema(schema); // 保留原构造函数逻辑
	    }

	    // Getter/Setter方法
	    public String getName() { 
	        return name; 
	    }
	    
	    public void setName(String name) { 
	        this.name = name; 
	    }
	    
	    public String getDescription() { 
	        return description; 
	    }
	    
	    public void setDescription(String description) { 
	        this.description = description; 
	    }
	    
	    public JsonSchema getInputSchema() { 
	        return inputSchema; 
	    }
	    
	    public void setInputSchema(JsonSchema inputSchema) { 
	        this.inputSchema = inputSchema; 
	    }

	   

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "Tool{" +
	                "name='" + name + '\'' +
	                ", description='" + description + '\'' +
	                ", inputSchema=" + inputSchema +
	                '}';
	    }
	}

	/**
	 * Used by the client to call a tool provided by the server.
	 *
	 * @param name
	 *            The name of the tool to call. This must match a tool name from
	 *            tools/list.
	 * @param arguments
	 *            Arguments to pass to the tool. These must conform to the
	 *            tool's input schema.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class CallToolRequest implements Request {
//		@JsonProperty("name")
//		String name;
//		@JsonProperty("arguments")
//		Map<String, Object> arguments;
//	}// @formatter:off
	public static class CallToolRequest implements Request {
	    @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("arguments")
	    private Map<String, Object> arguments;

	    // 手动添加无参构造函数
	    public CallToolRequest() {}

	    // 手动添加全参构造函数
	    public CallToolRequest(String name, Map<String, Object> arguments) {
	        this.name = name;
	        this.arguments = arguments;
	    }

	    // Getter/Setter方法
	    public String getName() { 
	        return name; 
	    }
	    
	    public void setName(String name) { 
	        this.name = name; 
	    }
	    
	    public Map<String, Object> getArguments() { 
	        return arguments; 
	    }
	    
	    public void setArguments(Map<String, Object> arguments) { 
	        this.arguments = arguments; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "CallToolRequest{" +
	                "name='" + name + '\'' +
	                ", arguments=" + arguments +
	                '}';
	    }
	}

	/**
	 * The server's response to a tools/call request from the client.
	 *
	 * @param content
	 *            A list of content items representing the tool's output. Each
	 *            item can be text, an image, or an embedded resource.
	 * @param isError
	 *            If true, indicates that the tool execution failed and the
	 *            content contains error information. If false or absent,
	 *            indicates successful execution.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class CallToolResult {
//		@JsonProperty("content")
//		List<Content> content;
//		@JsonProperty("isError")
//		Boolean isError;
//	} // @formatter:on
	public static class CallToolResult {
	    @JsonProperty("content")
	    private List<Content> content;
	    
	    @JsonProperty("isError")
	    private Boolean isError;

	    // 手动添加无参构造函数
	    public CallToolResult() {}

	    // 手动添加全参构造函数
	    public CallToolResult(List<Content> content, Boolean isError) {
	        this.content = content;
	        this.isError = isError;
	    }
	    
	    public CallToolResult(String strContent, Boolean isError) {
	        this(Arrays.asList(new TextContent(strContent)), isError);
	    }

	    // Getter/Setter方法
	    public List<Content> getContent() { 
	        return content; 
	    }
	    
	    public void setContent(List<Content> content) { 
	        this.content = content; 
	    }
	    
	    public Boolean getIsError() { 
	        return isError; 
	    }
	    
	    public void setIsError(Boolean isError) { 
	        this.isError = isError; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "CallToolResult{" +
	                "content=" + content +
	                ", isError=" + isError +
	                '}';
	    }
	}

	// ---------------------------
	// Sampling Interfaces
	// ---------------------------
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ModelPreferences {
//		@JsonProperty("hints")
//		List<ModelHint> hints;
//		@JsonProperty("costPriority")
//		Double costPriority;
//		@JsonProperty("speedPriority")
//		Double speedPriority;
//		@JsonProperty("intelligencePriority")
//		Double intelligencePriority;
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//			private List<ModelHint> hints;
//			private Double costPriority;
//			private Double speedPriority;
//			private Double intelligencePriority;
//
//			public Builder hints(List<ModelHint> hints) {
//				this.hints = hints;
//				return this;
//			}
//
//			public Builder addHint(String name) {
//				if (this.hints == null) {
//					this.hints = new ArrayList<>();
//				}
//				this.hints.add(new ModelHint(name));
//				return this;
//			}
//
//			public Builder costPriority(Double costPriority) {
//				this.costPriority = costPriority;
//				return this;
//			}
//
//			public Builder speedPriority(Double speedPriority) {
//				this.speedPriority = speedPriority;
//				return this;
//			}
//
//			public Builder intelligencePriority(Double intelligencePriority) {
//				this.intelligencePriority = intelligencePriority;
//				return this;
//			}
//
//			public ModelPreferences build() {
//				return new ModelPreferences(hints, costPriority, speedPriority, intelligencePriority);
//			}
//		}
//	} // @formatter:on
	public static class ModelPreferences {
	    @JsonProperty("hints")
	    private List<ModelHint> hints;
	    
	    @JsonProperty("costPriority")
	    private Double costPriority;
	    
	    @JsonProperty("speedPriority")
	    private Double speedPriority;
	    
	    @JsonProperty("intelligencePriority")
	    private Double intelligencePriority;

	    // 手动添加无参构造函数
	    public ModelPreferences() {}

	    // 手动添加全参构造函数
	    public ModelPreferences(List<ModelHint> hints, Double costPriority, Double speedPriority, Double intelligencePriority) {
	        this.hints = hints;
	        this.costPriority = costPriority;
	        this.speedPriority = speedPriority;
	        this.intelligencePriority = intelligencePriority;
	    }

	    // Getter/Setter方法
	    public List<ModelHint> getHints() { 
	        return hints; 
	    }
	    
	    public void setHints(List<ModelHint> hints) { 
	        this.hints = hints; 
	    }
	    
	    public Double getCostPriority() { 
	        return costPriority; 
	    }
	    
	    public void setCostPriority(Double costPriority) { 
	        this.costPriority = costPriority; 
	    }
	    
	    public Double getSpeedPriority() { 
	        return speedPriority; 
	    }
	    
	    public void setSpeedPriority(Double speedPriority) { 
	        this.speedPriority = speedPriority; 
	    }
	    
	    public Double getIntelligencePriority() { 
	        return intelligencePriority; 
	    }
	    
	    public void setIntelligencePriority(Double intelligencePriority) { 
	        this.intelligencePriority = intelligencePriority; 
	    }

	    // 静态内部Builder类
	    public static class Builder {
	        private List<ModelHint> hints;
	        private Double costPriority;
	        private Double speedPriority;
	        private Double intelligencePriority;

	        public Builder hints(List<ModelHint> hints) {
	            this.hints = hints;
	            return this;
	        }

	        public Builder addHint(String name) {
	            if (this.hints == null) {
	                this.hints = new ArrayList<>();
	            }
	            this.hints.add(new ModelHint(name));
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

	    // 可选：手动添加toString方法
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

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ModelHint {
//		@JsonProperty("name")
//		String name;
//
//		public static ModelHint of(String name) {
//			return new ModelHint(name);
//		}
//	}
	public static class ModelHint {
	    @JsonProperty("name")
	    private String name;

	    // 手动添加无参构造函数
	    public ModelHint() {}

	    // 手动添加全参构造函数
	    public ModelHint(String name) {
	        this.name = name;
	    }

	    // Getter/Setter方法
	    public String getName() { 
	        return name; 
	    }
	    
	    public void setName(String name) { 
	        this.name = name; 
	    }

	    // 静态工厂方法
	    public static ModelHint of(String name) {
	        return new ModelHint(name);
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "ModelHint{" +
	                "name='" + name + '\'' +
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class SamplingMessage {
//		@JsonProperty("role")
//		Role role;
//		@JsonProperty("content")
//		Content content;
//	} // @formatter:on
	public static class SamplingMessage {
	    @JsonProperty("role")
	    private Role role;
	    
	    @JsonProperty("content")
	    private Content content;

	    // 手动添加无参构造函数
	    public SamplingMessage() {}

	    // 手动添加全参构造函数
	    public SamplingMessage(Role role, Content content) {
	        this.role = role;
	        this.content = content;
	    }

	    // Getter/Setter方法
	    public Role getRole() { 
	        return role; 
	    }
	    
	    public void setRole(Role role) { 
	        this.role = role; 
	    }
	    
	    public Content getContent() { 
	        return content; 
	    }
	    
	    public void setContent(Content content) { 
	        this.content = content; 
	    }

	    // 可选：手动添加toString方法
	    @Override
	    public String toString() {
	        return "SamplingMessage{" +
	                "role=" + role +
	                ", content=" + content +
	                '}';
	    }
	}

	// Sampling and Message Creation
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class CreateMessageRequest implements Request {
//		@JsonProperty("messages")
//		List<SamplingMessage> messages;
//		@JsonProperty("modelPreferences")
//		ModelPreferences modelPreferences;
//		@JsonProperty("systemPrompt")
//		String systemPrompt;
//		@JsonProperty("includeContext")
//		ContextInclusionStrategy includeContext;
//		@JsonProperty("temperature")
//		Double temperature;
//		@JsonProperty("maxTokens")
//		int maxTokens;
//		@JsonProperty("stopSequences")
//		List<String> stopSequences;
//		@JsonProperty("metadata")
//		Map<String, Object> metadata;
//
//		public enum ContextInclusionStrategy {
//			@JsonProperty("none")
//			NONE, @JsonProperty("thisServer")
//			THIS_SERVER, @JsonProperty("allServers")
//			ALL_SERVERS
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//			private List<SamplingMessage> messages;
//			private ModelPreferences modelPreferences;
//			private String systemPrompt;
//			private ContextInclusionStrategy includeContext;
//			private Double temperature;
//			private int maxTokens;
//			private List<String> stopSequences;
//			private Map<String, Object> metadata;
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
//			public CreateMessageRequest build() {
//				return new CreateMessageRequest(messages, modelPreferences, systemPrompt, includeContext, temperature, maxTokens, stopSequences, metadata);
//			}
//		}
//	}// @formatter:on
	public static class CreateMessageRequest implements Request {
	    @JsonProperty("messages")
	    private List<SamplingMessage> messages;
	    
	    @JsonProperty("modelPreferences")
	    private ModelPreferences modelPreferences;
	    
	    @JsonProperty("systemPrompt")
	    private String systemPrompt;
	    
	    @JsonProperty("includeContext")
	    private ContextInclusionStrategy includeContext;
	    
	    @JsonProperty("temperature")
	    private Double temperature;
	    
	    @JsonProperty("maxTokens")
	    private int maxTokens;
	    
	    @JsonProperty("stopSequences")
	    private List<String> stopSequences;
	    
	    @JsonProperty("metadata")
	    private Map<String, Object> metadata;

		public enum ContextInclusionStrategy {
			@JsonProperty("none") NONE,
			@JsonProperty("thisServer") THIS_SERVER,
			@JsonProperty("allServers") ALL_SERVERS
		}
		
	    // 手动添加无参构造函数
	    public CreateMessageRequest() {}

	    // 手动添加全参构造函数
	    public CreateMessageRequest(List<SamplingMessage> messages, ModelPreferences modelPreferences, String systemPrompt, ContextInclusionStrategy includeContext, Double temperature, int maxTokens, List<String> stopSequences, Map<String, Object> metadata) {
	        this.messages = messages;
	        this.modelPreferences = modelPreferences;
	        this.systemPrompt = systemPrompt;
	        this.includeContext = includeContext;
	        this.temperature = temperature;
	        this.maxTokens = maxTokens;
	        this.stopSequences = stopSequences;
	        this.metadata = metadata;
	    }

	    // Getter/Setter方法
	    public List<SamplingMessage> getMessages() { 
	        return messages; 
	    }
	    
	    public void setMessages(List<SamplingMessage> messages) { 
	        this.messages = messages; 
	    }
	    
	    public ModelPreferences getModelPreferences() { 
	        return modelPreferences; 
	    }
	    
	    public void setModelPreferences(ModelPreferences modelPreferences) { 
	        this.modelPreferences = modelPreferences; 
	    }
	    
	    public String getSystemPrompt() { 
	        return systemPrompt; 
	    }
	    
	    public void setSystemPrompt(String systemPrompt) { 
	        this.systemPrompt = systemPrompt; 
	    }
	    
	    public ContextInclusionStrategy getIncludeContext() { 
	        return includeContext; 
	    }
	    
	    public void setIncludeContext(ContextInclusionStrategy includeContext) { 
	        this.includeContext = includeContext; 
	    }
	    
	    public Double getTemperature() { 
	        return temperature; 
	    }
	    
	    public void setTemperature(Double temperature) { 
	        this.temperature = temperature; 
	    }
	    
	    public int getMaxTokens() { 
	        return maxTokens; 
	    }
	    
	    public void setMaxTokens(int maxTokens) { 
	        this.maxTokens = maxTokens; 
	    }
	    
	    public List<String> getStopSequences() { 
	        return stopSequences; 
	    }
	    
	    public void setStopSequences(List<String> stopSequences) { 
	        this.stopSequences = stopSequences; 
	    }
	    
	    public Map<String, Object> getMetadata() { 
	        return metadata; 
	    }
	    
	    public void setMetadata(Map<String, Object> metadata) { 
	        this.metadata = metadata; 
	    }

	    // 静态内部Builder类
	    public static class Builder {
	        private List<SamplingMessage> messages;
	        private ModelPreferences modelPreferences;
	        private String systemPrompt;
	        private ContextInclusionStrategy includeContext;
	        private Double temperature;
	        private int maxTokens;
	        private List<String> stopSequences;
	        private Map<String, Object> metadata;

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

	        public CreateMessageRequest build() {
	            return new CreateMessageRequest(messages, modelPreferences, systemPrompt, includeContext, temperature, maxTokens, stopSequences, metadata);
	        }
	    }

	    // 可选：手动添加toString方法
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
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class CreateMessageResult {
//		@JsonProperty("role")
//		Role role;
//		@JsonProperty("content")
//		Content content;
//		@JsonProperty("model")
//		String model;
//		@JsonProperty("stopReason")
//		StopReason stopReason;
//
//		public enum StopReason {
//			@JsonProperty("endTurn")
//			END_TURN, @JsonProperty("stopSequence")
//			STOP_SEQUENCE, @JsonProperty("maxTokens")
//			MAX_TOKENS
//		}
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//			private Role role = Role.ASSISTANT;
//			private Content content;
//			private String model;
//			private StopReason stopReason = StopReason.END_TURN;
//
//			public Builder role(Role role) {
//				this.role = role;
//				return this;
//			}
//
//			public Builder content(Content content) {
//				this.content = content;
//				return this;
//			}
//
//			public Builder model(String model) {
//				this.model = model;
//				return this;
//			}
//
//			public Builder stopReason(StopReason stopReason) {
//				this.stopReason = stopReason;
//				return this;
//			}
//
//			public Builder message(String message) {
//				this.content = new TextContent(message);
//				return this;
//			}
//
//			public CreateMessageResult build() {
//				return new CreateMessageResult(role, content, model, stopReason);
//			}
//		}
//	}// @formatter:on
	public static class CreateMessageResult {
	    @JsonProperty("role")
	    private Role role;
	    
	    @JsonProperty("content")
	    private Content content;
	    
	    @JsonProperty("model")
	    private String model;
	    
	    @JsonProperty("stopReason")
	    private StopReason stopReason;
	    
		public enum StopReason {
		@JsonProperty("endTurn")
		END_TURN, @JsonProperty("stopSequence")
		STOP_SEQUENCE, @JsonProperty("maxTokens")
		MAX_TOKENS
	}

	    // 手动实现无参构造函数
	    public CreateMessageResult() {}

	    // 手动实现全参构造函数
	    public CreateMessageResult(Role role, Content content, String model, StopReason stopReason) {
	        this.role = role;
	        this.content = content;
	        this.model = model;
	        this.stopReason = stopReason;
	    }

	    // Getter/Setter方法
	    public Role getRole() { return role; }
	    public void setRole(Role role) { this.role = role; }
	    public Content getContent() { return content; }
	    public void setContent(Content content) { this.content = content; }
	    public String getModel() { return model; }
	    public void setModel(String model) { this.model = model; }
	    public StopReason getStopReason() { return stopReason; }
	    public void setStopReason(StopReason stopReason) { this.stopReason = stopReason; }

	    // 静态内部Builder类
	    public static class Builder {
	        private Role role = Role.ASSISTANT;  // 默认值
	        private Content content;
	        private String model;
	        private StopReason stopReason = StopReason.END_TURN;  // 默认值

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

	        public CreateMessageResult build() {
	            return new CreateMessageResult(role, content, model, stopReason);
	        }
	    }

	    @Override
	    public String toString() {
	        return "CreateMessageResult{" +
	                "role=" + role +
	                ", content=" + content +
	                ", model='" + model + '\'' +
	                ", stopReason=" + stopReason +
	                '}';
	    }
	}

	// ---------------------------
	// Pagination Interfaces
	// ---------------------------
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class PaginatedRequest {
//		@JsonProperty("cursor")
//		String cursor;
//	}
	public static class PaginatedRequest {
	    @JsonProperty("cursor")
	    private String cursor;

	    // 手动实现无参构造函数
	    public PaginatedRequest() {}

	    // 手动实现全参构造函数
	    public PaginatedRequest(String cursor) {
	        this.cursor = cursor;
	    }

	    // Getter/Setter方法
	    public String getCursor() { return cursor; }
	    public void setCursor(String cursor) { this.cursor = cursor; }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class PaginatedResult {
//		@JsonProperty("nextCursor")
//		String nextCursor;
//	}
	public static class PaginatedResult {
	    @JsonProperty("nextCursor")
	    private String nextCursor;

	    // 手动实现无参构造函数
	    public PaginatedResult() {}

	    // 手动实现全参构造函数
	    public PaginatedResult(String nextCursor) {
	        this.nextCursor = nextCursor;
	    }

	    // Getter/Setter方法
	    public String getNextCursor() { return nextCursor; }
	    public void setNextCursor(String nextCursor) { this.nextCursor = nextCursor; }
	}

	// ---------------------------
	// Progress and Logging
	// ---------------------------
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ProgressNotification {
//		@JsonProperty("progressToken")
//		String progressToken;
//		@JsonProperty("progress")
//		double progress;
//		@JsonProperty("total")
//		Double total;
//	}// @formatter:on
	public static class ProgressNotification {
	    @JsonProperty("progressToken")
	    private String progressToken;
	    
	    @JsonProperty("progress")
	    private double progress;
	    
	    @JsonProperty("total")
	    private Double total;

	    // 手动添加无参构造函数
	    public ProgressNotification() {}

	    // 手动添加全参构造函数
	    public ProgressNotification(String progressToken, double progress, Double total) {
	        this.progressToken = progressToken;
	        this.progress = progress;
	        this.total = total;
	    }

	    // Getter/Setter方法
	    public String getProgressToken() { return progressToken; }
	    public void setProgressToken(String progressToken) { this.progressToken = progressToken; }
	    
	    public double getProgress() { return progress; }
	    public void setProgress(double progress) { this.progress = progress; }
	    
	    public Double getTotal() { return total; }
	    public void setTotal(Double total) { this.total = total; }

	    @Override
	    public String toString() {
	        return "ProgressNotification{" +
	                "progressToken='" + progressToken + '\'' +
	                ", progress=" + progress +
	                ", total=" + total +
	                '}';
	    }
	}

	/**
	 * The Model Context Protocol (MCP) provides a standardized way for servers
	 * to send structured log messages to clients. Clients can control logging
	 * verbosity by setting minimum log levels, with servers sending
	 * notifications containing severity levels, optional logger names, and
	 * arbitrary JSON-serializable data.
	 *
	 * @param level
	 *            The severity levels. The mimimum log level is set by the
	 *            client.
	 * @param logger
	 *            The logger that generated the message.
	 * @param data
	 *            JSON-serializable logging data.
	 */
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class LoggingMessageNotification {
//		@JsonProperty("level")
//		LoggingLevel level;
//		@JsonProperty("logger")
//		String logger;
//		@JsonProperty("data")
//		String data;
//
//		public static Builder builder() {
//			return new Builder();
//		}
//
//		public static class Builder {
//			private LoggingLevel level = LoggingLevel.INFO;
//			private String logger = "server";
//			private String data;
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
//			public LoggingMessageNotification build() {
//				return new LoggingMessageNotification(level, logger, data);
//			}
//		}
//	}// @formatter:on
	
	public static class LoggingMessageNotification {
	    @JsonProperty("level")
	    private LoggingLevel level;
	    
	    @JsonProperty("logger")
	    private String logger;
	    
	    @JsonProperty("data")
	    private String data;
	
	    // 手动添加无参构造函数
	    public LoggingMessageNotification() {}
	
	    // 手动添加全参构造函数
	    public LoggingMessageNotification(LoggingLevel level, String logger, String data) {
	        this.level = level;
	        this.logger = logger;
	        this.data = data;
	    }
	
	    // Getter/Setter方法
	    public LoggingLevel getLevel() { return level; }
	    public void setLevel(LoggingLevel level) { this.level = level; }
	    
	    public String getLogger() { return logger; }
	    public void setLogger(String logger) { this.logger = logger; }
	    
	    public String getData() { return data; }
	    public void setData(String data) { this.data = data; }
	
	    // 静态内部Builder类
	    public static class Builder {
	        private LoggingLevel level = LoggingLevel.INFO;  // 默认值
	        private String logger = "server";                // 默认值
	        private String data;
	
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
	
	        public LoggingMessageNotification build() {
	            return new LoggingMessageNotification(level, logger, data);
	        }
	    }
	
	    @Override
	    public String toString() {
	        return "LoggingMessageNotification{" +
	                "level=" + level +
	                ", logger='" + logger + '\'' +
	                ", data='" + data + '\'' +
	                '}';
	    }
	}

	public enum LoggingLevel {// @formatter:off
		@JsonProperty("debug")
		DEBUG(0), @JsonProperty("info")
		INFO(1), @JsonProperty("notice")
		NOTICE(2), @JsonProperty("warning")
		WARNING(3), @JsonProperty("error")
		ERROR(4), @JsonProperty("critical")
		CRITICAL(5), @JsonProperty("alert")
		ALERT(6), @JsonProperty("emergency")
		EMERGENCY(7);

		private final int level;

		LoggingLevel(int level) {
			this.level = level;
		}

		public int level() {
			return level;
		}

	} // @formatter:on

	// ---------------------------
	// Autocomplete
	// ---------------------------
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class CompleteRequest implements Request {
//		PromptOrResourceReference ref;
//		CompleteArgument argument;
//
//		public interface PromptOrResourceReference {
//			String getType();
//		}
//
//		@Data
//		@AllArgsConstructor
//		@NoArgsConstructor
//		public static class PromptReference implements PromptOrResourceReference {
//			@JsonProperty("type")
//			String type;
//			@JsonProperty("name")
//			String name;
//		}// @formatter:on
//
//		@Data
//		@AllArgsConstructor
//		@NoArgsConstructor
//		public static class ResourceReference implements PromptOrResourceReference {
//			@JsonProperty("type")
//			String type;
//			@JsonProperty("uri")
//			String uri;
//		}// @formatter:on
//
//		@Data
//		@AllArgsConstructor
//		@NoArgsConstructor
//		public static class CompleteArgument {
//			@JsonProperty("name")
//			String name;
//			@JsonProperty("value")
//			String value;
//		}// @formatter:on
//	}
	public static class CompleteRequest implements Request {
	    private PromptOrResourceReference ref;
	    private CompleteArgument argument;

	    // 手动添加无参构造函数
	    public CompleteRequest() {}

	    // 手动添加全参构造函数
	    public CompleteRequest(PromptOrResourceReference ref, CompleteArgument argument) {
	        this.ref = ref;
	        this.argument = argument;
	    }

	    // Getter/Setter方法
	    public PromptOrResourceReference getRef() { return ref; }
	    public void setRef(PromptOrResourceReference ref) { this.ref = ref; }
	    public CompleteArgument getArgument() { return argument; }
	    public void setArgument(CompleteArgument argument) { this.argument = argument; }

	    // 静态内部类定义
	    public interface PromptOrResourceReference {
	        String getType();
	    }

	    public static class PromptReference implements PromptOrResourceReference {
	        @JsonProperty("type")
	        private String type;
	        
	        @JsonProperty("name")
	        private String name;

	        // 手动添加无参构造函数
	        public PromptReference() {}

	        // 手动添加全参构造函数
	        public PromptReference(String type, String name) {
	            this.type = type;
	            this.name = name;
	        }

	        // Getter/Setter方法
	        public String getType() { return type; }
	        public void setType(String type) { this.type = type; }
	        public String getName() { return name; }
	        public void setName(String name) { this.name = name; }
	    }

	    public static class ResourceReference implements PromptOrResourceReference {
	        @JsonProperty("type")
	        private String type;
	        
	        @JsonProperty("uri")
	        private String uri;

	        // 手动添加无参构造函数
	        public ResourceReference() {}

	        // 手动添加全参构造函数
	        public ResourceReference(String type, String uri) {
	            this.type = type;
	            this.uri = uri;
	        }

	        // Getter/Setter方法
	        public String getType() { return type; }
	        public void setType(String type) { this.type = type; }
	        public String getUri() { return uri; }
	        public void setUri(String uri) { this.uri = uri; }
	    }

	    public static class CompleteArgument {
	        @JsonProperty("name")
	        private String name;
	        
	        @JsonProperty("value")
	        private String value;

	        // 手动添加无参构造函数
	        public CompleteArgument() {}

	        // 手动添加全参构造函数
	        public CompleteArgument(String name, String value) {
	            this.name = name;
	            this.value = value;
	        }

	        // Getter/Setter方法
	        public String getName() { return name; }
	        public void setName(String name) { this.name = name; }
	        public String getValue() { return value; }
	        public void setValue(String value) { this.value = value; }
	    }
	}

//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class CompleteResult {
//		CompleteCompletion completion;
//
//		@Data
//		@AllArgsConstructor
//		@NoArgsConstructor
//		public static class CompleteCompletion {
//			@JsonProperty("values")
//			List<String> values;
//			@JsonProperty("total")
//			Integer total;
//			@JsonProperty("hasMore")
//			Boolean hasMore;
//		}// @formatter:on
//	}
	public static class CompleteResult {
	    private CompleteCompletion completion;

	    // 手动添加无参构造函数
	    public CompleteResult() {}

	    // 手动添加全参构造函数
	    public CompleteResult(CompleteCompletion completion) {
	        this.completion = completion;
	    }

	    // Getter/Setter方法
	    public CompleteCompletion getCompletion() { return completion; }
	    public void setCompletion(CompleteCompletion completion) { this.completion = completion; }

	    public static class CompleteCompletion {
	        @JsonProperty("values")
	        private List<String> values;
	        
	        @JsonProperty("total")
	        private Integer total;
	        
	        @JsonProperty("hasMore")
	        private Boolean hasMore;

	        // 手动添加无参构造函数
	        public CompleteCompletion() {}

	        // 手动添加全参构造函数
	        public CompleteCompletion(List<String> values, Integer total, Boolean hasMore) {
	            this.values = values;
	            this.total = total;
	            this.hasMore = hasMore;
	        }

	        // Getter/Setter方法
	        public List<String> getValues() { return values; }
	        public void setValues(List<String> values) { this.values = values; }
	        public Integer getTotal() { return total; }
	        public void setTotal(Integer total) { this.total = total; }
	        public Boolean getHasMore() { return hasMore; }
	        public void setHasMore(Boolean hasMore) { this.hasMore = hasMore; }
	    }
	}

	// ---------------------------
	// Content Types
	// ---------------------------
	@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
	@JsonSubTypes({ @JsonSubTypes.Type(value = TextContent.class, name = "text"), @JsonSubTypes.Type(value = ImageContent.class, name = "image"), @JsonSubTypes.Type(value = EmbeddedResource.class, name = "resource") })
	public interface Content {

		default String type() {
			if (this instanceof TextContent) {
				return "text";
			} else if (this instanceof ImageContent) {
				return "image";
			} else if (this instanceof EmbeddedResource) {
				return "resource";
			}
			throw new IllegalArgumentException("Unknown content type: " + this);
		}

	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class TextContent implements Content { // @formatter:on
//		@JsonProperty("audience")
//		List<Role> audience;
//		@JsonProperty("priority")
//		Double priority;
//		@JsonProperty("text")
//		String text;
//
//		public TextContent(String content) {
//			this(null, null, content);
//		}
//	}
	public static class TextContent implements Content {
	    @JsonProperty("audience")
	    private List<Role> audience;
	    
	    @JsonProperty("priority")
	    private Double priority;
	    
	    @JsonProperty("text")
	    private String text;

	    // 手动添加无参构造函数
	    public TextContent() {}
	    
		public TextContent(String content) {
			this(null, null, content);
		}

	    // 手动添加全参构造函数（参数顺序与字段声明一致）
	    public TextContent(List<Role> audience, Double priority, String text) {
	        this.audience = audience;
	        this.priority = priority;
	        this.text = text;
	    }

	    // Getter/Setter方法
	    public List<Role> getAudience() { return audience; }
	    public void setAudience(List<Role> audience) { this.audience = audience; }
	    
	    public Double getPriority() { return priority; }
	    public void setPriority(Double priority) { this.priority = priority; }
	    
	    public String getText() { return text; }
	    public void setText(String text) { this.text = text; }

	    @Override
	    public String toString() {
	        return "TextContent{" +
	                "audience=" + audience +
	                ", priority=" + priority +
	                ", text='" + text + '\'' +
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ImageContent implements Content { // @formatter:on
//		@JsonProperty("audience")
//		List<Role> audience;
//		@JsonProperty("priority")
//		Double priority;
//		@JsonProperty("data")
//		String data;
//		@JsonProperty("mimeType")
//		String mimeType;
//	}
	public static class ImageContent implements Content {
	    @JsonProperty("audience")
	    private List<Role> audience;
	    
	    @JsonProperty("priority")
	    private Double priority;
	    
	    @JsonProperty("data")
	    private String data;
	    
	    @JsonProperty("mimeType")
	    private String mimeType;

	    // 手动添加无参构造函数
	    public ImageContent() {}

	    // 手动添加全参构造函数
	    public ImageContent(List<Role> audience, Double priority, String data, String mimeType) {
	        this.audience = audience;
	        this.priority = priority;
	        this.data = data;
	        this.mimeType = mimeType;
	    }

	    // Getter/Setter方法
	    public List<Role> getAudience() { return audience; }
	    public void setAudience(List<Role> audience) { this.audience = audience; }
	    
	    public Double getPriority() { return priority; }
	    public void setPriority(Double priority) { this.priority = priority; }
	    
	    public String getData() { return data; }
	    public void setData(String data) { this.data = data; }
	    
	    public String getMimeType() { return mimeType; }
	    public void setMimeType(String mimeType) { this.mimeType = mimeType; }

	    @Override
	    public String toString() {
	        return "ImageContent{" +
	                "audience=" + audience +
	                ", priority=" + priority +
	                ", data='" + data + '\'' +
	                ", mimeType='" + mimeType + '\'' +
	                '}';
	    }
	}

	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class EmbeddedResource implements Content { // @formatter:on
//		@JsonProperty("audience")
//		List<Role> audience;
//		@JsonProperty("priority")
//		Double priority;
//		@JsonProperty("resource")
//		ResourceContents resource;
//	}
	public static class EmbeddedResource implements Content {
	    @JsonProperty("audience")
	    private List<Role> audience;
	    
	    @JsonProperty("priority")
	    private Double priority;
	    
	    @JsonProperty("resource")
	    private ResourceContents resource;

	    // 手动添加无参构造函数
	    public EmbeddedResource() {}

	    // 手动添加全参构造函数
	    public EmbeddedResource(List<Role> audience, Double priority, ResourceContents resource) {
	        this.audience = audience;
	        this.priority = priority;
	        this.resource = resource;
	    }

	    // Getter/Setter方法
	    public List<Role> getAudience() { return audience; }
	    public void setAudience(List<Role> audience) { this.audience = audience; }
	    
	    public Double getPriority() { return priority; }
	    public void setPriority(Double priority) { this.priority = priority; }
	    
	    public ResourceContents getResource() { return resource; }
	    public void setResource(ResourceContents resource) { this.resource = resource; }

	    @Override
	    public String toString() {
	        return "EmbeddedResource{" +
	                "audience=" + audience +
	                ", priority=" + priority +
	                ", resource=" + resource +
	                '}';
	    }
	}

	// ---------------------------
	// Roots
	// ---------------------------
	/**
	 * Represents a root directory or file that the server can operate on.
	 *
	 * @param uri
	 *            The URI identifying the root. This *must* start with file://
	 *            for now. This restriction may be relaxed in future versions of
	 *            the protocol to allow other URI schemes.
	 * @param name
	 *            An optional name for the root. This can be used to provide a
	 *            human-readable identifier for the root, which may be useful
	 *            for display purposes or for referencing the root in other
	 *            parts of the application.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class Root {
//		@JsonProperty("uri")
//		String uri;
//		@JsonProperty("name")
//		String name;
//	} // @formatter:on
	public static class Root {
	    @JsonProperty("uri")
	    private String uri;
	    
	    @JsonProperty("name")
	    private String name;

	    // 手动添加无参构造函数
	    public Root() {}

	    // 手动添加全参构造函数
	    public Root(String uri, String name) {
	        this.uri = uri;
	        this.name = name;
	    }

	    // Getter/Setter方法
	    public String getUri() { return uri; }
	    public void setUri(String uri) { this.uri = uri; }
	    
	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    @Override
	    public String toString() {
	        return "Root{" +
	                "uri='" + uri + '\'' +
	                ", name='" + name + '\'' +
	                '}';
	    }
	}

	/**
	 * The client's response to a roots/list request from the server. This
	 * result contains an array of Root objects, each representing a root
	 * directory or file that the server can operate on.
	 *
	 * @param roots
	 *            An array of Root objects, each representing a root directory
	 *            or file that the server can operate on.
	 */
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
	@JsonIgnoreProperties(ignoreUnknown = true)
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class ListRootsResult {
//		@JsonProperty("roots")
//		List<Root> roots;
//	} // @formatter:on
	public static class ListRootsResult {
	    @JsonProperty("roots")
	    private List<Root> roots;

	    // 手动添加无参构造函数
	    public ListRootsResult() {}

	    // 手动添加全参构造函数
	    public ListRootsResult(List<Root> roots) {
	        this.roots = roots;
	    }

	    // Getter/Setter方法
	    public List<Root> getRoots() { return roots; }
	    public void setRoots(List<Root> roots) { this.roots = roots; }

	    @Override
	    public String toString() {
	        return "ListRootsResult{" +
	                "roots=" + roots +
	                '}';
	    }
	}

}
