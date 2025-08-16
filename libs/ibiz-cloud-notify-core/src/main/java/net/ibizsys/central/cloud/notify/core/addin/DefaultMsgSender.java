package net.ibizsys.central.cloud.notify.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 站内消息发送者
 * 
 * @author lionlau
 *
 */
public class DefaultMsgSender extends MsgSenderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DefaultMsgSender.class);
	
	private String strName = null;
	@Override
	protected void onInit() throws Exception {
		this.strName = String.format("消息发送者[%1$s]", this.getAddinData());
		super.onInit();
	}

	@Override
	protected String onSend(MsgSendQueue msgSendQueue) throws Throwable {
		return "未进行任何操作";
	}

	@Override
	public String getName() {
		return this.strName;
	}
}
