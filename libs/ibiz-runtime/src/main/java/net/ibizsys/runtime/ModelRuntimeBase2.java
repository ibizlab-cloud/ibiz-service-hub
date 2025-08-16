package net.ibizsys.runtime;

import org.springframework.util.StringUtils;

import net.ibizsys.runtime.plugin.IModelRTScript;
import net.ibizsys.runtime.plugin.ModelRTScriptBase;

public abstract class ModelRuntimeBase2 extends ModelRuntimeBase {

	private IModelRTScript iModelRTScript = null;

	
	protected void prepareModelRTScript(String strScriptCode) throws Exception {
		this.prepareModelRTScript(strScriptCode, ModelRTScriptBase.class);
	}
	
	
	protected void prepareModelRTScript(String strScriptCode, Class<? extends ModelRTScriptBase> cls) throws Exception {
		if(!StringUtils.hasLength(strScriptCode)) {
			throw new Exception(String.format("未指定模型运行时脚本"));
		}
		
		this.setModelRTScript(this.getSystemRuntime().createModelRTScript(this, strScriptCode, cls));
	}
	
	
	protected IModelRTScript getModelRTScript() {
		return this.iModelRTScript;
	}
	
	protected void setModelRTScript(IModelRTScript iModelRTScript) {
		this.iModelRTScript = iModelRTScript;
	}
	
	public abstract ISystemRuntime getSystemRuntime();
}
