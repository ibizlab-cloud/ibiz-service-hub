package net.ibizsys.central.cloud.uaa.core.addin;

public class LdapAuthProvider extends AuthProviderBase{

	@Override
	public IAuthAgent createAuthAgent(String strConfig) {
		return new LdapAuthAgent();
	}

}
