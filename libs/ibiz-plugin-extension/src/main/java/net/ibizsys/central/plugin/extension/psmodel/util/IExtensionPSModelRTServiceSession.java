package net.ibizsys.central.plugin.extension.psmodel.util;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudExtensionUtilRuntime;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.psmodel.runtime.util.IPSModelRTServiceSession;

public interface IExtensionPSModelRTServiceSession extends IPSModelRTServiceSession{

	/**
	 *  产品市场模式：默认
	 */
	public final static String PRODUCTMARKETMODE_DEFAULT = "DEFAULT";
	
	
	/**
	 *  产品市场模式：模式2
	 */
	public final static String PRODUCTMARKETMODE_V2 = "V2";
	
	
	
	/**
	 * 获取当前系统运行时
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	/**
	 * 获取产品市场服务地址
	 * @return
	 */
	String getProductMarketServiceUrl();
	
	
	/**
	 * 获取产品市场群组标识
	 * @return
	 */
	String getProductMarketGroupId();
	
	
	
	/**
	 * 获取产品市场基础组件群组标识
	 * @return
	 */
	String getProductMarketBaseGroupId();
	
	
	/**
	 * 获取产品市场项目标识
	 * @return
	 */
	String getProductMarketProjectId();
	
	/**
	 * 获取Cloud扩展客户端
	 * @return
	 */
	ICloudExtensionClient getCloudExtensionClient();
	
	
	/**
	 * 获取Cloud扩展客户端
	 * @return
	 */
	ICloudExtensionClient getCloudExtensionClientMust() throws Exception;
	
	
	/**
	 * 获取扩展标识
	 * @return
	 */
	String getExtensionId();
	
	
	
	/**
	 * 获取扩展标识
	 * @return
	 */
	String getExtensionIdMust() throws Exception;
	
	
	
	/**
	 * 设置当前扩展系统引用运行时对象
	 * @param iExtensionSysRefRuntime
	 */
	void setExtensionSysRefRuntime(IExtensionSysRefRuntime iExtensionSysRefRuntime);
	
	
	
	/**
	 * 获取当前扩展系统引用运行时对象
	 * @return
	 */
	IExtensionSysRefRuntime getExtensionSysRefRuntime();
	
	
	/**
	 * 设置当前应用
	 * @param iPSApplication
	 */
	void setPSApplication(IPSApplication iPSApplication);
	
	
	
	/**
	 * 获取当前应用（必须）
	 * @return
	 * @throws Exception
	 */
	IPSApplication getPSApplicationMust() throws Exception;

	
	
	/**
	 * 获取Cloud扩展功能组件包
	 * @return
	 */
	ISysCloudExtensionUtilRuntime getSysCloudExtensionUtilRuntime();
	
	
	/**
	 * 获取Cloud扩展功能组件包
	 * @return
	 */
	ISysCloudExtensionUtilRuntime getSysCloudExtensionUtilRuntimeMust() throws Exception;
	
	
	/**
	 * 获取产品市场模式
	 * @return
	 */
	String getProductMarketMode();
}
