package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.util.Map;

import org.springframework.util.Assert;

import net.ibizsys.model.ai.IPSSysAIChatAgent;

public class SysAIFactoryRuntimeContextProxy implements ISysAIFactoryRuntimeContext{

	final ISysAIFactoryRuntimeContext proxySysAIFactoryRuntimeContext;
	
	protected SysAIFactoryRuntimeContextProxy(ISysAIFactoryRuntimeContext proxySysAIFactoryRuntimeContext) {
		this.proxySysAIFactoryRuntimeContext = proxySysAIFactoryRuntimeContext;
		Assert.notNull(this.proxySysAIFactoryRuntimeContext, "传入代理AI工厂运行时上下文对象无效");
	}
	
	
	@Override
	public String getConfigContent(Object data, String strConfigId, boolean bTryMode) throws Throwable {
		return this.proxySysAIFactoryRuntimeContext.getConfigContent(data, strConfigId, bTryMode);
	}

	@Override
	public ISysAIFactoryRuntime getModelRuntime() {
		return this.proxySysAIFactoryRuntimeContext.getModelRuntime();
	}

	@Override
	public String getParam(String strKey, String strDefault) {
		return this.proxySysAIFactoryRuntimeContext.getParam(strKey, strDefault);
		
	}

	@Override
	public int getParam(String strKey, int nDefault) {
		return this.proxySysAIFactoryRuntimeContext.getParam(strKey, nDefault);
	}

	@Override
	public long getParam(String strKey, long nDefault) {
		return this.proxySysAIFactoryRuntimeContext.getParam(strKey, nDefault);
	}

	@Override
	public double getParam(String strKey, double fDefault) {
		return this.proxySysAIFactoryRuntimeContext.getParam(strKey, fDefault);
	}

	@Override
	public boolean getParam(String strKey, boolean bDefault) {
		return this.proxySysAIFactoryRuntimeContext.getParam(strKey, bDefault);
	}

	@Override
	public Map<String, Object> getParams(String strPKey, Map<String, Object> params) {
		return this.proxySysAIFactoryRuntimeContext.getParams(strPKey, params);
	}

	@Override
	public int getHistoryCount() {
		return this.proxySysAIFactoryRuntimeContext.getHistoryCount();
	}

	@Override
	public String getAIPlatformType() {
		if(this.proxySysAIFactoryRuntimeContext != null) {
			return this.proxySysAIFactoryRuntimeContext.getAIPlatformType();
		}
		throw new RuntimeException("没有实现");
	}
	
	@Override
	public String getKBPlatformType() {
		if(this.proxySysAIFactoryRuntimeContext != null) {
			return this.proxySysAIFactoryRuntimeContext.getKBPlatformType();
		}
		throw new RuntimeException("没有实现");
	}

	@Override
	public ISysAIChatAgentRuntime createSysAIChatAgentRuntime(IPSSysAIChatAgent iPSSysAIChatAgent) throws Exception {
		return this.proxySysAIFactoryRuntimeContext.createSysAIChatAgentRuntime(iPSSysAIChatAgent);
	}

	@Override
	public File getWorkspace() {
		return this.proxySysAIFactoryRuntimeContext.getWorkspace();
	}


	@Override
	public ISysAIChatAgentGroup getAIChatAgentGroup(String groupTag) throws Exception {
		return this.proxySysAIFactoryRuntimeContext.getAIChatAgentGroup(groupTag);
	}

	@Override
	public IAIChatMemoryUtil getAIChatMemoryUtil(boolean tryMode) throws Exception {
		return this.proxySysAIFactoryRuntimeContext.getAIChatMemoryUtil(tryMode);
	}

	@Override
	public IAIChatSkillUtil getAIChatSkillUtil(boolean tryMode) throws Exception {
		return this.proxySysAIFactoryRuntimeContext.getAIChatSkillUtil(tryMode);
	}

	@Override
	public int getChatResourceMaxTokens() {
		return this.proxySysAIFactoryRuntimeContext.getChatResourceMaxTokens();
	}


	@Override
	public int getRegularMemoryMaxTokens() {
		return this.proxySysAIFactoryRuntimeContext.getRegularMemoryMaxTokens();
	}


	@Override
	public int getResidentMemoryMaxTokens() {
		return this.proxySysAIFactoryRuntimeContext.getResidentMemoryMaxTokens();
	}


	@Override
	public int getDailyMemoryMaxTokens() {
		return this.proxySysAIFactoryRuntimeContext.getDailyMemoryMaxTokens();
	}


	@Override
	public ISysAIChatSkill getAIChatSkill(String strSkillId, boolean tryMode) throws Exception {
		return this.proxySysAIFactoryRuntimeContext.getAIChatSkill(strSkillId, tryMode);
	}

	
	
}
