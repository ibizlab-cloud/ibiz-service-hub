package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统作业
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/.ibizmodel.index
 */
public class DCJobsInfoDTO extends EntityDTO {

  /**.
   * 主键ID
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 实例标识（真实）
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/TENANT_ID/.ibizmodel.index
   */
  public final static String FIELD_TENANTID = "tenantid";

  /**.
   * 任务执行CRON
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/CRON/.ibizmodel.index
   */
  public final static String FIELD_CRON = "cron";

  /**.
   * 执行器任务器
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/HANDLER/.ibizmodel.index
   */
  public final static String FIELD_HANDLER = "handler";

  /**.
   * 执行器任务参数
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/PARAM/.ibizmodel.index
   */
  public final static String FIELD_PARAM = "param";

  /**.
   * 任务执行超时时间（秒）
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/TIMEOUT/.ibizmodel.index
   */
  public final static String FIELD_TIMEOUT = "timeout";

  /**.
   * 失败重试次数
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/FAIL_RETRY_COUNT/.ibizmodel.index
   */
  public final static String FIELD_FAILRETRYCOUNT = "failretrycount";

  /**.
   * 上次调度时间
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/LAST_TIME/.ibizmodel.index
   */
  public final static String FIELD_LASTTIME = "lasttime";

  /**.
   * 下次调度时间
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/NEXT_TIME/.ibizmodel.index
   */
  public final static String FIELD_NEXTTIME = "nexttime";

  /**.
   * 所有者
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/AUTHOR/.ibizmodel.index
   */
  public final static String FIELD_AUTHOR = "author";

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/REMARK/.ibizmodel.index
   */
  public final static String FIELD_REMARK = "remark";

  /**.
   * 状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.JobsStatus} 
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/STATUS/.ibizmodel.index
   * @see ibizmos:/psmodules/task/pscodelists/JobsStatus.ibizmodel.yaml
   */
  public final static String FIELD_STATUS = "status";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/UPDATE_TIME/.ibizmodel.index
   */
  public final static String FIELD_UPDATETIME = "updatetime";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/CREATE_TIME/.ibizmodel.index
   */
  public final static String FIELD_CREATETIME = "createtime";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/APP/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/minorpsders/DER1N_DC_JOBS_INFO_DC_DC_SYSTEM_APP/.ibizmodel.index
   */
  public final static String FIELD_APP = "app";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/APPNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/minorpsders/DER1N_DC_JOBS_INFO_DC_DC_SYSTEM_APP/.ibizmodel.index
   */
  public final static String FIELD_APPNAME = "appname";

  /**.
   * 预定义类型
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/PREDEFINEDTYPE/.ibizmodel.index
   */
  public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

  /**.
   * 动态实例标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_SYSDYNAINSTID = "sysdynainstid";

  /**.
   * 任务类型
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/TASKTYPE/.ibizmodel.index
   */
  public final static String FIELD_TASKTYPE = "tasktype";


    /**
     * 设置「主键ID」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setId(String val) {
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
    public DCJobsInfoDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「实例标识（真实）」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setTenantId(String val) {
        this._set(FIELD_TENANTID, val);
        return this;
    }

    /**
     * 获取「实例标识（真实）」值
     *
    */
    @JsonIgnore
    public String getTenantId() {
        return (String) this._get(FIELD_TENANTID);
    }

    /**
     * 判断 「实例标识（真实）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTenantId() {
        return this._contains(FIELD_TENANTID);
    }

    /**
     * 重置 「实例标识（真实）」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetTenantId() {
        this._reset(FIELD_TENANTID);
        return this;
    }

    /**
     * 设置「任务执行CRON」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setCron(String val) {
        this._set(FIELD_CRON, val);
        return this;
    }

    /**
     * 获取「任务执行CRON」值
     *
    */
    @JsonIgnore
    public String getCron() {
        return (String) this._get(FIELD_CRON);
    }

    /**
     * 判断 「任务执行CRON」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCron() {
        return this._contains(FIELD_CRON);
    }

    /**
     * 重置 「任务执行CRON」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetCron() {
        this._reset(FIELD_CRON);
        return this;
    }

    /**
     * 设置「执行器任务器」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setHandler(String val) {
        this._set(FIELD_HANDLER, val);
        return this;
    }

    /**
     * 获取「执行器任务器」值
     *
    */
    @JsonIgnore
    public String getHandler() {
        return (String) this._get(FIELD_HANDLER);
    }

    /**
     * 判断 「执行器任务器」是否有值
     *
    */
    @JsonIgnore
    public boolean containsHandler() {
        return this._contains(FIELD_HANDLER);
    }

    /**
     * 重置 「执行器任务器」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetHandler() {
        this._reset(FIELD_HANDLER);
        return this;
    }

    /**
     * 设置「执行器任务参数」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setParam(String val) {
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
    public DCJobsInfoDTO resetParam() {
        this._reset(FIELD_PARAM);
        return this;
    }

    /**
     * 设置「任务执行超时时间（秒）」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setTimeout(Integer val) {
        this._set(FIELD_TIMEOUT, val);
        return this;
    }

    /**
     * 获取「任务执行超时时间（秒）」值
     *
    */
    @JsonIgnore
    public Integer getTimeout() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_TIMEOUT),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「任务执行超时时间（秒）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTimeout() {
        return this._contains(FIELD_TIMEOUT);
    }

    /**
     * 重置 「任务执行超时时间（秒）」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetTimeout() {
        this._reset(FIELD_TIMEOUT);
        return this;
    }

    /**
     * 设置「失败重试次数」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setFailRetryCount(Integer val) {
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
    public DCJobsInfoDTO resetFailRetryCount() {
        this._reset(FIELD_FAILRETRYCOUNT);
        return this;
    }

    /**
     * 设置「上次调度时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setLastTime(Long val) {
        this._set(FIELD_LASTTIME, val);
        return this;
    }

    /**
     * 获取「上次调度时间」值
     *
    */
    @JsonIgnore
    public Long getLastTime() {
        try{
            return DataTypeUtils.getLongValue(this._get(FIELD_LASTTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「上次调度时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLastTime() {
        return this._contains(FIELD_LASTTIME);
    }

    /**
     * 重置 「上次调度时间」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetLastTime() {
        this._reset(FIELD_LASTTIME);
        return this;
    }

    /**
     * 设置「下次调度时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setNextTime(Long val) {
        this._set(FIELD_NEXTTIME, val);
        return this;
    }

    /**
     * 获取「下次调度时间」值
     *
    */
    @JsonIgnore
    public Long getNextTime() {
        try{
            return DataTypeUtils.getLongValue(this._get(FIELD_NEXTTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「下次调度时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNextTime() {
        return this._contains(FIELD_NEXTTIME);
    }

    /**
     * 重置 「下次调度时间」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetNextTime() {
        this._reset(FIELD_NEXTTIME);
        return this;
    }

    /**
     * 设置「所有者」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setAuthor(String val) {
        this._set(FIELD_AUTHOR, val);
        return this;
    }

    /**
     * 获取「所有者」值
     *
    */
    @JsonIgnore
    public String getAuthor() {
        return (String) this._get(FIELD_AUTHOR);
    }

    /**
     * 判断 「所有者」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuthor() {
        return this._contains(FIELD_AUTHOR);
    }

    /**
     * 重置 「所有者」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetAuthor() {
        this._reset(FIELD_AUTHOR);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setRemark(String val) {
        this._set(FIELD_REMARK, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getRemark() {
        return (String) this._get(FIELD_REMARK);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRemark() {
        return this._contains(FIELD_REMARK);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetRemark() {
        this._reset(FIELD_REMARK);
        return this;
    }

    /**
     * 设置「状态」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setStatus(Integer val) {
        this._set(FIELD_STATUS, val);
        return this;
    }

    /**
     * 获取「状态」值
     *
    */
    @JsonIgnore
    public Integer getStatus() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_STATUS),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsStatus() {
        return this._contains(FIELD_STATUS);
    }

    /**
     * 重置 「状态」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetStatus() {
        this._reset(FIELD_STATUS);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setUpdateTime(Timestamp val) {
        this._set(FIELD_UPDATETIME, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_UPDATETIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「更新时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateTime() {
        return this._contains(FIELD_UPDATETIME);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetUpdateTime() {
        this._reset(FIELD_UPDATETIME);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setCreateTime(Timestamp val) {
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
    public DCJobsInfoDTO resetCreateTime() {
        this._reset(FIELD_CREATETIME);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setApp(String val) {
        this._set(FIELD_APP, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getApp() {
        return (String) this._get(FIELD_APP);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApp() {
        return this._contains(FIELD_APP);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetApp() {
        this._reset(FIELD_APP);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setAppName(String val) {
        this._set(FIELD_APPNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getAppName() {
        return (String) this._get(FIELD_APPNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppName() {
        return this._contains(FIELD_APPNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetAppName() {
        this._reset(FIELD_APPNAME);
        return this;
    }

    /**
     * 设置「预定义类型」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setPredefinedType(String val) {
        this._set(FIELD_PREDEFINEDTYPE, val);
        return this;
    }

    /**
     * 获取「预定义类型」值
     *
    */
    @JsonIgnore
    public String getPredefinedType() {
        return (String) this._get(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 判断 「预定义类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPredefinedType() {
        return this._contains(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 重置 「预定义类型」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetPredefinedType() {
        this._reset(FIELD_PREDEFINEDTYPE);
        return this;
    }

    /**
     * 设置「动态实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setSysDynaInstId(String val) {
        this._set(FIELD_SYSDYNAINSTID, val);
        return this;
    }

    /**
     * 获取「动态实例标识」值
     *
    */
    @JsonIgnore
    public String getSysDynaInstId() {
        return (String) this._get(FIELD_SYSDYNAINSTID);
    }

    /**
     * 判断 「动态实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysDynaInstId() {
        return this._contains(FIELD_SYSDYNAINSTID);
    }

    /**
     * 重置 「动态实例标识」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetSysDynaInstId() {
        this._reset(FIELD_SYSDYNAINSTID);
        return this;
    }

    /**
     * 设置「任务类型」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoDTO setTaskType(String val) {
        this._set(FIELD_TASKTYPE, val);
        return this;
    }

    /**
     * 获取「任务类型」值
     *
    */
    @JsonIgnore
    public String getTaskType() {
        return (String) this._get(FIELD_TASKTYPE);
    }

    /**
     * 判断 「任务类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTaskType() {
        return this._contains(FIELD_TASKTYPE);
    }

    /**
     * 重置 「任务类型」
     *
    */
    @JsonIgnore
    public DCJobsInfoDTO resetTaskType() {
        this._reset(FIELD_TASKTYPE);
        return this;
    }


}
