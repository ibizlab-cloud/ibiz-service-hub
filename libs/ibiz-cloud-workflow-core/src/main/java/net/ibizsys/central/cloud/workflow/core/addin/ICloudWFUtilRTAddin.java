package net.ibizsys.central.cloud.workflow.core.addin;

import net.ibizsys.central.cloud.workflow.core.cloudutil.ICloudWFUtilRuntimeContext;

/**
 * 云服务工作流组件插件对象
 * @author lionlau
 *
 */
public interface ICloudWFUtilRTAddin {

	/**
	 * 初始化运行时插件对象
	 * @param iCloudFlowableUtilRuntime
	 * @param pluginData
	 * @throws Exception
	 */
	void init(ICloudWFUtilRuntimeContext iCloudWFUtilRuntimeContext, Object pluginData) throws Exception;
}
