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


public class MailGuestDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 访问令牌
     */
    public final static String FIELD_ACCESS_TOKEN = "access_token";

    /**
     * 属性: 国家/地区
     */
    public final static String FIELD_COUNTRY_ID = "country_id";

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
     * 属性: IM的状态
     */
    public final static String FIELD_IM_STATUS = "im_status";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「访问令牌」
     * @param val
     */
    @JsonProperty(FIELD_ACCESS_TOKEN)
    public MailGuestDTO setAccessToken(String val) {
        this._set(FIELD_ACCESS_TOKEN, val);
        return this;
    }

    /**
     * 获取「访问令牌」值
     *
     */
    @JsonIgnore
    public String getAccessToken() {
        return DataTypeUtils.asString(this._get(FIELD_ACCESS_TOKEN), null);
    }

    /**
     * 判断 「访问令牌」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccessToken() {
        return this._contains(FIELD_ACCESS_TOKEN);
    }

    /**
     * 重置 「访问令牌」
     *
     */
    @JsonIgnore
    public MailGuestDTO resetAccessToken() {
        this._reset(FIELD_ACCESS_TOKEN);
        return this;
    }

    /**
     * 设置「国家/地区」
     * @param val
     */
    @JsonProperty(FIELD_COUNTRY_ID)
    public MailGuestDTO setCountryId(String val) {
        this._set(FIELD_COUNTRY_ID, val);
        return this;
    }

    /**
     * 获取「国家/地区」值
     *
     */
    @JsonIgnore
    public String getCountryId() {
        return DataTypeUtils.asString(this._get(FIELD_COUNTRY_ID), null);
    }

    /**
     * 判断 「国家/地区」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCountryId() {
        return this._contains(FIELD_COUNTRY_ID);
    }

    /**
     * 重置 「国家/地区」
     *
     */
    @JsonIgnore
    public MailGuestDTO resetCountryId() {
        this._reset(FIELD_COUNTRY_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailGuestDTO setCreateDate(Timestamp val) {
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
    public MailGuestDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailGuestDTO setCreateUid(String val) {
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
    public MailGuestDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailGuestDTO setDisplayName(String val) {
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
    public MailGuestDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailGuestDTO setId(String val) {
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
    public MailGuestDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「IM的状态」
     * @param val
     */
    @JsonProperty(FIELD_IM_STATUS)
    public MailGuestDTO setImStatus(String val) {
        this._set(FIELD_IM_STATUS, val);
        return this;
    }

    /**
     * 获取「IM的状态」值
     *
     */
    @JsonIgnore
    public String getImStatus() {
        return DataTypeUtils.asString(this._get(FIELD_IM_STATUS), null);
    }

    /**
     * 判断 「IM的状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImStatus() {
        return this._contains(FIELD_IM_STATUS);
    }

    /**
     * 重置 「IM的状态」
     *
     */
    @JsonIgnore
    public MailGuestDTO resetImStatus() {
        this._reset(FIELD_IM_STATUS);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailGuestDTO setName(String val) {
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
    public MailGuestDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailGuestDTO setWriteDate(Timestamp val) {
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
    public MailGuestDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailGuestDTO setWriteUid(String val) {
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
    public MailGuestDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
