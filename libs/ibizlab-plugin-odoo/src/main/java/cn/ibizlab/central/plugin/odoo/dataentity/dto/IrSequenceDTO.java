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


public class IrSequenceDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 序列类型
     */
    public final static String FIELD_CODE = "code";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

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
     * 属性: 实施策略
     */
    public final static String FIELD_IMPLEMENTATION = "implementation";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 步长
     */
    public final static String FIELD_NUMBER_INCREMENT = "number_increment";

    /**
     * 属性: 下一个编号
     */
    public final static String FIELD_NUMBER_NEXT = "number_next";

    /**
     * 属性: 序列填充长度
     */
    public final static String FIELD_PADDING = "padding";

    /**
     * 属性: 前缀
     */
    public final static String FIELD_PREFIX = "prefix";

    /**
     * 属性: 后缀
     */
    public final static String FIELD_SUFFIX = "suffix";

    /**
     * 属性: 按日期重编序列号
     */
    public final static String FIELD_USE_DATE_RANGE = "use_date_range";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public IrSequenceDTO setActive(Integer val) {
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
    public IrSequenceDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「序列类型」
     * @param val
     */
    @JsonProperty(FIELD_CODE)
    public IrSequenceDTO setCode(String val) {
        this._set(FIELD_CODE, val);
        return this;
    }

    /**
     * 获取「序列类型」值
     *
     */
    @JsonIgnore
    public String getCode() {
        return DataTypeUtils.asString(this._get(FIELD_CODE), null);
    }

    /**
     * 判断 「序列类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCode() {
        return this._contains(FIELD_CODE);
    }

    /**
     * 重置 「序列类型」
     *
     */
    @JsonIgnore
    public IrSequenceDTO resetCode() {
        this._reset(FIELD_CODE);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public IrSequenceDTO setCompanyId(String val) {
        this._set(FIELD_COMPANY_ID, val);
        return this;
    }

    /**
     * 获取「公司」值
     *
     */
    @JsonIgnore
    public String getCompanyId() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_ID), null);
    }

    /**
     * 判断 「公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyId() {
        return this._contains(FIELD_COMPANY_ID);
    }

    /**
     * 重置 「公司」
     *
     */
    @JsonIgnore
    public IrSequenceDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrSequenceDTO setCreateDate(Timestamp val) {
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
    public IrSequenceDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrSequenceDTO setCreateUid(String val) {
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
    public IrSequenceDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrSequenceDTO setId(String val) {
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
    public IrSequenceDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「实施策略」
     * 代码表[实施策略]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_sequence_implementation
     * @param val
     */
    @JsonProperty(FIELD_IMPLEMENTATION)
    public IrSequenceDTO setImplementation(String val) {
        this._set(FIELD_IMPLEMENTATION, val);
        return this;
    }

    /**
     * 获取「实施策略」值
     * 代码表[实施策略]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_sequence_implementation
     *
     */
    @JsonIgnore
    public String getImplementation() {
        return DataTypeUtils.asString(this._get(FIELD_IMPLEMENTATION), null);
    }

    /**
     * 判断 「实施策略」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImplementation() {
        return this._contains(FIELD_IMPLEMENTATION);
    }

    /**
     * 重置 「实施策略」
     *
     */
    @JsonIgnore
    public IrSequenceDTO resetImplementation() {
        this._reset(FIELD_IMPLEMENTATION);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrSequenceDTO setName(String val) {
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
    public IrSequenceDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「步长」
     * @param val
     */
    @JsonProperty(FIELD_NUMBER_INCREMENT)
    public IrSequenceDTO setNumberIncrement(Integer val) {
        this._set(FIELD_NUMBER_INCREMENT, val);
        return this;
    }

    /**
     * 获取「步长」值
     *
     */
    @JsonIgnore
    public Integer getNumberIncrement() {
        return DataTypeUtils.asInteger(this._get(FIELD_NUMBER_INCREMENT), null);
    }

    /**
     * 判断 「步长」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNumberIncrement() {
        return this._contains(FIELD_NUMBER_INCREMENT);
    }

    /**
     * 重置 「步长」
     *
     */
    @JsonIgnore
    public IrSequenceDTO resetNumberIncrement() {
        this._reset(FIELD_NUMBER_INCREMENT);
        return this;
    }

    /**
     * 设置「下一个编号」
     * @param val
     */
    @JsonProperty(FIELD_NUMBER_NEXT)
    public IrSequenceDTO setNumberNext(Integer val) {
        this._set(FIELD_NUMBER_NEXT, val);
        return this;
    }

    /**
     * 获取「下一个编号」值
     *
     */
    @JsonIgnore
    public Integer getNumberNext() {
        return DataTypeUtils.asInteger(this._get(FIELD_NUMBER_NEXT), null);
    }

    /**
     * 判断 「下一个编号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNumberNext() {
        return this._contains(FIELD_NUMBER_NEXT);
    }

    /**
     * 重置 「下一个编号」
     *
     */
    @JsonIgnore
    public IrSequenceDTO resetNumberNext() {
        this._reset(FIELD_NUMBER_NEXT);
        return this;
    }

    /**
     * 设置「序列填充长度」
     * @param val
     */
    @JsonProperty(FIELD_PADDING)
    public IrSequenceDTO setPadding(Integer val) {
        this._set(FIELD_PADDING, val);
        return this;
    }

    /**
     * 获取「序列填充长度」值
     *
     */
    @JsonIgnore
    public Integer getPadding() {
        return DataTypeUtils.asInteger(this._get(FIELD_PADDING), null);
    }

    /**
     * 判断 「序列填充长度」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPadding() {
        return this._contains(FIELD_PADDING);
    }

    /**
     * 重置 「序列填充长度」
     *
     */
    @JsonIgnore
    public IrSequenceDTO resetPadding() {
        this._reset(FIELD_PADDING);
        return this;
    }

    /**
     * 设置「前缀」
     * @param val
     */
    @JsonProperty(FIELD_PREFIX)
    public IrSequenceDTO setPrefix(String val) {
        this._set(FIELD_PREFIX, val);
        return this;
    }

    /**
     * 获取「前缀」值
     *
     */
    @JsonIgnore
    public String getPrefix() {
        return DataTypeUtils.asString(this._get(FIELD_PREFIX), null);
    }

    /**
     * 判断 「前缀」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrefix() {
        return this._contains(FIELD_PREFIX);
    }

    /**
     * 重置 「前缀」
     *
     */
    @JsonIgnore
    public IrSequenceDTO resetPrefix() {
        this._reset(FIELD_PREFIX);
        return this;
    }

    /**
     * 设置「后缀」
     * @param val
     */
    @JsonProperty(FIELD_SUFFIX)
    public IrSequenceDTO setSuffix(String val) {
        this._set(FIELD_SUFFIX, val);
        return this;
    }

    /**
     * 获取「后缀」值
     *
     */
    @JsonIgnore
    public String getSuffix() {
        return DataTypeUtils.asString(this._get(FIELD_SUFFIX), null);
    }

    /**
     * 判断 「后缀」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSuffix() {
        return this._contains(FIELD_SUFFIX);
    }

    /**
     * 重置 「后缀」
     *
     */
    @JsonIgnore
    public IrSequenceDTO resetSuffix() {
        this._reset(FIELD_SUFFIX);
        return this;
    }

    /**
     * 设置「按日期重编序列号」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_DATE_RANGE)
    public IrSequenceDTO setUseDateRange(Integer val) {
        this._set(FIELD_USE_DATE_RANGE, val);
        return this;
    }

    /**
     * 获取「按日期重编序列号」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUseDateRange() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_DATE_RANGE), null);
    }

    /**
     * 判断 「按日期重编序列号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUseDateRange() {
        return this._contains(FIELD_USE_DATE_RANGE);
    }

    /**
     * 重置 「按日期重编序列号」
     *
     */
    @JsonIgnore
    public IrSequenceDTO resetUseDateRange() {
        this._reset(FIELD_USE_DATE_RANGE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrSequenceDTO setWriteDate(Timestamp val) {
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
    public IrSequenceDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrSequenceDTO setWriteUid(String val) {
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
    public IrSequenceDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
