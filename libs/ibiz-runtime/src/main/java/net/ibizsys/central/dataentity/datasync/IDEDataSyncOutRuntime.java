package net.ibizsys.central.dataentity.datasync;

import java.io.File;
import java.util.Map;

public interface IDEDataSyncOutRuntime extends net.ibizsys.runtime.dataentity.datasync.IDEDataSyncOutRuntime, IDEDataSyncOutRuntimeBase{

	/**
	 * 发送文件
	 * @param remotePath
	 * @param file
	 * @param params
	 */
	void send(String remotePath, File file, Map<String, Object> params);
}
