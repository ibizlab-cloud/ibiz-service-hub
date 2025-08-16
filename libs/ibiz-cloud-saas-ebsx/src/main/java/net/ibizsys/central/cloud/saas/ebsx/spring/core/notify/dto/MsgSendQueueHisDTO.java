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
public class MsgSendQueueHisDTO extends EntityDTO {

  /**.
   * URL
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/URL/.ibizmodel.index
   */
  public final static String FIELD_URL = "url";

  /**.
   * 移动端URL
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/MOBILEURL/.ibizmodel.index
   */
  public final static String FIELD_MOBILEURL = "mobileurl";

  /**.
   * 消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/CONTENT/.ibizmodel.index
   */
  public final static String FIELD_CONTENT = "content";

  /**.
   * 内容类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.CodeList42} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/CONTENTTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/CodeList42.ibizmodel.yaml
   */
  public final static String FIELD_CONTENTTYPE = "contenttype";

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
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/minorpsders/DER1N_MSG_SEND_QUEUE_HIS_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/minorpsders/DER1N_MSG_SEND_QUEUE_HIS_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 钉钉消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/DDCONTENT/.ibizmodel.index
   */
  public final static String FIELD_DDCONTENT = "ddcontent";

  /**.
   * 目标地址
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/DSTADDRESSES/.ibizmodel.index
   */
  public final static String FIELD_DSTADDRESSES = "dstaddresses";

  /**.
   * 目标用户
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/DSTUSERS/.ibizmodel.index
   */
  public final static String FIELD_DSTUSERS = "dstusers";

  /**.
   * 错误信息
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/ERRORINFO/.ibizmodel.index
   */
  public final static String FIELD_ERRORINFO = "errorinfo";

  /**.
   * 文件附件
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/FILEAT/.ibizmodel.index
   */
  public final static String FIELD_FILEAT = "fileat";

  /**.
   * 文件附件2
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/FILEAT2/.ibizmodel.index
   */
  public final static String FIELD_FILEAT2 = "fileat2";

  /**.
   * 文件附件3
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/FILEAT3/.ibizmodel.index
   */
  public final static String FIELD_FILEAT3 = "fileat3";

  /**.
   * 文件附件4
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/FILEAT4/.ibizmodel.index
   */
  public final static String FIELD_FILEAT4 = "fileat4";

  /**.
   * IM消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/IMCONTENT/.ibizmodel.index
   */
  public final static String FIELD_IMCONTENT = "imcontent";

  /**.
   * 重要程度
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/IMPORTANCEFLAG/.ibizmodel.index
   */
  public final static String FIELD_IMPORTANCEFLAG = "importanceflag";

  /**.
   * 发送失败
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/ISERROR/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISERROR = "iserror";

  /**.
   * 是否发送
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/ISSEND/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISSEND = "issend";

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
   * 消息类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.MsgType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/MSGTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/MsgType.ibizmodel.yaml
   */
  public final static String FIELD_MSGTYPE = "msgtype";

  /**.
   * 计划发送时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/PLANSENDTIME/.ibizmodel.index
   */
  public final static String FIELD_PLANSENDTIME = "plansendtime";

  /**.
   * 处理时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/PROCESSTIME/.ibizmodel.index
   */
  public final static String FIELD_PROCESSTIME = "processtime";

  /**.
   * 短消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/SMSCONTENT/.ibizmodel.index
   */
  public final static String FIELD_SMSCONTENT = "smscontent";

  /**.
   * 发送者
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/SENDTAG/.ibizmodel.index
   */
  public final static String FIELD_SENDTAG = "sendtag";

  /**.
   * 消息标题
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/SUBJECT/.ibizmodel.index
   */
  public final static String FIELD_SUBJECT = "subject";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 消息模板标记
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/TEMPLATEID/.ibizmodel.index
   */
  public final static String FIELD_TEMPLATEID = "templateid";

  /**.
   * 全部地址
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/TOTALDSTADDRESSES/.ibizmodel.index
   */
  public final static String FIELD_TOTALDSTADDRESSES = "totaldstaddresses";

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

  /**.
   * 用户数据
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/USERDATA/.ibizmodel.index
   */
  public final static String FIELD_USERDATA = "userdata";

  /**.
   * 用户数据2
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/USERDATA2/.ibizmodel.index
   */
  public final static String FIELD_USERDATA2 = "userdata2";

  /**.
   * 用户数据3
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/USERDATA3/.ibizmodel.index
   */
  public final static String FIELD_USERDATA3 = "userdata3";

  /**.
   * 用户数据4
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/USERDATA4/.ibizmodel.index
   */
  public final static String FIELD_USERDATA4 = "userdata4";

  /**.
   * 微信消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE_HIS/psdefields/WXCONTENT/.ibizmodel.index
   */
  public final static String FIELD_WXCONTENT = "wxcontent";


    /**
     * 设置「URL」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setUrl(String val) {
        this._set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「URL」值
     *
    */
    @JsonIgnore
    public String getUrl() {
        return (String) this._get(FIELD_URL);
    }

    /**
     * 判断 「URL」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUrl() {
        return this._contains(FIELD_URL);
    }

    /**
     * 重置 「URL」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetUrl() {
        this._reset(FIELD_URL);
        return this;
    }

    /**
     * 设置「移动端URL」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setMobileUrl(String val) {
        this._set(FIELD_MOBILEURL, val);
        return this;
    }

    /**
     * 获取「移动端URL」值
     *
    */
    @JsonIgnore
    public String getMobileUrl() {
        return (String) this._get(FIELD_MOBILEURL);
    }

    /**
     * 判断 「移动端URL」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMobileUrl() {
        return this._contains(FIELD_MOBILEURL);
    }

    /**
     * 重置 「移动端URL」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetMobileUrl() {
        this._reset(FIELD_MOBILEURL);
        return this;
    }

    /**
     * 设置「消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setContent(String val) {
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
    public MsgSendQueueHisDTO resetContent() {
        this._reset(FIELD_CONTENT);
        return this;
    }

    /**
     * 设置「内容类型」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setContentType(String val) {
        this._set(FIELD_CONTENTTYPE, val);
        return this;
    }

    /**
     * 获取「内容类型」值
     *
    */
    @JsonIgnore
    public String getContentType() {
        return (String) this._get(FIELD_CONTENTTYPE);
    }

    /**
     * 判断 「内容类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsContentType() {
        return this._contains(FIELD_CONTENTTYPE);
    }

    /**
     * 重置 「内容类型」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetContentType() {
        this._reset(FIELD_CONTENTTYPE);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setCreateDate(Timestamp val) {
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
    public MsgSendQueueHisDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setCreateMan(String val) {
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
    public MsgSendQueueHisDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setDCSystemId(String val) {
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
    public MsgSendQueueHisDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setDCSystemName(String val) {
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
    public MsgSendQueueHisDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「钉钉消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setDDContent(String val) {
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
    public MsgSendQueueHisDTO resetDDContent() {
        this._reset(FIELD_DDCONTENT);
        return this;
    }

    /**
     * 设置「目标地址」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setDstAddresses(String val) {
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
    public MsgSendQueueHisDTO resetDstAddresses() {
        this._reset(FIELD_DSTADDRESSES);
        return this;
    }

    /**
     * 设置「目标用户」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setDstUsers(String val) {
        this._set(FIELD_DSTUSERS, val);
        return this;
    }

    /**
     * 获取「目标用户」值
     *
    */
    @JsonIgnore
    public String getDstUsers() {
        return (String) this._get(FIELD_DSTUSERS);
    }

    /**
     * 判断 「目标用户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDstUsers() {
        return this._contains(FIELD_DSTUSERS);
    }

    /**
     * 重置 「目标用户」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetDstUsers() {
        this._reset(FIELD_DSTUSERS);
        return this;
    }

    /**
     * 设置「错误信息」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setErrorInfo(String val) {
        this._set(FIELD_ERRORINFO, val);
        return this;
    }

    /**
     * 获取「错误信息」值
     *
    */
    @JsonIgnore
    public String getErrorInfo() {
        return (String) this._get(FIELD_ERRORINFO);
    }

    /**
     * 判断 「错误信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsErrorInfo() {
        return this._contains(FIELD_ERRORINFO);
    }

    /**
     * 重置 「错误信息」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetErrorInfo() {
        this._reset(FIELD_ERRORINFO);
        return this;
    }

    /**
     * 设置「文件附件」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setFileAT(String val) {
        this._set(FIELD_FILEAT, val);
        return this;
    }

    /**
     * 获取「文件附件」值
     *
    */
    @JsonIgnore
    public String getFileAT() {
        return (String) this._get(FIELD_FILEAT);
    }

    /**
     * 判断 「文件附件」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFileAT() {
        return this._contains(FIELD_FILEAT);
    }

    /**
     * 重置 「文件附件」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetFileAT() {
        this._reset(FIELD_FILEAT);
        return this;
    }

    /**
     * 设置「文件附件2」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setFileAT2(String val) {
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
    public MsgSendQueueHisDTO resetFileAT2() {
        this._reset(FIELD_FILEAT2);
        return this;
    }

    /**
     * 设置「文件附件3」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setFileAT3(String val) {
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
    public MsgSendQueueHisDTO resetFileAT3() {
        this._reset(FIELD_FILEAT3);
        return this;
    }

    /**
     * 设置「文件附件4」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setFileAT4(String val) {
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
    public MsgSendQueueHisDTO resetFileAT4() {
        this._reset(FIELD_FILEAT4);
        return this;
    }

    /**
     * 设置「IM消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setIMContent(String val) {
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
    public MsgSendQueueHisDTO resetIMContent() {
        this._reset(FIELD_IMCONTENT);
        return this;
    }

    /**
     * 设置「重要程度」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setImportanceFlag(Integer val) {
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
    public MsgSendQueueHisDTO resetImportanceFlag() {
        this._reset(FIELD_IMPORTANCEFLAG);
        return this;
    }

    /**
     * 设置「发送失败」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setIsError(Integer val) {
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
    public MsgSendQueueHisDTO resetIsError() {
        this._reset(FIELD_ISERROR);
        return this;
    }

    /**
     * 设置「是否发送」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setIsSend(Integer val) {
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
    public MsgSendQueueHisDTO resetIsSend() {
        this._reset(FIELD_ISSEND);
        return this;
    }

    /**
     * 设置「消息发送队列标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setMsgSendQueueHisId(String val) {
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
    public MsgSendQueueHisDTO resetMsgSendQueueHisId() {
        this._reset(FIELD_MSGSENDQUEUEHISID);
        return this;
    }

    /**
     * 设置「消息名称」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setMsgSendQueueHisName(String val) {
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
    public MsgSendQueueHisDTO resetMsgSendQueueHisName() {
        this._reset(FIELD_MSGSENDQUEUEHISNAME);
        return this;
    }

    /**
     * 设置「消息类型」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setMsgType(Integer val) {
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
    public MsgSendQueueHisDTO resetMsgType() {
        this._reset(FIELD_MSGTYPE);
        return this;
    }

    /**
     * 设置「计划发送时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setPlanSendTime(Timestamp val) {
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
    public MsgSendQueueHisDTO resetPlanSendTime() {
        this._reset(FIELD_PLANSENDTIME);
        return this;
    }

    /**
     * 设置「处理时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setProcessTime(Timestamp val) {
        this._set(FIELD_PROCESSTIME, val);
        return this;
    }

    /**
     * 获取「处理时间」值
     *
    */
    @JsonIgnore
    public Timestamp getProcessTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_PROCESSTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「处理时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessTime() {
        return this._contains(FIELD_PROCESSTIME);
    }

    /**
     * 重置 「处理时间」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetProcessTime() {
        this._reset(FIELD_PROCESSTIME);
        return this;
    }

    /**
     * 设置「短消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setSMSContent(String val) {
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
    public MsgSendQueueHisDTO resetSMSContent() {
        this._reset(FIELD_SMSCONTENT);
        return this;
    }

    /**
     * 设置「发送者」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setSendTag(String val) {
        this._set(FIELD_SENDTAG, val);
        return this;
    }

    /**
     * 获取「发送者」值
     *
    */
    @JsonIgnore
    public String getSendTag() {
        return (String) this._get(FIELD_SENDTAG);
    }

    /**
     * 判断 「发送者」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSendTag() {
        return this._contains(FIELD_SENDTAG);
    }

    /**
     * 重置 「发送者」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetSendTag() {
        this._reset(FIELD_SENDTAG);
        return this;
    }

    /**
     * 设置「消息标题」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setSubject(String val) {
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
    public MsgSendQueueHisDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setSystemId(String val) {
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
    public MsgSendQueueHisDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「消息模板标记」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setTemplateId(String val) {
        this._set(FIELD_TEMPLATEID, val);
        return this;
    }

    /**
     * 获取「消息模板标记」值
     *
    */
    @JsonIgnore
    public String getTemplateId() {
        return (String) this._get(FIELD_TEMPLATEID);
    }

    /**
     * 判断 「消息模板标记」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateId() {
        return this._contains(FIELD_TEMPLATEID);
    }

    /**
     * 重置 「消息模板标记」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetTemplateId() {
        this._reset(FIELD_TEMPLATEID);
        return this;
    }

    /**
     * 设置「全部地址」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setTotalDstAddresses(String val) {
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
    public MsgSendQueueHisDTO resetTotalDstAddresses() {
        this._reset(FIELD_TOTALDSTADDRESSES);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setUpdateDate(Timestamp val) {
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
    public MsgSendQueueHisDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setUpdateMan(String val) {
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
    public MsgSendQueueHisDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「用户数据」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setUserData(String val) {
        this._set(FIELD_USERDATA, val);
        return this;
    }

    /**
     * 获取「用户数据」值
     *
    */
    @JsonIgnore
    public String getUserData() {
        return (String) this._get(FIELD_USERDATA);
    }

    /**
     * 判断 「用户数据」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserData() {
        return this._contains(FIELD_USERDATA);
    }

    /**
     * 重置 「用户数据」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetUserData() {
        this._reset(FIELD_USERDATA);
        return this;
    }

    /**
     * 设置「用户数据2」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setUserData2(String val) {
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
    public MsgSendQueueHisDTO resetUserData2() {
        this._reset(FIELD_USERDATA2);
        return this;
    }

    /**
     * 设置「用户数据3」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setUserData3(String val) {
        this._set(FIELD_USERDATA3, val);
        return this;
    }

    /**
     * 获取「用户数据3」值
     *
    */
    @JsonIgnore
    public String getUserData3() {
        return (String) this._get(FIELD_USERDATA3);
    }

    /**
     * 判断 「用户数据3」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserData3() {
        return this._contains(FIELD_USERDATA3);
    }

    /**
     * 重置 「用户数据3」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetUserData3() {
        this._reset(FIELD_USERDATA3);
        return this;
    }

    /**
     * 设置「用户数据4」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setUserData4(String val) {
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
    public MsgSendQueueHisDTO resetUserData4() {
        this._reset(FIELD_USERDATA4);
        return this;
    }

    /**
     * 设置「微信消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public MsgSendQueueHisDTO setWXContent(String val) {
        this._set(FIELD_WXCONTENT, val);
        return this;
    }

    /**
     * 获取「微信消息内容」值
     *
    */
    @JsonIgnore
    public String getWXContent() {
        return (String) this._get(FIELD_WXCONTENT);
    }

    /**
     * 判断 「微信消息内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXContent() {
        return this._contains(FIELD_WXCONTENT);
    }

    /**
     * 重置 「微信消息内容」
     *
    */
    @JsonIgnore
    public MsgSendQueueHisDTO resetWXContent() {
        this._reset(FIELD_WXCONTENT);
        return this;
    }


}
