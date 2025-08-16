package net.ibizsys.central.dataentity.notify;

import java.util.Map;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体通知运行时对象
 * @author lionlau
 *
 */
public interface IDENotifyRuntime extends net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime,IDataEntityModelRuntime {

	/**
	 * 通知参数：事件数据
	 */
	public final static String NOTIFY_PARAM_EVENTDATA = "eventdata";
	
	
	/**
	 * 通知参数：上一次事件数据
	 */
	public final static String NOTIFY_PARAM_LASTEVENTDATA = "lasteventdata";
	
	
	/**
	 * 通知参数：事件名称
	 */
	public final static String NOTIFY_PARAM_EVENTNAME = "eventname";
	
	
	
	/**
	 * 发送通知
	 * @param iEntityBa
	 * @param iEntity
	 * @param params
	 */
	void send(IEntity iEntity, Map<String, Object> params) ;
}
