package net.ibizsys.central.cloud.core.util;

import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.runtime.util.IEntity;

public interface IChatResourceUtils {

	/**
	 * 资源类型：数据对象
	 */
	String RESOURCETYPE_DATAENTITY = "dataentity";
	
	/**
	 * 资源类：OSS文件
	 */
	String RESOURCETYPE_OSSFILE = "ossfile";
	
	
	
	/**
	 * 获取聊天资源内容
	 * @param type
	 * @param subType
	 * @param key
	 * @param testPriv
	 * @return
	 * @throws Throwable
	 */
	String getResource(String type, String subType, String key, boolean testPriv) throws Exception;
	
	
	
	
	/**
	 * 获取资源数据对象
	 * @param type
	 * @param version
	 * @param data
	 * @param metadata
	 * @param testPriv
	 * @return
	 * @throws Exception
	 */
	IEntity getResourceEntity(String type, String version, Map data, Map metadata, boolean testPriv) throws Exception;
	
	
	/**
	 * 需要内容进行转化
	 * @param chatMessage
	 * @return
	 */
	boolean shouldConvert(ChatMessage chatMessage);
	
	
	/**
	 * 转化内容
	 * @param chatMessage
	 * @param bTestPriv
	 * @return
	 */
	java.util.List<ChatMessage> convert(ChatMessage chatMessage, boolean bTestPriv) throws Exception;
	
	
	
	/**
	 * 转化聊天完成请求
	 * @param chatCompletionRequest
	 * @param bTestPriv
	 * @throws Exception
	 */
	void convert(ChatCompletionRequest chatCompletionRequest, boolean bTestPriv) throws Exception;
}
