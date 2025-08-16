package net.ibizsys.model.util.merger.dataentity.dataflow;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSDEDataFlowNodeListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("nodeType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "DFAGGREGATEPROCESS":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFAggregateProcessNodeImpl.class, false);
			case "DFDEACTIONSINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFDEActionSinkNodeImpl.class, false);
			case "DFDEDATAFLOWSINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFDEDataFlowSinkNodeImpl.class, false);
			case "DFDEDATASETSOURCE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFDEDataSetSourceNodeImpl.class, false);
			case "DFDEDATASYNCSINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFDEDataSyncSinkNodeImpl.class, false);
			case "DFDELOGICSINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFDELogicSinkNodeImpl.class, false);
			case "DFJOINPROCESS":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFJoinProcessNodeImpl.class, false);
			case "DFMERGEPROCESS":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFMergeProcessNodeImpl.class, false);
			case "DFPREDEFINEDSOURCE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFPredefinedSourceNodeImpl.class, false);
			case "DFPREPAREPROCESS":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFPrepareProcessNodeImpl.class, false);
			case "DFSORTROCESS":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSortProcessNodeImpl.class, false);
			case "DFSUBSYSSERVICEAPISINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSubSysServiceAPISinkNodeImpl.class, false);
			case "DFSUBSYSSERVICEAPISOURCE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSubSysServiceAPISourceNodeImpl.class, false);
			case "DFSYSBDSCHEMESINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSinkNodeImpl.class, false);
			case "DFSYSBDSCHEMESOURCE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSourceNodeImpl.class, false);
			case "DFSYSDATASYNCAGENTSINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSinkNodeImpl.class, false);
			case "DFSYSDATASYNCAGENTSOURCE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSourceNodeImpl.class, false);
			case "DFSYSDBSCHEMESINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSinkNodeImpl.class, false);
			case "DFSYSDBSCHEMESOURCE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSourceNodeImpl.class, false);
			case "DFSYSRESOURCESINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSysResourceSinkNodeImpl.class, false);
			case "DFSYSRESOURCESOURCE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDFSysResourceSourceNodeImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.dataflow.PSDEDataFlowNodeImpl.class, false);
		}
	}
}