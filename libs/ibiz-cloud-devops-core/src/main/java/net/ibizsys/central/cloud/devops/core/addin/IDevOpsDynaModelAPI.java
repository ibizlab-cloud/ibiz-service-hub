package net.ibizsys.central.cloud.devops.core.addin;

import net.ibizsys.central.cloud.core.util.domain.System;
import net.ibizsys.model.IPSSystemService;

/**
 * DevOps 平台模型API对象接口
 * 
 * @author lionlau
 *
 */
public interface IDevOpsDynaModelAPI extends ICloudDevOpsUtilRTAddin {

	public final static String METHOD_CREATE = "CREATE";

	public final static String METHOD_UPDATE = "UPDATE";

	public final static String METHOD_GET = "GET";

	public final static String METHOD_REMOVE = "REMOVE";

	public final static String METHOD_FETCH = "FETCH";

	/**
	 * 调用接口方法
	 * 
	 * @param system
	 * @param iPSSystemService
	 * @param strPModelName
	 * @param StrPKey
	 * @param strModelName
	 * @param strMethodName
	 * @param strKey
	 * @param param
	 * @return
	 */
	Object invoke(System system, IPSSystemService iPSSystemService, String strPModelName, String strPKey, String strModelName, String strMethodName, String strKey, Object param);

}
