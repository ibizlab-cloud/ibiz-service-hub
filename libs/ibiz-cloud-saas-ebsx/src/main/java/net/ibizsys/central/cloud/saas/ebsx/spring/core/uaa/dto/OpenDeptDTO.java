package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 开放平台部门
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/.ibizmodel.index
 */
public class OpenDeptDTO extends EntityDTO {

  /**.
   * 开放平台应用
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/ACCESSID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/minorpsders/DER1N_SYS_OPEN_DEPT_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ACCESSID = "accessid";

  /**.
   * 开放平台应用
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/ACCESSNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/minorpsders/DER1N_SYS_OPEN_DEPT_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ACCESSNAME = "accessname";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 绑定状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/ISBINDING/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISBINDING = "isbinding";

  /**.
   * 部门编码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/OPENDEPTCODE/.ibizmodel.index
   */
  public final static String FIELD_OPENDEPTCODE = "opendeptcode";

  /**.
   * 部门标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/OPENDEPTID/.ibizmodel.index
   */
  public final static String FIELD_OPENDEPTID = "opendeptid";

  /**.
   * 部门名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/OPENDEPTNAME/.ibizmodel.index
   */
  public final static String FIELD_OPENDEPTNAME = "opendeptname";

  /**.
   * 开放平台类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.OpenAccessType} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/OPEN_TYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/OpenAccessType.ibizmodel.yaml
   */
  public final static String FIELD_OPENTYPE = "opentype";

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/minorpsders/DER1N_SYS_OPEN_DEPT_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 实际部门标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/REALID/.ibizmodel.index
   */
  public final static String FIELD_REALID = "realid";

  /**.
   * 系统部门标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/SYSDEPTID/.ibizmodel.index
   */
  public final static String FIELD_SYSDEPTID = "sysdeptid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「开放平台应用」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setAccessId(String val) {
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
    public OpenDeptDTO resetAccessId() {
        this._reset(FIELD_ACCESSID);
        return this;
    }

    /**
     * 设置「开放平台应用」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setAccessName(String val) {
        this._set(FIELD_ACCESSNAME, val);
        return this;
    }

    /**
     * 获取「开放平台应用」值
     *
    */
    @JsonIgnore
    public String getAccessName() {
        return (String) this._get(FIELD_ACCESSNAME);
    }

    /**
     * 判断 「开放平台应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessName() {
        return this._contains(FIELD_ACCESSNAME);
    }

    /**
     * 重置 「开放平台应用」
     *
    */
    @JsonIgnore
    public OpenDeptDTO resetAccessName() {
        this._reset(FIELD_ACCESSNAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setCreateDate(Timestamp val) {
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
    public OpenDeptDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setCreateMan(String val) {
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
    public OpenDeptDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「绑定状态」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setIsBinding(Integer val) {
        this._set(FIELD_ISBINDING, val);
        return this;
    }

    /**
     * 获取「绑定状态」值
     *
    */
    @JsonIgnore
    public Integer getIsBinding() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISBINDING),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「绑定状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsBinding() {
        return this._contains(FIELD_ISBINDING);
    }

    /**
     * 重置 「绑定状态」
     *
    */
    @JsonIgnore
    public OpenDeptDTO resetIsBinding() {
        this._reset(FIELD_ISBINDING);
        return this;
    }

    /**
     * 设置「部门编码」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setOpenDeptCode(String val) {
        this._set(FIELD_OPENDEPTCODE, val);
        return this;
    }

    /**
     * 获取「部门编码」值
     *
    */
    @JsonIgnore
    public String getOpenDeptCode() {
        return (String) this._get(FIELD_OPENDEPTCODE);
    }

    /**
     * 判断 「部门编码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenDeptCode() {
        return this._contains(FIELD_OPENDEPTCODE);
    }

    /**
     * 重置 「部门编码」
     *
    */
    @JsonIgnore
    public OpenDeptDTO resetOpenDeptCode() {
        this._reset(FIELD_OPENDEPTCODE);
        return this;
    }

    /**
     * 设置「部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setOpenDeptId(String val) {
        this._set(FIELD_OPENDEPTID, val);
        return this;
    }

    /**
     * 获取「部门标识」值
     *
    */
    @JsonIgnore
    public String getOpenDeptId() {
        return (String) this._get(FIELD_OPENDEPTID);
    }

    /**
     * 判断 「部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenDeptId() {
        return this._contains(FIELD_OPENDEPTID);
    }

    /**
     * 重置 「部门标识」
     *
    */
    @JsonIgnore
    public OpenDeptDTO resetOpenDeptId() {
        this._reset(FIELD_OPENDEPTID);
        return this;
    }

    /**
     * 设置「部门名称」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setOpenDeptName(String val) {
        this._set(FIELD_OPENDEPTNAME, val);
        return this;
    }

    /**
     * 获取「部门名称」值
     *
    */
    @JsonIgnore
    public String getOpenDeptName() {
        return (String) this._get(FIELD_OPENDEPTNAME);
    }

    /**
     * 判断 「部门名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenDeptName() {
        return this._contains(FIELD_OPENDEPTNAME);
    }

    /**
     * 重置 「部门名称」
     *
    */
    @JsonIgnore
    public OpenDeptDTO resetOpenDeptName() {
        this._reset(FIELD_OPENDEPTNAME);
        return this;
    }

    /**
     * 设置「开放平台类型」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setOpenType(String val) {
        this._set(FIELD_OPENTYPE, val);
        return this;
    }

    /**
     * 获取「开放平台类型」值
     *
    */
    @JsonIgnore
    public String getOpenType() {
        return (String) this._get(FIELD_OPENTYPE);
    }

    /**
     * 判断 「开放平台类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenType() {
        return this._contains(FIELD_OPENTYPE);
    }

    /**
     * 重置 「开放平台类型」
     *
    */
    @JsonIgnore
    public OpenDeptDTO resetOpenType() {
        this._reset(FIELD_OPENTYPE);
        return this;
    }

    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setOrgId(String val) {
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
    public OpenDeptDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「实际部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setRealId(String val) {
        this._set(FIELD_REALID, val);
        return this;
    }

    /**
     * 获取「实际部门标识」值
     *
    */
    @JsonIgnore
    public String getRealId() {
        return (String) this._get(FIELD_REALID);
    }

    /**
     * 判断 「实际部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRealId() {
        return this._contains(FIELD_REALID);
    }

    /**
     * 重置 「实际部门标识」
     *
    */
    @JsonIgnore
    public OpenDeptDTO resetRealId() {
        this._reset(FIELD_REALID);
        return this;
    }

    /**
     * 设置「系统部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setSysDeptId(String val) {
        this._set(FIELD_SYSDEPTID, val);
        return this;
    }

    /**
     * 获取「系统部门标识」值
     *
    */
    @JsonIgnore
    public String getSysDeptId() {
        return (String) this._get(FIELD_SYSDEPTID);
    }

    /**
     * 判断 「系统部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysDeptId() {
        return this._contains(FIELD_SYSDEPTID);
    }

    /**
     * 重置 「系统部门标识」
     *
    */
    @JsonIgnore
    public OpenDeptDTO resetSysDeptId() {
        this._reset(FIELD_SYSDEPTID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setUpdateDate(Timestamp val) {
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
    public OpenDeptDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public OpenDeptDTO setUpdateMan(String val) {
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
    public OpenDeptDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
