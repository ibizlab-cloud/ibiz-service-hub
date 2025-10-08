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


public class ResBankDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 银行识别码
     */
    public final static String FIELD_BIC = "bic";

    /**
     * 属性: 城市
     */
    public final static String FIELD_CITY = "city";

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
     * 属性: 邮箱
     */
    public final static String FIELD_EMAIL = "email";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 电话
     */
    public final static String FIELD_PHONE = "phone";

    /**
     * 属性: 街道
     */
    public final static String FIELD_STREET = "street";

    /**
     * 属性: 详细地址
     */
    public final static String FIELD_STREET2 = "street2";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 属性: 邮编
     */
    public final static String FIELD_ZIP = "zip";

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public ResBankDTO setActive(Integer val) {
        this._set(FIELD_ACTIVE, val);
        return this;
    }

    /**
     * 获取「有效」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getActive() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE), null);
    }

    /**
     * 判断 「有效」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActive() {
        return this._contains(FIELD_ACTIVE);
    }

    /**
     * 重置 「有效」
     *
     */
    @JsonIgnore
    public ResBankDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「银行识别码」
     * @param val
     */
    @JsonProperty(FIELD_BIC)
    public ResBankDTO setBic(String val) {
        this._set(FIELD_BIC, val);
        return this;
    }

    /**
     * 获取「银行识别码」值
     *
     */
    @JsonIgnore
    public String getBic() {
        return DataTypeUtils.asString(this._get(FIELD_BIC), null);
    }

    /**
     * 判断 「银行识别码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBic() {
        return this._contains(FIELD_BIC);
    }

    /**
     * 重置 「银行识别码」
     *
     */
    @JsonIgnore
    public ResBankDTO resetBic() {
        this._reset(FIELD_BIC);
        return this;
    }

    /**
     * 设置「城市」
     * @param val
     */
    @JsonProperty(FIELD_CITY)
    public ResBankDTO setCity(String val) {
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
    public ResBankDTO resetCity() {
        this._reset(FIELD_CITY);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResBankDTO setCreateDate(Timestamp val) {
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
    public ResBankDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResBankDTO setCreateUid(String val) {
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
    public ResBankDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResBankDTO setDisplayName(String val) {
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
    public ResBankDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「邮箱」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL)
    public ResBankDTO setEmail(String val) {
        this._set(FIELD_EMAIL, val);
        return this;
    }

    /**
     * 获取「邮箱」值
     *
     */
    @JsonIgnore
    public String getEmail() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL), null);
    }

    /**
     * 判断 「邮箱」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmail() {
        return this._contains(FIELD_EMAIL);
    }

    /**
     * 重置 「邮箱」
     *
     */
    @JsonIgnore
    public ResBankDTO resetEmail() {
        this._reset(FIELD_EMAIL);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResBankDTO setId(String val) {
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
    public ResBankDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResBankDTO setName(String val) {
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
    public ResBankDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「电话」
     * @param val
     */
    @JsonProperty(FIELD_PHONE)
    public ResBankDTO setPhone(String val) {
        this._set(FIELD_PHONE, val);
        return this;
    }

    /**
     * 获取「电话」值
     *
     */
    @JsonIgnore
    public String getPhone() {
        return DataTypeUtils.asString(this._get(FIELD_PHONE), null);
    }

    /**
     * 判断 「电话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhone() {
        return this._contains(FIELD_PHONE);
    }

    /**
     * 重置 「电话」
     *
     */
    @JsonIgnore
    public ResBankDTO resetPhone() {
        this._reset(FIELD_PHONE);
        return this;
    }

    /**
     * 设置「街道」
     * @param val
     */
    @JsonProperty(FIELD_STREET)
    public ResBankDTO setStreet(String val) {
        this._set(FIELD_STREET, val);
        return this;
    }

    /**
     * 获取「街道」值
     *
     */
    @JsonIgnore
    public String getStreet() {
        return DataTypeUtils.asString(this._get(FIELD_STREET), null);
    }

    /**
     * 判断 「街道」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStreet() {
        return this._contains(FIELD_STREET);
    }

    /**
     * 重置 「街道」
     *
     */
    @JsonIgnore
    public ResBankDTO resetStreet() {
        this._reset(FIELD_STREET);
        return this;
    }

    /**
     * 设置「详细地址」
     * @param val
     */
    @JsonProperty(FIELD_STREET2)
    public ResBankDTO setStreet2(String val) {
        this._set(FIELD_STREET2, val);
        return this;
    }

    /**
     * 获取「详细地址」值
     *
     */
    @JsonIgnore
    public String getStreet2() {
        return DataTypeUtils.asString(this._get(FIELD_STREET2), null);
    }

    /**
     * 判断 「详细地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStreet2() {
        return this._contains(FIELD_STREET2);
    }

    /**
     * 重置 「详细地址」
     *
     */
    @JsonIgnore
    public ResBankDTO resetStreet2() {
        this._reset(FIELD_STREET2);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResBankDTO setWriteDate(Timestamp val) {
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
    public ResBankDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResBankDTO setWriteUid(String val) {
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
    public ResBankDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

    /**
     * 设置「邮编」
     * @param val
     */
    @JsonProperty(FIELD_ZIP)
    public ResBankDTO setZip(String val) {
        this._set(FIELD_ZIP, val);
        return this;
    }

    /**
     * 获取「邮编」值
     *
     */
    @JsonIgnore
    public String getZip() {
        return DataTypeUtils.asString(this._get(FIELD_ZIP), null);
    }

    /**
     * 判断 「邮编」是否有值
     *
     */
    @JsonIgnore
    public boolean containsZip() {
        return this._contains(FIELD_ZIP);
    }

    /**
     * 重置 「邮编」
     *
     */
    @JsonIgnore
    public ResBankDTO resetZip() {
        this._reset(FIELD_ZIP);
        return this;
    }

}
