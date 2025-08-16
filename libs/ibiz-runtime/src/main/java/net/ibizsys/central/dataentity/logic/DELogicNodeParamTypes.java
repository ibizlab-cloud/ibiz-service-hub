package net.ibizsys.central.dataentity.logic;

/**
 * 实体逻辑节点参数类型
 * 
 * @author lionlau
 *
 */
public class DELogicNodeParamTypes {

	/**
	 * 设置变量，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String SETPARAMVALUE = "SETPARAMVALUE";
	/**
	 * 重置变量，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String RESETPARAM = "RESETPARAM";
	/**
	 * 拷贝变量，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String COPYPARAM = "COPYPARAM";
	/**
	 * 数据库调用参数，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String SQLPARAM = "SQLPARAM";
	/**
	 * 后台服务插件参数，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String SFPLUGINPARAM = "SFPLUGINPARAM";

	/**
	 * 绑定参数，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String BINDPARAM = "BINDPARAM";
	/**
	 * 附加到数组变量，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String APPENDPARAM = "APPENDPARAM";
	/**
	 * 排序数组变量，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String SORTPARAM = "SORTPARAM";

	/**
	 * 重新建立变量，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String RENEWPARAM = "RENEWPARAM";

	/**
	 * 请求Uri参数，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String WEBURIPARAM = "WEBURIPARAM";
	/**
	 * 请求Header参数，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String WEBHEADERPARAM = "WEBHEADERPARAM";

	/**
	 * 合并映射参数，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String MERGEMAPPARAM = "MERGEMAPPARAM";
	/**
	 * 聚合映射参数，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String AGGREGATEMAPPARAM = "AGGREGATEMAPPARAM";

}
