package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgSendQueueDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgSendQueueHisDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.MsgSendQueueHisServiceImpl;
import net.ibizsys.runtime.util.IAction;

@Priority(100)
@Service
public class MsgSendQueueHisServiceImplEx extends MsgSendQueueHisServiceImpl { 

	@Override
	protected void onResend(MsgSendQueueHisDTO dto) throws Throwable {

		MsgSendQueueHisDTO last = this.get(dto.getMsgSendQueueHisId());
		
		MsgSendQueueDTO msgSendQueue = new MsgSendQueueDTO();
		last.copyTo(msgSendQueue);
		msgSendQueue.setMsgSendQueueName(last.getMsgSendQueueHisName());
		//置空发送时间等
		msgSendQueue.setIsError(0);
		msgSendQueue.setIsSend(0);
		msgSendQueue.setErrorInfo(null);
		msgSendQueue.setPlanSendTime(null);
		msgSendQueue.setProcessTime(null);
		
		this.getTransactionalUtil().required_new(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				getSystemRuntime().getMsgSendQueueService().create(msgSendQueue);
				return null;
			}
		}, null);
		
		
		this.getSystemRuntime().getMsgSendQueueService().send(msgSendQueue);
	}

}

