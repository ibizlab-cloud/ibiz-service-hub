package net.ibizsys.runtime.msg;

import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 系统消息队列运行时
 * @author lionlau
 *
 */
public interface ISysMsgQueueRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化消息队列运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSSysMsgQueue
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysMsgQueue iPSSysMsgQueue) throws Exception;

	

	
	/**
	 * 发送消息
	 * @param msgSendQueues
	 */
	void send(MsgSendQueue[] msgSendQueues);
	
	
	
	/**
	 * 查询指定标识的消息队列数据，简单模式，返回处理时间、处理状态等信息
	 * @param ids
	 * @return
	 */
	MsgSendQueue[] listSimple(String[] ids);
	
}
