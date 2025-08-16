package net.ibizsys.central.plugin.wechat.sysutil.util;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.wechat.pay.java.service.payments.model.Transaction;
import com.wechat.pay.java.service.payments.model.Transaction.TradeTypeEnum;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.plugin.wechat.sysutil.IWechatPaySysUtilRuntimeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.util.IAction;

public class OrderDataEntityRuntimeHelper {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OrderDataEntityRuntimeHelper.class);

	public final static String ACTION_PREPAY = "PREPAY";
	public final static String ACTION_PAYNOTIFY = "PAYNOTIFY";

	// Amount amount = new Amount();
	// amount.setTotal(100);
	// request.setAmount(amount);
	// request.setAppid("wxa9d9651ae******");
	// request.setMchid("190000****");
	// request.setDescription("测试商品标题");
	// request.setNotifyUrl("https://notify_url");
	// request.setOutTradeNo("out_trade_no_001");
	// Payer payer = new Payer();
	// payer.setOpenid("oLTPCuN5a-nBD4rAL_fa********");
	// request.setPayer(payer);

	public final static String FIELD_TOTAL = "TOTAL";
	public final static String FIELD_MCHID = "MCHID";
	public final static String FIELD_DESCRIPTION = "DESCRIPTION";
	public final static String FIELD_NOTIFY_URL = "NOTIFY_URL";
	public final static String FIELD_OUT_TRADE_NO = "OUT_TRADE_NO";
	public final static String FIELD_OPENID = "OPENID";
	public final static String FIELD_PREPAY_ID = "PREPAY_ID";
	public final static String FIELD_CLIENT_IP = "CLIENT_IP";
	public final static String FIELD_H5URL = "H5URL";

	public final static String FIELD_ATTACH = "ATTACH";
	public final static String FIELD_TRADE_TYPE = "TRADE_TYPE";
	public final static String FIELD_TRADE_STATE = "TRADE_STATE";
	public final static String FIELD_TRADE_STATE_DESC = "TRADE_STATE_DESC";
	public final static String FIELD_SUCCESS_TIME = "SUCCESS_TIME";
	
	
	final private IWechatPaySysUtilRuntimeContext iWechatPaySysUtilRuntimeContext;
	final private IDataEntityRuntime iDataEntityRuntime;
	private IPSDEAction payNotifyPSDEAction = null;
	
	private Map<String, IPSDEField> psDEFieldMap = new HashMap<String, IPSDEField>();

	public OrderDataEntityRuntimeHelper(IWechatPaySysUtilRuntimeContext iWechatPaySysUtilRuntimeContext, IDataEntityRuntime iDataEntityRuntime) throws Exception {
		Assert.notNull(iWechatPaySysUtilRuntimeContext, "传入微信支付系统功能运行时上下文对象无效 ");
		Assert.notNull(iDataEntityRuntime, "传入账单实体运行时对象无效 ");
		this.iWechatPaySysUtilRuntimeContext = iWechatPaySysUtilRuntimeContext;
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.payNotifyPSDEAction = this.iDataEntityRuntime.getPSDEActionByTag(ACTION_PAYNOTIFY, false);
		this.onPreparePSDEFields();
		this.onRegisterDEMethodPluginRuntimes();
	}

	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	public IPSDEAction getPayNotifyPSDEAction() {
		return this.payNotifyPSDEAction;
	}

	protected IWechatPaySysUtilRuntimeContext getWechatPaySysUtilRuntimeContext() {
		return this.iWechatPaySysUtilRuntimeContext;
	}

	protected void onPreparePSDEFields() throws Exception {
		String[] fields = new String[] { FIELD_TOTAL, FIELD_MCHID, FIELD_DESCRIPTION, FIELD_NOTIFY_URL, FIELD_OUT_TRADE_NO, FIELD_OPENID, FIELD_PREPAY_ID, FIELD_TRADE_TYPE, FIELD_TRADE_STATE, FIELD_TRADE_STATE_DESC, FIELD_SUCCESS_TIME, FIELD_ATTACH};
		for (String strFieldTag : fields) {
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEFieldByTag(strFieldTag, true);
			if (iPSDEField != null) {
				this.psDEFieldMap.put(strFieldTag, iPSDEField);
			}
		}
		
		String[] fields2 = new String[] { FIELD_TOTAL, FIELD_DESCRIPTION, FIELD_TRADE_TYPE};
		for (String strFieldTag : fields2) {
			this.getPSDEField(strFieldTag, false);
		}
	}

	public IPSDEField getPSDEField(String strTag, boolean bTryMode) throws Exception {
		IPSDEField iPSDEField = this.psDEFieldMap.get(strTag);
		if (iPSDEField != null || bTryMode) {
			return iPSDEField;
		}
		throw new Exception(String.format("不存在指定标记[%1$s]属性", strTag));
	}

	protected void onRegisterDEMethodPluginRuntimes() throws Exception {

		IPSDEAction prepayPSDEAction = this.getDataEntityRuntime().getPSDEActionByTag(ACTION_PREPAY, false);
		if (prepayPSDEAction != null) {
			this.getWechatPaySysUtilRuntimeContext().getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeIf(this.getDataEntityRuntime(), prepayPSDEAction.getName(), DEActionLogicAttachMode.BEFORE.value, new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					onBeforePrepay((IEntityDTO) args[0]);
					return null;
				}
			});
		} else {
			log.warn(String.format("无法获取指定标记[%1$s]实体行为", ACTION_PREPAY));
		}
		
	}

	protected void onBeforePrepay(IEntityDTO iEntityDTO) throws Throwable {

//		PrepayRequest request = new PrepayRequest();
//		Amount amount = new Amount();
//		amount.setTotal(100);
//		request.setAmount(amount);
//		request.setAppid("wxa9d9651ae******");
//		request.setMchid("190000****");
//		request.setDescription("测试商品标题");
//		request.setNotifyUrl("https://notify_url");
//		request.setOutTradeNo("out_trade_no_001");
//		Payer payer = new Payer();
//		payer.setOpenid("oLTPCuN5a-nBD4rAL_fa********");
//		request.setPayer(payer);
//		PrepayResponse response = this.getWechatPaySysUtilRuntimeContext().getJsapiService().prepay(request);
//
//		System.out.println(response.getPrepayId());

		
		Integer total = iEntityDTO.getInteger(this.getPSDEField(FIELD_TOTAL, false).getLowerCaseName(), 0);
		if(total == null || total < 0) {
			throw new Exception(String.format("金额[%1$s]无效", total));
		}
		
		
		
		String description = iEntityDTO.getString(this.getPSDEField(FIELD_DESCRIPTION, false).getLowerCaseName(), null);
		
		IPSDEField outTradeNoPSDEField = this.getPSDEField(FIELD_OUT_TRADE_NO, true);
		if(outTradeNoPSDEField == null) {
			outTradeNoPSDEField = this.getDataEntityRuntime().getKeyPSDEField();
		}
		String outTradeNo= iEntityDTO.getString(outTradeNoPSDEField.getLowerCaseName(), null);

		String attach= null;
		IPSDEField attachPSDEField = this.getPSDEField(FIELD_ATTACH, true);
		if(attachPSDEField != null) {
			attach = iEntityDTO.getString(attachPSDEField.getLowerCaseName(), null);
		}
		else {
			attach = iEntityDTO.getString(FIELD_ATTACH.toLowerCase(), null);
		}

		String strTradeType = null;
		IPSDEField tradeTypePSDEField = this.getPSDEField(FIELD_TRADE_TYPE, true);
		if(tradeTypePSDEField != null) {
			strTradeType = iEntityDTO.getString(tradeTypePSDEField.getLowerCaseName(), null);
		}
		else {
			strTradeType =  iEntityDTO.getString(FIELD_TRADE_TYPE.toLowerCase(), null);
		}

		if(!StringUtils.hasLength(strTradeType)) {
			strTradeType = TradeTypeEnum.MWEB.toString();
		}
		
		if(strTradeType.equals(TradeTypeEnum.MWEB.toString())) {
			
			com.wechat.pay.java.service.payments.h5.model.PrepayRequest request = new com.wechat.pay.java.service.payments.h5.model.PrepayRequest();
			com.wechat.pay.java.service.payments.h5.model.Amount amount = new com.wechat.pay.java.service.payments.h5.model.Amount();
			
			amount.setTotal(total);
			request.setAmount(amount);
			
			request.setAppid(this.getWechatPaySysUtilRuntimeContext().getAppId());
			request.setMchid(this.getWechatPaySysUtilRuntimeContext().getMerchantId());
			request.setDescription(description);
			request.setNotifyUrl(this.getWechatPaySysUtilRuntimeContext().getNotifyUrl());
			request.setOutTradeNo(outTradeNo);
			request.setAttach(attach);
			
			//H5支付
			String strClientIp = null;
			IPSDEField clientIpPSDEField = this.getPSDEField(FIELD_CLIENT_IP, true);
			if(clientIpPSDEField != null) {
				strClientIp = iEntityDTO.getString(clientIpPSDEField.getLowerCaseName(), null);
			}
			else {
				strClientIp =  iEntityDTO.getString(FIELD_CLIENT_IP.toLowerCase(), null);
			}
			
			if(!StringUtils.hasLength(strClientIp)) {
				/**
				 * 实际的远端地址
				 */
				RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
				if (requestAttributes instanceof ServletRequestAttributes) {
					HttpServletRequest httpServletRequest = ((ServletRequestAttributes) requestAttributes).getRequest();
					strClientIp = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_FORWARDEDFOR);
					if (!StringUtils.hasLength(strClientIp)) {
						strClientIp = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_REALIP);
						if (!StringUtils.hasLength(strClientIp)) {
							strClientIp = httpServletRequest.getRemoteAddr();
						}
					}
					else {
						String[] addresses = strClientIp.split("[,]");
						if(addresses != null && addresses.length> 0) {
							strClientIp = addresses[0];
						}
					}
				}
				if(!StringUtils.hasLength(strClientIp)) {
					if(EmployeeContext.getCurrent() != null) {
						strClientIp = EmployeeContext.getCurrent().getRemoteaddress();
					}
				}
			}
			
			com.wechat.pay.java.service.payments.h5.model.SceneInfo sceneInfo = new com.wechat.pay.java.service.payments.h5.model.SceneInfo();
			sceneInfo.setPayerClientIp(strClientIp);
			request.setSceneInfo(sceneInfo);
			
			try {
				com.wechat.pay.java.service.payments.h5.model.PrepayResponse response = this.getWechatPaySysUtilRuntimeContext().getH5Service().prepay(request);
				IPSDEField h5UrlPSDEField = this.getPSDEField(FIELD_H5URL, true);
				if(h5UrlPSDEField != null) {
					iEntityDTO.set(h5UrlPSDEField.getLowerCaseName(), response.getH5Url());
				}
				else {
					iEntityDTO.set(FIELD_H5URL.toLowerCase(), response.getH5Url());
				}
			}
			catch (Throwable ex) {
				throw new Exception(String.format("调用微信H5支付预支付发生异常，%1$s", ex.getMessage()));
			}	
			return;
		}
		
		if(strTradeType.equals(TradeTypeEnum.JSAPI.toString())) {
			
			com.wechat.pay.java.service.payments.jsapi.model.PrepayRequest request = new com.wechat.pay.java.service.payments.jsapi.model.PrepayRequest();
			com.wechat.pay.java.service.payments.jsapi.model.Amount amount = new com.wechat.pay.java.service.payments.jsapi.model.Amount();
			
			amount.setTotal(total);
			request.setAmount(amount);
			
			request.setAppid(this.getWechatPaySysUtilRuntimeContext().getAppId());
			request.setMchid(this.getWechatPaySysUtilRuntimeContext().getMerchantId());
			request.setDescription(description);
			request.setNotifyUrl(this.getWechatPaySysUtilRuntimeContext().getNotifyUrl());
			request.setOutTradeNo(outTradeNo);
			request.setAttach(attach);
			
			
			String strOpenId = null;
			IPSDEField openIdPSDEField = this.getPSDEField(FIELD_OPENID, true);
			if(openIdPSDEField != null) {
				strOpenId = iEntityDTO.getString(openIdPSDEField.getLowerCaseName(), null);
			}
			else {
				strOpenId =  iEntityDTO.getString(FIELD_OPENID.toLowerCase(), null);
			}
			
			com.wechat.pay.java.service.payments.jsapi.model.Payer payer = new com.wechat.pay.java.service.payments.jsapi.model.Payer();
			payer.setOpenid(strOpenId);
			request.setPayer(payer);
			
			try {
				com.wechat.pay.java.service.payments.jsapi.model.PrepayWithRequestPaymentResponse response = this.getWechatPaySysUtilRuntimeContext().getJsapiServiceExtension().prepayWithRequestPayment(request);
				if(response.getPackageVal() == null || response.getPackageVal().length() < 10)
					throw new Exception(String.format("调用微信Jsapi支付预支付发生异常，PREPAY_ID获取失败"));
				IPSDEField prepayIdPSDEField = this.getPSDEField(FIELD_PREPAY_ID, true);
				String prepayId = response.getPackageVal().substring(10);
				if(prepayIdPSDEField != null) {
					iEntityDTO.set(prepayIdPSDEField.getLowerCaseName(), prepayId);
				}
				else {
					iEntityDTO.set(FIELD_PREPAY_ID.toLowerCase(), prepayId);
				}
				iEntityDTO.set("nonceStr",response.getNonceStr());
				iEntityDTO.set("appId",response.getAppId());
				iEntityDTO.set("package",response.getPackageVal());
				iEntityDTO.set("signType",response.getSignType());
				iEntityDTO.set("timeStamp",response.getTimeStamp());
				iEntityDTO.set("paySign",response.getPaySign());
			}
			catch (Throwable ex) {
				throw new Exception(String.format("调用微信Jsapi支付预支付发生异常，%1$s", ex.getMessage()));
			}	
			return;
		}	
	}

	public void payNotify(Transaction transaction) throws Throwable{
		log.info(String.format("微信支付PayNotify: %1$s",transaction.toString()));
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		IPSDEField outTradeNoPSDEField = this.getPSDEField(FIELD_OUT_TRADE_NO, true);
		if(outTradeNoPSDEField == null) {
			outTradeNoPSDEField = this.getDataEntityRuntime().getKeyPSDEField();
		}
		iEntityDTO.set(outTradeNoPSDEField.getLowerCaseName(), transaction.getOutTradeNo());
		
		IPSDEField tradeTypePSDEField = this.getPSDEField(FIELD_TRADE_TYPE, true);
		if(tradeTypePSDEField != null) {
			iEntityDTO.set(tradeTypePSDEField.getLowerCaseName(), transaction.getTradeType().toString());
		}
		else {
			iEntityDTO.set(FIELD_TRADE_TYPE.toLowerCase(), transaction.getTradeType().toString());
		}
		
		IPSDEField tradeStatePSDEField = this.getPSDEField(FIELD_TRADE_STATE, true);
		if(tradeStatePSDEField != null) {
			iEntityDTO.set(tradeStatePSDEField.getLowerCaseName(), transaction.getTradeState().toString());
		}
		else {
			iEntityDTO.set(FIELD_TRADE_STATE.toLowerCase(), transaction.getTradeState().toString());
		}
		
		IPSDEField tradeStateDescPSDEField = this.getPSDEField(FIELD_TRADE_STATE_DESC, true);
		if(tradeStateDescPSDEField != null) {
			iEntityDTO.set(tradeStateDescPSDEField.getLowerCaseName(), transaction.getTradeStateDesc());
		}
		else {
			iEntityDTO.set(FIELD_TRADE_STATE_DESC.toLowerCase(), transaction.getTradeStateDesc());
		}
		
		java.util.Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").parse(transaction.getSuccessTime());
		
		IPSDEField successTimePSDEField = this.getPSDEField(FIELD_SUCCESS_TIME, true);
		if(successTimePSDEField != null) {
			iEntityDTO.set(successTimePSDEField.getLowerCaseName(), new java.sql.Timestamp(date.getTime()));
		}
		else {
			iEntityDTO.set(FIELD_SUCCESS_TIME.toLowerCase(), new java.sql.Timestamp(date.getTime()));
		}

		IPSDEField attachPSDEField = this.getPSDEField(FIELD_ATTACH, true);
		if(attachPSDEField != null) {
			iEntityDTO.set(attachPSDEField.getLowerCaseName(), transaction.getAttach());
		}
		else {
			iEntityDTO.set(FIELD_ATTACH.toLowerCase(), transaction.getAttach());
		}
		
		if(transaction.getPayer() != null && StringUtils.hasLength(transaction.getPayer().getOpenid())) {
			IPSDEField openIdPSDEField = this.getPSDEField(FIELD_OPENID, true);
			if(openIdPSDEField != null) {
				iEntityDTO.set(openIdPSDEField.getLowerCaseName(), transaction.getPayer().getOpenid());
			}
			else {
				iEntityDTO.set(FIELD_OPENID.toLowerCase(), transaction.getPayer().getOpenid());
			}
		}
		
		this.getDataEntityRuntime().executeAction(getPayNotifyPSDEAction().getName(), getPayNotifyPSDEAction(), new Object[] {iEntityDTO});
	}

}
