package net.ibizsys.central.util.script;

import net.ibizsys.runtime.util.script.IScriptObject;

public interface IScriptWebResponse extends IScriptObject{

	/**
	 * 获取反馈体
	 * @return
	 */
	Object getBody();
	
	
	/**
	 * 设置反馈体
	 * @param body
	 */
	void setBody(Object body);
	
	
	/**
	 * 设置反馈体
	 * @param body
	 * @return
	 */
	IScriptWebResponse body(Object body);
	
	
	/**
	 * 获取反馈代码
	 * @return
	 */
	int getCode();
	
	
	/**
	 * 设置反馈代码
	 * @param body
	 */
	void setCode(int code);
	
	
	/**
	 * 设置反馈代码
	 * @param code
	 * @return
	 */
	IScriptWebResponse code(int code);
	
	
	
	/**
	 * 获取反馈内容类型
	 * @return
	 */
	String getType();
	
	
	/**
	 * 设置反馈内容类型
	 * @param body
	 */
	void setType(String type);
	
	
	/**
	 * 设置反馈内容类型
	 * @param type
	 * @return
	 */
	IScriptWebResponse type(String type);
	
	
	
	/**
	 * 设置头部内容
	 * @param name
	 * @param value
	 * @return
	 */
	IScriptWebResponse set(String name, String value);
	
	
	
	/**
	 * 附加头部内容
	 * @param name
	 * @param value
	 * @return
	 */
	IScriptWebResponse add(String name, String value);
	
	
	/**
	 * 设置头部内容
	 * @param name
	 * @param value
	 * @return
	 */
	IScriptWebResponse set(String name, String[] value);
	
	
	
	/**
	 * 附加头部内容
	 * @param name
	 * @param value
	 * @return
	 */
	IScriptWebResponse add(String name, String[] value);
	
	
	
	/**
	 * 重置头部内容
	 * @param name
	 * @return
	 */
	IScriptWebResponse reset(String name);
	
	
	/**
	 * 获取头部内容
	 * @param name
	 * @return
	 */
	String get(String name);
	
	
	/**
	 * 获取头部内容
	 * @param name
	 * @param arrayMode 数组模式
	 * @return
	 */
	Object get(String name, boolean arrayMode);
	
	
	
	/**
	 * 获取头部名称集合
	 * @return
	 */
	String[] getNames();
	
}
