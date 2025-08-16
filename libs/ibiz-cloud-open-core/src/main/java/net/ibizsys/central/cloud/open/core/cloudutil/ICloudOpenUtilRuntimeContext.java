package net.ibizsys.central.cloud.open.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudOpenUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;

public interface ICloudOpenUtilRuntimeContext extends ICloudUtilRuntimeContext{

	/**
	 * 获取云体系开放平台功能对象
	 * @return
	 */
	default ICloudOpenUtilRuntime getCloudOpenUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	
	@Override
	ICloudOpenUtilRuntime getModelRuntime();
	
	
	
	/**
	 * 获取传入机构用户的第三方用户信息
	 * @param strOpenType
	 * @param strUserId
	 * @return
	 */
	OpenUser getOpenUser(String strOpenType, String strUserId);
	
	
	
	/**
	 * 获取开放应用
	 * @param strOpenAccessId
	 * @return
	 */
	OpenAccess getOpenAccess(String strOpenAccessId);
	
	
	
	
	/**
	 * 获取消息模板
	 * @param strOpenAccessId 开放平台应用标识
	 * @param strTemplateType  模板类型
	 * @param strTemplateId  模板标识
	 * @return
	 */
	MsgTemplate getMsgTemplate(String strOpenAccessId, String strTemplateType, String strTemplateId);
}
