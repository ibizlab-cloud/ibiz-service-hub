package net.ibizsys.central.plugin.extension.addin;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IPSModelTranspilerEx extends IModelRTAddin{

	/**
	 * 反编译运行时模型至标准存储模型
	 * @param iPSModelTranspileContext
	 * @param iPSModelObject
	 * @param domain
	 * @param bFullMode
	 * @return
	 */
	net.ibizsys.psmodel.core.util.IPSModel decompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, net.ibizsys.psmodel.core.util.IPSModel domain, boolean bFullMode);
	
	
	/**
	 * 编译标准存储模型至运行时模型存储
	 * @param iPSModelTranspileContext
	 * @param domain
	 * @param objectNode
	 * @return
	 */
	ObjectNode compile(IPSModelTranspileContext iPSModelTranspileContext, net.ibizsys.psmodel.core.util.IPSModel domain, ObjectNode objectNode);
}
