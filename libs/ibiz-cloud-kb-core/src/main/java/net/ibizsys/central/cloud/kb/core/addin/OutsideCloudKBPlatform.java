package net.ibizsys.central.cloud.kb.core.addin;

import net.ibizsys.central.cloud.core.util.domain.KBAccess;

public class OutsideCloudKBPlatform extends KBPlatformBase {

	@Override
	public IKBAccessAgent createKBAccessAgent(KBAccess kbAccess) {
		return this.getSystemRuntime().createObject(IKBAccessAgent.class, OutsideCloudKBAccessAgent.class);
	}

}
