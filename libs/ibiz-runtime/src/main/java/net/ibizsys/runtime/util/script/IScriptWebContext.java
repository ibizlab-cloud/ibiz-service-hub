package net.ibizsys.runtime.util.script;

public interface IScriptWebContext extends IScriptUtil{

	/**
	  * 获取参数
	 * @param name
	 * @return
	 */
	String parameter(String name);
	 
	
	/**
	 * 获取参数值集合
	 * @param name
	 * @param arrayMode 数据模式
	 * @return
	 */
	Object parameter(String name, boolean arrayMode);
	
	
	
	
	/**
	 * 获取参数名称集合
	 * @return
	 */
	String[] getParameters();
	
	
	/**
	 * 获取返回头信息
	 * @param name
	 * @return
	 */
	String header(String name);
	
	
	/**
	 * 获取返回头信息
	 * @param name
	 * @return
	 */
	Object header(String name, boolean arrayMode);
	
	
	/**
	 * 获取返回头名称集合
	 * @return
	 */
	String[] getHeaders();
	
}
