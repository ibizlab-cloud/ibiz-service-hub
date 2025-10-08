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


public class AuditRecordDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 审计信息
     */
    public final static String FIELD_AUDIT_INFO = "audit_info";

    /**
     * 属性: 审计类型
     */
    public final static String FIELD_AUDIT_TYPE = "audit_type";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 访问地址
     */
    public final static String FIELD_IP_ADDRESS = "ip_address";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 对象标识
     */
    public final static String FIELD_OBJECT_ID = "object_id";

    /**
     * 属性: 对象类型
     */
    public final static String FIELD_OBJECT_TYPE = "object_type";

    /**
     * 属性: 操作人
     */
    public final static String FIELD_OP_PERSON_ID = "op_person_id";

    /**
     * 属性: 操作人
     */
    public final static String FIELD_OP_PERSON_NAME = "op_person_name";

    /**
     * 设置「审计信息」
     * @param val
     */
    @JsonProperty(FIELD_AUDIT_INFO)
    public AuditRecordDTO setAuditInfo(String val) {
        this._set(FIELD_AUDIT_INFO, val);
        return this;
    }

    /**
     * 获取「审计信息」值
     *
     */
    @JsonIgnore
    public String getAuditInfo() {
        return DataTypeUtils.asString(this._get(FIELD_AUDIT_INFO), null);
    }

    /**
     * 判断 「审计信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuditInfo() {
        return this._contains(FIELD_AUDIT_INFO);
    }

    /**
     * 重置 「审计信息」
     *
     */
    @JsonIgnore
    public AuditRecordDTO resetAuditInfo() {
        this._reset(FIELD_AUDIT_INFO);
        return this;
    }

    /**
     * 设置「审计类型」
     * @param val
     */
    @JsonProperty(FIELD_AUDIT_TYPE)
    public AuditRecordDTO setAuditType(String val) {
        this._set(FIELD_AUDIT_TYPE, val);
        return this;
    }

    /**
     * 获取「审计类型」值
     *
     */
    @JsonIgnore
    public String getAuditType() {
        return DataTypeUtils.asString(this._get(FIELD_AUDIT_TYPE), null);
    }

    /**
     * 判断 「审计类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuditType() {
        return this._contains(FIELD_AUDIT_TYPE);
    }

    /**
     * 重置 「审计类型」
     *
     */
    @JsonIgnore
    public AuditRecordDTO resetAuditType() {
        this._reset(FIELD_AUDIT_TYPE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public AuditRecordDTO setId(String val) {
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
    public AuditRecordDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「访问地址」
     * @param val
     */
    @JsonProperty(FIELD_IP_ADDRESS)
    public AuditRecordDTO setIpAddress(String val) {
        this._set(FIELD_IP_ADDRESS, val);
        return this;
    }

    /**
     * 获取「访问地址」值
     *
     */
    @JsonIgnore
    public String getIpAddress() {
        return DataTypeUtils.asString(this._get(FIELD_IP_ADDRESS), null);
    }

    /**
     * 判断 「访问地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIpAddress() {
        return this._contains(FIELD_IP_ADDRESS);
    }

    /**
     * 重置 「访问地址」
     *
     */
    @JsonIgnore
    public AuditRecordDTO resetIpAddress() {
        this._reset(FIELD_IP_ADDRESS);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public AuditRecordDTO setName(String val) {
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
    public AuditRecordDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「对象标识」
     * @param val
     */
    @JsonProperty(FIELD_OBJECT_ID)
    public AuditRecordDTO setObjectId(String val) {
        this._set(FIELD_OBJECT_ID, val);
        return this;
    }

    /**
     * 获取「对象标识」值
     *
     */
    @JsonIgnore
    public String getObjectId() {
        return DataTypeUtils.asString(this._get(FIELD_OBJECT_ID), null);
    }

    /**
     * 判断 「对象标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsObjectId() {
        return this._contains(FIELD_OBJECT_ID);
    }

    /**
     * 重置 「对象标识」
     *
     */
    @JsonIgnore
    public AuditRecordDTO resetObjectId() {
        this._reset(FIELD_OBJECT_ID);
        return this;
    }

    /**
     * 设置「对象类型」
     * @param val
     */
    @JsonProperty(FIELD_OBJECT_TYPE)
    public AuditRecordDTO setObjectType(String val) {
        this._set(FIELD_OBJECT_TYPE, val);
        return this;
    }

    /**
     * 获取「对象类型」值
     *
     */
    @JsonIgnore
    public String getObjectType() {
        return DataTypeUtils.asString(this._get(FIELD_OBJECT_TYPE), null);
    }

    /**
     * 判断 「对象类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsObjectType() {
        return this._contains(FIELD_OBJECT_TYPE);
    }

    /**
     * 重置 「对象类型」
     *
     */
    @JsonIgnore
    public AuditRecordDTO resetObjectType() {
        this._reset(FIELD_OBJECT_TYPE);
        return this;
    }

    /**
     * 设置「操作人」
     * @param val
     */
    @JsonProperty(FIELD_OP_PERSON_ID)
    public AuditRecordDTO setOpPersonId(String val) {
        this._set(FIELD_OP_PERSON_ID, val);
        return this;
    }

    /**
     * 获取「操作人」值
     *
     */
    @JsonIgnore
    public String getOpPersonId() {
        return DataTypeUtils.asString(this._get(FIELD_OP_PERSON_ID), null);
    }

    /**
     * 判断 「操作人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOpPersonId() {
        return this._contains(FIELD_OP_PERSON_ID);
    }

    /**
     * 重置 「操作人」
     *
     */
    @JsonIgnore
    public AuditRecordDTO resetOpPersonId() {
        this._reset(FIELD_OP_PERSON_ID);
        return this;
    }

    /**
     * 设置「操作人」
     * @param val
     */
    @JsonProperty(FIELD_OP_PERSON_NAME)
    public AuditRecordDTO setOpPersonName(String val) {
        this._set(FIELD_OP_PERSON_NAME, val);
        return this;
    }

    /**
     * 获取「操作人」值
     *
     */
    @JsonIgnore
    public String getOpPersonName() {
        return DataTypeUtils.asString(this._get(FIELD_OP_PERSON_NAME), null);
    }

    /**
     * 判断 「操作人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOpPersonName() {
        return this._contains(FIELD_OP_PERSON_NAME);
    }

    /**
     * 重置 「操作人」
     *
     */
    @JsonIgnore
    public AuditRecordDTO resetOpPersonName() {
        this._reset(FIELD_OP_PERSON_NAME);
        return this;
    }

}
