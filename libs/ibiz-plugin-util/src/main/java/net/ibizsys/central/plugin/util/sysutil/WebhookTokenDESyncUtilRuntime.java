package net.ibizsys.central.plugin.util.sysutil;

import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.YamlUtils;

public class WebhookTokenDESyncUtilRuntime extends AccessTokenDESyncUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(WebhookTokenDESyncUtilRuntime.class);
	
	/**
	 * 功能参数：逻辑
	 */
	public final static String TOKENPARAM_LOGICID = "logicid";
	
	/**
	 * 预定义属性：Webhook 上下文
	 */
	public final static String PREDEFINEDFIELD_WEBHOOK_CONTEXT = "WEBHOOK_CONTEXT";
	
	
	@Override
	protected String getConfig(IDataEntityRuntimeContext iDataEntityRuntimeContext, Map<String, Object> map, IEntityDTO iEntityDTO) throws Throwable {
		
		if(!map.containsKey(TOKENPARAM_LOGICID)) {
			map.put(TOKENPARAM_LOGICID, this.getUtilParam(TOKENPARAM_LOGICID, ""));
		}
		
		if(!map.containsKey(AccessToken.FIELD_APPCONTEXT)) {
			IPSDEField webhookContextPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(PREDEFINEDFIELD_WEBHOOK_CONTEXT, true);
			if(webhookContextPSDEField != null) {
				Object webhookContext = iEntityDTO.get(webhookContextPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(webhookContext)) {
					if(webhookContext instanceof Map) {
						map.put(AccessToken.FIELD_APPCONTEXT, webhookContext);
					}
					else if(webhookContext instanceof String) {
						String strAppContext = (String)webhookContext;
						strAppContext = strAppContext.trim();
						if(strAppContext.indexOf("{") == 0) {
							map.put(AccessToken.FIELD_APPCONTEXT, JsonUtils.asMap(strAppContext));
						}
						else {
							map.put(AccessToken.FIELD_APPCONTEXT, YamlUtils.asMap(strAppContext));
						}
					}
				}
			}
		}
		
		return super.getConfig(iDataEntityRuntimeContext, map, iEntityDTO);
	}
	
	@Override
	protected String getCloudConfigId(IDataEntityRuntimeContext iDataEntityRuntimeContext, Map<String, Object> map, IEntityDTO iEntityDTO) throws Exception {
		if(!map.containsKey(PARAM_SYSTEM)) {
			if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
				IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
				if(StringUtils.hasLength(iServiceSystemRuntime.getMainSystemId())) {
					map.put(PARAM_SYSTEM, iServiceSystemRuntime.getMainSystemId());
				}
			}
		}
		
		return super.getCloudConfigId(iDataEntityRuntimeContext, map, iEntityDTO);
	}
	
	@Override
	protected String getDefaultCloudConfigIdFormat(IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception {
		return "accesstoken-{system}-{util}--webhook--{key}";
	}
}
