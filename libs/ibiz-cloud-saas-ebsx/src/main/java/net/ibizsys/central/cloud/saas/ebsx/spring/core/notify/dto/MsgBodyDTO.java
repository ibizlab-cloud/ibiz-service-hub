package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 消息
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/.ibizmodel.index
 */
public class MsgBodyDTO extends EntityDTO {

  /**.
   * 消息内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/CONTENT/.ibizmodel.index
   */
  public final static String FIELD_CONTENT = "content";

  /**.
   * 错误信息
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/ERRORINFO/.ibizmodel.index
   */
  public final static String FIELD_ERRORINFO = "errorinfo";

  /**.
   * 是否出错
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/ISERROR/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISERROR = "iserror";

  /**.
   * 是否发送
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/ISSEND/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISSEND = "issend";

  /**.
   * 消息标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/MSGID/.ibizmodel.index
   */
  public final static String FIELD_MSGID = "msgid";

  /**.
   * 消息链接
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/MSGLINK/.ibizmodel.index
   */
  public final static String FIELD_MSGLINK = "msglink";

  /**.
   * 消息链接(PC)
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/MSGLINK_PC/.ibizmodel.index
   */
  public final static String FIELD_MSGLINKPC = "msglinkpc";

  /**.
   * 消息名称
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/MSGNAME/.ibizmodel.index
   */
  public final static String FIELD_MSGNAME = "msgname";

  /**.
   * 消息类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.MsgType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/MSGTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/MsgType.ibizmodel.yaml
   */
  public final static String FIELD_MSGTYPE = "msgtype";

  /**.
   * 消息标题
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/SUBJECT/.ibizmodel.index
   */
  public final static String FIELD_SUBJECT = "subject";

  /**.
   * 消息模板标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/TEMPLATEID/.ibizmodel.index
   */
  public final static String FIELD_TEMPLATEID = "templateid";

  /**.
   * 消息模板参数
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/TEMPLPARAMS/.ibizmodel.index
   */
  public final static String FIELD_TEMPLATEPARAMS = "templateparams";

  /**.
   * 目标用户
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/TOUSERS/.ibizmodel.index
   */
  public final static String FIELD_TOUSERS = "tousers";

  /**.
   * 用户数据
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/USERDATA/.ibizmodel.index
   */
  public final static String FIELD_USERDATA = "userdata";

  /**.
   * 用户数据2
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdefields/USERDATA2/.ibizmodel.index
   */
  public final static String FIELD_USERDATA2 = "userdata2";


    /**
     * 设置「消息内容」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setContent(String val) {
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
    public MsgBodyDTO resetContent() {
        this._reset(FIELD_CONTENT);
        return this;
    }

    /**
     * 设置「错误信息」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setErrorInfo(String val) {
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
    public MsgBodyDTO resetErrorInfo() {
        this._reset(FIELD_ERRORINFO);
        return this;
    }

    /**
     * 设置「是否出错」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setIsError(Integer val) {
        this._set(FIELD_ISERROR, val);
        return this;
    }

    /**
     * 获取「是否出错」值
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
     * 判断 「是否出错」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsError() {
        return this._contains(FIELD_ISERROR);
    }

    /**
     * 重置 「是否出错」
     *
    */
    @JsonIgnore
    public MsgBodyDTO resetIsError() {
        this._reset(FIELD_ISERROR);
        return this;
    }

    /**
     * 设置「是否发送」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setIsSend(Integer val) {
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
    public MsgBodyDTO resetIsSend() {
        this._reset(FIELD_ISSEND);
        return this;
    }

    /**
     * 设置「消息标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setMsgId(String val) {
        this._set(FIELD_MSGID, val);
        return this;
    }

    /**
     * 获取「消息标识」值
     *
    */
    @JsonIgnore
    public String getMsgId() {
        return (String) this._get(FIELD_MSGID);
    }

    /**
     * 判断 「消息标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgId() {
        return this._contains(FIELD_MSGID);
    }

    /**
     * 重置 「消息标识」
     *
    */
    @JsonIgnore
    public MsgBodyDTO resetMsgId() {
        this._reset(FIELD_MSGID);
        return this;
    }

    /**
     * 设置「消息链接」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setMsgLink(String val) {
        this._set(FIELD_MSGLINK, val);
        return this;
    }

    /**
     * 获取「消息链接」值
     *
    */
    @JsonIgnore
    public String getMsgLink() {
        return (String) this._get(FIELD_MSGLINK);
    }

    /**
     * 判断 「消息链接」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgLink() {
        return this._contains(FIELD_MSGLINK);
    }

    /**
     * 重置 「消息链接」
     *
    */
    @JsonIgnore
    public MsgBodyDTO resetMsgLink() {
        this._reset(FIELD_MSGLINK);
        return this;
    }

    /**
     * 设置「消息链接(PC)」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setMsgLinkPC(String val) {
        this._set(FIELD_MSGLINKPC, val);
        return this;
    }

    /**
     * 获取「消息链接(PC)」值
     *
    */
    @JsonIgnore
    public String getMsgLinkPC() {
        return (String) this._get(FIELD_MSGLINKPC);
    }

    /**
     * 判断 「消息链接(PC)」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgLinkPC() {
        return this._contains(FIELD_MSGLINKPC);
    }

    /**
     * 重置 「消息链接(PC)」
     *
    */
    @JsonIgnore
    public MsgBodyDTO resetMsgLinkPC() {
        this._reset(FIELD_MSGLINKPC);
        return this;
    }

    /**
     * 设置「消息名称」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setMsgName(String val) {
        this._set(FIELD_MSGNAME, val);
        return this;
    }

    /**
     * 获取「消息名称」值
     *
    */
    @JsonIgnore
    public String getMsgName() {
        return (String) this._get(FIELD_MSGNAME);
    }

    /**
     * 判断 「消息名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgName() {
        return this._contains(FIELD_MSGNAME);
    }

    /**
     * 重置 「消息名称」
     *
    */
    @JsonIgnore
    public MsgBodyDTO resetMsgName() {
        this._reset(FIELD_MSGNAME);
        return this;
    }

    /**
     * 设置「消息类型」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setMsgType(Integer val) {
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
    public MsgBodyDTO resetMsgType() {
        this._reset(FIELD_MSGTYPE);
        return this;
    }

    /**
     * 设置「消息标题」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setSubject(String val) {
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
    public MsgBodyDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「消息模板标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setTemplateId(String val) {
        this._set(FIELD_TEMPLATEID, val);
        return this;
    }

    /**
     * 获取「消息模板标识」值
     *
    */
    @JsonIgnore
    public String getTemplateId() {
        return (String) this._get(FIELD_TEMPLATEID);
    }

    /**
     * 判断 「消息模板标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateId() {
        return this._contains(FIELD_TEMPLATEID);
    }

    /**
     * 重置 「消息模板标识」
     *
    */
    @JsonIgnore
    public MsgBodyDTO resetTemplateId() {
        this._reset(FIELD_TEMPLATEID);
        return this;
    }

    /**
     * 设置「消息模板参数」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setTemplateParams(String val) {
        this._set(FIELD_TEMPLATEPARAMS, val);
        return this;
    }

    /**
     * 获取「消息模板参数」值
     *
    */
    @JsonIgnore
    public String getTemplateParams() {
        return (String) this._get(FIELD_TEMPLATEPARAMS);
    }

    /**
     * 判断 「消息模板参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateParams() {
        return this._contains(FIELD_TEMPLATEPARAMS);
    }

    /**
     * 重置 「消息模板参数」
     *
    */
    @JsonIgnore
    public MsgBodyDTO resetTemplateParams() {
        this._reset(FIELD_TEMPLATEPARAMS);
        return this;
    }

    /**
     * 设置「目标用户」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setToUsers(String val) {
        this._set(FIELD_TOUSERS, val);
        return this;
    }

    /**
     * 获取「目标用户」值
     *
    */
    @JsonIgnore
    public String getToUsers() {
        return (String) this._get(FIELD_TOUSERS);
    }

    /**
     * 判断 「目标用户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsToUsers() {
        return this._contains(FIELD_TOUSERS);
    }

    /**
     * 重置 「目标用户」
     *
    */
    @JsonIgnore
    public MsgBodyDTO resetToUsers() {
        this._reset(FIELD_TOUSERS);
        return this;
    }

    /**
     * 设置「用户数据」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setUserData(String val) {
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
    public MsgBodyDTO resetUserData() {
        this._reset(FIELD_USERDATA);
        return this;
    }

    /**
     * 设置「用户数据2」
     *
     * @param val
    */
    @JsonIgnore
    public MsgBodyDTO setUserData2(String val) {
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
    public MsgBodyDTO resetUserData2() {
        this._reset(FIELD_USERDATA2);
        return this;
    }


}
