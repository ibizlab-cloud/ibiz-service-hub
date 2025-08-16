package net.ibizsys.central.cloud.uaa.core.addin;

public class DefaultAuthProvider extends AuthProviderBase{

	@Override
	public IAuthAgent createAuthAgent(String strConfig) {
		return new DefaultAuthAgent();
	}

}
