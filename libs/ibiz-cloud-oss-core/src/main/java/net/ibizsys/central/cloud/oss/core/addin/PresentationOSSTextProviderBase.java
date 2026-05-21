package net.ibizsys.central.cloud.oss.core.addin;

import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 幻灯片贴图OSS文本提供器对象基类
 * 
 * @author lionlau
 *
 */
public abstract class PresentationOSSTextProviderBase extends AIImageOSSTextProviderBase {

	@Override
	protected String getDefaultPrompt() {
		return "对`PPT截屏图片`生成一段简洁、客观的描述性文字，说明其内容、主题和功能。";
	}
	
	@Override
	protected String getPrompt() {
		return DataTypeUtils.asString(this.getAIImageParams().get("pptprompt"), getDefaultPrompt());
	}

	@Override
	protected boolean isEnableOcrAgent() {
		return false;
	}
}
