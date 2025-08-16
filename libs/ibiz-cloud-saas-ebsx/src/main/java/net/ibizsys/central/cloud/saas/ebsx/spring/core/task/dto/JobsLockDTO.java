package net.ibizsys.central.cloud.saas.ebsx.spring.core.task.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 任务锁
 * 
 * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOCK/.ibizmodel.index
 */
public class JobsLockDTO extends EntityDTO {

  /**.
   * 主键ID
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOCK/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOCK/psdefields/NAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 持有者
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOCK/psdefields/OWNER/.ibizmodel.index
   */
  public final static String FIELD_OWNER = "owner";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOCK/psdefields/CREATE_TIME/.ibizmodel.index
   */
  public final static String FIELD_CREATE_TIME = "create_time";


    /**
     * 设置「主键ID」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLockDTO setId(Long val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「主键ID」值
     *
    */
    @JsonIgnore
    public Long getId() {
        try{
            return DataTypeUtils.getLongValue(this._get(FIELD_ID),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
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
    public JobsLockDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLockDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public JobsLockDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「持有者」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLockDTO setOwner(String val) {
        this._set(FIELD_OWNER, val);
        return this;
    }

    /**
     * 获取「持有者」值
     *
    */
    @JsonIgnore
    public String getOwner() {
        return (String) this._get(FIELD_OWNER);
    }

    /**
     * 判断 「持有者」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOwner() {
        return this._contains(FIELD_OWNER);
    }

    /**
     * 重置 「持有者」
     *
    */
    @JsonIgnore
    public JobsLockDTO resetOwner() {
        this._reset(FIELD_OWNER);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public JobsLockDTO setCreate_time(Timestamp val) {
        this._set(FIELD_CREATE_TIME, val);
        return this;
    }

    /**
     * 获取「创建时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreate_time() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_CREATE_TIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「创建时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreate_time() {
        return this._contains(FIELD_CREATE_TIME);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public JobsLockDTO resetCreate_time() {
        this._reset(FIELD_CREATE_TIME);
        return this;
    }


}
