package net.ibizsys.central.plugin.ai.agent;

import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.AccessToken;

public interface ISysAIFactoryRuntime extends net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime {

	/**
	 * 技能运行器：侦听消息Topic
	 */
	public final String SKILLRUNNER_REGISTRATION_LISTEN_TOPIC = "listen_topic";
	
	
	/**
	 * 技能运行器：结果回送Topic
	 */
	public final String SKILLRUNNER_REGISTRATION_RESULT_TOPIC = "result_topic";
	
	/**
	 * 技能运行器数据：工作目录
	 */
	public final String SKILLRUNNER_WORKSPACE = "workspace";
	
	/**
	 * 技能运行器数据：标题
	 */
	public final String SKILLRUNNER_TOPIC = "topic";

	
	/**
	 * 获取Webhook访问凭证
	 * @param strToken
	 * @param tryMode
	 * @return
	 */
	AccessToken getWebhookAccessToken(String strToken, boolean tryMode);
	
	
	/**
	 * 注册技能运行器
	 * @param params
	 * @return
	 */
	Object registerSkillRunner(Map<String, Object> params);
	
	
	/**
	 * 注销技能运行器
	 * @param params
	 * @return
	 */
	Object unregisterSkillRunner(Map<String, Object> params);
	
	
	/**
	 * 激活技能运行器
	 * @param params
	 * @return
	 */
	Object activeSkillRunner(Map<String, Object> params);
}
