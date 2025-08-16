package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 交谈函数对象（用于AIChat）
 *
 */
public class ChatFunction extends EntityBase {

	/**
	 * 名称
	 *
	 */
	public final static String FIELD_NAME = "name";

	
	
	/**
	 * 设置「名称」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_NAME)
	public ChatFunction setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}
	

	/**
	 * 获取「名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
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
	public ChatFunction resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	
	/**
	 * 描述
	 *
	 */
	public final static String FIELD_DESCRIPTION = "description";

	
	
	/**
	 * 设置「描述」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_DESCRIPTION)
	public ChatFunction setDescription(String val) {
		this.set(FIELD_DESCRIPTION, val);
		return this;
	}
	

	/**
	 * 获取「描述」值
	 *
	 */
	@JsonIgnore
	public String getDescription() {
		return (String) this.get(FIELD_DESCRIPTION);
	}

	/**
	 * 判断 「描述」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDescription() {
		return this.contains(FIELD_DESCRIPTION);
	}

	/**
	 * 重置 「描述」
	 *
	 */
	@JsonIgnore
	public ChatFunction resetDescription() {
		this.reset(FIELD_DESCRIPTION);
		return this;
	}
	
	
	/**
	 * 参数
	 *
	 */
	public final static String FIELD_PARAMETERS = "parameters";

	
	
	/**
	 * 设置「参数」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_PARAMETERS)
	public ChatFunction setParameters(ObjectNode val) {
		this.set(FIELD_PARAMETERS, val);
		return this;
	}
	

	/**
	 * 获取「参数」值
	 *
	 */
	@JsonIgnore
	public ObjectNode getParameters() {
		return (ObjectNode) this.get(FIELD_PARAMETERS);
	}

	/**
	 * 判断 「参数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsParameters() {
		return this.contains(FIELD_PARAMETERS);
	}

	/**
	 * 重置 「参数」
	 *
	 */
	@JsonIgnore
	public ChatFunction resetParameters() {
		this.reset(FIELD_PARAMETERS);
		return this;
	}
	
	/**
	 * 服务
	 *
	 */
	public final static String FIELD_SERVICE = "service";

	
	
	/**
	 * 设置「服务」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_SERVICE)
	public ChatFunction setService(ChatFunctionService val) {
		this.set(FIELD_SERVICE, val);
		return this;
	}
	

	/**
	 * 获取「服务」值
	 *
	 */
	@JsonIgnore
	public ChatFunctionService getService() {
		return (ChatFunctionService) this.get(FIELD_SERVICE);
	}

	/**
	 * 判断 「服务」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsService() {
		return this.contains(FIELD_SERVICE);
	}

	/**
	 * 重置 「服务」
	 *
	 */
	@JsonIgnore
	public ChatFunction resetService() {
		this.reset(FIELD_SERVICE);
		return this;
	}
}
