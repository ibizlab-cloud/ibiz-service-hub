package net.ibizsys.central.service;

import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput;
import net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn;

public class SubSysSADEMethodRTScriptContext implements ISubSysSADEMethodRTScriptContext {

	private ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = null;
	private IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod = null;
	public SubSysSADEMethodRTScriptContext(ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		this.iSubSysServiceAPIDERuntime = iSubSysServiceAPIDERuntime;
		this.iPSSubSysServiceAPIDEMethod = iPSSubSysServiceAPIDEMethod;
	}
	
	protected ISubSysServiceAPIDERuntime getSubSysServiceAPIDERuntime() {
		return this.iSubSysServiceAPIDERuntime;
	}
	
	
	
	protected IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod() {
		return this.iPSSubSysServiceAPIDEMethod;
	}
	
	
	@Override
	public String getDename() {
		return getSubSysServiceAPIDERuntime().getName();
	}

	@Override
	public String getPath() {
		return getPSSubSysServiceAPIDEMethod().getRequestPath();
	}

	@Override
	public String getMethod() {
		return getPSSubSysServiceAPIDEMethod().getRequestMethod();
	}

	@Override
	public String getType() {
		return getPSSubSysServiceAPIDEMethod().getMethodType();
	}

	@Override
	public String getCodename() {
		return getPSSubSysServiceAPIDEMethod().getCodeName();
	}

	@Override
	public String getTag() {
		return getPSSubSysServiceAPIDEMethod().getMethodTag();
	}

	@Override
	public String getTag2() {
		return getPSSubSysServiceAPIDEMethod().getMethodTag2();
	}
	
	@Override
	public String getContenttype() {
		return getPSSubSysServiceAPIDEMethod().getBodyContentType();
	}

	@Override
	public IPSSubSysServiceAPIMethodInput getInput() {
		return getPSSubSysServiceAPIDEMethod().getPSSubSysServiceAPIMethodInput();
	}

	@Override
	public IPSSubSysServiceAPIMethodReturn getReturn() {
		return getPSSubSysServiceAPIDEMethod().getPSSubSysServiceAPIMethodReturn();
	}

	
	
}
