package net.ibizsys.central.bi.util;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import net.ibizsys.central.util.ISearchContext;

/**
 * 智能报表搜索上下文
 * @author lionlau
 *
 */
@JsonDeserialize(as = BISearchContext.class)
public interface IBISearchContext {

	/**
	 * 请求参数：BI 立方体标记
	 */
	final static String PARAM_BICUBETAG = "bicubetag";
	
	
	/**
	 * 请求参数：BI 报表标记
	 */
	final static String PARAM_BIREPORTTAG = "bireporttag";
	
	
	/**
	 * 请求参数：BI 维度集合
	 */
	final static String PARAM_BIDIMENSIONS = "bidimensions";
	
	
	/**
	 * 请求参数：BI 指标集合
	 */
	final static String PARAM_BIMEASURES = "bimeasures";
	
	
	/**
	 * 请求参数：BI 时间周期
	 */
	final static String PARAM_BIPERIOD = "biperiod";
	
	
	/**
	 * 请求参数：排序
	 */
	final static String PARAM_BISORT = "bisort";
	
	
	/**
	 * 获取搜索上下文
	 * @return
	 */
	ISearchContext getSearchContext();
	
	/**
	 * 智能立方体标记
	 * @return
	 */
	String getBICubeTag();
	
	
	/**
	 * 获取智能报表标记
	 * @return
	 */
	String getBIReportTag();
	
	
	
	/**
	 * 获取搜索维度集合（没有则建立）
	 * @return
	 */
	List<IBISearchDimension> getBISearchDimensionsIf();
	
	
	/**
	 * 获取搜索维度集合
	 * @return
	 */
	List<IBISearchDimension> getBISearchDimensions();
	
	
	/**
	 * 获取搜索指标集合（没有则建立）
	 * @return
	 */
	List<IBISearchMeasure> getBISearchMeasuresIf();
	
	
	/**
	 * 获取搜索指标集合
	 * @return
	 */
	List<IBISearchMeasure> getBISearchMeasures();
	
	
	/**
	 * 获取搜索周期
	 * @return
	 */
	IBISearchPeriod getBISearchPeriod();
	
	
	/**
	 * 设置BI 排序信息
	 * @return
	 */
	Sort getBISort();

	
}
