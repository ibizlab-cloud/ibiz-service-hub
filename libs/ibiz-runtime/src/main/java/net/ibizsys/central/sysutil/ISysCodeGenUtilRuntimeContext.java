package net.ibizsys.central.sysutil;

/**
 * 系统代码生成功能运行时上下文对象接口
 * @author lionlau
 *
 */
public interface ISysCodeGenUtilRuntimeContext {

	/**
	 * 
	 * @param data
	 * @param strTemplateId
	 * @param param
	 * @return
	 * @throws Exception
	 */
	String output(Object data, String strTemplateId) throws Throwable;
	
	
	
	/**
	 * 
	 * @param data
	 * @param strTemplateId
	 * @param strIndent
	 * @param param
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
