package net.ibizsys.central.cloud.core.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin2;

/**
 * CLoud功能组件运行时插件接口
 * @author lionlau
 *
 */
public interface ICloudUtilRTAddin extends IModelRTAddin2{

	/**
	 * 重新加载设置
	 */
	void reloadSetting() throws Throwable;
}
