package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 聊天补全请求数据对象
 * @author lionlau
 *
 */
public class ChatCompletionRequest extends EntityBase {

	public final static String FIELD_MESSAGES = "messages";

	public final static String FIELD_SESSIONID = "sessionid";
	
	public final static String FIELD_MODEL = "model";
	
	public final static String FIELD_STREAMING = "streaming";
	
	/**
	 * 取值范围: [.0f, 1.0f]。 多样性，越高，多样性越好, 缺省 0.3
	 */
	public final static String FIELD_TEMPERATURE = "temperature";
	
	public final static String FIELD_TOOLS = "tools";
	
	public final static String FIELD_MAXTOKENS = "maxtokens";

	/**
	 * 设置「消息集合」
	 *
	 * @param val
	 */
	//@JsonIgnore
	@JsonProperty(FIELD_MESSAGES)
	public ChatCompletionRequest setMessages(List<ChatMessage> val) {
		this.set(FIELD_MESSAGES, val);
		return this;
	}

	/**
	 * 获取「消息集合」值
	 *
	 */
	@JsonIgnore
	public List<ChatMessage> getMessages() {
		return (List<ChatMessage>) this.get(FIELD_MESSAGES);
	}

	/**
	 * 判断 「消息集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMessages() {
		return this.contains(FIELD_MESSAGES);
	}

	/**
	 * 重置 「消息集合」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetMessages() {
		this.reset(FIELD_MESSAGES);
		return this;
	}
	
	
	/**
	 * 设置「工具集合」
	 *
	 * @param val
	 */
	//@JsonIgnore
	@JsonProperty(FIELD_TOOLS)
	public ChatCompletionRequest setTools(List<ChatTool> val) {
		this.set(FIELD_TOOLS, val);
		return this;
	}

	/**
	 * 获取「工具集合」值
	 *
	 */
	@JsonIgnore
	public List<ChatTool> getTools() {
		return (List<ChatTool>) this.get(FIELD_TOOLS);
	}

	/**
	 * 判断 「工具集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTools() {
		return this.contains(FIELD_TOOLS);
	}

	/**
	 * 重置 「工具集合」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetTools() {
		this.reset(FIELD_TOOLS);
		return this;
	}
	
	

	/**
	 * 设置「会话标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setSessionId(String val) {
		this.set(FIELD_SESSIONID, val);
		return this;
	}

	/**
	 * 获取「会话标识」值
	 *
	 */
	@JsonIgnore
	public String getSessionId() {
		return (String) this.get(FIELD_SESSIONID);
	}

	/**
	 * 判断 「会话标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSessionId() {
		return this.contains(FIELD_SESSIONID);
	}

	/**
	 * 重置 「会话标识」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetSessionId() {
		this.reset(FIELD_SESSIONID);
		return this;
	}
	
	
	/**
	 * 设置「模型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setModel(String val) {
		this.set(FIELD_MODEL, val);
		return this;
	}

	/**
	 * 获取「模型」值
	 *
	 */
	@JsonIgnore
	public String getModel() {
		return (String) this.get(FIELD_MODEL);
	}

	/**
	 * 判断 「模型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsModel() {
		return this.contains(FIELD_MODEL);
	}

	/**
	 * 重置 「模型」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetModel() {
		this.reset(FIELD_MODEL);
		return this;
	}
	
	

	
	/**
     * 设置「是否流式反馈」
     *
     * @param val
    */
    @JsonIgnore
    public ChatCompletionRequest setStreaming(Integer val) {
        this.set(FIELD_STREAMING, val);
        return this;
    }

    /**
     * 获取「是否流式反馈」值
     *
    */
    @JsonIgnore
    public Integer getStreaming() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_STREAMING),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否流式反馈」是否有值
     *
    */
    @JsonIgnore
    public boolean containsStreaming() {
        return this.contains(FIELD_STREAMING);
    }

    /**
     * 重置 「是否流式反馈」
     *
    */
    @JsonIgnore
    public ChatCompletionRequest resetStreaming() {
        this.reset(FIELD_STREAMING);
        return this;
    }
    
    
    
    /**
     * 设置「多样性参数」
     *
     * @param val
    */
    @JsonIgnore
    public ChatCompletionRequest setTemperature(Float val) {
        this.set(FIELD_TEMPERATURE, val);
        return this;
    }

    /**
     * 获取「多样性参数」值
     *
    */
    @JsonIgnore
    public Float getTemperature() {
        try{
            return DataTypeUtils.getFloatValue(this.get(FIELD_TEMPERATURE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「多样性参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemperature() {
        return this.contains(FIELD_TEMPERATURE);
    }

    /**
     * 重置 「多样性参数」
     *
    */
    @JsonIgnore
    public ChatCompletionRequest resetTemperature() {
        this.reset(FIELD_TEMPERATURE);
        return this;
    }
    
    /**
	 * 设置「最大词量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setMaxTokens(Integer val) {
		this.set(FIELD_MAXTOKENS, val);
		return this;
	}

	/**
	 * 获取「最大词量」值
	 *
	 */
	@JsonIgnore
	public Integer getMaxTokens() {
		return DataTypeUtils.asInteger(this.get(FIELD_MAXTOKENS), null);
	}

	/**
	 * 判断 「最大词量」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMaxTokens() {
		return this.contains(FIELD_MAXTOKENS);
	}

	/**
	 * 重置 「最大词量」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetMaxTokens() {
		this.reset(FIELD_MAXTOKENS);
		return this;
	}
}
