package net.ibizsys.central.util;

public interface IPage<T> extends org.springframework.data.domain.Page<T>{

	/**
	 * 获取无权限数据总计
	 * @return
	 */
	long getTotalX();
}
