package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import javax.annotation.Priority;
import javax.servlet.http.HttpServletRequest;

import net.ibizsys.central.ISystemGateway;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.uaa.core.addin.RTAuthAgent;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthInfo;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.PasswordPolicyException;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.EmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.EmployeeServiceImpl;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.*;

@Priority(100)
@Service
public class EmployeeServiceImplEx extends EmployeeServiceImpl {




	@Autowired(
			required = false
	)
	ISystemGateway systemGateway;


	private IWebClient iWebClient = null;
	protected IWebClient getWebClient() throws Exception {
		if (this.iWebClient == null  ) {
			iWebClient = this.getSystemRuntime().createWebClient(RTAuthAgent.RT_SERVICE);
			iWebClient.init(this.getSystemRuntime(), RTAuthAgent.RT_SERVICE, null);
		}
		return this.iWebClient;
	}



	@Override
	public void create(EmployeeDTO dto) throws Throwable {

		boolean superuser = dto.getSuperUser()!=null && dto.getSuperUser() == 1;
		AuthInfo person = new AuthInfo();
		String id = dto.getUserId();
		if (ObjectUtils.isEmpty(id))
			id = dto.getUAAUserId();
		if (ObjectUtils.isEmpty(id))
			id = dto.getLoginName();
		person.setId(id);
		person.setDisplayName(dto.getPersonName());
		person.setOrganizationId(dto.getOrgId());
		person.setMdepartmentId(dto.getMDeptId());
		person.setUid(dto.getLoginName());
		person.setEmployeeNumber(dto.getUserCode()==null? id : dto.getUserCode());
		person.setMobile(dto.getPhone());
		person.setIdentificationNumber(dto.getCertCode());
		if(StringUtils.hasLength(dto.getFromOpenUserTag()))
			person.setIdentificationNumber(dto.getFromOpenUserTag());
		person.setMail(dto.getEmail());
		person.setPostalAddress(dto.getAddr());
		Map header = new HashMap();
		header.put("Authorization", "Bearer " + AuthenticationUser.getCurrentMust().getToken());



		IWebClientRep<AuthInfo> rep = getWebClient().post("/sys_people", null, header, null, person, null, AuthInfo.class, null);
		if (rep != null && rep.getBody() != null) {
			AuthInfo ret = rep.getBody();
			if (StringUtils.hasLength(ret.getId())) {
				dto.setUserId(ret.getId());
				get(dto,true);
			}
		}

		if(superuser){
			Map<String,Object> roleMember = new HashMap<>();
			roleMember.put("member_uid",dto.getUserId());
			roleMember.put("role_id","ROLE_SUPERADMIN");
			roleMember.put("member_type","inetOrgPerson");
			roleMember.put("member_name",dto.getPersonName());
			roleMember.put("member_dn",dto.getPersonName());
			roleMember.put("organization_id",dto.getOrgId());
			try {
				getWebClient().post("/sys_role_members", null, header, null, roleMember, null, String.class, null);
			}catch (Exception ex) {}


		}

	}

	@Override
	public void update(EmployeeDTO dto) throws Throwable {

		AuthInfo person = new AuthInfo();
		String id = dto.getUserId();
		person.setId(id);
		person.setDisplayName(dto.getPersonName());
		person.setOrganizationId(dto.getOrgId());
		person.setUid(dto.getLoginName());
		person.setEmployeeNumber(dto.getUserCode()==null? id : dto.getUserCode());
		person.setMobile(dto.getPhone());
		person.setMdepartmentId(dto.getMDeptId());
		person.setIdentificationNumber(dto.getCertCode());
		if(StringUtils.hasLength(dto.getFromOpenUserTag()))
			person.setIdentificationNumber(dto.getFromOpenUserTag());
		person.setMail(dto.getEmail());
		person.setPostalAddress(dto.getAddr());
		Map header = new HashMap();
		header.put("Authorization", "Bearer " + AuthenticationUser.getCurrentMust().getToken());



		IWebClientRep<AuthInfo> rep = getWebClient().put(String.format("/sys_people/%1$s",dto.getUserId()), null, header, null, person, null, AuthInfo.class, null);
		if (rep != null && rep.getBody() != null) {
			AuthInfo ret = rep.getBody();
			if (StringUtils.hasLength(ret.getId())) {
				dto.setUserId(ret.getId());
				get(dto,true);
			}
		}
	}

	@Override
	protected void onInitPwd(EmployeeDTO dto) throws Throwable {
		AuthInfo person = new AuthInfo();
		String id = dto.getUserId();
		person.setId(id);
		Map header = new HashMap();
		header.put("Authorization", "Bearer " + AuthenticationUser.getCurrentMust().getToken());
		IWebClientRep<AuthInfo> rep = getWebClient().post(String.format("/sys_people/%1$s/resetpassword",dto.getUserId()), null, header, null, person, null, AuthInfo.class, null);
		if (rep != null && rep.getBody() != null) {
			AuthInfo ret = rep.getBody();
			if (StringUtils.hasLength(ret.getId())) {
				dto.setUserId(ret.getId());
				get(dto,true);
			}
		}
	}

	@Override
	protected void onChangePwd(EmployeeDTO dto) throws Throwable {
		String oldpassword = dto.getString("oldpassword", (String)null);
		if (!StringUtils.hasLength(oldpassword)) {
			throw new PasswordPolicyException("未指定旧密码");
		} else {
			String newpassword = dto.getPassword();

			Map<String, String> params = new LinkedHashMap<String, String>();
			params.put("password", oldpassword);
			params.put("new_password", newpassword);

			Map header = new HashMap();


			//补充header参数转发给uaa
			if (RequestContextHolder.getRequestAttributes() != null) {
				HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
				if (request != null) {
					Enumeration<String> headerNames = request.getHeaderNames();
					List<String> forwardHeaders = Arrays.asList("captcha-state|state,captcha-code|code,state|state".split(","));
					while (headerNames.hasMoreElements()) {
						String name = headerNames.nextElement();
						for (String forwardHeader : forwardHeaders) {
							String[] forwardParams = forwardHeader.split("\\|");
							if(forwardParams[0].equalsIgnoreCase(name)){
								params.put(forwardParams[forwardParams.length-1], request.getHeader(name));
							}
						}
					}


					String strToken = request.getHeader("Authorization");
					if(StringUtils.hasLength(strToken) && (!strToken.equalsIgnoreCase("Bearer null"))) {
						header.put("Authorization", strToken);
						try {
							getWebClient().post(RTAuthAgent.RT_CHANGE_PWD_PATH, null, header, null, params, null, String.class, null);
						}
						catch (Throwable ex) {
							throw new PasswordPolicyException(ex.getMessage());
						}
					}

				}
			}



		}
	}

	@Override
	public void remove(List<String> keys) throws Throwable {
		Map header = new HashMap();
		header.put("Authorization", "Bearer " + AuthenticationUser.getCurrentMust().getToken());
		keys.forEach(key -> {
            try {
               getWebClient().delete(String.format("/sys_people/%1$s",key), null, header);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }

        });

	}

	@Override
	protected void onBeforeCreate(EmployeeDTO dto) throws Throwable {
//		this.syncUser(dto, true);
		
		
		super.onBeforeCreate(dto);
	}
	
	
	@Override
	protected void onBeforeUpdate(EmployeeDTO dto) throws Throwable {
//		this.syncUser(dto, false);
		super.onBeforeUpdate(dto);
	}




}

