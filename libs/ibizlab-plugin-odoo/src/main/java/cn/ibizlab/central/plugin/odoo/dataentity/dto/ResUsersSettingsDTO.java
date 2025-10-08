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


public class ResUsersSettingsDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 日历默认隐私
     */
    public final static String FIELD_CALENDAR_DEFAULT_PRIVACY = "calendar_default_privacy";

    /**
     * 属性: 频道通知
     */
    public final static String FIELD_CHANNEL_NOTIFICATIONS = "channel_notifications";

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
     * 属性: 是否打开讨论侧边栏类别聊天？
     */
    public final static String FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHANNEL_OPEN = "is_discuss_sidebar_category_channel_open";

    /**
     * 属性: 是否打开讨论侧边栏类别聊天？
     */
    public final static String FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHAT_OPEN = "is_discuss_sidebar_category_chat_open";

    /**
     * 属性: 静音通知，直到
     */
    public final static String FIELD_MUTE_UNTIL_DT = "mute_until_dt";

    /**
     * 属性: 一键通话快捷方式
     */
    public final static String FIELD_PUSH_TO_TALK_KEY = "push_to_talk_key";

    /**
     * 属性: 使用一键通话功能
     */
    public final static String FIELD_USE_PUSH_TO_TALK = "use_push_to_talk";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 语音活动的持续时间（毫秒）
     */
    public final static String FIELD_VOICE_ACTIVE_DURATION = "voice_active_duration";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「日历默认隐私」
     * 代码表[日历默认隐私]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_settings_calendar_default_privacy
     * @param val
     */
    @JsonProperty(FIELD_CALENDAR_DEFAULT_PRIVACY)
    public ResUsersSettingsDTO setCalendarDefaultPrivacy(String val) {
        this._set(FIELD_CALENDAR_DEFAULT_PRIVACY, val);
        return this;
    }

    /**
     * 获取「日历默认隐私」值
     * 代码表[日历默认隐私]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_settings_calendar_default_privacy
     *
     */
    @JsonIgnore
    public String getCalendarDefaultPrivacy() {
        return DataTypeUtils.asString(this._get(FIELD_CALENDAR_DEFAULT_PRIVACY), null);
    }

    /**
     * 判断 「日历默认隐私」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCalendarDefaultPrivacy() {
        return this._contains(FIELD_CALENDAR_DEFAULT_PRIVACY);
    }

    /**
     * 重置 「日历默认隐私」
     *
     */
    @JsonIgnore
    public ResUsersSettingsDTO resetCalendarDefaultPrivacy() {
        this._reset(FIELD_CALENDAR_DEFAULT_PRIVACY);
        return this;
    }

    /**
     * 设置「频道通知」
     * 代码表[频道通知]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_settings_channel_notifications
     * @param val
     */
    @JsonProperty(FIELD_CHANNEL_NOTIFICATIONS)
    public ResUsersSettingsDTO setChannelNotifications(String val) {
        this._set(FIELD_CHANNEL_NOTIFICATIONS, val);
        return this;
    }

    /**
     * 获取「频道通知」值
     * 代码表[频道通知]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_settings_channel_notifications
     *
     */
    @JsonIgnore
    public String getChannelNotifications() {
        return DataTypeUtils.asString(this._get(FIELD_CHANNEL_NOTIFICATIONS), null);
    }

    /**
     * 判断 「频道通知」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChannelNotifications() {
        return this._contains(FIELD_CHANNEL_NOTIFICATIONS);
    }

    /**
     * 重置 「频道通知」
     *
     */
    @JsonIgnore
    public ResUsersSettingsDTO resetChannelNotifications() {
        this._reset(FIELD_CHANNEL_NOTIFICATIONS);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResUsersSettingsDTO setCreateDate(Timestamp val) {
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
    public ResUsersSettingsDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResUsersSettingsDTO setCreateUid(String val) {
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
    public ResUsersSettingsDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResUsersSettingsDTO setDisplayName(String val) {
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
    public ResUsersSettingsDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResUsersSettingsDTO setId(String val) {
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
    public ResUsersSettingsDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「是否打开讨论侧边栏类别聊天？」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHANNEL_OPEN)
    public ResUsersSettingsDTO setIsDiscussSidebarCategoryChannelOpen(Integer val) {
        this._set(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHANNEL_OPEN, val);
        return this;
    }

    /**
     * 获取「是否打开讨论侧边栏类别聊天？」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsDiscussSidebarCategoryChannelOpen() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHANNEL_OPEN), null);
    }

    /**
     * 判断 「是否打开讨论侧边栏类别聊天？」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsDiscussSidebarCategoryChannelOpen() {
        return this._contains(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHANNEL_OPEN);
    }

    /**
     * 重置 「是否打开讨论侧边栏类别聊天？」
     *
     */
    @JsonIgnore
    public ResUsersSettingsDTO resetIsDiscussSidebarCategoryChannelOpen() {
        this._reset(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHANNEL_OPEN);
        return this;
    }

    /**
     * 设置「是否打开讨论侧边栏类别聊天？」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHAT_OPEN)
    public ResUsersSettingsDTO setIsDiscussSidebarCategoryChatOpen(Integer val) {
        this._set(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHAT_OPEN, val);
        return this;
    }

    /**
     * 获取「是否打开讨论侧边栏类别聊天？」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsDiscussSidebarCategoryChatOpen() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHAT_OPEN), null);
    }

    /**
     * 判断 「是否打开讨论侧边栏类别聊天？」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsDiscussSidebarCategoryChatOpen() {
        return this._contains(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHAT_OPEN);
    }

    /**
     * 重置 「是否打开讨论侧边栏类别聊天？」
     *
     */
    @JsonIgnore
    public ResUsersSettingsDTO resetIsDiscussSidebarCategoryChatOpen() {
        this._reset(FIELD_IS_DISCUSS_SIDEBAR_CATEGORY_CHAT_OPEN);
        return this;
    }

    /**
     * 设置「静音通知，直到」
     * @param val
     */
    @JsonProperty(FIELD_MUTE_UNTIL_DT)
    public ResUsersSettingsDTO setMuteUntilDt(Timestamp val) {
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
    public ResUsersSettingsDTO resetMuteUntilDt() {
        this._reset(FIELD_MUTE_UNTIL_DT);
        return this;
    }

    /**
     * 设置「一键通话快捷方式」
     * @param val
     */
    @JsonProperty(FIELD_PUSH_TO_TALK_KEY)
    public ResUsersSettingsDTO setPushToTalkKey(String val) {
        this._set(FIELD_PUSH_TO_TALK_KEY, val);
        return this;
    }

    /**
     * 获取「一键通话快捷方式」值
     *
     */
    @JsonIgnore
    public String getPushToTalkKey() {
        return DataTypeUtils.asString(this._get(FIELD_PUSH_TO_TALK_KEY), null);
    }

    /**
     * 判断 「一键通话快捷方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPushToTalkKey() {
        return this._contains(FIELD_PUSH_TO_TALK_KEY);
    }

    /**
     * 重置 「一键通话快捷方式」
     *
     */
    @JsonIgnore
    public ResUsersSettingsDTO resetPushToTalkKey() {
        this._reset(FIELD_PUSH_TO_TALK_KEY);
        return this;
    }

    /**
     * 设置「使用一键通话功能」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_PUSH_TO_TALK)
    public ResUsersSettingsDTO setUsePushToTalk(Integer val) {
        this._set(FIELD_USE_PUSH_TO_TALK, val);
        return this;
    }

    /**
     * 获取「使用一键通话功能」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUsePushToTalk() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_PUSH_TO_TALK), null);
    }

    /**
     * 判断 「使用一键通话功能」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUsePushToTalk() {
        return this._contains(FIELD_USE_PUSH_TO_TALK);
    }

    /**
     * 重置 「使用一键通话功能」
     *
     */
    @JsonIgnore
    public ResUsersSettingsDTO resetUsePushToTalk() {
        this._reset(FIELD_USE_PUSH_TO_TALK);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public ResUsersSettingsDTO setUserId(String val) {
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
    public ResUsersSettingsDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「语音活动的持续时间（毫秒）」
     * @param val
     */
    @JsonProperty(FIELD_VOICE_ACTIVE_DURATION)
    public ResUsersSettingsDTO setVoiceActiveDuration(Integer val) {
        this._set(FIELD_VOICE_ACTIVE_DURATION, val);
        return this;
    }

    /**
     * 获取「语音活动的持续时间（毫秒）」值
     *
     */
    @JsonIgnore
    public Integer getVoiceActiveDuration() {
        return DataTypeUtils.asInteger(this._get(FIELD_VOICE_ACTIVE_DURATION), null);
    }

    /**
     * 判断 「语音活动的持续时间（毫秒）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVoiceActiveDuration() {
        return this._contains(FIELD_VOICE_ACTIVE_DURATION);
    }

    /**
     * 重置 「语音活动的持续时间（毫秒）」
     *
     */
    @JsonIgnore
    public ResUsersSettingsDTO resetVoiceActiveDuration() {
        this._reset(FIELD_VOICE_ACTIVE_DURATION);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResUsersSettingsDTO setWriteDate(Timestamp val) {
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
    public ResUsersSettingsDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResUsersSettingsDTO setWriteUid(String val) {
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
    public ResUsersSettingsDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
