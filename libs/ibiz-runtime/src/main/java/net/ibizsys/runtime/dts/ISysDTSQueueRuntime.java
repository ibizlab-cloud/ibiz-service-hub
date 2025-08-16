package net.ibizsys.runtime.dts;

import net.ibizsys.model.dts.IPSSysDTSQueue;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统异步处理队列运行时
 * @author lionlau
 *
 */
public interface ISysDTSQueueRuntime extends ISystemModelRuntime {

	/**
	 * 默认队列状态，未知
	 */
	public final static int STATE_UNKNOWN = 0;
	
	
	/**
	 * 默认队列状态，已建立
	 */
	public final static int STATE_CREATED = 10;
	
	/**
	 * 默认队列状态，处理中
	 */
	public final static int STATE_PROCESSING = 20; 
	
	
	/**
	 * 默认队列状态，已完成
	 */
	public final static int STATE_FINISHED = 30; 
	
	
	/**
	 * 默认队列状态，已失败
	 */
	public final static int STATE_FAILED = 40; 
	
	
	/**
	 * 默认队列状态，已取消
	 */
	public final static int STATE_CANCELLED = 41;
	
	
	/**
	 * 初始化异步处理队列运行时
	 * @param iSystemRuntimeBase
	 * @param iPSSysDTSQueue
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysDTSQueue iPSSysDTSQueue) throws Exception;

	

	/**
	 * 超时处理
	 */
	void timeout();
	
	
	
	/**
	 * 推入异步处理数据
	 * @param iEntityBase
	 */
	void push(IEntityBase iEntityBase);
}
