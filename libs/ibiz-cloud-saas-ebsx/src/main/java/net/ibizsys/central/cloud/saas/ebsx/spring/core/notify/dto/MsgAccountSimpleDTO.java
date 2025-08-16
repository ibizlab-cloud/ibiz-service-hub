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
public class MsgAccountSimpleDTO extends EntityDTO {

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


    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountSimpleDTO setCreateDate(Timestamp val) {
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
    public MsgAccountSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountSimpleDTO setCreateMan(String val) {
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
    public MsgAccountSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「消息账户标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountSimpleDTO setMsgAccountId(String val) {
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
    public MsgAccountSimpleDTO resetMsgAccountId() {
        this._reset(FIELD_MSGACCOUNTID);
        return this;
    }

    /**
     * 设置「消息账户」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountSimpleDTO setMsgAccountName(String val) {
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
    public MsgAccountSimpleDTO resetMsgAccountName() {
        this._reset(FIELD_MSGACCOUNTNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountSimpleDTO setUpdateDate(Timestamp val) {
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
    public MsgAccountSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public MsgAccountSimpleDTO setUpdateMan(String val) {
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
    public MsgAccountSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
