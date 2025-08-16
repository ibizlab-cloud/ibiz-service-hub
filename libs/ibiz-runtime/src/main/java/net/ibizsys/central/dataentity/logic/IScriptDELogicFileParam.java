package net.ibizsys.central.dataentity.logic;

public interface IScriptDELogicFileParam extends IScriptDELogicParam {


	/**
	 * 读取内容
	 * @return
	 */
	String read();
	
	/**
	 * 读出直接内容
	 * @return
	 */
	Object readRaw();
	
	
	
	/**
	 * 写入内容，从头写入
	 * @param content
	 * @return
	 */
	IScriptDELogicFileParam write(Object content);
	
	
	
	/**
	 * 附加内容，从尾部开始写入
	 * @param content
	 * @return
	 */
	IScriptDELogicFileParam append(Object content);
	
	
	/**
	 * 重置文件内容
	 * @return
	 */
	IScriptDELogicFileParam reset();
}
