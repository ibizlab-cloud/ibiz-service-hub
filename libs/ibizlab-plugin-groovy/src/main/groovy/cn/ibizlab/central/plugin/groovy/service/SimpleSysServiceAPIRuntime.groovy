package cn.ibizlab.central.plugin.groovy.service

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter


class SimpleSysServiceAPIRuntime extends net.ibizsys.central.cloud.core.service.SysRestServiceAPIRuntimeBase{
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello/{hello}")
	public Object hello(@PathVariable("hello")String hello) {
		return "Hi " + hello
	}
}
