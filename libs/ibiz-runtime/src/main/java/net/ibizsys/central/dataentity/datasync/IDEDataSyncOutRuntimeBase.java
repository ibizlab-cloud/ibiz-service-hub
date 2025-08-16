package net.ibizsys.central.dataentity.datasync;

public interface IDEDataSyncOutRuntimeBase {

	/**
	 * 发送数据
	 * @param nEvent
	 * @param objData
	 * @param actionData 操作数据
	 */
	void send(int nEvent, Object objData, Object actionData);
}
