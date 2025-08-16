package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统用户
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/.ibizmodel.index
 */
public class UserSimpleDTO extends EntityDTO {

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 用户姓名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/PERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 单位名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/ORGNAME/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";


    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserSimpleDTO setUserId(String val) {
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
    public UserSimpleDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「用户姓名」
     *
     * @param val
    */
    @JsonIgnore
    public UserSimpleDTO setPersonName(String val) {
        this._set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「用户姓名」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this._get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「用户姓名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this._contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「用户姓名」
     *
    */
    @JsonIgnore
    public UserSimpleDTO resetPersonName() {
        this._reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public UserSimpleDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位」
     *
    */
    @JsonIgnore
    public UserSimpleDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「单位名称」
     *
     * @param val
    */
    @JsonIgnore
    public UserSimpleDTO setOrgName(String val) {
        this._set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「单位名称」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this._get(FIELD_ORGNAME);
    }

    /**
     * 判断 「单位名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this._contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「单位名称」
     *
    */
    @JsonIgnore
    public UserSimpleDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }


}
