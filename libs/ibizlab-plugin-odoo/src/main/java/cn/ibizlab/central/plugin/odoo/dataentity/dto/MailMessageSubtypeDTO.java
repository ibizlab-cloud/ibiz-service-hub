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


public class MailMessageSubtypeDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 默认
     */
    public final static String FIELD_DEFAULT = "default";

    /**
     * 属性: 描述
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 隐藏
     */
    public final static String FIELD_HIDDEN = "hidden";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 仅内部的
     */
    public final static String FIELD_INTERNAL = "internal";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 上级
     */
    public final static String FIELD_PARENT_ID = "parent_id";

    /**
     * 属性: 关联字段
     */
    public final static String FIELD_RELATION_FIELD = "relation_field";

    /**
     * 属性: 模型
     */
    public final static String FIELD_RES_MODEL = "res_model";

    /**
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 跟踪收件人
     */
    public final static String FIELD_TRACK_RECIPIENTS = "track_recipients";

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
    public MailMessageSubtypeDTO setCreateDate(Timestamp val) {
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
    public MailMessageSubtypeDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailMessageSubtypeDTO setCreateUid(String val) {
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
    public MailMessageSubtypeDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「默认」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT)
    public MailMessageSubtypeDTO setDefault(Integer val) {
        this._set(FIELD_DEFAULT, val);
        return this;
    }

    /**
     * 获取「默认」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDefault() {
        return DataTypeUtils.asInteger(this._get(FIELD_DEFAULT), null);
    }

    /**
     * 判断 「默认」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefault() {
        return this._contains(FIELD_DEFAULT);
    }

    /**
     * 重置 「默认」
     *
     */
    @JsonIgnore
    public MailMessageSubtypeDTO resetDefault() {
        this._reset(FIELD_DEFAULT);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public MailMessageSubtypeDTO setDescription(String val) {
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
    public MailMessageSubtypeDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailMessageSubtypeDTO setDisplayName(String val) {
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
    public MailMessageSubtypeDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「隐藏」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HIDDEN)
    public MailMessageSubtypeDTO setHidden(Integer val) {
        this._set(FIELD_HIDDEN, val);
        return this;
    }

    /**
     * 获取「隐藏」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHidden() {
        return DataTypeUtils.asInteger(this._get(FIELD_HIDDEN), null);
    }

    /**
     * 判断 「隐藏」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHidden() {
        return this._contains(FIELD_HIDDEN);
    }

    /**
     * 重置 「隐藏」
     *
     */
    @JsonIgnore
    public MailMessageSubtypeDTO resetHidden() {
        this._reset(FIELD_HIDDEN);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailMessageSubtypeDTO setId(String val) {
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
    public MailMessageSubtypeDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「仅内部的」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_INTERNAL)
    public MailMessageSubtypeDTO setInternal(Integer val) {
        this._set(FIELD_INTERNAL, val);
        return this;
    }

    /**
     * 获取「仅内部的」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getInternal() {
        return DataTypeUtils.asInteger(this._get(FIELD_INTERNAL), null);
    }

    /**
     * 判断 「仅内部的」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInternal() {
        return this._contains(FIELD_INTERNAL);
    }

    /**
     * 重置 「仅内部的」
     *
     */
    @JsonIgnore
    public MailMessageSubtypeDTO resetInternal() {
        this._reset(FIELD_INTERNAL);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailMessageSubtypeDTO setName(String val) {
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
    public MailMessageSubtypeDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「上级」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_ID)
    public MailMessageSubtypeDTO setParentId(String val) {
        this._set(FIELD_PARENT_ID, val);
        return this;
    }

    /**
     * 获取「上级」值
     *
     */
    @JsonIgnore
    public String getParentId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_ID), null);
    }

    /**
     * 判断 「上级」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentId() {
        return this._contains(FIELD_PARENT_ID);
    }

    /**
     * 重置 「上级」
     *
     */
    @JsonIgnore
    public MailMessageSubtypeDTO resetParentId() {
        this._reset(FIELD_PARENT_ID);
        return this;
    }

    /**
     * 设置「关联字段」
     * @param val
     */
    @JsonProperty(FIELD_RELATION_FIELD)
    public MailMessageSubtypeDTO setRelationField(String val) {
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
    public MailMessageSubtypeDTO resetRelationField() {
        this._reset(FIELD_RELATION_FIELD);
        return this;
    }

    /**
     * 设置「模型」
     * @param val
     */
    @JsonProperty(FIELD_RES_MODEL)
    public MailMessageSubtypeDTO setResModel(String val) {
        this._set(FIELD_RES_MODEL, val);
        return this;
    }

    /**
     * 获取「模型」值
     *
     */
    @JsonIgnore
    public String getResModel() {
        return DataTypeUtils.asString(this._get(FIELD_RES_MODEL), null);
    }

    /**
     * 判断 「模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResModel() {
        return this._contains(FIELD_RES_MODEL);
    }

    /**
     * 重置 「模型」
     *
     */
    @JsonIgnore
    public MailMessageSubtypeDTO resetResModel() {
        this._reset(FIELD_RES_MODEL);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public MailMessageSubtypeDTO setSequence(Integer val) {
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
    public MailMessageSubtypeDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「跟踪收件人」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_TRACK_RECIPIENTS)
    public MailMessageSubtypeDTO setTrackRecipients(Integer val) {
        this._set(FIELD_TRACK_RECIPIENTS, val);
        return this;
    }

    /**
     * 获取「跟踪收件人」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getTrackRecipients() {
        return DataTypeUtils.asInteger(this._get(FIELD_TRACK_RECIPIENTS), null);
    }

    /**
     * 判断 「跟踪收件人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTrackRecipients() {
        return this._contains(FIELD_TRACK_RECIPIENTS);
    }

    /**
     * 重置 「跟踪收件人」
     *
     */
    @JsonIgnore
    public MailMessageSubtypeDTO resetTrackRecipients() {
        this._reset(FIELD_TRACK_RECIPIENTS);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailMessageSubtypeDTO setWriteDate(Timestamp val) {
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
    public MailMessageSubtypeDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailMessageSubtypeDTO setWriteUid(String val) {
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
    public MailMessageSubtypeDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
