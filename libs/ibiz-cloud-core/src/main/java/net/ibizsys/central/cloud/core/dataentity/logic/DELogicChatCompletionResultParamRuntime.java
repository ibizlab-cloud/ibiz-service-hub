package net.ibizsys.central.cloud.core.dataentity.logic;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionUsage;
import net.ibizsys.central.dataentity.logic.DELogicParamRuntimeBase;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 聊天交互反馈参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicChatCompletionResultParamRuntime extends DELogicParamRuntimeBase {

	/**
	 * 参数：内容（返回结果的内容，移除THINK等）
	 */
	public final static String PARAM_CONTENT = "content";
	
	
	/**
	 * 参数：直接内容（直接返回结果的内容）
	 */
	public final static String PARAM_RAW = "raw";
	
	
	/**
	 * 参数：JSON内容
	 */
	public final static String PARAM_JSON = "json";
	
	
	/**
	 * 参数：附加直接内容（直接返回结果的内容）
	 */
	public final static String PARAM_APPEND = "append";
	
	
	/**
	 * 参数：输入词数
	 */
	public final static String PARAM_PROMPT_TOKENS = "prompt_tokens";
	
	
	/**
	 * 参数：输出词数
	 */
	public final static String PARAM_COMPLETION_TOKENS = "completion_tokens";
	
	/**
	 * 参数：工具调用次数
	 */
	public final static String PARAM_TOOL_CALLS = "tool_calls";
	
	
	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
//		Object objParam = getParamObject(iDELogicSession);
//		if (objParam instanceof ChatCompletionResult) {
//			if (this.getDataEntityRuntime() != null) {
//				return this.getDataEntityRuntime().createScriptSearchContext((ChatCompletionResult) objParam);
//			}
//		}
		return super.getScriptObject(iDELogicSession);
	}
	
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof ChatCompletionResult)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是聊天交互反馈类型", getCodeName()));
			}
			return object;
		}
		// 新建
		object = createChatCompletionResult();
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}
	
	protected ChatCompletionResult createChatCompletionResult() throws Throwable {
		return new ChatCompletionResult();
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		if (paramObject != null) {
			// 检查类型是否正确
			if (!(paramObject instanceof ChatCompletionResult)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非聊天交互反馈类型参数", getCodeName()));
			}
		}
		super.bind(iDELogicSession, paramObject);
	}
	

	@Override
	public void set(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {
		Object param = this.getParamObject(iDELogicSession);
		ChatCompletionResult chatCompletionResult = null;
		if(param instanceof ChatCompletionResult) {
			chatCompletionResult = (ChatCompletionResult)param;
		}
		
		if(chatCompletionResult == null) {
			super.set(iDELogicSession, strName, objValue);
			return;
		}
		
		if(PARAM_CONTENT.equalsIgnoreCase(strName)
				|| PARAM_RAW.equalsIgnoreCase(strName)
				|| PARAM_JSON.equalsIgnoreCase(strName)) {
			if(ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
				chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(String.valueOf(objValue)).build());
				return;
			}
			
			chatCompletionResult.getChoices().get(0).setContent(String.valueOf(objValue));
			return;
		}
		
		if(PARAM_APPEND.equalsIgnoreCase(strName)) {
			if(ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
				chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(String.valueOf(objValue)).build());
				return;
			}
			
			String strContent = chatCompletionResult.getChoices().get(0).getContent();
			if(StringUtils.hasLength(strContent)) {
				strContent += "\r\n";
			}
			else {
				strContent = "";
			}
			strContent += String.valueOf(objValue);
			chatCompletionResult.getChoices().get(0).setContent(strContent);
			return;
		}
	
		chatCompletionResult.set(strName, objValue);
		return;
	}
	
	@Override
	public Object get(IDELogicSession iDELogicSession, String strName) throws Throwable {
		Object param = this.getParamObject(iDELogicSession);
		ChatCompletionResult chatCompletionResult = null;
		if(param instanceof ChatCompletionResult) {
			chatCompletionResult = (ChatCompletionResult)param;
		}
		
		if(chatCompletionResult == null) {
			return super.get(iDELogicSession, strName);
		}
		
		if(PARAM_CONTENT.equalsIgnoreCase(strName)) {
			if(ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
				return null;
			}
			
			String strContent = chatCompletionResult.getChoices().get(0).getContent();
			return AIChatUtils.removeThinkingContent(strContent);
		}
		
		if(PARAM_JSON.equalsIgnoreCase(strName)) {
			if(ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
				return null;
			}
			
			return AIChatUtils.getJsonContent(chatCompletionResult);
		}
		
		if(PARAM_RAW.equalsIgnoreCase(strName)) {
			if(ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
				return null;
			}
			
			return chatCompletionResult.getChoices().get(0).getContent();
		}
		
		if(PARAM_PROMPT_TOKENS.equalsIgnoreCase(strName) || ChatCompletionUsage.FIELD_PROMPTTOKENS.equalsIgnoreCase(strName)) {
			if(chatCompletionResult.getUsage() == null) {
				return null;
			}
			return chatCompletionResult.getUsage().getPromptTokens();
		}
		
		if(PARAM_COMPLETION_TOKENS.equalsIgnoreCase(strName) || ChatCompletionUsage.FIELD_COMPLETIONTOKENS.equalsIgnoreCase(strName)) {
			if(chatCompletionResult.getUsage() == null) {
				return null;
			}
			return chatCompletionResult.getUsage().getCompletionTokens();
		}
		
		if(PARAM_TOOL_CALLS.equalsIgnoreCase(strName) || ChatCompletionUsage.FIELD_TOOLCALLS.equalsIgnoreCase(strName)) {
			if(chatCompletionResult.getUsage() == null) {
				return null;
			}
			return chatCompletionResult.getUsage().getToolCalls();
		}
		
		
		if(PARAM_APPEND.equalsIgnoreCase(strName)) {
			throw new Exception(String.format("获取操作不支持[%1$s]",  strName));
		}
		
		return super.get(iDELogicSession, strName);
	}
	
	
}
