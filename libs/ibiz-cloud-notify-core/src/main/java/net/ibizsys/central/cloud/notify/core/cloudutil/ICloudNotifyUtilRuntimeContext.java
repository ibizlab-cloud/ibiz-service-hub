package net.ibizsys.central.cloud.notify.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudNotifyUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;

public interface ICloudNotifyUtilRuntimeContext extends ICloudUtilRuntimeContext{

	/**
	 * 获取云体系通知功能对象
	 * @return
	 */
	default ICloudNotifyUtilRuntime getCloudNotifyUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	
	@Override
	ICloudNotifyUtilRuntime getModelRuntime();
	
	
	/**
	 * 获取指定机构人员数据对象
	 * @param strUserId
	 * @return
	 */
	Employee getEmployee(String strUserId);
	
	
	
	
	
	/**
	 * 获取指定机构系统
	 * @param strDCSystemId
	 * @return
	 */
	DCSystem getDCSystem(String strDCSystemId);
	
	
	
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
	 * @param bTryMode 
	 * @return
	 */
	OpenAccess getOpenAccess(String strOpenAccessId, boolean bTryMode);
	
	
	
	
	/**
	 * 获取消息模板
	 * @param strOpenAccessId 开放平台应用标识
	 * @param strTemplateType  模板类型
	 * @param strTemplateId  模板标识
	 * @return
	 */
	MsgTemplate getMsgTemplate(String strOpenAccessId, String strTemplateType, String strTemplateId);
}
