package net.ibizsys.central.plugin.ai.sysutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.IDynaSysAIChatAgentFactoryRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.util.AccessTokenUtils;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.plugin.ai.addin.IOpenAIAdapter;
import net.ibizsys.central.plugin.ai.agent.ISysAIFactoryRuntime;
import net.ibizsys.central.plugin.ai.sysutil.addin.DefaultOpenAIAdapter;
import net.ibizsys.central.plugin.ai.sysutil.addin.ISysOpenAIServerUtilRTAddin;
import net.ibizsys.central.plugin.ai.sysutil.addin.WXWorkOpenClawOpenAIAdapter;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;


/**
 * 系统OpenAI服务器功能组件运行时基类
 * @author lionlau
 *
 */
public abstract class SysOpenAIServerUtilRuntimeBase extends SysUtilRuntimeBase implements ISysOpenAIServerUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysOpenAIServerUtilRuntimeBase.class);
	
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysOpenAIServerUtilRTAddin.class, "*:" + ADDIN_ADAPTER_PREFIX + ADAPTER_DEFAULT, DefaultOpenAIAdapter.class);
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysOpenAIServerUtilRTAddin.class, "*:" + ADDIN_ADAPTER_PREFIX + "OPENCLAW-WXWORK", WXWorkOpenClawOpenAIAdapter.class);
	}
	
	private ISysPortalUtilRuntime iSysPortalUtilRuntime = null;
	
	@Override
	protected ISysOpenAIServerUtilRuntimeContext createModelRuntimeContext() {
		return new SysOpenAIServerUtilRuntimeContextBase<ISysOpenAIServerUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {

		};
	}
	
	
	private Map<String, IOpenAIAdapter> openAIAdapterMap = null;
	
	private Map<String, List<IOpenAIAdapter>> openAIAdapterMap2 = new HashMap<String, List<IOpenAIAdapter>>();

	
	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		
		
		super.onPrepareDefaultSetting();
	}

	
	@Override
	protected void onInit() throws Exception {

		super.onInit();
		
		prepareConfig();
	}
	
	@Override
	protected void onInstall() throws Exception {
		
		super.onInstall();
		
		this.openAIAdapterMap = this.getDefaultOpenAIAdapters();
		
		this.listenReloadSignal();
	}
	
	protected Map<String, IOpenAIAdapter> getDefaultOpenAIAdapters() {
		return this.getAddins(IOpenAIAdapter.class, ADDIN_ADAPTER_PREFIX);
	}
	
	
	@Override
	public String getFullName() {
		return String.format("OpenAIServer组件[%1$s]", this.getName());
	}
	
	@Override
	protected void onReload() throws Throwable {
		
	}

	
	@Override
	protected void onUninstall() throws Throwable {
		if(!ObjectUtils.isEmpty(this.openAIAdapterMap)) {
			this.openAIAdapterMap.clear();
		}
		
		if(!ObjectUtils.isEmpty(this.openAIAdapterMap2)) {
			this.openAIAdapterMap2.clear();
		}
		super.onUninstall();
	}

	protected void prepareConfig() throws Exception {


	}
	
	
	@Override
	protected ISysOpenAIServerUtilRuntimeContext getModelRuntimeContext() {
		return (ISysOpenAIServerUtilRuntimeContext)super.getModelRuntimeContext();
	}
	
	@Override
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(getModelRuntimeContext(), ISysOpenAIServerUtilRTAddin.class, String.format("%1$s:",this.getFullUniqueTag()));
	}

	
	@Override
	public boolean containsAdapter(String strAdapterName) {
		Assert.hasLength(strAdapterName, "未传入适配器名称");
		strAdapterName = strAdapterName.toUpperCase();
		List<IOpenAIAdapter> list = this.openAIAdapterMap2.get(strAdapterName);
		if(!ObjectUtils.isEmpty(list)) {
			return true;
		}
		
		IOpenAIAdapter iOpenAIAdapter = this.openAIAdapterMap.get(strAdapterName);
		if(iOpenAIAdapter != null) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public void registerAdapter(String strAdapterName, IOpenAIAdapter iOpenAIAdapter) {
		Assert.hasLength(strAdapterName, "未传入适配器名称");
		Assert.notNull(iOpenAIAdapter, "未传入适配器对象");
		strAdapterName = strAdapterName.toUpperCase();
		synchronized (this.openAIAdapterMap2) {
			List<IOpenAIAdapter> last = this.openAIAdapterMap2.get(strAdapterName);
			List<IOpenAIAdapter> list = new ArrayList<IOpenAIAdapter>();
			if(last != null) {
				list.addAll(last);
			}
			if(!list.contains(iOpenAIAdapter)) {
				list.add(iOpenAIAdapter);
				Collections.sort(list, new Comparator<IOpenAIAdapter>() {
					@Override
					public int compare(IOpenAIAdapter o1, IOpenAIAdapter o2) {
						return Integer.compare(o1.getPriority(), o2.getPriority());
					}
				});
			}
			this.openAIAdapterMap2.put(strAdapterName, list);
		}
	}

	@Override
	public boolean unregisterAdapter(String strAdapterName, IOpenAIAdapter iOpenAIAdapter) {
		Assert.hasLength(strAdapterName, "未传入适配器名称");
		Assert.notNull(iOpenAIAdapter, "未传入适配器对象");
		strAdapterName = strAdapterName.toUpperCase();
		synchronized (this.openAIAdapterMap2) {
			List<IOpenAIAdapter> last = this.openAIAdapterMap2.get(strAdapterName);
			List<IOpenAIAdapter> list = new ArrayList<IOpenAIAdapter>();
			if(last != null) {
				list.addAll(last);
			}
			if(list.contains(iOpenAIAdapter)) {
				list.remove(iOpenAIAdapter);
				this.openAIAdapterMap2.put(strAdapterName, list);
				return true;
			}
			return false;			
		}
	}
	
	
	@Override
	public IOpenAIAdapter getAdapter(String strAdapterName, boolean bTryMode) {
		Assert.hasLength(strAdapterName, "未传入适配器名称");
		String strType2 = strAdapterName.toUpperCase();
		return (IOpenAIAdapter)executeAction("获取适配器", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAdapter(strType2, bTryMode);
				
			}
		}, null);
	}

	
	
	protected IOpenAIAdapter onGetAdapter(String strType, boolean bTryMode) throws Throwable {
		
		List<IOpenAIAdapter> list = this.openAIAdapterMap2.get(strType);
		if(!ObjectUtils.isEmpty(list)) {
			return list.get(0);
		}
		
		
		IOpenAIAdapter iOpenAIAdapter = this.openAIAdapterMap.get(strType);
		if(iOpenAIAdapter != null || bTryMode) {
			return iOpenAIAdapter;
		}
		
		throw new Exception(String.format("指定类型[%1$s]适配器不存在", strType));
	}
	
	@Override
	public Object getModels(String factoryId, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) {
		return this.executeAction("获取模型清单", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetModels(factoryId, request, response, body);
			}
		}, null);
	}
	
	protected Object onGetModels(String factoryId, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) throws Throwable {
		
		String strToken = request.getHeader("Authorization");
		if(ObjectUtils.isEmpty(strToken)) {
			throw new ErrorException(String.format("未指定认证信息"), Errors.ACCESSDENY);
		}
		
		int nPos = strToken.indexOf("Bearer ");
		if(nPos != 0) {
			throw new ErrorException("认证信息无效", Errors.ACCESSDENY) ;
		}
		
		strToken = strToken.substring("Bearer ".length()).trim();
		
		String strAIFactoryId = factoryId;
		ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)this.getSystemRuntime()).getSysAIFactoryRuntime(strAIFactoryId, true);
		if(iSysAIFactoryRuntime == null) {
			throw new ErrorException(String.format("指定AI工厂[%1$s]不存在", strAIFactoryId), Errors.INVALIDDATA);
		}
		
		AccessToken accessToken = iSysAIFactoryRuntime.getWebhookAccessToken(strToken, true);
		if(accessToken == null) {
			throw new ErrorException("传入凭证无效", Errors.ACCESSDENY) ;
		}
		
		ObjectNode modelsNode = JsonUtils.createObjectNode();
		modelsNode.put("object", "list");
		ArrayNode dataNode = modelsNode.putArray("data");
		
		
		List<ISysAIChatAgentRuntime> sysAIChatAgentRuntimeList = iSysAIFactoryRuntime.getSysAIChatAgentRuntimes();
		if(!ObjectUtils.isEmpty(sysAIChatAgentRuntimeList)) {
			for(ISysAIChatAgentRuntime iSysAIChatAgentRuntime : sysAIChatAgentRuntimeList) {
				if(iSysAIChatAgentRuntime instanceof IDynaSysAIChatAgentFactoryRuntime) {
					IDynaSysAIChatAgentFactoryRuntime iDynaSysAIChatAgentFactoryRuntime = (IDynaSysAIChatAgentFactoryRuntime)iSysAIChatAgentRuntime;
					List<ISysAIChatAgentRuntime> subSysAIChatAgentRuntimeList = iDynaSysAIChatAgentFactoryRuntime.getSysAIChatAgentRuntimes();
					if(!ObjectUtils.isEmpty(subSysAIChatAgentRuntimeList)) {
						for(ISysAIChatAgentRuntime subSysAIChatAgentRuntime : subSysAIChatAgentRuntimeList) {
							ObjectNode modelNode = dataNode.addObject();
							modelNode.put("id", subSysAIChatAgentRuntime.getUniqueTag());
							modelNode.put("name", subSysAIChatAgentRuntime.getName());
							modelNode.put("object", "model");
							modelNode.put("created", System.currentTimeMillis()/1000);
							modelNode.put("owned_by", "system");
						}
					}
				}
				else {
					ObjectNode modelNode = dataNode.addObject();
					modelNode.put("id", iSysAIChatAgentRuntime.getUniqueTag());
					modelNode.put("name", iSysAIChatAgentRuntime.getName());
					modelNode.put("object", "model");
					modelNode.put("created", System.currentTimeMillis()/1000);
					modelNode.put("owned_by", "system");
				}
			}
		}
		
		return modelsNode;
	}
	
	@Override
	public Object chatCompletion(String factoryId, String adapterName, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) {
		return this.executeAction("交谈补全", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onChatCompletion(factoryId, adapterName, request, response, body);
			}
		}, null);
	}
	
	protected Object onChatCompletion(String factoryId, String adapterName, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) throws Throwable {
		
		String strToken = request.getHeader("Authorization");
		if(ObjectUtils.isEmpty(strToken)) {
			throw new ErrorException(String.format("未指定认证信息"), Errors.ACCESSDENY);
		}
		
		int nPos = strToken.indexOf("Bearer ");
		if(nPos != 0) {
			throw new ErrorException("认证信息无效", Errors.ACCESSDENY) ;
		}
		
		strToken = strToken.substring("Bearer ".length()).trim();
		
		
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		String model = DataTypeUtils.asString(body.get("model"));
		if(ObjectUtils.isEmpty(model)) {
			throw new ErrorException(String.format("未指定模型"), Errors.INVALIDDATA);
		}
		
		String[] items = model.split("[@-]");
		String strFullAIChatAgentId = items.length == 1 ? items[0] : items[1];
		
		String strAIFactoryId = StringUtils.hasLength(factoryId)?factoryId:PSModelUtils.getParentId(strFullAIChatAgentId);
		ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)this.getSystemRuntime()).getSysAIFactoryRuntime(strAIFactoryId, true);
		if(iSysAIFactoryRuntime == null) {
			throw new ErrorException(String.format("指定AI工厂[%1$s]不存在", strAIFactoryId), Errors.INVALIDDATA);
		}
		
		AccessToken accessToken = iSysAIFactoryRuntime.getWebhookAccessToken(strToken, true);
		if(accessToken == null) {
			throw new ErrorException("传入凭证无效", Errors.ACCESSDENY) ;
		}
		
		
		String strAIAgentId = PSModelUtils.getSimpleId(strFullAIChatAgentId);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(strAIAgentId, true);
		if(iSysAIChatAgentRuntime == null) {
			throw new Exception(String.format("指定AI代理[%1$s]不存在", strAIAgentId));
		}
		
		if(items.length ==2) {
			chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, items[0]);
		}
		
		boolean stream = DataTypeUtils.asBoolean(body.get("stream"), false);
		chatCompletionRequest.setStreaming(stream?1:0);
		Float top_p = DataTypeUtils.asFloat(body.get("top_p"));
		if(top_p != null) {
			chatCompletionRequest.setTopP(top_p);
		}
		Float temperature = DataTypeUtils.asFloat(body.get("temperature"));
		if(temperature != null) {
			chatCompletionRequest.setTemperature(temperature);
		}
		Integer max_tokens = DataTypeUtils.asInteger(body.get("max_tokens"));
		if(max_tokens != null) {
			chatCompletionRequest.setMaxTokens(max_tokens);
		}
		
		String session_id = DataTypeUtils.asString(body.get("session_id"));
		if(ObjectUtils.isEmpty(session_id)) {
			session_id = KeyValueUtils.genUniqueId(model);
		}
		chatCompletionRequest.setSessionId(session_id);
		
		
		Object messages = body.get("messages");
		if(messages instanceof List) {
			List list = (List)messages;
			for(Object item : list) {
				if(!(item instanceof Map)){
					throw new Exception(String.format("消息项[%1$s]无效", item));
				}
				
				Map map = (Map)item;
				String role = DataTypeUtils.asString(map.get("role"));
				if(ObjectUtils.isEmpty(role)) {
					throw new Exception(String.format("消息项[%1$s]未指定角色", item));
				}
				Object content = map.get("content");
				if(ObjectUtils.isEmpty(content)) {
					throw new Exception(String.format("消息项[%1$s]未指定内容", item));
				}
				
				ChatMessage chatMessage = new ChatMessage();
				chatMessage.setRole(role.toUpperCase());
				chatMessage.setContent(content);
				chatCompletionRequest.getMessagesIf().add(chatMessage);
				
			}
		}
		else
			throw new Exception("messages无效");
		
		log.debug(String.format("接收到消息：\n%1$s", JsonUtils.toString(body)));
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			if(accessToken.getEmployee() != null) {
				IEmployeeContext iEmployeeContext = AccessTokenUtils.toEmployeeContext(accessToken, this.getSystemRuntime().getDeploySystemId());
				UserContext.setCurrent(iEmployeeContext);
			}
			else {
				EmployeeContext.setCurrent((IEmployeeContext)this.getSystemRuntime().createDefaultUserContext());
			}
			return this.getAdapter(StringUtils.hasLength(adapterName)?adapterName:ADAPTER_DEFAULT, false).chatCompletion(iSysAIChatAgentRuntime, chatCompletionRequest, request, response, body);
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}


	protected ISysPortalUtilRuntime getSysPortalUtilRuntime() {
		if (this.iSysPortalUtilRuntime == null) {
			this.iSysPortalUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysPortalUtilRuntime.class, false);
		}
		return this.iSysPortalUtilRuntime;
	}
}
