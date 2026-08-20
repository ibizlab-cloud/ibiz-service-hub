package net.ibizsys.central.cloud.kb.core.util.jackrabbit;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import javax.jcr.Credentials;
import javax.jcr.LoginException;
import javax.jcr.SimpleCredentials;
import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;

import org.apache.jackrabbit.core.security.principal.PrincipalImpl;
import org.apache.jackrabbit.core.security.simple.SimpleLoginModule;

public class KBDavLoginModule extends SimpleLoginModule {

	private Subject subject; // 用于保存 Subject 引用

	/**
	 * 重写 initialize 方法，保存 Subject 引用
	 */
	@Override
	public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {
		// 调用父类方法完成基础初始化
		super.initialize(subject, callbackHandler, sharedState, options);
		// 保存 Subject 引用供后续使用
		this.subject = subject;
	}

	/**
	 * 认证方法
	 */
	@Override
	protected boolean authenticate(Principal principal, Credentials credentials) throws LoginException {
		if(credentials instanceof KBDavAdminCredentials) {
			return true;
		}
		
		if (!(credentials instanceof SimpleCredentials)) {
			return false;
		}

		SimpleCredentials simpleCreds = (SimpleCredentials) credentials;
		String userId = simpleCreds.getUserID();
		char[] password = simpleCreds.getPassword();

		// 在这里查询你的数据库验证用户名密码
		boolean isValid = checkPasswordInDatabase(userId, new String(password));

		if (isValid) {
			// 认证成功：创建 Principal
			Set<Principal> principals = Collections.singleton(new PrincipalImpl(userId));

			// 关键：将 Principal 添加到保存的 Subject 中
			this.subject.getPrincipals().addAll(principals);

			return true;
		} else {
			throw new LoginException("用户名或密码错误");
		}
	}

	// 模拟数据库密码校验
	private boolean checkPasswordInDatabase(String username, String password) {
		return "admin".equals(username) && "admin".equals(password);
	}

}
