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


public class AiAgentDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 智能体标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 智能体名称
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
     * 属性: 生成模式
     */
    public final static String FIELD_GENERATION_MODE = "generation_mode";

    /**
     * 属性: 模型名称
     */
    public final static String FIELD_AIMODELNAME = "aimodelname";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 模型标识
     */
    public final static String FIELD_AI_MODEL_ID = "ai_model_id";

    /**
     * 属性: 代码标识
     */
    public final static String FIELD_CODE_NAME = "code_name";

    /**
     * 属性: 自定义建议提示词
     */
    public final static String FIELD_CUSTOM_SUGGESTION_PROMPT = "custom_suggestion_prompt";

    /**
     * 属性: 默认系统提示词
     */
    public final static String FIELD_DEFAULT_SYSTEM_PROMPT = "default_system_prompt";

    /**
     * 属性: 启用问题建议
     */
    public final static String FIELD_ENABLE_SUGGESTED_QUESTIONS = "enable_suggested_questions";

    /**
     * 属性: 启用思考链
     */
    public final static String FIELD_ENABLE_THINKING = "enable_thinking";

    /**
     * 属性: 调用工具
     */
    public final static String FIELD_ENABLE_TOOLS = "enable_tools";

    /**
     * 属性: 是否默认Agent
     */
    public final static String FIELD_IS_DEFAULT = "is_default";

    /**
     * 属性: 最大输入token数
     */
    public final static String FIELD_MAX_INPUT_TOKENS = "max_input_tokens";

    /**
     * 属性: 记忆对话轮数
     */
    public final static String FIELD_MEMORY_MAX_TURNS = "memory_max_turns";

    /**
     * 属性: 记忆模式
     */
    public final static String FIELD_MEMORY_MODE = "memory_mode";

    /**
     * 属性: 排序
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 流式输出
     */
    public final static String FIELD_STREAM = "stream";

    /**
     * 属性: 模型随机性参数
     */
    public final static String FIELD_TEMPERATURE = "temperature";

    /**
     * 属性: 工具调用超限提示语
     */
    public final static String FIELD_TOOL_EXCEED_MESSAGE = "tool_exceed_message";

    /**
     * 属性: 最大工具调用次数
     */
    public final static String FIELD_TOOL_MAX_CALLS = "tool_max_calls";

    /**
     * 属性: 概率核采样
     */
    public final static String FIELD_TOP_P = "top_p";

    /**
     * 属性: 截断策略
     */
    public final static String FIELD_TRIMMING_STRATEGY = "trimming_strategy";

    /**
     * 属性: 欢迎消息模板
     */
    public final static String FIELD_WELCOME_MESSAGE = "welcome_message";

    /**
     * 属性: 预制建议问题
     */
    public final static String FIELD_WELCOME_SUGGESTED_QUESTIONS = "welcome_suggested_questions";

    /**
     * 设置「智能体标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public AiAgentDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「智能体标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this._get(FIELD_ID), null);
    }

    /**
     * 判断 「智能体标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「智能体标识」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「智能体名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public AiAgentDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「智能体名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
    }

    /**
     * 判断 「智能体名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「智能体名称」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public AiAgentDTO setCreateMan(String val) {
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
    public AiAgentDTO resetCreateMan() {
        this._reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public AiAgentDTO setCreateTime(Timestamp val) {
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
    public AiAgentDTO resetCreateTime() {
        this._reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public AiAgentDTO setUpdateMan(String val) {
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
    public AiAgentDTO resetUpdateMan() {
        this._reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public AiAgentDTO setUpdateTime(Timestamp val) {
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
    public AiAgentDTO resetUpdateTime() {
        this._reset(FIELD_UPDATE_TIME);
        return this;
    }

    /**
     * 设置「生成模式」
     * 代码表[AI生成模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ai_mode
     * @param val
     */
    @JsonProperty(FIELD_GENERATION_MODE)
    public AiAgentDTO setGenerationMode(String val) {
        this._set(FIELD_GENERATION_MODE, val);
        return this;
    }

    /**
     * 获取「生成模式」值
     * 代码表[AI生成模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ai_mode
     *
     */
    @JsonIgnore
    public String getGenerationMode() {
        return DataTypeUtils.asString(this._get(FIELD_GENERATION_MODE), null);
    }

    /**
     * 判断 「生成模式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGenerationMode() {
        return this._contains(FIELD_GENERATION_MODE);
    }

    /**
     * 重置 「生成模式」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetGenerationMode() {
        this._reset(FIELD_GENERATION_MODE);
        return this;
    }

    /**
     * 设置「模型名称」
     * @param val
     */
    @JsonProperty(FIELD_AIMODELNAME)
    public AiAgentDTO setAiModelName(String val) {
        this._set(FIELD_AIMODELNAME, val);
        return this;
    }

    /**
     * 获取「模型名称」值
     *
     */
    @JsonIgnore
    public String getAiModelName() {
        return DataTypeUtils.asString(this._get(FIELD_AIMODELNAME), null);
    }

    /**
     * 判断 「模型名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAiModelName() {
        return this._contains(FIELD_AIMODELNAME);
    }

    /**
     * 重置 「模型名称」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetAiModelName() {
        this._reset(FIELD_AIMODELNAME);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public AiAgentDTO setActive(Integer val) {
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
    public AiAgentDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「模型标识」
     * @param val
     */
    @JsonProperty(FIELD_AI_MODEL_ID)
    public AiAgentDTO setAiModelId(String val) {
        this._set(FIELD_AI_MODEL_ID, val);
        return this;
    }

    /**
     * 获取「模型标识」值
     *
     */
    @JsonIgnore
    public String getAiModelId() {
        return DataTypeUtils.asString(this._get(FIELD_AI_MODEL_ID), null);
    }

    /**
     * 判断 「模型标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAiModelId() {
        return this._contains(FIELD_AI_MODEL_ID);
    }

    /**
     * 重置 「模型标识」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetAiModelId() {
        this._reset(FIELD_AI_MODEL_ID);
        return this;
    }

    /**
     * 设置「代码标识」
     * @param val
     */
    @JsonProperty(FIELD_CODE_NAME)
    public AiAgentDTO setCodeName(String val) {
        this._set(FIELD_CODE_NAME, val);
        return this;
    }

    /**
     * 获取「代码标识」值
     *
     */
    @JsonIgnore
    public String getCodeName() {
        return DataTypeUtils.asString(this._get(FIELD_CODE_NAME), null);
    }

    /**
     * 判断 「代码标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCodeName() {
        return this._contains(FIELD_CODE_NAME);
    }

    /**
     * 重置 「代码标识」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetCodeName() {
        this._reset(FIELD_CODE_NAME);
        return this;
    }

    /**
     * 设置「自定义建议提示词」
     * @param val
     */
    @JsonProperty(FIELD_CUSTOM_SUGGESTION_PROMPT)
    public AiAgentDTO setCustomSuggestionPrompt(String val) {
        this._set(FIELD_CUSTOM_SUGGESTION_PROMPT, val);
        return this;
    }

    /**
     * 获取「自定义建议提示词」值
     *
     */
    @JsonIgnore
    public String getCustomSuggestionPrompt() {
        return DataTypeUtils.asString(this._get(FIELD_CUSTOM_SUGGESTION_PROMPT), null);
    }

    /**
     * 判断 「自定义建议提示词」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCustomSuggestionPrompt() {
        return this._contains(FIELD_CUSTOM_SUGGESTION_PROMPT);
    }

    /**
     * 重置 「自定义建议提示词」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetCustomSuggestionPrompt() {
        this._reset(FIELD_CUSTOM_SUGGESTION_PROMPT);
        return this;
    }

    /**
     * 设置「默认系统提示词」
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_SYSTEM_PROMPT)
    public AiAgentDTO setDefaultSystemPrompt(String val) {
        this._set(FIELD_DEFAULT_SYSTEM_PROMPT, val);
        return this;
    }

    /**
     * 获取「默认系统提示词」值
     *
     */
    @JsonIgnore
    public String getDefaultSystemPrompt() {
        return DataTypeUtils.asString(this._get(FIELD_DEFAULT_SYSTEM_PROMPT), null);
    }

    /**
     * 判断 「默认系统提示词」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultSystemPrompt() {
        return this._contains(FIELD_DEFAULT_SYSTEM_PROMPT);
    }

    /**
     * 重置 「默认系统提示词」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetDefaultSystemPrompt() {
        this._reset(FIELD_DEFAULT_SYSTEM_PROMPT);
        return this;
    }

    /**
     * 设置「启用问题建议」
     * @param val
     */
    @JsonProperty(FIELD_ENABLE_SUGGESTED_QUESTIONS)
    public AiAgentDTO setEnableSuggestedQuestions(Integer val) {
        this._set(FIELD_ENABLE_SUGGESTED_QUESTIONS, val);
        return this;
    }

    /**
     * 获取「启用问题建议」值
     *
     */
    @JsonIgnore
    public Integer getEnableSuggestedQuestions() {
        return DataTypeUtils.asInteger(this._get(FIELD_ENABLE_SUGGESTED_QUESTIONS), null);
    }

    /**
     * 判断 「启用问题建议」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEnableSuggestedQuestions() {
        return this._contains(FIELD_ENABLE_SUGGESTED_QUESTIONS);
    }

    /**
     * 重置 「启用问题建议」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetEnableSuggestedQuestions() {
        this._reset(FIELD_ENABLE_SUGGESTED_QUESTIONS);
        return this;
    }

    /**
     * 设置「启用思考链」
     * @param val
     */
    @JsonProperty(FIELD_ENABLE_THINKING)
    public AiAgentDTO setEnableThinking(Integer val) {
        this._set(FIELD_ENABLE_THINKING, val);
        return this;
    }

    /**
     * 获取「启用思考链」值
     *
     */
    @JsonIgnore
    public Integer getEnableThinking() {
        return DataTypeUtils.asInteger(this._get(FIELD_ENABLE_THINKING), null);
    }

    /**
     * 判断 「启用思考链」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEnableThinking() {
        return this._contains(FIELD_ENABLE_THINKING);
    }

    /**
     * 重置 「启用思考链」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetEnableThinking() {
        this._reset(FIELD_ENABLE_THINKING);
        return this;
    }

    /**
     * 设置「调用工具」
     * @param val
     */
    @JsonProperty(FIELD_ENABLE_TOOLS)
    public AiAgentDTO setEnableTools(Integer val) {
        this._set(FIELD_ENABLE_TOOLS, val);
        return this;
    }

    /**
     * 获取「调用工具」值
     *
     */
    @JsonIgnore
    public Integer getEnableTools() {
        return DataTypeUtils.asInteger(this._get(FIELD_ENABLE_TOOLS), null);
    }

    /**
     * 判断 「调用工具」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEnableTools() {
        return this._contains(FIELD_ENABLE_TOOLS);
    }

    /**
     * 重置 「调用工具」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetEnableTools() {
        this._reset(FIELD_ENABLE_TOOLS);
        return this;
    }

    /**
     * 设置「是否默认Agent」
     * @param val
     */
    @JsonProperty(FIELD_IS_DEFAULT)
    public AiAgentDTO setIsDefault(Integer val) {
        this._set(FIELD_IS_DEFAULT, val);
        return this;
    }

    /**
     * 获取「是否默认Agent」值
     *
     */
    @JsonIgnore
    public Integer getIsDefault() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_DEFAULT), null);
    }

    /**
     * 判断 「是否默认Agent」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsDefault() {
        return this._contains(FIELD_IS_DEFAULT);
    }

    /**
     * 重置 「是否默认Agent」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetIsDefault() {
        this._reset(FIELD_IS_DEFAULT);
        return this;
    }

    /**
     * 设置「最大输入token数」
     * @param val
     */
    @JsonProperty(FIELD_MAX_INPUT_TOKENS)
    public AiAgentDTO setMaxInputTokens(Integer val) {
        this._set(FIELD_MAX_INPUT_TOKENS, val);
        return this;
    }

    /**
     * 获取「最大输入token数」值
     *
     */
    @JsonIgnore
    public Integer getMaxInputTokens() {
        return DataTypeUtils.asInteger(this._get(FIELD_MAX_INPUT_TOKENS), null);
    }

    /**
     * 判断 「最大输入token数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMaxInputTokens() {
        return this._contains(FIELD_MAX_INPUT_TOKENS);
    }

    /**
     * 重置 「最大输入token数」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetMaxInputTokens() {
        this._reset(FIELD_MAX_INPUT_TOKENS);
        return this;
    }

    /**
     * 设置「记忆对话轮数」
     * @param val
     */
    @JsonProperty(FIELD_MEMORY_MAX_TURNS)
    public AiAgentDTO setMemoryMaxTurns(Integer val) {
        this._set(FIELD_MEMORY_MAX_TURNS, val);
        return this;
    }

    /**
     * 获取「记忆对话轮数」值
     *
     */
    @JsonIgnore
    public Integer getMemoryMaxTurns() {
        return DataTypeUtils.asInteger(this._get(FIELD_MEMORY_MAX_TURNS), null);
    }

    /**
     * 判断 「记忆对话轮数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMemoryMaxTurns() {
        return this._contains(FIELD_MEMORY_MAX_TURNS);
    }

    /**
     * 重置 「记忆对话轮数」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetMemoryMaxTurns() {
        this._reset(FIELD_MEMORY_MAX_TURNS);
        return this;
    }

    /**
     * 设置「记忆模式」
     * 代码表[记忆模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.memory_mode
     * @param val
     */
    @JsonProperty(FIELD_MEMORY_MODE)
    public AiAgentDTO setMemoryMode(String val) {
        this._set(FIELD_MEMORY_MODE, val);
        return this;
    }

    /**
     * 获取「记忆模式」值
     * 代码表[记忆模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.memory_mode
     *
     */
    @JsonIgnore
    public String getMemoryMode() {
        return DataTypeUtils.asString(this._get(FIELD_MEMORY_MODE), null);
    }

    /**
     * 判断 「记忆模式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMemoryMode() {
        return this._contains(FIELD_MEMORY_MODE);
    }

    /**
     * 重置 「记忆模式」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetMemoryMode() {
        this._reset(FIELD_MEMORY_MODE);
        return this;
    }

    /**
     * 设置「排序」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public AiAgentDTO setSequence(Integer val) {
        this._set(FIELD_SEQUENCE, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
     */
    @JsonIgnore
    public Integer getSequence() {
        return DataTypeUtils.asInteger(this._get(FIELD_SEQUENCE), null);
    }

    /**
     * 判断 「排序」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSequence() {
        return this._contains(FIELD_SEQUENCE);
    }

    /**
     * 重置 「排序」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「流式输出」
     * @param val
     */
    @JsonProperty(FIELD_STREAM)
    public AiAgentDTO setStream(Integer val) {
        this._set(FIELD_STREAM, val);
        return this;
    }

    /**
     * 获取「流式输出」值
     *
     */
    @JsonIgnore
    public Integer getStream() {
        return DataTypeUtils.asInteger(this._get(FIELD_STREAM), null);
    }

    /**
     * 判断 「流式输出」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStream() {
        return this._contains(FIELD_STREAM);
    }

    /**
     * 重置 「流式输出」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetStream() {
        this._reset(FIELD_STREAM);
        return this;
    }

    /**
     * 设置「模型随机性参数」
     * @param val
     */
    @JsonProperty(FIELD_TEMPERATURE)
    public AiAgentDTO setTemperature(BigDecimal val) {
        this._set(FIELD_TEMPERATURE, val);
        return this;
    }

    /**
     * 获取「模型随机性参数」值
     *
     */
    @JsonIgnore
    public BigDecimal getTemperature() {
        return DataTypeUtils.asBigDecimal(this._get(FIELD_TEMPERATURE), null);
    }

    /**
     * 判断 「模型随机性参数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTemperature() {
        return this._contains(FIELD_TEMPERATURE);
    }

    /**
     * 重置 「模型随机性参数」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetTemperature() {
        this._reset(FIELD_TEMPERATURE);
        return this;
    }

    /**
     * 设置「工具调用超限提示语」
     * @param val
     */
    @JsonProperty(FIELD_TOOL_EXCEED_MESSAGE)
    public AiAgentDTO setToolExceedMessage(String val) {
        this._set(FIELD_TOOL_EXCEED_MESSAGE, val);
        return this;
    }

    /**
     * 获取「工具调用超限提示语」值
     *
     */
    @JsonIgnore
    public String getToolExceedMessage() {
        return DataTypeUtils.asString(this._get(FIELD_TOOL_EXCEED_MESSAGE), null);
    }

    /**
     * 判断 「工具调用超限提示语」是否有值
     *
     */
    @JsonIgnore
    public boolean containsToolExceedMessage() {
        return this._contains(FIELD_TOOL_EXCEED_MESSAGE);
    }

    /**
     * 重置 「工具调用超限提示语」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetToolExceedMessage() {
        this._reset(FIELD_TOOL_EXCEED_MESSAGE);
        return this;
    }

    /**
     * 设置「最大工具调用次数」
     * @param val
     */
    @JsonProperty(FIELD_TOOL_MAX_CALLS)
    public AiAgentDTO setToolMaxCalls(Integer val) {
        this._set(FIELD_TOOL_MAX_CALLS, val);
        return this;
    }

    /**
     * 获取「最大工具调用次数」值
     *
     */
    @JsonIgnore
    public Integer getToolMaxCalls() {
        return DataTypeUtils.asInteger(this._get(FIELD_TOOL_MAX_CALLS), null);
    }

    /**
     * 判断 「最大工具调用次数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsToolMaxCalls() {
        return this._contains(FIELD_TOOL_MAX_CALLS);
    }

    /**
     * 重置 「最大工具调用次数」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetToolMaxCalls() {
        this._reset(FIELD_TOOL_MAX_CALLS);
        return this;
    }

    /**
     * 设置「概率核采样」
     * @param val
     */
    @JsonProperty(FIELD_TOP_P)
    public AiAgentDTO setTopP(BigDecimal val) {
        this._set(FIELD_TOP_P, val);
        return this;
    }

    /**
     * 获取「概率核采样」值
     *
     */
    @JsonIgnore
    public BigDecimal getTopP() {
        return DataTypeUtils.asBigDecimal(this._get(FIELD_TOP_P), null);
    }

    /**
     * 判断 「概率核采样」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTopP() {
        return this._contains(FIELD_TOP_P);
    }

    /**
     * 重置 「概率核采样」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetTopP() {
        this._reset(FIELD_TOP_P);
        return this;
    }

    /**
     * 设置「截断策略」
     * 代码表[截断策略]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.trimming_strategy
     * @param val
     */
    @JsonProperty(FIELD_TRIMMING_STRATEGY)
    public AiAgentDTO setTrimmingStrategy(String val) {
        this._set(FIELD_TRIMMING_STRATEGY, val);
        return this;
    }

    /**
     * 获取「截断策略」值
     * 代码表[截断策略]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.trimming_strategy
     *
     */
    @JsonIgnore
    public String getTrimmingStrategy() {
        return DataTypeUtils.asString(this._get(FIELD_TRIMMING_STRATEGY), null);
    }

    /**
     * 判断 「截断策略」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTrimmingStrategy() {
        return this._contains(FIELD_TRIMMING_STRATEGY);
    }

    /**
     * 重置 「截断策略」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetTrimmingStrategy() {
        this._reset(FIELD_TRIMMING_STRATEGY);
        return this;
    }

    /**
     * 设置「欢迎消息模板」
     * @param val
     */
    @JsonProperty(FIELD_WELCOME_MESSAGE)
    public AiAgentDTO setWelcomeMessage(String val) {
        this._set(FIELD_WELCOME_MESSAGE, val);
        return this;
    }

    /**
     * 获取「欢迎消息模板」值
     *
     */
    @JsonIgnore
    public String getWelcomeMessage() {
        return DataTypeUtils.asString(this._get(FIELD_WELCOME_MESSAGE), null);
    }

    /**
     * 判断 「欢迎消息模板」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWelcomeMessage() {
        return this._contains(FIELD_WELCOME_MESSAGE);
    }

    /**
     * 重置 「欢迎消息模板」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetWelcomeMessage() {
        this._reset(FIELD_WELCOME_MESSAGE);
        return this;
    }

    /**
     * 设置「预制建议问题」
     * @param val
     */
    @JsonProperty(FIELD_WELCOME_SUGGESTED_QUESTIONS)
    public AiAgentDTO setWelcomeSuggestedQuestions(List<String> val) {
        this._set(FIELD_WELCOME_SUGGESTED_QUESTIONS, val);
        return this;
    }

    /**
     * 获取「预制建议问题」值
     *
     */
    @JsonIgnore
    public List<String> getWelcomeSuggestedQuestions() {
        return (List<String>) this._get(FIELD_WELCOME_SUGGESTED_QUESTIONS);
    }

    /**
     * 判断 「预制建议问题」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWelcomeSuggestedQuestions() {
        return this._contains(FIELD_WELCOME_SUGGESTED_QUESTIONS);
    }

    /**
     * 重置 「预制建议问题」
     *
     */
    @JsonIgnore
    public AiAgentDTO resetWelcomeSuggestedQuestions() {
        this._reset(FIELD_WELCOME_SUGGESTED_QUESTIONS);
        return this;
    }

}
