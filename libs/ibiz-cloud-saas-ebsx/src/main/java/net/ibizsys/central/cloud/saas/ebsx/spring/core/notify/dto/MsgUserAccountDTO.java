package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 绑定消息账号
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_USER_ACCOUNT/.ibizmodel.index
 */
public class MsgUserAccountDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_USER_ACCOUNT/psdefields/AUTHID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_USER_ACCOUNT/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 认证类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.OpenAccessType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_USER_ACCOUNT/psdefields/IDENTITY_TYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/OpenAccessType.ibizmodel.yaml
   */
  public final static String FIELD_IDENTITYTYPE = "identitytype";

  /**.
   * 认证标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_USER_ACCOUNT/psdefields/IDENTIFIER/.ibizmodel.index
   */
  public final static String FIELD_IDENTIFIER = "identifier";

  /**.
   * 凭据
   * 钉钉账户---IBZUser：保存组织标识(corpid)到当前字段中。
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_USER_ACCOUNT/psdefields/CREDENTIAL/.ibizmodel.index
   */
  public final static String FIELD_CREDENTIAL = "credential";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgUserAccountDTO setId(String val) {
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
    public MsgUserAccountDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgUserAccountDTO setUserId(String val) {
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
    public MsgUserAccountDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「认证类型」
     *
     * @param val
    */
    @JsonIgnore
    public MsgUserAccountDTO setIdentityType(String val) {
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
    public MsgUserAccountDTO resetIdentityType() {
        this._reset(FIELD_IDENTITYTYPE);
        return this;
    }

    /**
     * 设置「认证标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgUserAccountDTO setIdentifier(String val) {
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
    public MsgUserAccountDTO resetIdentifier() {
        this._reset(FIELD_IDENTIFIER);
        return this;
    }

    /**
     * 设置「凭据」
     *
     * @param val
    */
    @JsonIgnore
    public MsgUserAccountDTO setCredential(String val) {
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
    public MsgUserAccountDTO resetCredential() {
        this._reset(FIELD_CREDENTIAL);
        return this;
    }


}
