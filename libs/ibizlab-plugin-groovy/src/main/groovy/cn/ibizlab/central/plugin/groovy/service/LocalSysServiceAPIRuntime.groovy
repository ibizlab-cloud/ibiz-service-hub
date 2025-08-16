package cn.ibizlab.central.plugin.groovy.service

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

import groovy.util.logging.Slf4j
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter
import net.ibizsys.central.service.SysServiceAPIRuntimeException

/**
 * 本地服务接口运行时对象，仅授权 127.0.0.1 访问
 * @author lionlau
 *
 */
@Slf4j
class LocalSysServiceAPIRuntime extends net.ibizsys.central.cloud.core.service.LocalSysRestServiceAPIRuntimeBase{
	
	@Override
	public void registerMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		super.registerMapping(iSysServiceAPIRequestMappingAdapter)
		if(iSysServiceAPIRequestMappingAdapter.getSysServiceAPIDocAdapter() != null) {
			net.ibizsys.central.cloud.core.service.util.SysServiceAPIDocUtils.registerR8DEMethodMapping(this, iSysServiceAPIRequestMappingAdapter.getSysServiceAPIDocAdapter());
		}
	}
	
	@RequestMapping(method = RequestMethod.POST, value = [ "/{entity}/{method}", "/{entity}/{method}/{key}" ])
	public ResponseEntity<Object> call(@PathVariable(name = "entity", required = true) String entity, @PathVariable(name = "method", required = true) String method, @PathVariable(name = "key", required = false) String key, @RequestBody( required = false) Object requestData) {
		try {
			Object obj = this.getSystemRuntime().invokeDEMethod(entity, method, key!=null?key:requestData, getUserContext(), null);
			return ResponseEntity.status(HttpStatus.OK).body(obj);
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			throw new SysServiceAPIRuntimeException(this, String.format("调用实体方法发生异常，%s", e.getMessage()), e);
		}
	}

}
