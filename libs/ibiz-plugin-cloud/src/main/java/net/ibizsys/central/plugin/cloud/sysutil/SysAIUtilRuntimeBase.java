package net.ibizsys.central.plugin.cloud.sysutil;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudAIClient;
import net.ibizsys.central.cloud.core.sysutil.CloudSysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统AI组件运行时对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class SysAIUtilRuntimeBase extends CloudSysUtilRuntimeBase implements ISysAIUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysAIUtilRuntimeBase.class);
	private ICloudAIClient iCloudAIClient = null;
	private String strDefaultAIPlatformType = AIPLATFORM_DEFAULT;
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		
		super.onPrepareDefaultSetting();
	}

	protected ICloudAIClient getCloudAIClient() {
		if(this.iCloudAIClient == null) {
			this.iCloudAIClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_AI, ICloudAIClient.class);
		}
		return this.iCloudAIClient;
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
	}

	@Override
	public String getLogicName() {
		return String.format("系统AI功能组件[%1$s]", this.getName());
	}

	@Override
	public String getDefaultAIPlatformType() {
		return this.strDefaultAIPlatformType;
	}
	
	protected void setDefaultAIPlatformType(String strDefaultAIPlatformType) {
		this.strDefaultAIPlatformType = strDefaultAIPlatformType;
	}
	
	@Override
	public ChatCompletionResult chatCompletion(ChatCompletionRequest chatCompletionRequest) {
		return this.chatCompletion(getDefaultAIPlatformType(), chatCompletionRequest);
	}

	@Override
	public PortalAsyncAction asyncChatCompletion(ChatCompletionRequest chatCompletionRequest) {
		return this.asyncChatCompletion(getDefaultAIPlatformType(), chatCompletionRequest);
	}

	@Override
	public ChatCompletionResult chatCompletion(String type, ChatCompletionRequest chatCompletionRequest) {
		return this.executeAction("交互补全", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onChatCompletion(StringUtils.hasLength(type)?type:getDefaultAIPlatformType(), chatCompletionRequest);
			}
		}, null, ChatCompletionResult.class);
	}
	
	protected ChatCompletionResult onChatCompletion(String type, ChatCompletionRequest chatCompletionRequest) throws Throwable{
		return getCloudAIClient().chatCompletion(type, chatCompletionRequest);
	}
	

	@Override
	public PortalAsyncAction asyncChatCompletion(String type, ChatCompletionRequest chatCompletionRequest) {
		return this.executeAction("异步交互补全", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onAsyncChatCompletion(StringUtils.hasLength(type)?type:getDefaultAIPlatformType(), chatCompletionRequest);
			}
		}, null, PortalAsyncAction.class);
	}

	protected PortalAsyncAction onAsyncChatCompletion(String type, ChatCompletionRequest chatCompletionRequest) throws Throwable{
		return getCloudAIClient().asyncChatCompletion(type, chatCompletionRequest);
	}
}
