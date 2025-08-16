package net.ibizsys.central.cloud.core.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface IServiceHubFilter {

	/**
	 * 执行过滤操作，建立身份
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 * @throws ServletException
	 */
	boolean doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException;

	/**
	 * 重新执行过滤操作，重建身份
	 * @return
	 * @throws Exception
	 */
	boolean redoFilter() throws IOException, ServletException;

}
