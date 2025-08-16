package net.ibizsys.runtime.util.script;

import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IWebContext;

public class ScriptWebContext implements IScriptWebContext {

	public ScriptWebContext() {
		
	}
	
	@Override
	public String parameter(String name) {
		return getWebContext().getParameter(name); 
	}

	@Override
	public Object parameter(String name, boolean arrayMode) {
		if(arrayMode) {
			return DataTypeUtils.toArray(this.getWebContext().getParameterValues(name));
		}
		return parameter(name);
	}

	@Override
	public String[] getParameters() {
		return DataTypeUtils.toArray(this.getWebContext().getParameterNames());
	}

	@Override
	public String header(String name) {
		return getWebContext().getHeader(name); 
	}

	@Override
	public Object header(String name, boolean arrayMode) {
		if(arrayMode) {
			return DataTypeUtils.toArray(this.getWebContext().getHeaderValues(name));
		}
		return header(name);
	}

	@Override
	public String[] getHeaders() {
		return DataTypeUtils.toArray(this.getWebContext().getHeaderNames());
	}

	protected IWebContext getWebContext() {
		return ActionSessionManager.getUserContextMust().getWebContextMust();
	}
	
	
}
