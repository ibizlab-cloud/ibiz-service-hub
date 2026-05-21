package net.ibizsys.central.util.freemarker;

import net.ibizsys.runtime.util.script.IScriptUserContext;

public interface ISystemRTFreeMarkerObject {

	/**
	 * 获取当前用户对象
	 * @return
	 */
	IScriptUserContext getUser();
}
