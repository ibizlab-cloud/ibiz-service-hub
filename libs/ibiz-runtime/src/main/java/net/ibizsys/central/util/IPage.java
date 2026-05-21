package net.ibizsys.central.util;

import java.util.Map;

public interface IPage<T> extends org.springframework.data.domain.Page<T>{

	/**
	 * 获取无权限数据总计
	 * @return
	 */
	long getTotalX();
	
	
	/**
	 * 获取分页的元数据
	 * @return
	 */
	Map<String, Object> getMetadata();
}
