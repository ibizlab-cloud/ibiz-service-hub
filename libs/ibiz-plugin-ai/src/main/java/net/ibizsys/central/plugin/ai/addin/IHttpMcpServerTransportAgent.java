package net.ibizsys.central.plugin.ai.addin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IHttpMcpServerTransportAgent extends IMcpServerTransportAgent {

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
