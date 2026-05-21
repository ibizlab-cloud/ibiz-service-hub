package net.ibizsys.central.plugin.extension.sysutil;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.modelcontextprotocol.server.McpServerFeatures.SyncToolSpecification;
import io.modelcontextprotocol.spec.McpSchema.Tool;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.plugin.ai.addin.IMcpServerToolProvider;
import net.ibizsys.central.plugin.ai.sysutil.SysMcpServerUtilRuntimeBase;
import net.ibizsys.central.plugin.ai.sysutil.addin.McpServerToolProviderBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class ExtensionMcpServerUtilRuntimeBase extends SysMcpServerUtilRuntimeBase implements IExtensionMcpServerUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ExtensionMcpServerUtilRuntimeBase.class);
	
	private final ISysExtensionUtilRuntimeContext iSysExtensionUtilRuntimeContext;
	
	
	private McpServerToolProviderBase mcpServerToolProviderBase = null;
	
	protected class ExtensioncpServerToolProvider extends McpServerToolProviderBase{
		private final List<V2SystemExtensionLogic> extensionTools;
		public ExtensioncpServerToolProvider(List<V2SystemExtensionLogic> extensionTools) {
			this.extensionTools = new ArrayList<V2SystemExtensionLogic>(extensionTools);
		}
		
		@Override
		protected void onInit() throws Exception {
			super.onInit();
			
			for(V2SystemExtensionLogic v2SystemExtensionLogic : this.extensionTools) {
				this.registerSyncToolSpecification(v2SystemExtensionLogic);
			}
		}
		
		protected void registerSyncToolSpecification(V2SystemExtensionLogic v2SystemExtensionLogic) throws Exception {
			String strToolSpecification = DataTypeUtils.asString(v2SystemExtensionLogic.get("toolspecification"));
			
			
			String strToolName = DataTypeUtils.asString(v2SystemExtensionLogic.get("toolname"));
			//this.registerSyncToolSpecification(tool, bAsyncTool);
			ObjectNode jsonSchema = JsonUtils.toObjectNode(strToolSpecification);
			JsonNode idJsonNode = jsonSchema.path("id");
			if(!idJsonNode.isMissingNode()) {
				String strToolName2 = idJsonNode.asText();
				if(StringUtils.hasLength(strToolName2)) {
					strToolName = strToolName2;
				}				
			}
			
			String strToolDesc = null;
			JsonNode descriptionJsonNode = jsonSchema.path("description");
			if(!descriptionJsonNode.isMissingNode()) {
				strToolDesc = descriptionJsonNode.asText();
				jsonSchema.remove("description");
			}
			
			if(!StringUtils.hasLength(strToolDesc)) {
				strToolDesc = DataTypeUtils.asString(v2SystemExtensionLogic.get("tooldesc"));
				if(!StringUtils.hasLength(strToolDesc)) {
					strToolDesc = "欠缺工具说明";
				}
			}
			
			//写回
			jsonSchema.put("id", String.format("tool_%1$s", strToolName));
			JsonNode propertiesNode = jsonSchema.path("properties");
			Map<String, Object> params = new LinkedHashMap<String, Object>();
			if(!propertiesNode.isMissingNode()) {
				java.util.Iterator<String> fields = propertiesNode.fieldNames();
				while(fields.hasNext()) {
					params.put(fields.next(), null);
				}
			}
			
			SyncToolSpecification syncToolSpecification = new SyncToolSpecification(
				    new Tool(strToolName, strToolDesc, jsonSchema.toPrettyString()),
				    (exchange, arguments) -> {
				    	for(String key : params.keySet()) {
				    		params.put(key, arguments.get(key));
				    	}
				    	
				    	return executeUserContextAction(arguments, new IAction() {
				    		@Override
							public Object execute(Object[] args) throws Throwable {
								return ExtensionMcpServerUtilRuntimeBase.this.getSysExtensionUtilRuntimeContext().executeExtensionLogic(v2SystemExtensionLogic, params, false);
							}
				    		
				    	}, null, true);
				    }
				);
			
			this.registerSyncToolSpecification(syncToolSpecification, true);
		}
	}
	
	public ExtensionMcpServerUtilRuntimeBase(ISysExtensionUtilRuntimeContext iSysExtensionUtilRuntimeContext) {
		this.iSysExtensionUtilRuntimeContext = iSysExtensionUtilRuntimeContext;
	}
	 
	protected ISysExtensionUtilRuntimeContext getSysExtensionUtilRuntimeContext() {
		return this.iSysExtensionUtilRuntimeContext;
	}
	
	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		this.setBaseUrl(String.format("http://%1$s:%2$s/%3$s/extension/mcp/%4$s", ServiceHub.getInstance().getIPAddress(), ServiceHub.getInstance().getPort(), this.getSystemRuntime().getServiceId(), this.getId()));
		super.onPrepareDefaultSetting();
	}
	
	@Override
	protected Map<String, IMcpServerToolProvider> getDefaultMcpServerToolProviders() {
		return new LinkedHashMap<String, IMcpServerToolProvider>();
	}
	
	@Override
	public void reloadExtensionTools(List<V2SystemExtensionLogic> tools) {
		try {
			this.onReloadExtensionTools(tools);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("重新加载扩展工具发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onReloadExtensionTools(List<V2SystemExtensionLogic> tools) throws Throwable {
		if(this.mcpServerToolProviderBase != null){
			this.unregisterMcpServerToolProvider(this.getPSSysUtil().getUtilTag(), mcpServerToolProviderBase);
			this.mcpServerToolProviderBase = null;
		}
		this.mcpServerToolProviderBase = this.createMcpServerToolProvider(tools);
		this.registerMcpServerToolProvider(this.getPSSysUtil().getUtilTag(), this.mcpServerToolProviderBase);
	}
	
	protected McpServerToolProviderBase createMcpServerToolProvider(List<V2SystemExtensionLogic> tools) throws Exception {
		ExtensioncpServerToolProvider extensioncpServerToolProvider = new ExtensioncpServerToolProvider(tools);
		extensioncpServerToolProvider.init(this.getModelRuntimeContext(), this.getPSSysUtil().getUtilTag());
		return extensioncpServerToolProvider;
	}
	
	@Override
	protected void onUninstall() throws Throwable {
		if(this.mcpServerToolProviderBase != null){
			this.unregisterMcpServerToolProvider(this.getPSSysUtil().getUtilTag(), this.mcpServerToolProviderBase);
			this.mcpServerToolProviderBase = null;
		}
		super.onUninstall();
	}

}
