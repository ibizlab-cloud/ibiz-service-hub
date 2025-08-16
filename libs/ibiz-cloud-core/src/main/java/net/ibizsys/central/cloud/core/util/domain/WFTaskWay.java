package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 操作路径
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/.ibizmodel.index
 */
public class WFTaskWay extends WFEntityBase {

	/**
	 * . 路径标识
	 *
	 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/WAYID/.ibizmodel.index
	 */
	public final static String FIELD_SEQUENCEFLOWID = "sequenceFlowId";

	/**
	 * . 路径标识
	 *
	 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/WAYNAME/.ibizmodel.index
	 */
	public final static String FIELD_SEQUENCEFLOWNAME = "sequenceFlowName";

	/**
	 * . 任务标识
	 *
	 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/TASKID/.ibizmodel.index
	 */
	public final static String FIELD_TASKID = "taskId";

	/**
	 * . TaskDefinitionKey
	 *
	 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/TASKDEFINITIONKEY/.ibizmodel.index
	 */
	public final static String FIELD_TASKDEFINITIONKEY = "taskDefinitionKey";

	/**
	 * . 实例标识
	 *
	 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/INSTANCEID/.ibizmodel.index
	 */
	public final static String FIELD_PROCESSINSTANCEID = "processInstanceId";

	/**
	 * . DefinitionKey
	 *
	 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/DEFINITIONKEY/.ibizmodel.index
	 */
	public final static String FIELD_PROCESSDEFINITIONKEY = "processDefinitionKey";

	/**
	 * . 业务键值
	 *
	 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/BUSINESSKEY/.ibizmodel.index
	 */
	public final static String FIELD_PROCESSINSTANCEBUSINESSKEY = "processInstanceBusinessKey";

	/**
	 * . 引用视图
	 *
	 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/REFVIEWKEY/.ibizmodel.index
	 */
	public final static String FIELD_REFVIEWKEY = "refViewKey";

	/**
	 * 不默认转化小写属性，兼容旧版本
	 */
	@Override
	protected boolean isLowerCaseName() {
		return false;
	}

	/**
	 * 设置「路径标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public WFTaskWay setSequenceFlowId(String val) {
		this.set(FIELD_SEQUENCEFLOWID, val);
		return this;
	}

	/**
	 * 获取「路径标识」值
	 *
	 */
	@JsonIgnore
	public String getSequenceFlowId() {
		return (String) this.get(FIELD_SEQUENCEFLOWID);
	}

	/**
	 * 判断 「路径标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSequenceFlowId() {
		return this.contains(FIELD_SEQUENCEFLOWID);
	}

	/**
	 * 重置 「路径标识」
	 *
	 */
	@JsonIgnore
	public WFTaskWay resetSequenceFlowId() {
		this.reset(FIELD_SEQUENCEFLOWID);
		return this;
	}

	/**
	 * 设置「路径标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public WFTaskWay setSequenceFlowName(String val) {
		this.set(FIELD_SEQUENCEFLOWNAME, val);
		return this;
	}

	/**
	 * 获取「路径标识」值
	 *
	 */
	@JsonIgnore
	public String getSequenceFlowName() {
		return (String) this.get(FIELD_SEQUENCEFLOWNAME);
	}

	/**
	 * 判断 「路径标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSequenceFlowName() {
		return this.contains(FIELD_SEQUENCEFLOWNAME);
	}

	/**
	 * 重置 「路径标识」
	 *
	 */
	@JsonIgnore
	public WFTaskWay resetSequenceFlowName() {
		this.reset(FIELD_SEQUENCEFLOWNAME);
		return this;
	}

	/**
	 * 设置「任务标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public WFTaskWay setTaskId(String val) {
		this.set(FIELD_TASKID, val);
		return this;
	}

	/**
	 * 获取「任务标识」值
	 *
	 */
	@JsonIgnore
	public String getTaskId() {
		return (String) this.get(FIELD_TASKID);
	}

	/**
	 * 判断 「任务标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTaskId() {
		return this.contains(FIELD_TASKID);
	}

	/**
	 * 重置 「任务标识」
	 *
	 */
	@JsonIgnore
	public WFTaskWay resetTaskId() {
		this.reset(FIELD_TASKID);
		return this;
	}

	/**
	 * 设置「TaskDefinitionKey」
	 *
	 * @param val
	 */
	@JsonIgnore
	public WFTaskWay setTaskDefinitionKey(String val) {
		this.set(FIELD_TASKDEFINITIONKEY, val);
		return this;
	}

	/**
	 * 获取「TaskDefinitionKey」值
	 *
	 */
	@JsonIgnore
	public String getTaskDefinitionKey() {
		return (String) this.get(FIELD_TASKDEFINITIONKEY);
	}

	/**
	 * 判断 「TaskDefinitionKey」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTaskDefinitionKey() {
		return this.contains(FIELD_TASKDEFINITIONKEY);
	}

	/**
	 * 重置 「TaskDefinitionKey」
	 *
	 */
	@JsonIgnore
	public WFTaskWay resetTaskDefinitionKey() {
		this.reset(FIELD_TASKDEFINITIONKEY);
		return this;
	}

	/**
	 * 设置「实例标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public WFTaskWay setProcessInstanceId(String val) {
		this.set(FIELD_PROCESSINSTANCEID, val);
		return this;
	}

	/**
	 * 获取「实例标识」值
	 *
	 */
	@JsonIgnore
	public String getProcessInstanceId() {
		return (String) this.get(FIELD_PROCESSINSTANCEID);
	}

	/**
	 * 判断 「实例标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsProcessInstanceId() {
		return this.contains(FIELD_PROCESSINSTANCEID);
	}

	/**
	 * 重置 「实例标识」
	 *
	 */
	@JsonIgnore
	public WFTaskWay resetProcessInstanceId() {
		this.reset(FIELD_PROCESSINSTANCEID);
		return this;
	}

	/**
	 * 设置「DefinitionKey」
	 *
	 * @param val
	 */
	@JsonIgnore
	public WFTaskWay setProcessDefinitionKey(String val) {
		this.set(FIELD_PROCESSDEFINITIONKEY, val);
		return this;
	}

	/**
	 * 获取「DefinitionKey」值
	 *
	 */
	@JsonIgnore
	public String getProcessDefinitionKey() {
		return (String) this.get(FIELD_PROCESSDEFINITIONKEY);
	}

	/**
	 * 判断 「DefinitionKey」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsProcessDefinitionKey() {
		return this.contains(FIELD_PROCESSDEFINITIONKEY);
	}

	/**
	 * 重置 「DefinitionKey」
	 *
	 */
	@JsonIgnore
	public WFTaskWay resetProcessDefinitionKey() {
		this.reset(FIELD_PROCESSDEFINITIONKEY);
		return this;
	}

	/**
	 * 设置「业务键值」
	 *
	 * @param val
	 */
	@JsonIgnore
	public WFTaskWay setProcessInstanceBusinessKey(String val) {
		this.set(FIELD_PROCESSINSTANCEBUSINESSKEY, val);
		return this;
	}

	/**
	 * 获取「业务键值」值
	 *
	 */
	@JsonIgnore
	public String getProcessInstanceBusinessKey() {
		return (String) this.get(FIELD_PROCESSINSTANCEBUSINESSKEY);
	}

	/**
	 * 判断 「业务键值」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsProcessInstanceBusinessKey() {
		return this.contains(FIELD_PROCESSINSTANCEBUSINESSKEY);
	}

	/**
	 * 重置 「业务键值」
	 *
	 */
	@JsonIgnore
	public WFTaskWay resetProcessInstanceBusinessKey() {
		this.reset(FIELD_PROCESSINSTANCEBUSINESSKEY);
		return this;
	}

	/**
	 * 设置「引用视图」
	 *
	 * @param val
	 */
	@JsonIgnore
	public WFTaskWay setRefViewKey(String val) {
		this.set(FIELD_REFVIEWKEY, val);
		return this;
	}

	/**
	 * 获取「引用视图」值
	 *
	 */
	@JsonIgnore
	public String getRefViewKey() {
		return (String) this.get(FIELD_REFVIEWKEY);
	}

	/**
	 * 判断 「引用视图」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRefViewKey() {
		return this.contains(FIELD_REFVIEWKEY);
	}

	/**
	 * 重置 「引用视图」
	 *
	 */
	@JsonIgnore
	public WFTaskWay resetRefViewKey() {
		this.reset(FIELD_REFVIEWKEY);
		return this;
	}

}
