package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 组织系统
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/.ibizmodel.index
 */
public class DCOrgSystemDTO extends EntityDTO {

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/minorpsders/DER1N_DC_ORG_SYSTEM_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/minorpsders/DER1N_DC_ORG_SYSTEM_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 动态实例标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/DYNAINSTID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/minorpsders/DER1N_DC_ORG_SYSTEM_DC_DYNAINST_DYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTID = "dynainstid";

  /**.
   * 动态实例名称
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/DYNAINSTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/minorpsders/DER1N_DC_ORG_SYSTEM_DC_DYNAINST_DYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTNAME = "dynainstname";

  /**.
   * 启用标志
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/ISVALID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISVALID = "isvalid";

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/minorpsders/DER1N_DC_ORG_SYSTEM_SYS_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 组织名称
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/ORGNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/minorpsders/DER1N_DC_ORG_SYSTEM_SYS_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 组织系统标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/ORGSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_ORGSYSTEMID = "orgsystemid";

  /**.
   * 组织系统名称
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/ORGSYSTEMNAME/.ibizmodel.index
   */
  public final static String FIELD_ORGSYSTEMNAME = "orgsystemname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_ORG_SYSTEM/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setMemo(String val) {
        this._set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this._get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this._contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_CREATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「建立时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setCreateMan(String val) {
        this._set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this._get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setDCSystemId(String val) {
        this._set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this._get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this._contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setDCSystemName(String val) {
        this._set(FIELD_DCSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemName() {
        return (String) this._get(FIELD_DCSYSTEMNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemName() {
        return this._contains(FIELD_DCSYSTEMNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「动态实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setDynaInstId(String val) {
        this._set(FIELD_DYNAINSTID, val);
        return this;
    }

    /**
     * 获取「动态实例标识」值
     *
    */
    @JsonIgnore
    public String getDynaInstId() {
        return (String) this._get(FIELD_DYNAINSTID);
    }

    /**
     * 判断 「动态实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstId() {
        return this._contains(FIELD_DYNAINSTID);
    }

    /**
     * 重置 「动态实例标识」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetDynaInstId() {
        this._reset(FIELD_DYNAINSTID);
        return this;
    }

    /**
     * 设置「动态实例名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setDynaInstName(String val) {
        this._set(FIELD_DYNAINSTNAME, val);
        return this;
    }

    /**
     * 获取「动态实例名称」值
     *
    */
    @JsonIgnore
    public String getDynaInstName() {
        return (String) this._get(FIELD_DYNAINSTNAME);
    }

    /**
     * 判断 「动态实例名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstName() {
        return this._contains(FIELD_DYNAINSTNAME);
    }

    /**
     * 重置 「动态实例名称」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetDynaInstName() {
        this._reset(FIELD_DYNAINSTNAME);
        return this;
    }

    /**
     * 设置「启用标志」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setIsValid(Integer val) {
        this._set(FIELD_ISVALID, val);
        return this;
    }

    /**
     * 获取「启用标志」值
     *
    */
    @JsonIgnore
    public Integer getIsValid() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISVALID),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「启用标志」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsValid() {
        return this._contains(FIELD_ISVALID);
    }

    /**
     * 重置 「启用标志」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetIsValid() {
        this._reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「单位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位标识」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「组织名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setOrgName(String val) {
        this._set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「组织名称」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this._get(FIELD_ORGNAME);
    }

    /**
     * 判断 「组织名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this._contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「组织名称」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「组织系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setOrgSystemId(String val) {
        this._set(FIELD_ORGSYSTEMID, val);
        return this;
    }

    /**
     * 获取「组织系统标识」值
     *
    */
    @JsonIgnore
    public String getOrgSystemId() {
        return (String) this._get(FIELD_ORGSYSTEMID);
    }

    /**
     * 判断 「组织系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgSystemId() {
        return this._contains(FIELD_ORGSYSTEMID);
    }

    /**
     * 重置 「组织系统标识」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetOrgSystemId() {
        this._reset(FIELD_ORGSYSTEMID);
        return this;
    }

    /**
     * 设置「组织系统名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setOrgSystemName(String val) {
        this._set(FIELD_ORGSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「组织系统名称」值
     *
    */
    @JsonIgnore
    public String getOrgSystemName() {
        return (String) this._get(FIELD_ORGSYSTEMNAME);
    }

    /**
     * 判断 「组织系统名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgSystemName() {
        return this._contains(FIELD_ORGSYSTEMNAME);
    }

    /**
     * 重置 「组织系统名称」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetOrgSystemName() {
        this._reset(FIELD_ORGSYSTEMNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_UPDATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「更新时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrgSystemDTO setUpdateMan(String val) {
        this._set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this._get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this._contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public DCOrgSystemDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
