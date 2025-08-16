package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 动态实例
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/.ibizmodel.index
 */
public class DynaInstDTO extends EntityDTO {

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/minorpsders/DER1N_SYS_DYNAINST_SYS_DC_SYSTEM_DC_SYSTEM_ID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 默认实例
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/DEFAULTINST/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_DEFAULTINST = "defaultinst";

  /**.
   * 动态实例标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/DYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTID = "dynainstid";

  /**.
   * 动态实例名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/DYNAINSTNAME/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTNAME = "dynainstname";

  /**.
   * 已安装实例数据
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/INSTALLDYNAINST/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_INSTALLDYNAINST = "installdynainst";

  /**.
   * 预置实例
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/INTERNALINST/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_INTERNALINST = "internalinst";

  /**.
   * 启用标志
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/ISVALID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISVALID = "isvalid";

  /**.
   * 真实实例标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/REALDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_REALDYNAINSTID = "realdynainstid";

  /**.
   * 租户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/SRFDCID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/minorpsders/DER1N_SYS_DYNAINST_SYS_CENTER_SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/minorpsders/DER1N_SYS_DYNAINST_SYS_DC_SYSTEM_DC_SYSTEM_ID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setMemo(String val) {
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
    public DynaInstDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setCreateDate(Timestamp val) {
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
    public DynaInstDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setCreateMan(String val) {
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
    public DynaInstDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setDCSystemId(String val) {
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
    public DynaInstDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「默认实例」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setDefaultInst(Integer val) {
        this._set(FIELD_DEFAULTINST, val);
        return this;
    }

    /**
     * 获取「默认实例」值
     *
    */
    @JsonIgnore
    public Integer getDefaultInst() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_DEFAULTINST),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「默认实例」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDefaultInst() {
        return this._contains(FIELD_DEFAULTINST);
    }

    /**
     * 重置 「默认实例」
     *
    */
    @JsonIgnore
    public DynaInstDTO resetDefaultInst() {
        this._reset(FIELD_DEFAULTINST);
        return this;
    }

    /**
     * 设置「动态实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setDynaInstId(String val) {
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
    public DynaInstDTO resetDynaInstId() {
        this._reset(FIELD_DYNAINSTID);
        return this;
    }

    /**
     * 设置「动态实例名称」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setDynaInstName(String val) {
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
    public DynaInstDTO resetDynaInstName() {
        this._reset(FIELD_DYNAINSTNAME);
        return this;
    }

    /**
     * 设置「已安装实例数据」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setInstallDynaInst(Integer val) {
        this._set(FIELD_INSTALLDYNAINST, val);
        return this;
    }

    /**
     * 获取「已安装实例数据」值
     *
    */
    @JsonIgnore
    public Integer getInstallDynaInst() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_INSTALLDYNAINST),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「已安装实例数据」是否有值
     *
    */
    @JsonIgnore
    public boolean containsInstallDynaInst() {
        return this._contains(FIELD_INSTALLDYNAINST);
    }

    /**
     * 重置 「已安装实例数据」
     *
    */
    @JsonIgnore
    public DynaInstDTO resetInstallDynaInst() {
        this._reset(FIELD_INSTALLDYNAINST);
        return this;
    }

    /**
     * 设置「预置实例」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setInternalInst(Integer val) {
        this._set(FIELD_INTERNALINST, val);
        return this;
    }

    /**
     * 获取「预置实例」值
     *
    */
    @JsonIgnore
    public Integer getInternalInst() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_INTERNALINST),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「预置实例」是否有值
     *
    */
    @JsonIgnore
    public boolean containsInternalInst() {
        return this._contains(FIELD_INTERNALINST);
    }

    /**
     * 重置 「预置实例」
     *
    */
    @JsonIgnore
    public DynaInstDTO resetInternalInst() {
        this._reset(FIELD_INTERNALINST);
        return this;
    }

    /**
     * 设置「启用标志」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setIsValid(Integer val) {
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
    public DynaInstDTO resetIsValid() {
        this._reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「真实实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setRealDynaInstId(String val) {
        this._set(FIELD_REALDYNAINSTID, val);
        return this;
    }

    /**
     * 获取「真实实例标识」值
     *
    */
    @JsonIgnore
    public String getRealDynaInstId() {
        return (String) this._get(FIELD_REALDYNAINSTID);
    }

    /**
     * 判断 「真实实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRealDynaInstId() {
        return this._contains(FIELD_REALDYNAINSTID);
    }

    /**
     * 重置 「真实实例标识」
     *
    */
    @JsonIgnore
    public DynaInstDTO resetRealDynaInstId() {
        this._reset(FIELD_REALDYNAINSTID);
        return this;
    }

    /**
     * 设置「租户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setSrfdcid(String val) {
        this._set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户标识」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this._get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this._contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户标识」
     *
    */
    @JsonIgnore
    public DynaInstDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setSystemId(String val) {
        this._set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this._get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this._contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public DynaInstDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setUpdateDate(Timestamp val) {
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
    public DynaInstDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DynaInstDTO setUpdateMan(String val) {
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
    public DynaInstDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
