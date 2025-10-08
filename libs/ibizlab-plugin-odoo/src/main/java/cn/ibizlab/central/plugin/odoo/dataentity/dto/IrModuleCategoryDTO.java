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


public class IrModuleCategoryDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 描述
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 专属
     */
    public final static String FIELD_EXCLUSIVE = "exclusive";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 父应用
     */
    public final static String FIELD_PARENT_ID = "parent_id";

    /**
     * 属性: 父应用名称
     */
    public final static String FIELD_PARENT_NAME = "parent_name";

    /**
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 显示
     */
    public final static String FIELD_VISIBLE = "visible";

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
    public IrModuleCategoryDTO setCreateDate(Timestamp val) {
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
    public IrModuleCategoryDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrModuleCategoryDTO setCreateUid(String val) {
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
    public IrModuleCategoryDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public IrModuleCategoryDTO setDescription(String val) {
        this._set(FIELD_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「描述」值
     *
     */
    @JsonIgnore
    public String getDescription() {
        return DataTypeUtils.asString(this._get(FIELD_DESCRIPTION), null);
    }

    /**
     * 判断 「描述」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDescription() {
        return this._contains(FIELD_DESCRIPTION);
    }

    /**
     * 重置 「描述」
     *
     */
    @JsonIgnore
    public IrModuleCategoryDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「专属」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_EXCLUSIVE)
    public IrModuleCategoryDTO setExclusive(Integer val) {
        this._set(FIELD_EXCLUSIVE, val);
        return this;
    }

    /**
     * 获取「专属」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getExclusive() {
        return DataTypeUtils.asInteger(this._get(FIELD_EXCLUSIVE), null);
    }

    /**
     * 判断 「专属」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExclusive() {
        return this._contains(FIELD_EXCLUSIVE);
    }

    /**
     * 重置 「专属」
     *
     */
    @JsonIgnore
    public IrModuleCategoryDTO resetExclusive() {
        this._reset(FIELD_EXCLUSIVE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrModuleCategoryDTO setId(String val) {
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
    public IrModuleCategoryDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrModuleCategoryDTO setName(String val) {
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
    public IrModuleCategoryDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「父应用」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_ID)
    public IrModuleCategoryDTO setParentId(String val) {
        this._set(FIELD_PARENT_ID, val);
        return this;
    }

    /**
     * 获取「父应用」值
     *
     */
    @JsonIgnore
    public String getParentId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_ID), null);
    }

    /**
     * 判断 「父应用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentId() {
        return this._contains(FIELD_PARENT_ID);
    }

    /**
     * 重置 「父应用」
     *
     */
    @JsonIgnore
    public IrModuleCategoryDTO resetParentId() {
        this._reset(FIELD_PARENT_ID);
        return this;
    }

    /**
     * 设置「父应用名称」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_NAME)
    public IrModuleCategoryDTO setParentName(String val) {
        this._set(FIELD_PARENT_NAME, val);
        return this;
    }

    /**
     * 获取「父应用名称」值
     *
     */
    @JsonIgnore
    public String getParentName() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_NAME), null);
    }

    /**
     * 判断 「父应用名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentName() {
        return this._contains(FIELD_PARENT_NAME);
    }

    /**
     * 重置 「父应用名称」
     *
     */
    @JsonIgnore
    public IrModuleCategoryDTO resetParentName() {
        this._reset(FIELD_PARENT_NAME);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public IrModuleCategoryDTO setSequence(Integer val) {
        this._set(FIELD_SEQUENCE, val);
        return this;
    }

    /**
     * 获取「序列」值
     *
     */
    @JsonIgnore
    public Integer getSequence() {
        return DataTypeUtils.asInteger(this._get(FIELD_SEQUENCE), null);
    }

    /**
     * 判断 「序列」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSequence() {
        return this._contains(FIELD_SEQUENCE);
    }

    /**
     * 重置 「序列」
     *
     */
    @JsonIgnore
    public IrModuleCategoryDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「显示」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_VISIBLE)
    public IrModuleCategoryDTO setVisible(Integer val) {
        this._set(FIELD_VISIBLE, val);
        return this;
    }

    /**
     * 获取「显示」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getVisible() {
        return DataTypeUtils.asInteger(this._get(FIELD_VISIBLE), null);
    }

    /**
     * 判断 「显示」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVisible() {
        return this._contains(FIELD_VISIBLE);
    }

    /**
     * 重置 「显示」
     *
     */
    @JsonIgnore
    public IrModuleCategoryDTO resetVisible() {
        this._reset(FIELD_VISIBLE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrModuleCategoryDTO setWriteDate(Timestamp val) {
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
    public IrModuleCategoryDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrModuleCategoryDTO setWriteUid(String val) {
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
    public IrModuleCategoryDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
