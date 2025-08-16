package net.ibizsys.central.dataentity.logic;

import net.ibizsys.runtime.util.script.IScriptUtil;

public interface IDELogicScriptNodeRuntimeContext extends IScriptUtil{

	/**
	 * 获取参数对象
	 * @param strName
	 * @return
	 */
	Object getParam(String strName);
	
	
	
	/**
	 * 设置参数值
	 * @param objValue
	 */
	IDELogicScriptNodeRuntimeContext setParam(String strName, Object objValue);
	
	
	/**
	 * 重新新建参数对象
	 * @param strName
	 * @return
	 */
	Object renewParam(String strName);
	
	
	
	/**
	 *重置参数对象
	 * @param strName
	 * @return
	 */
	IDELogicScriptNodeRuntimeContext resetParam(String strName);
	
	
	/**
	 *对指定参数输出调试信息
	 * @param strName
	 * @return
	 */
	IDELogicScriptNodeRuntimeContext debugParam(String strName);
	
	
	
	/**
	 * 输出调试信息
	 * @param strInfo
	 */
	IDELogicScriptNodeRuntimeContext debug(String strInfo);
}
