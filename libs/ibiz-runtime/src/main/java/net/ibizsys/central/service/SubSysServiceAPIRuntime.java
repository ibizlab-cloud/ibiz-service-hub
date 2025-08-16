package net.ibizsys.central.service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.sysutil.IObjectStorageServiceAdapter;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogLevels;

public class SubSysServiceAPIRuntime extends SystemModelRuntimeBase implements ISubSysServiceAPIRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SubSysServiceAPIRuntime.class);

	private IPSSubSysServiceAPI iPSSubSysServiceAPI = null;

	private Map<String, ISubSysServiceAPIDERuntime> deServiceAPIRuntimeMap = null;

	private String strServiceUrl = null;

	private String strServiceType = null;

	private String strServiceParam = null;

	private String strServiceParam2 = null;

	private String strServiceParam3 = null;

	private String strServiceParam4 = null;

	private Map<String, Object> globalHeaderMap = null;

	private Map<String, Object> defaultHeaderMap = null;

	private IWebClient iWebClient = null;

	private String strAccessTokenUrl = null;

	private String strClientId = null;

	private String strClientSecret = null;

	private long nTokenTimeout = 0;

	private int nDefaultTokenTimeout = 0;

	private String strAuthMode = null;

	private String strAuthParam = null;

	private String strAuthParam2 = null;

	private String strAuthParam3 = null;

	private String strAuthParam4 = null;

	/**
	 * 进行操作之前需要先认证
	 * 
	 * @return
	 */
	// private boolean bAuthFirst = false;

	private IObjectStorageServiceAdapter iObjectStorageServiceAdapter = null;

	private ISubSysServiceAPIScriptLogicRuntime authSubSysServiceAPIScriptLogicRuntime = null;

	private ISubSysServiceAPIScriptLogicRuntime methodSubSysServiceAPIScriptLogicRuntime = null;

	private Map<String, ISubSysServiceAPIScriptLogicRuntime> methodSubSysServiceAPIScriptLogicRuntimeMap = new ConcurrentHashMap<>();

	private ISubSysServiceAPIRTScriptContext iSubSysServiceAPIRTScriptContext = null;
	
	private boolean bStarted = false;

	private static ISubSysServiceAPIScriptLogicRuntime paramSubSysServiceAPIScriptLogicRuntime = null;

	private static ISubSysServiceAPIScriptLogicRuntime getParamSubSysServiceAPIScriptLogicRuntime() {
		return SubSysServiceAPIRuntime.paramSubSysServiceAPIScriptLogicRuntime;
	}

	private static void setParamSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime paramSubSysServiceAPIScriptLogicRuntime) {
		SubSysServiceAPIRuntime.paramSubSysServiceAPIScriptLogicRuntime = paramSubSysServiceAPIScriptLogicRuntime;
	}

	private ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext = new ISubSysServiceAPIRuntimeContext() {

		@Override
		public ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
			return getSelf();
		}

		@Override
		public ISubSysServiceAPIScriptLogicRuntime getMethodSubSysServiceAPIScriptLogicRuntime() {
			return getSelf().getMethodSubSysServiceAPIScriptLogicRuntime();
		}

		@Override
		public Object createMethodParamScriptObject() {
			return getSelf().createMethodParamScriptObject();
		}

		@Override
		public ISubSysServiceAPIScriptLogicRuntime getMethodSubSysServiceAPIScriptLogicRuntime(String strScriptCode) {
			return getSelf().getMethodSubSysServiceAPIScriptLogicRuntime(strScriptCode);
		}

		@Override
		public Object getClientObject(ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object[] args, Object objTag) {
			return getSelf().getClientObject(iSubSysServiceAPIDERuntime, iPSSubSysServiceAPIDEMethod, context, args, objTag);
		}

	};

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSubSysServiceAPI iPSSubSysServiceAPI) throws Exception {
		Assert.notNull(iSystemRuntimeContext, "传入系统运行时上下文对象无效");
		Assert.notNull(iPSSubSysServiceAPI, "传入外部服务接口模型对象无效");
		this.setSystemRuntimeBase(iSystemRuntimeContext.getSystemRuntime());
		this.iPSSubSysServiceAPI = iPSSubSysServiceAPI;

		this.setConfigFolder("subsysserviceapi." + PSModelUtils.calcUniqueTag(this.iPSSubSysServiceAPI.getPSSystemModule(), this.iPSSubSysServiceAPI.getCodeName()));

		this.onInit();
		//启动客户端
		if(isAutoStart()) {
			this.start();
		}
	}

	@Override
	protected void onInit() throws Exception {

		// 计算服务路径
		this.setServiceUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceurl", this.getPSSubSysServiceAPI().getServicePath()));
		this.setServiceType(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".servicetype", this.getPSSubSysServiceAPI().getServiceType()));
		this.setServiceParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam", this.getPSSubSysServiceAPI().getServiceParam()));
		this.setServiceParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam2", this.getPSSubSysServiceAPI().getServiceParam2()));
		this.setServiceParam3(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam3", this.getPSSubSysServiceAPI().getServiceParam3()));
		this.setServiceParam4(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam4", this.getPSSubSysServiceAPI().getServiceParam4()));
		this.setAuthMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authmode", this.getPSSubSysServiceAPI().getAuthMode()));
		this.setAccessTokenUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".accesstokenurl", this.getPSSubSysServiceAPI().getAuthAccessTokenUrl()));
		this.setClientId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientid", this.getPSSubSysServiceAPI().getAuthClientId()));
		this.setClientSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientsecret", this.getPSSubSysServiceAPI().getAuthClientSecret()));

		this.setAuthParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam", this.getPSSubSysServiceAPI().getAuthParam()));
		this.setAuthParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam2", this.getPSSubSysServiceAPI().getAuthParam2()));
		this.setAuthParam3(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam3", this.getPSSubSysServiceAPI().getAuthParam3()));
		this.setAuthParam4(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam4", this.getPSSubSysServiceAPI().getAuthParam4()));

		int nSecond = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".tokentimeout", this.getPSSubSysServiceAPI().getAuthTimeout());
		if (nSecond <= 0) {
			nSecond = 1 * 60 * 60;
		}
		this.setDefaultTokenTimeout(nSecond * 1000);

		super.onInit();

		this.setHeaders(null);

		// 准备实体服务接口
		java.util.List<IPSSubSysServiceAPIDE> psSubSysServiceAPIDEs = this.getPSSubSysServiceAPI().getAllPSSubSysServiceAPIDEs();
		if (psSubSysServiceAPIDEs != null) {
			for (IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE : psSubSysServiceAPIDEs) {
				this.registerPSSubSysServiceAPIDE(iPSSubSysServiceAPIDE);
			}
		}

		if (getParamSubSysServiceAPIScriptLogicRuntime() == null) {
			ISubSysServiceAPIScriptLogicRuntime iSubSysServiceAPIScriptLogicRuntime = this.getSystemRuntime().createSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHODPARAM);
			iSubSysServiceAPIScriptLogicRuntime.init(this.getSystemRuntime(), this, "return {uri:'',param:{},header:{},query:{},body:null};", ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHODPARAM);
			setParamSubSysServiceAPIScriptLogicRuntime(iSubSysServiceAPIScriptLogicRuntime);
		}
		
		if (this.getMethodScriptLogicRuntime() == null) {
			this.prepareMethodScriptLogicRuntime();
		}

		if (this.getObjectStorageServiceAdapter() == null) {
			prepareObjectStorageServiceAdapter();
		}
		
	}

	protected void prepareAuthUtil() throws Exception {
		if (StringUtils.hasLength(this.getAuthMode()) && !APIAuthModes.NONE.equals(this.getAuthMode())) {
			if (this.getAuthScriptLogicRuntime() == null) {
				this.prepareAuthScriptLogicRuntime();
			}

			// 启动计时器
			runAuthTimer(true);
		}
	}

	@Override
	public IPSSubSysServiceAPI getPSSubSysServiceAPI() {
		return this.iPSSubSysServiceAPI;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSubSysServiceAPI();
	}

	@Override
	public String getId() {
		return getPSSubSysServiceAPI().getId();
	}

	@Override
	public String getName() {
		return getPSSubSysServiceAPI().getName();
	}

	protected ISubSysServiceAPIRuntimeContext getSubSysServiceAPIRuntimeContext() {
		return this.iSubSysServiceAPIRuntimeContext;
	}

	private SubSysServiceAPIRuntime getSelf() {
		return this;
	}

	@Override
	public String getServiceUrl() {
		return this.strServiceUrl;
	}

	protected void setServiceUrl(String strServiceUrl) {
		this.strServiceUrl = strServiceUrl;
	}

	@Override
	public String getServiceType() {
		return this.strServiceType;
	}

	protected void setServiceType(String strServiceType) {
		this.strServiceType = strServiceType;
	}

	@Override
	public String getServiceParam() {
		return this.strServiceParam;
	}

	protected void setServiceParam(String strServiceParam) {
		this.strServiceParam = strServiceParam;
	}

	@Override
	public String getServiceParam2() {
		return this.strServiceParam2;
	}

	protected void setServiceParam2(String strServiceParam2) {
		this.strServiceParam2 = strServiceParam2;
	}

	@Override
	public String getServiceParam3() {
		return this.strServiceParam3;
	}

	protected void setServiceParam3(String strServiceParam3) {
		this.strServiceParam3 = strServiceParam3;
	}

	@Override
	public String getServiceParam4() {
		return this.strServiceParam4;
	}

	protected void setServiceParam4(String strServiceParam4) {
		this.strServiceParam4 = strServiceParam4;
	}

	@Override
	public ISubSysServiceAPIRTScriptContext getSubSysServiceAPIRTScriptContext() {

		if (this.iSubSysServiceAPIRTScriptContext == null) {
			this.iSubSysServiceAPIRTScriptContext = createSubSysServiceAPIRTScriptContext();
		}
		return this.iSubSysServiceAPIRTScriptContext;
	}

	protected ISubSysServiceAPIRTScriptContext createSubSysServiceAPIRTScriptContext() {
		return new SubSysServiceAPIRTScriptContext(this.getSubSysServiceAPIRuntimeContext());
	}

	protected String getMethodScriptCode() {
		return this.getPSSubSysServiceAPI().getMethodScriptCode();
	}

	protected String getAuthScriptCode() {
		return this.getPSSubSysServiceAPI().getAuthScriptCode();
	}

	@Override
	public void setHeaders(Map<String, ?> headers) {

		if (this.defaultHeaderMap == null) {
			Map<String, Object> defaultMap = new ConcurrentHashMap<String, Object>();
			if (this.getPSSubSysServiceAPI() != null) {
				ObjectNode objectNode = this.getPSSubSysServiceAPI().getHeaderParams();
				if (objectNode != null) {
					java.util.Iterator<String> fields = objectNode.fieldNames();
					if (fields != null) {
						while (fields.hasNext()) {
							String strName = fields.next();
							defaultMap.put(strName, objectNode.get(strName).textValue());
						}
					}
				}
			}
			this.defaultHeaderMap = Collections.unmodifiableMap(defaultMap);
		}

		Map<String, Object> map = new ConcurrentHashMap<String, Object>();
		map.putAll(this.defaultHeaderMap);

		if (headers != null) {
			map.putAll(headers);
		}

		if (map == null || map.size() == 0) {
			this.globalHeaderMap = null;
		} else {
			this.globalHeaderMap = Collections.unmodifiableMap(map);
		}
	}

	@Override
	public Map<String, ?> getHeaders(boolean bAuthMode) {
		if (bAuthMode) {
			return this.defaultHeaderMap;
		}
		return this.globalHeaderMap;
	}

	@Override
	public Map<String, ?> getHeaders() {
		return getHeaders(false);
	}

	@Override
	public IWebClient getWebClient() {
		return getWebClient(false);
	}

	protected IWebClient getWebClient(boolean bTryMode) {
		if (this.iWebClient != null || bTryMode) {
			return this.iWebClient;
		}
		this.iWebClient = createWebClient();
		return this.iWebClient;
	}

	protected IWebClient createWebClient() {
		IWebClient iWebClient = this.getSystemRuntime().createWebClient(this);
		try {
			iWebClient.init(this);
		} catch (Exception ex) {
			throw new SubSysServiceAPIRuntimeException(this, String.format("初始化Web客户端对象发生异常，%1$s", ex.getMessage()), ex);
		}
		return iWebClient;
	}

	@Override
	public <T> T getServiceClient(Class<?> cls) {
		return getWebClient().getProxyClient(cls);
	}

	@Override
	public ISubSysServiceAPIDERuntime getSubSysServiceAPIDERuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入服务接口标记无效");
		ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = null;
		if (this.deServiceAPIRuntimeMap != null) {
			iSubSysServiceAPIDERuntime = this.deServiceAPIRuntimeMap.get(strTag);
			if (iSubSysServiceAPIDERuntime == null) {
				iSubSysServiceAPIDERuntime = this.deServiceAPIRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iSubSysServiceAPIDERuntime == null && !bTryMode) {
			throw new SubSysServiceAPIRuntimeException(this, String.format("无法获取指定实体服务接口[%1$s]运行时对象", strTag));
		}
		return iSubSysServiceAPIDERuntime;
	}

	protected ISubSysServiceAPIDERuntime registerPSSubSysServiceAPIDE(IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE) throws Exception {
		ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = this.createSubSysServiceAPIDERuntime(iPSSubSysServiceAPIDE);
		if (iSubSysServiceAPIDERuntime == null) {
			return null;
		}
		iSubSysServiceAPIDERuntime.init(this.getSubSysServiceAPIRuntimeContext(), iPSSubSysServiceAPIDE);
		if (this.deServiceAPIRuntimeMap == null) {
			this.deServiceAPIRuntimeMap = new HashMap<>();
		}
		this.deServiceAPIRuntimeMap.put(iPSSubSysServiceAPIDE.getId(), iSubSysServiceAPIDERuntime);
		this.deServiceAPIRuntimeMap.put(iPSSubSysServiceAPIDE.getName().toUpperCase(), iSubSysServiceAPIDERuntime);
		if (StringUtils.hasLength(iPSSubSysServiceAPIDE.getDETag())) {
			String strDETag = iPSSubSysServiceAPIDE.getDETag().toUpperCase();
			if (!this.deServiceAPIRuntimeMap.containsKey(strDETag)) {
				this.deServiceAPIRuntimeMap.put(strDETag, iSubSysServiceAPIDERuntime);
			}
		}

		return iSubSysServiceAPIDERuntime;
	}

	protected ISubSysServiceAPIDERuntime createSubSysServiceAPIDERuntime(IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE) throws Exception {
		if (iPSSubSysServiceAPIDE.getPSSysSFPlugin() != null) {
			return this.getSystemRuntime().getRuntimeObject(iPSSubSysServiceAPIDE.getPSSysSFPlugin(), ISubSysServiceAPIDERuntime.class, true);
		}
		return createDefaultSubSysServiceAPIDERuntime();
	}

	protected ISubSysServiceAPIDERuntime createDefaultSubSysServiceAPIDERuntime() {
		return new SubSysServiceAPIDERuntime();
	}

	@Override
	public Object invokeDEMethod(String strDataEntityName, String strMethodName, Map<String, Object> context, Object objBody, Map<String, Object> params, Object objTag) throws Throwable {
		ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = (ISubSysServiceAPIDERuntime) this.getSubSysServiceAPIDERuntime(strDataEntityName, false);
		return iSubSysServiceAPIDERuntime.invokeMethod(strMethodName, context, objBody, params, objTag);
	}

	//
	// protected boolean isAuthFirst() {
	// return bAuthFirst;
	// }
	//
	// protected void setAuthFirst(boolean bAuthFirst) {
	// this.bAuthFirst = bAuthFirst;
	// }

	@Override
	public String getAccessTokenUrl() {
		return this.strAccessTokenUrl;
	}

	protected void setAccessTokenUrl(String strAccessTokenUrl) {
		this.strAccessTokenUrl = strAccessTokenUrl;
	}

	@Override
	public String getClientId() {
		return this.strClientId;
	}

	protected void setClientId(String strClientId) {
		this.strClientId = strClientId;
	}

	@Override
	public String getClientSecret() {
		return this.strClientSecret;
	}

	protected void setClientSecret(String strClientSecret) {
		this.strClientSecret = strClientSecret;
	}

	@Override
	public String getAuthMode() {
		return this.strAuthMode;
	}

	protected void setAuthMode(String strAuthMode) {
		this.strAuthMode = strAuthMode;
	}

	// @Override
	// public String getAuthParam() {
	// return this.getPSSubSysServiceAPI().getAuthParam();
	// }
	//
	// @Override
	// public String getAuthParam2() {
	// return this.getPSSubSysServiceAPI().getAuthParam2();
	// }

	@Override
	public String getAuthParam() {
		return this.strAuthParam;
	}

	protected void setAuthParam(String strAuthParam) {
		this.strAuthParam = strAuthParam;
	}

	@Override
	public String getAuthParam2() {
		return this.strAuthParam2;
	}

	protected void setAuthParam2(String strAuthParam2) {
		this.strAuthParam2 = strAuthParam2;
	}

	@Override
	public String getAuthParam3() {
		return this.strAuthParam3;
	}

	protected void setAuthParam3(String strAuthParam3) {
		this.strAuthParam3 = strAuthParam3;
	}

	@Override
	public String getAuthParam4() {
		return this.strAuthParam4;
	}

	protected void setAuthParam4(String strAuthParam4) {
		this.strAuthParam4 = strAuthParam4;
	}

	@Override
	public long getTokenTimeout() {
		return this.nTokenTimeout;
	}

	@Override
	public void setTokenTimeout(long nTokenTimeout) {
		this.nTokenTimeout = nTokenTimeout;
	}

	protected int getDefaultTokenTimeout() {
		return this.nDefaultTokenTimeout;
	}

	protected void setDefaultTokenTimeout(int nDefaultTokenTimeout) {
		this.nDefaultTokenTimeout = nDefaultTokenTimeout;
	}

	protected ISubSysServiceAPIScriptLogicRuntime getAuthSubSysServiceAPIScriptLogicRuntime() {
		return this.authSubSysServiceAPIScriptLogicRuntime;
	}

	protected void setAuthSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime authSubSysServiceAPIScriptLogicRuntime) {
		this.authSubSysServiceAPIScriptLogicRuntime = authSubSysServiceAPIScriptLogicRuntime;
	}

	protected ISubSysServiceAPIScriptLogicRuntime getAuthScriptLogicRuntime() {
		// return this.authSubSysServiceAPIScriptLogicRuntime;
		return this.getAuthSubSysServiceAPIScriptLogicRuntime();
	}

	protected void setAuthScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime authSubSysServiceAPIScriptLogicRuntime) {
		// this.authSubSysServiceAPIScriptLogicRuntime =
		// authSubSysServiceAPIScriptLogicRuntime;
		this.setAuthSubSysServiceAPIScriptLogicRuntime(authSubSysServiceAPIScriptLogicRuntime);
	}

	protected void prepareAuthScriptLogicRuntime() throws Exception {
		if (!StringUtils.hasLength(this.getAuthScriptCode())) {
			return;
		}

		ISubSysServiceAPIScriptLogicRuntime iSubSysServiceAPIScriptLogicRuntime = this.getSystemRuntime().createSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_AUTH);
		iSubSysServiceAPIScriptLogicRuntime.init(this.getSystemRuntime(), this, this.getAuthScriptCode(), ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_AUTH);
		setAuthSubSysServiceAPIScriptLogicRuntime(iSubSysServiceAPIScriptLogicRuntime);
	}

	@Override
	public void requestTokenIf(boolean bImmediately) {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 60000) {
			return;
		}
		this.requestToken(bImmediately);
	}

	@Override
	public void requestToken() {
		this.requestToken(false);
	}

	@Override
	public void requestToken(boolean bImmediately) {
		if (bImmediately) {
			onRequestToken();
		} else {
			this.setTokenTimeout(0);
		}
	}

	protected void onRequestToken() {
		try {
			long nLastTokenTimeout = this.getTokenTimeout();
			log.info(String.format("外部服务接口[%1$s]请求认证", getName()));
			doRequestTokenReal();
			// this.setAuthFirst(false);
			if (this.getTokenTimeout() == nLastTokenTimeout) {
				this.setTokenTimeout(System.currentTimeMillis() + this.getDefaultTokenTimeout());
			}
		} catch (Throwable ex) {
			log.error(String.format("外部服务接口[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			// 下一个时间周期继续认证
			this.setTokenTimeout(0);
			// throw ex;
			throw new SubSysServiceAPIRuntimeException(this, String.format("认证发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void doRequestTokenReal() throws Throwable {
		if (this.getAuthSubSysServiceAPIScriptLogicRuntime() == null) {
			// 尝试默认
			if (APIAuthModes.CLIENT_CREDENTIALS.equalsIgnoreCase(this.getAuthMode())) {
				doRequestToken_ClientCredentials();
				return;
			}

			throw new SubSysServiceAPIRuntimeException(this, String.format("未定义认证处理逻辑"));

		}
		this.getAuthSubSysServiceAPIScriptLogicRuntime().execute(null);
	}

	protected void doRequestToken_ClientCredentials() throws Throwable {
		String credentials = String.format("%1$s:%2$s", this.getClientId(), this.getClientSecret());
		byte[] credentialsBytes = credentials.getBytes(StandardCharsets.UTF_8);
		String encodedCredentials = Base64.getEncoder().encodeToString(credentialsBytes);
		String authorization = "Basic " + encodedCredentials;

		Map<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("grant_type", "client_credentials");
		
		Map<String, Object> headers = new LinkedHashMap<String, Object>();
		headers.put("Authorization", authorization);
		
		IWebClientRep<String> rep =	this.getSystemRuntime().getDefaultWebClient().post(this.getAccessTokenUrl(), null, headers, null, body, MediaType.APPLICATION_FORM_URLENCODED_VALUE, String.class, null);
		
		Map<String, Object> map = JsonUtils.asMap(rep.getBody());
		Object access_token = map.get("access_token");
		Object token_type = map.get("token_type");
		Object expires_in = map.get("expires_in");
		
		if(ObjectUtils.isEmpty(access_token)) {
			throw new Exception("认知结果未包含凭证信息");
		}
		
		if(ObjectUtils.isEmpty(token_type)) {
			token_type = "bearer";
		}
		
		headers.clear();
		headers.put("Authorization", String.format("%1$s %2$s", StringUtils.capitalize(token_type.toString()), access_token));
		this.setHeaders(headers);
		
		if(expires_in instanceof Integer) {
			this.tokenExpireIn((int)expires_in);
		}
		
	}

	protected void runAuthTimer() {
		runAuthTimer(false);
	}

	protected void runAuthTimer(boolean bTimerOnly) {
		
		if(!this.isStarted()) {
			log.debug(String.format("客户端已经关闭，忽略认证定时处理"));
			return;
		}
		
		if (!bTimerOnly) {
			try {
				onAuthTimer();
			} catch (Throwable ex) {
				log.error(String.format("外部服务接口[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				getSystemRuntime().log(LogLevels.ERROR, "外部服务接口", String.format("外部服务接口[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}

		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runAuthTimer();
			}
		}, System.currentTimeMillis() + 10000, "AuthTimer_" + this.getPSSubSysServiceAPI().getId());
	}

	protected void onAuthTimer() {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= getRenewTokenInterval()) {
			return;
		}

		// 执行认证
		onRequestToken();
	}

	protected long getRenewTokenInterval() {
		return 60000l;
	}

	protected ISubSysServiceAPIScriptLogicRuntime getMethodSubSysServiceAPIScriptLogicRuntime() {
		return methodSubSysServiceAPIScriptLogicRuntime;
	}

	protected void setMethodSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime methodSubSysServiceAPIScriptLogicRuntime) {
		this.methodSubSysServiceAPIScriptLogicRuntime = methodSubSysServiceAPIScriptLogicRuntime;
	}

	protected ISubSysServiceAPIScriptLogicRuntime getMethodScriptLogicRuntime() {
		return methodSubSysServiceAPIScriptLogicRuntime;
	}

	protected void setMethodScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime methodSubSysServiceAPIScriptLogicRuntime) {
		this.methodSubSysServiceAPIScriptLogicRuntime = methodSubSysServiceAPIScriptLogicRuntime;
	}

	protected void prepareMethodScriptLogicRuntime() throws Exception {
		if (!StringUtils.hasLength(this.getMethodScriptCode())) {
			return;
		}
		ISubSysServiceAPIScriptLogicRuntime iSubSysServiceAPIScriptLogicRuntime = this.getSystemRuntime().createSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHOD);
		iSubSysServiceAPIScriptLogicRuntime.init(this.getSystemRuntime(), this, this.getMethodScriptCode(), ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHOD);
		setMethodSubSysServiceAPIScriptLogicRuntime(iSubSysServiceAPIScriptLogicRuntime);
	}

	protected Object createMethodParamScriptObject() {
		return SubSysServiceAPIRuntime.getParamSubSysServiceAPIScriptLogicRuntime().execute(null);
	}

	protected ISubSysServiceAPIScriptLogicRuntime getMethodSubSysServiceAPIScriptLogicRuntime(String strScriptCode) {
		ISubSysServiceAPIScriptLogicRuntime iSubSysServiceAPIScriptLogicRuntime = this.methodSubSysServiceAPIScriptLogicRuntimeMap.get(strScriptCode);
		if (iSubSysServiceAPIScriptLogicRuntime == null) {
			try {
				iSubSysServiceAPIScriptLogicRuntime = this.getSystemRuntime().createSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHOD);
				iSubSysServiceAPIScriptLogicRuntime.init(this.getSystemRuntime(), this, strScriptCode, ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHOD);
				this.methodSubSysServiceAPIScriptLogicRuntimeMap.put(strScriptCode, iSubSysServiceAPIScriptLogicRuntime);
				return iSubSysServiceAPIScriptLogicRuntime;
			} catch (Throwable ex) {
				throw new SubSysServiceAPIRuntimeException(this, String.format("建立外部服务接口调用方法脚本逻辑发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		return iSubSysServiceAPIScriptLogicRuntime;
	}

	@Override
	public IObjectStorageServiceAdapter getObjectStorageServiceAdapter() {
		return this.iObjectStorageServiceAdapter;
	}

	protected void setObjectStorageServiceAdapter(IObjectStorageServiceAdapter iObjectStorageServiceAdapter) {
		this.iObjectStorageServiceAdapter = iObjectStorageServiceAdapter;
	}

	protected void prepareObjectStorageServiceAdapter() throws Exception {
		ISubSysServiceAPIDERuntime utilSubSysServiceAPIDERuntime = this.getSubSysServiceAPIDERuntime(UTILDE, true);
		if (utilSubSysServiceAPIDERuntime == null) {
			return;
		}

		IPSSubSysServiceAPIDEMethod uploadFilePSSubSysServiceAPIDEMethod = utilSubSysServiceAPIDERuntime.getPSSubSysServiceAPIDEMethod(UTILMETHOD_UPLOADFILE, true);
		if (uploadFilePSSubSysServiceAPIDEMethod == null) {
			return;
		}
		IPSSubSysServiceAPIDEMethod downloadFilePSSubSysServiceAPIDEMethod = utilSubSysServiceAPIDERuntime.getPSSubSysServiceAPIDEMethod(UTILMETHOD_DOWNLOADFILE, true);
		if (downloadFilePSSubSysServiceAPIDEMethod == null) {
			return;
		}

		this.setObjectStorageServiceAdapter(new SubSysServiceAPIOSSAdapter(this.getSubSysServiceAPIRuntimeContext()));
	}

	@Override
	public void tokenExpireIn(int nSeconds) {
		if (nSeconds >= 0) {
			this.setTokenTimeout(System.currentTimeMillis() + nSeconds * 1000);
		}
	}

	protected Object getClientObject(ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object[] args, Object objTag) {
		return getWebClient();
	}
	
	@Override
	public void start() throws Exception {
		if(isStarted()) {
			return;
		}
		
		try {
			this.bStarted = true;
			this.onStart();
		}
		catch (Exception ex) {
			this.bStarted = false;
			throw ex;
		}
	}
	
	protected void onStart() throws Exception{
		this.prepareAuthUtil();
	}
	
	protected boolean isStarted() {
		return this.bStarted;
	}
	
	protected boolean isAutoStart() {
		return true;
	}

	@Override
	public void stop() throws Exception{
		if(!isStarted()) {
			return;
		}
		this.onStop();
		this.bStarted = false;
	}
	
	protected void onStop() throws Exception{
		this.setTokenTimeout(0);
	}

	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}
	
	protected void onShutdown() throws Exception{
		this.stop();
	}
}
