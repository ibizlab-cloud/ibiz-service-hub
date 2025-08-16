package net.ibizsys.central.codelist;

import net.ibizsys.central.dataentity.IDataEntityRuntime;

public interface IDEMainStateCodeListRuntime extends IDynamicCodeListRuntime{

	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
}
