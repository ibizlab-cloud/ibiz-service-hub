package net.ibizsys.runtime.plugin;

import net.ibizsys.runtime.util.IAction;

/**
 * 模型运行时脚本对象接口
 * @author lionlau
 *
 */
public interface IModelRTScript {

	/**
	 * 执行之前，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ATTACHMODE_BEFORE = "BEFORE";
	
	/**
	 * 执行之后，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ATTACHMODE_AFTER = "AFTER";
	
	/**
	 * 替换执行，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ATTACHMODE_EXECUTE = "EXECUTE";
	
	/**
	 * 默认方法，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String METHOD_EXECUTE = "EXECUTE";
	
	/**
	 * 执行默认执行功能的代码块
	 * @param args
	 * @return
	 */
	Object call(Object... args);
	
	
	/**
	 * 执行执行函数名称及模式的代码块
	 * @param strMethodName
	 * @param strAttachMode
	 * @param args
	 * @return
	 */
	Object call(String strMethodName, String strAttachMode, Object... args);
	
	
	
	/**
	 * 是否存在指定函数名称及模式的代码块
	 * @param strMethodName
	 * @param strAttachMode
	 * @return
	 */
	boolean contains(String strMethodName, String strAttachMode);
	
	
	/**
	 * 是否存在指定函数名称相关模式的代码块
	 * @param strMethodName
	 * @return
	 */
	boolean support(String strMethodName);
	
	
	/**
	 * 环绕调用指定方法
	 * @param strMethodName
	 * @param iAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object callAround(String strMethodName, IAction iAction, Object... args) throws Throwable;
}
