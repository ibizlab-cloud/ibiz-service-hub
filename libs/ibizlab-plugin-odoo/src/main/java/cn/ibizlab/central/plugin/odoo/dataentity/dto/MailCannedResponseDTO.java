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


public class MailCannedResponseDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 描述
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 确定当前用户是否可以编辑预制回复
     */
    public final static String FIELD_IS_EDITABLE = "is_editable";

    /**
     * 属性: 确定预设回复当前是否与其他用户共享
     */
    public final static String FIELD_IS_SHARED = "is_shared";

    /**
     * 属性: 上次使用
     */
    public final static String FIELD_LAST_USED = "last_used";

    /**
     * 属性: 快捷
     */
    public final static String FIELD_SOURCE = "source";

    /**
     * 属性: 替换
     */
    public final static String FIELD_SUBSTITUTION = "substitution";

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
    public MailCannedResponseDTO setCreateDate(Timestamp val) {
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
    public MailCannedResponseDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailCannedResponseDTO setCreateUid(String val) {
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
    public MailCannedResponseDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public MailCannedResponseDTO setDescription(String val) {
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
    public MailCannedResponseDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailCannedResponseDTO setDisplayName(String val) {
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
    public MailCannedResponseDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailCannedResponseDTO setId(String val) {
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
    public MailCannedResponseDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「确定当前用户是否可以编辑预制回复」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_EDITABLE)
    public MailCannedResponseDTO setIsEditable(Integer val) {
        this._set(FIELD_IS_EDITABLE, val);
        return this;
    }

    /**
     * 获取「确定当前用户是否可以编辑预制回复」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsEditable() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_EDITABLE), null);
    }

    /**
     * 判断 「确定当前用户是否可以编辑预制回复」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsEditable() {
        return this._contains(FIELD_IS_EDITABLE);
    }

    /**
     * 重置 「确定当前用户是否可以编辑预制回复」
     *
     */
    @JsonIgnore
    public MailCannedResponseDTO resetIsEditable() {
        this._reset(FIELD_IS_EDITABLE);
        return this;
    }

    /**
     * 设置「确定预设回复当前是否与其他用户共享」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_SHARED)
    public MailCannedResponseDTO setIsShared(Integer val) {
        this._set(FIELD_IS_SHARED, val);
        return this;
    }

    /**
     * 获取「确定预设回复当前是否与其他用户共享」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsShared() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_SHARED), null);
    }

    /**
     * 判断 「确定预设回复当前是否与其他用户共享」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsShared() {
        return this._contains(FIELD_IS_SHARED);
    }

    /**
     * 重置 「确定预设回复当前是否与其他用户共享」
     *
     */
    @JsonIgnore
    public MailCannedResponseDTO resetIsShared() {
        this._reset(FIELD_IS_SHARED);
        return this;
    }

    /**
     * 设置「上次使用」
     * @param val
     */
    @JsonProperty(FIELD_LAST_USED)
    public MailCannedResponseDTO setLastUsed(Timestamp val) {
        this._set(FIELD_LAST_USED, val);
        return this;
    }

    /**
     * 获取「上次使用」值
     *
     */
    @JsonIgnore
    public Timestamp getLastUsed() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LAST_USED), null);
    }

    /**
     * 判断 「上次使用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastUsed() {
        return this._contains(FIELD_LAST_USED);
    }

    /**
     * 重置 「上次使用」
     *
     */
    @JsonIgnore
    public MailCannedResponseDTO resetLastUsed() {
        this._reset(FIELD_LAST_USED);
        return this;
    }

    /**
     * 设置「快捷」
     * @param val
     */
    @JsonProperty(FIELD_SOURCE)
    public MailCannedResponseDTO setSource(String val) {
        this._set(FIELD_SOURCE, val);
        return this;
    }

    /**
     * 获取「快捷」值
     *
     */
    @JsonIgnore
    public String getSource() {
        return DataTypeUtils.asString(this._get(FIELD_SOURCE), null);
    }

    /**
     * 判断 「快捷」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSource() {
        return this._contains(FIELD_SOURCE);
    }

    /**
     * 重置 「快捷」
     *
     */
    @JsonIgnore
    public MailCannedResponseDTO resetSource() {
        this._reset(FIELD_SOURCE);
        return this;
    }

    /**
     * 设置「替换」
     * @param val
     */
    @JsonProperty(FIELD_SUBSTITUTION)
    public MailCannedResponseDTO setSubstitution(String val) {
        this._set(FIELD_SUBSTITUTION, val);
        return this;
    }

    /**
     * 获取「替换」值
     *
     */
    @JsonIgnore
    public String getSubstitution() {
        return DataTypeUtils.asString(this._get(FIELD_SUBSTITUTION), null);
    }

    /**
     * 判断 「替换」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSubstitution() {
        return this._contains(FIELD_SUBSTITUTION);
    }

    /**
     * 重置 「替换」
     *
     */
    @JsonIgnore
    public MailCannedResponseDTO resetSubstitution() {
        this._reset(FIELD_SUBSTITUTION);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailCannedResponseDTO setWriteDate(Timestamp val) {
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
    public MailCannedResponseDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailCannedResponseDTO setWriteUid(String val) {
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
    public MailCannedResponseDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
