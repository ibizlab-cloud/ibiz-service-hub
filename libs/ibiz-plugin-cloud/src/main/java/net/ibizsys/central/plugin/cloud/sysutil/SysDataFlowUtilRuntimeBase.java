package net.ibizsys.central.plugin.cloud.sysutil;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudDataFlowClient;
import net.ibizsys.central.cloud.core.sysutil.CloudSysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.ISysDataFlowUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统DataFlow组件运行时对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class SysDataFlowUtilRuntimeBase extends CloudSysUtilRuntimeBase implements ISysDataFlowUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysDataFlowUtilRuntimeBase.class);
	private ICloudDataFlowClient iCloudDataFlowClient = null;

	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	@Override
	protected void prepareDefaultSetting() throws Exception {

	}

	protected ICloudDataFlowClient getCloudDataFlowClient() {
		if (this.iCloudDataFlowClient == null) {
			this.iCloudDataFlowClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DATAFLOW, ICloudDataFlowClient.class);
		}
		return this.iCloudDataFlowClient;
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
	}

	@Override
	public String getLogicName() {
		return String.format("系统DataFlow功能组件[%1$s]", this.getName());
	}
	
	@Override
	public PortalAsyncAction start(String id, Object params) {
		return this.start(DATAFLOWPLATFORM_DEFAULT, id, params);
	}

	@Override
	public PortalAsyncAction start(String type, String id, Object params) {
		return this.executeAction("启动数据流", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onStart(type, id, params);
			}
		}, null, PortalAsyncAction.class);
	}

	protected PortalAsyncAction onStart(String type, String id, Object params) throws Throwable {
		return this.getCloudDataFlowClient().start(type, id, params);
	}

}
