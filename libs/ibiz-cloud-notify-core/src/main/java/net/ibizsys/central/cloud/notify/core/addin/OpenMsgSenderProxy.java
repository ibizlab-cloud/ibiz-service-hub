package net.ibizsys.central.cloud.notify.core.addin;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOpenClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 开放平台消息发送者
 * 
 * @author lionlau
 *
 */
public class OpenMsgSenderProxy extends MsgSenderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OpenMsgSenderProxy.class);
	
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private ICloudOpenClient iCloudOpenClient = null;
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		if(this.getSysCloudClientUtilRuntime(true) == null) {
			this.prepareSysCloudClientUtilRuntime(false);
		}
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		return this.getSysCloudClientUtilRuntime(false);
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime(boolean bTryMode) {
		if(this.iSysCloudClientUtilRuntime != null || bTryMode) {
			return this.iSysCloudClientUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysCloudClientUtilRuntime(), String.format("[%1$s]未指定系统云体系客户端组件", this.getName()));
	}
	
	protected void setSysCloudClientUtilRuntime(ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime) {
		this.iSysCloudClientUtilRuntime = iSysCloudClientUtilRuntime;
	}
	
	protected void prepareSysCloudClientUtilRuntime(boolean bTryMode) throws Exception {
		this.setSysCloudClientUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, bTryMode));
	}
	
	protected ICloudOpenClient getCloudOpenClient() {
		if(this.iCloudOpenClient == null) {
			this.iCloudOpenClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_OPEN, ICloudOpenClient.class);
		}
		return this.iCloudOpenClient;
	}

	@Override
	protected String onSend(MsgSendQueue msgSendQueue) throws Throwable {
		String strDCSystemId = (String)msgSendQueue.get("dcsystemid");
		if(!StringUtils.hasLength(strDCSystemId)) {
			throw new Exception("消息未指定机构系统");
		}
		DCSystem dcSystem = this.getContext().getDCSystem(strDCSystemId);
		String strOpenAccessId = dcSystem.getAccessId();
		if(!StringUtils.hasLength(strOpenAccessId)) {
			throw new Exception("系统未绑定开放平台应用，忽略发送消息");
		}
		
		getCloudOpenClient().sendMessages(strOpenAccessId, new MsgSendQueue[] {msgSendQueue});
		return "发送成功";
	}

	@Override
	public String getName() {
		return "开放平台消息";
	}
}
