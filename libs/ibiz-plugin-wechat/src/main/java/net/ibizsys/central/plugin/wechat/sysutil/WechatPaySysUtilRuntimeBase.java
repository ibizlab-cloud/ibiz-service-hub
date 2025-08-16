package net.ibizsys.central.plugin.wechat.sysutil;

import com.wechat.pay.java.service.payments.jsapi.JsapiServiceExtension;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.wechat.pay.java.core.Config;
import com.wechat.pay.java.core.RSAAutoCertificateConfig;
import com.wechat.pay.java.core.RSAPublicKeyConfig;
import com.wechat.pay.java.core.exception.ValidationException;
import com.wechat.pay.java.core.notification.NotificationConfig;
import com.wechat.pay.java.core.notification.NotificationParser;
import com.wechat.pay.java.core.notification.RequestParam;
import com.wechat.pay.java.service.payments.h5.H5Service;
import com.wechat.pay.java.service.payments.jsapi.JsapiService;
import com.wechat.pay.java.service.payments.model.Transaction;

import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.plugin.wechat.service.WechatPaySysServiceAPIRuntime;
import net.ibizsys.central.plugin.wechat.sysutil.util.OrderDataEntityRuntimeHelper;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.IPSSysDEGroup;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.model.service.PSSysServiceAPIImpl;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class WechatPaySysUtilRuntimeBase extends net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase implements IWechatPaySysUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(WechatPaySysUtilRuntimeBase.class);

	/**
	 * 实体标记：订单实体
	 */
	public final static String DATAENTITYTAG_ORDER = "ORDER";

	private ISysServiceAPIRuntime iSysServiceAPIRuntime = null;
	private ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter = null;

	private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

	private String merchantPrivateKey = "";
	private String merchantId = ""; // 商户号
	private String merchantSerialNumber = ""; // 商户证书序列号
	private String merchantPrivateKeyPath = "";
	private String merchantPublicKeyPath = "";
	private String merchantPublicKeyId = "";
	private String merchantApiV3Key = "";
	private String notifyUrl = "";
	private String appid = "";

	private Config config = null;
	private JsapiService jsapiService = null;
	private JsapiServiceExtension jsapiServiceExtension = null;
	private H5Service h5Service = null;
	
	private OrderDataEntityRuntimeHelper orderDataEntityRuntimeHelper = null;

	public static abstract class WeChatPaySysUtilRuntimeContextBase<M extends IWechatPaySysUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements IWechatPaySysUtilRuntimeContext {
		public WeChatPaySysUtilRuntimeContextBase(C superContext) {
			super(superContext);
		}
	}

	@Override
	protected ISysUtilRuntimeContext createModelRuntimeContext() {
		return new WeChatPaySysUtilRuntimeContextBase<IWechatPaySysUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {
			@Override
			public IWechatPaySysUtilRuntime getModelRuntime() {
				return getSelf();
			}

			@Override
			public DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
				return getSelf().getDEMethodPluginRuntimeRepo();
			}

			@Override
			public JsapiService getJsapiService() throws Exception {
				return getSelf().getJsapiService();
			}

			@Override
			public JsapiServiceExtension getJsapiServiceExtension() throws Exception {
				return getSelf().getJsapiServiceExtension();
			}
			
			@Override
			public H5Service getH5Service() throws Exception {
				return getSelf().getH5Service();
			}

			@Override
			public String getAppId() {
				return getSelf().getAppId();
			}

			@Override
			public String getMerchantId() {
				return getSelf().getMerchantId();
			}

			@Override
			public String getNotifyUrl() {
				return getSelf().getNotifyUrl();
			}

			@Override
			public void payNotify(RequestParam requestParam) throws Throwable {
				getSelf().payNotify(requestParam);
			}

		};
	}

	private WechatPaySysUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected IWechatPaySysUtilRuntimeContext getModelRuntimeContext() {
		return (IWechatPaySysUtilRuntimeContext)super.getModelRuntimeContext();
	}

	protected String getMerchantPrivateKey() {
		return merchantPrivateKey;
	}

	protected void setMerchantPrivateKey(String merchantPrivateKey) {
		this.merchantPrivateKey = merchantPrivateKey;
	}

	protected String getMerchantPrivateKeyPath() {
		return this.merchantPrivateKeyPath;
	}

	protected void setMerchantPrivateKeyPath(String merchantPrivateKeyPath) {
		this.merchantPrivateKeyPath = merchantPrivateKeyPath;
	}
	
	protected String getMerchantPublicKeyPath() {
		return this.merchantPublicKeyPath;
	}

	protected void setMerchantPublicKeyPath(String merchantPublicKeyPath) {
		this.merchantPublicKeyPath = merchantPublicKeyPath;
	}
	
	protected String getMerchantPublicKeyId() {
		return this.merchantPublicKeyId;
	}

	protected void setMerchantPublicKeyId(String merchantPublicKeyId) {
		this.merchantPublicKeyId = merchantPublicKeyId;
	}

	protected String getMerchantId() {
		return merchantId;
	}

	protected void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	protected String getMerchantSerialNumber() {
		return merchantSerialNumber;
	}

	protected void setMerchantSerialNumber(String merchantSerialNumber) {
		this.merchantSerialNumber = merchantSerialNumber;
	}

	protected String getMerchantApiV3Key() {
		return merchantApiV3Key;
	}

	protected void setMerchantApiV3Key(String merchantApiV3Key) {
		this.merchantApiV3Key = merchantApiV3Key;
	}

	protected String getNotifyUrl() {
		return notifyUrl;
	}

	protected void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	protected String getAppId() {
		return appid;
	}

	protected void setAppId(String appid) {
		this.appid = appid;
	}

	@Override
	protected void onInit() throws Exception {
		
		if(this.getPSSysUtil().getPSSysDEGroup() == null) {
			throw new Exception("未指定支付功能相关实体组");
		}

		this.iSysServiceAPIRequestMappingAdapter = ServiceHub.getInstance().getSysServiceAPIRequestMappingAdapter();
		if (iSysServiceAPIRequestMappingAdapter == null) {
			throw new Exception("系统服务接口请求映射适配器对象无效");
		}
		
		this.deMethodPluginRuntimeRepo.init(this.getSystemRuntime(), true);

		super.onInit();

		if (this.getConfig(true) == null) {
			this.prepareConfig();
			this.getConfig(false);
		}

	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		super.onPrepareDefaultSetting();
		this.setMerchantId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".merchantid", this.getMerchantId()));
		this.setMerchantSerialNumber(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".merchantserialnumber", this.getMerchantSerialNumber()));
		this.setMerchantPrivateKey(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".merchantprivatekey", this.getMerchantPrivateKey()));
		this.setMerchantPrivateKeyPath(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".merchantprivatekeypath", this.getMerchantPrivateKeyPath()));
		this.setMerchantApiV3Key(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".merchantapiv3key", this.getMerchantApiV3Key()));
		this.setMerchantPublicKeyPath(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".merchantpublickeypath", this.getMerchantPublicKeyPath()));
		this.setMerchantPublicKeyId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".merchantpublickeyid", this.getMerchantPublicKeyId()));
		this.setNotifyUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".notifyurl", this.getNotifyUrl()));
		this.setAppId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".appid", this.getAppId()));
	}

	protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
		return this.deMethodPluginRuntimeRepo;
	}

	protected Config getConfig(boolean bTryMode) throws Exception {
		if (this.config != null || bTryMode) {
			return this.config;
		}
		throw new Exception("支付配置对象无效");
	}

	protected void setConfig(Config config) {
		this.config = config;
	}

	protected void prepareConfig() throws Exception {
		if (!StringUtils.hasLength(this.getMerchantId())) {
			throw new Exception("未指定商户标识");
		}

		if (!StringUtils.hasLength(this.getMerchantSerialNumber())) {
			throw new Exception("未指定商户序列号");
		}

		if (!StringUtils.hasLength(this.getMerchantPrivateKeyPath())) {
//			if (!StringUtils.hasLength(this.getMerchantPrivateKey())) {
//				// 生成文件
//			}
			throw new Exception("未指定商户私钥路径");
		}
		
		if (!StringUtils.hasLength(this.getMerchantApiV3Key())) {
			throw new Exception("未指定商户ApiV3Key");
		}


		if (!StringUtils.hasLength(this.getMerchantPublicKeyPath())) {
			try {
				Config config = new RSAAutoCertificateConfig.Builder().merchantId(getMerchantId()).privateKeyFromPath(this.getMerchantPrivateKeyPath()).merchantSerialNumber(this.getMerchantSerialNumber()).apiV3Key(this.getMerchantApiV3Key())
                        .build();
				this.setConfig(config);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("构建微信支付配置发生异常，%1$s", ex.getMessage()));
			}
		}
		else {
			if (!StringUtils.hasLength(this.getMerchantPublicKeyId())) {
				throw new Exception("未指定商户公钥标识");
			}
		    
			try {
				Config config = new RSAPublicKeyConfig.Builder().merchantId(getMerchantId()).privateKeyFromPath(this.getMerchantPrivateKeyPath()).merchantSerialNumber(this.getMerchantSerialNumber()).apiV3Key(this.getMerchantApiV3Key())
						.publicKeyFromPath(this.getMerchantPublicKeyPath()).publicKeyId(this.getMerchantPublicKeyId())
						.build();
				this.setConfig(config);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("构建微信支付配置发生异常，%1$s", ex.getMessage()));
			}
		}
		
	}



	protected synchronized JsapiService getJsapiService() throws Exception{
		if(this.jsapiService == null) {
			this.jsapiService = new JsapiService.Builder().config(this.getConfig(false)).build();
		}
		return this.jsapiService;
	}

    protected synchronized JsapiServiceExtension getJsapiServiceExtension() throws Exception{
        if(this.jsapiServiceExtension == null) {
            this.jsapiServiceExtension = new JsapiServiceExtension.Builder().config(this.getConfig(false)).build();
        }
        return this.jsapiServiceExtension;
    }

	protected synchronized H5Service getH5Service() throws Exception{
		if(this.h5Service == null) {
			this.h5Service = new H5Service.Builder().config(this.getConfig(false)).build();
		}
		return this.h5Service;
	}

	@Override
	protected void onInstall() throws Exception {

		super.onInstall();
		
		IPSSysDEGroup iPSSysDEGroup = this.getPSSysUtil().getPSSysDEGroupMust();
		if(!ObjectUtils.isEmpty(iPSSysDEGroup.getPSDEGroupDetails())) {
			for(IPSDEGroupDetail iPSDEGroupDetail : iPSSysDEGroup.getPSDEGroupDetails()) {
				if(DATAENTITYTAG_ORDER.equalsIgnoreCase(iPSDEGroupDetail.getCodeName())) {
					this.setOrderDataEntityRuntimeHelper(this.createOrderDataEntityRuntimeHelper(this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId())));
				}
			}
		}
		
		this.getOrderDataEntityRuntimeHelper(false);
		

		this.onRegisterDEMethodPluginRuntimes();

		ISysServiceAPIRuntime iSysServiceAPIRuntime = this.getSysServiceAPIRuntime(true);
		if (iSysServiceAPIRuntime == null) {
			this.prepareSysServiceAPIRuntime();
		}

		this.getSysServiceAPIRuntime(false).registerMapping(iSysServiceAPIRequestMappingAdapter);
	}

	protected void onRegisterDEMethodPluginRuntimes() throws Exception {

	}

	protected void prepareSysServiceAPIRuntime() throws Exception {
		ObjectNode objectNode = this.createPSSysServiceAPIObjectNode();
		this.fillPSSysServiceAPIObjectNode(objectNode);
		IPSSysServiceAPI iPSSysServiceAPI = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getSystemRuntime().getPSSystem(), IPSSysServiceAPI.class, objectNode);
		ISysServiceAPIRuntime iSysServiceAPIRuntime = this.createSysServiceAPIRuntime(iPSSysServiceAPI);
		iSysServiceAPIRuntime.init(this.getSystemRuntimeContext(), iPSSysServiceAPI);
		this.setSysServiceAPIRuntime(iSysServiceAPIRuntime);
	}

	protected ObjectNode createPSSysServiceAPIObjectNode() throws Exception {
		ObjectNode objectNode = JsonUtils.createObjectNode();
		String strCodeName = String.format("%1$s_api", this.getPSSysUtil().getCodeName()).toLowerCase();
		objectNode.put(PSSysServiceAPIImpl.ATTR_GETID, strCodeName);
		objectNode.put(PSSysServiceAPIImpl.ATTR_GETCODENAME, strCodeName);
		objectNode.put(PSSysServiceAPIImpl.ATTR_GETSERVICECODENAME, strCodeName);
		objectNode.put(PSSysServiceAPIImpl.ATTR_GETNAME, String.format("微信支付[%1$s]接口", this.getName()));

		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETSERVICEPATH,
		// this.getAddinData().getServicePath());
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETSERVICEPARAM,
		// this.getAddinData().getServiceParam());
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETSERVICEPARAM2,
		// this.getAddinData().getServiceParam2());
		//
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETAUTHSCRIPTCODE,
		// this.getAddinData().getServiceParam5());
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETMETHODSCRIPTCODE,
		// this.getAddinData().getServiceParam6());
		//
		//
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETAUTHMODE,
		// this.getAddinData().getAuthMode());
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETAUTHACCESSTOKENURL,
		// this.getAddinData().getAuthAccessTokenUrl());
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETAUTHCLIENTID,
		// this.getAddinData().getAuthClientId());
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETAUTHCLIENTSECRET,
		// this.getAddinData().getAuthClientSecret());
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETAUTHPARAM,
		// this.getAddinData().getAuthParam());
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETAUTHPARAM2,
		// this.getAddinData().getAuthParam2());
		// objectNode.put(PSSysServiceAPIImpl.ATTR_GETAUTHTIMEOUT,
		// this.getAddinData().getAuthTimeout());
		return objectNode;
	}

	protected void fillPSSysServiceAPIObjectNode(ObjectNode objectNode) throws Exception {

	}

	protected ISysServiceAPIRuntime createSysServiceAPIRuntime(IPSSysServiceAPI iPSSysServiceAPI) throws Exception {
		return new WechatPaySysServiceAPIRuntime(this.getModelRuntimeContext());
	}

	protected void setSysServiceAPIRuntime(ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
	}

	protected ISysServiceAPIRuntime getSysServiceAPIRuntime(boolean bTryMode) throws Exception {
		if (this.iSysServiceAPIRuntime != null || bTryMode) {
			return this.iSysServiceAPIRuntime;
		}
		throw new Exception("服务接口运行时对象无效");
	}

	
	protected OrderDataEntityRuntimeHelper createOrderDataEntityRuntimeHelper(IDataEntityRuntime orderDataEntityRuntime) throws Exception {
		return new OrderDataEntityRuntimeHelper(this.getModelRuntimeContext(), orderDataEntityRuntime);
	}
	
	protected OrderDataEntityRuntimeHelper getOrderDataEntityRuntimeHelper(boolean bTryMode) throws Exception {
		if(this.orderDataEntityRuntimeHelper != null || bTryMode) {
			return this.orderDataEntityRuntimeHelper;
		}
		throw new Exception("订单实体运行时辅助对象无效");
	}
	
	protected void setOrderDataEntityRuntimeHelper(OrderDataEntityRuntimeHelper orderDataEntityRuntimeHelper) {
		this.orderDataEntityRuntimeHelper = orderDataEntityRuntimeHelper;
	}


	protected void payNotify(RequestParam requestParam) throws Throwable {
		// 初始化 NotificationParser
		NotificationParser parser = new NotificationParser((NotificationConfig) this.getConfig(false));

		Transaction transaction = null;
		try {
			// 以支付通知回调为例，验签、解密并转换成 Transaction
			transaction = parser.parse(requestParam, Transaction.class);
		} catch (ValidationException ex) {
			// 签名验证失败，返回 401 UNAUTHORIZED 状态码
			log.error("sign verification failed", ex);
			throw ex;
		}

		getOrderDataEntityRuntimeHelper(false).payNotify(transaction);
		
	}

	@Override
	protected void onUninstall() throws Throwable {

		ISysServiceAPIRuntime iSysServiceAPIRuntime = this.getSysServiceAPIRuntime(true);
		if (iSysServiceAPIRuntime != null) {
			iSysServiceAPIRuntime.unregisterMapping(iSysServiceAPIRequestMappingAdapter);
			this.setSysServiceAPIRuntime(null);
			this.iSysServiceAPIRequestMappingAdapter = null;
		}

		this.getDEMethodPluginRuntimeRepo().shutdown();
		super.onUninstall();
	}

}
