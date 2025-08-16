package net.ibizsys.central.cloud.devops.core.addin;

import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.model.IPSSystemService;

/**
 * DevOps 平台模型工具对象接口
 * @author lionlau
 *
 */
public interface IDevOpsPSModelTool extends ICloudDevOpsUtilRTAddin {

	
	/**
	 * 同步模型方向：输入，写入iBiz模型
	 */
	public final static String SYNCDIR_IN = "IN";
	
	
	/**
	 * 同步模型方向：输出，写入系统运行模型
	 */
	public final static String SYNCDIR_OUT = "OUT";
	
	/** 
	 * 同步模型方向：输入输出，同步iBiz模型和系统运行模型
	 */
	public final static String SYNCDIR_INOUT = "INOUT";
	
	
	/**
	 * 同步模型
	 * @param dcSystem
	 * @param iPSSystemService
	 * @param params
	 * @return
	 */
	void syncPSModels(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params);
}
