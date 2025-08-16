package net.ibizsys.central.cloud.notify.core.addin;

import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.V2InternalMessage;

/**
 * 内部消息发送者
 * @author lionlau
 *
 */
public interface IInternalMsgSender extends IMsgSender {

	/**
	 * 发送内部消息
	 * @param v2InternalMessage
	 */
	V2InternalMessage send(V2InternalMessage v2InternalMessage);
	
	
	
	/**
	 * 标记内部消息已读
	 * @param strInternalMessageId 内部消息标识
	 * @param params
	 */
	V2InternalMessage markRead(String strInternalMessageId, Map<String, Object> params);
}
