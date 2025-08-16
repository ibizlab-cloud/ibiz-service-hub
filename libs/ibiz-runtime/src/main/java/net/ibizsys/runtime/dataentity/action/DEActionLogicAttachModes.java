package net.ibizsys.runtime.dataentity.action;

/**
 * 实体行为逻辑附加模式
 * 
 * @author lionlau
 *
 */
public class DEActionLogicAttachModes {

	/**
	 * 准备，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String PREPARE = "PREPARE";
	/**
	 * 检查，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String CHECK = "CHECK";
	/**
	 * 执行之前，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String BEFORE = "BEFORE";
	/**
	 * 执行之后，注意：值为对象值，不能直接用于 == 比较
	 */
	public final static String AFTER = "AFTER";

}
