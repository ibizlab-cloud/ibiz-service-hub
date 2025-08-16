package net.ibizsys.central.service;

import net.ibizsys.central.util.script.IScriptLogicRuntime;

/**
 * 外部接口脚本逻辑运行时对象
 * @author lionlau
 *
 */
public interface ISubSysServiceAPIScriptLogicRuntime extends IScriptLogicRuntime{

	/**
	 * 逻辑模式：认证
	 */
	final static String LOGICMODE_AUTH = "AUTH";
	
	
	/**
	 * 逻辑模式：调用参数
	 */
	final static String LOGICMODE_METHODPARAM = "METHODPARAM";
	
	
	/**
	 * 逻辑模式：方法调用
	 */
	final static String LOGICMODE_METHOD = "METHOD";
	
}
