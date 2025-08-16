package net.ibizsys.runtime.dataentity.action;

/**
 * 检查数据状态
 * @author lionlau
 *
 */
public class CheckKeyStates {

	/**
	 * 主键不存在
	 */
	public final static int OK = 0;

	/**
	 * 主键不存在
	 */
	public final static int NOTEXIST = 0;

	/**
	 * 主键存在
	 */
	public final static int EXIST = 1;

	/**
	 * 主键删除
	 */
	public final static int DELETE = 2;
	
}
