package net.ibizsys.central.cloud.portal.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 标记打开数据操作对象
 *
 */
public class MarkOpenData extends EntityBase {

	/**
	* 操作
	*/
	public final static String FIELD_ACTION = "action";

	/**
	 * 用户名称
	 *
	 */
	public final static String FIELD_USERNAME = "username";

	

	/**
	 *操作时间
	 *
	 */
	public final static String FIELD_TIME = "time";
	
	
	/**
	 * 数据对象
	 *
	 */
	public final static String FIELD_ENTITY = "entity";
	
	
	/**
	 * 数据标识
	 *
	 */
	public final static String FIELD_KEY = "key";
	
	/**
	 * 参数
	 *
	 */
	public final static String FIELD_DATA = "data";

	/**
	 * 设置「操作」
	 *
	 * @param val
	 */
	@JsonIgnore
	public MarkOpenData setAction(String val) {
		this.set(FIELD_ACTION, val);
		return this;
	}

	/**
	 * 获取「操作」值
	 *
	 */
	@JsonIgnore
	public String getAction() {
		return (String) this.get(FIELD_ACTION);
	}

	/**
	 * 判断 「操作」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAction() {
		return this.contains(FIELD_ACTION);
	}

	/**
	 * 重置 「操作」
	 *
	 */
	@JsonIgnore
	public MarkOpenData resetAction() {
		this.reset(FIELD_ACTION);
		return this;
	}

	/**
	 * 设置「用户名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public MarkOpenData setUserName(String val) {
		this.set(FIELD_USERNAME, val);
		return this;
	}

	/**
	 * 获取「用户名称」值
	 *
	 */
	@JsonIgnore
	public String getUserName() {
		return (String) this.get(FIELD_USERNAME);
	}

	/**
	 * 判断 「用户名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUserName() {
		return this.contains(FIELD_USERNAME);
	}

	/**
	 * 重置 「用户名称」
	 *
	 */
	@JsonIgnore
	public MarkOpenData resetUserName() {
		this.reset(FIELD_USERNAME);
		return this;
	}

	/**
	 * 设置「时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public MarkOpenData setTime(Long val) {
		this.set(FIELD_TIME, val);
		return this;
	}
	

	/**
	 * 获取「操作时间」值
	 *
	 */
	@JsonIgnore
	public Long getTime() {
		try {
			return (Long) DataTypeUtils.getLongValue(this.get(FIELD_TIME), null);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	/**
	 * 判断 「操作时间」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTime() {
		return this.contains(FIELD_TIME);
	}

	/**
	 * 重置 「操作时间」
	 *
	 */
	@JsonIgnore
	public MarkOpenData resetTime() {
		this.reset(FIELD_TIME);
		return this;
	}

	
	/**
	 * 设置「对象」
	 *
	 * @param val
	 */
	@JsonIgnore
	public MarkOpenData setEntity(String val) {
		this.set(FIELD_ENTITY, val);
		return this;
	}

	/**
	 * 获取「对象」值
	 *
	 */
	@JsonIgnore
	public String getEntity() {
		return (String) this.get(FIELD_ENTITY);
	}

	/**
	 * 判断 「对象」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsEntity() {
		return this.contains(FIELD_ENTITY);
	}

	/**
	 * 重置 「对象」
	 *
	 */
	@JsonIgnore
	public MarkOpenData resetEntity() {
		this.reset(FIELD_ENTITY);
		return this;
	}
	
	
	/**
	 * 设置「键值」
	 *
	 * @param val
	 */
	@JsonIgnore
	public MarkOpenData setKey(String val) {
		this.set(FIELD_KEY, val);
		return this;
	}

	/**
	 * 获取「键值」值
	 *
	 */
	@JsonIgnore
	public String getKey() {
		return (String) this.get(FIELD_KEY);
	}

	/**
	 * 判断 「键值」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsKey() {
		return this.contains(FIELD_KEY);
	}

	/**
	 * 重置 「键值」
	 *
	 */
	@JsonIgnore
	public MarkOpenData resetKey() {
		this.reset(FIELD_KEY);
		return this;
	}
	
	
	
	/**
	 * 设置「数据」
	 *
	 * @param val
	 */
	@JsonIgnore
	public MarkOpenData setData(Object val) {
		this.set(FIELD_DATA, val);
		return this;
	}

	/**
	 * 获取「数据」值
	 *
	 */
	@JsonIgnore
	public Object getData() {
		return this.get(FIELD_DATA);
	}

	/**
	 * 判断 「数据」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsData() {
		return this.contains(FIELD_DATA);
	}

	/**
	 * 重置 「数据」
	 *
	 */
	@JsonIgnore
	public MarkOpenData resetData() {
		this.reset(FIELD_DATA);
		return this;
	}
	
}
