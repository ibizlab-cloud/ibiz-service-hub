package net.ibizsys.central.cloud.uaa.core.addin;

public class CasAuthProvider extends AuthProviderBase{

	@Override
	public IAuthAgent createAuthAgent(String strConfig) {
		return new CasAuthAgent();
	}

}
