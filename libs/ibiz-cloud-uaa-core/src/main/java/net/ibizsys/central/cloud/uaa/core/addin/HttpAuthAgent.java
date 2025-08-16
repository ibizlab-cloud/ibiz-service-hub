package net.ibizsys.central.cloud.uaa.core.addin;

import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.service.client.IWebClientRep;

/**
 * 远端Http认证服务
 * 
 * @author lionlau
 *
 */
public class HttpAuthAgent extends AuthAgentBase implements IHttpAuthAgent {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(HttpAuthAgent.class);

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		if (!StringUtils.hasLength(this.getServiceUrl())) {
			throw new Exception("未定义认证服务路径");
		}
	}

	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}

	@Override
	protected AuthenticationUser onGetUserByName(String srfsystem, String srforgid, String username, boolean bTryMode) throws Throwable {
		return null;
	}

	@Override
	protected AuthenticationUser onGetUserByLogin(String srfsystem, String srforgid, String username, String password, boolean bTryMode) throws Throwable {

		Map<String, String> params = new LinkedHashMap<String, String>();
		params.put("username", username);
		params.put("password", password);

		String strUserName = null;
		try {
			IWebClientRep<String> rep = this.getSysCloudClientUtilRuntime().getServiceClient(this.getServiceUrl()).post(this.getServiceUrl(), params);
			if (IHttpAuthAgent.RESULT_ALLOW.equals(rep.getBody())) {
				strUserName = username;
			}
		} catch (Throwable ex) {
			log.error(String.format("认证发生异常， %1$s", ex.getMessage()), ex);
		}

		return this.getAuthenticationUser(strUserName, bTryMode);
	}

	@Override
	public String getName() {
		return ICloudAuthUtilRuntime.AUTHAGENT_HTTP;
	}
}
