package net.ibizsys.central.cloud.core.dataentity.logic;

import java.util.LinkedHashMap;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResultEx;
import net.ibizsys.central.dataentity.logic.DELogicNodeRuntimeBase;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntimeContext;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESysAIChatAgentLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体调用AI交互代理节点运行时对象
 * @author lionlau
 *
 */
public class DELogicSysAIChatAgentNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESysAIChatAgentLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iDELogicRuntimeContext.getSystemRuntime();
		
		IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic = (IPSDESysAIChatAgentLogic)iPSDELogicNode;
		
		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false).getParamObject(iDELogicSession);
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		this.fillChatCompletionRequest(chatCompletionRequest, objParam, iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic);
		ChatCompletionResult chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(objParam, chatCompletionRequest, new LinkedHashMap<String, Object>(), true, true);
		
		Object objRet = this.getRealResult(chatCompletionResult, chatCompletionRequest, objParam, iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic);
				
		iDELogicSession.setLastReturn(objRet);
		
		if(iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}
	
	protected void fillChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, Object objParam, IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic) throws Exception {
		
	}
	
	protected Object getRealResult(ChatCompletionResult chatCompletionResult, ChatCompletionRequest chatCompletionRequest, Object objParam, IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic) throws Exception {
		if(chatCompletionResult instanceof ChatCompletionResultEx) {
			return ((ChatCompletionResultEx)chatCompletionResult).getResult();
		}
		if(chatCompletionResult == null || ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
			throw new Exception("返回AI交谈结果无效");
		}
		return chatCompletionResult.getChoices().get(0).getContent();
	}
}
