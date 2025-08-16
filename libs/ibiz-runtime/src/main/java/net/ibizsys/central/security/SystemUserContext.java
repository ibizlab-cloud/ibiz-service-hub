package net.ibizsys.central.security;

import java.util.Locale;
import java.util.Map;

import org.springframework.util.Assert;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IWebContext;

/**
 * 系统用户上下文
 * 
 * @author lionlau
 *
 */
public class SystemUserContext implements IUserContext {

	private IUserContext iUserContext = null;

	public SystemUserContext(IUserContext iUserContext) {
		Assert.notNull(iUserContext, "用户上下文对象无效");
		this.setRealUserContext(iUserContext);
	}

	public IUserContext getRealUserContext() {
		return this.iUserContext;
	}

	protected void setRealUserContext(IUserContext iUserContext) {
		this.iUserContext = iUserContext;
	}

	@Override
	public String getUserid() {
		return "SYSTEM";
	}

	@Override
	public String getUsername() {
		return "系统内置用户";
	}

	@Override
	public String getUsercode() {
		return null;
	}

	@Override
	public String getOrgid() {
		return getRealUserContext().getOrgid();
	}

	@Override
	public String getOrgname() {
		return getRealUserContext().getOrgname();
	}

	@Override
	public String getDeptid() {
		return getRealUserContext().getDeptid();
	}

	@Override
	public String getDeptname() {
		return getRealUserContext().getDeptname();
	}

	@Override
	public String getOrgcode() {
		return getRealUserContext().getOrgcode();
	}

	@Override
	public String getDeptcode() {
		return getRealUserContext().getDeptcode();
	}

	@Override
	public String getPorg() {
		return getRealUserContext().getPorg();
	}

	@Override
	public String getSorg() {
		return getRealUserContext().getSorg();
	}

	@Override
	public String getPdept() {
		return getRealUserContext().getPdept();
	}

	@Override
	public String getSdept() {
		return getRealUserContext().getSdept();
	}

	@Override
	public String getRemoteaddress() {
		return getRealUserContext().getRemoteaddress();
	}

	@Override
	public Object getSessionParam(String strKey) {
		return getRealUserContext().getSessionParam(strKey);
	}

	@Override
	public boolean isSuperuser() {
		return true;
	}

	@Override
	public boolean isSystemadmin() {
		return true;
	}

	@Override
	public boolean testSysUniRes(String strUniResCode) {
		return true;
	}

	@Override
	public String getTenant() {
		return getRealUserContext().getTenant();
	}

	@Override
	public String getDynainstid() {
		return getRealUserContext().getDynainstid();
	}

	@Override
	public String getDynainsttag() {
		return getRealUserContext().getDynainsttag();
	}

	@Override
	public String getDynainsttag2() {
		return getRealUserContext().getDynainsttag2();
	}

	@Override
	public String getLocalization(String strResId, String strDefault) {
		return getRealUserContext().getLocalization(strResId, strDefault);
	}

	@Override
	public String getLocalization(String strResId, Object[] params, String strDefault) {
		return getRealUserContext().getLocalization(strResId, params, strDefault);
	}

	@Override
	public String getLocalization(String strResId, String strDefault, Locale locale) {
		return getRealUserContext().getLocalization(strResId, strDefault, locale);
	}

	@Override
	public String getLocalization(String strResId, Object[] params, String strDefault, Locale locale) {
		return getRealUserContext().getLocalization(strResId, params, strDefault, locale);
	}

	@Override
	public IAppContext getAppContext() {
		return getRealUserContext().getAppContext();
	}

	@Override
	public void setAppContext(IAppContext iAppContext) {
		getRealUserContext().setAppContext(iAppContext);
	}

	@Override
	public IWebContext getWebContext() {
		return getRealUserContext().getWebContext();
	}

	@Override
	public IWebContext getWebContextMust() {
		return getRealUserContext().getWebContextMust();
	}

	@Override
	public void setWebContext(IWebContext iWebContext) {
		getRealUserContext().setWebContext(iWebContext);
	}

	@Override
	public Map<String, Object> getSessionParams() {
		return getRealUserContext().getSessionParams();
	}

	@Override
	public boolean isAnonymoususer() {
		return false;
	}

}
