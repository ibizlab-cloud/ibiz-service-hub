package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.ai.IAIChatMemoryUtil;

public interface ISysChatMemoryUtilRuntime extends ISysUtilRuntime {

	public final static String MODE_DEFAULT = "DEFAULT";
	
	
	default IAIChatMemoryUtil getAIChatMemoryUtil() {
		return getAIChatMemoryUtil(MODE_DEFAULT);
	}
	
	IAIChatMemoryUtil getAIChatMemoryUtil(String mode);
}
