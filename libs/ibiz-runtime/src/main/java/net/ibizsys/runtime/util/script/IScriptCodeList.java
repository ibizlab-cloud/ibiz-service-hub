package net.ibizsys.runtime.util.script;

import net.ibizsys.runtime.codelist.ICodeListRuntime;

public interface IScriptCodeList extends IScriptUtil{

	/**
	 * 获取实际代码运行时对象 
	 * @return
	 */
	ICodeListRuntime getReal();
	
	/**
	 * 获取传入值的文本
	 * @param objValue
	 * @return
	 */
	String text(Object objValue);
	
	/**
	 * 获取指定代码项
	 * @param objValue
	 * @return
	 */
	IScriptCodeItem item(Object objValue);
	
	
	/**
	 * 获取指定代码项
	 * @param objValue
	 * @param bTryMode
	 * @return
	 */
	IScriptCodeItem item(Object objValue, boolean bTryMode);
	
	
//	/**
//	 * 获取项数量
//	 * @return
//	 */
//	int size();
//	
//	/**
//	 * 获取项数量
//	 * @return
//	 */
//	int getLength();
//	
//	
//	
//	IScriptCodeItem get(i);
}
