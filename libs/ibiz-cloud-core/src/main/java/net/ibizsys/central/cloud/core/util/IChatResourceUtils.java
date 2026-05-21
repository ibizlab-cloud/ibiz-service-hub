package net.ibizsys.central.cloud.core.util;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

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
	 * 资源类：实体打印
	 */
	String RESOURCETYPE_DEPRINT = "deprint";
	
	
	/**
	 * 属性：资源类型
	 */
	String FIELD_TYPE = "type";
	
	/**
	 * 属性：原始内容，如果内容经过转化，会将原始内容放入该属性中
	 */
	String FIELD_ORIGINAL = "_original";
	
	
	/**
	 * 属性：内容
	 */
	String FIELD_CONTENT = "content";
	
	/**
	 * OSS文件标识
	 */
	String FIELD_OSSFILE_ID = "id";
	
	/**
	 * OSS文件目录
	 */
	String FIELD_OSSFILE_FOLDER = "folder";
	
	/**
	 * 获取聊天资源内容
	 * @param type
	 * @param subType
	 * @param key
	 * @param testPriv
	 * @return
	 * @throws Throwable
	 */
	String getResource(String type, String subType, Object key, Map<String, Object> arguments, boolean testPriv) throws Exception;
	
	
	/**
	 * 获取资源数据对象（默认填充内容）
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
	 * 获取资源数据对象（
	 * @param type
	 * @param version
	 * @param data
	 * @param metadata
	 * @param testPriv
	 * @param fillContent 是否填充内容
	 * @return 
	 * @throws Exception
	 */
	IEntity getResourceEntity(String type, String version, Map data, Map metadata, boolean testPriv, boolean fillContent) throws Exception;
	
	
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
	
	
	
	
	/**
	 * 转化内容
	 * @param chatMessage
	 * @param bTestPriv
	 * @param limit 长度限制
	 * @return
	 */
	java.util.List<ChatMessage> convert(ChatMessage chatMessage, boolean bTestPriv, AtomicInteger limit) throws Exception;
	
	
	
	/**
	 * 转化聊天完成请求
	 * @param chatCompletionRequest
	 * @param bTestPriv
	 * @param limit 长度限制
	 * @throws Exception
	 */
	void convert(ChatCompletionRequest chatCompletionRequest, boolean bTestPriv, AtomicInteger limit) throws Exception;
	
	
	
	/**
	 * 从聊天消息中获取对应的资源对象
	 * @param chatMessage
	 * @param testPriv
	 * @return
	 * @throws Exception
	 */
	List<IEntity> getResourceEntities(ChatMessage chatMessage, boolean testPriv,  boolean fillContent) throws Exception;
}
