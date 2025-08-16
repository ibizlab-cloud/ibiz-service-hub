package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 作业日志
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/.ibizmodel.index
 */
public class DCJobsLogDTO extends EntityDTO {

  /**.
   * 主键ID
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 执行地址
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/ADDRESS/.ibizmodel.index
   */
  public final static String FIELD_ADDRESS = "address";

  /**.
   * 执行器任务参数
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/PARAM/.ibizmodel.index
   */
  public final static String FIELD_PARAM = "param";

  /**.
   * 失败重试次数
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/FAIL_RETRY_COUNT/.ibizmodel.index
   */
  public final static String FIELD_FAILRETRYCOUNT = "failretrycount";

  /**.
   * 触发器调度返回码
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/TRIGGER_CODE/.ibizmodel.index
   */
  public final static String FIELD_TRIGGERCODE = "triggercode";

  /**.
   * 触发器调度类型
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/TRIGGER_TYPE/.ibizmodel.index
   */
  public final static String FIELD_TRIGGERTYPE = "triggertype";

  /**.
   * 触发器调度信息
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/TRIGGER_MSG/.ibizmodel.index
   */
  public final static String FIELD_TRIGGERMSG = "triggermsg";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/CREATE_TIME/.ibizmodel.index
   */
  public final static String FIELD_CREATETIME = "createtime";

  /**.
   * 处理器
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/HANDLER/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/minorpsders/DER1N_DC_JOBS_LOG_DC_JOBS_INFO_JOB_ID/.ibizmodel.index
   */
  public final static String FIELD_HANDLER = "handler";

  /**.
   * 主键ID
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/JOB_ID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/minorpsders/DER1N_DC_JOBS_LOG_DC_JOBS_INFO_JOB_ID/.ibizmodel.index
   */
  public final static String FIELD_JOBID = "jobid";


    /**
     * 设置「主键ID」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setId(String val) {
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
    public DCJobsLogDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「执行地址」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setAddress(String val) {
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
    public DCJobsLogDTO resetAddress() {
        this._reset(FIELD_ADDRESS);
        return this;
    }

    /**
     * 设置「执行器任务参数」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setParam(String val) {
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
    public DCJobsLogDTO resetParam() {
        this._reset(FIELD_PARAM);
        return this;
    }

    /**
     * 设置「失败重试次数」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setFailRetryCount(Integer val) {
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
    public DCJobsLogDTO resetFailRetryCount() {
        this._reset(FIELD_FAILRETRYCOUNT);
        return this;
    }

    /**
     * 设置「触发器调度返回码」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setTriggerCode(Integer val) {
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
    public DCJobsLogDTO resetTriggerCode() {
        this._reset(FIELD_TRIGGERCODE);
        return this;
    }

    /**
     * 设置「触发器调度类型」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setTriggerType(String val) {
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
    public DCJobsLogDTO resetTriggerType() {
        this._reset(FIELD_TRIGGERTYPE);
        return this;
    }

    /**
     * 设置「触发器调度信息」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setTriggerMsg(String val) {
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
    public DCJobsLogDTO resetTriggerMsg() {
        this._reset(FIELD_TRIGGERMSG);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setCreateTime(Timestamp val) {
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
    public DCJobsLogDTO resetCreateTime() {
        this._reset(FIELD_CREATETIME);
        return this;
    }

    /**
     * 设置「处理器」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setHandler(String val) {
        this._set(FIELD_HANDLER, val);
        return this;
    }

    /**
     * 获取「处理器」值
     *
    */
    @JsonIgnore
    public String getHandler() {
        return (String) this._get(FIELD_HANDLER);
    }

    /**
     * 判断 「处理器」是否有值
     *
    */
    @JsonIgnore
    public boolean containsHandler() {
        return this._contains(FIELD_HANDLER);
    }

    /**
     * 重置 「处理器」
     *
    */
    @JsonIgnore
    public DCJobsLogDTO resetHandler() {
        this._reset(FIELD_HANDLER);
        return this;
    }

    /**
     * 设置「主键ID」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogDTO setJobId(String val) {
        this._set(FIELD_JOBID, val);
        return this;
    }

    /**
     * 获取「主键ID」值
     *
    */
    @JsonIgnore
    public String getJobId() {
        return (String) this._get(FIELD_JOBID);
    }

    /**
     * 判断 「主键ID」是否有值
     *
    */
    @JsonIgnore
    public boolean containsJobId() {
        return this._contains(FIELD_JOBID);
    }

    /**
     * 重置 「主键ID」
     *
    */
    @JsonIgnore
    public DCJobsLogDTO resetJobId() {
        this._reset(FIELD_JOBID);
        return this;
    }


}
