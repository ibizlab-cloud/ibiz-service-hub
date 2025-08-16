package net.ibizsys.central.cloud.log.core.addin;

import java.util.List;

import net.ibizsys.central.cloud.log.core.cloudutil.ICloudLogUtilRuntimeContext;

/**
 * 控制台信息发送对象接口
 * @author lionlau
 *
 */
public interface IConsoleSender extends ICloudLogUtilRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param strSender
	 * @param strConfig
	 * @throws Exception
	 */
	void init(ICloudLogUtilRuntimeContext ctx, String strSender, String strConfig) throws Exception;
	
	/**
	 * 获取发送者标识
	 * @return
	 */
	String getSender();
	
	
	
	/**
	 * 是否启用
	 * @return
	 */
	boolean isEnabled();
	
	
	/**
	 * 发送控制台信息
	 * @param list
	 */
	void send(List<net.ibizsys.runtime.util.domain.Log> list);
}
