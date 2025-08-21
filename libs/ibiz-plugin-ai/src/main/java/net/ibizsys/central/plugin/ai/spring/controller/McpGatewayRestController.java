package net.ibizsys.central.plugin.ai.spring.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.plugin.ai.addin.IHttpMcpServerTransportAgent;
import net.ibizsys.central.plugin.ai.sysutil.ISysMcpServerUtilRuntime;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "mcpgateway", havingValue = "true", matchIfMissing = true)
public class McpGatewayRestController {

	private static final Logger logger = LoggerFactory.getLogger(McpGatewayRestController.class);

	public static final String UTF_8 = "UTF-8";
	
	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		iServiceHub.registerIgnoreAuthPattern("/*/mcp/**");
	}
	
	@GetMapping(value = "/{id}/mcp/**")
	@ResponseStatus(HttpStatus.OK)
	public void doGet(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysMcpServerUtilRuntime iSysMcpServerUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysMcpServerUtilRuntime.class, false);
			IHttpMcpServerTransportAgent iHttpMcpServerTransportAgent = (IHttpMcpServerTransportAgent)iSysMcpServerUtilRuntime.getTransportAgent(ISysMcpServerUtilRuntime.TRANSPORT_HTTP_SSE, false);
			iHttpMcpServerTransportAgent.doGet(request, response);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}

	@PostMapping(value = "/{id}/mcp/**")
	@ResponseStatus(HttpStatus.OK)
	public void doPost(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysMcpServerUtilRuntime iSysMcpServerUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysMcpServerUtilRuntime.class, false);
			IHttpMcpServerTransportAgent iHttpMcpServerTransportAgent = (IHttpMcpServerTransportAgent)iSysMcpServerUtilRuntime.getTransportAgent(ISysMcpServerUtilRuntime.TRANSPORT_HTTP_SSE, false);
			iHttpMcpServerTransportAgent.doPost(request, response);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}

}
