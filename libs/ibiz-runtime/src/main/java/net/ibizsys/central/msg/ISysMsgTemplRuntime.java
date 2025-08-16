package net.ibizsys.central.msg;

import java.util.Map;

public interface ISysMsgTemplRuntime extends net.ibizsys.runtime.msg.ISysMsgTemplRuntime {

	/**
	 * 模板参数：上一次数据
	 */
	public final static String TEMPLPARAM_LAST = "last";
	
	/**
	 * 获取内容
	 * @param data 当前数据
	 * @param params 额外发布参数
	 * @return
	 */
	String getContent(Object data, Map<String, Object> params);
	
	
	
	/**
	 * 获取标题内容
	 * @param data 当前数据
	 * @param params 额外发布参数
	 * @return
	 */
	String getSubject(Object data, Map<String, Object> params);
	
	
	
	/**
	 * 获取短消息内容
	 * @param data 当前数据
	 * @param params 额外发布参数
	 * @return
	 */
	String getSMSContent(Object data, Map<String, Object> params);
	
	
	/**
	 * 获取微信消息内容
	 * @param data 当前数据
	 * @param params 额外发布参数
	 * @return
	 */
	String getWXContent(Object data, Map<String, Object> params);
	
	
	
	/**
	 * 获取钉钉消息内容
	 * @param data 当前数据
	 * @param params 额外发布参数
	 * @return
	 */
	String getDDContent(Object data, Map<String, Object> params);
	
	
	
	/**
	 * 获取即时消息内容
	 * @param data 当前数据
	 * @param params 额外发布参数
	 * @return
	 */
	String getIMContent(Object data, Map<String, Object> params);
	
	
	
	/**
	 * 获取链接内容
	 * @param data 当前数据
	 * @param params 额外发布参数
	 * @return
	 */
	String getUrl(Object data, Map<String, Object> params);
	
	
	
	/**
	 * 获取移动端链接内容
	 * @param data 当前数据
	 * @param params 额外发布参数
	 * @return
	 */
	String getMobileUrl(Object data, Map<String, Object> params);
	
	

}
