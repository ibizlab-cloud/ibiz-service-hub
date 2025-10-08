package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class MailTemplateDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 自动删除
     */
    public final static String FIELD_AUTO_DELETE = "auto_delete";

    /**
     * 属性: 正文
     */
    public final static String FIELD_BODY_HTML = "body_html";

    /**
     * 属性: 可写
     */
    public final static String FIELD_CAN_WRITE = "can_write";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 模板描述
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 抄送
     */
    public final static String FIELD_EMAIL_CC = "email_cc";

    /**
     * 属性: 来自
     */
    public final static String FIELD_EMAIL_FROM = "email_from";

    /**
     * 属性: 电子邮件通知布局
     */
    public final static String FIELD_EMAIL_LAYOUT_XMLID = "email_layout_xmlid";

    /**
     * 属性: 至（EMail）
     */
    public final static String FIELD_EMAIL_TO = "email_to";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 是模板编辑器
     */
    public final static String FIELD_IS_TEMPLATE_EDITOR = "is_template_editor";

    /**
     * 属性: 语言
     */
    public final static String FIELD_LANG = "lang";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 至（合作伙伴）
     */
    public final static String FIELD_PARTNER_TO = "partner_to";

    /**
     * 属性: 渲染模型
     */
    public final static String FIELD_RENDER_MODEL = "render_model";

    /**
     * 属性: 回复
     */
    public final static String FIELD_REPLY_TO = "reply_to";

    /**
     * 属性: 安排的日期
     */
    public final static String FIELD_SCHEDULED_DATE = "scheduled_date";

    /**
     * 属性: 主旨
     */
    public final static String FIELD_SUBJECT = "subject";

    /**
     * 属性: 模板类别
     */
    public final static String FIELD_TEMPLATE_CATEGORY = "template_category";

    /**
     * 属性: 模板文件名
     */
    public final static String FIELD_TEMPLATE_FS = "template_fs";

    /**
     * 属性: 默认收件人
     */
    public final static String FIELD_USE_DEFAULT_TO = "use_default_to";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public MailTemplateDTO setActive(Integer val) {
        this._set(FIELD_ACTIVE, val);
        return this;
    }

    /**
     * 获取「有效」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getActive() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE), null);
    }

    /**
     * 判断 「有效」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActive() {
        return this._contains(FIELD_ACTIVE);
    }

    /**
     * 重置 「有效」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「自动删除」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTO_DELETE)
    public MailTemplateDTO setAutoDelete(Integer val) {
        this._set(FIELD_AUTO_DELETE, val);
        return this;
    }

    /**
     * 获取「自动删除」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutoDelete() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTO_DELETE), null);
    }

    /**
     * 判断 「自动删除」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutoDelete() {
        return this._contains(FIELD_AUTO_DELETE);
    }

    /**
     * 重置 「自动删除」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetAutoDelete() {
        this._reset(FIELD_AUTO_DELETE);
        return this;
    }

    /**
     * 设置「正文」
     * @param val
     */
    @JsonProperty(FIELD_BODY_HTML)
    public MailTemplateDTO setBodyHtml(String val) {
        this._set(FIELD_BODY_HTML, val);
        return this;
    }

    /**
     * 获取「正文」值
     *
     */
    @JsonIgnore
    public String getBodyHtml() {
        return DataTypeUtils.asString(this._get(FIELD_BODY_HTML), null);
    }

    /**
     * 判断 「正文」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBodyHtml() {
        return this._contains(FIELD_BODY_HTML);
    }

    /**
     * 重置 「正文」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetBodyHtml() {
        this._reset(FIELD_BODY_HTML);
        return this;
    }

    /**
     * 设置「可写」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CAN_WRITE)
    public MailTemplateDTO setCanWrite(Integer val) {
        this._set(FIELD_CAN_WRITE, val);
        return this;
    }

    /**
     * 获取「可写」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCanWrite() {
        return DataTypeUtils.asInteger(this._get(FIELD_CAN_WRITE), null);
    }

    /**
     * 判断 「可写」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCanWrite() {
        return this._contains(FIELD_CAN_WRITE);
    }

    /**
     * 重置 「可写」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetCanWrite() {
        this._reset(FIELD_CAN_WRITE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailTemplateDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATE_DATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_CREATE_DATE), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATE_DATE);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailTemplateDTO setCreateUid(String val) {
        this._set(FIELD_CREATE_UID, val);
        return this;
    }

    /**
     * 获取「建立人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getCreateUid() {
        return DataTypeUtils.asString(this._get(FIELD_CREATE_UID), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateUid() {
        return this._contains(FIELD_CREATE_UID);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「模板描述」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public MailTemplateDTO setDescription(String val) {
        this._set(FIELD_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「模板描述」值
     *
     */
    @JsonIgnore
    public String getDescription() {
        return DataTypeUtils.asString(this._get(FIELD_DESCRIPTION), null);
    }

    /**
     * 判断 「模板描述」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDescription() {
        return this._contains(FIELD_DESCRIPTION);
    }

    /**
     * 重置 「模板描述」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailTemplateDTO setDisplayName(String val) {
        this._set(FIELD_DISPLAY_NAME, val);
        return this;
    }

    /**
     * 获取「显示名称」值
     *
     */
    @JsonIgnore
    public String getDisplayName() {
        return DataTypeUtils.asString(this._get(FIELD_DISPLAY_NAME), null);
    }

    /**
     * 判断 「显示名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayName() {
        return this._contains(FIELD_DISPLAY_NAME);
    }

    /**
     * 重置 「显示名称」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「抄送」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_CC)
    public MailTemplateDTO setEmailCc(String val) {
        this._set(FIELD_EMAIL_CC, val);
        return this;
    }

    /**
     * 获取「抄送」值
     *
     */
    @JsonIgnore
    public String getEmailCc() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_CC), null);
    }

    /**
     * 判断 「抄送」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailCc() {
        return this._contains(FIELD_EMAIL_CC);
    }

    /**
     * 重置 「抄送」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetEmailCc() {
        this._reset(FIELD_EMAIL_CC);
        return this;
    }

    /**
     * 设置「来自」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_FROM)
    public MailTemplateDTO setEmailFrom(String val) {
        this._set(FIELD_EMAIL_FROM, val);
        return this;
    }

    /**
     * 获取「来自」值
     *
     */
    @JsonIgnore
    public String getEmailFrom() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_FROM), null);
    }

    /**
     * 判断 「来自」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailFrom() {
        return this._contains(FIELD_EMAIL_FROM);
    }

    /**
     * 重置 「来自」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetEmailFrom() {
        this._reset(FIELD_EMAIL_FROM);
        return this;
    }

    /**
     * 设置「电子邮件通知布局」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_LAYOUT_XMLID)
    public MailTemplateDTO setEmailLayoutXmlid(String val) {
        this._set(FIELD_EMAIL_LAYOUT_XMLID, val);
        return this;
    }

    /**
     * 获取「电子邮件通知布局」值
     *
     */
    @JsonIgnore
    public String getEmailLayoutXmlid() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_LAYOUT_XMLID), null);
    }

    /**
     * 判断 「电子邮件通知布局」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailLayoutXmlid() {
        return this._contains(FIELD_EMAIL_LAYOUT_XMLID);
    }

    /**
     * 重置 「电子邮件通知布局」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetEmailLayoutXmlid() {
        this._reset(FIELD_EMAIL_LAYOUT_XMLID);
        return this;
    }

    /**
     * 设置「至（EMail）」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_TO)
    public MailTemplateDTO setEmailTo(String val) {
        this._set(FIELD_EMAIL_TO, val);
        return this;
    }

    /**
     * 获取「至（EMail）」值
     *
     */
    @JsonIgnore
    public String getEmailTo() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_TO), null);
    }

    /**
     * 判断 「至（EMail）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailTo() {
        return this._contains(FIELD_EMAIL_TO);
    }

    /**
     * 重置 「至（EMail）」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetEmailTo() {
        this._reset(FIELD_EMAIL_TO);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailTemplateDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this._get(FIELD_ID), null);
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
    public MailTemplateDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「是模板编辑器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_TEMPLATE_EDITOR)
    public MailTemplateDTO setIsTemplateEditor(Integer val) {
        this._set(FIELD_IS_TEMPLATE_EDITOR, val);
        return this;
    }

    /**
     * 获取「是模板编辑器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsTemplateEditor() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_TEMPLATE_EDITOR), null);
    }

    /**
     * 判断 「是模板编辑器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsTemplateEditor() {
        return this._contains(FIELD_IS_TEMPLATE_EDITOR);
    }

    /**
     * 重置 「是模板编辑器」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetIsTemplateEditor() {
        this._reset(FIELD_IS_TEMPLATE_EDITOR);
        return this;
    }

    /**
     * 设置「语言」
     * @param val
     */
    @JsonProperty(FIELD_LANG)
    public MailTemplateDTO setLang(String val) {
        this._set(FIELD_LANG, val);
        return this;
    }

    /**
     * 获取「语言」值
     *
     */
    @JsonIgnore
    public String getLang() {
        return DataTypeUtils.asString(this._get(FIELD_LANG), null);
    }

    /**
     * 判断 「语言」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLang() {
        return this._contains(FIELD_LANG);
    }

    /**
     * 重置 「语言」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetLang() {
        this._reset(FIELD_LANG);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailTemplateDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「至（合作伙伴）」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_TO)
    public MailTemplateDTO setPartnerTo(String val) {
        this._set(FIELD_PARTNER_TO, val);
        return this;
    }

    /**
     * 获取「至（合作伙伴）」值
     *
     */
    @JsonIgnore
    public String getPartnerTo() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_TO), null);
    }

    /**
     * 判断 「至（合作伙伴）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerTo() {
        return this._contains(FIELD_PARTNER_TO);
    }

    /**
     * 重置 「至（合作伙伴）」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetPartnerTo() {
        this._reset(FIELD_PARTNER_TO);
        return this;
    }

    /**
     * 设置「渲染模型」
     * @param val
     */
    @JsonProperty(FIELD_RENDER_MODEL)
    public MailTemplateDTO setRenderModel(String val) {
        this._set(FIELD_RENDER_MODEL, val);
        return this;
    }

    /**
     * 获取「渲染模型」值
     *
     */
    @JsonIgnore
    public String getRenderModel() {
        return DataTypeUtils.asString(this._get(FIELD_RENDER_MODEL), null);
    }

    /**
     * 判断 「渲染模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRenderModel() {
        return this._contains(FIELD_RENDER_MODEL);
    }

    /**
     * 重置 「渲染模型」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetRenderModel() {
        this._reset(FIELD_RENDER_MODEL);
        return this;
    }

    /**
     * 设置「回复」
     * @param val
     */
    @JsonProperty(FIELD_REPLY_TO)
    public MailTemplateDTO setReplyTo(String val) {
        this._set(FIELD_REPLY_TO, val);
        return this;
    }

    /**
     * 获取「回复」值
     *
     */
    @JsonIgnore
    public String getReplyTo() {
        return DataTypeUtils.asString(this._get(FIELD_REPLY_TO), null);
    }

    /**
     * 判断 「回复」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReplyTo() {
        return this._contains(FIELD_REPLY_TO);
    }

    /**
     * 重置 「回复」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetReplyTo() {
        this._reset(FIELD_REPLY_TO);
        return this;
    }

    /**
     * 设置「安排的日期」
     * @param val
     */
    @JsonProperty(FIELD_SCHEDULED_DATE)
    public MailTemplateDTO setScheduledDate(String val) {
        this._set(FIELD_SCHEDULED_DATE, val);
        return this;
    }

    /**
     * 获取「安排的日期」值
     *
     */
    @JsonIgnore
    public String getScheduledDate() {
        return DataTypeUtils.asString(this._get(FIELD_SCHEDULED_DATE), null);
    }

    /**
     * 判断 「安排的日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScheduledDate() {
        return this._contains(FIELD_SCHEDULED_DATE);
    }

    /**
     * 重置 「安排的日期」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetScheduledDate() {
        this._reset(FIELD_SCHEDULED_DATE);
        return this;
    }

    /**
     * 设置「主旨」
     * @param val
     */
    @JsonProperty(FIELD_SUBJECT)
    public MailTemplateDTO setSubject(String val) {
        this._set(FIELD_SUBJECT, val);
        return this;
    }

    /**
     * 获取「主旨」值
     *
     */
    @JsonIgnore
    public String getSubject() {
        return DataTypeUtils.asString(this._get(FIELD_SUBJECT), null);
    }

    /**
     * 判断 「主旨」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSubject() {
        return this._contains(FIELD_SUBJECT);
    }

    /**
     * 重置 「主旨」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「模板类别」
     * 代码表[模板类别]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_template_template_category
     * @param val
     */
    @JsonProperty(FIELD_TEMPLATE_CATEGORY)
    public MailTemplateDTO setTemplateCategory(String val) {
        this._set(FIELD_TEMPLATE_CATEGORY, val);
        return this;
    }

    /**
     * 获取「模板类别」值
     * 代码表[模板类别]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_template_template_category
     *
     */
    @JsonIgnore
    public String getTemplateCategory() {
        return DataTypeUtils.asString(this._get(FIELD_TEMPLATE_CATEGORY), null);
    }

    /**
     * 判断 「模板类别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTemplateCategory() {
        return this._contains(FIELD_TEMPLATE_CATEGORY);
    }

    /**
     * 重置 「模板类别」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetTemplateCategory() {
        this._reset(FIELD_TEMPLATE_CATEGORY);
        return this;
    }

    /**
     * 设置「模板文件名」
     * @param val
     */
    @JsonProperty(FIELD_TEMPLATE_FS)
    public MailTemplateDTO setTemplateFs(String val) {
        this._set(FIELD_TEMPLATE_FS, val);
        return this;
    }

    /**
     * 获取「模板文件名」值
     *
     */
    @JsonIgnore
    public String getTemplateFs() {
        return DataTypeUtils.asString(this._get(FIELD_TEMPLATE_FS), null);
    }

    /**
     * 判断 「模板文件名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTemplateFs() {
        return this._contains(FIELD_TEMPLATE_FS);
    }

    /**
     * 重置 「模板文件名」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetTemplateFs() {
        this._reset(FIELD_TEMPLATE_FS);
        return this;
    }

    /**
     * 设置「默认收件人」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_DEFAULT_TO)
    public MailTemplateDTO setUseDefaultTo(Integer val) {
        this._set(FIELD_USE_DEFAULT_TO, val);
        return this;
    }

    /**
     * 获取「默认收件人」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUseDefaultTo() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_DEFAULT_TO), null);
    }

    /**
     * 判断 「默认收件人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUseDefaultTo() {
        return this._contains(FIELD_USE_DEFAULT_TO);
    }

    /**
     * 重置 「默认收件人」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetUseDefaultTo() {
        this._reset(FIELD_USE_DEFAULT_TO);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public MailTemplateDTO setUserId(String val) {
        this._set(FIELD_USER_ID, val);
        return this;
    }

    /**
     * 获取「用户」值
     *
     */
    @JsonIgnore
    public String getUserId() {
        return DataTypeUtils.asString(this._get(FIELD_USER_ID), null);
    }

    /**
     * 判断 「用户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USER_ID);
    }

    /**
     * 重置 「用户」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailTemplateDTO setWriteDate(Timestamp val) {
        this._set(FIELD_WRITE_DATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getWriteDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_WRITE_DATE), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteDate() {
        return this._contains(FIELD_WRITE_DATE);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailTemplateDTO setWriteUid(String val) {
        this._set(FIELD_WRITE_UID, val);
        return this;
    }

    /**
     * 获取「更新人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getWriteUid() {
        return DataTypeUtils.asString(this._get(FIELD_WRITE_UID), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteUid() {
        return this._contains(FIELD_WRITE_UID);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public MailTemplateDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
