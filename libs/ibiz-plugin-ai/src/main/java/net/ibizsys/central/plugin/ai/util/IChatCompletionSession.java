package net.ibizsys.central.plugin.ai.util;

import java.util.Map;

import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.runtime.util.ActionSession;

/**
 * 交谈补全会话
 * @author lionlau
 *
 */
public interface IChatCompletionSession {

	/**
	 * 获取聊天请求
	 * @return
	 */
	ChatCompletionRequest getRequest();
	
	/**
	 * 设置参数
	 * @param key
	 * @param value
	 */
	void setParam(String key, Object value);
	
	
	
	/**
	 * 获取参数
	 * @param key
	 * @return
	 */
	Object getParam(String key);
	
	/**
	 * 重置参数
	 * @param key
	 * @return
	 */
	Object resetParam(String key);
	
	
	/**
	 * 获取下一步
	 * @return
	 */
	String getNext();
	
	
	/**
	 * 设置下一步
	 * @param next
	 */
	void setNext(String next);
	
	
	
	/**
	 * 获取行为类型
	 * @return
	 */
	String getAction();
	
	
	
	
	/**
	 * 获取AI交谈代理功能对象
	 * @return
	 */
	IAIChatAgentUtil getAgentUtil();
	
	
	
	/**
	 * 获取最后一次结果
	 * @return
	 */
	ChatCompletionResult getResult();
	
	
	
	/**
	 * 设置结果
	 * @param result
	 */
	void setResult(ChatCompletionResult result);
	
	
	
	/**
	 * 填充参数
	 * @param params
	 */
	void fillParams(Map<String, Object> params);
	
	
	
	/**
	 * 获取Session标识
	 * @return
	 */
	String getSessionId();
	
	
	/**
	 * 获取用户上下文
	 * @return
	 */
	IEmployeeContext getEmployeeContext();
	
	
	
	String getSystemId();
	
	
	int addRef();
	
	
	int releaseRef();
	
	
	ActionSession getActionSession();
	
	
	/**
	 * 获取业务范围
	 * @return
	 */
	String getBusinessScope();
	
	
	/**
	 * 获取聊天会话标识
	 * @return
	 */
	String getChatSessionId();
}
