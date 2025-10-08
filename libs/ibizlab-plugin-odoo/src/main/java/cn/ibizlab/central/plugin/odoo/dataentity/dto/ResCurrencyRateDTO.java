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


public class ResCurrencyRateDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 公司汇率
     */
    public final static String FIELD_COMPANY_RATE = "company_rate";

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
     * 属性: 公司逆利率
     */
    public final static String FIELD_INVERSE_COMPANY_RATE = "inverse_company_rate";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 技术费率
     */
    public final static String FIELD_RATE = "rate";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public ResCurrencyRateDTO setCompanyId(String val) {
        this._set(FIELD_COMPANY_ID, val);
        return this;
    }

    /**
     * 获取「公司」值
     *
     */
    @JsonIgnore
    public String getCompanyId() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_ID), null);
    }

    /**
     * 判断 「公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyId() {
        return this._contains(FIELD_COMPANY_ID);
    }

    /**
     * 重置 「公司」
     *
     */
    @JsonIgnore
    public ResCurrencyRateDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「公司汇率」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_RATE)
    public ResCurrencyRateDTO setCompanyRate(Double val) {
        this._set(FIELD_COMPANY_RATE, val);
        return this;
    }

    /**
     * 获取「公司汇率」值
     *
     */
    @JsonIgnore
    public Double getCompanyRate() {
        return DataTypeUtils.asDouble(this._get(FIELD_COMPANY_RATE), null);
    }

    /**
     * 判断 「公司汇率」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyRate() {
        return this._contains(FIELD_COMPANY_RATE);
    }

    /**
     * 重置 「公司汇率」
     *
     */
    @JsonIgnore
    public ResCurrencyRateDTO resetCompanyRate() {
        this._reset(FIELD_COMPANY_RATE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResCurrencyRateDTO setCreateDate(Timestamp val) {
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
    public ResCurrencyRateDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResCurrencyRateDTO setCreateUid(String val) {
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
    public ResCurrencyRateDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「币别」
     * @param val
     */
    @JsonProperty(FIELD_CURRENCY_ID)
    public ResCurrencyRateDTO setCurrencyId(String val) {
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
    public ResCurrencyRateDTO resetCurrencyId() {
        this._reset(FIELD_CURRENCY_ID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResCurrencyRateDTO setDisplayName(String val) {
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
    public ResCurrencyRateDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResCurrencyRateDTO setId(String val) {
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
    public ResCurrencyRateDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「公司逆利率」
     * @param val
     */
    @JsonProperty(FIELD_INVERSE_COMPANY_RATE)
    public ResCurrencyRateDTO setInverseCompanyRate(Double val) {
        this._set(FIELD_INVERSE_COMPANY_RATE, val);
        return this;
    }

    /**
     * 获取「公司逆利率」值
     *
     */
    @JsonIgnore
    public Double getInverseCompanyRate() {
        return DataTypeUtils.asDouble(this._get(FIELD_INVERSE_COMPANY_RATE), null);
    }

    /**
     * 判断 「公司逆利率」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInverseCompanyRate() {
        return this._contains(FIELD_INVERSE_COMPANY_RATE);
    }

    /**
     * 重置 「公司逆利率」
     *
     */
    @JsonIgnore
    public ResCurrencyRateDTO resetInverseCompanyRate() {
        this._reset(FIELD_INVERSE_COMPANY_RATE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResCurrencyRateDTO setName(String val) {
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
    public ResCurrencyRateDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「技术费率」
     * @param val
     */
    @JsonProperty(FIELD_RATE)
    public ResCurrencyRateDTO setRate(Double val) {
        this._set(FIELD_RATE, val);
        return this;
    }

    /**
     * 获取「技术费率」值
     *
     */
    @JsonIgnore
    public Double getRate() {
        return DataTypeUtils.asDouble(this._get(FIELD_RATE), null);
    }

    /**
     * 判断 「技术费率」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRate() {
        return this._contains(FIELD_RATE);
    }

    /**
     * 重置 「技术费率」
     *
     */
    @JsonIgnore
    public ResCurrencyRateDTO resetRate() {
        this._reset(FIELD_RATE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResCurrencyRateDTO setWriteDate(Timestamp val) {
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
    public ResCurrencyRateDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResCurrencyRateDTO setWriteUid(String val) {
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
    public ResCurrencyRateDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
