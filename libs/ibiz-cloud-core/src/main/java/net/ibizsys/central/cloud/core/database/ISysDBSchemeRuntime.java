package net.ibizsys.central.cloud.core.database;

public interface ISysDBSchemeRuntime extends net.ibizsys.central.database.ISysDBSchemeRuntime {

	/**
	 * 是否自更新数据库体系
	 * @return
	 */
	public boolean isSelfUpdateSchema();
}
