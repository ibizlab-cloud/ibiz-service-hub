package net.ibizsys.runtime.util;

import java.util.Map;

import net.ibizsys.runtime.util.script.IScriptUtil;

/**
 * 应用上下文对象接口
 * @author lionlau
 *
 */
public interface IAppContext extends IEntity, IScriptUtil{

	/**
	 * 直接获取原始数据Map对象
	 * @return
	 */
	Map<String, Object> any();
}
