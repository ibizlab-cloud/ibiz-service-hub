package net.ibizsys.central.cloud.report.grafana.util;

import java.util.List;
import java.util.Map;

public class GrafanaUtils {

	/**
	 * 操作：查询
	 */
	public final static String ACTION_QUERY = "QUERY";
	
	/**
	 * 操作：搜索
	 */
	public final static String ACTION_SEARCH = "SEARCH";
	

	
	/**
	 * 操作：注解
	 */
	public final static String ACTION_ANNOTATIONS = "ANNOTATIONS";
	
	
	/**
	 * 操作：标记键名集合
	 */
	public final static String ACTION_TAGKEYS = "tag-keys";
	
	
	
	/**
	 * 操作：标记键对应的值集合
	 */
	public final static String ACTION_TAGVALUES = "tag-values";
	
	
	
	
	/**
	 * 数据源：实体数据集
	 */
	public static final String DATASOURCE_PSDEDATASET =  "psdedataset";
	
	
	/**
	 * 数据集合参数：选择列，使用[,]分隔
	 */
	public static final String PARAM_PSDEDATASET_COLUMNS =  "columns";
	
	/**
	 * Query请求目标集合参数
	 */
	public static final String PARAM_QUERY_TARGETS = "targets";
	
	/**
	 * Query请求目标参数
	 */
	public static final String PARAM_QUERY_TARGET = "target";
	
	/**
	 * Query请求目标参数类型
	 */
	public static final String PARAM_QUERY_TARGET_TYPE = "type";
	
	
	/**
	 * 目标类型：时间序列
	 */
	public final static String TARGETTYPE_TIMESERIE = "timeserie";
	
	/**
	 * 目标类型：数据表
	 */
	public final static String TARGETTYPE_TABLE = "table";
	
	
	
	public static List getQueryTargets(Map body) throws Exception{
		
		Object targets = body.get(PARAM_QUERY_TARGETS);
		if(targets instanceof List) {
			return (List)targets;
		}
		
		return null;
	}
	
	public static String getQueryTargetType(Map target) throws Exception{
		
		Object type = target.get(PARAM_QUERY_TARGET_TYPE);
		if(type instanceof String) {
			return (String)type;
		}
		
		return null;
	}

	public static String getQueryTarget(Map target) throws Exception{
		
		Object value = target.get(PARAM_QUERY_TARGET);
		if(value instanceof String) {
			return (String)value;
		}
		
		return null;
	}


}
