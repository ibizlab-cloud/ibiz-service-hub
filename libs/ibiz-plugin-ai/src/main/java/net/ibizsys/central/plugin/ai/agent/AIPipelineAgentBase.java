package net.ibizsys.central.plugin.ai.agent;

import java.util.Map;

/**
 * AI 流水线代理对象基类
 * @author lionlau
 *
 */
public abstract class AIPipelineAgentBase extends AIAgentBase implements IAIPipelineAgent{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIPipelineAgentBase.class);
	
	public final static int MAXROUND = 20;
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected IAIAgentContext getAIAgentContext() {
		return null;
	}
	
	@Override
	public String getAgentType() {
		return AIAGENT_PIPELINE;
	}
	
	@Override
	public void run(int nRound, Map<String, Object> params) throws Throwable {
		this.run(null, nRound, params);
	}
	@Override
	public void run(Object target, int nRound, Map<String, Object> params) throws Throwable {

		if (nRound == -1) {
			nRound = MAXROUND;
		}

		int nRound2 = nRound;

		IAIPipelineRunSession iAIPipelineRunSession = createAIPipelineRunSession(null);
		IAIPipelineRunSession lastAIPipelineRunSession = AIPipelineRunSessionBase.getCurrent();
		try {
			AIPipelineRunSessionBase.setCurrent(iAIPipelineRunSession);
			for (int i = 0; i < nRound2; i++) {
				onRun(target, params);
			}
		}
		finally {
			AIPipelineRunSessionBase.setCurrent(lastAIPipelineRunSession);
		}
	}
	

	protected IAIPipelineRunSession createAIPipelineRunSession(Map<String, Object> params) throws Throwable {
		AIPipelineRunSessionBase aiPipelineRunSessionBase = new AIPipelineRunSessionBase(params) {
			@Override
			public Object getData() {
				return getAddinData();
			}
		};

		return aiPipelineRunSessionBase;
	}

	protected void onRun(Object target, Map<String, Object> params) throws Throwable {

		throw new Exception("没有实现");
		
	}
	
	protected IAIPipelineRunSession getAIPipelineRunSession() throws Throwable{
		return this.getAIPipelineRunSession(false);
	}
	
	protected IAIPipelineRunSession getAIPipelineRunSession(boolean bTryMode) throws Throwable{
		IAIPipelineRunSession iAIPipelineRunSession = AIPipelineRunSessionBase.getCurrent();
		if(iAIPipelineRunSession != null || bTryMode) {
			return iAIPipelineRunSession;
		}
		throw new Exception("当前AI流水线运行会话无效");
	}
	
	protected IAIWorkerAgent getAIWorkerAgent(Object jobData) throws Throwable {
		throw new Exception("未实现");
	}
}
