package net.ibizsys.central.service;

import net.ibizsys.central.util.script.IScriptWebClient;
import net.ibizsys.runtime.util.script.IScriptUtil;

public interface ISubSysServiceAPIRTScriptContext extends IScriptUtil{

	/**
	 * 获取接口名称
	 * @return
	 */
	java.lang.String getName();
	
	/**
	 * 认证token路径
	 * @return
	 */
	java.lang.String getTokenurl();
	
	
	/**
	 * 认证客户端标识
	 * @return
	 */
	java.lang.String getClientid();
	
	
	/**
	 * 认证客户端密码
	 * @return
	 */
	java.lang.String getClientsecret();
	
	
	/**
	 * 认证模式
	 * @return
	 */
	java.lang.String getAuthmode();
	
	
	/**
	 * 认证参数
	 * @return
	 */
	java.lang.String getAuthparam();
	
	
	/**
	 * 认证参数2
	 * @return
	 */
	java.lang.String getAuthparam2();
	
	
	/**
	 * 设置头部信息
	 * @param objHeader
	 */
	ISubSysServiceAPIRTScriptContext header(Object objHeader);
	
	
	/**
	 * 设置Token的超时时间
	 * @param objTime 指定具体的超时时间或时长（秒）
	 */
	ISubSysServiceAPIRTScriptContext tokentimeout(Object objTime);
	
	
	
	/**
	 * 设置Token的超时时间
	 * @param objTime 指定具体的超时时间或时长（秒）
	 */
	ISubSysServiceAPIRTScriptContext expirein(Object objTime);
	
	
	/**
	 * Web客户端对象
	 * @return
	 */
	IScriptWebClient webclient();
}
