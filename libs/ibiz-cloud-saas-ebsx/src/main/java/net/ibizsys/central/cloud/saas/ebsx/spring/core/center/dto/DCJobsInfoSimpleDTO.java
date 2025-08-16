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
public class DCJobsInfoSimpleDTO extends EntityDTO {

  /**.
   * 主键ID
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 执行器任务器
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdefields/HANDLER/.ibizmodel.index
   */
  public final static String FIELD_HANDLER = "handler";

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


    /**
     * 设置「主键ID」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoSimpleDTO setId(String val) {
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
    public DCJobsInfoSimpleDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「执行器任务器」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoSimpleDTO setHandler(String val) {
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
    public DCJobsInfoSimpleDTO resetHandler() {
        this._reset(FIELD_HANDLER);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoSimpleDTO setUpdateTime(Timestamp val) {
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
    public DCJobsInfoSimpleDTO resetUpdateTime() {
        this._reset(FIELD_UPDATETIME);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsInfoSimpleDTO setCreateTime(Timestamp val) {
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
    public DCJobsInfoSimpleDTO resetCreateTime() {
        this._reset(FIELD_CREATETIME);
        return this;
    }


}
