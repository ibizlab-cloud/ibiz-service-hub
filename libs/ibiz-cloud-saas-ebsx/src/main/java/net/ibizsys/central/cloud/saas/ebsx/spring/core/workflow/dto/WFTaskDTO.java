package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 工作流任务
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/.ibizmodel.index
 */
public class WFTaskDTO extends EntityDTO {

  /**.
   * 任务标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/TASKID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 状态
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/TASKNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * DefinitionId
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/DEFINITIONID/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONID = "processdefinitionid";

  /**.
   * DefinitionKey
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/DEFINITIONKEY/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONKEY = "processdefinitionkey";

  /**.
   * 流程
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/DEFINITIONNAME/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONNAME = "processdefinitionname";

  /**.
   * TaskDefinitionKey
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/TASKDEFINITIONKEY/.ibizmodel.index
   */
  public final static String FIELD_TASKDEFINITIONKEY = "taskdefinitionkey";

  /**.
   * 待办事项
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/DESCRIPTION/.ibizmodel.index
   */
  public final static String FIELD_DESCRIPTION = "description";

  /**.
   * 发起时间
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/CREATETIME/.ibizmodel.index
   */
  public final static String FIELD_CREATETIME = "createtime";

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/INSTANCEID/.ibizmodel.index
   */
  public final static String FIELD_PROCESSINSTANCEID = "processinstanceid";

  /**.
   * 业务键值
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/BUSINESSKEY/.ibizmodel.index
   */
  public final static String FIELD_PROCESSINSTANCEBUSINESSKEY = "processinstancebusinesskey";

  /**.
   * 业务键值（含应用标识）
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/BUSINESSKEY2/.ibizmodel.index
   */
  public final static String FIELD_PROCESSINSTANCEBUSINESSKEY2 = "processinstancebusinesskey2";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 实体标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 待办归属
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 系统应用标识
   * 待办的应用标识，根据应用标识动态计算待办跳转地址
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/SYSAPPID/.ibizmodel.index
   */
  public final static String FIELD_SYSAPPID = "sysappid";

  /**.
   * 打开地址
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdefields/URL/.ibizmodel.index
   */
  public final static String FIELD_URL = "url";


    /**
     * 设置「任务标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「任务标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「任务标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「任务标识」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「状态」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「状态」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「状态」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「DefinitionId」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setProcessDefinitionId(String val) {
        this._set(FIELD_PROCESSDEFINITIONID, val);
        return this;
    }

    /**
     * 获取「DefinitionId」值
     *
    */
    @JsonIgnore
    public String getProcessDefinitionId() {
        return (String) this._get(FIELD_PROCESSDEFINITIONID);
    }

    /**
     * 判断 「DefinitionId」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDefinitionId() {
        return this._contains(FIELD_PROCESSDEFINITIONID);
    }

    /**
     * 重置 「DefinitionId」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetProcessDefinitionId() {
        this._reset(FIELD_PROCESSDEFINITIONID);
        return this;
    }

    /**
     * 设置「DefinitionKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setProcessDefinitionKey(String val) {
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
    public WFTaskDTO resetProcessDefinitionKey() {
        this._reset(FIELD_PROCESSDEFINITIONKEY);
        return this;
    }

    /**
     * 设置「流程」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setProcessDefinitionName(String val) {
        this._set(FIELD_PROCESSDEFINITIONNAME, val);
        return this;
    }

    /**
     * 获取「流程」值
     *
    */
    @JsonIgnore
    public String getProcessDefinitionName() {
        return (String) this._get(FIELD_PROCESSDEFINITIONNAME);
    }

    /**
     * 判断 「流程」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDefinitionName() {
        return this._contains(FIELD_PROCESSDEFINITIONNAME);
    }

    /**
     * 重置 「流程」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetProcessDefinitionName() {
        this._reset(FIELD_PROCESSDEFINITIONNAME);
        return this;
    }

    /**
     * 设置「TaskDefinitionKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setTaskDefinitionKey(String val) {
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
    public WFTaskDTO resetTaskDefinitionKey() {
        this._reset(FIELD_TASKDEFINITIONKEY);
        return this;
    }

    /**
     * 设置「待办事项」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setDescription(String val) {
        this._set(FIELD_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「待办事项」值
     *
    */
    @JsonIgnore
    public String getDescription() {
        return (String) this._get(FIELD_DESCRIPTION);
    }

    /**
     * 判断 「待办事项」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDescription() {
        return this._contains(FIELD_DESCRIPTION);
    }

    /**
     * 重置 「待办事项」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「发起时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setCreateTime(Timestamp val) {
        this._set(FIELD_CREATETIME, val);
        return this;
    }

    /**
     * 获取「发起时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_CREATETIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「发起时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateTime() {
        return this._contains(FIELD_CREATETIME);
    }

    /**
     * 重置 「发起时间」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetCreateTime() {
        this._reset(FIELD_CREATETIME);
        return this;
    }

    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setProcessInstanceId(String val) {
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
    public WFTaskDTO resetProcessInstanceId() {
        this._reset(FIELD_PROCESSINSTANCEID);
        return this;
    }

    /**
     * 设置「业务键值」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setProcessInstanceBusinessKey(String val) {
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
    public WFTaskDTO resetProcessInstanceBusinessKey() {
        this._reset(FIELD_PROCESSINSTANCEBUSINESSKEY);
        return this;
    }

    /**
     * 设置「业务键值（含应用标识）」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setProcessInstanceBusinessKey2(String val) {
        this._set(FIELD_PROCESSINSTANCEBUSINESSKEY2, val);
        return this;
    }

    /**
     * 获取「业务键值（含应用标识）」值
     *
    */
    @JsonIgnore
    public String getProcessInstanceBusinessKey2() {
        return (String) this._get(FIELD_PROCESSINSTANCEBUSINESSKEY2);
    }

    /**
     * 判断 「业务键值（含应用标识）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessInstanceBusinessKey2() {
        return this._contains(FIELD_PROCESSINSTANCEBUSINESSKEY2);
    }

    /**
     * 重置 「业务键值（含应用标识）」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetProcessInstanceBusinessKey2() {
        this._reset(FIELD_PROCESSINSTANCEBUSINESSKEY2);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setDCSystemId(String val) {
        this._set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this._get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this._contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「实体标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setEntityId(String val) {
        this._set(FIELD_ENTITYID, val);
        return this;
    }

    /**
     * 获取「实体标识」值
     *
    */
    @JsonIgnore
    public String getEntityId() {
        return (String) this._get(FIELD_ENTITYID);
    }

    /**
     * 判断 「实体标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityId() {
        return this._contains(FIELD_ENTITYID);
    }

    /**
     * 重置 「实体标识」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「待办归属」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setOrgid(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「待办归属」值
     *
    */
    @JsonIgnore
    public String getOrgid() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「待办归属」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgid() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「待办归属」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetOrgid() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「系统应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setSysAppId(String val) {
        this._set(FIELD_SYSAPPID, val);
        return this;
    }

    /**
     * 获取「系统应用标识」值
     *
    */
    @JsonIgnore
    public String getSysAppId() {
        return (String) this._get(FIELD_SYSAPPID);
    }

    /**
     * 判断 「系统应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysAppId() {
        return this._contains(FIELD_SYSAPPID);
    }

    /**
     * 重置 「系统应用标识」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetSysAppId() {
        this._reset(FIELD_SYSAPPID);
        return this;
    }

    /**
     * 设置「打开地址」
     *
     * @param val
    */
    @JsonIgnore
    public WFTaskDTO setUrl(String val) {
        this._set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「打开地址」值
     *
    */
    @JsonIgnore
    public String getUrl() {
        return (String) this._get(FIELD_URL);
    }

    /**
     * 判断 「打开地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUrl() {
        return this._contains(FIELD_URL);
    }

    /**
     * 重置 「打开地址」
     *
    */
    @JsonIgnore
    public WFTaskDTO resetUrl() {
        this._reset(FIELD_URL);
        return this;
    }


}
