package net.ibizsys.central.cloud.core.ai;

public interface IAIAgentRuntimeBaseContext {

	/**
	 * 模板上下文参数：当前数据
	 */
	public final static String TEMPLATE_PARAM_DATA = "data";

	/**
	 * 模板上下文参数：上下文对象
	 */
	public final static String TEMPLATE_PARAM_CTX = "ctx";
	
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
	 * 输出指定模板，直接输出
	 * @param strTemplateId
	 * @return
	 * @throws Exception
	 */
	String outputRaw(String strTemplateId) throws Throwable;
	
	
	
	/**
	 * 输出指定模板，直接输出
	 * @param strTemplateId
	 *  @param strIndent
	 * @return
	 * @throws Exception
	 */
	String outputRaw(String strTemplateId, String strIndent) throws Throwable;
	
	
	/**
	 * 判断指定模板是否存在
	 * @param strTemplateId
	 * @return
	 */
	boolean contains(String strTemplateId);
}
