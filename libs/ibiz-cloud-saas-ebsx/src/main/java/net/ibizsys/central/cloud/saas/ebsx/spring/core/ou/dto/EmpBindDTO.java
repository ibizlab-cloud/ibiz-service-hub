package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 员工绑定
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/.ibizmodel.index
 */
public class EmpBindDTO extends EntityDTO {

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 姓名
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/PERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 钉钉用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/DDUNIONID/.ibizmodel.index
   */
  public final static String FIELD_DDUNIONID = "ddunionid";

  /**.
   * 钉钉用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/DDUSERID/.ibizmodel.index
   */
  public final static String FIELD_DDUSERID = "dduserid";

  /**.
   * UAA用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/UAAUSERID/.ibizmodel.index
   */
  public final static String FIELD_UAAUSERID = "uaauserid";

  /**.
   * 微信用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/WXWORKUNIONID/.ibizmodel.index
   */
  public final static String FIELD_WXWORKUNIONID = "wxworkunionid";

  /**.
   * 企业微信用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/WXWORKUSERID/.ibizmodel.index
   */
  public final static String FIELD_WXWORKUSERID = "wxworkuserid";


    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBindDTO setUserId(String val) {
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
    public EmpBindDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「姓名」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBindDTO setPersonName(String val) {
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
    public EmpBindDTO resetPersonName() {
        this._reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「钉钉用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBindDTO setDDUnionId(String val) {
        this._set(FIELD_DDUNIONID, val);
        return this;
    }

    /**
     * 获取「钉钉用户标识」值
     *
    */
    @JsonIgnore
    public String getDDUnionId() {
        return (String) this._get(FIELD_DDUNIONID);
    }

    /**
     * 判断 「钉钉用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDDUnionId() {
        return this._contains(FIELD_DDUNIONID);
    }

    /**
     * 重置 「钉钉用户标识」
     *
    */
    @JsonIgnore
    public EmpBindDTO resetDDUnionId() {
        this._reset(FIELD_DDUNIONID);
        return this;
    }

    /**
     * 设置「钉钉用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBindDTO setDDUserId(String val) {
        this._set(FIELD_DDUSERID, val);
        return this;
    }

    /**
     * 获取「钉钉用户标识」值
     *
    */
    @JsonIgnore
    public String getDDUserId() {
        return (String) this._get(FIELD_DDUSERID);
    }

    /**
     * 判断 「钉钉用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDDUserId() {
        return this._contains(FIELD_DDUSERID);
    }

    /**
     * 重置 「钉钉用户标识」
     *
    */
    @JsonIgnore
    public EmpBindDTO resetDDUserId() {
        this._reset(FIELD_DDUSERID);
        return this;
    }

    /**
     * 设置「UAA用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBindDTO setUAAUserId(String val) {
        this._set(FIELD_UAAUSERID, val);
        return this;
    }

    /**
     * 获取「UAA用户标识」值
     *
    */
    @JsonIgnore
    public String getUAAUserId() {
        return (String) this._get(FIELD_UAAUSERID);
    }

    /**
     * 判断 「UAA用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUAAUserId() {
        return this._contains(FIELD_UAAUSERID);
    }

    /**
     * 重置 「UAA用户标识」
     *
    */
    @JsonIgnore
    public EmpBindDTO resetUAAUserId() {
        this._reset(FIELD_UAAUSERID);
        return this;
    }

    /**
     * 设置「微信用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBindDTO setWXWorkUnionId(String val) {
        this._set(FIELD_WXWORKUNIONID, val);
        return this;
    }

    /**
     * 获取「微信用户标识」值
     *
    */
    @JsonIgnore
    public String getWXWorkUnionId() {
        return (String) this._get(FIELD_WXWORKUNIONID);
    }

    /**
     * 判断 「微信用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXWorkUnionId() {
        return this._contains(FIELD_WXWORKUNIONID);
    }

    /**
     * 重置 「微信用户标识」
     *
    */
    @JsonIgnore
    public EmpBindDTO resetWXWorkUnionId() {
        this._reset(FIELD_WXWORKUNIONID);
        return this;
    }

    /**
     * 设置「企业微信用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBindDTO setWXWorkUserId(String val) {
        this._set(FIELD_WXWORKUSERID, val);
        return this;
    }

    /**
     * 获取「企业微信用户标识」值
     *
    */
    @JsonIgnore
    public String getWXWorkUserId() {
        return (String) this._get(FIELD_WXWORKUSERID);
    }

    /**
     * 判断 「企业微信用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXWorkUserId() {
        return this._contains(FIELD_WXWORKUSERID);
    }

    /**
     * 重置 「企业微信用户标识」
     *
    */
    @JsonIgnore
    public EmpBindDTO resetWXWorkUserId() {
        this._reset(FIELD_WXWORKUSERID);
        return this;
    }


}
