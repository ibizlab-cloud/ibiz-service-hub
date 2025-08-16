package net.ibizsys.central.cloud.core.cloudutil;

import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;

/**
 * 云体系数据流平台组件接口
 * @author lionlau
 *
 */
public interface ICloudDataFlowUtilRuntime extends ICloudUtilRuntime{

	
	/**
	 * 数据流平台插件前缀
	 */
	public final static String ADDIN_DATAFLOWPLATFORM_PREFIX = "DATAFLOWPLATFORM:";
	
	/**
	 * 数据流平台：Spark
	 */
	public final static String DATAFLOWPLATFORM_SPARK = "SPARK";
	
	
	/**
	 * 数据流平台：Flink
	 */
	public final static String DATAFLOWPLATFORM_FLINK = "FLINK";
	
	
	
	/**
	 * 数据流平台：默认
	 */
	public final static String DATAFLOWPLATFORM_DEFAULT = "DEFAULT";
	
	
	
	/**
	 * 启动数据流作业
	 * @param type
	 * @param id
	 * @param params
	 * @return
	 */
	PortalAsyncAction start(String type, String id, Map<String, Object> params);
}



