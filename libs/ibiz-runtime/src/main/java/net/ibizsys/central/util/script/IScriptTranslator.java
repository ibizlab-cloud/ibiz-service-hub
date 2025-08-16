package net.ibizsys.central.util.script;

import net.ibizsys.runtime.util.script.IScriptUtil;

/**
 * 用于脚本调用的系统值转换器对象接口
 * @author lionlau
 *
 */
public interface IScriptTranslator extends IScriptUtil{

	/**
	 * 输入转换
	 * @param value
	 * @return
	 */
	Object in(Object value);
	
	/**
	 * 输出转换
	 * @param value
	 * @return
	 */
	Object out(Object value);
}
