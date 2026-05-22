package net.ibizsys.central.plugin.ai.agent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.difflib.DiffUtils;
import com.github.difflib.UnifiedDiffUtils;
import com.github.difflib.patch.Patch;

import net.ibizsys.central.cloud.core.ai.IAISkillAgentRuntimeBase;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatSkill;
import net.ibizsys.central.cloud.core.ai.SysAIFactoryRuntimeBase;
import net.ibizsys.central.cloud.core.ai.SysAIFactoryRuntimeException;
import net.ibizsys.central.cloud.core.eai.ISysEAIAgentRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.eai.ISysEAIMsgListener;
import net.ibizsys.central.plugin.ai.util.AIChatUtils;
import net.ibizsys.central.plugin.ai.util.python.PythonAIChatUtils;
import net.ibizsys.central.plugin.ai.util.python.PythonAIChatUtils.ExecuteResult;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeBase;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.AIAgentDynamicMode;
import net.ibizsys.model.PSModelEnums.AIChatAgentType;
import net.ibizsys.model.PSModelEnums.DataSyncDir;
import net.ibizsys.model.PSModelEnums.MsgTemplEngine;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.PSSysDataSyncAgentImpl;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.SysDataSyncAgentTypes;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;

public abstract class DefaultSysAIFactoryRuntimeBase extends SysAIFactoryRuntimeBase implements ISysAIFactoryRuntime ,IAISkillAgentRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DefaultSysAIFactoryRuntimeBase.class);

	protected static class ToolCallFuture {
		public final CompletableFuture<String> future;
		public final String command;
		public final Map<String, Object> args;
		public final Map<String, Object> params;
		public boolean wait = false;
		public Map<Integer, File> files = new LinkedHashMap<>();

		public ToolCallFuture(CompletableFuture<String> future, String command, Map<String, Object> args, Map<String, Object> params) {
			this.future = future;
			this.command = command;
			this.args = args;
			this.params = params;
		}
	}

	/**
	 * 文件分类：临时文件
	 */
	public final static String CAT_TEMP = "temp";

	public final static int FILE_CHUNK_SIZE = 64 * 1024;

	private String strPythonCommandPath = "python3";
	private ISysEAIAgentRuntime informAgentRuntime = null;
	private File skillsWorkspace = null;
	private Map<String, ToolCallFuture> toolCallSessionMap = new ConcurrentHashMap<String, ToolCallFuture>();
	private boolean bEnableLocalToolCall = false;
	private boolean bEnableSkillDetection = false;
	private boolean bEnableKnowledgeBase = true;
	private Map<String, Object> skillEnv = null;

	/**
	 * AI工厂通知代理代码标识
	 */
	public final static String AIFACTORYINFORMAGENT_CODENAME = "AIFactoryInformAgent";

	public final static String SESSIONKEY_SKILLRUNNER_USERID = "skillrunner_userid";

	public final static String SKILLRUNNER_USERID_UNKNOWN = "unknown";

	private int nToolCallTimeout = 60;

	private ISysEAIMsgListener iSysEAIMsgListener = new ISysEAIMsgListener() {

		@Override
		public void recv(String strTopic, String strData) {
			DefaultSysAIFactoryRuntimeBase.this.recvToolCallResult(strTopic, strData);
		}
	};

	@Override
	protected ISysAIFactoryRuntimeContext createSysAIFactoryRuntimeContext() {
		return new SysAIFactoryRuntimeContextBase(super.createSysAIFactoryRuntimeContext()) {

			@Override
			public String getPythonCommandPath() {
				return DefaultSysAIFactoryRuntimeBase.this.getPythonCommandPath();
			}

			@Override
			public Object toolCall(String command, Map<String, Object> args, Map<String, Object> params) throws Throwable {
				return DefaultSysAIFactoryRuntimeBase.this.toolCall(command, args, params);
			}

			@Override
			public File getSkillsWorkspace() {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillsWorkspace(false);
			}

			@Override
			public String getSkillChatSessionContent(String skillId, String chatSessionId, String defaultContent) {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillChatSessionContent(skillId, chatSessionId, defaultContent);
			}

			@Override
			public void updateSkillChatSessionContent(String skillId, String chatSessionId, String content) {
				DefaultSysAIFactoryRuntimeBase.this.updateSkillChatSessionContent(skillId, chatSessionId, content);
			}

			@Override
			public boolean isEnableSkillDetection() {
				return DefaultSysAIFactoryRuntimeBase.this.isEnableSkillDetection();
			}

			@Override
			public File getSkillsWorkspace(boolean aiFactory) {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillsWorkspace(aiFactory);
			}

			@Override
			public Map<String, String> getSkillRunnerData() {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillRunnerData();
			}

			@Override
			public Map<String, Object> getSkillEnv() {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillEnv();
			}

			@Override
			public boolean isEnableKnowledgeBase() {
				return DefaultSysAIFactoryRuntimeBase.this.isEnableKnowledgeBase();
			}
		};
	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		super.onPrepareDefaultSetting();
		this.setPythonCommandPath(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".python.path", this.getPythonCommandPath()));

		String strToolCallLocal = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".toolcall.local", "false");
		if (DataTypeUtils.asBoolean(strToolCallLocal, false)) {
			this.setEnableLocalToolCall(true);
		}

		String strSkillDetection = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".skill.detection", "false");
		if (DataTypeUtils.asBoolean(strSkillDetection, false)) {
			this.setEnableSkillDetection(true);
		}

		Map<String, Object> skillEnv = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".skill.env", new HashMap<String, Object>());
		this.setSkillEnv(skillEnv);
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		this.skillsWorkspace = new File(this.getWorkspace().getCanonicalPath() + File.separator + "skills_data");
		if (!this.skillsWorkspace.exists()) {
			this.skillsWorkspace.mkdirs();
		}

		if (this.getInformAgent(true) == null) {
			this.prepareInformAgent();

			if (this.getInformAgent(true) == null) {
				this.getSystemRuntime().logEvent(LogLevels.WARN, this.getLogCat(), String.format("AI工厂通知代理对象无效，无法进行主动通知操作"), null);
			}
		}
	}

	protected String getPythonCommandPath() {
		return this.strPythonCommandPath;
	}

	protected void setPythonCommandPath(String strPythonCommandPath) {
		this.strPythonCommandPath = strPythonCommandPath;
	}

	protected boolean isEnableSkillDetection() {
		return this.bEnableSkillDetection;
	}

	protected void setEnableSkillDetection(boolean bEnableSkillDetection) {
		this.bEnableSkillDetection = bEnableSkillDetection;
	}

	protected void setSkillEnv(Map<String, Object> skillEnv) {
		this.skillEnv = skillEnv;
	}

	protected Map<String, Object> getSkillEnv() {
		return this.skillEnv;
	}

	protected boolean isEnableKnowledgeBase() {
		return this.bEnableKnowledgeBase;
	}

	protected void setEnableKnowledgeBase(boolean bEnableKnowledgeBase) {
		this.bEnableKnowledgeBase = bEnableKnowledgeBase;
	}

	protected File getSkillsWorkspace(boolean local) {
		String strWorkspacePath = null;
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();

		if (!local) {
			Map<String, String> params = this.getSkillRunnerData();
			if (!ObjectUtils.isEmpty(params)) {
				strWorkspacePath = DataTypeUtils.asString((String) params.get(SKILLRUNNER_WORKSPACE), "");
				if (StringUtils.hasLength(strWorkspacePath)) {
					return new File(strWorkspacePath);
				}
			}
		}

		if (iEmployeeContext != null) {
			try {
				strWorkspacePath = this.skillsWorkspace.getCanonicalPath() + File.separator + KeyValueUtils.genUniqueId(iEmployeeContext.getUserid());
			} catch (IOException ex) {
				log.error(ex);
			}
		}

		if (StringUtils.hasLength(strWorkspacePath)) {
			File file = new File(strWorkspacePath);
			if (!file.exists()) {
				file.mkdirs();
			}
			return file;
		}

		return this.skillsWorkspace;
	}

	protected ISysEAIAgentRuntime getInformAgent() {
		return this.getInformAgent(false);
	}

	protected ISysEAIAgentRuntime getInformAgent(boolean bTryMode) {
		if (this.informAgentRuntime != null || bTryMode) {
			return this.informAgentRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定通知代理对象");
	}

	protected void setInformAgent(ISysEAIAgentRuntime informAgentRuntime) {
		this.informAgentRuntime = informAgentRuntime;
	}

	protected void prepareInformAgent() throws Exception {

		Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".informagent", null);
		if (ObjectUtils.isEmpty(params)) {
			return;
		}
		IPSSysDataSyncAgent iPSSysDataSyncAgent = this.createInformPSSysDataSyncAgent(params);
		ISysEAIAgentRuntime iSysDataSyncAgentRuntime = (ISysEAIAgentRuntime) this.getSystemRuntime().createSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
		iSysDataSyncAgentRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysDataSyncAgent);
		this.setInformAgent(iSysDataSyncAgentRuntime);

		iSysDataSyncAgentRuntime.registerSysEAIMsgListener(this.iSysEAIMsgListener);
	}

	/**
	 * 获取通知的数据同步代理
	 *
	 * @param iSystemRuntimeContext
	 * @return
	 * @throws Exception
	 */
	protected IPSSysDataSyncAgent createInformPSSysDataSyncAgent(Map<String, Object> params) throws Exception {

		Assert.notNull(params, "传入参数无效");

		ObjectNode objNode = JsonUtils.createObjectNode();

		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETNAME, "AI工厂通知代理");
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETCODENAME, AIFACTORYINFORMAGENT_CODENAME);
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAGENTTYPE, DataTypeUtils.getStringValue(params.get("agenttype"), SysDataSyncAgentTypes.MQTT));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETTOPIC, DataTypeUtils.getStringValue(params.get("topic"), "/tool_call_receiver"));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETSYNCDIR, DataSyncDir.IN.value);
		objNode.put(PSSysDataSyncAgentImpl.ATTR_ISRAWDATAMODE, true);
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETSERVICEPATH, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_SERVICEURL), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETSERVICEPARAM, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_SERVICEPARAM), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETSERVICEPARAM2, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_SERVICEPARAM2), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHMODE, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_AUTHMODE), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHPARAM, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_AUTHPARAM), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHPARAM2, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_AUTHPARAM2), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHCLIENTID, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_CLIENTID), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHCLIENTSECRET, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_CLIENTSECRET), null));

		return (IPSSysDataSyncAgent) this.getSystemRuntimeContext().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getSystemRuntimeContext().getPSSystemService().getPSSystem(), IPSSysDataSyncAgent.class, objNode);
	}

	@Override
	protected ISysAIChatSkill createSysAIChatSkill(Object skillData) throws Exception {
		if (skillData instanceof File)
			return new DefaultSysAIChatSkill();
		return super.createSysAIChatSkill(skillData);
	}

	@Override
	protected ISysAIChatAgentRuntime createDefaultSysAIChatAgentRuntime(IPSSysAIChatAgent iPSSysAIChatAgent) throws Exception {

		if (iPSSysAIChatAgent.getDynamicMode() == AIAgentDynamicMode.STATIC.value) {
			AIChatAgentType aiChatAgentType = AIChatAgentType.from(iPSSysAIChatAgent.getAgentType());
			if (aiChatAgentType == AIChatAgentType.DEFAULT && MsgTemplEngine.FREEMARKER.value.equals(iPSSysAIChatAgent.getTemplEngine())) {
				return new DefaultSysAIChatAgentRuntime();
			}

			if (aiChatAgentType == AIChatAgentType.DE && MsgTemplEngine.FREEMARKER.value.equals(iPSSysAIChatAgent.getTemplEngine())) {
				return new DESysAIChatAgentRuntime();
			}

			switch (aiChatAgentType) {
			case HUB:
				return new HubSysAIChatAgentRuntime();
			case SKILL:
				return new SkillSysAIChatAgentRuntime();
			case SCRIPT:
				return new ScriptSysAIChatAgentRuntime();
			default:
				return super.createDefaultSysAIChatAgentRuntime(iPSSysAIChatAgent);
			}
		}

		return super.createDefaultSysAIChatAgentRuntime(iPSSysAIChatAgent);
	}

	protected String getSkillChatSessionContent(String skillId, String chatSessionId, String defaultContent) {
		if (defaultContent == null) {
			defaultContent = "[未定义]";
		}
		if (ObjectUtils.isEmpty(skillId) || ObjectUtils.isEmpty(chatSessionId)) {
			return defaultContent;
		}
		String strCacheKey = getSkillChatSessionCacheKey(skillId, chatSessionId);
		String strContent = this.getSystemRuntime().getSysCacheUtilRuntime(false).get(strCacheKey);
		if (!ObjectUtils.isEmpty(strContent)) {
			this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strCacheKey, strContent, 3600);
		}
		return ObjectUtils.isEmpty(strContent) ? defaultContent : strContent;
	}

	protected void updateSkillChatSessionContent(String skillId, String chatSessionId, String content) {
		String strCacheKey = getSkillChatSessionCacheKey(skillId, chatSessionId);
		if (StringUtils.hasLength(content)) {
			this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strCacheKey, content, 3600);
		} else
			this.getSystemRuntime().getSysCacheUtilRuntime(false).reset(strCacheKey);
	}

	protected Object toolCall(String command, Map<String, Object> args, Map<String, Object> params) throws Throwable {

		ISysEAIAgentRuntime iSysEAIAgentRuntime = this.getInformAgent(true);
		if (iSysEAIAgentRuntime != null) {
			String strToolCallInformTopic = this.getToolCallInformTopic();
			if (StringUtils.hasLength(strToolCallInformTopic)) {
				String strSkillId = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID));
				// 特殊处理上传和下载文件
				boolean bSendNotify = true;
				File realFile = null;
				if (IAIChatSkillAgentRuntimeBase.COMMAND_UPLOAD_FILE.equalsIgnoreCase(command)) {

					if (ObjectUtils.isEmpty(strSkillId)) {
						throw new Exception("未传入技能标识");
					}

					String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
					if (ObjectUtils.isEmpty(strFilePath)) {
						return String.format("上传文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
					}
					String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strFilePath);

					realFile = new File(strRealPath);
					if (realFile.exists()) {
						bSendNotify = false;
					}
				} else if (IAIChatSkillAgentRuntimeBase.COMMAND_DOWNLOAD_FILE.equalsIgnoreCase(command)) {

					String strUrl = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_DOWNLOAD_FILE_URL));
					if (ObjectUtils.isEmpty(strUrl)) {
						return String.format("下载文件发生异常，返回以下信息：\n未传入下载路径`url`");
					}

					String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
					if (ObjectUtils.isEmpty(strFilePath)) {
						// return
						// String.format("下载文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
						strFilePath = "tmp_" + KeyValueUtils.genUniqueId();
					} else {
						if (strFilePath.lastIndexOf("/") == strFilePath.length() - 1) {
							strFilePath += "tmp_" + KeyValueUtils.genUniqueId();
						}
					}

					String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strFilePath);
					realFile = new File(strRealPath);
					realFile.getParentFile().mkdirs();

					// 判断下载前缀
					try {
						IWebClientRep downloadRet = null;
						if (strUrl.toLowerCase().indexOf("lb://ibizcloud") == 0) {
							downloadRet = this.getSystemRuntime().getSysCloudClientUtilRuntime(false).getServiceClient(strUrl).download(strUrl, realFile);
						} else {
							downloadRet = this.getSystemRuntime().getDefaultWebClient().download(strUrl, realFile);
						}
						if (!realFile.exists()) {
							throw new Exception(String.format("无法写入本地缓存[%1$s]", realFile.getCanonicalPath()));
						}

						// 判断文件名称是否有后缀
						if (realFile.getName().indexOf(".") == -1 && realFile.getName().length() >= 20) {
							String strRealFileName = (String) downloadRet.getBody();
							if (StringUtils.hasLength(strRealFileName) && !strRealFileName.equals(realFile.getName())) {
								String strExt = FilenameUtils.getExtension(strRealFileName);
								if (StringUtils.hasLength(strExt)) {
									strExt = "." + strExt;
								}
								String strSimpleName = FilenameUtils.getBaseName(strRealFileName);
								if (StringUtils.hasLength(strSimpleName)) {

									int nIndex = 0;
									while (true) {
										String strNewName = String.format("%1$s%2$s%3$s", strSimpleName, (nIndex == 0) ? "" : String.format("(%1$s)", nIndex), strExt);
										File newFile = new File(realFile.getParentFile(), strNewName);
										if (!newFile.exists()) {
											// 拷贝文件
											try {
												FileUtils.moveFile(realFile, newFile);
												realFile = newFile;
												// 将下载文件改掉
												int nPos = strFilePath.lastIndexOf("/");
												if (nPos == -1) {
													strFilePath = newFile.getName();
												} else {
													strFilePath = strFilePath.substring(0, nPos + 1) + newFile.getName();
												}
												args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, strFilePath);
												break;
											} catch (Throwable ex) {
												log.error(ex);
												break;
											}
										}

										nIndex++;
										if (nIndex >= 100)
											break;
									}
								}
							}
						}
					} catch (Throwable ex) {
						throw new Exception(String.format("下载文件发生异常，%1$s", ex.getMessage()), ex);
					}

					// 使用 try-with-resources 自动关闭流，防止资源泄露
					try (InputStream inputStream = new FileInputStream(realFile)) {

						byte[] buffer = new byte[64 * 1024];
						int bytesRead;

						Map<String, Object> data = new LinkedHashMap<String, Object>();
						data.putAll(args);

						int nIndex = 0;
						// 循环读取，直到文件末尾 (read 返回 -1)
						while ((bytesRead = inputStream.read(buffer)) != -1) {
							String strData = null;
							if (bytesRead < FILE_CHUNK_SIZE) {
								byte[] chunk = new byte[bytesRead];
								System.arraycopy(buffer, 0, chunk, 0, bytesRead);
								strData = Base64.getEncoder().encodeToString(chunk);
							} else {
								strData = Base64.getEncoder().encodeToString(buffer);
							}

							data.put("index", nIndex);
							data.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT, strData);
							nIndex++;

							Map<String, Object> msg = new LinkedHashMap<String, Object>();
							msg.put("command", command);
							msg.put("args", data);
							// msg.put("tool_call_id", strToolCallId);
							// msg.put("result_topic",
							// iSysEAIAgentRuntime.getTopics().get(0));
							try {
								iSysEAIAgentRuntime.send(strToolCallInformTopic, JsonUtils.toString(msg));
							} catch (Throwable ex) {
								log.error(String.format("发送工具调用通知发生异常，%1$s", ex.getMessage()), ex);
								throw new Exception(String.format("发送工具调用通知发生异常，%1$s", ex.getMessage()));
							}
						}
					} catch (IOException ex) {
						throw new Exception(String.format("同步下载文件发生异常，%1$s", ex.getMessage()), ex);
					}

					args.put("size", realFile.length());
				}

				Object ret = null;
				ToolCallFuture toolCallFuture = null;
				if (bSendNotify) {
					// 发送消息，并等待消息接收
					String strToolCallId = KeyValueUtils.genUniqueId();
					Map<String, Object> msg = new LinkedHashMap<String, Object>();
					msg.put("command", command);
					msg.put("args", args);
					msg.put("tool_call_id", strToolCallId);
					msg.put("result_topic", iSysEAIAgentRuntime.getTopics().get(0));

					Object scope = params.get(ISysAIAgentRuntime.SCOPE);
					if (!ObjectUtils.isEmpty(scope)) {
						msg.put("scope", scope);
					}

					Object agentTag = params.get(ISysAIAgentRuntime.AIAGENTTAG);
					if (!ObjectUtils.isEmpty(agentTag)) {
						msg.put("agent_tag", agentTag);
					}

					if (!ObjectUtils.isEmpty(strSkillId)) {
						if (!IAIChatSkillAgentRuntimeBase.SKILLS_WORKSPACE.equalsIgnoreCase(strSkillId)) {
							ISysAIChatSkill iSysAIChatSkill = this.getAIChatSkill(strSkillId, true);
							if (iSysAIChatSkill != null && iSysAIChatSkill.isExtended()) {
								if (!ObjectUtils.isEmpty(iSysAIChatSkill.getExtendedScripts())) {
									msg.put("extended", iSysAIChatSkill.getExtendedScripts());
								}
							}
						}
					}

					CompletableFuture<String> future = new CompletableFuture<>();
					toolCallFuture = new ToolCallFuture(future, command, args, params);
					try {
						toolCallSessionMap.put(strToolCallId, toolCallFuture);
						iSysEAIAgentRuntime.send(strToolCallInformTopic, JsonUtils.toString(msg));
					} catch (Throwable ex) {
						toolCallSessionMap.remove(strToolCallId);
						log.error(String.format("发送工具调用通知发生异常，%1$s", ex.getMessage()), ex);
						throw new Exception(String.format("发送工具调用通知发生异常，%1$s", ex.getMessage()));
					}

					try {
						while (true) {
							try {
								ret = future.get(nToolCallTimeout, TimeUnit.SECONDS);
								break;
							} catch (TimeoutException ex) {
								if (!toolCallFuture.wait)
									throw ex;
							}
						}
					} catch (Throwable ex) {
						log.error(String.format("等待工具调用结果发生异常，%1$s", ex.getMessage()), ex);
						try {
							future.cancel(true);
						} catch (Throwable ex2) {
							log.error(String.format("取消等待处理发生异常，%1$s", ex2.getMessage()), ex2);
						}
						if (ex instanceof TimeoutException) {
							throw new Exception(String.format("等待工具调用结果超时"));
						}
						throw new Exception(String.format("等待工具调用结果发生异常，%1$s", ex.getMessage()));
					} finally {
						toolCallSessionMap.remove(strToolCallId);
					}
				}

				if (IAIChatSkillAgentRuntimeBase.COMMAND_UPLOAD_FILE.equalsIgnoreCase(command) && realFile != null) {
					if (toolCallFuture != null) {
						// 循环写入文件
						if (!realFile.exists()) {
							realFile.getParentFile().mkdirs();
						} else {
							realFile.delete();
						}
						boolean bAppend = false;
						for (java.util.Map.Entry<Integer, File> entry : toolCallFuture.files.entrySet()) {
							FileUtils.writeByteArrayToFile(realFile, Base64.getDecoder().decode(FileUtils.readFileToString(entry.getValue(), "UTF-8")), bAppend);
							if (!bAppend) {
								bAppend = true;
							}
						}
					}

					if (realFile.exists()) {
						// 执行上传操作
						ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysFileUtilRuntime(false);
						try {
							net.ibizsys.runtime.util.domain.File file = iSysFileUtilRuntime.createOSSFile(realFile, CAT_TEMP);
							Map<String, Object> map = new LinkedHashMap<String, Object>();
							map.put("id", file.getFileId());
							map.put("folder", CAT_TEMP);
							map.put("name", realFile.getName());
							return String.format("上传文件成功，返回以下内容：\n%1$s", JsonUtils.toString(map));
						} catch (Throwable ex) {
							throw new Exception(String.format("上传文件发生异常，%1$s", ex.getMessage()), ex);
						}
					}

				}

				return ret;
			} else {
				log.warn(String.format("无法获取远程ToolCall通知主题，使用本地处理"));
			}
		}

		if (!isEnableLocalToolCall()) {
			throw new Exception(String.format("当前无可用SkillRunner，无法执行工具调用"));
		}

		return this.doLocalToolCall(command, args, params);
	}

	protected boolean isEnableLocalToolCall() {
		return this.bEnableLocalToolCall;
	}

	protected void setEnableLocalToolCall(boolean bEnableLocalToolCall) {
		this.bEnableLocalToolCall = bEnableLocalToolCall;
	}

	protected Object doLocalToolCall(String command, Map<String, Object> args, Map<String, Object> params) throws Throwable {
		String strSkillId = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID));
		if (ObjectUtils.isEmpty(strSkillId)) {
			throw new Exception("未传入技能标识");
		}

		boolean bFromTemplate = DataTypeUtils.asBoolean(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE), false);

		if (IAIChatSkillAgentRuntimeBase.SKILLS_WORKSPACE.equalsIgnoreCase(strSkillId)) {
			if (IAIChatSkillAgentRuntimeBase.COMMAND_EXECUTE_BASH.equals(command)) {
				String strCommand = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_BASH_COMMAND));
				if (ObjectUtils.isEmpty(strCommand)) {
					throw new Exception("未传入执行命令");
				}

				// 判断是否需要写入文件
				File file = null;
				String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
				if (!ObjectUtils.isEmpty(strFilePath)) {
					//strFilePath = strFilePath.replace("{SKILLS_WORKSPACE}", this.getSkillsWorkspace(true).getCanonicalPath());
					
					strFilePath = AIChatUtils.replacePlaceHolderPath(strFilePath, "SKILLS_WORKSPACE", this.getSkillsWorkspace(true).getCanonicalPath());

					String strContent = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT), "");
					String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strFilePath);
					// 判断文件是否存在
					file = new File(strRealPath);
					if (file.getCanonicalPath().indexOf(this.getSkillsWorkspace(true).getCanonicalPath()) != 0) {
						return String.format("写入文件发生异常，返回以下信息：\n文件实际路径[%1$s]不在Agent工作区中，禁止访问！", file.getCanonicalPath());
					}
					if (file.exists()) {
						FileUtils.writeStringToFile(file, strContent, "UTF-8");
					} else {
						if (!file.getParentFile().exists()) {
							file.getParentFile().mkdirs();
						}
						FileUtils.writeStringToFile(file, strContent, "UTF-8");
					}
				}

				//strCommand = strCommand.replace("{SKILLS_WORKSPACE}", this.getSkillsWorkspace(true).getCanonicalPath());
				strCommand = AIChatUtils.replacePlaceHolderPath(strCommand, "SKILLS_WORKSPACE", this.getSkillsWorkspace(true).getCanonicalPath());
				try {
					ExecuteResult executeResult = PythonAIChatUtils.executeCommand(strCommand, this.getSkillsWorkspace(true));
					if (bFromTemplate) {
						return executeResult.standardOutput;
					}
					if (file != null) {
						return String.format("写入文件[%1$s]成功\n", file.getCanonicalPath()) + String.format("执行命令成功，返回以下内容：\n%1$s", executeResult.standardOutput);
					}
					return String.format("执行命令成功，返回以下内容：\n%1$s", executeResult.standardOutput);
				} catch (Throwable ex) {
					if (ex instanceof ExecuteException) {
						return String.format("执行命令发生错误，返回以下信息：\n%1$s", ((ExecuteException) ex).getMessage());
					}
					return String.format("执行命令发生错误，返回以下信息：\n%1$s", ex.getMessage());
				}
			}

			if (IAIChatSkillAgentRuntimeBase.COMMAND_READ_FILE.equals(command)) {
				// 判断文件是否存在
				String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
				if (ObjectUtils.isEmpty(strFilePath)) {
					return String.format("读取文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
				}

				String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strFilePath);
				// 判断文件是否存在
				File file = new File(strRealPath);
				// 判断文件是否在全局目录下
				if (file.getCanonicalPath().indexOf(this.getSkillsWorkspace(true).getCanonicalPath()) != 0) {
					return String.format("读取文件发生异常，返回以下信息：\n文件实际路径[%1$s]不在工作区中，禁止访问！", file.getCanonicalPath());
				}

				if (file.exists()) {
					if (bFromTemplate) {
						return FileUtils.readFileToString(file, "UTF-8");
					}
					return String.format("读取文件成功，内容如下：\n%1$s", FileUtils.readFileToString(file, "UTF-8"));
				}

				return String.format("读取文件发生异常，返回以下信息：\n指定文件[%1$s]不存在", file.getCanonicalPath());
			}

			if (IAIChatSkillAgentRuntimeBase.COMMAND_WRITE_FILE.equals(command)) {
				// 判断文件是否存在
				String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
				if (ObjectUtils.isEmpty(strFilePath)) {
					return String.format("写入文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
				}

				String strContent = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT), "");

				String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strFilePath);
				// 判断文件是否存在
				File file = new File(strRealPath);
				if (file.getCanonicalPath().indexOf(this.getSkillsWorkspace(true).getCanonicalPath()) != 0) {
					// throw new
					// Exception(String.format("文件实际路径[%1$s]不在工作区中，禁止访问！",
					// file.getCanonicalPath()));
					return String.format("写入文件发生异常，返回以下信息：\n文件实际路径[%1$s]不在Agent工作区中，禁止访问！", file.getCanonicalPath());
				}

				if (file.exists()) {
					FileUtils.writeStringToFile(file, strContent, "UTF-8");
					if (bFromTemplate) {
						return "";
					}
					return String.format("写入文件[%1$s]成功", file.getCanonicalPath());
				}

				if (!file.getParentFile().exists()) {
					file.getParentFile().mkdirs();
				}

				FileUtils.writeStringToFile(file, strContent, "UTF-8");
				if (bFromTemplate) {
					return "";
				}
				return String.format("写入文件[%1$s]成功", file.getCanonicalPath());
			}

			if (IAIChatSkillAgentRuntimeBase.COMMAND_UPLOAD_FILE.equalsIgnoreCase(command)) {
				String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
				if (ObjectUtils.isEmpty(strFilePath)) {
					return String.format("上传文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
				}
				String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strFilePath);
				// 判断文件是否存在
				File realFile = new File(strRealPath);
				// 判断文件是否在全局目录下
				if (realFile.getCanonicalPath().indexOf(this.getSkillsWorkspace(true).getCanonicalPath()) != 0) {
					return String.format("上传文件发生异常，返回以下信息：\n文件实际路径[%1$s]不在Agent工作区中，禁止访问！", realFile.getCanonicalPath());
				}

				if (realFile.exists()) {
					// 执行上传操作
					ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysFileUtilRuntime(false);
					try {
						net.ibizsys.runtime.util.domain.File file = iSysFileUtilRuntime.createOSSFile(realFile, CAT_TEMP);
						Map<String, Object> map = new LinkedHashMap<String, Object>();
						map.put("id", file.getFileId());
						map.put("folder", CAT_TEMP);
						map.put("name", realFile.getName());
						return String.format("上传文件成功，返回以下内容：\n%1$s", JsonUtils.toString(map));

					} catch (Throwable ex) {
						throw new Exception(String.format("上传文件发生异常，%1$s", ex.getMessage()), ex);
					}
				}

				return String.format("上传文件发生异常，返回以下信息：\n指定文件[%1$s]不存在", realFile.getCanonicalPath());
			}

			if (IAIChatSkillAgentRuntimeBase.COMMAND_DOWNLOAD_FILE.equalsIgnoreCase(command)) {

				String strUrl = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_DOWNLOAD_FILE_URL));
				if (ObjectUtils.isEmpty(strUrl)) {
					return String.format("下载文件发生异常，返回以下信息：\n未传入下载路径`url`");
				}

				String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
				if (ObjectUtils.isEmpty(strFilePath)) {
					// return
					// String.format("下载文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
					strFilePath = "tmp_" + KeyValueUtils.genUniqueId();
				} else {
					if (strFilePath.lastIndexOf("/") == strFilePath.length() - 1) {
						strFilePath += "tmp_" + KeyValueUtils.genUniqueId();
					}
				}

				String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strFilePath);
				File realFile = new File(strRealPath);
				realFile.getParentFile().mkdirs();

				// 判断下载前缀
				try {
					IWebClientRep downloadRet = null;
					if (strUrl.toLowerCase().indexOf("lb://ibizcloud") == 0) {
						downloadRet = this.getSystemRuntime().getSysCloudClientUtilRuntime(false).getServiceClient(strUrl).download(strUrl, realFile);
					} else {
						downloadRet = this.getSystemRuntime().getDefaultWebClient().download(strUrl, realFile);
					}
					if (!realFile.exists()) {
						throw new Exception(String.format("无法写入本地缓存[%1$s]", realFile.getCanonicalPath()));
					}

					// 判断文件名称是否有后缀
					if (realFile.getName().indexOf(".") == -1 && realFile.getName().length() >= 20) {
						String strRealFileName = (String) downloadRet.getBody();
						if (StringUtils.hasLength(strRealFileName) && !strRealFileName.equals(realFile.getName())) {
							String strExt = FilenameUtils.getExtension(strRealFileName);
							if (StringUtils.hasLength(strExt)) {
								strExt = "." + strExt;
							}
							String strSimpleName = FilenameUtils.getBaseName(strRealFileName);
							if (StringUtils.hasLength(strSimpleName)) {
								int nIndex = 0;
								while (true) {
									String strNewName = String.format("%1$s%2$s%3$s", strSimpleName, (nIndex == 0) ? "" : String.format("(%1$s)", nIndex), strExt);
									File newFile = new File(realFile.getParentFile(), strNewName);
									if (!newFile.exists()) {
										// 拷贝文件
										try {
											FileUtils.moveFile(realFile, newFile);
											realFile = newFile;
											break;
										} catch (Throwable ex) {
											log.error(ex);
											break;
										}
									}

									nIndex++;
									if (nIndex >= 100)
										break;
								}
							}
						}
					}
				} catch (Throwable ex) {
					throw new Exception(String.format("下载文件发生异常，%1$s", ex.getMessage()), ex);
				}

				return String.format("下载文件[%1$s]成功", realFile.getCanonicalPath());
			}

			if (IAIChatSkillAgentRuntimeBase.COMMAND_APPLY_PATCH.equals(command)) {
				// 判断文件是否存在
				String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
				if (ObjectUtils.isEmpty(strFilePath)) {
					return String.format("应用补丁发生异常，返回以下信息：\n未传入应用文件路径`file_path`");
				}

				String strNewFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_APPLY_PATCH_NEW_FILE_PATH));
				if (ObjectUtils.isEmpty(strNewFilePath)) {
					return String.format("应用补丁发生异常，返回以下信息：\n未传入写入文件路径`new_file_path`");
				}

				String strUnifiedDiff = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_APPLY_PATCH_UNIFIED_DIFF));
				if (ObjectUtils.isEmpty(strUnifiedDiff)) {
					return String.format("应用补丁发生异常，返回以下信息：\n未传入写入补丁内容`unified_diff`");
				}

				String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strFilePath);
				// 判断文件是否存在
				File file = new File(strRealPath);
				if (file.getCanonicalPath().indexOf(this.getSkillsWorkspace(true).getCanonicalPath()) != 0) {
					return String.format("应用补丁发生异常，返回以下信息：\n应用文件实际路径[%1$s]不在Agent工作区中，禁止访问！", file.getCanonicalPath());
				}

				if (!file.exists()) {
					return String.format("应用补丁发生异常，返回以下信息：\n应用文件[%1$s]不存在！", file.getCanonicalPath());
				}

				String strRealNewPath = PythonAIChatUtils.isAbsolutePath(strNewFilePath) ? strNewFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strNewFilePath);

				File newFile = new File(strRealNewPath);
				if (newFile.getCanonicalPath().indexOf(this.getSkillsWorkspace(true).getCanonicalPath()) != 0) {
					return String.format("应用补丁发生异常，返回以下信息：\n写入文件实际路径[%1$s]不在Agent工作区中，禁止访问！", newFile.getCanonicalPath());
				}

				if (!newFile.exists()) {
					newFile.getParentFile().mkdirs();
				}

				try {
					List<String> originalLines = Files.readAllLines(file.toPath());

					List<String> unifiedDiff = new ArrayList<>();
					try (java.util.Scanner scanner = new java.util.Scanner(strUnifiedDiff)) {
						scanner.useDelimiter("\\R"); // 显式指定跨平台换行符
						while (scanner.hasNext()) {
							unifiedDiff.add(scanner.next());
						}
					}

					Patch<String> patch = UnifiedDiffUtils.parseUnifiedDiff(unifiedDiff);
					List<String> result = DiffUtils.patch(originalLines, patch);

					Files.write(newFile.toPath(), result, StandardCharsets.UTF_8);

					if (bFromTemplate) {
						return "";
					}
					return String.format("应用补丁写入文件[%1$s]成功", newFile.getCanonicalPath());
				} catch (Throwable ex) {
					throw new Exception(String.format("应用补丁发生异常，%1$s", ex.getMessage()), ex);
				}
			}

		} else {
			ISysAIChatSkill iSysAIChatSkill = this.getAIChatSkill(strSkillId, false);

			if (IAIChatSkillAgentRuntimeBase.COMMAND_EXECUTE_BASH.equals(command)) {
				String strCommand = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_BASH_COMMAND));
				if (ObjectUtils.isEmpty(strCommand)) {
					throw new Exception("未传入执行命令");
				}

				File file = null;
				String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
				if (!ObjectUtils.isEmpty(strFilePath)) {
					//strFilePath = strFilePath.replace("{SKILLS_WORKSPACE}", this.getSkillsWorkspace(true).getCanonicalPath());
					strFilePath = AIChatUtils.replacePlaceHolderPath(strFilePath, "SKILLS_WORKSPACE", this.getSkillsWorkspace(true).getCanonicalPath());

					String strContent = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT), "");
					String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(this.getSkillsWorkspace(true).getCanonicalPath(), strFilePath);
					// 判断文件是否存在
					file = new File(strRealPath);
					if (file.getCanonicalPath().indexOf(this.getSkillsWorkspace(true).getCanonicalPath()) != 0) {
						return String.format("写入文件发生异常，返回以下信息：\n文件实际路径[%1$s]不在Agent工作区中，禁止访问！", file.getCanonicalPath());
					}
					if (file.exists()) {
						FileUtils.writeStringToFile(file, strContent, "UTF-8");
					} else {
						if (!file.getParentFile().exists()) {
							file.getParentFile().mkdirs();
						}
						FileUtils.writeStringToFile(file, strContent, "UTF-8");
					}
				}

				//strCommand = strCommand.replace("{SKILLS_WORKSPACE}", this.getSkillsWorkspace(true).getCanonicalPath());
				//strCommand = strCommand.replace("{baseDir}", iSysAIChatSkill.getSkillFolder().getCanonicalPath());
				
				strCommand  = AIChatUtils.replacePlaceHolderPath(strCommand, "SKILLS_WORKSPACE", this.getSkillsWorkspace(true).getCanonicalPath());
				strCommand  = AIChatUtils.replacePlaceHolderPath(strCommand, "baseDir", iSysAIChatSkill.getSkillFolder().getCanonicalPath());
				
				String strError = "";
				
				try {
					ExecuteResult executeResult = PythonAIChatUtils.executeCommand(strCommand, iSysAIChatSkill.getSkillFolder());
					if (bFromTemplate) {
						return executeResult.standardOutput;
					}
					if (file != null) {
						return String.format("写入文件[%1$s]成功\n", file.getCanonicalPath()) + String.format("执行命令成功，返回以下内容：\n%1$s", executeResult.standardOutput);
					}
					return String.format("执行命令成功，返回以下内容：\n%1$s", executeResult.standardOutput);
				} catch (Throwable ex) {
					if (ex instanceof ExecuteException) {
						strError = String.format("执行命令发生错误，返回以下信息：\n%1$s", ((ExecuteException) ex).getMessage());
					}
					strError = String.format("执行命令发生错误，返回以下信息：\n%1$s", ex.getMessage());
				}

				//重试全局路径
				log.warn(String.format("执行命令发生错误，重试`SKILLS_WORKSPACE`执行"));
				try {
					ExecuteResult executeResult = PythonAIChatUtils.executeCommand(strCommand, this.getSkillsWorkspace(true));
					if (bFromTemplate) {
						return executeResult.standardOutput;
					}
					if (file != null) {
						return String.format("写入文件[%1$s]成功\n", file.getCanonicalPath()) + String.format("执行命令成功，返回以下内容：\n%1$s", executeResult.standardOutput);
					}
					return String.format("执行命令成功，返回以下内容：\n%1$s", executeResult.standardOutput);
				} catch (Throwable ex) {
					return strError;
				}
			}

			if (IAIChatSkillAgentRuntimeBase.COMMAND_READ_FILE.equals(command)) {
				// 判断文件是否存在
				String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
				if (ObjectUtils.isEmpty(strFilePath)) {
					return String.format("读取文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
				}

				String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(iSysAIChatSkill.getSkillFolder().getCanonicalPath(), strFilePath);
				// 判断文件是否存在
				File file = new File(strRealPath);
				if (file.exists()) {
					if (bFromTemplate) {
						return FileUtils.readFileToString(file, "UTF-8");
					}
					return String.format("读取文件成功，内容如下：\n%1$s", FileUtils.readFileToString(file, "UTF-8"));
				}

				return String.format("读取文件发生异常，返回以下信息：\n指定文件[%1$s]不存在", file.getCanonicalPath());
			}

			if (IAIChatSkillAgentRuntimeBase.COMMAND_WRITE_FILE.equals(command)) {
				// 判断文件是否存在
				String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
				if (ObjectUtils.isEmpty(strFilePath)) {
					return String.format("写入文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
				}

				String strContent = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT), "");

				String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(iSysAIChatSkill.getSkillFolder().getCanonicalPath(), strFilePath);
				// 判断文件是否存在
				File file = new File(strRealPath);
				if (file.exists()) {
					FileUtils.writeStringToFile(file, strContent, "UTF-8");
					if (bFromTemplate) {
						return "";
					}
					return String.format("写入文件[%1$s]成功", file.getCanonicalPath());
				}

				if (!file.getParentFile().exists()) {
					file.getParentFile().mkdirs();
				}

				FileUtils.writeStringToFile(file, strContent, "UTF-8");
				if (bFromTemplate) {
					return "";
				}
				return String.format("写入文件[%1$s]成功", file.getCanonicalPath());

			}
		}

		throw new Exception(String.format("未支持的指令[%1$s]", command));
	}

	protected Map<String, String> getSkillRunnerData() {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession != null) {
			Object skillRunnerData = actionSession.getActionParam("__SKILLRUNNERDATA__");
			if (skillRunnerData instanceof Map) {
				return (Map) skillRunnerData;
			}
		}

		Map<String, String> data = this.doGetSkillRunnerData();
		if (actionSession != null) {
			actionSession.setActionParam("__SKILLRUNNERDATA__", data);
		}
		return data;
	}

	protected Map<String, String> doGetSkillRunnerData() {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if (iEmployeeContext != null) {
			String strCacheKey = getSkillRunnerDataCacheKey(iEmployeeContext);
			Map<String, String> params = this.getSystemRuntime().getSysCacheUtilRuntime(false).getAll(strCacheKey);
			if (!ObjectUtils.isEmpty(params)) {
				return params;
			}
		}

		String strCacheKey = getSkillRunnerDataCacheKey(SKILLRUNNER_USERID_UNKNOWN);
		Map<String, String> params = this.getSystemRuntime().getSysCacheUtilRuntime(false).getAll(strCacheKey);
		if (!ObjectUtils.isEmpty(params)) {
			return params;
		}

		return Collections.EMPTY_MAP;
	}

	protected String getToolCallInformTopic() {
		Map<String, String> params = this.getSkillRunnerData();
		if (!ObjectUtils.isEmpty(params)) {
			return (String) params.get("topic");
		}
		return null;
	}

	protected void recvToolCallResult(String strTopic, String strData) {
		try {
			this.onRecvToolCallResult(strTopic, strData);
		} catch (Throwable ex) {
			log.error(String.format("接收工具调用结果发生异常，%1$s。数据如下：\r\n%2$s", ex.getMessage(), strData), ex);
		}
	}

	protected void onRecvToolCallResult(String strTopic, String strData) throws Throwable {
		Map<String, Object> resultData = JsonUtils.asMap(strData);
		// "tool_call_id": tool_call_id,
		// "result": result,
		// "error": False # 成功执行

		String strToolCallId = (String) resultData.get("tool_call_id");
		String strResult = (String) resultData.get("result");
		boolean bError = DataTypeUtils.asBoolean(resultData.get("error"), false);
		int nIndex = DataTypeUtils.asInteger(resultData.get("index"), -1);

		if (!StringUtils.hasLength(strToolCallId)) {
			throw new Exception("消息未携带工具调用标识");
		}

		if (nIndex != -1) {
			ToolCallFuture toolCallFuture = toolCallSessionMap.get(strToolCallId);
			if (toolCallFuture == null) {
				log.error(String.format("工具调用标识[%1$s]指定后续处理对象不存在，忽略", strToolCallId));
				return;
			}
			// 需要等待
			toolCallFuture.wait = true;
			try {

				// 将结果写入临时文件
				File tempFile = File.createTempFile(strToolCallId, "." + String.valueOf(nIndex));
				FileUtils.writeStringToFile(tempFile, strResult, "UTF-8");
				toolCallFuture.files.put(nIndex, tempFile);
			} catch (Throwable ex) {
				log.error(String.format("写入结果临时文件发生异常，%1$s", ex.getMessage()), ex);
				// throw new Exception(String.format("写入临时文件发生异常，需要重新传输"));
				toolCallSessionMap.remove(strToolCallId);
				toolCallFuture.future.complete(String.format("写入临时文件发生异常，需要重试"));
				return;
			}
			return;
		}

		ToolCallFuture toolCallFuture = toolCallSessionMap.remove(strToolCallId);
		if (toolCallFuture == null) {
			log.error(String.format("工具调用标识[%1$s]指定后续处理对象不存在，忽略", strToolCallId));
			return;
		}

		toolCallFuture.future.complete(strResult);
	}

	@Override
	public AccessToken getWebhookAccessToken(String strToken, boolean tryMode) {
		try {
			return this.onGetWebhookAccessToken(strToken, tryMode);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("获取Webhook凭证发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected AccessToken onGetWebhookAccessToken(String strToken, boolean tryMode) throws Throwable {
		return this.getWebhookAccessToken(strToken, true, tryMode);
	}

	/**
	 * 获取访问凭证数据对象
	 * 
	 * @param iSystemRuntime
	 * @param strToken
	 * @param bValid
	 * @param bTryMode
	 * @return
	 */
	protected AccessToken getWebhookAccessToken(String strToken, boolean bValid, boolean bTryMode) throws Exception {

		AccessToken accessToken = null;
		String strAccessTokenId = String.format("%1$s%2$s-%3$s--webhook--%4$s", NacosServiceHubSettingBase.DATAID_ACCESSTOKEN_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-"), strToken).toLowerCase();
		String strConfig = ServiceHub.getInstance().getConfig(strAccessTokenId);
		if (!ObjectUtils.isEmpty(strConfig)) {
			Yaml yaml = new Yaml();
			accessToken = JsonUtils.as(yaml.loadAs(strConfig, Map.class), AccessToken.class);
		}

		if (accessToken == null) {
			if (bTryMode) {
				return null;
			}
			throw new Exception("凭证不存在");
		}
		if (bValid) {
			// 判断有效
			if (DataTypeUtils.asBoolean(accessToken.getDisabled(), false)) {
				if (bTryMode) {
					return null;
				}
				throw new Exception("凭证已禁用");
			}

			java.sql.Timestamp expiresTime = accessToken.getExpiresTime();
			if (expiresTime != null) {
				if (expiresTime.getTime() < System.currentTimeMillis()) {
					if (bTryMode) {
						return null;
					}
					throw new Exception("凭证已过期");
				}
			}
		}

		return accessToken;

	}

	@Override
	public Object registerSkillRunner(Map<String, Object> params) {
		try {
			this.getInformAgent(false);
			return this.onRegisterSkillRunner(params);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("注册技能运行器发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onRegisterSkillRunner(Map<String, Object> params) throws Throwable {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		String strCacheKey = getSkillRunnerDataCacheKey(iEmployeeContext);
		String strListenTopic = String.format("/skillrunner_%1$s", KeyValueUtils.genUniqueId());
		Map<String, String> cacheData = new LinkedHashMap<String, String>();
		cacheData.put("topic", strListenTopic);
		String strWorkspace = params != null ? DataTypeUtils.asString(params.get(SKILLRUNNER_WORKSPACE)) : null;
		if (StringUtils.hasLength(strWorkspace)) {
			cacheData.put(SKILLRUNNER_WORKSPACE, strWorkspace);
		}

		this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strCacheKey, cacheData, 120);

		Map<String, String> ret = new LinkedHashMap<String, String>();
		ret.put(SKILLRUNNER_REGISTRATION_LISTEN_TOPIC, strListenTopic);
		ret.put(SKILLRUNNER_REGISTRATION_RESULT_TOPIC, this.getInformAgent(false).getDefaultTopic());
		return ret;
	}

	protected String getSkillRunnerDataCacheKey(IEmployeeContext iEmployeeContext) {
		Object userId = iEmployeeContext.getSessionParam(SESSIONKEY_SKILLRUNNER_USERID);
		return this.getSkillRunnerDataCacheKey(ObjectUtils.isEmpty(userId) ? iEmployeeContext.getUserid() : userId);
	}

	protected String getSkillRunnerDataCacheKey(Object key) {
		return String.format("%1$s%2$s-%3$s--skillrunner--%4$s", "ibiz-cloud-sysaifactory-", this.getSystemRuntime().getDeploySystemId(), this.getFullUniqueTag().replace(".", "-"), key).toLowerCase();
	}

	@Override
	public Object unregisterSkillRunner(Map<String, Object> params) {
		try {
			this.getInformAgent(false);
			return this.onUnegisterSkillRunner(params);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("注销技能运行器发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onUnegisterSkillRunner(Map<String, Object> params) throws Throwable {
		String strInputListenTopic = (String) params.get(SKILLRUNNER_REGISTRATION_LISTEN_TOPIC);
		if (ObjectUtils.isEmpty(strInputListenTopic)) {
			throw new ErrorException("传入侦听标题无效", Errors.INPUTERROR);
		}

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		String strCacheKey = getSkillRunnerDataCacheKey(iEmployeeContext);
		Map<String, String> cacheData = this.getSystemRuntime().getSysCacheUtilRuntime(false).getAll(strCacheKey);
		if (ObjectUtils.isEmpty(cacheData)) {
			return false;
		}
		String strListenTopic = cacheData.get("topic");
		if (!strInputListenTopic.equals(strListenTopic)) {
			// 标题不一致
			return false;
		}

		this.getSystemRuntime().getSysCacheUtilRuntime(false).resetAll(strCacheKey);
		return true;
	}

	@Override
	public Object activeSkillRunner(Map<String, Object> params) {
		try {
			this.getInformAgent(false);
			return this.onActiveSkillRunner(params);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("激活技能运行器发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onActiveSkillRunner(Map<String, Object> params) throws Throwable {
		String strInputListenTopic = (String) params.get(SKILLRUNNER_REGISTRATION_LISTEN_TOPIC);
		if (ObjectUtils.isEmpty(strInputListenTopic)) {
			throw new ErrorException("传入侦听标题无效", Errors.INPUTERROR);
		}

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		String strCacheKey = getSkillRunnerDataCacheKey(iEmployeeContext);
		Map<String, String> cacheData = this.getSystemRuntime().getSysCacheUtilRuntime(false).getAll(strCacheKey);
		if (ObjectUtils.isEmpty(cacheData)) {
			return false;
		}
		String strListenTopic = cacheData.get("topic");
		if (!strInputListenTopic.equals(strListenTopic)) {
			// 标题不一致
			return false;
		}

		this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strCacheKey, cacheData, 120);
		return true;
	}

	protected String getSkillChatSessionCacheKey(String skillId, String chatSessionId) {
		return String.format("%1$s%2$s-%3$s--skillsession--%4$s--%5$s", "ibiz-cloud-sysaifactory-", this.getSystemRuntime().getDeploySystemId(), this.getFullUniqueTag().replace(".", "-"), skillId, chatSessionId).toLowerCase();
	}
	
	@Override
	public Object toolCall(String command, Map<String, Object> args) {
		try {
			return this.onToolCall(command, args);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("工具调用发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onToolCall(String command, Map<String, Object> args) throws Throwable{
		return this.toolCall(command, args, new HashMap<String, Object>());
	}


	@Override
	protected void onUninstall() throws Throwable {
		if (this.getInformAgent(true) != null) {
			try {
				this.getInformAgent(true).unregisterSysEAIMsgListener(this.iSysEAIMsgListener);
			} catch (Throwable ex) {
				log.error(String.format("注销通知代理消息侦听器发生异常，%1$s", ex.getMessage()), ex);
			}
			try {
				this.getInformAgent(true).shutdown();
			} catch (Throwable ex) {
				log.error(String.format("关闭通知代理发生异常，%1$s", ex.getMessage()), ex);
			}
			this.setInformAgent(null);
		}
		super.onUninstall();
	}
}
