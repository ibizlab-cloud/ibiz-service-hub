package net.ibizsys.central.cloud.core.sysutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudUAAClient;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUserRuntime;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.IUAAGrantedAuthority;
import net.ibizsys.central.cloud.core.servlet.IServiceHubFilter;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SysUAAUtilRuntimeBase extends SysUtilRuntimeBase implements ISysUAAUtilRuntime, IServiceHubFilter {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysUAAUtilRuntimeBase.class);

	public static final TypeReference<Collection<IUAAGrantedAuthority>> UAAGrantedAuthorityListType =  new TypeReference<Collection<IUAAGrantedAuthority>>(){};
	
	public final static String UAAFILTERTAG = "_IBIZ_UAAFILTERTAG_";
	
	// private WebAuthenticationDetailsSource webAuthenticationDetailsSource =
	// null;
	private String strTokenHeader = "Authorization";
	
	private String strTokenPrefix = "Bearer ";

	// @Value("${ibiz.jwt.expiration:7200000}")
	//private long nTokenExpiration = 7200000l;
	
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	
	private String strPublicKeyString = null;

	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		
		String strTokenHeader = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".tokenheader", "Authorization");
		if(StringUtils.hasLength(strTokenHeader)) {
			this.setTokenHeader(strTokenHeader);
		}
		
		String strTokenPrefix = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".tokenprefix", "Bearer ");
		if(StringUtils.hasLength(strTokenPrefix)) {
			this.setTokenPrefix(strTokenPrefix);
		}
		
		super.onPrepareDefaultSetting();
	}
	
	@Override
	protected void onInstall() throws Exception {

		super.onInstall();

		if (this.getSysCacheUtilRuntime(true) == null) {
			log.warn(String.format("系统UAA功能组件未指定系统缓存功能组件，无法提供与认证相关能力"));
			this.getSystemRuntime().log(LogLevels.WARN, this.getLogCat(), String.format("系统UAA功能组件未指定系统缓存功能组件，无法提供与认证相关能力"), null);
		}
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

	// protected WebAuthenticationDetailsSource
	// getWebAuthenticationDetailsSource() {
	// return this.webAuthenticationDetailsSource;
	// }
	//
	// protected void
	// setWebAuthenticationDetailsSource(WebAuthenticationDetailsSource
	// webAuthenticationDetailsSource) {
	// this.webAuthenticationDetailsSource = webAuthenticationDetailsSource;
	// }

	
	@Override
	public String getTokenHeader() {
		return strTokenHeader;
	}

	protected void setTokenHeader(String strTokenHeader) {
		this.strTokenHeader = strTokenHeader;
	}

	@Override
	public String getTokenPrefix() {
		return strTokenPrefix;
	}

	protected void setTokenPrefix(String strTokenPrefix) {
		this.strTokenPrefix = strTokenPrefix;
	}
	
//	protected long getTokenExpiration() {
//		return nTokenExpiration;
//	}
//
//	protected void setTokenExpiration(long nTokenExpiration) {
//		this.nTokenExpiration = nTokenExpiration;
//	}

	@Override
	public boolean validateToken(String token, IAuthenticationUser iAuthenticationUser) {
		try {
			boolean bRet = this.onValidateToken(token, iAuthenticationUser);
			if(bRet) {
				if(iAuthenticationUser.getApiuser() != EntityBase.BOOLEAN_TRUE) {
					String strUaaToken = this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), token), AUTHENTICATIONUSERCAT_UAATOKEN);
					if(!token.equals(strUaaToken)) {
						throw new Exception(String.format("鉴别凭证已注销"));
						//log.warn(String.format("鉴别凭证[%1$s]已注销", token));
						//return false;
					}
				}
			}
			return bRet;
		} catch (Throwable ex) {
			log.error(String.format("%1$s鉴别凭证发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("鉴别凭证发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected boolean onValidateToken(String token, IAuthenticationUser iAuthenticationUser) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public String getUsernameFromToken(String token) {
		try {
			return this.onGetUsernameFromToken(token);
		} catch (Throwable ex) {
			log.error(String.format("%1$s获取Token用户标识发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("获取Token用户标识发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected String onGetUsernameFromToken(String token) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public Date getExpirationDateFromToken(String token) {
		try {
			return this.onGetExpirationDateFromToken(token);
		} catch (Throwable ex) {
			log.error(String.format("%1$s获取Token过期时间发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("获取Token过期时间发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Date onGetExpirationDateFromToken(String token) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public int getExpireInFromToken(String token) {
		Date expiredData = this.getExpirationDateFromToken(token);
		return Long.valueOf((expiredData.getTime() - System.currentTimeMillis())/1000).intValue();
	}
	
	/**
	 * 获取PublicKey对象
	 * 
	 * @param publicKeyBase64
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeySpecException
	 */
	protected PublicKey getPublicKey(String publicKeyBase64) throws Throwable {
		byte[] byteKey = Base64.getDecoder().decode(publicKeyBase64);
		X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byteKey);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		return keyFactory.generatePublic(x509EncodedKeySpec);
	}

	protected String getPublicKeyString() throws Throwable {
		if(StringUtils.hasLength(this.strPublicKeyString)) {
			return this.strPublicKeyString;
		}
	
		String usrHome = System.getProperty("user.home") + "/.ibzrt";
		File pubKeyFile = new File(usrHome, "ibzrt_rsa.pub");
		if (!pubKeyFile.exists()) {
			this.strPublicKeyString = IOUtils.toString(this.getClass().getResourceAsStream("/uaa/keypair/ibzrt_rsa.pub"), Charset.defaultCharset());
		} else {
			this.strPublicKeyString = IOUtils.toString(new FileInputStream(pubKeyFile), Charset.defaultCharset());
		}
		return this.strPublicKeyString;
	}

	@Override
	public boolean doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {
		return this.doFilterInternal((HttpServletRequest) request, (HttpServletResponse) response);
	}

	protected boolean doFilterInternal(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserContext.setCurrent(null);
		
		/**
		 * 标记已经进行过滤操作
		 */
		request.setAttribute(UAAFILTERTAG, "TRUE");

		final String requestHeader = request.getHeader(this.getTokenHeader());
		if (requestHeader == null || !requestHeader.startsWith(getTokenPrefix())) {
			log.debug(String.format("请求[%1$s]未携带Token", request.getRequestURI()));
			response.setStatus(HttpStatus.UNAUTHORIZED.value());
			return false;
		}

		String username = null;
		String authToken = StringUtils.hasLength(getTokenPrefix())?requestHeader.substring(getTokenPrefix().length()):requestHeader;
		try {
			username = getUsernameFromToken(authToken);
			if (!StringUtils.hasLength(username)) {
				throw new Exception(String.format("Token未包含用户标识"));
			}
		} catch (Throwable e) {
			log.debug(e);
			response.setStatus(HttpStatus.UNAUTHORIZED.value());
			return false;
		}

		// 重新计算用户标识
		String srforgid = request.getHeader(ISysUAAUtilRuntime.HEADER_ORGID);
		String srfsystemid = request.getHeader(ISysUAAUtilRuntime.HEADER_SYSTEMID);
		if ("undefined".equals(srfsystemid)) {
			srfsystemid = null;
		}
		if ("undefined".equals(srforgid)) {
			srforgid = null;
		}
		
		String srfdcsystemid = request.getHeader(ISysUAAUtilRuntime.HEADER_DCSYSTEMID);
		String srfuserid = request.getHeader(ISysUAAUtilRuntime.HEADER_USERID);
		String srfdcid = request.getHeader(ISysUAAUtilRuntime.HEADER_DCID);

		
		IAuthenticationUser authenticationUser = null;//AuthenticationUser.getCurrent();
		final ISysCacheUtilRuntime iSysCacheUtilRuntime = this.getSysCacheUtilRuntime(false);
		try {
			authenticationUser = iSysCacheUtilRuntime.get(CloudCacheTagUtils.getAuthenticationUserTag(username), AuthenticationUser.class);
			if (authenticationUser == null) {
				log.debug(String.format("无法从缓存中获取当前用户认证信息"));
				response.setStatus(HttpStatus.UNAUTHORIZED.value());
				return false;
			}
		} catch (Throwable e) {
			throw new ServletException(e);
		}
		try {
			if (validateToken(authToken, authenticationUser)) {
				
				if(authenticationUser instanceof IAuthenticationUserRuntime) {
					((IAuthenticationUserRuntime)authenticationUser).setToken(authToken);
					((IAuthenticationUserRuntime)authenticationUser).setExpirein(this.getExpireInFromToken(authToken));
				}
				
				Employee dcEmployee = null;
				Collection<? extends GrantedAuthority> authorities = null;
				Map<String, Object> session = null;
				if (StringUtils.hasLength(srfsystemid) 
						&& StringUtils.hasLength(srfdcid) && StringUtils.hasLength(srfdcsystemid) && StringUtils.hasLength(srfuserid)) {
					
					//可以没有组织
					//&& StringUtils.hasLength(srforgid)
					
					if((DataTypeUtils.getIntegerValue(authenticationUser.getApiuser(), 0) == 1)
							|| (DataTypeUtils.getIntegerValue(authenticationUser.getSuperuser(), 0) == 1)){
						String srfusername = request.getHeader("srfusername");
						//接口用户用传入身份构造EMP
						dcEmployee = new Employee();
						dcEmployee.setSrfdcid(srfdcid);
						dcEmployee.setUserId(srfuserid);
						dcEmployee.setDCSystemId(srfdcsystemid);
						if(StringUtils.hasLength(srfusername)) {
							try {
								dcEmployee.setPersonName(URLDecoder.decode(srfusername, "UTF-8"));
							}
							catch(Exception ex) {
								log.error(ex);
								dcEmployee.setPersonName(srfusername);
							}
						}
						//API用户请求时赋予超级用户
						if(DataTypeUtils.getIntegerValue(authenticationUser.getApiuser(), 0) == 1){
							dcEmployee.setSuperUser(1);
						}
						dcEmployee.setOrgId(srforgid);
						
						String strValue = request.getHeader("srforgcode");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setOrgCode(strValue);
						}
						strValue = request.getHeader("srfdeptid");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setMDeptId(strValue);
						}
						strValue = request.getHeader("srfdeptcode");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setMDeptCode(strValue);
						}
						strValue = request.getHeader("srfporgids");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setPOrgIds(strValue);
						}
						strValue = request.getHeader("srfsorgids");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setSOrgIds(strValue);
						}
						strValue = request.getHeader("srfpdeptids");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setPDeptIds(strValue);
						}
						strValue = request.getHeader("srfsdeptids");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setSDeptIds(strValue);
						}
						
					}
					else {
						log.error(String.format("用户[%1$s][%2$s]使用API模式访问系统", authenticationUser.getUserid(), authenticationUser.getUsername()));
						response.setStatus(HttpStatus.FORBIDDEN.value());
						return false;
					}
				}
				else
				if (StringUtils.hasLength(srfsystemid) && StringUtils.hasLength(srforgid)) {
					dcEmployee = this.getEmployee(authenticationUser.getUsername(), authenticationUser.getToken(), srfsystemid, srforgid);
					if(dcEmployee != null && authenticationUser.getSuperuser() == 1) {
						dcEmployee.setSuperUser(1);
					}
					String strDCSystemId = null;
					if(dcEmployee != null) {
						strDCSystemId = dcEmployee.getDCSystemId();
					}
					if(StringUtils.hasLength(strDCSystemId)) {
						authorities = (Collection<? extends GrantedAuthority>)dcEmployee.get("_authorities");
						if(authorities == null) {
							authorities = this.getGrantedAuthorities(authenticationUser.getUsername(), authenticationUser.getToken(), strDCSystemId);
						}
						session = (Map<String, Object>)dcEmployee.get("_session");
						if(session == null) {
							session = this.getEmployeeSession(authenticationUser.getUsername(), authenticationUser.getToken(), strDCSystemId);
						}
					}
				}
				else
					if(StringUtils.hasLength(srfsystemid) && ICloudSaaSUtilRuntime.SYSTEMID_PORTAL.equalsIgnoreCase(srfsystemid)) {
						//门户系统，仿真机构用户身份
						dcEmployee = new Employee();
						dcEmployee.setUserId(authenticationUser.getUserid());
						dcEmployee.setUserName(authenticationUser.getUsername());
						dcEmployee.setPersonName(authenticationUser.getPersonname());
						dcEmployee.setUAAUserId(authenticationUser.getUserid());
					}
//					else
//						if(DataTypeUtils.getIntegerValue(authenticationUser.getApiuser(), 0) == 1) {
//							//接口用户用传入身份构造EMP
//						
//							
//						}
						else
							if((DataTypeUtils.getIntegerValue(authenticationUser.getSuperuser(), 0) == 1)
									||(DataTypeUtils.getIntegerValue(authenticationUser.getApiuser(), 0) == 1)) {
								//超级用户用自身身份构造EMP
								dcEmployee = new Employee();
								dcEmployee.setUserId(authenticationUser.getUserid());
								dcEmployee.setUserName(authenticationUser.getUsername());
								dcEmployee.setPersonName(authenticationUser.getPersonname());
								dcEmployee.setUAAUserId(authenticationUser.getUserid());
								dcEmployee.setSuperUser(1);
							}

				
				

				IEmployeeContext iEmployeeContext = null;
				if (dcEmployee != null) {
					iEmployeeContext = new EmployeeContext(dcEmployee, null, srfsystemid, authorities, session);
				}
				
				
				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(authenticationUser, iEmployeeContext, authenticationUser.getAuthorities());
				authentication.setDetails(iEmployeeContext);
				// authentication.setDetails(getWebAuthenticationDetailsSource().buildDetails(request));
				// String strInstTag = request.getParameter("srfinsttag");
				// String strInstTag2 = request.getParameter("srfinsttag2");
				// authenticationUser.setSrfdynainsttag(strInstTag);
				// authenticationUser.setSrfdynainsttag2(strInstTag2);

				SecurityContextHolder.getContext().setAuthentication(authentication);
				UserContext.setCurrent(iEmployeeContext);
				return true;
			}
		} catch (Throwable e) {
			log.debug(e);
		}
		response.setStatus(HttpStatus.UNAUTHORIZED.value());
		return false;
	}

	
	@Override
	public boolean redoFilter() throws IOException, ServletException {
		HttpServletRequest httpServletRequest = null;
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if(requestAttributes instanceof ServletRequestAttributes) {
			httpServletRequest = ((ServletRequestAttributes)requestAttributes).getRequest();
		}
		if(httpServletRequest == null) {
			//log.error(String.format("无法重做过滤操作，请求上下文无效"));
			return false;
		}
		
		/**
		 * 标记已经进行过滤操作
		 */
		Object uaaFilterTag = httpServletRequest.getAttribute(UAAFILTERTAG);
		if(!ObjectUtils.isEmpty(uaaFilterTag)) {
			log.debug(String.format("无法重做过滤操作，已经进行过滤操作"));
			return false;
		}
		
		log.debug(String.format("重做过滤操作"));
		return this.redoFilterInternal(httpServletRequest);
	}
	
	protected boolean redoFilterInternal(HttpServletRequest request) throws ServletException, IOException {

		UserContext.setCurrent(null);

		/**
		 * 标记已经进行过滤操作
		 */
		request.setAttribute(UAAFILTERTAG, "TRUE");
		
		final String requestHeader = request.getHeader(this.getTokenHeader());
		if (requestHeader == null || !requestHeader.startsWith(getTokenPrefix())) {
			log.debug(String.format("请求[%1$s]未携带Token", request.getRequestURI()));
			//response.setStatus(HttpStatus.UNAUTHORIZED.value());
			return false;
		}

		String username = null;
		String authToken = StringUtils.hasLength(getTokenPrefix())?requestHeader.substring(getTokenPrefix().length()):requestHeader;
		try {
			username = getUsernameFromToken(authToken);
			if (!StringUtils.hasLength(username)) {
				throw new Exception(String.format("Token未包含用户标识"));
			}
		} catch (Throwable e) {
			log.debug(e);
			//response.setStatus(HttpStatus.UNAUTHORIZED.value());
			return false;
		}

		// 重新计算用户标识
		String srforgid = request.getHeader(ISysUAAUtilRuntime.HEADER_ORGID);
		String srfsystemid = request.getHeader(ISysUAAUtilRuntime.HEADER_SYSTEMID);
		if ("undefined".equals(srfsystemid)) {
			srfsystemid = null;
		}
		if ("undefined".equals(srforgid)) {
			srforgid = null;
		}
		
		String srfdcsystemid = request.getHeader(ISysUAAUtilRuntime.HEADER_DCSYSTEMID);
		String srfuserid = request.getHeader(ISysUAAUtilRuntime.HEADER_USERID);
		String srfdcid = request.getHeader(ISysUAAUtilRuntime.HEADER_DCID);

		
		IAuthenticationUser authenticationUser = null;//AuthenticationUser.getCurrent();
		final ISysCacheUtilRuntime iSysCacheUtilRuntime = this.getSysCacheUtilRuntime(false);
		try {

			authenticationUser = iSysCacheUtilRuntime.get(CloudCacheTagUtils.getAuthenticationUserTag(username), AuthenticationUser.class);
			if (authenticationUser == null) {
				log.debug(String.format("无法从缓存中获取当前用户认证信息"));
				//response.setStatus(HttpStatus.UNAUTHORIZED.value());
				return false;
			}

		} catch (Throwable e) {
			//throw new ServletException(e);
			log.debug(e);
			return false;
		}
		try {
			if (validateToken(authToken, authenticationUser)) {
				
				if(authenticationUser instanceof IAuthenticationUserRuntime) {
					((IAuthenticationUserRuntime)authenticationUser).setToken(authToken);
					((IAuthenticationUserRuntime)authenticationUser).setExpirein(this.getExpireInFromToken(authToken));
				}
				
				Employee dcEmployee = null;
				Collection<? extends GrantedAuthority> authorities = null;
				Map<String, Object> session = null;
				if (StringUtils.hasLength(srfsystemid) 
						&& StringUtils.hasLength(srfdcid) && StringUtils.hasLength(srfdcsystemid) && StringUtils.hasLength(srfuserid)) {
					
					//可以没有组织
					//&& StringUtils.hasLength(srforgid)
					
					if((DataTypeUtils.getIntegerValue(authenticationUser.getApiuser(), 0) == 1)
							|| (DataTypeUtils.getIntegerValue(authenticationUser.getSuperuser(), 0) == 1)){
						String srfusername = request.getHeader("srfusername");
						//接口用户用传入身份构造EMP
						dcEmployee = new Employee();
						dcEmployee.setSrfdcid(srfdcid);
						dcEmployee.setUserId(srfuserid);
						dcEmployee.setDCSystemId(srfdcsystemid);
						if(StringUtils.hasLength(srfusername)) {
							try {
								dcEmployee.setPersonName(URLDecoder.decode(srfusername, "UTF-8"));
							}
							catch(Exception ex) {
								log.error(ex);
								dcEmployee.setPersonName(srfusername);
							}
						}
						//API用户请求时赋予超级用户
						if(DataTypeUtils.getIntegerValue(authenticationUser.getApiuser(), 0) == 1){
							dcEmployee.setSuperUser(1);
						}
						dcEmployee.setOrgId(srforgid);
						
						String strValue = request.getHeader("srforgcode");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setOrgCode(strValue);
						}
						strValue = request.getHeader("srfdeptid");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setMDeptId(strValue);
						}
						strValue = request.getHeader("srfdeptcode");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setMDeptCode(strValue);
						}
						strValue = request.getHeader("srfporgids");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setPOrgIds(strValue);
						}
						strValue = request.getHeader("srfsorgids");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setSOrgIds(strValue);
						}
						strValue = request.getHeader("srfpdeptids");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setPDeptIds(strValue);
						}
						strValue = request.getHeader("srfsdeptids");
						if(StringUtils.hasLength(strValue)) {
							dcEmployee.setSDeptIds(strValue);
						}
						
					}
					else {
						log.error(String.format("用户[%1$s][%2$s]使用API模式访问系统", authenticationUser.getUserid(), authenticationUser.getUsername()));
						//response.setStatus(HttpStatus.FORBIDDEN.value());
						return false;
					}
				}
				else
				if (StringUtils.hasLength(srfsystemid) && StringUtils.hasLength(srforgid)) {
					dcEmployee = this.getEmployee(authenticationUser.getUsername(), authenticationUser.getToken(), srfsystemid, srforgid);
					if(dcEmployee != null && authenticationUser.getSuperuser() == 1) {
						dcEmployee.setSuperUser(1);
					}
					String strDCSystemId = null;
					if(dcEmployee != null) {
						strDCSystemId = dcEmployee.getDCSystemId();
					}
					if(StringUtils.hasLength(strDCSystemId)) {
						authorities = (Collection<? extends GrantedAuthority>)dcEmployee.get("_authorities");
						if(authorities == null) {
							authorities = this.getGrantedAuthorities(authenticationUser.getUsername(), authenticationUser.getToken(), strDCSystemId);
						}
						session = (Map<String, Object>)dcEmployee.get("_session");
						if(session == null) {
							session = this.getEmployeeSession(authenticationUser.getUsername(), authenticationUser.getToken(), strDCSystemId);
						}
					}
				}
				else
					if(StringUtils.hasLength(srfsystemid) && ICloudSaaSUtilRuntime.SYSTEMID_PORTAL.equalsIgnoreCase(srfsystemid)) {
						//门户系统，仿真机构用户身份
						dcEmployee = new Employee();
						dcEmployee.setUserId(authenticationUser.getUserid());
						dcEmployee.setUserName(authenticationUser.getUsername());
						dcEmployee.setPersonName(authenticationUser.getPersonname());
						dcEmployee.setUAAUserId(authenticationUser.getUserid());
					}
//					else
//						if(DataTypeUtils.getIntegerValue(authenticationUser.getApiuser(), 0) == 1) {
//							//接口用户用传入身份构造EMP
//						
//							
//						}
						else
							if((DataTypeUtils.getIntegerValue(authenticationUser.getSuperuser(), 0) == 1)
									||(DataTypeUtils.getIntegerValue(authenticationUser.getApiuser(), 0) == 1)){
								//超级用户用自身身份构造EMP
								dcEmployee = new Employee();
								dcEmployee.setUserId(authenticationUser.getUserid());
								dcEmployee.setUserName(authenticationUser.getUsername());
								dcEmployee.setPersonName(authenticationUser.getPersonname());
								dcEmployee.setUAAUserId(authenticationUser.getUserid());
								dcEmployee.setSuperUser(1);
									
							}

				
				

				IEmployeeContext iEmployeeContext = null;
				if (dcEmployee != null) {
					iEmployeeContext = new EmployeeContext(dcEmployee, null, srfsystemid, authorities, session);
				}
				
				
				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(authenticationUser, iEmployeeContext, authenticationUser.getAuthorities());
				authentication.setDetails(iEmployeeContext);

				SecurityContextHolder.getContext().setAuthentication(authentication);
				UserContext.setCurrent(iEmployeeContext);
				return true;
			}
		} catch (Throwable e) {
			log.debug(e);
		}
		//response.setStatus(HttpStatus.UNAUTHORIZED.value());
		return false;
	}
	
	@Override
	public String getLogicName() {
		return String.format("系统UAA功能组件[%1$s]", this.getName());
	}

	// public static String getAuthenticationUserCacheTag(String strUserName) {
	// return String.format("uaa_user_%1$s", strUserName);
	// }

	
	@Override
	public AppData getAppData(String strSystemId, String strOrgId) {
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
		return this.executeAction("获取用户应用数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAppData(iAuthenticationUser, strSystemId, strOrgId);
			}
		} , null, AppData.class);
	}
	
	protected AppData onGetAppData(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId) throws Throwable{
		
		HttpServletRequest httpServletRequest = null;
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if(requestAttributes instanceof ServletRequestAttributes) {
			httpServletRequest = ((ServletRequestAttributes)requestAttributes).getRequest();
		}
		String clientIp = httpServletRequest.getHeader(HEADER_REALIP);
		ICloudUAAClient iCloudUAAClient = getSysCloudClientUtilRuntime().getRawServiceClient(ICloudUtilRuntime.CLOUDSERVICE_UAA).getProxyClient(ICloudUAAClient.class);
		return iCloudUAAClient.getAppData(strSystemId, strOrgId, StringUtils.hasLength(this.getTokenPrefix())?(this.getTokenPrefix() + iAuthenticationUser.getToken()):iAuthenticationUser.getToken(), clientIp);
	}
	
	@Override
	public AppData getAppData(String strDCSystemId) {
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
		return this.executeAction("获取用户应用数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAppData(iAuthenticationUser, strDCSystemId);
			}
		} , null, AppData.class);
	}
	
	protected AppData onGetAppData(IAuthenticationUser iAuthenticationUser, String strDCSystemId) throws Throwable{
		
		HttpServletRequest httpServletRequest = null;
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if(requestAttributes instanceof ServletRequestAttributes) {
			httpServletRequest = ((ServletRequestAttributes)requestAttributes).getRequest();
		}
		String clientIp = httpServletRequest.getHeader(HEADER_REALIP);
		ICloudUAAClient iCloudUAAClient = getSysCloudClientUtilRuntime().getRawServiceClient(ICloudUtilRuntime.CLOUDSERVICE_UAA).getProxyClient(ICloudUAAClient.class);
		return iCloudUAAClient.getAppData(strDCSystemId, StringUtils.hasLength(this.getTokenPrefix())?(this.getTokenPrefix() + iAuthenticationUser.getToken()):iAuthenticationUser.getToken(), clientIp);
	}

	
	
	@Override
	public IEmployeeContext getEmployeeContext(String strSystemId, String strOrgId, boolean bSetCurrent){
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
		return executeAction("获取机构用户上下文",
				new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						IEmployeeContext iEmployeeContext = onGetEmployeeContext(iAuthenticationUser, strSystemId, strOrgId);
						if(bSetCurrent) {
							UserContext.setCurrent(iEmployeeContext);
						}
						return iEmployeeContext;
					}
				}, null, IEmployeeContext.class);
	}
	
	protected IEmployeeContext onGetEmployeeContext(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId) throws Throwable{
		Employee employee = this.getEmployee(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken(), strSystemId, strOrgId);
		if(employee == null) {
			throw new Exception(String.format("机构用户身份无效"));
		}
		if(iAuthenticationUser.getSuperuser() == 1) {
			employee.setSuperUser(1);
		}
		Collection<? extends GrantedAuthority> authorities = (Collection<? extends GrantedAuthority>)employee.get("_authorities");
		if(authorities == null) {
			authorities = getGrantedAuthorities(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken(), employee.getDCSystemId());
		}
		Map<String, Object> session = (Map<String, Object>)employee.get("_session");
		if(session == null) {
			session =  this.getEmployeeSession(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken(), employee.getDCSystemId());
		}
		return new EmployeeContext(employee, null, strSystemId, authorities, session);
	}
	
	@Override
	public IEmployeeContext getEmployeeContext(IAuthenticationUser iAuthenticationUser, Employee employee, String strSystemId){
		return this.getEmployeeContext(iAuthenticationUser, employee, strSystemId, false);
	}
	
	
	
	@Override
	public IEmployeeContext getEmployeeContext(IAuthenticationUser iAuthenticationUser, Employee employee, String strSystemId, boolean bSetCurrent) {
		return executeAction("获取机构用户上下文",
				new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						IEmployeeContext iEmployeeContext = onGetEmployeeContext(iAuthenticationUser,employee, strSystemId);
						if(bSetCurrent) {
							UserContext.setCurrent(iEmployeeContext);
						}
						return iEmployeeContext;
					}
				}, null, IEmployeeContext.class);
	}

	protected IEmployeeContext onGetEmployeeContext(IAuthenticationUser iAuthenticationUser, Employee employee, String strSystemId) throws Throwable{
		
		Collection<? extends GrantedAuthority> authorities = (Collection<? extends GrantedAuthority>)employee.get("_authorities");
		if(authorities == null) {
			authorities = getGrantedAuthorities(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken(), employee.getDCSystemId());
		}
		Map<String, Object> session = (Map<String, Object>)employee.get("_session");
		if(session == null) {
			session =  this.getEmployeeSession(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken(), employee.getDCSystemId());
		}
		return new EmployeeContext(employee, null, strSystemId, authorities, session);
	}
	
	
	
	@Override
	public IAuthenticationUser getAuthenticationUser(String strToken) {
		return getAuthenticationUser(strToken, true);
	}
	
	@Override
	public IAuthenticationUser getAuthenticationUser(String strToken, boolean bValidate) {
		return executeAction("获取认证用户",
				new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						IAuthenticationUser iAuthenticationUser =  onGetAuthenticationUser(strToken, bValidate);
						
						return iAuthenticationUser;
					}
				}, null, IAuthenticationUser.class);
	}
	
	protected IAuthenticationUser onGetAuthenticationUser(String strToken, boolean bValidate) throws Throwable{
		String strUserName = getUsernameFromToken(strToken);
		if (!StringUtils.hasLength(strUserName)) {
			throw new Exception(String.format("Token未包含用户标识"));
		}
		
		IAuthenticationUser iAuthenticationUser = getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserTag(strUserName), AuthenticationUser.class);
		if(iAuthenticationUser == null) {
			throw new Exception(String.format("无法获取Token相关的用户身份信息"));
		}
		
		if(bValidate) {
			if(!validateToken(strToken, iAuthenticationUser)) {
				throw new Exception("鉴别用户凭证失败");
			}
		}
		
		if(iAuthenticationUser instanceof IAuthenticationUserRuntime) {
			((IAuthenticationUserRuntime)iAuthenticationUser).setToken(strToken);
			((IAuthenticationUserRuntime)iAuthenticationUser).setExpirein(this.getExpireInFromToken(strToken));
		}
		
		return iAuthenticationUser;
	}
	
	
	protected Collection<IUAAGrantedAuthority> getGrantedAuthorities(String strUAAUserName, String strToken, String strDCSystemId){
		return this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserCat(strUAAUserName, strToken), CloudCacheTagUtils.getUserAuthoritiesTag(strDCSystemId), UAAGrantedAuthorityListType);
	}
	
	
	protected Map<String, Object> getEmployeeSession(String strUAAUserName, String strToken, String strDCSystemId){
		return this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserCat(strUAAUserName, strToken), CloudCacheTagUtils.getUserSessionTag(strDCSystemId), Map.class);
	}
	
	@Override
	public void updateCurrentEmployeeSession(Map<String, Object> sessions) {
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		executeAction("设置机构用户会话变量",
				new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						onEmployeeSession(iAuthenticationUser, iEmployeeContext, sessions);
						return null;
					}
				}, null);
	}
	
	protected void onEmployeeSession(IAuthenticationUser iAuthenticationUser, IEmployeeContext iEmployeeContext, Map<String, Object> sessions) throws Throwable {
		 this.getSysCacheUtilRuntime().set(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()), CloudCacheTagUtils.getUserSessionTag(iEmployeeContext.getDcsystemid()), sessions);
		 if(iEmployeeContext.getSessionParams()!=null) {
			 iEmployeeContext.getSessionParams().putAll(sessions);
		 }
	}
	
	
	protected Employee getEmployee(String strUAAUserName, String strToken, String strSystemId, String strOrgId) {
		String strCacheCat = CloudCacheTagUtils.getAuthenticationUserCat(strUAAUserName, strToken);
		Map<String, String> map = this.getSysCacheUtilRuntime().getAll(strCacheCat);
		if(ObjectUtils.isEmpty(map)) {
			return null;
		}
		String strEmployeeTag = CloudCacheTagUtils.getUserEmployeeTag(strSystemId, strOrgId);
		String strEmployee = map.get(strEmployeeTag); 
		if(ObjectUtils.isEmpty(strEmployee)) {
			return null;
		}
		Employee employee = this.getSystemRuntime().deserialize(strEmployee, Employee.class);
		String strDCSystemId = null;
		if(employee != null) {
			strDCSystemId = employee.getDCSystemId();
		}
		if(StringUtils.hasLength(strDCSystemId)) {
			String strUAAGrantedAuthorityList = map.get(CloudCacheTagUtils.getUserAuthoritiesTag(strDCSystemId));
			if(!ObjectUtils.isEmpty(strUAAGrantedAuthorityList)) {
				Collection<IUAAGrantedAuthority> authorities = this.getSystemRuntime().deserialize(strUAAGrantedAuthorityList, UAAGrantedAuthorityListType);
				employee.set("_authorities", authorities);
			}
			else {
				employee.set("_authorities", new ArrayList<IUAAGrantedAuthority>());
			}
			
			String strSession = map.get(CloudCacheTagUtils.getUserSessionTag(strDCSystemId));
			if(!ObjectUtils.isEmpty(strSession)) {
				Map<String, Object> session = this.getSystemRuntime().deserialize(strSession, Map.class);
				employee.set("_session", session);
			}
			else {
				employee.set("_session", new LinkedHashMap<String, Object>());
			}
		}
		
		return  employee;
	}
	
	
	@Override
	public Employee getEmployee(String strSystemId, String strOrgId, boolean bTryMode) {
		
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
		
		Employee employee = this.getEmployee(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken(), strSystemId, strOrgId);
		if(employee != null || bTryMode) {
			return employee;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("无法从缓存中获取指定机构人员"));
	}
}
