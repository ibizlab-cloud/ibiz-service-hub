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


public class UniresGroupRelDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 资源代码
     */
    public final static String FIELD_RES_CODE = "res_code";

    /**
     * 属性: 标识
     */
    public final static String FIELD_GID = "gid";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 统一资源标识
     */
    public final static String FIELD_UNIRES_ID = "unires_id";

    /**
     * 属性: 统一资源名称
     */
    public final static String FIELD_UNIRES_NAME = "unires_name";

    /**
     * 设置「资源代码」
     * @param val
     */
    @JsonProperty(FIELD_RES_CODE)
    public UniresGroupRelDTO setResCode(String val) {
        this._set(FIELD_RES_CODE, val);
        return this;
    }

    /**
     * 获取「资源代码」值
     *
     */
    @JsonIgnore
    public String getResCode() {
        return DataTypeUtils.asString(this._get(FIELD_RES_CODE), null);
    }

    /**
     * 判断 「资源代码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResCode() {
        return this._contains(FIELD_RES_CODE);
    }

    /**
     * 重置 「资源代码」
     *
     */
    @JsonIgnore
    public UniresGroupRelDTO resetResCode() {
        this._reset(FIELD_RES_CODE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_GID)
    public UniresGroupRelDTO setGid(String val) {
        this._set(FIELD_GID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getGid() {
        return DataTypeUtils.asString(this._get(FIELD_GID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGid() {
        return this._contains(FIELD_GID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public UniresGroupRelDTO resetGid() {
        this._reset(FIELD_GID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public UniresGroupRelDTO setId(String val) {
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
    public UniresGroupRelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public UniresGroupRelDTO setName(String val) {
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
    public UniresGroupRelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「统一资源标识」
     * @param val
     */
    @JsonProperty(FIELD_UNIRES_ID)
    public UniresGroupRelDTO setUniresId(String val) {
        this._set(FIELD_UNIRES_ID, val);
        return this;
    }

    /**
     * 获取「统一资源标识」值
     *
     */
    @JsonIgnore
    public String getUniresId() {
        return DataTypeUtils.asString(this._get(FIELD_UNIRES_ID), null);
    }

    /**
     * 判断 「统一资源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUniresId() {
        return this._contains(FIELD_UNIRES_ID);
    }

    /**
     * 重置 「统一资源标识」
     *
     */
    @JsonIgnore
    public UniresGroupRelDTO resetUniresId() {
        this._reset(FIELD_UNIRES_ID);
        return this;
    }

    /**
     * 设置「统一资源名称」
     * @param val
     */
    @JsonProperty(FIELD_UNIRES_NAME)
    public UniresGroupRelDTO setUniresName(String val) {
        this._set(FIELD_UNIRES_NAME, val);
        return this;
    }

    /**
     * 获取「统一资源名称」值
     *
     */
    @JsonIgnore
    public String getUniresName() {
        return DataTypeUtils.asString(this._get(FIELD_UNIRES_NAME), null);
    }

    /**
     * 判断 「统一资源名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUniresName() {
        return this._contains(FIELD_UNIRES_NAME);
    }

    /**
     * 重置 「统一资源名称」
     *
     */
    @JsonIgnore
    public UniresGroupRelDTO resetUniresName() {
        this._reset(FIELD_UNIRES_NAME);
        return this;
    }

}
