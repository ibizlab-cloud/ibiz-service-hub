package net.ibizsys.central.plugin.ai.spring.controller;

import java.io.IOException;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.plugin.ai.sysutil.ISysOpenAIServerUtilRuntime;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "openaigateway", havingValue = "true", matchIfMissing = true)
public class OpenAIGatewayRestController {

	private static final Logger logger = LoggerFactory.getLogger(OpenAIGatewayRestController.class);

	public static final String UTF_8 = "UTF-8";
	
	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		iServiceHub.registerIgnoreAuthPattern("/*/ai/compatible-mode/v1/**");
		iServiceHub.registerIgnoreAuthPattern("/*/ai/factories/*/compatible-mode/v1/**");
		iServiceHub.registerIgnoreAuthPattern("/*/ai/factories/*/compatible-mode/*/v1/**");
	}
	


	@PostMapping(value = "/{id}/ai/compatible-mode/v1/chat/completions")
	@ResponseStatus(HttpStatus.OK)
	public Object chatCompletion(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, Object> body) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			ISysOpenAIServerUtilRuntime iSysOpenAIServerUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysOpenAIServerUtilRuntime.class, false);
			return iSysOpenAIServerUtilRuntime.chatCompletion(null, null, request, response, body);
		}
		finally {
			if(bPushSystem)
				SystemRuntimeHolder.poll();
		}
	}
	
	@PostMapping(value = "/{id}/ai/factories/{factory_id}/compatible-mode/v1/chat/completions")
	@ResponseStatus(HttpStatus.OK)
	public Object chatCompletion(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, Object> body) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			ISysOpenAIServerUtilRuntime iSysOpenAIServerUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysOpenAIServerUtilRuntime.class, false);
			return iSysOpenAIServerUtilRuntime.chatCompletion(factory_id, null, request, response, body);
		}
		finally {
			if(bPushSystem)
				SystemRuntimeHolder.poll();
		}
	}

	@GetMapping(value = "/{id}/ai/factories/{factory_id}/compatible-mode/v1/models")
	@ResponseStatus(HttpStatus.OK)
	public Object getModels(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, HttpServletRequest request, HttpServletResponse response, @RequestBody(required = false) Map<String, Object> body) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			ISysOpenAIServerUtilRuntime iSysOpenAIServerUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysOpenAIServerUtilRuntime.class, false);
			return iSysOpenAIServerUtilRuntime.getModels(factory_id, request, response, body);
		}
		finally {
			if(bPushSystem)
				SystemRuntimeHolder.poll();
		}
	}

	@PostMapping(value = "/{id}/ai/factories/{factory_id}/compatible-mode/{adapter}/v1/chat/completions")
	@ResponseStatus(HttpStatus.OK)
	public Object chatCompletion(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, @PathVariable("adapter") String adapter, HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, Object> body) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			ISysOpenAIServerUtilRuntime iSysOpenAIServerUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysOpenAIServerUtilRuntime.class, false);
			return iSysOpenAIServerUtilRuntime.chatCompletion(factory_id, adapter, request, response, body);
		}
		finally {
			if(bPushSystem)
				SystemRuntimeHolder.poll();
		}
	}
}
