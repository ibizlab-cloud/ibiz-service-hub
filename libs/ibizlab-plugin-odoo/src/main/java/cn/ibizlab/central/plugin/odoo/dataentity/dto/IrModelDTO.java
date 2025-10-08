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


public class IrModelDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

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
     * 属性: 信息
     */
    public final static String FIELD_INFO = "info";

    /**
     * 属性: 有邮件活动
     */
    public final static String FIELD_IS_MAIL_ACTIVITY = "is_mail_activity";

    /**
     * 属性: 有邮件黑名单
     */
    public final static String FIELD_IS_MAIL_BLACKLIST = "is_mail_blacklist";

    /**
     * 属性: 有邮件会话
     */
    public final static String FIELD_IS_MAIL_THREAD = "is_mail_thread";

    /**
     * 属性: 模型
     */
    public final static String FIELD_MODEL = "model";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 排序
     */
    public final static String FIELD_ORDER = "order";

    /**
     * 属性: 类型
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 瞬态模型
     */
    public final static String FIELD_TRANSIENT = "transient";

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
    public IrModelDTO setCreateDate(Timestamp val) {
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
    public IrModelDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrModelDTO setCreateUid(String val) {
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
    public IrModelDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrModelDTO setId(String val) {
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
    public IrModelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「信息」
     * @param val
     */
    @JsonProperty(FIELD_INFO)
    public IrModelDTO setInfo(String val) {
        this._set(FIELD_INFO, val);
        return this;
    }

    /**
     * 获取「信息」值
     *
     */
    @JsonIgnore
    public String getInfo() {
        return DataTypeUtils.asString(this._get(FIELD_INFO), null);
    }

    /**
     * 判断 「信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInfo() {
        return this._contains(FIELD_INFO);
    }

    /**
     * 重置 「信息」
     *
     */
    @JsonIgnore
    public IrModelDTO resetInfo() {
        this._reset(FIELD_INFO);
        return this;
    }

    /**
     * 设置「有邮件活动」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_MAIL_ACTIVITY)
    public IrModelDTO setIsMailActivity(Integer val) {
        this._set(FIELD_IS_MAIL_ACTIVITY, val);
        return this;
    }

    /**
     * 获取「有邮件活动」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsMailActivity() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_MAIL_ACTIVITY), null);
    }

    /**
     * 判断 「有邮件活动」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsMailActivity() {
        return this._contains(FIELD_IS_MAIL_ACTIVITY);
    }

    /**
     * 重置 「有邮件活动」
     *
     */
    @JsonIgnore
    public IrModelDTO resetIsMailActivity() {
        this._reset(FIELD_IS_MAIL_ACTIVITY);
        return this;
    }

    /**
     * 设置「有邮件黑名单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_MAIL_BLACKLIST)
    public IrModelDTO setIsMailBlacklist(Integer val) {
        this._set(FIELD_IS_MAIL_BLACKLIST, val);
        return this;
    }

    /**
     * 获取「有邮件黑名单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsMailBlacklist() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_MAIL_BLACKLIST), null);
    }

    /**
     * 判断 「有邮件黑名单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsMailBlacklist() {
        return this._contains(FIELD_IS_MAIL_BLACKLIST);
    }

    /**
     * 重置 「有邮件黑名单」
     *
     */
    @JsonIgnore
    public IrModelDTO resetIsMailBlacklist() {
        this._reset(FIELD_IS_MAIL_BLACKLIST);
        return this;
    }

    /**
     * 设置「有邮件会话」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_MAIL_THREAD)
    public IrModelDTO setIsMailThread(Integer val) {
        this._set(FIELD_IS_MAIL_THREAD, val);
        return this;
    }

    /**
     * 获取「有邮件会话」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsMailThread() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_MAIL_THREAD), null);
    }

    /**
     * 判断 「有邮件会话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsMailThread() {
        return this._contains(FIELD_IS_MAIL_THREAD);
    }

    /**
     * 重置 「有邮件会话」
     *
     */
    @JsonIgnore
    public IrModelDTO resetIsMailThread() {
        this._reset(FIELD_IS_MAIL_THREAD);
        return this;
    }

    /**
     * 设置「模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL)
    public IrModelDTO setModel(String val) {
        this._set(FIELD_MODEL, val);
        return this;
    }

    /**
     * 获取「模型」值
     *
     */
    @JsonIgnore
    public String getModel() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL), null);
    }

    /**
     * 判断 「模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModel() {
        return this._contains(FIELD_MODEL);
    }

    /**
     * 重置 「模型」
     *
     */
    @JsonIgnore
    public IrModelDTO resetModel() {
        this._reset(FIELD_MODEL);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrModelDTO setName(String val) {
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
    public IrModelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「排序」
     * @param val
     */
    @JsonProperty(FIELD_ORDER)
    public IrModelDTO setOrder(String val) {
        this._set(FIELD_ORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
     */
    @JsonIgnore
    public String getOrder() {
        return DataTypeUtils.asString(this._get(FIELD_ORDER), null);
    }

    /**
     * 判断 「排序」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOrder() {
        return this._contains(FIELD_ORDER);
    }

    /**
     * 重置 「排序」
     *
     */
    @JsonIgnore
    public IrModelDTO resetOrder() {
        this._reset(FIELD_ORDER);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_model_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public IrModelDTO setState(String val) {
        this._set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「类型」值
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_model_state
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
    public IrModelDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「瞬态模型」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_TRANSIENT)
    public IrModelDTO setTransient(Integer val) {
        this._set(FIELD_TRANSIENT, val);
        return this;
    }

    /**
     * 获取「瞬态模型」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getTransient() {
        return DataTypeUtils.asInteger(this._get(FIELD_TRANSIENT), null);
    }

    /**
     * 判断 「瞬态模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTransient() {
        return this._contains(FIELD_TRANSIENT);
    }

    /**
     * 重置 「瞬态模型」
     *
     */
    @JsonIgnore
    public IrModelDTO resetTransient() {
        this._reset(FIELD_TRANSIENT);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrModelDTO setWriteDate(Timestamp val) {
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
    public IrModelDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrModelDTO setWriteUid(String val) {
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
    public IrModelDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
