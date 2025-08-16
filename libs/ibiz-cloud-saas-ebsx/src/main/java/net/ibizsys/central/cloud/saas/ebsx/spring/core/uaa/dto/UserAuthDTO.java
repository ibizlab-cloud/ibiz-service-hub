package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 账号绑定
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/.ibizmodel.index
 */
public class UserAuthDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdefields/AUTHID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 认证类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.IdentityType} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdefields/IDENTITY_TYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/IdentityType.ibizmodel.yaml
   */
  public final static String FIELD_IDENTITYTYPE = "identitytype";

  /**.
   * 认证标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdefields/IDENTIFIER/.ibizmodel.index
   */
  public final static String FIELD_IDENTIFIER = "identifier";

  /**.
   * 凭据
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdefields/CREDENTIAL/.ibizmodel.index
   */
  public final static String FIELD_CREDENTIAL = "credential";

  /**.
   * 员工标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdefields/EMPID/.ibizmodel.index
   */
  public final static String FIELD_EMPID = "empid";

  /**.
   * 员工姓名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdefields/EMPNAME/.ibizmodel.index
   */
  public final static String FIELD_EMPNAME = "empname";

  /**.
   * 开放用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdefields/OPENUSERID/.ibizmodel.index
   */
  public final static String FIELD_OPENUSERID = "openuserid";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 用户名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdefields/USERNAME/.ibizmodel.index
   */
  public final static String FIELD_USERNAME = "username";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserAuthDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public UserAuthDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「认证类型」
     *
     * @param val
    */
    @JsonIgnore
    public UserAuthDTO setIdentityType(String val) {
        this._set(FIELD_IDENTITYTYPE, val);
        return this;
    }

    /**
     * 获取「认证类型」值
     *
    */
    @JsonIgnore
    public String getIdentityType() {
        return (String) this._get(FIELD_IDENTITYTYPE);
    }

    /**
     * 判断 「认证类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIdentityType() {
        return this._contains(FIELD_IDENTITYTYPE);
    }

    /**
     * 重置 「认证类型」
     *
    */
    @JsonIgnore
    public UserAuthDTO resetIdentityType() {
        this._reset(FIELD_IDENTITYTYPE);
        return this;
    }

    /**
     * 设置「认证标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserAuthDTO setIdentifier(String val) {
        this._set(FIELD_IDENTIFIER, val);
        return this;
    }

    /**
     * 获取「认证标识」值
     *
    */
    @JsonIgnore
    public String getIdentifier() {
        return (String) this._get(FIELD_IDENTIFIER);
    }

    /**
     * 判断 「认证标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIdentifier() {
        return this._contains(FIELD_IDENTIFIER);
    }

    /**
     * 重置 「认证标识」
     *
    */
    @JsonIgnore
    public UserAuthDTO resetIdentifier() {
        this._reset(FIELD_IDENTIFIER);
        return this;
    }

    /**
     * 设置「凭据」
     *
     * @param val
    */
    @JsonIgnore
    public UserAuthDTO setCredential(String val) {
        this._set(FIELD_CREDENTIAL, val);
        return this;
    }

    /**
     * 获取「凭据」值
     *
    */
    @JsonIgnore
    public String getCredential() {
        return (String) this._get(FIELD_CREDENTIAL);
    }

    /**
     * 判断 「凭据」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCredential() {
        return this._contains(FIELD_CREDENTIAL);
    }

    /**
     * 重置 「凭据」
     *
    */
    @JsonIgnore
    public UserAuthDTO resetCredential() {
        this._reset(FIELD_CREDENTIAL);
        return this;
    }

    /**
     * 设置「员工标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserAuthDTO setEmpId(String val) {
        this._set(FIELD_EMPID, val);
        return this;
    }

    /**
     * 获取「员工标识」值
     *
    */
    @JsonIgnore
    public String getEmpId() {
        return (String) this._get(FIELD_EMPID);
    }

    /**
     * 判断 「员工标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEmpId() {
        return this._contains(FIELD_EMPID);
    }

    /**
     * 重置 「员工标识」
     *
    */
    @JsonIgnore
    public UserAuthDTO resetEmpId() {
        this._reset(FIELD_EMPID);
        return this;
    }

    /**
     * 设置「员工姓名」
     *
     * @param val
    */
    @JsonIgnore
    public UserAuthDTO setEmpName(String val) {
        this._set(FIELD_EMPNAME, val);
        return this;
    }

    /**
     * 获取「员工姓名」值
     *
    */
    @JsonIgnore
    public String getEmpName() {
        return (String) this._get(FIELD_EMPNAME);
    }

    /**
     * 判断 「员工姓名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEmpName() {
        return this._contains(FIELD_EMPNAME);
    }

    /**
     * 重置 「员工姓名」
     *
    */
    @JsonIgnore
    public UserAuthDTO resetEmpName() {
        this._reset(FIELD_EMPNAME);
        return this;
    }

    /**
     * 设置「开放用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserAuthDTO setOpenUserId(String val) {
        this._set(FIELD_OPENUSERID, val);
        return this;
    }

    /**
     * 获取「开放用户标识」值
     *
    */
    @JsonIgnore
    public String getOpenUserId() {
        return (String) this._get(FIELD_OPENUSERID);
    }

    /**
     * 判断 「开放用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenUserId() {
        return this._contains(FIELD_OPENUSERID);
    }

    /**
     * 重置 「开放用户标识」
     *
    */
    @JsonIgnore
    public UserAuthDTO resetOpenUserId() {
        this._reset(FIELD_OPENUSERID);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserAuthDTO setUserId(String val) {
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
    public UserAuthDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「用户名称」
     *
     * @param val
    */
    @JsonIgnore
    public UserAuthDTO setUserName(String val) {
        this._set(FIELD_USERNAME, val);
        return this;
    }

    /**
     * 获取「用户名称」值
     *
    */
    @JsonIgnore
    public String getUserName() {
        return (String) this._get(FIELD_USERNAME);
    }

    /**
     * 判断 「用户名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USERNAME);
    }

    /**
     * 重置 「用户名称」
     *
    */
    @JsonIgnore
    public UserAuthDTO resetUserName() {
        this._reset(FIELD_USERNAME);
        return this;
    }


}
