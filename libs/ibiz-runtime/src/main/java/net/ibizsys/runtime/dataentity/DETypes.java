package net.ibizsys.runtime.dataentity;

/**
 * 实体类型
 * 
 * @author lionlau
 *
 */
public class DETypes {

	/**
	 * 主实体，整形类型，可用于 switch 或 == 比较
	 */
	public final static int MAJOR = 1;

	/**
	 * 附属实体，整形类型，可用于 switch 或 == 比较
	 */
	public final static int ATTACHED = 2;

	/**
	 * 关系实体，整形类型，可用于 switch 或 == 比较
	 */
	public final static int RELATED = 3;

	/**
	 * 动态附属实体，整形类型，可用于 switch 或 == 比较
	 */
	public final static int DYNAATTACHED = 4;
	
	
	/**
	 * 抽象实体，整形类型，可用于 switch 或 == 比较
	 */
	public final static int ABSTRACT = 6;
	

}
