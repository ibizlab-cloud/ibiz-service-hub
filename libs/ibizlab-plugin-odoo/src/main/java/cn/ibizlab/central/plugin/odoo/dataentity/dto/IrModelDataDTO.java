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


public class IrModelDataDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 模型名称
     */
    public final static String FIELD_MODEL = "model";

    /**
     * 属性: 模块
     */
    public final static String FIELD_MODULE = "module";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 不可更新
     */
    public final static String FIELD_NOUPDATE = "noupdate";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrModelDataDTO setCreateDate(Timestamp val) {
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
    public IrModelDataDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrModelDataDTO setCreateUid(String val) {
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
    public IrModelDataDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrModelDataDTO setId(String val) {
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
    public IrModelDataDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「模型名称」
     * @param val
     */
    @JsonProperty(FIELD_MODEL)
    public IrModelDataDTO setModel(String val) {
        this._set(FIELD_MODEL, val);
        return this;
    }

    /**
     * 获取「模型名称」值
     *
     */
    @JsonIgnore
    public String getModel() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL), null);
    }

    /**
     * 判断 「模型名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModel() {
        return this._contains(FIELD_MODEL);
    }

    /**
     * 重置 「模型名称」
     *
     */
    @JsonIgnore
    public IrModelDataDTO resetModel() {
        this._reset(FIELD_MODEL);
        return this;
    }

    /**
     * 设置「模块」
     * @param val
     */
    @JsonProperty(FIELD_MODULE)
    public IrModelDataDTO setModule(String val) {
        this._set(FIELD_MODULE, val);
        return this;
    }

    /**
     * 获取「模块」值
     *
     */
    @JsonIgnore
    public String getModule() {
        return DataTypeUtils.asString(this._get(FIELD_MODULE), null);
    }

    /**
     * 判断 「模块」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModule() {
        return this._contains(FIELD_MODULE);
    }

    /**
     * 重置 「模块」
     *
     */
    @JsonIgnore
    public IrModelDataDTO resetModule() {
        this._reset(FIELD_MODULE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrModelDataDTO setName(String val) {
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
    public IrModelDataDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「不可更新」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_NOUPDATE)
    public IrModelDataDTO setNoupdate(Integer val) {
        this._set(FIELD_NOUPDATE, val);
        return this;
    }

    /**
     * 获取「不可更新」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getNoupdate() {
        return DataTypeUtils.asInteger(this._get(FIELD_NOUPDATE), null);
    }

    /**
     * 判断 「不可更新」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNoupdate() {
        return this._contains(FIELD_NOUPDATE);
    }

    /**
     * 重置 「不可更新」
     *
     */
    @JsonIgnore
    public IrModelDataDTO resetNoupdate() {
        this._reset(FIELD_NOUPDATE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrModelDataDTO setWriteDate(Timestamp val) {
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
    public IrModelDataDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrModelDataDTO setWriteUid(String val) {
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
    public IrModelDataDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
