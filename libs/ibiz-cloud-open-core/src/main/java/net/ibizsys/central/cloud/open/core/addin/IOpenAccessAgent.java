package net.ibizsys.central.cloud.open.core.addin;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenDept;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCode;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCodeRequest;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.open.core.cloudutil.ICloudOpenUtilRuntimeContext;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 开放访问代理
 * @author lionlau
 *
 */
public interface IOpenAccessAgent extends ICloudOpenUtilRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param openAccess
	 * @throws Exception
	 */
	void init(ICloudOpenUtilRuntimeContext ctx, OpenAccess openAccess) throws Exception;
	
	
	/**
	 * 开始代理
	 */
	void start() throws Exception;
	
	/**
	 * 停止代理
	 */
	void stop() throws Exception;
	
	
	/**
	 * 获取代理数据
	 * @return
	 */
	OpenAccess getAgentData();

	
	/**
	 * 获取开放平台类型
	 * @return
	 */
	String getOpenType();
	
	/**
	 * 查询开放平台部门
	 * @param iSearchContext
	 * @return
	 */
	Collection<OpenDept> selectOpenDepts(ISearchContext iSearchContext);
	
	
	
	/**
	 * 查询开放平台用户
	 * @param iSearchContext
	 * @return
	 */
	Collection<OpenUser> selectOpenUsers(ISearchContext iSearchContext);
	
	
//	
//	/**
//	 * 建立部门
//	 * @param list
//	 */
//	void createOpenDepts(OpenDept[] list);
//	
//	
//	
//	/**
//	 * 更新部门
//	 * @param list
//	 */
//	void updateOpenDepts(OpenDept[] list);
//	
//	
//	/**
//	 * 删除部门
//	 * @param list
//	 */
//	void removeOpenDepts(String[] list);
//	
	
	
	
	/**
	 * 发送消息
	 * @param strAccessId
	 * @param msgSendQueues
	 */
	void sendMessages(MsgSendQueue[] msgSendQueues);
	
	
	
	/**
	 * 通过开放平台临时授权代码获取开放用户
	 * @param strCode
	 * @return
	 */
	OpenUser getOpenUserBySNSCode(String strCode);
	
	
	
	/**
	 * 通过开放平台认证代码获取开放用户
	 * @param strCode
	 * @return
	 */
	OpenUser getOpenUserByAuthCode(String strCode);
	
	
	
	/**
	 * 生成开放平台二维码
	 * @param openQRCodeRequest
	 * @return
	 */
	OpenQRCode createOpenQRCode(OpenQRCodeRequest openQRCodeRequest);
	
	
	/**
	 * 通过开放平台二维码获取开放用户
	 * @param strCode
	 * @return
	 */
	OpenUser getOpenUserByQRCode(String strQRCode);
	
	/**
	 * 执行服务器回调
	 * @param request
	 * @param response
	 * 
	 */
	void executeCallback(HttpServletRequest request, HttpServletResponse response);
	
	
	
	/**
	 * 获取支持的消息类型
	 * @return
	 */
	default int getSupportMsgType() {
		return 0;
	}
}
