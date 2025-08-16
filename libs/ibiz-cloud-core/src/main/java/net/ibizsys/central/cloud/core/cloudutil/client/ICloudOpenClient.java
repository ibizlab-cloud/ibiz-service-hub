package net.ibizsys.central.cloud.core.cloudutil.client;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.util.domain.OpenQRCode;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCodeRequest;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * Cloud体系开放平台客户端对象接口
 * @author lionlau
 *
 */
public interface ICloudOpenClient {

	@RequestMapping(method = RequestMethod.POST, value = "/open/{id}/syncorganizationunits")
    void syncOrganizationUnits(@PathVariable("id") String id, @RequestBody(required=false) Map body);
	
	@RequestMapping(method = RequestMethod.POST, value = "/open/{id}/sendmessages")
	void sendMessages(@PathVariable("id") String id, @RequestBody MsgSendQueue[] msgSendQueues);
	
	@RequestMapping(method = RequestMethod.GET, value = "/open/{id}/getopenuserbysnscode/{code}")
   	OpenUser getOpenUserBySNSCode(@PathVariable("id") String id, @PathVariable("code") String code);
	
	@RequestMapping(method = RequestMethod.GET, value = "/open/{id}/getopenuserbyauthcode/{code}")
   	OpenUser getOpenUserByAuthCode(@PathVariable("id") String id, @PathVariable("code") String code);
	
	@RequestMapping(method = RequestMethod.POST, value = "/open/{id}/createopenqrcode")
	OpenQRCode createOpenQRCode(@PathVariable("id") String id, @RequestBody OpenQRCodeRequest request);
	
	@RequestMapping(method = RequestMethod.GET, value = "/open/{id}/getopenuserbyqrcode/{code}")
   	OpenUser getOpenUserByQRCode(@PathVariable("id") String id, @PathVariable("code") String code);
}
