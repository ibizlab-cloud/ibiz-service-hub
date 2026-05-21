package net.ibizsys.central.cloud.core.dataentity.service;

/**
 * 代理实体属性枚举对象
 * @author lionlau
 *
 */
public interface IProxyDEFieldEnum {

	String name();
	
	String text();
	
	boolean required();
	
	default boolean readonly() {
		return false;
	}
	
	Class<? extends ICodeListEnum> codelist();
}
