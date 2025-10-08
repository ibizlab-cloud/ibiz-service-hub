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


public class CloudProxyDepartmentDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 部门负责人标识
     */
    public final static String FIELD_HEAD_ID = "head_id";

    /**
     * 属性: 父部门标识
     */
    public final static String FIELD_PARENT_ID = "parent_id";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 设置「部门负责人标识」
     * @param val
     */
    @JsonProperty(FIELD_HEAD_ID)
    public CloudProxyDepartmentDTO setHeadId(String val) {
        this._set(FIELD_HEAD_ID, val);
        return this;
    }

    /**
     * 获取「部门负责人标识」值
     *
     */
    @JsonIgnore
    public String getHeadId() {
        return DataTypeUtils.asString(this._get(FIELD_HEAD_ID), null);
    }

    /**
     * 判断 「部门负责人标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHeadId() {
        return this._contains(FIELD_HEAD_ID);
    }

    /**
     * 重置 「部门负责人标识」
     *
     */
    @JsonIgnore
    public CloudProxyDepartmentDTO resetHeadId() {
        this._reset(FIELD_HEAD_ID);
        return this;
    }

    /**
     * 设置「父部门标识」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_ID)
    public CloudProxyDepartmentDTO setParentId(String val) {
        this._set(FIELD_PARENT_ID, val);
        return this;
    }

    /**
     * 获取「父部门标识」值
     *
     */
    @JsonIgnore
    public String getParentId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_ID), null);
    }

    /**
     * 判断 「父部门标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentId() {
        return this._contains(FIELD_PARENT_ID);
    }

    /**
     * 重置 「父部门标识」
     *
     */
    @JsonIgnore
    public CloudProxyDepartmentDTO resetParentId() {
        this._reset(FIELD_PARENT_ID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public CloudProxyDepartmentDTO setId(String val) {
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
    public CloudProxyDepartmentDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public CloudProxyDepartmentDTO setName(String val) {
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
    public CloudProxyDepartmentDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

}
