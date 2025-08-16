package net.ibizsys.central.database;

/**
 * 系统数据库体系运行时上下文对象
 * @author lionlau
 *
 */
public interface ISysDBSchemeRuntimeContext {

	/**
	 * 获取系统数据库运行时对象
	 * @return
	 */
	ISysDBSchemeRuntime getSysDBSchemeRuntime();
}
