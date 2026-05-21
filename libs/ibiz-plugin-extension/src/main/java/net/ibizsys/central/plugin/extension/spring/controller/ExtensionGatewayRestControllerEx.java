package net.ibizsys.central.plugin.extension.spring.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysUtilContainerOnly;
import net.ibizsys.central.plugin.ai.addin.IHttpMcpServerTransportAgent;
import net.ibizsys.central.plugin.ai.sysutil.ISysMcpServerUtilRuntime;
import net.ibizsys.central.plugin.extension.sysutil.IHubSysExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "extensiongateway", havingValue = "true", matchIfMissing = true)
public class ExtensionGatewayRestControllerEx {

	private static final Log log = LogFactory.getLog(ExtensionGatewayRestControllerEx.class);

	@Autowired
	IServiceHub iServiceHub;

	
	@PostConstruct
	protected void postConstruct() {
		iServiceHub.registerIgnoreAuthPattern("/*/extension/mcp/**");
	}
	
	@RequestMapping(method = RequestMethod.GET, value = { "/{id}/extension/mcp/{key}/**" })
	@ResponseStatus(HttpStatus.OK)
	public void doGet(@PathVariable("id") String id, @PathVariable("key") String key, HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);

			ISysMcpServerUtilRuntime iSysMcpServerUtilRuntime = null;
			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				iSysMcpServerUtilRuntime = ((IHubSysExtensionUtilRuntime)iSysExtensionUtilRuntime).getSysMcpServerUtilRuntime(iSystemRuntime, key, false);
			} else {
				iSysMcpServerUtilRuntime = iSysExtensionUtilRuntime.getSysMcpServerUtilRuntime(key, false);
			}
			IHttpMcpServerTransportAgent iHttpMcpServerTransportAgent = (IHttpMcpServerTransportAgent)iSysMcpServerUtilRuntime.getTransportAgent(ISysMcpServerUtilRuntime.TRANSPORT_HTTP_SSE, false);
			iHttpMcpServerTransportAgent.doGet(request, response);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/{id}/extension/mcp/{key}/**" })
	@ResponseStatus(HttpStatus.OK)
	public void doPost(@PathVariable("id") String id, @PathVariable("key") String key, HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);

			ISysMcpServerUtilRuntime iSysMcpServerUtilRuntime = null;
			if (iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				iSysMcpServerUtilRuntime = ((IHubSysExtensionUtilRuntime)iSysExtensionUtilRuntime).getSysMcpServerUtilRuntime(iSystemRuntime, key, false);
			} else {
				iSysMcpServerUtilRuntime = iSysExtensionUtilRuntime.getSysMcpServerUtilRuntime(key, false);
			}
			IHttpMcpServerTransportAgent iHttpMcpServerTransportAgent = (IHttpMcpServerTransportAgent)iSysMcpServerUtilRuntime.getTransportAgent(ISysMcpServerUtilRuntime.TRANSPORT_HTTP_SSE, false);
			iHttpMcpServerTransportAgent.doPost(request, response);
		}
		finally {
			SystemRuntimeHolder.poll();
		}
	}

}
