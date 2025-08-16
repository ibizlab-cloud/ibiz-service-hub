package net.ibizsys.central.sysutil;

import java.util.Map;

import net.ibizsys.central.res.ISysFileResourceRuntime;

/**
 * 系统代码生成功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysCodeGenUtilRuntime extends ISysUtilRuntime{

	
	/**
	 * 功能行为：生成代码
	 */
	public static String ACTION_GENERATE = "GENERATE";
	
	
	
	/**
	 * 参数：指定生成代码的目标路径
	 */
	public static String PARAM_GENERATE_DSTPATH = "dstpath";
	
//	/**
//	 * 获取模板路径
//	 * @return
//	 */
//	String getTemplatePath();
	
	
	/**
	 * 获取模板文件资源运行时对象
	 * @param bTryMode 尝试模式 
	 * @return
	 */
	ISysFileResourceRuntime getTemplSysFileResourceRuntime(boolean bTryMode);
	
	
	/**
	 * 获取输出代码文件资源运行时对象
	 * @param bTryMode 尝试模式 
	 * @return
	 */
	ISysFileResourceRuntime getCodeSysFileResourceRuntime(boolean bTryMode);
	
	
	/**
	 * 生成代码
	 * @param target 上下文数据
	 * @param params
	 */
	void generate(Object target, Map<String, Object> params);
	
	
	
//	/**
//	 *  输出内容
//	 * @param data
//	 * @param strOutputPath
//	 * @param filters
//	 * @param fileMap
//	 * @param bIgnoreException
//	 * @throws Exception
//	 */
//	void output(Object data, String strOutputPath, Object[] filters, Map<String, Object> fileMap, boolean bIgnoreException) throws Throwable;
//	
//	
//	
//	/**
//	 * 对传入模型对象的进行模板发布
//	 * @param data
//	 * @param strTemplateId
//	 * @param params 额外参数
//	 * @return
//	 * @throws Exception
//	 */
//	String getContent(Object data, String strTemplateId, Map<String, Object> params) throws Throwable;
	
}
