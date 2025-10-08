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


public class RuleGroupRelDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 模型
     */
    public final static String FIELD_MODEL_ID = "model_id";

    /**
     * 属性: 域名
     */
    public final static String FIELD_DOMAIN_FORCE = "domain_force";

    /**
     * 属性: 组标识
     */
    public final static String FIELD_GID = "gid";

    /**
     * 属性: 组名称
     */
    public final static String FIELD_GNAME = "gname";

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
     * 属性: 规则标识
     */
    public final static String FIELD_RULE_ID = "rule_id";

    /**
     * 属性: 规则名称
     */
    public final static String FIELD_RULE_NAME = "rule_name";

    /**
     * 设置「模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL_ID)
    public RuleGroupRelDTO setModelId(String val) {
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
    public RuleGroupRelDTO resetModelId() {
        this._reset(FIELD_MODEL_ID);
        return this;
    }

    /**
     * 设置「域名」
     * @param val
     */
    @JsonProperty(FIELD_DOMAIN_FORCE)
    public RuleGroupRelDTO setDomainForce(String val) {
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
    public RuleGroupRelDTO resetDomainForce() {
        this._reset(FIELD_DOMAIN_FORCE);
        return this;
    }

    /**
     * 设置「组标识」
     * @param val
     */
    @JsonProperty(FIELD_GID)
    public RuleGroupRelDTO setGid(String val) {
        this._set(FIELD_GID, val);
        return this;
    }

    /**
     * 获取「组标识」值
     *
     */
    @JsonIgnore
    public String getGid() {
        return DataTypeUtils.asString(this._get(FIELD_GID), null);
    }

    /**
     * 判断 「组标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGid() {
        return this._contains(FIELD_GID);
    }

    /**
     * 重置 「组标识」
     *
     */
    @JsonIgnore
    public RuleGroupRelDTO resetGid() {
        this._reset(FIELD_GID);
        return this;
    }

    /**
     * 设置「组名称」
     * @param val
     */
    @JsonProperty(FIELD_GNAME)
    public RuleGroupRelDTO setGname(String val) {
        this._set(FIELD_GNAME, val);
        return this;
    }

    /**
     * 获取「组名称」值
     *
     */
    @JsonIgnore
    public String getGname() {
        return DataTypeUtils.asString(this._get(FIELD_GNAME), null);
    }

    /**
     * 判断 「组名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGname() {
        return this._contains(FIELD_GNAME);
    }

    /**
     * 重置 「组名称」
     *
     */
    @JsonIgnore
    public RuleGroupRelDTO resetGname() {
        this._reset(FIELD_GNAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public RuleGroupRelDTO setId(String val) {
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
    public RuleGroupRelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public RuleGroupRelDTO setName(String val) {
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
    public RuleGroupRelDTO resetName() {
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
    public RuleGroupRelDTO setPermCreate(Integer val) {
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
    public RuleGroupRelDTO resetPermCreate() {
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
    public RuleGroupRelDTO setPermRead(Integer val) {
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
    public RuleGroupRelDTO resetPermRead() {
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
    public RuleGroupRelDTO setPermUnlink(Integer val) {
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
    public RuleGroupRelDTO resetPermUnlink() {
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
    public RuleGroupRelDTO setPermWrite(Integer val) {
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
    public RuleGroupRelDTO resetPermWrite() {
        this._reset(FIELD_PERM_WRITE);
        return this;
    }

    /**
     * 设置「规则标识」
     * @param val
     */
    @JsonProperty(FIELD_RULE_ID)
    public RuleGroupRelDTO setRuleId(String val) {
        this._set(FIELD_RULE_ID, val);
        return this;
    }

    /**
     * 获取「规则标识」值
     *
     */
    @JsonIgnore
    public String getRuleId() {
        return DataTypeUtils.asString(this._get(FIELD_RULE_ID), null);
    }

    /**
     * 判断 「规则标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRuleId() {
        return this._contains(FIELD_RULE_ID);
    }

    /**
     * 重置 「规则标识」
     *
     */
    @JsonIgnore
    public RuleGroupRelDTO resetRuleId() {
        this._reset(FIELD_RULE_ID);
        return this;
    }

    /**
     * 设置「规则名称」
     * @param val
     */
    @JsonProperty(FIELD_RULE_NAME)
    public RuleGroupRelDTO setRuleName(String val) {
        this._set(FIELD_RULE_NAME, val);
        return this;
    }

    /**
     * 获取「规则名称」值
     *
     */
    @JsonIgnore
    public String getRuleName() {
        return DataTypeUtils.asString(this._get(FIELD_RULE_NAME), null);
    }

    /**
     * 判断 「规则名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRuleName() {
        return this._contains(FIELD_RULE_NAME);
    }

    /**
     * 重置 「规则名称」
     *
     */
    @JsonIgnore
    public RuleGroupRelDTO resetRuleName() {
        this._reset(FIELD_RULE_NAME);
        return this;
    }

}
