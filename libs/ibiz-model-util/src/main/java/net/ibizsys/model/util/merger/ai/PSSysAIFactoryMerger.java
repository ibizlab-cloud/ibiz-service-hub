package net.ibizsys.model.util.merger.ai;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.ai.PSSysAIFactoryImpl.*;



public class PSSysAIFactoryMerger extends net.ibizsys.model.util.merger.PSModelMergerBase{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.ai.PSSysAIFactoryImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSAICHATAGENTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.ai.IPSSysAIChatAgent.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSAICHATAGENTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSAIPIPELINEAGENTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.ai.IPSSysAIPipelineAgent.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSAIPIPELINEAGENTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSAIWORKERAGENTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.ai.IPSSysAIWorkerAgent.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSAIWORKERAGENTS);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}