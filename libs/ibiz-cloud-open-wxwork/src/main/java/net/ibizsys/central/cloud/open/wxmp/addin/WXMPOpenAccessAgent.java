package net.ibizsys.central.cloud.open.wxmp.addin;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.oauth2.WxOAuth2AccessToken;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceHttpClientImpl;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpQrCodeTicket;
import me.chanjar.weixin.mp.config.WxMpConfigStorage;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;
import me.chanjar.weixin.mp.util.crypto.WxMpCryptUtil;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOpenUtilRuntime;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCode;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCodeRequest;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCodeScanResult;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.open.core.addin.OpenAccessAgentBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public class WXMPOpenAccessAgent extends OpenAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(WXMPOpenAccessAgent.class);
	private WxMpConfigStorage wxMpConfigStorage;
	private WxMpService wxMpService = null;
	 
	

	@Override
	protected void onInit() throws Exception {

		if(this.getWxMpService(true) == null) {
			this.preparetWxMpService();
			this.getWxMpService(false);
		}
		
		
		super.onInit();
	}
	


	protected WxMpService getWxMpService(boolean bTryMode) throws Exception {
		if (this.wxMpService != null || bTryMode) {
			return this.wxMpService;
		}
		throw new Exception("微信公众号服务对象无效");
	}

	protected void setWxMpService(WxMpService wxMpService) {
		this.wxMpService = wxMpService;
	}

	protected void preparetWxMpService() throws Exception{
		if(this.getWxMpConfigStorage(true) == null) {
			WxMpDefaultConfigImpl config = new WxMpDefaultConfigImpl();
			config.setAppId(this.getAgentData().getAccessKey());
			config.setSecret(this.getAgentData().getSecretKey());
			config.setToken(this.getAgentData().getCallbackToken());
			config.setAesKey(this.getAgentData().getCallbackParam());
			this.setWxMpConfigStorage(config);
		}

		WxMpService wxMpService = new WxMpServiceHttpClientImpl();
		wxMpService.setWxMpConfigStorage( this.getWxMpConfigStorage(false));
		this.setWxMpService(wxMpService);
	}
	
	protected WxMpConfigStorage getWxMpConfigStorage(boolean bTryMode) throws Exception {
		if (this.wxMpConfigStorage != null || bTryMode) {
			return this.wxMpConfigStorage;
		}
		throw new Exception("微信公众号配置对象无效");
	}

	protected void setWxMpConfigStorage(WxMpConfigStorage wxMpConfigStorage) {
		this.wxMpConfigStorage = wxMpConfigStorage;
	}

	@Override
	public String getName() {
		return ICloudOpenUtilRuntime.OPENPLATFORM_WXMP;
	}
		
	@Override
	protected void runAuthTimer(boolean bTimerOnly) {
		//关闭底层认证计数器，使用自身鉴权
		//super.runAuthTimer(bTimerOnly);
	}

	@Override
	protected OpenQRCode onCreateOpenQRCode(OpenQRCodeRequest openQRCodeRequest) throws Throwable {

		int nExpireSeconds = DataTypeUtils.asInteger(openQRCodeRequest.getExpireSeconds(), 0);
		
		WxMpQrCodeTicket wxMpQrCodeTicket = getWxMpService(false).getQrcodeService().qrCodeCreateTmpTicket(openQRCodeRequest.getScene(), (nExpireSeconds > 0) ? nExpireSeconds : 60);

		OpenQRCode openQRCode = new OpenQRCode();
		openQRCode.setExpireSeconds(wxMpQrCodeTicket.getExpireSeconds());
		String strUrl = String.format("https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=%1$s", URLEncoder.encode(wxMpQrCodeTicket.getTicket(), "utf-8"));
		openQRCode.setUrl(strUrl);
		openQRCode.setTicket(wxMpQrCodeTicket.getTicket());
		return openQRCode;
	}

	@Override
	protected void onExecuteCallback(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);

		String signature = request.getParameter("signature");
		String nonce = request.getParameter("nonce");
		String timestamp = request.getParameter("timestamp");

		if (!this.getWxMpService(false).checkSignature(timestamp, nonce, signature)) {
			// 消息签名不正确，说明不是公众平台发过来的消息
			response.getWriter().println("非法请求");
			return;
		}

		String echostr = request.getParameter("echostr");
		if (!ObjectUtils.isEmpty(echostr)) {
			// 说明是一个仅仅用来验证的请求，回显echostr
			response.getWriter().println(echostr);
			return;
		}

		String encryptType = ObjectUtils.isEmpty(request.getParameter("encrypt_type")) ? "raw" : request.getParameter("encrypt_type");

		if ("raw".equals(encryptType)) {
			// 明文传输的消息
			String strMessage = IOUtils.toString(request.getInputStream(), StandardCharsets.UTF_8);
			//送出回调
			String strRet = this.invokeOpenCallback(strMessage, MediaType.TEXT_XML_VALUE, false);
			
			WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(strMessage);
			WxMpXmlOutMessage outMessage = this.dealWxMpXmlMessage(inMessage);
			if(StringUtils.hasLength(strRet)) {
				response.getWriter().write(strRet);
			}
			else
				if (outMessage != null) {
					response.getWriter().write(outMessage.toXml());
				}
			return;
		}

		if ("aes".equals(encryptType)) {
			// 是aes加密的消息
			String strMessage = IOUtils.toString(request.getInputStream(), StandardCharsets.UTF_8);
			String msgSignature = request.getParameter("msg_signature");
			WxMpCryptUtil cryptUtil = new WxMpCryptUtil(this.getWxMpConfigStorage(false));
			strMessage = cryptUtil.decryptXml(msgSignature, timestamp, nonce, strMessage);
		    
		    String strRet = this.invokeOpenCallback(strMessage, MediaType.TEXT_XML_VALUE, false);
		   
		    WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(strMessage);
			WxMpXmlOutMessage outMessage = this.dealWxMpXmlMessage(inMessage);
			if(StringUtils.hasLength(strRet)) {
				response.getWriter().write(cryptUtil.encrypt(strRet));
		    }
			else
				if (outMessage != null) {
					response.getWriter().write(cryptUtil.encrypt(outMessage.toXml()));
				}
			return;
		}

		response.getWriter().println("不可识别的加密类型");
		return;
	}
	
	protected WxMpXmlOutMessage dealWxMpXmlMessage(WxMpXmlMessage inMessage) throws Throwable {
		switch(inMessage.getMsgType()) {
			case WxConsts.XmlMsgType.EVENT:
				return this.dealWxMpEventMessage(inMessage);
			
		}
		return null;
	}
	
	protected WxMpXmlOutMessage dealWxMpEventMessage(WxMpXmlMessage inMessage) throws Throwable {
		
		log.debug(String.format("dealWxMpEventMessage: %1$s", inMessage.toString()));
		
		switch(inMessage.getEvent()) {
			case WxConsts.EventType.SCAN:
			case WxConsts.EventType.SUBSCRIBE:
				if(StringUtils.hasLength(inMessage.getTicket())
						&& StringUtils.hasLength(inMessage.getFromUser())) {
					OpenQRCodeScanResult result = new OpenQRCodeScanResult();
					result.setTicket(inMessage.getTicket());
					result.setOpenUserId(inMessage.getFromUser());
					String strCacheTag = this.getQRCodeScanTag(inMessage.getTicket());
					this.getSysCacheUtilRuntime().set(strCacheTag, result, 60);
				}
				break;
		}
		return null;
	}
	
	@Override
	protected OpenUser onGetOpenUserByQRCode(String strCode) throws Throwable {
		String strCacheTag = this.getQRCodeScanTag(strCode);
		OpenQRCodeScanResult result = this.getSysCacheUtilRuntime().get(strCacheTag, OpenQRCodeScanResult.class);
		if(result == null) {
			return null;
		}
		
		OpenUser openUser = new OpenUser();
		openUser.setUserId(result.getOpenUserId());
		openUser.setOpenType(this.getOpenType());
		openUser.setAccessId(this.getOpenAccessId());
		return openUser;
	}
	
	protected String getQRCodeScanTag(String strTicket) {
		return String.format("%1$s-open-qrcode-scan-%2$s--%3$s", CloudCacheTagUtils.PREFIX, this.getOpenAccessId(), KeyValueUtils.genUniqueId(strTicket));
	}
	
	@Override
	protected OpenUser onGetOpenUserBySNSCode(String strCode) throws Throwable {
		WxOAuth2AccessToken wxOAuth2AccessToken = getWxMpService(false).getOAuth2Service().getAccessToken(strCode);
		
		OpenUser openUser = new OpenUser();
		openUser.setUserId(wxOAuth2AccessToken.getOpenId());
		
		return openUser;
	}
	
	
	@Override
	protected OpenUser onGetOpenUserByAuthCode(String strCode) throws Throwable {
		WxOAuth2AccessToken wxOAuth2AccessToken = getWxMpService(false).getOAuth2Service().getAccessToken(strCode);
		
		OpenUser openUser = new OpenUser();
		openUser.setUserId(wxOAuth2AccessToken.getOpenId());
		
		return openUser;
	}
	
}
