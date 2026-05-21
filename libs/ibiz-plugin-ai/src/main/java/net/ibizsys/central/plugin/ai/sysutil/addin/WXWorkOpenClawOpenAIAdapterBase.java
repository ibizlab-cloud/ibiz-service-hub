package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.ai.IAIChatAgentRuntimeBase;
import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 企业微信OpenClawOpenAIAdapter
 * 
 * @author lionlau
 *
 */
public abstract class WXWorkOpenClawOpenAIAdapterBase extends OpenClawOpenAIAdapterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(WXWorkOpenClawOpenAIAdapterBase.class);

	public final static String CONVERSATION_INFO = "Conversation info (untrusted metadata):";
	public final static String SENDER_INFO = "Sender (untrusted metadata):";

	@Override
	protected Object onChatCompletion(IAIChatAgentRuntimeBase iAIChatAgentRuntimeBase, ChatCompletionRequest chatCompletionRequest, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) throws Throwable {
		return super.onChatCompletion(iAIChatAgentRuntimeBase, chatCompletionRequest, request, response, body);
	}

	@Override
	protected ChatCompletionRequest convertChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, HttpServletRequest request, Map<String, Object> body) throws Exception {
		chatCompletionRequest = super.convertChatCompletionRequest(chatCompletionRequest, request, body);
		//获取最后的信息
		ChatMessage lastChatMessage = AIChatUtils.getLastChatMessage(chatCompletionRequest);
		if(lastChatMessage != null) {
			String strConversationLabel = (String)lastChatMessage.get("_conversation_label");
			if(!ObjectUtils.isEmpty(strConversationLabel)) {
				log.debug(String.format("OpenClaw企业微信重新调整会话标识"));
				chatCompletionRequest.setSessionId(KeyValueUtils.genUniqueId(strConversationLabel));
			}
		}
		
//		List<ChatMessage> list = new ArrayList<ChatMessage>(chatCompletionRequest.getMessages());
//		
//		Collections.reverse(list);
//		List<ChatMessage> realList = new ArrayList<ChatMessage>();
//
//		for (ChatMessage chatMessage : list) {
//			if(realList.size() > 0) {
//				//判断角色是否一致
//				if(realList.get(0).getRole().equals(chatMessage.getRole())) {
//					//丢弃
//					continue;
//				}
//			}
//			realList.add(0, chatMessage);
//		}
//		chatCompletionRequest.setMessages(realList);
		
		return chatCompletionRequest;
	}
	
	@Override
	protected Object doChatCompletion(IAIChatAgentRuntimeBase iAIChatAgentRuntimeBase, ChatCompletionRequest chatCompletionRequest, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) throws Throwable {
	
		return super.doChatCompletion(iAIChatAgentRuntimeBase, chatCompletionRequest, request, response, body);
	}
	
	@Override
	protected String convertTextContent(String content, ChatMessage chatMessage) throws Exception {

		if (!ChatMessageRole.USER.getValue().equalsIgnoreCase(chatMessage.getRole())) {
			return content;
		}

		boolean bConversation = false;
		boolean bSender = false;
		boolean bContent = false;

		StringBuilder conversationBuilder = new StringBuilder();
		StringBuilder senderBuilder = new StringBuilder();
		StringBuilder contentBuilder = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new StringReader(content))) {
			// 读取每行事件数据
			String line;

			while ((line = reader.readLine()) != null) {
				if (bContent) {
					if (StringUtils.hasLength(line)) {
						contentBuilder.append(line);
					}
					contentBuilder.append("\n");
					continue;
				}

				if (StringUtils.hasLength(line)) {
					// 判断类型
					if (line.indexOf(CONVERSATION_INFO) == 0) {
						bConversation = true;
						bSender = false;
						continue;
					}

					if (line.indexOf(SENDER_INFO) == 0) {
						bSender = true;
						bConversation = false;
						continue;
					}
				}

				if (bConversation || bSender) {
					if (line.equals("```json")) {
						// 开始
						continue;
					}
					if (line.equals("```")) {
						// 结束
						if (bConversation)
							bConversation = false;
						else if (bSender) {
							bSender = false;
							bContent = true;
						}

						continue;
					}

					if (bConversation) {
						conversationBuilder.append(line);
						conversationBuilder.append("\n");
					} else if (bSender) {
						senderBuilder.append(line);
						senderBuilder.append("\n");
					}
				}
			}
		}

		String strSenderInfo = senderBuilder.toString();
		if (StringUtils.hasLength(strSenderInfo)) {
			try {
				Map<String, Object> senderInfo = JsonUtils.asMap(strSenderInfo);
				String strSenderId = (String) senderInfo.get("id");
				if (StringUtils.hasLength(strSenderId)) {
					chatMessage.set("_sender_id", strSenderId);
				}
			} catch (Throwable ex) {
				log.error(String.format("解析sender信息[%1$s]时发生异常，%2$s", strSenderInfo, ex.getMessage()), ex);
			}
		}
		
		String strConversationInfo = conversationBuilder.toString();
		if (StringUtils.hasLength(strConversationInfo)) {
			try {
				Map<String, Object> conversationInfo = JsonUtils.asMap(strConversationInfo);
				String strConversationLabel = (String) conversationInfo.get("conversation_label");
				if (StringUtils.hasLength(strConversationLabel)) {
					chatMessage.set("_conversation_label", strConversationLabel);
				}
			} catch (Throwable ex) {
				log.error(String.format("解析conversation信息[%1$s]时发生异常，%2$s", strConversationInfo, ex.getMessage()), ex);
			}
		}
		
		
		

		String realContent = contentBuilder.toString().trim();
		// 找到第一个空格
		if (StringUtils.hasLength(realContent) && realContent.charAt(0) == '@') {
			int nPos = realContent.indexOf(" ");
			if (nPos != -1) {
				String strAssistantName = realContent.substring(1, nPos);
				chatMessage.set("_assistant_id", strAssistantName);
				realContent = realContent.substring(nPos + 1);
			}
		}

		return realContent;
	}
}
