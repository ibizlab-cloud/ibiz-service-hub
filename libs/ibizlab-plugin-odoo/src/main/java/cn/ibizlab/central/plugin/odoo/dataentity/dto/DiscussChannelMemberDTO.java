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


public class DiscussChannelMemberDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 频道
     */
    public final static String FIELD_CHANNEL_ID = "channel_id";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 自定义频道名称
     */
    public final static String FIELD_CUSTOM_CHANNEL_NAME = "custom_channel_name";

    /**
     * 属性: 定制通知
     */
    public final static String FIELD_CUSTOM_NOTIFICATIONS = "custom_notifications";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 最后一次提取
     */
    public final static String FIELD_FETCHED_MESSAGE_ID = "fetched_message_id";

    /**
     * 属性: 对话收拢状态
     */
    public final static String FIELD_FOLD_STATE = "fold_state";

    /**
     * 属性: 访客
     */
    public final static String FIELD_GUEST_ID = "guest_id";

    /**
     * 属性: 访客
     */
    public final static String FIELD_GUEST_NAME = "guest_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 是否置顶
     */
    public final static String FIELD_IS_PINNED = "is_pinned";

    /**
     * 属性: 是自我
     */
    public final static String FIELD_IS_SELF = "is_self";

    /**
     * 属性: 持续的兴趣
     */
    public final static String FIELD_LAST_INTEREST_DT = "last_interest_dt";

    /**
     * 属性: 上次查看日期
     */
    public final static String FIELD_LAST_SEEN_DT = "last_seen_dt";

    /**
     * 属性: 未读消息数
     */
    public final static String FIELD_MESSAGE_UNREAD_COUNTER = "message_unread_counter";

    /**
     * 属性: 静音通知，直到
     */
    public final static String FIELD_MUTE_UNTIL_DT = "mute_until_dt";

    /**
     * 属性: 新信息分割符
     */
    public final static String FIELD_NEW_MESSAGE_SEPARATOR = "new_message_separator";

    /**
     * 属性: 合作伙伴
     */
    public final static String FIELD_PARTNER_ID = "partner_id";

    /**
     * 属性: 合作伙伴
     */
    public final static String FIELD_PARTNER_NAME = "partner_name";

    /**
     * 属性: 振铃会话
     */
    public final static String FIELD_RTC_INVITING_SESSION_ID = "rtc_inviting_session_id";

    /**
     * 属性: 最近一次查阅
     */
    public final static String FIELD_SEEN_MESSAGE_ID = "seen_message_id";

    /**
     * 属性: 取消置顶日期
     */
    public final static String FIELD_UNPIN_DT = "unpin_dt";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「频道」
     * @param val
     */
    @JsonProperty(FIELD_CHANNEL_ID)
    public DiscussChannelMemberDTO setChannelId(String val) {
        this._set(FIELD_CHANNEL_ID, val);
        return this;
    }

    /**
     * 获取「频道」值
     *
     */
    @JsonIgnore
    public String getChannelId() {
        return DataTypeUtils.asString(this._get(FIELD_CHANNEL_ID), null);
    }

    /**
     * 判断 「频道」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChannelId() {
        return this._contains(FIELD_CHANNEL_ID);
    }

    /**
     * 重置 「频道」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetChannelId() {
        this._reset(FIELD_CHANNEL_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public DiscussChannelMemberDTO setCreateDate(Timestamp val) {
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
    public DiscussChannelMemberDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public DiscussChannelMemberDTO setCreateUid(String val) {
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
    public DiscussChannelMemberDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「自定义频道名称」
     * @param val
     */
    @JsonProperty(FIELD_CUSTOM_CHANNEL_NAME)
    public DiscussChannelMemberDTO setCustomChannelName(String val) {
        this._set(FIELD_CUSTOM_CHANNEL_NAME, val);
        return this;
    }

    /**
     * 获取「自定义频道名称」值
     *
     */
    @JsonIgnore
    public String getCustomChannelName() {
        return DataTypeUtils.asString(this._get(FIELD_CUSTOM_CHANNEL_NAME), null);
    }

    /**
     * 判断 「自定义频道名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCustomChannelName() {
        return this._contains(FIELD_CUSTOM_CHANNEL_NAME);
    }

    /**
     * 重置 「自定义频道名称」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetCustomChannelName() {
        this._reset(FIELD_CUSTOM_CHANNEL_NAME);
        return this;
    }

    /**
     * 设置「定制通知」
     * 代码表[定制通知]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.discuss_channel_member_custom_notifications
     * @param val
     */
    @JsonProperty(FIELD_CUSTOM_NOTIFICATIONS)
    public DiscussChannelMemberDTO setCustomNotifications(String val) {
        this._set(FIELD_CUSTOM_NOTIFICATIONS, val);
        return this;
    }

    /**
     * 获取「定制通知」值
     * 代码表[定制通知]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.discuss_channel_member_custom_notifications
     *
     */
    @JsonIgnore
    public String getCustomNotifications() {
        return DataTypeUtils.asString(this._get(FIELD_CUSTOM_NOTIFICATIONS), null);
    }

    /**
     * 判断 「定制通知」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCustomNotifications() {
        return this._contains(FIELD_CUSTOM_NOTIFICATIONS);
    }

    /**
     * 重置 「定制通知」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetCustomNotifications() {
        this._reset(FIELD_CUSTOM_NOTIFICATIONS);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public DiscussChannelMemberDTO setDisplayName(String val) {
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
    public DiscussChannelMemberDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「最后一次提取」
     * @param val
     */
    @JsonProperty(FIELD_FETCHED_MESSAGE_ID)
    public DiscussChannelMemberDTO setFetchedMessageId(String val) {
        this._set(FIELD_FETCHED_MESSAGE_ID, val);
        return this;
    }

    /**
     * 获取「最后一次提取」值
     *
     */
    @JsonIgnore
    public String getFetchedMessageId() {
        return DataTypeUtils.asString(this._get(FIELD_FETCHED_MESSAGE_ID), null);
    }

    /**
     * 判断 「最后一次提取」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFetchedMessageId() {
        return this._contains(FIELD_FETCHED_MESSAGE_ID);
    }

    /**
     * 重置 「最后一次提取」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetFetchedMessageId() {
        this._reset(FIELD_FETCHED_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「对话收拢状态」
     * 代码表[对话收拢状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.discuss_channel_member_fold_state
     * @param val
     */
    @JsonProperty(FIELD_FOLD_STATE)
    public DiscussChannelMemberDTO setFoldState(String val) {
        this._set(FIELD_FOLD_STATE, val);
        return this;
    }

    /**
     * 获取「对话收拢状态」值
     * 代码表[对话收拢状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.discuss_channel_member_fold_state
     *
     */
    @JsonIgnore
    public String getFoldState() {
        return DataTypeUtils.asString(this._get(FIELD_FOLD_STATE), null);
    }

    /**
     * 判断 「对话收拢状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFoldState() {
        return this._contains(FIELD_FOLD_STATE);
    }

    /**
     * 重置 「对话收拢状态」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetFoldState() {
        this._reset(FIELD_FOLD_STATE);
        return this;
    }

    /**
     * 设置「访客」
     * @param val
     */
    @JsonProperty(FIELD_GUEST_ID)
    public DiscussChannelMemberDTO setGuestId(String val) {
        this._set(FIELD_GUEST_ID, val);
        return this;
    }

    /**
     * 获取「访客」值
     *
     */
    @JsonIgnore
    public String getGuestId() {
        return DataTypeUtils.asString(this._get(FIELD_GUEST_ID), null);
    }

    /**
     * 判断 「访客」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGuestId() {
        return this._contains(FIELD_GUEST_ID);
    }

    /**
     * 重置 「访客」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetGuestId() {
        this._reset(FIELD_GUEST_ID);
        return this;
    }

    /**
     * 设置「访客」
     * @param val
     */
    @JsonProperty(FIELD_GUEST_NAME)
    public DiscussChannelMemberDTO setGuestName(String val) {
        this._set(FIELD_GUEST_NAME, val);
        return this;
    }

    /**
     * 获取「访客」值
     *
     */
    @JsonIgnore
    public String getGuestName() {
        return DataTypeUtils.asString(this._get(FIELD_GUEST_NAME), null);
    }

    /**
     * 判断 「访客」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGuestName() {
        return this._contains(FIELD_GUEST_NAME);
    }

    /**
     * 重置 「访客」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetGuestName() {
        this._reset(FIELD_GUEST_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public DiscussChannelMemberDTO setId(String val) {
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
    public DiscussChannelMemberDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「是否置顶」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_PINNED)
    public DiscussChannelMemberDTO setIsPinned(Integer val) {
        this._set(FIELD_IS_PINNED, val);
        return this;
    }

    /**
     * 获取「是否置顶」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsPinned() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_PINNED), null);
    }

    /**
     * 判断 「是否置顶」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsPinned() {
        return this._contains(FIELD_IS_PINNED);
    }

    /**
     * 重置 「是否置顶」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetIsPinned() {
        this._reset(FIELD_IS_PINNED);
        return this;
    }

    /**
     * 设置「是自我」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_SELF)
    public DiscussChannelMemberDTO setIsSelf(Integer val) {
        this._set(FIELD_IS_SELF, val);
        return this;
    }

    /**
     * 获取「是自我」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsSelf() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_SELF), null);
    }

    /**
     * 判断 「是自我」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsSelf() {
        return this._contains(FIELD_IS_SELF);
    }

    /**
     * 重置 「是自我」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetIsSelf() {
        this._reset(FIELD_IS_SELF);
        return this;
    }

    /**
     * 设置「持续的兴趣」
     * @param val
     */
    @JsonProperty(FIELD_LAST_INTEREST_DT)
    public DiscussChannelMemberDTO setLastInterestDt(Timestamp val) {
        this._set(FIELD_LAST_INTEREST_DT, val);
        return this;
    }

    /**
     * 获取「持续的兴趣」值
     *
     */
    @JsonIgnore
    public Timestamp getLastInterestDt() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LAST_INTEREST_DT), null);
    }

    /**
     * 判断 「持续的兴趣」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastInterestDt() {
        return this._contains(FIELD_LAST_INTEREST_DT);
    }

    /**
     * 重置 「持续的兴趣」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetLastInterestDt() {
        this._reset(FIELD_LAST_INTEREST_DT);
        return this;
    }

    /**
     * 设置「上次查看日期」
     * @param val
     */
    @JsonProperty(FIELD_LAST_SEEN_DT)
    public DiscussChannelMemberDTO setLastSeenDt(Timestamp val) {
        this._set(FIELD_LAST_SEEN_DT, val);
        return this;
    }

    /**
     * 获取「上次查看日期」值
     *
     */
    @JsonIgnore
    public Timestamp getLastSeenDt() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LAST_SEEN_DT), null);
    }

    /**
     * 判断 「上次查看日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastSeenDt() {
        return this._contains(FIELD_LAST_SEEN_DT);
    }

    /**
     * 重置 「上次查看日期」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetLastSeenDt() {
        this._reset(FIELD_LAST_SEEN_DT);
        return this;
    }

    /**
     * 设置「未读消息数」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_UNREAD_COUNTER)
    public DiscussChannelMemberDTO setMessageUnreadCounter(Integer val) {
        this._set(FIELD_MESSAGE_UNREAD_COUNTER, val);
        return this;
    }

    /**
     * 获取「未读消息数」值
     *
     */
    @JsonIgnore
    public Integer getMessageUnreadCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_UNREAD_COUNTER), null);
    }

    /**
     * 判断 「未读消息数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageUnreadCounter() {
        return this._contains(FIELD_MESSAGE_UNREAD_COUNTER);
    }

    /**
     * 重置 「未读消息数」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetMessageUnreadCounter() {
        this._reset(FIELD_MESSAGE_UNREAD_COUNTER);
        return this;
    }

    /**
     * 设置「静音通知，直到」
     * @param val
     */
    @JsonProperty(FIELD_MUTE_UNTIL_DT)
    public DiscussChannelMemberDTO setMuteUntilDt(Timestamp val) {
        this._set(FIELD_MUTE_UNTIL_DT, val);
        return this;
    }

    /**
     * 获取「静音通知，直到」值
     *
     */
    @JsonIgnore
    public Timestamp getMuteUntilDt() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_MUTE_UNTIL_DT), null);
    }

    /**
     * 判断 「静音通知，直到」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMuteUntilDt() {
        return this._contains(FIELD_MUTE_UNTIL_DT);
    }

    /**
     * 重置 「静音通知，直到」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetMuteUntilDt() {
        this._reset(FIELD_MUTE_UNTIL_DT);
        return this;
    }

    /**
     * 设置「新信息分割符」
     * @param val
     */
    @JsonProperty(FIELD_NEW_MESSAGE_SEPARATOR)
    public DiscussChannelMemberDTO setNewMessageSeparator(Integer val) {
        this._set(FIELD_NEW_MESSAGE_SEPARATOR, val);
        return this;
    }

    /**
     * 获取「新信息分割符」值
     *
     */
    @JsonIgnore
    public Integer getNewMessageSeparator() {
        return DataTypeUtils.asInteger(this._get(FIELD_NEW_MESSAGE_SEPARATOR), null);
    }

    /**
     * 判断 「新信息分割符」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewMessageSeparator() {
        return this._contains(FIELD_NEW_MESSAGE_SEPARATOR);
    }

    /**
     * 重置 「新信息分割符」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetNewMessageSeparator() {
        this._reset(FIELD_NEW_MESSAGE_SEPARATOR);
        return this;
    }

    /**
     * 设置「合作伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_ID)
    public DiscussChannelMemberDTO setPartnerId(String val) {
        this._set(FIELD_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「合作伙伴」值
     *
     */
    @JsonIgnore
    public String getPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_ID), null);
    }

    /**
     * 判断 「合作伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerId() {
        return this._contains(FIELD_PARTNER_ID);
    }

    /**
     * 重置 「合作伙伴」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetPartnerId() {
        this._reset(FIELD_PARTNER_ID);
        return this;
    }

    /**
     * 设置「合作伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_NAME)
    public DiscussChannelMemberDTO setPartnerName(String val) {
        this._set(FIELD_PARTNER_NAME, val);
        return this;
    }

    /**
     * 获取「合作伙伴」值
     *
     */
    @JsonIgnore
    public String getPartnerName() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_NAME), null);
    }

    /**
     * 判断 「合作伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerName() {
        return this._contains(FIELD_PARTNER_NAME);
    }

    /**
     * 重置 「合作伙伴」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetPartnerName() {
        this._reset(FIELD_PARTNER_NAME);
        return this;
    }

    /**
     * 设置「振铃会话」
     * @param val
     */
    @JsonProperty(FIELD_RTC_INVITING_SESSION_ID)
    public DiscussChannelMemberDTO setRtcInvitingSessionId(String val) {
        this._set(FIELD_RTC_INVITING_SESSION_ID, val);
        return this;
    }

    /**
     * 获取「振铃会话」值
     *
     */
    @JsonIgnore
    public String getRtcInvitingSessionId() {
        return DataTypeUtils.asString(this._get(FIELD_RTC_INVITING_SESSION_ID), null);
    }

    /**
     * 判断 「振铃会话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRtcInvitingSessionId() {
        return this._contains(FIELD_RTC_INVITING_SESSION_ID);
    }

    /**
     * 重置 「振铃会话」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetRtcInvitingSessionId() {
        this._reset(FIELD_RTC_INVITING_SESSION_ID);
        return this;
    }

    /**
     * 设置「最近一次查阅」
     * @param val
     */
    @JsonProperty(FIELD_SEEN_MESSAGE_ID)
    public DiscussChannelMemberDTO setSeenMessageId(String val) {
        this._set(FIELD_SEEN_MESSAGE_ID, val);
        return this;
    }

    /**
     * 获取「最近一次查阅」值
     *
     */
    @JsonIgnore
    public String getSeenMessageId() {
        return DataTypeUtils.asString(this._get(FIELD_SEEN_MESSAGE_ID), null);
    }

    /**
     * 判断 「最近一次查阅」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSeenMessageId() {
        return this._contains(FIELD_SEEN_MESSAGE_ID);
    }

    /**
     * 重置 「最近一次查阅」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetSeenMessageId() {
        this._reset(FIELD_SEEN_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「取消置顶日期」
     * @param val
     */
    @JsonProperty(FIELD_UNPIN_DT)
    public DiscussChannelMemberDTO setUnpinDt(Timestamp val) {
        this._set(FIELD_UNPIN_DT, val);
        return this;
    }

    /**
     * 获取「取消置顶日期」值
     *
     */
    @JsonIgnore
    public Timestamp getUnpinDt() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_UNPIN_DT), null);
    }

    /**
     * 判断 「取消置顶日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUnpinDt() {
        return this._contains(FIELD_UNPIN_DT);
    }

    /**
     * 重置 「取消置顶日期」
     *
     */
    @JsonIgnore
    public DiscussChannelMemberDTO resetUnpinDt() {
        this._reset(FIELD_UNPIN_DT);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public DiscussChannelMemberDTO setWriteDate(Timestamp val) {
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
    public DiscussChannelMemberDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public DiscussChannelMemberDTO setWriteUid(String val) {
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
    public DiscussChannelMemberDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
