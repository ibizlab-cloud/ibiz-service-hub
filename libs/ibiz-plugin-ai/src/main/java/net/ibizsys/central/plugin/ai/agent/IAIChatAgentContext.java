package net.ibizsys.central.plugin.ai.agent;

public interface IAIChatAgentContext extends IAIAgentContext {

	/**
	 * 输出指定模板
	 * @param strTemplateId
	 * @return
	 * @throws Exception
	 */
	String output(String strTemplateId) throws Throwable;
	
	
	/**
	 * 输出指定模板
	 * @param data
	 * @param strTemplateId
	 * @return
	 * @throws Exception
	 */
	String output(Object data, String strTemplateId) throws Throwable;
	
	
	
	/**
	 * 输出指定模板
	 * @param data
	 * @param strTemplateId
	 * @param strIndent
	 * @return
	 * @throws Exception
	 */
	String output(Object data, String strTemplateId, String strIndent) throws Throwable;
	
	
	
	
	
	/**
	 * 判断指定模板是否存在
	 * @param strTemplateId
	 * @return
	 */
	boolean contains(String strTemplateId);
}
