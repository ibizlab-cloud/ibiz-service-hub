package net.ibizsys.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSDynaInstService;
import net.ibizsys.model.IPSDynaInstServiceGlobal;
import net.ibizsys.model.IPSDynaInstServiceRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSDynaInstServiceGlobal;
import net.ibizsys.model.PSModelEnums.PluginRTMode;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.database.IPSSysDBValueFunc;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.model.res.PSSysUtilImpl;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.addin.ISystemRTAddin;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityEventListener;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.plugin.IModelRTAddin;
import net.ibizsys.runtime.plugin.IRuntimeObjectFactory;
import net.ibizsys.runtime.plugin.ModelRTAddinRepo;
import net.ibizsys.runtime.plugin.SysSFPluginRuntimeObjectFactory;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.res.ISysValueFuncRuntime;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.res.SysSFPluginRuntime;
import net.ibizsys.runtime.res.SysUtilTypes;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.ModelRuntimeUtils;
import net.ibizsys.runtime.util.SystemRuntimeHolder;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.ISystemRTScriptContext;
import net.ibizsys.runtime.util.script.ScriptEntity;
import net.ibizsys.runtime.util.script.SystemRTScriptContext;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

/**
 * 系统运行时接口对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class SystemRuntimeBase extends SystemUtilRuntimeBase implements ISystemRuntime, IPSDynaInstServiceGlobal {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemRuntimeBase.class);
	
	public final static String VERSION = "8.1.0.574";
	public final static String RUNTIMETYPE_R8 = "R8";
	
	private final static Map<String, String> ScriptCodeEngineMap = new HashMap<String, String>();
	static {
		ScriptCodeEngineMap.put(SCRIPTMACRO_GROOVY, SCRIPTENGINE_GROOVY);
		ScriptCodeEngineMap.put(SCRIPTMACRO_GROOVY2, SCRIPTENGINE_GROOVY);
		ScriptCodeEngineMap.put(SCRIPTMACRO_JAVASCRIPT, SCRIPTENGINE_JAVASCRIPT);
		ScriptCodeEngineMap.put(SCRIPTMACRO_JAVASCRIPT2, SCRIPTENGINE_JAVASCRIPT);
	}
	
	

	private Map<String, IDataEntityRuntime> dataEntityMap = new HashMap<String, IDataEntityRuntime>();
	private IPSSystemService iPSSystemService = null;
	private Map<String, IDynaInstRuntime> dynaInstRuntimeMap = new HashMap<String, IDynaInstRuntime>();

	private ScheduledExecutorService refreshScheduledThreadPool = null;

	private java.util.Map<String, IPSDynaInstService> psDynaInstServicehMap = new HashMap<String, IPSDynaInstService>();

	private List<IDynaInstRuntime> checkDynaInstRuntimeList = new java.util.ArrayList<IDynaInstRuntime>();

	private int DYNAINST_CHECKTIMER = 30 * 1000;

	private ISystemRTScriptContext iSystemRTScriptContext = null;

	private Map<String, ISysUtilRuntime> sysUtilRuntimeMap = null;

	private Map<String, ISysValueFuncRuntime> sysValueFuncRuntimeMap = null;

	private Map<String, ISysSFPluginRuntime> sysSFPluginRuntimeMap = new ConcurrentHashMap<String, ISysSFPluginRuntime>();

	private Map<String, IPSCodeList> psCodeListMap = new HashMap<String, IPSCodeList>();

	private ISysFileUtilRuntime iSysFileUtilRuntime = null;

	private boolean loaded = false;
	
	private java.util.Date loadedDate = null;
	
	private Map<ISystemEventListener, String[]> systemEventListenerMap = new LinkedHashMap<ISystemEventListener, String[]>();
	
	private Map<String, Map<IDataEntityEventListener, String[]>> dataEntityEventListenerMap = new ConcurrentHashMap<String, Map<IDataEntityEventListener,String[]>>();
	
	private IRuntimeObjectFactory iRuntimeObjectFactory = null;
	
	private ModelRTAddinRepo modelRTAddinRepo = null;
	
	/**
	 * 系统运行时上下文对象
	 */
	private ISystemRuntimeContext iSystemRuntimeContext = new ISystemRuntimeContext() {

		@Override
		public ISystemRuntime getSystemRuntime() {
			return getSelf();
		}

		@Override
		public IPSSystemService getPSSystemService() {
			return getSelf().getPSSystemService();
		}

	};
	
	private IDataEntityEventListener iDataEntityEventListener = new IDataEntityEventListener() {
		
		@Override
		public void receiveEvent(IDataEntityRuntime iDataEntityRuntime, String event, Object[] params) {
			onReceiveDataEntityEvent(iDataEntityRuntime, event, params);
		}
	};
	
	

	public SystemRuntimeBase() {
		setPSDynaInstServiceGlobal();
		// this.iSystemRTScriptContext = createSystemRTScriptContext();
	}

	/**
	 * 设置当前系统运行时服务对象为默认动态实例服务对象
	 */
	protected void setPSDynaInstServiceGlobal() {
		PSDynaInstServiceGlobal.setInstance(this);
	}

	private SystemRuntimeBase getSelf() {
		return this;
	}

	@Override
	public ISystemRTScriptContext getSystemRTScriptContext() {
		if (this.iSystemRTScriptContext == null) {
			this.iSystemRTScriptContext = createSystemRTScriptContext();
		}
		return this.iSystemRTScriptContext;
	}

	protected ISystemRTScriptContext createSystemRTScriptContext() {
		return new SystemRTScriptContext(this.getSystemRuntimeContext());
	}

	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	@Override
	protected ISystemRuntimeBaseContext getSystemRuntimeBaseContext() {
		return this.getSystemRuntimeContext();
	}
	

	// /**
	// * 获取当前用户上下文
	// * @return
	// */
	// protected abstract IUserContext getUserContext();
	//

	@Override
	public void registerDataEntityRuntime(IDataEntityRuntime iDataEntity) {

		if (StringUtils.hasLength(iDataEntity.getId())) {
			dataEntityMap.put(iDataEntity.getId(), iDataEntity);
		}

		if (StringUtils.hasLength(iDataEntity.getName())) {
			dataEntityMap.put(iDataEntity.getName().toLowerCase(), iDataEntity);
		}
		
		try {
			String strTag = PSModelUtils.calcFullUniqueTag2(iDataEntity.getPSDataEntity());
			if (StringUtils.hasLength(strTag)) {
				if(!dataEntityMap.containsKey(strTag)) {
					dataEntityMap.put(strTag, iDataEntity);
					if(this.isRegisterDataEntityEventListener()) {
						iDataEntity.registerDataEntityEventListener(this.iDataEntityEventListener);
					}
				}
				strTag = strTag.toLowerCase();
				if(!dataEntityMap.containsKey(strTag)) {
					dataEntityMap.put(strTag, iDataEntity);
				}
			}
		} catch (Exception ex) {
			log.error(ex);
		}
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime(String strIdOrName) {
		return getDataEntityRuntime(strIdOrName, false);
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime(String strIdOrName, boolean bTryMode) {
		IDataEntityRuntime iDataEntity = dataEntityMap.get(strIdOrName);
		if (iDataEntity == null) {
			iDataEntity = dataEntityMap.get(strIdOrName.toLowerCase());
			if (iDataEntity == null && !bTryMode) {
				throw new SystemRuntimeException(this, String.format("无法获取指定实体[%1$s]运行时对象", strIdOrName));
			}
		}
		return iDataEntity;
	}

	@Override
	public String getId() {
		return "PSSYSTEM.json";
	}

	@Override
	public String getName() {
		return "系统";
	}

	@Override
	public IPSSystemService getPSSystemService() {
		try {
			if (this.iPSSystemService == null) {
				IPSSystemService iPSSystemService = this.createPSSystemService();

				this.iPSSystemService = iPSSystemService;
				try {
					SystemRuntimeHolder.push(this);
					this.onBeforeInit();
					this.prepareSysSFPluginRuntimes();
					this.prepareThreadPoolExecutors();
					this.onInit();
					this.onBeforeStart();
					this.onStart();
					this.onAfterStart();
					this.markLoaded();
				}
				finally {
					SystemRuntimeHolder.poll();
				}
				
			}
			return this.iPSSystemService;
		} catch (Exception ex) {
			this.iPSSystemService = null;
			this.refreshScheduledThreadPool = null;
			log.error(String.format("获取核心系统模型服务对象发生异常，%1$s", ex.getMessage()), ex);
			throw new SystemRuntimeException(this, String.format("获取核心系统模型服务对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void setPSSystemService(IPSSystemService iPSSystemService) {
		this.iPSSystemService = iPSSystemService;
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		// 准备系统代码表
		java.util.List<IPSCodeList> psCodeLists = this.getPSSystem().getAllPSCodeLists();
		if (psCodeLists != null) {
			for (IPSCodeList iPSCodeList : psCodeLists) {
				psCodeListMap.put(iPSCodeList.getDynaModelFilePath(), iPSCodeList);
				if (StringUtils.hasLength(iPSCodeList.getCodeListTag())) {
					psCodeListMap.put(iPSCodeList.getCodeListTag(), iPSCodeList);
				}
			}
		}

		// 准备系统基础功能组件
		java.util.List<IPSSysUtil> psSysUtils = this.getPSSystem().getAllPSSysUtils();
		if (psSysUtils != null) {
			for (IPSSysUtil iPSSysUtil : psSysUtils) {
				this.registerPSSysUtil(iPSSysUtil);
			}
		}

		if (this.getSysFileUtilRuntime(true) == null) {
			this.setSysFileUtilRuntime(this.registerDefaultSysFileUtilRuntime());
		}

		// 准备系统值函数
		java.util.List<IPSSysDBValueFunc> psSysDBValueFuncs = this.getPSSystem().getAllPSSysDBValueFuncs();
		if (psSysDBValueFuncs != null) {
			for (IPSSysDBValueFunc iPSSysDBValueFunc : psSysDBValueFuncs) {
				this.registerPSSysValueFunc(iPSSysDBValueFunc);
			}
		}
	}
	
	@Override
	public boolean isLoaded() {
		return this.loaded;
	}
	
	protected void markLoaded() throws Exception {
		if(this.loaded) {
			return;
		}
		this.loaded = true;
		this.loadedDate = new java.util.Date();
		this.onLoad();
		this.fireSystemEvent(SYSTEMEVENT_LOAD, null);
	}

	@Override
	public Date getLoadedDate() {
		return this.loadedDate;
	}
	
	protected void prepareSysSFPluginRuntimes() throws Exception {
		// 准备系统运行时插件
		java.util.List<IPSSysSFPlugin> psSysSFPluginsReal = this.getPSSystem().getAllPSSysSFPlugins();
		if (!ObjectUtils.isEmpty(psSysSFPluginsReal)) {
//			for (IPSSysSFPlugin iPSSysSFPlugin : psSysSFPlugins) {
//				this.registerPSSysSFPlugin(iPSSysSFPlugin);
//			}
			
			//先加载远程组件
			java.util.List<IPSSysSFPlugin> psSysSFPlugins = new ArrayList<IPSSysSFPlugin>();
			for (IPSSysSFPlugin iPSSysSFPlugin : psSysSFPluginsReal) {
				if(iPSSysSFPlugin.isRuntimeObject() && iPSSysSFPlugin.getRTObjectSource() == PluginRTMode.REMOTE.value) {
					registerPSSysSFPlugin(iPSSysSFPlugin);
				}
				else {
					psSysSFPlugins.add(iPSSysSFPlugin);
				}
			}
			
			while(true) {
				Map<IPSSysSFPlugin, Throwable> taskRetMap = new LinkedHashMap<IPSSysSFPlugin, Throwable>();
				List<CompletableFuture<?>> taskList = new ArrayList<CompletableFuture<?>>();
				for (IPSSysSFPlugin iPSSysSFPlugin : psSysSFPlugins) {
					CompletableFuture<Void> task = CompletableFuture.runAsync(new Runnable() {
						@Override
						public void run() {
							try {
								registerPSSysSFPlugin(iPSSysSFPlugin);
							} catch (Throwable ex) {
								//log.error(String.format("注册后台插件[%1$s]发生异常，%2$s", iPSSysSFPlugin.getName(), ex.getMessage()), ex);
								taskRetMap.put(iPSSysSFPlugin, ex);
							}
						}
					});
					taskList.add(task);
				}

				try {
					CompletableFuture.allOf(taskList.toArray(new CompletableFuture<?>[taskList.size()])).get();
				} catch (Exception ex) {
					throw new Exception(String.format("准备后台插件发生异常，%1$s", ex.getMessage()), ex);
				}
				
				if(taskRetMap.size() == 0) {
					break;
				}
				
				if(taskRetMap.size() ==  psSysSFPlugins.size()) {
					for(java.util.Map.Entry<IPSSysSFPlugin, Throwable> entry : taskRetMap.entrySet()) {
						if(entry.getValue() instanceof ModelException) {
							log.error(entry.getValue().getMessage(), entry.getValue());
						}
						else {
							log.error(String.format("注册后台插件[%1$s]发生异常，%2$s", entry.getKey().getName(), entry.getValue().getMessage()), entry.getValue());
						}
					}
					
					for(java.util.Map.Entry<IPSSysSFPlugin, Throwable> entry : taskRetMap.entrySet()) {
						throw new Exception(String.format("注册后台插件[%1$s]发生异常，%2$s", entry.getKey().getName(), entry.getValue().getMessage()), entry.getValue());
					}
				}
				
				psSysSFPlugins.clear();
				psSysSFPlugins.addAll(taskRetMap.keySet());
			}
		}
		
		try {
			SysSFPluginRuntimeObjectFactory sysSFPluginRuntimeObjectFactory = new SysSFPluginRuntimeObjectFactory();
			sysSFPluginRuntimeObjectFactory.init(this.getSystemRuntimeContext(), super.getRuntimeObjectFactory());
			this.setRuntimeObjectFactory(sysSFPluginRuntimeObjectFactory);
		}
		catch (Exception ex) {
			throw new Exception(String.format("初始化后台插件对象类工厂发生异常，%1$s", ex.getMessage()), ex);
		}
		
		if(this.getAddinRepo(true) == null) {
			this.prepareAddinRepo();
		}
		if(this.getAddinRepo(true) != null) {
			this.onPrepareAddins();
		}
	}
	
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(this.getSystemRuntimeContext(), ISystemRTAddin.class, null);
	}
	
	protected void onPrepareAddins() throws Exception {
		if(this.isEnableAddins(ADDIN_DATAENTITYEVENTLISTENER_PREFIX)) {
			Map<String, IDataEntityEventListener> dataEntityEventListenerMap = this.getAddins(IDataEntityEventListener.class, ADDIN_DATAENTITYEVENTLISTENER_PREFIX);
			if(!ObjectUtils.isEmpty(dataEntityEventListenerMap)) {
				for(java.util.Map.Entry<String, IDataEntityEventListener> entry : dataEntityEventListenerMap.entrySet()) {
					String strKey = entry.getKey();
					String strPattern = "*";
					if(StringUtils.hasLength(strKey)) {
						String[] items = strKey.split("[:]");
						if(items.length == 2) {
							strPattern = items[1];
						}
					}
					this.registerDataEntityEventListener(new String[] {strPattern}, entry.getValue());
				}
			}
		}
	}
	
	protected boolean isEnableAddins(String strAddinPrefix) {
		return true;
	}
	
	@Override
	public IRuntimeObjectFactory getRuntimeObjectFactory() {
		return this.iRuntimeObjectFactory;
	}
	
	private void setRuntimeObjectFactory(IRuntimeObjectFactory iRuntimeObjectFactory) {
		this.iRuntimeObjectFactory = iRuntimeObjectFactory;
	}
	
	protected ModelRTAddinRepo getAddinRepo(boolean bTryMode) throws Exception{
		if (this.modelRTAddinRepo != null || bTryMode) {
			return this.modelRTAddinRepo;
		}
		throw new Exception("插件仓库无效");
	}

	protected ModelRTAddinRepo getAddinRepo() {
		try {
			return this.getAddinRepo(false);
		}
		catch (Exception ex) {
			throw new SystemRuntimeException(this, ex.getMessage(), ex);
		}
	}

	protected void setAddinRepo(ModelRTAddinRepo modelRTAddinRepo) {
		this.modelRTAddinRepo = modelRTAddinRepo;
	}

	protected void prepareAddinRepo(IModelRuntimeContext ctx, Class<? extends IModelRTAddin> addinCls, String strTypePrefix) throws Exception {
		ModelRTAddinRepo modelRTAddinRepo = new ModelRTAddinRepo();
		modelRTAddinRepo.init(ctx, addinCls, strTypePrefix, this.getRuntimeObjectFactory());
		this.setAddinRepo(modelRTAddinRepo);
	}

	@Override
	public <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
		return this.getAddinRepo().getAddins(cls, strTypePrefix);
	}

	@Override
	public ISysUtilRuntime getSysUtilRuntime(String strTag) {
		return this.getSysUtilRuntime(strTag, false);
	}

	@Override
	public ISysUtilRuntime getSysUtilRuntime(String strTag, boolean bTryMode) {
		ISysUtilRuntime iSysUtilRuntime = null;
		if (this.sysUtilRuntimeMap != null) {
			iSysUtilRuntime = this.sysUtilRuntimeMap.get(strTag);
			if(iSysUtilRuntime == null) {
				iSysUtilRuntime = this.sysUtilRuntimeMap.get(strTag.toLowerCase());
			}
		}

		if (iSysUtilRuntime != null || bTryMode) {
			return iSysUtilRuntime;
		}
		throw new SystemRuntimeException(this, String.format("无法获取指定系统功能组件运行时对象[%1$s]", strTag));
	}

	@Override
	public <T> T getSysUtilRuntime(Class<T> cls, boolean bTryMode) {
		if (this.sysUtilRuntimeMap != null) {
			for (ISysUtilRuntime iSysUtilRuntime : this.sysUtilRuntimeMap.values()) {
				if (cls.isAssignableFrom(iSysUtilRuntime.getClass())) {
					return (T) iSysUtilRuntime;
				}
			}
		}

		if (bTryMode) {
			return null;
		}

		throw new SystemRuntimeException(this, String.format("无法获取指定系统功能组件运行时对象[%1$s]", cls.getCanonicalName()));
	}

	protected ISysUtilRuntime registerPSSysUtil(IPSSysUtil iPSSysUtil) throws Exception {

		if(this.sysUtilRuntimeMap != null) {
			ISysUtilRuntime iSysUtilRuntime = this.sysUtilRuntimeMap.get(iPSSysUtil.getId());
			if(iSysUtilRuntime!=null) {
				return iSysUtilRuntime;
			}
		}
		
		ISysUtilRuntime iSysUtilRuntime = this.createSysUtilRuntime(iPSSysUtil);
		if (iSysUtilRuntime == null) {
			return null;
		}
		try {
			iSysUtilRuntime.init(this.getSystemRuntimeContext(), iPSSysUtil);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化系统功能组件[%1$s]运行时对象发生异常，%2$s", iPSSysUtil.getName(), ex.getMessage()), ex);
		}
		
		if (this.sysUtilRuntimeMap == null) {
			this.sysUtilRuntimeMap = new ConcurrentHashMap<>();
		}
		this.sysUtilRuntimeMap.put(iPSSysUtil.getId(), iSysUtilRuntime);
		if (!SysUtilTypes.USER.equals(iPSSysUtil.getUtilType())) {
			this.sysUtilRuntimeMap.put(iPSSysUtil.getUtilType(), iSysUtilRuntime);
			// this.sysUtilRuntimeMap.put(iPSSysUtil.getCodeName(),
			// iSysUtilRuntime);
		}
		
		// 注册全路径标识
		if (StringUtils.hasLength(iPSSysUtil.getCodeName())) {
			String strTag = null;
			if(iPSSysUtil.getPSSystemModule() != null) {
				strTag = PSModelUtils.calcUniqueTag(iPSSysUtil.getPSSystemModule(), iPSSysUtil.getCodeName());
			}
			else {
				strTag = PSModelUtils.calcUniqueTag(iPSSysUtil.getPSSysModelGroup(), iPSSysUtil.getCodeName());
			}
			
			if(this.sysUtilRuntimeMap.containsKey(strTag)) {
				log.warn(String.format("系统功能组件[%1$s]唯一标记[%2$s]已存在，忽略注册", iPSSysUtil.getName(), strTag));
			}
			else {
				this.sysUtilRuntimeMap.put(strTag, iSysUtilRuntime);
			}
			//PSModelUtils.calcUniqueTag(iPSSysUtil.getPSSysModelGroup() , strTag)
		}
		
		if (iSysUtilRuntime instanceof ISysFileUtilRuntime) {
			if(this.getSysFileUtilRuntime(true) == null) {
				this.setSysFileUtilRuntime((ISysFileUtilRuntime) iSysUtilRuntime);
			}
		}

		return iSysUtilRuntime;
	}

	@Override
	public ISysValueFuncRuntime getSysValueFuncRuntime(String strTag) {
		if (this.sysValueFuncRuntimeMap == null) {
			return null;
		}
		return this.sysValueFuncRuntimeMap.get(strTag);
	}

	protected ISysValueFuncRuntime registerPSSysValueFunc(IPSSysDBValueFunc iPSSysDBValueFunc) throws Exception {
		
		if(this.sysValueFuncRuntimeMap != null) {
			ISysValueFuncRuntime iSysValueFuncRuntime = this.sysValueFuncRuntimeMap.get(iPSSysDBValueFunc.getId());
			if(iSysValueFuncRuntime!=null) {
				return iSysValueFuncRuntime;
			}
		}
		
		
		ISysValueFuncRuntime iSysValueFuncRuntime = this.createSysValueFuncRuntime(iPSSysDBValueFunc);
		if (iSysValueFuncRuntime == null) {
			return null;
		}
		iSysValueFuncRuntime.init(this, iPSSysDBValueFunc);
		if (this.sysValueFuncRuntimeMap == null) {
			this.sysValueFuncRuntimeMap = new HashMap<>();
		}
		this.sysValueFuncRuntimeMap.put(iPSSysDBValueFunc.getCodeName().toUpperCase(), iSysValueFuncRuntime);
		return iSysValueFuncRuntime;
	}

	public ISysSFPluginRuntime getSysSFPluginRuntime(String strTag) {
		return getSysSFPluginRuntime(strTag, false);

	}

	@Override
	public ISysSFPluginRuntime getSysSFPluginRuntime(String strTag, boolean bTryMode) {
		ISysSFPluginRuntime iSysSFPluginRuntime = null;
		if (StringUtils.hasLength(strTag)) {
			if (!ObjectUtils.isEmpty(this.sysSFPluginRuntimeMap)) {
				iSysSFPluginRuntime = this.sysSFPluginRuntimeMap.get(strTag);
				if(iSysSFPluginRuntime == null) {
					iSysSFPluginRuntime = this.sysSFPluginRuntimeMap.get(strTag.toLowerCase());
				}
			}
		}
		if (iSysSFPluginRuntime != null || bTryMode) {
			return iSysSFPluginRuntime;
		}
		throw new SystemRuntimeException(this, String.format("无法获取指定系统插件，标识为[%1$s]", strTag));
	}

	protected ISysSFPluginRuntime registerPSSysSFPlugin(IPSSysSFPlugin iPSSysSFPlugin) throws Exception {
		
		if (!ObjectUtils.isEmpty(this.sysSFPluginRuntimeMap)) {
			ISysSFPluginRuntime iSysSFPluginRuntime = this.sysSFPluginRuntimeMap.get(iPSSysSFPlugin.getId());
			if(iSysSFPluginRuntime!=null) {
				return iSysSFPluginRuntime;
			}
		}
		
		ISysSFPluginRuntime iSysSFPluginRuntime = this.createSysSFPluginRuntime(iPSSysSFPlugin);
		Assert.notNull(iSysSFPluginRuntime, "系统插件运行时对象无效");
		iSysSFPluginRuntime.init(this.getSystemRuntimeContext(), iPSSysSFPlugin);
		this.sysSFPluginRuntimeMap.put(iPSSysSFPlugin.getId(), iSysSFPluginRuntime);
		
		if (StringUtils.hasLength(iPSSysSFPlugin.getPluginCode())) {
			String strTag = PSModelUtils.calcUniqueTag(iPSSysSFPlugin.getPSSystemModule(), iPSSysSFPlugin.getPluginCode());
			if(!this.sysSFPluginRuntimeMap.containsKey(strTag)) {
				this.sysSFPluginRuntimeMap.put(strTag, iSysSFPluginRuntime);
			}
		}

		// 延迟编译对象对象标识可能未出现
//		if(StringUtils.hasLength(iSysSFPluginRuntime.getRTObjectName())) {
//			if(!this.sysSFPluginRuntimeMap.containsKey(iSysSFPluginRuntime.getRTObjectName())) {
//				this.sysSFPluginRuntimeMap.put(iSysSFPluginRuntime.getRTObjectName(), iSysSFPluginRuntime);
//			}
//		}

		
		if (iPSSysSFPlugin.isReplaceDefault()) {
			if (!StringUtils.hasLength(iPSSysSFPlugin.getPluginCode())) {
				throw new ModelException(iPSSysSFPlugin, String.format("系统后台插件[%1$s]设置为全局默认但未指定插件标识", iPSSysSFPlugin.getPluginCode()));
			}
			this.sysSFPluginRuntimeMap.put(iPSSysSFPlugin.getPluginCode(), iSysSFPluginRuntime);
		}
		return iSysSFPluginRuntime;
	}
	
	@Override
	public ISysSFPluginRuntime reloadSysSFPluginRuntime(IPSSysSFPlugin iPSSysSFPlugin) {
		Assert.notNull(iPSSysSFPlugin, "传入后台插件对象无效");
		Assert.hasLength(iPSSysSFPlugin.getId(), "传入后台插件对象标识无效");
		
		if (!ObjectUtils.isEmpty(this.sysSFPluginRuntimeMap)) {
			this.sysSFPluginRuntimeMap.remove(iPSSysSFPlugin.getId());
		}
		
		try {
			return this.registerPSSysSFPlugin(iPSSysSFPlugin);
		}
		catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("注册系统插件[%1$s]发生异常，%2$s", iPSSysSFPlugin.getName(), ex.getMessage()), ex);
		}
	}
	
	

	@Override
	public Collection<ISysSFPluginRuntime> getSysSFPluginRuntimes() {
		if(ObjectUtils.isEmpty(this.sysSFPluginRuntimeMap)) {
			return null;
		}
		
		Collection<ISysSFPluginRuntime> list = new HashSet<ISysSFPluginRuntime>();
		for(ISysSFPluginRuntime iSysSFPlugRuntime : this.sysSFPluginRuntimeMap.values()) {
			list.add(iSysSFPlugRuntime);
		}
		return list;
	}

	/**
	 * 启动系统运行时
	 * 
	 * @param iPSSystemService
	 * @throws Exception
	 */
	protected void onStart() throws Exception {
		// 开启动态实例版本检查定时器
		if (this.refreshScheduledThreadPool == null) {
			this.refreshScheduledThreadPool = Executors.newScheduledThreadPool(1);
			this.refreshScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
				@Override
				public void run() {
					checkDynaInstRuntimes();
				}
			}, 30, 5, TimeUnit.SECONDS);
		}

	}

	protected void checkDynaInstRuntimes() {

		int nCount = 50;
		while (nCount > 0) {
			nCount--;
			IDynaInstRuntime iDynaInstRuntime = null;
			synchronized (this.checkDynaInstRuntimeList) {
				if (this.checkDynaInstRuntimeList.size() > 0) {
					iDynaInstRuntime = checkDynaInstRuntimeList.remove(0);
				}
			}
			if (iDynaInstRuntime == null) {
				break;
			}

			// 检查
			try {
				if (!iDynaInstRuntime.check() || !checkDynaInstRuntime(iDynaInstRuntime)) {
					// 移除
					this.psDynaInstServicehMap.remove(iDynaInstRuntime.getId());
					this.dynaInstRuntimeMap.remove(iDynaInstRuntime.getId());
					log.debug(String.format("动态实例运行时[%1$s]版本已变化，执行移除", iDynaInstRuntime.getId()));
					this.logEvent(LOGLEVEL_INFO, "动态实例卸载", String.format("动态实例运行时[%1$s][%2$s]版本已变化，执行移除", iDynaInstRuntime.getName(), iDynaInstRuntime.getId()), null);
				} else {
					iDynaInstRuntime.markChecked();
				}
			} catch (RuntimeException ex) {
				log.error(String.format("检查动态实例是否过期发生异常，%1$s", ex.getMessage()));
				synchronized (this.checkDynaInstRuntimeList) {
					checkDynaInstRuntimeList.clear();
				}
			}

		}
	}

	protected boolean checkDynaInstRuntime(IDynaInstRuntime iDynaInstRuntime) {
		return true;
	}

	/**
	 * 获取系统模型服务对象
	 * 
	 * @return
	 * @throws Exception
	 */
	protected abstract IPSSystemService createPSSystemService() throws Exception;

	protected abstract IPSDynaInstService createPSDynaInstService(String strPSDynaInstId) throws Exception;

	@Override
	public IPSSystem getPSSystem() {
		return getPSSystemService().getPSSystem();
	}
	
	@Override
	public String getPSDevSlnSysId() {
		return this.getPSSystem().getPSDevSlnSysId(); 
	}

	@Override
	public void refreshDynaInst(String strDynaInstId) {

	}

	@Override
	public IDynaInstRuntime getDynaInstRuntime(String strDynaInstId) {

		IDynaInstRuntime iDynaInstRuntime = dynaInstRuntimeMap.get(strDynaInstId);
		if (iDynaInstRuntime == null) {
			// 建立动态实例
			IPSDynaInstService iPSDynaInstService;
			try {
				iPSDynaInstService = createPSDynaInstService(strDynaInstId);
			} catch (Exception ex) {
				throw new SystemRuntimeException(this, String.format("建立动态实例模型服务对象发生异常，%1$s", ex.getMessage()), ex);
			}
			IDynaInstRuntime iDynaInstRuntime2 = createDynaInstRuntime();
			try {
				iDynaInstRuntime2.init(iPSDynaInstService, this.getSystemRuntimeContext());
			} catch (Exception ex) {
				throw new SystemRuntimeException(this, String.format("初始化动态实例模型服务对象发生异常，%1$s", ex.getMessage()), ex);
			}
			// 重新获取，如果存在则忽略放入map表
			iDynaInstRuntime = dynaInstRuntimeMap.get(strDynaInstId);
			if (iDynaInstRuntime == null) {
				dynaInstRuntimeMap.put(strDynaInstId, iDynaInstRuntime2);
				iDynaInstRuntime = iDynaInstRuntime2;
			}
			iDynaInstRuntime.markChecked();
			this.logEvent(LOGLEVEL_INFO, "动态实例挂载", String.format("动态实例运行时[%1$s][%2$s]已挂载", iDynaInstRuntime.getName(), iDynaInstRuntime.getId()), null);

		} else {
			if (System.currentTimeMillis() - iDynaInstRuntime.getLastCheckTime() > DYNAINST_CHECKTIMER) {
				// 需要检查
				iDynaInstRuntime.markChecked();
				synchronized (this.checkDynaInstRuntimeList) {
					this.checkDynaInstRuntimeList.add(iDynaInstRuntime);
				}

			}
		}
		iDynaInstRuntime.active();
		return iDynaInstRuntime;
	}

	@Override
	public IPSDynaInstService getCachePSDynaInstService(String strPSDynaInstId) {
		return psDynaInstServicehMap.get(strPSDynaInstId);
	}

	@Override
	public IPSDynaInstService getPSDynaInstService(String strPSDynaInstId, boolean bReload) throws Exception {
		IPSDynaInstService iPSDynaInstService = null;
		if (!bReload) {
			iPSDynaInstService = psDynaInstServicehMap.get(strPSDynaInstId);
			if (iPSDynaInstService != null) {
				return iPSDynaInstService;
			}
		}

		iPSDynaInstService = this.createPSDynaInstService(strPSDynaInstId);
		if (iPSDynaInstService instanceof IPSDynaInstServiceRuntime) {
			IPSDynaInstServiceRuntime iPSModelServiceRuntime = (IPSDynaInstServiceRuntime) iPSDynaInstService;
			iPSModelServiceRuntime.setPSDynaInstId(strPSDynaInstId);
			iPSModelServiceRuntime.setPSSystemService(this.getPSSystemService());
		}

		// 准备环境
		iPSDynaInstService.getPSSystem();

		psDynaInstServicehMap.put(strPSDynaInstId, iPSDynaInstService);
		return iPSDynaInstService;
	}

	@Override
	public void resetPSDynaInstService(String strPSDynaInstId) {
		psDynaInstServicehMap.remove(strPSDynaInstId);
	}

	@Override
	public void log(int nLogLevel, String strCat, String strInfo, Object objData) {

	}
	
	
	@Override
	public void info(Object cat, String strInfo) {
		Assert.notNull(cat, "未传入日志分类");
		if(cat instanceof String) {
			this.log(LogLevels.INFO, (String)cat, strInfo, null);
		}
		else {
			this.log(LogLevels.INFO, cat.getClass().getName(), strInfo, null);
		}
		
	}

	@Override
	public void warn(Object cat, String strInfo) {
		Assert.notNull(cat, "未传入日志分类");
		if(cat instanceof String) {
			this.log(LogLevels.WARN, (String)cat, strInfo, null);
		}
		else {
			this.log(LogLevels.WARN, cat.getClass().getName(), strInfo, null);
		}
	}

	@Override
	public void error(Object cat, String strInfo) {
		Assert.notNull(cat, "未传入日志分类");
		if(cat instanceof String) {
			this.log(LogLevels.ERROR, (String)cat, strInfo, null);
		}
		else {
			this.log(LogLevels.ERROR, cat.getClass().getName(), strInfo, null);
		}
	}

	@Override
	public void logAudit(int nLogLevel, String strCat, String strInfo, String strPersonId, String strAddress, Object objData) {

	}

	@Override
	public void logEvent(int nLogLevel, String strCat, String strInfo, Object objData) {

	}

	@Override
	public void logPO(int nLogLevel, String strCat, String strInfo, String strDEName, String strAction, long nTime, Object objData) {

	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSystem();
	}

	@Override
	public <T> T getRuntimeObject(IPSSysSFPlugin iPSSysSFPlugin, Class<T> cls, boolean bNewInstance) {
		if (iPSSysSFPlugin == null || !StringUtils.hasLength(iPSSysSFPlugin.getId())) {
			return null;
		}
		
		return getRuntimeObject(iPSSysSFPlugin.getId(), cls, bNewInstance, false);
	}

	@Override
	public <T> T getRuntimeObject(String strPluginTag, Class<T> cls, boolean bNewInstance, boolean bTryMode) {
		ISysSFPluginRuntime iSysSFPluginRuntime = this.getSysSFPluginRuntime(strPluginTag, bTryMode);
		if (iSysSFPluginRuntime == null || !iSysSFPluginRuntime.isRuntimePlugin()) {
			return null;
		}
		try {
			return iSysSFPluginRuntime.getRuntimeObject(cls, bNewInstance);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("插件[%1$s]获取运行时对象发生异常，%2$s", iSysSFPluginRuntime.getName(), ex.getMessage()), ex);
		}
	}

	protected int getDataEntityStorageMode(IPSDataEntity iPSDataEntity) {
		return iPSDataEntity.getStorageMode();
	}

	@Override
	public ICodeListRuntime getCodeListRuntime(String strTag) {
		return this.getCodeListRuntime(strTag, false);
	}

	@Override
	public ICodeListRuntime getCodeListRuntime(String strTag, boolean bTryMode) {
		IPSCodeList iPSCodeList = psCodeListMap.get(strTag);
		if (iPSCodeList == null) {
			if (bTryMode) {
				return null;
			}
			throw new SystemRuntimeException(this, String.format("无法获取指定代码表[%1$s]模型对象", strTag));
		}
		// 后续可能需要增强为判断是否从动态实例获取
		return this.getCodeListRuntime(iPSCodeList);
	}

	@Override
	public ISysFileUtilRuntime getSysFileUtilRuntime() {
		return getSysFileUtilRuntime(false);
	}

	@Override
	public ISysFileUtilRuntime getSysFileUtilRuntime(boolean bTryMode) {
		if (this.iSysFileUtilRuntime != null || bTryMode) {
			return this.iSysFileUtilRuntime;
		}
		throw new SystemRuntimeException(this, String.format("系统未提供默认文件存储功能组件"));
	}

	protected void setSysFileUtilRuntime(ISysFileUtilRuntime iSysFileUtilRuntime) {
		this.iSysFileUtilRuntime = iSysFileUtilRuntime;
	}

	/**
	 * 注册默认的系统文件功能组件运行时对象
	 * @return
	 * @throws Exception
	 */
	protected ISysFileUtilRuntime registerDefaultSysFileUtilRuntime() throws Exception {
		ObjectNode objectNode = JsonUtils.createObjectNode();
		objectNode.put(PSSysUtilImpl.ATTR_GETID, SysUtilTypes.FILE);
		objectNode.put(PSSysUtilImpl.ATTR_GETNAME, SysUtilTypes.FILE);
		objectNode.put(PSSysUtilImpl.ATTR_GETUTILTYPE, SysUtilTypes.FILE);
		objectNode.put(PSSysUtilImpl.ATTR_GETCODENAME, SysUtilTypes.FILE);

		IPSSysUtil iPSSysUtil = this.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getPSSystem(), IPSSysUtil.class, objectNode);
		ISysUtilRuntime iSysUtilRuntime = this.registerPSSysUtil(iPSSysUtil);
		if (iSysUtilRuntime instanceof ISysFileUtilRuntime) {
			return (ISysFileUtilRuntime) iSysUtilRuntime;
		}
		throw new SystemRuntimeException(this, String.format("默认文件存储功能组件对象类型不正确"));
	}
	

	@Override
	public IScriptEntity createScriptEntity(IEntity iEntity) {
		return new ScriptEntity(this, iEntity);
	}

	@Override
	public ISysLogicRuntime getSysLogicRuntime(String strTag, boolean bTryMode) {
		IPSSysLogic iPSSysLogic = this.getPSSystemService().getPSSysLogic(strTag, bTryMode);
		if(iPSSysLogic != null) {
			return super.getSysLogicRuntime(iPSSysLogic);
		}
		return null;
	}
	
	@Override
	public ISysValueRuleRuntime getSysValueRuleRuntime(String strTag, boolean bTryMode) {
		IPSSysValueRule iPSSysValueRule = this.getPSSystemService().getPSSysValueRule(strTag, bTryMode);
		if(iPSSysValueRule != null) {
			return super.getSysValueRuleRuntime(iPSSysValueRule);
		}
		return null;
	}
	
	@Override
	public IWFRoleRuntime getWFRoleRuntime(String strTag, boolean bTryMode) {
		IPSWFRole iPSWFRole = this.getPSSystemService().getPSWFRole(strTag, bTryMode);
		if(iPSWFRole != null) {
			return super.getWFRoleRuntime(iPSWFRole);
		}
		return null;
	}
	
	
	@Override
	public ISysTranslatorRuntime getSysTranslatorRuntime(String strTag, boolean bTryMode) {
		IPSSysTranslator iPSSysTranslator = this.getPSSystemService().getPSSysTranslator(strTag, bTryMode);
		if(iPSSysTranslator != null) {
			return super.getSysTranslatorRuntime(iPSSysTranslator);
		}
		return null;
	}

	@Override
	public ISysSequenceRuntime getSysSequenceRuntime(String strTag, boolean bTryMode) {
		IPSSysSequence iPSSysSequence = this.getPSSystemService().getPSSysSequence(strTag, bTryMode);
		if(iPSSysSequence != null) {
			return super.getSysSequenceRuntime(iPSSysSequence);
		}
		return null;
	}
	
	@Override
	public ISysDataSyncAgentRuntime getSysDataSyncAgentRuntime(String strTag, boolean bTryMode) {
		IPSSysDataSyncAgent iPSSysDataSyncAgent = this.getPSSystemService().getPSSysDataSyncAgent(strTag, bTryMode);
		if(iPSSysDataSyncAgent != null) {
			return super.getSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
		}
		return null;
	}

	
	
	@Override
	public ISysMsgTemplRuntime getSysMsgTemplRuntime(String strTag, boolean bTryMode) {
		IPSSysMsgTempl iPSSysMsgTempl = this.getPSSystemService().getPSSysMsgTempl(strTag, bTryMode);
		if(iPSSysMsgTempl != null) {
			return super.getSysMsgTemplRuntime(iPSSysMsgTempl);
		}
		return null;
	}
	
	
	@Override
	public ISysMsgTargetRuntime getSysMsgTargetRuntime(String strTag, boolean bTryMode) {
		IPSSysMsgTarget iPSSysMsgTarget = this.getPSSystemService().getPSSysMsgTarget(strTag, bTryMode);
		if(iPSSysMsgTarget != null) {
			return super.getSysMsgTargetRuntime(iPSSysMsgTarget);
		}
		return null;
	}
	
	
	@Override
	public ISysMsgQueueRuntime getSysMsgQueueRuntime(String strTag, boolean bTryMode) {
		IPSSysMsgQueue iPSSysMsgQueue = this.getPSSystemService().getPSSysMsgQueue(strTag, bTryMode);
		if(iPSSysMsgQueue != null) {
			return super.getSysMsgQueueRuntime(iPSSysMsgQueue);
		}
		return null;
	}
	
	
	
	
	@Override
	public synchronized void registerSystemEventListener(ISystemEventListener listener) {
		this.registerSystemEventListener(listener, null);
	}
	
	@Override
	public synchronized void registerSystemEventListener(ISystemEventListener listener, String[] events) {
		Assert.notNull(listener, "未传入系统事件侦听器");
		this.onRegisterSystemEventListener(listener, events);
	}
	
	protected void onRegisterSystemEventListener(ISystemEventListener listener, String[] events) {
		if(this.systemEventListenerMap.containsKey(listener)) {
			return;
		}
		
		Map<ISystemEventListener, String[]> map = new LinkedHashMap<ISystemEventListener, String[]>();
		map.putAll(this.systemEventListenerMap);
		map.put(listener, events);
		this.systemEventListenerMap = map;
	}

	@Override
	public synchronized void unregisterSystemEventListener(ISystemEventListener listener) {
		Assert.notNull(listener, "未传入系统事件侦听器");
		this.onUnregisterSystemEventListener(listener);
	}

	protected void onUnregisterSystemEventListener(ISystemEventListener listener) {
		if(!this.systemEventListenerMap.containsKey(listener)) {
			return;
		}
		
		Map<ISystemEventListener, String[]> map = new LinkedHashMap<ISystemEventListener, String[]>();
		map.putAll(this.systemEventListenerMap);
		map.remove(listener);
		this.systemEventListenerMap = map;
	}
	
	
	/**
	 * 触发系统事件
	 * @param event
	 * @param params
	 */
	@Override
	public void fireSystemEvent(String event, Object[] params) {
		Assert.hasLength(event, "未传入系统事件");
		this.onFireSystemEvent(event, params);
	}
	
	protected void onFireSystemEvent(String event, Object[] params) {
		this.doFireSystemEvent(event, params);
	}
	
	protected void doFireSystemEvent(String event, Object[] params) {
		Map<ISystemEventListener, String[]> map = this.systemEventListenerMap;
		for(java.util.Map.Entry<ISystemEventListener, String[]> entry : map.entrySet()) {
			boolean match = true;
			if(!ObjectUtils.isEmpty(entry.getValue())) {
				match = false;
				for(String item : entry.getValue()) {
					if(event.equalsIgnoreCase(item)) {
						match = true;
						break;
					}
				}
			}
			if(!match) {
				continue;
			}
			
			Executor executor = entry.getKey().getExecutor();
			if(executor != null) {
				executor.execute(new Runnable() {
					@Override
					public void run() {
						try {
							entry.getKey().receiveEvent(event, params);
						}
						catch (Throwable ex) {
							log.error(ex);
						}
					}
				});
			}
			else {
				try {
					entry.getKey().receiveEvent(event, params);
				}
				catch (Throwable ex) {
					log.error(ex);
				}
			}
		}
	}
	
	@Override
	public void registerDataEntityEventListener(String[] dataEntityTags, IDataEntityEventListener listener) {
		this.registerDataEntityEventListener(dataEntityTags, listener, null);
	}

	@Override
	public synchronized void registerDataEntityEventListener(String[] dataEntityTags, IDataEntityEventListener listener, String[] events) {
		Assert.notEmpty(dataEntityTags, "传入实体标记集合无效");
		Assert.notNull(listener, "传入实体实际侦听器对象无效");
		
		for(String strTag : dataEntityTags ) {
			Map<IDataEntityEventListener, String[]> map = dataEntityEventListenerMap.get(strTag);
			Map<IDataEntityEventListener, String[]> map2 = new LinkedHashMap<IDataEntityEventListener, String[]>();
			if(map != null) {
				map2.putAll(map);
			}
			map2.put(listener, events);
			dataEntityEventListenerMap.put(strTag, map2);
		}
		
	}

	@Override
	public synchronized void unregisterDataEntityEventListener(String[] dataEntityTags, IDataEntityEventListener listener) {
		Assert.notEmpty(dataEntityTags, "传入实体标记集合无效");
		Assert.notNull(listener, "传入实体实际侦听器对象无效");
		
		for(String strTag : dataEntityTags ) {
			Map<IDataEntityEventListener, String[]> map = dataEntityEventListenerMap.get(strTag);
			Map<IDataEntityEventListener, String[]> map2 = new LinkedHashMap<IDataEntityEventListener, String[]>();
			if(map != null) {
				map2.putAll(map);
			}
			map2.remove(listener);
			dataEntityEventListenerMap.put(strTag, map2);
		}
	}
	
	protected void onReceiveDataEntityEvent(IDataEntityRuntime iDataEntityRuntime, String event, Object[] params) {
		for(int i=0;i<2;i++) {
			
			String strTag = (i==0)?iDataEntityRuntime.getFullUniqueTag():"*";
			Map<IDataEntityEventListener, String[]> map = dataEntityEventListenerMap.get(strTag);
			if(ObjectUtils.isEmpty(map)) {
				continue;
			}
			
			for(java.util.Map.Entry<IDataEntityEventListener, String[]> entry : map.entrySet()) {
				boolean match = true;
				if(!ObjectUtils.isEmpty(entry.getValue())) {
					match = false;
					for(String item : entry.getValue()) {
						if(event.equalsIgnoreCase(item)) {
							match = true;
							break;
						}
					}
				}
				if(!match) {
					continue;
				}
				
				Executor executor = entry.getKey().getExecutor();
				if(executor != null) {
					executor.execute(new Runnable() {
						@Override
						public void run() {
							entry.getKey().receiveEvent(iDataEntityRuntime, event, params);
						}
					});
				}
				else {
					try {
						entry.getKey().receiveEvent(iDataEntityRuntime, event, params);
					}
					catch (Throwable ex) {
						log.error(ex);
					}
				}
			}
		}
		
	}

	@Override
	public String getScriptEngine(String strScriptCode) {
		if(StringUtils.hasLength(strScriptCode)) {
			for(java.util.Map.Entry<String, String> entry : ScriptCodeEngineMap.entrySet()) {
				if(strScriptCode.indexOf(entry.getKey()) == 0) {
					return entry.getValue();
				}
			}
		}
		return getDefaultScriptEngine();
	}
	
	/**
	 * 获取默认脚本引擎
	 * @return
	 */
	@Override
	public String getDefaultScriptEngine() {
		return SCRIPTENGINE_JAVASCRIPT;
	}
	
	
	/**
	 * 是否注册实体的事件侦听器
	 * @return
	 */
	protected boolean isRegisterDataEntityEventListener() {
		return !ObjectUtils.isEmpty(dataEntityEventListenerMap);
	}
	
	@Override
	protected void onShutdown() throws Exception {
		
		if (this.refreshScheduledThreadPool != null) {
			try {
				this.refreshScheduledThreadPool.shutdownNow();
			} catch (Throwable ex) {
				log.error(String.format("关闭刷新工作线程池发生异常，%1$s", ex.getMessage()), ex);
			}
			this.refreshScheduledThreadPool = null;
		}
		
		SysSFPluginRuntime.resetSystemCache(this.getDeploySystemId());
		
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysUtilRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysValueFuncRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.dataEntityMap);
		
		
		super.onShutdown();
		
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysSFPluginRuntimeMap);	
	}
	
	
}
