package net.ibizsys.model.util.merger;

import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * 模型合并器对象接口
 * @author lionlau
 *
 */
public interface IPSModelMerger {

	/**
	 * 合并操作
	 * @param iPSModelMergeContext
	 * @param objectNode
	 * @param mergeObjectNode
	 * @throws Exception
	 */
	void merge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception;
	
	

}
