package net.ibizsys.runtime.util.script;

public interface IScriptAppContext extends IScriptUtil{

	/**
	 * 设置上下文
	 * @param strName
	 * @param strValue
	 * @return
	 */
	IScriptAppContext set(String strName, String strValue);
	
	
	/**
	 * 获取指定上下文
	 * @param strName
	 * @return
	 */
	String get(String strName);
}
