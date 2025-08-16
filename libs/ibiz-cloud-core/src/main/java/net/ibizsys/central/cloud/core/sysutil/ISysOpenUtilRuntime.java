package net.ibizsys.central.cloud.core.sysutil;

/**
 * 系统开放平台功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysOpenUtilRuntime extends ISysUtilRuntime{

	/**
	 * 执行开放平台回调
	 * @param strOpenType
	 * @param strOpenId
	 * @param strInput
	 * @return
	 */
	String executeCallback(String strOpenType, String strOpenId, String strInput);
}
