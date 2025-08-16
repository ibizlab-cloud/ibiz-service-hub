package net.ibizsys.central;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;


public abstract class SystemLogAdapterBase implements ISystemLogAdapter{

	private static final Log log = LogFactory.getLog(SystemLogAdapterBase.class);
	
	private ISystemRuntimeContext iSystemRuntimeContext = null;

	
	public void init(ISystemRuntimeContext iSystemRuntimeContext) throws Exception{
		Assert.notNull(iSystemRuntimeContext,"传入系统运行时上下文无效");
		this.iSystemRuntimeContext = iSystemRuntimeContext;
		this.onInit();
	}
	
	protected void onInit()throws Exception{
		
	}
	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}
	


}
