package net.ibizsys.central.cloud.core.cloudutil.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import net.ibizsys.central.cloud.core.security.AuthenticationInfo;
import net.ibizsys.central.cloud.core.util.domain.AppData;

public interface ICloudUAAClient {

	@GetMapping(value = "/appdata")
	AppData getAppData(@RequestHeader(value="srfsystemid") String srfsystemid, @RequestHeader(value="srforgid") String srforgid,  @RequestHeader(value="Authorization") String strToken, @RequestHeader("X-Real-IP") String clientIp);
	
	@GetMapping(value = "/appdata/{srfdcsystem}")
	AppData getAppData(@PathVariable(value="srfdcsystem") String srfdcsystem, @RequestHeader(value="Authorization") String strToken, @RequestHeader("X-Real-IP") String clientIp);
	
	
	@GetMapping(value = "/uaa/refreshtoken2")
	AuthenticationInfo refreshToken2();
}
