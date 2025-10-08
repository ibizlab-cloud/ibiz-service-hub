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


public class IrModuleModuleDependencyDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 需要自动安装
     */
    public final static String FIELD_AUTO_INSTALL_REQUIRED = "auto_install_required";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 模块
     */
    public final static String FIELD_MODULE_ID = "module_id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 设置「需要自动安装」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTO_INSTALL_REQUIRED)
    public IrModuleModuleDependencyDTO setAutoInstallRequired(Integer val) {
        this._set(FIELD_AUTO_INSTALL_REQUIRED, val);
        return this;
    }

    /**
     * 获取「需要自动安装」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutoInstallRequired() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTO_INSTALL_REQUIRED), null);
    }

    /**
     * 判断 「需要自动安装」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutoInstallRequired() {
        return this._contains(FIELD_AUTO_INSTALL_REQUIRED);
    }

    /**
     * 重置 「需要自动安装」
     *
     */
    @JsonIgnore
    public IrModuleModuleDependencyDTO resetAutoInstallRequired() {
        this._reset(FIELD_AUTO_INSTALL_REQUIRED);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrModuleModuleDependencyDTO setId(String val) {
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
    public IrModuleModuleDependencyDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「模块」
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ID)
    public IrModuleModuleDependencyDTO setModuleId(String val) {
        this._set(FIELD_MODULE_ID, val);
        return this;
    }

    /**
     * 获取「模块」值
     *
     */
    @JsonIgnore
    public String getModuleId() {
        return DataTypeUtils.asString(this._get(FIELD_MODULE_ID), null);
    }

    /**
     * 判断 「模块」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleId() {
        return this._contains(FIELD_MODULE_ID);
    }

    /**
     * 重置 「模块」
     *
     */
    @JsonIgnore
    public IrModuleModuleDependencyDTO resetModuleId() {
        this._reset(FIELD_MODULE_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrModuleModuleDependencyDTO setName(String val) {
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
    public IrModuleModuleDependencyDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

}
