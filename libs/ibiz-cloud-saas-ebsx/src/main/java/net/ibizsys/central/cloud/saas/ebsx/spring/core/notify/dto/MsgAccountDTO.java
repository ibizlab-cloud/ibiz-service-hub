package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 消息账户
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/.ibizmodel.index
 */
public class MsgAccountDTO extends EntityDTO {

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 钉钉账户
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/DDACCOUNTID/.ibizmodel.index
   */
  public final static String FIELD_DDACCOUNTID = "ddaccountid";

  /**.
   * 邮箱
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/EMAIL/.ibizmodel.index
   */
  public final static String FIELD_EMAIL = "email";

  /**.
   * 人员
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/EMPID/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/minorpsders/DER1N_MSG_ACCOUNT_SYS_EMP_EMPID/.ibizmodel.index
   */
  public final static String FIELD_EMPID = "empid";

  /**.
   * 人员
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/EMPNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/minorpsders/DER1N_MSG_ACCOUNT_SYS_EMP_EMPID/.ibizmodel.index
   */
  public final static String FIELD_EMPNAME = "empname";

  /**.
   * 消息账户标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/MSGACCOUNTID/.ibizmodel.index
   */
  public final static String FIELD_MSGACCOUNTID = "msgaccountid";

  /**.
   * 消息账户
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/MSGACCOUNTNAME/.ibizmodel.index
   */
  public final static String FIELD_MSGACCOUNTNAME = "msgaccountname";

  /**.
   * 手机号
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/PHONE/.ibizmodel.index
   */
  public final static String FIELD_PHONE = "phone";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 用户工号
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/USERCODE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/minorpsders/DER1N_MSG_ACCOUNT_SYS_EMP_EMPID/.ibizmodel.index
   */
  public final static String FIELD_USERCODE = "usercode";

  /**.
   * 微信账户
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdefields/WXACCOUNTID/.ibizmodel.index
   */
  public final static String FIELD_WXACCOUNTID = "wxaccountid";


    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setCreateDate(Timestamp val) {
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
    public MsgAccountDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setCreateMan(String val) {
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
    public MsgAccountDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「钉钉账户」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setDDAccountId(String val) {
        this._set(FIELD_DDACCOUNTID, val);
        return this;
    }

    /**
     * 获取「钉钉账户」值
     *
    */
    @JsonIgnore
    public String getDDAccountId() {
        return (String) this._get(FIELD_DDACCOUNTID);
    }

    /**
     * 判断 「钉钉账户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDDAccountId() {
        return this._contains(FIELD_DDACCOUNTID);
    }

    /**
     * 重置 「钉钉账户」
     *
    */
    @JsonIgnore
    public MsgAccountDTO resetDDAccountId() {
        this._reset(FIELD_DDACCOUNTID);
        return this;
    }

    /**
     * 设置「邮箱」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setEmail(String val) {
        this._set(FIELD_EMAIL, val);
        return this;
    }

    /**
     * 获取「邮箱」值
     *
    */
    @JsonIgnore
    public String getEmail() {
        return (String) this._get(FIELD_EMAIL);
    }

    /**
     * 判断 「邮箱」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEmail() {
        return this._contains(FIELD_EMAIL);
    }

    /**
     * 重置 「邮箱」
     *
    */
    @JsonIgnore
    public MsgAccountDTO resetEmail() {
        this._reset(FIELD_EMAIL);
        return this;
    }

    /**
     * 设置「人员」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setEmpId(String val) {
        this._set(FIELD_EMPID, val);
        return this;
    }

    /**
     * 获取「人员」值
     *
    */
    @JsonIgnore
    public String getEmpId() {
        return (String) this._get(FIELD_EMPID);
    }

    /**
     * 判断 「人员」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEmpId() {
        return this._contains(FIELD_EMPID);
    }

    /**
     * 重置 「人员」
     *
    */
    @JsonIgnore
    public MsgAccountDTO resetEmpId() {
        this._reset(FIELD_EMPID);
        return this;
    }

    /**
     * 设置「人员」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setEmpName(String val) {
        this._set(FIELD_EMPNAME, val);
        return this;
    }

    /**
     * 获取「人员」值
     *
    */
    @JsonIgnore
    public String getEmpName() {
        return (String) this._get(FIELD_EMPNAME);
    }

    /**
     * 判断 「人员」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEmpName() {
        return this._contains(FIELD_EMPNAME);
    }

    /**
     * 重置 「人员」
     *
    */
    @JsonIgnore
    public MsgAccountDTO resetEmpName() {
        this._reset(FIELD_EMPNAME);
        return this;
    }

    /**
     * 设置「消息账户标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setMsgAccountId(String val) {
        this._set(FIELD_MSGACCOUNTID, val);
        return this;
    }

    /**
     * 获取「消息账户标识」值
     *
    */
    @JsonIgnore
    public String getMsgAccountId() {
        return (String) this._get(FIELD_MSGACCOUNTID);
    }

    /**
     * 判断 「消息账户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgAccountId() {
        return this._contains(FIELD_MSGACCOUNTID);
    }

    /**
     * 重置 「消息账户标识」
     *
    */
    @JsonIgnore
    public MsgAccountDTO resetMsgAccountId() {
        this._reset(FIELD_MSGACCOUNTID);
        return this;
    }

    /**
     * 设置「消息账户」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setMsgAccountName(String val) {
        this._set(FIELD_MSGACCOUNTNAME, val);
        return this;
    }

    /**
     * 获取「消息账户」值
     *
    */
    @JsonIgnore
    public String getMsgAccountName() {
        return (String) this._get(FIELD_MSGACCOUNTNAME);
    }

    /**
     * 判断 「消息账户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgAccountName() {
        return this._contains(FIELD_MSGACCOUNTNAME);
    }

    /**
     * 重置 「消息账户」
     *
    */
    @JsonIgnore
    public MsgAccountDTO resetMsgAccountName() {
        this._reset(FIELD_MSGACCOUNTNAME);
        return this;
    }

    /**
     * 设置「手机号」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setPhone(String val) {
        this._set(FIELD_PHONE, val);
        return this;
    }

    /**
     * 获取「手机号」值
     *
    */
    @JsonIgnore
    public String getPhone() {
        return (String) this._get(FIELD_PHONE);
    }

    /**
     * 判断 「手机号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPhone() {
        return this._contains(FIELD_PHONE);
    }

    /**
     * 重置 「手机号」
     *
    */
    @JsonIgnore
    public MsgAccountDTO resetPhone() {
        this._reset(FIELD_PHONE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setUpdateDate(Timestamp val) {
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
    public MsgAccountDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setUpdateMan(String val) {
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
    public MsgAccountDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「用户工号」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setUserCode(String val) {
        this._set(FIELD_USERCODE, val);
        return this;
    }

    /**
     * 获取「用户工号」值
     *
    */
    @JsonIgnore
    public String getUserCode() {
        return (String) this._get(FIELD_USERCODE);
    }

    /**
     * 判断 「用户工号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserCode() {
        return this._contains(FIELD_USERCODE);
    }

    /**
     * 重置 「用户工号」
     *
    */
    @JsonIgnore
    public MsgAccountDTO resetUserCode() {
        this._reset(FIELD_USERCODE);
        return this;
    }

    /**
     * 设置「微信账户」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountDTO setWXAccountId(String val) {
        this._set(FIELD_WXACCOUNTID, val);
        return this;
    }

    /**
     * 获取「微信账户」值
     *
    */
    @JsonIgnore
    public String getWXAccountId() {
        return (String) this._get(FIELD_WXACCOUNTID);
    }

    /**
     * 判断 「微信账户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXAccountId() {
        return this._contains(FIELD_WXACCOUNTID);
    }

    /**
     * 重置 「微信账户」
     *
    */
    @JsonIgnore
    public MsgAccountDTO resetWXAccountId() {
        this._reset(FIELD_WXACCOUNTID);
        return this;
    }


}
