package net.ibizsys.model.util.merger;

import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * 模型列表合并器对象接口
 * @author lionlau
 *
 */
public interface IPSModelListMerger {

	/**
	 * 合并模型列表集合
	 * @param iPSModelMergeContext
	 * @param objectNode
	 * @param mergeObjectNode
	 * @param strFieldName
	 * @throws Exception
	 */
	void merge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode, String strFieldName)throws Exception;
	
	
	/**
	 * 合并模型（单项）
	 * @param iPSModelMergeContext
	 * @param objectNode
	 * @param mergeObjectNode
	 * @param strFieldName
	 * @throws Exception
	 */
	void mergeSingle(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode, String strFieldName)throws Exception;
	
}
