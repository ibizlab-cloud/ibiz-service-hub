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


public class ResDeviceDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 浏览器
     */
    public final static String FIELD_BROWSER = "browser";

    /**
     * 属性: 城市
     */
    public final static String FIELD_CITY = "city";

    /**
     * 属性: 国家/地区
     */
    public final static String FIELD_COUNTRY = "country";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 设备类型
     */
    public final static String FIELD_DEVICE_TYPE = "device_type";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 首次活动
     */
    public final static String FIELD_FIRST_ACTIVITY = "first_activity";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: IP地址
     */
    public final static String FIELD_IP_ADDRESS = "ip_address";

    /**
     * 属性: 当前设备
     */
    public final static String FIELD_IS_CURRENT = "is_current";

    /**
     * 属性: 上个活动
     */
    public final static String FIELD_LAST_ACTIVITY = "last_activity";

    /**
     * 属性: 已连接的 IP 地址
     */
    public final static String FIELD_LINKED_IP_ADDRESSES = "linked_ip_addresses";

    /**
     * 属性: 平台
     */
    public final static String FIELD_PLATFORM = "platform";

    /**
     * 属性: 已撤销
     */
    public final static String FIELD_REVOKED = "revoked";

    /**
     * 属性: 会话标识符
     */
    public final static String FIELD_SESSION_IDENTIFIER = "session_identifier";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「浏览器」
     * @param val
     */
    @JsonProperty(FIELD_BROWSER)
    public ResDeviceDTO setBrowser(String val) {
        this._set(FIELD_BROWSER, val);
        return this;
    }

    /**
     * 获取「浏览器」值
     *
     */
    @JsonIgnore
    public String getBrowser() {
        return DataTypeUtils.asString(this._get(FIELD_BROWSER), null);
    }

    /**
     * 判断 「浏览器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBrowser() {
        return this._contains(FIELD_BROWSER);
    }

    /**
     * 重置 「浏览器」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetBrowser() {
        this._reset(FIELD_BROWSER);
        return this;
    }

    /**
     * 设置「城市」
     * @param val
     */
    @JsonProperty(FIELD_CITY)
    public ResDeviceDTO setCity(String val) {
        this._set(FIELD_CITY, val);
        return this;
    }

    /**
     * 获取「城市」值
     *
     */
    @JsonIgnore
    public String getCity() {
        return DataTypeUtils.asString(this._get(FIELD_CITY), null);
    }

    /**
     * 判断 「城市」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCity() {
        return this._contains(FIELD_CITY);
    }

    /**
     * 重置 「城市」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetCity() {
        this._reset(FIELD_CITY);
        return this;
    }

    /**
     * 设置「国家/地区」
     * @param val
     */
    @JsonProperty(FIELD_COUNTRY)
    public ResDeviceDTO setCountry(String val) {
        this._set(FIELD_COUNTRY, val);
        return this;
    }

    /**
     * 获取「国家/地区」值
     *
     */
    @JsonIgnore
    public String getCountry() {
        return DataTypeUtils.asString(this._get(FIELD_COUNTRY), null);
    }

    /**
     * 判断 「国家/地区」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCountry() {
        return this._contains(FIELD_COUNTRY);
    }

    /**
     * 重置 「国家/地区」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetCountry() {
        this._reset(FIELD_COUNTRY);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResDeviceDTO setCreateDate(Timestamp val) {
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
    public ResDeviceDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResDeviceDTO setCreateUid(String val) {
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
    public ResDeviceDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「设备类型」
     * 代码表[设备类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_device_device_type
     * @param val
     */
    @JsonProperty(FIELD_DEVICE_TYPE)
    public ResDeviceDTO setDeviceType(String val) {
        this._set(FIELD_DEVICE_TYPE, val);
        return this;
    }

    /**
     * 获取「设备类型」值
     * 代码表[设备类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_device_device_type
     *
     */
    @JsonIgnore
    public String getDeviceType() {
        return DataTypeUtils.asString(this._get(FIELD_DEVICE_TYPE), null);
    }

    /**
     * 判断 「设备类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDeviceType() {
        return this._contains(FIELD_DEVICE_TYPE);
    }

    /**
     * 重置 「设备类型」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetDeviceType() {
        this._reset(FIELD_DEVICE_TYPE);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResDeviceDTO setDisplayName(String val) {
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
    public ResDeviceDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「首次活动」
     * @param val
     */
    @JsonProperty(FIELD_FIRST_ACTIVITY)
    public ResDeviceDTO setFirstActivity(Timestamp val) {
        this._set(FIELD_FIRST_ACTIVITY, val);
        return this;
    }

    /**
     * 获取「首次活动」值
     *
     */
    @JsonIgnore
    public Timestamp getFirstActivity() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_FIRST_ACTIVITY), null);
    }

    /**
     * 判断 「首次活动」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFirstActivity() {
        return this._contains(FIELD_FIRST_ACTIVITY);
    }

    /**
     * 重置 「首次活动」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetFirstActivity() {
        this._reset(FIELD_FIRST_ACTIVITY);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResDeviceDTO setId(String val) {
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
    public ResDeviceDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「IP地址」
     * @param val
     */
    @JsonProperty(FIELD_IP_ADDRESS)
    public ResDeviceDTO setIpAddress(String val) {
        this._set(FIELD_IP_ADDRESS, val);
        return this;
    }

    /**
     * 获取「IP地址」值
     *
     */
    @JsonIgnore
    public String getIpAddress() {
        return DataTypeUtils.asString(this._get(FIELD_IP_ADDRESS), null);
    }

    /**
     * 判断 「IP地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIpAddress() {
        return this._contains(FIELD_IP_ADDRESS);
    }

    /**
     * 重置 「IP地址」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetIpAddress() {
        this._reset(FIELD_IP_ADDRESS);
        return this;
    }

    /**
     * 设置「当前设备」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_CURRENT)
    public ResDeviceDTO setIsCurrent(Integer val) {
        this._set(FIELD_IS_CURRENT, val);
        return this;
    }

    /**
     * 获取「当前设备」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsCurrent() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_CURRENT), null);
    }

    /**
     * 判断 「当前设备」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsCurrent() {
        return this._contains(FIELD_IS_CURRENT);
    }

    /**
     * 重置 「当前设备」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetIsCurrent() {
        this._reset(FIELD_IS_CURRENT);
        return this;
    }

    /**
     * 设置「上个活动」
     * @param val
     */
    @JsonProperty(FIELD_LAST_ACTIVITY)
    public ResDeviceDTO setLastActivity(Timestamp val) {
        this._set(FIELD_LAST_ACTIVITY, val);
        return this;
    }

    /**
     * 获取「上个活动」值
     *
     */
    @JsonIgnore
    public Timestamp getLastActivity() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LAST_ACTIVITY), null);
    }

    /**
     * 判断 「上个活动」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastActivity() {
        return this._contains(FIELD_LAST_ACTIVITY);
    }

    /**
     * 重置 「上个活动」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetLastActivity() {
        this._reset(FIELD_LAST_ACTIVITY);
        return this;
    }

    /**
     * 设置「已连接的 IP 地址」
     * @param val
     */
    @JsonProperty(FIELD_LINKED_IP_ADDRESSES)
    public ResDeviceDTO setLinkedIpAddresses(String val) {
        this._set(FIELD_LINKED_IP_ADDRESSES, val);
        return this;
    }

    /**
     * 获取「已连接的 IP 地址」值
     *
     */
    @JsonIgnore
    public String getLinkedIpAddresses() {
        return DataTypeUtils.asString(this._get(FIELD_LINKED_IP_ADDRESSES), null);
    }

    /**
     * 判断 「已连接的 IP 地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLinkedIpAddresses() {
        return this._contains(FIELD_LINKED_IP_ADDRESSES);
    }

    /**
     * 重置 「已连接的 IP 地址」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetLinkedIpAddresses() {
        this._reset(FIELD_LINKED_IP_ADDRESSES);
        return this;
    }

    /**
     * 设置「平台」
     * @param val
     */
    @JsonProperty(FIELD_PLATFORM)
    public ResDeviceDTO setPlatform(String val) {
        this._set(FIELD_PLATFORM, val);
        return this;
    }

    /**
     * 获取「平台」值
     *
     */
    @JsonIgnore
    public String getPlatform() {
        return DataTypeUtils.asString(this._get(FIELD_PLATFORM), null);
    }

    /**
     * 判断 「平台」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlatform() {
        return this._contains(FIELD_PLATFORM);
    }

    /**
     * 重置 「平台」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetPlatform() {
        this._reset(FIELD_PLATFORM);
        return this;
    }

    /**
     * 设置「已撤销」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_REVOKED)
    public ResDeviceDTO setRevoked(Integer val) {
        this._set(FIELD_REVOKED, val);
        return this;
    }

    /**
     * 获取「已撤销」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getRevoked() {
        return DataTypeUtils.asInteger(this._get(FIELD_REVOKED), null);
    }

    /**
     * 判断 「已撤销」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRevoked() {
        return this._contains(FIELD_REVOKED);
    }

    /**
     * 重置 「已撤销」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetRevoked() {
        this._reset(FIELD_REVOKED);
        return this;
    }

    /**
     * 设置「会话标识符」
     * @param val
     */
    @JsonProperty(FIELD_SESSION_IDENTIFIER)
    public ResDeviceDTO setSessionIdentifier(String val) {
        this._set(FIELD_SESSION_IDENTIFIER, val);
        return this;
    }

    /**
     * 获取「会话标识符」值
     *
     */
    @JsonIgnore
    public String getSessionIdentifier() {
        return DataTypeUtils.asString(this._get(FIELD_SESSION_IDENTIFIER), null);
    }

    /**
     * 判断 「会话标识符」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSessionIdentifier() {
        return this._contains(FIELD_SESSION_IDENTIFIER);
    }

    /**
     * 重置 「会话标识符」
     *
     */
    @JsonIgnore
    public ResDeviceDTO resetSessionIdentifier() {
        this._reset(FIELD_SESSION_IDENTIFIER);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public ResDeviceDTO setUserId(String val) {
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
    public ResDeviceDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResDeviceDTO setWriteDate(Timestamp val) {
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
    public ResDeviceDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResDeviceDTO setWriteUid(String val) {
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
    public ResDeviceDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
