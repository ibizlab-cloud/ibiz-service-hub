package net.ibizsys.central.plugin.extension.system;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.model.app.IPSApplication;

/**
 * 扩展系统引用运行时对象接口
 * @author lionlau
 *
 */
public interface IExtensionSysRefRuntime extends net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime {

	/**
	 * 设置相关部署系统数据对象
	 * @param deploySystem
	 */
	void setDeploySystem(DeploySystem deploySystem);
	
	
	
	
	/**
	 * 获取传入应用实体JsonScheme
	 * @param iPSApplication
	 * @param strAppDataEntityTag
	 * @param param
	 * @param bTryMode
	 * @return
	 */
	ObjectNode getAppDataEntityJsonSchema(IPSApplication iPSApplication, String strAppDataEntityTag, Object param, boolean bTryMode);
}
