package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 工作流超时策略
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/.ibizmodel.index
 */
public class WFTimeoutDTO extends EntityDTO {

  /**.
   * 业务数据主键
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdefields/BUSINESSKEY/.ibizmodel.index
   */
  public final static String FIELD_BUSINESSKEY = "businesskey";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 组织部门标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdefields/DEPTID/.ibizmodel.index
   */
  public final static String FIELD_DEPTID = "deptid";

  /**.
   * 任务到期时间
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdefields/DUEDATE/.ibizmodel.index
   */
  public final static String FIELD_DUEDATE = "duedate";

  /**.
   * 实体标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdefields/ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 主键标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 业务数据名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdefields/MAJORTEXT/.ibizmodel.index
   */
  public final static String FIELD_MAJORTEXT = "majortext";

  /**.
   * 组织机构标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 工作流任务标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdefields/TASKID/.ibizmodel.index
   */
  public final static String FIELD_TASKID = "taskid";


    /**
     * 设置「业务数据主键」
     *
     * @param val
    */
    @JsonIgnore
    public WFTimeoutDTO setBusinessKey(String val) {
        this._set(FIELD_BUSINESSKEY, val);
        return this;
    }

    /**
     * 获取「业务数据主键」值
     *
    */
    @JsonIgnore
    public String getBusinessKey() {
        return (String) this._get(FIELD_BUSINESSKEY);
    }

    /**
     * 判断 「业务数据主键」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBusinessKey() {
        return this._contains(FIELD_BUSINESSKEY);
    }

    /**
     * 重置 「业务数据主键」
     *
    */
    @JsonIgnore
    public WFTimeoutDTO resetBusinessKey() {
        this._reset(FIELD_BUSINESSKEY);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTimeoutDTO setDCSystemId(String val) {
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
    public WFTimeoutDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「组织部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTimeoutDTO setDeptId(String val) {
        this._set(FIELD_DEPTID, val);
        return this;
    }

    /**
     * 获取「组织部门标识」值
     *
    */
    @JsonIgnore
    public String getDeptId() {
        return (String) this._get(FIELD_DEPTID);
    }

    /**
     * 判断 「组织部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptId() {
        return this._contains(FIELD_DEPTID);
    }

    /**
     * 重置 「组织部门标识」
     *
    */
    @JsonIgnore
    public WFTimeoutDTO resetDeptId() {
        this._reset(FIELD_DEPTID);
        return this;
    }

    /**
     * 设置「任务到期时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFTimeoutDTO setDueDate(Timestamp val) {
        this._set(FIELD_DUEDATE, val);
        return this;
    }

    /**
     * 获取「任务到期时间」值
     *
    */
    @JsonIgnore
    public Timestamp getDueDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_DUEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「任务到期时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDueDate() {
        return this._contains(FIELD_DUEDATE);
    }

    /**
     * 重置 「任务到期时间」
     *
    */
    @JsonIgnore
    public WFTimeoutDTO resetDueDate() {
        this._reset(FIELD_DUEDATE);
        return this;
    }

    /**
     * 设置「实体标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTimeoutDTO setEntityId(String val) {
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
    public WFTimeoutDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「主键标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTimeoutDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「主键标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「主键标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「主键标识」
     *
    */
    @JsonIgnore
    public WFTimeoutDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「业务数据名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFTimeoutDTO setMajorText(String val) {
        this._set(FIELD_MAJORTEXT, val);
        return this;
    }

    /**
     * 获取「业务数据名称」值
     *
    */
    @JsonIgnore
    public String getMajorText() {
        return (String) this._get(FIELD_MAJORTEXT);
    }

    /**
     * 判断 「业务数据名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMajorText() {
        return this._contains(FIELD_MAJORTEXT);
    }

    /**
     * 重置 「业务数据名称」
     *
    */
    @JsonIgnore
    public WFTimeoutDTO resetMajorText() {
        this._reset(FIELD_MAJORTEXT);
        return this;
    }

    /**
     * 设置「组织机构标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTimeoutDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「组织机构标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「组织机构标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「组织机构标识」
     *
    */
    @JsonIgnore
    public WFTimeoutDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「工作流任务标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTimeoutDTO setTaskId(String val) {
        this._set(FIELD_TASKID, val);
        return this;
    }

    /**
     * 获取「工作流任务标识」值
     *
    */
    @JsonIgnore
    public String getTaskId() {
        return (String) this._get(FIELD_TASKID);
    }

    /**
     * 判断 「工作流任务标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTaskId() {
        return this._contains(FIELD_TASKID);
    }

    /**
     * 重置 「工作流任务标识」
     *
    */
    @JsonIgnore
    public WFTimeoutDTO resetTaskId() {
        this._reset(FIELD_TASKID);
        return this;
    }


}
