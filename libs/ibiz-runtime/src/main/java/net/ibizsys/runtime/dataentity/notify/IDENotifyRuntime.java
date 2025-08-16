package net.ibizsys.runtime.dataentity.notify;

import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体通知运行时接口
 * @author lionlau
 *
 */
public interface IDENotifyRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化实体通知运行时	
	 * @param iDataEntityRuntimeBase
	 * @param iPSDENotify
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBase iDataEntityRuntimeBase, IPSDENotify iPSDENotify) throws Exception;
	
	
	
	/**
	 * 获取实体通知模型对象
	 * @return
	 */
	IPSDENotify getPSDENotify();
	
	
	
	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 发送通知，指定数据
	 * @param iEntityBase
	 */
	void send(IEntityBase iEntityBase);
	
	
	/**
	 * 发送通知，检查符合规则的数据
	 */
	void send();
	
}
