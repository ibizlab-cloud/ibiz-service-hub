package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import java.sql.Timestamp;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.PasswordPolicyException;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.UserServiceImpl;
import net.ibizsys.central.cloud.uaa.core.util.SM3Utils;

@Priority(100)
@Service
public class UserServiceImplEx extends UserServiceImpl {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(UserServiceImplEx.class);
	
	public static int MAXPASSWORDLENGTH = 30;
	
	@Override
	protected void onPrepare() {
	
		super.onPrepare();
		
//		String strUserManagerObj = this.getDataEntityRuntime().getSetting().getParam("param.usermanager", "");
//		if(StringUtils.hasLength(strUserManagerObj)) {
//			//this.getSystemRuntime().getsyss
//		}
	}

	
	@Override
	protected void onBeforeCreate(UserDTO dto) throws Throwable {
		if(dto.containsPassword()) {
			dto.setPassword(this.getPassword(dto.getLoginName(), dto.getPassword()));
		}
		super.onBeforeCreate(dto);
	}

	@Override
	protected void onBeforeUpdate(UserDTO dto) throws Throwable {
		if(dto.containsPassword()) {
			dto.setPassword(this.getPassword(dto.getLoginName(), dto.getPassword()));
		}
		super.onBeforeUpdate(dto);
	}

	@Override
	protected void onInitPwd(UserDTO dto) throws Throwable {
		
		UserDTO last = this.get(dto.getUserId());
		
		String strPassword = dto.getPassword();
		if (!StringUtils.hasLength(strPassword)) {
			strPassword = "123456";
		}
		
		

		strPassword = this.getPassword(last.getLoginName(), strPassword);
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(dto.getUserId());
		userDTO.setPassword(strPassword);
		//设置密码修改时间
		userDTO.setPwdChgTime(new Timestamp(System.currentTimeMillis()));
		this.update(userDTO);
	}
	
	@Override
	protected void onChangePwd(UserDTO dto) throws Throwable {
		UserDTO last = this.get(dto.getUserId());
		
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
		
		strOldPassword  = this.getPassword(last.getLoginName(), strOldPassword);
		if(!last.getPassword().equals(strOldPassword)) {
			throw new PasswordPolicyException("旧密码不正确");
		}

		strPassword = this.getPassword(last.getLoginName(), strPassword);
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(dto.getUserId());
		userDTO.setPassword(strPassword);
		//设置密码修改时间
		userDTO.setPwdChgTime(new Timestamp(System.currentTimeMillis()));
		this.update(userDTO);
	}

	protected String getPassword(String loginname, String password) throws Throwable {
		
		if(StringUtils.hasLength(password)) {
			//长度大于最大密码长度按密文处理
			if(password.length() > MAXPASSWORDLENGTH) {
				return password;
			}
		}
		
		if (this.getPwdCryptMode() == 1)
			return DigestUtils.md5DigestAsHex(password.getBytes());
		else if (this.getPwdCryptMode() == 2)
			return DigestUtils.md5DigestAsHex(String.format("%1$s||%2$s", loginname, password).getBytes());
		else if (this.getPwdCryptMode() == 3 && password.length() != 64)
			return SM3Utils.encrypt(password).toUpperCase();
		throw new Exception(String.format("未识别的密码加密方式[%1$s]", this.getPwdCryptMode()));
	}

	protected int getPwdCryptMode() {
		return 3;
	}
}
