package net.ibizsys.central.cloud.uaa.core.addin;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.util.domain.User;
import net.ibizsys.central.cloud.uaa.core.util.SM3Utils;

public class DefaultAuthAgent extends AuthAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DefaultAuthAgent.class);

	private int pwdCryptMode = 3;

	protected int getPwdCryptMode() {
		return pwdCryptMode;
	}

	protected void setPwdCryptMode(int pwdCryptMode) {
		this.pwdCryptMode = pwdCryptMode;
	}

	@Override
	protected AuthenticationUser onGetUserByName(String srfsystem, String srforgid, String username, boolean bTryMode) throws Throwable {

		if (!StringUtils.hasLength(username))
			throw new UsernameNotFoundException("用户名为空");
		
		
		User user = this.getCloudSaaSUtilRuntime(false).getUserByName(username);

//		ISysUserService iSysUserService = EBSXSystemRuntime.getInstance().getSysUserService();
//		SearchContextDTO searchContextDTO = new SearchContextDTO();
//		// QueryWrapper<SysUser> conds = new QueryWrapper<SysUser>();
//		String[] data = username.split("[|,@]");
//		String loginname = "";
//		String domains = "";
//		if (data.length > 0)
//			loginname = data[0].trim();
//		if (data.length > 1)
//			domains = data[1].trim();
//		if (!ObjectUtils.isEmpty(loginname)) {
//			// conds.eq("loginname", loginname);
//			searchContextDTO.eq("loginname", loginname);
//		}
//
//		if (!ObjectUtils.isEmpty(domains)) {
//			// conds.eq("domains", domains);
//			searchContextDTO.eq("domains", loginname);
//		}
//
//		// SysUser sysUser = sysUserService.getOne(conds, false);
//		// if (sysUser == null) {
//		// throw new BadRequestAlertException("用户名密码错误","IBZUSER",username);
//		// } else {
//		// sysUser.setUsername(username);
//		// }
//
//		SysUserDTO sysUserDTO = iSysUserService.selectOne(searchContextDTO, true);
//		if (sysUserDTO == null) {
//			if (bTryMode) {
//				return null;
//			}
//			throw new UsernameNotFoundException("指定用户不存在");
//		}

		//
		// //非组织用户
		// if (ObjectUtils.isEmpty(system) || ObjectUtils.isEmpty(orgid) ||
		// "undefined".equals(system) || "undefined".equals(orgid)) {
		// return createUserDetails(sysUser);
		// }

		// 非组织用户
		if (ObjectUtils.isEmpty(srfsystem) || ObjectUtils.isEmpty(srforgid)) {
			return getAuthenticationUser(user);
		}

		//
		// //Portal需特殊处理单位信息
		// if (this.isPortalSystem(system)) {
		// user = createUserDetails(sysUser);
		// this.setPortalUserOrgInfo(user, orgid);
		// return user;
		// }
		//
		// String[] userOrgId = orgid.split("[|]");
		// //实例计算代理单位，仅用于计算动态实例相关，默认与当前用户身份单位相同
		// String proxyOrgId = orgid;
		// if (userOrgId.length > 1) {
		// orgid = userOrgId[0];
		// proxyOrgId = userOrgId[1];
		// }
		//
		// //加载emp信息
		// user = createUserDetails(sysUser, orgid);
		//
		// //检查系统
		// SysDCSystem dcSystem =
		// sysDCSystemService.getOne(Wrappers.<SysDCSystem>lambdaQuery().eq(SysDCSystem::getSystemid,
		// system));
		// if (dcSystem == null) {
		// throw new
		// UsernameNotFoundException(String.format("系统[%s]无效的组织[%s]用户[%s]",
		// system, orgid, user.getUsername()));
		// }
		// //检查用户访问授权
		// if (user.getSuperuser() == 0) {
		// SysUserRoleSearchContext accessSearchContext = new
		// SysUserRoleSearchContext();
		//// accessSearchContext.setN_dcsystemid_eq(dcSystem.getDcsystemid());
		// accessSearchContext.setN_usermode_in("ACCESSUSER,ACCESSADMIN");
		// accessSearchContext.setN_userid_eq(user.getPersonid());
		// accessSearchContext.getSelectCond().apply("((T11.GLOBALFLAG = 1) OR
		// ((T11.GLOBALFLAG IS NULL) OR (T11.GLOBALFLAG = 0) AND
		// T11.DCSYSTEMID={0}))", dcSystem.getDcsystemid());
		// List<SysUserRole> sysUserRoles =
		// sysUserRoleService.select(accessSearchContext);
		// if (sysUserRoles.size() == 0) {
		// SysRoleSearchContext sysRoleSearchContext = new
		// SysRoleSearchContext();
		// sysRoleSearchContext.setN_dcsystemid_eq(dcSystem.getDcsystemid());
		// sysRoleSearchContext.setN_authorizeall_eq(1);
		// sysRoleSearchContext.setN_usermode_in("ACCESSUSER,ACCESSADMIN");
		// List<SysRole> roleList = sysRoleService.select(sysRoleSearchContext);
		//
		// if (roleList.size() == 0) {
		// throw new
		// UsernameNotFoundException(String.format("系统[%s]未授予用户[%s]访问权限。",
		// dcSystem.getDcsystemname(), sysUser.getUsername()));
		// } else {
		// for (int i = 0; i < roleList.size(); i++) {
		// SysRole sysRole = roleList.get(i);
		// if (org.apache.commons.lang3.StringUtils.equals("ACCESSADMIN",
		// sysRole.getUsermode())) {
		// user.setAdminuser(1);
		// break;
		// }
		// }
		// }
		// } else {
		// for (SysUserRole sysUserRole : sysUserRoles) {
		// if ("ACCESSADMIN".equals(sysUserRole.getUsermode())) {
		// user.setAdminuser(1);
		// break;
		// }
		// }
		// }
		// }
		// user.setSrfsystemid(dcSystem.getSystemid());
		// user.setSrfdcsystemid(dcSystem.getDcsystemid());
		// setUserPermission(user, dcSystem);
		//
		// SysOrgSystemSearchContext orgSystemSearchContext = new
		// SysOrgSystemSearchContext();
		// orgSystemSearchContext.setN_orgid_eq(proxyOrgId);
		// orgSystemSearchContext.setN_systemid_eq(system);
		// orgSystemSearchContext.setN_isvalid_eq(1);
		// orgSystemSearchContext.setN_dcsystemid_eq(dcSystem.getDcsystemid());
		// List<SysOrgSystem> sysOrgSystems =
		// sysOrgSystemService.searchIgnoreCenter(orgSystemSearchContext).getContent();
		//
		// //换算DynaInst
		// String dynaInstId = "";
		// if (sysOrgSystems.size() > 0) {
		// SysOrgSystem sysOrgSystem = sysOrgSystems.get(0);
		// dynaInstId = sysOrgSystem.getDynainstid();
		// } else {
		// SysDynaInstSearchContext sysDynaInstSearchContext = new
		// SysDynaInstSearchContext();
		// sysDynaInstSearchContext.setN_dcsystemid_eq(dcSystem.getDcsystemid());
		// sysDynaInstSearchContext.setN_defaultinst_eq(1);
		// List<SysDynaInst> dynaInsts =
		// sysDynaInstService.searchDefault(sysDynaInstSearchContext).getContent();
		// if (dynaInsts.size() == 0) {
		// //throw new
		// UsernameNotFoundException(String.format("无效的组织[%s]用户[%s]", orgid,
		// user.getUsername()));
		// } else {
		// dynaInstId = dynaInsts.get(0).getDynainstid();
		// }
		// }
		// if (!ObjectUtils.isEmpty(dynaInstId)) {
		// user.setSrfdynainstid(dynaInstId);
		// MetaDynamicModelSearchContext dynamicModelSearchContext = new
		// MetaDynamicModelSearchContext();
		// dynamicModelSearchContext.setN_sysdynainstid_eq(dynaInstId);
		// dynamicModelSearchContext.setN_pdynainstid_isnull(null);
		// dynamicModelSearchContext.setN_status_eq(StaticDict.DynamicModelStatus.ITEM_1.getValue());
		// List<MetaDynamicModel> dynamicModels =
		// dynamicModelService.searchDynaInst(dynamicModelSearchContext).getContent();
		// if (dynamicModels.size() > 0) {
		// user.setSrfdynamodelid(dynamicModels.get(0).getConfigid());
		// user.setSrfrealdynainstid(dynamicModels.get(0).getDynainstid());
		// }
		// }
		//
		// SecurityContextHolder.getContext().setAuthentication(null);
		// user.setSessionParams(null);
		// user.getSessionParams();
		// return user;

		return null;
	}

	@Override
	protected AuthenticationUser onGetUserByLogin(String srfsystem, String srforgid, String username, String password, boolean bTryMode) throws Throwable {

		if (!StringUtils.hasLength(username))
			throw new UsernameNotFoundException("用户名为空");

		User user = this.getCloudSaaSUtilRuntime(false).getUserByName(username);
	
		if (this.getPwdCryptMode() == 1)
			password = DigestUtils.md5DigestAsHex(password.getBytes());
		else if (this.getPwdCryptMode() == 2)
			password = DigestUtils.md5DigestAsHex(String.format("%1$s||%2$s", username, password).getBytes());
		else if (this.getPwdCryptMode() == 3 && password.length() != 64)
			password = SM3Utils.encrypt(password).toUpperCase();

		// 校验密码是否正确
		boolean bMatchPwd = false;
		if(StringUtils.hasLength(password)) {
			bMatchPwd = password.equals(user.getPassword());
		}
		
		// 启用账户锁，记录登陆失败次数
		// if (Boolean.parseBoolean(accountLock)) {
		// sysAuthLockService.calcAccountLock(authuserdetail, bMatchPwd);
		// }
		if (!bMatchPwd) {
			// throw new BadRequestAlertException("用户名密码错误", "IBZUSER",
			// username);
			throw new UsernameNotFoundException("用户名或密码错误");
		}
		// 校验密码是否过期
		// if(!StringUtils.isEmpty(pwdExpiredDate) &&
		// IsExpiredPwd(authenticationUser.getPwdchgtime())){
		// authenticationUser.setAccountNonExpired(false);
		// }
		
		AuthenticationUser authenticationUser = this.getAuthenticationUser(user);
		
		return authenticationUser;
	}

//	/**
//	 * 获取用户信息
//	 *
//	 * @param sysUser
//	 * @param orgId
//	 * @return
//	 */
//	protected AuthenticationUser createAuthenticationUser(SysUserDTO sysUserDTO, String orgId) throws Throwable {
//
//		/*
//		 * 
//		 * SysEmployee emp = new SysEmployee(); SysEmployeeSearchContext ctx =
//		 * new SysEmployeeSearchContext(); ctx.setN_orgid_eq(orgId);
//		 * ctx.setN_uaauserid_eq(sysUser.getUserid()); List<SysEmployee> emps =
//		 * iibzEmployeeService.searchIgnoreCenter(ctx).getContent(); if
//		 * (emps.size() == 0) { // 接口管理员仿真emp if (sysUser.getApiuser() != null
//		 * && sysUser.getApiuser() == 1) {
//		 * 
//		 * CachedBeanCopier.copy(sysUser, emp); ServletRequestAttributes
//		 * requestAttributes = (ServletRequestAttributes)
//		 * RequestContextHolder.getRequestAttributes(); if (requestAttributes !=
//		 * null) { String srfpsersonid =
//		 * requestAttributes.getRequest().getHeader("personid");
//		 * SysEmployeeSearchContext replaceCtx = new SysEmployeeSearchContext();
//		 * replaceCtx.setN_userid_eq(srfpsersonid); List<SysEmployee>
//		 * replaceEmps =
//		 * iibzEmployeeService.searchIgnoreCenter(replaceCtx).getContent(); emp
//		 * = replaceEmps.get(0); emp.setSuperuser(1);
//		 * emp.setReserver("apiuser"); } } else { throw new
//		 * UsernameNotFoundException(String.format("无效的组织[%s]用户[%s]", orgId,
//		 * sysUser.getUsername())); } } else { emp = emps.get(0); }
//		 */
//
//		SysEmployeeDTO sysEmployeeDTO = null;
//		SearchContextDTO searchContextDTO = new SearchContextDTO();
//		searchContextDTO.eq("orgid", orgId).eq("uaauserid", sysUserDTO.getUserId()).setPageable(1, 1, 0);
//		List<SysEmployeeDTO> sysEmployeeDTOList = EBSXSystemRuntime.getInstance().getSysEmployeeService().selectIgnoreCenter(searchContextDTO);
//		if (ObjectUtils.isEmpty(sysEmployeeDTOList)) {
//			if (sysUserDTO.getApiUser() != null && sysUserDTO.getApiUser() == 1) {
//				sysEmployeeDTO = new SysEmployeeDTO();
//				sysUserDTO.copyTo(sysEmployeeDTO);
//				// CachedBeanCopier.copy(sysUser, emp);
//				ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//				if (requestAttributes != null) {
//					String srfpsersonid = requestAttributes.getRequest().getHeader("personid");
//					if (StringUtils.hasLength(srfpsersonid)) {
//
//						SearchContextDTO replaceCtx = new SearchContextDTO();
//						replaceCtx.eq("userid", srfpsersonid);
//						sysEmployeeDTOList = EBSXSystemRuntime.getInstance().getSysEmployeeService().selectIgnoreCenter(searchContextDTO);
//						if (ObjectUtils.isEmpty(sysEmployeeDTOList)) {
//							throw new UsernameNotFoundException(String.format("无效的用户标识[%1$s]", srfpsersonid));
//						}
//
//						// List<SysEmployee> replaceEmps =
//						// iibzEmployeeService.searchIgnoreCenter(replaceCtx).getContent();
//						// emp = replaceEmps.get(0);
//						// emp.setSuperuser(1);
//						// emp.setReserver("apiuser");
//
//						sysEmployeeDTO = sysEmployeeDTOList.get(0);
//						sysEmployeeDTO.setSuperUser(1);
//						sysEmployeeDTO.setReserver("apiuser");
//
//					}
//
//				}
//			} else {
//				throw new UsernameNotFoundException(String.format("无效的组织[%s]用户[%s]", orgId, sysUserDTO.getUserName()));
//			}
//		} else {
//			sysEmployeeDTO = sysEmployeeDTOList.get(0);
//		}
//
//		// //将emp信息存入user
//		// AuthenticationUser user = emp2AuthUserMapping.toDto(emp);
//		// user.setUserid(sysUser.getUserid());
//		// user.setPassword(sysUser.getPassword());
//		// user.setPersonid(emp.getUserid());
//		// user.setPersonname(emp.getPersonname());
//		// user.setSuperuser(emp.getSuperuser() == null ? 0 :
//		// emp.getSuperuser());
//		// if (user.getSuperuser() == 1)
//		// user.setAuthorities(AuthorityUtils.createAuthorityList("ROLE_SUPERADMIN"));
//		// user.setState(emp.getState());
//		// UsernamePasswordAuthenticationToken authentication = new
//		// UsernamePasswordAuthenticationToken(user, null,
//		// user.getAuthorities());
//		// SecurityContextHolder.getContext().setAuthentication(authentication);
//		//
//		// if (!ObjectUtils.isEmpty(user.getOrgid()))
//		// orgId = user.getOrgid();
//		// String deptId = "nulldeptid";
//		// if (!ObjectUtils.isEmpty(user.getMdeptid()))
//		// deptId = user.getMdeptid();
//		// Map<String, Set<String>> orgInfo = this.getMaps(orgId, deptId);
//		// user.setOrgInfo(orgInfo == null ? new HashMap<>() : orgInfo);
//		// return user;
//
//		AuthenticationUser user = getAuthenticationUser(sysEmployeeDTO);
//		user.setUserid(sysUserDTO.getUserId());
//		user.setPassword(sysUserDTO.getPassword());
//		user.setPersonid(sysUserDTO.getUserId());
//		user.setPersonname(sysUserDTO.getPersonName());
//		user.setSuperuser((sysEmployeeDTO.getSuperUser() == null) ? false : (sysEmployeeDTO.getSuperUser() == 1));
//		if (user.isSuperuser())
//			user.setAuthorities(AuthorityUtils.createAuthorityList("ROLE_SUPERADMIN"));
//		user.setState(sysEmployeeDTO.getState());
//		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
//		SecurityContextHolder.getContext().setAuthentication(authentication);
//
//		// if (!ObjectUtils.isEmpty(user.getOrgid()))
//		// orgId = user.getOrgid();
//		// String deptId = "nulldeptid";
//		// if (!ObjectUtils.isEmpty(user.getMdeptid()))
//		// deptId = user.getMdeptid();
//		// Map<String, Set<String>> orgInfo = this.getMaps(orgId, deptId);
//		// user.setOrgInfo(orgInfo == null ? new HashMap<>() : orgInfo);
//		return user;
//	}
	
	@Override
	protected boolean onChangePassword(IAuthenticationUser iAuthenticationUser, String oldpassword, String newpassword, boolean bTryMode) throws Throwable {
		
		this.getCloudSaaSUtilRuntime().changePassword(iAuthenticationUser.getUserid(), oldpassword, newpassword);
		
		return true;
	}
	
//	protected AuthenticationUser getAuthenticationUser(User user) {
//		AuthenticationUser authenticationUser = new AuthenticationUser();
//		EntityUtils.copyTo(user, authenticationUser);
//		authenticationUser.setPassword(null);
//		return authenticationUser;
//	}
	@Override
	public String getName() {
		return ICloudAuthUtilRuntime.AUTHAGENT_DEFAULT;
	}
}
