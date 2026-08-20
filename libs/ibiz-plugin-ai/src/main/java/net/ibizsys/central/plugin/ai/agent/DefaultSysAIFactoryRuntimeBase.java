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
	private Map<String, Object> skillRunnerConfig = null;
	
	
	

	/**
	 * AI工厂通知代理代码标识
	 */
	public final static String AIFACTORYINFORMAGENT_CODENAME = "AIFactoryInformAgent";

	public final static String SESSIONKEY_SKILLRUNNER_USERID = "skillrunner_userid";

	public final static String SKILLRUNNER_USERID_UNKNOWN = "unknown";

	private int nToolCallTimeout = 60;
	
	private Map<String, ISysAIChatSkill> remoteAIChatSkillMap = new ConcurrentHashMap<String, ISysAIChatSkill>();
	
	public static Yaml yaml = new Yaml();
	
	private final static ThreadLocal<Map<String, String>> currentSkillRunnerDataThreadLocal = new ThreadLocal<Map<String, String>>();
	
	
	private final static ThreadLocal<String> currentBusinessScopeThreadLocal = new ThreadLocal<String>();

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
			public String getSkillsWorkspacePath(boolean local) {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillsWorkspacePath(local);
			}
			
			@Override
			public String getSkillsWorkspacePath() {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillsWorkspacePath(false);
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
			public Map<String, String> getSkillRunnerDataByBusinessScope(String businessScope) {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillRunnerDataByBusinessScope(businessScope);
			}

			@Override
			public Map<String, Object> getSkillEnv() {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillEnv();
			}

			@Override
			public boolean isEnableKnowledgeBase() {
				return DefaultSysAIFactoryRuntimeBase.this.isEnableKnowledgeBase();
			}
			
			@Override
			public Map<String, ISysAIChatSkill> getRemoteAIChatSkills() {
				return DefaultSysAIFactoryRuntimeBase.this.getRemoteAIChatSkills();
			}
			
			@Override
			public void uploadRemoteFile(String strSkillId, Map<String, Object> args, Map<String, Object> params, File realFile) throws Exception {
				DefaultSysAIFactoryRuntimeBase.this.uploadRemoteFile(strSkillId, args, params, realFile);
			}
			
			@Override
			public Map<String, Object> getSkillEnvironments(String strSkillId, String strProfile, String strUserId) throws Exception {
				return DefaultSysAIFactoryRuntimeBase.this.getSkillEnvironments(strSkillId, strProfile, strUserId);
			}
			
			@Override
			public String readRemoteFile(String strSkillId, String strFilePath, boolean bFromTemplate, boolean bTryMode) throws Exception {
				return DefaultSysAIFactoryRuntimeBase.this.readRemoteFile(strSkillId, strFilePath, bFromTemplate, bTryMode);
			}

			@Override
			public String readSkillProfile(String strSkillId, String strUserId) throws Exception {
				return DefaultSysAIFactoryRuntimeBase.this.readSkillProfile(strSkillId, strUserId);
			}

			@Override
			public void updateSkillProfile(String strSkillId, String strUserId, String strContent) throws Exception {
				DefaultSysAIFactoryRuntimeBase.this.updateSkillProfile(strSkillId, strUserId, strContent);
			}

			@Override
			public Map<String, String> getCurrentSkillRunnerData() {
				return DefaultSysAIFactoryRuntimeBase.this.getCurrentSkillRunnerData();
			}

			@Override
			public void setCurrentSkillRunnerData(Map<String, String> data) {
				DefaultSysAIFactoryRuntimeBase.this.setCurrentSkillRunnerData(data);
			}
			
			@Override
			public String getCurrentBusinessScope() {
				return DefaultSysAIFactoryRuntimeBase.this.getCurrentBusinessScope();
			}

			@Override
			public void setCurrentBusinessScope(String data) {
				DefaultSysAIFactoryRuntimeBase.this.setCurrentBusinessScope(data);
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
		
		Map<String, Object> skillRunnerConfig = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".skill.runner.config", new HashMap<String, Object>());
		this.setSkillRunnerConfig(skillRunnerConfig);
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
					//没有附加Unknown用户判断
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
	
	protected String getSkillsWorkspacePath(boolean local) {
		String strWorkspacePath = null;
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();

		if (!local) {
			Map<String, String> params = this.getSkillRunnerData();
			if (!ObjectUtils.isEmpty(params)) {
				strWorkspacePath = DataTypeUtils.asString((String) params.get(SKILLRUNNER_WORKSPACE), "");
				if (StringUtils.hasLength(strWorkspacePath)) {
					//需要进一步判断，如果是UNKNOWN，则需要补充UserId
					String strUserId = DataTypeUtils.asString((String) params.get(SKILLRUNNER_USER_ID), "");
					if(!ObjectUtils.isEmpty(strUserId) && SKILLRUNNER_USERID_UNKNOWN.equalsIgnoreCase(strUserId)) {
						//未知用户，补充用户标识
						if (iEmployeeContext != null) {
							strWorkspacePath += "/";
							strWorkspacePath += KeyValueUtils.genUniqueId(iEmployeeContext.getUserid());
						}
					}
					
					return strWorkspacePath;
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
			return strWorkspacePath;
		}

		try {
			return this.skillsWorkspace.getCanonicalPath();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
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
				boolean bFromTemplate = DataTypeUtils.asBoolean(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE), false);
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
		
		if (IAIChatSkillAgentRuntimeBase.COMMAND_OUTPUT_STEP.equals(command)) {
			return "成功";
		}

		if (!isEnableLocalToolCall()) {
			throw new Exception(String.format("当前无可用SkillRunner，无法执行工具调用"));
		}

		return this.doLocalToolCall(command, args, params);
	}
	
	protected String readRemoteFile(String strSkillId, String strFilePath, boolean bFromTemplate,  boolean bTryMode) throws Exception {
		String strToolCallInformTopic = this.getToolCallInformTopic();
		if (!StringUtils.hasLength(strToolCallInformTopic)) {
			if(bTryMode) {
				return null;
			}
			throw new Exception("SkillRunner通知主题无效");
		}
		
		ISysEAIAgentRuntime iSysEAIAgentRuntime = this.getInformAgent(bTryMode);
		if(iSysEAIAgentRuntime == null) {
			return null;
		}
		
		try {
			Map<String, Object> args = new LinkedHashMap<String, Object>();
			args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, strSkillId);
			args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, strFilePath);
			args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, bFromTemplate?"true":"false");
			
			return (String)toolCall(IAIChatSkillAgentRuntimeBase.COMMAND_READ_FILE, args);
		}
		catch (Throwable ex) {
			log.error(ex);
			if(bTryMode) {
				return null;
			}
			throw ex;
		}
	}
	
	protected void uploadRemoteFile(String strSkillId, Map<String, Object> args, Map<String, Object> params, File realFile) throws Exception {
		
		String strToolCallInformTopic = this.getToolCallInformTopic();
		if (!StringUtils.hasLength(strToolCallInformTopic)) {
			throw new Exception("SkillRunner通知主题无效");
		}
		
		ISysEAIAgentRuntime iSysEAIAgentRuntime = this.getInformAgent(false);
		
		Object ret = null;
		ToolCallFuture toolCallFuture = null;
		// 发送消息，并等待消息接收
		String strToolCallId = KeyValueUtils.genUniqueId();
		Map<String, Object> msg = new LinkedHashMap<String, Object>();
		msg.put("command", IAIChatSkillAgentRuntimeBase.COMMAND_UPLOAD_FILE);
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
		toolCallFuture = new ToolCallFuture(future, IAIChatSkillAgentRuntimeBase.COMMAND_UPLOAD_FILE, args, params);
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
				boolean bAppend = DataTypeUtils.asBoolean(args.get(COMMAND_PARAM_WRITE_FILE_APPEND), false);
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
					FileUtils.writeStringToFile(file, strContent, "UTF-8", bAppend);
					if (bFromTemplate) {
						return "";
					}
					
					if(bAppend) {
						return String.format("附加写入文件[%1$s]成功， 文件总大小[%2$s]", file.getCanonicalPath(), file.length());
					}
					else {
						return String.format("写入文件[%1$s]成功， 文件大小[%2$s]", file.getCanonicalPath(), file.length());
					}
				}

				if (!file.getParentFile().exists()) {
					file.getParentFile().mkdirs();
				}

				FileUtils.writeStringToFile(file, strContent, "UTF-8");
				if (bFromTemplate) {
					return "";
				}
				return String.format("写入文件[%1$s]成功， 文件大小[%2$s]", file.getCanonicalPath(), file.length());
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
				
				Map env = (Map)args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_BASH_ENV);
				

				//strCommand = strCommand.replace("{SKILLS_WORKSPACE}", this.getSkillsWorkspace(true).getCanonicalPath());
				//strCommand = strCommand.replace("{baseDir}", iSysAIChatSkill.getSkillFolder().getCanonicalPath());
				
				strCommand  = AIChatUtils.replacePlaceHolderPath(strCommand, "SKILLS_WORKSPACE", this.getSkillsWorkspace(true).getCanonicalPath());
				strCommand  = AIChatUtils.replacePlaceHolderPath(strCommand, "baseDir", iSysAIChatSkill.getSkillFolder().getCanonicalPath());
				
				String strError = "";
				
				try {
					ExecuteResult executeResult = PythonAIChatUtils.executeCommand(strCommand, iSysAIChatSkill.getSkillFolder(), env);
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
				boolean bAppend = DataTypeUtils.asBoolean(args.get(COMMAND_PARAM_WRITE_FILE_APPEND), false);
				
				String strContent = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT), "");

				String strRealPath = PythonAIChatUtils.isAbsolutePath(strFilePath) ? strFilePath : PythonAIChatUtils.resolveToAbsolute(iSysAIChatSkill.getSkillFolder().getCanonicalPath(), strFilePath);
				// 判断文件是否存在
				File file = new File(strRealPath);
				if (file.exists()) {
					FileUtils.writeStringToFile(file, strContent, "UTF-8", bAppend);
					if (bFromTemplate) {
						return "";
					}
					if(bAppend) {
						return String.format("附加写入文件[%1$s]成功， 文件总大小[%2$s]", file.getCanonicalPath(), file.length());
					}
					else {
						return String.format("写入文件[%1$s]成功， 文件大小[%2$s]", file.getCanonicalPath(), file.length());
					}
				}

				if (!file.getParentFile().exists()) {
					file.getParentFile().mkdirs();
				}

				FileUtils.writeStringToFile(file, strContent, "UTF-8");
				if (bFromTemplate) {
					return "";
				}
				return String.format("写入文件[%1$s]成功， 文件大小[%2$s]", file.getCanonicalPath(), file.length());
			}
		}

		throw new Exception(String.format("未支持的指令[%1$s]", command));
	}

	protected Map<String, String> getSkillRunnerData() {
		
		Map<String, String> data = getCurrentSkillRunnerData();
		if(!ObjectUtils.isEmpty(data)) {
			return data;
		}
		
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if(actionSession != null) {
			Object skillRunnerData = actionSession.getActionParam("__SKILLRUNNERDATA__");
			if (skillRunnerData instanceof Map) {
				return (Map) skillRunnerData;
			}
		}
		

		data = this.doGetSkillRunnerData();
		if(actionSession != null) {
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
	
	public Map<String, String> getSkillRunnerDataByBusinessScope(String businessScope) {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if(actionSession != null) {
			Object skillRunnerData = actionSession.getActionParam(String.format("__SKILLRUNNERDATA__%1$s__", businessScope));
			if (skillRunnerData instanceof Map) {
				return (Map) skillRunnerData;
			}
		}
		

		Map<String, String> data = this.doGetSkillRunnerDataByBusinessScope(businessScope);
		if(actionSession != null) {
			actionSession.setActionParam(String.format("__SKILLRUNNERDATA__%1$s__", businessScope), data);
		}
		return data;
	}
	
	protected Map<String, String> doGetSkillRunnerDataByBusinessScope(String businessScope) {
		String strCacheKey = getSkillRunnerDataCacheKeyByBusinessScope(businessScope);
		Map<String, String> params = this.getSystemRuntime().getSysCacheUtilRuntime(false).getAll(strCacheKey);
		if (!ObjectUtils.isEmpty(params)) {
			return params;
		}

		return Collections.EMPTY_MAP;
	}

	protected Map<String, String> getCurrentSkillRunnerData() {
		return DefaultSysAIFactoryRuntimeBase.currentSkillRunnerDataThreadLocal.get();
	}

	protected void setCurrentSkillRunnerData(Map<String, String> data) {
		DefaultSysAIFactoryRuntimeBase.currentSkillRunnerDataThreadLocal.set(data);
	}
	
	protected String getCurrentBusinessScope() {
		return DefaultSysAIFactoryRuntimeBase.currentBusinessScopeThreadLocal.get();
	}

	protected void setCurrentBusinessScope(String data) {
		DefaultSysAIFactoryRuntimeBase.currentBusinessScopeThreadLocal.set(data);
	}
	
	
	protected String getToolCallInformTopic() {
		Map<String, String> data = this.getSkillRunnerData();
		if (!ObjectUtils.isEmpty(data)) {
			return (String) data.get("topic");
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

	

	/**
	 * 获取技能环境变量
	 * @param strSkillId
	 * @param strProfileTag
	 * @param strUserId
	 * @return
	 */
	protected Map<String, Object> getSkillEnvironments(String strSkillId, String strProfileTag, String strUserId){

		Map<String, Object> env = null;
		String strProfileId = String.format("%1$s%2$s-%3$s--skill-%4$s--%5$s", "profile-", this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-"), strSkillId, "default").toLowerCase();
		String strConfig = ServiceHub.getInstance().getConfig(strProfileId);
		if (!ObjectUtils.isEmpty(strConfig)) {
			try {
				Map<String, Object> globalEnv = DefaultSysAIFactoryRuntimeBase.yaml.loadAs(strConfig, Map.class);
				if(!ObjectUtils.isEmpty(globalEnv)) {
					Object sector = globalEnv.get("default");
					if(sector instanceof Map) {
						env = (Map)sector;
					}
					
					if(StringUtils.hasLength(strProfileTag) && !strProfileTag.equalsIgnoreCase("default")) {
						sector = globalEnv.get(strProfileTag.toLowerCase());
						if(sector instanceof Map) {
							if(env == null) {
								env = (Map)sector;
							}
							else {
								env.putAll((Map)sector);
							}
						}
					}
				}
			}
			catch (Throwable ex) {
				log.error(String.format("读取技能[%1$s]全局配置发生异常，%2$s", strSkillId, ex.getMessage()), ex);
			}
		}
		
		if(StringUtils.hasLength(strUserId) && StringUtils.hasLength(strProfileTag) && !strUserId.equals("default")) {
			strProfileId = String.format("%1$s%2$s-%3$s--skill-%4$s--%5$s", "profile-", this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-"), strSkillId, strUserId).toLowerCase();
			strConfig = ServiceHub.getInstance().getConfig(strProfileId);
			if (!ObjectUtils.isEmpty(strConfig)) {
				try {
					Map<String, Object> userEnv = DefaultSysAIFactoryRuntimeBase.yaml.loadAs(strConfig, Map.class);
					if(!ObjectUtils.isEmpty(userEnv)) {
						Object sector = userEnv.get(strProfileTag.toLowerCase());
						if(sector instanceof Map) {
							if(env == null) {
								env = (Map)sector;
							}
							else {
								env.putAll((Map)sector);
							}
						}
					}
				}
				catch (Throwable ex) {
					log.error(String.format("读取技能[%1$s]用户配置[%2$s]发生异常，%3$s", strSkillId, strUserId, ex.getMessage()), ex);
				}
			}
		}

		return env;
	}
	
	
	/**
	 * 读取技能配置文件
	 * @param strSkillId
	 * @param strUserId
	 * @return
	 * @throws Exception
	 */
	protected String readSkillProfile(String strSkillId, String strUserId) throws Exception {
		String strProfileId = String.format("%1$s%2$s-%3$s--skill-%4$s--%5$s", "profile-", this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-"), strSkillId, strUserId).toLowerCase();
		String strContent = ServiceHub.getInstance().getConfig(strProfileId);
		if(StringUtils.hasLength(strContent)) {
			return strContent;
		}
		
		throw new Exception("指定文件不存在");
	}
	
	
	/**
	 * 更新技能配置文件
	 * @param strSkillId
	 * @param strUserId
	 * @param strContent
	 * @return
	 * @throws Exception
	 */
	protected void updateSkillProfile(String strSkillId, String strUserId, String strContent) throws Exception{
		String strProfileId = String.format("%1$s%2$s-%3$s--skill-%4$s--%5$s", "profile-", this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-"), strSkillId, strUserId).toLowerCase();
		if(StringUtils.hasLength(strContent)) {
			try {
				Map<String, Object> globalEnv = DefaultSysAIFactoryRuntimeBase.yaml.loadAs(strContent, Map.class);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("配置内容必须为YAML的MAP形式"));
			}
			
			ServiceHub.getInstance().publishConfig(strProfileId, strContent);
		}
		else {
			ServiceHub.getInstance().removeConfig(strProfileId);
		}
	}
	
	@Override
	public Object registerSkillRunner(String strRunnerId, Map<String, Object> params) {
		try {
			this.getInformAgent(false);
			return this.onRegisterSkillRunner(strRunnerId, params);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("注册技能运行器发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onRegisterSkillRunner(String strRunnerId, Map<String, Object> params) throws Throwable {

		Object businessScope = params != null ? params.get(SKILLRUNNER_BUSINESS_SCOPE) : null; 
		
		Map<String, String> cacheData = new LinkedHashMap<String, String>();
		
		List<String> cacheKeyList = new ArrayList<String>();
		if(!ObjectUtils.isEmpty(businessScope)) {
			if(businessScope instanceof List) {
				List list = (List)businessScope;
				for(Object item : list) {
					String strCacheKey = getSkillRunnerDataCacheKeyByBusinessScope(String.valueOf(item));
					cacheKeyList.add(strCacheKey);
				}
			}
			else {
				cacheKeyList.add(String.valueOf(businessScope));
			}
		}
		else {
			IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
			String strCacheKey = getSkillRunnerDataCacheKey(iEmployeeContext);
			cacheKeyList.add(strCacheKey);
			
			Object userId = iEmployeeContext.getSessionParam(SESSIONKEY_SKILLRUNNER_USERID);
			userId = ObjectUtils.isEmpty(userId) ? iEmployeeContext.getUserid() : userId;
			if(!ObjectUtils.isEmpty(userId)) {
				cacheData.put(SKILLRUNNER_USER_ID, String.valueOf(userId));
			}
		}
		
		
		String strListenTopic = String.format("/skillrunner_%1$s", KeyValueUtils.genUniqueId());
		
		cacheData.put("topic", strListenTopic);
		String strWorkspace = params != null ? DataTypeUtils.asString(params.get(SKILLRUNNER_WORKSPACE)) : null;
		if (StringUtils.hasLength(strWorkspace)) {
			cacheData.put(SKILLRUNNER_WORKSPACE, strWorkspace);
		}
		
		String strOSType = params != null ? DataTypeUtils.asString(params.get(SKILLRUNNER_OS_TYPE)) : null;
		if (StringUtils.hasLength(strOSType)) {
			cacheData.put(SKILLRUNNER_OS_TYPE, strOSType);
		}
		else {
			cacheData.put(SKILLRUNNER_OS_TYPE, OS_TYPE_LINUX);
		}
		
		String strSkillsPath = params != null ? DataTypeUtils.asString(params.get(SKILLRUNNER_SKILLS_PATH)) : null;
		if (StringUtils.hasLength(strSkillsPath)) {
			cacheData.put(SKILLRUNNER_SKILLS_PATH, strSkillsPath);
		}
		
		
		//获取远程技能集合
		Object remoteSkills = params != null ? params.get(SKILLRUNNER_SKILLS) : null;
		if(remoteSkills instanceof Map) {
			Map<String, Object> skills = getRemoteSkills((Map)remoteSkills, true);
			if(!ObjectUtils.isEmpty(skills)) {
				cacheData.put(SKILLRUNNER_SKILLS, JsonUtils.toString(skills));
			}
		}

		for(String strCacheKey : cacheKeyList) {
			this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strCacheKey, cacheData, 120);
		}

		Map<String, String> ret = new LinkedHashMap<String, String>();
		ret.put(SKILLRUNNER_REGISTRATION_LISTEN_TOPIC, strListenTopic);
		ret.put(SKILLRUNNER_REGISTRATION_RESULT_TOPIC, this.getInformAgent(false).getDefaultTopic());
		
		//启动线程，获取远程技能集合
		if(!ObjectUtils.isEmpty(remoteSkills)) {
			this.getSystemRuntime().threadRun(new Runnable() {
				@Override
				public void run() {
					doGetRemoteAIChatSkills();
				}
			});
		}
		
		//登记状态
		if(StringUtils.hasLength(strRunnerId)) {
			Map<String, String> stateData = new LinkedHashMap<String, String>();
			stateData.put("timestamp", String.valueOf(System.currentTimeMillis()));
			String strSkillRunnerStateKey = getSkillRunnerStateKey(strRunnerId);
			this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strSkillRunnerStateKey, stateData, 120);
		}	
		return ret;
	}
	
	
	
	
	

	protected Map<String, Object> getRemoteSkills(Map<String, Object> map, boolean tryMode) throws Exception {
		Map<String, Object> skills = new LinkedHashMap<String, Object>();
		//分析远端SKILLS
		for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
			
			if(ObjectUtils.isEmpty(entry.getValue())) {
				continue;
			}
			
			if(entry.getValue() instanceof Map) {
				skills.put(entry.getKey(), entry.getValue());
				continue;
			}
			
			if(entry.getValue() instanceof String) {
				try {
					Yaml yaml = new Yaml();
					Map data = yaml.loadAs(String.valueOf(entry.getValue()), Map.class);
					skills.put(entry.getKey(), data);
				}
				catch (Throwable ex) {
					log.error(String.format("分析远程技能[%1$s]数据[%2$s]发生异常，%3$s", entry.getKey(), entry.getValue(), ex.getMessage()), ex);
					if(!tryMode) {
						throw new Exception(String.format("分析远程技能[%1$s]数据[%2$s]发生异常，%3$s", entry.getKey(), entry.getValue(), ex.getMessage()), ex);
					}
				}
				continue;
			}
			
			
			log.error(String.format("未支持的远程技能[%1$s]数据[%2$s]", entry.getKey(), entry.getValue()));
			if(!tryMode) {
				throw new Exception(String.format("未支持的远程技能[%1$s]数据[%2$s]", entry.getKey(), entry.getValue()));
			}
		}
		
		return skills;
	}
	
	
	
	protected Map<String, ISysAIChatSkill> getRemoteAIChatSkills() {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if(actionSession != null) {
			Object remoteSkills = actionSession.getActionParam("__REMOTESKILLS__");
			if (remoteSkills instanceof Map) {
				return (Map) remoteSkills;
			}
		}
		

		Map<String, ISysAIChatSkill> map = this.doGetRemoteAIChatSkills();
		if(actionSession != null) {
			actionSession.setActionParam("__REMOTESKILLS__", map);
		}
		
		return map;
	}
	
	
	protected Map<String, ISysAIChatSkill> doGetRemoteAIChatSkills(){
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if (iEmployeeContext == null) {
			return Collections.EMPTY_MAP;
		}
		
		
		String strCacheKey = getSkillRunnerDataCacheKey(iEmployeeContext);
		Map<String, String> params = this.getSystemRuntime().getSysCacheUtilRuntime(false).getAll(strCacheKey);
		if (ObjectUtils.isEmpty(params)) {
			return Collections.EMPTY_MAP;
		}
		
		String strSkills = params.get(SKILLRUNNER_SKILLS);
		if (ObjectUtils.isEmpty(strSkills)) {
			return Collections.EMPTY_MAP;
		}
		
		Map<String, Object> skills = JsonUtils.asMap(strSkills);
		
		Map<String, ISysAIChatSkill> sysAIChatSkillMap = new LinkedHashMap<String, ISysAIChatSkill>();
		
		for(java.util.Map.Entry<String, Object> entry : skills.entrySet()) {
			try {
				ISysAIChatSkill iSysAIChatSkill = this.getRemoteAIChatSkill(iEmployeeContext, entry.getKey(), (Map)entry.getValue());
				sysAIChatSkillMap.put(iSysAIChatSkill.getId(), iSysAIChatSkill);
			}
			catch (Exception ex) {
				log.error(String.format("获取远程技能[%1$s]发生异常，%2$s", entry.getKey(), ex.getMessage()), ex);
			}
		}
		
		if(ObjectUtils.isEmpty(sysAIChatSkillMap)) {
			return Collections.EMPTY_MAP;
		}
		
		return Collections.unmodifiableMap(sysAIChatSkillMap);
	}
	
	protected ISysAIChatSkill getRemoteAIChatSkill(IEmployeeContext iEmployeeContext, String strSkillId, Map<String, Object> skillData) throws Exception {
		
		String strMetadata = yaml.dumpAsMap(skillData);
		
		File remoteFolder = new File(this.getSysAIFactoryRuntimeContext().getWorkspace(), "remote");
		String strSkillTag = KeyValueUtils.genUniqueId(iEmployeeContext!=null?iEmployeeContext.getUserid():"_UNKNOWN_", strSkillId, strMetadata);
		
		ISysAIChatSkill remoteAIChatSkill = remoteAIChatSkillMap.get(strSkillTag);
		if(remoteAIChatSkill == null) {

			File skillProxyFolder = new File(remoteFolder, strSkillTag);
			File skillFolder = new File(skillProxyFolder, strSkillId);
			
			//写入文件
			File metadataFile = new File(skillFolder, ISysAIChatSkill.METADATAFILE);
			if(!skillFolder.exists()) {
				skillFolder.mkdirs();
			}
			
			FileUtils.writeStringToFile(metadataFile, strMetadata, "UTF-8");
			
			try {
				ISysAIChatSkill iSysAIChatSkill = this.createSysAIChatSkill(skillFolder);
				iSysAIChatSkill.init(this.getSysAIFactoryRuntimeContext(), skillFolder);
				this.remoteAIChatSkillMap.put(strSkillTag, iSysAIChatSkill);
				
				remoteAIChatSkill = iSysAIChatSkill;
			}
			catch (Exception ex) {
				throw new Exception(String.format("初始化远程技能[%1$s][%2$s]发生异常，%3$s", strSkillId, skillFolder.getCanonicalPath(), ex.getMessage()), ex);
			}
		}
		
		if(!remoteAIChatSkill.containsFile(ISysAIChatSkill.SKILLFILE)) {
			File skillFile = new File(remoteAIChatSkill.getSkillFolder(), ISysAIChatSkill.SKILLFILE);
			
			this.getSystemRuntime().threadRun(new Runnable() {
				@Override
				public void run() {
					try {
						String strContent = (String)readRemoteFile(strSkillId, ISysAIChatSkill.SKILLFILE, true, true);
						if(StringUtils.hasLength(strContent)) {
							//写入文件
							FileUtils.writeStringToFile(skillFile, strContent, "UTF-8");
							log.debug(String.format("同步远端技能文件[%1$s][%2$s]", strSkillId, skillFile.getCanonicalPath()));
						}
						else {
							log.error(String.format("同步远端技能文件[%1$s]失败", strSkillId));
						}
					} catch (Throwable ex) {
						log.error(ex);
					}
				}
			});
		}
		
		return remoteAIChatSkill;
		
	}
	
	@Override
	protected void onReloadSkills(boolean bFirst) throws Throwable {
		remoteAIChatSkillMap.clear();
		super.onReloadSkills(bFirst);
	}

	@Override
	public Map<String, Object> getSkillRunnerConfig() {
		return this.skillRunnerConfig;
	}
	
	protected void setSkillRunnerConfig(Map<String, Object> skillRunnerConfig) {
		this.skillRunnerConfig = skillRunnerConfig;
	}

	protected String getSkillRunnerDataCacheKey(IEmployeeContext iEmployeeContext) {
		Object userId = iEmployeeContext.getSessionParam(SESSIONKEY_SKILLRUNNER_USERID);
		return this.getSkillRunnerDataCacheKey(ObjectUtils.isEmpty(userId) ? iEmployeeContext.getUserid() : userId);
	}

	protected String getSkillRunnerDataCacheKeyByBusinessScope(String strBusinessScope) {
		Object key = String.format("scope--%1$s", strBusinessScope);
		return this.getSkillRunnerDataCacheKey(key);
	}
	
	protected String getSkillRunnerDataCacheKey(Object key) {
		return String.format("%1$s%2$s-%3$s--skillrunner--%4$s", "ibiz-cloud-sysaifactory-", this.getSystemRuntime().getDeploySystemId(), this.getFullUniqueTag().replace(".", "-"), key).toLowerCase();
	}
	
	protected String getSkillRunnerStateKey(Object key) {
		return String.format("%1$s%2$s-%3$s--skillrunner--state--%4$s", "ibiz-cloud-sysaifactory-", this.getSystemRuntime().getDeploySystemId(), this.getFullUniqueTag().replace(".", "-"), key).toLowerCase();
	}
	

	@Override
	public Object unregisterSkillRunner(String strRunnerId, Map<String, Object> params) {
		try {
			this.getInformAgent(false);
			return this.onUnegisterSkillRunner(strRunnerId, params);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("注销技能运行器发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onUnegisterSkillRunner(String strRunnerId, Map<String, Object> params) throws Throwable {
		String strInputListenTopic = (String) params.get(SKILLRUNNER_REGISTRATION_LISTEN_TOPIC);
		if (ObjectUtils.isEmpty(strInputListenTopic)) {
			//throw new ErrorException("传入侦听标题无效", Errors.INPUTERROR);
			log.error("传入侦听标题无效");
			return false;
		}
		
		Object businessScope = params != null ? params.get(SKILLRUNNER_BUSINESS_SCOPE) : null;
		List<String> cacheKeyList = new ArrayList<String>();
		if(!ObjectUtils.isEmpty(businessScope)) {
			if(businessScope instanceof List) {
				List list = (List)businessScope;
				for(Object item : list) {
					String strCacheKey = getSkillRunnerDataCacheKeyByBusinessScope(String.valueOf(item));
					cacheKeyList.add(strCacheKey);
				}
			}
			else {
				cacheKeyList.add(String.valueOf(businessScope));
			}
		}
		else {
			IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
			String strCacheKey = getSkillRunnerDataCacheKey(iEmployeeContext);
			cacheKeyList.add(strCacheKey);
		}
		
		boolean bResetSkillState = false;
		
		for(String strCacheKey : cacheKeyList) {
			Map<String, String> cacheData = this.getSystemRuntime().getSysCacheUtilRuntime(false).getAll(strCacheKey);
			if (ObjectUtils.isEmpty(cacheData)) {
				continue;
			}
			String strListenTopic = cacheData.get("topic");
			if (!strInputListenTopic.equals(strListenTopic)) {
				// 标题不一致
				continue;
			}

			this.getSystemRuntime().getSysCacheUtilRuntime(false).resetAll(strCacheKey);
			bResetSkillState = true;
		}
		
		if(bResetSkillState && StringUtils.hasLength(strRunnerId)) {
			Map<String, String> stateData = new LinkedHashMap<String, String>();
			stateData.put("timestamp", String.valueOf(System.currentTimeMillis()));
			String strSkillRunnerStateKey = getSkillRunnerStateKey(strRunnerId);
			this.getSystemRuntime().getSysCacheUtilRuntime(false).resetAll(strSkillRunnerStateKey);
		}	
		
		
		return true;
	}

	@Override
	public Object activeSkillRunner(String strRunnerId, Map<String, Object> params) {
		try {
			this.getInformAgent(false);
			return this.onActiveSkillRunner(strRunnerId, params);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("激活技能运行器发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onActiveSkillRunner(String strRunnerId, Map<String, Object> params) throws Throwable {
		String strInputListenTopic = (String) params.get(SKILLRUNNER_REGISTRATION_LISTEN_TOPIC);
		if (ObjectUtils.isEmpty(strInputListenTopic)) {
			log.error("传入侦听标题无效");
			return false;
		}
		
		Object businessScope = params != null ? params.get(SKILLRUNNER_BUSINESS_SCOPE) : null;
		List<String> cacheKeyList = new ArrayList<String>();
		if(!ObjectUtils.isEmpty(businessScope)) {
			if(businessScope instanceof List) {
				List list = (List)businessScope;
				for(Object item : list) {
					String strCacheKey = getSkillRunnerDataCacheKeyByBusinessScope(String.valueOf(item));
					cacheKeyList.add(strCacheKey);
				}
			}
			else {
				cacheKeyList.add(String.valueOf(businessScope));
			}
		}
		else {
			IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
			String strCacheKey = getSkillRunnerDataCacheKey(iEmployeeContext);
			cacheKeyList.add(strCacheKey);
		}
		
		Object remoteSkills = params != null ? params.get(SKILLRUNNER_SKILLS) : null;
		Map<String, Object> skills = null;
		for(String strCacheKey : cacheKeyList) {
			Map<String, String> cacheData = this.getSystemRuntime().getSysCacheUtilRuntime(false).getAll(strCacheKey);
			if (ObjectUtils.isEmpty(cacheData)) {
				return false;
			}
			String strListenTopic = cacheData.get("topic");
			if (!strInputListenTopic.equals(strListenTopic)) {
				// 标题不一致
				return false;
			}
			
			//需要判断是否有技能数据更新
			if(remoteSkills instanceof Map) {
				if(skills == null) {
					 skills = getRemoteSkills((Map)remoteSkills, true);
				}
				if(!ObjectUtils.isEmpty(skills)) {
					cacheData.put(SKILLRUNNER_SKILLS, JsonUtils.toString(skills));
				}
			}

			this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strCacheKey, cacheData, 120);
		}
		
		
		if(!ObjectUtils.isEmpty(remoteSkills)) {
			//启动线程，获取远程技能集合
			this.getSystemRuntime().threadRun(new Runnable() {
				@Override
				public void run() {
					doGetRemoteAIChatSkills();
				}
			});
		}
		
		//登记状态
		if(StringUtils.hasLength(strRunnerId)) {
			Map<String, String> stateData = new LinkedHashMap<String, String>();
			stateData.put("timestamp", String.valueOf(System.currentTimeMillis()));
			String strSkillRunnerStateKey = getSkillRunnerStateKey(strRunnerId);
			this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strSkillRunnerStateKey, stateData, 120);
		}	
				
		return true;
	}
	
	@Override
	public Map<String, String> getSkillRunnerState(String strRunnerId) {
		try {
			return this.onGetSkillRunnerState(strRunnerId);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("获取技能运行器状态发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Map<String, String> onGetSkillRunnerState(String strRunnerId) throws Throwable {
		String strSkillRunnerStateKey = getSkillRunnerStateKey(strRunnerId);
		 Map<String, String> state = this.getSystemRuntime().getSysCacheUtilRuntime(false).getAll(strSkillRunnerStateKey);
		 if(state != null) {
			 return Collections.EMPTY_MAP;
		 }
		 return state;
	}
	

	protected String getSkillChatSessionCacheKey(String skillId, String chatSessionId) {
		return String.format("%1$s%2$s-%3$s--skillsession--%4$s--%5$s", "ibiz-cloud-sysaifactory-", this.getSystemRuntime().getDeploySystemId(), this.getFullUniqueTag().replace(".", "-"), skillId, chatSessionId).toLowerCase();
	}
	
	@Override
	public Object toolCall(String command, Map<String, Object> args) {
		boolean bOpenSession = false;
		boolean bCommit = true;
		try {
			ActionSession actionSession = ActionSessionManager.getCurrentSession();
			if(actionSession == null) {
				actionSession = ActionSessionManager.openSession("toolCall");
				bOpenSession = true;
			}
			return this.onToolCall(command, args);
		} catch (Throwable ex) {
			bCommit = false;
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this, String.format("工具调用发生异常，%1$s", ex.getMessage()), ex);
		}
		finally {
			if(bOpenSession) {
				ActionSessionManager.closeSession(bCommit);
			}
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
