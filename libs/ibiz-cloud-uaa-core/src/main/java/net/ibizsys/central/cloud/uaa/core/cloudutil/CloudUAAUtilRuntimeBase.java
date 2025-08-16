package net.ibizsys.central.cloud.uaa.core.cloudutil;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOpenClient;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudPortalClient;
import net.ibizsys.central.cloud.core.security.AuthenticationInfo;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUserRuntime;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.IUAAGrantedAuthority;
import net.ibizsys.central.cloud.core.security.UAAMenuAuthority;
import net.ibizsys.central.cloud.core.security.UAAUniResAuthority;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCode;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCodeRequest;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.core.util.domain.OrgSystem;
import net.ibizsys.central.cloud.core.util.domain.User;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.util.CacheableActionBuilder;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class CloudUAAUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudUAAUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudUAAUtilRuntimeBase.class);

	// private WebAuthenticationDetailsSource webAuthenticationDetailsSource =
	// null;
	//private String strTokenHeader = "Authorization";

	// @Value("${ibiz.jwt.expiration:7200000}")
	private long nTokenExpiration = 7200000l;
	
	
	private long nApiTokenExpiration = 86400000l;
	

	
	//记住身份过期时长（30天）
	private long nRememberMe = 30 * 24 * 60 * 60000l;
	
	
	private ICloudOpenClient iCloudOpenClient = null;

	private String strPrivateKeyString = null;
	
	private String strPublicKeyString = null;
	
	private ICloudPortalClient iCloudPortalClient = null;
	
	@Override
	protected ICloudUAAUtilRuntimeContext createModelRuntimeContext() {
		return new CloudUAAUtilRuntimeContextBase<ICloudUAAUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}
	
	@Override
	protected void onInstall() throws Exception {

		super.onInstall();

		if (this.getSysCacheUtilRuntime(true) == null) {
			log.warn(String.format("系统UAA功能组件未指定系统缓存功能组件，无法提供与认证相关能力"));
			this.getSystemRuntime().log(LogLevels.WARN, this.getLogCat(), String.format("系统UAA功能组件未指定系统缓存功能组件，无法提供与认证相关能力"), null);
		}
	}

	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}
	
	@Override
	protected boolean isEnableReloadSetting() {
		return true;
	}

	protected ICloudOpenClient getCloudOpenClient() {
		if (this.iCloudOpenClient == null) {
			this.iCloudOpenClient = this.getSysCloudClientUtilRuntime().getServiceClient(CLOUDSERVICE_OPEN, ICloudOpenClient.class);
		}
		return this.iCloudOpenClient;
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
	protected void onReloadSetting(boolean bFirst) throws Throwable {

		long nTokenExpiration = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".expiration", 7200000l);
		if(nTokenExpiration > 0) {
			this.setTokenExpiration(nTokenExpiration);
		}
		
		long nApiTokenExpiration = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".apiexpiration", 0l);
		if(nApiTokenExpiration > 0) {
			this.setApiTokenExpiration(nApiTokenExpiration);
		}
		
		
		long nRememberMe = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".rememberme", this.nRememberMe);
//		if(nRememberMeExpiration > 0) {
//			
//		}
		this.setRememberMe(nRememberMe);
		
		
		super.onReloadSetting(bFirst);
	}

//	protected String getTokenHeader() {
//		return strTokenHeader;
//	}
//
//	protected void setTokenHeader(String strTokenHeader) {
//		this.strTokenHeader = strTokenHeader;
//	}

	@Override
	public long getTokenExpiration() {
		return nTokenExpiration;
	}

	protected void setTokenExpiration(long nTokenExpiration) {
		this.nTokenExpiration = nTokenExpiration;
	}
	
	@Override
	public long getApiTokenExpiration() {
		if(this.nApiTokenExpiration>0) {
			return this.nApiTokenExpiration;
		}
		return getTokenExpiration();
	}
	
	protected void setApiTokenExpiration(long nApiTokenExpiration) {
		this.nApiTokenExpiration = nApiTokenExpiration;
	}
	
	@Override
	public long getRememberMe() {
		return this.nRememberMe;
	}

	protected void setRememberMe(long nRememberMe) {
		this.nRememberMe = nRememberMe;
	}
	
	
	
	@Override
	public String refreshToken(String strToken) {
		return refreshToken(strToken, this.getTokenExpiration());
	}
	
	@Override
	public String refreshToken(String strToken, long nTokenExpiration) {
		return this.executeAction("Token续期", new IAction() {

			@Override
			public Object execute(Object[] args) throws Throwable {
				return onRefreshToken(strToken, nTokenExpiration);
			}

		}, null, String.class);
	}

	protected String onRefreshToken(String strToken, long nTokenExpiration) throws Throwable {
		IAuthenticationUser authenticationUser = AuthenticationUser.getCurrentMust();
		strToken = authenticationUser.getToken();
		if(authenticationUser instanceof IAuthenticationUserRuntime) {
			((IAuthenticationUserRuntime)authenticationUser).setToken(null);
			((IAuthenticationUserRuntime)authenticationUser).setExpirein(-1);
		}
		String strNewToken = this.generateToken(authenticationUser, nTokenExpiration);
		int nExpireIn = this.getExpireInFromToken(strNewToken);
		if(authenticationUser instanceof IAuthenticationUserRuntime) {
			((IAuthenticationUserRuntime)authenticationUser).setToken(strNewToken);
			((IAuthenticationUserRuntime)authenticationUser).setExpirein(nExpireIn);
		}
		final ISysCacheUtilRuntime iSysCacheUtilRuntime = this.getSysCacheUtilRuntime(true);
		if (iSysCacheUtilRuntime != null) {
			
			iSysCacheUtilRuntime.copyAll(CloudCacheTagUtils.getAuthenticationUserCat(authenticationUser.getUsername(), strToken), CloudCacheTagUtils.getAuthenticationUserCat(authenticationUser.getUsername(), strNewToken));
			iSysCacheUtilRuntime.set(CloudCacheTagUtils.getAuthenticationUserCat(authenticationUser.getUsername(), strNewToken), ISysUAAUtilRuntime.AUTHENTICATIONUSERCAT_UAATOKEN, strNewToken, nExpireIn);
		}
		
		return strNewToken;
	}
	
	
	@Override
	public AuthenticationInfo refreshToken2(String strToken) {
		return refreshToken2(strToken, this.getTokenExpiration());
	}
	
	@Override
	public AuthenticationInfo refreshToken2(String strToken, long nTokenExpiration) {
		return this.executeAction("Token续期", new IAction() {

			@Override
			public Object execute(Object[] args) throws Throwable {
				return onRefreshToken2(strToken, nTokenExpiration);
			}

		}, null, AuthenticationInfo.class);
	}

	protected AuthenticationInfo onRefreshToken2(String strToken, long nTokenExpiration) throws Throwable {
		throw new Exception("没有实现");
	}
	
	

	@Override
	public AppData getAppData(String strSystemId, String strOrgId) {
		return this.getAppData(null, strSystemId, strOrgId);
	}

	@Override
	public AppData getAppData(IAuthenticationUser iAuthenticationUser2, String strSystemId, String strOrgId) {
		
		IAuthenticationUser iAuthenticationUser = (iAuthenticationUser2 != null) ? iAuthenticationUser2 : AuthenticationUser.getCurrentMust();
		//if(iAuthenticationUser.getSuperuser() != EntityBase.BOOLEAN_TRUE && iAuthenticationUser.getApiuser() == EntityBase.BOOLEAN_TRUE) {
		if(iAuthenticationUser.getApiuser() == EntityBase.BOOLEAN_TRUE) {
			log.error(String.format("API用户[%1$s]禁止访问业务系统", iAuthenticationUser.getUsername()));
			return null;
		}
		
		
		AppData appData = executeAction("准备应用环境", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()))
						.tags(CloudCacheTagUtils.getUserAppDataTag(strSystemId, strOrgId))
						.expire(iAuthenticationUser.getExpirein())
						.action(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return getAppDataReal(iAuthenticationUser, strSystemId, strOrgId);
					}

				}).build().get(AppData.class);
			}
		}, null, AppData.class);
		
		// 计算缓存标记，放在缓存外部支持刷新生效
		if (appData != null && StringUtils.hasLength(strSystemId) && !ICloudSaaSUtilRuntime.SYSTEMID_PORTAL.equalsIgnoreCase(strSystemId)) {
			try {
				MetaDynaModel metaDynaModel = this.getCloudSaaSUtilRuntime().getMetaDynaModel(strSystemId, strOrgId);
				if (StringUtils.hasLength(metaDynaModel.getModelFile())) {
					appData.set("dynamodeltag", KeyValueUtils.genUniqueId(metaDynaModel.getModelFile()));
				}
			} catch (Throwable ex) {
				log.error(String.format("计算系统[%1$s]动态模型发生异常，%2$s", strSystemId, ex.getMessage()), ex);
			}
		}	
		
		
		if(iAuthenticationUser.getExpirein() > 0) {
			appData.set("expirein", iAuthenticationUser.getExpirein());
		}
		
		return appData;
	}

	protected AppData getAppDataReal(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId) throws Throwable {
		try {
			AppData appData = onGetAppData(iAuthenticationUser, strSystemId, strOrgId);
			String strUserId = null;
			String strUserName = null;
			String strDCSystemId = null;
			String strDCSystemName = "未知";
			if (appData != null && appData.getContext() != null) {
				strUserId = (String) appData.getContext().get("srfuserid");
				strUserName = (String) appData.getContext().get("srfusername");
				strDCSystemId = (String) appData.getContext().get("srfdcsystemid");
			}
			if (!StringUtils.hasLength(strUserName)) {
				strUserName = iAuthenticationUser.getUsername();
			}
			if (StringUtils.hasLength(strDCSystemId)) {
				try {
					strDCSystemName = this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId).getDCSystemName();
				} catch (Throwable ex) {
					log.error(ex);
				}
			}
			
			if(iAuthenticationUser.getExpirein() > 0) {
				String strMqttTopic = (String) appData.get("mqtttopic");
				if(StringUtils.hasLength(strMqttTopic) && StringUtils.hasLength(strDCSystemId)) {
					try {
						Date date = new Date(System.currentTimeMillis() + iAuthenticationUser.getExpirein() * 1000);
						//向Portal登记
						Employee emp = new Employee();
						emp.setUserId(strUserId);
						emp.setUAAUserId(iAuthenticationUser.getUserid());
						emp.setDCSystemId(strDCSystemId);
						emp.setMqttTopic(strMqttTopic);
						emp.setMqttExpiration(date.getTime());
						
						this.getCloudPortalClient().registerEmployee(emp);
					}
					catch (Throwable ex) {
						log.error(String.format("向CloudPortal登记人员MQTT链路发生异常，%1$s", ex.getMessage()), ex);
					}
				}
			}

			this.getSystemRuntime().logAudit(LogLevels.INFO, LogCats.AUDIT_LOGINSYS, String.format("用户[%1$s]登录系统[%2$s]", strUserName, strDCSystemName), strUserId, "", "");
			return appData;
		} catch (Throwable ex) {
			this.getSystemRuntime().logAudit(LogLevels.DEBUG, LogCats.AUDIT_LOGINSYS, String.format("用户[%1$s]登录系统失败，%2$s", iAuthenticationUser.getUsername(), ex.getMessage()), iAuthenticationUser.getUserid(), "", "");
			throw ex;
		}
	}

	protected AppData onGetAppData(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId) throws Throwable {

		AppData appData = new AppData();
		Entity context = new Entity();

		if (StringUtils.hasLength(strSystemId) && !ICloudSaaSUtilRuntime.SYSTEMID_PORTAL.equalsIgnoreCase(strSystemId)) {

			Employee employee = this.getCloudSaaSUtilRuntime().getEmployee(iAuthenticationUser, strSystemId, strOrgId);

			EmployeeContext employeeContext = new EmployeeContext(employee, null, strSystemId);
			UserContext.setCurrent(employeeContext);

			context.set("srfdcid", employee.getSrfdcid());
			context.set("srfsystemid", strSystemId);
			context.set("srfdcsystemid", employee.getDCSystemId());
			if (StringUtils.hasLength(employee.getOrgId())) {
				context.set("srforgid", employee.getOrgId());
				context.set("srforgname", employee.getOrgName());
				context.set("srforgcode", employee.getOrgCode());
			}

			context.set("srfuserid", employee.getUserId());
			context.set("srfusername", employee.getPersonName());
			context.set("srfpersonid", employee.getUserId());
			context.set("srfpersonname", employee.getPersonName());
			context.set("srfusercode", employee.getUserCode());
			context.set("srforgsectorid", employee.getMDeptId());
			context.set("srforgsectorname", employee.getMDeptName());
			context.set("srforgsectorcode", employee.getMDeptCode());

			Set<String> appMenu = new HashSet<>();
			Set<String> uniRes = new HashSet<>();

			Collection<IUAAGrantedAuthority> list = this.getGrantedAuthorities(iAuthenticationUser, employeeContext);
			if (!ObjectUtils.isEmpty(list)) {
				for (IUAAGrantedAuthority grantedAuthority : list) {
					if (grantedAuthority instanceof UAAUniResAuthority) {
						uniRes.add(grantedAuthority.getAuthority());
						continue;
					}
					if (grantedAuthority instanceof UAAMenuAuthority) {
						appMenu.add(grantedAuthority.getAuthority());
						continue;
					}
				}
			}

			appData.set("unires", uniRes);
			appData.set("appmenu", appMenu);

			// 放入过期时间
			if (StringUtils.hasLength(iAuthenticationUser.getToken())) {
				Date date = this.getExpirationDateFromToken(iAuthenticationUser.getToken());
				// yyyy-MM-dd HH:mm:ss
				appData.set("expireddate", DateUtils.toDateTimeString(date));
			}
			
			if(StringUtils.hasLength(employee.getMqttTopic())) {
				appData.set("mqtttopic", employee.getMqttTopic());
			}
			
			// List<UAAUniResAuthority> uniResAuthorities =
			// (List<UAAUniResAuthority>)
			// contactExService.getClass().getMethod("getUAAUniResAuthority").invoke(contactExService);
			// for (UAAUniResAuthority uaaUniResAuthority:uniResAuthorities ) {
			// uniRes.add(uaaUniResAuthority.getAuthority());
			// }
			// if(curUser.getAuthorities() != null){
			// String curSystemId = curUser.getSrfsystemid();
			// if(StringUtils.isEmpty(curSystemId))
			// {
			// curUser.getAuthorities().stream().filter(authority -> authority
			// instanceof UAAMenuAuthority ).
			// forEach(grantedAuthority
			// ->appMenu.add(grantedAuthority.getAuthority()) );
			// }else{
			// curUser.getAuthorities().stream().filter(authority -> authority
			// instanceof UAAMenuAuthority &&
			// curSystemId.equals(((UAAMenuAuthority)authority).getSystemid())
			// ).
			// forEach(grantedAuthority
			// ->appMenu.add(grantedAuthority.getAuthority()) );
			// }
			// }

			// appData.put("unires", uniRes);
			// appData.put("appmenu", appMenu);
			// appData.put("enablepermissionvalid", enablePermissionValid);
			// if (curUser.getSuperuser() == 1) {
			// appData.put("enablepermissionvalid", false);
			// } else {
			// appData.put("enablepermissionvalid", enablePermissionValid);
			// }

			// Collection<GrantedAuthority> Authorities =
			// this.getAuthorities(dcEmployee.getDCSystemId(),
			// iAuthenticationUser);
			// Collection<GrantedAuthority> Authorities2 =
			// this.getAuthoritiesByUserId(iAuthenticationUser.getUserid());
		} else {
			context.set("srfuserid", iAuthenticationUser.getUserid());
			context.set("srfusername", iAuthenticationUser.getUsername());
			context.set("srfpersonid", iAuthenticationUser.getUserid());
			context.set("srfpersonname", iAuthenticationUser.getUsername());
			// context.set("srfusercode",
			// iAuthenticationUser.getu.getUsercode());
		}

		appData.setContext(context);
		return appData;

		// return this.getCloudSaaSUtilRuntime().getAppData(strSystemId,
		// strOrgId, iAuthenticationUser);
	}

	@Override
	public Collection<OrgSystem> getOrgSystems(String strDCSystemId) {
		return executeAction("获取用户系统组织身份", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetOrgSystems(AuthenticationUser.getCurrentMust(), strDCSystemId);
			}
		}, null, new TypeReference<Collection<OrgSystem>>() {
		});
	}

	protected Collection<OrgSystem> onGetOrgSystems(IAuthenticationUser iAuthenticationUser, String strDCSystemId) throws Throwable {
		return this.getCloudSaaSUtilRuntime().getOrgSystems(iAuthenticationUser, strDCSystemId);
	}

	protected Collection<IUAAGrantedAuthority> getGrantedAuthorities(IAuthenticationUser iAuthenticationUser, IEmployeeContext iEmployeeContext) {
		return getCloudSaaSUtilRuntime().getGrantedAuthorities(iAuthenticationUser, iEmployeeContext);
	}


	@Override
	public void resetUser(IAuthenticationUser iAuthenticationUser) {
		this.executeAction("重置用户状态", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onResetUser(iAuthenticationUser);
				return null;
			}
		}, null);
	}

	/**
	 * 重置用户状态（重置方法不抛出异常）
	 * 
	 * @param strName
	 */
	protected void onResetUser(IAuthenticationUser iAuthenticationUser) {
		getCloudSaaSUtilRuntime().resetUser(iAuthenticationUser);
	}

	
	
	@Override
	public String generateToken(IAuthenticationUser iAuthenticationUser) {
		return this.generateToken(iAuthenticationUser, this.getTokenExpiration());
	}
	
	@Override
	public String generateToken(IAuthenticationUser iAuthenticationUser, long nTokenExpiration) {
		try {
			String strToken = this.onGenerateToken(iAuthenticationUser, nTokenExpiration);
			// 进行缓存
			final ISysCacheUtilRuntime iSysCacheUtilRuntime = this.getSysCacheUtilRuntime(true);
			if (iSysCacheUtilRuntime != null) {
				int nExpireIn = this.getExpireInFromToken(strToken);
				//写入用户信息
				if(getRememberMe()>0) {
					iSysCacheUtilRuntime.set(CloudCacheTagUtils.getAuthenticationUserTag(iAuthenticationUser.getUsername()), iAuthenticationUser,(int)(getRememberMe()/1000));;
				}
				else {
					iSysCacheUtilRuntime.set(CloudCacheTagUtils.getAuthenticationUserTag(iAuthenticationUser.getUsername()), iAuthenticationUser, nExpireIn);
				}
				iSysCacheUtilRuntime.set(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), strToken), ISysUAAUtilRuntime.AUTHENTICATIONUSERCAT_UAATOKEN, strToken, nExpireIn);
			}

			return strToken;
		} catch (Throwable ex) {
			log.error(String.format("Cloud体系UAA功能组件[%1$s]生成凭证发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("Cloud体系UAA功能组件[%1$s]生成凭证发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if (ex instanceof ISystemRuntimeException) {
				throw (RuntimeException) ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("生成凭证发生异常，%1$s", ex.getMessage()), ex);
		}
	}


//	protected String onGenerateToken(IAuthenticationUser iAuthenticationUser) throws Throwable {
//		throw new Exception("没有实现");
//	}
	
	protected String onGenerateToken(IAuthenticationUser iAuthenticationUser, long nTokenExpiration) throws Throwable {
		throw new Exception("没有实现");
	}
	
	

	@Override
	public AuthenticationInfo generateToken2(IAuthenticationUser iAuthenticationUser) {
		return this.generateToken2(iAuthenticationUser, this.getTokenExpiration());
	}
	
	@Override
	public AuthenticationInfo generateToken2(IAuthenticationUser iAuthenticationUser, long nTokenExpiration) {
		try {
			AuthenticationInfo authenticationInfo = this.onGenerateToken2(iAuthenticationUser, nTokenExpiration);
			String strToken = authenticationInfo.getToken();
			// 进行缓存
			final ISysCacheUtilRuntime iSysCacheUtilRuntime = this.getSysCacheUtilRuntime(true);
			if (iSysCacheUtilRuntime != null) {
				int nExpireIn = this.getExpireInFromToken(strToken);
				//写入用户信息
				if(getRememberMe()>0) {
					iSysCacheUtilRuntime.set(CloudCacheTagUtils.getAuthenticationUserTag(iAuthenticationUser.getUsername()), iAuthenticationUser,(int)(getRememberMe()/1000));;
				}
				else {
					iSysCacheUtilRuntime.set(CloudCacheTagUtils.getAuthenticationUserTag(iAuthenticationUser.getUsername()), iAuthenticationUser, nExpireIn);
				}
				iSysCacheUtilRuntime.set(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), strToken), ISysUAAUtilRuntime.AUTHENTICATIONUSERCAT_UAATOKEN, strToken, nExpireIn);
			}

			return authenticationInfo;
		} catch (Throwable ex) {
			log.error(String.format("Cloud体系UAA功能组件[%1$s]生成凭证发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("Cloud体系UAA功能组件[%1$s]生成凭证发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if (ex instanceof ISystemRuntimeException) {
				throw (RuntimeException) ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("生成凭证发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected AuthenticationInfo onGenerateToken2(IAuthenticationUser iAuthenticationUser, long nTokenExpiration) throws Throwable {
		AuthenticationInfo authenticationInfo = new AuthenticationInfo();
		authenticationInfo.setToken(this.onGenerateToken(iAuthenticationUser, nTokenExpiration));
		return authenticationInfo;
	}
	
	
	@Override
	public boolean validateToken(String token) {
		return this.validateToken(token, null);
	}

	@Override
	public boolean validateToken(String token, IAuthenticationUser iAuthenticationUser) {
		try {
			return this.onValidateToken(token, iAuthenticationUser);
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
	
	@Override
	public ObjectNode getOpenAccessInfo(String strDCSystemId, String strOpenType, String strOpenAccessId) {
		return this.executeAction("获取开放平台应用信息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetOpenAccessInfo(strDCSystemId, strOpenType, strOpenAccessId);
			}
		}, null, ObjectNode.class);
	}

	protected ObjectNode onGetOpenAccessInfo(String strDCSystemId, String strOpenType, String strOpenAccessId) throws Throwable {
		if (!StringUtils.hasLength(strDCSystemId)) {
			throw new Exception("未指定机构系统");
		}

		DCSystem dcSystem = this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);

		//模仿机构身份
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		try {
			Employee employee = new Employee();
			employee.setUserId("SYSTEM");
			employee.setUserName("内置用户");
			employee.setPersonName("内置用户");
			employee.setSrfdcid(dcSystem.getSrfdcid());

			EmployeeContext employeeContext = new EmployeeContext(employee, null, null);
			UserContext.setCurrent(employeeContext);
			
			strOpenAccessId = dcSystem.getAccessId();
			if(StringUtils.hasLength(strOpenAccessId)) {
				OpenAccess openAccess = this.getCloudSaaSUtilRuntime().getOpenAccess(strOpenAccessId);
				//判断开放平台类型是否一致
				if(!openAccess.getOpenType().equals(strOpenType)) {
					strOpenAccessId = "";
				}
			}
			
			if (!StringUtils.hasLength(strOpenAccessId)) {
				strOpenAccessId = KeyValueUtils.genUniqueId(dcSystem.getSrfdcid(), strOpenType.toUpperCase());
			}
			

			OpenAccess openAccess = this.getCloudSaaSUtilRuntime().getOpenAccess(strOpenAccessId);

			ObjectNode objectNode = JsonUtils.createObjectNode();
			objectNode.put("id", openAccess.getId());
			objectNode.put("appid", openAccess.getAccessKey());
			// objectNode.put("access_token",openAccess.getAccessToken());
			objectNode.put("corp_id", openAccess.getRegionId());
			objectNode.put("agentid", openAccess.getAgentId());
			objectNode.put("redirect_uri", openAccess.getRedirectUri());

			return objectNode;
		} catch (Throwable ex) {
			throw ex;
		} finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}

	@Override
	public AuthenticationUser getUserByOpenSNSCode(String strDCSystemId, String strOpenType, String strOpenCode, String strOpenAccessId) {
		return this.executeAction("通过开放平台临时授权码获取用户信息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetUserByOpenSNSCode(strDCSystemId, strOpenType, strOpenCode, strOpenAccessId);
			}
		}, null, AuthenticationUser.class);
	}

	protected AuthenticationUser onGetUserByOpenSNSCode(String strDCSystemId, String strOpenType, String strOpenCode, String strOpenAccessId) throws Throwable {
		if (!StringUtils.hasLength(strDCSystemId)) {
			throw new Exception("未指定机构系统");
		}

		//传入的应用标识是真实开放应用标识
		String strOpenAccessIdLast = strOpenAccessId;
		strOpenAccessId = "";
		DCSystem dcSystem = this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);		

		//模仿机构身份
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		try {
			Employee employee = new Employee();
			employee.setUserId("SYSTEM");
			employee.setUserName("内置用户");
			employee.setPersonName("内置用户");
			employee.setSrfdcid(dcSystem.getSrfdcid());
			employee.setDCSystemId(dcSystem.getDCSystemId());
			
			EmployeeContext employeeContext = new EmployeeContext(employee, null, dcSystem.getSystemId());
			UserContext.setCurrent(employeeContext);
			
			strOpenAccessId = dcSystem.getAccessId();
			if(StringUtils.hasLength(strOpenAccessId)) {
				OpenAccess openAccess = this.getCloudSaaSUtilRuntime().getOpenAccess(strOpenAccessId);
				//判断开放平台类型是否一致
				if(!openAccess.getOpenType().equals(strOpenType)) {
					strOpenAccessId = "";
				}
			}

			if (!StringUtils.hasLength(strOpenAccessId)) {
				strOpenAccessId = KeyValueUtils.genUniqueId(dcSystem.getSrfdcid(), strOpenType.toUpperCase());
			}
			
			//获取开放用户信息
			OpenUser openUser = getCloudOpenClient().getOpenUserBySNSCode(strOpenAccessId, strOpenCode);
			
			User user = this.getCloudSaaSUtilRuntime().getUserByOpenUser(openUser);
			AuthenticationUser authenticationUser = this.getAuthenticationUser(user);
			
			this.getSystemRuntime().logAudit(LogLevels.INFO, LogCats.AUDIT_LOGIN, String.format("用户[%1$s]登录", authenticationUser.getUsername()), authenticationUser.getUserid(), "", "");
			
			return authenticationUser;
		} catch (Throwable ex) {
			throw ex;
		} finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	
	@Override
	public AuthenticationUser getUserByOpenAuthCode(String strDCSystemId, String strOpenType, String strOpenCode, String strOpenAccessId) {
		return this.executeAction("通过开放平台认证码获取用户信息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetUserByOpenAuthCode(strDCSystemId, strOpenType, strOpenCode, strOpenAccessId);
			}
		}, null, AuthenticationUser.class);
	}
	
	protected AuthenticationUser onGetUserByOpenAuthCode(String strDCSystemId, String strOpenType, String strOpenCode, String strOpenAccessId) throws Throwable {
		return this.onGetdUserByOpenAuthCode(strDCSystemId, strOpenType, strOpenCode, strOpenAccessId);
	}

	/**
	 * 函数名称有误，未来将被 onGetUserByOpenAuthCode 替换
	 * @param strDCSystemId
	 * @param strOpenType
	 * @param strOpenCode
	 * @param strOpenAccessId
	 * @return
	 * @throws Throwable
	 */
	@Deprecated
	protected AuthenticationUser onGetdUserByOpenAuthCode(String strDCSystemId, String strOpenType, String strOpenCode, String strOpenAccessId) throws Throwable {
		if (!StringUtils.hasLength(strDCSystemId)) {
			throw new Exception("未指定机构系统");
		}

		//传入的应用标识是真实开放应用标识
		String strOpenAccessIdLast = strOpenAccessId;
		strOpenAccessId = "";
		DCSystem dcSystem = this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);
		
		//模仿机构身份
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		try {
			Employee employee = new Employee();
			employee.setUserId("SYSTEM");
			employee.setUserName("内置用户");
			employee.setPersonName("内置用户");
			employee.setSrfdcid(dcSystem.getSrfdcid());
			employee.setDCSystemId(dcSystem.getDCSystemId());
			
			EmployeeContext employeeContext = new EmployeeContext(employee, null, dcSystem.getSystemId());
			UserContext.setCurrent(employeeContext);
			
			strOpenAccessId = dcSystem.getAccessId();
			if(StringUtils.hasLength(strOpenAccessId)) {
				OpenAccess openAccess = this.getCloudSaaSUtilRuntime().getOpenAccess(strOpenAccessId);
				//判断开放平台类型是否一致
				if(!openAccess.getOpenType().equals(strOpenType)) {
					strOpenAccessId = "";
				}
			}
			
			//strOpenAccessId = dcSystem.getAccessId();
			if (!StringUtils.hasLength(strOpenAccessId)) {
				strOpenAccessId = KeyValueUtils.genUniqueId(dcSystem.getSrfdcid(), strOpenType.toUpperCase());
			}
			
			//获取开放用户信息
			OpenUser openUser = getCloudOpenClient().getOpenUserByAuthCode(strOpenAccessId, strOpenCode);
			
			User user = this.getCloudSaaSUtilRuntime().getUserByOpenUser(openUser);
			AuthenticationUser authenticationUser = this.getAuthenticationUser(user);
			
			this.getSystemRuntime().logAudit(LogLevels.INFO, LogCats.AUDIT_LOGIN, String.format("用户[%1$s]登录", authenticationUser.getUsername()), authenticationUser.getUserid(), "", "");
			
			return authenticationUser;
		} catch (Throwable ex) {
			throw ex;
		} finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	@Override
	public ObjectNode createOpenQRCode(String strDCSystemId, String strOpenType, String strOpenAccessId) {
		return this.executeAction("建立开放平台二维码", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateOpenQRCode(strDCSystemId, strOpenType, strOpenAccessId);
			}
		}, null, ObjectNode.class);
	}
	
	protected ObjectNode onCreateOpenQRCode(String strDCSystemId, String strOpenType, String strOpenAccessId) throws Throwable {
		if (!StringUtils.hasLength(strDCSystemId)) {
			throw new Exception("未指定机构系统");
		}

		//传入的应用标识是真实开放应用标识
		String strOpenAccessIdLast = strOpenAccessId;
		strOpenAccessId = "";
		DCSystem dcSystem = this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);
		
		//模仿机构身份
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		try {
			Employee employee = new Employee();
			employee.setUserId("SYSTEM");
			employee.setUserName("内置用户");
			employee.setPersonName("内置用户");
			employee.setSrfdcid(dcSystem.getSrfdcid());
			employee.setDCSystemId(dcSystem.getDCSystemId());
			
			EmployeeContext employeeContext = new EmployeeContext(employee, null, dcSystem.getSystemId());
			UserContext.setCurrent(employeeContext);
			
			strOpenAccessId = dcSystem.getAccessId();
			if(StringUtils.hasLength(strOpenAccessId)) {
				OpenAccess openAccess = this.getCloudSaaSUtilRuntime().getOpenAccess(strOpenAccessId);
				//判断开放平台类型是否一致
				if(!openAccess.getOpenType().equals(strOpenType)) {
					strOpenAccessId = "";
				}
			}
			
			//strOpenAccessId = dcSystem.getAccessId();
			if (!StringUtils.hasLength(strOpenAccessId)) {
				strOpenAccessId = KeyValueUtils.genUniqueId(dcSystem.getSrfdcid(), strOpenType.toUpperCase());
			}
			
			OpenQRCodeRequest openQRCodeRequest = new OpenQRCodeRequest();
			String strScene = String.format("LOGIN:%1$s:%2$s", strDCSystemId, KeyValueUtils.genUniqueId());
			if(strScene.length()>60) {
				strScene = strScene.substring(0, 60);
			}
			openQRCodeRequest.setScene(strScene);
			openQRCodeRequest.setExpireSeconds(120);
			
			OpenQRCode openQRCode = this.getCloudOpenClient().createOpenQRCode(strOpenAccessId, openQRCodeRequest);
			
			ObjectNode ret = JsonUtils.createObjectNode();
			ret.put(OpenQRCode.FIELD_URL, openQRCode.getUrl());
			ret.put(OpenQRCode.FIELD_TICKET, openQRCode.getTicket());
			ret.put("expirein", openQRCode.getExpireSeconds());
			return ret;
		} catch (Throwable ex) {
			throw ex;
		} finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	@Override
	public AuthenticationUser getUserByOpenQRCode(String strDCSystemId, String strOpenType, String strOpenQRCode, String strOpenAccessId) {
		return this.executeAction("通过开放平台二维码获取用户信息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetUserByOpenQRCode(strDCSystemId, strOpenType, strOpenQRCode, strOpenAccessId);
			}
		}, null, AuthenticationUser.class);
	}

	protected AuthenticationUser onGetUserByOpenQRCode(String strDCSystemId, String strOpenType, String strOpenQRCode, String strOpenAccessId) throws Throwable {
		if (!StringUtils.hasLength(strDCSystemId)) {
			throw new Exception("未指定机构系统");
		}

		//传入的应用标识是真实开放应用标识
		String strOpenAccessIdLast = strOpenAccessId;
		strOpenAccessId = "";
		DCSystem dcSystem = this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);
		

		//模仿机构身份
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();

		try {
			Employee employee = new Employee();
			employee.setUserId("SYSTEM");
			employee.setUserName("内置用户");
			employee.setPersonName("内置用户");
			employee.setSrfdcid(dcSystem.getSrfdcid());
			employee.setDCSystemId(dcSystem.getDCSystemId());
			
			EmployeeContext employeeContext = new EmployeeContext(employee, null, dcSystem.getSystemId());
			UserContext.setCurrent(employeeContext);
			
			strOpenAccessId = dcSystem.getAccessId();
			if(StringUtils.hasLength(strOpenAccessId)) {
				OpenAccess openAccess = this.getCloudSaaSUtilRuntime().getOpenAccess(strOpenAccessId);
				//判断开放平台类型是否一致
				if(!openAccess.getOpenType().equals(strOpenType)) {
					strOpenAccessId = "";
				}
			}

			if (!StringUtils.hasLength(strOpenAccessId)) {
				strOpenAccessId = KeyValueUtils.genUniqueId(dcSystem.getSrfdcid(), strOpenType.toUpperCase());
			}
			
			//获取开放用户信息 
			OpenUser openUser = getCloudOpenClient().getOpenUserByQRCode(strOpenAccessId, strOpenQRCode);
			if(openUser == null) {
				return null;
			}
			
			User user = this.getCloudSaaSUtilRuntime().getUserByOpenUser(openUser);
			AuthenticationUser authenticationUser = this.getAuthenticationUser(user);
			
			this.getSystemRuntime().logAudit(LogLevels.INFO, LogCats.AUDIT_LOGIN, String.format("用户[%1$s]登录", authenticationUser.getUsername()), authenticationUser.getUserid(), "", "");
			
			return authenticationUser;
		} catch (Throwable ex) {
			throw ex;
		} finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	
	protected AuthenticationUser getAuthenticationUser(User user) {
		AuthenticationUser authenticationUser = AuthenticationUser.from(user);
		authenticationUser.setPassword(null);
		return authenticationUser;
	}
	
	
	@Override
	public String getAuthorizationCode(IAuthenticationUser iAuthenticationUser, String strScope) {
		return this.executeAction("获取认证代码", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAuthorizationCode(iAuthenticationUser, strScope);
			}
		}, null, String.class);
	}
	
	protected String onGetAuthorizationCode(IAuthenticationUser iAuthenticationUser, String strScope) throws Throwable {
		
		String strToken = iAuthenticationUser.getToken();
		if(!StringUtils.hasLength(strToken)) {
			throw new Exception(String.format("认证用户未携带Token"));
		}
		
		if(StringUtils.hasLength(strScope)) {
			
		}
		
		String strAuthorizationCode = KeyValueUtils.genUniqueId(strToken, KeyValueUtils.genUniqueId());
		this.getSysCacheUtilRuntime().set(CloudCacheTagUtils.getAuthenticationUserTag(strAuthorizationCode), iAuthenticationUser, 300);
		
		return strAuthorizationCode;
	}
	
	@Override
	public AuthenticationUser getUserByAuthCode(String strAuthCode) {
		return this.executeAction("通过认证代码获取认证用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetUserByAuthCode(strAuthCode);
			}
		}, null, AuthenticationUser.class);
	}
	
	protected AuthenticationUser onGetUserByAuthCode(String strAuthCode) throws Throwable {
		return this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserTag(strAuthCode), AuthenticationUser.class);
	}
	
	
	@Override
	public Map<String, Object> getOIDCResult() {
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
		
		return (Map<String, Object>)this.executeAction("通过当前用户OIDC结果对象", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetOIDCResult(iAuthenticationUser);
			}
		}, null);
	}
	
	protected Map<String, Object> onGetOIDCResult(IAuthenticationUser iAuthenticationUser) throws Throwable{
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("sub", iAuthenticationUser.getUsername());
		map.put("email", iAuthenticationUser.getEmail());
		//过期时间
	//	map.put("exp", iAuthenticationUser.getEmail());
		return map;
		
	}

	/**
	 * 获取PrivateKey对象
	 * 
	 * @param privateKeyBase64
	 * @return
	 */
	protected PrivateKey getPrivateKey(String privateKeyBase64) throws Throwable {
		byte[] byteKey = Base64.getDecoder().decode(privateKeyBase64);
		PKCS8EncodedKeySpec x509EncodedKeySpec = new PKCS8EncodedKeySpec(byteKey);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		return keyFactory.generatePrivate(x509EncodedKeySpec);
	}

	protected String getPrivateKeyString() throws Throwable {
		if(StringUtils.hasLength(this.strPrivateKeyString)) {
			return this.strPrivateKeyString;
		}
		String usrHome = System.getProperty("user.home") + "/.ibzrt";
		File priKeyFile = new File(usrHome, "ibzrt_rsa");
		if (!priKeyFile.exists()) {
			this.strPrivateKeyString = IOUtils.toString(this.getClass().getResourceAsStream("/uaa/keypair/ibzrt_rsa"), Charset.defaultCharset());
		} else {
			this.strPrivateKeyString = IOUtils.toString(new FileInputStream(priKeyFile), Charset.defaultCharset());
		}
		return this.strPrivateKeyString;
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
			strPublicKeyString = IOUtils.toString(this.getClass().getResourceAsStream("/uaa/keypair/ibzrt_rsa.pub"), Charset.defaultCharset());
		} else {
			strPublicKeyString = IOUtils.toString(new FileInputStream(pubKeyFile), Charset.defaultCharset());
		}
		return strPublicKeyString;
	}

	@Override
	public String getPublicKey() {
		return this.executeAction("获取公钥", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return getPublicKeyString();
			}
		}, null, String.class);
	}
	
	protected ICloudPortalClient getCloudPortalClient() throws Exception{
		if(this.iCloudPortalClient == null) {
			try {
				ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
				this.iCloudPortalClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL, ICloudPortalClient.class, true);
			} catch (Throwable ex) {
				log.error(String.format("获取Cloud门户客户端发生异常，$1%s", ex.getMessage()), ex);
				throw new Exception(String.format("未指定Cloud门户客户端"), ex);
			}
		}
		return this.iCloudPortalClient;
	}

	@Override
	public String getLogicName() {
		return String.format("Cloud体系UAA功能组件[%1$s]", this.getName());
	}

	
	@Override
	protected String getGlobalConfigId() {
		return CLOUDUAAUTIL_CONFIGFOLDER;
	}
	
	
	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_UAA;
	}
}
