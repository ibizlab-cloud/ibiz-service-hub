package net.ibizsys.central.ba;

/**
 * 系统大数据体系运行时上下文对象
 * @author lionlau
 *
 */
public interface ISysBDSchemeRuntimeContext {

	/**
	 * 获取系统数据库运行时对象
	 * @return
	 */
	ISysBDSchemeRuntime getSysBDSchemeRuntime();
}
