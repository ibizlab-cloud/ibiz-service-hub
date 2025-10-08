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


public class ResLangDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 语言环境代码
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
     * 属性: 日期格式
     */
    public final static String FIELD_DATE_FORMAT = "date_format";

    /**
     * 属性: 小数分隔符
     */
    public final static String FIELD_DECIMAL_POINT = "decimal_point";

    /**
     * 属性: 方向
     */
    public final static String FIELD_DIRECTION = "direction";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 旗帜图片网址
     */
    public final static String FIELD_FLAG_IMAGE_URL = "flag_image_url";

    /**
     * 属性: 分隔符格式
     */
    public final static String FIELD_GROUPING = "grouping";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: ISO 代码
     */
    public final static String FIELD_ISO_CODE = "iso_code";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 短时间格式
     */
    public final static String FIELD_SHORT_TIME_FORMAT = "short_time_format";

    /**
     * 属性: 千位分隔符
     */
    public final static String FIELD_THOUSANDS_SEP = "thousands_sep";

    /**
     * 属性: 时间格式
     */
    public final static String FIELD_TIME_FORMAT = "time_format";

    /**
     * 属性: URL 代码
     */
    public final static String FIELD_URL_CODE = "url_code";

    /**
     * 属性: 一周的第一天
     */
    public final static String FIELD_WEEK_START = "week_start";

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
    public ResLangDTO setActive(Integer val) {
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
    public ResLangDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「语言环境代码」
     * @param val
     */
    @JsonProperty(FIELD_CODE)
    public ResLangDTO setCode(String val) {
        this._set(FIELD_CODE, val);
        return this;
    }

    /**
     * 获取「语言环境代码」值
     *
     */
    @JsonIgnore
    public String getCode() {
        return DataTypeUtils.asString(this._get(FIELD_CODE), null);
    }

    /**
     * 判断 「语言环境代码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCode() {
        return this._contains(FIELD_CODE);
    }

    /**
     * 重置 「语言环境代码」
     *
     */
    @JsonIgnore
    public ResLangDTO resetCode() {
        this._reset(FIELD_CODE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResLangDTO setCreateDate(Timestamp val) {
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
    public ResLangDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResLangDTO setCreateUid(String val) {
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
    public ResLangDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「日期格式」
     * @param val
     */
    @JsonProperty(FIELD_DATE_FORMAT)
    public ResLangDTO setDateFormat(String val) {
        this._set(FIELD_DATE_FORMAT, val);
        return this;
    }

    /**
     * 获取「日期格式」值
     *
     */
    @JsonIgnore
    public String getDateFormat() {
        return DataTypeUtils.asString(this._get(FIELD_DATE_FORMAT), null);
    }

    /**
     * 判断 「日期格式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDateFormat() {
        return this._contains(FIELD_DATE_FORMAT);
    }

    /**
     * 重置 「日期格式」
     *
     */
    @JsonIgnore
    public ResLangDTO resetDateFormat() {
        this._reset(FIELD_DATE_FORMAT);
        return this;
    }

    /**
     * 设置「小数分隔符」
     * @param val
     */
    @JsonProperty(FIELD_DECIMAL_POINT)
    public ResLangDTO setDecimalPoint(String val) {
        this._set(FIELD_DECIMAL_POINT, val);
        return this;
    }

    /**
     * 获取「小数分隔符」值
     *
     */
    @JsonIgnore
    public String getDecimalPoint() {
        return DataTypeUtils.asString(this._get(FIELD_DECIMAL_POINT), null);
    }

    /**
     * 判断 「小数分隔符」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDecimalPoint() {
        return this._contains(FIELD_DECIMAL_POINT);
    }

    /**
     * 重置 「小数分隔符」
     *
     */
    @JsonIgnore
    public ResLangDTO resetDecimalPoint() {
        this._reset(FIELD_DECIMAL_POINT);
        return this;
    }

    /**
     * 设置「方向」
     * 代码表[方向]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_lang_direction
     * @param val
     */
    @JsonProperty(FIELD_DIRECTION)
    public ResLangDTO setDirection(String val) {
        this._set(FIELD_DIRECTION, val);
        return this;
    }

    /**
     * 获取「方向」值
     * 代码表[方向]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_lang_direction
     *
     */
    @JsonIgnore
    public String getDirection() {
        return DataTypeUtils.asString(this._get(FIELD_DIRECTION), null);
    }

    /**
     * 判断 「方向」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDirection() {
        return this._contains(FIELD_DIRECTION);
    }

    /**
     * 重置 「方向」
     *
     */
    @JsonIgnore
    public ResLangDTO resetDirection() {
        this._reset(FIELD_DIRECTION);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResLangDTO setDisplayName(String val) {
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
    public ResLangDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「旗帜图片网址」
     * @param val
     */
    @JsonProperty(FIELD_FLAG_IMAGE_URL)
    public ResLangDTO setFlagImageUrl(String val) {
        this._set(FIELD_FLAG_IMAGE_URL, val);
        return this;
    }

    /**
     * 获取「旗帜图片网址」值
     *
     */
    @JsonIgnore
    public String getFlagImageUrl() {
        return DataTypeUtils.asString(this._get(FIELD_FLAG_IMAGE_URL), null);
    }

    /**
     * 判断 「旗帜图片网址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFlagImageUrl() {
        return this._contains(FIELD_FLAG_IMAGE_URL);
    }

    /**
     * 重置 「旗帜图片网址」
     *
     */
    @JsonIgnore
    public ResLangDTO resetFlagImageUrl() {
        this._reset(FIELD_FLAG_IMAGE_URL);
        return this;
    }

    /**
     * 设置「分隔符格式」
     * @param val
     */
    @JsonProperty(FIELD_GROUPING)
    public ResLangDTO setGrouping(String val) {
        this._set(FIELD_GROUPING, val);
        return this;
    }

    /**
     * 获取「分隔符格式」值
     *
     */
    @JsonIgnore
    public String getGrouping() {
        return DataTypeUtils.asString(this._get(FIELD_GROUPING), null);
    }

    /**
     * 判断 「分隔符格式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGrouping() {
        return this._contains(FIELD_GROUPING);
    }

    /**
     * 重置 「分隔符格式」
     *
     */
    @JsonIgnore
    public ResLangDTO resetGrouping() {
        this._reset(FIELD_GROUPING);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResLangDTO setId(String val) {
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
    public ResLangDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「ISO 代码」
     * @param val
     */
    @JsonProperty(FIELD_ISO_CODE)
    public ResLangDTO setIsoCode(String val) {
        this._set(FIELD_ISO_CODE, val);
        return this;
    }

    /**
     * 获取「ISO 代码」值
     *
     */
    @JsonIgnore
    public String getIsoCode() {
        return DataTypeUtils.asString(this._get(FIELD_ISO_CODE), null);
    }

    /**
     * 判断 「ISO 代码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsoCode() {
        return this._contains(FIELD_ISO_CODE);
    }

    /**
     * 重置 「ISO 代码」
     *
     */
    @JsonIgnore
    public ResLangDTO resetIsoCode() {
        this._reset(FIELD_ISO_CODE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResLangDTO setName(String val) {
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
    public ResLangDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「短时间格式」
     * @param val
     */
    @JsonProperty(FIELD_SHORT_TIME_FORMAT)
    public ResLangDTO setShortTimeFormat(String val) {
        this._set(FIELD_SHORT_TIME_FORMAT, val);
        return this;
    }

    /**
     * 获取「短时间格式」值
     *
     */
    @JsonIgnore
    public String getShortTimeFormat() {
        return DataTypeUtils.asString(this._get(FIELD_SHORT_TIME_FORMAT), null);
    }

    /**
     * 判断 「短时间格式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShortTimeFormat() {
        return this._contains(FIELD_SHORT_TIME_FORMAT);
    }

    /**
     * 重置 「短时间格式」
     *
     */
    @JsonIgnore
    public ResLangDTO resetShortTimeFormat() {
        this._reset(FIELD_SHORT_TIME_FORMAT);
        return this;
    }

    /**
     * 设置「千位分隔符」
     * @param val
     */
    @JsonProperty(FIELD_THOUSANDS_SEP)
    public ResLangDTO setThousandsSep(String val) {
        this._set(FIELD_THOUSANDS_SEP, val);
        return this;
    }

    /**
     * 获取「千位分隔符」值
     *
     */
    @JsonIgnore
    public String getThousandsSep() {
        return DataTypeUtils.asString(this._get(FIELD_THOUSANDS_SEP), null);
    }

    /**
     * 判断 「千位分隔符」是否有值
     *
     */
    @JsonIgnore
    public boolean containsThousandsSep() {
        return this._contains(FIELD_THOUSANDS_SEP);
    }

    /**
     * 重置 「千位分隔符」
     *
     */
    @JsonIgnore
    public ResLangDTO resetThousandsSep() {
        this._reset(FIELD_THOUSANDS_SEP);
        return this;
    }

    /**
     * 设置「时间格式」
     * @param val
     */
    @JsonProperty(FIELD_TIME_FORMAT)
    public ResLangDTO setTimeFormat(String val) {
        this._set(FIELD_TIME_FORMAT, val);
        return this;
    }

    /**
     * 获取「时间格式」值
     *
     */
    @JsonIgnore
    public String getTimeFormat() {
        return DataTypeUtils.asString(this._get(FIELD_TIME_FORMAT), null);
    }

    /**
     * 判断 「时间格式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTimeFormat() {
        return this._contains(FIELD_TIME_FORMAT);
    }

    /**
     * 重置 「时间格式」
     *
     */
    @JsonIgnore
    public ResLangDTO resetTimeFormat() {
        this._reset(FIELD_TIME_FORMAT);
        return this;
    }

    /**
     * 设置「URL 代码」
     * @param val
     */
    @JsonProperty(FIELD_URL_CODE)
    public ResLangDTO setUrlCode(String val) {
        this._set(FIELD_URL_CODE, val);
        return this;
    }

    /**
     * 获取「URL 代码」值
     *
     */
    @JsonIgnore
    public String getUrlCode() {
        return DataTypeUtils.asString(this._get(FIELD_URL_CODE), null);
    }

    /**
     * 判断 「URL 代码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUrlCode() {
        return this._contains(FIELD_URL_CODE);
    }

    /**
     * 重置 「URL 代码」
     *
     */
    @JsonIgnore
    public ResLangDTO resetUrlCode() {
        this._reset(FIELD_URL_CODE);
        return this;
    }

    /**
     * 设置「一周的第一天」
     * 代码表[一周的第一天]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_lang_week_start
     * @param val
     */
    @JsonProperty(FIELD_WEEK_START)
    public ResLangDTO setWeekStart(String val) {
        this._set(FIELD_WEEK_START, val);
        return this;
    }

    /**
     * 获取「一周的第一天」值
     * 代码表[一周的第一天]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_lang_week_start
     *
     */
    @JsonIgnore
    public String getWeekStart() {
        return DataTypeUtils.asString(this._get(FIELD_WEEK_START), null);
    }

    /**
     * 判断 「一周的第一天」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWeekStart() {
        return this._contains(FIELD_WEEK_START);
    }

    /**
     * 重置 「一周的第一天」
     *
     */
    @JsonIgnore
    public ResLangDTO resetWeekStart() {
        this._reset(FIELD_WEEK_START);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResLangDTO setWriteDate(Timestamp val) {
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
    public ResLangDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResLangDTO setWriteUid(String val) {
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
    public ResLangDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
