package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.ai.IAIChatSkillUtil;

public interface ISysChatSkillUtilRuntime extends ISysUtilRuntime {

	public final static String MODE_DEFAULT = "DEFAULT";
	
	
	default IAIChatSkillUtil getAIChatSkillUtil() {
		return getAIChatSkillUtil(MODE_DEFAULT);
	}
	
	IAIChatSkillUtil getAIChatSkillUtil(String mode);
}
