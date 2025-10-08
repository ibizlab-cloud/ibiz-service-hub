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


public class ResourceResourceDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 电子邮件
     */
    public final static String FIELD_EMAIL = "email";

    /**
     * 属性: 电话
     */
    public final static String FIELD_PHONE = "phone";

    /**
     * 属性: 共享用户
     */
    public final static String FIELD_SHARE = "share";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 工时
     */
    public final static String FIELD_CALENDAR_ID = "calendar_id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_CALENDAR_NAME = "calendar_name";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 类型
     */
    public final static String FIELD_RESOURCE_TYPE = "resource_type";

    /**
     * 属性: 效率因子
     */
    public final static String FIELD_TIME_EFFICIENCY = "time_efficiency";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 名称
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
     * 设置「电子邮件」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL)
    public ResourceResourceDTO setEmail(String val) {
        this._set(FIELD_EMAIL, val);
        return this;
    }

    /**
     * 获取「电子邮件」值
     *
     */
    @JsonIgnore
    public String getEmail() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL), null);
    }

    /**
     * 判断 「电子邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmail() {
        return this._contains(FIELD_EMAIL);
    }

    /**
     * 重置 「电子邮件」
     *
     */
    @JsonIgnore
    public ResourceResourceDTO resetEmail() {
        this._reset(FIELD_EMAIL);
        return this;
    }

    /**
     * 设置「电话」
     * @param val
     */
    @JsonProperty(FIELD_PHONE)
    public ResourceResourceDTO setPhone(String val) {
        this._set(FIELD_PHONE, val);
        return this;
    }

    /**
     * 获取「电话」值
     *
     */
    @JsonIgnore
    public String getPhone() {
        return DataTypeUtils.asString(this._get(FIELD_PHONE), null);
    }

    /**
     * 判断 「电话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhone() {
        return this._contains(FIELD_PHONE);
    }

    /**
     * 重置 「电话」
     *
     */
    @JsonIgnore
    public ResourceResourceDTO resetPhone() {
        this._reset(FIELD_PHONE);
        return this;
    }

    /**
     * 设置「共享用户」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SHARE)
    public ResourceResourceDTO setShare(Integer val) {
        this._set(FIELD_SHARE, val);
        return this;
    }

    /**
     * 获取「共享用户」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getShare() {
        return DataTypeUtils.asInteger(this._get(FIELD_SHARE), null);
    }

    /**
     * 判断 「共享用户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShare() {
        return this._contains(FIELD_SHARE);
    }

    /**
     * 重置 「共享用户」
     *
     */
    @JsonIgnore
    public ResourceResourceDTO resetShare() {
        this._reset(FIELD_SHARE);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public ResourceResourceDTO setActive(Integer val) {
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
    public ResourceResourceDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「工时」
     * @param val
     */
    @JsonProperty(FIELD_CALENDAR_ID)
    public ResourceResourceDTO setCalendarId(String val) {
        this._set(FIELD_CALENDAR_ID, val);
        return this;
    }

    /**
     * 获取「工时」值
     *
     */
    @JsonIgnore
    public String getCalendarId() {
        return DataTypeUtils.asString(this._get(FIELD_CALENDAR_ID), null);
    }

    /**
     * 判断 「工时」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCalendarId() {
        return this._contains(FIELD_CALENDAR_ID);
    }

    /**
     * 重置 「工时」
     *
     */
    @JsonIgnore
    public ResourceResourceDTO resetCalendarId() {
        this._reset(FIELD_CALENDAR_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_CALENDAR_NAME)
    public ResourceResourceDTO setCalendarName(String val) {
        this._set(FIELD_CALENDAR_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getCalendarName() {
        return DataTypeUtils.asString(this._get(FIELD_CALENDAR_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCalendarName() {
        return this._contains(FIELD_CALENDAR_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public ResourceResourceDTO resetCalendarName() {
        this._reset(FIELD_CALENDAR_NAME);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public ResourceResourceDTO setCompanyId(String val) {
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
    public ResourceResourceDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public ResourceResourceDTO setCompanyName(String val) {
        this._set(FIELD_COMPANY_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getCompanyName() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyName() {
        return this._contains(FIELD_COMPANY_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public ResourceResourceDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResourceResourceDTO setCreateDate(Timestamp val) {
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
    public ResourceResourceDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResourceResourceDTO setCreateUid(String val) {
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
    public ResourceResourceDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResourceResourceDTO setDisplayName(String val) {
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
    public ResourceResourceDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResourceResourceDTO setId(String val) {
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
    public ResourceResourceDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResourceResourceDTO setName(String val) {
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
    public ResourceResourceDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_resource_resource_type
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_TYPE)
    public ResourceResourceDTO setResourceType(String val) {
        this._set(FIELD_RESOURCE_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.resource_resource_resource_type
     *
     */
    @JsonIgnore
    public String getResourceType() {
        return DataTypeUtils.asString(this._get(FIELD_RESOURCE_TYPE), null);
    }

    /**
     * 判断 「类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResourceType() {
        return this._contains(FIELD_RESOURCE_TYPE);
    }

    /**
     * 重置 「类型」
     *
     */
    @JsonIgnore
    public ResourceResourceDTO resetResourceType() {
        this._reset(FIELD_RESOURCE_TYPE);
        return this;
    }

    /**
     * 设置「效率因子」
     * @param val
     */
    @JsonProperty(FIELD_TIME_EFFICIENCY)
    public ResourceResourceDTO setTimeEfficiency(Double val) {
        this._set(FIELD_TIME_EFFICIENCY, val);
        return this;
    }

    /**
     * 获取「效率因子」值
     *
     */
    @JsonIgnore
    public Double getTimeEfficiency() {
        return DataTypeUtils.asDouble(this._get(FIELD_TIME_EFFICIENCY), null);
    }

    /**
     * 判断 「效率因子」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTimeEfficiency() {
        return this._contains(FIELD_TIME_EFFICIENCY);
    }

    /**
     * 重置 「效率因子」
     *
     */
    @JsonIgnore
    public ResourceResourceDTO resetTimeEfficiency() {
        this._reset(FIELD_TIME_EFFICIENCY);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public ResourceResourceDTO setUserId(String val) {
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
    public ResourceResourceDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_USER_NAME)
    public ResourceResourceDTO setUserName(String val) {
        this._set(FIELD_USER_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getUserName() {
        return DataTypeUtils.asString(this._get(FIELD_USER_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USER_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public ResourceResourceDTO resetUserName() {
        this._reset(FIELD_USER_NAME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResourceResourceDTO setWriteDate(Timestamp val) {
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
    public ResourceResourceDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResourceResourceDTO setWriteUid(String val) {
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
    public ResourceResourceDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
