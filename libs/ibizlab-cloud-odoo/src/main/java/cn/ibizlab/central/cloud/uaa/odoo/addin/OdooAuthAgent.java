package cn.ibizlab.central.cloud.uaa.odoo.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.uaa.core.addin.AuthAgentBase;

public class OdooAuthAgent extends AuthAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OdooAuthAgent.class);

	
	

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		
	}

//	protected LdapTemplate getLdapTemplate() {
//		return getLdapTemplate(false);
//	}
//
//	protected LdapTemplate getLdapTemplate(boolean bTryMode) {
//		if (this.ldapTemplate != null || bTryMode) {
//			return this.ldapTemplate;
//		}
//		throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudUtilRuntime(), "未指定Ldap访问对象");
//	}
//
//	protected void setLdapTemplate(LdapTemplate ldapTemplate) {
//		this.ldapTemplate = ldapTemplate;
//	}
//
//	protected void prepareLdapTemplate() throws Exception {
//
//		LdapContextSource contextSource = new LdapContextSource();
//
//		EntityUtils.copyTo(this.getConfigEntity(), contextSource);
//		if (!this.getConfigEntity().contains("pooled")) {
//			contextSource.setPooled(true);
//		}
//
//		Map<String, Object> config = new HashMap<>();
//		config.put("java.naming.ldap.attributes.binary", DataTypeUtils.getStringValue(this.getConfigEntity().get("java.naming.ldap.attributes.binary"), "objectGUID"));
//		contextSource.setBaseEnvironmentProperties(config);
//
//		contextSource.afterPropertiesSet(); // important
//
//		LdapTemplate ldapTemplate = new LdapTemplate(contextSource);
//		this.setLdapTemplate(ldapTemplate);
//
//	}
//
//	
//	protected String getFilterName() {
//		return this.strFilterName;
//	}
//
//	protected void setFilterName(String strFilterName) {
//		this.strFilterName = strFilterName;
//	}
//
//	protected String getFilterBase() {
//		return this.strFilterBase;
//	}
//
//	protected void setFilterBase(String strFilterBase) {
//		this.strFilterBase = strFilterBase;
//	}
//	
//	@Override
//	protected AuthenticationUser onLoadUserByUsername(String srfsystem, String srforgid, String username, boolean bTryMode) throws Throwable {
//
//		return null;
//	}

	@Override
	protected AuthenticationUser onGetUserByLogin(String srfsystem, String srforgid, String username, String password, boolean bTryMode) throws Throwable {

//		String loginname = username;
//
//		// 查询Ldap人员
//		AndFilter filter = new AndFilter();
//		if (StringUtils.hasLength(loginname)) {
//			filter.and(new EqualsFilter(this.getFilterName(), loginname));
//		}
//
//		Boolean bAuthenticate = false;
//		try {
//			bAuthenticate = this.getLdapTemplate().authenticate(this.getFilterBase(), filter.encode(), password);
//		} catch (Throwable ex) {
//			log.error(String.format("认证发生异常， %1$s", ex.getMessage()), ex);
//		}
//		
//		if(!bAuthenticate) {
//			if(bTryMode) {
//				return null;
//			}
//			throw new UsernameNotFoundException("指定用户不存在");
//		}
//		
//		User user = this.getCloudSaaSUtilRuntime().getUserByName(username);
//		return this.getAuthenticationUser(user);
		
		throw new Exception("没有实现");
	}

	

}
