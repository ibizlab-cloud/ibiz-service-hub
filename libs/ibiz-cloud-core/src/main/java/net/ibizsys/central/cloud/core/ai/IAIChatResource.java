package net.ibizsys.central.cloud.core.ai;

/**
 * AI聊天资源对象基础接口
 * @author lionlau
 *
 */
public interface IAIChatResource {

	public final static String AIAGENT_RESOURCE = "AIRESOURCE";
	
	/**
	 * 获取资源类型
	 * @return
	 */
	String getResourceType();
	
	
	/**
	 * 获取聊天资源内容
	 * @param subType
	 * @param key
	 * @param testPriv
	 * @return
	 * @throws Throwable
	 */
	String getContent(String subType, String key, boolean testPriv) throws Exception;
}
