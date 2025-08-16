package net.ibizsys.runtime.util.script;

import net.ibizsys.runtime.util.ActionSessionManager;

public class ScriptAppContext implements IScriptAppContext {

	@Override
	public IScriptAppContext set(String strName, String strValue) {
		ActionSessionManager.getAppContextMust().set(strName, strValue);
		return this;
	}

	@Override
	public String get(String strName) {
		Object objValue = ActionSessionManager.getAppContextMust().get(strName);
		if(objValue == null) {
			return null;
		}
		return objValue.toString();
	}

}
