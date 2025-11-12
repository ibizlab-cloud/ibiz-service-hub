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


public class MailAliasDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 模型别名
     */
    public final static String FIELD_ALIAS_MODEL_ID = "alias_model_id";

    /**
     * 属性: 上级模型
     */
    public final static String FIELD_ALIAS_PARENT_MODEL_ID = "alias_parent_model_id";

    /**
     * 属性: 自定义退回消息
     */
    public final static String FIELD_ALIAS_BOUNCED_CONTENT = "alias_bounced_content";

    /**
     * 属性: 别名授权于
     */
    public final static String FIELD_ALIAS_CONTACT = "alias_contact";

    /**
     * 属性: 默认值
     */
    public final static String FIELD_ALIAS_DEFAULTS = "alias_defaults";

    /**
     * 属性: 别名域
     */
    public final static String FIELD_ALIAS_DOMAIN_ID = "alias_domain_id";

    /**
     * 属性: 别名域名称
     */
    public final static String FIELD_ALIAS_DOMAIN_NAME = "alias_domain_name";

    /**
     * 属性: 记录线索ID
     */
    public final static String FIELD_ALIAS_FORCE_THREAD_ID = "alias_force_thread_id";

    /**
     * 属性: 别名电子邮件
     */
    public final static String FIELD_ALIAS_FULL_NAME = "alias_full_name";

    /**
     * 属性: 收件时检测本地的别名域
     */
    public final static String FIELD_ALIAS_INCOMING_LOCAL = "alias_incoming_local";

    /**
     * 属性: 别名
     */
    public final static String FIELD_ALIAS_NAME = "alias_name";

    /**
     * 属性: 上级记录ID
     */
    public final static String FIELD_ALIAS_PARENT_THREAD_ID = "alias_parent_thread_id";

    /**
     * 属性: 别名状态
     */
    public final static String FIELD_ALIAS_STATUS = "alias_status";

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
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「模型别名」
     * 代码表[模型]
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_MODEL_ID)
    public MailAliasDTO setAliasModelId(String val) {
        this._set(FIELD_ALIAS_MODEL_ID, val);
        return this;
    }

    /**
     * 获取「模型别名」值
     * 代码表[模型]
     *
     */
    @JsonIgnore
    public String getAliasModelId() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_MODEL_ID), null);
    }

    /**
     * 判断 「模型别名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasModelId() {
        return this._contains(FIELD_ALIAS_MODEL_ID);
    }

    /**
     * 重置 「模型别名」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasModelId() {
        this._reset(FIELD_ALIAS_MODEL_ID);
        return this;
    }

    /**
     * 设置「上级模型」
     * 代码表[模型]
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_PARENT_MODEL_ID)
    public MailAliasDTO setAliasParentModelId(String val) {
        this._set(FIELD_ALIAS_PARENT_MODEL_ID, val);
        return this;
    }

    /**
     * 获取「上级模型」值
     * 代码表[模型]
     *
     */
    @JsonIgnore
    public String getAliasParentModelId() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_PARENT_MODEL_ID), null);
    }

    /**
     * 判断 「上级模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasParentModelId() {
        return this._contains(FIELD_ALIAS_PARENT_MODEL_ID);
    }

    /**
     * 重置 「上级模型」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasParentModelId() {
        this._reset(FIELD_ALIAS_PARENT_MODEL_ID);
        return this;
    }

    /**
     * 设置「自定义退回消息」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_BOUNCED_CONTENT)
    public MailAliasDTO setAliasBouncedContent(String val) {
        this._set(FIELD_ALIAS_BOUNCED_CONTENT, val);
        return this;
    }

    /**
     * 获取「自定义退回消息」值
     *
     */
    @JsonIgnore
    public String getAliasBouncedContent() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_BOUNCED_CONTENT), null);
    }

    /**
     * 判断 「自定义退回消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasBouncedContent() {
        return this._contains(FIELD_ALIAS_BOUNCED_CONTENT);
    }

    /**
     * 重置 「自定义退回消息」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasBouncedContent() {
        this._reset(FIELD_ALIAS_BOUNCED_CONTENT);
        return this;
    }

    /**
     * 设置「别名授权于」
     * 代码表[别名授权于]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_alias_alias_contact
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_CONTACT)
    public MailAliasDTO setAliasContact(String val) {
        this._set(FIELD_ALIAS_CONTACT, val);
        return this;
    }

    /**
     * 获取「别名授权于」值
     * 代码表[别名授权于]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_alias_alias_contact
     *
     */
    @JsonIgnore
    public String getAliasContact() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_CONTACT), null);
    }

    /**
     * 判断 「别名授权于」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasContact() {
        return this._contains(FIELD_ALIAS_CONTACT);
    }

    /**
     * 重置 「别名授权于」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasContact() {
        this._reset(FIELD_ALIAS_CONTACT);
        return this;
    }

    /**
     * 设置「默认值」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_DEFAULTS)
    public MailAliasDTO setAliasDefaults(String val) {
        this._set(FIELD_ALIAS_DEFAULTS, val);
        return this;
    }

    /**
     * 获取「默认值」值
     *
     */
    @JsonIgnore
    public String getAliasDefaults() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_DEFAULTS), null);
    }

    /**
     * 判断 「默认值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasDefaults() {
        return this._contains(FIELD_ALIAS_DEFAULTS);
    }

    /**
     * 重置 「默认值」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasDefaults() {
        this._reset(FIELD_ALIAS_DEFAULTS);
        return this;
    }

    /**
     * 设置「别名域」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_DOMAIN_ID)
    public MailAliasDTO setAliasDomainId(String val) {
        this._set(FIELD_ALIAS_DOMAIN_ID, val);
        return this;
    }

    /**
     * 获取「别名域」值
     *
     */
    @JsonIgnore
    public String getAliasDomainId() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_DOMAIN_ID), null);
    }

    /**
     * 判断 「别名域」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasDomainId() {
        return this._contains(FIELD_ALIAS_DOMAIN_ID);
    }

    /**
     * 重置 「别名域」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasDomainId() {
        this._reset(FIELD_ALIAS_DOMAIN_ID);
        return this;
    }

    /**
     * 设置「别名域名称」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_DOMAIN_NAME)
    public MailAliasDTO setAliasDomainName(String val) {
        this._set(FIELD_ALIAS_DOMAIN_NAME, val);
        return this;
    }

    /**
     * 获取「别名域名称」值
     *
     */
    @JsonIgnore
    public String getAliasDomainName() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_DOMAIN_NAME), null);
    }

    /**
     * 判断 「别名域名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasDomainName() {
        return this._contains(FIELD_ALIAS_DOMAIN_NAME);
    }

    /**
     * 重置 「别名域名称」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasDomainName() {
        this._reset(FIELD_ALIAS_DOMAIN_NAME);
        return this;
    }

    /**
     * 设置「记录线索ID」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_FORCE_THREAD_ID)
    public MailAliasDTO setAliasForceThreadId(Integer val) {
        this._set(FIELD_ALIAS_FORCE_THREAD_ID, val);
        return this;
    }

    /**
     * 获取「记录线索ID」值
     *
     */
    @JsonIgnore
    public Integer getAliasForceThreadId() {
        return DataTypeUtils.asInteger(this._get(FIELD_ALIAS_FORCE_THREAD_ID), null);
    }

    /**
     * 判断 「记录线索ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasForceThreadId() {
        return this._contains(FIELD_ALIAS_FORCE_THREAD_ID);
    }

    /**
     * 重置 「记录线索ID」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasForceThreadId() {
        this._reset(FIELD_ALIAS_FORCE_THREAD_ID);
        return this;
    }

    /**
     * 设置「别名电子邮件」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_FULL_NAME)
    public MailAliasDTO setAliasFullName(String val) {
        this._set(FIELD_ALIAS_FULL_NAME, val);
        return this;
    }

    /**
     * 获取「别名电子邮件」值
     *
     */
    @JsonIgnore
    public String getAliasFullName() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_FULL_NAME), null);
    }

    /**
     * 判断 「别名电子邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasFullName() {
        return this._contains(FIELD_ALIAS_FULL_NAME);
    }

    /**
     * 重置 「别名电子邮件」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasFullName() {
        this._reset(FIELD_ALIAS_FULL_NAME);
        return this;
    }

    /**
     * 设置「收件时检测本地的别名域」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_INCOMING_LOCAL)
    public MailAliasDTO setAliasIncomingLocal(Integer val) {
        this._set(FIELD_ALIAS_INCOMING_LOCAL, val);
        return this;
    }

    /**
     * 获取「收件时检测本地的别名域」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAliasIncomingLocal() {
        return DataTypeUtils.asInteger(this._get(FIELD_ALIAS_INCOMING_LOCAL), null);
    }

    /**
     * 判断 「收件时检测本地的别名域」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasIncomingLocal() {
        return this._contains(FIELD_ALIAS_INCOMING_LOCAL);
    }

    /**
     * 重置 「收件时检测本地的别名域」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasIncomingLocal() {
        this._reset(FIELD_ALIAS_INCOMING_LOCAL);
        return this;
    }

    /**
     * 设置「别名」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_NAME)
    public MailAliasDTO setAliasName(String val) {
        this._set(FIELD_ALIAS_NAME, val);
        return this;
    }

    /**
     * 获取「别名」值
     *
     */
    @JsonIgnore
    public String getAliasName() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_NAME), null);
    }

    /**
     * 判断 「别名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasName() {
        return this._contains(FIELD_ALIAS_NAME);
    }

    /**
     * 重置 「别名」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasName() {
        this._reset(FIELD_ALIAS_NAME);
        return this;
    }

    /**
     * 设置「上级记录ID」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_PARENT_THREAD_ID)
    public MailAliasDTO setAliasParentThreadId(Integer val) {
        this._set(FIELD_ALIAS_PARENT_THREAD_ID, val);
        return this;
    }

    /**
     * 获取「上级记录ID」值
     *
     */
    @JsonIgnore
    public Integer getAliasParentThreadId() {
        return DataTypeUtils.asInteger(this._get(FIELD_ALIAS_PARENT_THREAD_ID), null);
    }

    /**
     * 判断 「上级记录ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasParentThreadId() {
        return this._contains(FIELD_ALIAS_PARENT_THREAD_ID);
    }

    /**
     * 重置 「上级记录ID」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasParentThreadId() {
        this._reset(FIELD_ALIAS_PARENT_THREAD_ID);
        return this;
    }

    /**
     * 设置「别名状态」
     * 代码表[别名状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_alias_alias_status
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_STATUS)
    public MailAliasDTO setAliasStatus(String val) {
        this._set(FIELD_ALIAS_STATUS, val);
        return this;
    }

    /**
     * 获取「别名状态」值
     * 代码表[别名状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_alias_alias_status
     *
     */
    @JsonIgnore
    public String getAliasStatus() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_STATUS), null);
    }

    /**
     * 判断 「别名状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasStatus() {
        return this._contains(FIELD_ALIAS_STATUS);
    }

    /**
     * 重置 「别名状态」
     *
     */
    @JsonIgnore
    public MailAliasDTO resetAliasStatus() {
        this._reset(FIELD_ALIAS_STATUS);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailAliasDTO setCreateDate(Timestamp val) {
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
    public MailAliasDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailAliasDTO setCreateUid(String val) {
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
    public MailAliasDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailAliasDTO setDisplayName(String val) {
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
    public MailAliasDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailAliasDTO setId(String val) {
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
    public MailAliasDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailAliasDTO setWriteDate(Timestamp val) {
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
    public MailAliasDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailAliasDTO setWriteUid(String val) {
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
    public MailAliasDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
