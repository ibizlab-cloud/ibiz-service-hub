package net.ibizsys.central.cloud.uaa.core.addin;

import java.util.HashMap;
import java.util.Map;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import org.apache.commons.logging.LogFactory;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityUtils;

public class LdapAuthAgent extends AuthAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(LdapAuthAgent.class);

	private LdapTemplate ldapTemplate = null;

	/**
	 * 过滤器名称
	 */
	private String strFilterName;

	/**
	 * 过滤器根路径
	 */
	private String strFilterBase;


	@Override
	protected void onInit() throws Exception {

		super.onInit();

		if (this.getLdapTemplate(true) == null) {
			this.prepareLdapTemplate();
		}

		if (!StringUtils.hasLength(this.getFilterName())) {
			this.setFilterName(DataTypeUtils.getStringValue(this.getConfigEntity().get("filter-name"), null));
			if (!StringUtils.hasLength(this.getFilterName())) {
				throw new Exception("未定义过滤器名称");
			}
		}

		if (!StringUtils.hasLength(this.getFilterBase())) {
			this.setFilterBase(DataTypeUtils.getStringValue(this.getConfigEntity().get("filter-base"), null));
			if (!StringUtils.hasLength(this.getFilterBase())) {
				throw new Exception("未定义过滤器基础路径");
			}
		}
	}

	protected LdapTemplate getLdapTemplate() {
		return getLdapTemplate(false);
	}

	protected LdapTemplate getLdapTemplate(boolean bTryMode) {
		if (this.ldapTemplate != null || bTryMode) {
			return this.ldapTemplate;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudUtilRuntime(), "未指定Ldap访问对象");
	}

	protected void setLdapTemplate(LdapTemplate ldapTemplate) {
		this.ldapTemplate = ldapTemplate;
	}

	protected void prepareLdapTemplate() throws Exception {

		LdapContextSource contextSource = new LdapContextSource();

		EntityUtils.copyTo(this.getConfigEntity(), contextSource);
		if (!this.getConfigEntity().contains("pooled")) {
			contextSource.setPooled(true);
		}

		Map<String, Object> config = new HashMap<>();
		config.put("java.naming.ldap.attributes.binary", DataTypeUtils.getStringValue(this.getConfigEntity().get("java.naming.ldap.attributes.binary"), "objectGUID"));
		contextSource.setBaseEnvironmentProperties(config);

		contextSource.afterPropertiesSet(); // important

		LdapTemplate ldapTemplate = new LdapTemplate(contextSource);
		this.setLdapTemplate(ldapTemplate);
	}


	protected String getFilterName() {
		return this.strFilterName;
	}

	protected void setFilterName(String strFilterName) {
		this.strFilterName = strFilterName;
	}

	protected String getFilterBase() {
		return this.strFilterBase;
	}

	protected void setFilterBase(String strFilterBase) {
		this.strFilterBase = strFilterBase;
	}

	@Override
	protected AuthenticationUser onGetUserByName(String srfsystem, String srforgid, String username, boolean bTryMode) throws Throwable {

		return null;
	}

	@Override
	protected AuthenticationUser onGetUserByLogin(String srfsystem, String srforgid, String username, String password, boolean bTryMode) throws Throwable {

		AndFilter filter = new AndFilter();
		if (StringUtils.hasLength(username)) {
			filter.and(new EqualsFilter(this.getFilterName(), username));
		}

		String strUserName = null;
		try {
			boolean bAuthenticate = this.getLdapTemplate().authenticate(this.getFilterBase(), filter.encode(), password);
			if (bAuthenticate) {
				strUserName = username;
			}

		} catch (Throwable ex) {
			log.error(String.format("认证发生异常， %1$s", ex.getMessage()), ex);
		}

		return this.getAuthenticationUser(strUserName, bTryMode);
	}

	@Override
	public String getName() {
		return ICloudAuthUtilRuntime.AUTHAGENT_LDAP;
	}
}