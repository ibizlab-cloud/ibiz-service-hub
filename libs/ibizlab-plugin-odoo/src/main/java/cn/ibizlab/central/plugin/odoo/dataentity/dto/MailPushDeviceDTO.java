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


public class MailPushDeviceDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

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
     * 属性: 浏览器端点
     */
    public final static String FIELD_ENDPOINT = "endpoint";

    /**
     * 属性: 到期令牌日期
     */
    public final static String FIELD_EXPIRATION_TIME = "expiration_time";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 浏览器按键
     */
    public final static String FIELD_KEYS = "keys";

    /**
     * 属性: 合作伙伴
     */
    public final static String FIELD_PARTNER_ID = "partner_id";

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
    public MailPushDeviceDTO setCreateDate(Timestamp val) {
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
    public MailPushDeviceDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailPushDeviceDTO setCreateUid(String val) {
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
    public MailPushDeviceDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailPushDeviceDTO setDisplayName(String val) {
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
    public MailPushDeviceDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「浏览器端点」
     * @param val
     */
    @JsonProperty(FIELD_ENDPOINT)
    public MailPushDeviceDTO setEndpoint(String val) {
        this._set(FIELD_ENDPOINT, val);
        return this;
    }

    /**
     * 获取「浏览器端点」值
     *
     */
    @JsonIgnore
    public String getEndpoint() {
        return DataTypeUtils.asString(this._get(FIELD_ENDPOINT), null);
    }

    /**
     * 判断 「浏览器端点」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEndpoint() {
        return this._contains(FIELD_ENDPOINT);
    }

    /**
     * 重置 「浏览器端点」
     *
     */
    @JsonIgnore
    public MailPushDeviceDTO resetEndpoint() {
        this._reset(FIELD_ENDPOINT);
        return this;
    }

    /**
     * 设置「到期令牌日期」
     * @param val
     */
    @JsonProperty(FIELD_EXPIRATION_TIME)
    public MailPushDeviceDTO setExpirationTime(Timestamp val) {
        this._set(FIELD_EXPIRATION_TIME, val);
        return this;
    }

    /**
     * 获取「到期令牌日期」值
     *
     */
    @JsonIgnore
    public Timestamp getExpirationTime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_EXPIRATION_TIME), null);
    }

    /**
     * 判断 「到期令牌日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExpirationTime() {
        return this._contains(FIELD_EXPIRATION_TIME);
    }

    /**
     * 重置 「到期令牌日期」
     *
     */
    @JsonIgnore
    public MailPushDeviceDTO resetExpirationTime() {
        this._reset(FIELD_EXPIRATION_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailPushDeviceDTO setId(String val) {
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
    public MailPushDeviceDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「浏览器按键」
     * @param val
     */
    @JsonProperty(FIELD_KEYS)
    public MailPushDeviceDTO setKeys(String val) {
        this._set(FIELD_KEYS, val);
        return this;
    }

    /**
     * 获取「浏览器按键」值
     *
     */
    @JsonIgnore
    public String getKeys() {
        return DataTypeUtils.asString(this._get(FIELD_KEYS), null);
    }

    /**
     * 判断 「浏览器按键」是否有值
     *
     */
    @JsonIgnore
    public boolean containsKeys() {
        return this._contains(FIELD_KEYS);
    }

    /**
     * 重置 「浏览器按键」
     *
     */
    @JsonIgnore
    public MailPushDeviceDTO resetKeys() {
        this._reset(FIELD_KEYS);
        return this;
    }

    /**
     * 设置「合作伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_ID)
    public MailPushDeviceDTO setPartnerId(String val) {
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
    public MailPushDeviceDTO resetPartnerId() {
        this._reset(FIELD_PARTNER_ID);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailPushDeviceDTO setWriteDate(Timestamp val) {
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
    public MailPushDeviceDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailPushDeviceDTO setWriteUid(String val) {
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
    public MailPushDeviceDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
