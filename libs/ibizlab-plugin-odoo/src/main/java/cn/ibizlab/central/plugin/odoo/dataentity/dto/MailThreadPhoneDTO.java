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


public class MailThreadPhoneDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 有消息
     */
    public final static String FIELD_HAS_MESSAGE = "has_message";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 附件数量
     */
    public final static String FIELD_MESSAGE_ATTACHMENT_COUNT = "message_attachment_count";

    /**
     * 属性: 消息发送错误
     */
    public final static String FIELD_MESSAGE_HAS_ERROR = "message_has_error";

    /**
     * 属性: 错误数量
     */
    public final static String FIELD_MESSAGE_HAS_ERROR_COUNTER = "message_has_error_counter";

    /**
     * 属性: 短信发送错误
     */
    public final static String FIELD_MESSAGE_HAS_SMS_ERROR = "message_has_sms_error";

    /**
     * 属性: 是关注者
     */
    public final static String FIELD_MESSAGE_IS_FOLLOWER = "message_is_follower";

    /**
     * 属性: 所需操作
     */
    public final static String FIELD_MESSAGE_NEEDACTION = "message_needaction";

    /**
     * 属性: 操作数量
     */
    public final static String FIELD_MESSAGE_NEEDACTION_COUNTER = "message_needaction_counter";

    /**
     * 属性: 列入黑名单的手机是移动的
     */
    public final static String FIELD_MOBILE_BLACKLISTED = "mobile_blacklisted";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 列入黑名单的电话是电话
     */
    public final static String FIELD_PHONE_BLACKLISTED = "phone_blacklisted";

    /**
     * 属性: 电话/手机
     */
    public final static String FIELD_PHONE_MOBILE_SEARCH = "phone_mobile_search";

    /**
     * 属性: 净化数量
     */
    public final static String FIELD_PHONE_SANITIZED = "phone_sanitized";

    /**
     * 属性: 电话号码被列入黑名单
     */
    public final static String FIELD_PHONE_SANITIZED_BLACKLISTED = "phone_sanitized_blacklisted";

    /**
     * 设置「有消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_MESSAGE)
    public MailThreadPhoneDTO setHasMessage(Integer val) {
        this._set(FIELD_HAS_MESSAGE, val);
        return this;
    }

    /**
     * 获取「有消息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasMessage() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_MESSAGE), null);
    }

    /**
     * 判断 「有消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasMessage() {
        return this._contains(FIELD_HAS_MESSAGE);
    }

    /**
     * 重置 「有消息」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetHasMessage() {
        this._reset(FIELD_HAS_MESSAGE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailThreadPhoneDTO setId(String val) {
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
    public MailThreadPhoneDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「附件数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ATTACHMENT_COUNT)
    public MailThreadPhoneDTO setMessageAttachmentCount(Integer val) {
        this._set(FIELD_MESSAGE_ATTACHMENT_COUNT, val);
        return this;
    }

    /**
     * 获取「附件数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageAttachmentCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_ATTACHMENT_COUNT), null);
    }

    /**
     * 判断 「附件数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageAttachmentCount() {
        return this._contains(FIELD_MESSAGE_ATTACHMENT_COUNT);
    }

    /**
     * 重置 「附件数量」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetMessageAttachmentCount() {
        this._reset(FIELD_MESSAGE_ATTACHMENT_COUNT);
        return this;
    }

    /**
     * 设置「消息发送错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR)
    public MailThreadPhoneDTO setMessageHasError(Integer val) {
        this._set(FIELD_MESSAGE_HAS_ERROR, val);
        return this;
    }

    /**
     * 获取「消息发送错误」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageHasError() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_ERROR), null);
    }

    /**
     * 判断 「消息发送错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasError() {
        return this._contains(FIELD_MESSAGE_HAS_ERROR);
    }

    /**
     * 重置 「消息发送错误」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetMessageHasError() {
        this._reset(FIELD_MESSAGE_HAS_ERROR);
        return this;
    }

    /**
     * 设置「错误数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR_COUNTER)
    public MailThreadPhoneDTO setMessageHasErrorCounter(Integer val) {
        this._set(FIELD_MESSAGE_HAS_ERROR_COUNTER, val);
        return this;
    }

    /**
     * 获取「错误数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageHasErrorCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_ERROR_COUNTER), null);
    }

    /**
     * 判断 「错误数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasErrorCounter() {
        return this._contains(FIELD_MESSAGE_HAS_ERROR_COUNTER);
    }

    /**
     * 重置 「错误数量」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetMessageHasErrorCounter() {
        this._reset(FIELD_MESSAGE_HAS_ERROR_COUNTER);
        return this;
    }

    /**
     * 设置「短信发送错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_SMS_ERROR)
    public MailThreadPhoneDTO setMessageHasSmsError(Integer val) {
        this._set(FIELD_MESSAGE_HAS_SMS_ERROR, val);
        return this;
    }

    /**
     * 获取「短信发送错误」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageHasSmsError() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_SMS_ERROR), null);
    }

    /**
     * 判断 「短信发送错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasSmsError() {
        return this._contains(FIELD_MESSAGE_HAS_SMS_ERROR);
    }

    /**
     * 重置 「短信发送错误」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetMessageHasSmsError() {
        this._reset(FIELD_MESSAGE_HAS_SMS_ERROR);
        return this;
    }

    /**
     * 设置「是关注者」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_IS_FOLLOWER)
    public MailThreadPhoneDTO setMessageIsFollower(Integer val) {
        this._set(FIELD_MESSAGE_IS_FOLLOWER, val);
        return this;
    }

    /**
     * 获取「是关注者」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageIsFollower() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_IS_FOLLOWER), null);
    }

    /**
     * 判断 「是关注者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageIsFollower() {
        return this._contains(FIELD_MESSAGE_IS_FOLLOWER);
    }

    /**
     * 重置 「是关注者」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetMessageIsFollower() {
        this._reset(FIELD_MESSAGE_IS_FOLLOWER);
        return this;
    }

    /**
     * 设置「所需操作」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION)
    public MailThreadPhoneDTO setMessageNeedaction(Integer val) {
        this._set(FIELD_MESSAGE_NEEDACTION, val);
        return this;
    }

    /**
     * 获取「所需操作」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageNeedaction() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_NEEDACTION), null);
    }

    /**
     * 判断 「所需操作」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageNeedaction() {
        return this._contains(FIELD_MESSAGE_NEEDACTION);
    }

    /**
     * 重置 「所需操作」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetMessageNeedaction() {
        this._reset(FIELD_MESSAGE_NEEDACTION);
        return this;
    }

    /**
     * 设置「操作数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION_COUNTER)
    public MailThreadPhoneDTO setMessageNeedactionCounter(Integer val) {
        this._set(FIELD_MESSAGE_NEEDACTION_COUNTER, val);
        return this;
    }

    /**
     * 获取「操作数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageNeedactionCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_NEEDACTION_COUNTER), null);
    }

    /**
     * 判断 「操作数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageNeedactionCounter() {
        return this._contains(FIELD_MESSAGE_NEEDACTION_COUNTER);
    }

    /**
     * 重置 「操作数量」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetMessageNeedactionCounter() {
        this._reset(FIELD_MESSAGE_NEEDACTION_COUNTER);
        return this;
    }

    /**
     * 设置「列入黑名单的手机是移动的」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MOBILE_BLACKLISTED)
    public MailThreadPhoneDTO setMobileBlacklisted(Integer val) {
        this._set(FIELD_MOBILE_BLACKLISTED, val);
        return this;
    }

    /**
     * 获取「列入黑名单的手机是移动的」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMobileBlacklisted() {
        return DataTypeUtils.asInteger(this._get(FIELD_MOBILE_BLACKLISTED), null);
    }

    /**
     * 判断 「列入黑名单的手机是移动的」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMobileBlacklisted() {
        return this._contains(FIELD_MOBILE_BLACKLISTED);
    }

    /**
     * 重置 「列入黑名单的手机是移动的」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetMobileBlacklisted() {
        this._reset(FIELD_MOBILE_BLACKLISTED);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailThreadPhoneDTO setName(String val) {
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
    public MailThreadPhoneDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「列入黑名单的电话是电话」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PHONE_BLACKLISTED)
    public MailThreadPhoneDTO setPhoneBlacklisted(Integer val) {
        this._set(FIELD_PHONE_BLACKLISTED, val);
        return this;
    }

    /**
     * 获取「列入黑名单的电话是电话」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPhoneBlacklisted() {
        return DataTypeUtils.asInteger(this._get(FIELD_PHONE_BLACKLISTED), null);
    }

    /**
     * 判断 「列入黑名单的电话是电话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhoneBlacklisted() {
        return this._contains(FIELD_PHONE_BLACKLISTED);
    }

    /**
     * 重置 「列入黑名单的电话是电话」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetPhoneBlacklisted() {
        this._reset(FIELD_PHONE_BLACKLISTED);
        return this;
    }

    /**
     * 设置「电话/手机」
     * @param val
     */
    @JsonProperty(FIELD_PHONE_MOBILE_SEARCH)
    public MailThreadPhoneDTO setPhoneMobileSearch(String val) {
        this._set(FIELD_PHONE_MOBILE_SEARCH, val);
        return this;
    }

    /**
     * 获取「电话/手机」值
     *
     */
    @JsonIgnore
    public String getPhoneMobileSearch() {
        return DataTypeUtils.asString(this._get(FIELD_PHONE_MOBILE_SEARCH), null);
    }

    /**
     * 判断 「电话/手机」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhoneMobileSearch() {
        return this._contains(FIELD_PHONE_MOBILE_SEARCH);
    }

    /**
     * 重置 「电话/手机」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetPhoneMobileSearch() {
        this._reset(FIELD_PHONE_MOBILE_SEARCH);
        return this;
    }

    /**
     * 设置「净化数量」
     * @param val
     */
    @JsonProperty(FIELD_PHONE_SANITIZED)
    public MailThreadPhoneDTO setPhoneSanitized(String val) {
        this._set(FIELD_PHONE_SANITIZED, val);
        return this;
    }

    /**
     * 获取「净化数量」值
     *
     */
    @JsonIgnore
    public String getPhoneSanitized() {
        return DataTypeUtils.asString(this._get(FIELD_PHONE_SANITIZED), null);
    }

    /**
     * 判断 「净化数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhoneSanitized() {
        return this._contains(FIELD_PHONE_SANITIZED);
    }

    /**
     * 重置 「净化数量」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetPhoneSanitized() {
        this._reset(FIELD_PHONE_SANITIZED);
        return this;
    }

    /**
     * 设置「电话号码被列入黑名单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PHONE_SANITIZED_BLACKLISTED)
    public MailThreadPhoneDTO setPhoneSanitizedBlacklisted(Integer val) {
        this._set(FIELD_PHONE_SANITIZED_BLACKLISTED, val);
        return this;
    }

    /**
     * 获取「电话号码被列入黑名单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPhoneSanitizedBlacklisted() {
        return DataTypeUtils.asInteger(this._get(FIELD_PHONE_SANITIZED_BLACKLISTED), null);
    }

    /**
     * 判断 「电话号码被列入黑名单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhoneSanitizedBlacklisted() {
        return this._contains(FIELD_PHONE_SANITIZED_BLACKLISTED);
    }

    /**
     * 重置 「电话号码被列入黑名单」
     *
     */
    @JsonIgnore
    public MailThreadPhoneDTO resetPhoneSanitizedBlacklisted() {
        this._reset(FIELD_PHONE_SANITIZED_BLACKLISTED);
        return this;
    }

}
