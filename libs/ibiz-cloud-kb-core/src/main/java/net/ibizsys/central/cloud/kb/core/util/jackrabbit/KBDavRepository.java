package net.ibizsys.central.cloud.kb.core.util.jackrabbit;

import javax.jcr.Credentials;
import javax.jcr.LoginException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.Value;

import org.apache.jackrabbit.commons.AbstractRepository;

public class KBDavRepository extends AbstractRepository {

	@Override
	public Session login(Credentials credentials, String workspaceName) throws LoginException, RepositoryException {
		// 1. 验证凭证（实际逻辑可以委托给专门的验证器）
		if (credentials instanceof SimpleCredentials) {
			String userId = ((SimpleCredentials) credentials).getUserID();
			// ... 验证用户名密码 ...

			// 2. 认证通过，创建并返回自定义 Session
			return new KBDavSession(this, userId);
		}
		throw new LoginException("Unsupported credentials");
	}

	@Override
	public String[] getDescriptorKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleValueDescriptor(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Value getDescriptorValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value[] getDescriptorValues(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescriptor(String key) {
		// TODO Auto-generated method stub
		return null;
	}
}
