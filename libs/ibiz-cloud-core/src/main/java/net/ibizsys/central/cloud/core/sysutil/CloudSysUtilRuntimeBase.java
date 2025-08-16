package net.ibizsys.central.cloud.core.sysutil;

import org.apache.commons.logging.LogFactory;

/**
 * 基于云端服务的系统功能组件运行时基类
 * @author lionlau
 *
 */
public abstract class CloudSysUtilRuntimeBase extends SysUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudSysUtilRuntimeBase.class);
	
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
}
