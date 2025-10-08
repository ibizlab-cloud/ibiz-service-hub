package net.ibizsys.central.plugin.ai.mcp.spec;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public final class McpSchema {

	public interface Request {

		/**
		 * 获取额外的头部内容
		 * 
		 * @return
		 */
		Map<String, Object> getHeaders();

	}

	public static class CallToolRequest extends io.modelcontextprotocol.spec.McpSchema.CallToolRequest implements Request {

		@JsonIgnore
		private Map<String, Object> headers = null;

		public CallToolRequest(String name, Map<String, Object> arguments, Map<String, Object> headers) {
			super(name, arguments);
			this.headers = headers;
		}

		@Override
		@JsonIgnore
		public Map<String, Object> getHeaders() {
			return this.headers;
		}
	}
}
