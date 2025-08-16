package net.ibizsys.central.cloud.uaa.core.addin;

/**
 * RT AuthProvider
 *
 * @author xignzi
 * @date 2023/12/4
 */
public class RTAuthProvider extends AuthProviderBase{

	@Override
	public IAuthAgent createAuthAgent(String strConfig) {
		return new RTAuthAgent();
	}

}
