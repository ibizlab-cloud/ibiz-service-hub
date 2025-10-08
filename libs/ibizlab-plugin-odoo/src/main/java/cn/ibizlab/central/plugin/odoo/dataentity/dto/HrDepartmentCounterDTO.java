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


public class HrDepartmentCounterDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 计划数量
     */
    public final static String FIELD_PLANS_COUNT = "plans_count";

    /**
     * 属性: Total Employee
     */
    public final static String FIELD_TOTAL_EMPLOYEE = "total_employee";

    /**
     * 设置「计划数量」
     * @param val
     */
    @JsonProperty(FIELD_PLANS_COUNT)
    public HrDepartmentCounterDTO setPlansCount(Integer val) {
        this._set(FIELD_PLANS_COUNT, val);
        return this;
    }

    /**
     * 获取「计划数量」值
     *
     */
    @JsonIgnore
    public Integer getPlansCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_PLANS_COUNT), null);
    }

    /**
     * 判断 「计划数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlansCount() {
        return this._contains(FIELD_PLANS_COUNT);
    }

    /**
     * 重置 「计划数量」
     *
     */
    @JsonIgnore
    public HrDepartmentCounterDTO resetPlansCount() {
        this._reset(FIELD_PLANS_COUNT);
        return this;
    }

    /**
     * 设置「Total Employee」
     * @param val
     */
    @JsonProperty(FIELD_TOTAL_EMPLOYEE)
    public HrDepartmentCounterDTO setTotalEmployee(Integer val) {
        this._set(FIELD_TOTAL_EMPLOYEE, val);
        return this;
    }

    /**
     * 获取「Total Employee」值
     *
     */
    @JsonIgnore
    public Integer getTotalEmployee() {
        return DataTypeUtils.asInteger(this._get(FIELD_TOTAL_EMPLOYEE), null);
    }

    /**
     * 判断 「Total Employee」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTotalEmployee() {
        return this._contains(FIELD_TOTAL_EMPLOYEE);
    }

    /**
     * 重置 「Total Employee」
     *
     */
    @JsonIgnore
    public HrDepartmentCounterDTO resetTotalEmployee() {
        this._reset(FIELD_TOTAL_EMPLOYEE);
        return this;
    }

}
