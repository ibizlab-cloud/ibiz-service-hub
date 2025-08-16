package net.ibizsys.central;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ActionSessionManager;


public abstract class SystemPersistentAdapterBase implements ISystemPersistentAdapter{

	private static final Log log = LogFactory.getLog(SystemPersistentAdapterBase.class);
	
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
	
	
	/**
	 * 获取当前用户上下文
	 * @return
	 */
	protected IUserContext getUserContext() {
		return ActionSessionManager.getUserContextMust();
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}
	
	


}
