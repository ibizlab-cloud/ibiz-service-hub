package net.ibizsys.central.service;

import java.util.Map;

import org.springframework.util.Assert;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.service.IPSSubSysServiceAPIMethod;
import net.ibizsys.runtime.ModelRuntimeBase;

/**
 * 外部服务接口方法运行时对象接口
 * 
 * @author lionlau
 *
 */
public abstract class SubSysServiceAPIMethodRuntimeBase extends ModelRuntimeBase implements ISubSysServiceAPIMethodRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SubSysServiceAPIMethodRuntimeBase.class);

	private ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext = null;
	private IPSSubSysServiceAPIMethod iPSSubSysServiceAPIMethod = null;
	private ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = null;

	@Override
	public void init(ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext, ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, IPSSubSysServiceAPIMethod iPSSubSysServiceAPIMethod) throws Exception {

		Assert.notNull(iSubSysServiceAPIRuntimeContext, "传入外部服务接口运行时上下文对象无效");
		Assert.notNull(iPSSubSysServiceAPIMethod, "传入外部服务接口实体模型对象无效");

		this.iSubSysServiceAPIRuntimeContext = iSubSysServiceAPIRuntimeContext;
		this.iPSSubSysServiceAPIMethod = iPSSubSysServiceAPIMethod;
		this.iSubSysServiceAPIDERuntime = iSubSysServiceAPIDERuntime;

		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	public IPSSubSysServiceAPIMethod getPSSubSysServiceAPIMethod() {
		return this.iPSSubSysServiceAPIMethod;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSubSysServiceAPIMethod();
	}

	protected ISubSysServiceAPIRuntimeContext getSubSysServiceAPIRuntimeContext() {
		return this.iSubSysServiceAPIRuntimeContext;
	}

	@Override
	public ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		return this.getSubSysServiceAPIRuntimeContext().getSubSysServiceAPIRuntime();
	}

	@Override
	public ISubSysServiceAPIDERuntime getSubSysServiceAPIDERuntime() {
		return this.iSubSysServiceAPIDERuntime;
	}

	protected ISystemRuntime getSystemRuntime() {
		return this.getSubSysServiceAPIRuntime().getSystemRuntime();
	}

	@Override
	public Object execute(Map<String, Object> context, Object[] args) throws Throwable {
		return this.onExecute(context, args);
	}
	
	protected  Object onExecute(Map<String, Object> context, Object[] args) throws Throwable {
		throw new Exception("没有实现");
	}

}
