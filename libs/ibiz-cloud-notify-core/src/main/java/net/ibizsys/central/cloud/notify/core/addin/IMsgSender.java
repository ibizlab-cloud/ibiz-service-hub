package net.ibizsys.central.cloud.notify.core.addin;

import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 消息发送这对象插件
 * @author lionlau
 *
 */
public interface IMsgSender extends ICloudNotifyUtilRTAddin {

	/**
	 * 发送消息
	 * @param msgSendQueue
	 * @return
	 */
	String send(MsgSendQueue msgSendQueue);
	
}
