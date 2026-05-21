package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatContent;
import net.ibizsys.central.cloud.core.util.domain.ChatContentType;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;

public abstract class OpenClawOpenAIAdapterBase extends OpenAIAdapterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OpenClawOpenAIAdapterBase.class);

	@Override
	protected ChatCompletionRequest convertChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, HttpServletRequest request, Map<String, Object> body) throws Exception {
		// 重新组织数据
		List<ChatMessage> list = new ArrayList<ChatMessage>();
		for (ChatMessage chatMessage : chatCompletionRequest.getMessages()) {
			ChatMessage item = this.convertChatMessage(chatMessage);
			if (item == null) {
				continue;
			}
			list.add(item);
		}
		if(ObjectUtils.isEmpty(list)) {
			throw new Exception("交谈请求未携带消息");
		}
		chatCompletionRequest.setMessages(list);
		return chatCompletionRequest;
	}

	protected ChatMessage convertChatMessage(ChatMessage chatMessage) throws Exception {
		// 判断消息类型
		if (ChatMessageRole.USER.getValue().equalsIgnoreCase(chatMessage.getRole())) {
			Object content = chatMessage.getRawContent();
			if (content instanceof List) {
				// 消息列表
				List<ChatContent> last = chatMessage.getChatContents();
				List<ChatContent> list = new ArrayList<ChatContent>();
				for (ChatContent chatContent : last) {
					ChatContent newItem = this.convertChatContent(chatContent, chatMessage);
					if (newItem == null) {
						continue;
					}
					list.add(newItem);
				}
				chatMessage.setContent(list);
			}
		}

		return chatMessage;
	}

	protected ChatContent convertChatContent(ChatContent chatContent, ChatMessage chatMessage) throws Exception {
		// 判断消息类型
		if (ChatMessageRole.USER.getValue().equalsIgnoreCase(chatMessage.getRole())) {
			if (ChatContentType.TEXT.getValue().equalsIgnoreCase(chatContent.getType())) {
				String newContent = this.convertTextContent(chatContent.getText(), chatMessage);
				chatContent.setText(newContent);
				return chatContent;
			} else {
				return chatContent;
			}
		}
		return chatContent;
	}

	protected String convertTextContent(String content, ChatMessage chatMessage) throws Exception {

		return content;
	}

}
