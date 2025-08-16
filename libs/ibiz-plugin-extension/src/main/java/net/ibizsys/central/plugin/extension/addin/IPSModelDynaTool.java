package net.ibizsys.central.plugin.extension.addin;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 平台动态模型工具对象接口
 * @author lionlau
 *
 */
public interface IPSModelDynaTool extends IModelRTAddin{

	/**
	 * 获取动态模型
	 * @param v2SystemExtensionSuite
	 * @param iPSModelObject
	 * @param param
	 * @return
	 */
	ObjectNode getModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSModelObject iPSModelObject, Object param);
}
