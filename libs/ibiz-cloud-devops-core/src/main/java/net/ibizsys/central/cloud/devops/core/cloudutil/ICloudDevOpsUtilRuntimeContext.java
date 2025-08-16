package net.ibizsys.central.cloud.devops.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.centralstudio.util.PSModelServiceSession;

/**
 * 云体系DevOps运行时组件上下文对象接口
 * 
 * @author lionlau
 *
 */
public interface ICloudDevOpsUtilRuntimeContext extends ICloudUtilRuntimeContext {

	@Override
	ICloudDevOpsUtilRuntime getModelRuntime();

	/**
	 * 获取DevOps运行时对象
	 * 
	 * @return
	 */
	default ICloudDevOpsUtilRuntime getCloudDevOpsUtilRuntime() {
		return this.getModelRuntime();
	}

	/**
	 * 调用机构系统DevOps操作
	 * 
	 * @param strDCSystemId
	 * @param strMethod
	 * @param params
	 * @param strKey
	 * @return
	 */
	IWebClientRep<String> invokeDCSystemDevOpsAction(String strDCSystemId, String strMethod, Object params, String strKey);

	/**
	 * 开启平台模型服务会话
	 * 
	 * @return
	 */
	PSModelServiceSession openPSModelServiceSession();
}
