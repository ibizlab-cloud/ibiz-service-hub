package cn.ibizlab.central.plugin.groovy.service

import groovy.transform.CompileStatic
import net.ibizsys.central.plugin.groovy.transform.AutoInjectSys
import net.ibizsys.runtime.util.DataTypeUtils
import net.ibizsys.runtime.util.JsonUtils

@AutoInjectSys
@CompileStatic
class SimpleSubSysServiceAPIRuntime extends net.ibizsys.central.cloud.core.service.SubSysRestServiceAPIRuntimeBase{
	
	
	@Override
	protected void doRequestTokenReal() {
		
		//sys.dataentity("aaa");
		
		
		def user = this.getClientId()
		def password = this.getClientSecret()
		
		def rep = this.getSystemRuntime().getDefaultWebClient().post(this.getAccessTokenUrl(), ["loginname":user,"password":password])
		
		def body = rep.getBody()
		
		def map = JsonUtils.asMap(body)
		
		def token = map["token"]
		def expirein = DataTypeUtils.asInteger(map["expirein"],-1)
		if(expirein != -1) {
			this.tokenExpireIn(expirein);
		}
		this.setHeaders(["Authorization":"Bearer " + token])
		
	}
}
