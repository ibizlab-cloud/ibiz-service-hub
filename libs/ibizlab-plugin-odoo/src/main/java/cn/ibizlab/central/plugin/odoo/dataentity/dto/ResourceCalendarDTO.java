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


public class ResourceCalendarDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 属性
     */
    public final static String FIELD_ATTENDANCES = "attendances";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 做假计数
     */
    public final static String FIELD_ASSOCIATED_LEAVES_COUNT = "associated_leaves_count";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: # 使用它的合同
     */
    public final static String FIELD_CONTRACTS_COUNT = "contracts_count";

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
     * 属性: 灵活时间
     */
    public final static String FIELD_FLEXIBLE_HOURS = "flexible_hours";

    /**
     * 属性: 公司全职
     */
    public final static String FIELD_FULL_TIME_REQUIRED_HOURS = "full_time_required_hours";

    /**
     * 属性: 每天平均小时数
     */
    public final static String FIELD_HOURS_PER_DAY = "hours_per_day";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 双周模式下的日历
     */
    public final static String FIELD_TWO_WEEKS_CALENDAR = "two_weeks_calendar";

    /**
     * 属性: 解释
     */
    public final static String FIELD_TWO_WEEKS_EXPLANATION = "two_weeks_explanation";

    /**
     * 属性: 时区偏移
     */
    public final static String FIELD_TZ_OFFSET = "tz_offset";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「属性」
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCES)
    public ResourceCalendarDTO setAttendances(List<ResourceCalendarAttendanceDTO> val) {
        this._set(FIELD_ATTENDANCES, val);
        return this;
    }

    /**
     * 获取「属性」值
     *
     */
    @JsonIgnore
    public List<ResourceCalendarAttendanceDTO> getAttendances() {
        return (List<ResourceCalendarAttendanceDTO>) this._get(FIELD_ATTENDANCES);
    }

    /**
     * 判断 「属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendances() {
        return this._contains(FIELD_ATTENDANCES);
    }

    /**
     * 重置 「属性」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetAttendances() {
        this._reset(FIELD_ATTENDANCES);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public ResourceCalendarDTO setActive(Integer val) {
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
    public ResourceCalendarDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「做假计数」
     * @param val
     */
    @JsonProperty(FIELD_ASSOCIATED_LEAVES_COUNT)
    public ResourceCalendarDTO setAssociatedLeavesCount(Integer val) {
        this._set(FIELD_ASSOCIATED_LEAVES_COUNT, val);
        return this;
    }

    /**
     * 获取「做假计数」值
     *
     */
    @JsonIgnore
    public Integer getAssociatedLeavesCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_ASSOCIATED_LEAVES_COUNT), null);
    }

    /**
     * 判断 「做假计数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAssociatedLeavesCount() {
        return this._contains(FIELD_ASSOCIATED_LEAVES_COUNT);
    }

    /**
     * 重置 「做假计数」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetAssociatedLeavesCount() {
        this._reset(FIELD_ASSOCIATED_LEAVES_COUNT);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public ResourceCalendarDTO setCompanyId(String val) {
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
    public ResourceCalendarDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public ResourceCalendarDTO setCompanyName(String val) {
        this._set(FIELD_COMPANY_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getCompanyName() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyName() {
        return this._contains(FIELD_COMPANY_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「# 使用它的合同」
     * @param val
     */
    @JsonProperty(FIELD_CONTRACTS_COUNT)
    public ResourceCalendarDTO setContractsCount(Integer val) {
        this._set(FIELD_CONTRACTS_COUNT, val);
        return this;
    }

    /**
     * 获取「# 使用它的合同」值
     *
     */
    @JsonIgnore
    public Integer getContractsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_CONTRACTS_COUNT), null);
    }

    /**
     * 判断 「# 使用它的合同」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContractsCount() {
        return this._contains(FIELD_CONTRACTS_COUNT);
    }

    /**
     * 重置 「# 使用它的合同」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetContractsCount() {
        this._reset(FIELD_CONTRACTS_COUNT);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResourceCalendarDTO setCreateDate(Timestamp val) {
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
    public ResourceCalendarDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResourceCalendarDTO setCreateUid(String val) {
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
    public ResourceCalendarDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResourceCalendarDTO setDisplayName(String val) {
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
    public ResourceCalendarDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「灵活时间」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_FLEXIBLE_HOURS)
    public ResourceCalendarDTO setFlexibleHours(Integer val) {
        this._set(FIELD_FLEXIBLE_HOURS, val);
        return this;
    }

    /**
     * 获取「灵活时间」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getFlexibleHours() {
        return DataTypeUtils.asInteger(this._get(FIELD_FLEXIBLE_HOURS), null);
    }

    /**
     * 判断 「灵活时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFlexibleHours() {
        return this._contains(FIELD_FLEXIBLE_HOURS);
    }

    /**
     * 重置 「灵活时间」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetFlexibleHours() {
        this._reset(FIELD_FLEXIBLE_HOURS);
        return this;
    }

    /**
     * 设置「公司全职」
     * @param val
     */
    @JsonProperty(FIELD_FULL_TIME_REQUIRED_HOURS)
    public ResourceCalendarDTO setFullTimeRequiredHours(Double val) {
        this._set(FIELD_FULL_TIME_REQUIRED_HOURS, val);
        return this;
    }

    /**
     * 获取「公司全职」值
     *
     */
    @JsonIgnore
    public Double getFullTimeRequiredHours() {
        return DataTypeUtils.asDouble(this._get(FIELD_FULL_TIME_REQUIRED_HOURS), null);
    }

    /**
     * 判断 「公司全职」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFullTimeRequiredHours() {
        return this._contains(FIELD_FULL_TIME_REQUIRED_HOURS);
    }

    /**
     * 重置 「公司全职」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetFullTimeRequiredHours() {
        this._reset(FIELD_FULL_TIME_REQUIRED_HOURS);
        return this;
    }

    /**
     * 设置「每天平均小时数」
     * @param val
     */
    @JsonProperty(FIELD_HOURS_PER_DAY)
    public ResourceCalendarDTO setHoursPerDay(Double val) {
        this._set(FIELD_HOURS_PER_DAY, val);
        return this;
    }

    /**
     * 获取「每天平均小时数」值
     *
     */
    @JsonIgnore
    public Double getHoursPerDay() {
        return DataTypeUtils.asDouble(this._get(FIELD_HOURS_PER_DAY), null);
    }

    /**
     * 判断 「每天平均小时数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHoursPerDay() {
        return this._contains(FIELD_HOURS_PER_DAY);
    }

    /**
     * 重置 「每天平均小时数」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetHoursPerDay() {
        this._reset(FIELD_HOURS_PER_DAY);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResourceCalendarDTO setId(String val) {
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
    public ResourceCalendarDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResourceCalendarDTO setName(String val) {
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
    public ResourceCalendarDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「双周模式下的日历」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_TWO_WEEKS_CALENDAR)
    public ResourceCalendarDTO setTwoWeeksCalendar(Integer val) {
        this._set(FIELD_TWO_WEEKS_CALENDAR, val);
        return this;
    }

    /**
     * 获取「双周模式下的日历」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getTwoWeeksCalendar() {
        return DataTypeUtils.asInteger(this._get(FIELD_TWO_WEEKS_CALENDAR), null);
    }

    /**
     * 判断 「双周模式下的日历」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTwoWeeksCalendar() {
        return this._contains(FIELD_TWO_WEEKS_CALENDAR);
    }

    /**
     * 重置 「双周模式下的日历」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetTwoWeeksCalendar() {
        this._reset(FIELD_TWO_WEEKS_CALENDAR);
        return this;
    }

    /**
     * 设置「解释」
     * @param val
     */
    @JsonProperty(FIELD_TWO_WEEKS_EXPLANATION)
    public ResourceCalendarDTO setTwoWeeksExplanation(String val) {
        this._set(FIELD_TWO_WEEKS_EXPLANATION, val);
        return this;
    }

    /**
     * 获取「解释」值
     *
     */
    @JsonIgnore
    public String getTwoWeeksExplanation() {
        return DataTypeUtils.asString(this._get(FIELD_TWO_WEEKS_EXPLANATION), null);
    }

    /**
     * 判断 「解释」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTwoWeeksExplanation() {
        return this._contains(FIELD_TWO_WEEKS_EXPLANATION);
    }

    /**
     * 重置 「解释」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetTwoWeeksExplanation() {
        this._reset(FIELD_TWO_WEEKS_EXPLANATION);
        return this;
    }

    /**
     * 设置「时区偏移」
     * @param val
     */
    @JsonProperty(FIELD_TZ_OFFSET)
    public ResourceCalendarDTO setTzOffset(String val) {
        this._set(FIELD_TZ_OFFSET, val);
        return this;
    }

    /**
     * 获取「时区偏移」值
     *
     */
    @JsonIgnore
    public String getTzOffset() {
        return DataTypeUtils.asString(this._get(FIELD_TZ_OFFSET), null);
    }

    /**
     * 判断 「时区偏移」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTzOffset() {
        return this._contains(FIELD_TZ_OFFSET);
    }

    /**
     * 重置 「时区偏移」
     *
     */
    @JsonIgnore
    public ResourceCalendarDTO resetTzOffset() {
        this._reset(FIELD_TZ_OFFSET);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResourceCalendarDTO setWriteDate(Timestamp val) {
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
    public ResourceCalendarDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResourceCalendarDTO setWriteUid(String val) {
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
    public ResourceCalendarDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
