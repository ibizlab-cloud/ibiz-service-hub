package net.ibizsys.central.security;

import java.util.Locale;
import java.util.Map;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IWebContext;
import net.ibizsys.runtime.util.WebContext;



/**
 * 用户上下文运行时对象实现
 * @author lionlau
 *
 */
public class UserContextRuntime implements IUserContext,IUserContextRuntime {

	private String userid = null;
	private String username = null;
	private String usercode = null;
	private String orgid = null;
	private String orgname = null;
	private String deptid = null;
	private String deptname = null;
	private String orgcode = null;
	private String deptcode = null;
	private String remoteaddress = null;
	private boolean superuser = false;
	private boolean systemadmin = false;
	private boolean anonymoususer = false;
	private String tenant = null;
	private String dynainstid = null;
	private String dynainsttag = null;
	private String dynainsttag2 = null;
	private String porg = null;
	private String sorg = null;
	private String pdept = null;
	private String sdept = null;
	private transient IAppContext iAppContext = null;
	private transient IWebContext iWebContext = null;
	//private String systemid = null;
	
	public UserContextRuntime() {
		getWebContext();
	}
	
	@Override
	public String getUserid() {
		return this.userid;
	}

	@Override
	public String getUsername() {
		return this.username;
	}
	
	@Override
	public String getUsercode() {
		return usercode;
	}

	@Override
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	@Override
	public String getOrgid() {
		return this.orgid;
	}

	@Override
	public String getOrgname() {
		return this.orgname;
	}

	@Override
	public String getDeptid() {
		return this.deptid;
	}

	@Override
	public String getDeptname() {
		return this.deptname;
	}

	@Override
	public String getRemoteaddress() {
		return this.remoteaddress;
	}

	@Override
	public boolean isSuperuser() {
		return this.superuser;
	}

	@Override
	public String getTenant() {
		return this.tenant;
	}

	@Override
	public String getDynainstid() {
		return this.dynainstid;
	}

	@Override
	public String getDynainsttag() {
		return this.dynainsttag;
	}

	@Override
	public String getDynainsttag2() {
		return this.dynainsttag2;
	}



	@Override
	public void setUserid(String userid) {
		this.userid = userid;
	}



	@Override
	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}



	@Override
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}



	@Override
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}



	@Override
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	
	@Override
	public String getOrgcode() {
		return orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	@Override
	public String getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}

	@Override
	public void setRemoteaddress(String remoteaddress) {
		this.remoteaddress = remoteaddress;
	}



	@Override
	public void setSuperuser(boolean superuser) {
		this.superuser = superuser;
	}


	@Override
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}



	@Override
	public void setDynainstid(String dynainstid) {
		this.dynainstid = dynainstid;
	}



	@Override
	public void setDynainsttag(String dynainsttag) {
		this.dynainsttag = dynainsttag;
	}



	@Override
	public void setDynainsttag2(String dynainsttag2) {
		this.dynainsttag2 = dynainsttag2;
	}
	
	@Override
	public String getPorg() {
		return porg;
	}

	@Override
	public void setPorg(String porg) {
		this.porg = porg;
	}

	@Override
	public String getSorg() {
		return sorg;
	}

	@Override
	public void setSorg(String sorg) {
		this.sorg = sorg;
	}

	@Override
	public String getPdept() {
		return pdept;
	}

	@Override
	public void setPdept(String pdept) {
		this.pdept = pdept;
	}

	@Override
	public String getSdept() {
		return sdept;
	}

	@Override
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	

	@Override
	public String getLocalization(String strResId, String strDefault) {
		return strDefault;
	}

	@Override
	public String getLocalization(String strResId, Object[] params, String strDefault) {
		return strDefault;
	}

	@Override
	public String getLocalization(String strResId, String strDefault, Locale locale) {
		return strDefault;
	}

	@Override
	public String getLocalization(String strResId, Object[] params, String strDefault, Locale locale) {
		return strDefault;
	}


	@Override
	public boolean testSysUniRes(String strUniResCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Object> getSessionParams() {
		return null;
	}
	
	@Override
	public Object getSessionParam(String strKey) {
		if(getSessionParams()!=null) {
			return getSessionParams().get(strKey);
		}
		return null;
	}

	@Override
	public boolean isSystemadmin() {
		return this.systemadmin;
	}

	@Override
	public void setSystemadmin(boolean systemadmin) {
		this.systemadmin = systemadmin;
	}
	
	
	
//
//
//	@Override
//	public String getSystemid() {
//		return this.systemid;
//	}
//	
//	public void setSystemid(String systemid) {
//		this.systemid = systemid;
//	}
//	
//	

	@Override
	public boolean isAnonymoususer() {
		return this.anonymoususer;
	}
	
	@Override
	public void setAnonymoususer(boolean anonymoususer) {
		this.anonymoususer = anonymoususer;
	}
	

	@Override
	@JsonIgnore
	public IAppContext getAppContext() {
		return this.iAppContext;
	}

	@Override
	@JsonIgnore
	public void setAppContext(IAppContext iAppContext) {
		this.iAppContext = iAppContext;
	}

	@Override
	@JsonIgnore
	public IWebContext getWebContext() {
		if(this.iWebContext == null) {
			RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
			if (requestAttributes instanceof ServletRequestAttributes) {
				this.iWebContext = new WebContext(((ServletRequestAttributes) requestAttributes).getRequest());
			}
		}
		return this.iWebContext;
	}
	
	@Override
	@JsonIgnore
	public IWebContext getWebContextMust() {
		IWebContext iWebContext = this.getWebContext();
		if(iWebContext != null) {
			return iWebContext;
		}
		throw new RuntimeException("Web请求上下文无效");
	}

	@Override
	@JsonIgnore
	public void setWebContext(IWebContext iWebContext) {
		this.iWebContext = iWebContext;
	}

	
	
	
	
}
