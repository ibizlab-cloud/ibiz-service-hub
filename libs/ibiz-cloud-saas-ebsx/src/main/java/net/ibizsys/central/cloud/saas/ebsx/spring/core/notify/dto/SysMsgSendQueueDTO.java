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
public class SysMsgSendQueueDTO extends EntityDTO {

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

  /**.
   * 消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/CONTENT/.ibizmodel.index
   */
  public final static String FIELD_CONTENT = "content";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/minorpsders/DER1N_SYS_MSG_SEND_QUEUE_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/minorpsders/DER1N_SYS_MSG_SEND_QUEUE_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 钉钉消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/DDCONTENT/.ibizmodel.index
   */
  public final static String FIELD_DDCONTENT = "ddcontent";

  /**.
   * 目标地址
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/DSTADDRESSES/.ibizmodel.index
   */
  public final static String FIELD_DSTADDRESSES = "dstaddresses";

  /**.
   * 文件附件2
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/FILEAT2/.ibizmodel.index
   */
  public final static String FIELD_FILEAT2 = "fileat2";

  /**.
   * 文件附件3
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/FILEAT3/.ibizmodel.index
   */
  public final static String FIELD_FILEAT3 = "fileat3";

  /**.
   * 文件附件4
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/FILEAT4/.ibizmodel.index
   */
  public final static String FIELD_FILEAT4 = "fileat4";

  /**.
   * IM消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/IMCONTENT/.ibizmodel.index
   */
  public final static String FIELD_IMCONTENT = "imcontent";

  /**.
   * 重要程度
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/IMPORTANCEFLAG/.ibizmodel.index
   */
  public final static String FIELD_IMPORTANCEFLAG = "importanceflag";

  /**.
   * 发送失败
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/ISERROR/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISERROR = "iserror";

  /**.
   * 是否发送
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/ISSEND/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISSEND = "issend";

  /**.
   * 消息发送队列标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/MSGSENDQUEUEID/.ibizmodel.index
   */
  public final static String FIELD_MSGSENDQUEUEID = "msgsendqueueid";

  /**.
   * 消息类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.MsgType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/MSGTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/MsgType.ibizmodel.yaml
   */
  public final static String FIELD_MSGTYPE = "msgtype";

  /**.
   * 计划发送时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/PLANSENDTIME/.ibizmodel.index
   */
  public final static String FIELD_PLANSENDTIME = "plansendtime";

  /**.
   * 短消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/SMSCONTENT/.ibizmodel.index
   */
  public final static String FIELD_SMSCONTENT = "smscontent";

  /**.
   * 消息标题
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/SUBJECT/.ibizmodel.index
   */
  public final static String FIELD_SUBJECT = "subject";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 全部地址
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/TOTALDSTADDRESSES/.ibizmodel.index
   */
  public final static String FIELD_TOTALDSTADDRESSES = "totaldstaddresses";

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

  /**.
   * 用户数据2
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/USERDATA2/.ibizmodel.index
   */
  public final static String FIELD_USERDATA2 = "userdata2";

  /**.
   * 用户数据4
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_MSG_SEND_QUEUE/psdefields/USERDATA4/.ibizmodel.index
   */
  public final static String FIELD_USERDATA4 = "userdata4";


    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setSrfdcid(String val) {
        this._set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this._get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this._contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setContent(String val) {
        this._set(FIELD_CONTENT, val);
        return this;
    }

    /**
     * 获取「消息内容」值
     *
    */
    @JsonIgnore
    public String getContent() {
        return (String) this._get(FIELD_CONTENT);
    }

    /**
     * 判断 「消息内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsContent() {
        return this._contains(FIELD_CONTENT);
    }

    /**
     * 重置 「消息内容」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetContent() {
        this._reset(FIELD_CONTENT);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setDCSystemId(String val) {
        this._set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this._get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this._contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setDCSystemName(String val) {
        this._set(FIELD_DCSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemName() {
        return (String) this._get(FIELD_DCSYSTEMNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemName() {
        return this._contains(FIELD_DCSYSTEMNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「钉钉消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setDDContent(String val) {
        this._set(FIELD_DDCONTENT, val);
        return this;
    }

    /**
     * 获取「钉钉消息内容」值
     *
    */
    @JsonIgnore
    public String getDDContent() {
        return (String) this._get(FIELD_DDCONTENT);
    }

    /**
     * 判断 「钉钉消息内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDDContent() {
        return this._contains(FIELD_DDCONTENT);
    }

    /**
     * 重置 「钉钉消息内容」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetDDContent() {
        this._reset(FIELD_DDCONTENT);
        return this;
    }

    /**
     * 设置「目标地址」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setDstAddresses(String val) {
        this._set(FIELD_DSTADDRESSES, val);
        return this;
    }

    /**
     * 获取「目标地址」值
     *
    */
    @JsonIgnore
    public String getDstAddresses() {
        return (String) this._get(FIELD_DSTADDRESSES);
    }

    /**
     * 判断 「目标地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDstAddresses() {
        return this._contains(FIELD_DSTADDRESSES);
    }

    /**
     * 重置 「目标地址」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetDstAddresses() {
        this._reset(FIELD_DSTADDRESSES);
        return this;
    }

    /**
     * 设置「文件附件2」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setFileAT2(String val) {
        this._set(FIELD_FILEAT2, val);
        return this;
    }

    /**
     * 获取「文件附件2」值
     *
    */
    @JsonIgnore
    public String getFileAT2() {
        return (String) this._get(FIELD_FILEAT2);
    }

    /**
     * 判断 「文件附件2」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFileAT2() {
        return this._contains(FIELD_FILEAT2);
    }

    /**
     * 重置 「文件附件2」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetFileAT2() {
        this._reset(FIELD_FILEAT2);
        return this;
    }

    /**
     * 设置「文件附件3」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setFileAT3(String val) {
        this._set(FIELD_FILEAT3, val);
        return this;
    }

    /**
     * 获取「文件附件3」值
     *
    */
    @JsonIgnore
    public String getFileAT3() {
        return (String) this._get(FIELD_FILEAT3);
    }

    /**
     * 判断 「文件附件3」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFileAT3() {
        return this._contains(FIELD_FILEAT3);
    }

    /**
     * 重置 「文件附件3」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetFileAT3() {
        this._reset(FIELD_FILEAT3);
        return this;
    }

    /**
     * 设置「文件附件4」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setFileAT4(String val) {
        this._set(FIELD_FILEAT4, val);
        return this;
    }

    /**
     * 获取「文件附件4」值
     *
    */
    @JsonIgnore
    public String getFileAT4() {
        return (String) this._get(FIELD_FILEAT4);
    }

    /**
     * 判断 「文件附件4」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFileAT4() {
        return this._contains(FIELD_FILEAT4);
    }

    /**
     * 重置 「文件附件4」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetFileAT4() {
        this._reset(FIELD_FILEAT4);
        return this;
    }

    /**
     * 设置「IM消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setIMContent(String val) {
        this._set(FIELD_IMCONTENT, val);
        return this;
    }

    /**
     * 获取「IM消息内容」值
     *
    */
    @JsonIgnore
    public String getIMContent() {
        return (String) this._get(FIELD_IMCONTENT);
    }

    /**
     * 判断 「IM消息内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIMContent() {
        return this._contains(FIELD_IMCONTENT);
    }

    /**
     * 重置 「IM消息内容」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetIMContent() {
        this._reset(FIELD_IMCONTENT);
        return this;
    }

    /**
     * 设置「重要程度」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setImportanceFlag(Integer val) {
        this._set(FIELD_IMPORTANCEFLAG, val);
        return this;
    }

    /**
     * 获取「重要程度」值
     *
    */
    @JsonIgnore
    public Integer getImportanceFlag() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_IMPORTANCEFLAG),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「重要程度」是否有值
     *
    */
    @JsonIgnore
    public boolean containsImportanceFlag() {
        return this._contains(FIELD_IMPORTANCEFLAG);
    }

    /**
     * 重置 「重要程度」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetImportanceFlag() {
        this._reset(FIELD_IMPORTANCEFLAG);
        return this;
    }

    /**
     * 设置「发送失败」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setIsError(Integer val) {
        this._set(FIELD_ISERROR, val);
        return this;
    }

    /**
     * 获取「发送失败」值
     *
    */
    @JsonIgnore
    public Integer getIsError() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISERROR),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「发送失败」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsError() {
        return this._contains(FIELD_ISERROR);
    }

    /**
     * 重置 「发送失败」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetIsError() {
        this._reset(FIELD_ISERROR);
        return this;
    }

    /**
     * 设置「是否发送」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setIsSend(Integer val) {
        this._set(FIELD_ISSEND, val);
        return this;
    }

    /**
     * 获取「是否发送」值
     *
    */
    @JsonIgnore
    public Integer getIsSend() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISSEND),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否发送」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsSend() {
        return this._contains(FIELD_ISSEND);
    }

    /**
     * 重置 「是否发送」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetIsSend() {
        this._reset(FIELD_ISSEND);
        return this;
    }

    /**
     * 设置「消息发送队列标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setMsgSendQueueId(String val) {
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
    public SysMsgSendQueueDTO resetMsgSendQueueId() {
        this._reset(FIELD_MSGSENDQUEUEID);
        return this;
    }

    /**
     * 设置「消息类型」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setMsgType(Integer val) {
        this._set(FIELD_MSGTYPE, val);
        return this;
    }

    /**
     * 获取「消息类型」值
     *
    */
    @JsonIgnore
    public Integer getMsgType() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_MSGTYPE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「消息类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgType() {
        return this._contains(FIELD_MSGTYPE);
    }

    /**
     * 重置 「消息类型」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetMsgType() {
        this._reset(FIELD_MSGTYPE);
        return this;
    }

    /**
     * 设置「计划发送时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setPlanSendTime(Timestamp val) {
        this._set(FIELD_PLANSENDTIME, val);
        return this;
    }

    /**
     * 获取「计划发送时间」值
     *
    */
    @JsonIgnore
    public Timestamp getPlanSendTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_PLANSENDTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「计划发送时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPlanSendTime() {
        return this._contains(FIELD_PLANSENDTIME);
    }

    /**
     * 重置 「计划发送时间」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetPlanSendTime() {
        this._reset(FIELD_PLANSENDTIME);
        return this;
    }

    /**
     * 设置「短消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setSMSContent(String val) {
        this._set(FIELD_SMSCONTENT, val);
        return this;
    }

    /**
     * 获取「短消息内容」值
     *
    */
    @JsonIgnore
    public String getSMSContent() {
        return (String) this._get(FIELD_SMSCONTENT);
    }

    /**
     * 判断 「短消息内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSMSContent() {
        return this._contains(FIELD_SMSCONTENT);
    }

    /**
     * 重置 「短消息内容」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetSMSContent() {
        this._reset(FIELD_SMSCONTENT);
        return this;
    }

    /**
     * 设置「消息标题」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setSubject(String val) {
        this._set(FIELD_SUBJECT, val);
        return this;
    }

    /**
     * 获取「消息标题」值
     *
    */
    @JsonIgnore
    public String getSubject() {
        return (String) this._get(FIELD_SUBJECT);
    }

    /**
     * 判断 「消息标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSubject() {
        return this._contains(FIELD_SUBJECT);
    }

    /**
     * 重置 「消息标题」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setSystemId(String val) {
        this._set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this._get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this._contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「全部地址」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setTotalDstAddresses(String val) {
        this._set(FIELD_TOTALDSTADDRESSES, val);
        return this;
    }

    /**
     * 获取「全部地址」值
     *
    */
    @JsonIgnore
    public String getTotalDstAddresses() {
        return (String) this._get(FIELD_TOTALDSTADDRESSES);
    }

    /**
     * 判断 「全部地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTotalDstAddresses() {
        return this._contains(FIELD_TOTALDSTADDRESSES);
    }

    /**
     * 重置 「全部地址」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetTotalDstAddresses() {
        this._reset(FIELD_TOTALDSTADDRESSES);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setUpdateDate(Timestamp val) {
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
    public SysMsgSendQueueDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setUpdateMan(String val) {
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
    public SysMsgSendQueueDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「用户数据2」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setUserData2(String val) {
        this._set(FIELD_USERDATA2, val);
        return this;
    }

    /**
     * 获取「用户数据2」值
     *
    */
    @JsonIgnore
    public String getUserData2() {
        return (String) this._get(FIELD_USERDATA2);
    }

    /**
     * 判断 「用户数据2」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserData2() {
        return this._contains(FIELD_USERDATA2);
    }

    /**
     * 重置 「用户数据2」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetUserData2() {
        this._reset(FIELD_USERDATA2);
        return this;
    }

    /**
     * 设置「用户数据4」
     *
     * @param val
    */
    @JsonIgnore
    public SysMsgSendQueueDTO setUserData4(String val) {
        this._set(FIELD_USERDATA4, val);
        return this;
    }

    /**
     * 获取「用户数据4」值
     *
    */
    @JsonIgnore
    public String getUserData4() {
        return (String) this._get(FIELD_USERDATA4);
    }

    /**
     * 判断 「用户数据4」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserData4() {
        return this._contains(FIELD_USERDATA4);
    }

    /**
     * 重置 「用户数据4」
     *
    */
    @JsonIgnore
    public SysMsgSendQueueDTO resetUserData4() {
        this._reset(FIELD_USERDATA4);
        return this;
    }


}
