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


public class ResourceMixinDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 工作时间
     */
    public final static String FIELD_RESOURCE_CALENDAR_ID = "resource_calendar_id";

    /**
     * 属性: 资源
     */
    public final static String FIELD_RESOURCE_ID = "resource_id";

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResourceMixinDTO setName(String val) {
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
    public ResourceMixinDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public ResourceMixinDTO setCompanyId(String val) {
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
    public ResourceMixinDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResourceMixinDTO setId(String val) {
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
    public ResourceMixinDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「工作时间」
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_CALENDAR_ID)
    public ResourceMixinDTO setResourceCalendarId(String val) {
        this._set(FIELD_RESOURCE_CALENDAR_ID, val);
        return this;
    }

    /**
     * 获取「工作时间」值
     *
     */
    @JsonIgnore
    public String getResourceCalendarId() {
        return DataTypeUtils.asString(this._get(FIELD_RESOURCE_CALENDAR_ID), null);
    }

    /**
     * 判断 「工作时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResourceCalendarId() {
        return this._contains(FIELD_RESOURCE_CALENDAR_ID);
    }

    /**
     * 重置 「工作时间」
     *
     */
    @JsonIgnore
    public ResourceMixinDTO resetResourceCalendarId() {
        this._reset(FIELD_RESOURCE_CALENDAR_ID);
        return this;
    }

    /**
     * 设置「资源」
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_ID)
    public ResourceMixinDTO setResourceId(String val) {
        this._set(FIELD_RESOURCE_ID, val);
        return this;
    }

    /**
     * 获取「资源」值
     *
     */
    @JsonIgnore
    public String getResourceId() {
        return DataTypeUtils.asString(this._get(FIELD_RESOURCE_ID), null);
    }

    /**
     * 判断 「资源」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResourceId() {
        return this._contains(FIELD_RESOURCE_ID);
    }

    /**
     * 重置 「资源」
     *
     */
    @JsonIgnore
    public ResourceMixinDTO resetResourceId() {
        this._reset(FIELD_RESOURCE_ID);
        return this;
    }

}
