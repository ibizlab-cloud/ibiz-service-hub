package net.ibizsys.central.cloud.core.ai;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.ai.IPSSysAIPipelineAgent;
import net.ibizsys.runtime.plugin.ModelRTScriptBase;
import net.ibizsys.runtime.util.ExceptionUtils;

public abstract class SysAIPipelineAgentRuntimeBase extends SysAIAgentRuntimeBase implements ISysAIPipelineAgentRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIPipelineAgentRuntimeBase.class);

	private IPSSysAIPipelineAgent iPSSysAIPipelineAgent = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private String strAccessKey = null;

	@Override
	protected ISysAIPipelineAgentRuntimeContext createModelRuntimeContext() {
		return new SysAIPipelineAgentRuntimeContextBase<ISysAIPipelineAgentRuntime, ISysAIAgentRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}
	
	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, IPSSysAIPipelineAgent iPSSysAIPipelineAgent) throws Exception {
		this.iPSSysAIPipelineAgent = iPSSysAIPipelineAgent;
		super.init(iSysAIFactoryRuntimeContext);
	}

	@Override
	protected void onInit() throws Exception {
		
//		if(this.getPSModelObject().getPSSysUniRes() != null) {
//			this.strAccessKey = this.getPSModelObject().getPSSysUniRes().getResCode();
//		}
		
		if(StringUtils.hasLength(this.getPSModelObject().getAIPlatformType())) {
			this.setAIPlatformType(this.getPSModelObject().getAIPlatformType());
		}
		
		if(this.getPSModelObject().getPSDataEntity() != null) {
			this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSModelObject().getPSDataEntityMust().getId(), false);
		}
		

		super.onInit();
	}

	@Override
	public IPSSysAIPipelineAgent getPSModelObject() {
		return this.iPSSysAIPipelineAgent;
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}

	@Override
	public String getAgentType() {
		return AIAGENT_PIPELINE;
	}
	
	@Override
	public String getAgentSubType() {
		return this.iPSSysAIPipelineAgent.getAgentType();
	}
	
	@Override
	public String getAccessKey() {
		return this.strAccessKey;
	}
	
	@Override
	public String getAgentMode() {
		return this.iPSSysAIPipelineAgent.getCodeName();
	}

	@Override
	public Object executeAction(String strAction, Object[] args) throws Throwable {
		Assert.notEmpty(args, "传入参数无效");
		try {
			return this.onExecuteAction(strAction, args);
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this.getSysAIFactoryRuntimeContext().getAIFactoryRuntime(), this, String.format("执行操作[%1$s]发生异常，%2$s", strAction, ex.getMessage()), ex);
		}
	}
	
	protected Object onExecuteAction(String strAction, Object[] args) throws Throwable {
		
		return getAIAgentRTScript(false).call(strAction, ModelRTScriptBase.ATTACHMODE_EXECUTE, args);
	}
	
	
	@Override
	public String getAgentInfo() {
		return this.getPSModelObject().getAgentInfo();
	}
}
