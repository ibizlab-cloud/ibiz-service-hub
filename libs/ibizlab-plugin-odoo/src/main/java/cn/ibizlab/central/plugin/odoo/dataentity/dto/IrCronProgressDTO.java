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


public class IrCronProgressDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 取消激活
     */
    public final static String FIELD_DEACTIVATE = "deactivate";

    /**
     * 属性: 完成
     */
    public final static String FIELD_DONE = "done";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 剩余
     */
    public final static String FIELD_REMAINING = "remaining";

    /**
     * 属性: 计数器超时
     */
    public final static String FIELD_TIMED_OUT_COUNTER = "timed_out_counter";

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
    public IrCronProgressDTO setCreateDate(Timestamp val) {
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
    public IrCronProgressDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrCronProgressDTO setCreateUid(String val) {
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
    public IrCronProgressDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「取消激活」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DEACTIVATE)
    public IrCronProgressDTO setDeactivate(Integer val) {
        this._set(FIELD_DEACTIVATE, val);
        return this;
    }

    /**
     * 获取「取消激活」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDeactivate() {
        return DataTypeUtils.asInteger(this._get(FIELD_DEACTIVATE), null);
    }

    /**
     * 判断 「取消激活」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDeactivate() {
        return this._contains(FIELD_DEACTIVATE);
    }

    /**
     * 重置 「取消激活」
     *
     */
    @JsonIgnore
    public IrCronProgressDTO resetDeactivate() {
        this._reset(FIELD_DEACTIVATE);
        return this;
    }

    /**
     * 设置「完成」
     * @param val
     */
    @JsonProperty(FIELD_DONE)
    public IrCronProgressDTO setDone(Integer val) {
        this._set(FIELD_DONE, val);
        return this;
    }

    /**
     * 获取「完成」值
     *
     */
    @JsonIgnore
    public Integer getDone() {
        return DataTypeUtils.asInteger(this._get(FIELD_DONE), null);
    }

    /**
     * 判断 「完成」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDone() {
        return this._contains(FIELD_DONE);
    }

    /**
     * 重置 「完成」
     *
     */
    @JsonIgnore
    public IrCronProgressDTO resetDone() {
        this._reset(FIELD_DONE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrCronProgressDTO setId(String val) {
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
    public IrCronProgressDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「剩余」
     * @param val
     */
    @JsonProperty(FIELD_REMAINING)
    public IrCronProgressDTO setRemaining(Integer val) {
        this._set(FIELD_REMAINING, val);
        return this;
    }

    /**
     * 获取「剩余」值
     *
     */
    @JsonIgnore
    public Integer getRemaining() {
        return DataTypeUtils.asInteger(this._get(FIELD_REMAINING), null);
    }

    /**
     * 判断 「剩余」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRemaining() {
        return this._contains(FIELD_REMAINING);
    }

    /**
     * 重置 「剩余」
     *
     */
    @JsonIgnore
    public IrCronProgressDTO resetRemaining() {
        this._reset(FIELD_REMAINING);
        return this;
    }

    /**
     * 设置「计数器超时」
     * @param val
     */
    @JsonProperty(FIELD_TIMED_OUT_COUNTER)
    public IrCronProgressDTO setTimedOutCounter(Integer val) {
        this._set(FIELD_TIMED_OUT_COUNTER, val);
        return this;
    }

    /**
     * 获取「计数器超时」值
     *
     */
    @JsonIgnore
    public Integer getTimedOutCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_TIMED_OUT_COUNTER), null);
    }

    /**
     * 判断 「计数器超时」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTimedOutCounter() {
        return this._contains(FIELD_TIMED_OUT_COUNTER);
    }

    /**
     * 重置 「计数器超时」
     *
     */
    @JsonIgnore
    public IrCronProgressDTO resetTimedOutCounter() {
        this._reset(FIELD_TIMED_OUT_COUNTER);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrCronProgressDTO setWriteDate(Timestamp val) {
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
    public IrCronProgressDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrCronProgressDTO setWriteUid(String val) {
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
    public IrCronProgressDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
