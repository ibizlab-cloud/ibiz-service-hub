package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 租户作业登记
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/.ibizmodel.index
 */
public class JobsRegistry extends EntityBase {

  /**.
   * 主键ID
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 执行地址
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdefields/ADDRESS/.ibizmodel.index
   */
  public final static String FIELD_ADDRESS = "address";

  /**.
   * 状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.JobsStatus} 
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdefields/STATUS/.ibizmodel.index
   * @see ibizmos:/psmodules/task/pscodelists/JobsStatus.ibizmodel.yaml
   */
  public final static String FIELD_STATUS = "status";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdefields/UPDATE_TIME/.ibizmodel.index
   */
  public final static String FIELD_UPDATETIME = "updatetime";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdefields/APP/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/minorpsders/DER1N_DC_JOBS_REGISTRY_DC_DC_SYSTEM_APP/.ibizmodel.index
   */
  public final static String FIELD_APP = "app";

  /**.
   * 属性
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdefields/APPNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/minorpsders/DER1N_DC_JOBS_REGISTRY_DC_DC_SYSTEM_APP/.ibizmodel.index
   */
  public final static String FIELD_APPNAME = "appname";


    /**
     * 设置「主键ID」
     *
     * @param val
    */
    @JsonIgnore
    public JobsRegistry setId(String val) {
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
    public JobsRegistry resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「执行地址」
     *
     * @param val
    */
    @JsonIgnore
    public JobsRegistry setAddress(String val) {
        this.set(FIELD_ADDRESS, val);
        return this;
    }

    /**
     * 获取「执行地址」值
     *
    */
    @JsonIgnore
    public String getAddress() {
        return (String) this.get(FIELD_ADDRESS);
    }

    /**
     * 判断 「执行地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAddress() {
        return this.contains(FIELD_ADDRESS);
    }

    /**
     * 重置 「执行地址」
     *
    */
    @JsonIgnore
    public JobsRegistry resetAddress() {
        this.reset(FIELD_ADDRESS);
        return this;
    }

    /**
     * 设置「状态」
     *
     * @param val
    */
    @JsonIgnore
    public JobsRegistry setStatus(Integer val) {
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
    public JobsRegistry resetStatus() {
        this.reset(FIELD_STATUS);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public JobsRegistry setUpdateTime(Timestamp val) {
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
    public JobsRegistry resetUpdateTime() {
        this.reset(FIELD_UPDATETIME);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public JobsRegistry setApp(String val) {
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
    public JobsRegistry resetApp() {
        this.reset(FIELD_APP);
        return this;
    }

    /**
     * 设置「属性」
     *
     * @param val
    */
    @JsonIgnore
    public JobsRegistry setAppName(String val) {
        this.set(FIELD_APPNAME, val);
        return this;
    }

    /**
     * 获取「属性」值
     *
    */
    @JsonIgnore
    public String getAppName() {
        return (String) this.get(FIELD_APPNAME);
    }

    /**
     * 判断 「属性」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppName() {
        return this.contains(FIELD_APPNAME);
    }

    /**
     * 重置 「属性」
     *
    */
    @JsonIgnore
    public JobsRegistry resetAppName() {
        this.reset(FIELD_APPNAME);
        return this;
    }


}
