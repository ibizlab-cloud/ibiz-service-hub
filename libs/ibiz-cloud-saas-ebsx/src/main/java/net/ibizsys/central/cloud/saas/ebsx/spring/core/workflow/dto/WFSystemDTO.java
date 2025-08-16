package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_PSSYSTEM/.ibizmodel.index
 */
public class WFSystemDTO extends EntityDTO {

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_PSSYSTEM/psdefields/PSSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMID = "pssystemid";

  /**.
   * 系统名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_PSSYSTEM/psdefields/PSSYSTEMNAME/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMNAME = "pssystemname";


    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFSystemDTO setPSSystemId(String val) {
        this._set(FIELD_PSSYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getPSSystemId() {
        return (String) this._get(FIELD_PSSYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemId() {
        return this._contains(FIELD_PSSYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public WFSystemDTO resetPSSystemId() {
        this._reset(FIELD_PSSYSTEMID);
        return this;
    }

    /**
     * 设置「系统名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFSystemDTO setPSSystemName(String val) {
        this._set(FIELD_PSSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统名称」值
     *
    */
    @JsonIgnore
    public String getPSSystemName() {
        return (String) this._get(FIELD_PSSYSTEMNAME);
    }

    /**
     * 判断 「系统名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemName() {
        return this._contains(FIELD_PSSYSTEMNAME);
    }

    /**
     * 重置 「系统名称」
     *
    */
    @JsonIgnore
    public WFSystemDTO resetPSSystemName() {
        this._reset(FIELD_PSSYSTEMNAME);
        return this;
    }


}
