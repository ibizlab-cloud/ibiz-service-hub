package net.ibizsys.central.cloud.uaa.core.addin;

public class HttpAuthProvider extends AuthProviderBase{

	@Override
	public IAuthAgent createAuthAgent(String strConfig) {
		return new HttpAuthAgent();
	}

}
