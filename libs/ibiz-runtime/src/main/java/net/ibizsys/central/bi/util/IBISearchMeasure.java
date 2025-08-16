package net.ibizsys.central.bi.util;

import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = BISearchMeasure.class)
public interface IBISearchMeasure {

	/**
	 * 获取指标名称
	 * @return
	 */
	String getName();
	
	
	
	/**
	 * 获取指标的聚合模式
	 * @return
	 */
	String getAggMode();
	
	
	
	/**
	 * 获取传入参数
	 * @return
	 */
	Map<String, Object> getParam();
	
	
	
	/**
	 * 是否隐藏项
	 * @return
	 */
	boolean isHidden();
}
