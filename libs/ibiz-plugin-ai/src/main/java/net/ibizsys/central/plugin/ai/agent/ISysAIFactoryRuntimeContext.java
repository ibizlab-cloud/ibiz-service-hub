package net.ibizsys.central.plugin.ai.agent;

import java.io.File;
import java.util.Map;

public interface ISysAIFactoryRuntimeContext extends net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntimeContext {

	
	
	/**
	 * 获取Python命令路径
	 * @return
	 */
	String getPythonCommandPath();
	
	
	
	/**
	 * 执行工具调用
	 * @param command
	 * @param args
	 * @param params 更多参数
	 * @return
	 * @throws Throwable
	 */
	Object toolCall(String command, Map<String, Object> args, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 获取技能聊天会话内容
	 * @param skillId
	 * @param chatSessionId
	 * @return
	 */
	default String getSkillChatSessionContent(String skillId, String chatSessionId) {
		return getSkillChatSessionContent(skillId, chatSessionId, null);
	}
	
	
	/**
	 * 获取技能聊天会话内容
	 * @param skillId
	 * @param chatSessionId
	 * @param defaultContent 如果传入为null，则使用系统无内容信息
	 * @return
	 */
	String getSkillChatSessionContent(String skillId, String chatSessionId, String defaultContent);
	
	
	/**
	 * 更新技能聊天会话内容
	 * @param skillId
	 * @param chatSessionId
	 * @param content
	 * @return
	 */
	void updateSkillChatSessionContent(String skillId, String chatSessionId, String content);
	
	
	/**
	 * 获取技能工作目录
	 * @return
	 */
	File getSkillsWorkspace();
	
	
	/**
	 * 获取技能工作目录
	 * @param local 本地目录
	 * @return
	 */
	File getSkillsWorkspace(boolean local);
	
	
	
	/**
	 * 获取技能运行器数据
	 * @return
	 */
	Map<String, String> getSkillRunnerData(); 
	
	
	/**
	 * 获取技能的环境
	 * @return
	 */
	Map<String, Object> getSkillEnv();
	
	/**
	 * 是否启用技能检测
	 * @return
	 */
	boolean isEnableSkillDetection();
	
	
	/**
	 * 是否支持知识库
	 * @return
	 */
	boolean isEnableKnowledgeBase();
}
