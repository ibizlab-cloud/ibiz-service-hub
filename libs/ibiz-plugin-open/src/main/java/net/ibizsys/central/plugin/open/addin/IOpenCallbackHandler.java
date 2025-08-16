package net.ibizsys.central.plugin.open.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 开放平台消息处理对象
 * @author lionlau
 *
 */
public interface IOpenCallbackHandler extends IModelRTAddin{

	/**
	 * 执行开放平台回调
	 * @param strOpenTag
	 * @param strInput
	 * @return
	 */
	String executeCallback(String strOpenTag, String strInput);
}
