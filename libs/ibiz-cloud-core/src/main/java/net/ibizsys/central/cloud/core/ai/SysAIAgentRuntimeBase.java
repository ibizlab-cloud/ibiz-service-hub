package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.codehaus.groovy.control.CompilerConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import groovy.text.GStringTemplateEngine;
import groovy.text.Template;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysKBUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.plugin.ModelRTScriptBase;
import net.ibizsys.runtime.util.ExceptionUtils;

public abstract class SysAIAgentRuntimeBase extends ModelRuntimeBase implements ISysAIAgentRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIAgentRuntimeBase.class);
	
	public static final TypeReference<List<ChatTool>> ChatToolListType = new TypeReference<List<ChatTool>>() {
	};
	
	/**
	 * 模板上下文参数：当前数据
	 */
	public final static String TEMPLATE_PARAM_DATA = "data";

	/**
	 * 模板上下文参数：上下文对象
	 */
	public final static String TEMPLATE_PARAM_CTX = "ctx";
	
	/**
	 * 模板上下文参数：实体运行时对象
	 */
	public final static String TEMPLATE_PARAM_DE = "de";
	
	/**
	 * 模板上下文参数：系统运行时对象
	 */
	public final static String TEMPLATE_PARAM_SYS = "sys";
	
	/**
	 * 模板上下文参数：当前代理对象
	 */
	public final static String TEMPLATE_PARAM_AGENT = "agent";
	
	/**
	 * 模板上下文参数：请求数据
	 */
	public final static String TEMPLATE_PARAM_REQUEST = "request";
	
	
	/**
	 * 模板上下文参数：提交的body内容
	 */
	public final static String TEMPLATE_PARAM_BODY = "body";
	
	
	private String strConfigPath = null;
	private String strAIPlatformType = ICloudAIUtilRuntime.AIPLATFORM_DEFAULT;
	private ISysAIUtilRuntime iSysAIUtilRuntime = null;
	private ISysKBUtilRuntime iSysKBUtilRuntime = null;
	
	//private Map<String, String> configAliasMap = new HashMap<String, String>();
	private Map<String, String> configContentMap = new HashMap<String, String>();
	private GStringTemplateEngine engine = null; 
	private Map<String, Template> defaultTemplateCacheMap = new ConcurrentHashMap<String, Template>();
	private SysAIAgentRTScriptBase aiAgentRTScriptBase = null;
	
	private ISysAIFactoryRuntimeContext ctx = null;
	private ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext;
	
	private ISysPortalUtilRuntime iSysPortalUtilRuntime = null;
	
	
	
	
	
	protected void init(ISysAIFactoryRuntimeContext ctx) throws Exception {
		this.ctx = ctx;
		onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		if (!StringUtils.hasLength(this.getConfigPath())) {
			this.setConfigPath(String.format("%1$s%2$s%3$s", this.getAgentType(), "/", this.getAgentSubType()).toLowerCase());
		}
		
		String strAIPlatformTypeParamKey = String.format(".%1$s.%2$s.aiplatformtype", this.getAgentType(), this.getAgentMode()).toLowerCase();
		this.setAIPlatformType(this.getSysAIFactoryRuntimeContext().getParam(strAIPlatformTypeParamKey, this.getAIPlatformType()));
		//this.strAIPlatformType = this.getAIAgentRuntimeContext().
		
		super.onInit();
	}
	
	protected ISysAIUtilRuntime getSysAIUtilRuntime() {
		if (this.iSysAIUtilRuntime == null) {
			this.iSysAIUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysAIUtilRuntime.class, false);
		}
		return this.iSysAIUtilRuntime;
	}

	protected ISysKBUtilRuntime getSysKBUtilRuntime() {
		if (this.iSysKBUtilRuntime == null) {
			this.iSysKBUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysKBUtilRuntime.class, false);
		}
		return this.iSysKBUtilRuntime;
	}
	
	protected ISysAIAgentRuntimeContext getModelRuntimeContext() {
		if(this.iSysAIAgentRuntimeContext == null) {
			this.iSysAIAgentRuntimeContext = this.createModelRuntimeContext();
		}
		return this.iSysAIAgentRuntimeContext;
	}
	
	private SysAIAgentRuntimeBase getSelf() {
		return this;
	}
	
	protected ISysAIAgentRuntimeContext createModelRuntimeContext() {
		return new SysAIAgentRuntimeContextBase() {
			
			@Override
			public ISysAIAgentRuntime getModelRuntime() {
				return getSelf();
			}

			@Override
			protected String getContent(Object data, String strTemplateId, Map params, boolean bTryMode) throws Throwable {
				return getSelf().getContent(data, strTemplateId, params, bTryMode);
			}

			@Override
			protected String getTemplateContent(String strConfigId, boolean bTryMode) throws Throwable {
				return getSelf().getTemplateContent(strConfigId, bTryMode);
			}

			@Override
			public List<Chunk> chunks(String type, String query, Float similaritythreshold, Float vectorSimilarityWeight, Integer size) {
				return getSelf().fetchChunks(type, query, similaritythreshold, vectorSimilarityWeight, size).getContent();
			}

			@Override
			public ChatCompletionResult rawChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) {
				return getSelf().rawChatCompletion(strAIPlatformType, chatCompletionRequest);
			}
			
			@Override
			public String rawChatCompletion(String strAIPlatformType, String strMessage) {
				ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
				chatCompletionRequest.setMessages(new ChatMessagesBuilder().user(strMessage).build());
				ChatCompletionResult chatCompletionResult = rawChatCompletion(strAIPlatformType, chatCompletionRequest);
				return chatCompletionResult.getChoices().get(0).getContent();
			}
		};
	}
	
	
	@Override
	public abstract String getAgentMode();
	
	@Override
	public abstract String getAgentSubType();

	public String getConfigPath() {
		return strConfigPath;
	}

	protected void setConfigPath(String strConfigPath) {
		this.strConfigPath = strConfigPath;
	}

	/**
	 * 获取AI平台类型
	 * @return
	 */
	public String getAIPlatformType() {
		return strAIPlatformType;
	}
	
	protected void setAIPlatformType(String strAIPlatformType) {
		this.strAIPlatformType = strAIPlatformType;
	}
	
	protected ISysAIFactoryRuntimeContext getSysAIFactoryRuntimeContext() {
		return this.ctx;
	}

	@Override
	public ISysAIFactoryRuntime getAIFactoryRuntime() {
		return this.getSysAIFactoryRuntimeContext().getAIFactoryRuntime();
	}
	
	
	protected ISystemRuntime getSystemRuntime() {
		return getSysAIFactoryRuntimeContext().getAIFactoryRuntime().getSystemRuntime();
	}
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return null;
	}
	
	protected GStringTemplateEngine getEngine() {
		if(this.engine == null) {
			this.engine = new GStringTemplateEngine(this.getSystemRuntime().getGroovyClassLoader());
		}
		return this.engine;
	}
	
	protected ISysPortalUtilRuntime getSysPortalUtilRuntime() {
		if (this.iSysPortalUtilRuntime == null) {
			this.iSysPortalUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysPortalUtilRuntime.class, false);
		}
		return this.iSysPortalUtilRuntime;
	}
	
	
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params) throws Throwable{
		return this.getContent(data, strTemplateId, params, false);
	}
	
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params, boolean bTryMode) throws Throwable{

		Template template = this.getTemplate(strTemplateId, bTryMode);
		if(template == null) {
			return null;
		}

		Map<String, Object> engineParams = new HashMap<String, Object>();
		if (params != null) {
			engineParams.putAll(params);
		}
		engineParams.put(TEMPLATE_PARAM_DATA, data);
		engineParams.put(TEMPLATE_PARAM_CTX, this.getModelRuntimeContext());
		engineParams.put(TEMPLATE_PARAM_SYS, this.getSystemRuntime());
		if(this.getDataEntityRuntime() != null) {
			engineParams.put(TEMPLATE_PARAM_DE, this.getDataEntityRuntime());
		}
		else {
			engineParams.put(TEMPLATE_PARAM_DE, null);
		}
		
		engineParams.put(TEMPLATE_PARAM_REQUEST, ChatCompletionRequestHolder.peek());
		

		StringWriter sw = new StringWriter();
		template.make(engineParams).writeTo(sw);

		return sw.toString();
	}
	
	protected Template getTemplate(String strTemplateId, boolean bTryMode) throws Throwable {
		if (isEnableTemplateCache()) {
			Template template = getTemplateCacheMap().get(strTemplateId);
			if (template == null) {
				String strTemplateContent = this.getTemplateContent(strTemplateId, bTryMode);
				if(!StringUtils.hasLength(strTemplateContent)) {
					return null;
				}
				StringReader reader = new StringReader(strTemplateContent);
				template = getEngine().createTemplate(reader);
				this.getTemplateCacheMap().put(strTemplateId, template);
			}
			return template;
		} else {
			String strTemplateContent = this.getTemplateContent(strTemplateId, bTryMode);
			if(!StringUtils.hasLength(strTemplateContent)) {
				return null;
			}
			StringReader reader = new StringReader(strTemplateContent);
			return getEngine().createTemplate(reader);
		}
	}
	
	/**
	 * 获取模板内容
	 * 
	 * @param strTemplateId
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected String getTemplateContent(String strTemplateId, boolean bTryMode) throws Throwable {
		String strContent = this.configContentMap.get(strTemplateId);
		if(strContent!=null && strContent.length() == 0){
			if(!bTryMode) {
				throw new Exception(String.format("指定配置[%1$s]不存在", strTemplateId));
			}
			return null;
		}
		
		String strFullConfigId = String.format("%1$s%2$s%3$s", this.getConfigPath(), File.separator, strTemplateId);
		
		strContent = this.getSysAIFactoryRuntimeContext().getConfigContent(null, strFullConfigId, true);
		if(!StringUtils.hasLength(strContent)) {
			strContent = "";
		}
		this.configContentMap.put(strTemplateId, strContent);
		if(strContent!=null && strContent.length() == 0){
			if(!bTryMode) {
				throw new Exception(String.format("指定配置[%1$s]不存在", strFullConfigId));
			}
			return null;
		}
		return strContent;
	}
	
	

	protected Map<String, Template> getTemplateCacheMap() {
		return this.defaultTemplateCacheMap;
	}
	
//	protected void registerConfigAlias(String strAlias, String strConfigId) {
//		this.configAliasMap.put(strAlias, strConfigId);
//	}
//
//	protected boolean unregisterConfigAlias(String strAlias, String strConfigId) {
//		return this.configAliasMap.remove(strAlias, strConfigId);
//	}
//
//	protected String getRealConfigId(String strConfigId) {
//		String strRealConfigId = this.configAliasMap.get(strConfigId);
//		if (StringUtils.hasLength(strRealConfigId)) {
//			return strRealConfigId;
//		}
//		return strConfigId;
//	}

	protected boolean isEnableTemplateCache() {
		return true;
	}
	
	protected SysAIAgentRTScriptBase createAIAgentRTScript(String strObjectName, String strScriptCode) throws Exception{
		return this.createAIAgentRTScript(strObjectName, strScriptCode, null);
	}
	
	protected SysAIAgentRTScriptBase createAIAgentRTScript(String strObjectName, String strScriptCode, Class<? extends SysAIAgentRTScriptBase> baseCls) throws Exception{
		Object obj = null;
		if(StringUtils.hasLength(strObjectName)) {
			try {
				Class cls = Class.forName(strObjectName);
				obj = cls.newInstance();
			}
			catch (Exception ex) {
			}
		}
		if(obj == null) {
			if(!StringUtils.hasLength(strScriptCode)) {
				throw new Exception(String.format("建立AI代理脚本对象发生异常，%1$s", "未传入脚本代码"));
			}
			CompilerConfiguration compilerConfiguration = new CompilerConfiguration();
			if(baseCls == null) {
				compilerConfiguration.setScriptBaseClass(getScriptBaseClass().getName());
			}
			else {
				compilerConfiguration.setScriptBaseClass(baseCls.getName());
			}
			
			try(GroovyClassLoader classLoader = new GroovyClassLoader(this.getSystemRuntime().getGroovyClassLoader())) {
				GroovyShell groovyShell = new GroovyShell(classLoader, compilerConfiguration);
				obj = groovyShell.parse(strScriptCode);
			}
			catch (Exception ex) {
				throw new Exception(String.format("建立AI代理脚本对象发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
		if(!(obj instanceof SysAIAgentRTScriptBase)) {
			throw new Exception(String.format("建立AI代理脚本对象[%1$s]类型不正确", obj));
		}
		
		try {
			SysAIAgentRTScriptBase aiAgentScriptBase = (SysAIAgentRTScriptBase)obj;
			Map<String, Object> params = new HashMap<String, Object>();
			params.put(TEMPLATE_PARAM_CTX, this.getModelRuntimeContext());
			params.put(TEMPLATE_PARAM_DE, this.getDataEntityRuntime());
			params.put(TEMPLATE_PARAM_SYS, this.getSystemRuntime());
			params.put(TEMPLATE_PARAM_AGENT, this);
			
			this.onFillScriptBinding(params);
			
			aiAgentScriptBase.setBinding(new Binding(params));
			aiAgentScriptBase.setOwner(this);
			aiAgentScriptBase.run();
			return aiAgentScriptBase;
		}
		catch (Exception ex) {
			throw new Exception(String.format("AI代理脚本对象运行发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onFillScriptBinding(Map<String, Object> params) {
		
	}
	
	protected Class<?> getScriptBaseClass() {
		return SysAIAgentRTScriptBase.class;
	}
	
	
	protected AIAgentRTScriptBase getAIAgentRTScript(boolean bTryMode) throws Exception{
		if(this.aiAgentRTScriptBase == null) {
			String strTemplateContent;
			try {
				strTemplateContent = this.getTemplateContent(getModelRTScriptConfigId(), bTryMode);
				if(!StringUtils.hasLength(strTemplateContent)) {
					return null;
				}
				this.aiAgentRTScriptBase = this.createAIAgentRTScript(null, strTemplateContent);
			} catch (Throwable ex) {
				ExceptionUtils.rethrowException(ex);
			}
		}
		return this.aiAgentRTScriptBase;
	}
	
	protected String getModelRTScriptConfigId() throws Exception {
		return String.format("template%1$s%2$s.groovy", File.separator, this.getAgentMode()).toLowerCase();
	}
	
	protected List getActiveData(Object dataOrKeys) throws Throwable {
		List<IEntity> entityList = new ArrayList<IEntity>();
		if(dataOrKeys instanceof List) {
			List list = (List)dataOrKeys;
			for(Object item : list) {
				if(item instanceof IEntity) {
					entityList.add((IEntity)item);
				}
				else {
					throw new Exception(String.format("无法识别的数据[%1$s]", item));
				}
			}
		}
		else {
			if(dataOrKeys instanceof IEntity) {
				entityList.add((IEntity)dataOrKeys);
			}
			else {
				throw new Exception(String.format("无法识别的数据[%1$s]", dataOrKeys));
			}
		}
		return entityList;
	}
	
	@Override
	public Object executeAction(String strAction, Object[] args) throws Throwable {
		Assert.notEmpty(args, "传入参数无效");
		try {
			return this.onExecuteAction(strAction, args);
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this.getSysAIFactoryRuntimeContext().getAIFactoryRuntime(), this, String.format("执行操作[%1$s]发生异常，%2$s", strAction, ex.getMessage()), ex);
		}
	}
	
	protected Object onExecuteAction(String strAction, Object[] args) throws Throwable {
		return getAIAgentRTScript(false).call(strAction, ModelRTScriptBase.ATTACHMODE_EXECUTE, args);
	}
	
	protected Page<Chunk> fetchChunks(String type, String query, Float similarityThreshold, Float vectorSimilarityWeight, Integer size) {
		ChunkSearchContext chunkSearchContext = new ChunkSearchContext();
		chunkSearchContext.setQuery(query);
		if(similarityThreshold!=null) {
			chunkSearchContext.setSimilarityThreshold(similarityThreshold);
		}
		if(vectorSimilarityWeight!=null) {
			chunkSearchContext.setVectorSimilarityWeight(vectorSimilarityWeight);
		}
		if(size != null) {
			chunkSearchContext.setPageable(0, size, 0);
		}
		return this.doFetchChunks(type, chunkSearchContext);
	}
	
	protected Page<Chunk> doFetchChunks(String type, IChunkSearchContext iChunkSearchContext) {
		return this.getSysKBUtilRuntime().fetchChunks(type, iChunkSearchContext);
	}
	
	protected ChatCompletionResult rawChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest){
		if(StringUtils.hasLength(strAIPlatformType)) {
			return this.getSysAIUtilRuntime().chatCompletion(strAIPlatformType, chatCompletionRequest);
		}
		return this.getSysAIUtilRuntime().chatCompletion(this.getAIPlatformType(), chatCompletionRequest);
	}
	
	protected ChatCompletionResult doChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest)  throws Throwable{
		return this.rawChatCompletion(strAIPlatformType, chatCompletionRequest);
	}
	
	/**
	 * 异步交互补全
	 * @param type
	 * @param chatCompletionRequest
	 * @return
	 */
	protected PortalAsyncAction doAsyncChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable{
		return this.getSysAIUtilRuntime().asyncChatCompletion(strAIPlatformType, chatCompletionRequest);
	}
	
	
	@Override
	public void reload() {
		try {
			this.onReload();
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this.getSysAIFactoryRuntimeContext().getAIFactoryRuntime(), this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onReload() throws Throwable {
		this.engine = null;
		this.configContentMap.clear();
		this.defaultTemplateCacheMap.clear();
		this.aiAgentRTScriptBase = null;
	}
	
}
