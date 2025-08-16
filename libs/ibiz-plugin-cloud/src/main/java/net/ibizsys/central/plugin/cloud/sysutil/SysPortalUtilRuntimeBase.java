package net.ibizsys.central.plugin.cloud.sysutil;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudPortalClient;
import net.ibizsys.central.cloud.core.sysutil.CloudSysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统门户组件运行时对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class SysPortalUtilRuntimeBase extends CloudSysUtilRuntimeBase implements ISysPortalUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysPortalUtilRuntimeBase.class);
	private ICloudPortalClient iCloudPortalClient = null;
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	@Override
	protected void prepareDefaultSetting() throws Exception {

	}

	protected ICloudPortalClient getCloudPortalClient() {
		if(this.iCloudPortalClient == null) {
			this.iCloudPortalClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_PORTAL, ICloudPortalClient.class);
		}
		return this.iCloudPortalClient;
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
	}

	@Override
	public String getLogicName() {
		return String.format("系统门户功能组件[%1$s]", this.getName());
	}

	
	@Override
	public PortalAsyncAction createAsyncAction(PortalAsyncAction action) {
		return this.executeAction("建立异步操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateAsyncAction(action);
			}
		}, null, PortalAsyncAction.class);
	}

	protected PortalAsyncAction onCreateAsyncAction(PortalAsyncAction action) throws Throwable{
		return getCloudPortalClient().createAsyncAction(action);
	}
	
	@Override
	public PortalAsyncAction executeAsyncAction(PortalAsyncAction action) {
		return this.executeAction("执行异步操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteAsyncAction(action);
			}
		}, null, PortalAsyncAction.class);
	}
	
	protected PortalAsyncAction onExecuteAsyncAction(PortalAsyncAction action) throws Throwable{
		return getCloudPortalClient().executeAsyncAction(action.getAsyncAcitonId(), action);
	}
	

	@Override
	public PortalAsyncAction errorAsyncAction(PortalAsyncAction action) {
		return this.executeAction("标记异步操作错误", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onErrorAsyncAction(action);
			}
		}, null, PortalAsyncAction.class);
	}

	protected PortalAsyncAction onErrorAsyncAction(PortalAsyncAction action) throws Throwable{
		return getCloudPortalClient().errorAsyncAction(action.getAsyncAcitonId(), action);
	}
	
	@Override
	public PortalAsyncAction finishAsyncAction(PortalAsyncAction action) {
		return this.executeAction("标记异步操作完成", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFinishAsyncAction(action);
			}
		}, null, PortalAsyncAction.class);
	}
	
	protected PortalAsyncAction onFinishAsyncAction(PortalAsyncAction action) throws Throwable{
		return getCloudPortalClient().finishAsyncAction(action.getAsyncAcitonId(), action);
	}
	

	@Override
	public PortalAsyncAction getAsyncAction(String id) {
		return this.executeAction("获取异步操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAsyncAction(id);
			}
		}, null, PortalAsyncAction.class);
	}
	
	protected PortalAsyncAction onGetAsyncAction(String id) throws Throwable{
		return this.getCloudPortalClient().getAsyncAction(id);
	}
	

		
	

}
