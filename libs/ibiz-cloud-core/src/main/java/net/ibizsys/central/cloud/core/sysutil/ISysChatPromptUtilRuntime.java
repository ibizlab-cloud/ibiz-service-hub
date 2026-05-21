package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.dataentity.util.IDEChatPromptUtil;

public interface ISysChatPromptUtilRuntime extends ISysUtilRuntime {

	public final static String MODE_DEFAULT = "DEFAULT";
	
	
	default IDEChatPromptUtil getDEChatPromptUtil() {
		return getDEChatPromptUtil(MODE_DEFAULT);
	}
	
	IDEChatPromptUtil getDEChatPromptUtil(String mode);
}
