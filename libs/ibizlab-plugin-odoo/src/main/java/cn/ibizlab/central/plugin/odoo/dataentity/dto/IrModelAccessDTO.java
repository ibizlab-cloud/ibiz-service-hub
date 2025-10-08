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


public class IrModelAccessDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 模型
     */
    public final static String FIELD_MODEL_ID = "model_id";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 授权群组
     */
    public final static String FIELD_GROUP_ID = "group_id";

    /**
     * 属性: 授权群组名称
     */
    public final static String FIELD_GROUP_NAME = "group_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 创建
     */
    public final static String FIELD_PERM_CREATE = "perm_create";

    /**
     * 属性: 读取
     */
    public final static String FIELD_PERM_READ = "perm_read";

    /**
     * 属性: 删除
     */
    public final static String FIELD_PERM_UNLINK = "perm_unlink";

    /**
     * 属性: 写入
     */
    public final static String FIELD_PERM_WRITE = "perm_write";

    /**
     * 设置「模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL_ID)
    public IrModelAccessDTO setModelId(String val) {
        this._set(FIELD_MODEL_ID, val);
        return this;
    }

    /**
     * 获取「模型」值
     *
     */
    @JsonIgnore
    public String getModelId() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL_ID), null);
    }

    /**
     * 判断 「模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModelId() {
        return this._contains(FIELD_MODEL_ID);
    }

    /**
     * 重置 「模型」
     *
     */
    @JsonIgnore
    public IrModelAccessDTO resetModelId() {
        this._reset(FIELD_MODEL_ID);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public IrModelAccessDTO setActive(Integer val) {
        this._set(FIELD_ACTIVE, val);
        return this;
    }

    /**
     * 获取「有效」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getActive() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE), null);
    }

    /**
     * 判断 「有效」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActive() {
        return this._contains(FIELD_ACTIVE);
    }

    /**
     * 重置 「有效」
     *
     */
    @JsonIgnore
    public IrModelAccessDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「授权群组」
     * @param val
     */
    @JsonProperty(FIELD_GROUP_ID)
    public IrModelAccessDTO setGroupId(String val) {
        this._set(FIELD_GROUP_ID, val);
        return this;
    }

    /**
     * 获取「授权群组」值
     *
     */
    @JsonIgnore
    public String getGroupId() {
        return DataTypeUtils.asString(this._get(FIELD_GROUP_ID), null);
    }

    /**
     * 判断 「授权群组」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupId() {
        return this._contains(FIELD_GROUP_ID);
    }

    /**
     * 重置 「授权群组」
     *
     */
    @JsonIgnore
    public IrModelAccessDTO resetGroupId() {
        this._reset(FIELD_GROUP_ID);
        return this;
    }

    /**
     * 设置「授权群组名称」
     * @param val
     */
    @JsonProperty(FIELD_GROUP_NAME)
    public IrModelAccessDTO setGroupName(String val) {
        this._set(FIELD_GROUP_NAME, val);
        return this;
    }

    /**
     * 获取「授权群组名称」值
     *
     */
    @JsonIgnore
    public String getGroupName() {
        return DataTypeUtils.asString(this._get(FIELD_GROUP_NAME), null);
    }

    /**
     * 判断 「授权群组名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupName() {
        return this._contains(FIELD_GROUP_NAME);
    }

    /**
     * 重置 「授权群组名称」
     *
     */
    @JsonIgnore
    public IrModelAccessDTO resetGroupName() {
        this._reset(FIELD_GROUP_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrModelAccessDTO setId(String val) {
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
    public IrModelAccessDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrModelAccessDTO setName(String val) {
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
    public IrModelAccessDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「创建」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PERM_CREATE)
    public IrModelAccessDTO setPermCreate(Integer val) {
        this._set(FIELD_PERM_CREATE, val);
        return this;
    }

    /**
     * 获取「创建」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPermCreate() {
        return DataTypeUtils.asInteger(this._get(FIELD_PERM_CREATE), null);
    }

    /**
     * 判断 「创建」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPermCreate() {
        return this._contains(FIELD_PERM_CREATE);
    }

    /**
     * 重置 「创建」
     *
     */
    @JsonIgnore
    public IrModelAccessDTO resetPermCreate() {
        this._reset(FIELD_PERM_CREATE);
        return this;
    }

    /**
     * 设置「读取」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PERM_READ)
    public IrModelAccessDTO setPermRead(Integer val) {
        this._set(FIELD_PERM_READ, val);
        return this;
    }

    /**
     * 获取「读取」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPermRead() {
        return DataTypeUtils.asInteger(this._get(FIELD_PERM_READ), null);
    }

    /**
     * 判断 「读取」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPermRead() {
        return this._contains(FIELD_PERM_READ);
    }

    /**
     * 重置 「读取」
     *
     */
    @JsonIgnore
    public IrModelAccessDTO resetPermRead() {
        this._reset(FIELD_PERM_READ);
        return this;
    }

    /**
     * 设置「删除」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PERM_UNLINK)
    public IrModelAccessDTO setPermUnlink(Integer val) {
        this._set(FIELD_PERM_UNLINK, val);
        return this;
    }

    /**
     * 获取「删除」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPermUnlink() {
        return DataTypeUtils.asInteger(this._get(FIELD_PERM_UNLINK), null);
    }

    /**
     * 判断 「删除」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPermUnlink() {
        return this._contains(FIELD_PERM_UNLINK);
    }

    /**
     * 重置 「删除」
     *
     */
    @JsonIgnore
    public IrModelAccessDTO resetPermUnlink() {
        this._reset(FIELD_PERM_UNLINK);
        return this;
    }

    /**
     * 设置「写入」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PERM_WRITE)
    public IrModelAccessDTO setPermWrite(Integer val) {
        this._set(FIELD_PERM_WRITE, val);
        return this;
    }

    /**
     * 获取「写入」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPermWrite() {
        return DataTypeUtils.asInteger(this._get(FIELD_PERM_WRITE), null);
    }

    /**
     * 判断 「写入」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPermWrite() {
        return this._contains(FIELD_PERM_WRITE);
    }

    /**
     * 重置 「写入」
     *
     */
    @JsonIgnore
    public IrModelAccessDTO resetPermWrite() {
        this._reset(FIELD_PERM_WRITE);
        return this;
    }

}
