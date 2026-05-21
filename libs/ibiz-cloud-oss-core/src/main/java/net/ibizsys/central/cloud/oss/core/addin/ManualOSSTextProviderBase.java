package net.ibizsys.central.cloud.oss.core.addin;

import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 操作手册贴图OSS文本提供器对象基类
 * 
 * @author lionlau
 *
 */
public abstract class ManualOSSTextProviderBase extends AIImageOSSTextProviderBase {

	@Override
	protected String getDefaultPrompt() {
		return net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(ManualOSSTextProviderBase.class, "DefaultPrompt.md", false);
	}

	@Override
	protected String getPrompt() {
		return DataTypeUtils.asString(this.getAIImageParams().get("manualprompt"), getDefaultPrompt());
	}
	
	@Override
	protected boolean isEnableOcrAgent() {
		return false;
	}
}
