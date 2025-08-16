package net.ibizsys.central.cloud.notify.core.addin;

import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 站内消息发送者
 * @author lionlau
 *
 */
public class SMSMsgSenderProxy extends MsgSenderBase{

	@Override
	protected String onSend(MsgSendQueue msgSendQueue) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public String getName() {
		return "短消息";
	}
}
