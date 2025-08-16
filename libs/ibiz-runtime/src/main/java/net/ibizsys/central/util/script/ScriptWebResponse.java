package net.ibizsys.central.util.script;

import java.util.Arrays;

import org.springframework.util.Assert;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.util.IWebResponse;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.script.ScriptUtils;

public class ScriptWebResponse implements IScriptWebResponse {

	private IWebResponse iWebResponse = null;
	private ISystemRuntime iSystemRuntime = null;
	public ScriptWebResponse(ISystemRuntime iSystemRuntime, IWebResponse iWebResponse) {
		Assert.notNull(iSystemRuntime, "未传入系统运行时对象");
		Assert.notNull(iWebResponse, "未传入Web反馈对象");
		this.iSystemRuntime = iSystemRuntime;
		this.iWebResponse = iWebResponse;
	}
	
	@Override
	public Object getBody() {
		return this.getWebResponse().getBody();
	}

	@Override
	public void setBody(Object body) {
		this.getWebResponse().setBody(ScriptUtils.getReal(body));
	}

	@Override
	public IScriptWebResponse body(Object body) {
		this.getWebResponse().setBody(ScriptUtils.getReal(body));
		return this;
	}

	@Override
	public int getCode() {
		return this.getWebResponse().getStatusCode();
	}

	@Override
	public void setCode(int code) {
		this.getWebResponse().setStatusCode(code);
	}

	@Override
	public IScriptWebResponse code(int code) {
		this.getWebResponse().setStatusCode(code);
		return this;
	}

	@Override
	public String getType() {
		return this.getWebResponse().getContentType();
	}

	@Override
	public void setType(String type) {
		this.getWebResponse().setContentType(type);
	}

	@Override
	public IScriptWebResponse type(String type) {
		this.getWebResponse().setContentType(type);
		return this;
	}

	@Override
	public IScriptWebResponse set(String name, String value) {
		this.getWebResponse().setHeader(name, value);
		return this;
	}

	@Override
	public IScriptWebResponse add(String name, String value) {
		this.getWebResponse().addHeader(name, value);
		return this;
	}

	@Override
	public IScriptWebResponse set(String name, String[] value) {
		this.getWebResponse().setHeaderValues(name, Arrays.asList(value));
		return this;
	}

	@Override
	public IScriptWebResponse add(String name, String[] value) {
		this.getWebResponse().addHeaderValues(name, Arrays.asList(value));
		return this;
	}
	
	@Override
	public IScriptWebResponse reset(String name) {
		this.getWebResponse().resetHeader(name);
		return this;
	}

	@Override
	public String get(String name) {
		return this.getWebResponse().getHeader(name);
	}

	@Override
	public Object get(String name, boolean arrayMode) {
		if(arrayMode) {
			return this.getWebResponse().getHeaderValues(name);
		}
		return get(name);
	}
	
	@Override
	public String[] getNames() {
		return DataTypeUtils.toArray(this.getWebResponse().getHeaderNames());
	}

	@Override
	public Object getReal() {
		return getWebResponse();
	}
	
	public IWebResponse getWebResponse() {
		return this.iWebResponse;
	}
	
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}
	
	
}
