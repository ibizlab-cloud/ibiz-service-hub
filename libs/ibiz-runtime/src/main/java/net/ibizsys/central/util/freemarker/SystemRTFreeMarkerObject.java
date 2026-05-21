package net.ibizsys.central.util.freemarker;

import org.springframework.util.Assert;

import net.ibizsys.central.util.script.ISystemRTScriptContext;
import net.ibizsys.runtime.util.script.IScriptUserContext;

public class SystemRTFreeMarkerObject implements ISystemRTFreeMarkerObject {

	private final ISystemRTScriptContext iSystemRTScriptContext;
	
	public SystemRTFreeMarkerObject(ISystemRTScriptContext iSystemRTScriptContext) {
		this.iSystemRTScriptContext = iSystemRTScriptContext;
		Assert.notNull(this.iSystemRTScriptContext, "传入系统运行时脚本上下文对象无效");
	}
	
	
	
	
	@Override
	public IScriptUserContext getUser() {
		return this.iSystemRTScriptContext.user();
	}

}
