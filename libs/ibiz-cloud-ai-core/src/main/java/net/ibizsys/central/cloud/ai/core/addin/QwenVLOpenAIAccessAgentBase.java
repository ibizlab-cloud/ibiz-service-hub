package net.ibizsys.central.cloud.ai.core.addin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatContent;
import net.ibizsys.central.cloud.core.util.domain.ChatContentType;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;

public abstract class QwenVLOpenAIAccessAgentBase extends QwenOpenAIAccessAgentBase {

	@Override
	protected void onFillChatCompletionBody(ChatCompletionRequest chatCompletionRequest, Map<String, Object> body) throws Exception {
		body.put("vl_high_resolution_images", true);
		super.onFillChatCompletionBody(chatCompletionRequest, body);
	}
	
	@Override
	protected Object getMessageContent(ChatMessage message, ChatCompletionRequest chatCompletionRequest) {
		List<ChatContent> chatContentList = message.getChatContents();
		if(!ObjectUtils.isEmpty(chatContentList)) {
			List<Map> list = new ArrayList<Map>();
			for(ChatContent chatContent : chatContentList) {
				String type = chatContent.getType();
				if(ChatContentType.IMAGE_URL.getValue().equals(type)) {
					Map<String, Object> map = new LinkedHashMap<String, Object>();
					map.put("type", "image_url");
					Map<String, Object> image_url = new LinkedHashMap<String, Object>();
					map.put("image_url", image_url);
					image_url.put("url", chatContent.getUrl());
					list.add(map);
					continue;
				}
				
				if(ChatContentType.TEXT.getValue().equals(type)) {
					Map<String, Object> map = new LinkedHashMap<String, Object>();
					map.put("type", "text");
					map.put("text", chatContent.getText());
					list.add(map);
					continue;
				}
				
			}
			return list;
		}
		
		return null;
	}
}
