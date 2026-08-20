package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 交谈技能工具对象（用于AIChat）
 *
 */
public class ChatSkill extends EntityBase {

	/**
	 * 标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 * 名称
	 */
	public final static String FIELD_NAME = "name";

	/**
	 * 描述
	 */
	public final static String FIELD_DESCRIPTION = "description";
	
	/**
	 * 设置「AI技能标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatSkill setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「AI技能标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「AI技能标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「AI技能标识」
	 *
	 */
	@JsonIgnore
	public ChatSkill resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「AI技能名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatSkill setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「AI技能名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「AI技能名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「AI技能名称」
	 *
	 */
	@JsonIgnore
	public ChatSkill resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「AI技能描述」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatSkill setDescription(String val) {
		this.set(FIELD_DESCRIPTION, val);
		return this;
	}

	/**
	 * 获取「AI技能描述」值
	 *
	 */
	@JsonIgnore
	public String getDescription() {
		return (String) this.get(FIELD_DESCRIPTION);
	}

	/**
	 * 判断 「AI技能描述」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDescription() {
		return this.contains(FIELD_DESCRIPTION);
	}

	/**
	 * 重置 「AI技能描述」
	 *
	 */
	@JsonIgnore
	public ChatSkill resetDescription() {
		this.reset(FIELD_DESCRIPTION);
		return this;
	}

	
	
	
}
