package net.ibizsys.central.eai;

import java.io.File;
import java.util.Map;

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
	
	
	
	
	/**
	 * 接收文件
	 * @param remotePath 远端路径
	 * @param file
	 * @param params
	 */
	default void recv(String remotePath, File file, Map<String, Object> params) {
		
	}
}
