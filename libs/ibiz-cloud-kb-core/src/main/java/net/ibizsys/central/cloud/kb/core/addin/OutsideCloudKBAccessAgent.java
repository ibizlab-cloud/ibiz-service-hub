package net.ibizsys.central.cloud.kb.core.addin;

import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;

public class OutsideCloudKBAccessAgent extends CloudKBAccessAgent {

	@Override
	public String getName() {
		return ICloudKBUtilRuntime.KBPLATFORM_OUTSIDE_CLOUD;
	}
	
	@Override
	protected boolean isOutsideCloudMode() {
		return true;
	}
}
