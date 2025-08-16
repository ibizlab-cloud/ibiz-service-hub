package net.ibizsys.central.plugin.extension.dataentity.action;

import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.dataentity.action.DEActionRuntimeBase;

public abstract class ExtensionDEActionRuntimeBase extends DEActionRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ExtensionDEActionRuntimeBase.class);
	
	private ISysExtensionUtilRuntime iSysExtensionUtilRuntime = null;
	private ISysCloudExtensionUtilRuntime iSysCloudExtensionUtilRuntime = null;
	
	/**
	 * 获取系统扩展运行时
	 * @return
	 */
	protected ISysExtensionUtilRuntime getSysExtensionUtilRuntime() {
		if(this.iSysExtensionUtilRuntime == null) {
			this.iSysExtensionUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
		}
		return this.iSysExtensionUtilRuntime;
	}
	
	/**
	 * 获取系统Cloud扩展功能运行时
	 * @return
	 */
	protected ISysCloudExtensionUtilRuntime getSysCloudExtensionUtilRuntime() {
		if(this.iSysCloudExtensionUtilRuntime == null) {
			this.iSysCloudExtensionUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudExtensionUtilRuntime.class, false);
		}
		return this.iSysCloudExtensionUtilRuntime;
	}
	
	
	/**
	 * 获取Cloud扩展客户端
	 * @return
	 */
	protected ICloudExtensionClient getCloudExtensionClient() {
		return getSysCloudExtensionUtilRuntime().getCloudExtensionClient();
	}
}
