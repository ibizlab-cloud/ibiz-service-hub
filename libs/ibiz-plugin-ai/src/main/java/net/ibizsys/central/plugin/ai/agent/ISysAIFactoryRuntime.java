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
	 * 技能运行器数据：用户标识
	 */
	public final String SKILLRUNNER_USER_ID = "user_id";
	
	
	/**
	 * 技能运行器数据：操作系统类型
	 */
	public final String SKILLRUNNER_OS_TYPE = "os_type";
	
	
	/**
	 * 操作系统类型：Linux
	 */
	public final String OS_TYPE_LINUX = "Linux";
	
	
	/**
	 * 技能运行器数据：技能根路径
	 */
	public final String SKILLRUNNER_SKILLS_PATH = "skills_path";
	
	
	
	/**
	 * 技能运行器数据：标题
	 */
	public final String SKILLRUNNER_TOPIC = "topic";
	

	/**
	 * 技能运行器数据：技能集合
	 */
	public final String SKILLRUNNER_SKILLS = "skills";
	
	

	
	/**
	 * 技能运行器数据：业务范围（此键名不是存储至缓存，是上下文变量）
	 */
	public final String SKILLRUNNER_BUSINESS_SCOPE = "business_scope";
	
	
	
	/**
	 * 获取Webhook访问凭证
	 * @param strToken
	 * @param tryMode
	 * @return
	 */
	AccessToken getWebhookAccessToken(String strToken, boolean tryMode);
	
	
	/**
	 * 注册技能运行器
	 * @param strRunnerId 运行器标识
	 * @param params
	 * @return
	 */
	Object registerSkillRunner(String strRunnerId, Map<String, Object> params);
	
	
	/**
	 * 注销技能运行器
	 * @param strRunnerId 运行器标识
	 * @param params
	 * @return
	 */
	Object unregisterSkillRunner(String strRunnerId, Map<String, Object> params);
	
	
	/**
	 * 激活技能运行器
	 * @param strRunnerId 运行器标识
	 * @param params
	 * @return
	 */
	Object activeSkillRunner(String strRunnerId, Map<String, Object> params);
	
	
	
	/**
	 * 获取技能运行器状态
	 * @param strRunnerId
	 * @return
	 */
	Map<String, String> getSkillRunnerState(String strRunnerId);
	
	
	/**
	 * 获取技能运行器配置
	 * @return
	 */
	Map<String, Object> getSkillRunnerConfig();
	

	
	
	/**
	 * 通过业务范围获取技能运行器数据
	 * @param businessScope
	 * @return
	 */
	Map<String, String> getSkillRunnerDataByBusinessScope(String businessScope);
}
