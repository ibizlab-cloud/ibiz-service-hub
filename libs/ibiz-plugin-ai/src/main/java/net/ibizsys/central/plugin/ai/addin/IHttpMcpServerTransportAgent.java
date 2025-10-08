package net.ibizsys.central.plugin.ai.addin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IHttpMcpServerTransportAgent extends IMcpServerTransportAgent {

	/**
	 * 请求头：授权集合
	 */
	final static String HEADER_AUTHORITIES = "srfauthorities";
	
	
	/**
	 * 请求头：超级用户
	 */
	final static String HEADER_SUPERUSER = "srfsuperuser";
	
	
	/**
	 * 请求头：应用上下文
	 */
	final static String HEADER_APPCONTEXT = "srfappcontext";
	
	
	/**
	 * doGet
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException;
	
	
	
	/**
	 * doPost
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
