package net.ibizsys.central.cloud.uaa.core.addin;

import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.runtime.util.DataTypeUtils;

public class CasAuthAgent extends AuthAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CasAuthAgent.class);

	public final static String PARAM_VALIDATIONURL = "validation-url";
		
	/**
	 * 鉴别Token的Cas路径
	 */
	private String strValidationUrl;
    
	
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		if(!StringUtils.hasLength(this.getValidationUrl())) {
			this.setValidationUrl(DataTypeUtils.getStringValue(this.getConfigEntity().get(PARAM_VALIDATIONURL), null));
			if(!StringUtils.hasLength(this.getValidationUrl())) {
				throw new Exception("未定义Token校验路径");
			}
		}
	}
	
	protected String getValidationUrl() {
		return this.strValidationUrl;
	}
	
	protected void setValidationUrl(String strValidationUrl) {
		this.strValidationUrl = strValidationUrl;
	}
	
	

	@Override
	protected AuthenticationUser onGetUserByName(String srfsystem, String srforgid, String username, boolean bTryMode) throws Throwable {
		return null;
	}

	@Override
	protected AuthenticationUser onGetUserByLogin(String srfsystem, String srforgid, String username, String password, boolean bTryMode) throws Throwable {

		if (!StringUtils.hasLength(username))
			throw new Exception("未传入服务标识");
		
		if (!StringUtils.hasLength(password))
			throw new Exception("未传入认证票据");
		
		
		Map<String, String> queries = new LinkedHashMap<String, String>();
		queries.put("service", username);
		queries.put("ticket", password);
		
		String strUserName = null;
		
		try {
			IWebClientRep<Map> rep = this.getSystemRuntime().getDefaultWebClient().get(getValidationUrl(), null, null, queries, Map.class, null);
			Map ret = rep.getBody();
			
			Object code = ret.get("code");
			if(!"000000".equalsIgnoreCase(DataTypeUtils.getStringValue(code, ""))) {
				throw new Exception(String.format("%1$s", ret.get("message")));
			}
			
			Object body = ret.get("body");
			if(!(body instanceof Map)) {
				throw new Exception(String.format("%1$s", "返回结果不正确"));
			}
			
			Object realuser = ((Map)body).get("username");
			if(realuser instanceof String) {
				strUserName = (String)realuser;
			}
		}
		catch (Throwable ex) {
			//throw new Exception(
			log.error(String.format("校验票据失败，%1$s", ex.getMessage()), ex);
		}
		
		return this.getAuthenticationUser(strUserName, bTryMode);
	}

	@Override
	public String getName() {
		return ICloudAuthUtilRuntime.AUTHAGENT_CAS;
	}
}
