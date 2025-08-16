package net.ibizsys.central.service;

import java.util.Map;

import org.springframework.util.Assert;

import net.ibizsys.central.util.script.IScriptWebClient;
import net.ibizsys.central.util.script.ScriptWebClient;
import net.ibizsys.runtime.util.script.ScriptUtils;

public class SubSysServiceAPIRTScriptContext implements ISubSysServiceAPIRTScriptContext{

	
	private ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext = null;
	private IScriptWebClient iScriptWebClient = null;
	
	public SubSysServiceAPIRTScriptContext(ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext) {
		Assert.notNull(iSubSysServiceAPIRuntimeContext, "传入外部服务接口运行时上下文对象无效");
		this.setSubSysServiceAPIRuntimeContext(iSubSysServiceAPIRuntimeContext);

	}
	
	protected ISubSysServiceAPIRuntimeContext getSubSysServiceAPIRuntimeContext() {
		return this.iSubSysServiceAPIRuntimeContext;
	}
	
	protected void setSubSysServiceAPIRuntimeContext(ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext) {
		this.iSubSysServiceAPIRuntimeContext = iSubSysServiceAPIRuntimeContext;
	}
	
	protected ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		return this.getSubSysServiceAPIRuntimeContext().getSubSysServiceAPIRuntime();
	}
	

	@Override
	public String getName() {
		return getSubSysServiceAPIRuntime().getName();
	}
	
	@Override
	public String getTokenurl() {
		return getSubSysServiceAPIRuntime().getAccessTokenUrl();
	}

	@Override
	public String getClientid() {
		return getSubSysServiceAPIRuntime().getClientId();
	}

	@Override
	public String getClientsecret() {
		return getSubSysServiceAPIRuntime().getClientSecret();
	}

	@Override
	public String getAuthmode() {
		return getSubSysServiceAPIRuntime().getAuthMode();
	}

	@Override
	public String getAuthparam() {
		return getSubSysServiceAPIRuntime().getAuthParam();
	}

	@Override
	public String getAuthparam2() {
		return getSubSysServiceAPIRuntime().getAuthParam2();
	}

	@Override
	public ISubSysServiceAPIRTScriptContext header(Object objHeader) {
		Object objValue = ScriptUtils.getReal(objHeader);
		if(objValue instanceof Map) {
			this.getSubSysServiceAPIRuntime().setHeaders((Map)objValue);
		}
		else
			throw new SubSysServiceAPIRuntimeException(getSubSysServiceAPIRuntime(), String.format("无法识别的请求头数据"));
		return this;
	}

	
	@Override
	public ISubSysServiceAPIRTScriptContext tokentimeout(Object objTime) {
		return expirein(objTime);
	}
	
	@Override
	public ISubSysServiceAPIRTScriptContext expirein(Object objTime) {
		if(objTime != null) {
			Object objValue = ScriptUtils.getReal(objTime);
			if(objValue != null) {
				int nValue = Integer.parseInt(objValue.toString());
				if(nValue > 0) {
					this.getSubSysServiceAPIRuntime().setTokenTimeout(System.currentTimeMillis() + nValue * 1000);
				}
			}
		}
		
		//
		return this;
	}
	
	@Override
	public IScriptWebClient webclient() {
		if(this.iScriptWebClient == null) {
			this.iScriptWebClient = new ScriptWebClient(getSubSysServiceAPIRuntime().getSystemRuntime(), getSubSysServiceAPIRuntime(), getSubSysServiceAPIRuntime().getWebClient());
		}
		return this.iScriptWebClient;
	}

}
