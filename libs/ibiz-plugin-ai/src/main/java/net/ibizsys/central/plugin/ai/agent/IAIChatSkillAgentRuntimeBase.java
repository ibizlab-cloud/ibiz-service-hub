package net.ibizsys.central.plugin.ai.agent;

import java.util.Map;

import net.ibizsys.central.cloud.core.ai.IAISkillAgentRuntimeBase;

public interface IAIChatSkillAgentRuntimeBase extends IAISkillAgentRuntimeBase{
	
	/**
	 * 交谈会话标识
	 */
	public final static String HEADER_CHATSESSIONID = "srfchatsessionid";
	
	/**
	 * 交谈业务数据范围
	 */
	public final static String HEADER_SCOPE = "srfscope";
	
	
	/**
	 * 技能及SESSION文件
	 */
	public static String SKILLWITHSESSIONFILE = "SKILL_SESSION.md";
	
	
	
	

	public final static String TEMPLATE_PARAM_SKILLS = "skills";
	public final static String TEMPLATE_PARAM_SKILLS_WORKSPACE = "skills_workspace";
	public final static String TEMPLATE_PARAM_SKILL_RUNNER = "skill_runner";
	public final static String TEMPLATE_PARAM_SKILL_ENV = "skill_env";
	public final static String TEMPLATE_PARAM_BUSINESS_SCOPE = "business_scope";

	public final static String SKILLS_WORKSPACE = "SKILLS_WORKSPACE";
	
	public final static String MEMORYFILE_RESIDENT = "memory/resident.md";
	
	public final static String MEMORYFILE_REGULAR = "memory/regular.md";
	
	public final static String MEMORYFILE_SESSION = "memory/session.md";
	
	public final static String PROFILEFILE = "PROFILE.yaml";
	
	/**
	 * 工具调用
	 * @param command
	 * @param args
	 * @param request
	 * @param response
	 * @return
	 * @throws Throwable
	 */
	Object toolCall(String command, Map<String, Object> args) throws Throwable;
	
	
	
	/**
	 * 获取读我
	 * @return
	 */
	java.lang.String getReadme();
	
	
	
	/**
	 * 获取技能提示词
	 * @return
	 */
	java.lang.String getSkillPrompt();

}
