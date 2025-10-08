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


public class CloudProxyOrganizationDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 机构编号
     */
    public final static String FIELD_ORGANIZATION_NUMBER = "organization_number";

    /**
     * 属性: 描述
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 简称
     */
    public final static String FIELD_SHORT_NAME = "short_name";

    /**
     * 属性: 排序
     */
    public final static String FIELD_SORT = "sort";

    /**
     * 属性: 父标识
     */
    public final static String FIELD_PID = "pid";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 名称
     */
    public final static String FIELD_PNAME = "pname";

    /**
     * 设置「机构编号」
     * @param val
     */
    @JsonProperty(FIELD_ORGANIZATION_NUMBER)
    public CloudProxyOrganizationDTO setOrganizationNumber(String val) {
        this._set(FIELD_ORGANIZATION_NUMBER, val);
        return this;
    }

    /**
     * 获取「机构编号」值
     *
     */
    @JsonIgnore
    public String getOrganizationNumber() {
        return DataTypeUtils.asString(this._get(FIELD_ORGANIZATION_NUMBER), null);
    }

    /**
     * 判断 「机构编号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOrganizationNumber() {
        return this._contains(FIELD_ORGANIZATION_NUMBER);
    }

    /**
     * 重置 「机构编号」
     *
     */
    @JsonIgnore
    public CloudProxyOrganizationDTO resetOrganizationNumber() {
        this._reset(FIELD_ORGANIZATION_NUMBER);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public CloudProxyOrganizationDTO setDescription(String val) {
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
    public CloudProxyOrganizationDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「简称」
     * @param val
     */
    @JsonProperty(FIELD_SHORT_NAME)
    public CloudProxyOrganizationDTO setShortName(String val) {
        this._set(FIELD_SHORT_NAME, val);
        return this;
    }

    /**
     * 获取「简称」值
     *
     */
    @JsonIgnore
    public String getShortName() {
        return DataTypeUtils.asString(this._get(FIELD_SHORT_NAME), null);
    }

    /**
     * 判断 「简称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShortName() {
        return this._contains(FIELD_SHORT_NAME);
    }

    /**
     * 重置 「简称」
     *
     */
    @JsonIgnore
    public CloudProxyOrganizationDTO resetShortName() {
        this._reset(FIELD_SHORT_NAME);
        return this;
    }

    /**
     * 设置「排序」
     * @param val
     */
    @JsonProperty(FIELD_SORT)
    public CloudProxyOrganizationDTO setSort(BigInteger val) {
        this._set(FIELD_SORT, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
     */
    @JsonIgnore
    public BigInteger getSort() {
        return DataTypeUtils.asBigInteger(this._get(FIELD_SORT), null);
    }

    /**
     * 判断 「排序」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSort() {
        return this._contains(FIELD_SORT);
    }

    /**
     * 重置 「排序」
     *
     */
    @JsonIgnore
    public CloudProxyOrganizationDTO resetSort() {
        this._reset(FIELD_SORT);
        return this;
    }

    /**
     * 设置「父标识」
     * @param val
     */
    @JsonProperty(FIELD_PID)
    public CloudProxyOrganizationDTO setPid(String val) {
        this._set(FIELD_PID, val);
        return this;
    }

    /**
     * 获取「父标识」值
     *
     */
    @JsonIgnore
    public String getPid() {
        return DataTypeUtils.asString(this._get(FIELD_PID), null);
    }

    /**
     * 判断 「父标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPid() {
        return this._contains(FIELD_PID);
    }

    /**
     * 重置 「父标识」
     *
     */
    @JsonIgnore
    public CloudProxyOrganizationDTO resetPid() {
        this._reset(FIELD_PID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public CloudProxyOrganizationDTO setId(String val) {
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
    public CloudProxyOrganizationDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public CloudProxyOrganizationDTO setName(String val) {
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
    public CloudProxyOrganizationDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_PNAME)
    public CloudProxyOrganizationDTO setPname(String val) {
        this._set(FIELD_PNAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getPname() {
        return DataTypeUtils.asString(this._get(FIELD_PNAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPname() {
        return this._contains(FIELD_PNAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public CloudProxyOrganizationDTO resetPname() {
        this._reset(FIELD_PNAME);
        return this;
    }

}
