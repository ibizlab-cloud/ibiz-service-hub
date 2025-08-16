package net.ibizsys.central.sysutil;

/**
 * 统一状态侦听器
 * @author lionlau
 *
 */
public interface ISysUniStateListener {

	/**
	 * 状态变化
	 * @param strPath
	 * @param data
	 * @param oldData
	 */
	void change(String strPath, String data, String oldData, String strPattern);
	
}
