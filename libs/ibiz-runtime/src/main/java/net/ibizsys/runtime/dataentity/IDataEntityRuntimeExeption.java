package net.ibizsys.runtime.dataentity;

import net.ibizsys.runtime.ISystemRuntimeException;

/**
 * 实体运行时异常对象接口
 * @author lionlau
 *
 */
public interface IDataEntityRuntimeExeption extends ISystemRuntimeException {

	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntimeBase getDataEntityRuntime();
}
