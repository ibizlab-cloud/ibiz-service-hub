package net.ibizsys.central.cloud.core.security;

import org.springframework.security.core.AuthenticationException;

public class PasswordPolicyException extends AuthenticationException {

	public PasswordPolicyException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
	public PasswordPolicyException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
