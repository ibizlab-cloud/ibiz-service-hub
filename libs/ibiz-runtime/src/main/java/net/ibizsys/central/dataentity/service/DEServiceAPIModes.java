package net.ibizsys.central.dataentity.service;

/**
 * 实体服务接口模式
 * 
 * @author lionlau
 *
 */
public class DEServiceAPIModes {

	/**
	 * 主接口，整形类型，可用于 switch 或 == 比较
	 */
	public final static int MAJOR = 1;

	/**
	 * 从接口，整形类型，可用于 switch 或 == 比较
	 */
	public final static int MINOR = 0;

	/**
	 * 数据传输对象（DTO）嵌套成员，整形类型，可用于 switch 或 == 比较
	 */
	public final static int NESTED = 9;

}
