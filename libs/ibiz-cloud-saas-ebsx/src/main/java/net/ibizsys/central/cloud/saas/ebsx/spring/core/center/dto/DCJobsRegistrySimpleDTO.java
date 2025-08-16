package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统作业登记
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/.ibizmodel.index
 */
public class DCJobsRegistrySimpleDTO extends EntityDTO {

  /**.
   * 主键ID
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdefields/UPDATE_TIME/.ibizmodel.index
   */
  public final static String FIELD_UPDATETIME = "updatetime";


    /**
     * 设置「主键ID」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsRegistrySimpleDTO setId(String val) {
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
    public DCJobsRegistrySimpleDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsRegistrySimpleDTO setUpdateTime(Timestamp val) {
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
    public DCJobsRegistrySimpleDTO resetUpdateTime() {
        this._reset(FIELD_UPDATETIME);
        return this;
    }


}
