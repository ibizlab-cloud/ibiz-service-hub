package net.ibizsys.central.plugin.ai.agent;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.groovy.control.CompilerConfiguration;
import org.springframework.util.StringUtils;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;

/**
 * AI 工作者代理对象基类
 * @author lionlau
 *
 */
public abstract class AIWorkerAgentBase extends AIAgentBase implements IAIWorkerAgent{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIChatAgentBase.class);
	
	private Map<String, AIWorkerAgentScriptBase> aiWorkerAgentScriptMap = new HashMap<String, AIWorkerAgentScriptBase>();
	
	private IAIWorkerAgentContext iAIWorkerAgentContext = new IAIWorkerAgentContext() {
		@Override
		public String output(String strTemplateId) throws Throwable {
			return output(null, strTemplateId);
		}

		@Override
		public String output(Object data, String strTemplateId) throws Throwable {
			return output(data, strTemplateId, null);
		}

		@Override
		public String output(Object data, String strTemplateId, String strIndent) throws Throwable {
			String strContent = getContent(data, String.format("template/%1$s", strTemplateId), null);
			if (!StringUtils.hasLength(strContent) || !StringUtils.hasLength(strIndent)) {
				return strContent;
			}

			StringBuilder stringBuilder = new StringBuilder();
			String[] lines = strContent.replace("\r\n", "\n").replace("\r", "\n").split("\n");
			for (int i = 0; i < lines.length; i++) {
				if (i != 0) {
					stringBuilder.append("\n");
				}
				stringBuilder.append(strIndent);
				if (StringUtils.hasLength(lines[i])) {
					stringBuilder.append(lines[i]);
				}
			}
			return stringBuilder.toString();
		}

		@Override
		public boolean contains(String strTemplateId) {
			try {
				return StringUtils.hasLength(getContext().getConfigContent(null, String.format("template/%1$s", strTemplateId), true));
			} catch (Throwable ex) {
				return false;
			}
		}
	};

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected IAIAgentContext getAIAgentContext() {
		return this.iAIWorkerAgentContext;
	}
	
	@Override
	public String getAgentType() {
		return AIAGENT_WORKER;
	}

	@Override
	public Object finish(IAIPipelineRunSession iAIPipelineRunSession, Object job, Map<String, Object> params) throws Throwable {
		IAIPipelineRunSession lastAIPipelineRunSession = getAIPipelineRunSession();
		try {
			setAIPipelineRunSession(iAIPipelineRunSession);
			return this.onFinish(iAIPipelineRunSession, job, params);
		}
		finally {
			setAIPipelineRunSession(lastAIPipelineRunSession);
		}
		
	}
	
	
	protected Object onFinish(IAIPipelineRunSession iAIPipelineRunSession, Object job, Map<String, Object> params) throws Throwable {
		throw new Exception("没有实现");
	}
	
	protected AIWorkerAgentScriptBase createAIWorkerAgentScript(String strObjectName, String strScriptCode) throws Throwable{
		return this.createAIWorkerAgentScript(strObjectName, strScriptCode, null);
	}
	
	protected AIWorkerAgentScriptBase createAIWorkerAgentScript(String strObjectName, String strScriptCode, Class<? extends AIWorkerAgentScriptBase> baseCls) throws Throwable{
		Object obj = null;
		try {
			Class cls = Class.forName(strObjectName);
			obj = cls.newInstance();
		}
		catch (Exception ex) {
		}
		
		if(obj == null) {
			if(!StringUtils.hasLength(strScriptCode)) {
				throw new Exception(String.format("建立工作者代理脚本对象发生异常，%1$s", "未传入脚本代码"));
			}
			CompilerConfiguration compilerConfiguration = new CompilerConfiguration();
			if(baseCls == null) {
				compilerConfiguration.setScriptBaseClass(AIWorkerAgentScriptBase.class.getName());
			}
			else {
				compilerConfiguration.setScriptBaseClass(baseCls.getName());
			}
			
			
//			ImportCustomizer importCustomizer = new ImportCustomizer();
//			compilerConfiguration.addCompilationCustomizers(importCustomizer);
			
			try(GroovyClassLoader classLoader = new GroovyClassLoader(Thread.currentThread().getContextClassLoader())) {
				GroovyShell groovyShell = new GroovyShell(classLoader, compilerConfiguration);
				obj = groovyShell.parse(strScriptCode);
			}
			catch (Exception ex) {
				throw new Exception(String.format("建立工作者代理脚本对象发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
		if(!(obj instanceof AIWorkerAgentScriptBase)) {
			throw new Exception(String.format("建立工作者代理脚本对象[%1$s]类型不正确", obj));
		}
		
		try {
			AIWorkerAgentScriptBase aiWorkerAgentScriptBase = (AIWorkerAgentScriptBase)obj;
			aiWorkerAgentScriptBase.setOwner(this);
			aiWorkerAgentScriptBase.run();
			return aiWorkerAgentScriptBase;
		}
		catch (Exception ex) {
			throw new Exception(String.format("工作者代理脚本对象运行发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
	
	protected AIWorkerAgentScriptBase getAIWorkerAgentScript(String strTemplateId, String strObjectName, Object jobData) throws Throwable{
		
		AIWorkerAgentScriptBase aiWorkerAgentScriptBase = this.aiWorkerAgentScriptMap.get(strTemplateId);
		if(aiWorkerAgentScriptBase==null) {
			String strTemplateContent = this.getTemplateContent(strTemplateId, true);
			aiWorkerAgentScriptBase = this.createAIWorkerAgentScript(strObjectName, strTemplateContent);
			this.aiWorkerAgentScriptMap.put(strTemplateId, aiWorkerAgentScriptBase);
		}
		return aiWorkerAgentScriptBase;
	}
	
	public IAIPipelineRunSession getAIPipelineRunSession() {
		return AIPipelineRunSessionBase.getCurrent();
	}
	
	public void setAIPipelineRunSession(IAIPipelineRunSession iAIPipelineRunSession) {
		AIPipelineRunSessionBase.setCurrent(iAIPipelineRunSession);
	}
}
