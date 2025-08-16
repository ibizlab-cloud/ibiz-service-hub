package net.ibizsys.central.cloud.core.database;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.central.database.ISysDBSchemeRuntime;



/**
 * 系统数据库体系结构同步适配器接口对象
 * @author lionlau
 *
 */
public interface ISysDBSchemeSyncAdapter {

	/**
	 * 同步数据结构
	 * @param iSystemRuntime
	 * @param iSysDBSchemeRuntime
	 * @param dataSource
	 * @param objTag
	 * @throws Throwable
	 */
	void sync(ISystemRuntime iSystemRuntime, ISysDBSchemeRuntime iSysDBSchemeRuntime, DataSource dataSource, Object objTag) throws Throwable;
}
