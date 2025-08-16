package net.ibizsys.central.eai;

/**
 * 应用集成消息侦听器
 * @author lionlau
 *
 */
public interface ISysEAIMsgListener {

	/**
	 * 接收数据
	 * @param strTopic
	 * @param strData
	 */
	void recv(String strTopic, String strData);
}
