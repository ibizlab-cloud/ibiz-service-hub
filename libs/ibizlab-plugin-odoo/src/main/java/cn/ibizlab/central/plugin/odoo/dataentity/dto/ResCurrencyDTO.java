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


public class ResCurrencyDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 币别小组
     */
    public final static String FIELD_CURRENCY_SUBUNIT_LABEL = "currency_subunit_label";

    /**
     * 属性: 币别单位
     */
    public final static String FIELD_CURRENCY_UNIT_LABEL = "currency_unit_label";

    /**
     * 属性: 日期
     */
    public final static String FIELD_DATE = "date";

    /**
     * 属性: 小数位数
     */
    public final static String FIELD_DECIMAL_PLACES = "decimal_places";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 显示舍入警告信息
     */
    public final static String FIELD_DISPLAY_ROUNDING_WARNING = "display_rounding_warning";

    /**
     * 属性: 会计所在国家/地区代码
     */
    public final static String FIELD_FISCAL_COUNTRY_CODES = "fiscal_country_codes";

    /**
     * 属性: 名称
     */
    public final static String FIELD_FULL_NAME = "full_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 汇率
     */
    public final static String FIELD_INVERSE_RATE = "inverse_rate";

    /**
     * 属性: 是当前的公司币别
     */
    public final static String FIELD_IS_CURRENT_COMPANY_CURRENCY = "is_current_company_currency";

    /**
     * 属性: 币别的数字代码。
     */
    public final static String FIELD_ISO_NUMERIC = "iso_numeric";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 符号位置
     */
    public final static String FIELD_POSITION = "position";

    /**
     * 属性: 当前汇率
     */
    public final static String FIELD_RATE = "rate";

    /**
     * 属性: 费率字符串
     */
    public final static String FIELD_RATE_STRING = "rate_string";

    /**
     * 属性: 四舍五入系数
     */
    public final static String FIELD_ROUNDING = "rounding";

    /**
     * 属性: 符号
     */
    public final static String FIELD_SYMBOL = "symbol";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public ResCurrencyDTO setActive(Integer val) {
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
    public ResCurrencyDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResCurrencyDTO setCreateDate(Timestamp val) {
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
    public ResCurrencyDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResCurrencyDTO setCreateUid(String val) {
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
    public ResCurrencyDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「币别小组」
     * @param val
     */
    @JsonProperty(FIELD_CURRENCY_SUBUNIT_LABEL)
    public ResCurrencyDTO setCurrencySubunitLabel(String val) {
        this._set(FIELD_CURRENCY_SUBUNIT_LABEL, val);
        return this;
    }

    /**
     * 获取「币别小组」值
     *
     */
    @JsonIgnore
    public String getCurrencySubunitLabel() {
        return DataTypeUtils.asString(this._get(FIELD_CURRENCY_SUBUNIT_LABEL), null);
    }

    /**
     * 判断 「币别小组」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCurrencySubunitLabel() {
        return this._contains(FIELD_CURRENCY_SUBUNIT_LABEL);
    }

    /**
     * 重置 「币别小组」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetCurrencySubunitLabel() {
        this._reset(FIELD_CURRENCY_SUBUNIT_LABEL);
        return this;
    }

    /**
     * 设置「币别单位」
     * @param val
     */
    @JsonProperty(FIELD_CURRENCY_UNIT_LABEL)
    public ResCurrencyDTO setCurrencyUnitLabel(String val) {
        this._set(FIELD_CURRENCY_UNIT_LABEL, val);
        return this;
    }

    /**
     * 获取「币别单位」值
     *
     */
    @JsonIgnore
    public String getCurrencyUnitLabel() {
        return DataTypeUtils.asString(this._get(FIELD_CURRENCY_UNIT_LABEL), null);
    }

    /**
     * 判断 「币别单位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCurrencyUnitLabel() {
        return this._contains(FIELD_CURRENCY_UNIT_LABEL);
    }

    /**
     * 重置 「币别单位」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetCurrencyUnitLabel() {
        this._reset(FIELD_CURRENCY_UNIT_LABEL);
        return this;
    }

    /**
     * 设置「日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE)
    public ResCurrencyDTO setDate(Timestamp val) {
        this._set(FIELD_DATE, val);
        return this;
    }

    /**
     * 获取「日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DATE), null);
    }

    /**
     * 判断 「日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDate() {
        return this._contains(FIELD_DATE);
    }

    /**
     * 重置 「日期」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetDate() {
        this._reset(FIELD_DATE);
        return this;
    }

    /**
     * 设置「小数位数」
     * @param val
     */
    @JsonProperty(FIELD_DECIMAL_PLACES)
    public ResCurrencyDTO setDecimalPlaces(Integer val) {
        this._set(FIELD_DECIMAL_PLACES, val);
        return this;
    }

    /**
     * 获取「小数位数」值
     *
     */
    @JsonIgnore
    public Integer getDecimalPlaces() {
        return DataTypeUtils.asInteger(this._get(FIELD_DECIMAL_PLACES), null);
    }

    /**
     * 判断 「小数位数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDecimalPlaces() {
        return this._contains(FIELD_DECIMAL_PLACES);
    }

    /**
     * 重置 「小数位数」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetDecimalPlaces() {
        this._reset(FIELD_DECIMAL_PLACES);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResCurrencyDTO setDisplayName(String val) {
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
    public ResCurrencyDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「显示舍入警告信息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_ROUNDING_WARNING)
    public ResCurrencyDTO setDisplayRoundingWarning(Integer val) {
        this._set(FIELD_DISPLAY_ROUNDING_WARNING, val);
        return this;
    }

    /**
     * 获取「显示舍入警告信息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDisplayRoundingWarning() {
        return DataTypeUtils.asInteger(this._get(FIELD_DISPLAY_ROUNDING_WARNING), null);
    }

    /**
     * 判断 「显示舍入警告信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayRoundingWarning() {
        return this._contains(FIELD_DISPLAY_ROUNDING_WARNING);
    }

    /**
     * 重置 「显示舍入警告信息」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetDisplayRoundingWarning() {
        this._reset(FIELD_DISPLAY_ROUNDING_WARNING);
        return this;
    }

    /**
     * 设置「会计所在国家/地区代码」
     * @param val
     */
    @JsonProperty(FIELD_FISCAL_COUNTRY_CODES)
    public ResCurrencyDTO setFiscalCountryCodes(String val) {
        this._set(FIELD_FISCAL_COUNTRY_CODES, val);
        return this;
    }

    /**
     * 获取「会计所在国家/地区代码」值
     *
     */
    @JsonIgnore
    public String getFiscalCountryCodes() {
        return DataTypeUtils.asString(this._get(FIELD_FISCAL_COUNTRY_CODES), null);
    }

    /**
     * 判断 「会计所在国家/地区代码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFiscalCountryCodes() {
        return this._contains(FIELD_FISCAL_COUNTRY_CODES);
    }

    /**
     * 重置 「会计所在国家/地区代码」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetFiscalCountryCodes() {
        this._reset(FIELD_FISCAL_COUNTRY_CODES);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_FULL_NAME)
    public ResCurrencyDTO setFullName(String val) {
        this._set(FIELD_FULL_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getFullName() {
        return DataTypeUtils.asString(this._get(FIELD_FULL_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFullName() {
        return this._contains(FIELD_FULL_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetFullName() {
        this._reset(FIELD_FULL_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResCurrencyDTO setId(String val) {
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
    public ResCurrencyDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「汇率」
     * @param val
     */
    @JsonProperty(FIELD_INVERSE_RATE)
    public ResCurrencyDTO setInverseRate(Double val) {
        this._set(FIELD_INVERSE_RATE, val);
        return this;
    }

    /**
     * 获取「汇率」值
     *
     */
    @JsonIgnore
    public Double getInverseRate() {
        return DataTypeUtils.asDouble(this._get(FIELD_INVERSE_RATE), null);
    }

    /**
     * 判断 「汇率」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInverseRate() {
        return this._contains(FIELD_INVERSE_RATE);
    }

    /**
     * 重置 「汇率」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetInverseRate() {
        this._reset(FIELD_INVERSE_RATE);
        return this;
    }

    /**
     * 设置「是当前的公司币别」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_CURRENT_COMPANY_CURRENCY)
    public ResCurrencyDTO setIsCurrentCompanyCurrency(Integer val) {
        this._set(FIELD_IS_CURRENT_COMPANY_CURRENCY, val);
        return this;
    }

    /**
     * 获取「是当前的公司币别」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsCurrentCompanyCurrency() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_CURRENT_COMPANY_CURRENCY), null);
    }

    /**
     * 判断 「是当前的公司币别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsCurrentCompanyCurrency() {
        return this._contains(FIELD_IS_CURRENT_COMPANY_CURRENCY);
    }

    /**
     * 重置 「是当前的公司币别」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetIsCurrentCompanyCurrency() {
        this._reset(FIELD_IS_CURRENT_COMPANY_CURRENCY);
        return this;
    }

    /**
     * 设置「币别的数字代码。」
     * @param val
     */
    @JsonProperty(FIELD_ISO_NUMERIC)
    public ResCurrencyDTO setIsoNumeric(Integer val) {
        this._set(FIELD_ISO_NUMERIC, val);
        return this;
    }

    /**
     * 获取「币别的数字代码。」值
     *
     */
    @JsonIgnore
    public Integer getIsoNumeric() {
        return DataTypeUtils.asInteger(this._get(FIELD_ISO_NUMERIC), null);
    }

    /**
     * 判断 「币别的数字代码。」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsoNumeric() {
        return this._contains(FIELD_ISO_NUMERIC);
    }

    /**
     * 重置 「币别的数字代码。」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetIsoNumeric() {
        this._reset(FIELD_ISO_NUMERIC);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResCurrencyDTO setName(String val) {
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
    public ResCurrencyDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「符号位置」
     * 代码表[符号位置]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_currency_position
     * @param val
     */
    @JsonProperty(FIELD_POSITION)
    public ResCurrencyDTO setPosition(String val) {
        this._set(FIELD_POSITION, val);
        return this;
    }

    /**
     * 获取「符号位置」值
     * 代码表[符号位置]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_currency_position
     *
     */
    @JsonIgnore
    public String getPosition() {
        return DataTypeUtils.asString(this._get(FIELD_POSITION), null);
    }

    /**
     * 判断 「符号位置」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPosition() {
        return this._contains(FIELD_POSITION);
    }

    /**
     * 重置 「符号位置」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetPosition() {
        this._reset(FIELD_POSITION);
        return this;
    }

    /**
     * 设置「当前汇率」
     * @param val
     */
    @JsonProperty(FIELD_RATE)
    public ResCurrencyDTO setRate(Double val) {
        this._set(FIELD_RATE, val);
        return this;
    }

    /**
     * 获取「当前汇率」值
     *
     */
    @JsonIgnore
    public Double getRate() {
        return DataTypeUtils.asDouble(this._get(FIELD_RATE), null);
    }

    /**
     * 判断 「当前汇率」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRate() {
        return this._contains(FIELD_RATE);
    }

    /**
     * 重置 「当前汇率」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetRate() {
        this._reset(FIELD_RATE);
        return this;
    }

    /**
     * 设置「费率字符串」
     * @param val
     */
    @JsonProperty(FIELD_RATE_STRING)
    public ResCurrencyDTO setRateString(String val) {
        this._set(FIELD_RATE_STRING, val);
        return this;
    }

    /**
     * 获取「费率字符串」值
     *
     */
    @JsonIgnore
    public String getRateString() {
        return DataTypeUtils.asString(this._get(FIELD_RATE_STRING), null);
    }

    /**
     * 判断 「费率字符串」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRateString() {
        return this._contains(FIELD_RATE_STRING);
    }

    /**
     * 重置 「费率字符串」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetRateString() {
        this._reset(FIELD_RATE_STRING);
        return this;
    }

    /**
     * 设置「四舍五入系数」
     * @param val
     */
    @JsonProperty(FIELD_ROUNDING)
    public ResCurrencyDTO setRounding(Double val) {
        this._set(FIELD_ROUNDING, val);
        return this;
    }

    /**
     * 获取「四舍五入系数」值
     *
     */
    @JsonIgnore
    public Double getRounding() {
        return DataTypeUtils.asDouble(this._get(FIELD_ROUNDING), null);
    }

    /**
     * 判断 「四舍五入系数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRounding() {
        return this._contains(FIELD_ROUNDING);
    }

    /**
     * 重置 「四舍五入系数」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetRounding() {
        this._reset(FIELD_ROUNDING);
        return this;
    }

    /**
     * 设置「符号」
     * @param val
     */
    @JsonProperty(FIELD_SYMBOL)
    public ResCurrencyDTO setSymbol(String val) {
        this._set(FIELD_SYMBOL, val);
        return this;
    }

    /**
     * 获取「符号」值
     *
     */
    @JsonIgnore
    public String getSymbol() {
        return DataTypeUtils.asString(this._get(FIELD_SYMBOL), null);
    }

    /**
     * 判断 「符号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSymbol() {
        return this._contains(FIELD_SYMBOL);
    }

    /**
     * 重置 「符号」
     *
     */
    @JsonIgnore
    public ResCurrencyDTO resetSymbol() {
        this._reset(FIELD_SYMBOL);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResCurrencyDTO setWriteDate(Timestamp val) {
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
    public ResCurrencyDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResCurrencyDTO setWriteUid(String val) {
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
    public ResCurrencyDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
