package net.ibizsys.central.cloud.core.security;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import net.ibizsys.central.cloud.core.util.domain.User;
import net.ibizsys.central.cloud.core.util.error.UnauthorizedException;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.EntityUtils;

@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticationUser implements IAuthenticationUser, IAuthenticationUserRuntime {

	private String userid = null;
	
	private String username = null;
	
	private String password = null;

	private boolean accountNonExpired = true;

	private boolean accountNonLocked = true;

	private boolean credentialsNonExpired = true;

	private boolean enabled = true;
	
	private String personid = null;
	
	private String personname = null;
	
	private String state = null;
	
	private int superuser = 0;
	
	private int apiuser = 0;
	
	private int devuser = 0;
	
	private int anonymoususer = 0;
	
	private String loginname = null;
	
	private String token = null;
	
	private String refreshtoken = null;
	
	private String email = null;
	
	private String scope = null;
	
	private int expirein = -1;
	
	private IEmployeeContext employeeContext = null;
	
	private Map<String, Object> sessionParams = new HashMap<String, Object>();
	
//    /**
//     * 上级组织
//     */
//    private String porg;
//    /**
//     * 下级组织
//     */
//    private String sorg;
//    /**
//     * 上级部门
//     */
//    private String pdept;
//    /**
//     * 下级部门
//     */
//    private String sdept;
	
//    /**
//     * 部门编码
//     */
//    private String mdeptcode = null;

    
	private Collection<? extends GrantedAuthority> authorities = null;

	@Override
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}
	
	@Override
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Override
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String getLoginname() {
		return this.loginname;
	}
	
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	@JsonIgnore
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	


	public String getPersonid() {
		return this.personid;
	}

	public void setPersonid(String personid) {
		this.personid = personid;
	}

	public String getPersonname() {
		return this.personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}
	
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	//@Override
	//@JsonProperty("superuser")
	public int getSuperuser() {
		return this.superuser;
	}
	
	//@JsonProperty("superuser")
	public void setSuperuser(int superuser) {
		this.superuser = superuser;
	}
	
	public int getApiuser() {
		return this.apiuser;
	}
	
	public void setApiuser(int apiuser) {
		this.apiuser = apiuser;
	}
	
	
	public int getDevuser() {
		return this.devuser;
	}
	
	public void setDevuser(int devuser) {
		this.devuser = devuser;
	}
	
	
	@Override
	public int getAnonymoususer() {
		return this.anonymoususer;
	}
	
	public void setAnonymoususer(int anonymoususer) {
		this.anonymoususer = anonymoususer;
	}
	
	@Override
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	@Override
	public String getRefreshtoken() {
		return this.refreshtoken;
	}

	public void setRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
	}
	
	@Override
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String getScope() {
		return this.scope;
	}
	
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	
	@Override
	public int getExpirein() {
		return this.expirein;
	}
	
	
	@Override
	public void setExpirein(int nExpirein) {
		this.expirein = nExpirein;
	}
	
//
//	public String getMdeptid() {
//		return this.getDeptid();
//	}
//
//	public void setMdeptid(String mdeptid) {
//		this.setDeptid(mdeptid);
//	}
//
//	public String getMdeptcode() {
//		return mdeptcode;
//	}
//
//	public void setMdeptcode(String mdeptcode) {
//		this.mdeptcode = mdeptcode;
//	}
//
//	public String getMdeptname() {
//		return this.getDeptname();
//	}
//
//	public void setMdeptname(String mdeptname) {
//		this.setDeptname(mdeptname);
//	}
//	
//	@Override
//	@JsonIgnore
//	public String getDeptid() {
//		return super.getDeptid();
//	}
//	
//	@Override
//	@JsonIgnore
//	public String getDeptname() {
//		return super.getDeptname();
//	}
	
//	@Override
//	@JsonIgnore
//	public String getUAAUserId() {
//		if(!StringUtils.hasLength(this.uaaUserId)) {
//			return this.getUserid();
//		}
//		return this.uaaUserId;
//	}
//	
//	@JsonIgnore
//	public void setUAAUserId(String uaaUserId) {
//		this.uaaUserId = uaaUserId;
//	}
//	
//	@Override
//	@JsonIgnore
//	public String getUAAUserName() {
//		if(!StringUtils.hasLength(this.uaaUserName)) {
//			return this.getUsername();
//		}
//		return this.uaaUserName;
//	}
//	
//	@JsonIgnore
//	public void setUAAUserName(String uaaUserName) {
//		this.uaaUserName = uaaUserName;
//	}
//	
	
	
	
	
//	public String getPorg() {
//		return porg;
//	}
//
//	public void setPorg(String porg) {
//		this.porg = porg;
//	}
//
//	public String getSorg() {
//		return sorg;
//	}
//
//	public void setSorg(String sorg) {
//		this.sorg = sorg;
//	}
//
//	public String getPdept() {
//		return pdept;
//	}
//
//	public void setPdept(String pdept) {
//		this.pdept = pdept;
//	}
//
//	public String getSdept() {
//		return sdept;
//	}
//
//	public void setSdept(String sdept) {
//		this.sdept = sdept;
//	}
//
//	public void setOrgInfo(Map<String, Set<String>> orgInfo) {
//        this.orgInfo = orgInfo;
//        if (!ObjectUtils.isEmpty(orgInfo) && !ObjectUtils.isEmpty(orgInfo.get("parentorg"))) {
//            porg = (String.format("'%s'", String.join("','", orgInfo.get("parentorg"))));
//            this.getSessionParams().put("srfporg", porg);
//        }
//        if (!ObjectUtils.isEmpty(orgInfo) && !ObjectUtils.isEmpty(orgInfo.get("suborg"))) {
//            sorg = (String.format("'%s'", String.join("','", orgInfo.get("suborg"))));
//            this.getSessionParams().put("srfsorg", sorg);
//        }
//        if (!ObjectUtils.isEmpty(orgInfo) && !ObjectUtils.isEmpty(orgInfo.get("parentdept"))) {
//            pdept = (String.format("'%s'", String.join("','", orgInfo.get("parentdept"))));
//            this.getSessionParams().put("srfpdept", pdept);
//        }
//        if (!ObjectUtils.isEmpty(orgInfo) && !ObjectUtils.isEmpty(orgInfo.get("subdept"))) {
//            sdept = (String.format("'%s'", String.join("','", orgInfo.get("subdept"))));
//            this.getSessionParams().put("srfsdept", sdept);
//        }
//    }

//    public void setPermissionList(JSONObject permissionList) {
//        this.permissionList = permissionList;
//        if (authorities == null && permissionList != null) {
//            if (permissionList.get("authorities") != null) {
//                authorities = new ArrayList<>();
//                for (int i = 0; i < permissionList.getJSONArray("authorities").size(); i++) {
//                    if(permissionList.getJSONArray("authorities").get(i) instanceof String){
//                        String item = permissionList.getJSONArray("authorities").getString(i);
//                        if(!StringUtils.isEmpty(item)){
//                            if(item.indexOf("ROLE_") == 0){
//                                String tag = item.substring(5);
//                                UAARoleAuthority authority = new UAARoleAuthority();
//                                authority.setName(tag);
//                                authority.setRoleTag(tag);
//                                authorities.add(authority);
//                            }else {
//                                authorities.add(new SimpleGrantedAuthority(String.valueOf(item)));
//                            }
//                        }
//                    }else {
//                        JSONObject json = permissionList.getJSONArray("authorities").getJSONObject(i);
//                        if (json.getString("type").equals("OPPRIV")) {
//                            authorities.add(JSONObject.parseObject(json.toString(), UAADEAuthority.class));
//                        } else if (json.getString("type").equals("APPMENU")) {
//                            authorities.add(JSONObject.parseObject(json.toString(), UAAMenuAuthority.class));
//                        } else if (json.getString("type").equals("UNIRES")) {
//                            authorities.add(JSONObject.parseObject(json.toString(), UAAUniResAuthority.class));
//                        } else if (json.getString("type").equals("ROLE")) {
//                            authorities.add(JSONObject.parseObject(json.toString(), UAARoleAuthority.class));
//                        }
//                    }
//                }
//            }
//        }
//    }
    



	

	@Override
	public IEmployeeContext getEmployeeContext() {
		return this.employeeContext;
	}
	
	@Override
	public void setEmployeeContext(IEmployeeContext employeeContext) {
		this.employeeContext = employeeContext;
	}

	public Map<String, Object> getSessionParams() {
		return sessionParams;
	}

	protected void setSessionParams(Map<String, Object> sessionParams) {
		this.sessionParams = sessionParams;
	}

	public static IAuthenticationUser getCurrent() {
		if (SecurityContextHolder.getContext() == null 
				|| SecurityContextHolder.getContext().getAuthentication() == null 
				|| SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null) {
			return null;
		}
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof IAuthenticationUser) {
			return (IAuthenticationUser) principal;
		} else {
			return null;
		}
	}
	
	public static IAuthenticationUser getCurrentMust() {
		IAuthenticationUser authenticationUser = getCurrent();
		if(authenticationUser == null) {
			throw new UnauthorizedException("当前用户认证信息无效");
		}
		
		return authenticationUser;
	}
	
	/**
	 * 设置当前认证用户（机构用户为null）
	 * @param iAuthenticationUser
	 */
	public static void setCurrent(IAuthenticationUser iAuthenticationUser) {
		setCurrent(iAuthenticationUser, null);
	}

	/**
	 * 设置当前认证用户及机构用户身份
	 * @param iAuthenticationUser
	 * @param iEmployeeContext
	 */
	public static void setCurrent(IAuthenticationUser iAuthenticationUser, IEmployeeContext iEmployeeContext) {
		if(iAuthenticationUser != null) {
			UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(iAuthenticationUser, iEmployeeContext, iAuthenticationUser.getAuthorities());
			authentication.setDetails(iEmployeeContext);
			SecurityContextHolder.getContext().setAuthentication(authentication);
		}
		else {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		UserContext.setCurrent(iEmployeeContext);
	}
	
	
	@Override
	public String toString() {
		return String.format("AuthenticationUser[%1$s]", this.getUsername());
	}

	public static AuthenticationUser from(User user) {
		
		AuthenticationUser authenticationUser = new AuthenticationUser();
		int superuser = DataTypeUtils.asInteger(user.getSuperUser(),0);
		EntityUtils.copyTo(user, authenticationUser);
		//增强开发者判断
		if(superuser == 2) {
			authenticationUser.setSuperuser(0);
			authenticationUser.setDevuser(1);
		}
		return authenticationUser;
	}
	
	
	/**
	 * 获取当前用户是否为超级用户
	 * @param authenticationUser
	 * @return
	 */
	public static boolean isSuperuser(IAuthenticationUser authenticationUser) {
		return authenticationUser.getSuperuser() == EntityBase.BOOLEAN_TRUE;	
	}
	
	/**
	 * 获取当前用户是否为开发用户
	 * @param authenticationUser
	 * @return
	 */
	public static boolean isDevuser(IAuthenticationUser authenticationUser) {
		return authenticationUser.getDevuser() == EntityBase.BOOLEAN_TRUE;	
	}

	/**
	 * 获取当前用户是否为API用户
	 * @param authenticationUser
	 * @return
	 */
	public static boolean isApiuser(IAuthenticationUser authenticationUser) {
		return authenticationUser.getApiuser() == EntityBase.BOOLEAN_TRUE;	
	}

}
