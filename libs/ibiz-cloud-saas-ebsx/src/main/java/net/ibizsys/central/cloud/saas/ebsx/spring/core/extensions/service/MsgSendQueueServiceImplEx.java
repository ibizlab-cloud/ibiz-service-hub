package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudNotifyClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgSendQueueDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.MsgSendQueueServiceImpl;

@Priority(100)
@Service
public class MsgSendQueueServiceImplEx extends MsgSendQueueServiceImpl { 

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MsgSendQueueServiceImplEx.class);
	private ICloudNotifyClient iCloudNotifyClient = null;
	
	
	protected ICloudNotifyClient getCloudNotifyClient() {
		if(this.iCloudNotifyClient == null) {
			ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			this.iCloudNotifyClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_TASK, ICloudNotifyClient.class);
		}
		return this.iCloudNotifyClient;
	}

	@Override
	protected void onSend(MsgSendQueueDTO dto) throws Throwable {
		this.get(dto.getMsgSendQueueId());
		this.getCloudNotifyClient().sendMsg(dto.getMsgSendQueueId());
	}
}

