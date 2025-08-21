package net.ibizsys.central.cloud.core.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import io.jsonwebtoken.lang.Assert;
import net.ibizsys.central.Version;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.dataentity.security.DataEntityAccessManager;
import net.ibizsys.central.cloud.core.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.SysLogicTags;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.security.ISysUniResRuntime;
import net.ibizsys.central.security.ISysUserRoleRuntime;
import net.ibizsys.central.system.ISystemModuleUtilRuntime;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.security.IPSSysUniRes;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.model.security.IPSSysUserRoleRes;
import net.ibizsys.runtime.ISystemUtilRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysScriptLogicRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.script.IScriptEntity;

public abstract class SystemAccessManagerBase extends net.ibizsys.central.security.SystemAccessManager implements ISystemAccessManager {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemAccessManagerBase.class);

	private ISysUAAUtilRuntime iSysUAAUtilRuntime = null;
	private ISysLogicRuntime fillAppDataSysLogicRuntime = null;
	private boolean bCalcFillAppDataSysLogicRuntime = false;
	private Map<String, Object> appDataCtxMap = null;
	private Map<String, Object> appDataMap = null;
	private IServiceSystemRuntime iServiceSystemRuntime = null;

	@Override
	protected void onInit() throws Exception {

		if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
			iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
		}
		
		super.onInit();

		this.prepareSysCacheUtilRuntime();
		
		this.appDataCtxMap = this.getSystemRuntime().getSystemRuntimeSetting().getParams("appdatactx", null);
		this.appDataMap = this.getSystemRuntime().getSystemRuntimeSetting().getParams("appdata", null);
	}

	protected Map<String, Object> getAppDataCtxMap() {
		return this.appDataCtxMap;
	}

	protected Map<String, Object> getAppDataMap() {
		return this.appDataMap;
	}

	protected ISysUAAUtilRuntime getSysUAAUtilRuntime() {
		if (this.iSysUAAUtilRuntime == null) {
			this.iSysUAAUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysUAAUtilRuntime.class, false);
		}
		return this.iSysUAAUtilRuntime;
	}

	protected IServiceSystemRuntime getServiceSystemRuntime(boolean bTryMode) throws Exception {
		if(this.iServiceSystemRuntime != null || bTryMode) {
			return this.iServiceSystemRuntime;
		}
		throw new Exception("未指定服务系统运行时对象");
	}
	
	
	@Override
	protected ISysUserRoleRuntime createSysUserRoleRuntime(IPSSysUserRole iPSSysUserRole) {
		if(iPSSysUserRole.getPSSysSFPlugin() != null) {
			return this.getSystemRuntime().getRuntimeObject(iPSSysUserRole.getPSSysSFPlugin(), ISysUserRoleRuntime.class, true);
		}
		
		if(iPSSysUserRole.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemRuntime().getSystemModuleUtilRuntime(iPSSysUserRole.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime instanceof net.ibizsys.central.cloud.core.system.ISystemModuleUtilRuntime) {
				ISysUserRoleRuntime iSysUserRoleRuntime = ((net.ibizsys.central.cloud.core.system.ISystemModuleUtilRuntime)iSystemModuleUtilRuntime).createSysUserRoleRuntime(iPSSysUserRole);
				if (iSysUserRoleRuntime != null) {
					return iSysUserRoleRuntime;
				}
			}
		}
		
		return createDefaultSysUserRoleRuntime();
	}
	
	protected ISysUserRoleRuntime createDefaultSysUserRoleRuntime() {
		return new SysUserRoleRuntime();
	}
	
	@Override
	protected ISysUniResRuntime createSysUniResRuntime(IPSSysUniRes iPSSysUniRes) {
		if(iPSSysUniRes.getPSSysSFPlugin() != null) {
			return this.getSystemRuntime().getRuntimeObject(iPSSysUniRes.getPSSysSFPlugin(), ISysUniResRuntime.class, true);
		}
		
		if(iPSSysUniRes.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemRuntime().getSystemModuleUtilRuntime(iPSSysUniRes.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime instanceof net.ibizsys.central.cloud.core.system.ISystemModuleUtilRuntime) {
				ISysUniResRuntime iSysUniResRuntime = ((net.ibizsys.central.cloud.core.system.ISystemModuleUtilRuntime)iSystemModuleUtilRuntime).createSysUniResRuntime(iPSSysUniRes);
				if (iSysUniResRuntime != null) {
					return iSysUniResRuntime;
				}
			}
		}
		return createDefaultSysUniResRuntime();
	}
	
	protected ISysUniResRuntime createDefaultSysUniResRuntime() {
		return new SysUniResRuntime();
	}

	@Override
	public IDataEntityAccessManager createDataEntityAccessManager(IDataEntityRuntime iDataEntityRuntime) {
		return new DataEntityAccessManager();
	}

	@Override
	public AppData getAppData(String strSystemTag, String strOrgId) {
		try {
			return onGetAppData(strSystemTag, strOrgId);
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取当前用户应用数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	@Override
	public AppData getAppData(String strDCSystemTag) {
		try {
			return onGetAppData(strDCSystemTag);
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取当前用户应用数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected AppData onGetAppData(String strDCSystemTag) throws Throwable {
		AppData appData = this.getSysUAAUtilRuntime().getAppData(strDCSystemTag);
		String strSystemTag = null;
		String strOrgId = null; 
		if(appData.getContext()!=null) {
			strSystemTag = (String) appData.getContext().get("srfsystemid");
			strOrgId =  (String) appData.getContext().get("srforgid");
		}
		
		return this.onGetAppData(appData, strSystemTag, strOrgId);
	}
	
	protected AppData onGetAppData(String strSystemTag, String strOrgId) throws Throwable {
		return this.onGetAppData(null, strSystemTag, strOrgId);
	}

	protected AppData onGetAppData(AppData appData, String strSystemTag, String strOrgId) throws Throwable {
		if(appData == null) {
			appData = this.getSysUAAUtilRuntime().getAppData(strSystemTag, strOrgId);
		}

		appData.set("version", Version.toVersionString());
		
		// 构造上下文身份
		IEmployeeContext iEmployeeContext = this.getSysUAAUtilRuntime().getEmployeeContext(strSystemTag, strOrgId, true);
		
		IAppContext iAppContext = iEmployeeContext.getAppContext();
		if (iAppContext == null) {
			iAppContext = new AppContext();
			iEmployeeContext.setAppContext(iAppContext);
		}
		
		//尝试构建应用上下文
		String strQueryString = null;
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if(requestAttributes instanceof ServletRequestAttributes) {
			HttpServletRequest httpServletRequest = ((ServletRequestAttributes)requestAttributes).getRequest();
			strQueryString = httpServletRequest.getQueryString();
			if(StringUtils.hasLength(strQueryString)) {
				Map<String, Object> params = RestUtils.queryString2Map(strQueryString, true);
				for(java.util.Map.Entry<String, Object> entry : params.entrySet()) {
					iAppContext.set(entry.getKey(), entry.getValue());
				}
			}
		}
		
		// 进行权限合成
		Collection<? extends GrantedAuthority> grantedAuthorities = iEmployeeContext.getAuthorities();

		if (AuthenticationUser.getCurrentMust().getSuperuser() == 1 || iEmployeeContext.isSuperuser()) {
			appData.set("enablepermissionvalid", false);
		} else {
			appData.set("enablepermissionvalid", true);
			Set<String> uniRes = new HashSet<>();
			appData.set("unires", uniRes);

			// 重新计算资源集合（后续需要调整算法）
			if (!ObjectUtils.isEmpty(grantedAuthorities)) {
				for (GrantedAuthority grantedAuthority : grantedAuthorities) {
					if (grantedAuthority instanceof UAAUniResAuthority) {
						uniRes.add(grantedAuthority.getAuthority());
						continue;
					}
				}
			}
			//系统角色分配
			List<ISysUserRoleRuntime> iSysUserRoleRuntimes = this.getSysUserRoleRuntimes(iEmployeeContext);
			if (!ObjectUtils.isEmpty(iSysUserRoleRuntimes)) {
				for (ISysUserRoleRuntime iSysUserRoleRuntime : iSysUserRoleRuntimes) {
					if (iSysUserRoleRuntime.getPSSysUserRole() != null && iSysUserRoleRuntime.getPSSysUserRole().getPSSysUserRoleReses() != null) {
						for (IPSSysUserRoleRes iPSSysUserRoleRes : iSysUserRoleRuntime.getPSSysUserRole().getPSSysUserRoleReses()) {
							uniRes.add(iPSSysUserRoleRes.getSysUniResCode());
						}
					}
				}
			}
		}

		final Map<String, Object> data = getAppDataMap();
		if (data != null) {
			appData.putAll(data);
		}

		/**
		 * 填充预置应用上下文
		 */
		final Map<String, Object> ctx = this.getAppDataCtxMap();
		if (ctx != null) {
			if (appData.getContext() == null) {
				appData.setContext(new Entity());
			}
			appData.getContext().putAll(ctx);
		}
		String strDynaModelTag = DataTypeUtils.asString(appData.get("dynamodeltag"), null);
		final IServiceSystemRuntime iServiceSystemRuntime = this.getServiceSystemRuntime(true);
		if(iServiceSystemRuntime != null) {
			if(!StringUtils.hasLength(strDynaModelTag)) {
				strDynaModelTag = iServiceSystemRuntime.getPSSystemService().getModelDigest();
			}
			else {
				strDynaModelTag = KeyValueUtils.genUniqueId(strDynaModelTag, iServiceSystemRuntime.getPSSystemService().getModelDigest());
			}
			
			final V2DeploySystem v2DeploySystem = iServiceSystemRuntime.getV2DeploySystem();
			if(v2DeploySystem != null) {
				if(StringUtils.hasLength(v2DeploySystem.getProductId())) {
					appData.getContext().set("srfv2productid", v2DeploySystem.getProductId());
				}
				if(StringUtils.hasLength(v2DeploySystem.getSystemId())) {
					appData.getContext().set("srfv2systemid", v2DeploySystem.getSystemId());
				}
			}
			
			if(StringUtils.hasLength(iServiceSystemRuntime.getSystemMergeSessionId())
					|| StringUtils.hasLength(iServiceSystemRuntime.getExtensionSessionId())) {
				strDynaModelTag = KeyValueUtils.genUniqueId(strDynaModelTag, iServiceSystemRuntime.getExtensionSessionId(), iServiceSystemRuntime.getSystemMergeSessionId());
			}
		}
		appData.set("dynamodeltag", strDynaModelTag);

		// 进一步添加应用数据
		this.onFillAppData(appData);

		return appData;
	}
	
	/**
	 * 进一步添加应用数据
	 * @param appData
	 * @throws Throwable
	 */
	protected void onFillAppData(AppData appData) throws Throwable {
		
		Entity session = new Entity();
		ISysLogicRuntime iSysLogicRuntime = getFillAppDataSysLogicRuntime();
		if (iSysLogicRuntime != null) {
			try {
				boolean bJavaScriptMode = false;
				if(iSysLogicRuntime instanceof ISysScriptLogicRuntime) {
					ISysScriptLogicRuntime iSysScriptLogicRuntime = (ISysScriptLogicRuntime)iSysLogicRuntime;
					if(ISystemUtilRuntime.SCRIPTENGINE_JAVASCRIPT.equals(iSysScriptLogicRuntime.getScriptEngine())) {
						IScriptEntity appScriptEntity = this.getSystemRuntime().createScriptEntity(appData);
						IScriptEntity ctxScriptEntity = this.getSystemRuntime().createScriptEntity(appData.getContext());
						
						IScriptEntity sessionScriptEntity = this.getSystemRuntime().createScriptEntity(session);
						iSysLogicRuntime.execute(appScriptEntity, ctxScriptEntity, sessionScriptEntity);
						bJavaScriptMode = true;
					}
				}
				
				if(!bJavaScriptMode) {
					iSysLogicRuntime.execute(appData, appData.getContext(), session);
				}
			} catch (Throwable ex) {
				throw new RuntimeException(String.format("附加填充上下文逻辑发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
		if(this.getServiceSystemRuntime(true) != null) {
			Collection<IExtensionSysRefRuntime> list = this.getServiceSystemRuntime(false).getExtensionSysRefRuntimes(true);
			if(!ObjectUtils.isEmpty(list)) {
				for(IExtensionSysRefRuntime iExtensionSysRefRuntime : list) {
					iExtensionSysRefRuntime.fillAddinAppData(appData, session);
				}
			}
		}
		
		Map<String, Object> sessionParams = session.any();
		if(!ObjectUtils.isEmpty(sessionParams)) {
			//写入会话
			this.getSysUAAUtilRuntime().updateCurrentEmployeeSession(sessionParams);
		}
	}

	
	@Override
	public void fillAddinAppData(AppData appData, Entity session) {
		Assert.notNull(appData, "传入应用数据对象无效");
		Assert.notNull(session, "传入会话数据对象无效");
		try {
			onFillAddinAppData(appData, session);
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("填充当前用户插件应用数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	/**
	 * 进一步添加应用数据
	 * @param appData
	 * @throws Throwable
	 */
	protected void onFillAddinAppData(AppData appData, Entity session) throws Throwable {
		
		ISysLogicRuntime iSysLogicRuntime = getFillAppDataSysLogicRuntime();
		if (iSysLogicRuntime != null) {
			boolean bJavaScriptMode = false;
			if(iSysLogicRuntime instanceof ISysScriptLogicRuntime) {
				ISysScriptLogicRuntime iSysScriptLogicRuntime = (ISysScriptLogicRuntime)iSysLogicRuntime;
				if(ISystemUtilRuntime.SCRIPTENGINE_JAVASCRIPT.equals(iSysScriptLogicRuntime.getScriptEngine())) {
					IScriptEntity appScriptEntity = this.getSystemRuntime().createScriptEntity(appData);
					IScriptEntity ctxScriptEntity = this.getSystemRuntime().createScriptEntity(appData.getContext());
					
					IScriptEntity sessionScriptEntity = this.getSystemRuntime().createScriptEntity(session);
					iSysLogicRuntime.execute(appScriptEntity, ctxScriptEntity, sessionScriptEntity);
					bJavaScriptMode = true;
				}
			}
			
			if(!bJavaScriptMode) {
				iSysLogicRuntime.execute(appData, appData.getContext(), session);
			}
		}
	}

	
	
	protected ISysLogicRuntime getFillAppDataSysLogicRuntime() {
		if (!bCalcFillAppDataSysLogicRuntime) {
			this.fillAppDataSysLogicRuntime = onGetFillAppDataSysLogicRuntime();
			bCalcFillAppDataSysLogicRuntime = true;
		}
		return this.fillAppDataSysLogicRuntime;
	}

	protected ISysLogicRuntime onGetFillAppDataSysLogicRuntime() {
		IPSSysLogic iPSSysLogic = this.getSystemRuntimeContext().getSystemRuntime().getPSSysLogic(SysLogicTags.FILLAPPDATA);
		if (iPSSysLogic != null) {
			return this.getSystemRuntimeContext().getSystemRuntime().getSysLogicRuntime(iPSSysLogic);
		}
		return null;
	}

	@Override
	public List<ISysUserRoleRuntime> getSysUserRoleRuntimes(IUserContext iUserContext) {
		IEmployeeContext iEmployeeContext = (IEmployeeContext) iUserContext;
		List<ISysUserRoleRuntime> assignSysUserRoleRuntimeList = new ArrayList<>();
		if (!ObjectUtils.isEmpty(iEmployeeContext.getAuthorities())) {
			for (GrantedAuthority ga : iEmployeeContext.getAuthorities()) {
				if (ga instanceof UAARoleAuthority) {
					ISysUserRoleRuntime iSysUserRoleRuntime = this.getSysUserRoleRuntime(ga.getAuthority(), true);
					if (iSysUserRoleRuntime != null) {
						assignSysUserRoleRuntimeList.add(iSysUserRoleRuntime);
					}
				}
			}
		}
		
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrent();
		final List<ISysUserRoleRuntime> testSysUserRoleRuntimeList = this.getTestSysUserRoleRuntimes();
		if (!ObjectUtils.isEmpty(testSysUserRoleRuntimeList) && iAuthenticationUser!=null) {
			//从缓存中获取
			Map map = this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()), CloudCacheTagUtils.getUserDynaRolesTag(iEmployeeContext.getDcsystemid()), Map.class);
			if(map == null) {
				map = new LinkedHashMap<String, String>();
				for(ISysUserRoleRuntime iSysUserRoleRuntime : this.getTestSysUserRoleRuntimes()) {
					if(iSysUserRoleRuntime.testUser(iUserContext)) {
						map.put(iSysUserRoleRuntime.getRoleTag(), "");
					}
				}
				this.getSysCacheUtilRuntime().set(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()), CloudCacheTagUtils.getUserDynaRolesTag(iEmployeeContext.getDcsystemid()), map);
			}
			for(Object roleTag : map.keySet()) {
				ISysUserRoleRuntime iSysUserRoleRuntime = this.getSysUserRoleRuntime((String)roleTag, true);
				if (iSysUserRoleRuntime != null) {
					if(!assignSysUserRoleRuntimeList.contains(iSysUserRoleRuntime)) {
						assignSysUserRoleRuntimeList.add(iSysUserRoleRuntime);
					}
				}
			}
		}
		
		return assignSysUserRoleRuntimeList;
	}
	
	
	
	@Override
	public boolean testSysUniRes(IUserContext iUserContext, String strSysUniRes, IEntity iEntity) throws Exception {
		if (testSuperuser(iUserContext))
			return true;
		//补充用户身份中的统一资源
		if (iUserContext instanceof IEmployeeContext) {
			IEmployeeContext iEmployeeContext = (IEmployeeContext) iUserContext;
			Collection<? extends GrantedAuthority> grantedAuthorities = iEmployeeContext.getAuthorities();
			if (!ObjectUtils.isEmpty(grantedAuthorities)) {
				for (GrantedAuthority grantedAuthority : grantedAuthorities) {
					if (grantedAuthority instanceof UAAUniResAuthority) {
						if (grantedAuthority.getAuthority() != null && grantedAuthority.getAuthority().equals(strSysUniRes))
							return true;
					}
				}
			}
		}
		return super.testSysUniRes(iUserContext, strSysUniRes, iEntity);
	}
	
	
	
	@Override
	public boolean testUserRole(IEmployeeContext iEmployeeContext, String strUserRoleTag) throws Exception {
		if (testSuperuser(iEmployeeContext))
			return true;
		Collection<? extends GrantedAuthority> grantedAuthorities = iEmployeeContext.getAuthorities();
		if (!ObjectUtils.isEmpty(grantedAuthorities)) {
			for (GrantedAuthority grantedAuthority : grantedAuthorities) {
				if (grantedAuthority instanceof UAARoleAuthority) {
					if (grantedAuthority.getAuthority() != null && grantedAuthority.getAuthority().equals(strUserRoleTag))
						return true;
				}
			}
		}
		return false;
	}
	
	
	@Override
	public boolean testSysUserRole(IEmployeeContext iEmployeeContext, String strSysUserRoleTag) throws Exception {
		return testUserRole(iEmployeeContext, strSysUserRoleTag);
	}
	
	@Override
	public boolean testDEUserRole(IEmployeeContext iEmployeeContext, String strDEUserRoleTag) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	

	protected boolean testSuperuser(IUserContext iUserContext) {
		return iUserContext.isSuperuser();
	}
	
	@Override
	public IEmployeeContext getCurrentSystemEmployeeContext(IEmployeeContext iEmployeeContext, boolean bSetCurrent) throws Exception {
		Assert.notNull(iEmployeeContext, "传入机构用户上下文对象无效");
		if(this.getSystemRuntime().getDeploySystemId().equalsIgnoreCase(iEmployeeContext.getSystemid())) {
			return iEmployeeContext;
		}
		
		Employee employee = this.getSysUAAUtilRuntime().getEmployee(this.getSystemRuntime().getDeploySystemId(), iEmployeeContext.getOrgid(), true);
		if(employee == null) {
			this.getSysUAAUtilRuntime().getAppData(this.getSystemRuntime().getDeploySystemId(), iEmployeeContext.getOrgid());
			return this.getSysUAAUtilRuntime().getEmployeeContext(this.getSystemRuntime().getDeploySystemId(), iEmployeeContext.getOrgid(), bSetCurrent);
		}
		else {
			return this.getSysUAAUtilRuntime().getEmployeeContext(AuthenticationUser.getCurrentMust(), employee, this.getSystemRuntime().getDeploySystemId(), bSetCurrent);
		}
	}
	
}
