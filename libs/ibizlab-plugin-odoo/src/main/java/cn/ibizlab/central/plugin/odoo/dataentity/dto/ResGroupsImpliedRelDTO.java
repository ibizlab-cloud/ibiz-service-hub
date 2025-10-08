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


public class ResGroupsImpliedRelDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 权限组标识
     */
    public final static String FIELD_GID = "gid";

    /**
     * 属性: 权限组标识
     */
    public final static String FIELD_GNAME = "gname";

    /**
     * 属性: 继承权限组标识
     */
    public final static String FIELD_HID = "hid";

    /**
     * 属性: 继承权限组标识
     */
    public final static String FIELD_HNAME = "hname";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 设置「权限组标识」
     * @param val
     */
    @JsonProperty(FIELD_GID)
    public ResGroupsImpliedRelDTO setGid(String val) {
        this._set(FIELD_GID, val);
        return this;
    }

    /**
     * 获取「权限组标识」值
     *
     */
    @JsonIgnore
    public String getGid() {
        return DataTypeUtils.asString(this._get(FIELD_GID), null);
    }

    /**
     * 判断 「权限组标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGid() {
        return this._contains(FIELD_GID);
    }

    /**
     * 重置 「权限组标识」
     *
     */
    @JsonIgnore
    public ResGroupsImpliedRelDTO resetGid() {
        this._reset(FIELD_GID);
        return this;
    }

    /**
     * 设置「权限组标识」
     * @param val
     */
    @JsonProperty(FIELD_GNAME)
    public ResGroupsImpliedRelDTO setGname(String val) {
        this._set(FIELD_GNAME, val);
        return this;
    }

    /**
     * 获取「权限组标识」值
     *
     */
    @JsonIgnore
    public String getGname() {
        return DataTypeUtils.asString(this._get(FIELD_GNAME), null);
    }

    /**
     * 判断 「权限组标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGname() {
        return this._contains(FIELD_GNAME);
    }

    /**
     * 重置 「权限组标识」
     *
     */
    @JsonIgnore
    public ResGroupsImpliedRelDTO resetGname() {
        this._reset(FIELD_GNAME);
        return this;
    }

    /**
     * 设置「继承权限组标识」
     * @param val
     */
    @JsonProperty(FIELD_HID)
    public ResGroupsImpliedRelDTO setHid(String val) {
        this._set(FIELD_HID, val);
        return this;
    }

    /**
     * 获取「继承权限组标识」值
     *
     */
    @JsonIgnore
    public String getHid() {
        return DataTypeUtils.asString(this._get(FIELD_HID), null);
    }

    /**
     * 判断 「继承权限组标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHid() {
        return this._contains(FIELD_HID);
    }

    /**
     * 重置 「继承权限组标识」
     *
     */
    @JsonIgnore
    public ResGroupsImpliedRelDTO resetHid() {
        this._reset(FIELD_HID);
        return this;
    }

    /**
     * 设置「继承权限组标识」
     * @param val
     */
    @JsonProperty(FIELD_HNAME)
    public ResGroupsImpliedRelDTO setHname(String val) {
        this._set(FIELD_HNAME, val);
        return this;
    }

    /**
     * 获取「继承权限组标识」值
     *
     */
    @JsonIgnore
    public String getHname() {
        return DataTypeUtils.asString(this._get(FIELD_HNAME), null);
    }

    /**
     * 判断 「继承权限组标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHname() {
        return this._contains(FIELD_HNAME);
    }

    /**
     * 重置 「继承权限组标识」
     *
     */
    @JsonIgnore
    public ResGroupsImpliedRelDTO resetHname() {
        this._reset(FIELD_HNAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResGroupsImpliedRelDTO setId(String val) {
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
    public ResGroupsImpliedRelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResGroupsImpliedRelDTO setName(String val) {
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
    public ResGroupsImpliedRelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

}
