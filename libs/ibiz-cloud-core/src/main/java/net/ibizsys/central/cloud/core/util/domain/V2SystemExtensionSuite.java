package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2SystemExtensionSuite extends EntityBase{

	 /**
     * 属性: 扩展作用范围类型
     */
    public final static String FIELD_SCOPE_TYPE = "scope_type";

    /**
     * 属性: 范围标记
     */
    public final static String FIELD_SCOPE_TAG = "scope_tag";

    /**
     * 属性: 范围标记2
     */
    public final static String FIELD_SCOPE_TAG2 = "scope_tag2";

    /**
     * 属性: 范围标记3
     */
    public final static String FIELD_SCOPE_TAG3 = "scope_tag3";

    /**
     * 属性: 范围标记4
     */
    public final static String FIELD_SCOPE_TAG4 = "scope_tag4";

    /**
     * 属性: 扩展逻辑
     */
    public final static String FIELD_LOGICS = "logics";

    /**
     * 属性: 扩展属性
     */
    public final static String FIELD_FIELDS = "fields";

    /**
     * 属性: 流程定义
     */
    public final static String FIELD_WORKFLOW_DEFINITIONS = "workflow_definitions";

    /**
     * 属性: 工作流集合
     */
    public final static String FIELD_WORKFLOWS = "workflows";

    /**
     * 属性: 主状态集合
     */
    public final static String FIELD_MAIN_STATES = "main_states";

    /**
     * 属性: 行为附加集合
     */
    public final static String FIELD_ACTION_ATTACHES = "action_attaches";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN = "create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_TIME = "create_time";

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
     * 属性: 表单集合
     */
    public final static String FIELD_FORMS = "forms";
    
    /**
     * 属性: 通知集合
     */
    public final static String FIELD_NOTIFIES = "notifies";
    

    /**
     * 设置「扩展作用范围类型」
     * 代码表[系统扩展归属类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.system_extension_scope_type
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TYPE)
    public V2SystemExtensionSuite setScopeType(String val) {
        this.set(FIELD_SCOPE_TYPE, val);
        return this;
    }

    /**
     * 获取「扩展作用范围类型」值
     * 代码表[系统扩展归属类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.system_extension_scope_type
     *
     */
    @JsonIgnore
    public String getScopeType() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TYPE), null);
    }

    /**
     * 判断 「扩展作用范围类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeType() {
        return this.contains(FIELD_SCOPE_TYPE);
    }

    /**
     * 重置 「扩展作用范围类型」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetScopeType() {
        this.reset(FIELD_SCOPE_TYPE);
        return this;
    }

    /**
     * 设置「范围标记」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TAG)
    public V2SystemExtensionSuite setScopeTag(String val) {
        this.set(FIELD_SCOPE_TAG, val);
        return this;
    }

    /**
     * 获取「范围标记」值
     *
     */
    @JsonIgnore
    public String getScopeTag() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TAG), null);
    }

    /**
     * 判断 「范围标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeTag() {
        return this.contains(FIELD_SCOPE_TAG);
    }

    /**
     * 重置 「范围标记」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetScopeTag() {
        this.reset(FIELD_SCOPE_TAG);
        return this;
    }

    /**
     * 设置「范围标记2」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TAG2)
    public V2SystemExtensionSuite setScopeTag2(String val) {
        this.set(FIELD_SCOPE_TAG2, val);
        return this;
    }

    /**
     * 获取「范围标记2」值
     *
     */
    @JsonIgnore
    public String getScopeTag2() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TAG2), null);
    }

    /**
     * 判断 「范围标记2」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeTag2() {
        return this.contains(FIELD_SCOPE_TAG2);
    }

    /**
     * 重置 「范围标记2」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetScopeTag2() {
        this.reset(FIELD_SCOPE_TAG2);
        return this;
    }

    /**
     * 设置「范围标记3」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TAG3)
    public V2SystemExtensionSuite setScopeTag3(String val) {
        this.set(FIELD_SCOPE_TAG3, val);
        return this;
    }

    /**
     * 获取「范围标记3」值
     *
     */
    @JsonIgnore
    public String getScopeTag3() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TAG3), null);
    }

    /**
     * 判断 「范围标记3」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeTag3() {
        return this.contains(FIELD_SCOPE_TAG3);
    }

    /**
     * 重置 「范围标记3」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetScopeTag3() {
        this.reset(FIELD_SCOPE_TAG3);
        return this;
    }

    /**
     * 设置「范围标记4」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TAG4)
    public V2SystemExtensionSuite setScopeTag4(String val) {
        this.set(FIELD_SCOPE_TAG4, val);
        return this;
    }

    /**
     * 获取「范围标记4」值
     *
     */
    @JsonIgnore
    public String getScopeTag4() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TAG4), null);
    }

    /**
     * 判断 「范围标记4」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeTag4() {
        return this.contains(FIELD_SCOPE_TAG4);
    }

    /**
     * 重置 「范围标记4」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetScopeTag4() {
        this.reset(FIELD_SCOPE_TAG4);
        return this;
    }

    /**
     * 设置「扩展逻辑」
     * @param val
     */
    @JsonProperty(FIELD_LOGICS)
    public V2SystemExtensionSuite setLogics(List<V2SystemExtensionLogic> val) {
        this.set(FIELD_LOGICS, val);
        return this;
    }

    /**
     * 获取「扩展逻辑」值
     *
     */
    @JsonIgnore
    public List<V2SystemExtensionLogic> getLogics() {
        return (List<V2SystemExtensionLogic>) this.get(FIELD_LOGICS);
    }

    /**
     * 判断 「扩展逻辑」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLogics() {
        return this.contains(FIELD_LOGICS);
    }

    /**
     * 重置 「扩展逻辑」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetLogics() {
        this.reset(FIELD_LOGICS);
        return this;
    }

    /**
     * 设置「扩展属性」
     * @param val
     */
    @JsonProperty(FIELD_FIELDS)
    public V2SystemExtensionSuite setFields(List<V2SystemExtensionField> val) {
        this.set(FIELD_FIELDS, val);
        return this;
    }

    /**
     * 获取「扩展属性」值
     *
     */
    @JsonIgnore
    public List<V2SystemExtensionField> getFields() {
        return (List<V2SystemExtensionField>) this.get(FIELD_FIELDS);
    }

    /**
     * 判断 「扩展属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFields() {
        return this.contains(FIELD_FIELDS);
    }

    /**
     * 重置 「扩展属性」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetFields() {
        this.reset(FIELD_FIELDS);
        return this;
    }

    /**
     * 设置「流程定义」
     * @param val
     */
    @JsonProperty(FIELD_WORKFLOW_DEFINITIONS)
    public V2SystemExtensionSuite setWorkflowDefinitions(List<V2SystemExtensionWorkflowDefinition> val) {
        this.set(FIELD_WORKFLOW_DEFINITIONS, val);
        return this;
    }

    /**
     * 获取「流程定义」值
     *
     */
    @JsonIgnore
    public List<V2SystemExtensionWorkflowDefinition> getWorkflowDefinitions() {
        return (List<V2SystemExtensionWorkflowDefinition>) this.get(FIELD_WORKFLOW_DEFINITIONS);
    }

    /**
     * 判断 「流程定义」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkflowDefinitions() {
        return this.contains(FIELD_WORKFLOW_DEFINITIONS);
    }

    /**
     * 重置 「流程定义」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetWorkflowDefinitions() {
        this.reset(FIELD_WORKFLOW_DEFINITIONS);
        return this;
    }

    /**
     * 设置「工作流集合」
     * @param val
     */
    @JsonProperty(FIELD_WORKFLOWS)
    public V2SystemExtensionSuite setWorkflows(List<V2SystemExtensionWorkflow> val) {
        this.set(FIELD_WORKFLOWS, val);
        return this;
    }

    /**
     * 获取「工作流集合」值
     *
     */
    @JsonIgnore
    public List<V2SystemExtensionWorkflow> getWorkflows() {
        return (List<V2SystemExtensionWorkflow>) this.get(FIELD_WORKFLOWS);
    }

    /**
     * 判断 「工作流集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkflows() {
        return this.contains(FIELD_WORKFLOWS);
    }

    /**
     * 重置 「工作流集合」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetWorkflows() {
        this.reset(FIELD_WORKFLOWS);
        return this;
    }

    /**
     * 设置「主状态集合」
     * @param val
     */
    @JsonProperty(FIELD_MAIN_STATES)
    public V2SystemExtensionSuite setMainStates(List<V2SystemExtensionMainState> val) {
        this.set(FIELD_MAIN_STATES, val);
        return this;
    }

    /**
     * 获取「主状态集合」值
     *
     */
    @JsonIgnore
    public List<V2SystemExtensionMainState> getMainStates() {
        return (List<V2SystemExtensionMainState>) this.get(FIELD_MAIN_STATES);
    }

    /**
     * 判断 「主状态集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMainStates() {
        return this.contains(FIELD_MAIN_STATES);
    }

    /**
     * 重置 「主状态集合」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetMainStates() {
        this.reset(FIELD_MAIN_STATES);
        return this;
    }

    /**
     * 设置「行为附加集合」
     * @param val
     */
    @JsonProperty(FIELD_ACTION_ATTACHES)
    public V2SystemExtensionSuite setActionAttaches(List<V2SystemExtensionActionAttach> val) {
        this.set(FIELD_ACTION_ATTACHES, val);
        return this;
    }

    /**
     * 获取「行为附加集合」值
     *
     */
    @JsonIgnore
    public List<V2SystemExtensionActionAttach> getActionAttaches() {
        return (List<V2SystemExtensionActionAttach>) this.get(FIELD_ACTION_ATTACHES);
    }

    /**
     * 判断 「行为附加集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActionAttaches() {
        return this.contains(FIELD_ACTION_ATTACHES);
    }

    /**
     * 重置 「行为附加集合」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetActionAttaches() {
        this.reset(FIELD_ACTION_ATTACHES);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2SystemExtensionSuite setCreateMan(String val) {
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
    public V2SystemExtensionSuite resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2SystemExtensionSuite setCreateTime(Timestamp val) {
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
    public V2SystemExtensionSuite resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2SystemExtensionSuite setId(String val) {
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
    public V2SystemExtensionSuite resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2SystemExtensionSuite setName(String val) {
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
    public V2SystemExtensionSuite resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2SystemExtensionSuite setUpdateMan(String val) {
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
    public V2SystemExtensionSuite resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2SystemExtensionSuite setUpdateTime(Timestamp val) {
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
    public V2SystemExtensionSuite resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }

    
    /**
     * 设置「表单集合」
     * @param val
     */
    @JsonProperty(FIELD_FORMS)
    public V2SystemExtensionSuite setForms(List<V2SystemExtensionForm> val) {
        this.set(FIELD_FORMS, val);
        return this;
    }

    /**
     * 获取「表单集合」值
     *
     */
    @JsonIgnore
    public List<V2SystemExtensionForm> getForms() {
        return (List<V2SystemExtensionForm>) this.get(FIELD_FORMS);
    }

    /**
     * 判断 「表单集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsForms() {
        return this.contains(FIELD_FORMS);
    }

    /**
     * 重置 「表单集合」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetForms() {
        this.reset(FIELD_FORMS);
        return this;
    }
    
    /**
     * 设置「通知集合」
     * @param val
     */
    @JsonProperty(FIELD_NOTIFIES)
    public V2SystemExtensionSuite setNotifies(List<V2SystemExtensionNotify> val) {
        this.set(FIELD_NOTIFIES, val);
        return this;
    }

    /**
     * 获取「通知集合」值
     *
     */
    @JsonIgnore
    public List<V2SystemExtensionNotify> getNotifies() {
        return (List<V2SystemExtensionNotify>) this.get(FIELD_NOTIFIES);
    }

    /**
     * 判断 「通知集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNotifies() {
        return this.contains(FIELD_NOTIFIES);
    }

    /**
     * 重置 「通知集合」
     *
     */
    @JsonIgnore
    public V2SystemExtensionSuite resetNotifies() {
        this.reset(FIELD_NOTIFIES);
        return this;
    }
}
