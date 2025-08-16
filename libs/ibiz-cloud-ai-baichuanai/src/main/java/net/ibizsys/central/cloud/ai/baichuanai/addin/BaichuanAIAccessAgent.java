package net.ibizsys.central.cloud.ai.baichuanai.addin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.ai.core.addin.AIAccessAgentBase2;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public class BaichuanAIAccessAgent extends AIAccessAgentBase2 {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(BaichuanAIAccessAgent.class);

	@Override
	protected void onInit() throws Exception {
		super.onInit();

	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_BAICHUAN;
	}

	@Override
	protected ChatCompletionResult onChatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable {

		List<Map> historyList = new ArrayList<Map>();
		if (!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			for (int i = 0; i < chatCompletionRequest.getMessages().size(); i++) {
				ChatMessage message = chatCompletionRequest.getMessages().get(i);
				if (!StringUtils.hasLength(message.getRole())) {
					continue;
				}
				Map<String, String> history = new LinkedHashMap<String, String>();
				history.put("role", message.getRole().toLowerCase());

				if (message.getRole().equalsIgnoreCase(net.ibizsys.central.cloud.core.util.domain.ChatMessageRole.SYSTEM.getValue())) {
					history.put("role", net.ibizsys.central.cloud.core.util.domain.ChatMessageRole.USER.getValue().toLowerCase());
				}

				history.put("content", message.getContent());
				historyList.add(history);
			}
		}

		if (ObjectUtils.isEmpty(historyList)) {
			throw new Exception("未传入查询内容");
		}

		boolean bStream = true;

		String strServiceUrl = bStream ? String.format("%1$s/v1/stream/chat", this.getAgentData().getServiceUrl()) : String.format("%1$s/v1/chat", this.getAgentData().getServiceUrl());
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			ActionSession actionSession = ActionSessionManager.getCurrentSession();
			
			HttpPost request = new HttpPost(strServiceUrl);
			long nTime = System.currentTimeMillis() / 1000;

			request.addHeader("Content-Type", "application/json");
			request.setHeader("Authorization", "Bearer " + this.getAgentData().getAccessKey());
			request.setHeader("X-BC-Timestamp", Long.toString(nTime));
			request.setHeader("X-BC-Sign-Algo", "MD5");

			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("messages", historyList);
			body.put("model", "Baichuan2-53B");
			
			Map<String, Object> parameters = new LinkedHashMap<String, Object>();
			
			if(chatCompletionRequest.getTemperature()!=null) {
				parameters.put("temperature", chatCompletionRequest.getTemperature());
			}
			
			if(parameters.size()>0) {
				body.put("parameters", parameters);
			}

			String strBody = JsonUtils.toString(body);
			String strSignature = KeyValueUtils.genMD5Ex(this.getAgentData().getSecretKey() + strBody + Long.toString(nTime));
			request.setHeader("X-BC-Signature", strSignature);

			StringEntity entity = new StringEntity(strBody, ContentType.APPLICATION_JSON.getMimeType(), "UTF-8");
			request.setEntity(entity);
			//
			HttpResponse response = httpClient.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 200) {

				final List<ChatMessage> retMessageList = new ArrayList<>();

				HttpEntity responseEntity = response.getEntity();
				if (bStream) {
					// 读取响应实体内容
					try (BufferedReader reader = new BufferedReader(new InputStreamReader(responseEntity.getContent()))) {
						// 读取每行事件数据
						StringBuilder sb = new StringBuilder();
						String strRole = null;
						String strFinishReason = null;

						String line;
						while ((line = reader.readLine()) != null) {
							if (!StringUtils.hasLength(line)) {
								continue;
							}
							// 处理事件数据
							Map ret = JsonUtils.asMap(line);
							Object code = ret.get("code");
							if (DataTypeUtils.getIntegerValue(code, -1) == 0) {
								Object data = ret.get("data");
								if (data instanceof Map) {
									Object messages = ((Map) data).get("messages");
									if (messages instanceof List) {

										List list = (List) messages;
										for (Object message : list) {
											if (!(message instanceof Map)) {
												continue;
											}

											Map map = (Map) message;
											strRole = (String) map.get("role");
											String strContent = (String) map.get("content");
											strFinishReason = (String)map.get("finish_reason");
													
											if (!StringUtils.isEmpty(strRole) && !StringUtils.isEmpty(strContent)) {
												sb.append(strContent);

												if(actionSession!=null) {
													actionSession.updateActionStep(strContent, sb.toString());
												}
											}
											else {
												log.error(String.format("返回内容无效"));
											}

											
										}
									}
								}
							} else {
								throw new Exception(String.format("请求发生错误，%1$s", ret.get("msg")));
							}
							
							if(StringUtils.hasLength(strFinishReason)){
								break;
							}
						}

						String strContent = sb.toString();
						if (!StringUtils.isEmpty(strRole) && !StringUtils.isEmpty(strContent)) {
							ChatMessage chatMessage = new ChatMessage();
							chatMessage.setRole(strRole.toUpperCase());
							chatMessage.setContent(sb.toString());
							retMessageList.add(chatMessage);
						} else {
							log.error(String.format("返回内容无效"));

						}
					}
				} else {
					String responseBody = EntityUtils.toString(responseEntity);

					// 解析
					Map ret = JsonUtils.asMap(responseBody);
					Object code = ret.get("code");
					if (DataTypeUtils.getIntegerValue(code, -1) == 0) {
						Object data = ret.get("data");
						if (data instanceof Map) {
							Object messages = ((Map) data).get("messages");
							if (messages instanceof List) {

								List list = (List) messages;
								for (Object message : list) {
									if (!(message instanceof Map)) {
										continue;
									}

									Map map = (Map) message;
									String strRole = (String) map.get("role");
									String strContent = (String) map.get("content");
									if (StringUtils.isEmpty(strRole) || StringUtils.isEmpty(strContent)) {
										log.error(String.format("返回内容无效"));
										continue;
									}

									ChatMessage chatMessage = new ChatMessage();
									chatMessage.setRole(strRole.toUpperCase());
									chatMessage.setContent(strContent);
									retMessageList.add(chatMessage);
								}
							}
						}
					} else {
						throw new Exception(String.format("请求发生错误，%1$s", ret.get("msg")));
					}
				}

				if (ObjectUtils.isEmpty(retMessageList)) {
					throw new Exception(String.format("未返回任何内容"));
				}

				ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
				chatCompletionResult.setChoices(retMessageList);
				return chatCompletionResult;

			} else {
				throw new Exception(String.format("请求发生异常，%1$s", response.getStatusLine().getStatusCode()));
			}

		}
	}

	@Override
	protected CompletionResult onCompletion(CompletionRequest completionRequest) throws Throwable {

		//
		// int nMaxTokens = 4096;
		// if(completionRequest.containsMaxTokens()) {
		// nMaxTokens = completionRequest.getMaxTokens();
		// }
		// else {
		// if(StringUtils.hasLength(completionRequest.getPrompt())) {
		// nMaxTokens = nMaxTokens - completionRequest.getPrompt().length();
		// }
		// }
		//
		//
		// if(nMaxTokens <= 0) {
		// throw new Exception("最大词数异常");
		// }
		//
		// com.theokanning.openai.completion.CompletionRequest request =
		// com.theokanning.openai.completion.CompletionRequest
		// .builder()
		// .model("text-davinci-003")
		// .prompt(completionRequest.getPrompt())
		// .n(1)
		// .user(completionRequest.getSessionId())
		// .maxTokens(nMaxTokens)
		// // .logitBias(new HashMap<>())
		// .build();
		//
		// final StringBuilder sb = new StringBuilder();
		//
		// ActionSession actionSession =
		// ActionSessionManager.getCurrentSession();
		// // service.
		// getAIService().streamCompletion(request).blockingForEach(it -> {
		// String strContent = it.getChoices().get(0).getText();
		// if (StringUtils.hasLength(strContent)) {
		// sb.append(strContent);
		// if(actionSession!=null) {
		// String strStep = sb.toString();
		// actionSession.updateActionStep(strStep, 0, false);
		// }
		// }
		// });
		//
		// Completion completion = new Completion();
		// completion.setContent(sb.toString());
		//
		// final List<Completion> completionList = new ArrayList<>();
		// completionList.add(completion);
		//
		// CompletionResult completionResult = new CompletionResult();
		// completionResult.setChoices(completionList);
		// return completionResult;
		return null;
	}

}
