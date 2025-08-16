package net.ibizsys.runtime.security;

/**
 * 数据范围模式定义
 * @author lionlau
 *
 */
public class DataRanges {

	/**
	 * 当前组织
	 */
	public final static int ORG_CURRENT = 1;

	/**
	 * 上级组织
	 */
	public final static int ORG_PARENT = 2;

	/**
	 * 下级组织
	 */
	public final static int ORG_CHILD = 4;
	
	/**
	 * 无组织值
	 */
	public final static int ORG_NULL = 8;
	

	/**
	 * 当前部门
	 */
	public final static int SECTOR_CURRENT = 1;

	/**
	 * 上级部门
	 */
	public final static int SECTOR_PARENT = 2;

	/**
	 * 下级部门
	 */
	public final static int SECTOR_CHILD = 4;
	
	/**
	 * 无部门值
	 */
	public final static int SECTOR_NULL = 8;
	
}
