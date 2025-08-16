package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 全局发送队列
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/.ibizmodel.index
 */
public class SysMsgSendQueueSimpleDTO extends EntityDTO {

  /**.
   * 消息发送队列标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/MSGSENDQUEUEID/.ibizmodel.index
   */
  public final static String FIELD_MSGSENDQUEUEID = "msgsendqueueid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「消息发送队列标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueSimpleDTO setMsgSendQueueId(String val) {
        this._set(FIELD_MSGSENDQUEUEID, val);
        return this;
    }

    /**
     * 获取「消息发送队列标识」值
     *
    */
    @JsonIgnore
    public String getMsgSendQueueId() {
        return (String) this._get(FIELD_MSGSENDQUEUEID);
    }

    /**
     * 判断 「消息发送队列标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgSendQueueId() {
        return this._contains(FIELD_MSGSENDQUEUEID);
    }

    /**
     * 重置 「消息发送队列标识」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueSimpleDTO resetMsgSendQueueId() {
        this._reset(FIELD_MSGSENDQUEUEID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueSimpleDTO setUpdateDate(Timestamp val) {
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
    public SysMsgSendQueueSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueSimpleDTO setUpdateMan(String val) {
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
    public SysMsgSendQueueSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
