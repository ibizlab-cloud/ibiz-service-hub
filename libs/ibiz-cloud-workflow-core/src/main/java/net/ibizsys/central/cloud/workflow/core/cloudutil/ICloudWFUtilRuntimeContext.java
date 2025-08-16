package net.ibizsys.central.cloud.workflow.core.cloudutil;

import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.Role;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.service.client.IWebClientRep;

public interface ICloudWFUtilRuntimeContext {

	
	
	/**
	 * 获取工作流上下文对象
	 * @return
	 */
	ICloudWFUtilRuntime getCloudWFUtilRuntime();
	
	
	
	/**
	 * 执行工作流回调
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strActionType 操作类型
	 * @param strAction 操作
	 * @param objData 回调参数
	 * @param cls 返回类型
	 * @param strAppTag
	 * @return
	 */
	<T> IWebClientRep<T> executeWFCallback(String strSystemTag, String strDataEntity, String strActionType, String strAction, Object objData, Class<T> cls, String strAppTag);
	
	
	/**
	 * 执行工作流回调
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strActionType 操作类型
	 * @param strAction 操作
	 * @param objData 回调参数
	 * @param type 返回类型
	 * @param strAppTag
	 * @return
	 */
	<T> IWebClientRep<T> executeWFCallback(String strSystemTag, String strDataEntity, String strActionType, String strAction, Object objData, TypeReference<T> type, String strAppTag);
	
	
	
	/**
	 * 获取传入标识的机构用户集合
	 * @param ids
	 * @return
	 */
	Collection<Employee> getEmployees(String[] ids);
	
	
	
	/**
	 * 获取指定工作流用户组
	 * @param strWFGroupId
	 * @return
	 */
	WFGroup getWFGroup(String strWFGroupId);
	
	
	
	/**
	 * 获取指定工作流用户组成员集合
	 * @param strWFGroupId
	 * @param activeData 当前数据
	 * @return
	 */
	Collection<WFMember> getWFMembers(String strWFGroupId, Object activeData);
	
	
	
	/**
	 * 获取指定工作流用户组成员集合
	 * @param wfGroup
	 * @param activeData 当前数据
	 * @return
	 */
	Collection<WFMember> getWFMembers(WFGroup wfGroup, Object activeData);
	
	
	
	/**
	 * 获取全局角色标记
	 * @param strRoleTag
	 * @return
	 */
	Role getGlobalRole(String strRoleTag);
	
	
	/**
	 * 建立用户待办工作
	 * @param todos
	 */
	void createTodo(Todo[] todos);
}
