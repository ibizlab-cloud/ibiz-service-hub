package net.ibizsys.central.plugin.ai.agent;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.plugin.ai.util.ChatCompletionSessionHolder;
import net.ibizsys.central.plugin.ai.util.python.PythonAIChatUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class ScriptSysAIChatAgentRuntimeBase extends ProxySysAIChatAgentRuntimeBase  {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ScriptSysAIChatAgentRuntimeBase.class);
	
	
	
	private String strScriptFilePath = "";
	
	@Override
	protected void onInit() throws Exception {
	
		super.onInit();
		if(ObjectUtils.isEmpty(this.getScriptFilePath())) {
			this.prepareScriptFilePath();
			if(!ObjectUtils.isEmpty(this.getScriptFilePath())) {
				log.warn(String.format("脚本交谈代理[%1$s]未定义脚本路径", this.getPSModelObject().getCodeName()));
			}
		}
		
	}
	
	protected void prepareScriptFilePath() throws Exception{
		String strScriptFolder = this.getWorkspace().getCanonicalPath() + File.separator + "scripts";
		//写入组件文件
		String last = "";
		File utilFile = new File(strScriptFolder + File.separator + "aichat_utils.py");
		
		if(utilFile.exists()) {
			//判断文件是否有内容
			last = FileUtils.readFileToString(utilFile, "UTF-8");
		}else {
			utilFile.getParentFile().mkdirs();
		}
		String moduleCode = net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(PythonAIChatUtils.class, "Module.py", false);
		if(!moduleCode.equals(last)) {
			FileUtils.writeStringToFile(utilFile, moduleCode, "UTF-8");
		}
		
		last = "";
		File mainFile = new File(strScriptFolder + File.separator + "main.py");
		if(mainFile.exists()) {
			//判断文件是否有内容
			last = FileUtils.readFileToString(mainFile, "UTF-8");
		}else {
			mainFile.getParentFile().mkdirs();
		}
		String scriptCode = this.getPSModelObject().getScriptCode();
		if(!ObjectUtils.isEmpty(scriptCode)) {
			if(!scriptCode.equals(last)) {
				FileUtils.writeStringToFile(mainFile, scriptCode, "UTF-8");
			}
			setScriptFilePath(mainFile.getCanonicalPath());
		}
		
	}
	
	protected String getScriptFilePath() {
		return this.strScriptFilePath;
	}
	
	protected void setScriptFilePath(String strScriptFilePath) {
		this.strScriptFilePath = strScriptFilePath;
	}
	

	@Override
	protected ChatCompletionResult onChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		
		if(StringUtils.hasLength(this.getScriptFilePath())) {
			if(true) {
				this.fillChatCompletionKnowledgeBases(chatCompletionRequest);
			}
			PythonAIChatUtils.exec(this.getSysAIFactoryRuntimeContext().getPythonCommandPath(), this.getScriptFilePath(), ChatCompletionSessionHolder.peekMust().getSessionId());
			return ChatCompletionSessionHolder.peekMust().getResult();
		}
		else {
			ChatCompletionRequest skillChatCompletionRequest = new ChatCompletionRequest();
			this.fillChatCompletionRequest(skillChatCompletionRequest, dataOrKeys, params, true, true);
			ChatCompletionResult result = this.doChatCompletion(getAIPlatformType(), skillChatCompletionRequest);
			
			//
			return result;
		}
	}
	
	
	
	@Override
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params, boolean bTryMode) throws Throwable {
		if(params == null) {
			params = new HashMap<String, Object>();
		}
		if(!params.containsKey(TEMPLATE_PARAM_REQUEST_MESSAGES)) {
			ChatCompletionRequest request = ChatCompletionRequestHolder.peek();
			if(request != null) {
				params.put(TEMPLATE_PARAM_REQUEST_MESSAGES, JsonUtils.toString(this.getRealChatMessages(request)));
			}
			else {
				params.put(TEMPLATE_PARAM_REQUEST_MESSAGES, "[]");
			}
		}
		
		return super.getContent(data, strTemplateId, params, bTryMode);
	}
	
	
	
	
}
