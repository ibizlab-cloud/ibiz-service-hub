package net.ibizsys.central.cloud.core.app;

import java.io.File;
import java.util.Map;

import net.ibizsys.central.cloud.core.sysutil.ISysHotCodeUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.domain.CodeGenResult;

/**
 * 热应用运行时对象基接口
 * @author lionlau
 *
 */
public interface IHotAppRuntimeBase extends ISysHotCodeUtilRuntimeBase{

	/**
	 * 重载配置
	 */
	void reload();
	
	/**
	 * 获取文件
	 * @param strPath
	 * @param bTryMode
	 * @return
	 */
	File getFile(String strPath, boolean bTryMode);
	
	
	/**
	 * 生成代码
	 * @param strPath
	 * @param params
	 * @return
	 */
	CodeGenResult generate(String strPath, Map<String, Object> params);
}
