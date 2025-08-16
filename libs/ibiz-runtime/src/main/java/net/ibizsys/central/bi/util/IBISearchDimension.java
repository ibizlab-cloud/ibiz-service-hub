package net.ibizsys.central.bi.util;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = BISearchDimension.class)
public interface IBISearchDimension {

	/**
	 * 获取维度名称
	 * @return
	 */
	String getName();
	
	
	/**
	 * 获取层级体系
	 * @return
	 */
	String getHierarchy();
	
	
	
	/**
	 * 获取分类层级
	 * @return
	 */
	List<String> getLevels();
	
	
	
	
	/**
	 * 获取传入参数
	 * @return
	 */
	Map<String, Object> getParam();
	
	
	
	/**
	 * 获取时间维度额外指定周期
	 * @return
	 */
	IBISearchPeriod getPeriod();
}
