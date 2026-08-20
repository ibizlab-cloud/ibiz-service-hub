package net.ibizsys.central.eai;

import java.io.File;
import java.util.Map;

import net.ibizsys.central.dataentity.datasync.IDEDataSyncInRuntimeBase;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeBase;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;

/**
 * 系统文件同步代理运行时对象接口
 * @author lionlau
 *
 */
public interface ISysFileSyncAgentRuntime extends ISysDataSyncAgentRuntime, ISubSysServiceAPIRuntimeBase, IModelRuntimeShutdownable{

	/**
	 * 获取目标目录
	 * @return
	 */
	String getTargetDir();
	
	/**
	 * 直接发送文件
	 * @param remotePath 远端路径
	 * @param file 本地文件
	 */
	void send(String remotePath, File file, Map<String, Object> params);
	
	/**
	 * 接收远端文件
	 * @param remoteDir 远端目录
	 * @param iDEDataSyncInRuntimeBase
	 * @param params
	 */
	void recv(String remoteDir, IDEDataSyncInRuntimeBase iDEDataSyncInRuntimeBase, Map<String, Object> params);
}
