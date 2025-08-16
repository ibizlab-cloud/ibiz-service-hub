package net.ibizsys.central.util.script;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;

/**
 *  脚本逻辑运行时对象
 * @author lionlau
 *
 */
public interface IScriptLogicRuntime extends IModelRuntime{

	/**
	 * 初始化脚本逻辑运行时对象
	 * @param iSystemRuntime
	 * @param iModelRuntime
	 * @param strScript
	 * @param strLogicMode
	 * @throws Exception
	 */
	void init(ISystemRuntimeBase iSystemRuntimeBase, IModelRuntime iModelRuntime, String strScript, String strLogicMode) throws Exception;
	
	
	
	/**
	 * 初始化脚本逻辑运行时对象
	 * @param iSystemRuntime
	 * @param iModelRuntime
	 * @param strScriptEngine 脚本引擎
	 * @param strScript
	 * @param strLogicMode
	 * @throws Exception
	 */
	void init(ISystemRuntimeBase iSystemRuntimeBase, IModelRuntime iModelRuntime, String strScriptEngine, String strScript, String strLogicMode) throws Exception;
	
	
	/**
	 * 执行
	 * @param args
	 * @return
	 */
	Object execute(Object[] args);
	
	
	
	/**
	 * 获取逻辑模式
	 * @return
	 */
	String getLogicMode();
	
	
	
	
	/**
	 * 获取脚本引擎
	 * @return
	 */
	String getScriptEngine();
}
