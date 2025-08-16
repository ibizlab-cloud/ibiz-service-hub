package net.ibizsys.central.util.script;

import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.IScriptUtil;

/**
 * 用于脚本调用的系统值序列对象接口
 * @author lionlau
 *
 */
public interface IScriptSequence extends IScriptUtil{

	/**
	 * 获取值
	 * @return
	 */
	Object value();
	
	/**
	 * 获取值
	 * @return
	 */
	Object value(IScriptEntity iScriptEntity);
}
