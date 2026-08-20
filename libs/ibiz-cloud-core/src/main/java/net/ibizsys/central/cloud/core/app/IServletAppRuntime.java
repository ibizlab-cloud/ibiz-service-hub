package net.ibizsys.central.cloud.core.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.Resource;

import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.central.res.ISysFileResourceRuntime;

/**
 * Servlet应用运行时对象接口
 * @author lionlau
 *
 */
public interface IServletAppRuntime extends IApplicationRuntime {

	
	
	/**
	 * 获取基础服务路径
	 * @return
	 */
	String getBaseUrl();
	
	
	
	/**
	 * 响应资源
	 * @param request
	 * @param requestPath
	 * @return
	 */
	Resource resolveResource(HttpServletRequest request, String requestPath);
	

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
	
	
}
