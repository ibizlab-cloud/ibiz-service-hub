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


public class MailMessageDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 收藏计数
     */
    public final static String FIELD_FAVORITE_COUNT = "favorite_count";

    /**
     * 属性: 收藏
     */
    public final static String FIELD_IS_FAVORITE = "is_favorite";

    /**
     * 属性: 资源标识
     */
    public final static String FIELD_RES_ID = "res_id";

    /**
     * 属性: 上级消息内容
     */
    public final static String FIELD_PARENT_BODY = "parent_body";

    /**
     * 属性: 上级消息作者
     */
    public final static String FIELD_PARENT_AUTHOR_ID = "parent_author_id";

    /**
     * 属性: 审计日志已启动
     */
    public final static String FIELD_ACCOUNT_AUDIT_LOG_ACTIVATED = "account_audit_log_activated";

    /**
     * 属性: 描述
     */
    public final static String FIELD_ACCOUNT_AUDIT_LOG_PREVIEW = "account_audit_log_preview";

    /**
     * 属性: 访客
     */
    public final static String FIELD_AUTHOR_GUEST_ID = "author_guest_id";

    /**
     * 属性: 作者
     */
    public final static String FIELD_AUTHOR_ID = "author_id";

    /**
     * 属性: 内容
     */
    public final static String FIELD_BODY = "body";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 日期
     */
    public final static String FIELD_DATE = "date";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 电子邮件添加签字
     */
    public final static String FIELD_EMAIL_ADD_SIGNATURE = "email_add_signature";

    /**
     * 属性: 来自
     */
    public final static String FIELD_EMAIL_FROM = "email_from";

    /**
     * 属性: 布局
     */
    public final static String FIELD_EMAIL_LAYOUT_XMLID = "email_layout_xmlid";

    /**
     * 属性: 有错误
     */
    public final static String FIELD_HAS_ERROR = "has_error";

    /**
     * 属性: 有短信息错误
     */
    public final static String FIELD_HAS_SMS_ERROR = "has_sms_error";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 是当前用户还是访客作者
     */
    public final static String FIELD_IS_CURRENT_USER_OR_GUEST_AUTHOR = "is_current_user_or_guest_author";

    /**
     * 属性: 仅限员工
     */
    public final static String FIELD_IS_INTERNAL = "is_internal";

    /**
     * 属性: 邮件活动类型
     */
    public final static String FIELD_MAIL_ACTIVITY_TYPE_ID = "mail_activity_type_id";

    /**
     * 属性: 消息ID
     */
    public final static String FIELD_MESSAGE_ID = "message_id";

    /**
     * 属性: 类型
     */
    public final static String FIELD_MESSAGE_TYPE = "message_type";

    /**
     * 属性: 相关单据模型
     */
    public final static String FIELD_MODEL = "model";

    /**
     * 属性: 需要行动
     */
    public final static String FIELD_NEEDACTION = "needaction";

    /**
     * 属性: 上级消息
     */
    public final static String FIELD_PARENT_ID = "parent_id";

    /**
     * 属性: 已置顶
     */
    public final static String FIELD_PINNED_AT = "pinned_at";

    /**
     * 属性: 预览
     */
    public final static String FIELD_PREVIEW = "preview";

    /**
     * 属性: 评级值
     */
    public final static String FIELD_RATING_VALUE = "rating_value";

    /**
     * 属性: 别名域
     */
    public final static String FIELD_RECORD_ALIAS_DOMAIN_ID = "record_alias_domain_id";

    /**
     * 属性: 公司
     */
    public final static String FIELD_RECORD_COMPANY_ID = "record_company_id";

    /**
     * 属性: 消息记录名称
     */
    public final static String FIELD_RECORD_NAME = "record_name";

    /**
     * 属性: 回复 至
     */
    public final static String FIELD_REPLY_TO = "reply_to";

    /**
     * 属性: 无响应
     */
    public final static String FIELD_REPLY_TO_FORCE_NEW = "reply_to_force_new";

    /**
     * 属性: 蜗牛邮件错误消息
     */
    public final static String FIELD_SNAILMAIL_ERROR = "snailmail_error";

    /**
     * 属性: 星标消息
     */
    public final static String FIELD_STARRED = "starred";

    /**
     * 属性: 主旨
     */
    public final static String FIELD_SUBJECT = "subject";

    /**
     * 属性: 子类型
     */
    public final static String FIELD_SUBTYPE_ID = "subtype_id";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 属性: null
     */
    public final static String FIELD_MAIL_TRACKING_VALUES = "mail_tracking_values";

    /**
     * 设置「收藏计数」
     * @param val
     */
    @JsonProperty(FIELD_FAVORITE_COUNT)
    public MailMessageDTO setFavoriteCount(Integer val) {
        this._set(FIELD_FAVORITE_COUNT, val);
        return this;
    }

    /**
     * 获取「收藏计数」值
     *
     */
    @JsonIgnore
    public Integer getFavoriteCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_FAVORITE_COUNT), null);
    }

    /**
     * 判断 「收藏计数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFavoriteCount() {
        return this._contains(FIELD_FAVORITE_COUNT);
    }

    /**
     * 重置 「收藏计数」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetFavoriteCount() {
        this._reset(FIELD_FAVORITE_COUNT);
        return this;
    }

    /**
     * 设置「收藏」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_FAVORITE)
    public MailMessageDTO setIsFavorite(Integer val) {
        this._set(FIELD_IS_FAVORITE, val);
        return this;
    }

    /**
     * 获取「收藏」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsFavorite() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_FAVORITE), null);
    }

    /**
     * 判断 「收藏」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsFavorite() {
        return this._contains(FIELD_IS_FAVORITE);
    }

    /**
     * 重置 「收藏」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetIsFavorite() {
        this._reset(FIELD_IS_FAVORITE);
        return this;
    }

    /**
     * 设置「资源标识」
     * @param val
     */
    @JsonProperty(FIELD_RES_ID)
    public MailMessageDTO setResId(String val) {
        this._set(FIELD_RES_ID, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
     */
    @JsonIgnore
    public String getResId() {
        return DataTypeUtils.asString(this._get(FIELD_RES_ID), null);
    }

    /**
     * 判断 「资源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResId() {
        return this._contains(FIELD_RES_ID);
    }

    /**
     * 重置 「资源标识」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetResId() {
        this._reset(FIELD_RES_ID);
        return this;
    }

    /**
     * 设置「上级消息内容」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_BODY)
    public MailMessageDTO setParentBody(String val) {
        this._set(FIELD_PARENT_BODY, val);
        return this;
    }

    /**
     * 获取「上级消息内容」值
     *
     */
    @JsonIgnore
    public String getParentBody() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_BODY), null);
    }

    /**
     * 判断 「上级消息内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentBody() {
        return this._contains(FIELD_PARENT_BODY);
    }

    /**
     * 重置 「上级消息内容」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetParentBody() {
        this._reset(FIELD_PARENT_BODY);
        return this;
    }

    /**
     * 设置「上级消息作者」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_AUTHOR_ID)
    public MailMessageDTO setParentAuthorId(String val) {
        this._set(FIELD_PARENT_AUTHOR_ID, val);
        return this;
    }

    /**
     * 获取「上级消息作者」值
     *
     */
    @JsonIgnore
    public String getParentAuthorId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_AUTHOR_ID), null);
    }

    /**
     * 判断 「上级消息作者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentAuthorId() {
        return this._contains(FIELD_PARENT_AUTHOR_ID);
    }

    /**
     * 重置 「上级消息作者」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetParentAuthorId() {
        this._reset(FIELD_PARENT_AUTHOR_ID);
        return this;
    }

    /**
     * 设置「审计日志已启动」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACCOUNT_AUDIT_LOG_ACTIVATED)
    public MailMessageDTO setAccountAuditLogActivated(Integer val) {
        this._set(FIELD_ACCOUNT_AUDIT_LOG_ACTIVATED, val);
        return this;
    }

    /**
     * 获取「审计日志已启动」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAccountAuditLogActivated() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACCOUNT_AUDIT_LOG_ACTIVATED), null);
    }

    /**
     * 判断 「审计日志已启动」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccountAuditLogActivated() {
        return this._contains(FIELD_ACCOUNT_AUDIT_LOG_ACTIVATED);
    }

    /**
     * 重置 「审计日志已启动」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetAccountAuditLogActivated() {
        this._reset(FIELD_ACCOUNT_AUDIT_LOG_ACTIVATED);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_ACCOUNT_AUDIT_LOG_PREVIEW)
    public MailMessageDTO setAccountAuditLogPreview(String val) {
        this._set(FIELD_ACCOUNT_AUDIT_LOG_PREVIEW, val);
        return this;
    }

    /**
     * 获取「描述」值
     *
     */
    @JsonIgnore
    public String getAccountAuditLogPreview() {
        return DataTypeUtils.asString(this._get(FIELD_ACCOUNT_AUDIT_LOG_PREVIEW), null);
    }

    /**
     * 判断 「描述」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccountAuditLogPreview() {
        return this._contains(FIELD_ACCOUNT_AUDIT_LOG_PREVIEW);
    }

    /**
     * 重置 「描述」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetAccountAuditLogPreview() {
        this._reset(FIELD_ACCOUNT_AUDIT_LOG_PREVIEW);
        return this;
    }

    /**
     * 设置「访客」
     * @param val
     */
    @JsonProperty(FIELD_AUTHOR_GUEST_ID)
    public MailMessageDTO setAuthorGuestId(String val) {
        this._set(FIELD_AUTHOR_GUEST_ID, val);
        return this;
    }

    /**
     * 获取「访客」值
     *
     */
    @JsonIgnore
    public String getAuthorGuestId() {
        return DataTypeUtils.asString(this._get(FIELD_AUTHOR_GUEST_ID), null);
    }

    /**
     * 判断 「访客」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthorGuestId() {
        return this._contains(FIELD_AUTHOR_GUEST_ID);
    }

    /**
     * 重置 「访客」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetAuthorGuestId() {
        this._reset(FIELD_AUTHOR_GUEST_ID);
        return this;
    }

    /**
     * 设置「作者」
     * @param val
     */
    @JsonProperty(FIELD_AUTHOR_ID)
    public MailMessageDTO setAuthorId(String val) {
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
    public MailMessageDTO resetAuthorId() {
        this._reset(FIELD_AUTHOR_ID);
        return this;
    }

    /**
     * 设置「内容」
     * @param val
     */
    @JsonProperty(FIELD_BODY)
    public MailMessageDTO setBody(String val) {
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
    public MailMessageDTO resetBody() {
        this._reset(FIELD_BODY);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailMessageDTO setCreateDate(Timestamp val) {
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
    public MailMessageDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailMessageDTO setCreateUid(String val) {
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
    public MailMessageDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE)
    public MailMessageDTO setDate(Timestamp val) {
        this._set(FIELD_DATE, val);
        return this;
    }

    /**
     * 获取「日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DATE), null);
    }

    /**
     * 判断 「日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDate() {
        return this._contains(FIELD_DATE);
    }

    /**
     * 重置 「日期」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetDate() {
        this._reset(FIELD_DATE);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailMessageDTO setDisplayName(String val) {
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
    public MailMessageDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「电子邮件添加签字」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_ADD_SIGNATURE)
    public MailMessageDTO setEmailAddSignature(Integer val) {
        this._set(FIELD_EMAIL_ADD_SIGNATURE, val);
        return this;
    }

    /**
     * 获取「电子邮件添加签字」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getEmailAddSignature() {
        return DataTypeUtils.asInteger(this._get(FIELD_EMAIL_ADD_SIGNATURE), null);
    }

    /**
     * 判断 「电子邮件添加签字」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailAddSignature() {
        return this._contains(FIELD_EMAIL_ADD_SIGNATURE);
    }

    /**
     * 重置 「电子邮件添加签字」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetEmailAddSignature() {
        this._reset(FIELD_EMAIL_ADD_SIGNATURE);
        return this;
    }

    /**
     * 设置「来自」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_FROM)
    public MailMessageDTO setEmailFrom(String val) {
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
    public MailMessageDTO resetEmailFrom() {
        this._reset(FIELD_EMAIL_FROM);
        return this;
    }

    /**
     * 设置「布局」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_LAYOUT_XMLID)
    public MailMessageDTO setEmailLayoutXmlid(String val) {
        this._set(FIELD_EMAIL_LAYOUT_XMLID, val);
        return this;
    }

    /**
     * 获取「布局」值
     *
     */
    @JsonIgnore
    public String getEmailLayoutXmlid() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_LAYOUT_XMLID), null);
    }

    /**
     * 判断 「布局」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailLayoutXmlid() {
        return this._contains(FIELD_EMAIL_LAYOUT_XMLID);
    }

    /**
     * 重置 「布局」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetEmailLayoutXmlid() {
        this._reset(FIELD_EMAIL_LAYOUT_XMLID);
        return this;
    }

    /**
     * 设置「有错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_ERROR)
    public MailMessageDTO setHasError(Integer val) {
        this._set(FIELD_HAS_ERROR, val);
        return this;
    }

    /**
     * 获取「有错误」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasError() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_ERROR), null);
    }

    /**
     * 判断 「有错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasError() {
        return this._contains(FIELD_HAS_ERROR);
    }

    /**
     * 重置 「有错误」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetHasError() {
        this._reset(FIELD_HAS_ERROR);
        return this;
    }

    /**
     * 设置「有短信息错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_SMS_ERROR)
    public MailMessageDTO setHasSmsError(Integer val) {
        this._set(FIELD_HAS_SMS_ERROR, val);
        return this;
    }

    /**
     * 获取「有短信息错误」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasSmsError() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_SMS_ERROR), null);
    }

    /**
     * 判断 「有短信息错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasSmsError() {
        return this._contains(FIELD_HAS_SMS_ERROR);
    }

    /**
     * 重置 「有短信息错误」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetHasSmsError() {
        this._reset(FIELD_HAS_SMS_ERROR);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailMessageDTO setId(String val) {
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
    public MailMessageDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「是当前用户还是访客作者」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_CURRENT_USER_OR_GUEST_AUTHOR)
    public MailMessageDTO setIsCurrentUserOrGuestAuthor(Integer val) {
        this._set(FIELD_IS_CURRENT_USER_OR_GUEST_AUTHOR, val);
        return this;
    }

    /**
     * 获取「是当前用户还是访客作者」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsCurrentUserOrGuestAuthor() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_CURRENT_USER_OR_GUEST_AUTHOR), null);
    }

    /**
     * 判断 「是当前用户还是访客作者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsCurrentUserOrGuestAuthor() {
        return this._contains(FIELD_IS_CURRENT_USER_OR_GUEST_AUTHOR);
    }

    /**
     * 重置 「是当前用户还是访客作者」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetIsCurrentUserOrGuestAuthor() {
        this._reset(FIELD_IS_CURRENT_USER_OR_GUEST_AUTHOR);
        return this;
    }

    /**
     * 设置「仅限员工」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_INTERNAL)
    public MailMessageDTO setIsInternal(Integer val) {
        this._set(FIELD_IS_INTERNAL, val);
        return this;
    }

    /**
     * 获取「仅限员工」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsInternal() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_INTERNAL), null);
    }

    /**
     * 判断 「仅限员工」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsInternal() {
        return this._contains(FIELD_IS_INTERNAL);
    }

    /**
     * 重置 「仅限员工」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetIsInternal() {
        this._reset(FIELD_IS_INTERNAL);
        return this;
    }

    /**
     * 设置「邮件活动类型」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_ACTIVITY_TYPE_ID)
    public MailMessageDTO setMailActivityTypeId(String val) {
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
    public MailMessageDTO resetMailActivityTypeId() {
        this._reset(FIELD_MAIL_ACTIVITY_TYPE_ID);
        return this;
    }

    /**
     * 设置「消息ID」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ID)
    public MailMessageDTO setMessageId(String val) {
        this._set(FIELD_MESSAGE_ID, val);
        return this;
    }

    /**
     * 获取「消息ID」值
     *
     */
    @JsonIgnore
    public String getMessageId() {
        return DataTypeUtils.asString(this._get(FIELD_MESSAGE_ID), null);
    }

    /**
     * 判断 「消息ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageId() {
        return this._contains(FIELD_MESSAGE_ID);
    }

    /**
     * 重置 「消息ID」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetMessageId() {
        this._reset(FIELD_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_message_message_type
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_TYPE)
    public MailMessageDTO setMessageType(String val) {
        this._set(FIELD_MESSAGE_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_message_message_type
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
    public MailMessageDTO resetMessageType() {
        this._reset(FIELD_MESSAGE_TYPE);
        return this;
    }

    /**
     * 设置「相关单据模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL)
    public MailMessageDTO setModel(String val) {
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
    public MailMessageDTO resetModel() {
        this._reset(FIELD_MODEL);
        return this;
    }

    /**
     * 设置「需要行动」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_NEEDACTION)
    public MailMessageDTO setNeedaction(Integer val) {
        this._set(FIELD_NEEDACTION, val);
        return this;
    }

    /**
     * 获取「需要行动」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getNeedaction() {
        return DataTypeUtils.asInteger(this._get(FIELD_NEEDACTION), null);
    }

    /**
     * 判断 「需要行动」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNeedaction() {
        return this._contains(FIELD_NEEDACTION);
    }

    /**
     * 重置 「需要行动」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetNeedaction() {
        this._reset(FIELD_NEEDACTION);
        return this;
    }

    /**
     * 设置「上级消息」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_ID)
    public MailMessageDTO setParentId(String val) {
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
    public MailMessageDTO resetParentId() {
        this._reset(FIELD_PARENT_ID);
        return this;
    }

    /**
     * 设置「已置顶」
     * @param val
     */
    @JsonProperty(FIELD_PINNED_AT)
    public MailMessageDTO setPinnedAt(Timestamp val) {
        this._set(FIELD_PINNED_AT, val);
        return this;
    }

    /**
     * 获取「已置顶」值
     *
     */
    @JsonIgnore
    public Timestamp getPinnedAt() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_PINNED_AT), null);
    }

    /**
     * 判断 「已置顶」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPinnedAt() {
        return this._contains(FIELD_PINNED_AT);
    }

    /**
     * 重置 「已置顶」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetPinnedAt() {
        this._reset(FIELD_PINNED_AT);
        return this;
    }

    /**
     * 设置「预览」
     * @param val
     */
    @JsonProperty(FIELD_PREVIEW)
    public MailMessageDTO setPreview(String val) {
        this._set(FIELD_PREVIEW, val);
        return this;
    }

    /**
     * 获取「预览」值
     *
     */
    @JsonIgnore
    public String getPreview() {
        return DataTypeUtils.asString(this._get(FIELD_PREVIEW), null);
    }

    /**
     * 判断 「预览」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPreview() {
        return this._contains(FIELD_PREVIEW);
    }

    /**
     * 重置 「预览」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetPreview() {
        this._reset(FIELD_PREVIEW);
        return this;
    }

    /**
     * 设置「评级值」
     * @param val
     */
    @JsonProperty(FIELD_RATING_VALUE)
    public MailMessageDTO setRatingValue(Double val) {
        this._set(FIELD_RATING_VALUE, val);
        return this;
    }

    /**
     * 获取「评级值」值
     *
     */
    @JsonIgnore
    public Double getRatingValue() {
        return DataTypeUtils.asDouble(this._get(FIELD_RATING_VALUE), null);
    }

    /**
     * 判断 「评级值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRatingValue() {
        return this._contains(FIELD_RATING_VALUE);
    }

    /**
     * 重置 「评级值」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetRatingValue() {
        this._reset(FIELD_RATING_VALUE);
        return this;
    }

    /**
     * 设置「别名域」
     * @param val
     */
    @JsonProperty(FIELD_RECORD_ALIAS_DOMAIN_ID)
    public MailMessageDTO setRecordAliasDomainId(String val) {
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
    public MailMessageDTO resetRecordAliasDomainId() {
        this._reset(FIELD_RECORD_ALIAS_DOMAIN_ID);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_RECORD_COMPANY_ID)
    public MailMessageDTO setRecordCompanyId(String val) {
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
    public MailMessageDTO resetRecordCompanyId() {
        this._reset(FIELD_RECORD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「消息记录名称」
     * @param val
     */
    @JsonProperty(FIELD_RECORD_NAME)
    public MailMessageDTO setRecordName(String val) {
        this._set(FIELD_RECORD_NAME, val);
        return this;
    }

    /**
     * 获取「消息记录名称」值
     *
     */
    @JsonIgnore
    public String getRecordName() {
        return DataTypeUtils.asString(this._get(FIELD_RECORD_NAME), null);
    }

    /**
     * 判断 「消息记录名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRecordName() {
        return this._contains(FIELD_RECORD_NAME);
    }

    /**
     * 重置 「消息记录名称」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetRecordName() {
        this._reset(FIELD_RECORD_NAME);
        return this;
    }

    /**
     * 设置「回复 至」
     * @param val
     */
    @JsonProperty(FIELD_REPLY_TO)
    public MailMessageDTO setReplyTo(String val) {
        this._set(FIELD_REPLY_TO, val);
        return this;
    }

    /**
     * 获取「回复 至」值
     *
     */
    @JsonIgnore
    public String getReplyTo() {
        return DataTypeUtils.asString(this._get(FIELD_REPLY_TO), null);
    }

    /**
     * 判断 「回复 至」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReplyTo() {
        return this._contains(FIELD_REPLY_TO);
    }

    /**
     * 重置 「回复 至」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetReplyTo() {
        this._reset(FIELD_REPLY_TO);
        return this;
    }

    /**
     * 设置「无响应」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_REPLY_TO_FORCE_NEW)
    public MailMessageDTO setReplyToForceNew(Integer val) {
        this._set(FIELD_REPLY_TO_FORCE_NEW, val);
        return this;
    }

    /**
     * 获取「无响应」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getReplyToForceNew() {
        return DataTypeUtils.asInteger(this._get(FIELD_REPLY_TO_FORCE_NEW), null);
    }

    /**
     * 判断 「无响应」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReplyToForceNew() {
        return this._contains(FIELD_REPLY_TO_FORCE_NEW);
    }

    /**
     * 重置 「无响应」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetReplyToForceNew() {
        this._reset(FIELD_REPLY_TO_FORCE_NEW);
        return this;
    }

    /**
     * 设置「蜗牛邮件错误消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SNAILMAIL_ERROR)
    public MailMessageDTO setSnailmailError(Integer val) {
        this._set(FIELD_SNAILMAIL_ERROR, val);
        return this;
    }

    /**
     * 获取「蜗牛邮件错误消息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSnailmailError() {
        return DataTypeUtils.asInteger(this._get(FIELD_SNAILMAIL_ERROR), null);
    }

    /**
     * 判断 「蜗牛邮件错误消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSnailmailError() {
        return this._contains(FIELD_SNAILMAIL_ERROR);
    }

    /**
     * 重置 「蜗牛邮件错误消息」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetSnailmailError() {
        this._reset(FIELD_SNAILMAIL_ERROR);
        return this;
    }

    /**
     * 设置「星标消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_STARRED)
    public MailMessageDTO setStarred(Integer val) {
        this._set(FIELD_STARRED, val);
        return this;
    }

    /**
     * 获取「星标消息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getStarred() {
        return DataTypeUtils.asInteger(this._get(FIELD_STARRED), null);
    }

    /**
     * 判断 「星标消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStarred() {
        return this._contains(FIELD_STARRED);
    }

    /**
     * 重置 「星标消息」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetStarred() {
        this._reset(FIELD_STARRED);
        return this;
    }

    /**
     * 设置「主旨」
     * @param val
     */
    @JsonProperty(FIELD_SUBJECT)
    public MailMessageDTO setSubject(String val) {
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
    public MailMessageDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「子类型」
     * @param val
     */
    @JsonProperty(FIELD_SUBTYPE_ID)
    public MailMessageDTO setSubtypeId(String val) {
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
    public MailMessageDTO resetSubtypeId() {
        this._reset(FIELD_SUBTYPE_ID);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailMessageDTO setWriteDate(Timestamp val) {
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
    public MailMessageDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailMessageDTO setWriteUid(String val) {
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
    public MailMessageDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

    /**
     * 设置「null」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_TRACKING_VALUES)
    public MailMessageDTO setMailTrackingValues(List<MailTrackingValueDTO> val) {
        this._set(FIELD_MAIL_TRACKING_VALUES, val);
        return this;
    }

    /**
     * 获取「null」值
     *
     */
    @JsonIgnore
    public List<MailTrackingValueDTO> getMailTrackingValues() {
        return (List<MailTrackingValueDTO>) this._get(FIELD_MAIL_TRACKING_VALUES);
    }

    /**
     * 判断 「null」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailTrackingValues() {
        return this._contains(FIELD_MAIL_TRACKING_VALUES);
    }

    /**
     * 重置 「null」
     *
     */
    @JsonIgnore
    public MailMessageDTO resetMailTrackingValues() {
        this._reset(FIELD_MAIL_TRACKING_VALUES);
        return this;
    }

}
