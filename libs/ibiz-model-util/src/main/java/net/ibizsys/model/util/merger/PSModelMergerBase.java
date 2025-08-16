package net.ibizsys.model.util.merger;

import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class PSModelMergerBase implements IPSModelMerger {

	@Override
	public void merge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {
		if(!iPSModelMergeContext.logMerge(objectNode, null)) {
			return ;
		}
		this.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
	
	protected  void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception{
		
	}
	

	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		return true;
	}
	
//	public Class<?> getPSModelType() {
//		return null;
//	}
}
	

