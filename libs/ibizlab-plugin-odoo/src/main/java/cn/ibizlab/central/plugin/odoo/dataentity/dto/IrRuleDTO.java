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


public class IrRuleDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 模型
     */
    public final static String FIELD_MODEL_ID = "model_id";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 权限组关联规则
     */
    public final static String FIELD_RULE_GROUP_RELS = "rule_group_rels";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 域名
     */
    public final static String FIELD_DOMAIN_FORCE = "domain_force";

    /**
     * 属性: 全局
     */
    public final static String FIELD_GLOBAL = "global";

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
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL_ID)
    public IrRuleDTO setModelId(String val) {
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
    public IrRuleDTO resetModelId() {
        this._reset(FIELD_MODEL_ID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public IrRuleDTO setDisplayName(String val) {
        this._set(FIELD_DISPLAY_NAME, val);
        return this;
    }

    /**
     * 获取「显示名称」值
     *
     */
    @JsonIgnore
    public String getDisplayName() {
        return DataTypeUtils.asString(this._get(FIELD_DISPLAY_NAME), null);
    }

    /**
     * 判断 「显示名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayName() {
        return this._contains(FIELD_DISPLAY_NAME);
    }

    /**
     * 重置 「显示名称」
     *
     */
    @JsonIgnore
    public IrRuleDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「权限组关联规则」
     * @param val
     */
    @JsonProperty(FIELD_RULE_GROUP_RELS)
    public IrRuleDTO setRuleGroupRels(List<RuleGroupRelDTO> val) {
        this._set(FIELD_RULE_GROUP_RELS, val);
        return this;
    }

    /**
     * 获取「权限组关联规则」值
     *
     */
    @JsonIgnore
    public List<RuleGroupRelDTO> getRuleGroupRels() {
        return (List<RuleGroupRelDTO>) this._get(FIELD_RULE_GROUP_RELS);
    }

    /**
     * 判断 「权限组关联规则」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRuleGroupRels() {
        return this._contains(FIELD_RULE_GROUP_RELS);
    }

    /**
     * 重置 「权限组关联规则」
     *
     */
    @JsonIgnore
    public IrRuleDTO resetRuleGroupRels() {
        this._reset(FIELD_RULE_GROUP_RELS);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public IrRuleDTO setActive(Integer val) {
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
    public IrRuleDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrRuleDTO setCreateDate(Timestamp val) {
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
    public IrRuleDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrRuleDTO setCreateUid(String val) {
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
    public IrRuleDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「域名」
     * @param val
     */
    @JsonProperty(FIELD_DOMAIN_FORCE)
    public IrRuleDTO setDomainForce(String val) {
        this._set(FIELD_DOMAIN_FORCE, val);
        return this;
    }

    /**
     * 获取「域名」值
     *
     */
    @JsonIgnore
    public String getDomainForce() {
        return DataTypeUtils.asString(this._get(FIELD_DOMAIN_FORCE), null);
    }

    /**
     * 判断 「域名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDomainForce() {
        return this._contains(FIELD_DOMAIN_FORCE);
    }

    /**
     * 重置 「域名」
     *
     */
    @JsonIgnore
    public IrRuleDTO resetDomainForce() {
        this._reset(FIELD_DOMAIN_FORCE);
        return this;
    }

    /**
     * 设置「全局」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GLOBAL)
    public IrRuleDTO setGlobal(Integer val) {
        this._set(FIELD_GLOBAL, val);
        return this;
    }

    /**
     * 获取「全局」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGlobal() {
        return DataTypeUtils.asInteger(this._get(FIELD_GLOBAL), null);
    }

    /**
     * 判断 「全局」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGlobal() {
        return this._contains(FIELD_GLOBAL);
    }

    /**
     * 重置 「全局」
     *
     */
    @JsonIgnore
    public IrRuleDTO resetGlobal() {
        this._reset(FIELD_GLOBAL);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrRuleDTO setId(String val) {
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
    public IrRuleDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrRuleDTO setName(String val) {
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
    public IrRuleDTO resetName() {
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
    public IrRuleDTO setPermCreate(Integer val) {
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
    public IrRuleDTO resetPermCreate() {
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
    public IrRuleDTO setPermRead(Integer val) {
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
    public IrRuleDTO resetPermRead() {
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
    public IrRuleDTO setPermUnlink(Integer val) {
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
    public IrRuleDTO resetPermUnlink() {
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
    public IrRuleDTO setPermWrite(Integer val) {
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
    public IrRuleDTO resetPermWrite() {
        this._reset(FIELD_PERM_WRITE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrRuleDTO setWriteDate(Timestamp val) {
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
    public IrRuleDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrRuleDTO setWriteUid(String val) {
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
    public IrRuleDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
