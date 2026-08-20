package net.ibizsys.central.cloud.core.testing;

import java.io.File;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.res.ISysFileResourceRuntime;

public interface ISysTestPrjRuntime extends net.ibizsys.central.testing.ISysTestPrjRuntime{

	/**
	 * 安装功能
	 * @throws Throwable
	 */
	void install() throws Exception;

	
	/**
	 * 是否已经安装
	 * @return
	 */
	boolean isInstalled();
	
	/**
	 * 卸载功能
	 */
	void uninstall();
	
	
	/**
	 * 重载配置
	 */
	void reload();
	
	
	
	/**
	 * 获取配置文件资源
	 * @param bTryMode
	 * @return
	 */
	ISysFileResourceRuntime getConfigSysFileResourceRuntime(boolean bTryMode);
	
	
	
	/**
	 * 获取Webhook访问凭证
	 * @param strToken
	 * @param tryMode
	 * @return
	 */
	AccessToken getWebhookAccessToken(String strToken, boolean tryMode);
	
	
	
	
	/**
	 * 运行指定路径测试单元
	 * @param strPath
	 * @param params
	 * @return
	 */
	Object run(String strPath, Map<String, Object> params);
	
	
	
	/**
	 * 获取测试项目文件
	 * @param strPath
	 * @param bTryMode
	 * @return
	 */
	File getFile(String strPath, boolean bTryMode);
}
