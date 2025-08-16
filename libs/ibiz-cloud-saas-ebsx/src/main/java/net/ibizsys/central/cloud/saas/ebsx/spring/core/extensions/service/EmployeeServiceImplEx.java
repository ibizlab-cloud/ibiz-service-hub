package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import javax.annotation.Priority;

import net.ibizsys.runtime.util.KeyValueUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.security.PasswordPolicyException;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.DeptMemberDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.EmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.OrganizationDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDeptMemberService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.EmployeeServiceImpl;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserService;
import net.ibizsys.central.util.SearchContextDTO;

@Priority(100)
@Service
public class EmployeeServiceImplEx extends EmployeeServiceImpl { 


	@Override
	protected void onBeforeCreate(EmployeeDTO dto) throws Throwable {
		this.syncUser(dto, true);
		
		
		super.onBeforeCreate(dto);
	}
	
	
	@Override
	protected void onBeforeUpdate(EmployeeDTO dto) throws Throwable {
		this.syncUser(dto, false);
		super.onBeforeUpdate(dto);
	}
	
	
	protected void syncUser(EmployeeDTO dto, boolean bCreate) throws Throwable{
		
		dto.resetUAAUserId();
		
		String strLastUserName = "";
		String strLastUAAUserId = "";
		String strLastMDeptId = "";
		String strLastLoginName = "";

		String strUserName = "";
		String strLoginName = dto.getLoginName();
		String strOrgId = dto.getOrgId();
		String strPersonName = dto.getPersonName();
		
		if(StringUtils.hasLength(strLoginName)
				&& StringUtils.hasLength(strOrgId)) {
			OrganizationDTO orgDTO = this.getSystemRuntime().getOrganizationService().get(strOrgId, true);
			if(orgDTO == null) {
				throw new Exception(String.format("指定组织无效"));
			}
			strUserName = String.format("%1$s@%2$s", strLoginName, strOrgId);
		}
		
		if(bCreate) {
			if(!StringUtils.hasLength(strUserName)) {
				throw new Exception(String.format("未指定登录标识或所属组织"));
			}
			dto.setUserName(strUserName);
		}
		else {
			EmployeeDTO last = this.get(dto.getUserId());
			strLastUserName = last.getUserName();
			strLastUAAUserId = last.getUAAUserId();
			strLastLoginName = last.getLoginName();
			strLastMDeptId = last.getMDeptId();
			if(StringUtils.hasLength(strLastUAAUserId)) {
				if(!StringUtils.hasLength(strUserName)) {
//					if(StringUtils.hasLength(strLoginName)){
					if(StringUtils.hasLength(strOrgId)){
						strUserName = String.format("%1$s@%2$s", strLastLoginName, dto.getOrgId());
					}
				}
				if(StringUtils.hasLength(strUserName)) {
					if(strUserName.equalsIgnoreCase(strLastUserName)) {
						strUserName = null;
					}
				}
			}
			if(StringUtils.hasLength(strLastMDeptId)) {
				if(dto.containsMDeptId()) {
					if(strLastMDeptId.equals(dto.getMDeptId())) {
						strLastMDeptId = null;
					}
				}
				else {
					strLastMDeptId = null;
				}
			}
		}
		
		if(StringUtils.hasLength(strUserName)) {
			//检索全局是否存在
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.eq(IUserService.FIELD_LOGINNAME, strLoginName);
			searchContextDTO.eq(IUserService.FIELD_DOMAINS, strOrgId);
			UserDTO userDTO = this.getSystemRuntime().getUserService().selectOne(searchContextDTO, true);
			if(userDTO != null) {
				throw new Exception(String.format("指定登录标识已经存在"));
			}
			
			//建立登录用户
			userDTO = new UserDTO();
			userDTO.setUserName(strUserName);
			userDTO.setLoginName(strLoginName);
			userDTO.setDomains(strOrgId);
			if(StringUtils.hasLength(strPersonName)) {
				userDTO.setPersonName(strPersonName);
			}
			
			
			String strPassword = dto.getPassword();
			if(StringUtils.hasLength(strPassword)
					&& !ISysUAAUtilRuntime.PASSWORD_HASH.equals(strPassword)) {
				//strPassword = this.getPasword(strLoginName, strPassword);
				userDTO.setPassword(strPassword);
			}
			
			//判断是否已经绑定登录用户
			if(StringUtils.hasLength(strLastUAAUserId)) {
				userDTO.setUserId(strLastUAAUserId);
				//不允许变更登陆名
				userDTO.resetLoginName();
				this.getSystemRuntime().getUserService().update(userDTO);
			}
			else {
				this.getSystemRuntime().getUserService().create(userDTO);
			}
			
			
			dto.setUserName(strUserName);
			dto.setUAAUserId(userDTO.getUserId());
		}
		else {
			//判断是否修改密码
			String strPassword = dto.getPassword();
			if(StringUtils.hasLength(strPassword)
					&& !ISysUAAUtilRuntime.PASSWORD_HASH.equals(strPassword)) {
				//strPassword = this.getPasword(strLoginName, strPassword);
				UserDTO userDTO = new UserDTO();
				userDTO.setUserId(strLastUAAUserId);
				userDTO.setPassword(strPassword);
				this.getSystemRuntime().getUserService().update(userDTO);
			}
		}

		if(StringUtils.hasLength(strLastMDeptId)) {
			//移除关系
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.eq(IDeptMemberService.FIELD_DEPTID, strLastMDeptId);
			searchContextDTO.eq(IDeptMemberService.FIELD_USERID, dto.getUserId());
			this.getSystemRuntime().getDeptMemberService().remove(searchContextDTO);
		}
		
		dto.setPassword(ISysUAAUtilRuntime.PASSWORD_HASH);
	}
	
	@Override
	protected void onBeforeRemove(String key) throws Throwable {
	
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.eq(IDeptMemberService.FIELD_USERID, key);
		this.getSystemRuntime().getDeptMemberService().remove(searchContextDTO);
		EmployeeDTO employeeDTO = this.get(key);
		String userId = employeeDTO.getUAAUserId();
		if(StringUtils.hasLength(userId)){
			//将原用户相关信息混淆
			UserDTO userDTO = this.getSystemRuntime().getUserService().get(userId);
			String confuseLoginName =  String.format("%1$s|%2$s",KeyValueUtils.genGuidEx(),userDTO.getLoginName());
			userDTO.setLoginName(confuseLoginName);
			String confuseUserName = String.format("%1$s@%2$s", confuseLoginName, userDTO.getOrgId());
			userDTO.setUserName(confuseUserName);
			this.getSystemRuntime().getUserService().update(userDTO);
		}
		super.onBeforeRemove(key);
	}
	
	@Override
	protected void onAfterCreate(EmployeeDTO dto) throws Throwable {
	
		if(StringUtils.hasLength(dto.getMDeptId())) {
			//查询数据，没有则新建
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.eq(IDeptMemberService.FIELD_DEPTID, dto.getMDeptId());
			searchContextDTO.eq(IDeptMemberService.FIELD_USERID, dto.getUserId());
			DeptMemberDTO deptMemberDTO = this.getSystemRuntime().getDeptMemberService().selectOne(searchContextDTO, true);
			if(deptMemberDTO == null) {
				deptMemberDTO = new DeptMemberDTO();
				deptMemberDTO.setDeptId(dto.getMDeptId());
				deptMemberDTO.setUserId(dto.getUserId());
				this.getSystemRuntime().getDeptMemberService().create(deptMemberDTO);
			}
		}
		
		super.onAfterCreate(dto);
	}
	
	@Override
	protected void onAfterUpdate(EmployeeDTO dto) throws Throwable {
		
		if(StringUtils.hasLength(dto.getMDeptId())) {
			//查询数据，没有则新建
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.eq(IDeptMemberService.FIELD_DEPTID, dto.getMDeptId());
			searchContextDTO.eq(IDeptMemberService.FIELD_USERID, dto.getUserId());
			DeptMemberDTO deptMemberDTO = this.getSystemRuntime().getDeptMemberService().selectOne(searchContextDTO, true);
			if(deptMemberDTO == null) {
				deptMemberDTO = new DeptMemberDTO();
				deptMemberDTO.setDeptId(dto.getMDeptId());
				deptMemberDTO.setUserId(dto.getUserId());
				this.getSystemRuntime().getDeptMemberService().create(deptMemberDTO);
			}
		}
		
		super.onAfterUpdate(dto);
	}
	
	@Override
	protected void onInitPwd(EmployeeDTO dto) throws Throwable {
		
		String strPassword = dto.getPassword();
		if(!StringUtils.hasLength(strPassword)) {
			strPassword = "123456";
		}
		
		EmployeeDTO last = this.get(dto.getUserId());
		if(!StringUtils.hasLength(last.getUAAUserId())) {
			throw new Exception("未绑定系统用户");
		}
		
		//strPassword = this.getPasword(last.getLoginName(), strPassword);
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(last.getUAAUserId());
		userDTO.setPassword(strPassword);
		this.getSystemRuntime().getUserService().initPwd(userDTO);
		
		
	}

	protected void onChangePwd(EmployeeDTO dto) throws Throwable {

		String strOldPassword = dto.getString("oldpassword", null);
		if (!StringUtils.hasLength(strOldPassword)) {
			throw new PasswordPolicyException("未指定旧密码");
		}

		String strPassword = dto.getPassword();
		if (!StringUtils.hasLength(strPassword)) {
			throw new PasswordPolicyException("未指定新密码");
		}

		if(strOldPassword.equals(strPassword)) {
			throw new PasswordPolicyException("新密码不能与旧密码一致");
		}
		EmployeeDTO last = this.get(dto.getUserId());

		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(last.getUAAUserId());
		userDTO.set("oldpassword",strOldPassword);
		userDTO.setPassword(strPassword);
		this.getSystemRuntime().getUserService().changePwd(userDTO);
	}
//	protected String getPasword(String username, String password) throws Throwable{
//		if (this.getPwdCryptMode() == 1)
//			return DigestUtils.md5DigestAsHex(password.getBytes());
//		else if (this.getPwdCryptMode() == 2)
//			return DigestUtils.md5DigestAsHex(String.format("%1$s||%2$s", username, password).getBytes());
//		else if (this.getPwdCryptMode() == 3 && password.length() != 64)
//			return SM3Utils.encrypt(password).toUpperCase();
//		throw new Exception(String.format("未识别的密码加密方式[%1$s]", this.getPwdCryptMode()));
//	}
//	
//	protected int getPwdCryptMode(){
//		return 3;
//	}
}

