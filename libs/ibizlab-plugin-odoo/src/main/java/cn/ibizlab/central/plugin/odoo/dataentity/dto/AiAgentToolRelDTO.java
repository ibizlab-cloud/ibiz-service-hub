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


public class AiAgentToolRelDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN = "create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_TIME = "create_time";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";

    /**
     * 属性: 智能体标识
     */
    public final static String FIELD_AI_AGENT_ID = "ai_agent_id";

    /**
     * 属性: AI调用工具标识
     */
    public final static String FIELD_AI_TOOL_ID = "ai_tool_id";

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public AiAgentToolRelDTO setId(String val) {
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
    public AiAgentToolRelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public AiAgentToolRelDTO setName(String val) {
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
    public AiAgentToolRelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public AiAgentToolRelDTO setCreateMan(String val) {
        this._set(FIELD_CREATE_MAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
     */
    @JsonIgnore
    public String getCreateMan() {
        return DataTypeUtils.asString(this._get(FIELD_CREATE_MAN), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATE_MAN);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public AiAgentToolRelDTO resetCreateMan() {
        this._reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public AiAgentToolRelDTO setCreateTime(Timestamp val) {
        this._set(FIELD_CREATE_TIME, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateTime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_CREATE_TIME), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateTime() {
        return this._contains(FIELD_CREATE_TIME);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public AiAgentToolRelDTO resetCreateTime() {
        this._reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public AiAgentToolRelDTO setUpdateMan(String val) {
        this._set(FIELD_UPDATE_MAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
     */
    @JsonIgnore
    public String getUpdateMan() {
        return DataTypeUtils.asString(this._get(FIELD_UPDATE_MAN), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this._contains(FIELD_UPDATE_MAN);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public AiAgentToolRelDTO resetUpdateMan() {
        this._reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public AiAgentToolRelDTO setUpdateTime(Timestamp val) {
        this._set(FIELD_UPDATE_TIME, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getUpdateTime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_UPDATE_TIME), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateTime() {
        return this._contains(FIELD_UPDATE_TIME);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public AiAgentToolRelDTO resetUpdateTime() {
        this._reset(FIELD_UPDATE_TIME);
        return this;
    }

    /**
     * 设置「智能体标识」
     * @param val
     */
    @JsonProperty(FIELD_AI_AGENT_ID)
    public AiAgentToolRelDTO setAiAgentId(String val) {
        this._set(FIELD_AI_AGENT_ID, val);
        return this;
    }

    /**
     * 获取「智能体标识」值
     *
     */
    @JsonIgnore
    public String getAiAgentId() {
        return DataTypeUtils.asString(this._get(FIELD_AI_AGENT_ID), null);
    }

    /**
     * 判断 「智能体标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAiAgentId() {
        return this._contains(FIELD_AI_AGENT_ID);
    }

    /**
     * 重置 「智能体标识」
     *
     */
    @JsonIgnore
    public AiAgentToolRelDTO resetAiAgentId() {
        this._reset(FIELD_AI_AGENT_ID);
        return this;
    }

    /**
     * 设置「AI调用工具标识」
     * @param val
     */
    @JsonProperty(FIELD_AI_TOOL_ID)
    public AiAgentToolRelDTO setAiToolId(String val) {
        this._set(FIELD_AI_TOOL_ID, val);
        return this;
    }

    /**
     * 获取「AI调用工具标识」值
     *
     */
    @JsonIgnore
    public String getAiToolId() {
        return DataTypeUtils.asString(this._get(FIELD_AI_TOOL_ID), null);
    }

    /**
     * 判断 「AI调用工具标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAiToolId() {
        return this._contains(FIELD_AI_TOOL_ID);
    }

    /**
     * 重置 「AI调用工具标识」
     *
     */
    @JsonIgnore
    public AiAgentToolRelDTO resetAiToolId() {
        this._reset(FIELD_AI_TOOL_ID);
        return this;
    }

}
