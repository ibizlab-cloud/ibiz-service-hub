package net.ibizsys.runtime.dataentity.defield;

/**
 * 属性重复值检查模式
 * 
 * @author lionlau
 *
 */
public class DEFDupCheckModes {

	/**
	 * 不检查，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String NONE = "NONE";
	/**
	 * 全部检查，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String ALL = "ALL";
	/**
	 * 非空检查，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String NOTNULL = "NOTNULL";
	/**
	 * 指定值范围，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String CHECKVALUES = "CHECKVALUES";
	/**
	 * 排除值范围，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String EXCLUDEVALUES = "EXCLUDEVALUES";

}
