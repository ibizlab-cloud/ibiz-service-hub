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


public class IrDefaultDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 属性标识
     */
    public final static String FIELD_FIELD_ID = "field_id";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 公司名称
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: 条件
     */
    public final static String FIELD_CONDITION = "condition";

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
     * 属性: 默认值 (JSON格式)
     */
    public final static String FIELD_JSON_VALUE = "json_value";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 用户名称
     */
    public final static String FIELD_USER_NAME = "user_name";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「属性标识」
     * @param val
     */
    @JsonProperty(FIELD_FIELD_ID)
    public IrDefaultDTO setFieldId(String val) {
        this._set(FIELD_FIELD_ID, val);
        return this;
    }

    /**
     * 获取「属性标识」值
     *
     */
    @JsonIgnore
    public String getFieldId() {
        return DataTypeUtils.asString(this._get(FIELD_FIELD_ID), null);
    }

    /**
     * 判断 「属性标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFieldId() {
        return this._contains(FIELD_FIELD_ID);
    }

    /**
     * 重置 「属性标识」
     *
     */
    @JsonIgnore
    public IrDefaultDTO resetFieldId() {
        this._reset(FIELD_FIELD_ID);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public IrDefaultDTO setCompanyId(String val) {
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
    public IrDefaultDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「公司名称」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public IrDefaultDTO setCompanyName(String val) {
        this._set(FIELD_COMPANY_NAME, val);
        return this;
    }

    /**
     * 获取「公司名称」值
     *
     */
    @JsonIgnore
    public String getCompanyName() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_NAME), null);
    }

    /**
     * 判断 「公司名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyName() {
        return this._contains(FIELD_COMPANY_NAME);
    }

    /**
     * 重置 「公司名称」
     *
     */
    @JsonIgnore
    public IrDefaultDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「条件」
     * @param val
     */
    @JsonProperty(FIELD_CONDITION)
    public IrDefaultDTO setCondition(String val) {
        this._set(FIELD_CONDITION, val);
        return this;
    }

    /**
     * 获取「条件」值
     *
     */
    @JsonIgnore
    public String getCondition() {
        return DataTypeUtils.asString(this._get(FIELD_CONDITION), null);
    }

    /**
     * 判断 「条件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCondition() {
        return this._contains(FIELD_CONDITION);
    }

    /**
     * 重置 「条件」
     *
     */
    @JsonIgnore
    public IrDefaultDTO resetCondition() {
        this._reset(FIELD_CONDITION);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrDefaultDTO setCreateDate(Timestamp val) {
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
    public IrDefaultDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrDefaultDTO setCreateUid(String val) {
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
    public IrDefaultDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrDefaultDTO setId(String val) {
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
    public IrDefaultDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「默认值 (JSON格式)」
     * @param val
     */
    @JsonProperty(FIELD_JSON_VALUE)
    public IrDefaultDTO setJsonValue(String val) {
        this._set(FIELD_JSON_VALUE, val);
        return this;
    }

    /**
     * 获取「默认值 (JSON格式)」值
     *
     */
    @JsonIgnore
    public String getJsonValue() {
        return DataTypeUtils.asString(this._get(FIELD_JSON_VALUE), null);
    }

    /**
     * 判断 「默认值 (JSON格式)」是否有值
     *
     */
    @JsonIgnore
    public boolean containsJsonValue() {
        return this._contains(FIELD_JSON_VALUE);
    }

    /**
     * 重置 「默认值 (JSON格式)」
     *
     */
    @JsonIgnore
    public IrDefaultDTO resetJsonValue() {
        this._reset(FIELD_JSON_VALUE);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public IrDefaultDTO setUserId(String val) {
        this._set(FIELD_USER_ID, val);
        return this;
    }

    /**
     * 获取「用户」值
     *
     */
    @JsonIgnore
    public String getUserId() {
        return DataTypeUtils.asString(this._get(FIELD_USER_ID), null);
    }

    /**
     * 判断 「用户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USER_ID);
    }

    /**
     * 重置 「用户」
     *
     */
    @JsonIgnore
    public IrDefaultDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「用户名称」
     * @param val
     */
    @JsonProperty(FIELD_USER_NAME)
    public IrDefaultDTO setUserName(String val) {
        this._set(FIELD_USER_NAME, val);
        return this;
    }

    /**
     * 获取「用户名称」值
     *
     */
    @JsonIgnore
    public String getUserName() {
        return DataTypeUtils.asString(this._get(FIELD_USER_NAME), null);
    }

    /**
     * 判断 「用户名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USER_NAME);
    }

    /**
     * 重置 「用户名称」
     *
     */
    @JsonIgnore
    public IrDefaultDTO resetUserName() {
        this._reset(FIELD_USER_NAME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrDefaultDTO setWriteDate(Timestamp val) {
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
    public IrDefaultDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrDefaultDTO setWriteUid(String val) {
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
    public IrDefaultDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
