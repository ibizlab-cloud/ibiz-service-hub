package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 消息模板
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/.ibizmodel.index
 */
public class MsgTemplateDTO extends EntityDTO {

  /**.
   * 模板标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/TID/.ibizmodel.index
   */
  public final static String FIELD_TID = "tid";

  /**.
   * 模板标题
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/TEMPLATE_NAME/.ibizmodel.index
   */
  public final static String FIELD_TEMPLATENAME = "templatename";

  /**.
   * 模板类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.TemplateType2} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/TEMPLATE_TYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/TemplateType2.ibizmodel.yaml
   */
  public final static String FIELD_TEMPLATETYPE = "templatetype";

  /**.
   * 模板内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/CONTENT/.ibizmodel.index
   */
  public final static String FIELD_CONTENT = "content";

  /**.
   * 模板标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/TEMPLATE_ID/.ibizmodel.index
   */
  public final static String FIELD_TEMPLATEID = "templateid";

  /**.
   * URL
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/TEMPLATE_URL/.ibizmodel.index
   */
  public final static String FIELD_TEMPLATEURL = "templateurl";

  /**.
   * 开放平台应用
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/ACCESSID/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/minorpsders/DER1N_MSG_TEMPLATE_MSG_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ACCESSID = "accessid";

  /**.
   * 开放应用
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/ACCESSNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/minorpsders/DER1N_MSG_TEMPLATE_MSG_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ACCESSNAME = "accessname";

  /**.
   * 开放应用类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.OpenAccessType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/OPEN_TYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/OpenAccessType.ibizmodel.yaml
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/minorpsders/DER1N_MSG_TEMPLATE_MSG_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_OPENTYPE = "opentype";

  /**.
   * 标题
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/SUBJECT/.ibizmodel.index
   */
  public final static String FIELD_SUBJECT = "subject";


    /**
     * 设置「模板标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setTId(String val) {
        this._set(FIELD_TID, val);
        return this;
    }

    /**
     * 获取「模板标识」值
     *
    */
    @JsonIgnore
    public String getTId() {
        return (String) this._get(FIELD_TID);
    }

    /**
     * 判断 「模板标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTId() {
        return this._contains(FIELD_TID);
    }

    /**
     * 重置 「模板标识」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetTId() {
        this._reset(FIELD_TID);
        return this;
    }

    /**
     * 设置「模板标题」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setTemplateName(String val) {
        this._set(FIELD_TEMPLATENAME, val);
        return this;
    }

    /**
     * 获取「模板标题」值
     *
    */
    @JsonIgnore
    public String getTemplateName() {
        return (String) this._get(FIELD_TEMPLATENAME);
    }

    /**
     * 判断 「模板标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateName() {
        return this._contains(FIELD_TEMPLATENAME);
    }

    /**
     * 重置 「模板标题」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetTemplateName() {
        this._reset(FIELD_TEMPLATENAME);
        return this;
    }

    /**
     * 设置「模板类型」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setTemplateType(String val) {
        this._set(FIELD_TEMPLATETYPE, val);
        return this;
    }

    /**
     * 获取「模板类型」值
     *
    */
    @JsonIgnore
    public String getTemplateType() {
        return (String) this._get(FIELD_TEMPLATETYPE);
    }

    /**
     * 判断 「模板类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateType() {
        return this._contains(FIELD_TEMPLATETYPE);
    }

    /**
     * 重置 「模板类型」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetTemplateType() {
        this._reset(FIELD_TEMPLATETYPE);
        return this;
    }

    /**
     * 设置「模板内容」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setContent(String val) {
        this._set(FIELD_CONTENT, val);
        return this;
    }

    /**
     * 获取「模板内容」值
     *
    */
    @JsonIgnore
    public String getContent() {
        return (String) this._get(FIELD_CONTENT);
    }

    /**
     * 判断 「模板内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsContent() {
        return this._contains(FIELD_CONTENT);
    }

    /**
     * 重置 「模板内容」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetContent() {
        this._reset(FIELD_CONTENT);
        return this;
    }

    /**
     * 设置「模板标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setTemplateId(String val) {
        this._set(FIELD_TEMPLATEID, val);
        return this;
    }

    /**
     * 获取「模板标识」值
     *
    */
    @JsonIgnore
    public String getTemplateId() {
        return (String) this._get(FIELD_TEMPLATEID);
    }

    /**
     * 判断 「模板标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateId() {
        return this._contains(FIELD_TEMPLATEID);
    }

    /**
     * 重置 「模板标识」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetTemplateId() {
        this._reset(FIELD_TEMPLATEID);
        return this;
    }

    /**
     * 设置「URL」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setTemplateUrl(String val) {
        this._set(FIELD_TEMPLATEURL, val);
        return this;
    }

    /**
     * 获取「URL」值
     *
    */
    @JsonIgnore
    public String getTemplateUrl() {
        return (String) this._get(FIELD_TEMPLATEURL);
    }

    /**
     * 判断 「URL」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateUrl() {
        return this._contains(FIELD_TEMPLATEURL);
    }

    /**
     * 重置 「URL」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetTemplateUrl() {
        this._reset(FIELD_TEMPLATEURL);
        return this;
    }

    /**
     * 设置「开放平台应用」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setAccessId(String val) {
        this._set(FIELD_ACCESSID, val);
        return this;
    }

    /**
     * 获取「开放平台应用」值
     *
    */
    @JsonIgnore
    public String getAccessId() {
        return (String) this._get(FIELD_ACCESSID);
    }

    /**
     * 判断 「开放平台应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessId() {
        return this._contains(FIELD_ACCESSID);
    }

    /**
     * 重置 「开放平台应用」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetAccessId() {
        this._reset(FIELD_ACCESSID);
        return this;
    }

    /**
     * 设置「开放应用」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setAccessName(String val) {
        this._set(FIELD_ACCESSNAME, val);
        return this;
    }

    /**
     * 获取「开放应用」值
     *
    */
    @JsonIgnore
    public String getAccessName() {
        return (String) this._get(FIELD_ACCESSNAME);
    }

    /**
     * 判断 「开放应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessName() {
        return this._contains(FIELD_ACCESSNAME);
    }

    /**
     * 重置 「开放应用」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetAccessName() {
        this._reset(FIELD_ACCESSNAME);
        return this;
    }

    /**
     * 设置「开放应用类型」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setOpenType(String val) {
        this._set(FIELD_OPENTYPE, val);
        return this;
    }

    /**
     * 获取「开放应用类型」值
     *
    */
    @JsonIgnore
    public String getOpenType() {
        return (String) this._get(FIELD_OPENTYPE);
    }

    /**
     * 判断 「开放应用类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenType() {
        return this._contains(FIELD_OPENTYPE);
    }

    /**
     * 重置 「开放应用类型」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetOpenType() {
        this._reset(FIELD_OPENTYPE);
        return this;
    }

    /**
     * 设置「标题」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplateDTO setSubject(String val) {
        this._set(FIELD_SUBJECT, val);
        return this;
    }

    /**
     * 获取「标题」值
     *
    */
    @JsonIgnore
    public String getSubject() {
        return (String) this._get(FIELD_SUBJECT);
    }

    /**
     * 判断 「标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSubject() {
        return this._contains(FIELD_SUBJECT);
    }

    /**
     * 重置 「标题」
     *
    */
    @JsonIgnore
    public MsgTemplateDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }


}
