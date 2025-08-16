package net.ibizsys.runtime.dataentity.action;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemUtilRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.script.ISystemRTScriptContext;

/**
 * 脚本逻辑运行时对象
 * @author lionlau
 *
 */
public interface IDEScriptLogicRuntime extends IModelRuntime{

	/**
	 * 逻辑模式：实体处理逻辑
	 */
	public final static String LOGICMODE_DELOGIC = "DELOGIC";
	
	/**
	 * 逻辑模式：实体行为附加逻辑
	 */
	public final static String LOGICMODE_DEACTIONLOGIC = "DEACTIONLOGIC";
	
	
	/**
	 * 逻辑模式：属性计算逻辑
	 */
	public final static String LOGICMODE_DEFCOMPUTE = "DEFCOMPUTE";
	
	/**
	 * 逻辑模式：属性默认值逻辑
	 */
	public final static String LOGICMODE_DEFDEFAULT = "DEFDEFAULT";
	
	/**
	 * 逻辑模式：属性检查逻辑
	 */
	public final static String LOGICMODE_DEFCHECK = "DEFCHECK";
	
	/**
	 * 逻辑模式：属性值变化触发逻辑
	 */
	public final static String LOGICMODE_DEFONCHANGE = "DEFONCHANGE";
	
	
	/**
	 * 逻辑模式：属性表达式
	 */
	public final static String LOGICMODE_DEFEXPRESSION = "DEFEXPRESSION";
	
	
	/**
	 * 逻辑模式：实体行为参数表达式
	 */
	public final static String LOGICMODE_DEACTIONPARAM = "DEACTIONPARAM";
	
	/**
	 * 逻辑模式：实体数据集参数表达式
	 */
	public final static String LOGICMODE_DEDATASETPARAM = "DEDATASETPARAM";
	
	/**
	 * 初始化脚本逻辑运行时对象
	 * @param iSystemRTScriptContext
	 * @param iDataEntityRuntime
	 * @param strScript
	 * @throws Exception
	 */
	void init(ISystemRTScriptContext iSystemRTScriptContext, IDataEntityRuntime iDataEntityRuntime, String strLogicMode, String strScript) throws Exception;
	
	
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
	 * 获取脚本引擎类型
	 * @return
	 */
	default String getScriptEngine() {
		return ISystemUtilRuntime.SCRIPTENGINE_JAVASCRIPT;
	}
}
