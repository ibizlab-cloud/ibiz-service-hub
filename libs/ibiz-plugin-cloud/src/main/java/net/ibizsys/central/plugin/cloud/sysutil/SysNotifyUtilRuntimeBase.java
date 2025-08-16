package net.ibizsys.central.plugin.cloud.sysutil;

import java.util.Collection;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudNotifyClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysNotifyUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.CarbonCopy;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 系统通知组件运行时对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class SysNotifyUtilRuntimeBase extends net.ibizsys.central.sysutil.SysNotifyUtilRuntimeBase implements ISysNotifyUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysNotifyUtilRuntimeBase.class);
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;

	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	@Override
	protected void prepareDefaultSetting() throws Exception {

	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();

	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

	protected ICloudNotifyClient getCloudNotifyClient() {
		return this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_NOTIFY, ICloudNotifyClient.class);
	}

	@Override
	protected void onSendMsg(MsgSendQueue[] msgSendQueues) throws Throwable {
		getCloudNotifyClient().sendMsg(msgSendQueues);
	}

	@Override
	protected Collection<MsgSendQueue> onGetMsg(String[] ids) throws Throwable {
		return getCloudNotifyClient().getMsg(ids);
	}

	@Override
	public void createTodo(Todo[] todos) {
		this.executeAction("建立待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onCreateTodo(todos);
				return null;
			}
		}, null);
	}

	
	protected void onCreateTodo(Todo[] todos) throws Throwable {
		getCloudNotifyClient().createTodo(todos);
	}

	@Override
	public void createCarbonCopy(CarbonCopy[] todos) {
		this.executeAction("建立抄送", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onCreateCarbonCopy(todos);
				return null;
			}
		}, null);
	}

	protected void onCreateCarbonCopy(CarbonCopy[] todos) throws Throwable {
		getCloudNotifyClient().createCarbonCopy(todos);
	}
	
	
}
