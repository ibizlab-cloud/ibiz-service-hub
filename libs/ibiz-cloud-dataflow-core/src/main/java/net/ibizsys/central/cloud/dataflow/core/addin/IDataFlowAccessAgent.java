package net.ibizsys.central.cloud.dataflow.core.addin;

import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.DataFlowAccess;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.dataflow.core.cloudutil.ICloudDataFlowUtilRuntimeContext;

/**
 * 数据流平台类型代理
 * @author lionlau
 *
 */
public interface IDataFlowAccessAgent extends ICloudDataFlowUtilRTAddin{

	/**
	 * Cloud参数
	 */
	public final static String PARAM_CLOUDPARAMS = "cloudparams";
	
	
	/**
	 * 初始化
	 * @param ctx
	 * @param dataFlowAccess
	 * @throws Exception
	 */
	void init(ICloudDataFlowUtilRuntimeContext ctx, DataFlowAccess dataFlowAccess) throws Exception;
	
	
	/**
	 * 获取代理数据
	 * @return
	 */
	DataFlowAccess getAgentData();

	
	/**
	 * 获取数据流平台类型
	 * @return
	 */
	String getDataFlowType();
	
	
	
	
	/**
	 * 启动数据流作业
	 * @param id
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	PortalAsyncAction start(String id, Map<String, Object> params) throws Throwable;
	
}
