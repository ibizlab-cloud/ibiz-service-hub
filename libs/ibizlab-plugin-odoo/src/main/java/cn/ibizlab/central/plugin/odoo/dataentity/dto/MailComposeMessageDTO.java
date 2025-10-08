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


public class MailComposeMessageDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 作者
     */
    public final static String FIELD_AUTHOR_ID = "author_id";

    /**
     * 属性: 删除邮件
     */
    public final static String FIELD_AUTO_DELETE = "auto_delete";

    /**
     * 属性: 保存消息副本
     */
    public final static String FIELD_AUTO_DELETE_KEEP_LOG = "auto_delete_keep_log";

    /**
     * 属性: 内容
     */
    public final static String FIELD_BODY = "body";

    /**
     * 属性: 正文内容与模板相同
     */
    public final static String FIELD_BODY_HAS_TEMPLATE_VALUE = "body_has_template_value";

    /**
     * 属性: 可以编辑主体
     */
    public final static String FIELD_CAN_EDIT_BODY = "can_edit_body";

    /**
     * 属性: 批次组合
     */
    public final static String FIELD_COMPOSITION_BATCH = "composition_batch";

    /**
     * 属性: 写作模式
     */
    public final static String FIELD_COMPOSITION_MODE = "composition_mode";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 添加签名
     */
    public final static String FIELD_EMAIL_ADD_SIGNATURE = "email_add_signature";

    /**
     * 属性: 来自
     */
    public final static String FIELD_EMAIL_FROM = "email_from";

    /**
     * 属性: 电子邮件通知布局
     */
    public final static String FIELD_EMAIL_LAYOUT_XMLID = "email_layout_xmlid";

    /**
     * 属性: 直接发送邮件或通知
     */
    public final static String FIELD_FORCE_SEND = "force_send";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 是编辑者
     */
    public final static String FIELD_IS_MAIL_TEMPLATE_EDITOR = "is_mail_template_editor";

    /**
     * 属性: 语言
     */
    public final static String FIELD_LANG = "lang";

    /**
     * 属性: 邮件活动类型
     */
    public final static String FIELD_MAIL_ACTIVITY_TYPE_ID = "mail_activity_type_id";

    /**
     * 属性: 邮件标题
     */
    public final static String FIELD_MASS_MAILING_NAME = "mass_mailing_name";

    /**
     * 属性: 类型
     */
    public final static String FIELD_MESSAGE_TYPE = "message_type";

    /**
     * 属性: 相关单据模型
     */
    public final static String FIELD_MODEL = "model";

    /**
     * 属性: 已启用对话串
     */
    public final static String FIELD_MODEL_IS_THREAD = "model_is_thread";

    /**
     * 属性: 上级消息
     */
    public final static String FIELD_PARENT_ID = "parent_id";

    /**
     * 属性: 别名域
     */
    public final static String FIELD_RECORD_ALIAS_DOMAIN_ID = "record_alias_domain_id";

    /**
     * 属性: 公司
     */
    public final static String FIELD_RECORD_COMPANY_ID = "record_company_id";

    /**
     * 属性: 记录名称
     */
    public final static String FIELD_RECORD_NAME = "record_name";

    /**
     * 属性: 渲染模型
     */
    public final static String FIELD_RENDER_MODEL = "render_model";

    /**
     * 属性: 回复
     */
    public final static String FIELD_REPLY_TO = "reply_to";

    /**
     * 属性: 视答案为新线程
     */
    public final static String FIELD_REPLY_TO_FORCE_NEW = "reply_to_force_new";

    /**
     * 属性: 回复
     */
    public final static String FIELD_REPLY_TO_MODE = "reply_to_mode";

    /**
     * 属性: 有效的域
     */
    public final static String FIELD_RES_DOMAIN = "res_domain";

    /**
     * 属性: 负责人
     */
    public final static String FIELD_RES_DOMAIN_USER_ID = "res_domain_user_id";

    /**
     * 属性: 相关文档 ID
     */
    public final static String FIELD_RES_IDS = "res_ids";

    /**
     * 属性: 安排的日期
     */
    public final static String FIELD_SCHEDULED_DATE = "scheduled_date";

    /**
     * 属性: 主旨
     */
    public final static String FIELD_SUBJECT = "subject";

    /**
     * 属性: 子类型
     */
    public final static String FIELD_SUBTYPE_ID = "subtype_id";

    /**
     * 属性: 是系统日志
     */
    public final static String FIELD_SUBTYPE_IS_LOG = "subtype_is_log";

    /**
     * 属性: 使用模版
     */
    public final static String FIELD_TEMPLATE_ID = "template_id";

    /**
     * 属性: 模板名称
     */
    public final static String FIELD_TEMPLATE_NAME = "template_name";

    /**
     * 属性: 检查排除清单
     */
    public final static String FIELD_USE_EXCLUSION_LIST = "use_exclusion_list";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「作者」
     * @param val
     */
    @JsonProperty(FIELD_AUTHOR_ID)
    public MailComposeMessageDTO setAuthorId(String val) {
        this._set(FIELD_AUTHOR_ID, val);
        return this;
    }

    /**
     * 获取「作者」值
     *
     */
    @JsonIgnore
    public String getAuthorId() {
        return DataTypeUtils.asString(this._get(FIELD_AUTHOR_ID), null);
    }

    /**
     * 判断 「作者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthorId() {
        return this._contains(FIELD_AUTHOR_ID);
    }

    /**
     * 重置 「作者」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetAuthorId() {
        this._reset(FIELD_AUTHOR_ID);
        return this;
    }

    /**
     * 设置「删除邮件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTO_DELETE)
    public MailComposeMessageDTO setAutoDelete(Integer val) {
        this._set(FIELD_AUTO_DELETE, val);
        return this;
    }

    /**
     * 获取「删除邮件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutoDelete() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTO_DELETE), null);
    }

    /**
     * 判断 「删除邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutoDelete() {
        return this._contains(FIELD_AUTO_DELETE);
    }

    /**
     * 重置 「删除邮件」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetAutoDelete() {
        this._reset(FIELD_AUTO_DELETE);
        return this;
    }

    /**
     * 设置「保存消息副本」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTO_DELETE_KEEP_LOG)
    public MailComposeMessageDTO setAutoDeleteKeepLog(Integer val) {
        this._set(FIELD_AUTO_DELETE_KEEP_LOG, val);
        return this;
    }

    /**
     * 获取「保存消息副本」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutoDeleteKeepLog() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTO_DELETE_KEEP_LOG), null);
    }

    /**
     * 判断 「保存消息副本」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutoDeleteKeepLog() {
        return this._contains(FIELD_AUTO_DELETE_KEEP_LOG);
    }

    /**
     * 重置 「保存消息副本」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetAutoDeleteKeepLog() {
        this._reset(FIELD_AUTO_DELETE_KEEP_LOG);
        return this;
    }

    /**
     * 设置「内容」
     * @param val
     */
    @JsonProperty(FIELD_BODY)
    public MailComposeMessageDTO setBody(String val) {
        this._set(FIELD_BODY, val);
        return this;
    }

    /**
     * 获取「内容」值
     *
     */
    @JsonIgnore
    public String getBody() {
        return DataTypeUtils.asString(this._get(FIELD_BODY), null);
    }

    /**
     * 判断 「内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBody() {
        return this._contains(FIELD_BODY);
    }

    /**
     * 重置 「内容」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetBody() {
        this._reset(FIELD_BODY);
        return this;
    }

    /**
     * 设置「正文内容与模板相同」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_BODY_HAS_TEMPLATE_VALUE)
    public MailComposeMessageDTO setBodyHasTemplateValue(Integer val) {
        this._set(FIELD_BODY_HAS_TEMPLATE_VALUE, val);
        return this;
    }

    /**
     * 获取「正文内容与模板相同」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getBodyHasTemplateValue() {
        return DataTypeUtils.asInteger(this._get(FIELD_BODY_HAS_TEMPLATE_VALUE), null);
    }

    /**
     * 判断 「正文内容与模板相同」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBodyHasTemplateValue() {
        return this._contains(FIELD_BODY_HAS_TEMPLATE_VALUE);
    }

    /**
     * 重置 「正文内容与模板相同」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetBodyHasTemplateValue() {
        this._reset(FIELD_BODY_HAS_TEMPLATE_VALUE);
        return this;
    }

    /**
     * 设置「可以编辑主体」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CAN_EDIT_BODY)
    public MailComposeMessageDTO setCanEditBody(Integer val) {
        this._set(FIELD_CAN_EDIT_BODY, val);
        return this;
    }

    /**
     * 获取「可以编辑主体」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCanEditBody() {
        return DataTypeUtils.asInteger(this._get(FIELD_CAN_EDIT_BODY), null);
    }

    /**
     * 判断 「可以编辑主体」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCanEditBody() {
        return this._contains(FIELD_CAN_EDIT_BODY);
    }

    /**
     * 重置 「可以编辑主体」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetCanEditBody() {
        this._reset(FIELD_CAN_EDIT_BODY);
        return this;
    }

    /**
     * 设置「批次组合」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_COMPOSITION_BATCH)
    public MailComposeMessageDTO setCompositionBatch(Integer val) {
        this._set(FIELD_COMPOSITION_BATCH, val);
        return this;
    }

    /**
     * 获取「批次组合」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCompositionBatch() {
        return DataTypeUtils.asInteger(this._get(FIELD_COMPOSITION_BATCH), null);
    }

    /**
     * 判断 「批次组合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompositionBatch() {
        return this._contains(FIELD_COMPOSITION_BATCH);
    }

    /**
     * 重置 「批次组合」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetCompositionBatch() {
        this._reset(FIELD_COMPOSITION_BATCH);
        return this;
    }

    /**
     * 设置「写作模式」
     * 代码表[写作模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_compose_message_composition_mode
     * @param val
     */
    @JsonProperty(FIELD_COMPOSITION_MODE)
    public MailComposeMessageDTO setCompositionMode(String val) {
        this._set(FIELD_COMPOSITION_MODE, val);
        return this;
    }

    /**
     * 获取「写作模式」值
     * 代码表[写作模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_compose_message_composition_mode
     *
     */
    @JsonIgnore
    public String getCompositionMode() {
        return DataTypeUtils.asString(this._get(FIELD_COMPOSITION_MODE), null);
    }

    /**
     * 判断 「写作模式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompositionMode() {
        return this._contains(FIELD_COMPOSITION_MODE);
    }

    /**
     * 重置 「写作模式」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetCompositionMode() {
        this._reset(FIELD_COMPOSITION_MODE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailComposeMessageDTO setCreateDate(Timestamp val) {
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
    public MailComposeMessageDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailComposeMessageDTO setCreateUid(String val) {
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
    public MailComposeMessageDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailComposeMessageDTO setDisplayName(String val) {
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
    public MailComposeMessageDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「添加签名」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_ADD_SIGNATURE)
    public MailComposeMessageDTO setEmailAddSignature(Integer val) {
        this._set(FIELD_EMAIL_ADD_SIGNATURE, val);
        return this;
    }

    /**
     * 获取「添加签名」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getEmailAddSignature() {
        return DataTypeUtils.asInteger(this._get(FIELD_EMAIL_ADD_SIGNATURE), null);
    }

    /**
     * 判断 「添加签名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailAddSignature() {
        return this._contains(FIELD_EMAIL_ADD_SIGNATURE);
    }

    /**
     * 重置 「添加签名」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetEmailAddSignature() {
        this._reset(FIELD_EMAIL_ADD_SIGNATURE);
        return this;
    }

    /**
     * 设置「来自」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_FROM)
    public MailComposeMessageDTO setEmailFrom(String val) {
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
    public MailComposeMessageDTO resetEmailFrom() {
        this._reset(FIELD_EMAIL_FROM);
        return this;
    }

    /**
     * 设置「电子邮件通知布局」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_LAYOUT_XMLID)
    public MailComposeMessageDTO setEmailLayoutXmlid(String val) {
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
    public MailComposeMessageDTO resetEmailLayoutXmlid() {
        this._reset(FIELD_EMAIL_LAYOUT_XMLID);
        return this;
    }

    /**
     * 设置「直接发送邮件或通知」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_FORCE_SEND)
    public MailComposeMessageDTO setForceSend(Integer val) {
        this._set(FIELD_FORCE_SEND, val);
        return this;
    }

    /**
     * 获取「直接发送邮件或通知」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getForceSend() {
        return DataTypeUtils.asInteger(this._get(FIELD_FORCE_SEND), null);
    }

    /**
     * 判断 「直接发送邮件或通知」是否有值
     *
     */
    @JsonIgnore
    public boolean containsForceSend() {
        return this._contains(FIELD_FORCE_SEND);
    }

    /**
     * 重置 「直接发送邮件或通知」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetForceSend() {
        this._reset(FIELD_FORCE_SEND);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailComposeMessageDTO setId(String val) {
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
    public MailComposeMessageDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「是编辑者」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_MAIL_TEMPLATE_EDITOR)
    public MailComposeMessageDTO setIsMailTemplateEditor(Integer val) {
        this._set(FIELD_IS_MAIL_TEMPLATE_EDITOR, val);
        return this;
    }

    /**
     * 获取「是编辑者」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsMailTemplateEditor() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_MAIL_TEMPLATE_EDITOR), null);
    }

    /**
     * 判断 「是编辑者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsMailTemplateEditor() {
        return this._contains(FIELD_IS_MAIL_TEMPLATE_EDITOR);
    }

    /**
     * 重置 「是编辑者」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetIsMailTemplateEditor() {
        this._reset(FIELD_IS_MAIL_TEMPLATE_EDITOR);
        return this;
    }

    /**
     * 设置「语言」
     * @param val
     */
    @JsonProperty(FIELD_LANG)
    public MailComposeMessageDTO setLang(String val) {
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
    public MailComposeMessageDTO resetLang() {
        this._reset(FIELD_LANG);
        return this;
    }

    /**
     * 设置「邮件活动类型」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_ACTIVITY_TYPE_ID)
    public MailComposeMessageDTO setMailActivityTypeId(String val) {
        this._set(FIELD_MAIL_ACTIVITY_TYPE_ID, val);
        return this;
    }

    /**
     * 获取「邮件活动类型」值
     *
     */
    @JsonIgnore
    public String getMailActivityTypeId() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_ACTIVITY_TYPE_ID), null);
    }

    /**
     * 判断 「邮件活动类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailActivityTypeId() {
        return this._contains(FIELD_MAIL_ACTIVITY_TYPE_ID);
    }

    /**
     * 重置 「邮件活动类型」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetMailActivityTypeId() {
        this._reset(FIELD_MAIL_ACTIVITY_TYPE_ID);
        return this;
    }

    /**
     * 设置「邮件标题」
     * @param val
     */
    @JsonProperty(FIELD_MASS_MAILING_NAME)
    public MailComposeMessageDTO setMassMailingName(String val) {
        this._set(FIELD_MASS_MAILING_NAME, val);
        return this;
    }

    /**
     * 获取「邮件标题」值
     *
     */
    @JsonIgnore
    public String getMassMailingName() {
        return DataTypeUtils.asString(this._get(FIELD_MASS_MAILING_NAME), null);
    }

    /**
     * 判断 「邮件标题」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMassMailingName() {
        return this._contains(FIELD_MASS_MAILING_NAME);
    }

    /**
     * 重置 「邮件标题」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetMassMailingName() {
        this._reset(FIELD_MASS_MAILING_NAME);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_compose_message_message_type
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_TYPE)
    public MailComposeMessageDTO setMessageType(String val) {
        this._set(FIELD_MESSAGE_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_compose_message_message_type
     *
     */
    @JsonIgnore
    public String getMessageType() {
        return DataTypeUtils.asString(this._get(FIELD_MESSAGE_TYPE), null);
    }

    /**
     * 判断 「类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageType() {
        return this._contains(FIELD_MESSAGE_TYPE);
    }

    /**
     * 重置 「类型」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetMessageType() {
        this._reset(FIELD_MESSAGE_TYPE);
        return this;
    }

    /**
     * 设置「相关单据模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL)
    public MailComposeMessageDTO setModel(String val) {
        this._set(FIELD_MODEL, val);
        return this;
    }

    /**
     * 获取「相关单据模型」值
     *
     */
    @JsonIgnore
    public String getModel() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL), null);
    }

    /**
     * 判断 「相关单据模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModel() {
        return this._contains(FIELD_MODEL);
    }

    /**
     * 重置 「相关单据模型」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetModel() {
        this._reset(FIELD_MODEL);
        return this;
    }

    /**
     * 设置「已启用对话串」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODEL_IS_THREAD)
    public MailComposeMessageDTO setModelIsThread(Integer val) {
        this._set(FIELD_MODEL_IS_THREAD, val);
        return this;
    }

    /**
     * 获取「已启用对话串」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModelIsThread() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODEL_IS_THREAD), null);
    }

    /**
     * 判断 「已启用对话串」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModelIsThread() {
        return this._contains(FIELD_MODEL_IS_THREAD);
    }

    /**
     * 重置 「已启用对话串」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetModelIsThread() {
        this._reset(FIELD_MODEL_IS_THREAD);
        return this;
    }

    /**
     * 设置「上级消息」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_ID)
    public MailComposeMessageDTO setParentId(String val) {
        this._set(FIELD_PARENT_ID, val);
        return this;
    }

    /**
     * 获取「上级消息」值
     *
     */
    @JsonIgnore
    public String getParentId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_ID), null);
    }

    /**
     * 判断 「上级消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentId() {
        return this._contains(FIELD_PARENT_ID);
    }

    /**
     * 重置 「上级消息」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetParentId() {
        this._reset(FIELD_PARENT_ID);
        return this;
    }

    /**
     * 设置「别名域」
     * @param val
     */
    @JsonProperty(FIELD_RECORD_ALIAS_DOMAIN_ID)
    public MailComposeMessageDTO setRecordAliasDomainId(String val) {
        this._set(FIELD_RECORD_ALIAS_DOMAIN_ID, val);
        return this;
    }

    /**
     * 获取「别名域」值
     *
     */
    @JsonIgnore
    public String getRecordAliasDomainId() {
        return DataTypeUtils.asString(this._get(FIELD_RECORD_ALIAS_DOMAIN_ID), null);
    }

    /**
     * 判断 「别名域」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRecordAliasDomainId() {
        return this._contains(FIELD_RECORD_ALIAS_DOMAIN_ID);
    }

    /**
     * 重置 「别名域」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetRecordAliasDomainId() {
        this._reset(FIELD_RECORD_ALIAS_DOMAIN_ID);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_RECORD_COMPANY_ID)
    public MailComposeMessageDTO setRecordCompanyId(String val) {
        this._set(FIELD_RECORD_COMPANY_ID, val);
        return this;
    }

    /**
     * 获取「公司」值
     *
     */
    @JsonIgnore
    public String getRecordCompanyId() {
        return DataTypeUtils.asString(this._get(FIELD_RECORD_COMPANY_ID), null);
    }

    /**
     * 判断 「公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRecordCompanyId() {
        return this._contains(FIELD_RECORD_COMPANY_ID);
    }

    /**
     * 重置 「公司」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetRecordCompanyId() {
        this._reset(FIELD_RECORD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「记录名称」
     * @param val
     */
    @JsonProperty(FIELD_RECORD_NAME)
    public MailComposeMessageDTO setRecordName(String val) {
        this._set(FIELD_RECORD_NAME, val);
        return this;
    }

    /**
     * 获取「记录名称」值
     *
     */
    @JsonIgnore
    public String getRecordName() {
        return DataTypeUtils.asString(this._get(FIELD_RECORD_NAME), null);
    }

    /**
     * 判断 「记录名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRecordName() {
        return this._contains(FIELD_RECORD_NAME);
    }

    /**
     * 重置 「记录名称」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetRecordName() {
        this._reset(FIELD_RECORD_NAME);
        return this;
    }

    /**
     * 设置「渲染模型」
     * @param val
     */
    @JsonProperty(FIELD_RENDER_MODEL)
    public MailComposeMessageDTO setRenderModel(String val) {
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
    public MailComposeMessageDTO resetRenderModel() {
        this._reset(FIELD_RENDER_MODEL);
        return this;
    }

    /**
     * 设置「回复」
     * @param val
     */
    @JsonProperty(FIELD_REPLY_TO)
    public MailComposeMessageDTO setReplyTo(String val) {
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
    public MailComposeMessageDTO resetReplyTo() {
        this._reset(FIELD_REPLY_TO);
        return this;
    }

    /**
     * 设置「视答案为新线程」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_REPLY_TO_FORCE_NEW)
    public MailComposeMessageDTO setReplyToForceNew(Integer val) {
        this._set(FIELD_REPLY_TO_FORCE_NEW, val);
        return this;
    }

    /**
     * 获取「视答案为新线程」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getReplyToForceNew() {
        return DataTypeUtils.asInteger(this._get(FIELD_REPLY_TO_FORCE_NEW), null);
    }

    /**
     * 判断 「视答案为新线程」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReplyToForceNew() {
        return this._contains(FIELD_REPLY_TO_FORCE_NEW);
    }

    /**
     * 重置 「视答案为新线程」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetReplyToForceNew() {
        this._reset(FIELD_REPLY_TO_FORCE_NEW);
        return this;
    }

    /**
     * 设置「回复」
     * 代码表[回复]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_compose_message_reply_to_mode
     * @param val
     */
    @JsonProperty(FIELD_REPLY_TO_MODE)
    public MailComposeMessageDTO setReplyToMode(String val) {
        this._set(FIELD_REPLY_TO_MODE, val);
        return this;
    }

    /**
     * 获取「回复」值
     * 代码表[回复]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_compose_message_reply_to_mode
     *
     */
    @JsonIgnore
    public String getReplyToMode() {
        return DataTypeUtils.asString(this._get(FIELD_REPLY_TO_MODE), null);
    }

    /**
     * 判断 「回复」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReplyToMode() {
        return this._contains(FIELD_REPLY_TO_MODE);
    }

    /**
     * 重置 「回复」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetReplyToMode() {
        this._reset(FIELD_REPLY_TO_MODE);
        return this;
    }

    /**
     * 设置「有效的域」
     * @param val
     */
    @JsonProperty(FIELD_RES_DOMAIN)
    public MailComposeMessageDTO setResDomain(String val) {
        this._set(FIELD_RES_DOMAIN, val);
        return this;
    }

    /**
     * 获取「有效的域」值
     *
     */
    @JsonIgnore
    public String getResDomain() {
        return DataTypeUtils.asString(this._get(FIELD_RES_DOMAIN), null);
    }

    /**
     * 判断 「有效的域」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResDomain() {
        return this._contains(FIELD_RES_DOMAIN);
    }

    /**
     * 重置 「有效的域」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetResDomain() {
        this._reset(FIELD_RES_DOMAIN);
        return this;
    }

    /**
     * 设置「负责人」
     * @param val
     */
    @JsonProperty(FIELD_RES_DOMAIN_USER_ID)
    public MailComposeMessageDTO setResDomainUserId(String val) {
        this._set(FIELD_RES_DOMAIN_USER_ID, val);
        return this;
    }

    /**
     * 获取「负责人」值
     *
     */
    @JsonIgnore
    public String getResDomainUserId() {
        return DataTypeUtils.asString(this._get(FIELD_RES_DOMAIN_USER_ID), null);
    }

    /**
     * 判断 「负责人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResDomainUserId() {
        return this._contains(FIELD_RES_DOMAIN_USER_ID);
    }

    /**
     * 重置 「负责人」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetResDomainUserId() {
        this._reset(FIELD_RES_DOMAIN_USER_ID);
        return this;
    }

    /**
     * 设置「相关文档 ID」
     * @param val
     */
    @JsonProperty(FIELD_RES_IDS)
    public MailComposeMessageDTO setResIds(String val) {
        this._set(FIELD_RES_IDS, val);
        return this;
    }

    /**
     * 获取「相关文档 ID」值
     *
     */
    @JsonIgnore
    public String getResIds() {
        return DataTypeUtils.asString(this._get(FIELD_RES_IDS), null);
    }

    /**
     * 判断 「相关文档 ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResIds() {
        return this._contains(FIELD_RES_IDS);
    }

    /**
     * 重置 「相关文档 ID」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetResIds() {
        this._reset(FIELD_RES_IDS);
        return this;
    }

    /**
     * 设置「安排的日期」
     * @param val
     */
    @JsonProperty(FIELD_SCHEDULED_DATE)
    public MailComposeMessageDTO setScheduledDate(String val) {
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
    public MailComposeMessageDTO resetScheduledDate() {
        this._reset(FIELD_SCHEDULED_DATE);
        return this;
    }

    /**
     * 设置「主旨」
     * @param val
     */
    @JsonProperty(FIELD_SUBJECT)
    public MailComposeMessageDTO setSubject(String val) {
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
    public MailComposeMessageDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「子类型」
     * @param val
     */
    @JsonProperty(FIELD_SUBTYPE_ID)
    public MailComposeMessageDTO setSubtypeId(String val) {
        this._set(FIELD_SUBTYPE_ID, val);
        return this;
    }

    /**
     * 获取「子类型」值
     *
     */
    @JsonIgnore
    public String getSubtypeId() {
        return DataTypeUtils.asString(this._get(FIELD_SUBTYPE_ID), null);
    }

    /**
     * 判断 「子类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSubtypeId() {
        return this._contains(FIELD_SUBTYPE_ID);
    }

    /**
     * 重置 「子类型」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetSubtypeId() {
        this._reset(FIELD_SUBTYPE_ID);
        return this;
    }

    /**
     * 设置「是系统日志」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SUBTYPE_IS_LOG)
    public MailComposeMessageDTO setSubtypeIsLog(Integer val) {
        this._set(FIELD_SUBTYPE_IS_LOG, val);
        return this;
    }

    /**
     * 获取「是系统日志」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSubtypeIsLog() {
        return DataTypeUtils.asInteger(this._get(FIELD_SUBTYPE_IS_LOG), null);
    }

    /**
     * 判断 「是系统日志」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSubtypeIsLog() {
        return this._contains(FIELD_SUBTYPE_IS_LOG);
    }

    /**
     * 重置 「是系统日志」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetSubtypeIsLog() {
        this._reset(FIELD_SUBTYPE_IS_LOG);
        return this;
    }

    /**
     * 设置「使用模版」
     * @param val
     */
    @JsonProperty(FIELD_TEMPLATE_ID)
    public MailComposeMessageDTO setTemplateId(String val) {
        this._set(FIELD_TEMPLATE_ID, val);
        return this;
    }

    /**
     * 获取「使用模版」值
     *
     */
    @JsonIgnore
    public String getTemplateId() {
        return DataTypeUtils.asString(this._get(FIELD_TEMPLATE_ID), null);
    }

    /**
     * 判断 「使用模版」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTemplateId() {
        return this._contains(FIELD_TEMPLATE_ID);
    }

    /**
     * 重置 「使用模版」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetTemplateId() {
        this._reset(FIELD_TEMPLATE_ID);
        return this;
    }

    /**
     * 设置「模板名称」
     * @param val
     */
    @JsonProperty(FIELD_TEMPLATE_NAME)
    public MailComposeMessageDTO setTemplateName(String val) {
        this._set(FIELD_TEMPLATE_NAME, val);
        return this;
    }

    /**
     * 获取「模板名称」值
     *
     */
    @JsonIgnore
    public String getTemplateName() {
        return DataTypeUtils.asString(this._get(FIELD_TEMPLATE_NAME), null);
    }

    /**
     * 判断 「模板名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTemplateName() {
        return this._contains(FIELD_TEMPLATE_NAME);
    }

    /**
     * 重置 「模板名称」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetTemplateName() {
        this._reset(FIELD_TEMPLATE_NAME);
        return this;
    }

    /**
     * 设置「检查排除清单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_EXCLUSION_LIST)
    public MailComposeMessageDTO setUseExclusionList(Integer val) {
        this._set(FIELD_USE_EXCLUSION_LIST, val);
        return this;
    }

    /**
     * 获取「检查排除清单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUseExclusionList() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_EXCLUSION_LIST), null);
    }

    /**
     * 判断 「检查排除清单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUseExclusionList() {
        return this._contains(FIELD_USE_EXCLUSION_LIST);
    }

    /**
     * 重置 「检查排除清单」
     *
     */
    @JsonIgnore
    public MailComposeMessageDTO resetUseExclusionList() {
        this._reset(FIELD_USE_EXCLUSION_LIST);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailComposeMessageDTO setWriteDate(Timestamp val) {
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
    public MailComposeMessageDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailComposeMessageDTO setWriteUid(String val) {
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
    public MailComposeMessageDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
