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


public class DiscussChannelRtcSessionDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 频道
     */
    public final static String FIELD_CHANNEL_ID = "channel_id";

    /**
     * 属性: 频道成员
     */
    public final static String FIELD_CHANNEL_MEMBER_ID = "channel_member_id";

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
     * 属性: 正在发送用户视频
     */
    public final static String FIELD_IS_CAMERA_ON = "is_camera_on";

    /**
     * 属性: 禁用来电声音
     */
    public final static String FIELD_IS_DEAF = "is_deaf";

    /**
     * 属性: 麦克风静音
     */
    public final static String FIELD_IS_MUTED = "is_muted";

    /**
     * 属性: 正在共享屏幕
     */
    public final static String FIELD_IS_SCREEN_SHARING_ON = "is_screen_sharing_on";

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
    public DiscussChannelRtcSessionDTO setChannelId(String val) {
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
    public DiscussChannelRtcSessionDTO resetChannelId() {
        this._reset(FIELD_CHANNEL_ID);
        return this;
    }

    /**
     * 设置「频道成员」
     * @param val
     */
    @JsonProperty(FIELD_CHANNEL_MEMBER_ID)
    public DiscussChannelRtcSessionDTO setChannelMemberId(String val) {
        this._set(FIELD_CHANNEL_MEMBER_ID, val);
        return this;
    }

    /**
     * 获取「频道成员」值
     *
     */
    @JsonIgnore
    public String getChannelMemberId() {
        return DataTypeUtils.asString(this._get(FIELD_CHANNEL_MEMBER_ID), null);
    }

    /**
     * 判断 「频道成员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChannelMemberId() {
        return this._contains(FIELD_CHANNEL_MEMBER_ID);
    }

    /**
     * 重置 「频道成员」
     *
     */
    @JsonIgnore
    public DiscussChannelRtcSessionDTO resetChannelMemberId() {
        this._reset(FIELD_CHANNEL_MEMBER_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public DiscussChannelRtcSessionDTO setCreateDate(Timestamp val) {
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
    public DiscussChannelRtcSessionDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public DiscussChannelRtcSessionDTO setCreateUid(String val) {
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
    public DiscussChannelRtcSessionDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public DiscussChannelRtcSessionDTO setDisplayName(String val) {
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
    public DiscussChannelRtcSessionDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public DiscussChannelRtcSessionDTO setId(String val) {
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
    public DiscussChannelRtcSessionDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「正在发送用户视频」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_CAMERA_ON)
    public DiscussChannelRtcSessionDTO setIsCameraOn(Integer val) {
        this._set(FIELD_IS_CAMERA_ON, val);
        return this;
    }

    /**
     * 获取「正在发送用户视频」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsCameraOn() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_CAMERA_ON), null);
    }

    /**
     * 判断 「正在发送用户视频」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsCameraOn() {
        return this._contains(FIELD_IS_CAMERA_ON);
    }

    /**
     * 重置 「正在发送用户视频」
     *
     */
    @JsonIgnore
    public DiscussChannelRtcSessionDTO resetIsCameraOn() {
        this._reset(FIELD_IS_CAMERA_ON);
        return this;
    }

    /**
     * 设置「禁用来电声音」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_DEAF)
    public DiscussChannelRtcSessionDTO setIsDeaf(Integer val) {
        this._set(FIELD_IS_DEAF, val);
        return this;
    }

    /**
     * 获取「禁用来电声音」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsDeaf() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_DEAF), null);
    }

    /**
     * 判断 「禁用来电声音」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsDeaf() {
        return this._contains(FIELD_IS_DEAF);
    }

    /**
     * 重置 「禁用来电声音」
     *
     */
    @JsonIgnore
    public DiscussChannelRtcSessionDTO resetIsDeaf() {
        this._reset(FIELD_IS_DEAF);
        return this;
    }

    /**
     * 设置「麦克风静音」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_MUTED)
    public DiscussChannelRtcSessionDTO setIsMuted(Integer val) {
        this._set(FIELD_IS_MUTED, val);
        return this;
    }

    /**
     * 获取「麦克风静音」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsMuted() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_MUTED), null);
    }

    /**
     * 判断 「麦克风静音」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsMuted() {
        return this._contains(FIELD_IS_MUTED);
    }

    /**
     * 重置 「麦克风静音」
     *
     */
    @JsonIgnore
    public DiscussChannelRtcSessionDTO resetIsMuted() {
        this._reset(FIELD_IS_MUTED);
        return this;
    }

    /**
     * 设置「正在共享屏幕」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_SCREEN_SHARING_ON)
    public DiscussChannelRtcSessionDTO setIsScreenSharingOn(Integer val) {
        this._set(FIELD_IS_SCREEN_SHARING_ON, val);
        return this;
    }

    /**
     * 获取「正在共享屏幕」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsScreenSharingOn() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_SCREEN_SHARING_ON), null);
    }

    /**
     * 判断 「正在共享屏幕」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsScreenSharingOn() {
        return this._contains(FIELD_IS_SCREEN_SHARING_ON);
    }

    /**
     * 重置 「正在共享屏幕」
     *
     */
    @JsonIgnore
    public DiscussChannelRtcSessionDTO resetIsScreenSharingOn() {
        this._reset(FIELD_IS_SCREEN_SHARING_ON);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public DiscussChannelRtcSessionDTO setWriteDate(Timestamp val) {
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
    public DiscussChannelRtcSessionDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public DiscussChannelRtcSessionDTO setWriteUid(String val) {
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
    public DiscussChannelRtcSessionDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
