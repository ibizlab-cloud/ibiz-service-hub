package net.ibizsys.central.plugin.wechat.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wechat.pay.java.core.exception.ValidationException;
import com.wechat.pay.java.core.notification.RequestParam;

import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter;
import net.ibizsys.central.cloud.core.service.SysRestServiceAPIRuntimeBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.plugin.wechat.sysutil.IWechatPaySysUtilRuntimeContext;

public class WechatPaySysServiceAPIRuntime extends SysRestServiceAPIRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(WechatPaySysServiceAPIRuntime.class);
	private final IWechatPaySysUtilRuntimeContext iWeChatPaySysUtilRuntimeContext ;
	
	public WechatPaySysServiceAPIRuntime(IWechatPaySysUtilRuntimeContext iWeChatPaySysUtilRuntimeContext) {
		this.iWeChatPaySysUtilRuntimeContext = iWeChatPaySysUtilRuntimeContext;

	}
	
	protected WechatPaySysServiceAPIRuntime() {
		this.iWeChatPaySysUtilRuntimeContext = null;
	}
	
	protected IWechatPaySysUtilRuntimeContext getWeChatPaySysUtilRuntimeContext() {
		return this.iWeChatPaySysUtilRuntimeContext;
	}

	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
	}
	
	

	
	@Override
	protected void prepareBaseUrl() throws Exception {
//		if(StringUtils.hasLength(this.getEndPointDTO().getBaseUrl())) {
//			this.setBaseUrl(this.getEndPointDTO().getBaseUrl());
//			return;
//		}
		super.prepareBaseUrl();
	}
	
	@Override
	protected void onRegisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {

		String strUrl = String.format("/%1$s/%2$s/**", this.getSystemRuntime().getDeploySystemId(), this.getPSSysServiceAPI().getCodeName());
		ServiceHub.getInstance().registerIgnoreAuthPattern(strUrl);
		
		log.debug(String.format("注册忽略认证路径[%1$s]", strUrl));
		
		super.onRegisterMapping(iSysServiceAPIRequestMappingAdapter);
	}
	
	@Override
	protected void onUnregisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		
		String strUrl = String.format("/%1$s/%2$s/pay_notify/**", this.getSystemRuntime().getDeploySystemId(), this.getPSSysServiceAPI().getCodeName());
		ServiceHub.getInstance().unregisterIgnoreAuthPattern(strUrl);
		
		super.onUnregisterMapping(iSysServiceAPIRequestMappingAdapter);
	}
	
	
	/*
	 * HTTP 头 Wechatpay-Signature。应答的微信支付签名。
HTTP 头 Wechatpay-Serial。微信支付平台证书的序列号，验签必须使用序列号对应的微信支付平台证书。
HTTP 头 Wechatpay-Nonce。签名中的随机数。
HTTP 头 Wechatpay-Timestamp。签名中的时间戳。
HTTP 头 Wechatpay-Signature-Type。签名类型。
	 */
	
	@RequestMapping(method = RequestMethod.POST, value = "/pay_notify")
	public Object payNotify(@RequestHeader(value="Wechatpay-Serial") String wechatPaySerial,
			@RequestHeader(value="Wechatpay-Nonce") String wechatpayNonce, 
			@RequestHeader(value="Wechatpay-Signature") String wechatSignature, 
			@RequestHeader(value="Wechatpay-Timestamp") String wechatTimestamp, @RequestBody String requestBody) {
		try {
			// 构造 RequestParam
			RequestParam requestParam = new RequestParam.Builder()
			        .serialNumber(wechatPaySerial)
			        .nonce(wechatpayNonce)
			        .signature(wechatSignature)
			        .timestamp(wechatTimestamp)
			        .body(requestBody)
			        .build();
			this.getWeChatPaySysUtilRuntimeContext().payNotify(requestParam);
			return ResponseEntity.status(HttpStatus.OK);
		}catch (ValidationException ex) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED);
		}catch (Throwable ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
