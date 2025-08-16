package net.ibizsys.central.sysutil;

import java.util.Collection;

import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 系统通知功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysNotifyUtilRuntime extends net.ibizsys.central.sysutil.ISysUtilRuntime{

	/**
	 * 发送消息
	 * @param msgSendQueues
	 */
	void sendMsg(MsgSendQueue[] msgSendQueues);
	
	
	
	/**
	 * 查询指定标识的消息队列数据，简单模式，返回处理时间、处理状态等信息
	 * @param ids
	 * @return
	 */
	Collection<MsgSendQueue> getMsg(String[] ids);
	
}
