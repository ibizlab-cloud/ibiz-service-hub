package net.ibizsys.runtime.dataentity.action;

/**
 * 实体行为参数值类型
 * @author lionlau
 *
 */
public class DEActionParamValueTypes {

	/**
	 * 输入值（默认），注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String INPUTVALUE = "INPUTVALUE";
	/**
	 * 无值（不设置），注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String NONEVALUE = "NONEVALUE";
	/**
	 * 数据对象属性，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String PARAM = "PARAM";
	/**
	 * 指定值，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String VALUE = "VALUE";
	/**
	 * 空值，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String NULLVALUE = "NULLVALUE";
	/**
	 * 用户全局对象，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String SESSION = "SESSION";
	/**
	 * 系统全局对象，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String APPLICATION = "APPLICATION";
	/**
	 * 唯一编码，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String UNIQUEID = "UNIQUEID";
	/**
	 * 网页请求，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String CONTEXT = "CONTEXT";
	/**
	 * 当前操作用户(编号)，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String OPERATOR = "OPERATOR";
	/**
	 * 当前操作用户(名称)，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String OPERATORNAME = "OPERATORNAME";
	/**
	 * 当前时间，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String CURTIME = "CURTIME";
	/**
	 * 当前应用数据，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String APPDATA = "APPDATA";
}
