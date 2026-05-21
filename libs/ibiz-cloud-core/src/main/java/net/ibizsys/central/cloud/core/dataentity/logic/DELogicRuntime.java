package net.ibizsys.central.cloud.core.dataentity.logic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionType;
import net.ibizsys.central.dataentity.logic.DELogicDebugModes;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.model.PSModelEnums.DELogicSysAIChatAgentType;
import net.ibizsys.model.PSModelEnums.LogicSubType;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.IPSDESysAIChatAgentLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogLevels;

public class DELogicRuntime extends net.ibizsys.central.dataentity.logic.DELogicRuntime implements IDELogicRuntime, IDEAIChatLogicRuntimeBase {

	private static final Log log = LogFactory.getLog(DELogicRuntime.class);
	public static final String CONSOLESENDER_DELOGICDEBUGGER = "DELogic调试信息";
	private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;
	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;

	public final static String AIAGENTTAG = "srfaiagenttag";

	private LogicSubType logicSubType = LogicSubType.NONE;

	@Override
	protected void onInit() throws Exception {
		if (StringUtils.hasLength(this.getPSDELogic().getLogicSubType())) {
			this.logicSubType = LogicSubType.from(this.getPSDELogic().getLogicSubType());
		}
		if (this.getDebugMode() != DELogicDebugModes.NONE) {
			if (this.getSystemRuntime() instanceof IServiceSystemRuntime) {
				if (((IServiceSystemRuntime) this.getSystemRuntime()).isEnableProdMode()) {
					String strLogCat = String.format("%1$s|%2$s(%3$s)", this.getDataEntityRuntime().getName(), this.getLogicName(), this.getPSDELogic().getCodeName());
					log.warn(String.format("处理逻辑[%1$s]调试模式在生产模式下禁用", strLogCat));
					this.setDebugMode(DELogicDebugModes.NONE);
				}
			}
		}

		super.onInit();
	}

	protected ISysCloudLogUtilRuntime getSysCloudLogUtilRuntime() {
		if (this.iSysCloudLogUtilRuntime == null) {
			this.iSysCloudLogUtilRuntime = this.getDELogicRuntimeContext().getSystemRuntime().getSysUtilRuntime(ISysCloudLogUtilRuntime.class, false);
		}
		return this.iSysCloudLogUtilRuntime;
	}

	protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
		if (this.iSysCacheUtilRuntime == null) {
			this.iSysCacheUtilRuntime = this.getDELogicRuntimeContext().getSystemRuntime().getSysUtilRuntime(ISysCacheUtilRuntime.class, false);
		}
		return this.iSysCacheUtilRuntime;
	}

	public LogicSubType getLogicSubType() {
		return this.logicSubType;
	}

	@Override
	protected IDELogicSession createDELogicSession(Map<String, Object> params) {
		if (params != null) {
			return new DELogicSession(this.getDELogicRuntimeContext(), params);
		}
		return createDELogicSession();
	}

	@Override
	protected IDELogicSession createDELogicSession() {
		return new DELogicSession(this.getDELogicRuntimeContext());
	}

	@Override
	public Object execute(Object[] args) throws Throwable {
		if (LogicSubType.AICHAT == getLogicSubType()) {
			//判断行为
			if(args != null && args.length>1 ) {
				if(args[1] instanceof Map) {
					Map<String, Object> params = (Map)args[1];
					String strAction = (String)params.get(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_ACTION);
					if(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_CHATCOMPLETION.equals(strAction)) {
						return superExecute(args);
					}
				}
			}
			
			Map<String, Object> params = new LinkedHashMap<String, Object>();
			// 关闭客户端通知
			params.put(PortalAsyncAction.FIELD_FULLTOPICTAG, null);
			params.put(PortalAsyncAction.FIELD_ACTIONTYPE, PortalAsyncActionType.ASYNCCHATCOMPLETION.getValue());
			return this.getSystemRuntime().asyncExecute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return superExecute(args);
				}

			}, args, params);
		} else
			// 其它模式
			return superExecute(args);
	}

	private Object superExecute(Object[] args) throws Throwable {
		return super.execute(args);
	}
	
	@Override
	protected void endSession(IDELogicSession iDELogicSession) {
		if (LogicSubType.AICHAT == getLogicSubType()) {
			Object ret = iDELogicSession.getResult();
			if(ret == null) {
				//判断lastreturn 
				if(iDELogicSession.getLastReturn() instanceof ChatCompletionResult || iDELogicSession.getLastReturn() instanceof ChatCompletionRequest) {
					iDELogicSession.setResult(iDELogicSession.getLastReturn());
				}
				else {
					//循环变量
					List<IPSDELogicParam> params = this.getPSDELogic().getPSDELogicParams();
					if (!ObjectUtils.isEmpty(params)) {
						try {
							for (IPSDELogicParam iPSDELogicParam : params) {
								IDELogicParamRuntime iDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false);
								if (iPSDELogicParam.isChatCompletionResultParam()) {
									Object paramValue = iDELogicParamRuntime.getReal(iDELogicSession);
									iDELogicSession.setResult(paramValue);
									break;
								}
							}
						}
						catch (Throwable ex) {
							log.debug(ex);
						}
					}
				}
			}
		}
		
		super.endSession(iDELogicSession);
	}

	@Override
	protected void onExecute(IDELogicSession iDELogicSession, Object[] args) throws Throwable {
		// 判断是否为AI聊天逻辑
		if (LogicSubType.AICHAT == getLogicSubType()) {
			Object req = iDELogicSession.getParamObject(DELOGIC_AICHAT_PARAM_CHATREQUEST);
			if (req instanceof ChatCompletionRequest) {
				ChatCompletionRequest chatCompletionRequest = (ChatCompletionRequest) req;
				String strCacheKey = String.format("ibiz-cloud-delogic-%1$s--%2$s-%3$s-%4$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), this.getPSDELogic().getLogicContextId(), chatCompletionRequest.getSessionId());
				Map<String, String> sessionParams = this.getSysCacheUtilRuntime().getAll(strCacheKey);
				// 清除
				if (!ObjectUtils.isEmpty(sessionParams)) {
					this.getSysCacheUtilRuntime().reset(strCacheKey);
					String strNextId = sessionParams.get("srfnextid");
					String strSkillServiceUrl = sessionParams.get("srfskillserviceurl");
					String strParamValues = sessionParams.get("srfparamvalues");
					String strAIAgentTag = sessionParams.get(AIAGENTTAG);
					// 恢复聊天标记
					chatCompletionRequest.set(AIAGENTTAG, strAIAgentTag);
					
					chatCompletionRequest.reset("srfskillserviceurl");
					if(StringUtils.hasLength(strSkillServiceUrl)) {
						chatCompletionRequest.set("srfskillserviceurl", strSkillServiceUrl);
					}
					
					if (!ObjectUtils.isEmpty(strParamValues)) {
						Map<String, Object> paramValues = JsonUtils.asMap(strParamValues);
						for (java.util.Map.Entry<String, Object> entry : paramValues.entrySet()) {
							IDELogicParamRuntime iDELogicParamRuntime = this.getDELogicParamRuntime(entry.getKey(), false);
							iDELogicParamRuntime.bind(iDELogicSession, entry.getValue());
						}
					}
					if (StringUtils.hasLength(strNextId)) {
						//判断是否为数组
						strNextId = strNextId.trim();
						if(strNextId.indexOf("{") == 0) {
							//JSON对象
							Map<String, Object> map = JsonUtils.asMap(strNextId);
							List<Map<String, Object>> list = (List)map.get("links");
							if(ObjectUtils.isEmpty(list)) {
								log.warn("可选连接清单无效");
								super.onExecute(iDELogicSession, args);
								return;
							}
							//获取用户输入内容
							if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
								log.warn("用户输入内容无效");
								super.onExecute(iDELogicSession, args);
								return;
							}
							
							String strContent = chatCompletionRequest.getMessages().get(chatCompletionRequest.getMessages().size()-1).getContent();
							if(StringUtils.hasLength(strContent)) {
								//去除回车等
								strContent = strContent.replace("\r\n","\n").replace("\n", "").replace(" ", "").trim();
							}
							else {
								strContent = "";
							}
							
							//循环可选连接
							for(Map<String, Object> item : list) {
								String strIndex = DataTypeUtils.asString(item.get("index"), null);
								String strId = DataTypeUtils.asString(item.get("id"), null);
								String strName = DataTypeUtils.asString(item.get("name"), null);
								if(ObjectUtils.isEmpty(strIndex)
										|| ObjectUtils.isEmpty(strId)
										|| ObjectUtils.isEmpty(strName)) {
									continue;
								}
								if(!("0".equals(strIndex)) && (strIndex.equalsIgnoreCase(strContent) || strName.equalsIgnoreCase(strContent))) {
									IPSDELogicNode nextPSDELogicNode = this.getPSDELogicNode(strId, true);
									if (nextPSDELogicNode != null) {
										this.onExecutePSDELogicNode(iDELogicSession, nextPSDELogicNode);
										return;
									}
									else {
										log.warn(String.format("指定下一步逻辑节点[%1$s]不存在，忽略直接跳转", strId));
										super.onExecute(iDELogicSession, args);
										return;
									}
								}
								else
									if("0".equals(strIndex)) {
										//默认连接
										IPSDELogicNode nextPSDELogicNode = this.getPSDELogicNode(strId, true);
										if (nextPSDELogicNode != null) {
											this.onExecutePSDELogicNode(iDELogicSession, nextPSDELogicNode);
											return;
										}
										else {
											log.warn(String.format("指定下一步逻辑节点[%1$s]不存在，忽略直接跳转", strId));
											super.onExecute(iDELogicSession, args);
											return;
										}
									}
							}
							
							String strId = DataTypeUtils.asString(map.get("id"), null);
							if(ObjectUtils.isEmpty(strId)) {
								log.warn(String.format("未指定节点标识，忽略直接跳转"));
								super.onExecute(iDELogicSession, args);
								return;
							}
							
							strNextId = strId;
						}
						
						IPSDELogicNode nextPSDELogicNode = this.getPSDELogicNode(strNextId, true);
						if (nextPSDELogicNode != null) {
							this.onExecutePSDELogicNode(iDELogicSession, nextPSDELogicNode);
							return;
						}
						else {
							log.warn(String.format("指定下一步逻辑节点[%1$s]不存在，忽略直接跳转", strNextId));
							super.onExecute(iDELogicSession, args);
							return;
						}
					}
				}
			}
		}

		super.onExecute(iDELogicSession, args);
	}

	@Override
	protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode, boolean bExecuteLink) throws Throwable {
		super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, bExecuteLink);
		if (LogicSubType.AICHAT == getLogicSubType() && iDELogicSession.getNext() == IDELogicSession.NEXT_END) {
			Object next_tag = iDELogicSession.getParamObject("__AICHAT_NEXT_END__", true);
			if (next_tag != null) {
				return;
			}
			iDELogicSession.setParamObject("__AICHAT_NEXT_END__", "1");
			if (iPSDELogicNode instanceof IPSDESysAIChatAgentLogic) {
				IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic = (IPSDESysAIChatAgentLogic) iPSDELogicNode;
				if (DELogicSysAIChatAgentType.CHATINPUT.value.equals(iPSDESysAIChatAgentLogic.getSubType()) || DELogicSysAIChatAgentType.CHATDECISION.value.equals(iPSDESysAIChatAgentLogic.getSubType())) {
					Object result = iDELogicSession.getResult();
					if (result instanceof ChatCompletionResult) {
						ChatCompletionResult chatCompletionResult = (ChatCompletionResult) result;
						// 放入结束原因
						chatCompletionResult.set("srfstopreason", DELogicSysAIChatAgentType.CHATINPUT.value);
					}
					Object value = iDELogicSession.getParamObject(DELOGIC_AICHAT_PARAM_CHATREQUEST);
					if (value instanceof ChatCompletionRequest) {
						ChatCompletionRequest chatCompletionRequest = (ChatCompletionRequest) value;
						String strAgentTag = (String) chatCompletionRequest.get(AIAGENTTAG);
						if (StringUtils.hasLength(chatCompletionRequest.getSessionId())) {
							if (DELogicSysAIChatAgentType.CHATINPUT.value.equals(iPSDESysAIChatAgentLogic.getSubType())) {
								if (!ObjectUtils.isEmpty(iPSDESysAIChatAgentLogic.getPSDELogicLinks())) {
									IPSDELogicNode dstPSDELogicNode = null;
									for (IPSDELogicLink iPSDELogicLink : iPSDESysAIChatAgentLogic.getPSDELogicLinks()) {
										if (iPSDELogicLink.isSubCallLink() || iPSDELogicLink.isCatchLink()) {
											continue;
										}
										dstPSDELogicNode = iPSDELogicLink.getDstPSDELogicNodeMust();
										break;
									}

									if (dstPSDELogicNode != null) {
										String strCacheKey = String.format("ibiz-cloud-delogic-%1$s--%2$s-%3$s-%4$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), this.getPSDELogic().getLogicContextId(), chatCompletionRequest.getSessionId());
										Map<String, String> sessionParams = new HashMap<String, String>();
										Map<String, Object> paramValueMap = backupAIChatLogicParams(iDELogicSession);
										sessionParams.put("srfparamvalues", JsonUtils.toString(paramValueMap));

										if (!ObjectUtils.isEmpty(strAgentTag)) {
											sessionParams.put(AIAGENTTAG, strAgentTag);
										}
										sessionParams.put("srfnextid", dstPSDELogicNode.getCodeName());
										this.getSysCacheUtilRuntime().set(strCacheKey, sessionParams, 7200);
									}
								}

							} else if (DELogicSysAIChatAgentType.CHATDECISION.value.equals(iPSDESysAIChatAgentLogic.getSubType())) {
								String strCacheKey = String.format("ibiz-cloud-delogic-%1$s--%2$s-%3$s-%4$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), this.getPSDELogic().getLogicContextId(), chatCompletionRequest.getSessionId());
								Map<String, String> sessionParams = new HashMap<String, String>();
								Map<String, Object> paramValueMap = backupAIChatLogicParams(iDELogicSession);
								sessionParams.put("srfparamvalues", JsonUtils.toString(paramValueMap));
								if (!ObjectUtils.isEmpty(strAgentTag)) {
									sessionParams.put(AIAGENTTAG, strAgentTag);
								}
								if(iDELogicSession.getLastReturn() instanceof String) {
									sessionParams.put("srfnextid", (String)iDELogicSession.getLastReturn());
								}
								else {
									sessionParams.put("srfnextid", JsonUtils.toString(iDELogicSession.getLastReturn()));
								}
								
								this.getSysCacheUtilRuntime().set(strCacheKey, sessionParams, 7200);
							}
						}
					}

				} else if (DELogicSysAIChatAgentType.CHATOUTPUT.value.equals(iPSDESysAIChatAgentLogic.getSubType())
						|| DELogicSysAIChatAgentType.CHATEXECUTESKILL.value.equals(iPSDESysAIChatAgentLogic.getSubType())) {
					if (iDELogicSession.getLastReturn() instanceof ChatCompletionResult) {
						ChatCompletionResult chatCompletionResult = (ChatCompletionResult) iDELogicSession.getLastReturn();
						String strStopReason = DataTypeUtils.asString(chatCompletionResult.get("srfstopreason"));
						String strSkillServiceUrl = DataTypeUtils.asString(chatCompletionResult.get("srfskillserviceurl"));
						if (DELogicSysAIChatAgentType.CHATINPUT.value.equals(strStopReason)) {
							Object value = iDELogicSession.getParamObject(DELOGIC_AICHAT_PARAM_CHATREQUEST);
							if (value instanceof ChatCompletionRequest) {
								ChatCompletionRequest chatCompletionRequest = (ChatCompletionRequest) value;
								String strAgentTag = (String) chatCompletionRequest.get(AIAGENTTAG);

								// 嵌套逻辑等待输入
								String strCacheKey = String.format("ibiz-cloud-delogic-%1$s--%2$s-%3$s-%4$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), this.getPSDELogic().getLogicContextId(), chatCompletionRequest.getSessionId());
								Map<String, String> sessionParams = new HashMap<String, String>();
								Map<String, Object> paramValueMap = backupAIChatLogicParams(iDELogicSession);
								sessionParams.put("srfparamvalues", JsonUtils.toString(paramValueMap));

								// 重新回到当前节点，并指定AIAGENTTAG
								if (!ObjectUtils.isEmpty(strAgentTag)) {
									sessionParams.put(AIAGENTTAG, strAgentTag);
								}
								sessionParams.put("srfnextid", iPSDELogicNode.getCodeName());
								if(StringUtils.hasLength(strSkillServiceUrl)) {
									sessionParams.put("srfskillserviceurl", strSkillServiceUrl);
								}
								this.getSysCacheUtilRuntime().set(strCacheKey, sessionParams, 7200);
								iDELogicSession.setResult(iDELogicSession.getLastReturn());
								return;
							}
						}
					}

					// 没有后续则直接返回结果
					if (ObjectUtils.isEmpty(iPSDESysAIChatAgentLogic.getPSDELogicLinks())) {
						iDELogicSession.setResult(iDELogicSession.getLastReturn());
					}
				} else if (DELogicSysAIChatAgentType.APPENDCHATRESULT.value.equals(iPSDESysAIChatAgentLogic.getSubType()) || DELogicSysAIChatAgentType.CHATSTEP.value.equals(iPSDESysAIChatAgentLogic.getSubType()) || DELogicSysAIChatAgentType.CHATUIACTION.value.equals(iPSDESysAIChatAgentLogic.getSubType())) {
					// 没有后续则直接返回结果
					if (!ObjectUtils.isEmpty(iPSDESysAIChatAgentLogic.getPSDELogicLinks())) {
						for (IPSDELogicLink iPSDELogicLink : iPSDESysAIChatAgentLogic.getPSDELogicLinks()) {
							if (iPSDELogicLink.isSubCallLink() || iPSDELogicLink.isCatchLink()) {
								continue;
							}
							//存在有效连接
							return;
						}
					}
					iDELogicSession.setResult(iDELogicSession.getLastReturn());
				}
			}
		}
	}

	protected Map<String, Object> backupAIChatLogicParams(IDELogicSession iDELogicSession) throws Throwable {
		Map<String, Object> paramValueMap = new LinkedHashMap<String, Object>();
		// 备份
		List<IPSDELogicParam> params = this.getPSDELogic().getPSDELogicParams();
		if (!ObjectUtils.isEmpty(params)) {
			for (IPSDELogicParam iPSDELogicParam : params) {
				IDELogicParamRuntime iDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false);
				if (iPSDELogicParam.isSimpleParam() || iPSDELogicParam.isSimpleListParam() || iPSDELogicParam.isEntityParam() || iPSDELogicParam.isEntityListParam()) {
					Object paramValue = iDELogicParamRuntime.getReal(iDELogicSession);
					paramValueMap.put(iPSDELogicParam.getCodeName(), paramValue);
				}
			}
		}
		return paramValueMap;
	}

	@Override
	public void resetChatCompletion(String sessionId) throws Throwable {
		if (LogicSubType.AICHAT != getLogicSubType()) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("逻辑子类[%1$s]不支持此操作", this.getLogicSubType().text));
		}
		String strCacheKey = String.format("ibiz-cloud-delogic-%1$s--%2$s-%3$s-%4$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), this.getPSDELogic().getLogicContextId(), sessionId);
		this.getSysCacheUtilRuntime().reset(strCacheKey);
	}

	@Override
	public void cancelChatCompletion(String portalAsyncActionId) throws Throwable {
		if (LogicSubType.AICHAT != getLogicSubType()) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("逻辑子类[%1$s]不支持此操作", this.getLogicSubType().text));
		}
		String strCancelTag = String.format("%1$s-ai-chatcompletion-canceltag--%2$s", CloudCacheTagUtils.PREFIX, portalAsyncActionId);
		// 120 秒内有效
		this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strCancelTag, "true", 120);
	}

	@Override
	protected void outputDebugInfo(IDELogicSession iDELogicSession, Throwable ex) {
		super.outputDebugInfo(iDELogicSession, ex);

		if (this.isOutputDebugInfo()) {

			// 格式化Console信息
			String strLogCat = String.format("%1$s|%2$s(%3$s)", this.getDataEntityRuntime().getName(), this.getLogicName(), this.getPSDELogic().getCodeName());

			String strInfo = getDebugConsoleInfo(iDELogicSession, ex);
			if (StringUtils.hasLength(strInfo)) {
				String[] infos = splitByLength(strInfo, 20480);
				for (String strPart : infos) {
					if (ex == null) {
						this.getSysCloudLogUtilRuntime().sendConsoleMessage(null, CONSOLESENDER_DELOGICDEBUGGER, false, LogLevels.INFO, strLogCat, strPart);
					} else {
						this.getSysCloudLogUtilRuntime().sendConsoleMessage(null, CONSOLESENDER_DELOGICDEBUGGER, false, LogLevels.ERROR, strLogCat, strPart);
					}
				}
			}
		}
	}

	public static String[] splitByLength(String str, int length) {
		int strLength = str.length();
		int arrayLength = (int) Math.ceil((double) strLength / length);
		String[] result = new String[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			int beginIndex = i * length;
			int endIndex = Math.min(beginIndex + length, strLength);
			result[i] = str.substring(beginIndex, endIndex);
		}
		return result;
	}

	protected String getDebugConsoleInfo(IDELogicSession iDELogicSession, Throwable ex) {
		if (iDELogicSession.getDebugArrayNode() != null) {
			StringBuilder sb = new StringBuilder();
			int nSize = iDELogicSession.getDebugArrayNode().size();
			int nBlank = 0;
			int nBlankLevel = 2;

			for (int i = 0; i < nSize; i++) {
				JsonNode jsonNode = iDELogicSession.getDebugArrayNode().get(i);
				if (!(jsonNode instanceof ObjectNode)) {
					continue;
				}

				ObjectNode objectNode = (ObjectNode) jsonNode;
				JsonNode type = objectNode.get("type");
				JsonNode time = objectNode.get("time");
				JsonNode name = objectNode.get("name");
				JsonNode info = objectNode.get("info");
				JsonNode data = objectNode.get("data");
				JsonNode codeName = objectNode.get("codeName");

				if (type == null) {
					continue;
				}
				sb.append("\r\n");
				for (int j = 0; j < nBlank; j++) {
					sb.append(" ");
				}
				if (time != null) {
					sb.append(time.asText());
					sb.append(" ");
				}
				String strType = type.asText();
				sb.append(String.format("[%1$s]", strType));
				if (name != null) {
					sb.append(String.format(" %1$s", name.asText()));
					if (codeName != null) {
						sb.append(String.format("(%1$s)", codeName.asText()));
					}
					if (info != null) {
						sb.append(String.format("， %1$s", info.asText()));
					}
				} else {
					if (info != null) {
						sb.append(String.format(" %1$s", info.asText()));
					}
				}

				if (data != null) {
					sb.append("\r\n");
					for (int j = 0; j < nBlank; j++) {
						sb.append(" ");
					}
					sb.append(" ");
					sb.append(data.toPrettyString());
				}

				if (IDELogicSession.DEBUGTYPE_ENTERNODE.equals(strType)) {
					nBlank += nBlankLevel;
				} else if (IDELogicSession.DEBUGTYPE_EXITNODE.equals(strType)) {
					nBlank -= nBlankLevel;
					if (nBlank < 0) {
						nBlank = 0;
					}
				}
			}
			sb.append("\r\n");
			sb.append("\r\n");
			return sb.toString();
		}

		return null;
	}

}
