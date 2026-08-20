package net.ibizsys.central.plugin.ai.agent;

import java.io.File;
import java.util.Map;

import net.ibizsys.central.cloud.core.ai.ISysAIChatSkill;

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
	 * 获取技能工作目录
	 * @return
	 */
	String getSkillsWorkspacePath();
	
	
	/**
	 * 获取技能工作目录
	 * @param local 本地目录
	 * @return
	 */
	String getSkillsWorkspacePath(boolean local);
	
	
	
	/**
	 * 获取技能运行器数据（用户侧）
	 * @return
	 */
	Map<String, String> getSkillRunnerData(); 
	
	/**
	 * 获取技能运行器数据（通过业务域数据）
	 * @return
	 */
	Map<String, String> getSkillRunnerDataByBusinessScope(String businessScope);
	
	
	
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
	
	
	
	
	 /**
	  * 获取当前用户远程技能Map
	 * @return
	 */
	Map<String, ISysAIChatSkill> getRemoteAIChatSkills();
	
	
	
	/**
	 * 上传远程文件
	 * @param strSkillId
	 * @param args
	 * @param params
	 * @param realFile
	 * @throws Throwable
	 */
	void uploadRemoteFile(String strSkillId, Map<String, Object> args, Map<String, Object> params, File realFile) throws Exception;
	
	
	
	/**
	 * 读取远程文件
	 * @param strSkillId
	 * @param strFilePath
	 * @param  bFromTemplate
	 * @param bTryMode
	 * @throws Throwable
	 */
	String readRemoteFile(String strSkillId, String strFilePath, boolean bFromTemplate, boolean bTryMode) throws Exception;
	
	
	
	
	/**
	 * 获取技能环境变量
	 * @param strSkillId
	 * @param strProfile
	 * @param strUserId
	 * @return
	 */
	Map<String, Object> getSkillEnvironments(String strSkillId, String strProfileTag, String strUserId) throws Exception;
	
	
	
	/**
	 * 读取技能配置文件
	 * @param strSkillId
	 * @param strUserId
	 * @return
	 * @throws Exception
	 */
	String readSkillProfile(String strSkillId, String strUserId) throws Exception;
	
	
	/**
	 * 更新技能配置文件
	 * @param strSkillId
	 * @param strUserId
	 * @param strContent
	 * @return
	 * @throws Exception
	 */
	void updateSkillProfile(String strSkillId, String strUserId, String strContent) throws Exception;
	
	
	
	/**
	 * 获取当前技能运行器数据
	 * @return
	 */
	Map<String, String> getCurrentSkillRunnerData();
	
	
	
	
	/**
	 * 设置当前技能运行器数据
	 * @param data
	 */
	void setCurrentSkillRunnerData(Map<String, String> data);
	
	
	/**
	 * 获取当前业务域
	 * @return
	 */
	String getCurrentBusinessScope();
	
	
	
	
	/**
	 * 设置当前业务域
	 * @param strBusinessScope
	 */
	void setCurrentBusinessScope(String strBusinessScope);
}
