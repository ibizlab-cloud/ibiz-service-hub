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


public class MailIceServerDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 凭据
     */
    public final static String FIELD_CREDENTIAL = "credential";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 类型
     */
    public final static String FIELD_SERVER_TYPE = "server_type";

    /**
     * 属性: URI
     */
    public final static String FIELD_URI = "uri";

    /**
     * 属性: 用户名
     */
    public final static String FIELD_USERNAME = "username";

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
    public MailIceServerDTO setCreateDate(Timestamp val) {
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
    public MailIceServerDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailIceServerDTO setCreateUid(String val) {
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
    public MailIceServerDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「凭据」
     * @param val
     */
    @JsonProperty(FIELD_CREDENTIAL)
    public MailIceServerDTO setCredential(String val) {
        this._set(FIELD_CREDENTIAL, val);
        return this;
    }

    /**
     * 获取「凭据」值
     *
     */
    @JsonIgnore
    public String getCredential() {
        return DataTypeUtils.asString(this._get(FIELD_CREDENTIAL), null);
    }

    /**
     * 判断 「凭据」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCredential() {
        return this._contains(FIELD_CREDENTIAL);
    }

    /**
     * 重置 「凭据」
     *
     */
    @JsonIgnore
    public MailIceServerDTO resetCredential() {
        this._reset(FIELD_CREDENTIAL);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailIceServerDTO setDisplayName(String val) {
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
    public MailIceServerDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailIceServerDTO setId(String val) {
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
    public MailIceServerDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_ice_server_server_type
     * @param val
     */
    @JsonProperty(FIELD_SERVER_TYPE)
    public MailIceServerDTO setServerType(String val) {
        this._set(FIELD_SERVER_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_ice_server_server_type
     *
     */
    @JsonIgnore
    public String getServerType() {
        return DataTypeUtils.asString(this._get(FIELD_SERVER_TYPE), null);
    }

    /**
     * 判断 「类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsServerType() {
        return this._contains(FIELD_SERVER_TYPE);
    }

    /**
     * 重置 「类型」
     *
     */
    @JsonIgnore
    public MailIceServerDTO resetServerType() {
        this._reset(FIELD_SERVER_TYPE);
        return this;
    }

    /**
     * 设置「URI」
     * @param val
     */
    @JsonProperty(FIELD_URI)
    public MailIceServerDTO setUri(String val) {
        this._set(FIELD_URI, val);
        return this;
    }

    /**
     * 获取「URI」值
     *
     */
    @JsonIgnore
    public String getUri() {
        return DataTypeUtils.asString(this._get(FIELD_URI), null);
    }

    /**
     * 判断 「URI」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUri() {
        return this._contains(FIELD_URI);
    }

    /**
     * 重置 「URI」
     *
     */
    @JsonIgnore
    public MailIceServerDTO resetUri() {
        this._reset(FIELD_URI);
        return this;
    }

    /**
     * 设置「用户名」
     * @param val
     */
    @JsonProperty(FIELD_USERNAME)
    public MailIceServerDTO setUsername(String val) {
        this._set(FIELD_USERNAME, val);
        return this;
    }

    /**
     * 获取「用户名」值
     *
     */
    @JsonIgnore
    public String getUsername() {
        return DataTypeUtils.asString(this._get(FIELD_USERNAME), null);
    }

    /**
     * 判断 「用户名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUsername() {
        return this._contains(FIELD_USERNAME);
    }

    /**
     * 重置 「用户名」
     *
     */
    @JsonIgnore
    public MailIceServerDTO resetUsername() {
        this._reset(FIELD_USERNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailIceServerDTO setWriteDate(Timestamp val) {
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
    public MailIceServerDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailIceServerDTO setWriteUid(String val) {
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
    public MailIceServerDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
