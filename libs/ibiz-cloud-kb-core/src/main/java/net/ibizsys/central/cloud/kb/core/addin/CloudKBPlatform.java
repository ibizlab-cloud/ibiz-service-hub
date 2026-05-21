package net.ibizsys.central.cloud.kb.core.addin;

import net.ibizsys.central.cloud.core.util.domain.KBAccess;
import net.ibizsys.central.cloud.kb.core.addin.IKBAccessAgent;
import net.ibizsys.central.cloud.kb.core.addin.KBPlatformBase;

public class CloudKBPlatform extends KBPlatformBase {

	@Override
	public IKBAccessAgent createKBAccessAgent(KBAccess kbAccess) {
		return this.getSystemRuntime().createObject(IKBAccessAgent.class, CloudKBAccessAgent.class);
	}

}
