package net.ibizsys.central.cloud.core.cloudutil;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.domain.CarbonCopy;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.cloud.core.util.domain.V2InternalMessage;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 云体系通知功能组件接口
 * @author lionlau
 *
 */
public interface ICloudNotifyUtilRuntime extends ICloudUtilRuntime{

	/**
	 * 消息发送插件前缀
	 */
	public final static String ADDIN_MSGSENDER_PREFIX = "MSGSENDER:";
	

	
	/**
	 * 创建Todo
	 * @param todo
	 */
	void createTodos(Todo[] todos);
	
	
	
	/**
	 * 标记待办已读
	 * @param strTodoId 待办标识
	 */
	Todo markReadTodo(String strTodoId);
	
	
	/**
	 * 标记待办已读（通过任务类型和任务标识）
	 * @param strTaskType
	 * @param strTaskId
	 */
	Todo markReadTodo(String strTaskType, String strTaskId);
	
	
	
	/**
	 * 标记待办完成（通过任务类型和任务标识）
	 * @param strTaskType
	 * @param strTaskId
	 */
	Todo completeTodo(String strTaskType, String strTaskId);
	
	
	
	
	/**
	 * 标记待办取消（通过任务类型和任务标识）
	 * @param strTaskType
	 * @param strTaskId
	 */
	Todo cancelTodo(String strTaskType, String strTaskId);
	
	
	/**
	 * 标记待办委派（通过任务类型和任务标识）
	 * @param strTaskType
	 * @param strTaskId
	 */
	Todo delegateTodo(String strTaskType, String strTaskId, String strTargetUserId);
	
	
	/**
	 * 标记待办resolve
	 * @param strTaskType
	 * @param strTaskId
	 */
	Todo resolveTodo(String strTaskType, String strTaskId);
	
	
	
	/**
	 * 标记待办重新分配（通过任务类型和任务标识）
	 * @param strTaskType
	 * @param strTaskId
	 */
	Todo reassignTodo(String strTaskType, String strTaskId, String strTargetUserId);
	
	
	
	/**
	 * 查询任务
	 * @param strTaskType
	 * @param iSearchContext
	 * @return
	 */
	Page<Todo> fetchTodos(String strTaskType, Map<String, Object> conds);
	
	
	/**
	 * 创建抄送
	 * @param todo
	 */
	void createCarbonCopies(CarbonCopy[] todos);
	
	
	
	/**
	 * 标记抄送已读
	 * @param strCarbonCopyId 待办标识
	 */
	CarbonCopy markReadCarbonCopy(String strCarbonCopyId);
	
	
	/**
	 * 标记抄送已读（通过任务类型和任务标识）
	 * @param strTaskType
	 * @param strTaskId
	 */
	CarbonCopy markReadCarbonCopy(String strTaskType, String strTaskId);
	
	
	
	/**
	 * 发送消息
	 * @param msgSendQueue
	 */
	void sendMessages(MsgSendQueue[] msgSendQueues);
	
	
	
	/**
	 * 发送消息
	 * @param strMsgId
	 * @return
	 */
	MsgSendQueue sendMessage(String strMsgId);
	
	
	
	/**
	 * 获取发送消息集合
	 * @param ids
	 * @return
	 */
	Collection<MsgSendQueue> getMessages(String[] ids);
	
	
	
	/**
	 * 发送内部消息
	 * @param v2InternalMessage
	 */
	V2InternalMessage sendInternal(V2InternalMessage v2InternalMessage);
	
	
	
	/**
	 * 标记内部消息已读
	 * @param strInternalMessageId 内部消息标识
	 * @param params 标注参数 
	 */
	V2InternalMessage markReadInternal(String strInternalMessageId, Map<String, Object> params);
}



