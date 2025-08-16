package net.ibizsys.central.cloud.uaa.core.spring.controller;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
import org.springframework.security.oauth2.common.exceptions.InvalidRequestException;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedUserException;
import org.springframework.security.oauth2.common.util.OAuth2Utils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationInfo;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUserRuntime;
import net.ibizsys.central.cloud.core.security.PasswordPolicyException;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.OrgSystem;
import net.ibizsys.central.cloud.uaa.core.IUAAUtilSystemRuntime;
import net.ibizsys.central.cloud.uaa.core.security.AuthorizationLogin;
import net.ibizsys.runtime.util.DataTypeUtils;

@RestController()
@RequestMapping("")
public class UAARestController {

	private static final Log log = LogFactory.getLog(UAARestController.class);

	@Autowired
	IServiceHub iServiceHub;

	private ICloudUAAUtilRuntime iCloudUAAUtilRuntime = null;

	private ICloudAuthUtilRuntime iCloudAuthUtilRuntime = null;

	private static ObjectMapper MAPPER = new ObjectMapper();

	static {
		MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
	}

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudUAA服务已经启动"));
		iServiceHub.registerIgnoreAuthPattern("/v7/login/**,/uaa/login/**,/uaa/open/**,/uaa/oauth/token/**,/uaa/refresh_token/**");

		iServiceHub.registerNamingService("ibizcloud-uaa");
		if (this.iCloudAuthUtilRuntime == null) {
			iServiceHub.requireCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudAuthUtilRuntime.class);
		}
		if (this.iCloudUAAUtilRuntime == null) {
			iServiceHub.requireCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudUAAUtilRuntime.class);
		}
	}

	protected ICloudUAAUtilRuntime getCloudUAAUtilRuntime() {
		if (this.iCloudUAAUtilRuntime == null) {
			try {
				this.iCloudUAAUtilRuntime = iServiceHub.getCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudUAAUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.error(String.format("获取Cloud体系UAA功能模块发生异常，$1%s", ex.getMessage()), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud体系UAA功能模块"), ex);
			}
		}
		return this.iCloudUAAUtilRuntime;
	}

	protected ICloudAuthUtilRuntime getCloudAuthUtilRuntime() {
		if (this.iCloudAuthUtilRuntime == null) {
			try {
				this.iCloudAuthUtilRuntime = iServiceHub.getCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudAuthUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.error(String.format("获取Cloud体系认证功能模块发生异常，$1%s", ex.getMessage()), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud体系认证功能模块"), ex);
			}
		}
		return this.iCloudAuthUtilRuntime;
	}

	// @Value("${ibiz.jwt.header:Authorization}")
	// private String tokenHeader;
	//
	// @Value("${ibiz.auth.cookie.domain:}")
	// private String cookiedomain;

	// @Autowired
	// private AuthTokenUtil jwtTokenUtil;
	//
	// @Autowired
	//// @Qualifier("UAAUserService")
	// private AuthenticationUserService userDetailsService;
	//
	// @Autowired
	// UAACoreService uaaCoreService;
	//
	// @Autowired
	// private ISysUserService userService;
	// @Autowired
	// private ISysEmployeeService employeeService;

	// @Value("${ibiz.auth.pwencrymode:0}")
	// private int pwencrymode;
	
	

	@PostMapping(value = { "/v7/login", "/uaa/login" })
	public ResponseEntity<AuthenticationInfo> login(@Validated @RequestBody Map jsonObject) {
		AuthorizationLogin authorizationLogin;
		try {
			authorizationLogin = MAPPER.readValue(MAPPER.writeValueAsString(jsonObject), AuthorizationLogin.class);
		} catch (JsonProcessingException e) {
			log.error(String.format("登陆请求反序列化参数异常,%1$s", e.getMessage()));
			throw new RuntimeException("登陆请求参数异常");
		}
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String srfsystemid = request.getHeader("srfsystemid");
		String srforgid = request.getHeader("srforgid");
		if ("undefined".equals(srfsystemid)) {
			srfsystemid = null;
		}
		if ("undefined".equals(srforgid)) {
			srforgid = null;
		}

		try {
			IAuthenticationUser user = getCloudAuthUtilRuntime().getUserByLogin(authorizationLogin.getUsername(), authorizationLogin.getPassword());
			// 重置用户状态
			// getCloudUAAUtilRuntime().resetUserByName(user.getUsername());

			long nTokenExpiration = this.getCloudUAAUtilRuntime().getTokenExpiration();
			if (authorizationLogin.getRememberme() != null && authorizationLogin.getRememberme()) {
				if (this.getCloudUAAUtilRuntime().getRememberMe() > 0) {
					nTokenExpiration = this.getCloudUAAUtilRuntime().getRememberMe();
				}
			}
			else
				if(user.getApiuser() == 1 && this.getCloudUAAUtilRuntime().getApiTokenExpiration() > 0) {
					nTokenExpiration = this.getCloudUAAUtilRuntime().getApiTokenExpiration();
				}

			final AuthenticationInfo authenticationInfo = getCloudUAAUtilRuntime().generateToken2(user, nTokenExpiration);
			final String token = authenticationInfo.getToken();
			if (user.getExpirein() <= 0) {
				if (user instanceof IAuthenticationUserRuntime) {
					((IAuthenticationUserRuntime) user).setExpirein(getCloudUAAUtilRuntime().getExpireInFromToken(token));
				}
				// user.setExpirein(getCloudUAAUtilRuntime().getExpireInFromToken(token));
			}

			AppData appData = null;
			if (StringUtils.hasLength(srfsystemid) && StringUtils.hasLength(srforgid)) {
				if (user instanceof IAuthenticationUserRuntime) {
					((IAuthenticationUserRuntime) user).setToken(token);
				}
				// user.setToken(token);
				appData = this.getCloudUAAUtilRuntime().getAppData(user, srfsystemid, srforgid);
			}
			// AuthenticationUser user2 = new AuthenticationUser();
			// CachedBeanCopier.copy(user, user2);
			// user2.setAuthorities(null);
			// 返回 token
			return ResponseEntity.ok().body(new AuthenticationInfo(token, user.getExpirein(), appData, authenticationInfo.getRefresh_token()));
		} catch (Throwable ex) {
			log.error(ex);
			if (ex instanceof PasswordPolicyException) {
				throw new RuntimeException(ex.getMessage());
			}
			throw new RuntimeException("用户名或密码错误");
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = { "/v7/logout", "/uaa/logout" })
	public void logout() {

		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrent();
		if (iAuthenticationUser != null) {
			getCloudUAAUtilRuntime().resetUser(iAuthenticationUser);
		}
	}

	@GetMapping(value = "/uaa/getbydcsystem/{srfdcsystem}")
	public ResponseEntity<Collection<OrgSystem>> getOrgSystems(@PathVariable("srfdcsystem") String srfdcsystem) {

		Collection<OrgSystem> orgSystemList = this.getCloudUAAUtilRuntime().getOrgSystems(srfdcsystem);
		if (ObjectUtils.isEmpty(orgSystemList)) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}

		return ResponseEntity.ok().body(orgSystemList);
	}

	@GetMapping(value = "/uaa/publickey")
	public ResponseEntity<String> getPublicKey() {
		return ResponseEntity.ok().body(this.getCloudUAAUtilRuntime().getPublicKey());
	}

	@GetMapping(value = { "/appdata", "/appdata/{srfdcsystem}"})
	public ResponseEntity<AppData> getAppData(@RequestHeader(value = "srfsystemid", defaultValue = "undefined") String srfsystemid, @RequestHeader(value = "srforgid", defaultValue = "undefined") String srforgid, @PathVariable(value="srfdcsystem",required=false) String srfdcsystem) {
		
		Collection<OrgSystem> orgSystemList = null;
		if(StringUtils.hasLength(srfdcsystem)) {
			orgSystemList = this.getCloudUAAUtilRuntime().getOrgSystems(srfdcsystem);
			if (ObjectUtils.isEmpty(orgSystemList)) {
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
			}
			OrgSystem orgSystem = orgSystemList.iterator().next();
			srfsystemid = orgSystem.getSystemId();
			srforgid = orgSystem.getOrgId();
		}
		else {
			if ("undefined".equals(srfsystemid)) {
				srfsystemid = null;
			}
			if ("undefined".equals(srforgid)) {
				srforgid = null;
			}
		}

		AppData appData = this.getCloudUAAUtilRuntime().getAppData(srfsystemid, srforgid);
		if (appData == null) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
		
		if(orgSystemList!=null) {
			appData.set("orgsystems", orgSystemList);
		}

		return ResponseEntity.ok().body(appData);
	}


	/**
	 * token续期
	 *
	 * @param oldToken
	 *            业务系统即将到期的token
	 * @return 新token
	 */
	@PostMapping(value = { "/uaa/refreshToken", "/uaa/refreshtoken" })
	public ResponseEntity<String> refreshToken(@Validated @RequestBody String oldToken) {
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
		return ResponseEntity.ok().body(getCloudUAAUtilRuntime().refreshToken(oldToken));
	}

	@GetMapping(value = { "/uaa/refreshToken2", "/uaa/refreshtoken2" })
	public ResponseEntity<AuthenticationInfo> refreshToken2() {

		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();

		String strToken = getCloudUAAUtilRuntime().refreshToken(iAuthenticationUser.getToken());
		int nExpireIn = getCloudUAAUtilRuntime().getExpireInFromToken(strToken);
		return ResponseEntity.ok().body(new AuthenticationInfo(strToken, nExpireIn, null));

	}

	@GetMapping(value = { "/uaa/refresh_token/{refresh_token}" })
	public ResponseEntity<AuthenticationInfo> refreshToken2(@PathVariable("refresh_token") String refresh_token) {
		return ResponseEntity.ok().body(getCloudUAAUtilRuntime().refreshToken2(refresh_token));
	}
	
	
	@PostMapping(value = { "/v7/changepwd", "/uaa/changepwd" })
	public ResponseEntity<Boolean> changePassword(@Validated @RequestBody Map jsonObject) {

		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();

		String oldpwd = DataTypeUtils.getStringValue(jsonObject.get("oldPwd"), null);// 旧密码
		String newpwd = DataTypeUtils.getStringValue(jsonObject.get("newPwd"), null);// 新密码

		if (!StringUtils.hasLength(oldpwd)) {
			throw new RuntimeException("旧密码为空");
		}

		if (!StringUtils.hasLength(newpwd)) {
			throw new RuntimeException("新密码为空");
		}

		try {
			this.getCloudAuthUtilRuntime().changePassword(iAuthenticationUser, oldpwd, newpwd);
		} catch (Throwable ex) {
			log.error(ex);
			
			Throwable originCause = ex;
			while(originCause != null) {
				if (originCause instanceof PasswordPolicyException) {
					throw new RuntimeException(originCause.getMessage());
				}
				originCause = originCause.getCause();
			}
			
			throw new RuntimeException("用户名或密码错误");
		}
		return ResponseEntity.ok(true);
	}
	//
	// @PostMapping(value = "uaa/login")
	// public ResponseEntity<AuthenticationInfo> uaalogin(@Validated
	// @RequestBody AuthorizationLogin authorizationLogin) {
	// return login(authorizationLogin);
	// }
	//
	//
	// @PostMapping(value = "uaa/loginbyusername")
	// public ResponseEntity<AuthenticationUser>
	// loginByUsername(@RequestHeader(required = false, name = "srfsystemid")
	// String system, @RequestHeader(required = false, name = "srforgid") String
	// orgid, @Validated @RequestBody String username) {
	// AuthenticationUser user = null;
	// if (StringUtils.isEmpty(system) || "undefined".equals(system)) {
	// user = userDetailsService.loadUserByUsername(username);
	// } else {
	// user = userDetailsService.loadUserByUsername(system, orgid, username);
	// }
	// return ResponseEntity.ok().body(user);
	// }
	//
	// @PostMapping(value = "/uaa/loadbyukey")
	// public ResponseEntity<AuthenticationUser> loadByUKey(
	// @RequestHeader(required = false, name = "srfsystemid") String system,
	// @RequestHeader(required = false, name = "srforgid") String srforgid,
	// @RequestBody String ukey) {
	//
	// SysEmployeeSearchContext searchContext = new SysEmployeeSearchContext();
	// searchContext.setN_reserver_eq(ukey);
	// Page<SysEmployee> empPage =
	// employeeService.searchIgnoreCenter(searchContext);
	// List<SysEmployee> emps = empPage.getContent();
	//
	// SysEmployee emp = (emps == null || emps.isEmpty()) ? null : emps.get(0);
	// if (emp == null) {
	// throw new UsernameNotFoundException("UKEY用户" + ukey + "未找到");
	// }
	//
	// AuthenticationUser curUser = new AuthenticationUser();
	// CachedBeanCopier.copy(emp, curUser);
	// curUser.setSuperuser(emp.getSuperuser() == null ? 0 :
	// emp.getSuperuser());
	// if (curUser.getSuperuser() == 1) {
	// curUser.setAuthorities(AuthorityUtils.createAuthorityList("ROLE_SUPERADMIN"));
	// }
	// if (StringUtils.isEmpty(curUser.getPersonid())) {
	// curUser.setPersonid(curUser.getUserid());
	// }
	//
	// return ResponseEntity.ok().body(curUser);
	// }
	//
	//
	// @Autowired
	// SystemRuntime systemRuntime;
	//
	// /**
	// * test 当前用户统一资源
	// *
	// * @param uniReses
	// * @return
	// */
	// @PostMapping(value = "/uaa/testsysunires")
	// public ResponseEntity<List<Boolean>> testSysUnires(@Validated
	// @RequestBody List<String> uniReses) {
	// if (uniReses == null)
	// return null;
	// List<UAAUniResAuthority> uniResAuthorities =
	// systemRuntime.getUAAUniResAuthority();
	// List<String> sysUnireses =
	// uniResAuthorities.stream().map(uaaUniResAuthority ->
	// uaaUniResAuthority.getUnionResTag()).collect(Collectors.toList());
	// List<Boolean> result = new ArrayList<>();
	// for (String uniRes : uniReses) {
	// try {
	// if (sysUnireses.contains(uniRes))
	// result.add(true);
	// else {
	// result.add(false);
	// }
	// } catch (Exception e) {
	// result.add(false);
	// }
	// }
	// return ResponseEntity.ok().body(result);
	// }
	//
	//
	// /**
	// * 获取当前用户统一资源
	// *
	// * @return
	// */
	// @GetMapping(value = "/uaa/sysunires")
	// public ResponseEntity<List<String>> getSysUnireses() {
	// List<UAAUniResAuthority> uniResAuthorities =
	// systemRuntime.getUAAUniResAuthority();
	// List<String> sysUnireses =
	// uniResAuthorities.stream().map(uaaUniResAuthority ->
	// uaaUniResAuthority.getUnionResTag()).collect(Collectors.toList());
	// return ResponseEntity.ok().body(sysUnireses);
	// }

	/**
	 * 获取开放平台应用信息
	 * 
	 * @param opentype
	 *            开放平台类型
	 * @param id
	 * @return
	 */
	@GetMapping(value = { "/uaa/open/{opentype}/appid" }) // "/uaa/open/{opentype}/access_token",
	public ResponseEntity<ObjectNode> getOpenAccessInfo(@PathVariable("opentype") String opentype, @RequestParam(value = "id", required = false) String id) {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String srfdcsystem = request.getHeader("srfdcsystem");
		if ("undefined".equals(srfdcsystem)) {
			srfdcsystem = null;
		}

		return ResponseEntity.ok(this.getCloudUAAUtilRuntime().getOpenAccessInfo(srfdcsystem, opentype, id));
	}

	/**
	 * 开放平台用户登录
	 * 
	 * @param opentype
	 *            开放平台类型
	 * @param id
	 * @return
	 */
	@GetMapping(value = { "/uaa/open/{opentype}/sns/{code}" })
	public ResponseEntity<AuthenticationInfo> openSNSCodeLogin(@PathVariable("opentype") String opentype, @PathVariable(value = "code") String code, @RequestParam(value = "id", required = false) String id) {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String srfdcsystem = request.getHeader("srfdcsystem");
		if ("undefined".equals(srfdcsystem)) {
			srfdcsystem = null;
		}

		try {
			IAuthenticationUser user = this.getCloudUAAUtilRuntime().getUserByOpenSNSCode(srfdcsystem, opentype, code, id);
			final AuthenticationInfo authenticationInfo = getCloudUAAUtilRuntime().generateToken2(user);
			final String token = authenticationInfo.getToken();
			if (user.getExpirein() <= 0) {
				if (user instanceof IAuthenticationUserRuntime) {
					((IAuthenticationUserRuntime) user).setExpirein(getCloudUAAUtilRuntime().getExpireInFromToken(token));
				}
			}

			AppData appData = null;

			return ResponseEntity.ok().body(new AuthenticationInfo(token, user.getExpirein(), appData, authenticationInfo.getRefresh_token()));
		} catch (Throwable ex) {
			log.error(ex);
			throw new RuntimeException("用户名或密码错误");
		}
	}

	/**
	 * 开放平台用户登录
	 * 
	 * @param opentype
	 *            开放平台类型
	 * @param id
	 * @return
	 */
	@GetMapping(value = { "/uaa/open/{opentype}/auth/{code}" })
	public ResponseEntity<AuthenticationInfo> openAuthCodeLogin(@PathVariable("opentype") String opentype, @PathVariable(value = "code") String code, @RequestParam(value = "id", required = false) String id) {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String srfdcsystem = request.getHeader("srfdcsystem");
		if ("undefined".equals(srfdcsystem)) {
			srfdcsystem = null;
		}

		try {
			IAuthenticationUser user = this.getCloudUAAUtilRuntime().getUserByOpenAuthCode(srfdcsystem, opentype, code, id);
			final AuthenticationInfo authenticationInfo = getCloudUAAUtilRuntime().generateToken2(user);
			final String token = authenticationInfo.getToken();
			//final String token = getCloudUAAUtilRuntime().generateToken(user);
			if (user.getExpirein() <= 0) {
				if (user instanceof IAuthenticationUserRuntime) {
					((IAuthenticationUserRuntime) user).setExpirein(getCloudUAAUtilRuntime().getExpireInFromToken(token));
				}
			}

			AppData appData = null;

			return ResponseEntity.ok().body(new AuthenticationInfo(token, user.getExpirein(), appData, authenticationInfo.getRefresh_token()));
		} catch (Throwable ex) {
			log.error(ex);
			throw new RuntimeException("用户名或密码错误");
		}
	}

	// @GetMapping(value = { "/uaa/open/dingtalk/auth" }) //
	// "/uaa/open/{opentype}/access_token",
	// public ResponseEntity<ObjectNode> dingtalkAuth(@RequestParam(value =
	// "authCode")String authCode) {
	//
	// HttpServletRequest request = ((ServletRequestAttributes)
	// RequestContextHolder.getRequestAttributes()).getRequest();
	// StringBuffer url = request.getRequestURL();
	// return null;
	// }

	//
	// /**
	// * 内部应用code模拟登录
	// * @param code
	// * @param id
	// * @return
	// */
	// @GetMapping(value = {"/uaa/open/dingtalk/auth/{code}"})
	// public ResponseEntity<AuthenticationInfo>
	// getUserByToken(@PathVariable(value = "code") String code,
	// @RequestParam(value = "id",required = false) String id) {
	//
	// AuthenticationUser
	// user=userDingtalkRegisterService.getUserByToken(id,code);
	//
	// final String token = jwtTokenUtil.generateToken(user);
	//
	// AuthenticationUser user2=new AuthenticationUser();
	// CachedBeanCopier.copy(user,user2);
	// user2.setSuperuser(user.getSuperuser());
	// user2.setAuthorities(null);
	// user2.setPermissionList(null);
	// // 返回 token
	// return ResponseEntity.ok().body(new AuthenticationInfo(token,user2));
	//
	// }
	//
	// /**
	// * 扫码后查询钉钉用户
	// * 已注册:返回注册用户并登录
	// * 未注册:进行注册
	// * @param code
	// * @param id
	// * @return
	// */
	// @GetMapping(value = "/uaa/open/dingtalk/sns/{code}")
	// public ResponseEntity<JSONObject> getUserBySnsToken(@PathVariable(value =
	// "code") String code, @RequestParam(value = "id",required = false) String
	// id) {
	// if (StringUtils.isEmpty(code))
	// throw new BadRequestAlertException("code为空",
	// "UserDingtalkRegisterResource", "");
	//
	// return ResponseEntity.ok().body(getUserBySnsCode(id,code));
	// }
	//
	// private JSONObject getUserBySnsCode(String id,String code)
	// {
	// JSONObject object =
	// userDingtalkRegisterService.getUserBySnsToken(id,code);
	// if (!StringUtils.isEmpty(object.getString("username"))) {
	// String username = object.getString("username");
	// // 生成登录token信息
	// userDetailsService.resetByUsername(username);
	// AuthenticationUser user =
	// userDetailsService.loadUserByUsername(username);
	// final String token = jwtTokenUtil.generateToken(user);
	// AuthenticationUser user2 = new AuthenticationUser();
	// CachedBeanCopier.copy(user, user2);
	// user2.setAuthorities(null);
	// user2.setPermissionList(null);
	// object.put("token", token);
	// object.put("user", user2);
	// }
	// return object;
	// }
	//
	//
	// /**
	// * 绑定钉钉并注册
	// * @param param
	// * @return
	// */
	// @PostMapping(value =
	// {"/uaa/bindDingtalkToRegister","/uaa/open/dingtalk/bind"})
	// public ResponseEntity<AuthenticationInfo>
	// bindDingtalkToRegister(@RequestBody JSONObject param) {
	// // 空校验
	// String loginname = param.getString("loginname");
	// String password = param.getString("password");
	// String openid = param.getString("openid");
	// String nickname = param.getString("nickname");
	// String personname = param.getString("personname");
	// String phone = param.getString("phone");
	// String email = param.getString("email");
	// String domains = param.getString("domains");
	// if (StringUtils.isEmpty(loginname))
	// throw new BadRequestAlertException("用户名为空",
	// "UserDingtalkRegisterResource", "");
	// if (StringUtils.isEmpty(password))
	// throw new BadRequestAlertException("密码为空",
	// "UserDingtalkRegisterResource", "");
	// if (StringUtils.isEmpty(openid))
	// throw new BadRequestAlertException("钉钉信息openid为空",
	// "UserDingtalkRegisterResource", "");
	//
	// // 钉钉用户注册
	// SysUser sysUser = new SysUser();
	// sysUser.setPassword(password);
	// sysUser.setLoginname(loginname);
	// sysUser.setPersonname(StringUtils.isEmpty(personname)?nickname:personname);
	// sysUser.setNickname(nickname);
	// sysUser.setPhone(phone);
	// sysUser.setEmail(email);
	// sysUser.setDomains(domains);
	//
	// SysUserAuth userAuth = new SysUserAuth();
	// userAuth.setIdentifier(openid);
	// userAuth.setIdentityType("dingtalk");
	//
	// userRegisterService.toRegister(sysUser,userAuth);
	//
	// // 生成登录token信息
	// userDetailsService.resetByUsername(sysUser.getLoginname()+(StringUtils.isEmpty(sysUser.getDomains())?"":("|"+sysUser.getDomains())));
	// AuthenticationUser user =
	// userDetailsService.loadUserByUsername(sysUser.getLoginname()+(StringUtils.isEmpty(sysUser.getDomains())?"":("|"+sysUser.getDomains())));
	// final String token = jwtTokenUtil.generateToken(user);
	// AuthenticationUser user2 = new AuthenticationUser();
	// CachedBeanCopier.copy(user, user2);
	// user2.setAuthorities(null);
	// user2.setPermissionList(null);
	//
	//
	// return ResponseEntity.ok().body(new AuthenticationInfo(token,user2));
	// }

	@RequestMapping(value = "/uaa/oauth/code", method = { RequestMethod.POST, RequestMethod.GET })
	public String oauthCode(@RequestBody(required = false) Map<String, String> body, HttpServletRequest httpServletRequest) {

		String strQueryString = httpServletRequest.getQueryString();
		Map<String, Object> parameters = RestUtils.queryString2Map(strQueryString);
		if (body != null) {
			parameters.putAll(body);
		}

		String strClientId = DataTypeUtils.getStringValue((String) parameters.get(OAuth2Utils.CLIENT_ID), null);
		if (!StringUtils.hasLength(strClientId)) {
			throw new InvalidRequestException("未传入客户端标识");
		}

		String strScope = DataTypeUtils.getStringValue((String) parameters.get(OAuth2Utils.SCOPE), null);

		// 认证客户端
		IAuthenticationUser client = null;
		try {
			client = this.getCloudAuthUtilRuntime().getUserByName(strClientId);
			if (client.getApiuser() != 1) {
				throw new Exception("类型不正确");
			}
			return this.getCloudUAAUtilRuntime().getAuthorizationCode(AuthenticationUser.getCurrentMust(), strScope);
		} catch (Throwable ex) {
			log.error(ex);
			throw new InvalidClientException("无效的客户端");
		}
	}

	// @RequestMapping(value = "/uaa/oauth/token", method = {
	// RequestMethod.POST, RequestMethod.GET })
	// public OAuth2AccessToken oauthToken(@RequestParam(required = false)
	// Map<String, String> body, @RequestBody(required = false) Map<String,
	// String> body2, HttpServletRequest httpServletRequest) {
	//
	//
	// return null;
	// }

	@RequestMapping(value = "/uaa/oauth/token", method = { RequestMethod.POST }, consumes = { "application/x-www-form-urlencoded;charset=UTF-8" })
	public OAuth2AccessToken oauthToken(@RequestParam(required = false) Map<String, String> body, HttpServletRequest httpServletRequest) {
		return doOAuthToken(body, httpServletRequest);
	}

	@RequestMapping(value = "/uaa/oauth/token", method = { RequestMethod.POST, RequestMethod.GET })
	public OAuth2AccessToken oauthToken2(@RequestBody(required = false) Map<String, String> body, HttpServletRequest httpServletRequest) {
		return doOAuthToken(body, httpServletRequest);
	}

	protected OAuth2AccessToken doOAuthToken(Map<String, String> body, HttpServletRequest httpServletRequest) {

		String strQueryString = httpServletRequest.getQueryString();
		Map<String, Object> parameters = RestUtils.queryString2Map(strQueryString);
		if (body != null) {
			parameters.putAll(body);
		}

		String strClientId = DataTypeUtils.getStringValue((String) parameters.get(OAuth2Utils.CLIENT_ID), null);
		if (!StringUtils.hasLength(strClientId)) {
			throw new InvalidRequestException("未传入客户端标识");
		}

		String strClientSecret = DataTypeUtils.getStringValue((String) parameters.get("client_secret"), null);
		if (!StringUtils.hasLength(strClientSecret)) {
			throw new InvalidRequestException("未传入客户端密钥");
		}

		// 认证客户端
		IAuthenticationUser client = null;
		try {
			client = this.getCloudAuthUtilRuntime().getUserByLogin(strClientId, strClientSecret);
			if (client.getApiuser() != 1) {
				throw new Exception("类型不正确");
			}

			// 校验客户端操作范围
		} catch (Throwable ex) {
			log.error(ex);
			throw new InvalidClientException("无效的客户端");
		}

		String strGrantType = DataTypeUtils.getStringValue((String) parameters.get(OAuth2Utils.GRANT_TYPE), null);
		if (!StringUtils.hasLength(strGrantType)) {
			throw new InvalidRequestException("未传入授权模式");
		}

		IAuthenticationUser user = null;

		switch (strGrantType) {
		case "authorization_code":
			String strCode = DataTypeUtils.getStringValue((String) parameters.get("code"), null);
			// String redirectUri = parameters.get(OAuth2Utils.REDIRECT_URI);
			if (!StringUtils.hasLength(strCode)) {
				throw new InvalidRequestException("未传入认证代码");
			}

			try {
				user = this.getCloudUAAUtilRuntime().getUserByAuthCode(strCode);
			} catch (Throwable ex) {
				log.error(ex);
				throw new UnauthorizedUserException("无效的认证代码");
			}

			break;
		case "password":

			String strLoginName = DataTypeUtils.getStringValue((String) parameters.get("username"), null);
			String strPassword = DataTypeUtils.getStringValue((String) parameters.get("password"), null);

			if (!StringUtils.hasLength(strLoginName) || !StringUtils.hasLength(strPassword)) {
				throw new InvalidRequestException("未传入用户名或密码");
			}

			try {
				user = this.getCloudAuthUtilRuntime().getUserByLogin(strLoginName, strPassword);
			} catch (Throwable ex) {
				log.error(ex);
				throw new UnauthorizedUserException("用户名或密码错误");
			}
			break;

		case "client_credentials":
			user = client;
			break;
		case "refresh_token":
			// break;
		case "implicit":
		default:
			throw new InvalidRequestException(String.format("未支持的授权模式[%1$s]", strGrantType));
		}

		if (user == null) {
			throw new UnauthorizedUserException(String.format("未认证的用户"));
		}

		// 输出
		long nExpirein = this.getCloudUAAUtilRuntime().getApiTokenExpiration();
		if (nExpirein <= 0) {
			nExpirein = this.getCloudUAAUtilRuntime().getTokenExpiration();
		}
		final AuthenticationInfo authenticationInfo = getCloudUAAUtilRuntime().generateToken2(user, nExpirein);
		final String token = authenticationInfo.getToken();
		DefaultOAuth2AccessToken defaultOAuth2AccessToken = new DefaultOAuth2AccessToken(token);
		defaultOAuth2AccessToken.setExpiration(new Date(System.currentTimeMillis() + nExpirein * 1000));
		return defaultOAuth2AccessToken;

	}

	@RequestMapping(value = "/uaa/oauth/userinfo", method = { RequestMethod.POST, RequestMethod.GET })
	public Object oauthUserInfo() {
		return this.getCloudUAAUtilRuntime().getOIDCResult();
	}

	@RequestMapping(value = "/uaa/oauth/userinfo/{type}", method = { RequestMethod.POST, RequestMethod.GET })
	public Object oauthUserInfo(@PathVariable("type") String type) {

		Map<String, Object> map = this.getCloudUAAUtilRuntime().getOIDCResult();

		return map.get(type.toLowerCase());
	}
	
	@GetMapping(value = { "/uaa/open/{opentype}/createqrcode" })
	public ResponseEntity<ObjectNode> createOpenQRCode(@PathVariable("opentype") String opentype, @RequestParam(value = "id", required = false) String id) {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String srfdcsystem = request.getHeader("srfdcsystem");
		if ("undefined".equals(srfdcsystem)) {
			srfdcsystem = null;
		}

		return ResponseEntity.ok(this.getCloudUAAUtilRuntime().createOpenQRCode(srfdcsystem, opentype, id));
	}
	
	
	@GetMapping(value = { "/uaa/open/{opentype}/qrcode/{code}" })
	public ResponseEntity<AuthenticationInfo> openQRCodeLogin(@PathVariable("opentype") String opentype, @PathVariable(value = "code") String code, @RequestParam(value = "id", required = false) String id) {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String srfdcsystem = request.getHeader("srfdcsystem");
		if ("undefined".equals(srfdcsystem)) {
			srfdcsystem = null;
		}

		try {
			IAuthenticationUser user = this.getCloudUAAUtilRuntime().getUserByOpenQRCode(srfdcsystem, opentype, code, id);
			if(user == null) {
				return ResponseEntity.ok().body(null);
			}
			final AuthenticationInfo authenticationInfo = getCloudUAAUtilRuntime().generateToken2(user);
			final String token = authenticationInfo.getToken();
			//final String token = getCloudUAAUtilRuntime().generateToken(user);
			if (user.getExpirein() <= 0) {
				if (user instanceof IAuthenticationUserRuntime) {
					((IAuthenticationUserRuntime) user).setExpirein(getCloudUAAUtilRuntime().getExpireInFromToken(token));
				}
			}

			AppData appData = null;

			return ResponseEntity.ok().body(new AuthenticationInfo(token, user.getExpirein(), appData, authenticationInfo.getRefresh_token()));
		} catch (Throwable ex) {
			log.error(ex);
			throw new RuntimeException("用户名或密码错误");
		}
	}
	

}
