package cn.ibizlab.central.cloud.open.odoo.addin;

import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.open.core.addin.IOpenAccessAgent;
import net.ibizsys.central.cloud.open.core.addin.OpenPlatformBase;

public class OdooOpenPlatform extends OpenPlatformBase {

	@Override
	public IOpenAccessAgent createOpenAccessAgent(OpenAccess openAccess) {
		return new OdooOpenAccessAgent();
	}

}
