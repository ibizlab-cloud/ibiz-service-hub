package net.ibizsys.runtime.dataentity.dts;

import net.ibizsys.model.dataentity.dts.IPSDEDTSQueue;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体异步处理队列运行时接口
 * @author lionlau
 *
 */
public interface IDEDTSQueueRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化实体异步处理队列运行时	
	 * @param iDataEntityRuntimeBase
	 * @param iPSDEDTSQueue
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDEDTSQueue iPSDEDTSQueue) throws Exception;
	
	
	
	/**
	 * 获取实体异步处理队列模型对象
	 * @return
	 */
	IPSDEDTSQueue getPSDEDTSQueue();
	
	
	
	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 压入数据到异步处理队列
	 * @param iEntityBase
	 */
	void push(IEntityBase iEntityBase);
	
	
	
}
