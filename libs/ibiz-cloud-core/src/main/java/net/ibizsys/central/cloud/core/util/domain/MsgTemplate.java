package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 消息模板
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/.ibizmodel.index
 */
public class MsgTemplate extends EntityBase {

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
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.TemplateType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/TEMPLATE_TYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/TemplateType.ibizmodel.yaml
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
   * 开放应用
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
   * 接入平台类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.OpenAccessType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/psdefields/OPEN_TYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/OpenAccessType.ibizmodel.yaml
   * @see ibizmos:/psmodules/notify/psdataentities/MSG_TEMPLATE/minorpsders/DER1N_MSG_TEMPLATE_MSG_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_OPENTYPE = "opentype";


    /**
     * 设置「模板标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplate setTId(String val) {
        this.set(FIELD_TID, val);
        return this;
    }

    /**
     * 获取「模板标识」值
     *
    */
    @JsonIgnore
    public String getTId() {
        return (String) this.get(FIELD_TID);
    }

    /**
     * 判断 「模板标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTId() {
        return this.contains(FIELD_TID);
    }

    /**
     * 重置 「模板标识」
     *
    */
    @JsonIgnore
    public MsgTemplate resetTId() {
        this.reset(FIELD_TID);
        return this;
    }

    /**
     * 设置「模板标题」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplate setTemplateName(String val) {
        this.set(FIELD_TEMPLATENAME, val);
        return this;
    }

    /**
     * 获取「模板标题」值
     *
    */
    @JsonIgnore
    public String getTemplateName() {
        return (String) this.get(FIELD_TEMPLATENAME);
    }

    /**
     * 判断 「模板标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateName() {
        return this.contains(FIELD_TEMPLATENAME);
    }

    /**
     * 重置 「模板标题」
     *
    */
    @JsonIgnore
    public MsgTemplate resetTemplateName() {
        this.reset(FIELD_TEMPLATENAME);
        return this;
    }

    /**
     * 设置「模板类型」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplate setTemplateType(String val) {
        this.set(FIELD_TEMPLATETYPE, val);
        return this;
    }

    /**
     * 获取「模板类型」值
     *
    */
    @JsonIgnore
    public String getTemplateType() {
        return (String) this.get(FIELD_TEMPLATETYPE);
    }

    /**
     * 判断 「模板类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateType() {
        return this.contains(FIELD_TEMPLATETYPE);
    }

    /**
     * 重置 「模板类型」
     *
    */
    @JsonIgnore
    public MsgTemplate resetTemplateType() {
        this.reset(FIELD_TEMPLATETYPE);
        return this;
    }

    /**
     * 设置「模板内容」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplate setContent(String val) {
        this.set(FIELD_CONTENT, val);
        return this;
    }

    /**
     * 获取「模板内容」值
     *
    */
    @JsonIgnore
    public String getContent() {
        return (String) this.get(FIELD_CONTENT);
    }

    /**
     * 判断 「模板内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsContent() {
        return this.contains(FIELD_CONTENT);
    }

    /**
     * 重置 「模板内容」
     *
    */
    @JsonIgnore
    public MsgTemplate resetContent() {
        this.reset(FIELD_CONTENT);
        return this;
    }

    /**
     * 设置「模板标识」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplate setTemplateId(String val) {
        this.set(FIELD_TEMPLATEID, val);
        return this;
    }

    /**
     * 获取「模板标识」值
     *
    */
    @JsonIgnore
    public String getTemplateId() {
        return (String) this.get(FIELD_TEMPLATEID);
    }

    /**
     * 判断 「模板标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateId() {
        return this.contains(FIELD_TEMPLATEID);
    }

    /**
     * 重置 「模板标识」
     *
    */
    @JsonIgnore
    public MsgTemplate resetTemplateId() {
        this.reset(FIELD_TEMPLATEID);
        return this;
    }

    /**
     * 设置「URL」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplate setTemplateUrl(String val) {
        this.set(FIELD_TEMPLATEURL, val);
        return this;
    }

    /**
     * 获取「URL」值
     *
    */
    @JsonIgnore
    public String getTemplateUrl() {
        return (String) this.get(FIELD_TEMPLATEURL);
    }

    /**
     * 判断 「URL」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemplateUrl() {
        return this.contains(FIELD_TEMPLATEURL);
    }

    /**
     * 重置 「URL」
     *
    */
    @JsonIgnore
    public MsgTemplate resetTemplateUrl() {
        this.reset(FIELD_TEMPLATEURL);
        return this;
    }

    /**
     * 设置「开放应用」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplate setAccessId(String val) {
        this.set(FIELD_ACCESSID, val);
        return this;
    }

    /**
     * 获取「开放应用」值
     *
    */
    @JsonIgnore
    public String getAccessId() {
        return (String) this.get(FIELD_ACCESSID);
    }

    /**
     * 判断 「开放应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessId() {
        return this.contains(FIELD_ACCESSID);
    }

    /**
     * 重置 「开放应用」
     *
    */
    @JsonIgnore
    public MsgTemplate resetAccessId() {
        this.reset(FIELD_ACCESSID);
        return this;
    }

    /**
     * 设置「开放应用」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplate setAccessName(String val) {
        this.set(FIELD_ACCESSNAME, val);
        return this;
    }

    /**
     * 获取「开放应用」值
     *
    */
    @JsonIgnore
    public String getAccessName() {
        return (String) this.get(FIELD_ACCESSNAME);
    }

    /**
     * 判断 「开放应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessName() {
        return this.contains(FIELD_ACCESSNAME);
    }

    /**
     * 重置 「开放应用」
     *
    */
    @JsonIgnore
    public MsgTemplate resetAccessName() {
        this.reset(FIELD_ACCESSNAME);
        return this;
    }

    /**
     * 设置「接入平台类型」
     *
     * @param val
    */
    @JsonIgnore
    public MsgTemplate setOpenType(String val) {
        this.set(FIELD_OPENTYPE, val);
        return this;
    }

    /**
     * 获取「接入平台类型」值
     *
    */
    @JsonIgnore
    public String getOpenType() {
        return (String) this.get(FIELD_OPENTYPE);
    }

    /**
     * 判断 「接入平台类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenType() {
        return this.contains(FIELD_OPENTYPE);
    }

    /**
     * 重置 「接入平台类型」
     *
    */
    @JsonIgnore
    public MsgTemplate resetOpenType() {
        this.reset(FIELD_OPENTYPE);
        return this;
    }


}
