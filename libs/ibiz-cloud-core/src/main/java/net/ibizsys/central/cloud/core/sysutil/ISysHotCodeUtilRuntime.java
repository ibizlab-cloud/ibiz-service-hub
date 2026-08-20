package net.ibizsys.central.cloud.core.sysutil;

import java.io.File;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.CodeGenResult;
import net.ibizsys.central.cloud.core.util.domain.CompileResult;
import net.ibizsys.central.cloud.core.util.domain.RunTestResult;
import net.ibizsys.central.res.ISysFileResourceRuntime;

public interface ISysHotCodeUtilRuntime extends ISysUtilRuntime, ISysHotCodeUtilRuntimeBase{

	
	

	/**
	 * 获取配置文件资源
	 * @param bTryMode
	 * @return
	 */
	ISysFileResourceRuntime getConfigSysFileResourceRuntime(boolean bTryMode);
	
	
	
	/**
	 * 运行指定路径文件
	 * @param strPath
	 * @param params
	 * @return
	 */
	CompileResult compile(String strPath, Map<String, Object> params);
	
	
	
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
	
	
	
	
	/**
	 * 运行测试
	 * @param strPath
	 * @param params
	 * @return
	 */
	RunTestResult runTest(String strPath, Map<String, Object> params);
}
