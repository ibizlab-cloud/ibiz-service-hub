package net.ibizsys.runtime.dataentity.datasync;

/**
 * 实体数据同步（输出）运行时对象接口
 * @author lionlau
 *
 */
public interface IDEDataSyncOutRuntime extends IDEDataSyncRuntime{

	/**
	 * 发送数据
	 * @param nEvent
	 * @param objData
	 * @param actionData 操作数据
	 */
	void send(int nEvent, Object objData, Object actionData);
	
	
	/**
	 * 直接发送数据
	 * @param nEvent
	 * @param objData
	 * @param actionData 操作数据
	 */
	void sendDirect(int nEvent, Object objData);
	
	
	/**
	 * 是否立刻发送
	 * @return
	 */
	boolean isSendImmediately();
	
	
	
	
	/**
	 * 是否为实时处理模式
	 * @return
	 */
	boolean isRealTimeMode();
}
