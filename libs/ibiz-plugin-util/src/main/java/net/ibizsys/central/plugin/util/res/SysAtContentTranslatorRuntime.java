package net.ibizsys.central.plugin.util.res;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.IAIChatAgentRuntimeBase;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResultEx;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.plugin.ai.agent.IAIChatAgent;
import net.ibizsys.central.plugin.ai.sysutil.ISysAIFactoryUtilRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 系统At内容值转换器（支持AI）
 * 
 * @author lionlau
 *
 */
public class SysAtContentTranslatorRuntime extends net.ibizsys.central.res.SysAtContentTranslatorRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAtContentTranslatorRuntime.class);

	public final static String PARAM_AIFACTORY = "aifactory";
	public final static String PARAM_AIAGENTS = "aiagents";
	public final static String PARAM_AILOGIC = "ailogic";
	public final static String PARAM_AIRESULT = "airesult";

	private String strAIFactoryTag = null;
	private String strAILogicTag = null;
	private String strAIResultField = null;
	
	private Map<String, IAIChatAgentRuntimeBase> aiChatAgentMap = null;

	private ISysAIFactoryUtilRuntime iSysAIFactoryUtilRuntime = null;
	
	private ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
	

	@Override
	protected void onInit() throws Exception {
		this.strAIFactoryTag = this.getTranslatorParam(PARAM_AIFACTORY, null);
		this.strAILogicTag = this.getTranslatorParam(PARAM_AILOGIC, null);
		this.strAIResultField = this.getTranslatorParam(PARAM_AIRESULT, "airesult");
		
		String strAIAgents = this.getTranslatorParam(PARAM_AIAGENTS, null);

		Map<String, String> aiChatAgentModeMap = null;
		if (StringUtils.hasLength(strAIAgents)) {
			aiChatAgentModeMap = new HashMap<String, String>();
			String[] agents = strAIAgents.split("[,]");
			for (String agent : agents) {
				if (!StringUtils.hasLength(agent)) {
					continue;
				}
				String[] items = agent.split("[:]");
				if (items.length >= 2) {
					aiChatAgentModeMap.put(items[0], items[1]);
				} else {
					aiChatAgentModeMap.put(items[0], "default");
				}
			}
		}
		super.onInit();

		if (StringUtils.hasLength(this.getAIFactoryTag())
				&& StringUtils.hasLength(this.getAILogicTag())
				&& !ObjectUtils.isEmpty(aiChatAgentModeMap)) {
			
			if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
				this.iSysAIFactoryRuntime = ((IServiceSystemRuntime)this.getSystemRuntime()).getSysAIFactoryRuntime(this.getAIFactoryTag(), true);
				if(this.iSysAIFactoryRuntime!=null) {
					this.aiChatAgentMap = new HashMap<String, IAIChatAgentRuntimeBase>();
					for (java.util.Map.Entry<String, String> entry : aiChatAgentModeMap.entrySet()) {
						String strAgentTag = String.format("%1$s", entry.getKey());
						ISysAIChatAgentRuntime iAIChatAgent = getSysAIFactoryRuntime().getAIChatAgentRuntime(strAgentTag, false);
						this.aiChatAgentMap.put(entry.getKey(), iAIChatAgent);
					}
				}
			}
			if(this.aiChatAgentMap == null) {
				ISysUtilRuntime iSysUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(this.getAIFactoryTag(), false);
				if (iSysUtilRuntime instanceof ISysAIFactoryUtilRuntime) {
					this.iSysAIFactoryUtilRuntime = (ISysAIFactoryUtilRuntime) iSysUtilRuntime;
				} else {
					throw new Exception(String.format("指定AI工厂功能对象[%1$s]类型不正确", iSysUtilRuntime));
				}
				this.aiChatAgentMap = new HashMap<String, IAIChatAgentRuntimeBase>();
				for (java.util.Map.Entry<String, String> entry : aiChatAgentModeMap.entrySet()) {
					String strAgentTag = String.format("%1$s.%2$s", entry.getKey(), entry.getValue());
					IAIChatAgent iAIChatAgent = getSysAIFactoryUtilRuntime().getAIChatAgent(strAgentTag);
					this.aiChatAgentMap.put(entry.getKey(), iAIChatAgent);
				}
			}
		}
		else {
			log.warn(String.format("未启用AI助手，相关参数未配置"));
		}
	}

	protected String getAIFactoryTag() {
		return this.strAIFactoryTag;
	}
	
	protected String getAILogicTag() {
		return this.strAILogicTag;
	}

	protected String getAIResultField() {
		return this.strAIResultField;
	}
	
	protected ISysAIFactoryRuntime getSysAIFactoryRuntime() {
		return this.iSysAIFactoryRuntime;
	}
	
	
	protected ISysAIFactoryUtilRuntime getSysAIFactoryUtilRuntime() {
		return this.iSysAIFactoryUtilRuntime;
	}
	
	protected Map<String, IAIChatAgentRuntimeBase> getAIChatAgentMap() {
		return this.aiChatAgentMap;
	}

	@Override
	protected MsgSendQueue getMsgSendQueue(IEntity iEntity, Map<String, Object> params, Map<String, String> targetMap, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		//判断是否有指定AI目标
		if(!ObjectUtils.isEmpty(getAIChatAgentMap())) {
			Map<String, String> targetMap2 = new LinkedHashMap<String, String>();
			Map<String, IAIChatAgentRuntimeBase> aiTargetMap = new LinkedHashMap<String, IAIChatAgentRuntimeBase>();
			for(java.util.Map.Entry<String, String> entry : targetMap.entrySet()) {
				IAIChatAgentRuntimeBase iAIChatAgent = this.getAIChatAgentMap().get(entry.getKey());
				if(iAIChatAgent != null) {
					aiTargetMap.put(entry.getKey(), iAIChatAgent);
				}
				else {
					targetMap2.put(entry.getKey(), entry.getValue());
				}
			}
			
			MsgSendQueue msgSendQueue = super.getMsgSendQueue(iEntity, params, targetMap2, entityDataEntityRuntime);
			if(!ObjectUtils.isEmpty(aiTargetMap)) {
				if(isThreadMode()) {
					getSystemRuntime().threadRun(new Runnable() {
						@Override
						public void run() {
							try {
								doAIChatCompletion(aiTargetMap, iEntity, params, targetMap, entityDataEntityRuntime);
							}
							catch (Throwable ex) {
								log.error(String.format("执行AI聊天交互发生异常，%1$s", ex.getMessage()), ex);
							}
						}
					});
				}
				else {
					doAIChatCompletion(aiTargetMap, iEntity, params, targetMap, entityDataEntityRuntime);
				}
			}
			
			return msgSendQueue;
		}
		else {
			return super.getMsgSendQueue(iEntity, params, targetMap, entityDataEntityRuntime);
		}
	}
	
	protected void doAIChatCompletion(Map<String, IAIChatAgentRuntimeBase> aiTargetMap, IEntity iEntity, Map<String, Object> params, Map<String, String> targetMap, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		for(java.util.Map.Entry<String, IAIChatAgentRuntimeBase> entry : aiTargetMap.entrySet()) {
			try {
				doAIChatCompletion(entry.getKey(), targetMap.get(entry.getKey()), entry.getValue(), iEntity, params, entityDataEntityRuntime);
			}
			catch (Throwable ex) {
				log.error(String.format("执行AI聊天交互发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}
	
	
	protected void doAIChatCompletion(String strUserId, String strUserName, IAIChatAgentRuntimeBase iAIChatAgent, IEntity iEntity, Map<String, Object> params, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		
		Map<String, Object> realParams = new LinkedHashMap<String, Object>();
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		
		if(!ObjectUtils.isEmpty(params)) {
			map.putAll(params);
		}
		
		//map.put(IAIChatAgent.TEMPLPARAM_ENTITY, iEntity);
		
		
		realParams.put(IAIChatAgent.PARAM_TEMPLPARAMS, map);
		
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		try {
			ChatCompletionResult result = iAIChatAgent.chatCompletion(iEntity, chatCompletionRequest, realParams, true, true);
			if(result instanceof ChatCompletionResultEx) {
				ChatCompletionResultEx chatCompletionResultEx = (ChatCompletionResultEx)result;
				iEntity.set(this.getAIResultField(), chatCompletionResultEx.getResult());
			}
			else {
				if(result == null || ObjectUtils.isEmpty(result.getChoices())) {
					throw new Exception("返回结果无效");
				}
				iEntity.set(this.getAIResultField(), result.getChoices().get(0).getContent());
			}
			
			this.executeAILogic(strUserId, strUserName, iAIChatAgent, iEntity, realParams, entityDataEntityRuntime);
			
		} catch (Throwable ex) {
			log.error(String.format("执行AI聊天交互发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object executeAILogic(String strUserId, String strUserName, IAIChatAgentRuntimeBase iAIChatAgent, IEntity iEntity, Map<String, Object> params, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			Employee employee = new Employee();
			employee.setUserId(strUserId);
			employee.setUserName(strUserName);
			employee.setPersonName(strUserName);
			
			IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, this.getSystemRuntime().getDeploySystemId());
			EmployeeContext.setCurrent(iEmployeeContext);
			
			//仿真上下文
			return onExecuteAILogic(iAIChatAgent, iEntity, params, entityDataEntityRuntime);
		}
		catch (Throwable ex) {
			log.error(String.format("执行AI逻辑[%1$s]发生异常，%2$s", this.getAILogicTag(), ex.getMessage()), ex);
			throw new Exception(String.format("执行AI逻辑[%1$s]发生异常，%2$s", this.getAILogicTag(), ex.getMessage()), ex);
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	protected Object onExecuteAILogic(IAIChatAgentRuntimeBase iAIChatAgent, IEntity iEntity, Map<String, Object> params, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		net.ibizsys.central.dataentity.IDataEntityRuntime realDataEntityRuntime = (net.ibizsys.central.dataentity.IDataEntityRuntime)entityDataEntityRuntime;
		return realDataEntityRuntime.executeLogic(this.getAILogicTag(), new Object[] {iEntity});
	}
}
