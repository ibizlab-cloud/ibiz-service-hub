package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 机构系统
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/.ibizmodel.index
 */
public class DCSystemDTO extends EntityDTO {

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 开放平台应用
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ACCESSID = "accessid";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/DCSYSTEMNAME/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 系统标识（回调）
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/REALPSDEVSLNSYSID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/minorpsders/DER1N_SYS_DC_SYSTEM_SYS_PSSYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_REALPSDEVSLNSYSID = "realpsdevslnsysid";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/SRFDCID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/minorpsders/DER1N_SYS_DC_SYSTEM_SYS_CENTER_SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/SRFDCNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/minorpsders/DER1N_SYS_DC_SYSTEM_SYS_CENTER_SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCNAME = "srfdcname";

  /**.
   * 系统权限
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.PermissionCat} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/SYSPERMISSION/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/PermissionCat.ibizmodel.yaml
   */
  public final static String FIELD_SYSPERMISSION = "syspermission";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/minorpsders/DER1N_SYS_DC_SYSTEM_SYS_PSSYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 系统名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/SYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/minorpsders/DER1N_SYS_DC_SYSTEM_SYS_PSSYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMNAME = "systemname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setMemo(String val) {
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
    public DCSystemDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「开放平台应用」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setAccessId(String val) {
        this._set(FIELD_ACCESSID, val);
        return this;
    }

    /**
     * 获取「开放平台应用」值
     *
    */
    @JsonIgnore
    public String getAccessId() {
        return (String) this._get(FIELD_ACCESSID);
    }

    /**
     * 判断 「开放平台应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessId() {
        return this._contains(FIELD_ACCESSID);
    }

    /**
     * 重置 「开放平台应用」
     *
    */
    @JsonIgnore
    public DCSystemDTO resetAccessId() {
        this._reset(FIELD_ACCESSID);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setCreateDate(Timestamp val) {
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
    public DCSystemDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setCreateMan(String val) {
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
    public DCSystemDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setDCSystemId(String val) {
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
    public DCSystemDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setDCSystemName(String val) {
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
    public DCSystemDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「系统标识（回调）」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setRealPSDevSlnSysId(String val) {
        this._set(FIELD_REALPSDEVSLNSYSID, val);
        return this;
    }

    /**
     * 获取「系统标识（回调）」值
     *
    */
    @JsonIgnore
    public String getRealPSDevSlnSysId() {
        return (String) this._get(FIELD_REALPSDEVSLNSYSID);
    }

    /**
     * 判断 「系统标识（回调）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRealPSDevSlnSysId() {
        return this._contains(FIELD_REALPSDEVSLNSYSID);
    }

    /**
     * 重置 「系统标识（回调）」
     *
    */
    @JsonIgnore
    public DCSystemDTO resetRealPSDevSlnSysId() {
        this._reset(FIELD_REALPSDEVSLNSYSID);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setSrfdcid(String val) {
        this._set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this._get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this._contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户」
     *
    */
    @JsonIgnore
    public DCSystemDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setSrfdcname(String val) {
        this._set(FIELD_SRFDCNAME, val);
        return this;
    }

    /**
     * 获取「租户」值
     *
    */
    @JsonIgnore
    public String getSrfdcname() {
        return (String) this._get(FIELD_SRFDCNAME);
    }

    /**
     * 判断 「租户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcname() {
        return this._contains(FIELD_SRFDCNAME);
    }

    /**
     * 重置 「租户」
     *
    */
    @JsonIgnore
    public DCSystemDTO resetSrfdcname() {
        this._reset(FIELD_SRFDCNAME);
        return this;
    }

    /**
     * 设置「系统权限」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setSysPermission(String val) {
        this._set(FIELD_SYSPERMISSION, val);
        return this;
    }

    /**
     * 获取「系统权限」值
     *
    */
    @JsonIgnore
    public String getSysPermission() {
        return (String) this._get(FIELD_SYSPERMISSION);
    }

    /**
     * 判断 「系统权限」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysPermission() {
        return this._contains(FIELD_SYSPERMISSION);
    }

    /**
     * 重置 「系统权限」
     *
    */
    @JsonIgnore
    public DCSystemDTO resetSysPermission() {
        this._reset(FIELD_SYSPERMISSION);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setSystemId(String val) {
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
    public DCSystemDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「系统名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setSystemName(String val) {
        this._set(FIELD_SYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统名称」值
     *
    */
    @JsonIgnore
    public String getSystemName() {
        return (String) this._get(FIELD_SYSTEMNAME);
    }

    /**
     * 判断 「系统名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemName() {
        return this._contains(FIELD_SYSTEMNAME);
    }

    /**
     * 重置 「系统名称」
     *
    */
    @JsonIgnore
    public DCSystemDTO resetSystemName() {
        this._reset(FIELD_SYSTEMNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setUpdateDate(Timestamp val) {
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
    public DCSystemDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCSystemDTO setUpdateMan(String val) {
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
    public DCSystemDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
