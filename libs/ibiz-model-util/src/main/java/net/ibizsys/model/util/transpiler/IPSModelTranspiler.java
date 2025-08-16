package net.ibizsys.model.util.transpiler;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;

public interface IPSModelTranspiler{

	/**
	 * 反编译运行时模型至标准存储模型
	 * @param iPSModelTranspileContext
	 * @param iPSModelObject
	 * @param domain
	 * @param bFullMode
	 * @return
	 * @throws Exception
	 */
	net.ibizsys.psmodel.core.util.IPSModel decompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, net.ibizsys.psmodel.core.util.IPSModel domain, boolean bFullMode) throws Exception;
	
	
	/**
	 * 编译标准存储模型至运行时模型存储
	 * @param iPSModelTranspileContext
	 * @param domain
	 * @param objectNode
	 * @return
	 * @throws Exception
	 */
	ObjectNode compile(IPSModelTranspileContext iPSModelTranspileContext, net.ibizsys.psmodel.core.util.IPSModel domain, ObjectNode objectNode) throws Exception;
	
}
