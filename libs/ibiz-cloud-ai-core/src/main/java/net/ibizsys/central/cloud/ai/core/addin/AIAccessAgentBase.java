package net.ibizsys.central.cloud.ai.core.addin;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.cloud.ai.core.cloudutil.ICloudAIUtilRuntimeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.AIAccess;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatFunction;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.service.RequestMethods;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class AIAccessAgentBase extends CloudAIUtilRTAddinBase implements IAIAccessAgent {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(AIAccessAgentBase.class);
	
	public static final TypeReference<List<ChatTool>> ChatToolListType = new TypeReference<List<ChatTool>>() {
	};
	
	private long nTokenTimeout = 0;
	private int nDefaultTokenTimeout = 0;
	private String strAIAccessId = null;
	private String strToken = null;
	private String strAIType = null;
	private String strTokenDigest = null;
	private boolean bStarted = false;
	private boolean bRunAuthTimer = false;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private final static ThreadLocal<Integer> loopCallThreadLocal = new ThreadLocal<Integer>();
		
	@Override
	public void init(ICloudAIUtilRuntimeContext ctx, AIAccess aiAccess) throws Exception {
		this.setAIAccessId(aiAccess.getId());
		this.setAIType(aiAccess.getAIType());
		this.setDefaultTokenTimeout(60*60*1000);
		super.init(ctx, aiAccess);
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
	}
	
	@Override
	public void start() throws Exception {
		if(this.bStarted) {
			log.warn("AI应用代理已经启动");
			return;
		}
		this.onStart();
		this.bStarted = true;
	}
	
	protected void onStart() throws Exception{
		this.bRunAuthTimer = true;
		runAuthTimer();
	}
	
	@Override
	public void stop() throws Exception{
		if(!this.bStarted) {
			return;
		}
		this.bStarted = false;
		this.onStop();
	}
	
	protected void onStop() throws Exception{
		this.bRunAuthTimer = false;
	}
	
	
	@Override
	public AIAccess getAgentData() {
		//return this.getContext().getAIAccess(this.getAIAccessId());
		return (AIAccess)getAddinData();
	}
	

	@Override
	public String getAIType() {
		return this.strAIType;
	}
	
	protected void setAIType(String strAIType) {
		this.strAIType = strAIType;
	}
	
	protected String getAIAccessId() {
		return this.strAIAccessId;
	}
	
	protected void setAIAccessId(String strAIAccessId) {
		this.strAIAccessId = strAIAccessId;
	}
	

	protected long getTokenTimeout() {
		return this.nTokenTimeout;
	}

	public void setTokenTimeout(long nTokenTimeout) {
		this.nTokenTimeout = nTokenTimeout;
	}

	protected int getDefaultTokenTimeout() {
		return this.nDefaultTokenTimeout;
	}

	protected void setDefaultTokenTimeout(int nDefaultTokenTimeout) {
		this.nDefaultTokenTimeout = nDefaultTokenTimeout;
	}


	protected synchronized String getToken() {
		if(StringUtils.hasLength(this.strToken)) {
			String strDigest = calcTokenDigest(this.strToken);
			if(!strDigest.equals(this.strTokenDigest)) {
				this.strToken = "";
				log.warn(String.format("Token摘要信息不一致，重新请求"));
			}
			else {
				return this.strToken;
			}
		}
		if(!StringUtils.hasLength(this.strToken)) {
			this.requestToken(true);
		}
		return this.strToken;
	}
	
	protected void setToken(String strToken) {
		this.strToken = strToken;
		if(StringUtils.hasLength(strToken)) {
			this.strTokenDigest = this.calcTokenDigest(strToken);
		}
		else {
			this.strTokenDigest = "";
		}
	}
	
	
	protected String calcTokenDigest(String strToken) {
		AIAccess agentData = this.getAgentData();
		return KeyValueUtils.genUniqueId(agentData.getAccessKey(), agentData.getSecretKey(), strToken);
	}
	
	
	protected void requestTokenIf(boolean bImmediately) {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 60000) {
			return;
		}
		this.requestToken(bImmediately);
	}

	protected void requestToken() {
		this.requestToken(false);
	}

	protected void requestToken(boolean bImmediately) {
		if (bImmediately) {
			onRequestToken();
		} else {
			this.setTokenTimeout(0);
		}
	}

	protected void onRequestToken() {
		
		AIAccess aiAccess = this.getAgentData();
		try {
			if(DataTypeUtils.getIntegerValue(aiAccess.getDisabled(), 0) == 1) {
				throw new Exception("已被禁用");
			}
		}
		catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAIUtilRuntime(), String.format("AI应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
		
		
		try {
			long nLastTokenTimeout = this.getTokenTimeout();
			this.setToken(doRequestToken());
			if (this.getTokenTimeout() == nLastTokenTimeout) {
				this.setTokenTimeout(System.currentTimeMillis() + this.getDefaultTokenTimeout());
			}
			
			//this.getSystemRuntime().logEvent(LogLevels.ERROR, LogCats.AI_AIACCESS, String.format("AI应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			
			
		} catch (Throwable ex) {
			log.error(String.format("AI应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.AI_AIACCESS, String.format("AI应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			// 下一个时间周期继续认证
			this.setTokenTimeout(0);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAIUtilRuntime(), String.format("AI应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected String doRequestToken() throws Throwable{
		throw new Exception("没有实现");
	}
	
	protected void runAuthTimer() {
		runAuthTimer(false);
	}

	protected void runAuthTimer(boolean bTimerOnly) {
		if(!this.bRunAuthTimer) {
			return;
		}
		
		if(!bTimerOnly) {
			try {
				onAuthTimer();
			} catch (Throwable ex) {
				log.error(String.format("AI应用[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				getSystemRuntime().log(LogLevels.ERROR,  LogCats.AI_AIACCESS, String.format("AI应用[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}
		
		
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runAuthTimer();
			}
		}, System.currentTimeMillis() + 20000, "AuthTimer_AIAccess_" + this.getAIAccessId());
	}

	protected void onAuthTimer() {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 120000) {
			return;
		}

		// 执行认证
		onRequestToken();
	}
	
	@Override
	public ChatCompletionResult chatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable{
//		try {
//			return this.onChatCompletion(chatCompletionRequest);
//		} catch (Throwable ex) {
//			log.error(String.format("AI应用[%1$s]交互补全发生异常，%2$s", getName(), ex.getMessage()), ex);
//			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.AI_AIACCESS, String.format("AI应用[%1$s]交互补全发生异常，%2$s", getName(), ex.getMessage()), ex);
//			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAIUtilRuntime(), String.format("AI应用[%1$s]交互补全发生异常，%2$s", getName(), ex.getMessage()), ex);
//		}
		try {
			loopCallThreadLocal.set(0);
			return this.onChatCompletion(chatCompletionRequest);
		}
		finally {
			loopCallThreadLocal.remove();
		}
	}
	
	protected boolean testLoopCall(int nMax) {
		Integer nValue = loopCallThreadLocal.get();
		if(nValue == null) {
			nValue = 0;
		}
		nValue ++;
		loopCallThreadLocal.set(nValue);
		if(nValue>nMax) {
			return false;
		}
		return true;		
	}

	protected ChatCompletionResult onChatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public CompletionResult completion(CompletionRequest completionRequest) throws Throwable{
//		try {
//			return this.onCompletion(completionRequest);
//		} catch (Throwable ex) {
//			log.error(String.format("AI应用[%1$s]补全发生异常，%2$s", getName(), ex.getMessage()), ex);
//			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.AI_AIACCESS, String.format("AI应用[%1$s]补全发生异常，%2$s", getName(), ex.getMessage()), ex);
//			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAIUtilRuntime(), String.format("AI应用[%1$s]补全发生异常，%2$s", getName(), ex.getMessage()), ex);
//		}
		
		return this.onCompletion(completionRequest);
	}

	protected CompletionResult onCompletion(CompletionRequest completionRequest) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public EmbeddingResult embedding(EmbeddingRequest completionRequest) throws Throwable{
//		try {
//			return this.onEmbedding(completionRequest);
//		} catch (Throwable ex) {
//			log.error(String.format("AI应用[%1$s]Embedding发生异常，%2$s", getName(), ex.getMessage()), ex);
//			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.AI_AIACCESS, String.format("AI应用[%1$s]Embedding发生异常，%2$s", getName(), ex.getMessage()), ex);
//			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAIUtilRuntime(), String.format("AI应用[%1$s]Embedding发生异常，%2$s", getName(), ex.getMessage()), ex);
//		}
		
		return this.onEmbedding(completionRequest);
	}

	protected EmbeddingResult onEmbedding(EmbeddingRequest completionRequest) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	protected String doToolCall(ChatFunction chatFunction, Object arg) throws Throwable {
		if(chatFunction.getService() == null) {
			throw new Exception(String.format("未支持的Chat工具函数[%1$s]", chatFunction.getName()));
		}
	
		IWebClient iWebClient = this.getSysCloudClientUtilRuntime().getServiceClient(chatFunction.getService().getUrl());
		String strMethod = chatFunction.getService().getMethod();
		if(!StringUtils.hasLength(strMethod)) {
			strMethod = RequestMethods.POST;
		}
		
		return iWebClient.execute(strMethod, chatFunction.getService().getUrl(), null, null, null, arg, null, String.class, null).getBody();
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
}
