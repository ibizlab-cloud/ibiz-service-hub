package net.ibizsys.central.msg;

import java.util.Collection;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.sysutil.ISysNotifyUtilRuntime;
import net.ibizsys.central.sysutil.SysNotifyUtilRuntimeBase;
import net.ibizsys.central.util.ActionUtils;
import net.ibizsys.runtime.msg.SysMsgQueueRuntimeBase;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 系统RT消息队列运行时对象
 * @author lionlau
 *
 */
public class SysRTMsgQueueRuntime extends SysMsgQueueRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysRTMsgQueueRuntime.class);
	
	private ISysNotifyUtilRuntime iSysNotifyUtilRuntime = null;
	
	
	/**
	 * 获取系统通知功能对象
	 * @return
	 */
	protected ISysNotifyUtilRuntime getSysNotifyUtilRuntime() {
		if(this.iSysNotifyUtilRuntime == null) {
			this.iSysNotifyUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysNotifyUtilRuntime.class, false);
		}
		return this.iSysNotifyUtilRuntime;
	}
	
	
	@Override
	public void send(MsgSendQueue[] msgSendQueues) {
		ActionUtils.executeAction((ISystemRuntime)this.getSystemRuntime(), this, "发送消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSend(msgSendQueues);
				return null;
			}
		}, null);
	}
	
	protected void onSend(MsgSendQueue[] msgSendQueues) throws Throwable{
		this.getSysNotifyUtilRuntime().sendMsg(msgSendQueues);
	}

	@Override
	public MsgSendQueue[] listSimple(String[] ids) {
		return ActionUtils.executeAction((ISystemRuntime)this.getSystemRuntime(), this, "查询消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onListSimple(ids);
			}
		}, null, SysNotifyUtilRuntimeBase.MsgSendQueuesType);
	}
	
	protected MsgSendQueue[] onListSimple(String[] ids) throws Throwable{
		Collection<MsgSendQueue> msgSendQueueList = this.getSysNotifyUtilRuntime().getMsg(ids);
		if(ObjectUtils.isEmpty(msgSendQueueList)) {
			return null;
		}
		
		return msgSendQueueList.toArray(new MsgSendQueue[msgSendQueueList.size()]);
	}
	

}
