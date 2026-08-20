package net.ibizsys.central.dataentity.datasync;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface IDEDataSyncInRuntimeBase {
	
	
	/**
	 * 过滤需要处理的文件名称
	 * @param remoteDir
	 * @param fileNames
	 * @return
	 */
	List<String> filter(String remoteDir, List<String> fileNames, Map<String, Object> params);
	
	/**
	 * 接收文件
	 * @param remotePath 远端路径
	 * @param file
	 * @param params
	 */
	void recv(String remotePath, File file, Map<String, Object> params);
	
	
	
	  /**
     * 判断当前是否为批处理模式（默认返回 false，由子类重写）
     * @param params 调用方传入的参数，可用于传递模式标志
     * @return true 表示希望使用批量处理
     */
    default boolean isBatchMode(Map<String, Object> params) {
        return false;
    }
    
    
    /**
     * 批处理，默认解开单项处理
     * @param remoteFileMap
     * @param params
     */
    default void recvBatch(Map<String, File> remoteFileMap, Map<String, Object> params) {
    	for(java.util.Map.Entry<String, File> entry : remoteFileMap.entrySet()) {
    		recv(entry.getKey(), entry.getValue(), params);
    	}
    }
}
