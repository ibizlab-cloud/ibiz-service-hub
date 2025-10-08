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


public class ResUsersApikeysShowDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 密钥KEY
     */
    public final static String FIELD_KEY = "key";

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResUsersApikeysShowDTO setId(String val) {
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
    public ResUsersApikeysShowDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「密钥KEY」
     * @param val
     */
    @JsonProperty(FIELD_KEY)
    public ResUsersApikeysShowDTO setKey(String val) {
        this._set(FIELD_KEY, val);
        return this;
    }

    /**
     * 获取「密钥KEY」值
     *
     */
    @JsonIgnore
    public String getKey() {
        return DataTypeUtils.asString(this._get(FIELD_KEY), null);
    }

    /**
     * 判断 「密钥KEY」是否有值
     *
     */
    @JsonIgnore
    public boolean containsKey() {
        return this._contains(FIELD_KEY);
    }

    /**
     * 重置 「密钥KEY」
     *
     */
    @JsonIgnore
    public ResUsersApikeysShowDTO resetKey() {
        this._reset(FIELD_KEY);
        return this;
    }

}
