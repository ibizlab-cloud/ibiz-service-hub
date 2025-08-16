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
public class DCJobsLogSimpleDTO extends EntityDTO {

  /**.
   * 主键ID
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_LOG/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";


    /**
     * 设置「主键ID」
     *
     * @param val
    */
    @JsonIgnore
    public DCJobsLogSimpleDTO setId(String val) {
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
    public DCJobsLogSimpleDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }


}
