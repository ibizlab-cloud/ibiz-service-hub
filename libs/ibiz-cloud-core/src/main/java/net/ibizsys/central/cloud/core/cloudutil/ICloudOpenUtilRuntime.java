package net.ibizsys.central.cloud.core.cloudutil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ibizsys.central.cloud.core.util.domain.OpenQRCode;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCodeRequest;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 云体系开放平台功能组件接口
 * @author lionlau
 *
 */
public interface ICloudOpenUtilRuntime extends ICloudUtilRuntime{

	/**
	 * 开放平台插件前缀
	 */
	public final static String ADDIN_OPENPLATFORM_PREFIX = "OPENPLATFORM:";
	
	
	/**
	 * 开放平台：钉钉
	 */
	public final static String OPENPLATFORM_DINGTALK = "DINGTALK";
	
	
	/**
	 * 开放平台：企业微信
	 */
	public final static String OPENPLATFORM_WXWORK = "WXWORK";
	
	
	/**
	 * 开放平台：Odoo
	 */
	public final static String OPENPLATFORM_ODOO = "ODOO";
	
	
	/**
	 * 开放平台：微信公众号
	 */
	public final static String OPENPLATFORM_WXMP = "WXMP";
	
	
	/**
	 * 同步组织单元信息
	 * @param strAccessId
	 */
	void syncOrganizationUnits(String strAccessId);
	
	/**
	 * 同步组织信息
	 * @param strAccessId
	 */
	void syncOrganizations(String strAccessId);
	
	
	/**
	 * 同步部门信息
	 * @param strAccessId
	 */
	void syncDepartments(String strAccessId);
	
	
	/**
	 * 同步人员信息
	 * @param strAccessId
	 */
	void syncEmployees(String strAccessId);
	
	
	
	/**
	 * 发送消息
	 * @param strAccessId
	 * @param msgSendQueues
	 */
	void sendMessages(String strAccessId, MsgSendQueue[] msgSendQueues);
	
	
	
	/**
	 * 通过开放平台临时授权代码获取开放用户
	 * @param strOpenAccessId
	 * @param strCode
	 * @return
	 */
	OpenUser getOpenUserBySNSCode(String strOpenAccessId, String strCode);
	
	
	/**
	 * 通过开放平台认证代码获取开放用户
	 * @param strOpenAccessId
	 * @param strCode
	 * @return
	 */
	OpenUser getOpenUserByAuthCode(String strOpenAccessId, String strCode);
	
	
	
	/**
	 * 生成开放平台二维码
	 * @param strOpenAccessId
	 * @param request
	 * @return
	 */
	OpenQRCode createOpenQRCode(String strOpenAccessId, OpenQRCodeRequest request);
	
	
	/**
	 * 通过开放平台二维码获取开放用户
	 * @param strOpenAccessId
	 * @param strQRCode
	 * @return
	 */
	OpenUser getOpenUserByQRCode(String strOpenAccessId, String strQRCode);
	
	/**
	 * 执行服务器回调
	 * @param strCallbackTag
	 * @param request
	 * @param response
	 */
	void executeCallback(String strCallbackTag, HttpServletRequest request, HttpServletResponse response);
}



