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


public class HrEmployeeCounterDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 分配的总天数。
     */
    public final static String FIELD_ALLOCATION_COUNT = "allocation_count";

    /**
     * 属性: 分配总数量
     */
    public final static String FIELD_ALLOCATIONS_COUNT = "allocations_count";

    /**
     * 属性: 间接下属统计
     */
    public final static String FIELD_CHILD_ALL_COUNT = "child_all_count";

    /**
     * 属性: 直接下属人数
     */
    public final static String FIELD_CHILD_COUNT = "child_count";

    /**
     * 属性: 车辆
     */
    public final static String FIELD_EMPLOYEE_CARS_COUNT = "employee_cars_count";

    /**
     * 属性: 设备数量
     */
    public final static String FIELD_EQUIPMENT_COUNT = "equipment_count";

    /**
     * 属性: 休假次数
     */
    public final static String FIELD_LEAVES_COUNT = "leaves_count";

    /**
     * 属性: 附件数量
     */
    public final static String FIELD_MESSAGE_ATTACHMENT_COUNT = "message_attachment_count";

    /**
     * 属性: 错误数量
     */
    public final static String FIELD_MESSAGE_HAS_ERROR_COUNTER = "message_has_error_counter";

    /**
     * 属性: 操作数量
     */
    public final static String FIELD_MESSAGE_NEEDACTION_COUNTER = "message_needaction_counter";

    /**
     * 属性: 相关合作伙伴数量
     */
    public final static String FIELD_RELATED_PARTNERS_COUNT = "related_partners_count";

    /**
     * 设置「分配的总天数。」
     * @param val
     */
    @JsonProperty(FIELD_ALLOCATION_COUNT)
    public HrEmployeeCounterDTO setAllocationCount(Double val) {
        this._set(FIELD_ALLOCATION_COUNT, val);
        return this;
    }

    /**
     * 获取「分配的总天数。」值
     *
     */
    @JsonIgnore
    public Double getAllocationCount() {
        return DataTypeUtils.asDouble(this._get(FIELD_ALLOCATION_COUNT), null);
    }

    /**
     * 判断 「分配的总天数。」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAllocationCount() {
        return this._contains(FIELD_ALLOCATION_COUNT);
    }

    /**
     * 重置 「分配的总天数。」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetAllocationCount() {
        this._reset(FIELD_ALLOCATION_COUNT);
        return this;
    }

    /**
     * 设置「分配总数量」
     * @param val
     */
    @JsonProperty(FIELD_ALLOCATIONS_COUNT)
    public HrEmployeeCounterDTO setAllocationsCount(Integer val) {
        this._set(FIELD_ALLOCATIONS_COUNT, val);
        return this;
    }

    /**
     * 获取「分配总数量」值
     *
     */
    @JsonIgnore
    public Integer getAllocationsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_ALLOCATIONS_COUNT), null);
    }

    /**
     * 判断 「分配总数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAllocationsCount() {
        return this._contains(FIELD_ALLOCATIONS_COUNT);
    }

    /**
     * 重置 「分配总数量」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetAllocationsCount() {
        this._reset(FIELD_ALLOCATIONS_COUNT);
        return this;
    }

    /**
     * 设置「间接下属统计」
     * @param val
     */
    @JsonProperty(FIELD_CHILD_ALL_COUNT)
    public HrEmployeeCounterDTO setChildAllCount(Integer val) {
        this._set(FIELD_CHILD_ALL_COUNT, val);
        return this;
    }

    /**
     * 获取「间接下属统计」值
     *
     */
    @JsonIgnore
    public Integer getChildAllCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_CHILD_ALL_COUNT), null);
    }

    /**
     * 判断 「间接下属统计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChildAllCount() {
        return this._contains(FIELD_CHILD_ALL_COUNT);
    }

    /**
     * 重置 「间接下属统计」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetChildAllCount() {
        this._reset(FIELD_CHILD_ALL_COUNT);
        return this;
    }

    /**
     * 设置「直接下属人数」
     * @param val
     */
    @JsonProperty(FIELD_CHILD_COUNT)
    public HrEmployeeCounterDTO setChildCount(Integer val) {
        this._set(FIELD_CHILD_COUNT, val);
        return this;
    }

    /**
     * 获取「直接下属人数」值
     *
     */
    @JsonIgnore
    public Integer getChildCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_CHILD_COUNT), null);
    }

    /**
     * 判断 「直接下属人数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChildCount() {
        return this._contains(FIELD_CHILD_COUNT);
    }

    /**
     * 重置 「直接下属人数」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetChildCount() {
        this._reset(FIELD_CHILD_COUNT);
        return this;
    }

    /**
     * 设置「车辆」
     * @param val
     */
    @JsonProperty(FIELD_EMPLOYEE_CARS_COUNT)
    public HrEmployeeCounterDTO setEmployeeCarsCount(Integer val) {
        this._set(FIELD_EMPLOYEE_CARS_COUNT, val);
        return this;
    }

    /**
     * 获取「车辆」值
     *
     */
    @JsonIgnore
    public Integer getEmployeeCarsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_EMPLOYEE_CARS_COUNT), null);
    }

    /**
     * 判断 「车辆」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmployeeCarsCount() {
        return this._contains(FIELD_EMPLOYEE_CARS_COUNT);
    }

    /**
     * 重置 「车辆」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetEmployeeCarsCount() {
        this._reset(FIELD_EMPLOYEE_CARS_COUNT);
        return this;
    }

    /**
     * 设置「设备数量」
     * @param val
     */
    @JsonProperty(FIELD_EQUIPMENT_COUNT)
    public HrEmployeeCounterDTO setEquipmentCount(Integer val) {
        this._set(FIELD_EQUIPMENT_COUNT, val);
        return this;
    }

    /**
     * 获取「设备数量」值
     *
     */
    @JsonIgnore
    public Integer getEquipmentCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_EQUIPMENT_COUNT), null);
    }

    /**
     * 判断 「设备数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEquipmentCount() {
        return this._contains(FIELD_EQUIPMENT_COUNT);
    }

    /**
     * 重置 「设备数量」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetEquipmentCount() {
        this._reset(FIELD_EQUIPMENT_COUNT);
        return this;
    }

    /**
     * 设置「休假次数」
     * @param val
     */
    @JsonProperty(FIELD_LEAVES_COUNT)
    public HrEmployeeCounterDTO setLeavesCount(Double val) {
        this._set(FIELD_LEAVES_COUNT, val);
        return this;
    }

    /**
     * 获取「休假次数」值
     *
     */
    @JsonIgnore
    public Double getLeavesCount() {
        return DataTypeUtils.asDouble(this._get(FIELD_LEAVES_COUNT), null);
    }

    /**
     * 判断 「休假次数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLeavesCount() {
        return this._contains(FIELD_LEAVES_COUNT);
    }

    /**
     * 重置 「休假次数」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetLeavesCount() {
        this._reset(FIELD_LEAVES_COUNT);
        return this;
    }

    /**
     * 设置「附件数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ATTACHMENT_COUNT)
    public HrEmployeeCounterDTO setMessageAttachmentCount(Integer val) {
        this._set(FIELD_MESSAGE_ATTACHMENT_COUNT, val);
        return this;
    }

    /**
     * 获取「附件数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageAttachmentCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_ATTACHMENT_COUNT), null);
    }

    /**
     * 判断 「附件数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageAttachmentCount() {
        return this._contains(FIELD_MESSAGE_ATTACHMENT_COUNT);
    }

    /**
     * 重置 「附件数量」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetMessageAttachmentCount() {
        this._reset(FIELD_MESSAGE_ATTACHMENT_COUNT);
        return this;
    }

    /**
     * 设置「错误数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR_COUNTER)
    public HrEmployeeCounterDTO setMessageHasErrorCounter(Integer val) {
        this._set(FIELD_MESSAGE_HAS_ERROR_COUNTER, val);
        return this;
    }

    /**
     * 获取「错误数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageHasErrorCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_ERROR_COUNTER), null);
    }

    /**
     * 判断 「错误数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasErrorCounter() {
        return this._contains(FIELD_MESSAGE_HAS_ERROR_COUNTER);
    }

    /**
     * 重置 「错误数量」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetMessageHasErrorCounter() {
        this._reset(FIELD_MESSAGE_HAS_ERROR_COUNTER);
        return this;
    }

    /**
     * 设置「操作数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION_COUNTER)
    public HrEmployeeCounterDTO setMessageNeedactionCounter(Integer val) {
        this._set(FIELD_MESSAGE_NEEDACTION_COUNTER, val);
        return this;
    }

    /**
     * 获取「操作数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageNeedactionCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_NEEDACTION_COUNTER), null);
    }

    /**
     * 判断 「操作数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageNeedactionCounter() {
        return this._contains(FIELD_MESSAGE_NEEDACTION_COUNTER);
    }

    /**
     * 重置 「操作数量」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetMessageNeedactionCounter() {
        this._reset(FIELD_MESSAGE_NEEDACTION_COUNTER);
        return this;
    }

    /**
     * 设置「相关合作伙伴数量」
     * @param val
     */
    @JsonProperty(FIELD_RELATED_PARTNERS_COUNT)
    public HrEmployeeCounterDTO setRelatedPartnersCount(Integer val) {
        this._set(FIELD_RELATED_PARTNERS_COUNT, val);
        return this;
    }

    /**
     * 获取「相关合作伙伴数量」值
     *
     */
    @JsonIgnore
    public Integer getRelatedPartnersCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_RELATED_PARTNERS_COUNT), null);
    }

    /**
     * 判断 「相关合作伙伴数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRelatedPartnersCount() {
        return this._contains(FIELD_RELATED_PARTNERS_COUNT);
    }

    /**
     * 重置 「相关合作伙伴数量」
     *
     */
    @JsonIgnore
    public HrEmployeeCounterDTO resetRelatedPartnersCount() {
        this._reset(FIELD_RELATED_PARTNERS_COUNT);
        return this;
    }

}
