package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.codehaus.groovy.control.CompilerConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import groovy.text.GStringTemplateEngine;
import groovy.text.Template;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysKBUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.runtime.util.ExceptionUtils;

public abstract class SysAIChatResourceBase implements ISysAIChatResource {
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIChatResourceBase.class);
		
	/**
	 * 模板上下文参数：当前数据
	 */
	public final static String TEMPLATE_PARAM_DATA = "data";

	/**
	 * 模板上下文参数：上下文对象
	 */
	public final static String TEMPLATE_PARAM_CTX = "ctx";
	
	
	/**
	 * 模板上下文参数：系统运行时对象
	 */
	public final static String TEMPLATE_PARAM_SYS = "sys";
	
	
	private String strConfigPath = null;
	
	//private Map<String, String> configAliasMap = new HashMap<String, String>();
	private Map<String, String> configContentMap = new HashMap<String, String>();
	private GStringTemplateEngine engine = null; 
	private Map<String, Template> defaultTemplateCacheMap = new ConcurrentHashMap<String, Template>();
	private AIAgentRTScriptBase aiAgentRTScriptBase = null;
	
	private ISysAIFactoryRuntimeContext ctx = null;
	private IAIAgentRuntimeBaseContext iAIAgentRuntimeBaseContext;
	private String resourceType = null;
	private boolean calcAIAgentRTScript = false;
	
	private ISysKBUtilRuntime iSysKBUtilRuntime = null;
	
	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, String type) throws Exception {
		this.resourceType = type;
		this.init(iSysAIFactoryRuntimeContext);
	}
	
	
	protected void init(ISysAIFactoryRuntimeContext ctx) throws Exception {
		this.ctx = ctx;
		onInit();
	}
	
	protected void onInit() throws Exception {
		if (!StringUtils.hasLength(this.getConfigPath())) {
			this.setConfigPath(String.format("%1$s%2$s%3$s", this.getAgentType(), "/", this.getAgentSubType()).toLowerCase());
		}
		this.getAIAgentRTScript(true);
	}
	


	protected IAIAgentRuntimeBaseContext getModelRuntimeContext() {
		if(this.iAIAgentRuntimeBaseContext == null) {
			this.iAIAgentRuntimeBaseContext = this.createModelRuntimeContext();
		}
		return this.iAIAgentRuntimeBaseContext;
	}
	
	protected ISysKBUtilRuntime getSysKBUtilRuntime() {
		if (this.iSysKBUtilRuntime == null) {
			this.iSysKBUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysKBUtilRuntime.class, false);
		}
		return this.iSysKBUtilRuntime;
	}
	
	private SysAIChatResourceBase getSelf() {
		return this;
	}
	
	protected IAIAgentRuntimeBaseContext createModelRuntimeContext() {
		return new SysAIChatResourceContextBase() {
			
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
		};
	}
	

	@Override
	public String getResourceType() {
		return resourceType;
	}
	
	public String getAgentSubType() {
		return "DEFAULT";
	}

	public String getAgentType() {
		return AIAGENT_RESOURCE;
	}
	
	public String getConfigPath() {
		return strConfigPath;
	}

	protected void setConfigPath(String strConfigPath) {
		this.strConfigPath = strConfigPath;
	}

	protected ISysAIFactoryRuntimeContext getSysAIFactoryRuntimeContext() {
		return this.ctx;
	}

	//@Override
	public ISysAIFactoryRuntime getAIFactoryRuntime() {
		return this.getSysAIFactoryRuntimeContext().getAIFactoryRuntime();
	}
	
	
	protected ISystemRuntime getSystemRuntime() {
		return getSysAIFactoryRuntimeContext().getAIFactoryRuntime().getSystemRuntime();
	}
	
	protected GStringTemplateEngine getEngine() {
		if(this.engine == null) {
			this.engine = new GStringTemplateEngine(this.getSystemRuntime().getGroovyClassLoader());
		}
		return this.engine;
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
	
	protected AIAgentRTScriptBase createAIAgentRTScript(String strObjectName, String strScriptCode) throws Exception{
		return this.createAIAgentRTScript(strObjectName, strScriptCode, null);
	}
	
	protected AIAgentRTScriptBase createAIAgentRTScript(String strObjectName, String strScriptCode, Class<? extends AIAgentRTScriptBase> baseCls) throws Exception{
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
		
		if(!(obj instanceof AIAgentRTScriptBase)) {
			throw new Exception(String.format("建立AI代理脚本对象[%1$s]类型不正确", obj));
		}
		
		try {
			AIAgentRTScriptBase aiAgentScriptBase = (AIAgentRTScriptBase)obj;
			Map<String, Object> params = new HashMap<String, Object>();
			params.put(TEMPLATE_PARAM_CTX, this.getModelRuntimeContext());
			params.put(TEMPLATE_PARAM_SYS, this.getSystemRuntime());
			
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
		return AIAgentRTScriptBase.class;
	}
	
	
	protected AIAgentRTScriptBase getAIAgentRTScript(boolean bTryMode) throws Exception{
		if(this.aiAgentRTScriptBase == null) {
			if(!this.calcAIAgentRTScript || !bTryMode) {
				String strTemplateContent;
				try {
					strTemplateContent = this.getTemplateContent(getModelRTScriptConfigId(), bTryMode);
					if(!StringUtils.hasLength(strTemplateContent)) {
						return null;
					}
					this.aiAgentRTScriptBase = this.createAIAgentRTScript(null, strTemplateContent);
					this.calcAIAgentRTScript = true;
				} catch (Throwable ex) {
					ExceptionUtils.rethrowException(ex);
				}
			}
		}
		return this.aiAgentRTScriptBase;
	}
	
	protected String getModelRTScriptConfigId() throws Exception {
		return String.format("template%1$s%2$s.groovy", File.separator, this.getResourceType()).toLowerCase();
	}
	
	
	@Override
	public String getContent(String subType, String key, boolean testPriv) throws Exception {
		AIAgentRTScriptBase aiAgentRTScriptBase = this.getAIAgentRTScript(true);
		if(aiAgentRTScriptBase != null) {
			Object ret = aiAgentRTScriptBase.call(new Object[] {subType, key, testPriv});
			if(ret != null) {
				return ret.toString();
			}
		}
		return null;
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
	
	@Override
	public void reload() {
		try {
			this.onReload();
		}
		catch (Throwable ex) {
			log.error(ex);
		}
	}
	
	protected void onReload() throws Throwable {
		this.engine = null;
		this.configContentMap.clear();
		this.defaultTemplateCacheMap.clear();
		this.calcAIAgentRTScript = false;
		this.aiAgentRTScriptBase = null;
		
	}
}
