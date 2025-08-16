package net.ibizsys.central.log;

import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class ModelRTLogAdapterBase extends ModelRTAddinBase implements IModelRTLogAdapter{

	private IModelRTLogSupportable iModelRTLogSupportable = null;
	
	@Override
	protected void onInit() throws Exception {
		if(this.getModelRTLogSupportable(true) == null) {
			this.prepareModelRTLogSupportable();
			if(this.getModelRTLogSupportable(true) == null) {
				throw new Exception("未指定模型运行时日志支持对象");
			}
		}
		super.onInit();
	}
	
	protected void prepareModelRTLogSupportable() throws Exception {
		if(this.getAddinData() instanceof IModelRTLogSupportable) {
			this.setModelRTLogSupportable((IModelRTLogSupportable)this.getAddinData());
		}
		else
			if(this.getContext() instanceof IModelRTLogSupportable) {
				this.setModelRTLogSupportable((IModelRTLogSupportable)this.getContext());
			}
			else
				if(this.getContext().getModelRuntime() instanceof IModelRTLogSupportable) {
					this.setModelRTLogSupportable((IModelRTLogSupportable)this.getContext().getModelRuntime());
				}
	}
	
	protected IModelRTLogSupportable getModelRTLogSupportable(boolean bTryMode) throws Exception{
		if(this.iModelRTLogSupportable != null || bTryMode) {
			return this.iModelRTLogSupportable;
		}
		throw new Exception("模型运行时日志支持对象无效");
	}
	
	protected void setModelRTLogSupportable(IModelRTLogSupportable iModelRTLogSupportable) {
		this.iModelRTLogSupportable = iModelRTLogSupportable;
	}
}
