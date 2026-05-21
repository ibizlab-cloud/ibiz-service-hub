package net.ibizsys.central.cloud.oss.core.addin;

public class AIImageVLOCROSSTextProvider extends AIImageOSSTextProviderBase {

	@Override
	protected boolean isEnableOcrAgent() {
		return false;
	}
	
	@Override
	protected String getPrompt() {
		return super.getOcrPrompt();
	}
}
