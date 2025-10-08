package cn.ibizlab.central.cloud.uaa.odoo.addin;

import net.ibizsys.central.cloud.uaa.core.addin.AuthProviderBase;
import net.ibizsys.central.cloud.uaa.core.addin.IAuthAgent;

public class OdooAuthProvider extends AuthProviderBase{

	@Override
	public IAuthAgent createAuthAgent(String strConfig) {
		return new OdooAuthAgent();
	}

}
