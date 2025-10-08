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


public class ResCountryDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 报表中的布局
     */
    public final static String FIELD_ADDRESS_FORMAT = "address_format";

    /**
     * 属性: 国家/地区代码
     */
    public final static String FIELD_CODE = "code";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 币别
     */
    public final static String FIELD_CURRENCY_ID = "currency_id";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 旗帜
     */
    public final static String FIELD_IMAGE_URL = "image_url";

    /**
     * 属性: 是支持Stripe支付的国家/地区
     */
    public final static String FIELD_IS_STRIPE_SUPPORTED_COUNTRY = "is_stripe_supported_country";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 客户姓名 职位
     */
    public final static String FIELD_NAME_POSITION = "name_position";

    /**
     * 属性: 国家/地区长途区号
     */
    public final static String FIELD_PHONE_CODE = "phone_code";

    /**
     * 属性: 省/州必填
     */
    public final static String FIELD_STATE_REQUIRED = "state_required";

    /**
     * 属性: 大桶标签
     */
    public final static String FIELD_VAT_LABEL = "vat_label";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 属性: 需要邮编
     */
    public final static String FIELD_ZIP_REQUIRED = "zip_required";

    /**
     * 设置「报表中的布局」
     * @param val
     */
    @JsonProperty(FIELD_ADDRESS_FORMAT)
    public ResCountryDTO setAddressFormat(String val) {
        this._set(FIELD_ADDRESS_FORMAT, val);
        return this;
    }

    /**
     * 获取「报表中的布局」值
     *
     */
    @JsonIgnore
    public String getAddressFormat() {
        return DataTypeUtils.asString(this._get(FIELD_ADDRESS_FORMAT), null);
    }

    /**
     * 判断 「报表中的布局」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAddressFormat() {
        return this._contains(FIELD_ADDRESS_FORMAT);
    }

    /**
     * 重置 「报表中的布局」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetAddressFormat() {
        this._reset(FIELD_ADDRESS_FORMAT);
        return this;
    }

    /**
     * 设置「国家/地区代码」
     * @param val
     */
    @JsonProperty(FIELD_CODE)
    public ResCountryDTO setCode(String val) {
        this._set(FIELD_CODE, val);
        return this;
    }

    /**
     * 获取「国家/地区代码」值
     *
     */
    @JsonIgnore
    public String getCode() {
        return DataTypeUtils.asString(this._get(FIELD_CODE), null);
    }

    /**
     * 判断 「国家/地区代码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCode() {
        return this._contains(FIELD_CODE);
    }

    /**
     * 重置 「国家/地区代码」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetCode() {
        this._reset(FIELD_CODE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResCountryDTO setCreateDate(Timestamp val) {
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
    public ResCountryDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResCountryDTO setCreateUid(String val) {
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
    public ResCountryDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「币别」
     * @param val
     */
    @JsonProperty(FIELD_CURRENCY_ID)
    public ResCountryDTO setCurrencyId(String val) {
        this._set(FIELD_CURRENCY_ID, val);
        return this;
    }

    /**
     * 获取「币别」值
     *
     */
    @JsonIgnore
    public String getCurrencyId() {
        return DataTypeUtils.asString(this._get(FIELD_CURRENCY_ID), null);
    }

    /**
     * 判断 「币别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCurrencyId() {
        return this._contains(FIELD_CURRENCY_ID);
    }

    /**
     * 重置 「币别」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetCurrencyId() {
        this._reset(FIELD_CURRENCY_ID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResCountryDTO setDisplayName(String val) {
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
    public ResCountryDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResCountryDTO setId(String val) {
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
    public ResCountryDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「旗帜」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE_URL)
    public ResCountryDTO setImageUrl(String val) {
        this._set(FIELD_IMAGE_URL, val);
        return this;
    }

    /**
     * 获取「旗帜」值
     *
     */
    @JsonIgnore
    public String getImageUrl() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE_URL), null);
    }

    /**
     * 判断 「旗帜」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImageUrl() {
        return this._contains(FIELD_IMAGE_URL);
    }

    /**
     * 重置 「旗帜」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetImageUrl() {
        this._reset(FIELD_IMAGE_URL);
        return this;
    }

    /**
     * 设置「是支持Stripe支付的国家/地区」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_STRIPE_SUPPORTED_COUNTRY)
    public ResCountryDTO setIsStripeSupportedCountry(Integer val) {
        this._set(FIELD_IS_STRIPE_SUPPORTED_COUNTRY, val);
        return this;
    }

    /**
     * 获取「是支持Stripe支付的国家/地区」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsStripeSupportedCountry() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_STRIPE_SUPPORTED_COUNTRY), null);
    }

    /**
     * 判断 「是支持Stripe支付的国家/地区」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsStripeSupportedCountry() {
        return this._contains(FIELD_IS_STRIPE_SUPPORTED_COUNTRY);
    }

    /**
     * 重置 「是支持Stripe支付的国家/地区」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetIsStripeSupportedCountry() {
        this._reset(FIELD_IS_STRIPE_SUPPORTED_COUNTRY);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResCountryDTO setName(String val) {
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
    public ResCountryDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「客户姓名 职位」
     * 代码表[客户姓名 职位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_country_name_position
     * @param val
     */
    @JsonProperty(FIELD_NAME_POSITION)
    public ResCountryDTO setNamePosition(String val) {
        this._set(FIELD_NAME_POSITION, val);
        return this;
    }

    /**
     * 获取「客户姓名 职位」值
     * 代码表[客户姓名 职位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_country_name_position
     *
     */
    @JsonIgnore
    public String getNamePosition() {
        return DataTypeUtils.asString(this._get(FIELD_NAME_POSITION), null);
    }

    /**
     * 判断 「客户姓名 职位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNamePosition() {
        return this._contains(FIELD_NAME_POSITION);
    }

    /**
     * 重置 「客户姓名 职位」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetNamePosition() {
        this._reset(FIELD_NAME_POSITION);
        return this;
    }

    /**
     * 设置「国家/地区长途区号」
     * @param val
     */
    @JsonProperty(FIELD_PHONE_CODE)
    public ResCountryDTO setPhoneCode(Integer val) {
        this._set(FIELD_PHONE_CODE, val);
        return this;
    }

    /**
     * 获取「国家/地区长途区号」值
     *
     */
    @JsonIgnore
    public Integer getPhoneCode() {
        return DataTypeUtils.asInteger(this._get(FIELD_PHONE_CODE), null);
    }

    /**
     * 判断 「国家/地区长途区号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhoneCode() {
        return this._contains(FIELD_PHONE_CODE);
    }

    /**
     * 重置 「国家/地区长途区号」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetPhoneCode() {
        this._reset(FIELD_PHONE_CODE);
        return this;
    }

    /**
     * 设置「省/州必填」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_STATE_REQUIRED)
    public ResCountryDTO setStateRequired(Integer val) {
        this._set(FIELD_STATE_REQUIRED, val);
        return this;
    }

    /**
     * 获取「省/州必填」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getStateRequired() {
        return DataTypeUtils.asInteger(this._get(FIELD_STATE_REQUIRED), null);
    }

    /**
     * 判断 「省/州必填」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStateRequired() {
        return this._contains(FIELD_STATE_REQUIRED);
    }

    /**
     * 重置 「省/州必填」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetStateRequired() {
        this._reset(FIELD_STATE_REQUIRED);
        return this;
    }

    /**
     * 设置「大桶标签」
     * @param val
     */
    @JsonProperty(FIELD_VAT_LABEL)
    public ResCountryDTO setVatLabel(String val) {
        this._set(FIELD_VAT_LABEL, val);
        return this;
    }

    /**
     * 获取「大桶标签」值
     *
     */
    @JsonIgnore
    public String getVatLabel() {
        return DataTypeUtils.asString(this._get(FIELD_VAT_LABEL), null);
    }

    /**
     * 判断 「大桶标签」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVatLabel() {
        return this._contains(FIELD_VAT_LABEL);
    }

    /**
     * 重置 「大桶标签」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetVatLabel() {
        this._reset(FIELD_VAT_LABEL);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResCountryDTO setWriteDate(Timestamp val) {
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
    public ResCountryDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResCountryDTO setWriteUid(String val) {
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
    public ResCountryDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

    /**
     * 设置「需要邮编」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ZIP_REQUIRED)
    public ResCountryDTO setZipRequired(Integer val) {
        this._set(FIELD_ZIP_REQUIRED, val);
        return this;
    }

    /**
     * 获取「需要邮编」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getZipRequired() {
        return DataTypeUtils.asInteger(this._get(FIELD_ZIP_REQUIRED), null);
    }

    /**
     * 判断 「需要邮编」是否有值
     *
     */
    @JsonIgnore
    public boolean containsZipRequired() {
        return this._contains(FIELD_ZIP_REQUIRED);
    }

    /**
     * 重置 「需要邮编」
     *
     */
    @JsonIgnore
    public ResCountryDTO resetZipRequired() {
        this._reset(FIELD_ZIP_REQUIRED);
        return this;
    }

}
