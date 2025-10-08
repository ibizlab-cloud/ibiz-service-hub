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


public class ResourceCalendarAttendanceDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 资源的日历
     */
    public final static String FIELD_CALENDAR_ID = "calendar_id";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 起始日期
     */
    public final static String FIELD_DATE_FROM = "date_from";

    /**
     * 属性: 结束日期
     */
    public final static String FIELD_DATE_TO = "date_to";

    /**
     * 属性: 日期
     */
    public final static String FIELD_DAY_PERIOD = "day_period";

    /**
     * 属性: 星期
     */
    public final static String FIELD_DAYOFWEEK = "dayofweek";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 显示类型
     */
    public final static String FIELD_DISPLAY_TYPE = "display_type";

    /**
     * 属性: 持续时间 (天)
     */
    public final static String FIELD_DURATION_DAYS = "duration_days";

    /**
     * 属性: 时长 (小时)
     */
    public final static String FIELD_DURATION_HOURS = "duration_hours";

    /**
     * 属性: 工作起始
     */
    public final static String FIELD_HOUR_FROM = "hour_from";

    /**
     * 属性: 工作截止
     */
    public final static String FIELD_HOUR_TO = "hour_to";

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
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 周数
     */
    public final static String FIELD_WEEK_TYPE = "week_type";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「资源的日历」
     * @param val
     */
    @JsonProperty(FIELD_CALENDAR_ID)
    public ResourceCalendarAttendanceDTO setCalendarId(String val) {
        this._set(FIELD_CALENDAR_ID, val);
        return this;
    }

    /**
     * 获取「资源的日历」值
     *
     */
    @JsonIgnore
    public String getCalendarId() {
        return DataTypeUtils.asString(this._get(FIELD_CALENDAR_ID), null);
    }

    /**
     * 判断 「资源的日历」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCalendarId() {
        return this._contains(FIELD_CALENDAR_ID);
    }

    /**
     * 重置 「资源的日历」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetCalendarId() {
        this._reset(FIELD_CALENDAR_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResourceCalendarAttendanceDTO setCreateDate(Timestamp val) {
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
    public ResourceCalendarAttendanceDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResourceCalendarAttendanceDTO setCreateUid(String val) {
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
    public ResourceCalendarAttendanceDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「起始日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE_FROM)
    public ResourceCalendarAttendanceDTO setDateFrom(Timestamp val) {
        this._set(FIELD_DATE_FROM, val);
        return this;
    }

    /**
     * 获取「起始日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDateFrom() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DATE_FROM), null);
    }

    /**
     * 判断 「起始日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDateFrom() {
        return this._contains(FIELD_DATE_FROM);
    }

    /**
     * 重置 「起始日期」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetDateFrom() {
        this._reset(FIELD_DATE_FROM);
        return this;
    }

    /**
     * 设置「结束日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE_TO)
    public ResourceCalendarAttendanceDTO setDateTo(Timestamp val) {
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
    public ResourceCalendarAttendanceDTO resetDateTo() {
        this._reset(FIELD_DATE_TO);
        return this;
    }

    /**
     * 设置「日期」
     * 代码表[日期]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_attendance_day_period
     * @param val
     */
    @JsonProperty(FIELD_DAY_PERIOD)
    public ResourceCalendarAttendanceDTO setDayPeriod(String val) {
        this._set(FIELD_DAY_PERIOD, val);
        return this;
    }

    /**
     * 获取「日期」值
     * 代码表[日期]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_attendance_day_period
     *
     */
    @JsonIgnore
    public String getDayPeriod() {
        return DataTypeUtils.asString(this._get(FIELD_DAY_PERIOD), null);
    }

    /**
     * 判断 「日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDayPeriod() {
        return this._contains(FIELD_DAY_PERIOD);
    }

    /**
     * 重置 「日期」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetDayPeriod() {
        this._reset(FIELD_DAY_PERIOD);
        return this;
    }

    /**
     * 设置「星期」
     * 代码表[星期]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_attendance_dayofweek
     * @param val
     */
    @JsonProperty(FIELD_DAYOFWEEK)
    public ResourceCalendarAttendanceDTO setDayofweek(String val) {
        this._set(FIELD_DAYOFWEEK, val);
        return this;
    }

    /**
     * 获取「星期」值
     * 代码表[星期]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_attendance_dayofweek
     *
     */
    @JsonIgnore
    public String getDayofweek() {
        return DataTypeUtils.asString(this._get(FIELD_DAYOFWEEK), null);
    }

    /**
     * 判断 「星期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDayofweek() {
        return this._contains(FIELD_DAYOFWEEK);
    }

    /**
     * 重置 「星期」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetDayofweek() {
        this._reset(FIELD_DAYOFWEEK);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResourceCalendarAttendanceDTO setDisplayName(String val) {
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
    public ResourceCalendarAttendanceDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「显示类型」
     * 代码表[显示类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_attendance_display_type
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_TYPE)
    public ResourceCalendarAttendanceDTO setDisplayType(String val) {
        this._set(FIELD_DISPLAY_TYPE, val);
        return this;
    }

    /**
     * 获取「显示类型」值
     * 代码表[显示类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_attendance_display_type
     *
     */
    @JsonIgnore
    public String getDisplayType() {
        return DataTypeUtils.asString(this._get(FIELD_DISPLAY_TYPE), null);
    }

    /**
     * 判断 「显示类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayType() {
        return this._contains(FIELD_DISPLAY_TYPE);
    }

    /**
     * 重置 「显示类型」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetDisplayType() {
        this._reset(FIELD_DISPLAY_TYPE);
        return this;
    }

    /**
     * 设置「持续时间 (天)」
     * @param val
     */
    @JsonProperty(FIELD_DURATION_DAYS)
    public ResourceCalendarAttendanceDTO setDurationDays(Double val) {
        this._set(FIELD_DURATION_DAYS, val);
        return this;
    }

    /**
     * 获取「持续时间 (天)」值
     *
     */
    @JsonIgnore
    public Double getDurationDays() {
        return DataTypeUtils.asDouble(this._get(FIELD_DURATION_DAYS), null);
    }

    /**
     * 判断 「持续时间 (天)」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDurationDays() {
        return this._contains(FIELD_DURATION_DAYS);
    }

    /**
     * 重置 「持续时间 (天)」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetDurationDays() {
        this._reset(FIELD_DURATION_DAYS);
        return this;
    }

    /**
     * 设置「时长 (小时)」
     * @param val
     */
    @JsonProperty(FIELD_DURATION_HOURS)
    public ResourceCalendarAttendanceDTO setDurationHours(Double val) {
        this._set(FIELD_DURATION_HOURS, val);
        return this;
    }

    /**
     * 获取「时长 (小时)」值
     *
     */
    @JsonIgnore
    public Double getDurationHours() {
        return DataTypeUtils.asDouble(this._get(FIELD_DURATION_HOURS), null);
    }

    /**
     * 判断 「时长 (小时)」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDurationHours() {
        return this._contains(FIELD_DURATION_HOURS);
    }

    /**
     * 重置 「时长 (小时)」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetDurationHours() {
        this._reset(FIELD_DURATION_HOURS);
        return this;
    }

    /**
     * 设置「工作起始」
     * @param val
     */
    @JsonProperty(FIELD_HOUR_FROM)
    public ResourceCalendarAttendanceDTO setHourFrom(Double val) {
        this._set(FIELD_HOUR_FROM, val);
        return this;
    }

    /**
     * 获取「工作起始」值
     *
     */
    @JsonIgnore
    public Double getHourFrom() {
        return DataTypeUtils.asDouble(this._get(FIELD_HOUR_FROM), null);
    }

    /**
     * 判断 「工作起始」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHourFrom() {
        return this._contains(FIELD_HOUR_FROM);
    }

    /**
     * 重置 「工作起始」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetHourFrom() {
        this._reset(FIELD_HOUR_FROM);
        return this;
    }

    /**
     * 设置「工作截止」
     * @param val
     */
    @JsonProperty(FIELD_HOUR_TO)
    public ResourceCalendarAttendanceDTO setHourTo(Double val) {
        this._set(FIELD_HOUR_TO, val);
        return this;
    }

    /**
     * 获取「工作截止」值
     *
     */
    @JsonIgnore
    public Double getHourTo() {
        return DataTypeUtils.asDouble(this._get(FIELD_HOUR_TO), null);
    }

    /**
     * 判断 「工作截止」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHourTo() {
        return this._contains(FIELD_HOUR_TO);
    }

    /**
     * 重置 「工作截止」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetHourTo() {
        this._reset(FIELD_HOUR_TO);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResourceCalendarAttendanceDTO setId(String val) {
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
    public ResourceCalendarAttendanceDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResourceCalendarAttendanceDTO setName(String val) {
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
    public ResourceCalendarAttendanceDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「资源」
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_ID)
    public ResourceCalendarAttendanceDTO setResourceId(String val) {
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
    public ResourceCalendarAttendanceDTO resetResourceId() {
        this._reset(FIELD_RESOURCE_ID);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public ResourceCalendarAttendanceDTO setSequence(Integer val) {
        this._set(FIELD_SEQUENCE, val);
        return this;
    }

    /**
     * 获取「序列」值
     *
     */
    @JsonIgnore
    public Integer getSequence() {
        return DataTypeUtils.asInteger(this._get(FIELD_SEQUENCE), null);
    }

    /**
     * 判断 「序列」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSequence() {
        return this._contains(FIELD_SEQUENCE);
    }

    /**
     * 重置 「序列」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「周数」
     * 代码表[周数]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_attendance_week_type
     * @param val
     */
    @JsonProperty(FIELD_WEEK_TYPE)
    public ResourceCalendarAttendanceDTO setWeekType(String val) {
        this._set(FIELD_WEEK_TYPE, val);
        return this;
    }

    /**
     * 获取「周数」值
     * 代码表[周数]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_calendar_attendance_week_type
     *
     */
    @JsonIgnore
    public String getWeekType() {
        return DataTypeUtils.asString(this._get(FIELD_WEEK_TYPE), null);
    }

    /**
     * 判断 「周数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWeekType() {
        return this._contains(FIELD_WEEK_TYPE);
    }

    /**
     * 重置 「周数」
     *
     */
    @JsonIgnore
    public ResourceCalendarAttendanceDTO resetWeekType() {
        this._reset(FIELD_WEEK_TYPE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResourceCalendarAttendanceDTO setWriteDate(Timestamp val) {
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
    public ResourceCalendarAttendanceDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResourceCalendarAttendanceDTO setWriteUid(String val) {
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
    public ResourceCalendarAttendanceDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
