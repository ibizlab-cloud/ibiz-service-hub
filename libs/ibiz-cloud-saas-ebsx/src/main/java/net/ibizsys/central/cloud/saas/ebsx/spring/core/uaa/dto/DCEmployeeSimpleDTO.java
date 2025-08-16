package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 机构用户
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/.ibizmodel.index
 */
public class DCEmployeeSimpleDTO extends EntityDTO {

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 姓名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/PERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/minorpsders/DER1N_SYS_DC_EMP_SYS_DC_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/ORGNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/minorpsders/DER1N_SYS_DC_EMP_SYS_DC_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";


    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO setUserId(String val) {
        this._set(FIELD_USERID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getUserId() {
        return (String) this._get(FIELD_USERID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USERID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「姓名」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO setPersonName(String val) {
        this._set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「姓名」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this._get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「姓名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this._contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「姓名」
     *
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO resetPersonName() {
        this._reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「创建时间」值
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
     * 判断 「创建时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「最后修改时间」值
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
     * 判断 「最后修改时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「最后修改时间」
     *
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO setOrgId(String val) {
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
    public DCEmployeeSimpleDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO setOrgName(String val) {
        this._set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this._get(FIELD_ORGNAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this._contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public DCEmployeeSimpleDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }


}
