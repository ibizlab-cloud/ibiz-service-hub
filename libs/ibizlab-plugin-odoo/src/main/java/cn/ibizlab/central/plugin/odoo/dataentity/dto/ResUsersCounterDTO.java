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


public class ResUsersCounterDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: # 访问权限
     */
    public final static String FIELD_ACCESSES_COUNT = "accesses_count";

    /**
     * 属性: # 分组
     */
    public final static String FIELD_GROUPS_COUNT = "groups_count";

    /**
     * 属性: # 记录规则
     */
    public final static String FIELD_RULES_COUNT = "rules_count";

    /**
     * 设置「# 访问权限」
     * @param val
     */
    @JsonProperty(FIELD_ACCESSES_COUNT)
    public ResUsersCounterDTO setAccessesCount(Integer val) {
        this._set(FIELD_ACCESSES_COUNT, val);
        return this;
    }

    /**
     * 获取「# 访问权限」值
     *
     */
    @JsonIgnore
    public Integer getAccessesCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACCESSES_COUNT), null);
    }

    /**
     * 判断 「# 访问权限」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccessesCount() {
        return this._contains(FIELD_ACCESSES_COUNT);
    }

    /**
     * 重置 「# 访问权限」
     *
     */
    @JsonIgnore
    public ResUsersCounterDTO resetAccessesCount() {
        this._reset(FIELD_ACCESSES_COUNT);
        return this;
    }

    /**
     * 设置「# 分组」
     * @param val
     */
    @JsonProperty(FIELD_GROUPS_COUNT)
    public ResUsersCounterDTO setGroupsCount(Integer val) {
        this._set(FIELD_GROUPS_COUNT, val);
        return this;
    }

    /**
     * 获取「# 分组」值
     *
     */
    @JsonIgnore
    public Integer getGroupsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUPS_COUNT), null);
    }

    /**
     * 判断 「# 分组」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupsCount() {
        return this._contains(FIELD_GROUPS_COUNT);
    }

    /**
     * 重置 「# 分组」
     *
     */
    @JsonIgnore
    public ResUsersCounterDTO resetGroupsCount() {
        this._reset(FIELD_GROUPS_COUNT);
        return this;
    }

    /**
     * 设置「# 记录规则」
     * @param val
     */
    @JsonProperty(FIELD_RULES_COUNT)
    public ResUsersCounterDTO setRulesCount(Integer val) {
        this._set(FIELD_RULES_COUNT, val);
        return this;
    }

    /**
     * 获取「# 记录规则」值
     *
     */
    @JsonIgnore
    public Integer getRulesCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_RULES_COUNT), null);
    }

    /**
     * 判断 「# 记录规则」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRulesCount() {
        return this._contains(FIELD_RULES_COUNT);
    }

    /**
     * 重置 「# 记录规则」
     *
     */
    @JsonIgnore
    public ResUsersCounterDTO resetRulesCount() {
        this._reset(FIELD_RULES_COUNT);
        return this;
    }

}
