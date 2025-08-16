package net.ibizsys.central.dataentity.logic;

import net.ibizsys.central.util.script.ISystemRTScriptContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 实体逻辑自定义脚本运行时对象接口
 * @author lionlau
 *
 */
public interface IDELogicScriptNodeRuntime extends IModelRuntime{

	/**
	 * 实体逻辑脚本模式：表达式
	 */
	final static String MODE_EXPRESSION = "EXPRESSION";
	
	
	/**
	 * 实体逻辑脚本模式：代码
	 */
	final static String MODE_CODE = "CODE";
	
	/**
	 * 初始化脚本逻辑运行时对象
	 * @param iSystemRTScriptContext
	 * @param iDELogicNodeRuntime
	 * @param strScript
	 * @param strMode 模式
	 * @throws Exception
	 */
	void init(ISystemRTScriptContext iSystemRTScriptContext, IDELogicNodeRuntime iDELogicNodeRuntime, String strScriptEngine, String strScript, String strMode) throws Exception;
	
	
	/**
	 * 初始化脚本逻辑运行时对象
	 * @param iSystemRTScriptContext
	 * @param iDELogicNodeRuntime
	 * @param strScript
	 * @param strMode 模式
	 * @throws Exception
	 */
	void init(ISystemRTScriptContext iSystemRTScriptContext, IDELogicNodeRuntime iDELogicNodeRuntime, String strScript, String strMode) throws Exception;
	
	
	
	/**
	 * 执行代码
	 * @param iDELogicRuntimeContext
	 * @param iDELogicSession
	 * @param iPSDELogicNode
	 * @throws Throwable
	 */
	Object execute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSModelObject iPSModelObject) throws Throwable;
}
