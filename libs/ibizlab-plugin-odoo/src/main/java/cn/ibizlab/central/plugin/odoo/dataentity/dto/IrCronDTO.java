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


public class IrCronDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 模型
     */
    public final static String FIELD_MODEL_ID = "model_id";

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
     * 属性: 名称
     */
    public final static String FIELD_CRON_NAME = "cron_name";

    /**
     * 属性: 失败次数
     */
    public final static String FIELD_FAILURE_COUNT = "failure_count";

    /**
     * 属性: 首次失败日期
     */
    public final static String FIELD_FIRST_FAILURE_DATE = "first_failure_date";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 间隔数值
     */
    public final static String FIELD_INTERVAL_NUMBER = "interval_number";

    /**
     * 属性: 间隔单位
     */
    public final static String FIELD_INTERVAL_TYPE = "interval_type";

    /**
     * 属性: 最后执行日期
     */
    public final static String FIELD_LASTCALL = "lastcall";

    /**
     * 属性: 下一次执行日期
     */
    public final static String FIELD_NEXTCALL = "nextcall";

    /**
     * 属性: 优先级
     */
    public final static String FIELD_PRIORITY = "priority";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL_ID)
    public IrCronDTO setModelId(String val) {
        this._set(FIELD_MODEL_ID, val);
        return this;
    }

    /**
     * 获取「模型」值
     *
     */
    @JsonIgnore
    public String getModelId() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL_ID), null);
    }

    /**
     * 判断 「模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModelId() {
        return this._contains(FIELD_MODEL_ID);
    }

    /**
     * 重置 「模型」
     *
     */
    @JsonIgnore
    public IrCronDTO resetModelId() {
        this._reset(FIELD_MODEL_ID);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public IrCronDTO setActive(Integer val) {
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
    public IrCronDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrCronDTO setCreateDate(Timestamp val) {
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
    public IrCronDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrCronDTO setCreateUid(String val) {
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
    public IrCronDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_CRON_NAME)
    public IrCronDTO setCronName(String val) {
        this._set(FIELD_CRON_NAME, val);
        return this;
    }

    public IrCronDTO setName(String val) {
        this.setCronName(val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getCronName() {
        return DataTypeUtils.asString(this._get(FIELD_CRON_NAME), null);
    }

    @JsonIgnore
    public String getName() {
        return getCronName();
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCronName() {
        return this._contains(FIELD_CRON_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public IrCronDTO resetCronName() {
        this._reset(FIELD_CRON_NAME);
        return this;
    }

    /**
     * 设置「失败次数」
     * @param val
     */
    @JsonProperty(FIELD_FAILURE_COUNT)
    public IrCronDTO setFailureCount(Integer val) {
        this._set(FIELD_FAILURE_COUNT, val);
        return this;
    }

    /**
     * 获取「失败次数」值
     *
     */
    @JsonIgnore
    public Integer getFailureCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_FAILURE_COUNT), null);
    }

    /**
     * 判断 「失败次数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFailureCount() {
        return this._contains(FIELD_FAILURE_COUNT);
    }

    /**
     * 重置 「失败次数」
     *
     */
    @JsonIgnore
    public IrCronDTO resetFailureCount() {
        this._reset(FIELD_FAILURE_COUNT);
        return this;
    }

    /**
     * 设置「首次失败日期」
     * @param val
     */
    @JsonProperty(FIELD_FIRST_FAILURE_DATE)
    public IrCronDTO setFirstFailureDate(Timestamp val) {
        this._set(FIELD_FIRST_FAILURE_DATE, val);
        return this;
    }

    /**
     * 获取「首次失败日期」值
     *
     */
    @JsonIgnore
    public Timestamp getFirstFailureDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_FIRST_FAILURE_DATE), null);
    }

    /**
     * 判断 「首次失败日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFirstFailureDate() {
        return this._contains(FIELD_FIRST_FAILURE_DATE);
    }

    /**
     * 重置 「首次失败日期」
     *
     */
    @JsonIgnore
    public IrCronDTO resetFirstFailureDate() {
        this._reset(FIELD_FIRST_FAILURE_DATE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrCronDTO setId(String val) {
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
    public IrCronDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「间隔数值」
     * @param val
     */
    @JsonProperty(FIELD_INTERVAL_NUMBER)
    public IrCronDTO setIntervalNumber(Integer val) {
        this._set(FIELD_INTERVAL_NUMBER, val);
        return this;
    }

    /**
     * 获取「间隔数值」值
     *
     */
    @JsonIgnore
    public Integer getIntervalNumber() {
        return DataTypeUtils.asInteger(this._get(FIELD_INTERVAL_NUMBER), null);
    }

    /**
     * 判断 「间隔数值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIntervalNumber() {
        return this._contains(FIELD_INTERVAL_NUMBER);
    }

    /**
     * 重置 「间隔数值」
     *
     */
    @JsonIgnore
    public IrCronDTO resetIntervalNumber() {
        this._reset(FIELD_INTERVAL_NUMBER);
        return this;
    }

    /**
     * 设置「间隔单位」
     * 代码表[间隔单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_cron_interval_type
     * @param val
     */
    @JsonProperty(FIELD_INTERVAL_TYPE)
    public IrCronDTO setIntervalType(String val) {
        this._set(FIELD_INTERVAL_TYPE, val);
        return this;
    }

    /**
     * 获取「间隔单位」值
     * 代码表[间隔单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_cron_interval_type
     *
     */
    @JsonIgnore
    public String getIntervalType() {
        return DataTypeUtils.asString(this._get(FIELD_INTERVAL_TYPE), null);
    }

    /**
     * 判断 「间隔单位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIntervalType() {
        return this._contains(FIELD_INTERVAL_TYPE);
    }

    /**
     * 重置 「间隔单位」
     *
     */
    @JsonIgnore
    public IrCronDTO resetIntervalType() {
        this._reset(FIELD_INTERVAL_TYPE);
        return this;
    }

    /**
     * 设置「最后执行日期」
     * @param val
     */
    @JsonProperty(FIELD_LASTCALL)
    public IrCronDTO setLastcall(Timestamp val) {
        this._set(FIELD_LASTCALL, val);
        return this;
    }

    /**
     * 获取「最后执行日期」值
     *
     */
    @JsonIgnore
    public Timestamp getLastcall() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LASTCALL), null);
    }

    /**
     * 判断 「最后执行日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastcall() {
        return this._contains(FIELD_LASTCALL);
    }

    /**
     * 重置 「最后执行日期」
     *
     */
    @JsonIgnore
    public IrCronDTO resetLastcall() {
        this._reset(FIELD_LASTCALL);
        return this;
    }

    /**
     * 设置「下一次执行日期」
     * @param val
     */
    @JsonProperty(FIELD_NEXTCALL)
    public IrCronDTO setNextcall(Timestamp val) {
        this._set(FIELD_NEXTCALL, val);
        return this;
    }

    /**
     * 获取「下一次执行日期」值
     *
     */
    @JsonIgnore
    public Timestamp getNextcall() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_NEXTCALL), null);
    }

    /**
     * 判断 「下一次执行日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNextcall() {
        return this._contains(FIELD_NEXTCALL);
    }

    /**
     * 重置 「下一次执行日期」
     *
     */
    @JsonIgnore
    public IrCronDTO resetNextcall() {
        this._reset(FIELD_NEXTCALL);
        return this;
    }

    /**
     * 设置「优先级」
     * @param val
     */
    @JsonProperty(FIELD_PRIORITY)
    public IrCronDTO setPriority(Integer val) {
        this._set(FIELD_PRIORITY, val);
        return this;
    }

    /**
     * 获取「优先级」值
     *
     */
    @JsonIgnore
    public Integer getPriority() {
        return DataTypeUtils.asInteger(this._get(FIELD_PRIORITY), null);
    }

    /**
     * 判断 「优先级」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPriority() {
        return this._contains(FIELD_PRIORITY);
    }

    /**
     * 重置 「优先级」
     *
     */
    @JsonIgnore
    public IrCronDTO resetPriority() {
        this._reset(FIELD_PRIORITY);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrCronDTO setWriteDate(Timestamp val) {
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
    public IrCronDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrCronDTO setWriteUid(String val) {
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
    public IrCronDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
