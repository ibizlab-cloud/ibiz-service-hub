package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 租户作业
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/.ibizmodel.index
 */
public class JobsInfo extends EntityBase {

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
   * 执行器任务HANDLER
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
   * 上次调用时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/LAST/.ibizmodel.index
   */
  public final static String FIELD_LAST = "last";

  /**.
   * 下次调用时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/NEXT/.ibizmodel.index
   */
  public final static String FIELD_NEXT = "next";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/APP/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/minorpsders/DER1N_DC_JOBS_INFO_DC_DC_SYSTEM_APP/.ibizmodel.index
   */
  public final static String FIELD_APP = "app";

  /**.
   * 租户系统
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
    public JobsInfo setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「主键ID」值
     *
    */
    @JsonIgnore
    public String getId() {
    	 return (String) this.get(FIELD_ID);
    }

    /**
     * 判断 「主键ID」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「主键ID」
     *
    */
    @JsonIgnore
    public JobsInfo resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「实例标识（真实）」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setTenantId(String val) {
        this.set(FIELD_TENANTID, val);
        return this;
    }

    /**
     * 获取「实例标识（真实）」值
     *
    */
    @JsonIgnore
    public String getTenantId() {
        return (String) this.get(FIELD_TENANTID);
    }

    /**
     * 判断 「实例标识（真实）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTenantId() {
        return this.contains(FIELD_TENANTID);
    }

    /**
     * 重置 「实例标识（真实）」
     *
    */
    @JsonIgnore
    public JobsInfo resetTenantId() {
        this.reset(FIELD_TENANTID);
        return this;
    }

    /**
     * 设置「任务执行CRON」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setCron(String val) {
        this.set(FIELD_CRON, val);
        return this;
    }

    /**
     * 获取「任务执行CRON」值
     *
    */
    @JsonIgnore
    public String getCron() {
        return (String) this.get(FIELD_CRON);
    }

    /**
     * 判断 「任务执行CRON」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCron() {
        return this.contains(FIELD_CRON);
    }

    /**
     * 重置 「任务执行CRON」
     *
    */
    @JsonIgnore
    public JobsInfo resetCron() {
        this.reset(FIELD_CRON);
        return this;
    }

    /**
     * 设置「执行器任务HANDLER」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setHandler(String val) {
        this.set(FIELD_HANDLER, val);
        return this;
    }

    /**
     * 获取「执行器任务HANDLER」值
     *
    */
    @JsonIgnore
    public String getHandler() {
        return (String) this.get(FIELD_HANDLER);
    }

    /**
     * 判断 「执行器任务HANDLER」是否有值
     *
    */
    @JsonIgnore
    public boolean containsHandler() {
        return this.contains(FIELD_HANDLER);
    }

    /**
     * 重置 「执行器任务HANDLER」
     *
    */
    @JsonIgnore
    public JobsInfo resetHandler() {
        this.reset(FIELD_HANDLER);
        return this;
    }

    /**
     * 设置「执行器任务参数」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setParam(String val) {
        this.set(FIELD_PARAM, val);
        return this;
    }

    /**
     * 获取「执行器任务参数」值
     *
    */
    @JsonIgnore
    public String getParam() {
        return (String) this.get(FIELD_PARAM);
    }

    /**
     * 判断 「执行器任务参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam() {
        return this.contains(FIELD_PARAM);
    }

    /**
     * 重置 「执行器任务参数」
     *
    */
    @JsonIgnore
    public JobsInfo resetParam() {
        this.reset(FIELD_PARAM);
        return this;
    }

    /**
     * 设置「任务执行超时时间（秒）」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setTimeout(Integer val) {
        this.set(FIELD_TIMEOUT, val);
        return this;
    }

    /**
     * 获取「任务执行超时时间（秒）」值
     *
    */
    @JsonIgnore
    public Integer getTimeout() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_TIMEOUT),null);
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
        return this.contains(FIELD_TIMEOUT);
    }

    /**
     * 重置 「任务执行超时时间（秒）」
     *
    */
    @JsonIgnore
    public JobsInfo resetTimeout() {
        this.reset(FIELD_TIMEOUT);
        return this;
    }

    /**
     * 设置「失败重试次数」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setFailRetryCount(Integer val) {
        this.set(FIELD_FAILRETRYCOUNT, val);
        return this;
    }

    /**
     * 获取「失败重试次数」值
     *
    */
    @JsonIgnore
    public Integer getFailRetryCount() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_FAILRETRYCOUNT),null);
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
        return this.contains(FIELD_FAILRETRYCOUNT);
    }

    /**
     * 重置 「失败重试次数」
     *
    */
    @JsonIgnore
    public JobsInfo resetFailRetryCount() {
        this.reset(FIELD_FAILRETRYCOUNT);
        return this;
    }

    /**
     * 设置「上次调度时间」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setLastTime(Long val) {
        this.set(FIELD_LASTTIME, val);
        return this;
    }

    /**
     * 获取「上次调度时间」值
     *
    */
    @JsonIgnore
    public Long getLastTime() {
        try{
            return DataTypeUtils.getLongValue(this.get(FIELD_LASTTIME),null);
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
        return this.contains(FIELD_LASTTIME);
    }

    /**
     * 重置 「上次调度时间」
     *
    */
    @JsonIgnore
    public JobsInfo resetLastTime() {
        this.reset(FIELD_LASTTIME);
        return this;
    }

    /**
     * 设置「下次调度时间」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setNextTime(Long val) {
        this.set(FIELD_NEXTTIME, val);
        return this;
    }

    /**
     * 获取「下次调度时间」值
     *
    */
    @JsonIgnore
    public Long getNextTime() {
        try{
            return DataTypeUtils.getLongValue(this.get(FIELD_NEXTTIME),null);
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
        return this.contains(FIELD_NEXTTIME);
    }

    /**
     * 重置 「下次调度时间」
     *
    */
    @JsonIgnore
    public JobsInfo resetNextTime() {
        this.reset(FIELD_NEXTTIME);
        return this;
    }

    /**
     * 设置「所有者」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setAuthor(String val) {
        this.set(FIELD_AUTHOR, val);
        return this;
    }

    /**
     * 获取「所有者」值
     *
    */
    @JsonIgnore
    public String getAuthor() {
        return (String) this.get(FIELD_AUTHOR);
    }

    /**
     * 判断 「所有者」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuthor() {
        return this.contains(FIELD_AUTHOR);
    }

    /**
     * 重置 「所有者」
     *
    */
    @JsonIgnore
    public JobsInfo resetAuthor() {
        this.reset(FIELD_AUTHOR);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setRemark(String val) {
        this.set(FIELD_REMARK, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getRemark() {
        return (String) this.get(FIELD_REMARK);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRemark() {
        return this.contains(FIELD_REMARK);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public JobsInfo resetRemark() {
        this.reset(FIELD_REMARK);
        return this;
    }

    /**
     * 设置「状态」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setStatus(Integer val) {
        this.set(FIELD_STATUS, val);
        return this;
    }

    /**
     * 获取「状态」值
     *
    */
    @JsonIgnore
    public Integer getStatus() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_STATUS),null);
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
        return this.contains(FIELD_STATUS);
    }

    /**
     * 重置 「状态」
     *
    */
    @JsonIgnore
    public JobsInfo resetStatus() {
        this.reset(FIELD_STATUS);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setUpdateTime(Timestamp val) {
        this.set(FIELD_UPDATETIME, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_UPDATETIME),null);
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
        return this.contains(FIELD_UPDATETIME);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public JobsInfo resetUpdateTime() {
        this.reset(FIELD_UPDATETIME);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setCreateTime(Timestamp val) {
        this.set(FIELD_CREATETIME, val);
        return this;
    }

    /**
     * 获取「创建时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_CREATETIME),null);
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
        return this.contains(FIELD_CREATETIME);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public JobsInfo resetCreateTime() {
        this.reset(FIELD_CREATETIME);
        return this;
    }

    /**
     * 设置「上次调用时间」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setLast(Timestamp val) {
        this.set(FIELD_LAST, val);
        return this;
    }

    /**
     * 获取「上次调用时间」值
     *
    */
    @JsonIgnore
    public Timestamp getLast() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_LAST),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「上次调用时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLast() {
        return this.contains(FIELD_LAST);
    }

    /**
     * 重置 「上次调用时间」
     *
    */
    @JsonIgnore
    public JobsInfo resetLast() {
        this.reset(FIELD_LAST);
        return this;
    }

    /**
     * 设置「下次调用时间」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setNext(Timestamp val) {
        this.set(FIELD_NEXT, val);
        return this;
    }

    /**
     * 获取「下次调用时间」值
     *
    */
    @JsonIgnore
    public Timestamp getNext() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_NEXT),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「下次调用时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNext() {
        return this.contains(FIELD_NEXT);
    }

    /**
     * 重置 「下次调用时间」
     *
    */
    @JsonIgnore
    public JobsInfo resetNext() {
        this.reset(FIELD_NEXT);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setApp(String val) {
        this.set(FIELD_APP, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getApp() {
        return (String) this.get(FIELD_APP);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApp() {
        return this.contains(FIELD_APP);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public JobsInfo resetApp() {
        this.reset(FIELD_APP);
        return this;
    }

    /**
     * 设置「租户系统」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setAppName(String val) {
        this.set(FIELD_APPNAME, val);
        return this;
    }

    /**
     * 获取「租户系统」值
     *
    */
    @JsonIgnore
    public String getAppName() {
        return (String) this.get(FIELD_APPNAME);
    }

    /**
     * 判断 「租户系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppName() {
        return this.contains(FIELD_APPNAME);
    }

    /**
     * 重置 「租户系统」
     *
    */
    @JsonIgnore
    public JobsInfo resetAppName() {
        this.reset(FIELD_APPNAME);
        return this;
    }

    /**
     * 设置「预定义类型」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setPredefinedType(String val) {
        this.set(FIELD_PREDEFINEDTYPE, val);
        return this;
    }

    /**
     * 获取「预定义类型」值
     *
    */
    @JsonIgnore
    public String getPredefinedType() {
        return (String) this.get(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 判断 「预定义类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPredefinedType() {
        return this.contains(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 重置 「预定义类型」
     *
    */
    @JsonIgnore
    public JobsInfo resetPredefinedType() {
        this.reset(FIELD_PREDEFINEDTYPE);
        return this;
    }

    /**
     * 设置「动态实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setSysDynaInstId(String val) {
        this.set(FIELD_SYSDYNAINSTID, val);
        return this;
    }

    /**
     * 获取「动态实例标识」值
     *
    */
    @JsonIgnore
    public String getSysDynaInstId() {
        return (String) this.get(FIELD_SYSDYNAINSTID);
    }

    /**
     * 判断 「动态实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysDynaInstId() {
        return this.contains(FIELD_SYSDYNAINSTID);
    }

    /**
     * 重置 「动态实例标识」
     *
    */
    @JsonIgnore
    public JobsInfo resetSysDynaInstId() {
        this.reset(FIELD_SYSDYNAINSTID);
        return this;
    }

    /**
     * 设置「任务类型」
     *
     * @param val
    */
    @JsonIgnore
    public JobsInfo setTaskType(String val) {
        this.set(FIELD_TASKTYPE, val);
        return this;
    }

    /**
     * 获取「任务类型」值
     *
    */
    @JsonIgnore
    public String getTaskType() {
        return (String) this.get(FIELD_TASKTYPE);
    }

    /**
     * 判断 「任务类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTaskType() {
        return this.contains(FIELD_TASKTYPE);
    }

    /**
     * 重置 「任务类型」
     *
    */
    @JsonIgnore
    public JobsInfo resetTaskType() {
        this.reset(FIELD_TASKTYPE);
        return this;
    }


}
