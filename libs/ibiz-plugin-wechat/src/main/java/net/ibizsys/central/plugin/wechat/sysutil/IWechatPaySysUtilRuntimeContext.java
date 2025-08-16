package net.ibizsys.central.plugin.wechat.sysutil;

import com.wechat.pay.java.core.notification.RequestParam;
import com.wechat.pay.java.service.payments.h5.H5Service;
import com.wechat.pay.java.service.payments.jsapi.JsapiService;

import com.wechat.pay.java.service.payments.jsapi.JsapiServiceExtension;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

/**
 *微信支付系统功能运行时上下文对象接口
 *
 */
public interface IWechatPaySysUtilRuntimeContext extends ISysUtilRuntimeContext{

	/* (non-Javadoc)
	 * @see net.ibizsys.central.sysutil.ISysUtilRuntimeContext#getModelRuntime()
	 */
	IWechatPaySysUtilRuntime getModelRuntime();
	
	
	/**
	 * 获取实体方法插件运行时仓库
	 * @return
	 */
	DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo();
	
	
	/**
	 * 获取Jsapi服务对象
	 * @return
	 */
	JsapiService getJsapiService() throws Exception;


	JsapiServiceExtension getJsapiServiceExtension() throws Exception;
	
	/**
	 * 获取H5服务对象
	 * @return
	 */
	H5Service getH5Service() throws Exception;
	
	
	/**
	 * 获取应用标识
	 * @return
	 */
	String getAppId();
	
	
	/**
	 * 获取商户标识
	 * @return
	 */
	String getMerchantId();
	
	
	/**
	 * 获取回调通知地址
	 * @return
	 */
	String getNotifyUrl();
	
	
	
	/**
	 * 支持回调操作
	 * @param requestParam
	 */
	void payNotify(RequestParam requestParam) throws Throwable;
}