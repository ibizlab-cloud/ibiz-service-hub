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


public class ResUsersSettingsVolumesDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

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
     * 属性: 访客
     */
    public final static String FIELD_GUEST_ID = "guest_id";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 合作伙伴
     */
    public final static String FIELD_PARTNER_ID = "partner_id";

    /**
     * 属性: 用户设置
     */
    public final static String FIELD_USER_SETTING_ID = "user_setting_id";

    /**
     * 属性: 体积
     */
    public final static String FIELD_VOLUME = "volume";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResUsersSettingsVolumesDTO setCreateDate(Timestamp val) {
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
    public ResUsersSettingsVolumesDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResUsersSettingsVolumesDTO setCreateUid(String val) {
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
    public ResUsersSettingsVolumesDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResUsersSettingsVolumesDTO setDisplayName(String val) {
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
    public ResUsersSettingsVolumesDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「访客」
     * @param val
     */
    @JsonProperty(FIELD_GUEST_ID)
    public ResUsersSettingsVolumesDTO setGuestId(String val) {
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
    public ResUsersSettingsVolumesDTO resetGuestId() {
        this._reset(FIELD_GUEST_ID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResUsersSettingsVolumesDTO setId(String val) {
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
    public ResUsersSettingsVolumesDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「合作伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_ID)
    public ResUsersSettingsVolumesDTO setPartnerId(String val) {
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
    public ResUsersSettingsVolumesDTO resetPartnerId() {
        this._reset(FIELD_PARTNER_ID);
        return this;
    }

    /**
     * 设置「用户设置」
     * @param val
     */
    @JsonProperty(FIELD_USER_SETTING_ID)
    public ResUsersSettingsVolumesDTO setUserSettingId(String val) {
        this._set(FIELD_USER_SETTING_ID, val);
        return this;
    }

    /**
     * 获取「用户设置」值
     *
     */
    @JsonIgnore
    public String getUserSettingId() {
        return DataTypeUtils.asString(this._get(FIELD_USER_SETTING_ID), null);
    }

    /**
     * 判断 「用户设置」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserSettingId() {
        return this._contains(FIELD_USER_SETTING_ID);
    }

    /**
     * 重置 「用户设置」
     *
     */
    @JsonIgnore
    public ResUsersSettingsVolumesDTO resetUserSettingId() {
        this._reset(FIELD_USER_SETTING_ID);
        return this;
    }

    /**
     * 设置「体积」
     * @param val
     */
    @JsonProperty(FIELD_VOLUME)
    public ResUsersSettingsVolumesDTO setVolume(Double val) {
        this._set(FIELD_VOLUME, val);
        return this;
    }

    /**
     * 获取「体积」值
     *
     */
    @JsonIgnore
    public Double getVolume() {
        return DataTypeUtils.asDouble(this._get(FIELD_VOLUME), null);
    }

    /**
     * 判断 「体积」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVolume() {
        return this._contains(FIELD_VOLUME);
    }

    /**
     * 重置 「体积」
     *
     */
    @JsonIgnore
    public ResUsersSettingsVolumesDTO resetVolume() {
        this._reset(FIELD_VOLUME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResUsersSettingsVolumesDTO setWriteDate(Timestamp val) {
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
    public ResUsersSettingsVolumesDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResUsersSettingsVolumesDTO setWriteUid(String val) {
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
    public ResUsersSettingsVolumesDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
