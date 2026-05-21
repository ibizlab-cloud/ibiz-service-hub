package net.ibizsys.central.cloud.oss.core.addin;

public class AIImageVLOnlyOSSTextProvider extends AIImageOSSTextProviderBase {

	@Override
	protected boolean isEnableOcrAgent() {
		return false;
	}
}
