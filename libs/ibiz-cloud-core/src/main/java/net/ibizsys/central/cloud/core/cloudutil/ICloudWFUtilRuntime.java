package net.ibizsys.central.cloud.core.cloudutil;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFDefinitionNode;
import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.cloud.core.util.domain.WFTask;
import net.ibizsys.central.cloud.core.util.domain.WFTaskWay;

/**
 * 云体系工作流服务组件功能对象运行时接口
 * @author lionlau
 *
 */
public interface ICloudWFUtilRuntime extends ICloudUtilRuntime{


	/**
	 * 回调行为类型：流程行为
	 */
	public final static String CALLBACKTYPE_WFACTION = "WFACTION";


	/**
	 * 回调行为类型：服务行为
	 */
	public final static String CALLBACKTYPE_SERVICEACTION = "SERVICEACTION";


	/**
	 * 回调行为类型：计算工作流用户
	 */
	public final static String CALLBACKTYPE_WFUSER = "WFUSER";


	/**
	 * 回调行为类型：获取数据集
	 */
	public final static String CALLBACKTYPE_DATASET = "DATASET";

	/**
	 * 回调行为类型：计算工作流用户
	 */
	public final static String CALLBACKTYPE_WFMEMBER = "WFMEMBER";




	/**
	 * 获取工作流回调地址
	 * @return
	 */
	String getWFCallbackUrl();


	/**
	 * 部署动态工作流
	 * @param bpmnfiles
	 */
	Collection<WFDefinition> createWFDefinitions(List bpmnfiles);

	/**
	 * 获取业务实体流程定义
	 * @param strSystemTag
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @param strDataEntity
	 * @param strAppTag
	 * @return
	 */
	Collection<WFDefinition> getWFDefinitions(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strAppTag);



	/**
	 * 获取指定业务实体流程定义
	 * @param strSystemTag
	 * @param strDynaModelTag
	 * @param strDynaModelTag2
	 * @param strDataEntity
	 * @param strProcessDefinitionKey
	 * @param strAppTag
	 * @return
	 */
	WFDefinition getWFDefinition(String strSystemTag, String strDynaModelTag, String strDynaModelTag2, String strDataEntity, String strProcessDefinitionKey, String strAppTag);


	/**
	 * 获取指定业务实体流程定义
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strProcessDefinitionKey
	 * @param strAppTag
	 * @return
	 */
	WFDefinition getWFDefinition(String strSystemTag,String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppTag);


	/**
	 * 启动流程实例
	 * @param strSystemTag
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @param strDataEntity
	 * @param wfInstance
	 * @param strAppTag
	 * @return
	 */
	WFInstance startWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, WFInstance wfInstance, String strAppTag);



	/**
	 * 提交流程任务
	 * @param strSystemTag
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @param strDataEntity
	 * @param strKey
	 * @param strWFTaskId
	 * @param wfTaskWay
	 * @param strAppTag
	 * @return
	 */
	WFInstance submitWFTask(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strWFTaskId, WFTaskWay wfTaskWay, String strAppTag);



	/**
	 * 获取指定业务实体流程节点定义
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strProcessDefinitionKey
	 * @param strTaskDefinitionKey
	 * @param strAppTag
	 * @return
	 */
	WFDefinitionNode getWFDefinitionNode(String strSystemTag,String strDataEntity, String strProcessDefinitionKey, String strTaskDefinitionKey, String strAppTag);

	/**
	 * 获取指定流程实例节点定义
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strWFInstanceId
	 * @param strAppTag
	 * @return
	 */
	List<WFDefinitionNode> getWFDefinitionNodes(String strSystemTag,String strDataEntity, String strWFInstanceId, String strAppTag);




	/**
	 * 获取传入流程节点的任务路径集合
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strTaskDefinitionKey
	 * @param wfDefinitionNode
	 * @param strAppTag
	 * @return
	 */
	List<WFTaskWay> getWFTaskWays(String strSystemTag,String strDataEntity, String strKey, String strTaskDefinitionKey, WFDefinitionNode wfDefinitionNode, String strAppTag);



	/**
	 * 回退流程操作
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strTaskId
	 * @param wfTaskWay
	 * @param strAppTag
	 * @return
	 */
	void sendBackWFTaskWay(String strSystemTag,String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag);


	/**
	 * 撤回流程
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strTaskId
	 * @param wfTaskWay
	 * @param strAppTag
	 * @return
	 */
	void withdrawWFTaskWay(String strSystemTag,String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag);


	/**
	 * 前加签任务
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strTaskId
	 * @param wfTaskWay
	 * @param strAppTag
	 * @return
	 */
	void signWFTaskWay(String strSystemTag,String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag);


	/**
	 * 后加签任务
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strTaskId
	 * @param wfTaskWay
	 * @param strAppTag
	 * @return
	 */
	void afterAddSign(String strSystemTag,String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag);


	/**
	 * 转办任务
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strTaskId
	 * @param wfTaskWay
	 * @param strAppTag
	 * @return
	 */
	void transferWFTaskWay(String strSystemTag,String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag);


	/**
	 * 抄送任务
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strTaskId
	 * @param wfTaskWay
	 * @param strAppTag
	 * @return
	 */
	void sendCopyWFTaskWay(String strSystemTag,String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag);


	/**
	 * 已读任务
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strTaskId
	 * @param wfTaskWay
	 * @param strAppTag
	 * @return
	 */
	void markReadWFTaskWay(String strSystemTag,String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag);


	/**
	 * 跳转流程实例
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param wfInstance
	 * @param strAppTag
	 * @return
	 */
	void jumpWFInstance(String strSystemTag, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag);

	/**
	 * 取消流程实例
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param wfInstance
	 * @param strAppTag
	 * @return
	 */
	void cancelWFInstance(String strSystemTag, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag);


	/**
	 * 注册流程实例
	 * @param strSystemTag
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @param strDataEntity
	 * @param strKey
	 * @param wfInstance
	 * @param strAppTag
	 * @return
	 */
	WFInstance registerWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag);



	/**
	 * 注销流程实例
	 * @param strSystemTag
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @param strDataEntity
	 * @param strKey
	 * @param strAppTag
	 * @return
	 */
	void unregisterWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag);



	/**
	 * 获取流程实例访问模式
	 * @param strSystemTag
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @param strDataEntity
	 * @param strKey
	 * @param strAppTag
	 * @return
	 */
	int getWFInstanceAccessMode(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag);


	/**
	 * 获取流程实例编辑属性
	 * @param strSystemTag
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @param strDataEntity
	 * @param strKey
	 * @param strAppTag
	 * @return
	 */
	WFEditableFields getWFInstanceEditableFields(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag);


	/**
	 * 获取流程实例步骤数据
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strWFInstanceId
	 * @param strAppTag
	 * @return
	 */
	WFInstance getWFHistory(String strSystemTag, String strDataEntity, String strKey, String strWFInstanceId, String strAppTag);




	/**
	 * 获取流程实例图例输入流
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @param strProcessDefinitionKey
	 * @param strAppTag
	 * @return
	 */
	InputStream getWFDiagramInputStream(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppTag);




	/**
	 * 获取当前用户再当前系统的工作流任务
	 * @return
	 */
	Collection<WFTask> getMyWFTasks();



	/**
	 * 通过组标识获取流程成员
	 * @param strGroupId
	 * @param conds
	 * @return
	 */
	Page<WFMember> fetchWFMembers(String strGroupId, Map<String, Object> conds);


	/**
	 * 获取工作流成员（排除）
	 * @param strGroupId
	 * @param conds
	 * @return
	 */
	Page<WFMember> fetchWFMembersExcludeMode(String strGroupId, Map<String, Object> conds);



	/**
	 * 获取工作流成员（排除指定组及部门）
	 * @param strGroupId
	 * @param conds
	 * @return
	 */
	Page<WFMember> fetchWFMembersMultiDeptMode(String strGroupId, Map<String, Object> conds);


	/**
	 * 获取流程实例
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strKey
	 * @return
	 */
	WFInstance getWFInstanceByBusinessKey(String strSystemTag, String strDataEntity, String strKey) ;
}
