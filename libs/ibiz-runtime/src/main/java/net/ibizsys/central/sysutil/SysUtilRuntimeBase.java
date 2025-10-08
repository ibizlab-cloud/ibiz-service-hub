package net.ibizsys.central.sysutil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.eai.ISysEAIAgentRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.util.IUriAction;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.ISystemRuntimeContext;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.IModelRTAddin;
import net.ibizsys.runtime.plugin.ModelRTAddinRepo;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.SysUtilTypes;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.LogLevels;

/**
 * 系统功能运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysUtilRuntimeBase extends SystemModelRuntimeBase implements ISysUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysUtilRuntimeBase.class);
	
	protected final static PathMatcher UriActionMatcher = new AntPathMatcher();
	
	private IPSSysUtil iPSSysUtil = null;
	private ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = null;
	private ISysEAIAgentRuntime inSysEAIAgentRuntime = null;
	private ISysEAIAgentRuntime outSysEAIAgentRuntime = null;

	private String strServiceUrl = null;
	
	private String strAccessTokenUrl = null;

	private String strClientId = null;

	private String strClientSecret = null;

	private String strAuthMode = null;
	
	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;
	
	private ISysFileUtilRuntime iSysFileUtilRuntime = null;
	
	private String strLogCat = null;
	
	private boolean bInstalled = false;
	
	private ModelRTAddinRepo modelRTAddinRepo = null;
	
	private ISysUtilRuntimeContext iSysUtilRuntimeContext;
	
	private List<IUriAction> uriActionList = null;
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysUtil iPSSysUtil) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysUtil = iPSSysUtil;
		this.strLogCat = this.getPSSysUtil().getUtilType();
		if(SysUtilTypes.USER.equals(this.strLogCat)) {
			this.strLogCat = this.getPSSysUtil().getUtilTag();
		}
		
		this.setConfigFolder("sysutil." + PSModelUtils.calcUniqueTag(this.iPSSysUtil.getPSSystemModule(), this.iPSSysUtil.getCodeName()));
		this.prepareDefaultSetting();	
		this.onInit();
	}

	public IPSSysUtil getPSSysUtil() {
		return this.iPSSysUtil;
	}

	@Override
	public IPSSysUtil getPSModelObject() {
		return this.getPSSysUtil();
	}
	
	

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	
	protected ISysUtilRuntimeContext getModelRuntimeContext() {
		if(this.iSysUtilRuntimeContext == null) {
			this.iSysUtilRuntimeContext = this.createModelRuntimeContext();
		}
		return this.iSysUtilRuntimeContext;
	}
	
	private SysUtilRuntimeBase getSelf() {
		return this;
	}
	
	protected ISysUtilRuntimeContext createModelRuntimeContext() {
		return new SysUtilRuntimeContextBase() {
			
			@Override
			public ISysUtilRuntime getModelRuntime() {
				return getSelf();
			}

			@Override
			public net.ibizsys.central.ISystemRuntimeContext getSystemRuntimeContext() {
				return getSelf().getSystemRuntimeContext();
			}
			
			
			@Override
			public <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
				return getSelf().getAddins(cls, strTypePrefix);
			}

			@Override
			public String getSetting(String strKey, String strDefault) {
				String strFullKey = String.format("%1$s.%2$s", getConfigFolder(), strKey);
				return getSystemRuntimeSetting().getParam(strFullKey, strDefault);
			}

			@Override
			public int getSetting(String strKey, int nDefault) {
				String strFullKey = String.format("%1$s.%2$s", getConfigFolder(), strKey);
				return getSystemRuntimeSetting().getParam(strFullKey, nDefault);
			}

			@Override
			public long getSetting(String strKey, long nDefault) {
				String strFullKey = String.format("%1$s.%2$s", getConfigFolder(), strKey);
				return getSystemRuntimeSetting().getParam(strFullKey, nDefault);
			}

			@Override
			public double getSetting(String strKey, double fDefault) {
				String strFullKey = String.format("%1$s.%2$s", getConfigFolder(), strKey);
				return getSystemRuntimeSetting().getParam(strFullKey, fDefault);
			}

			@Override
			public boolean getSetting(String strKey, boolean bDefault) {
				String strFullKey = String.format("%1$s.%2$s", getConfigFolder(), strKey);
				return getSystemRuntimeSetting().getParam(strFullKey, bDefault);
			}

			@Override
			public Map<String, Object> getSettings(String strPKey, Map<String, Object> params) {
				String strFullKey = String.format("%1$s.%2$s", getConfigFolder(), strPKey);
				return getSystemRuntimeSetting().getParams(strFullKey, params);
			}
			
			
		};
	}
	
	/**
	 * 准备默认设置
	 * @throws Exception
	 */
	protected void prepareDefaultSetting() throws Exception{
		this.onPrepareDefaultSetting();
		this.prepareServiceClientSetting();
	}
	
	protected void onPrepareDefaultSetting() throws Exception{
		
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	protected void prepareServiceClientSetting() throws Exception{
		this.setServiceUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceurl", this.getPSSysUtil().getServicePath()));
		this.setAccessTokenUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".accesstokenurl",  this.getPSSysUtil().getAuthAccessTokenUrl()));
		this.setClientId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientid", this.getPSSysUtil().getAuthClientId()));
		this.setClientSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientsecret", this.getPSSysUtil().getAuthClientSecret()));
		this.setAuthMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authmode", this.getPSSysUtil().getAuthMode()));
	}
	
	/**
	 * 获取系统功能组件绑定的外部服务接口运行时对象
	 * 
	 * @return
	 */
	protected ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		if (this.iSubSysServiceAPIRuntime == null && this.getPSSysUtil().getPSSubSysServiceAPI() != null) {
			this.iSubSysServiceAPIRuntime = this.getSystemRuntime().getSubSysServiceAPIRuntime(this.getPSSysUtil().getPSSubSysServiceAPI());
		}
		return this.iSubSysServiceAPIRuntime;
	}

	/**
	 * 获取输入的系统应用集成代理运行时对象
	 * 
	 * @return
	 */
	protected ISysEAIAgentRuntime getInSysEAIAgentRuntime() {
		if (this.inSysEAIAgentRuntime == null && this.getPSSysUtil().getInPSSysDataSyncAgent() != null) {
			ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = this.getSystemRuntime().getSysDataSyncAgentRuntime(this.getPSSysUtil().getInPSSysDataSyncAgent());
			if (iSysDataSyncAgentRuntime instanceof ISysEAIAgentRuntime) {
				this.inSysEAIAgentRuntime = (ISysEAIAgentRuntime) iSysDataSyncAgentRuntime;
			}
		}
		return this.inSysEAIAgentRuntime;
	}

	/**
	 * 获取输出的系统应用集成代理运行时对象
	 * 
	 * @return
	 */
	protected ISysEAIAgentRuntime getOutSysEAIAgentRuntime() {
		if (this.outSysEAIAgentRuntime == null && this.getPSSysUtil().getOutPSSysDataSyncAgent() != null) {
			ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = this.getSystemRuntime().getSysDataSyncAgentRuntime(this.getPSSysUtil().getOutPSSysDataSyncAgent());
			if (iSysDataSyncAgentRuntime instanceof ISysEAIAgentRuntime) {
				this.outSysEAIAgentRuntime = (ISysEAIAgentRuntime) iSysDataSyncAgentRuntime;
			}
		}
		return this.outSysEAIAgentRuntime;
	}

	protected String getUtilParam(String strKey, String strDefault) {
		if (this.getPSSysUtil().getUtilParams() != null) {
			JsonNode node = this.getPSSysUtil().getUtilParams().get(strKey);
			if (node != null) {
				return node.asText(strDefault);
			}
		}
		return strDefault;
	}

	protected int getUtilParam(String strKey, int nDefault) {
		if (this.getPSSysUtil().getUtilParams() != null) {
			JsonNode node = this.getPSSysUtil().getUtilParams().get(strKey);
			if (node != null) {
				return node.asInt(nDefault);
			}
		}
		return nDefault;
	}

	protected double getUtilParam(String strKey, double fDefault) {
		if (this.getPSSysUtil().getUtilParams() != null) {
			JsonNode node = this.getPSSysUtil().getUtilParams().get(strKey);
			if (node != null) {
				return node.asDouble(fDefault);
			}
		}
		return fDefault;
	}

	public String getServiceUrl() {
		return this.strServiceUrl;
	}

	public String getServiceParam() {
		return this.getPSSysUtil().getServiceParam();
	}

	public String getServiceParam2() {
		return this.getPSSysUtil().getServiceParam2();
	}

	protected void setServiceUrl(String strServiceUrl) {
		this.strServiceUrl = strServiceUrl;
	}
	
	public String getAccessTokenUrl() {
		return this.strAccessTokenUrl;
	}

	protected void setAccessTokenUrl(String strAccessTokenUr) {
		this.strAccessTokenUrl = strAccessTokenUr;
	}

	public String getClientId() {
		return this.strClientId;
	}

	protected void setClientId(String strClientId) {
		this.strClientId = strClientId;
	}

	public String getClientSecret() {
		return this.strClientSecret;
	}

	protected void setClientSecret(String strClientSecret) {
		this.strClientSecret = strClientSecret;
	}

	public String getAuthMode() {
		return this.strAuthMode;
	}

	protected void setAuthMode(String strAuthMode) {
		this.strAuthMode = strAuthMode;
	}

	public String getAuthParam() {
		return this.getPSSysUtil().getAuthParam();
	}

	public String getAuthParam2() {
		return this.getPSSysUtil().getAuthParam2();
	}
	
	@Override
	public synchronized void install() throws Exception {
		if(!this.bInstalled) {
			if(this.getSysCacheUtilRuntime(true) == null) {
				prepareSysCacheUtilRuntime();
			}
			if(this.getSysFileUtilRuntime(true) == null) {
				prepareSysFileUtilRuntime();
			}
			this.onInstall();
			
			this.bInstalled = true;
		}
	}
	
	
	protected void onInstall() throws Exception {
		
		if(this.getAddinRepo(true) == null) {
			prepareAddinRepo();
		}
	}
	
	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}
	
	@Override
	public synchronized void uninstall() {
		try {
			if(this.bInstalled) {
				onUninstall();
				this.bInstalled = false;
			}
		}
		catch(Throwable ex) {
			log.error(String.format("卸载系统功能[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载系统功能[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}
	
	protected void onUninstall() throws Throwable{
		final ModelRTAddinRepo modelRTAddinRepo = this.getAddinRepo(true);
		if(modelRTAddinRepo != null) {
			modelRTAddinRepo.shutdown();
			this.setAddinRepo(null);
		}
	}
	
	@Override
	public synchronized void installData(String strMode) throws Exception {
		this.onInstallData(strMode);
	}
	
	protected void onInstallData(String strMode) throws Exception {
		
	}
	
	protected void prepareAddinRepo() throws Exception {
		
	}
	
	protected RuntimeException dealException(String strMessage, Throwable ex) {
		this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("%1$s%2$s", getLogicName(), strMessage), null);
		
		if(ex instanceof SystemRuntimeException) {
			SystemRuntimeException systemRuntimeException = (SystemRuntimeException)ex;
			if(systemRuntimeException.getModelRuntime() == this) {
				return (RuntimeException)ex;
			}
		}
		
		return new SystemRuntimeException(this.getSystemRuntimeBase(), this, strMessage, ex);
	}
	
	
	public String getLogicName() {
		return this.getName();
	}
	
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
		return this.getSysCacheUtilRuntime(false);
	}
	
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime(boolean bTryMode) {
		if(this.iSysCacheUtilRuntime != null || bTryMode) {
			return this.iSysCacheUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统缓存功能组件");
	}
	
	protected void setSysCacheUtilRuntime(ISysCacheUtilRuntime iSysCacheUtilRuntime) {
		this.iSysCacheUtilRuntime = iSysCacheUtilRuntime;
	}
	
	protected void prepareSysCacheUtilRuntime() throws Exception {
		this.setSysCacheUtilRuntime(this.getSystemRuntime().getSysCacheUtilRuntime(true));
	}
	
	protected ISysFileUtilRuntime getSysFileUtilRuntime() {
		return getSysFileUtilRuntime(false);
	}
	
	protected ISysFileUtilRuntime getSysFileUtilRuntime(boolean bTryMode) {
		if(this.iSysFileUtilRuntime != null || bTryMode) {
			return this.iSysFileUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统功能组件");
	}
	
	protected void setSysFileUtilRuntime(ISysFileUtilRuntime iSysFileUtilRuntime) {
		this.iSysFileUtilRuntime = iSysFileUtilRuntime;
	}
	
	protected void prepareSysFileUtilRuntime() throws Exception {
		this.setSysFileUtilRuntime(this.getSystemRuntime().getSysFileUtilRuntime(true));
	}

	protected ModelRTAddinRepo getAddinRepo(boolean bTryMode) {
		if (this.modelRTAddinRepo != null || bTryMode) {
			return this.modelRTAddinRepo;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "插件仓库无效");
	}

	protected ModelRTAddinRepo getAddinRepo() {
		return this.getAddinRepo(false);
	}

	protected void setAddinRepo(ModelRTAddinRepo modelRTAddinRepo) {
		this.modelRTAddinRepo = modelRTAddinRepo;
	}

	protected void prepareAddinRepo(IModelRuntimeContext ctx, Class<? extends IModelRTAddin> addinCls, String strTypePrefix) throws Exception {
		ModelRTAddinRepo modelRTAddinRepo = new ModelRTAddinRepo();
		modelRTAddinRepo.init(ctx, addinCls, strTypePrefix, this.getSystemRuntime().getRuntimeObjectFactory(), this.getSystemRuntime());
		this.setAddinRepo(modelRTAddinRepo);
	}

	protected <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
		return this.getAddinRepo().getAddins(cls, strTypePrefix);
	}
	
	protected void executeAction(String strActionName, IAction iAction) {
		this.executeAction(strActionName, iAction, null, Object.class, getLogPOTime());
	}
	
	
	protected Object executeAction(String strActionName, IAction iAction, Object[] args) {
		return this.executeAction(strActionName, iAction, args, Object.class, getLogPOTime());
	}
	
	
	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, Class<T> cls) {
		return this.executeAction(strActionName, iAction, args, cls, getLogPOTime());
	}
	

	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, TypeReference<T> type) {
		return this.executeAction(strActionName, iAction, args, type, getLogPOTime());
	}
	

	/**
	 * 使用闭包的方式执行行为，提供缓存及性能监测
	 * @param strActionName
	 * @param iAction
	 * @param args
	 * @param cls
	 * @param nPOTime
	 * @return
	 * @throws Throwable
	 */
	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, Class<T> cls, int nPOTime) {
		try {
			long nBeginTime = System.currentTimeMillis();
			Object objRet = iAction.execute(args);
			long bEndTime = System.currentTimeMillis();
			if(bEndTime - nBeginTime > nPOTime) {
				log.warn(String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime));
				this.getSystemRuntime().logPO(LogLevels.WARN, getLogCat(), String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime), this.getLogicName(), strActionName, bEndTime - nBeginTime, null);
			}
			return (T)objRet;
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			log.error(String.format("%1$s[%2$s]发生异常，%3$s", this.getLogicName(), strActionName, ex.getMessage()), ex);
			throw dealException(String.format("%1$s发生异常，%2$s", strActionName, ex.getMessage()), ex);
		}
	}
	
	/**
	 * 使用闭包的方式执行行为，提供缓存及性能监测
	 * @param strActionName
	 * @param iAction
	 * @param args
	 * @param cls
	 * @param nPOTime
	 * @return
	 * @throws Throwable
	 */
	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, TypeReference<T> type, int nPOTime) {
		try {
			long nBeginTime = System.currentTimeMillis();
			Object objRet = iAction.execute(args);
					long bEndTime = System.currentTimeMillis();
			if(bEndTime - nBeginTime > nPOTime) {
				log.warn(String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime));
				this.getSystemRuntime().logPO(LogLevels.WARN, getLogCat(), String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime), this.getLogicName(), strActionName, bEndTime - nBeginTime, null);
			}
			return (T)objRet;
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			log.error(String.format("%1$s[%2$s]发生异常，%3$s", this.getLogicName(), strActionName, ex.getMessage()), ex);
			throw dealException(String.format("%1$s发生异常，%2$s", strActionName, ex.getMessage()), ex);
		}
	}
	
	protected synchronized void registerUriAction(IUriAction iUriAction) {
		List<IUriAction> list = new ArrayList<IUriAction>();
		if(!ObjectUtils.isEmpty(this.uriActionList)) {
			list.addAll(this.uriActionList);
		}
		if(!list.contains(iUriAction)) {
			list.add(iUriAction);
		}
		this.uriActionList = list;
	}
	
	protected synchronized boolean unregisterUriAction(IUriAction iUriAction) {
		List<IUriAction> last = this.uriActionList;
		if(ObjectUtils.isEmpty(last)
				|| !last.contains(iUriAction)) {
			return false;
		}
		
		List<IUriAction> list = new ArrayList<IUriAction>();
		list.addAll(this.uriActionList);
		list.remove(iUriAction);
		this.uriActionList = list;
		return true;
	}
	
	protected List<IUriAction> getUriActionList() {
		return this.uriActionList;
	}

	@Override
	public Object executeAction(String strActionName, Object[] args) {
		return this.executeAction(strActionName, new IAction() {

			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteAction(strActionName, args);
			}
			
		}, args);
	}
	
	protected Object onExecuteAction(String strActionName, Object[] args) throws Throwable{
		
		final List<IUriAction> list = getUriActionList();
		if(!ObjectUtils.isEmpty(list)) {
			for(IUriAction iUriAction : list) {
				String[] patterns = iUriAction.getPatterns();
				if(patterns != null) {
					for(String strPattern : patterns) {
						if (UriActionMatcher.match(strPattern, strActionName)) {
							Map<String, String> pathVariables = UriActionMatcher.extractUriTemplateVariables(strPattern, strActionName);
							return iUriAction.execute(args, pathVariables);
						}
					}
				}
			}
		}
		
		throw new Exception(String.format("不支持的行为[%1$s]", strActionName));
	}
	
	
	
	protected String getLogCat() {
		return this.strLogCat;
	}
	
	
	protected int getLogPOTime() {
		return ActionSessionManager.getLogPOTime();
	}
	
	
	
}
