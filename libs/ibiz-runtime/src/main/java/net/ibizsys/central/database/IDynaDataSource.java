package net.ibizsys.central.database;

import javax.sql.DataSource;

/**
 * 动态数据源
 * @author lionlau
 *
 */
public interface IDynaDataSource {

	/**
	 * 获取默认数据源
	 * @return
	 */
	DataSource getDefaultDataSource();
}
