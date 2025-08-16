package net.ibizsys.central.cloud.core.ai;

import java.io.File;

import org.springframework.util.ObjectUtils;

public abstract class DefaultSysAIWorkerAgentRuntimeBase extends SysAIWorkerAgentRuntimeBase {

	@Override
	protected String getHistoriesConfigId(String strMode) throws Throwable {
		if(ObjectUtils.isEmpty(strMode)
				|| "default".equalsIgnoreCase(strMode)) {
			return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "history").toLowerCase();
		}
		return String.format("template%1$s%2$s.%3$s.%4$s.xml.tpl", File.separator, this.getAgentMode(), strMode, "history").toLowerCase();
	}
	
	@Override
	protected String getSystemMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "system").toLowerCase();
	}
	
	@Override
	protected String getToolsConfigId(String strMode) throws Throwable {
		if(ObjectUtils.isEmpty(strMode)
				|| "default".equalsIgnoreCase(strMode)) {
			return String.format("template%1$s%2$s.%3$s.json.tpl", File.separator, this.getAgentMode(), "tools").toLowerCase();
		}
		return String.format("template%1$s%2$s.%3$s.%4$s.json.tpl", File.separator, this.getAgentMode(), strMode, "tools").toLowerCase();
	}
	
	
}
