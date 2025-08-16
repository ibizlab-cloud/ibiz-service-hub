package net.ibizsys.central.cloud.open.dingtalk.addin;

import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.open.core.addin.IOpenAccessAgent;
import net.ibizsys.central.cloud.open.core.addin.OpenPlatformBase;

public class DingTalkOpenPlatform extends OpenPlatformBase {

	@Override
	public IOpenAccessAgent createOpenAccessAgent(OpenAccess openAccess) {
		return new DingTalkOpenAccessAgent();
	}

}
