package net.ibizsys.central.cloud.core.system;

import java.io.File;

import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.system.ISysRefRuntime;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.runtime.util.Entity;

/**
 * 扩展系统引用运行时
 * @author lionlau
 *
 */
public interface IExtensionSysRefRuntime extends ISysRefRuntime {

	/**
	 * 获取引用系统服务对象
	 * @return
	 */
	IPSSystemService getPSSystemService();
	
	
	
	/**
	 * 获取扩展标记
	 * @return
	 */
	String getExtensionTag();
	

	/**
	 * 获取部署系统数据对象
	 * @return
	 */
	DeploySystem getDeploySystem(); 
	
	
	
	/**
	 * 获取App动态模型文件
	 * @param strAppTag
	 * @param strModelUri
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getAppDynaModelFile(String strAppTag, String strModelUri, Object param, boolean bTryMode);
	
	
	/**
	 * 填充插件系统的应用数据
	 * @param appData
	 * @param session 会话变量
	 */
	default void fillAddinAppData(AppData appData, Entity session) {
		
	}
}
