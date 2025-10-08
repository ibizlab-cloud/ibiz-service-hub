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


public class ResourceCalendarLeavesDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 工作时间
     */
    public final static String FIELD_CALENDAR_ID = "calendar_id";

    /**
     * 属性: 工作时间名称
     */
    public final static String FIELD_CALENDAR_NAME = "calendar_name";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 公司名称
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 开始日期
     */
    public final static String FIELD_DATE_FROM = "date_from";

    /**
     * 属性: 结束日期
     */
    public final static String FIELD_DATE_TO = "date_to";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 休假要求
     */
    public final static String FIELD_HOLIDAY_ID = "holiday_id";

    /**
     * 属性: 休假要求
     */
    public final static String FIELD_HOLNAMEAY_NAME = "holnameay_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 资源
     */
    public final static String FIELD_RESOURCE_ID = "resource_id";

    /**
     * 属性: 资源名称
     */
    public final static String FIELD_RESOURCE_NAME = "resource_name";

    /**
     * 属性: 时间类型
     */
    public final static String FIELD_TIME_TYPE = "time_type";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「工作时间」
     * @param val
     */
    @JsonProperty(FIELD_CALENDAR_ID)
    public ResourceCalendarLeavesDTO setCalendarId(String val) {
        this._set(FIELD_CALENDAR_ID, val);
        return this;
    }

    /**
     * 获取「工作时间」值
     *
     */
    @JsonIgnore
    public String getCalendarId() {
        return DataTypeUtils.asString(this._get(FIELD_CALENDAR_ID), null);
    }

    /**
     * 判断 「工作时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCalendarId() {
        return this._contains(FIELD_CALENDAR_ID);
    }

    /**
     * 重置 「工作时间」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetCalendarId() {
        this._reset(FIELD_CALENDAR_ID);
        return this;
    }

    /**
     * 设置「工作时间名称」
     * @param val
     */
    @JsonProperty(FIELD_CALENDAR_NAME)
    public ResourceCalendarLeavesDTO setCalendarName(String val) {
        this._set(FIELD_CALENDAR_NAME, val);
        return this;
    }

    /**
     * 获取「工作时间名称」值
     *
     */
    @JsonIgnore
    public String getCalendarName() {
        return DataTypeUtils.asString(this._get(FIELD_CALENDAR_NAME), null);
    }

    /**
     * 判断 「工作时间名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCalendarName() {
        return this._contains(FIELD_CALENDAR_NAME);
    }

    /**
     * 重置 「工作时间名称」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetCalendarName() {
        this._reset(FIELD_CALENDAR_NAME);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public ResourceCalendarLeavesDTO setCompanyId(String val) {
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
    public ResourceCalendarLeavesDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「公司名称」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public ResourceCalendarLeavesDTO setCompanyName(String val) {
        this._set(FIELD_COMPANY_NAME, val);
        return this;
    }

    /**
     * 获取「公司名称」值
     *
     */
    @JsonIgnore
    public String getCompanyName() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_NAME), null);
    }

    /**
     * 判断 「公司名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyName() {
        return this._contains(FIELD_COMPANY_NAME);
    }

    /**
     * 重置 「公司名称」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResourceCalendarLeavesDTO setCreateDate(Timestamp val) {
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
    public ResourceCalendarLeavesDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResourceCalendarLeavesDTO setCreateUid(String val) {
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
    public ResourceCalendarLeavesDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「开始日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE_FROM)
    public ResourceCalendarLeavesDTO setDateFrom(Timestamp val) {
        this._set(FIELD_DATE_FROM, val);
        return this;
    }

    /**
     * 获取「开始日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDateFrom() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DATE_FROM), null);
    }

    /**
     * 判断 「开始日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDateFrom() {
        return this._contains(FIELD_DATE_FROM);
    }

    /**
     * 重置 「开始日期」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetDateFrom() {
        this._reset(FIELD_DATE_FROM);
        return this;
    }

    /**
     * 设置「结束日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE_TO)
    public ResourceCalendarLeavesDTO setDateTo(Timestamp val) {
        this._set(FIELD_DATE_TO, val);
        return this;
    }

    /**
     * 获取「结束日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDateTo() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DATE_TO), null);
    }

    /**
     * 判断 「结束日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDateTo() {
        return this._contains(FIELD_DATE_TO);
    }

    /**
     * 重置 「结束日期」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetDateTo() {
        this._reset(FIELD_DATE_TO);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResourceCalendarLeavesDTO setDisplayName(String val) {
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
    public ResourceCalendarLeavesDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「休假要求」
     * @param val
     */
    @JsonProperty(FIELD_HOLIDAY_ID)
    public ResourceCalendarLeavesDTO setHolidayId(String val) {
        this._set(FIELD_HOLIDAY_ID, val);
        return this;
    }

    /**
     * 获取「休假要求」值
     *
     */
    @JsonIgnore
    public String getHolidayId() {
        return DataTypeUtils.asString(this._get(FIELD_HOLIDAY_ID), null);
    }

    /**
     * 判断 「休假要求」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHolidayId() {
        return this._contains(FIELD_HOLIDAY_ID);
    }

    /**
     * 重置 「休假要求」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetHolidayId() {
        this._reset(FIELD_HOLIDAY_ID);
        return this;
    }

    /**
     * 设置「休假要求」
     * @param val
     */
    @JsonProperty(FIELD_HOLNAMEAY_NAME)
    public ResourceCalendarLeavesDTO setHolnameayName(String val) {
        this._set(FIELD_HOLNAMEAY_NAME, val);
        return this;
    }

    /**
     * 获取「休假要求」值
     *
     */
    @JsonIgnore
    public String getHolnameayName() {
        return DataTypeUtils.asString(this._get(FIELD_HOLNAMEAY_NAME), null);
    }

    /**
     * 判断 「休假要求」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHolnameayName() {
        return this._contains(FIELD_HOLNAMEAY_NAME);
    }

    /**
     * 重置 「休假要求」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetHolnameayName() {
        this._reset(FIELD_HOLNAMEAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResourceCalendarLeavesDTO setId(String val) {
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
    public ResourceCalendarLeavesDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResourceCalendarLeavesDTO setName(String val) {
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
    public ResourceCalendarLeavesDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「资源」
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_ID)
    public ResourceCalendarLeavesDTO setResourceId(String val) {
        this._set(FIELD_RESOURCE_ID, val);
        return this;
    }

    /**
     * 获取「资源」值
     *
     */
    @JsonIgnore
    public String getResourceId() {
        return DataTypeUtils.asString(this._get(FIELD_RESOURCE_ID), null);
    }

    /**
     * 判断 「资源」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResourceId() {
        return this._contains(FIELD_RESOURCE_ID);
    }

    /**
     * 重置 「资源」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetResourceId() {
        this._reset(FIELD_RESOURCE_ID);
        return this;
    }

    /**
     * 设置「资源名称」
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_NAME)
    public ResourceCalendarLeavesDTO setResourceName(String val) {
        this._set(FIELD_RESOURCE_NAME, val);
        return this;
    }

    /**
     * 获取「资源名称」值
     *
     */
    @JsonIgnore
    public String getResourceName() {
        return DataTypeUtils.asString(this._get(FIELD_RESOURCE_NAME), null);
    }

    /**
     * 判断 「资源名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResourceName() {
        return this._contains(FIELD_RESOURCE_NAME);
    }

    /**
     * 重置 「资源名称」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetResourceName() {
        this._reset(FIELD_RESOURCE_NAME);
        return this;
    }

    /**
     * 设置「时间类型」
     * 代码表[时间类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_leaves_time_type
     * @param val
     */
    @JsonProperty(FIELD_TIME_TYPE)
    public ResourceCalendarLeavesDTO setTimeType(String val) {
        this._set(FIELD_TIME_TYPE, val);
        return this;
    }

    /**
     * 获取「时间类型」值
     * 代码表[时间类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_leaves_time_type
     *
     */
    @JsonIgnore
    public String getTimeType() {
        return DataTypeUtils.asString(this._get(FIELD_TIME_TYPE), null);
    }

    /**
     * 判断 「时间类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTimeType() {
        return this._contains(FIELD_TIME_TYPE);
    }

    /**
     * 重置 「时间类型」
     *
     */
    @JsonIgnore
    public ResourceCalendarLeavesDTO resetTimeType() {
        this._reset(FIELD_TIME_TYPE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResourceCalendarLeavesDTO setWriteDate(Timestamp val) {
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
    public ResourceCalendarLeavesDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResourceCalendarLeavesDTO setWriteUid(String val) {
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
    public ResourceCalendarLeavesDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
