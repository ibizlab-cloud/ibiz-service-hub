package net.ibizsys.model.util.transpiler;

import java.util.Collection;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.psmodel.core.util.IPSModel;

public interface IPSModelListTranspiler extends IPSModelTranspiler{

	void decompile(IPSModelTranspileContext iPSModelTranspileContext, Collection<? extends IPSModelObject> psModelList, Collection<? extends IPSModel> domainList, boolean fullMode) throws Exception;
	
	
	
	void compile(IPSModelTranspileContext iPSModelTranspileContext, Collection<? extends IPSModel> domainList, ArrayNode arrayNode) throws Exception;
	
	
	
	
	/**
	 * 获取模型引用节点
	 * @param iPSModelTranspileContext
	 * @param fullId
	 * @param childMode
	 * @param objectNode
	 * @return
	 * @throws Exception
	 */
	ObjectNode getModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception;
}
