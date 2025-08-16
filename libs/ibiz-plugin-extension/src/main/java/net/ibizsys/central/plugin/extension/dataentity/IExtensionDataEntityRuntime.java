package net.ibizsys.central.plugin.extension.dataentity;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;

public interface IExtensionDataEntityRuntime extends IDataEntityRuntime {

	/**
	 * 获取扩展标记
	 * @return
	 */
	String getExtensionTag();
}
