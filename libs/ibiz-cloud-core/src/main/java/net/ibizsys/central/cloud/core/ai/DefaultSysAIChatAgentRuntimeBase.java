package net.ibizsys.central.cloud.core.ai;

import java.io.File;

public abstract class DefaultSysAIChatAgentRuntimeBase extends SysAIChatAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DefaultSysAIChatAgentRuntimeBase.class);
	
	protected String getHistoriesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "history").toLowerCase();
	}
	
	@Override
	protected String getSystemMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "system").toLowerCase();
	}
	
	@Override
	protected String getSuggestionMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "suggestion").toLowerCase();
	}
	
	protected String getToolsConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.json.tpl", File.separator, this.getAgentMode(), "tools").toLowerCase();
	}
	
}
