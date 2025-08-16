package net.ibizsys.central.cloud.saas.ebsx.spring.core.task.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 任务调度日志
 * 
 * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/.ibizmodel.index
 */
public class JobsLogDTO extends EntityDTO {

  /**.
   * 主键ID
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 任务ID
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/JOB_ID/.ibizmodel.index
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/minorpsders/DER1N_JOBS_LOG_JOBS_INFO_JOBSID/.ibizmodel.index
   */
  public final static String FIELD_JOBID = "jobid";

  /**.
   * 执行地址
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/ADDRESS/.ibizmodel.index
   */
  public final static String FIELD_ADDRESS = "address";

  /**.
   * 执行器任务HANDLER
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/HANDLER/.ibizmodel.index
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/minorpsders/DER1N_JOBS_LOG_JOBS_INFO_JOBSID/.ibizmodel.index
   */
  public final static String FIELD_HANDLER = "handler";

  /**.
   * 执行器任务参数
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/PARAM/.ibizmodel.index
   */
  public final static String FIELD_PARAM = "param";

  /**.
   * 失败重试次数
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/FAIL_RETRY_COUNT/.ibizmodel.index
   */
  public final static String FIELD_FAILRETRYCOUNT = "failretrycount";

  /**.
   * 触发器调度返回码
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/TRIGGER_CODE/.ibizmodel.index
   */
  public final static String FIELD_TRIGGERCODE = "triggercode";

  /**.
   * 触发器调度类型
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/TRIGGER_TYPE/.ibizmodel.index
   */
  public final static String FIELD_TRIGGERTYPE = "triggertype";

  /**.
   * 触发器调度信息
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/TRIGGER_MSG/.ibizmodel.index
   */
  public final static String FIELD_TRIGGERMSG = "triggermsg";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/CREATE_TIME/.ibizmodel.index
   */
  public final static String FIELD_CREATETIME = "createtime";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";


    /**
     * 设置「主键ID」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「主键ID」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「主键ID」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「主键ID」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「任务ID」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setJobId(String val) {
        this._set(FIELD_JOBID, val);
        return this;
    }

    /**
     * 获取「任务ID」值
     *
    */
    @JsonIgnore
    public String getJobId() {
        return (String) this._get(FIELD_JOBID);
    }

    /**
     * 判断 「任务ID」是否有值
     *
    */
    @JsonIgnore
    public boolean containsJobId() {
        return this._contains(FIELD_JOBID);
    }

    /**
     * 重置 「任务ID」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetJobId() {
        this._reset(FIELD_JOBID);
        return this;
    }

    /**
     * 设置「执行地址」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setAddress(String val) {
        this._set(FIELD_ADDRESS, val);
        return this;
    }

    /**
     * 获取「执行地址」值
     *
    */
    @JsonIgnore
    public String getAddress() {
        return (String) this._get(FIELD_ADDRESS);
    }

    /**
     * 判断 「执行地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAddress() {
        return this._contains(FIELD_ADDRESS);
    }

    /**
     * 重置 「执行地址」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetAddress() {
        this._reset(FIELD_ADDRESS);
        return this;
    }

    /**
     * 设置「执行器任务HANDLER」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setHandler(String val) {
        this._set(FIELD_HANDLER, val);
        return this;
    }

    /**
     * 获取「执行器任务HANDLER」值
     *
    */
    @JsonIgnore
    public String getHandler() {
        return (String) this._get(FIELD_HANDLER);
    }

    /**
     * 判断 「执行器任务HANDLER」是否有值
     *
    */
    @JsonIgnore
    public boolean containsHandler() {
        return this._contains(FIELD_HANDLER);
    }

    /**
     * 重置 「执行器任务HANDLER」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetHandler() {
        this._reset(FIELD_HANDLER);
        return this;
    }

    /**
     * 设置「执行器任务参数」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setParam(String val) {
        this._set(FIELD_PARAM, val);
        return this;
    }

    /**
     * 获取「执行器任务参数」值
     *
    */
    @JsonIgnore
    public String getParam() {
        return (String) this._get(FIELD_PARAM);
    }

    /**
     * 判断 「执行器任务参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam() {
        return this._contains(FIELD_PARAM);
    }

    /**
     * 重置 「执行器任务参数」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetParam() {
        this._reset(FIELD_PARAM);
        return this;
    }

    /**
     * 设置「失败重试次数」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setFailRetryCount(Integer val) {
        this._set(FIELD_FAILRETRYCOUNT, val);
        return this;
    }

    /**
     * 获取「失败重试次数」值
     *
    */
    @JsonIgnore
    public Integer getFailRetryCount() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_FAILRETRYCOUNT),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「失败重试次数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFailRetryCount() {
        return this._contains(FIELD_FAILRETRYCOUNT);
    }

    /**
     * 重置 「失败重试次数」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetFailRetryCount() {
        this._reset(FIELD_FAILRETRYCOUNT);
        return this;
    }

    /**
     * 设置「触发器调度返回码」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setTriggerCode(Integer val) {
        this._set(FIELD_TRIGGERCODE, val);
        return this;
    }

    /**
     * 获取「触发器调度返回码」值
     *
    */
    @JsonIgnore
    public Integer getTriggerCode() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_TRIGGERCODE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「触发器调度返回码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTriggerCode() {
        return this._contains(FIELD_TRIGGERCODE);
    }

    /**
     * 重置 「触发器调度返回码」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetTriggerCode() {
        this._reset(FIELD_TRIGGERCODE);
        return this;
    }

    /**
     * 设置「触发器调度类型」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setTriggerType(String val) {
        this._set(FIELD_TRIGGERTYPE, val);
        return this;
    }

    /**
     * 获取「触发器调度类型」值
     *
    */
    @JsonIgnore
    public String getTriggerType() {
        return (String) this._get(FIELD_TRIGGERTYPE);
    }

    /**
     * 判断 「触发器调度类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTriggerType() {
        return this._contains(FIELD_TRIGGERTYPE);
    }

    /**
     * 重置 「触发器调度类型」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetTriggerType() {
        this._reset(FIELD_TRIGGERTYPE);
        return this;
    }

    /**
     * 设置「触发器调度信息」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setTriggerMsg(String val) {
        this._set(FIELD_TRIGGERMSG, val);
        return this;
    }

    /**
     * 获取「触发器调度信息」值
     *
    */
    @JsonIgnore
    public String getTriggerMsg() {
        return (String) this._get(FIELD_TRIGGERMSG);
    }

    /**
     * 判断 「触发器调度信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTriggerMsg() {
        return this._contains(FIELD_TRIGGERMSG);
    }

    /**
     * 重置 「触发器调度信息」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetTriggerMsg() {
        this._reset(FIELD_TRIGGERMSG);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setCreateTime(Timestamp val) {
        this._set(FIELD_CREATETIME, val);
        return this;
    }

    /**
     * 获取「创建时间」值
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
     * 判断 「创建时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateTime() {
        return this._contains(FIELD_CREATETIME);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetCreateTime() {
        this._reset(FIELD_CREATETIME);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLogDTO setSrfdcid(String val) {
        this._set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this._get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this._contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户」
     *
    */
    @JsonIgnore
    public JobsLogDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }


}
