package net.ibizsys.central.sysutil;

import java.util.Collection;

import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public abstract class SysNotifyUtilRuntimeBase extends SysUtilRuntimeBase implements ISysNotifyUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysNotifyUtilRuntimeBase.class);
	public final static TypeReference<MsgSendQueue[]> MsgSendQueuesType = new TypeReference<MsgSendQueue[]>() {};
	public final static TypeReference<Collection<MsgSendQueue>> MsgSendQueueListType = new TypeReference<Collection<MsgSendQueue>>() {};

	@Override
	public String getLogicName() {
		return String.format("系统通知功能组件[%1$s]", this.getName());
	}


	@Override
	public void sendMsg(MsgSendQueue[] msgSendQueues) {
		this.executeAction("发送消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSendMsg(msgSendQueues);
				return null;
			}
		}, null);
	}

	
	protected void onSendMsg(MsgSendQueue[] msgSendQueues) throws Throwable {
		throw new Exception("没有实现");
	}
	

	@Override
	public Collection<MsgSendQueue> getMsg(String[] ids) {
		return this.executeAction("查询发送消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetMsg(ids);
			}
		}, null, MsgSendQueueListType);
	}
	
	protected Collection<MsgSendQueue> onGetMsg(String[] ids)throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	
	


}
