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


public class IrModelFieldsDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 列 1
     */
    public final static String FIELD_COLUMN1 = "column1";

    /**
     * 属性: 列 2
     */
    public final static String FIELD_COLUMN2 = "column2";

    /**
     * 属性: 公司依赖
     */
    public final static String FIELD_COMPANY_DEPENDENT = "company_dependent";

    /**
     * 属性: 全名
     */
    public final static String FIELD_COMPLETE_NAME = "complete_name";

    /**
     * 属性: 计算
     */
    public final static String FIELD_COMPUTE = "compute";

    /**
     * 属性: 可复制
     */
    public final static String FIELD_COPIED = "copied";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 币别字段
     */
    public final static String FIELD_CURRENCY_FIELD = "currency_field";

    /**
     * 属性: 依赖于
     */
    public final static String FIELD_DEPENDS = "depends";

    /**
     * 属性: 域名
     */
    public final static String FIELD_DOMAIN = "domain";

    /**
     * 属性: 字段标签
     */
    public final static String FIELD_FIELD_DESCRIPTION = "field_description";

    /**
     * 属性: 扩展组别
     */
    public final static String FIELD_GROUP_EXPAND = "group_expand";

    /**
     * 属性: 字段帮助
     */
    public final static String FIELD_HELP = "help";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 索引
     */
    public final static String FIELD_INDEX = "index";

    /**
     * 属性: 模型名称
     */
    public final static String FIELD_MODEL = "model";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 关于删除
     */
    public final static String FIELD_ON_DELETE = "on_delete";

    /**
     * 属性: 只读
     */
    public final static String FIELD_READONLY = "readonly";

    /**
     * 属性: 关联的字段
     */
    public final static String FIELD_RELATED = "related";

    /**
     * 属性: 关联的模型
     */
    public final static String FIELD_RELATION = "relation";

    /**
     * 属性: 关联字段
     */
    public final static String FIELD_RELATION_FIELD = "relation_field";

    /**
     * 属性: 关系表
     */
    public final static String FIELD_RELATION_TABLE = "relation_table";

    /**
     * 属性: 必填
     */
    public final static String FIELD_REQUIRED = "required";

    /**
     * 属性: 净化 HTML
     */
    public final static String FIELD_SANITIZE = "sanitize";

    /**
     * 属性: 净化 HTML 属性
     */
    public final static String FIELD_SANITIZE_ATTRIBUTES = "sanitize_attributes";

    /**
     * 属性: 净化 HTML 表格
     */
    public final static String FIELD_SANITIZE_FORM = "sanitize_form";

    /**
     * 属性: 可重写消毒 HTML
     */
    public final static String FIELD_SANITIZE_OVERRIDABLE = "sanitize_overridable";

    /**
     * 属性: 净化 HTML 样式
     */
    public final static String FIELD_SANITIZE_STYLE = "sanitize_style";

    /**
     * 属性: 清除 HTML 标记
     */
    public final static String FIELD_SANITIZE_TAGS = "sanitize_tags";

    /**
     * 属性: 可选择
     */
    public final static String FIELD_SELECTABLE = "selectable";

    /**
     * 属性: 大小
     */
    public final static String FIELD_SIZE = "size";

    /**
     * 属性: 类型
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 存储
     */
    public final static String FIELD_STORE = "store";

    /**
     * 属性: 剥离类属性
     */
    public final static String FIELD_STRIP_CLASSES = "strip_classes";

    /**
     * 属性: 带状样式属性
     */
    public final static String FIELD_STRIP_STYLE = "strip_style";

    /**
     * 属性: 启用跟踪
     */
    public final static String FIELD_TRACKING = "tracking";

    /**
     * 属性: 可翻译
     */
    public final static String FIELD_TRANSLATE = "translate";

    /**
     * 属性: 字段类型
     */
    public final static String FIELD_TTYPE = "ttype";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「列 1」
     * @param val
     */
    @JsonProperty(FIELD_COLUMN1)
    public IrModelFieldsDTO setColumn1(String val) {
        this._set(FIELD_COLUMN1, val);
        return this;
    }

    /**
     * 获取「列 1」值
     *
     */
    @JsonIgnore
    public String getColumn1() {
        return DataTypeUtils.asString(this._get(FIELD_COLUMN1), null);
    }

    /**
     * 判断 「列 1」是否有值
     *
     */
    @JsonIgnore
    public boolean containsColumn1() {
        return this._contains(FIELD_COLUMN1);
    }

    /**
     * 重置 「列 1」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetColumn1() {
        this._reset(FIELD_COLUMN1);
        return this;
    }

    /**
     * 设置「列 2」
     * @param val
     */
    @JsonProperty(FIELD_COLUMN2)
    public IrModelFieldsDTO setColumn2(String val) {
        this._set(FIELD_COLUMN2, val);
        return this;
    }

    /**
     * 获取「列 2」值
     *
     */
    @JsonIgnore
    public String getColumn2() {
        return DataTypeUtils.asString(this._get(FIELD_COLUMN2), null);
    }

    /**
     * 判断 「列 2」是否有值
     *
     */
    @JsonIgnore
    public boolean containsColumn2() {
        return this._contains(FIELD_COLUMN2);
    }

    /**
     * 重置 「列 2」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetColumn2() {
        this._reset(FIELD_COLUMN2);
        return this;
    }

    /**
     * 设置「公司依赖」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_DEPENDENT)
    public IrModelFieldsDTO setCompanyDependent(Integer val) {
        this._set(FIELD_COMPANY_DEPENDENT, val);
        return this;
    }

    /**
     * 获取「公司依赖」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCompanyDependent() {
        return DataTypeUtils.asInteger(this._get(FIELD_COMPANY_DEPENDENT), null);
    }

    /**
     * 判断 「公司依赖」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyDependent() {
        return this._contains(FIELD_COMPANY_DEPENDENT);
    }

    /**
     * 重置 「公司依赖」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetCompanyDependent() {
        this._reset(FIELD_COMPANY_DEPENDENT);
        return this;
    }

    /**
     * 设置「全名」
     * @param val
     */
    @JsonProperty(FIELD_COMPLETE_NAME)
    public IrModelFieldsDTO setCompleteName(String val) {
        this._set(FIELD_COMPLETE_NAME, val);
        return this;
    }

    /**
     * 获取「全名」值
     *
     */
    @JsonIgnore
    public String getCompleteName() {
        return DataTypeUtils.asString(this._get(FIELD_COMPLETE_NAME), null);
    }

    /**
     * 判断 「全名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompleteName() {
        return this._contains(FIELD_COMPLETE_NAME);
    }

    /**
     * 重置 「全名」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetCompleteName() {
        this._reset(FIELD_COMPLETE_NAME);
        return this;
    }

    /**
     * 设置「计算」
     * @param val
     */
    @JsonProperty(FIELD_COMPUTE)
    public IrModelFieldsDTO setCompute(String val) {
        this._set(FIELD_COMPUTE, val);
        return this;
    }

    /**
     * 获取「计算」值
     *
     */
    @JsonIgnore
    public String getCompute() {
        return DataTypeUtils.asString(this._get(FIELD_COMPUTE), null);
    }

    /**
     * 判断 「计算」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompute() {
        return this._contains(FIELD_COMPUTE);
    }

    /**
     * 重置 「计算」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetCompute() {
        this._reset(FIELD_COMPUTE);
        return this;
    }

    /**
     * 设置「可复制」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_COPIED)
    public IrModelFieldsDTO setCopied(Integer val) {
        this._set(FIELD_COPIED, val);
        return this;
    }

    /**
     * 获取「可复制」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCopied() {
        return DataTypeUtils.asInteger(this._get(FIELD_COPIED), null);
    }

    /**
     * 判断 「可复制」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCopied() {
        return this._contains(FIELD_COPIED);
    }

    /**
     * 重置 「可复制」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetCopied() {
        this._reset(FIELD_COPIED);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrModelFieldsDTO setCreateDate(Timestamp val) {
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
    public IrModelFieldsDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrModelFieldsDTO setCreateUid(String val) {
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
    public IrModelFieldsDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「币别字段」
     * @param val
     */
    @JsonProperty(FIELD_CURRENCY_FIELD)
    public IrModelFieldsDTO setCurrencyField(String val) {
        this._set(FIELD_CURRENCY_FIELD, val);
        return this;
    }

    /**
     * 获取「币别字段」值
     *
     */
    @JsonIgnore
    public String getCurrencyField() {
        return DataTypeUtils.asString(this._get(FIELD_CURRENCY_FIELD), null);
    }

    /**
     * 判断 「币别字段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCurrencyField() {
        return this._contains(FIELD_CURRENCY_FIELD);
    }

    /**
     * 重置 「币别字段」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetCurrencyField() {
        this._reset(FIELD_CURRENCY_FIELD);
        return this;
    }

    /**
     * 设置「依赖于」
     * @param val
     */
    @JsonProperty(FIELD_DEPENDS)
    public IrModelFieldsDTO setDepends(String val) {
        this._set(FIELD_DEPENDS, val);
        return this;
    }

    /**
     * 获取「依赖于」值
     *
     */
    @JsonIgnore
    public String getDepends() {
        return DataTypeUtils.asString(this._get(FIELD_DEPENDS), null);
    }

    /**
     * 判断 「依赖于」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDepends() {
        return this._contains(FIELD_DEPENDS);
    }

    /**
     * 重置 「依赖于」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetDepends() {
        this._reset(FIELD_DEPENDS);
        return this;
    }

    /**
     * 设置「域名」
     * @param val
     */
    @JsonProperty(FIELD_DOMAIN)
    public IrModelFieldsDTO setDomain(String val) {
        this._set(FIELD_DOMAIN, val);
        return this;
    }

    /**
     * 获取「域名」值
     *
     */
    @JsonIgnore
    public String getDomain() {
        return DataTypeUtils.asString(this._get(FIELD_DOMAIN), null);
    }

    /**
     * 判断 「域名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDomain() {
        return this._contains(FIELD_DOMAIN);
    }

    /**
     * 重置 「域名」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetDomain() {
        this._reset(FIELD_DOMAIN);
        return this;
    }

    /**
     * 设置「字段标签」
     * @param val
     */
    @JsonProperty(FIELD_FIELD_DESCRIPTION)
    public IrModelFieldsDTO setFieldDescription(String val) {
        this._set(FIELD_FIELD_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「字段标签」值
     *
     */
    @JsonIgnore
    public String getFieldDescription() {
        return DataTypeUtils.asString(this._get(FIELD_FIELD_DESCRIPTION), null);
    }

    /**
     * 判断 「字段标签」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFieldDescription() {
        return this._contains(FIELD_FIELD_DESCRIPTION);
    }

    /**
     * 重置 「字段标签」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetFieldDescription() {
        this._reset(FIELD_FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「扩展组别」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_EXPAND)
    public IrModelFieldsDTO setGroupExpand(Integer val) {
        this._set(FIELD_GROUP_EXPAND, val);
        return this;
    }

    /**
     * 获取「扩展组别」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupExpand() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_EXPAND), null);
    }

    /**
     * 判断 「扩展组别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupExpand() {
        return this._contains(FIELD_GROUP_EXPAND);
    }

    /**
     * 重置 「扩展组别」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetGroupExpand() {
        this._reset(FIELD_GROUP_EXPAND);
        return this;
    }

    /**
     * 设置「字段帮助」
     * @param val
     */
    @JsonProperty(FIELD_HELP)
    public IrModelFieldsDTO setHelp(String val) {
        this._set(FIELD_HELP, val);
        return this;
    }

    /**
     * 获取「字段帮助」值
     *
     */
    @JsonIgnore
    public String getHelp() {
        return DataTypeUtils.asString(this._get(FIELD_HELP), null);
    }

    /**
     * 判断 「字段帮助」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHelp() {
        return this._contains(FIELD_HELP);
    }

    /**
     * 重置 「字段帮助」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetHelp() {
        this._reset(FIELD_HELP);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrModelFieldsDTO setId(String val) {
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
    public IrModelFieldsDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「索引」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_INDEX)
    public IrModelFieldsDTO setIndex(Integer val) {
        this._set(FIELD_INDEX, val);
        return this;
    }

    /**
     * 获取「索引」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIndex() {
        return DataTypeUtils.asInteger(this._get(FIELD_INDEX), null);
    }

    /**
     * 判断 「索引」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIndex() {
        return this._contains(FIELD_INDEX);
    }

    /**
     * 重置 「索引」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetIndex() {
        this._reset(FIELD_INDEX);
        return this;
    }

    /**
     * 设置「模型名称」
     * @param val
     */
    @JsonProperty(FIELD_MODEL)
    public IrModelFieldsDTO setModel(String val) {
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
    public IrModelFieldsDTO resetModel() {
        this._reset(FIELD_MODEL);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrModelFieldsDTO setName(String val) {
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
    public IrModelFieldsDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「关于删除」
     * 代码表[关于删除]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_model_fields_on_delete
     * @param val
     */
    @JsonProperty(FIELD_ON_DELETE)
    public IrModelFieldsDTO setOnDelete(String val) {
        this._set(FIELD_ON_DELETE, val);
        return this;
    }

    /**
     * 获取「关于删除」值
     * 代码表[关于删除]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_model_fields_on_delete
     *
     */
    @JsonIgnore
    public String getOnDelete() {
        return DataTypeUtils.asString(this._get(FIELD_ON_DELETE), null);
    }

    /**
     * 判断 「关于删除」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOnDelete() {
        return this._contains(FIELD_ON_DELETE);
    }

    /**
     * 重置 「关于删除」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetOnDelete() {
        this._reset(FIELD_ON_DELETE);
        return this;
    }

    /**
     * 设置「只读」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_READONLY)
    public IrModelFieldsDTO setReadonly(Integer val) {
        this._set(FIELD_READONLY, val);
        return this;
    }

    /**
     * 获取「只读」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getReadonly() {
        return DataTypeUtils.asInteger(this._get(FIELD_READONLY), null);
    }

    /**
     * 判断 「只读」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReadonly() {
        return this._contains(FIELD_READONLY);
    }

    /**
     * 重置 「只读」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetReadonly() {
        this._reset(FIELD_READONLY);
        return this;
    }

    /**
     * 设置「关联的字段」
     * @param val
     */
    @JsonProperty(FIELD_RELATED)
    public IrModelFieldsDTO setRelated(String val) {
        this._set(FIELD_RELATED, val);
        return this;
    }

    /**
     * 获取「关联的字段」值
     *
     */
    @JsonIgnore
    public String getRelated() {
        return DataTypeUtils.asString(this._get(FIELD_RELATED), null);
    }

    /**
     * 判断 「关联的字段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRelated() {
        return this._contains(FIELD_RELATED);
    }

    /**
     * 重置 「关联的字段」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetRelated() {
        this._reset(FIELD_RELATED);
        return this;
    }

    /**
     * 设置「关联的模型」
     * @param val
     */
    @JsonProperty(FIELD_RELATION)
    public IrModelFieldsDTO setRelation(String val) {
        this._set(FIELD_RELATION, val);
        return this;
    }

    /**
     * 获取「关联的模型」值
     *
     */
    @JsonIgnore
    public String getRelation() {
        return DataTypeUtils.asString(this._get(FIELD_RELATION), null);
    }

    /**
     * 判断 「关联的模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRelation() {
        return this._contains(FIELD_RELATION);
    }

    /**
     * 重置 「关联的模型」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetRelation() {
        this._reset(FIELD_RELATION);
        return this;
    }

    /**
     * 设置「关联字段」
     * @param val
     */
    @JsonProperty(FIELD_RELATION_FIELD)
    public IrModelFieldsDTO setRelationField(String val) {
        this._set(FIELD_RELATION_FIELD, val);
        return this;
    }

    /**
     * 获取「关联字段」值
     *
     */
    @JsonIgnore
    public String getRelationField() {
        return DataTypeUtils.asString(this._get(FIELD_RELATION_FIELD), null);
    }

    /**
     * 判断 「关联字段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRelationField() {
        return this._contains(FIELD_RELATION_FIELD);
    }

    /**
     * 重置 「关联字段」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetRelationField() {
        this._reset(FIELD_RELATION_FIELD);
        return this;
    }

    /**
     * 设置「关系表」
     * @param val
     */
    @JsonProperty(FIELD_RELATION_TABLE)
    public IrModelFieldsDTO setRelationTable(String val) {
        this._set(FIELD_RELATION_TABLE, val);
        return this;
    }

    /**
     * 获取「关系表」值
     *
     */
    @JsonIgnore
    public String getRelationTable() {
        return DataTypeUtils.asString(this._get(FIELD_RELATION_TABLE), null);
    }

    /**
     * 判断 「关系表」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRelationTable() {
        return this._contains(FIELD_RELATION_TABLE);
    }

    /**
     * 重置 「关系表」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetRelationTable() {
        this._reset(FIELD_RELATION_TABLE);
        return this;
    }

    /**
     * 设置「必填」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_REQUIRED)
    public IrModelFieldsDTO setRequired(Integer val) {
        this._set(FIELD_REQUIRED, val);
        return this;
    }

    /**
     * 获取「必填」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getRequired() {
        return DataTypeUtils.asInteger(this._get(FIELD_REQUIRED), null);
    }

    /**
     * 判断 「必填」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRequired() {
        return this._contains(FIELD_REQUIRED);
    }

    /**
     * 重置 「必填」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetRequired() {
        this._reset(FIELD_REQUIRED);
        return this;
    }

    /**
     * 设置「净化 HTML」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SANITIZE)
    public IrModelFieldsDTO setSanitize(Integer val) {
        this._set(FIELD_SANITIZE, val);
        return this;
    }

    /**
     * 获取「净化 HTML」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSanitize() {
        return DataTypeUtils.asInteger(this._get(FIELD_SANITIZE), null);
    }

    /**
     * 判断 「净化 HTML」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSanitize() {
        return this._contains(FIELD_SANITIZE);
    }

    /**
     * 重置 「净化 HTML」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetSanitize() {
        this._reset(FIELD_SANITIZE);
        return this;
    }

    /**
     * 设置「净化 HTML 属性」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SANITIZE_ATTRIBUTES)
    public IrModelFieldsDTO setSanitizeAttributes(Integer val) {
        this._set(FIELD_SANITIZE_ATTRIBUTES, val);
        return this;
    }

    /**
     * 获取「净化 HTML 属性」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSanitizeAttributes() {
        return DataTypeUtils.asInteger(this._get(FIELD_SANITIZE_ATTRIBUTES), null);
    }

    /**
     * 判断 「净化 HTML 属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSanitizeAttributes() {
        return this._contains(FIELD_SANITIZE_ATTRIBUTES);
    }

    /**
     * 重置 「净化 HTML 属性」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetSanitizeAttributes() {
        this._reset(FIELD_SANITIZE_ATTRIBUTES);
        return this;
    }

    /**
     * 设置「净化 HTML 表格」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SANITIZE_FORM)
    public IrModelFieldsDTO setSanitizeForm(Integer val) {
        this._set(FIELD_SANITIZE_FORM, val);
        return this;
    }

    /**
     * 获取「净化 HTML 表格」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSanitizeForm() {
        return DataTypeUtils.asInteger(this._get(FIELD_SANITIZE_FORM), null);
    }

    /**
     * 判断 「净化 HTML 表格」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSanitizeForm() {
        return this._contains(FIELD_SANITIZE_FORM);
    }

    /**
     * 重置 「净化 HTML 表格」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetSanitizeForm() {
        this._reset(FIELD_SANITIZE_FORM);
        return this;
    }

    /**
     * 设置「可重写消毒 HTML」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SANITIZE_OVERRIDABLE)
    public IrModelFieldsDTO setSanitizeOverridable(Integer val) {
        this._set(FIELD_SANITIZE_OVERRIDABLE, val);
        return this;
    }

    /**
     * 获取「可重写消毒 HTML」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSanitizeOverridable() {
        return DataTypeUtils.asInteger(this._get(FIELD_SANITIZE_OVERRIDABLE), null);
    }

    /**
     * 判断 「可重写消毒 HTML」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSanitizeOverridable() {
        return this._contains(FIELD_SANITIZE_OVERRIDABLE);
    }

    /**
     * 重置 「可重写消毒 HTML」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetSanitizeOverridable() {
        this._reset(FIELD_SANITIZE_OVERRIDABLE);
        return this;
    }

    /**
     * 设置「净化 HTML 样式」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SANITIZE_STYLE)
    public IrModelFieldsDTO setSanitizeStyle(Integer val) {
        this._set(FIELD_SANITIZE_STYLE, val);
        return this;
    }

    /**
     * 获取「净化 HTML 样式」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSanitizeStyle() {
        return DataTypeUtils.asInteger(this._get(FIELD_SANITIZE_STYLE), null);
    }

    /**
     * 判断 「净化 HTML 样式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSanitizeStyle() {
        return this._contains(FIELD_SANITIZE_STYLE);
    }

    /**
     * 重置 「净化 HTML 样式」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetSanitizeStyle() {
        this._reset(FIELD_SANITIZE_STYLE);
        return this;
    }

    /**
     * 设置「清除 HTML 标记」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SANITIZE_TAGS)
    public IrModelFieldsDTO setSanitizeTags(Integer val) {
        this._set(FIELD_SANITIZE_TAGS, val);
        return this;
    }

    /**
     * 获取「清除 HTML 标记」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSanitizeTags() {
        return DataTypeUtils.asInteger(this._get(FIELD_SANITIZE_TAGS), null);
    }

    /**
     * 判断 「清除 HTML 标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSanitizeTags() {
        return this._contains(FIELD_SANITIZE_TAGS);
    }

    /**
     * 重置 「清除 HTML 标记」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetSanitizeTags() {
        this._reset(FIELD_SANITIZE_TAGS);
        return this;
    }

    /**
     * 设置「可选择」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SELECTABLE)
    public IrModelFieldsDTO setSelectable(Integer val) {
        this._set(FIELD_SELECTABLE, val);
        return this;
    }

    /**
     * 获取「可选择」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSelectable() {
        return DataTypeUtils.asInteger(this._get(FIELD_SELECTABLE), null);
    }

    /**
     * 判断 「可选择」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSelectable() {
        return this._contains(FIELD_SELECTABLE);
    }

    /**
     * 重置 「可选择」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetSelectable() {
        this._reset(FIELD_SELECTABLE);
        return this;
    }

    /**
     * 设置「大小」
     * @param val
     */
    @JsonProperty(FIELD_SIZE)
    public IrModelFieldsDTO setSize(Integer val) {
        this._set(FIELD_SIZE, val);
        return this;
    }

    /**
     * 获取「大小」值
     *
     */
    @JsonIgnore
    public Integer getSize() {
        return DataTypeUtils.asInteger(this._get(FIELD_SIZE), null);
    }

    /**
     * 判断 「大小」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSize() {
        return this._contains(FIELD_SIZE);
    }

    /**
     * 重置 「大小」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetSize() {
        this._reset(FIELD_SIZE);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_model_fields_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public IrModelFieldsDTO setState(String val) {
        this._set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「类型」值
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_model_fields_state
     *
     */
    @JsonIgnore
    public String getState() {
        return DataTypeUtils.asString(this._get(FIELD_STATE), null);
    }

    /**
     * 判断 「类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsState() {
        return this._contains(FIELD_STATE);
    }

    /**
     * 重置 「类型」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「存储」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_STORE)
    public IrModelFieldsDTO setStore(Integer val) {
        this._set(FIELD_STORE, val);
        return this;
    }

    /**
     * 获取「存储」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getStore() {
        return DataTypeUtils.asInteger(this._get(FIELD_STORE), null);
    }

    /**
     * 判断 「存储」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStore() {
        return this._contains(FIELD_STORE);
    }

    /**
     * 重置 「存储」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetStore() {
        this._reset(FIELD_STORE);
        return this;
    }

    /**
     * 设置「剥离类属性」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_STRIP_CLASSES)
    public IrModelFieldsDTO setStripClasses(Integer val) {
        this._set(FIELD_STRIP_CLASSES, val);
        return this;
    }

    /**
     * 获取「剥离类属性」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getStripClasses() {
        return DataTypeUtils.asInteger(this._get(FIELD_STRIP_CLASSES), null);
    }

    /**
     * 判断 「剥离类属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStripClasses() {
        return this._contains(FIELD_STRIP_CLASSES);
    }

    /**
     * 重置 「剥离类属性」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetStripClasses() {
        this._reset(FIELD_STRIP_CLASSES);
        return this;
    }

    /**
     * 设置「带状样式属性」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_STRIP_STYLE)
    public IrModelFieldsDTO setStripStyle(Integer val) {
        this._set(FIELD_STRIP_STYLE, val);
        return this;
    }

    /**
     * 获取「带状样式属性」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getStripStyle() {
        return DataTypeUtils.asInteger(this._get(FIELD_STRIP_STYLE), null);
    }

    /**
     * 判断 「带状样式属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStripStyle() {
        return this._contains(FIELD_STRIP_STYLE);
    }

    /**
     * 重置 「带状样式属性」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetStripStyle() {
        this._reset(FIELD_STRIP_STYLE);
        return this;
    }

    /**
     * 设置「启用跟踪」
     * @param val
     */
    @JsonProperty(FIELD_TRACKING)
    public IrModelFieldsDTO setTracking(Integer val) {
        this._set(FIELD_TRACKING, val);
        return this;
    }

    /**
     * 获取「启用跟踪」值
     *
     */
    @JsonIgnore
    public Integer getTracking() {
        return DataTypeUtils.asInteger(this._get(FIELD_TRACKING), null);
    }

    /**
     * 判断 「启用跟踪」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTracking() {
        return this._contains(FIELD_TRACKING);
    }

    /**
     * 重置 「启用跟踪」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetTracking() {
        this._reset(FIELD_TRACKING);
        return this;
    }

    /**
     * 设置「可翻译」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_TRANSLATE)
    public IrModelFieldsDTO setTranslate(Integer val) {
        this._set(FIELD_TRANSLATE, val);
        return this;
    }

    /**
     * 获取「可翻译」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getTranslate() {
        return DataTypeUtils.asInteger(this._get(FIELD_TRANSLATE), null);
    }

    /**
     * 判断 「可翻译」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTranslate() {
        return this._contains(FIELD_TRANSLATE);
    }

    /**
     * 重置 「可翻译」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetTranslate() {
        this._reset(FIELD_TRANSLATE);
        return this;
    }

    /**
     * 设置「字段类型」
     * 代码表[字段类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_model_fields_ttype
     * @param val
     */
    @JsonProperty(FIELD_TTYPE)
    public IrModelFieldsDTO setTtype(String val) {
        this._set(FIELD_TTYPE, val);
        return this;
    }

    /**
     * 获取「字段类型」值
     * 代码表[字段类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_model_fields_ttype
     *
     */
    @JsonIgnore
    public String getTtype() {
        return DataTypeUtils.asString(this._get(FIELD_TTYPE), null);
    }

    /**
     * 判断 「字段类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTtype() {
        return this._contains(FIELD_TTYPE);
    }

    /**
     * 重置 「字段类型」
     *
     */
    @JsonIgnore
    public IrModelFieldsDTO resetTtype() {
        this._reset(FIELD_TTYPE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrModelFieldsDTO setWriteDate(Timestamp val) {
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
    public IrModelFieldsDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrModelFieldsDTO setWriteUid(String val) {
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
    public IrModelFieldsDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
