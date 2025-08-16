package net.ibizsys.central.cloud.ai.openai.gpt3.demo;


import java.net.InetSocketAddress;
import java.net.Proxy;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.theokanning.openai.OpenAiApi;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.completion.chat.ChatMessageRole;
import com.theokanning.openai.service.OpenAiService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

class OpenAiApiExample {
	
	
    public static void main(String... args) {
        String token = "";
        
//       Authenticator authenticator = new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("", "51@rich".toCharArray());
//            }
//        };
//        Authenticator.setDefault(authenticator);
       Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 61107));
                                                                        
       //Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("16.171.38.103", 3128));
        
        ObjectMapper mapper = OpenAiService.defaultObjectMapper();
        OkHttpClient client = OpenAiService.defaultClient(token, Duration.ofMillis(500000))
                .newBuilder()
                .proxy(proxy)
                .build();
        Retrofit retrofit = OpenAiService.defaultRetrofit(client, mapper);
        OpenAiApi api = retrofit.create(OpenAiApi.class);
        OpenAiService service = new OpenAiService(api);
        

//        List<ChatMessage> chatMessage = new ArrayList<ChatMessage>();
//        chatMessage.add(new ChatMessage("system", "你是一个中台产品专家"));
//        System.out.println("\nCreating completion...");
//        ChatCompletionRequest completionRequest = ChatCompletionRequest.builder()
//                .model("gpt-3.5-turbo")
//                .messages(messages)
//                .prompt("开发方案是什么意思？")
//                .echo(true)
//                .user("testing")
//                .n(3)
//                .build();
//        
//        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
//
//        System.out.println("\nCreating Image...");
//        CreateImageRequest request = CreateImageRequest.builder()
//                .prompt("A cow breakdancing with a turtle")
//                .build();
//
//        System.out.println("\nImage is located at:");
//        System.out.println(service.createImage(request).getData().get(0).getUrl());

        System.out.println("Streaming chat completion...");
        final List<ChatMessage> messages = new ArrayList<>();
       // final ChatMessage systemMessage = ;
//        messages.add(new ChatMessage(ChatMessageRole.SYSTEM.value(), "你是一个中台产品专家"));
//        messages.add(new ChatMessage(ChatMessageRole.USER.value(), "中台产品主要有哪几类用户？"));
//        messages.add(new ChatMessage(ChatMessageRole.ASSISTANT.value(), "中台产品主要包含三类用户：中心管理员、方案管理员，开发人员"));
//        messages.add(new ChatMessage(ChatMessageRole.USER.value(), "中心管理员主要操作哪些功能？"));
//        messages.add(new ChatMessage(ChatMessageRole.ASSISTANT.value(), "中心管理员主要进行中心云资源管理，开发方案管理，用户管理及系统管理"));
//        messages.add(new ChatMessage(ChatMessageRole.USER.value(), "中心云资源包括哪些？"));
//        messages.add(new ChatMessage(ChatMessageRole.ASSISTANT.value(), "中心云资源包括了：系统生产线、数据库实例、Cloud运行平台"));
//        messages.add(new ChatMessage(ChatMessageRole.USER.value(), "系统生产线是什么？"));
//        messages.add(new ChatMessage(ChatMessageRole.ASSISTANT.value(), "系统生产线是一种授权机制，开发系统必须具备生产线才能进行激活"));
//        messages.add(new ChatMessage(ChatMessageRole.USER.value(), "请描述中心管理员相关功能需求？"));
        
//        messages.add(new ChatMessage(ChatMessageRole.SYSTEM.value(), "你是一个K8S专家"));
//        messages.add(new ChatMessage(ChatMessageRole.USER.value(), "请使用javaAPI编写一段获取指定POD运行日志的代码"));

        messages.add(new ChatMessage(ChatMessageRole.SYSTEM.value(), "你是系统架构师"));
      //  messages.add(new ChatMessage(ChatMessageRole.USER.value(), "请使用JsonSchema定义一个案管系统中的案卡对象"));
        messages.add(new ChatMessage(ChatMessageRole.USER.value(), "请使用Json数组定义中国的省份数据，省份名称使用'province',省会使用'city'，按邮政编码排序"));
        
        
        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest
                .builder()
                .model("gpt-3.5-turbo")
                .messages(messages)
                .n(1)
                //.user(user)
              //  .maxTokens(4096)
               // .logitBias(new HashMap<>())
                .build();

        final StringBuilder sb = new StringBuilder();
        
        //service.
        service.streamChatCompletion(chatCompletionRequest)
                .doOnError(Throwable::printStackTrace)
                .blockingForEach( it -> {
                	String strContent = it.getChoices().get(0).getMessage().getContent();
                	if(StringUtils.hasLength(strContent)) {
                		sb.append(strContent);
                	}
                });
        
        System.out.println(sb.toString());
        
//        messages.clear();
//        messages.add(new ChatMessage(ChatMessageRole.USER.value(), "中台产品并不具备运行监控功能，它是一个服务编排系统，请重新描述下中心管理员相关功能需求"));
//        chatCompletionRequest = ChatCompletionRequest
//                .builder()
//                .model("gpt-3.5-turbo")
//                .messages(messages)
//                .n(1)
//              //  .maxTokens(4096)
//               // .logitBias(new HashMap<>())
//                .build();
//        
//        final StringBuilder sb2 = new StringBuilder();
//        service.streamChatCompletion(chatCompletionRequest)
//        .doOnError(Throwable::printStackTrace)
//        .blockingForEach( it -> {
//        	String strContent = it.getChoices().get(0).getMessage().getContent();
//        	if(StringUtils.hasLength(strContent)) {
//        		sb2.append(strContent);
//        	}
//        });
//
//        System.out.println(sb2.toString());

        service.shutdownExecutor();
    }
}