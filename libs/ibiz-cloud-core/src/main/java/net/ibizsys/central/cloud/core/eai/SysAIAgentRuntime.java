package net.ibizsys.central.cloud.core.eai;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.DataSyncIn;
import net.ibizsys.runtime.util.domain.DataSyncOut;

/**
 * CloudAI 服务代理
 * 
 * @author lionlau
 *
 */
public class SysAIAgentRuntime extends SysEAIAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIAgentRuntime.class);

	public final static String AITYPE_DEFAULT = "DEFAULT";
	private ISysAIUtilRuntime iSysAIUtilRuntime = null;
	private ISysPortalUtilRuntime iSysPortalUtilRuntime = null;

	public final static String PARAM_REQUEST = "_request";
	public final static String PARAM_ACTION = "_action";
	public final static String PARAM_RESULT = "_result";

	protected ISysAIUtilRuntime getSysAIUtilRuntime() {
		if (this.iSysAIUtilRuntime == null) {
			this.iSysAIUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysAIUtilRuntime.class, false);
		}
		return this.iSysAIUtilRuntime;
	}

	protected ISysPortalUtilRuntime getSysPortalUtilRuntime() {
		if (this.iSysPortalUtilRuntime == null) {
			this.iSysPortalUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysPortalUtilRuntime.class, false);
		}
		return this.iSysPortalUtilRuntime;
	}

	@Override
	public boolean isRawDataMode() {
		return true;
	}

	@Override
	protected void onSend(String strSendData, DataSyncOut[] dataSyncOuts) throws Throwable {

		Map<String, Object> data = this.getRecvDataMap(strSendData);

		Object request = data.get(PARAM_REQUEST);
		Map<String, Object> requestMap = null;
		if (request instanceof Map) {
			requestMap = (Map) request;
		} else {
			throw new Exception("未传入请求参数");
		}

		List<ChatMessage> messageList = new ArrayList<ChatMessage>();
		Object list = requestMap.get(ChatCompletionRequest.FIELD_MESSAGES);
		if (list instanceof List) {
			for (Object item : (List) list) {
				messageList.add(this.getChatMessage(item));
			}
		}

		if (ObjectUtils.isEmpty(messageList)) {
			throw new Exception(String.format("未指定消息列表"));
		}

		Object sessionId = requestMap.get(ChatCompletionRequest.FIELD_SESSIONID);
		String strSessionId = null;
		if (sessionId instanceof String) {
			strSessionId = (String) sessionId;
		}

		if (!StringUtils.hasLength(strSessionId)) {
			if (EmployeeContext.getCurrent() != null) {
				strSessionId = String.format("%1$s_%2$s_%3$s", EmployeeContext.getCurrent().getTenant(), EmployeeContext.getCurrent().getSystemid(), EmployeeContext.getCurrent().getUaausername());
			} else if (AuthenticationUser.getCurrent() != null) {
				strSessionId = String.format("%1$s", AuthenticationUser.getCurrent().getUsername());
			} else
				strSessionId = KeyValueUtils.genGuidEx();
		}

		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		chatCompletionRequest.setMessages(messageList);
		chatCompletionRequest.setSessionId(strSessionId);

		this.getSystemRuntime().log(LogLevels.DEBUG, this.getLogCat(), String.format("AI交互补全请求：\r\n\r\n%1$s",
				this.getSystemRuntime().serialize(chatCompletionRequest)), null);
		
		PortalAsyncAction portalAsyncAction = getSysAIUtilRuntime().asyncChatCompletion(ICloudAIUtilRuntime.AIPLATFORM_DEFAULT, chatCompletionRequest);

		threadMonitor(portalAsyncAction, data, true);

		//

		// TODO Auto-generated method stub
		// super.onSend(strSendData, dataSyncOuts);
	}

	protected void threadMonitor(PortalAsyncAction portalAsyncAction, Map<String, Object> data, boolean bTimerOnly) {

		if (!bTimerOnly) {
			PortalAsyncAction action = null;
			try {
				// 获取行为
				action = this.getSysPortalUtilRuntime().getAsyncAction(portalAsyncAction.getAsyncAcitonId());
			} catch (Throwable ex) {
				this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("检查异步操作状态[%1$s]发生异常，%2$s", portalAsyncAction.getAsyncAcitonId(), ex.getMessage()), null);
				action = new PortalAsyncAction();
				action.setActionState(PortalAsyncActionState.FAILED.getValue());
				action.setActionResult(ex.getMessage());
			}
			int nActionState = DataTypeUtils.asInteger(action.getActionState(), PortalAsyncActionState.EXECUTING.getValue());
			if (nActionState == PortalAsyncActionState.FAILED.getValue() || nActionState == PortalAsyncActionState.FINISHED.getValue()) {

				data.put(PARAM_ACTION, action);
				// 完成或错误
				if (nActionState == PortalAsyncActionState.FINISHED.getValue()) {
					String strResult = action.getActionResult();
					if (StringUtils.hasLength(strResult)) {
						ChatCompletionResult chatCompletionResult = this.getSystemRuntime().deserialize(strResult, ChatCompletionResult.class);
						data.put(PARAM_RESULT, chatCompletionResult);
					}
					this.getSystemRuntime().log(LogLevels.DEBUG, this.getLogCat(), String.format("AI交互补全返回：\r\n\r\n%1$s",
							action.getActionResult()), null);
				}
				else {
					this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("AI交互补全发生错误：\r\n\r\n%1$s",
							action.getActionResult()), null);
				}

				final List<IDEDataSyncInRuntime> list = this.getDEDataSyncInRuntimeList();
				if (list == null || list.size() == 0) {
					return;
				}

				for (IDEDataSyncInRuntime iDEDataSyncInRuntime : list) {

					// 重新序列化数据
					try {
						String strData = this.serializeSendData(data);
						DataSyncIn dataSyncIn = new DataSyncIn();
						dataSyncIn.setData(strData);
						dataSyncIn.setEventType(iDEDataSyncInRuntime.getPSDEDataSync().getEventType());

						iDEDataSyncInRuntime.recv(new DataSyncIn[] { dataSyncIn });
					} catch (Throwable ex) {
						this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("处理数据接收[%1$s]发生异常，%2$s", iDEDataSyncInRuntime.getName(), portalAsyncAction.getAsyncAcitonId(), ex.getMessage()), null);
					}
				}

				return;
			}
		}

		// 开启线程
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				threadMonitor(portalAsyncAction, data, false);
			}
		}, System.currentTimeMillis() + 2000l);

	}

	protected ChatMessage getChatMessage(Object item) throws Throwable {
		if (item instanceof ChatMessage) {
			return (ChatMessage) item;
		}
		if (item instanceof IEntity) {
			ChatMessage chatMessage = new ChatMessage();
			((IEntity) item).copyTo(chatMessage);
			return chatMessage;
		}
		if (item instanceof Map) {
			ChatMessage chatMessage = new ChatMessage();
			Map map = (Map) item;
			for (Object key : map.keySet()) {
				if (ObjectUtils.isEmpty(key)) {
					continue;
				}
				chatMessage.set(key.toString(), map.get(key));
			}
			return chatMessage;
		}
		throw new Exception(String.format("无法将对象[%1$s]转换至ChatMessage", item));
	}

	protected String getLogCat() {
		return "SYSAIAGENT";
	}
}
