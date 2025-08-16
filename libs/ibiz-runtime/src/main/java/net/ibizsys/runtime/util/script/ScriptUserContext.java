package net.ibizsys.runtime.util.script;

import net.ibizsys.runtime.util.ActionSessionManager;

public class ScriptUserContext implements IScriptUserContext{

	@Override
	public String getUserid() {
		return ActionSessionManager.getUserContextMust().getUserid();
	}

	@Override
	public String getUsername() {
		return ActionSessionManager.getUserContextMust().getUsername();
	}

	@Override
	public String getOrgid() {
		return ActionSessionManager.getUserContextMust().getOrgid();
	}

	@Override
	public String getOrgname() {
		return ActionSessionManager.getUserContextMust().getOrgname();
	}

	@Override
	public String getDeptid() {
		return ActionSessionManager.getUserContextMust().getDeptid();
	}

	@Override
	public String getDeptname() {
		return ActionSessionManager.getUserContextMust().getDeptname();
	}

	@Override
	public String getRemoteaddress() {
		return ActionSessionManager.getUserContextMust().getRemoteaddress();
	}

	@Override
	public Object session(String strKey) {
		return ActionSessionManager.getUserContextMust().getSessionParam(strKey);
	}

}
