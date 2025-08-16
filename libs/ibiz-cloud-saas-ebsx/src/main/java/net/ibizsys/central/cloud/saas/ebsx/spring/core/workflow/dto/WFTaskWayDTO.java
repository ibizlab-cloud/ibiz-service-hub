package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 操作路径
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/.ibizmodel.index
 */
public class WFTaskWayDTO extends EntityDTO {

  /**.
   * 路径标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/WAYID/.ibizmodel.index
   */
  public final static String FIELD_SEQUENCEFLOWID = "sequenceflowid";

  /**.
   * 路径标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/WAYNAME/.ibizmodel.index
   */
  public final static String FIELD_SEQUENCEFLOWNAME = "sequenceflowname";

  /**.
   * 任务标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/TASKID/.ibizmodel.index
   */
  public final static String FIELD_TASKID = "taskid";

  /**.
   * TaskDefinitionKey
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/TASKDEFINITIONKEY/.ibizmodel.index
   */
  public final static String FIELD_TASKDEFINITIONKEY = "taskdefinitionkey";

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/INSTANCEID/.ibizmodel.index
   */
  public final static String FIELD_PROCESSINSTANCEID = "processinstanceid";

  /**.
   * DefinitionKey
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/DEFINITIONKEY/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONKEY = "processdefinitionkey";

  /**.
   * 业务键值
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/BUSINESSKEY/.ibizmodel.index
   */
  public final static String FIELD_PROCESSINSTANCEBUSINESSKEY = "processinstancebusinesskey";

  /**.
   * 引用视图
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdefields/REFVIEWKEY/.ibizmodel.index
   */
  public final static String FIELD_REFVIEWKEY = "refviewkey";


    /**
     * 设置「路径标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskWayDTO setSequenceFlowId(String val) {
        this._set(FIELD_SEQUENCEFLOWID, val);
        return this;
    }

    /**
     * 获取「路径标识」值
     *
    */
    @JsonIgnore
    public String getSequenceFlowId() {
        return (String) this._get(FIELD_SEQUENCEFLOWID);
    }

    /**
     * 判断 「路径标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSequenceFlowId() {
        return this._contains(FIELD_SEQUENCEFLOWID);
    }

    /**
     * 重置 「路径标识」
     *
    */
    @JsonIgnore
    public WFTaskWayDTO resetSequenceFlowId() {
        this._reset(FIELD_SEQUENCEFLOWID);
        return this;
    }

    /**
     * 设置「路径标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskWayDTO setSequenceFlowName(String val) {
        this._set(FIELD_SEQUENCEFLOWNAME, val);
        return this;
    }

    /**
     * 获取「路径标识」值
     *
    */
    @JsonIgnore
    public String getSequenceFlowName() {
        return (String) this._get(FIELD_SEQUENCEFLOWNAME);
    }

    /**
     * 判断 「路径标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSequenceFlowName() {
        return this._contains(FIELD_SEQUENCEFLOWNAME);
    }

    /**
     * 重置 「路径标识」
     *
    */
    @JsonIgnore
    public WFTaskWayDTO resetSequenceFlowName() {
        this._reset(FIELD_SEQUENCEFLOWNAME);
        return this;
    }

    /**
     * 设置「任务标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskWayDTO setTaskId(String val) {
        this._set(FIELD_TASKID, val);
        return this;
    }

    /**
     * 获取「任务标识」值
     *
    */
    @JsonIgnore
    public String getTaskId() {
        return (String) this._get(FIELD_TASKID);
    }

    /**
     * 判断 「任务标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTaskId() {
        return this._contains(FIELD_TASKID);
    }

    /**
     * 重置 「任务标识」
     *
    */
    @JsonIgnore
    public WFTaskWayDTO resetTaskId() {
        this._reset(FIELD_TASKID);
        return this;
    }

    /**
     * 设置「TaskDefinitionKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskWayDTO setTaskDefinitionKey(String val) {
        this._set(FIELD_TASKDEFINITIONKEY, val);
        return this;
    }

    /**
     * 获取「TaskDefinitionKey」值
     *
    */
    @JsonIgnore
    public String getTaskDefinitionKey() {
        return (String) this._get(FIELD_TASKDEFINITIONKEY);
    }

    /**
     * 判断 「TaskDefinitionKey」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTaskDefinitionKey() {
        return this._contains(FIELD_TASKDEFINITIONKEY);
    }

    /**
     * 重置 「TaskDefinitionKey」
     *
    */
    @JsonIgnore
    public WFTaskWayDTO resetTaskDefinitionKey() {
        this._reset(FIELD_TASKDEFINITIONKEY);
        return this;
    }

    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskWayDTO setProcessInstanceId(String val) {
        this._set(FIELD_PROCESSINSTANCEID, val);
        return this;
    }

    /**
     * 获取「实例标识」值
     *
    */
    @JsonIgnore
    public String getProcessInstanceId() {
        return (String) this._get(FIELD_PROCESSINSTANCEID);
    }

    /**
     * 判断 「实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessInstanceId() {
        return this._contains(FIELD_PROCESSINSTANCEID);
    }

    /**
     * 重置 「实例标识」
     *
    */
    @JsonIgnore
    public WFTaskWayDTO resetProcessInstanceId() {
        this._reset(FIELD_PROCESSINSTANCEID);
        return this;
    }

    /**
     * 设置「DefinitionKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskWayDTO setProcessDefinitionKey(String val) {
        this._set(FIELD_PROCESSDEFINITIONKEY, val);
        return this;
    }

    /**
     * 获取「DefinitionKey」值
     *
    */
    @JsonIgnore
    public String getProcessDefinitionKey() {
        return (String) this._get(FIELD_PROCESSDEFINITIONKEY);
    }

    /**
     * 判断 「DefinitionKey」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDefinitionKey() {
        return this._contains(FIELD_PROCESSDEFINITIONKEY);
    }

    /**
     * 重置 「DefinitionKey」
     *
    */
    @JsonIgnore
    public WFTaskWayDTO resetProcessDefinitionKey() {
        this._reset(FIELD_PROCESSDEFINITIONKEY);
        return this;
    }

    /**
     * 设置「业务键值」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskWayDTO setProcessInstanceBusinessKey(String val) {
        this._set(FIELD_PROCESSINSTANCEBUSINESSKEY, val);
        return this;
    }

    /**
     * 获取「业务键值」值
     *
    */
    @JsonIgnore
    public String getProcessInstanceBusinessKey() {
        return (String) this._get(FIELD_PROCESSINSTANCEBUSINESSKEY);
    }

    /**
     * 判断 「业务键值」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessInstanceBusinessKey() {
        return this._contains(FIELD_PROCESSINSTANCEBUSINESSKEY);
    }

    /**
     * 重置 「业务键值」
     *
    */
    @JsonIgnore
    public WFTaskWayDTO resetProcessInstanceBusinessKey() {
        this._reset(FIELD_PROCESSINSTANCEBUSINESSKEY);
        return this;
    }

    /**
     * 设置「引用视图」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskWayDTO setRefViewKey(String val) {
        this._set(FIELD_REFVIEWKEY, val);
        return this;
    }

    /**
     * 获取「引用视图」值
     *
    */
    @JsonIgnore
    public String getRefViewKey() {
        return (String) this._get(FIELD_REFVIEWKEY);
    }

    /**
     * 判断 「引用视图」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRefViewKey() {
        return this._contains(FIELD_REFVIEWKEY);
    }

    /**
     * 重置 「引用视图」
     *
    */
    @JsonIgnore
    public WFTaskWayDTO resetRefViewKey() {
        this._reset(FIELD_REFVIEWKEY);
        return this;
    }


}
