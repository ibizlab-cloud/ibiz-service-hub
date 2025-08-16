package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 消息队列（历史）
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/.ibizmodel.index
 */
public class MsgSendQueueHisSimpleDTO extends EntityDTO {

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 消息发送队列标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/MSGSENDQUEUEHISID/.ibizmodel.index
   */
  public final static String FIELD_MSGSENDQUEUEHISID = "msgsendqueuehisid";

  /**.
   * 消息名称
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/MSGSENDQUEUEHISNAME/.ibizmodel.index
   */
  public final static String FIELD_MSGSENDQUEUEHISNAME = "msgsendqueuehisname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisSimpleDTO setCreateDate(Timestamp val) {
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
    public MsgSendQueueHisSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisSimpleDTO setCreateMan(String val) {
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
    public MsgSendQueueHisSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「消息发送队列标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisSimpleDTO setMsgSendQueueHisId(String val) {
        this._set(FIELD_MSGSENDQUEUEHISID, val);
        return this;
    }

    /**
     * 获取「消息发送队列标识」值
     *
    */
    @JsonIgnore
    public String getMsgSendQueueHisId() {
        return (String) this._get(FIELD_MSGSENDQUEUEHISID);
    }

    /**
     * 判断 「消息发送队列标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgSendQueueHisId() {
        return this._contains(FIELD_MSGSENDQUEUEHISID);
    }

    /**
     * 重置 「消息发送队列标识」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisSimpleDTO resetMsgSendQueueHisId() {
        this._reset(FIELD_MSGSENDQUEUEHISID);
        return this;
    }

    /**
     * 设置「消息名称」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisSimpleDTO setMsgSendQueueHisName(String val) {
        this._set(FIELD_MSGSENDQUEUEHISNAME, val);
        return this;
    }

    /**
     * 获取「消息名称」值
     *
    */
    @JsonIgnore
    public String getMsgSendQueueHisName() {
        return (String) this._get(FIELD_MSGSENDQUEUEHISNAME);
    }

    /**
     * 判断 「消息名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgSendQueueHisName() {
        return this._contains(FIELD_MSGSENDQUEUEHISNAME);
    }

    /**
     * 重置 「消息名称」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisSimpleDTO resetMsgSendQueueHisName() {
        this._reset(FIELD_MSGSENDQUEUEHISNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisSimpleDTO setUpdateDate(Timestamp val) {
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
    public MsgSendQueueHisSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisSimpleDTO setUpdateMan(String val) {
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
    public MsgSendQueueHisSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
