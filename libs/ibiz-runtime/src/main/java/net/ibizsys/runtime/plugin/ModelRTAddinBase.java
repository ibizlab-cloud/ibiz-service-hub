package net.ibizsys.runtime.plugin;

import org.springframework.util.Assert;

import net.ibizsys.runtime.IModelRuntimeContext;

public abstract class ModelRTAddinBase implements IModelRTAddin {

	private IModelRuntimeContext ctx = null;
	private Object addinData = null;
	
	
	@Override
	public void init(IModelRuntimeContext ctx, Object addinData) throws Exception {
		Assert.notNull(ctx, "传入运行时上下文对象无效");
		this.ctx = ctx;
		this.addinData = addinData;
		this.prepareDefaultSetting();
		this.onInit();
	}

	protected void prepareDefaultSetting() throws Exception{
		this.onPrepareDefaultSetting();
	}
	
	protected void onPrepareDefaultSetting() throws Exception{
		
	}
	
	protected void onInit() throws Exception{
		
	}
	
	
	protected IModelRuntimeContext getContext() {
		return this.ctx;
	}
	
	protected Object getAddinData() {
		return this.addinData;
	}
	
	public String getName() {
		return "插件";
	}
	
//	//@Override
//	public IModelRuntime getModelRuntime() {
//		return getContext().getModelRuntime();
//	}
}
