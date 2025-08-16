package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2DeploySystemDataSource extends EntityBase {

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN = "create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_TIME = "create_time";

    /**
     * 属性: 数据源标识
     */
    public final static String FIELD_DATA_SOURCE_ID = "data_source_id";

    /**
     * 属性: 部署系统标识
     */
    public final static String FIELD_DEPLOY_SYSTEM_ID = "deploy_system_id";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";

    /**
     * 属性: 更新结构
     */
    public final static String FIELD_UPDATE_SCHEMA = "update_schema";
    
    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2DeploySystemDataSource setCreateMan(String val) {
        this.set(FIELD_CREATE_MAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
     */
    @JsonIgnore
    public String getCreateMan() {
        return DataTypeUtils.asString(this.get(FIELD_CREATE_MAN), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this.contains(FIELD_CREATE_MAN);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public V2DeploySystemDataSource resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2DeploySystemDataSource setCreateTime(Timestamp val) {
        this.set(FIELD_CREATE_TIME, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateTime() {
        return DataTypeUtils.asDateTimeValue(this.get(FIELD_CREATE_TIME), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateTime() {
        return this.contains(FIELD_CREATE_TIME);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public V2DeploySystemDataSource resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「数据源标识」
     * @param val
     */
    @JsonProperty(FIELD_DATA_SOURCE_ID)
    public V2DeploySystemDataSource setDataSourceId(String val) {
        this.set(FIELD_DATA_SOURCE_ID, val);
        return this;
    }

    /**
     * 获取「数据源标识」值
     *
     */
    @JsonIgnore
    public String getDataSourceId() {
        return DataTypeUtils.asString(this.get(FIELD_DATA_SOURCE_ID), null);
    }

    /**
     * 判断 「数据源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDataSourceId() {
        return this.contains(FIELD_DATA_SOURCE_ID);
    }

    /**
     * 重置 「数据源标识」
     *
     */
    @JsonIgnore
    public V2DeploySystemDataSource resetDataSourceId() {
        this.reset(FIELD_DATA_SOURCE_ID);
        return this;
    }

    /**
     * 设置「部署系统标识」
     * @param val
     */
    @JsonProperty(FIELD_DEPLOY_SYSTEM_ID)
    public V2DeploySystemDataSource setDeploySystemId(String val) {
        this.set(FIELD_DEPLOY_SYSTEM_ID, val);
        return this;
    }

    /**
     * 获取「部署系统标识」值
     *
     */
    @JsonIgnore
    public String getDeploySystemId() {
        return DataTypeUtils.asString(this.get(FIELD_DEPLOY_SYSTEM_ID), null);
    }

    /**
     * 判断 「部署系统标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDeploySystemId() {
        return this.contains(FIELD_DEPLOY_SYSTEM_ID);
    }

    /**
     * 重置 「部署系统标识」
     *
     */
    @JsonIgnore
    public V2DeploySystemDataSource resetDeploySystemId() {
        this.reset(FIELD_DEPLOY_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2DeploySystemDataSource setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this.get(FIELD_ID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public V2DeploySystemDataSource resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2DeploySystemDataSource setName(String val) {
        this.set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this.get(FIELD_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this.contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public V2DeploySystemDataSource resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2DeploySystemDataSource setUpdateMan(String val) {
        this.set(FIELD_UPDATE_MAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
     */
    @JsonIgnore
    public String getUpdateMan() {
        return DataTypeUtils.asString(this.get(FIELD_UPDATE_MAN), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this.contains(FIELD_UPDATE_MAN);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public V2DeploySystemDataSource resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2DeploySystemDataSource setUpdateTime(Timestamp val) {
        this.set(FIELD_UPDATE_TIME, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getUpdateTime() {
        return DataTypeUtils.asDateTimeValue(this.get(FIELD_UPDATE_TIME), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateTime() {
        return this.contains(FIELD_UPDATE_TIME);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public V2DeploySystemDataSource resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }
    
    /**
     * 设置「更新结构」
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_SCHEMA)
    public V2DeploySystemDataSource setUpdateSchema(Integer val) {
        this.set(FIELD_UPDATE_SCHEMA, val);
        return this;
    }

    /**
     * 获取「更新结构」值
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUpdateSchema() {
        return DataTypeUtils.asInteger(this.get(FIELD_UPDATE_SCHEMA), null);
    }

    /**
     * 判断 「更新结构」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateSchema() {
        return this.contains(FIELD_UPDATE_SCHEMA);
    }

    /**
     * 重置 「更新结构」
     *
     */
    @JsonIgnore
    public V2DeploySystemDataSource resetUpdateSchema() {
        this.reset(FIELD_UPDATE_SCHEMA);
        return this;
    }

}
