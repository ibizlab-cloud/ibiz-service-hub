package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2ServiceHubDeploySystem extends EntityBase {

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN = "create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_TIME = "create_time";

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
     * 属性: 服务集成标识
     */
    public final static String FIELD_SERVICE_HUB_ID = "service_hub_id";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2ServiceHubDeploySystem setCreateMan(String val) {
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
    public V2ServiceHubDeploySystem resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2ServiceHubDeploySystem setCreateTime(Timestamp val) {
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
    public V2ServiceHubDeploySystem resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「部署系统标识」
     * @param val
     */
    @JsonProperty(FIELD_DEPLOY_SYSTEM_ID)
    public V2ServiceHubDeploySystem setDeploySystemId(String val) {
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
    public V2ServiceHubDeploySystem resetDeploySystemId() {
        this.reset(FIELD_DEPLOY_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2ServiceHubDeploySystem setId(String val) {
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
    public V2ServiceHubDeploySystem resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2ServiceHubDeploySystem setName(String val) {
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
    public V2ServiceHubDeploySystem resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「服务集成标识」
     * @param val
     */
    @JsonProperty(FIELD_SERVICE_HUB_ID)
    public V2ServiceHubDeploySystem setServiceHubId(String val) {
        this.set(FIELD_SERVICE_HUB_ID, val);
        return this;
    }

    /**
     * 获取「服务集成标识」值
     *
     */
    @JsonIgnore
    public String getServiceHubId() {
        return DataTypeUtils.asString(this.get(FIELD_SERVICE_HUB_ID), null);
    }

    /**
     * 判断 「服务集成标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsServiceHubId() {
        return this.contains(FIELD_SERVICE_HUB_ID);
    }

    /**
     * 重置 「服务集成标识」
     *
     */
    @JsonIgnore
    public V2ServiceHubDeploySystem resetServiceHubId() {
        this.reset(FIELD_SERVICE_HUB_ID);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2ServiceHubDeploySystem setUpdateMan(String val) {
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
    public V2ServiceHubDeploySystem resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2ServiceHubDeploySystem setUpdateTime(Timestamp val) {
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
    public V2ServiceHubDeploySystem resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }

}
