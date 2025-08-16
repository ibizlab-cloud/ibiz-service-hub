package net.ibizsys.central.cloud.devops.core.addin;

import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.System;
import net.ibizsys.central.cloud.devops.core.util.domain.CodeGenResult;
import net.ibizsys.model.IPSSystemService;

/**
 * DevOps 代码产生工具对象接口
 * @author lionlau
 *
 */
public interface IDevOpsCodeGenTool extends ICloudDevOpsUtilRTAddin {

	/**
	 * 生产代码片段
	 * @param system
	 * @param iPSSystemService
	 * @param params
	 * @return
	 */
	CodeGenResult generateCodeSnippet(System system, IPSSystemService iPSSystemService, Map<String, Object> params);
}
