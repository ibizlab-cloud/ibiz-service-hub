package net.ibizsys.central.cloud.core.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.Resource;

import net.ibizsys.central.app.IApplicationRuntime;

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
	

}
